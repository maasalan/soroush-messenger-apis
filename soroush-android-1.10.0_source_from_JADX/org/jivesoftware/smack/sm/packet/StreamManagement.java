package org.jivesoftware.smack.sm.packet;

import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.Nonza;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smackx.message_correct.element.MessageCorrectExtension;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;

public class StreamManagement {
    public static final String NAMESPACE = "urn:xmpp:sm:3";

    public static final class StreamManagementFeature implements ExtensionElement {
        public static final String ELEMENT = "sm";
        public static final StreamManagementFeature INSTANCE = new StreamManagementFeature();

        private StreamManagementFeature() {
        }

        public final String getElementName() {
            return ELEMENT;
        }

        public final String getNamespace() {
            return StreamManagement.NAMESPACE;
        }

        public final CharSequence toXML() {
            CharSequence xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }
    }

    private static abstract class AbstractEnable implements Nonza {
        protected int max;
        protected boolean resume;

        private AbstractEnable() {
            this.max = -1;
            this.resume = false;
        }

        public int getMaxResumptionTime() {
            return this.max;
        }

        public final String getNamespace() {
            return StreamManagement.NAMESPACE;
        }

        public boolean isResumeSet() {
            return this.resume;
        }

        protected void maybeAddMaxAttributeTo(XmlStringBuilder xmlStringBuilder) {
            if (this.max > 0) {
                xmlStringBuilder.attribute("max", Integer.toString(this.max));
            }
        }

        protected void maybeAddResumeAttributeTo(XmlStringBuilder xmlStringBuilder) {
            if (this.resume) {
                xmlStringBuilder.attribute(Resume.ELEMENT, "true");
            }
        }
    }

    private static abstract class AbstractResume implements Nonza {
        private final long handledCount;
        private final String previd;

        public AbstractResume(long j, String str) {
            this.handledCount = j;
            this.previd = str;
        }

        public long getHandledCount() {
            return this.handledCount;
        }

        public final String getNamespace() {
            return StreamManagement.NAMESPACE;
        }

        public String getPrevId() {
            return this.previd;
        }

        public final XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
            xmlStringBuilder.attribute(XHTMLText.f24839H, Long.toString(this.handledCount));
            xmlStringBuilder.attribute("previd", this.previd);
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }
    }

    public static class AckAnswer implements Nonza {
        public static final String ELEMENT = "a";
        private final long handledCount;

        public AckAnswer(long j) {
            this.handledCount = j;
        }

        public String getElementName() {
            return "a";
        }

        public long getHandledCount() {
            return this.handledCount;
        }

        public String getNamespace() {
            return StreamManagement.NAMESPACE;
        }

        public CharSequence toXML() {
            CharSequence xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
            xmlStringBuilder.attribute(XHTMLText.f24839H, Long.toString(this.handledCount));
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }
    }

    public static final class AckRequest implements Nonza {
        public static final String ELEMENT = "r";
        public static final AckRequest INSTANCE = new AckRequest();

        private AckRequest() {
        }

        public final String getElementName() {
            return ELEMENT;
        }

        public final String getNamespace() {
            return StreamManagement.NAMESPACE;
        }

        public final CharSequence toXML() {
            return "<r xmlns='urn:xmpp:sm:3'/>";
        }
    }

    public static class Failed implements Nonza {
        public static final String ELEMENT = "failed";
        private Condition condition;

        public Failed(Condition condition) {
            this.condition = condition;
        }

        public String getElementName() {
            return ELEMENT;
        }

        public String getNamespace() {
            return StreamManagement.NAMESPACE;
        }

        public Condition getXMPPErrorCondition() {
            return this.condition;
        }

        public CharSequence toXML() {
            CharSequence xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
            if (this.condition != null) {
                xmlStringBuilder.rightAngleBracket();
                xmlStringBuilder.append(this.condition.toString());
                xmlStringBuilder.xmlnsAttribute(XMPPError.NAMESPACE);
                xmlStringBuilder.closeElement(ELEMENT);
                return xmlStringBuilder;
            }
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }
    }

    public static class Enable extends AbstractEnable {
        public static final String ELEMENT = "enable";
        public static final Enable INSTANCE = new Enable();

        private Enable() {
            super();
        }

        public Enable(boolean z) {
            super();
            this.resume = z;
        }

        public Enable(boolean z, int i) {
            this(z);
            this.max = i;
        }

        public String getElementName() {
            return "enable";
        }

        public /* bridge */ /* synthetic */ int getMaxResumptionTime() {
            return super.getMaxResumptionTime();
        }

        public /* bridge */ /* synthetic */ boolean isResumeSet() {
            return super.isResumeSet();
        }

        public CharSequence toXML() {
            CharSequence xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
            maybeAddResumeAttributeTo(xmlStringBuilder);
            maybeAddMaxAttributeTo(xmlStringBuilder);
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }
    }

    public static class Enabled extends AbstractEnable {
        public static final String ELEMENT = "enabled";
        private final String id;
        private final String location;

        public Enabled(String str, boolean z) {
            this(str, z, null, -1);
        }

        public Enabled(String str, boolean z, String str2, int i) {
            super();
            this.id = str;
            this.resume = z;
            this.location = str2;
            this.max = i;
        }

        public String getElementName() {
            return ELEMENT;
        }

        public String getId() {
            return this.id;
        }

        public String getLocation() {
            return this.location;
        }

        public /* bridge */ /* synthetic */ int getMaxResumptionTime() {
            return super.getMaxResumptionTime();
        }

        public /* bridge */ /* synthetic */ boolean isResumeSet() {
            return super.isResumeSet();
        }

        public CharSequence toXML() {
            CharSequence xmlStringBuilder = new XmlStringBuilder((ExtensionElement) this);
            xmlStringBuilder.optAttribute(MessageCorrectExtension.ID_TAG, this.id);
            maybeAddResumeAttributeTo(xmlStringBuilder);
            xmlStringBuilder.optAttribute("location", this.location);
            maybeAddMaxAttributeTo(xmlStringBuilder);
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }
    }

    public static class Resume extends AbstractResume {
        public static final String ELEMENT = "resume";

        public Resume(long j, String str) {
            super(j, str);
        }

        public String getElementName() {
            return ELEMENT;
        }

        public /* bridge */ /* synthetic */ long getHandledCount() {
            return super.getHandledCount();
        }

        public /* bridge */ /* synthetic */ String getPrevId() {
            return super.getPrevId();
        }
    }

    public static class Resumed extends AbstractResume {
        public static final String ELEMENT = "resumed";

        public Resumed(long j, String str) {
            super(j, str);
        }

        public String getElementName() {
            return ELEMENT;
        }

        public /* bridge */ /* synthetic */ long getHandledCount() {
            return super.getHandledCount();
        }

        public /* bridge */ /* synthetic */ String getPrevId() {
            return super.getPrevId();
        }
    }
}
