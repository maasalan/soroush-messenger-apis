package org.jivesoftware.smack.proxy;

public class Socks4ProxySocketConnection implements ProxySocketConnection {
    private final ProxyInfo proxy;

    Socks4ProxySocketConnection(ProxyInfo proxyInfo) {
        this.proxy = proxyInfo;
    }

    public void connect(java.net.Socket r10, java.lang.String r11, int r12, int r13) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r9 = this;
        r11 = r9.proxy;
        r11 = r11.getProxyAddress();
        r0 = r9.proxy;
        r0 = r0.getProxyPort();
        r1 = r9.proxy;
        r1 = r1.getProxyUsername();
        r2 = new java.net.InetSocketAddress;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r2.<init>(r11, r0);	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r10.connect(r2, r13);	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r13 = r10.getInputStream();	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r0 = r10.getOutputStream();	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r2 = 1;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r10.setTcpNoDelay(r2);	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r3 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r3 = new byte[r3];	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r4 = 4;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r5 = 0;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r3[r5] = r4;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r3[r2] = r2;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r6 = r12 >>> 8;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r6 = (byte) r6;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r7 = 2;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r3[r7] = r6;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r6 = 3;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r12 = r12 & 255;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r12 = (byte) r12;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r3[r6] = r12;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r11 = java.net.InetAddress.getByName(r11);	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r11 = r11.getAddress();	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r12 = r5;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
    L_0x0045:
        r6 = r11.length;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        if (r12 >= r6) goto L_0x0052;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
    L_0x0048:
        r6 = r4 + 1;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r8 = r11[r12];	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r3[r4] = r8;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r12 = r12 + 1;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r4 = r6;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        goto L_0x0045;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
    L_0x0052:
        if (r1 == 0) goto L_0x0066;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
    L_0x0054:
        r11 = "UTF-8";	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r11 = r1.getBytes(r11);	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r12 = r1.length();	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        java.lang.System.arraycopy(r11, r5, r3, r4, r12);	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r11 = r1.length();	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r4 = r4 + r11;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
    L_0x0066:
        r11 = r4 + 1;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r3[r4] = r5;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r0.write(r3, r5, r11);	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r11 = r5;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
    L_0x006e:
        r12 = 6;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        if (r11 >= r12) goto L_0x0084;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
    L_0x0071:
        r12 = r12 - r11;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r12 = r13.read(r3, r11, r12);	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        if (r12 > 0) goto L_0x0082;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
    L_0x0078:
        r11 = new org.jivesoftware.smack.proxy.ProxyException;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r12 = org.jivesoftware.smack.proxy.ProxyInfo.ProxyType.SOCKS4;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r13 = "stream is closed";	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r11.<init>(r12, r13);	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        throw r11;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
    L_0x0082:
        r11 = r11 + r12;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        goto L_0x006e;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
    L_0x0084:
        r11 = r3[r5];	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        if (r11 == 0) goto L_0x00a0;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
    L_0x0088:
        r11 = new org.jivesoftware.smack.proxy.ProxyException;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r12 = org.jivesoftware.smack.proxy.ProxyInfo.ProxyType.SOCKS4;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r13 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r0 = "server returns VN ";	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r13.<init>(r0);	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r0 = r3[r5];	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r13.append(r0);	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r13 = r13.toString();	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r11.<init>(r12, r13);	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        throw r11;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
    L_0x00a0:
        r11 = r3[r2];	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r12 = 90;
        if (r11 == r12) goto L_0x00c1;
    L_0x00a6:
        r10.close();	 Catch:{ Exception -> 0x00a9, RuntimeException -> 0x00d7 }
    L_0x00a9:
        r11 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r12 = "ProxySOCKS4: server returns CD ";	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r11.<init>(r12);	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r12 = r3[r2];	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r11.append(r12);	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r11 = r11.toString();	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r12 = new org.jivesoftware.smack.proxy.ProxyException;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r13 = org.jivesoftware.smack.proxy.ProxyInfo.ProxyType.SOCKS4;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r12.<init>(r13, r11);	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        throw r12;	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
    L_0x00c1:
        r11 = new byte[r7];	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        r13.read(r11, r5, r7);	 Catch:{ RuntimeException -> 0x00d7, Exception -> 0x00c7 }
        return;
    L_0x00c7:
        r11 = move-exception;
        r10.close();	 Catch:{ Exception -> 0x00cb }
    L_0x00cb:
        r10 = new org.jivesoftware.smack.proxy.ProxyException;
        r12 = org.jivesoftware.smack.proxy.ProxyInfo.ProxyType.SOCKS4;
        r11 = r11.toString();
        r10.<init>(r12, r11);
        throw r10;
    L_0x00d7:
        r10 = move-exception;
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.proxy.Socks4ProxySocketConnection.connect(java.net.Socket, java.lang.String, int, int):void");
    }
}
