package p000a.p003b.p004a.p009d;

import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.logging.Level;
import p000a.p003b.p004a.p016k.C0075g;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public class C6319c extends C4642a {
    public static final C0040d f17266b = new C6319c();

    protected C6319c() {
        super(C6319c.class.getSimpleName(), IjkMediaCodecInfo.RANK_MAX);
    }

    public final String[] mo2472c() {
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class});
            ArrayList arrayList = new ArrayList(5);
            String[] strArr = new String[]{"net.dns1", "net.dns2", "net.dns3", "net.dns4"};
            for (int i = 0; i < 4; i++) {
                String str = (String) method.invoke(null, new Object[]{strArr[i]});
                if (!(str == null || str.length() == 0 || arrayList.contains(str))) {
                    InetAddress byName = InetAddress.getByName(str);
                    if (byName != null) {
                        str = byName.getHostAddress();
                        if (!(str == null || str.length() == 0 || arrayList.contains(str))) {
                            arrayList.add(str);
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
        } catch (Throwable e) {
            a.log(Level.WARNING, "Exception in findDNSByReflection", e);
        }
        return null;
    }

    public final boolean mo2473d() {
        return C0075g.m124a();
    }
}
