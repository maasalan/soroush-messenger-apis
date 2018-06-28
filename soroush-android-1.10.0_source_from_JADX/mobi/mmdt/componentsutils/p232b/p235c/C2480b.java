package mobi.mmdt.componentsutils.p232b.p235c;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import javax.net.ssl.SSLException;
import org.jivesoftware.smack.tcp.XMPPTCPConnection.PacketWriter;
import p000a.p001a.p002a.C0005c;

public final class C2480b {
    public static final boolean f8158a = C2478a.m6728a();
    public static final boolean f8159b;

    public enum C2479a {
        ;
        
        public static final int f8154a = 1;
        public static final int f8155b = 2;
        public static final int f8156c = 3;

        static {
            f8157d = new int[]{f8154a, f8155b, f8156c};
        }

        public static int[] m6730a() {
            return (int[]) f8157d.clone();
        }
    }

    static {
        boolean z;
        String b = C2478a.m6729b();
        if (b != null) {
            if (!b.equals("debug")) {
                if (!b.equals("release")) {
                    b.equals("debug_version");
                }
            }
            z = false;
            f8159b = z;
        }
        z = true;
        f8159b = z;
    }

    private static synchronized void m6731a() {
        synchronized (C2480b.class) {
        }
    }

    public static void m6732a(String str) {
        int length = str.length() / PacketWriter.QUEUE_SIZE;
        for (int i = 0; i < length; i++) {
            if (f8158a) {
                Log.e("MyApp", str.substring(i * PacketWriter.QUEUE_SIZE, (i + 1) * PacketWriter.QUEUE_SIZE));
                C2480b.m6731a();
            }
        }
        if (str.length() % PacketWriter.QUEUE_SIZE != 0 && f8158a) {
            Log.e("MyApp", str.substring(PacketWriter.QUEUE_SIZE * length));
            C2480b.m6731a();
        }
    }

