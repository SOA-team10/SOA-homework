package ass8;

import helper.IOHelper;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import schema.验证信息类型;
import schema.验证结果类型;

import javax.jws.WebService;

/**
 * Created by 张文玘 on 2017/6/15.
 */
@WebService
public class VerificationImpl implements VerificationInterface{
    @Override
    public 验证结果类型 verify(验证信息类型 verityInfo) throws InvalidDataFault {
        Document document = IOHelper.getDocument("src/login.xml");

        验证结果类型 result = new 验证结果类型();

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
                //成功登陆
                isFound = true;
                break;
            }else if(studentId.equals(verityInfo.getStudentId())&&(!password.equals(verityInfo.getPassword()))){
                //登陆号码一致，但是密码错误
                isFound = true;
                noPass = true;
                break;
            }
        }
        //找到了结果
        if(isFound){
            if(noPass){
                result.setBadPassword(verityInfo.getPassword());
            }else {
                result.setVeritySuccess("欢迎，"+verityInfo.getStudentId());
            }
        }else{
            //未找到结果
            result.setStudentNotExist(verityInfo.getStudentId());
        }


        return result;
    }
}
