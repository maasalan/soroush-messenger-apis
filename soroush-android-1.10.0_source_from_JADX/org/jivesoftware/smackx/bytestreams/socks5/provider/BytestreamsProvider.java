package org.jivesoftware.smackx.bytestreams.socks5.provider;

import org.b.a.i;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream;
import org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream.Activate;
import org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream.Mode;
import org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream.StreamHost;
import org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream.StreamHostUsed;
import org.xmlpull.v1.XmlPullParser;
import tv.danmaku.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener;

public class BytestreamsProvider extends IQProvider<Bytestream> {
    public Bytestream parse(XmlPullParser xmlPullParser, int i) {
        Bytestream bytestream = new Bytestream();
        String attributeValue = xmlPullParser.getAttributeValue("", "sid");
        String attributeValue2 = xmlPullParser.getAttributeValue("", "mode");
        Object obj = null;
        loop0:
        while (true) {
            String str = null;
            i iVar = str;
            String str2 = iVar;
            while (obj == null) {
                int next = xmlPullParser.next();
                String name = xmlPullParser.getName();
                if (next == 2) {
                    if (name.equals(StreamHost.ELEMENTNAME)) {
                        iVar = ParserUtils.getJidAttribute(xmlPullParser);
                        str2 = xmlPullParser.getAttributeValue("", "host");
                        str = xmlPullParser.getAttributeValue("", OnNativeInvokeListener.ARG_PORT);
                    } else if (name.equals(StreamHostUsed.ELEMENTNAME)) {
                        bytestream.setUsedHost(ParserUtils.getJidAttribute(xmlPullParser));
                    } else if (name.equals(Activate.ELEMENTNAME)) {
                        bytestream.setToActivate(ParserUtils.getJidAttribute(xmlPullParser));
                    }
                } else if (next != 3) {
                    continue;
                } else if (name.equals("streamhost")) {
                    if (str == null) {
                        bytestream.addStreamHost(iVar, str2);
                    } else {
                        bytestream.addStreamHost(iVar, str2, Integer.parseInt(str));
                    }
                } else if (name.equals("query")) {
                    obj = 1;
                }
            }
            break loop0;
        }
        bytestream.setMode(attributeValue2 == null ? Mode.tcp : Mode.fromName(attributeValue2));
        bytestream.setSessionID(attributeValue);
        return bytestream;
    }
}
