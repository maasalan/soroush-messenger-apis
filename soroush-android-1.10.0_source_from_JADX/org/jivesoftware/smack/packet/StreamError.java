package org.jivesoftware.smack.packet;

import java.util.List;
import java.util.Map;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;

public class StreamError extends AbstractError implements Nonza {
    public static final String ELEMENT = "stream:error";
    public static final String NAMESPACE = "urn:ietf:params:xml:ns:xmpp-streams";
    private final Condition condition;
    private final String conditionText;

    static /* synthetic */ class C77471 {
        static final /* synthetic */ int[] $SwitchMap$org$jivesoftware$smack$packet$StreamError$Condition = new int[Condition.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = org.jivesoftware.smack.packet.StreamError.Condition.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$org$jivesoftware$smack$packet$StreamError$Condition = r0;
            r0 = $SwitchMap$org$jivesoftware$smack$packet$StreamError$Condition;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = org.jivesoftware.smack.packet.StreamError.Condition.see_other_host;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.packet.StreamError.1.<clinit>():void");
        }
    }

    public enum Condition {
        bad_format,
        bad_namespace_prefix,
        conflict,
        connection_timeout,
        host_gone,
        host_unknown,
        improper_addressing,
        internal_server_error,
        invalid_from,
        invalid_namespace,
        invalid_xml,
        not_authorized,
        not_well_formed,
        policy_violation,
        remote_connection_failed,
        reset,
        resource_constraint,
        restricted_xml,
        see_other_host,
        system_shutdown,
        undeficed_condition,
        unsupported_encoding,
        unsupported_feature,
        unsupported_stanza_type,
        unsupported_version;

        public static Condition fromString(String str) {
            str = str.replace('-', '_');
            try {
                return valueOf(str);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder("Could not transform string '");
                stringBuilder.append(str);
                stringBuilder.append("' to XMPPErrorCondition");
                throw new IllegalStateException(stringBuilder.toString(), e);
            }
        }

        public final String toString() {
            return name().replace('_', '-');
        }
    }

    public StreamError(Condition condition, String str, Map<String, String> map, List<ExtensionElement> list) {
        super(map, list);
        if (StringUtils.isNullOrEmpty((CharSequence) str)) {
            str = null;
        }
        if (str == null || C77471.$SwitchMap$org$jivesoftware$smack$packet$StreamError$Condition[condition.ordinal()] == 1) {
            this.condition = condition;
            this.conditionText = str;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("The given condition '");
        stringBuilder.append(condition);
        stringBuilder.append("' can not contain a conditionText");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public Condition getCondition() {
        return this.condition;
    }

    public String getConditionText() {
        return this.conditionText;
    }

    public String getElementName() {
        return ELEMENT;
    }

    public String getNamespace() {
        return NAMESPACE;
    }

    public String toString() {
        return toXML().toString();
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
        xmlStringBuilder.openElement(ELEMENT);
        xmlStringBuilder.halfOpenElement(this.condition.toString()).xmlnsAttribute(NAMESPACE).closeEmptyElement();
        addDescriptiveTextsAndExtensions(xmlStringBuilder);
        xmlStringBuilder.closeElement(ELEMENT);
        return xmlStringBuilder;
    }
}
