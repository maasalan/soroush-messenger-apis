package org.jivesoftware.smackx.xdatalayout.packet;

import java.util.ArrayList;
import java.util.List;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.util.XmlStringBuilder;

public class DataLayout implements ExtensionElement {
    public static final String ELEMENT = "page";
    public static final String NAMESPACE = "http://jabber.org/protocol/xdata-layout";
    private final String label;
    private final List<DataFormLayoutElement> pageLayout = new ArrayList();

    public interface DataFormLayoutElement extends NamedElement {
    }

    public static class Fieldref implements DataFormLayoutElement {
        public static final String ELEMENT = "fieldref";
        private final String var;

        public Fieldref(String str) {
            this.var = str;
        }

        public String getElementName() {
            return ELEMENT;
        }

        public String getVar() {
            return this.var;
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
            xmlStringBuilder.attribute("var", getVar());
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }
    }

    public static class Reportedref implements DataFormLayoutElement {
        public static final String ELEMENT = "reportedref";

        public String getElementName() {
            return ELEMENT;
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }
    }

    public static class Section implements DataFormLayoutElement {
        public static final String ELEMENT = "section";
        private final String label;
        private final List<DataFormLayoutElement> sectionLayout = new ArrayList();

        public Section(String str) {
            this.label = str;
        }

        public String getElementName() {
            return ELEMENT;
        }

        public String getLabel() {
            return this.label;
        }

        public List<DataFormLayoutElement> getSectionLayout() {
            return this.sectionLayout;
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
            xmlStringBuilder.optAttribute("label", getLabel());
            xmlStringBuilder.rightAngleBracket();
            DataLayout.walkList(xmlStringBuilder, getSectionLayout());
            xmlStringBuilder.closeElement(ELEMENT);
            return xmlStringBuilder;
        }
    }

    public static class Text implements DataFormLayoutElement {
        public static final String ELEMENT = "text";
        private final String text;

        public Text(String str) {
            this.text = str;
        }

        public String getElementName() {
            return "text";
        }

        public String getText() {
            return this.text;
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
            xmlStringBuilder.element("text", getText());
            return xmlStringBuilder;
        }
    }

    public DataLayout(String str) {
        this.label = str;
    }

    private static void walkList(XmlStringBuilder xmlStringBuilder, List<DataFormLayoutElement> list) {
        for (DataFormLayoutElement toXML : list) {
            xmlStringBuilder.append(toXML.toXML());
        }
    }

    public String getElementName() {
        return ELEMENT;
    }

    public String getLabel() {
        return this.label;
    }

    public String getNamespace() {
        return NAMESPACE;
    }

    public List<DataFormLayoutElement> getPageLayout() {
        return this.pageLayout;
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
        xmlStringBuilder.optAttribute("label", getLabel());
        xmlStringBuilder.rightAngleBracket();
        walkList(xmlStringBuilder, getPageLayout());
        xmlStringBuilder.closeElement((NamedElement) this);
        return xmlStringBuilder;
    }
}
