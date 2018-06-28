package com.google.android.gms.internal;

import android.content.Context;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import org.jivesoftware.smack.util.StringUtils;

public final class cz implements cj {
    private static final Charset f15213a = Charset.forName(StringUtils.UTF8);
    private static final le f15214b;
    private static Map<String, ky<String>> f15215d;
    private static Boolean f15216e;
    private static Long f15217f;
    private final Context f15218c;

    static {
        le leVar = new le(ku.m4963a("com.google.android.gms.clearcut.public"));
        String str = "gms:playlog:service:sampling_";
        if (leVar.f6097e) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        le leVar2 = new le(leVar.f6093a, leVar.f6094b, str, leVar.f6096d, leVar.f6097e, leVar.f6098f);
        f15214b = new le(leVar2.f6093a, leVar2.f6094b, leVar2.f6095c, "LogSampling__", leVar2.f6097e, leVar2.f6098f);
    }

    public cz(Context context) {
        this.f15218c = context;
        if (f15215d == null) {
            f15215d = new HashMap();
        }
        if (this.f15218c != null) {
            ky.m4967a(this.f15218c);
        }
    }

    private static da m11875a(String str) {
        if (str == null) {
            return null;
        }
        String str2 = "";
        int indexOf = str.indexOf(44);
        int i = 0;
        if (indexOf >= 0) {
            str2 = str.substring(0, indexOf);
            i = indexOf + 1;
        }
        String str3 = str2;
        int indexOf2 = str.indexOf(47, i);
        if (indexOf2 <= 0) {
            str2 = "LogSamplerImpl";
            String str4 = "Failed to parse the rule: ";
            str = String.valueOf(str);
            Log.e(str2, str.length() != 0 ? str4.concat(str) : new String(str4));
            return null;
        }
        try {
            long parseLong = Long.parseLong(str.substring(i, indexOf2));
            long parseLong2 = Long.parseLong(str.substring(indexOf2 + 1));
            if (parseLong >= 0) {
                if (parseLong2 >= 0) {
                    return new da(str3, parseLong, parseLong2);
                }
            }
            StringBuilder stringBuilder = new StringBuilder(72);
            stringBuilder.append("negative values not supported: ");
            stringBuilder.append(parseLong);
            stringBuilder.append("/");
            stringBuilder.append(parseLong2);
            Log.e("LogSamplerImpl", stringBuilder.toString());
            return null;
        } catch (Throwable e) {
            str4 = "LogSamplerImpl";
            String str5 = "parseLong() failed while parsing: ";
            str = String.valueOf(str);
            Log.e(str4, str.length() != 0 ? str5.concat(str) : new String(str5), e);
            return null;
        }
    }

