package org.jivesoftware.smackx.iot.data.element;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.util.XmlStringBuilder;

public class TimestampElement implements NamedElement {
    public static final String ELEMENT = "timestamp";
    private final Date date;
    private final List<? extends IoTDataField> fields;

    public TimestampElement(Date date, List<? extends IoTDataField> list) {
        this.date = date;
        this.fields = Collections.unmodifiableList(list);
    }

    public List<? extends IoTDataField> getDataFields() {
        return this.fields;
    }

    public String getElementName() {
        return ELEMENT;
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
        xmlStringBuilder.attribute("value", this.date);
        xmlStringBuilder.rightAngleBracket();
        xmlStringBuilder.append(this.fields);
        xmlStringBuilder.closeElement((NamedElement) this);
        return xmlStringBuilder;
    }
}
