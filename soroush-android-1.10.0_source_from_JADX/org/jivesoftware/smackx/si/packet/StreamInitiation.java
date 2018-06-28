package org.jivesoftware.smackx.si.packet;

import java.util.Date;
import org.b.c.a;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smackx.filetransfer.FileTransferNegotiator;
import org.jivesoftware.smackx.message_correct.element.MessageCorrectExtension;
import org.jivesoftware.smackx.xdata.packet.DataForm;

public class StreamInitiation extends IQ {
    public static final String ELEMENT = "si";
    public static final String NAMESPACE = "http://jabber.org/protocol/si";
    private Feature featureNegotiation;
    private File file;
    private String id;
    private String mimeType;

    public static class Feature implements ExtensionElement {
        private final DataForm data;

        public Feature(DataForm dataForm) {
            this.data = dataForm;
        }

        public DataForm getData() {
            return this.data;
        }

        public String getElementName() {
            return "feature";
        }

        public String getNamespace() {
            return "http://jabber.org/protocol/feature-neg";
        }

        public String toXML() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<feature xmlns=\"http://jabber.org/protocol/feature-neg\">");
            stringBuilder.append(this.data.toXML());
            stringBuilder.append("</feature>");
            return stringBuilder.toString();
        }
    }

    public static class File implements ExtensionElement {
        private Date date;
        private String desc;
        private String hash;
        private boolean isRanged;
        private final String name;
        private final long size;

        public File(String str, long j) {
            if (str == null) {
                throw new NullPointerException("name cannot be null");
            }
            this.name = str;
            this.size = j;
        }

        public Date getDate() {
            return this.date;
        }

        public String getDesc() {
            return this.desc;
        }

        public String getElementName() {
            return "file";
        }

        public String getHash() {
            return this.hash;
        }

        public String getName() {
            return this.name;
        }

        public String getNamespace() {
            return FileTransferNegotiator.SI_PROFILE_FILE_TRANSFER_NAMESPACE;
        }

        public long getSize() {
            return this.size;
        }

        public boolean isRanged() {
            return this.isRanged;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public void setDesc(String str) {
            this.desc = str;
        }

        public void setHash(String str) {
            this.hash = str;
        }

        public void setRanged(boolean z) {
            this.isRanged = z;
        }

        public String toXML() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append('<');
            stringBuilder.append(getElementName());
            stringBuilder.append(" xmlns=\"");
            stringBuilder.append(getNamespace());
            stringBuilder.append("\" ");
            if (getName() != null) {
                stringBuilder.append("name=\"");
                stringBuilder.append(StringUtils.escapeForXmlAttribute(getName()));
                stringBuilder.append("\" ");
            }
            if (getSize() > 0) {
                stringBuilder.append("size=\"");
                stringBuilder.append(getSize());
                stringBuilder.append("\" ");
            }
            if (getDate() != null) {
                stringBuilder.append("date=\"");
                stringBuilder.append(a.a(this.date));
                stringBuilder.append("\" ");
            }
            if (getHash() != null) {
                stringBuilder.append("hash=\"");
                stringBuilder.append(getHash());
                stringBuilder.append("\" ");
            }
            if ((this.desc == null || this.desc.length() <= 0) && !this.isRanged) {
                stringBuilder.append("/>");
            } else {
                stringBuilder.append('>');
                if (getDesc() != null && this.desc.length() > 0) {
                    stringBuilder.append("<desc>");
                    stringBuilder.append(StringUtils.escapeForXmlText(getDesc()));
                    stringBuilder.append("</desc>");
                }
                if (isRanged()) {
                    stringBuilder.append("<range/>");
                }
                stringBuilder.append("</");
                stringBuilder.append(getElementName());
                stringBuilder.append('>');
            }
            return stringBuilder.toString();
        }
    }

    public StreamInitiation() {
        super(ELEMENT, "http://jabber.org/protocol/si");
    }

    public DataForm getFeatureNegotiationForm() {
        return this.featureNegotiation.getData();
    }

    public File getFile() {
        return this.file;
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        switch (getType()) {
            case set:
                iQChildElementXmlStringBuilder.optAttribute(MessageCorrectExtension.ID_TAG, getSessionID());
                iQChildElementXmlStringBuilder.optAttribute("mime-type", getMimeType());
                iQChildElementXmlStringBuilder.attribute("profile", FileTransferNegotiator.SI_PROFILE_FILE_TRANSFER_NAMESPACE);
                iQChildElementXmlStringBuilder.rightAngleBracket();
                iQChildElementXmlStringBuilder.optAppend(this.file.toXML());
                break;
            case result:
                iQChildElementXmlStringBuilder.rightAngleBracket();
                break;
            default:
                throw new IllegalArgumentException("IQ Type not understood");
        }
        if (this.featureNegotiation != null) {
            iQChildElementXmlStringBuilder.append(this.featureNegotiation.toXML());
        }
        return iQChildElementXmlStringBuilder;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public String getSessionID() {
        return this.id;
    }

    public void setFeatureNegotiationForm(DataForm dataForm) {
        this.featureNegotiation = new Feature(dataForm);
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void setMimeType(String str) {
        this.mimeType = str;
    }

    public void setSessionID(String str) {
        this.id = str;
    }
}
