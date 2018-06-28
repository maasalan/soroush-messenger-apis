package com.google.android.gms.internal;

import com.google.android.gms.common.util.C1783b;
import com.google.android.gms.common.util.C1791k;
import com.google.android.gms.common.util.C1792l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class dq {
    protected static <O, I> I m4746a(zzbfl<I, O> com_google_android_gms_internal_zzbfl_I__O, Object obj) {
        return com_google_android_gms_internal_zzbfl_I__O.f18491i != null ? com_google_android_gms_internal_zzbfl_I__O.f18491i.mo3041a(obj) : obj;
    }

    private static void m4747a(StringBuilder stringBuilder, zzbfl com_google_android_gms_internal_zzbfl, Object obj) {
        String dqVar;
        if (com_google_android_gms_internal_zzbfl.f18483a == 11) {
            dqVar = ((dq) com_google_android_gms_internal_zzbfl.f18489g.cast(obj)).toString();
        } else if (com_google_android_gms_internal_zzbfl.f18483a == 7) {
            stringBuilder.append("\"");
            stringBuilder.append(C1791k.m4530a((String) obj));
            dqVar = "\"";
        } else {
            stringBuilder.append(obj);
            return;
        }
        stringBuilder.append(dqVar);
    }

    private static void m4748a(StringBuilder stringBuilder, zzbfl com_google_android_gms_internal_zzbfl, ArrayList<Object> arrayList) {
        stringBuilder.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                stringBuilder.append(",");
            }
            Object obj = arrayList.get(i);
            if (obj != null) {
                m4747a(stringBuilder, com_google_android_gms_internal_zzbfl, obj);
            }
        }
        stringBuilder.append("]");
    }

    public abstract Map<String, zzbfl<?, ?>> mo3042a();

    protected final boolean m4750a(zzbfl com_google_android_gms_internal_zzbfl) {
        String str;
        if (com_google_android_gms_internal_zzbfl.f18485c != 11) {
            str = com_google_android_gms_internal_zzbfl.f18487e;
            return mo1672c();
        } else if (com_google_android_gms_internal_zzbfl.f18486d) {
            str = com_google_android_gms_internal_zzbfl.f18487e;
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        } else {
            str = com_google_android_gms_internal_zzbfl.f18487e;
            throw new UnsupportedOperationException("Concrete types not supported");
        }
    }

    protected abstract Object mo1671b();

    protected final Object m4752b(zzbfl com_google_android_gms_internal_zzbfl) {
        String str = com_google_android_gms_internal_zzbfl.f18487e;
        if (com_google_android_gms_internal_zzbfl.f18489g != null) {
            String str2 = com_google_android_gms_internal_zzbfl.f18487e;
            mo1671b();
            new Object[1][0] = com_google_android_gms_internal_zzbfl.f18487e;
            boolean z = com_google_android_gms_internal_zzbfl.f18486d;
            try {
                char toUpperCase = Character.toUpperCase(str.charAt(0));
                str = str.substring(1);
                StringBuilder stringBuilder = new StringBuilder(4 + String.valueOf(str).length());
                stringBuilder.append("get");
                stringBuilder.append(toUpperCase);
                stringBuilder.append(str);
                return getClass().getMethod(stringBuilder.toString(), new Class[0]).invoke(this, new Object[0]);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        String str3 = com_google_android_gms_internal_zzbfl.f18487e;
        return mo1671b();
    }

    protected abstract boolean mo1672c();

    public String toString() {
        Map a = mo3042a();
        StringBuilder stringBuilder = new StringBuilder(100);
        for (String str : a.keySet()) {
            String str2;
            zzbfl com_google_android_gms_internal_zzbfl = (zzbfl) a.get(str2);
            if (m4750a(com_google_android_gms_internal_zzbfl)) {
                Object a2 = m4746a(com_google_android_gms_internal_zzbfl, m4752b(com_google_android_gms_internal_zzbfl));
                stringBuilder.append(stringBuilder.length() == 0 ? "{" : ",");
                stringBuilder.append("\"");
                stringBuilder.append(str2);
                stringBuilder.append("\":");
                if (a2 == null) {
                    str2 = "null";
                } else {
                    switch (com_google_android_gms_internal_zzbfl.f18485c) {
                        case 8:
                            stringBuilder.append("\"");
                            str2 = C1783b.m4516a((byte[]) a2);
                            break;
                        case 9:
                            stringBuilder.append("\"");
                            str2 = C1783b.m4517b((byte[]) a2);
                            break;
                        case 10:
                            C1792l.m4531a(stringBuilder, (HashMap) a2);
                            continue;
                        default:
                            if (!com_google_android_gms_internal_zzbfl.f18484b) {
                                m4747a(stringBuilder, com_google_android_gms_internal_zzbfl, a2);
                                break;
                            }
                            m4748a(stringBuilder, com_google_android_gms_internal_zzbfl, (ArrayList) a2);
                            continue;
                    }
                    stringBuilder.append(str2);
                    str2 = "\"";
                }
                stringBuilder.append(str2);
            }
        }
        stringBuilder.append(stringBuilder.length() > 0 ? "}" : "{}");
        return stringBuilder.toString();
    }
}
