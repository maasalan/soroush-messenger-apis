package org.jivesoftware.smack.packet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import org.jivesoftware.smack.util.PacketUtil;
import org.jivesoftware.smack.util.XmlStringBuilder;

public class AbstractError {
    protected final Map<String, String> descriptiveTexts;
    protected final List<ExtensionElement> extensions;
    protected final String textNamespace;

    public static abstract class Builder<B extends Builder<B>> {
        protected Map<String, String> descriptiveTexts;
        protected List<ExtensionElement> extensions;
        protected String textNamespace;

        public B addExtension(ExtensionElement extensionElement) {
            if (this.extensions == null) {
                this.extensions = new ArrayList();
            }
            this.extensions.add(extensionElement);
            return getThis();
        }

        protected abstract B getThis();

        public B setDescriptiveEnText(String str) {
            if (this.descriptiveTexts == null) {
                this.descriptiveTexts = new HashMap();
            }
            this.descriptiveTexts.put("en", str);
            return getThis();
        }

        public B setDescriptiveTexts(Map<String, String> map) {
            if (this.descriptiveTexts == null) {
                this.descriptiveTexts = map;
            } else {
                this.descriptiveTexts.putAll(map);
            }
            return getThis();
        }

        public B setExtensions(List<ExtensionElement> list) {
            if (this.extensions == null) {
                this.extensions = list;
            } else {
                this.extensions.addAll(list);
            }
            return getThis();
        }

        public B setTextNamespace(String str) {
            this.textNamespace = str;
            return getThis();
        }
    }

    protected AbstractError(Map<String, String> map) {
        this(map, null);
    }

    protected AbstractError(Map<String, String> map, String str, List<ExtensionElement> list) {
        Map emptyMap;
        if (map == null) {
            emptyMap = Collections.emptyMap();
        }
        this.descriptiveTexts = emptyMap;
        this.textNamespace = str;
        if (list != null) {
            this.extensions = list;
        } else {
            this.extensions = Collections.emptyList();
        }
    }

    protected AbstractError(Map<String, String> map, List<ExtensionElement> list) {
        this(map, null, list);
    }

    protected void addDescriptiveTextsAndExtensions(XmlStringBuilder xmlStringBuilder) {
        for (Entry entry : this.descriptiveTexts.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            xmlStringBuilder.halfOpenElement("text").xmlnsAttribute(this.textNamespace).xmllangAttribute(str).rightAngleBracket();
            xmlStringBuilder.escape(str2);
            xmlStringBuilder.closeElement("text");
        }
        for (ExtensionElement toXML : this.extensions) {
            xmlStringBuilder.append(toXML.toXML());
        }
    }

    public String getDescriptiveText() {
        String descriptiveText = getDescriptiveText(Locale.getDefault().getLanguage());
        return descriptiveText == null ? getDescriptiveText("") : descriptiveText;
    }

    public String getDescriptiveText(String str) {
        return (String) this.descriptiveTexts.get(str);
    }

    public <PE extends ExtensionElement> PE getExtension(String str, String str2) {
        return PacketUtil.extensionElementFrom(this.extensions, str, str2);
    }
}
