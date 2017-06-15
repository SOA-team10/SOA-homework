package ass8;

import helper.IOHelper;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import schema.��֤��Ϣ����;
import schema.��֤�������;

import javax.jws.WebService;

/**
 * Created by ���ī^ on 2017/6/15.
 */
@WebService
public class VerificationImpl implements VerificationInterface{
    @Override
    public ��֤������� verify(��֤��Ϣ���� verityInfo) throws InvalidDataFault {
        Document document = IOHelper.getDocument("src/login.xml");

        ��֤������� result = new ��֤�������();

        NodeList nodeList = document.getElementsByTagName("account");
        boolean isFound = false;
        boolean noPass = false;
        for(int i = 0; i < nodeList.getLength(); i++){
            Node n = nodeList.item(i);

            NodeList child = n.getChildNodes();
            String studentId = "";
            String password = "";
            for(int j = 0; j < child.getLength(); j++){
                Node n1 = child.item(j);

                if(n1.getNodeName().equals("studentId")){
                    studentId = n1.getTextContent();
                }else if(n1.getNodeName().equals("password")){
                    password = n1.getTextContent();
                }

            }
            if(studentId.equals(verityInfo.getStudentId())&&password.equals(verityInfo.getPassword())){
                //�ɹ���½
                isFound = true;
                break;
            }else if(studentId.equals(verityInfo.getStudentId())&&(!password.equals(verityInfo.getPassword()))){
                //��½����һ�£������������
                isFound = true;
                noPass = true;
                break;
            }
        }
        //�ҵ��˽��
        if(isFound){
            if(noPass){
                result.setBadPassword(verityInfo.getPassword());
            }else {
                result.setVeritySuccess("��ӭ��"+verityInfo.getStudentId());
            }
        }else{
            //δ�ҵ����
            result.setStudentNotExist(verityInfo.getStudentId());
        }


        return result;
    }
}
