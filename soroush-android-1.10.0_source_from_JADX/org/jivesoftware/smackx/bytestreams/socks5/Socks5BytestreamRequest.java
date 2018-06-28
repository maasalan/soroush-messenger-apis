package org.jivesoftware.smackx.bytestreams.socks5;

import org.b.a.i;
import org.b.c.a.a;
import org.b.c.a.b;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smack.packet.XMPPError.Builder;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smackx.bytestreams.BytestreamRequest;
import org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream;
import org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream.StreamHost;

public class Socks5BytestreamRequest implements BytestreamRequest {
    private static final a<String, Integer> ADDRESS_BLACKLIST = new b(100, BLACKLIST_LIFETIME);
    private static final long BLACKLIST_LIFETIME = 7200000;
    private static final int BLACKLIST_MAX_SIZE = 100;
    private static int CONNECTION_FAILURE_THRESHOLD = 2;
    private Bytestream bytestreamRequest;
    private Socks5BytestreamManager manager;
    private int minimumConnectTimeout = 2000;
    private int totalConnectTimeout = 10000;

    protected Socks5BytestreamRequest(Socks5BytestreamManager socks5BytestreamManager, Bytestream bytestream) {
        this.manager = socks5BytestreamManager;
        this.bytestreamRequest = bytestream;
    }

    private void cancelRequest() {
        Builder from = XMPPError.from(Condition.item_not_found, "Could not establish socket with any provided host");
        Stanza createErrorResponse = IQ.createErrorResponse(this.bytestreamRequest, from);
        this.manager.getConnection().sendStanza(createErrorResponse);
        throw new XMPPErrorException(createErrorResponse, from.build());
    }

    private Bytestream createUsedHostResponse(StreamHost streamHost) {
        Bytestream bytestream = new Bytestream(this.bytestreamRequest.getSessionID());
        bytestream.setTo(this.bytestreamRequest.getFrom());
        bytestream.setType(Type.result);
        bytestream.setStanzaId(this.bytestreamRequest.getStanzaId());
        bytestream.setUsedHost(streamHost.getJID());
        return bytestream;
    }

    public static int getConnectFailureThreshold() {
        return CONNECTION_FAILURE_THRESHOLD;
    }

    private static int getConnectionFailures(String str) {
        Integer num = (Integer) ADDRESS_BLACKLIST.a(str);
        return num != null ? num.intValue() : 0;
    }

    private static void incrementConnectionFailures(String str) {
        Integer num = (Integer) ADDRESS_BLACKLIST.a(str);
        a aVar = ADDRESS_BLACKLIST;
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        aVar.put(str, Integer.valueOf(i));
    }

    public static void setConnectFailureThreshold(int i) {
        CONNECTION_FAILURE_THRESHOLD = i;
    }

    public org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamSession accept() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r7 = this;
        r0 = r7.bytestreamRequest;
        r0 = r0.getStreamHosts();
        r1 = r0.size();
        if (r1 != 0) goto L_0x000f;
    L_0x000c:
        r7.cancelRequest();
    L_0x000f:
        r1 = r7.bytestreamRequest;
        r1 = r1.getSessionID();
        r2 = r7.bytestreamRequest;
        r2 = r2.getFrom();
        r3 = r7.manager;
        r3 = r3.getConnection();
        r3 = r3.getUser();
        r1 = org.jivesoftware.smackx.bytestreams.socks5.Socks5Utils.createDigest(r1, r2, r3);
        r2 = r7.getTotalConnectTimeout();
        r3 = r0.size();
        r2 = r2 / r3;
        r3 = r7.getMinimumConnectTimeout();
        r2 = java.lang.Math.max(r2, r3);
        r0 = r0.iterator();
    L_0x003e:
        r3 = r0.hasNext();
        r4 = 0;
        if (r3 == 0) goto L_0x0082;
    L_0x0045:
        r3 = r0.next();
        r4 = r3;
        r4 = (org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream.StreamHost) r4;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r5 = r4.getAddress();
        r3.append(r5);
        r5 = ":";
        r3.append(r5);
        r5 = r4.getPort();
        r3.append(r5);
        r3 = r3.toString();
        r5 = getConnectionFailures(r3);
        r6 = CONNECTION_FAILURE_THRESHOLD;
        if (r6 <= 0) goto L_0x0074;
    L_0x0070:
        r6 = CONNECTION_FAILURE_THRESHOLD;
        if (r5 >= r6) goto L_0x003e;
    L_0x0074:
        r5 = new org.jivesoftware.smackx.bytestreams.socks5.Socks5Client;	 Catch:{ TimeoutException -> 0x007e, TimeoutException -> 0x007e, TimeoutException -> 0x007e, TimeoutException -> 0x007e }
        r5.<init>(r4, r1);	 Catch:{ TimeoutException -> 0x007e, TimeoutException -> 0x007e, TimeoutException -> 0x007e, TimeoutException -> 0x007e }
        r5 = r5.getSocket(r2);	 Catch:{ TimeoutException -> 0x007e, TimeoutException -> 0x007e, TimeoutException -> 0x007e, TimeoutException -> 0x007e }
        goto L_0x0083;
    L_0x007e:
        incrementConnectionFailures(r3);
        goto L_0x003e;
    L_0x0082:
        r5 = r4;
    L_0x0083:
        if (r4 == 0) goto L_0x0087;
    L_0x0085:
        if (r5 != 0) goto L_0x008a;
    L_0x0087:
        r7.cancelRequest();
    L_0x008a:
        r0 = r7.createUsedHostResponse(r4);
        r1 = r7.manager;
        r1 = r1.getConnection();
        r1.sendStanza(r0);
        r0 = new org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamSession;
        r1 = r4.getJID();
        r2 = r7.bytestreamRequest;
        r2 = r2.getFrom();
        r1 = r1.a(r2);
        r0.<init>(r5, r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamRequest.accept():org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamSession");
    }

    public i getFrom() {
        return this.bytestreamRequest.getFrom();
    }

    public int getMinimumConnectTimeout() {
        return this.minimumConnectTimeout <= 0 ? 2000 : this.minimumConnectTimeout;
    }

    public String getSessionID() {
        return this.bytestreamRequest.getSessionID();
    }

    public int getTotalConnectTimeout() {
        return this.totalConnectTimeout <= 0 ? 10000 : this.totalConnectTimeout;
    }

    public void reject() {
        this.manager.replyRejectPacket(this.bytestreamRequest);
    }

    public void setMinimumConnectTimeout(int i) {
        this.minimumConnectTimeout = i;
    }

    public void setTotalConnectTimeout(int i) {
        this.totalConnectTimeout = i;
    }
}
