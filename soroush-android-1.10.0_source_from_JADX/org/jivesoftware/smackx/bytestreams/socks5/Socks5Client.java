package org.jivesoftware.smackx.bytestreams.socks5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smackx.bytestreams.socks5.packet.Bytestream.StreamHost;

class Socks5Client {
    private static final Logger LOGGER = Logger.getLogger(Socks5Client.class.getName());
    protected String digest;
    protected StreamHost streamHost;

    class C77771 implements Callable<Socket> {
        C77771() {
        }

        public Socket call() {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress(Socks5Client.this.streamHost.getAddress(), Socks5Client.this.streamHost.getPort()));
            try {
                Socks5Client.this.establish(socket);
                return socket;
            } catch (SmackException e) {
                if (!socket.isClosed()) {
                    try {
                        socket.close();
                    } catch (Throwable e2) {
                        Socks5Client.LOGGER.log(Level.WARNING, "Could not close SOCKS5 socket", e2);
                    }
                }
                throw e;
            }
        }
    }

    public Socks5Client(StreamHost streamHost, String str) {
        this.streamHost = streamHost;
        this.digest = str;
    }

    private byte[] createSocks5ConnectRequest() {
        try {
            Object bytes = this.digest.getBytes(StringUtils.UTF8);
            Object obj = new byte[(7 + bytes.length)];
            obj[0] = 5;
            obj[1] = 1;
            obj[2] = null;
            obj[3] = 3;
            obj[4] = (byte) bytes.length;
            System.arraycopy(bytes, 0, obj, 5, bytes.length);
            obj[obj.length - 2] = null;
            obj[obj.length - 1] = null;
            return obj;
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    protected void establish(Socket socket) {
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        dataOutputStream.write(new byte[]{(byte) 5, (byte) 1, (byte) 0});
        dataOutputStream.flush();
        byte[] bArr = new byte[2];
        dataInputStream.readFully(bArr);
        if (bArr[0] == (byte) 5) {
            if (bArr[1] == (byte) 0) {
                bArr = createSocks5ConnectRequest();
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                byte[] receiveSocks5Message = Socks5Utils.receiveSocks5Message(dataInputStream);
                bArr[1] = (byte) 0;
                if (!Arrays.equals(bArr, receiveSocks5Message)) {
                    StringBuilder stringBuilder = new StringBuilder("Connection request does not equal connection reponse. Response: ");
                    stringBuilder.append(Arrays.toString(receiveSocks5Message));
                    stringBuilder.append(". Request: ");
                    stringBuilder.append(Arrays.toString(bArr));
                    throw new SmackException(stringBuilder.toString());
                }
                return;
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder("Remote SOCKS5 server responsed with unexpected version: ");
        stringBuilder2.append(bArr[0]);
        stringBuilder2.append(' ');
        stringBuilder2.append(bArr[1]);
        stringBuilder2.append(". Should be 0x05 0x00.");
        throw new SmackException(stringBuilder2.toString());
    }

    public Socket getSocket(int i) {
        Object futureTask = new FutureTask(new C77771());
        new Thread(futureTask).start();
        try {
            return (Socket) futureTask.get((long) i, TimeUnit.MILLISECONDS);
        } catch (Throwable e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                } else if (cause instanceof SmackException) {
                    throw ((SmackException) cause);
                }
            }
            throw new SmackException("Error while connecting to SOCKS5 proxy", e);
        }
    }
}
