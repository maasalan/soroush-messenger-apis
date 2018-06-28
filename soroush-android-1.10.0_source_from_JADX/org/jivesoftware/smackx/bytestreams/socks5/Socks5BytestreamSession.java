package org.jivesoftware.smackx.bytestreams.socks5;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.jivesoftware.smackx.bytestreams.BytestreamSession;

public class Socks5BytestreamSession implements BytestreamSession {
    private final boolean isDirect;
    private final Socket socket;

    protected Socks5BytestreamSession(Socket socket, boolean z) {
        this.socket = socket;
        this.isDirect = z;
    }

    public void close() {
        this.socket.close();
    }

    public InputStream getInputStream() {
        return this.socket.getInputStream();
    }

    public OutputStream getOutputStream() {
        return this.socket.getOutputStream();
    }

    public int getReadTimeout() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.socket;	 Catch:{ SocketException -> 0x0007 }
        r0 = r0.getSoTimeout();	 Catch:{ SocketException -> 0x0007 }
        return r0;
    L_0x0007:
        r0 = new java.io.IOException;
        r1 = "Error on underlying Socket";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamSession.getReadTimeout():int");
    }

    public boolean isDirect() {
        return this.isDirect;
    }

    public boolean isMediated() {
        return !this.isDirect;
    }

    public void setReadTimeout(int r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.socket;	 Catch:{ SocketException -> 0x0006 }
        r0.setSoTimeout(r2);	 Catch:{ SocketException -> 0x0006 }
        return;
    L_0x0006:
        r2 = new java.io.IOException;
        r0 = "Error on underlying Socket";
        r2.<init>(r0);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.bytestreams.socks5.Socks5BytestreamSession.setReadTimeout(int):void");
    }
}