    private static boolean m11876a(Context context) {
        if (f15216e == null) {
            f15216e = Boolean.valueOf(dz.m4762a(context).m4756a("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return f15216e.booleanValue();
    }

    public final boolean mo1597a(String str, int i) {
        cz czVar = this;
        String str2 = null;
        String valueOf = (str == null || str.isEmpty()) ? i >= 0 ? String.valueOf(i) : null : str;
        if (valueOf == null) {
            return true;
        }
        if (czVar.f15218c != null) {
            if (m11876a(czVar.f15218c)) {
                ky kyVar = (ky) f15215d.get(valueOf);
                if (kyVar == null) {
                    kyVar = new lc(f15214b, valueOf);
                    f15215d.put(valueOf, kyVar);
                }
                if (ky.f6085a == null) {
                    throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                }
                Object b;
                if (kyVar.f6088b.f6098f) {
                    b = kyVar.m4972b();
                    if (b == null) {
                        b = kyVar.m4969a();
                        if (b != null) {
                        }
                    }
                    str2 = (String) b;
                } else {
                    b = kyVar.m4969a();
                    if (b == null) {
                        b = kyVar.m4972b();
                        if (b != null) {
                        }
                    }
                    str2 = (String) b;
                }
                b = kyVar.f6091e;
                str2 = (String) b;
            }
        }
        da a = m11875a(str2);
        if (a == null) {
            return true;
        }
        long j;
        byte[] bytes;
        long j2;
        long j3;
        StringBuilder stringBuilder;
        valueOf = a.f5655a;
        Context context = czVar.f15218c;
        if (f15217f == null) {
            if (context != null) {
                f15217f = m11876a(context) ? Long.valueOf(lz.m4984b(context.getContentResolver(), "android_id")) : Long.valueOf(0);
            } else {
                j = 0;
                if (valueOf != null) {
                    if (valueOf.isEmpty()) {
                        bytes = valueOf.getBytes(f15213a);
                        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 8);
                        allocate.put(bytes);
                        allocate.putLong(j);
                        bytes = allocate.array();
                        j = cu.m4674a(bytes);
                        j2 = a.f5656b;
                        j3 = a.f5657c;
                        if (j2 >= 0) {
                            if (j3 >= 0) {
                                if (j3 > 0) {
                                    if (j < 0) {
                                        j = ((Long.MAX_VALUE % j3) + 1) + ((j & Long.MAX_VALUE) % j3);
                                    }
                                    if (j % j3 < j2) {
                                        return true;
                                    }
                                }
                                return false;
                            }
                        }
                        stringBuilder = new StringBuilder(72);
                        stringBuilder.append("negative values not supported: ");
                        stringBuilder.append(j2);
                        stringBuilder.append("/");
                        stringBuilder.append(j3);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
                bytes = ByteBuffer.allocate(8).putLong(j).array();
                j = cu.m4674a(bytes);
                j2 = a.f5656b;
                j3 = a.f5657c;
                if (j2 >= 0) {
                    if (j3 >= 0) {
                        if (j3 > 0) {
                            if (j < 0) {
                                j = ((Long.MAX_VALUE % j3) + 1) + ((j & Long.MAX_VALUE) % j3);
                            }
                            if (j % j3 < j2) {
                                return true;
                            }
                        }
                        return false;
                    }
                }
                stringBuilder = new StringBuilder(72);
                stringBuilder.append("negative values not supported: ");
                stringBuilder.append(j2);
                stringBuilder.append("/");
                stringBuilder.append(j3);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        j = f15217f.longValue();
        if (valueOf != null) {
            if (valueOf.isEmpty()) {
                bytes = valueOf.getBytes(f15213a);
                ByteBuffer allocate2 = ByteBuffer.allocate(bytes.length + 8);
                allocate2.put(bytes);
                allocate2.putLong(j);
                bytes = allocate2.array();
                j = cu.m4674a(bytes);
                j2 = a.f5656b;
                j3 = a.f5657c;
                if (j2 >= 0) {
                    if (j3 >= 0) {
                        if (j3 > 0) {
                            if (j < 0) {
                                j = ((Long.MAX_VALUE % j3) + 1) + ((j & Long.MAX_VALUE) % j3);
                            }
                            if (j % j3 < j2) {
                                return true;
                            }
                        }
                        return false;
                    }
                }
                stringBuilder = new StringBuilder(72);
                stringBuilder.append("negative values not supported: ");
                stringBuilder.append(j2);
                stringBuilder.append("/");
                stringBuilder.append(j3);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        bytes = ByteBuffer.allocate(8).putLong(j).array();
        j = cu.m4674a(bytes);
        j2 = a.f5656b;
        j3 = a.f5657c;
        if (j2 >= 0) {
            if (j3 >= 0) {
                if (j3 > 0) {
                    if (j < 0) {
                        j = ((Long.MAX_VALUE % j3) + 1) + ((j & Long.MAX_VALUE) % j3);
                    }
                    if (j % j3 < j2) {
                        return true;
                    }
                }
                return false;
            }
        }
        stringBuilder = new StringBuilder(72);
        stringBuilder.append("negative values not supported: ");
        stringBuilder.append(j2);
        stringBuilder.append("/");
        stringBuilder.append(j3);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
