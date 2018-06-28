package org.jivesoftware.smackx.xdata.packet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.jivesoftware.smack.packet.Element;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.xdata.FormField;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class DataForm implements ExtensionElement {
    public static final String ELEMENT = "x";
    public static final String NAMESPACE = "jabber:x:data";
    private final List<Element> extensionElements = new ArrayList();
    private final Map<String, FormField> fields = new LinkedHashMap();
    private final List<String> instructions = new ArrayList();
    private final List<Item> items = new ArrayList();
    private ReportedData reportedData;
    private String title;
    private Type type;

    public static class Item {
        public static final String ELEMENT = "item";
        private List<FormField> fields = new ArrayList();

        public Item(List<FormField> list) {
            this.fields = list;
        }

        public List<FormField> getFields() {
            return Collections.unmodifiableList(new ArrayList(this.fields));
        }

        public CharSequence toXML() {
            CharSequence xmlStringBuilder = new XmlStringBuilder();
            xmlStringBuilder.openElement("item");
            for (FormField toXML : getFields()) {
                xmlStringBuilder.append(toXML.toXML());
            }
            xmlStringBuilder.closeElement("item");
            return xmlStringBuilder;
        }
    }

    public static class ReportedData {
        public static final String ELEMENT = "reported";
        private List<FormField> fields = new ArrayList();

        public ReportedData(List<FormField> list) {
            this.fields = list;
        }

        public List<FormField> getFields() {
            return Collections.unmodifiableList(new ArrayList(this.fields));
        }

        public CharSequence toXML() {
            CharSequence xmlStringBuilder = new XmlStringBuilder();
            xmlStringBuilder.openElement(ELEMENT);
            for (FormField toXML : getFields()) {
                xmlStringBuilder.append(toXML.toXML());
            }
            xmlStringBuilder.closeElement(ELEMENT);
            return xmlStringBuilder;
        }
    }

    public enum Type {
        form,
        submit,
        cancel,
        result;

        public static Type fromString(String str) {
            return valueOf(str.toLowerCase(Locale.US));
        }
    }

    public DataForm(Type type) {
        this.type = type;
    }

    public static DataForm from(Stanza stanza) {
        return (DataForm) stanza.getExtension("x", "jabber:x:data");
    }

    public void addExtensionElement(Element element) {
        this.extensionElements.add(element);
    }

    public void addField(FormField formField) {
        String variable = formField.getVariable();
        if (variable == null || !hasField(variable)) {
            synchronized (this.fields) {
                this.fields.put(variable, formField);
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("This data form already contains a form field with the variable name '");
        stringBuilder.append(variable);
        stringBuilder.append("'");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void addInstruction(String str) {
        synchronized (this.instructions) {
            this.instructions.add(str);
        }
    }

    public void addItem(Item item) {
        synchronized (this.items) {
            this.items.add(item);
        }
    }

    public String getElementName() {
        return "x";
    }

    public List<Element> getExtensionElements() {
        return Collections.unmodifiableList(this.extensionElements);
    }

    public FormField getField(String str) {
        FormField formField;
        synchronized (this.fields) {
            formField = (FormField) this.fields.get(str);
        }
        return formField;
    }

    public List<FormField> getFields() {
        List arrayList;
        synchronized (this.fields) {
            arrayList = new ArrayList(this.fields.values());
        }
        return arrayList;
    }

    public FormField getHiddenFormTypeField() {
        FormField field = getField(FormField.FORM_TYPE);
        return (field == null || field.getType() != org.jivesoftware.smackx.xdata.FormField.Type.hidden) ? null : field;
    }

    public List<String> getInstructions() {
        List<String> unmodifiableList;
        synchronized (this.instructions) {
            unmodifiableList = Collections.unmodifiableList(new ArrayList(this.instructions));
        }
        return unmodifiableList;
    }

    public List<Item> getItems() {
        List<Item> unmodifiableList;
        synchronized (this.items) {
            unmodifiableList = Collections.unmodifiableList(new ArrayList(this.items));
        }
        return unmodifiableList;
    }

    public String getNamespace() {
        return "jabber:x:data";
    }

    public ReportedData getReportedData() {
        return this.reportedData;
    }

    public String getTitle() {
        return this.title;
    }

    public Type getType() {
        return this.type;
    }

    public boolean hasField(String str) {
        boolean containsKey;
        synchronized (this.fields) {
            containsKey = this.fields.containsKey(str);
        }
        return containsKey;
    }

    public boolean hasHiddenFormTypeField() {
        return getHiddenFormTypeField() != null;
    }

    public void setInstructions(List<String> list) {
        synchronized (this.instructions) {
            this.instructions.clear();
            this.instructions.addAll(list);
        }
    }

    public void setReportedData(ReportedData reportedData) {
        this.reportedData = reportedData;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
        xmlStringBuilder.attribute(IjkMediaMeta.IJKM_KEY_TYPE, getType());
        xmlStringBuilder.rightAngleBracket();
        xmlStringBuilder.optElement("title", getTitle());
        for (String element : getInstructions()) {
            xmlStringBuilder.element("instructions", element);
        }
        if (getReportedData() != null) {
            xmlStringBuilder.append(getReportedData().toXML());
        }
        for (Item toXML : getItems()) {
            xmlStringBuilder.append(toXML.toXML());
        }
        for (FormField toXML2 : getFields()) {
            xmlStringBuilder.append(toXML2.toXML());
        }
        for (Element toXML3 : this.extensionElements) {
            xmlStringBuilder.append(toXML3.toXML());
        }
        xmlStringBuilder.closeElement((NamedElement) this);
        return xmlStringBuilder;
    }
}
