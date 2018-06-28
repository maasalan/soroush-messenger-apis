package org.jivesoftware.smackx.bytestreams.socks5.packet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.b.a.i;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.packet.NamedElement;
import org.jivesoftware.smack.util.Objects;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;
import tv.danmaku.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener;

public class Bytestream extends IQ {
    public static final String ELEMENT = "query";
    public static final String NAMESPACE = "http://jabber.org/protocol/bytestreams";
    private Mode mode;
    private String sessionID;
    private final List<StreamHost> streamHosts;
    private Activate toActivate;
    private StreamHostUsed usedHost;

    public enum Mode {
        tcp,
        udp;

        public static org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream.Mode fromName(java.lang.String r0) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = valueOf(r0);	 Catch:{ Exception -> 0x0005 }
            return r0;
        L_0x0005:
            r0 = tcp;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream.Mode.fromName(java.lang.String):org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream$Mode");
        }
    }

    public static class Activate implements NamedElement {
        public static String ELEMENTNAME = "activate";
        private final i target;

        public Activate(i iVar) {
            this.target = iVar;
        }

        public String getElementName() {
            return ELEMENTNAME;
        }

        public i getTarget() {
            return this.target;
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
            xmlStringBuilder.rightAngleBracket();
            xmlStringBuilder.escape(getTarget());
            xmlStringBuilder.closeElement((NamedElement) this);
            return xmlStringBuilder;
        }
    }

    public static class StreamHost implements NamedElement {
        public static String ELEMENTNAME = "streamhost";
        private final i JID;
        private final String addy;
        private final int port;

        public StreamHost(i iVar, String str) {
            this(iVar, str, 0);
        }

        public StreamHost(i iVar, String str, int i) {
            this.JID = (i) Objects.requireNonNull(iVar, "StreamHost JID must not be null");
            this.addy = (String) StringUtils.requireNotNullOrEmpty(str, "StreamHost address must not be null");
            this.port = i;
        }

        public String getAddress() {
            return this.addy;
        }

        public String getElementName() {
            return ELEMENTNAME;
        }

        public i getJID() {
            return this.JID;
        }

        public int getPort() {
            return this.port;
        }

        public XmlStringBuilder toXML() {
            String str;
            String num;
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
            xmlStringBuilder.attribute(ParserUtils.JID, getJID());
            xmlStringBuilder.attribute("host", getAddress());
            if (getPort() != 0) {
                str = OnNativeInvokeListener.ARG_PORT;
                num = Integer.toString(getPort());
            } else {
                str = "zeroconf";
                num = "_jabber.bytestreams";
            }
            xmlStringBuilder.attribute(str, num);
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }
    }

    public static class StreamHostUsed implements NamedElement {
        public static String ELEMENTNAME = "streamhost-used";
        private final i JID;

        public StreamHostUsed(i iVar) {
            this.JID = iVar;
        }

        public String getElementName() {
            return ELEMENTNAME;
        }

        public i getJID() {
            return this.JID;
        }

        public XmlStringBuilder toXML() {
            XmlStringBuilder xmlStringBuilder = new XmlStringBuilder((NamedElement) this);
            xmlStringBuilder.attribute(ParserUtils.JID, getJID());
            xmlStringBuilder.closeEmptyElement();
            return xmlStringBuilder;
        }
    }

    public Bytestream() {
        super("query", NAMESPACE);
        this.mode = Mode.tcp;
        this.streamHosts = new ArrayList();
    }

    public Bytestream(String str) {
        this();
        setSessionID(str);
    }

    public StreamHost addStreamHost(i iVar, String str) {
        return addStreamHost(iVar, str, 0);
    }

    public StreamHost addStreamHost(i iVar, String str, int i) {
        StreamHost streamHost = new StreamHost(iVar, str, i);
        addStreamHost(streamHost);
        return streamHost;
    }

    public void addStreamHost(StreamHost streamHost) {
        this.streamHosts.add(streamHost);
    }

    public int countStreamHosts() {
        return this.streamHosts.size();
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        switch (getType()) {
            case set:
                iQChildElementXmlStringBuilder.optAttribute("sid", getSessionID());
                iQChildElementXmlStringBuilder.optAttribute("mode", getMode());
                iQChildElementXmlStringBuilder.rightAngleBracket();
                if (getToActivate() != null) {
                    iQChildElementXmlStringBuilder.append(getToActivate().toXML());
                    break;
                }
                for (StreamHost toXML : getStreamHosts()) {
                    iQChildElementXmlStringBuilder.append(toXML.toXML());
                }
                break;
            case result:
                iQChildElementXmlStringBuilder.rightAngleBracket();
                iQChildElementXmlStringBuilder.optAppend(getUsedHost());
                for (StreamHost toXML2 : this.streamHosts) {
                    iQChildElementXmlStringBuilder.append(toXML2.toXML());
                }
                break;
            case get:
                iQChildElementXmlStringBuilder.setEmptyElement();
                return iQChildElementXmlStringBuilder;
            default:
                throw new IllegalStateException();
        }
        return iQChildElementXmlStringBuilder;
    }

    public Mode getMode() {
        return this.mode;
    }

    public String getSessionID() {
        return this.sessionID;
    }

    public StreamHost getStreamHost(i iVar) {
        if (iVar == null) {
            return null;
        }
        for (StreamHost streamHost : this.streamHosts) {
            if (streamHost.getJID().a(iVar)) {
                return streamHost;
            }
        }
        return null;
    }

    public List<StreamHost> getStreamHosts() {
        return Collections.unmodifiableList(this.streamHosts);
    }

    public Activate getToActivate() {
        return this.toActivate;
    }

    public StreamHostUsed getUsedHost() {
        return this.usedHost;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public void setSessionID(String str) {
        this.sessionID = str;
    }

    public void setToActivate(i iVar) {
        this.toActivate = new Activate(iVar);
    }

    public void setUsedHost(i iVar) {
        this.usedHost = new StreamHostUsed(iVar);
    }
}
