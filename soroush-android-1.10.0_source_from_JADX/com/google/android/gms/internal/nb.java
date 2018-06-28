package com.google.android.gms.internal;

import android.util.Log;
import java.util.AbstractMap.SimpleEntry;
import java.util.Locale;

final class nb extends nc {
    private nt f15300a;

    nb(nt ntVar) {
        this.f15300a = ntVar;
    }

    private static boolean m12023a(nt ntVar) {
        if (ntVar.f18386d.length > 0) {
            return true;
        }
        for (nt ntVar2 : ntVar.f18387e) {
            if (ntVar2.f18386d.length > 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean m12024a(nt ntVar, int i) {
        if (ntVar == null) {
            Log.w("FirebasePerformance", "TraceMetric is null");
            return false;
        } else if (i > 1) {
            Log.w("FirebasePerformance", "Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        } else {
            boolean z;
            String str;
            String str2;
            String valueOf;
            StringBuilder stringBuilder;
            String str3 = ntVar.f18383a;
            if (str3 != null) {
                str3 = str3.trim();
                if (!str3.isEmpty() && str3.length() <= 100) {
                    z = true;
                    if (z) {
                        str = "FirebasePerformance";
                        str2 = "invalid TraceId:";
                        valueOf = String.valueOf(ntVar.f18383a);
                        Log.w(str, valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2));
                        return false;
                    }
                    z = ntVar == null && ntVar.f18385c != null && ntVar.f18385c.longValue() > 0;
                    if (z) {
                        valueOf = String.valueOf(ntVar.f18385c);
                        stringBuilder = new StringBuilder(22 + String.valueOf(valueOf).length());
                        stringBuilder.append("invalid TraceDuration:");
                        stringBuilder.append(valueOf);
                        Log.w("FirebasePerformance", stringBuilder.toString());
                        return false;
                    }
                    for (nt a : ntVar.f18387e) {
                        if (!m12024a(a, i + 1)) {
                            return false;
                        }
                    }
                    return ntVar.f18388f != null || m12025a(ntVar.f18388f);
                }
            }
            z = false;
            if (z) {
                if (ntVar == null) {
                }
                if (z) {
                    while (r4 < r3) {
                        if (!m12024a(a, i + 1)) {
                            return false;
                        }
                    }
                    if (ntVar.f18388f != null) {
                    }
                }
                valueOf = String.valueOf(ntVar.f18385c);
                stringBuilder = new StringBuilder(22 + String.valueOf(valueOf).length());
                stringBuilder.append("invalid TraceDuration:");
                stringBuilder.append(valueOf);
                Log.w("FirebasePerformance", stringBuilder.toString());
                return false;
            }
            str = "FirebasePerformance";
            str2 = "invalid TraceId:";
            valueOf = String.valueOf(ntVar.f18383a);
            if (valueOf.length() == 0) {
            }
            Log.w(str, valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2));
            return false;
        }
    }

    private static boolean m12025a(nv[] nvVarArr) {
        for (nv nvVar : nvVarArr) {
            String str;
            SimpleEntry simpleEntry = new SimpleEntry(nvVar.f18394a, nvVar.f18395b);
            String str2 = (String) simpleEntry.getKey();
            String str3 = (String) simpleEntry.getValue();
            if (str2 == null) {
                str = "Attribute key must not be null";
            } else if (str3 == null) {
                str = "Attribute value must not be null";
            } else {
                Locale locale;
                Object[] objArr;
                if (str2.length() > 40) {
                    locale = Locale.US;
                    str3 = "Attribute key length must not exceed %d characters";
                    objArr = new Object[]{Integer.valueOf(40)};
                } else if (str3.length() > 100) {
                    locale = Locale.US;
                    str3 = "Attribute value length must not exceed %d characters";
                    objArr = new Object[]{Integer.valueOf(100)};
                } else {
                    str = !str2.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*") ? "Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_" : null;
                }
                str = String.format(locale, str3, objArr);
            }
            if (str != null) {
                Log.w("FirebasePerformance", str);
                return false;
            }
        }
        return true;
    }

    private final boolean m12026b(nt ntVar, int i) {
        if (ntVar == null) {
            return false;
        }
        String str;
        String str2;
        if (i > 1) {
            str = "FirebasePerformance";
            str2 = "Exceed MAX_SUBTRACE_DEEP:1";
        } else {
            nu[] nuVarArr = ntVar.f18386d;
            int length = nuVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                boolean z;
                String valueOf;
                Long l;
                StringBuilder stringBuilder;
                nu nuVar = nuVarArr[i2];
                String str3 = nuVar.f18391a;
                if (str3 != null) {
                    String str4;
                    str3 = str3.trim();
                    if (str3.isEmpty()) {
                        str3 = "FirebasePerformance";
                        str4 = "counterId is empty";
                    } else if (str3.length() > 100) {
                        str3 = "FirebasePerformance";
                        str4 = "counterId exceeded max length 100";
                    } else {
                        z = true;
                        if (z) {
                            str = "FirebasePerformance";
                            str2 = "invalid CounterId:";
                            valueOf = String.valueOf(nuVar.f18391a);
                            Log.w(str, valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2));
                            return false;
                        }
                        l = nuVar.f18392b;
                        z = l == null && l.longValue() >= 0;
                        if (z) {
                            str = "FirebasePerformance";
                            str2 = String.valueOf(nuVar.f18392b);
                            stringBuilder = new StringBuilder(21 + String.valueOf(str2).length());
                            stringBuilder.append("invalid CounterValue:");
                            stringBuilder.append(str2);
                            str2 = stringBuilder.toString();
                        } else {
                            i2++;
                        }
                    }
                    Log.w(str3, str4);
                }
                z = false;
                if (z) {
                    l = nuVar.f18392b;
                    if (l == null) {
                    }
                    if (z) {
                        i2++;
                    } else {
                        str = "FirebasePerformance";
                        str2 = String.valueOf(nuVar.f18392b);
                        stringBuilder = new StringBuilder(21 + String.valueOf(str2).length());
                        stringBuilder.append("invalid CounterValue:");
                        stringBuilder.append(str2);
                        str2 = stringBuilder.toString();
                    }
                } else {
                    str = "FirebasePerformance";
                    str2 = "invalid CounterId:";
                    valueOf = String.valueOf(nuVar.f18391a);
                    if (valueOf.length() == 0) {
                    }
                    Log.w(str, valueOf.length() == 0 ? str2.concat(valueOf) : new String(str2));
                    return false;
                }
            }
            for (nt b : ntVar.f18387e) {
                if (!m12026b(b, i + 1)) {
                    return false;
                }
            }
            return true;
        }
        Log.w(str, str2);
        return false;
    }

    public final boolean mo1664a() {
        String str;
        String str2;
        String valueOf;
        if (!m12024a(this.f15300a, 0)) {
            str = "FirebasePerformance";
            str2 = "Invalid Trace:";
            valueOf = String.valueOf(this.f15300a.f18383a);
            Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return false;
        } else if (!m12023a(this.f15300a) || m12026b(this.f15300a, 0)) {
            return true;
        } else {
            str = "FirebasePerformance";
            str2 = "Invalid Counters for Trace:";
            valueOf = String.valueOf(this.f15300a.f18383a);
            Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return false;
        }
    }
}
