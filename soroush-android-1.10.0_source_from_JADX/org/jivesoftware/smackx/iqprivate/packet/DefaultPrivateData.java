package org.jivesoftware.smackx.iqprivate.packet;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DefaultPrivateData implements PrivateData {
    private String elementName;
    private Map<String, String> map;
    private String namespace;

    public DefaultPrivateData(String str, String str2) {
        this.elementName = str;
        this.namespace = str2;
    }

    public String getElementName() {
        return this.elementName;
    }

    public synchronized Set<String> getNames() {
        if (this.map == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(this.map.keySet());
    }

    public String getNamespace() {
        return this.namespace;
    }

    public synchronized String getValue(String str) {
        if (this.map == null) {
            return null;
        }
        return (String) this.map.get(str);
    }

    public synchronized void setValue(String str, String str2) {
        if (this.map == null) {
            this.map = new HashMap();
        }
        this.map.put(str, str2);
    }

    public String toXML() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('<');
        stringBuilder.append(this.elementName);
        stringBuilder.append(" xmlns=\"");
        stringBuilder.append(this.namespace);
        stringBuilder.append("\">");
        for (String str : getNames()) {
            String value = getValue(str);
            stringBuilder.append('<');
            stringBuilder.append(str);
            stringBuilder.append('>');
            stringBuilder.append(value);
            stringBuilder.append("</");
            stringBuilder.append(str);
            stringBuilder.append('>');
        }
        stringBuilder.append("</");
        stringBuilder.append(this.elementName);
        stringBuilder.append('>');
        return stringBuilder.toString();
    }
}