    public static void m6733a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder("EVENT : ");
        stringBuilder.append(str2);
        C2480b.m6742f(stringBuilder.toString());
        C2480b.m6731a();
        C2480b.m6742f("ReportPartyJob reportParty");
        C0005c.m0a().m9d(new C2481c(str, C2479a.f8156c, str2));
    }

    public static void m6734a(String str, Throwable th) {
        int length = str.length() / PacketWriter.QUEUE_SIZE;
        for (int i = 0; i < length; i++) {
            if (f8158a) {
                Log.wtf("MyApp", str.substring(i * PacketWriter.QUEUE_SIZE, (i + 1) * PacketWriter.QUEUE_SIZE), th);
                th.getMessage();
                C2480b.m6731a();
            }
        }
        if (str.length() % PacketWriter.QUEUE_SIZE != 0 && f8158a) {
            Log.wtf("MyApp", str.substring(PacketWriter.QUEUE_SIZE * length), th);
            th.getMessage();
            C2480b.m6731a();
        }
        Writer stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        if (!(th instanceof SocketTimeoutException) && !(th instanceof ConnectException) && !(th instanceof SSLException) && !(th instanceof SocketException)) {
            C0005c.m0a().m9d(new C2481c(th.getMessage(), C2479a.f8154a, stringWriter.toString()));
        }
    }

    public static void m6735a(Throwable th) {
        if (f8158a) {
            Log.wtf("MyApp", th);
            th.getMessage();
            C2480b.m6731a();
        }
        Writer stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        if (!(th instanceof SocketTimeoutException) && !(th instanceof ConnectException) && !(th instanceof SSLException) && !(th instanceof SocketException)) {
            C0005c.m0a().m9d(new C2481c(th.getMessage(), C2479a.f8154a, stringWriter.toString()));
        }
    }

    public static void m6736b(String str) {
        int length = str.length() / PacketWriter.QUEUE_SIZE;
        for (int i = 0; i < length; i++) {
            if (f8158a) {
                Log.d("MyApp", str.substring(i * PacketWriter.QUEUE_SIZE, (i + 1) * PacketWriter.QUEUE_SIZE));
                C2480b.m6731a();
            }
        }
        if (str.length() % PacketWriter.QUEUE_SIZE != 0 && f8158a) {
            Log.d("MyApp", str.substring(PacketWriter.QUEUE_SIZE * length));
            C2480b.m6731a();
        }
    }

    public static void m6737b(String str, Throwable th) {
        int length = str.length() / PacketWriter.QUEUE_SIZE;
        for (int i = 0; i < length; i++) {
            if (f8158a) {
                Log.e("MyApp", str.substring(i * PacketWriter.QUEUE_SIZE, (i + 1) * PacketWriter.QUEUE_SIZE), th);
                th.getMessage();
                C2480b.m6731a();
            }
        }
        if (str.length() % PacketWriter.QUEUE_SIZE != 0 && f8158a) {
            Log.e("MyApp", str.substring(PacketWriter.QUEUE_SIZE * length), th);
            th.getMessage();
            C2480b.m6731a();
        }
    }

    public static void m6738b(Throwable th) {
        if (f8158a) {
            Log.e("MyApp", "Some Exception", th);
        }
    }

    public static void m6739c(String str) {
        int length = str.length() / PacketWriter.QUEUE_SIZE;
        for (int i = 0; i < length; i++) {
            if (f8158a) {
                Log.i("MyApp", str.substring(i * PacketWriter.QUEUE_SIZE, (i + 1) * PacketWriter.QUEUE_SIZE));
                C2480b.m6731a();
            }
        }
        if (str.length() % PacketWriter.QUEUE_SIZE != 0 && f8158a) {
            Log.i("MyApp", str.substring(PacketWriter.QUEUE_SIZE * length));
            C2480b.m6731a();
        }
    }

    public static void m6740d(String str) {
        int length = str.length() / PacketWriter.QUEUE_SIZE;
        for (int i = 0; i < length; i++) {
            if (f8158a) {
                Log.i("MyApp", str.substring(i * PacketWriter.QUEUE_SIZE, (i + 1) * PacketWriter.QUEUE_SIZE));
                C2480b.m6731a();
            }
        }
        if (str.length() % PacketWriter.QUEUE_SIZE != 0 && f8158a) {
            Log.i("MyApp", str.substring(PacketWriter.QUEUE_SIZE * length));
            C2480b.m6731a();
        }
    }

    public static void m6741e(String str) {
        int length = str.length() / PacketWriter.QUEUE_SIZE;
        for (int i = 0; i < length; i++) {
            if (f8158a) {
                Log.v("MyApp", str.substring(i * PacketWriter.QUEUE_SIZE, (i + 1) * PacketWriter.QUEUE_SIZE));
                C2480b.m6731a();
            }
        }
        if (str.length() % PacketWriter.QUEUE_SIZE != 0 && f8158a) {
            Log.v("MyApp", str.substring(PacketWriter.QUEUE_SIZE * length));
            C2480b.m6731a();
        }
    }

    public static void m6742f(String str) {
        if (f8158a) {
            int length = str.length() / PacketWriter.QUEUE_SIZE;
            int i = 0;
            while (i < length) {
                StringBuilder stringBuilder = new StringBuilder("***** ");
                int i2 = i * PacketWriter.QUEUE_SIZE;
                i++;
                stringBuilder.append(str.substring(i2, i * PacketWriter.QUEUE_SIZE));
                Log.d("MyApp", stringBuilder.toString());
                C2480b.m6731a();
            }
            if (str.length() % PacketWriter.QUEUE_SIZE != 0) {
                StringBuilder stringBuilder2 = new StringBuilder("*****  ");
                stringBuilder2.append(str.substring(PacketWriter.QUEUE_SIZE * length));
                Log.d("MyApp", stringBuilder2.toString());
                C2480b.m6731a();
            }
        }
    }
}
