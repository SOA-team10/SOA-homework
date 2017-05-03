package data;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;

/**
 * Created by 张文玘 on 2017/5/3.
 */
public class Score {
    private String scoreType;
    private int scoreValue;

    public Score(String scoreType, int scoreValue){
        this.setScoreType(scoreType);
        this.setScoreValue(scoreValue);
    }

    public void setScoreType(String scoreType) {
        this.scoreType = scoreType;
    }

    public int getScoreValue() {
        return scoreValue;
    }

    public String getScoreType() {
        return scoreType;
    }

    public void setScoreValue(int scoreValue) {
        this.scoreValue = scoreValue;
    }

    public void addToSoap(SOAPElement soapElement){

        try {
            QName scoreQName = soapElement.createQName("score","tns");
            SOAPElement scoreElement = soapElement.addChildElement(scoreQName);

            QName typeQName = soapElement.createQName("scoreType","tns");
            SOAPElement typeElement = scoreElement.addChildElement(typeQName);
            typeElement.setTextContent(scoreType);

            QName valueQName = soapElement.createQName("scoreValue", "tns");
            SOAPElement valueElement = scoreElement.addChildElement(valueQName);
            valueElement.setTextContent(scoreValue+"");
        } catch (SOAPException e) {
            e.printStackTrace();
        }


    }
}
