package org.jivesoftware.smackx.bob.provider;

import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.bob.BoBData;
import org.jivesoftware.smackx.bob.BoBHash;
import org.jivesoftware.smackx.bob.element.BoBIQ;
import org.xmlpull.v1.XmlPullParser;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class BoBIQProvider extends IQProvider<BoBIQ> {
    public BoBIQ parse(XmlPullParser xmlPullParser, int i) {
        BoBHash fromCid = BoBHash.fromCid(xmlPullParser.getAttributeValue("", "cid"));
        String attributeValue = xmlPullParser.getAttributeValue("", IjkMediaMeta.IJKM_KEY_TYPE);
        return new BoBIQ(fromCid, attributeValue != null ? new BoBData(attributeValue, xmlPullParser.nextText(), ParserUtils.getIntegerAttribute(xmlPullParser, "max-age", -1)) : null);
    }
}
