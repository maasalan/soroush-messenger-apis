package org.jivesoftware.smack.proxy;

import java.io.InputStream;
import org.jivesoftware.smack.proxy.ProxyInfo.ProxyType;

public class Socks5ProxySocketConnection implements ProxySocketConnection {
    private final ProxyInfo proxy;

    Socks5ProxySocketConnection(ProxyInfo proxyInfo) {
        this.proxy = proxyInfo;
    }

    private static void fill(InputStream inputStream, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read <= 0) {
                throw new ProxyException(ProxyType.SOCKS5, "stream is closed");
            }
            i2 += read;
        }
    }

    public void connect(java.net.Socket r18, java.lang.String r19, int r20, int r21) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r17 = this;
        r1 = r17;
        r2 = r18;
        r3 = r20;
        r4 = r1.proxy;
        r4 = r4.getProxyAddress();
        r5 = r1.proxy;
        r5 = r5.getProxyPort();
        r6 = r1.proxy;
        r6 = r6.getProxyUsername();
        r7 = r1.proxy;
        r7 = r7.getProxyPassword();
        r8 = new java.net.InetSocketAddress;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r8.<init>(r4, r5);	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r4 = r21;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r2.connect(r8, r4);	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r4 = r18.getInputStream();	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r5 = r18.getOutputStream();	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r8 = 1;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r2.setTcpNoDelay(r8);	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r9 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r9 = new byte[r9];	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r10 = 5;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r11 = 0;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r9[r11] = r10;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r12 = 2;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r9[r8] = r12;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r9[r12] = r11;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r13 = 3;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r9[r13] = r12;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r14 = 4;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r5.write(r9, r11, r14);	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        fill(r4, r9, r12);	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r15 = r9[r8];	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r15 = r15 & 255;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        if (r15 == 0) goto L_0x0098;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
    L_0x0051:
        if (r15 == r12) goto L_0x0054;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
    L_0x0053:
        goto L_0x0096;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
    L_0x0054:
        if (r6 == 0) goto L_0x0096;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
    L_0x0056:
        if (r7 == 0) goto L_0x0096;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
    L_0x0058:
        r9[r11] = r8;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r15 = r6.length();	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r15 = (byte) r15;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r9[r8] = r15;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r15 = "UTF-8";	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r15 = r6.getBytes(r15);	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r14 = r6.length();	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        java.lang.System.arraycopy(r15, r11, r9, r12, r14);	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r14 = r6.length();	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r14 = r14 + r12;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r15 = "UTF-8";	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r6 = r6.getBytes(r15);	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r15 = r14 + 1;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r13 = r6.length;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r13 = (byte) r13;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r9[r14] = r13;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r13 = r7.length();	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        java.lang.System.arraycopy(r6, r11, r9, r15, r13);	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r6 = r7.length();	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r15 = r15 + r6;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r5.write(r9, r11, r15);	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        fill(r4, r9, r12);	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r6 = r9[r8];	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        if (r6 != 0) goto L_0x0096;
    L_0x0095:
        goto L_0x0098;
    L_0x0096:
        r6 = r11;
        goto L_0x0099;
    L_0x0098:
        r6 = r8;
    L_0x0099:
        if (r6 != 0) goto L_0x00a8;
    L_0x009b:
        r18.close();	 Catch:{ Exception -> 0x009e, RuntimeException -> 0x0127 }
    L_0x009e:
        r3 = new org.jivesoftware.smack.proxy.ProxyException;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r4 = org.jivesoftware.smack.proxy.ProxyInfo.ProxyType.SOCKS5;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r5 = "fail in SOCKS5 proxy";	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r3.<init>(r4, r5);	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        throw r3;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
    L_0x00a8:
        r9[r11] = r10;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r9[r8] = r8;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r9[r12] = r11;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r6 = "UTF-8";	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r7 = r19;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r6 = r7.getBytes(r6);	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r7 = r6.length;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r13 = 3;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r9[r13] = r13;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r13 = (byte) r7;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r14 = 4;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r9[r14] = r13;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        java.lang.System.arraycopy(r6, r11, r9, r10, r7);	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r10 = r10 + r7;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r6 = r10 + 1;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r7 = r3 >>> 8;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r7 = (byte) r7;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r9[r10] = r7;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r7 = r6 + 1;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r3 = r3 & 255;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r3 = (byte) r3;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r9[r6] = r3;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r5.write(r9, r11, r7);	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r3 = 4;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        fill(r4, r9, r3);	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r3 = r9[r8];	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        if (r3 == 0) goto L_0x00f6;
    L_0x00db:
        r18.close();	 Catch:{ Exception -> 0x00de, RuntimeException -> 0x0127 }
    L_0x00de:
        r3 = new org.jivesoftware.smack.proxy.ProxyException;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r4 = org.jivesoftware.smack.proxy.ProxyInfo.ProxyType.SOCKS5;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r5 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r6 = "server returns ";	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r5.<init>(r6);	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r6 = r9[r8];	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r5.append(r6);	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r5 = r5.toString();	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r3.<init>(r4, r5);	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        throw r3;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
    L_0x00f6:
        r3 = 3;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r3 = r9[r3];	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r3 = r3 & 255;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        if (r3 == r8) goto L_0x0113;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
    L_0x00fd:
        switch(r3) {
            case 3: goto L_0x0107;
            case 4: goto L_0x0101;
            default: goto L_0x0100;
        };	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
    L_0x0100:
        return;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
    L_0x0101:
        r3 = 18;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        fill(r4, r9, r3);	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        return;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
    L_0x0107:
        fill(r4, r9, r8);	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r3 = r9[r11];	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r3 = r3 & 255;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        r3 = r3 + r12;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        fill(r4, r9, r3);	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        return;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
    L_0x0113:
        r3 = 6;	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        fill(r4, r9, r3);	 Catch:{ RuntimeException -> 0x0127, Exception -> 0x0118 }
        return;
    L_0x0118:
        r0 = move-exception;
        r3 = r0;
        r18.close();	 Catch:{ Exception -> 0x011d }
    L_0x011d:
        r2 = new java.io.IOException;
        r3 = r3.getLocalizedMessage();
        r2.<init>(r3);
        throw r2;
    L_0x0127:
        r0 = move-exception;
        r2 = r0;
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.proxy.Socks5ProxySocketConnection.connect(java.net.Socket, java.lang.String, int, int):void");
    }
}
