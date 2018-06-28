package org.jivesoftware.smackx.bob.element;

import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smackx.bob.BoBData;
import org.jivesoftware.smackx.bob.BoBHash;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class BoBIQ extends IQ {
    public static final String ELEMENT = "data";
    public static final String NAMESPACE = "urn:xmpp:bob";
    private final BoBData bobData;
    private final BoBHash bobHash;

    public BoBIQ(BoBHash boBHash) {
        this(boBHash, null);
    }

    public BoBIQ(BoBHash boBHash, BoBData boBData) {
        super("data", "urn:xmpp:bob");
        this.bobHash = boBHash;
        this.bobData = boBData;
    }

    public BoBData getBoBData() {
        return this.bobData;
    }

    public BoBHash getBoBHash() {
        return this.bobHash;
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.attribute("cid", this.bobHash.getCid());
        if (this.bobData != null) {
            iQChildElementXmlStringBuilder.optIntAttribute("max_age", this.bobData.getMaxAge());
            iQChildElementXmlStringBuilder.attribute(IjkMediaMeta.IJKM_KEY_TYPE, this.bobData.getType());
            iQChildElementXmlStringBuilder.rightAngleBracket();
            iQChildElementXmlStringBuilder.escape(this.bobData.getContentBase64Encoded());
            return iQChildElementXmlStringBuilder;
        }
        iQChildElementXmlStringBuilder.setEmptyElement();
        return iQChildElementXmlStringBuilder;
    }
}
