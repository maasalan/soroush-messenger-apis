package p000a.p003b.p004a.p016k;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;

public final class C0073e {
    public static Inet4Address m120a(CharSequence charSequence) {
        try {
            InetAddress byName = InetAddress.getByName(charSequence.toString());
            if (byName instanceof Inet4Address) {
                return (Inet4Address) byName;
            }
            throw new IllegalArgumentException();
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Inet6Address m121b(CharSequence charSequence) {
        try {
            InetAddress byName = InetAddress.getByName(charSequence.toString());
            if (byName instanceof Inet6Address) {
                return (Inet6Address) byName;
            }
            throw new IllegalArgumentException();
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }
}
