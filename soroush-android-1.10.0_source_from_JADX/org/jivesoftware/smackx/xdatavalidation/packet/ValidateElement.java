package org.jivesoftware.smackx.xdatavalidation.packet;

import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.util.NumberUtil;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.xdata.FormField;
import org.jivesoftware.smackx.xdata.FormField.Type;
import org.jivesoftware.smackx.xdatavalidation.ValidationConsistencyException;

public abstract class ValidateElement implements ExtensionElement {
    public static final String DATATYPE_XS_STRING = "xs:string";
    public static final String ELEMENT = "validate";
    public static final String NAMESPACE = "http://jabber.org/protocol/xdata-validate";
    private final String datatype;
    private ListRange listRange;

    public static class ListRange implements NamedElement {
        public static final String ELEMENT = "list-range";
        private final Long max;
        private final Long min;

        public ListRange(Long l, Long l2) {
            if (l != null) {
                NumberUtil.checkIfInUInt32Range(l.longValue());
            }
            if (l2 != null) {
                NumberUtil.checkIfInUInt32Range(l2.longValue());
            }
            if (l2 == null && l == null) {
                throw new IllegalArgumentException("Either min or max must be given");
            }
            this.min = l;
            this.max = l2;
        }

        public String getElementName() {
            return ELEMENT;
        }

        public Long getMax() {
            return this.max;
        }

        public Long getMin() {
            return this.min;
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
            xmlStringBuilder.optLongAttribute("min", getMin());
            xmlStringBuilder.optLongAttribute("max", getMax());
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }
    }

    public static class BasicValidateElement extends ValidateElement {
        public static final String METHOD = "basic";

        public BasicValidateElement(String str) {
            super(str);
        }

        protected void appendXML(XmlStringBuilder xmlStringBuilder) {
            xmlStringBuilder.emptyElement(METHOD);
        }

        public void checkConsistency(FormField formField) {
            checkListRangeConsistency(formField);
            if (formField.getType() != null) {
                switch (formField.getType()) {
                    case hidden:
                    case jid_multi:
                    case jid_single:
                        throw new ValidationConsistencyException(String.format("Field type '%1$s' is not consistent with validation method '%2$s'.", new Object[]{formField.getType(), METHOD}));
                    default:
                        return;
                }
            }
        }

        public /* bridge */ /* synthetic */ CharSequence toXML() {
            return super.toXML();
        }
    }

    public static class OpenValidateElement extends ValidateElement {
        public static final String METHOD = "open";

        public OpenValidateElement(String str) {
            super(str);
        }

        protected void appendXML(XmlStringBuilder xmlStringBuilder) {
            xmlStringBuilder.emptyElement("open");
        }

        public void checkConsistency(FormField formField) {
            checkListRangeConsistency(formField);
            if (formField.getType() != null && C78081.$SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type[formField.getType().ordinal()] == 1) {
                throw new ValidationConsistencyException(String.format("Field type '%1$s' is not consistent with validation method '%2$s'.", new Object[]{formField.getType(), "open"}));
            }
        }

        public /* bridge */ /* synthetic */ CharSequence toXML() {
            return super.toXML();
        }
    }

    public static class RangeValidateElement extends ValidateElement {
        public static final String METHOD = "range";
        private final String max;
        private final String min;

        public RangeValidateElement(String str, String str2, String str3) {
            super(str);
            this.min = str2;
            this.max = str3;
        }

        protected void appendXML(XmlStringBuilder xmlStringBuilder) {
            xmlStringBuilder.halfOpenElement(METHOD);
            xmlStringBuilder.optAttribute("min", getMin());
            xmlStringBuilder.optAttribute("max", getMax());
            xmlStringBuilder.closeEmptyElement();
        }

        public void checkConsistency(FormField formField) {
            checkNonMultiConsistency(formField, METHOD);
            if (getDatatype().equals(ValidateElement.DATATYPE_XS_STRING)) {
                throw new ValidationConsistencyException(String.format("Field data type '%1$s' is not consistent with validation method '%2$s'.", new Object[]{getDatatype(), METHOD}));
            }
        }

        public String getMax() {
            return this.max;
        }

        public String getMin() {
            return this.min;
        }

        public /* bridge */ /* synthetic */ CharSequence toXML() {
            return super.toXML();
        }
    }

    public static class RegexValidateElement extends ValidateElement {
        public static final String METHOD = "regex";
        private final String regex;

        public RegexValidateElement(String str, String str2) {
            super(str);
            this.regex = str2;
        }

        protected void appendXML(XmlStringBuilder xmlStringBuilder) {
            xmlStringBuilder.element(METHOD, getRegex());
        }

        public void checkConsistency(FormField formField) {
            checkNonMultiConsistency(formField, METHOD);
        }

        public String getRegex() {
            return this.regex;
        }

        public /* bridge */ /* synthetic */ CharSequence toXML() {
            return super.toXML();
        }
    }

    private ValidateElement(String str) {
        if (!StringUtils.isNotEmpty((CharSequence) str)) {
            str = null;
        }
        this.datatype = str;
    }

    protected abstract void appendXML(XmlStringBuilder xmlStringBuilder);

    public abstract void checkConsistency(FormField formField);

    protected void checkListRangeConsistency(FormField formField) {
        ListRange listRange = getListRange();
        if (listRange != null) {
            Long max = listRange.getMax();
            Long min = listRange.getMin();
            if ((max != null || min != null) && formField.getType() != Type.list_multi) {
                throw new ValidationConsistencyException("Field type is not of type 'list-multi' while a 'list-range' is defined.");
            }
        }
    }

    protected void checkNonMultiConsistency(FormField formField, String str) {
        checkListRangeConsistency(formField);
        if (formField.getType() != null) {
            switch (formField.getType()) {
                case hidden:
                case jid_multi:
                case list_multi:
                case text_multi:
                    throw new ValidationConsistencyException(String.format("Field type '%1$s' is not consistent with validation method '%2$s'.", new Object[]{formField.getType(), str}));
                default:
                    return;
            }
        }
    }

    public String getDatatype() {
        return this.datatype != null ? this.datatype : DATATYPE_XS_STRING;
    }

    public String getElementName() {
        return ELEMENT;
    }

    public ListRange getListRange() {
        return this.listRange;
    }

    public String getNamespace() {
        return NAMESPACE;
    }

    public void setListRange(ListRange listRange) {
        this.listRange = listRange;
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
        xmlStringBuilder.optAttribute("datatype", this.datatype);
        xmlStringBuilder.rightAngleBracket();
        appendXML(xmlStringBuilder);
        xmlStringBuilder.optAppend(getListRange());
        xmlStringBuilder.closeElement((NamedElement) this);
        return xmlStringBuilder;
    }
}
