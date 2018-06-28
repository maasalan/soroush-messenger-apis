package com.google.android.gms.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.ac;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import org.jivesoftware.smack.roster.Roster;

public class bp extends C5506v {
    private static bp f18094a;

    public bp(C1827x c1827x) {
        super(c1827x);
    }

    private static String m15989a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (!(obj instanceof Long)) {
            return obj instanceof Boolean ? String.valueOf(obj) : obj instanceof Throwable ? obj.getClass().getCanonicalName() : "-";
        } else {
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1))));
            stringBuilder.append("...");
            stringBuilder.append(str);
            stringBuilder.append(Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d));
            return stringBuilder.toString();
        }
    }

    public static bp m15990b() {
        return f18094a;
    }

    public final synchronized void mo3025a(int i, String str, Object obj, Object obj2, Object obj3) {
        bt btVar;
        bu buVar;
        long j;
        Editor edit;
        long j2;
        ac.m4376a((Object) str);
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        if (i >= 9) {
            i = 8;
        }
        char c = this.f6279f.f6286d.m4596a() ? 'C' : 'c';
        String str2 = "3";
        char charAt = "01VDIWEA?".charAt(i);
        String str3 = C1826w.f6280a;
        str = C1825u.m5138c(str, m15989a(obj), m15989a(obj2), m15989a(obj3));
        StringBuilder stringBuilder = new StringBuilder(((3 + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str).length());
        stringBuilder.append(str2);
        stringBuilder.append(charAt);
        stringBuilder.append(c);
        stringBuilder.append(str3);
        stringBuilder.append(":");
        stringBuilder.append(str);
        String stringBuilder2 = stringBuilder.toString();
        if (stringBuilder2.length() > Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE) {
            stringBuilder2 = stringBuilder2.substring(0, Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE);
        }
        C1827x c1827x = this.f6279f;
        if (c1827x.f6289g != null) {
            if (c1827x.f6289g.m12036j()) {
                btVar = c1827x.f6289g;
                if (btVar != null) {
                    buVar = btVar.f18099b;
                    if (buVar.m4629b() == 0) {
                        buVar.m4628a();
                    }
                    if (stringBuilder2 == null) {
                        stringBuilder2 = "";
                    }
                    synchronized (buVar) {
                        j = buVar.f5610b.f18098a.getLong(buVar.m4630c(), 0);
                        if (j > 0) {
                            edit = buVar.f5610b.f18098a.edit();
                            edit.putString(buVar.m4631d(), stringBuilder2);
                            edit.putLong(buVar.m4630c(), 1);
                            edit.apply();
                        }
                        j2 = j + 1;
                        if ((UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE) < Long.MAX_VALUE / j2) {
                            i2 = 1;
                        }
                        edit = buVar.f5610b.f18098a.edit();
                        if (i2 != 0) {
                            edit.putString(buVar.m4631d(), stringBuilder2);
                        }
                        edit.putLong(buVar.m4630c(), j2);
                        edit.apply();
                        return;
                    }
                }
            }
        }
        btVar = null;
        if (btVar != null) {
            buVar = btVar.f18099b;
            if (buVar.m4629b() == 0) {
                buVar.m4628a();
            }
            if (stringBuilder2 == null) {
                stringBuilder2 = "";
            }
            synchronized (buVar) {
                j = buVar.f5610b.f18098a.getLong(buVar.m4630c(), 0);
                if (j > 0) {
                    j2 = j + 1;
                    if ((UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE) < Long.MAX_VALUE / j2) {
                        i2 = 1;
                    }
                    edit = buVar.f5610b.f18098a.edit();
                    if (i2 != 0) {
                        edit.putString(buVar.m4631d(), stringBuilder2);
                    }
                    edit.putLong(buVar.m4630c(), j2);
                    edit.apply();
                    return;
                }
                edit = buVar.f5610b.f18098a.edit();
                edit.putString(buVar.m4631d(), stringBuilder2);
                edit.putLong(buVar.m4630c(), 1);
                edit.apply();
            }
        }
    }

    public final void m15992a(bk bkVar, String str) {
        Object bkVar2 = bkVar != null ? bkVar.toString() : "no hit data";
        String str2 = "Discarding hit. ";
        str = String.valueOf(str);
        m5151d(str.length() != 0 ? str2.concat(str) : new String(str2), bkVar2);
    }

    public final void m15993a(Map<String, String> map, String str) {
        Object stringBuilder;
        if (map != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            for (Entry entry : map.entrySet()) {
                if (stringBuilder2.length() > 0) {
                    stringBuilder2.append(',');
                }
                stringBuilder2.append((String) entry.getKey());
                stringBuilder2.append('=');
                stringBuilder2.append((String) entry.getValue());
            }
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = "no hit data";
        }
        String str2 = "Discarding hit. ";
        str = String.valueOf(str);
        m5151d(str.length() != 0 ? str2.concat(str) : new String(str2), stringBuilder);
    }

    protected final void c_() {
        synchronized (bp.class) {
            f18094a = this;
        }
    }
}
