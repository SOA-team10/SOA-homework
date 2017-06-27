import services.auth.*;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        try {
            MyAuth auth = new AuthControllerServiceLocator().getMyAuthPort();
            �˺���֤���� accountInfo = new �˺���֤����();
            accountInfo.set����("141250019@smail.nju.edu.cn");
            accountInfo.set����("141250019");
            ��֤���� result = auth.verify(accountInfo);
            System.out.println(result.getȨ��().toString());
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (NotFoundType notFoundType) {
            notFoundType.printStackTrace();
        } catch (AuthFaultType authFaultType) {
            authFaultType.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
