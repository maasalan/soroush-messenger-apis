package org.jivesoftware.smackx.iot.control.element;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.IQ.Type;

public class IoTSetRequest extends IQ {
    public static final String ELEMENT = "set";
    public static final String NAMESPACE = "urn:xmpp:iot:control";
    private final Collection<SetData> setData;

    public IoTSetRequest(Collection<? extends SetData> collection) {
        super("set", "urn:xmpp:iot:control");
        setType(Type.set);
        Collection arrayList = new ArrayList(collection.size());
        for (SetData add : collection) {
            arrayList.add(add);
        }
        this.setData = Collections.unmodifiableCollection(arrayList);
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        iQChildElementXmlStringBuilder.append(this.setData);
        return iQChildElementXmlStringBuilder;
    }

    public Collection<SetData> getSetData() {
        return this.setData;
    }
}
