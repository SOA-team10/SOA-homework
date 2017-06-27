import services.auth.*;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        try {
            MyAuth auth = new AuthControllerServiceLocator().getMyAuthPort();
            账号认证类型 accountInfo = new 账号认证类型();
            accountInfo.set邮箱("141250019@smail.nju.edu.cn");
            accountInfo.set密码("141250019");
            验证类型 result = auth.verify(accountInfo);
            System.out.println(result.get权限().toString());
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
