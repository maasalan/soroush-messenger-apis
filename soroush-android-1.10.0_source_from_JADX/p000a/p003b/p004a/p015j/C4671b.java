package p000a.p003b.p004a.p015j;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000a.p003b.p004a.C0041d;
import p000a.p003b.p004a.C0063i.C6325a;
import p000a.p003b.p004a.p016k.C0074f;

public class C4671b extends C0064a {
    protected static final Logger f12856c = Logger.getLogger(C4671b.class.getName());
    static final /* synthetic */ boolean f12857d = true;

    private C0041d m8513b(C0041d c0041d, InetAddress inetAddress) {
        DatagramSocket datagramSocket;
        Throwable th;
        byte[] a = c0041d.m59a();
        DatagramPacket datagramPacket = new DatagramPacket(a, a.length, inetAddress, 53);
        byte[] bArr = new byte[this.a];
        try {
            datagramSocket = new DatagramSocket();
            try {
                datagramSocket.setSoTimeout(this.b);
                datagramSocket.send(datagramPacket);
                DatagramPacket datagramPacket2 = new DatagramPacket(bArr, bArr.length);
                datagramSocket.receive(datagramPacket2);
                C0041d c0041d2 = new C0041d(datagramPacket2.getData());
                if (c0041d2.f153a != c0041d.f153a) {
                    throw new C6325a(c0041d, c0041d2);
                }
                datagramSocket.close();
                return c0041d2;
            } catch (Throwable th2) {
                th = th2;
                if (datagramSocket != null) {
                    datagramSocket.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            datagramSocket = null;
            if (datagramSocket != null) {
                datagramSocket.close();
            }
            throw th;
        }
    }

    private C0041d m8514c(C0041d c0041d, InetAddress inetAddress) {
        Throwable th;
        Socket socket;
        try {
            socket = new Socket();
            try {
                socket.connect(new InetSocketAddress(inetAddress, 53), this.b);
                socket.setSoTimeout(this.b);
                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                byte[] a = c0041d.m59a();
                dataOutputStream.writeShort(a.length);
                dataOutputStream.write(a);
                dataOutputStream.flush();
                DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
                int readUnsignedShort = dataInputStream.readUnsignedShort();
                byte[] bArr = new byte[readUnsignedShort];
                for (int i = 0; i < readUnsignedShort; i += dataInputStream.read(bArr, i, readUnsignedShort - i)) {
                }
                C0041d c0041d2 = new C0041d(bArr);
                if (c0041d2.f153a != c0041d.f153a) {
                    throw new C6325a(c0041d, c0041d2);
                }
                socket.close();
                return c0041d2;
            } catch (Throwable th2) {
                th = th2;
                if (socket != null) {
                    socket.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            socket = null;
            if (socket != null) {
                socket.close();
            }
            throw th;
        }
    }

    public final C0041d mo19a(C0041d c0041d, InetAddress inetAddress) {
        C0041d b;
        List arrayList = new ArrayList(2);
        try {
            b = m8513b(c0041d, inetAddress);
        } catch (IOException e) {
            arrayList.add(e);
            b = null;
        }
        if (b != null && !b.f158f) {
            return b;
        }
        if (f12857d || b == null || b.f158f || arrayList.size() == 1) {
            Logger logger = f12856c;
            Level level = Level.FINE;
            String str = "Fallback to TCP because {0}";
            Object[] objArr = new Object[1];
            objArr[0] = b != null ? "response is truncated" : (Serializable) arrayList.get(0);
            logger.log(level, str, objArr);
            try {
                return m8514c(c0041d, inetAddress);
            } catch (IOException e2) {
                arrayList.add(e2);
                C0074f.m123a(arrayList);
                return b;
            }
        }
        throw new AssertionError();
    }
}
