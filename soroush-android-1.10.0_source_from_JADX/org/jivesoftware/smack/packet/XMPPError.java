package org.jivesoftware.smack.packet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;
import org.jivesoftware.smack.util.Objects;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class XMPPError extends AbstractError {
    private static final Map<Condition, Type> CONDITION_TO_TYPE;
    public static final String ERROR = "error";
    private static final Logger LOGGER = Logger.getLogger(XMPPError.class.getName());
    public static final String NAMESPACE = "urn:ietf:params:xml:ns:xmpp-stanzas";
    private final Condition condition;
    private final String conditionText;
    private final String errorGenerator;
    private final Stanza stanza;
    private final Type type;

    public enum Condition {
        bad_request,
        conflict,
        feature_not_implemented,
        forbidden,
        gone,
        internal_server_error,
        item_not_found,
        jid_malformed,
        not_acceptable,
        not_allowed,
        not_authorized,
        policy_violation,
        recipient_unavailable,
        redirect,
        registration_required,
        remote_server_not_found,
        remote_server_timeout,
        resource_constraint,
        service_unavailable,
        subscription_required,
        undefined_condition,
        unexpected_request;

        public static Condition fromString(String str) {
            if ("xml-not-well-formed".equals(str)) {
                str = "not-well-formed";
            }
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

    public enum Type {
        WAIT,
        CANCEL,
        MODIFY,
        AUTH,
        CONTINUE;

        public static Type fromString(String str) {
            return valueOf(str.toUpperCase(Locale.US));
        }

        public final String toString() {
            return name().toLowerCase(Locale.US);
        }
    }

    public static final class Builder extends org.jivesoftware.smack.packet.AbstractError.Builder<Builder> {
        private Condition condition;
        private String conditionText;
        private String errorGenerator;
        private Stanza stanza;
        private Type type;

        private Builder() {
        }

        public final XMPPError build() {
            return new XMPPError(this.condition, this.conditionText, this.errorGenerator, this.type, this.descriptiveTexts, this.extensions, this.stanza);
        }

        public final Builder copyFrom(XMPPError xMPPError) {
            setCondition(xMPPError.getCondition());
            setType(xMPPError.getType());
            setConditionText(xMPPError.getConditionText());
            setErrorGenerator(xMPPError.getErrorGenerator());
            setStanza(xMPPError.getStanza());
            setDescriptiveTexts(xMPPError.descriptiveTexts);
            setTextNamespace(xMPPError.textNamespace);
            setExtensions(xMPPError.extensions);
            return this;
        }

        protected final Builder getThis() {
            return this;
        }

        public final Builder setCondition(Condition condition) {
            this.condition = condition;
            return this;
        }

        public final Builder setConditionText(String str) {
            this.conditionText = str;
            return this;
        }

        public final Builder setErrorGenerator(String str) {
            this.errorGenerator = str;
            return this;
        }

        public final Builder setStanza(Stanza stanza) {
            this.stanza = stanza;
            return this;
        }

        public final Builder setType(Type type) {
            this.type = type;
            return this;
        }
    }

    static {
        Map hashMap = new HashMap();
        CONDITION_TO_TYPE = hashMap;
        hashMap.put(Condition.bad_request, Type.MODIFY);
        CONDITION_TO_TYPE.put(Condition.conflict, Type.CANCEL);
        CONDITION_TO_TYPE.put(Condition.feature_not_implemented, Type.CANCEL);
        CONDITION_TO_TYPE.put(Condition.forbidden, Type.AUTH);
        CONDITION_TO_TYPE.put(Condition.gone, Type.CANCEL);
        CONDITION_TO_TYPE.put(Condition.internal_server_error, Type.CANCEL);
        CONDITION_TO_TYPE.put(Condition.item_not_found, Type.CANCEL);
        CONDITION_TO_TYPE.put(Condition.jid_malformed, Type.MODIFY);
        CONDITION_TO_TYPE.put(Condition.not_acceptable, Type.MODIFY);
        CONDITION_TO_TYPE.put(Condition.not_allowed, Type.CANCEL);
        CONDITION_TO_TYPE.put(Condition.not_authorized, Type.AUTH);
        CONDITION_TO_TYPE.put(Condition.policy_violation, Type.MODIFY);
        CONDITION_TO_TYPE.put(Condition.recipient_unavailable, Type.WAIT);
        CONDITION_TO_TYPE.put(Condition.redirect, Type.MODIFY);
        CONDITION_TO_TYPE.put(Condition.registration_required, Type.AUTH);
        CONDITION_TO_TYPE.put(Condition.remote_server_not_found, Type.CANCEL);
        CONDITION_TO_TYPE.put(Condition.remote_server_timeout, Type.WAIT);
        CONDITION_TO_TYPE.put(Condition.resource_constraint, Type.WAIT);
        CONDITION_TO_TYPE.put(Condition.service_unavailable, Type.WAIT);
        CONDITION_TO_TYPE.put(Condition.subscription_required, Type.WAIT);
        CONDITION_TO_TYPE.put(Condition.unexpected_request, Type.MODIFY);
    }

    @Deprecated
    public XMPPError(Condition condition) {
        this(condition, null, null, null, null, null, null);
    }

    @Deprecated
    public XMPPError(Condition condition, String str, String str2, Type type, Map<String, String> map, List<ExtensionElement> list) {
        this(condition, str, str2, type, map, list, null);
    }

    public XMPPError(Condition condition, String str, String str2, Type type, Map<String, String> map, List<ExtensionElement> list, Stanza stanza) {
        super(map, NAMESPACE, list);
        this.condition = (Condition) Objects.requireNonNull(condition, "condition must not be null");
        this.stanza = stanza;
        if (StringUtils.isNullOrEmpty((CharSequence) str)) {
            str = null;
        }
        if (str != null) {
            switch (condition) {
                case gone:
                case redirect:
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder("Condition text can only be set with condtion types 'gone' and 'redirect', not ");
                    stringBuilder.append(condition);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        this.conditionText = str;
        this.errorGenerator = str2;
        if (type == null) {
            Type type2 = (Type) CONDITION_TO_TYPE.get(condition);
            if (type2 == null) {
                Logger logger = LOGGER;
                stringBuilder = new StringBuilder("Could not determine type for condition: ");
                stringBuilder.append(condition);
                logger.warning(stringBuilder.toString());
                type2 = Type.CANCEL;
            }
            this.type = type2;
            return;
        }
        this.type = type;
    }

    @Deprecated
    public XMPPError(Condition condition, ExtensionElement extensionElement) {
        Condition condition2 = condition;
        this(condition2, null, null, null, null, Arrays.asList(new ExtensionElement[]{extensionElement}), null);
    }

    public static Builder from(Condition condition, String str) {
        Map hashMap = new HashMap();
        hashMap.put("en", str);
        return (Builder) getBuilder().setCondition(condition).setDescriptiveTexts(hashMap);
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static Builder getBuilder(Condition condition) {
        return getBuilder().setCondition(condition);
    }

    public static Builder getBuilder(XMPPError xMPPError) {
        return getBuilder().copyFrom(xMPPError);
    }

    public Condition getCondition() {
        return this.condition;
    }

    public String getConditionText() {
        return this.conditionText;
    }

    public String getErrorGenerator() {
        return this.errorGenerator;
    }

    public Stanza getStanza() {
        return this.stanza;
    }

    public Type getType() {
        return this.type;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("XMPPError: ");
        stringBuilder.append(this.condition.toString());
        stringBuilder.append(" - ");
        stringBuilder.append(this.type.toString());
        if (this.errorGenerator != null) {
            stringBuilder.append(". Generated by ");
            stringBuilder.append(this.errorGenerator);
        }
        return stringBuilder.toString();
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
        xmlStringBuilder.halfOpenElement("error");
        xmlStringBuilder.attribute(IjkMediaMeta.IJKM_KEY_TYPE, this.type.toString());
        xmlStringBuilder.optAttribute("by", this.errorGenerator);
        xmlStringBuilder.rightAngleBracket();
        xmlStringBuilder.halfOpenElement(this.condition.toString());
        xmlStringBuilder.xmlnsAttribute(NAMESPACE);
        if (this.conditionText != null) {
            xmlStringBuilder.rightAngleBracket();
            xmlStringBuilder.escape(this.conditionText);
            xmlStringBuilder.closeElement(this.condition.toString());
        } else {
            xmlStringBuilder.closeEmptyElement();
        }
        addDescriptiveTextsAndExtensions(xmlStringBuilder);
        xmlStringBuilder.closeElement("error");
        return xmlStringBuilder;
    }
}
