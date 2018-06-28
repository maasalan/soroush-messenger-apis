package org.jivesoftware.smackx.bytestreams.socks5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class Socks5Proxy {
    private static final Logger LOGGER = Logger.getLogger(Socks5Proxy.class.getName());
    private static boolean localSocks5ProxyEnabled = true;
    private static int localSocks5ProxyPort = -7777;
    private static Socks5Proxy socks5Server;
    private final List<String> allowedConnections = Collections.synchronizedList(new LinkedList());
    private final Map<String, Socket> connectionMap = new ConcurrentHashMap();
    private final Set<String> localAddresses = new LinkedHashSet(4);
    private Socks5ServerProcess serverProcess = new Socks5ServerProcess();
    private ServerSocket serverSocket;
    private Thread serverThread;

    private class Socks5ServerProcess implements Runnable {
        private Socks5ServerProcess() {
        }

        private void establishConnection(Socket socket) {
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            if (dataInputStream.read() != 5) {
                throw new SmackException("Only SOCKS5 supported");
            }
            int read = dataInputStream.read();
            byte[] bArr = new byte[read];
            dataInputStream.readFully(bArr);
            byte[] bArr2 = new byte[2];
            bArr2[0] = (byte) 5;
            for (int i = 0; i < read; i++) {
                if (bArr[i] == (byte) 0) {
                    read = 1;
                    break;
                }
            }
            read = (byte) 0;
            if (read == 0) {
                bArr2[1] = (byte) -1;
                dataOutputStream.write(bArr2);
                dataOutputStream.flush();
                throw new SmackException("Authentication method not supported");
            }
            bArr2[1] = (byte) 0;
            dataOutputStream.write(bArr2);
            dataOutputStream.flush();
            byte[] receiveSocks5Message = Socks5Utils.receiveSocks5Message(dataInputStream);
            String str = new String(receiveSocks5Message, 5, receiveSocks5Message[4], StringUtils.UTF8);
            if (Socks5Proxy.this.allowedConnections.contains(str)) {
                receiveSocks5Message[1] = (byte) 0;
                dataOutputStream.write(receiveSocks5Message);
                dataOutputStream.flush();
                Socks5Proxy.this.connectionMap.put(str, socket);
                return;
            }
            receiveSocks5Message[1] = (byte) 5;
            dataOutputStream.write(receiveSocks5Message);
            dataOutputStream.flush();
            throw new SmackException("Connection is not allowed");
        }

        public void run() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r2 = this;
        L_0x0000:
            r0 = 0;
            r1 = org.jivesoftware.smackx.bytestreams.socks5.Socks5Proxy.this;	 Catch:{ Exception -> 0x0031 }
            r1 = r1.serverSocket;	 Catch:{ Exception -> 0x0031 }
            if (r1 == 0) goto L_0x0030;	 Catch:{ Exception -> 0x0031 }
        L_0x0009:
            r1 = org.jivesoftware.smackx.bytestreams.socks5.Socks5Proxy.this;	 Catch:{ Exception -> 0x0031 }
            r1 = r1.serverSocket;	 Catch:{ Exception -> 0x0031 }
            r1 = r1.isClosed();	 Catch:{ Exception -> 0x0031 }
            if (r1 != 0) goto L_0x0030;	 Catch:{ Exception -> 0x0031 }
        L_0x0015:
            r1 = java.lang.Thread.currentThread();	 Catch:{ Exception -> 0x0031 }
            r1 = r1.isInterrupted();	 Catch:{ Exception -> 0x0031 }
            if (r1 == 0) goto L_0x0020;	 Catch:{ Exception -> 0x0031 }
        L_0x001f:
            return;	 Catch:{ Exception -> 0x0031 }
        L_0x0020:
            r1 = org.jivesoftware.smackx.bytestreams.socks5.Socks5Proxy.this;	 Catch:{ Exception -> 0x0031 }
            r1 = r1.serverSocket;	 Catch:{ Exception -> 0x0031 }
            r1 = r1.accept();	 Catch:{ Exception -> 0x0031 }
            r2.establishConnection(r1);	 Catch:{ Exception -> 0x002e }
            goto L_0x0000;
        L_0x002e:
            r0 = r1;
            goto L_0x0031;
        L_0x0030:
            return;
        L_0x0031:
            if (r0 == 0) goto L_0x0000;
        L_0x0033:
            r0.close();	 Catch:{ SocketException -> 0x0000 }
            goto L_0x0000;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.bytestreams.socks5.Socks5Proxy.Socks5ServerProcess.run():void");
        }
    }

    private Socks5Proxy() {
        try {
            Enumeration networkInterfaces = NetworkInterface.getNetworkInterfaces();
            Collection hashSet = new HashSet();
            Iterator it = Collections.list(networkInterfaces).iterator();
            while (it.hasNext()) {
                Iterator it2 = Collections.list(((NetworkInterface) it.next()).getInetAddresses()).iterator();
                while (it2.hasNext()) {
                    hashSet.add(((InetAddress) it2.next()).getHostAddress());
                }
            }
            if (hashSet.isEmpty()) {
                throw new IllegalStateException("Could not determine any local host address");
            }
            replaceLocalAddresses(hashSet);
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public static int getLocalSocks5ProxyPort() {
        return localSocks5ProxyPort;
    }

    public static synchronized Socks5Proxy getSocks5Proxy() {
        Socks5Proxy socks5Proxy;
        synchronized (Socks5Proxy.class) {
            if (socks5Server == null) {
                socks5Server = new Socks5Proxy();
            }
            if (isLocalSocks5ProxyEnabled()) {
                socks5Server.start();
            }
            socks5Proxy = socks5Server;
        }
        return socks5Proxy;
    }

    public static boolean isLocalSocks5ProxyEnabled() {
        return localSocks5ProxyEnabled;
    }

    public static void setLocalSocks5ProxyEnabled(boolean z) {
        localSocks5ProxyEnabled = z;
    }

    public static void setLocalSocks5ProxyPort(int i) {
        if (Math.abs(i) > InBandBytestreamManager.MAXIMUM_BLOCK_SIZE) {
            throw new IllegalArgumentException("localSocks5ProxyPort must be within (-65535,65535)");
        }
        localSocks5ProxyPort = i;
    }

    public final void addLocalAddress(String str) {
        if (str != null) {
            synchronized (this.localAddresses) {
                this.localAddresses.add(str);
            }
        }
    }

    protected final void addTransfer(String str) {
        this.allowedConnections.add(str);
    }

    public final List<String> getLocalAddresses() {
        List linkedList;
        synchronized (this.localAddresses) {
            linkedList = new LinkedList(this.localAddresses);
        }
        return linkedList;
    }

    public final int getPort() {
        return !isRunning() ? -1 : this.serverSocket.getLocalPort();
    }

    protected final Socket getSocket(String str) {
        return (Socket) this.connectionMap.get(str);
    }

    public final boolean isRunning() {
        return this.serverSocket != null;
    }

    public final boolean removeLocalAddress(String str) {
        boolean remove;
        synchronized (this.localAddresses) {
            remove = this.localAddresses.remove(str);
        }
        return remove;
    }

    protected final void removeTransfer(String str) {
        this.allowedConnections.remove(str);
        this.connectionMap.remove(str);
    }

    public final void replaceLocalAddresses(Collection<String> collection) {
        if (collection == null) {
            throw new IllegalArgumentException("list must not be null");
        }
        synchronized (this.localAddresses) {
            this.localAddresses.clear();
            this.localAddresses.addAll(collection);
        }
    }

    public final synchronized void start() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.isRunning();	 Catch:{ all -> 0x0066 }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r5);
        return;
    L_0x0009:
        r0 = getLocalSocks5ProxyPort();	 Catch:{ IOException -> 0x004a }
        if (r0 >= 0) goto L_0x002b;	 Catch:{ IOException -> 0x004a }
    L_0x000f:
        r0 = getLocalSocks5ProxyPort();	 Catch:{ IOException -> 0x004a }
        r0 = java.lang.Math.abs(r0);	 Catch:{ IOException -> 0x004a }
        r1 = 0;
    L_0x0018:
        r2 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r2 = r2 - r0;
        if (r1 >= r2) goto L_0x0036;
    L_0x001e:
        r2 = new java.net.ServerSocket;	 Catch:{ IOException -> 0x0028 }
        r3 = r0 + r1;	 Catch:{ IOException -> 0x0028 }
        r2.<init>(r3);	 Catch:{ IOException -> 0x0028 }
        r5.serverSocket = r2;	 Catch:{ IOException -> 0x0028 }
        goto L_0x0036;
    L_0x0028:
        r1 = r1 + 1;
        goto L_0x0018;
    L_0x002b:
        r0 = new java.net.ServerSocket;	 Catch:{ IOException -> 0x004a }
        r1 = getLocalSocks5ProxyPort();	 Catch:{ IOException -> 0x004a }
        r0.<init>(r1);	 Catch:{ IOException -> 0x004a }
        r5.serverSocket = r0;	 Catch:{ IOException -> 0x004a }
    L_0x0036:
        r0 = r5.serverSocket;	 Catch:{ IOException -> 0x004a }
        if (r0 == 0) goto L_0x0048;	 Catch:{ IOException -> 0x004a }
    L_0x003a:
        r0 = new java.lang.Thread;	 Catch:{ IOException -> 0x004a }
        r1 = r5.serverProcess;	 Catch:{ IOException -> 0x004a }
        r0.<init>(r1);	 Catch:{ IOException -> 0x004a }
        r5.serverThread = r0;	 Catch:{ IOException -> 0x004a }
        r0 = r5.serverThread;	 Catch:{ IOException -> 0x004a }
        r0.start();	 Catch:{ IOException -> 0x004a }
    L_0x0048:
        monitor-exit(r5);
        return;
    L_0x004a:
        r0 = move-exception;
        r1 = LOGGER;	 Catch:{ all -> 0x0066 }
        r2 = java.util.logging.Level.SEVERE;	 Catch:{ all -> 0x0066 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0066 }
        r4 = "couldn't setup local SOCKS5 proxy on port ";	 Catch:{ all -> 0x0066 }
        r3.<init>(r4);	 Catch:{ all -> 0x0066 }
        r4 = getLocalSocks5ProxyPort();	 Catch:{ all -> 0x0066 }
        r3.append(r4);	 Catch:{ all -> 0x0066 }
        r3 = r3.toString();	 Catch:{ all -> 0x0066 }
        r1.log(r2, r3, r0);	 Catch:{ all -> 0x0066 }
        monitor-exit(r5);
        return;
    L_0x0066:
        r0 = move-exception;
        monitor-exit(r5);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.bytestreams.socks5.Socks5Proxy.start():void");
    }

    public final synchronized void stop() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.isRunning();	 Catch:{ all -> 0x002b }
        if (r0 != 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);
        return;
    L_0x0009:
        r0 = r1.serverSocket;	 Catch:{ IOException -> 0x000e }
        r0.close();	 Catch:{ IOException -> 0x000e }
    L_0x000e:
        r0 = r1.serverThread;	 Catch:{ all -> 0x002b }
        if (r0 == 0) goto L_0x0024;	 Catch:{ all -> 0x002b }
    L_0x0012:
        r0 = r1.serverThread;	 Catch:{ all -> 0x002b }
        r0 = r0.isAlive();	 Catch:{ all -> 0x002b }
        if (r0 == 0) goto L_0x0024;
    L_0x001a:
        r0 = r1.serverThread;	 Catch:{ InterruptedException -> 0x0024 }
        r0.interrupt();	 Catch:{ InterruptedException -> 0x0024 }
        r0 = r1.serverThread;	 Catch:{ InterruptedException -> 0x0024 }
        r0.join();	 Catch:{ InterruptedException -> 0x0024 }
    L_0x0024:
        r0 = 0;
        r1.serverThread = r0;	 Catch:{ all -> 0x002b }
        r1.serverSocket = r0;	 Catch:{ all -> 0x002b }
        monitor-exit(r1);
        return;
    L_0x002b:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.bytestreams.socks5.Socks5Proxy.stop():void");
    }
}
