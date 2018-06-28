package org.jivesoftware.smackx.xdata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class FormField implements NamedElement {
    public static final String ELEMENT = "field";
    public static final String FORM_TYPE = "FORM_TYPE";
    private String description;
    private String label;
    private final List<Option> options;
    private boolean required;
    private Type type;
    private ValidateElement validateElement;
    private final List<String> values;
    private final String variable;

    static /* synthetic */ class C78071 {
        static final /* synthetic */ int[] $SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type = new int[Type.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = org.jivesoftware.smackx.xdata.FormField.Type.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type = r0;
            r0 = $SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = org.jivesoftware.smackx.xdata.FormField.Type.bool;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.xdata.FormField.1.<clinit>():void");
        }
    }

    public enum Type {
        bool,
        fixed,
        hidden,
        jid_multi,
        jid_single,
        list_multi,
        list_single,
        text_multi,
        text_private,
        text_single;

        public static Type fromString(String str) {
            if (str == null) {
                return null;
            }
            Object obj = -1;
            if (str.hashCode() == 64711720) {
                if (str.equals("boolean")) {
                    obj = null;
                }
            }
            return obj != null ? valueOf(str.replace('-', '_')) : bool;
        }

        public final String toString() {
            return C78071.$SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type[ordinal()] != 1 ? name().replace('_', '-') : "boolean";
        }
    }

    public static class Option implements NamedElement {
        public static final String ELEMENT = "option";
        private String label;
        private final String value;

        public Option(String str) {
            this.value = str;
        }

        public Option(String str, String str2) {
            this.label = str;
            this.value = str2;
        }

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            if (obj.getClass() != getClass()) {
                return false;
            }
            Option option = (Option) obj;
            if (!this.value.equals(option.value)) {
                return false;
            }
            return (this.label == null ? "" : this.label).equals(option.label == null ? "" : option.label);
        }

        public String getElementName() {
            return ELEMENT;
        }

        public String getLabel() {
            return this.label;
        }

        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return (37 * (this.value.hashCode() + 37)) + (this.label == null ? 0 : this.label.hashCode());
        }

        public String toString() {
            return getLabel();
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
            xmlStringBuilder.optAttribute("label", getLabel());
            xmlStringBuilder.rightAngleBracket();
            xmlStringBuilder.element("value", getValue());
            xmlStringBuilder.closeElement((NamedElement) this);
            return xmlStringBuilder;
        }
    }

    public FormField() {
        this.required = false;
        this.options = new ArrayList();
        this.values = new ArrayList();
        this.variable = null;
        this.type = Type.fixed;
    }

    public FormField(String str) {
        this.required = false;
        this.options = new ArrayList();
        this.values = new ArrayList();
        this.variable = (String) StringUtils.requireNotNullOrEmpty(str, "Variable must not be null or empty");
    }

    public void addOption(Option option) {
        synchronized (this.options) {
            this.options.add(option);
        }
    }

    public void addValue(String str) {
        synchronized (this.values) {
            this.values.add(str);
        }
    }

    public void addValues(List<String> list) {
        synchronized (this.values) {
            this.values.addAll(list);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FormField)) {
            return false;
        }
        return toXML().equals(((FormField) obj).toXML());
    }

    public String getDescription() {
        return this.description;
    }

    public String getElementName() {
        return ELEMENT;
    }

    public String getLabel() {
        return this.label;
    }

    public List<Option> getOptions() {
        List<Option> unmodifiableList;
        synchronized (this.options) {
            unmodifiableList = Collections.unmodifiableList(new ArrayList(this.options));
        }
        return unmodifiableList;
    }

    public Type getType() {
        return this.type;
    }

    public ValidateElement getValidateElement() {
        return this.validateElement;
    }

    public List<String> getValues() {
        List<String> unmodifiableList;
        synchronized (this.values) {
            unmodifiableList = Collections.unmodifiableList(new ArrayList(this.values));
        }
        return unmodifiableList;
    }

    public String getVariable() {
        return this.variable;
    }

    public int hashCode() {
        return toXML().hashCode();
    }

    public boolean isRequired() {
        return this.required;
    }

    protected void resetValues() {
        synchronized (this.values) {
            this.values.removeAll(new ArrayList(this.values));
        }
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setRequired(boolean z) {
        this.required = z;
    }

    public void setType(Type type) {
        if (type == Type.fixed) {
            throw new IllegalArgumentException("Can not set type to fixed, use FormField constructor without arguments instead.");
        }
        this.type = type;
    }

    public void setValidateElement(ValidateElement validateElement) {
        validateElement.checkConsistency(this);
        this.validateElement = validateElement;
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
        xmlStringBuilder.optAttribute("label", getLabel());
        xmlStringBuilder.optAttribute("var", getVariable());
        xmlStringBuilder.optAttribute(IjkMediaMeta.IJKM_KEY_TYPE, getType());
        xmlStringBuilder.rightAngleBracket();
        xmlStringBuilder.optElement("desc", getDescription());
        xmlStringBuilder.condEmptyElement(isRequired(), "required");
        for (String element : getValues()) {
            xmlStringBuilder.element("value", element);
        }
        for (Option toXML : getOptions()) {
            xmlStringBuilder.append(toXML.toXML());
        }
        xmlStringBuilder.optElement(this.validateElement);
        xmlStringBuilder.closeElement((NamedElement) this);
        return xmlStringBuilder;
    }
}
