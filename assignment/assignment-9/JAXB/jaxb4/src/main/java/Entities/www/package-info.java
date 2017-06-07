/**
 * Created by duanzhengmou on 6/6/17.
 */
@XmlSchema(
        namespace = "http://www.nju.edu.cn/schema",
        elementFormDefault = XmlNsForm.QUALIFIED,
        xmlns = {
                @XmlNs(prefix="nju", namespaceURI="http://www.nju.edu.cn/schema")
        })
package Entities.www;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;