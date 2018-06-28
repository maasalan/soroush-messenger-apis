package com.google.android.gms.analytics;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.analytics.p159a.C1657a;
import com.google.android.gms.analytics.p159a.C1658b;
import com.google.android.gms.analytics.p159a.C1659c;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.internal.C1825u;
import com.google.android.gms.internal.C1826w;
import com.google.android.gms.internal.C1827x;
import com.google.android.gms.internal.C5492a;
import com.google.android.gms.internal.C5493b;
import com.google.android.gms.internal.C5494c;
import com.google.android.gms.internal.C5495d;
import com.google.android.gms.internal.C5496e;
import com.google.android.gms.internal.C5497f;
import com.google.android.gms.internal.C5498g;
import com.google.android.gms.internal.C5500h;
import com.google.android.gms.internal.C5501i;
import com.google.android.gms.internal.C5502j;
import com.google.android.gms.internal.C5503k;
import com.google.android.gms.internal.C5504l;
import com.google.android.gms.internal.C5505m;
import com.google.android.gms.internal.aa;
import com.google.android.gms.internal.bk;
import com.google.android.gms.internal.ce;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;

public final class C5437j extends C1825u implements C1680u {
    private static DecimalFormat f15091a;
    private final C1827x f15092b;
    private final String f15093c;
    private final Uri f15094d;

    public C5437j(C1827x c1827x, String str) {
        this(c1827x, str, (byte) 0);
    }

    private C5437j(C1827x c1827x, String str, byte b) {
        super(c1827x);
        ac.m4378a(str);
        this.f15092b = c1827x;
        this.f15093c = str;
        this.f15094d = C5437j.m11726a(this.f15093c);
    }

    static Uri m11726a(String str) {
        ac.m4378a(str);
        Builder builder = new Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(str);
        return builder.build();
    }

    private static String m11727a(double d) {
        if (f15091a == null) {
            f15091a = new DecimalFormat("0.######");
        }
        return f15091a.format(d);
    }

    private static void m11728a(Map<String, String> map, String str, double d) {
        if (d != 0.0d) {
            map.put(str, C5437j.m11727a(d));
        }
    }

    private static void m11729a(Map<String, String> map, String str, int i, int i2) {
        if (i > 0 && i2 > 0) {
            StringBuilder stringBuilder = new StringBuilder(23);
            stringBuilder.append(i);
            stringBuilder.append("x");
            stringBuilder.append(i2);
            map.put(str, stringBuilder.toString());
        }
    }

