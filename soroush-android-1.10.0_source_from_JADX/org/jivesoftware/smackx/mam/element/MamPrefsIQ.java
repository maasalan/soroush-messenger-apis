package org.jivesoftware.smackx.mam.element;

import java.util.List;
import org.b.a.i;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smackx.mam.element.MamElements.AlwaysJidListElement;
import org.jivesoftware.smackx.mam.element.MamElements.NeverJidListElement;

public class MamPrefsIQ extends IQ {
    public static final String ELEMENT = "prefs";
    public static final String NAMESPACE = "urn:xmpp:mam:1";
    private final List<i> alwaysJids;
    private final DefaultBehavior defaultBehavior;
    private final List<i> neverJids;

    public enum DefaultBehavior {
        always,
        never,
        roster
    }

    public MamPrefsIQ() {
        super(ELEMENT, "urn:xmpp:mam:1");
        this.alwaysJids = null;
        this.neverJids = null;
        this.defaultBehavior = null;
    }

    public MamPrefsIQ(List<i> list, List<i> list2, DefaultBehavior defaultBehavior) {
        super(ELEMENT, "urn:xmpp:mam:1");
        setType(Type.set);
        this.alwaysJids = list;
        this.neverJids = list2;
        this.defaultBehavior = defaultBehavior;
    }

    public List<i> getAlwaysJids() {
        return this.alwaysJids;
    }

    public DefaultBehavior getDefault() {
        return this.defaultBehavior;
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        if (getType().equals(Type.set) || getType().equals(Type.result)) {
            iQChildElementXmlStringBuilder.attribute("default", this.defaultBehavior);
        }
        if (this.alwaysJids == null && this.neverJids == null) {
            iQChildElementXmlStringBuilder.setEmptyElement();
            return iQChildElementXmlStringBuilder;
        }
        iQChildElementXmlStringBuilder.rightAngleBracket();
        if (this.alwaysJids != null) {
            iQChildElementXmlStringBuilder.element(new AlwaysJidListElement(this.alwaysJids));
        }
        if (this.neverJids != null) {
            iQChildElementXmlStringBuilder.element(new NeverJidListElement(this.neverJids));
        }
        return iQChildElementXmlStringBuilder;
    }

    public List<i> getNeverJids() {
        return this.neverJids;
    }
}
