/**
 * Created by duanzhengmou on 6/6/17.
 */
@XmlSchema(
        namespace = "http://jw.nju.edu.cn/schema",
        elementFormDefault = XmlNsForm.QUALIFIED,
        xmlns = {
                @XmlNs(prefix="tns", namespaceURI="http://jw.nju.edu.cn/schema")
        })
package Entities.jw;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;