    private static void m11730a(Map<String, String> map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    private static void m11731a(Map<String, String> map, String str, boolean z) {
        if (z) {
            map.put(str, "1");
        }
    }

    private static Map<String, String> m11732b(C1671o c1671o) {
        CharSequence a;
        Map hashMap = new HashMap();
        C5496e c5496e = (C5496e) c1671o.m4261a(C5496e.class);
        if (c5496e != null) {
            for (Entry entry : Collections.unmodifiableMap(c5496e.f15220a).entrySet()) {
                Boolean value = entry.getValue();
                Object obj = null;
                if (value != null) {
                    if (value instanceof String) {
                        String str = (String) value;
                        if (!TextUtils.isEmpty(str)) {
                            obj = str;
                        }
                    } else if (value instanceof Double) {
                        Double d = (Double) value;
                        if (d.doubleValue() != 0.0d) {
                            obj = C5437j.m11727a(d.doubleValue());
                        }
                    } else if (!(value instanceof Boolean)) {
                        obj = String.valueOf(value);
                    } else if (value != Boolean.FALSE) {
                        obj = "1";
                    }
                }
                if (obj != null) {
                    hashMap.put((String) entry.getKey(), obj);
                }
            }
        }
        C5502j c5502j = (C5502j) c1671o.m4261a(C5502j.class);
        if (c5502j != null) {
            C5437j.m11730a(hashMap, "t", c5502j.f15255a);
            C5437j.m11730a(hashMap, "cid", c5502j.f15256b);
            C5437j.m11730a(hashMap, "uid", c5502j.f15257c);
            C5437j.m11730a(hashMap, "sc", c5502j.f15260f);
            C5437j.m11728a(hashMap, "sf", c5502j.f15262h);
            C5437j.m11731a(hashMap, "ni", c5502j.f15261g);
            C5437j.m11730a(hashMap, "adid", c5502j.f15258d);
            C5437j.m11731a(hashMap, "ate", c5502j.f15259e);
        }
        C5503k c5503k = (C5503k) c1671o.m4261a(C5503k.class);
        if (c5503k != null) {
            C5437j.m11730a(hashMap, "cd", c5503k.f15266a);
            C5437j.m11728a(hashMap, "a", (double) c5503k.f15267b);
            C5437j.m11730a(hashMap, "dr", c5503k.f15268c);
        }
        C5500h c5500h = (C5500h) c1671o.m4261a(C5500h.class);
        if (c5500h != null) {
            C5437j.m11730a(hashMap, "ec", c5500h.f15242a);
            C5437j.m11730a(hashMap, "ea", c5500h.f15243b);
            C5437j.m11730a(hashMap, "el", c5500h.f15244c);
            C5437j.m11728a(hashMap, "ev", (double) c5500h.f15245d);
        }
        C5493b c5493b = (C5493b) c1671o.m4261a(C5493b.class);
        if (c5493b != null) {
            C5437j.m11730a(hashMap, "cn", c5493b.f15182a);
            C5437j.m11730a(hashMap, "cs", c5493b.f15183b);
            C5437j.m11730a(hashMap, "cm", c5493b.f15184c);
            C5437j.m11730a(hashMap, "ck", c5493b.f15185d);
            C5437j.m11730a(hashMap, "cc", c5493b.f15186e);
            C5437j.m11730a(hashMap, "ci", c5493b.f15187f);
            C5437j.m11730a(hashMap, "anid", c5493b.f15188g);
            C5437j.m11730a(hashMap, "gclid", c5493b.f15189h);
            C5437j.m11730a(hashMap, "dclid", c5493b.f15190i);
            C5437j.m11730a(hashMap, "aclid", c5493b.f15191j);
        }
        C5501i c5501i = (C5501i) c1671o.m4261a(C5501i.class);
        if (c5501i != null) {
            C5437j.m11730a(hashMap, "exd", c5501i.f15247a);
            C5437j.m11731a(hashMap, "exf", c5501i.f15248b);
        }
        C5504l c5504l = (C5504l) c1671o.m4261a(C5504l.class);
        if (c5504l != null) {
            C5437j.m11730a(hashMap, "sn", c5504l.f15276a);
            C5437j.m11730a(hashMap, "sa", c5504l.f15277b);
            C5437j.m11730a(hashMap, "st", c5504l.f15278c);
        }
        C5505m c5505m = (C5505m) c1671o.m4261a(C5505m.class);
        if (c5505m != null) {
            C5437j.m11730a(hashMap, "utv", c5505m.f15281a);
            C5437j.m11728a(hashMap, "utt", (double) c5505m.f15282b);
            C5437j.m11730a(hashMap, "utc", c5505m.f15283c);
            C5437j.m11730a(hashMap, "utl", c5505m.f15284d);
        }
        C5494c c5494c = (C5494c) c1671o.m4261a(C5494c.class);
        if (c5494c != null) {
            for (Entry entry2 : Collections.unmodifiableMap(c5494c.f15204a).entrySet()) {
                a = C1669l.m4258a("cd", ((Integer) entry2.getKey()).intValue());
                if (!TextUtils.isEmpty(a)) {
                    hashMap.put(a, (String) entry2.getValue());
                }
            }
        }
        C5495d c5495d = (C5495d) c1671o.m4261a(C5495d.class);
        if (c5495d != null) {
            for (Entry entry22 : Collections.unmodifiableMap(c5495d.f15219a).entrySet()) {
                a = C1669l.m4258a("cm", ((Integer) entry22.getKey()).intValue());
                if (!TextUtils.isEmpty(a)) {
                    hashMap.put(a, C5437j.m11727a(((Double) entry22.getValue()).doubleValue()));
                }
            }
        }
        C5498g c5498g = (C5498g) c1671o.m4261a(C5498g.class);
        if (c5498g != null) {
            String str2;
            C1658b c1658b = c5498g.f15234d;
            if (c1658b != null) {
                for (Entry entry3 : c1658b.m4249a().entrySet()) {
                    Object substring;
                    if (((String) entry3.getKey()).startsWith("&")) {
                        substring = ((String) entry3.getKey()).substring(1);
                    } else {
                        str2 = (String) entry3.getKey();
                    }
                    hashMap.put(substring, (String) entry3.getValue());
                }
            }
            int i = 1;
            for (C1659c a2 : Collections.unmodifiableList(c5498g.f15232b)) {
                hashMap.putAll(a2.m4250a(C1669l.m4258a("promo", i)));
                i++;
            }
            i = 1;
            for (C1657a a3 : Collections.unmodifiableList(c5498g.f15231a)) {
                hashMap.putAll(a3.m4248a(C1669l.m4258a("pr", i)));
                i++;
            }
            int i2 = 1;
            for (Entry entry32 : c5498g.f15233c.entrySet()) {
                List<C1657a> list = (List) entry32.getValue();
                String a4 = C1669l.m4258a("il", i2);
                int i3 = 1;
                for (C1657a c1657a : list) {
                    String valueOf = String.valueOf(a4);
                    String valueOf2 = String.valueOf(C1669l.m4258a("pi", i3));
                    hashMap.putAll(c1657a.m4248a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)));
                    i3++;
                }
                if (!TextUtils.isEmpty((CharSequence) entry32.getKey())) {
                    str2 = String.valueOf(a4);
                    a4 = String.valueOf("nm");
                    hashMap.put(a4.length() != 0 ? str2.concat(a4) : new String(str2), (String) entry32.getKey());
                }
                i2++;
            }
        }
        C5497f c5497f = (C5497f) c1671o.m4261a(C5497f.class);
        if (c5497f != null) {
            C5437j.m11730a(hashMap, XHTMLText.UL, c5497f.f15225a);
            C5437j.m11728a(hashMap, "sd", (double) c5497f.f15226b);
            C5437j.m11729a(hashMap, "sr", c5497f.f15227c, c5497f.f15228d);
            C5437j.m11729a(hashMap, "vp", c5497f.f15229e, c5497f.f15230f);
        }
        C5492a c5492a = (C5492a) c1671o.m4261a(C5492a.class);
        if (c5492a != null) {
            C5437j.m11730a(hashMap, "an", c5492a.f15172a);
            C5437j.m11730a(hashMap, "aid", c5492a.f15174c);
            C5437j.m11730a(hashMap, "aiid", c5492a.f15175d);
            C5437j.m11730a(hashMap, "av", c5492a.f15173b);
        }
        return hashMap;
    }

    public final Uri mo1537a() {
        return this.f15094d;
    }

    public final void mo1538a(C1671o c1671o) {
        ac.m4376a((Object) c1671o);
        ac.m4386b(c1671o.f5149c, "Can't deliver not submitted measurement");
        ac.m4387c("deliver should be called on worker thread");
        C1671o a = c1671o.m4260a();
        C5502j c5502j = (C5502j) a.m4263b(C5502j.class);
        if (TextUtils.isEmpty(c5502j.f15255a)) {
            this.f6279f.m5160a().m15993a(C5437j.m11732b(a), "Ignoring measurement without type");
        } else if (TextUtils.isEmpty(c5502j.f15256b)) {
            this.f6279f.m5160a().m15993a(C5437j.m11732b(a), "Ignoring measurement without client id");
        } else if (!this.f15092b.m5163d().f17937e) {
            double d = c5502j.f15262h;
            if (ce.m4650a(d, c5502j.f15256b)) {
                m5144b("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(d));
                return;
            }
            Map b = C5437j.m11732b(a);
            b.put("v", "1");
            b.put("_v", C1826w.f6281b);
            b.put("tid", this.f15093c);
            if (this.f15092b.m5163d().f17936d) {
                StringBuilder stringBuilder = new StringBuilder();
                for (Entry entry : b.entrySet()) {
                    if (stringBuilder.length() != 0) {
                        stringBuilder.append(", ");
                    }
                    stringBuilder.append((String) entry.getKey());
                    stringBuilder.append("=");
                    stringBuilder.append((String) entry.getValue());
                }
                m5148c("Dry run is enabled. GoogleAnalytics would have sent", stringBuilder.toString());
                return;
            }
            Map hashMap = new HashMap();
            ce.m4647a(hashMap, "uid", c5502j.f15257c);
            C5492a c5492a = (C5492a) c1671o.m4261a(C5492a.class);
            if (c5492a != null) {
                ce.m4647a(hashMap, "an", c5492a.f15172a);
                ce.m4647a(hashMap, "aid", c5492a.f15174c);
                ce.m4647a(hashMap, "av", c5492a.f15173b);
                ce.m4647a(hashMap, "aiid", c5492a.f15175d);
            }
            b.put("_s", String.valueOf(this.f6279f.m5162c().m16765a(new aa(c5502j.f15256b, this.f15093c, TextUtils.isEmpty(c5502j.f15258d) ^ 1, 0, hashMap))));
            this.f6279f.m5162c().m16767a(new bk(this.f6279f.m5160a(), b, c1671o.f5150d, true));
        }
    }
}
