package p000a.p003b.p004a;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000a.p003b.p004a.C0021a.C4626a;
import p000a.p003b.p004a.C0041d.C4642a;
import p000a.p003b.p004a.p009d.C0040d;
import p000a.p003b.p004a.p009d.C6318b;
import p000a.p003b.p004a.p009d.C6319c;
import p000a.p003b.p004a.p009d.C6320e;
import p000a.p003b.p004a.p016k.C0071c;
import p000a.p003b.p004a.p016k.C0073e;
import p000a.p003b.p004a.p016k.C0074f;

public class C4641c extends C0021a {
    static final List<C0040d> f12756h = new ArrayList();
    static final Set<Inet4Address> f12757i = new CopyOnWriteArraySet();
    static final Set<Inet6Address> f12758j = new CopyOnWriteArraySet();
    private final Set<InetAddress> f12759k = Collections.newSetFromMap(new ConcurrentHashMap(4));
    private boolean f12760l = false;
    private boolean f12761m = false;

    static /* synthetic */ class C00261 {
        static final /* synthetic */ int[] f91a = new int[C4626a.m18a().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = p000a.p003b.p004a.C0041d.C6319c.values();
            r0 = r0.length;
            r0 = new int[r0];
            f92b = r0;
            r0 = 1;
            r1 = f92b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = p000a.p003b.p004a.C0041d.C6319c.NO_ERROR;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = f92b;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = p000a.p003b.p004a.C0041d.C6319c.NX_DOMAIN;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = p000a.p003b.p004a.C0021a.C4626a.m18a();
            r2 = r2.length;
            r2 = new int[r2];
            f91a = r2;
            r2 = f91a;	 Catch:{ NoSuchFieldError -> 0x002f }
            r3 = p000a.p003b.p004a.C0021a.C4626a.f75c;	 Catch:{ NoSuchFieldError -> 0x002f }
            r3 = r3 - r0;	 Catch:{ NoSuchFieldError -> 0x002f }
            r2[r3] = r0;	 Catch:{ NoSuchFieldError -> 0x002f }
        L_0x002f:
            r2 = f91a;	 Catch:{ NoSuchFieldError -> 0x0036 }
            r3 = p000a.p003b.p004a.C0021a.C4626a.f76d;	 Catch:{ NoSuchFieldError -> 0x0036 }
            r3 = r3 - r0;	 Catch:{ NoSuchFieldError -> 0x0036 }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x0036 }
        L_0x0036:
            r1 = f91a;	 Catch:{ NoSuchFieldError -> 0x003e }
            r2 = p000a.p003b.p004a.C0021a.C4626a.f73a;	 Catch:{ NoSuchFieldError -> 0x003e }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x003e }
            r3 = 3;	 Catch:{ NoSuchFieldError -> 0x003e }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x003e }
        L_0x003e:
            r1 = f91a;	 Catch:{ NoSuchFieldError -> 0x0046 }
            r2 = p000a.p003b.p004a.C0021a.C4626a.f74b;	 Catch:{ NoSuchFieldError -> 0x0046 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0046 }
            r0 = 4;	 Catch:{ NoSuchFieldError -> 0x0046 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0046 }
        L_0x0046:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: a.b.a.c.1.<clinit>():void");
        }
    }

    static {
        C4641c.m8435a(C6318b.f17265b);
        C4641c.m8435a(C6319c.f17266b);
        C4641c.m8435a(C6320e.f17267b);
        try {
            f12757i.add(C0073e.m120a("8.8.8.8"));
        } catch (Throwable e) {
            b.log(Level.WARNING, "Could not add static IPv4 DNS Server", e);
        }
        try {
            f12758j.add(C0073e.m121b("[2001:4860:4860::8888]"));
        } catch (Throwable e2) {
            b.log(Level.WARNING, "Could not add static IPv6 DNS Server", e2);
        }
    }

    public C4641c(C0025b c0025b) {
        super(c0025b);
    }

    private static synchronized void m8435a(C0040d c0040d) {
        synchronized (C4641c.class) {
            if (c0040d.mo2473d()) {
                f12756h.add(c0040d);
                Collections.sort(f12756h);
                return;
            }
            Logger logger = b;
            StringBuilder stringBuilder = new StringBuilder("Not adding ");
            stringBuilder.append(c0040d.mo8a());
            stringBuilder.append(" as it is not available.");
            logger.fine(stringBuilder.toString());
        }
    }

    private static synchronized String[] m8436a() {
        String[] strArr;
        synchronized (C4641c.class) {
            strArr = null;
            for (C0040d c : f12756h) {
                strArr = c.mo2472c();
                if (strArr != null) {
                    break;
                }
            }
        }
        return strArr;
    }

    private InetAddress m8437b() {
        return (InetAddress) C0071c.m118a(f12757i, this.d);
    }

    private InetAddress m8438c() {
        return (InetAddress) C0071c.m118a(f12758j, this.d);
    }

    public final C0041d mo6a(C4642a c4642a) {
        C0041d b = mo7b(c4642a).m49b();
        C0041d a = this.e == null ? null : this.e.m38a(b);
        if (a != null) {
            return a;
        }
        InetAddress b2;
        InetAddress c;
        String[] a2 = C4641c.m8436a();
        int i = 0;
        List<InetAddress> arrayList = new ArrayList(a2.length + 2);
        for (String str : a2) {
            if (str != null) {
                if (!str.isEmpty()) {
                    arrayList.add(InetAddress.getByName(str));
                }
            }
            b.finest("findDns() returned null or empty string as dns server");
        }
        InetAddress[] inetAddressArr = new InetAddress[2];
        switch (C00261.f91a[g - 1]) {
            case 1:
                b2 = m8437b();
                c = m8438c();
                break;
            case 2:
                b2 = m8438c();
                c = m8437b();
                break;
            case 3:
                b2 = m8437b();
                break;
            case 4:
                b2 = m8438c();
                break;
            default:
                b2 = null;
                c = b2;
                break;
        }
        c = null;
        inetAddressArr[0] = b2;
        inetAddressArr[1] = c;
        while (i < 2) {
            Object obj = inetAddressArr[i];
            if (obj != null) {
                arrayList.add(obj);
            }
            i++;
        }
        List arrayList2 = new ArrayList(arrayList.size());
        for (InetAddress inetAddress : arrayList) {
            Logger logger;
            StringBuilder stringBuilder;
            if (this.f12759k.contains(inetAddress)) {
                logger = b;
                stringBuilder = new StringBuilder("Skipping ");
                stringBuilder.append(inetAddress);
                stringBuilder.append(" because it was marked as \"recursion not available\"");
                logger.finer(stringBuilder.toString());
            } else {
                try {
                    C0041d a3 = super.m26a(b, inetAddress);
                    if (a3 != null) {
                        String stringBuilder2;
                        if (a3.f160h) {
                            if (!this.f12761m) {
                                switch (a3.f155c) {
                                    case NO_ERROR:
                                    case NX_DOMAIN:
                                        return a3;
                                    default:
                                        stringBuilder = new StringBuilder("Response from ");
                                        stringBuilder.append(inetAddress);
                                        stringBuilder.append(" asked for ");
                                        stringBuilder.append(b.m60b());
                                        stringBuilder.append(" with error code: ");
                                        stringBuilder.append(a3.f155c);
                                        stringBuilder.append('.');
                                        stringBuilder2 = stringBuilder.toString();
                                        if (!b.isLoggable(Level.FINE)) {
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append(stringBuilder2);
                                            stringBuilder.append("\n");
                                            stringBuilder.append(a3);
                                            stringBuilder2 = stringBuilder.toString();
                                        }
                                        logger = b;
                                        break;
                                }
                            }
                            return a3;
                        } else if (this.f12759k.add(inetAddress)) {
                            logger = b;
                            stringBuilder = new StringBuilder("The DNS server ");
                            stringBuilder.append(inetAddress);
                            stringBuilder.append(" returned a response without the \"recursion available\" (RA) flag set. This likely indicates a misconfiguration because the server is not suitable for DNS resolution");
                            stringBuilder2 = stringBuilder.toString();
                        }
                        logger.warning(stringBuilder2);
                    }
                } catch (IOException e) {
                    arrayList2.add(e);
                }
            }
        }
        C0074f.m123a(arrayList2);
        return null;
    }

    public C4642a mo7b(C4642a c4642a) {
        c4642a.f111g = true;
        c4642a.m48a().m94a(this.f.m109a()).f228d = this.f12760l;
        return c4642a;
    }
}
