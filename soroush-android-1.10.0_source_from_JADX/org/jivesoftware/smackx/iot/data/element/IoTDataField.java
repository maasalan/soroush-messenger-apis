package org.jivesoftware.smackx.iot.data.element;

import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.util.XmlStringBuilder;

public abstract class IoTDataField implements NamedElement {
    private final String name;
    private final Type type;
    private String valueString;

    enum Type {
        integer("int"),
        bool("boolean");
        
        private final String stringRepresentation;

        private Type(String str) {
            this.stringRepresentation = str;
        }
    }

    public static class BooleanField extends IoTDataField {
        private final boolean value;

        public BooleanField(String str, boolean z) {
            super(Type.bool, str);
            this.value = z;
        }

        public boolean getValue() {
            return this.value;
        }

        protected String getValueInternal() {
            return Boolean.toString(this.value);
        }

        public /* bridge */ /* synthetic */ CharSequence toXML() {
            return super.toXML();
        }
    }

    public static class IntField extends IoTDataField {
        private final int value;

        public IntField(String str, int i) {
            super(Type.integer, str);
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }

        protected String getValueInternal() {
            return Integer.toString(this.value);
        }

        public /* bridge */ /* synthetic */ CharSequence toXML() {
            return super.toXML();
        }
    }

    protected IoTDataField(Type type, String str) {
        this.type = type;
        this.name = str;
    }

    public final String getElementName() {
        return this.type.stringRepresentation;
    }

    public final String getName() {
        return this.name;
    }

    protected abstract String getValueInternal();

    public final String getValueString() {
        if (this.valueString == null) {
            this.valueString = getValueInternal();
        }
        return this.valueString;
    }

    public final XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
        xmlStringBuilder.attribute("name", this.name).attribute("value", getValueString());
        xmlStringBuilder.closeEmptyElement();
        return xmlStringBuilder;
    }
}
