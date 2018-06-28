package com.google.android.gms.common;

import android.util.Log;
import com.google.android.gms.common.internal.C1765p;
import com.google.android.gms.common.internal.C5470q;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.p158a.C1644a;
import com.google.android.gms.p158a.C6566m;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

abstract class C6580m extends C5470q {
    private int f18059a;

    protected C6580m(byte[] bArr) {
        if (bArr.length != 25) {
            StringBuilder stringBuilder;
            String stringBuilder2;
            int length;
            StringBuilder stringBuilder3;
            String str = "GoogleCertificates";
            boolean z = true;
            int length2 = bArr.length;
            int length3 = bArr.length;
            if (!(bArr == null || bArr.length == 0 || length3 <= 0)) {
                if (length3 <= bArr.length) {
                    stringBuilder = new StringBuilder(57 * (((length3 + 16) - 1) / 16));
                    int i = 0;
                    int i2 = i;
                    int i3 = length3;
                    while (i3 > 0) {
                        String str2;
                        if (i == 0) {
                            Object[] objArr;
                            if (length3 < 65536) {
                                str2 = "%04X:";
                                objArr = new Object[]{Integer.valueOf(i2)};
                            } else {
                                str2 = "%08X:";
                                objArr = new Object[]{Integer.valueOf(i2)};
                            }
                            str2 = String.format(str2, objArr);
                        } else {
                            if (i == 8) {
                                str2 = " -";
                            }
                            stringBuilder.append(String.format(" %02X", new Object[]{Integer.valueOf(bArr[i2] & 255)}));
                            i3--;
                            i++;
                            if (i != 16 || i3 == 0) {
                                stringBuilder.append('\n');
                                i = 0;
                            }
                            i2++;
                        }
                        stringBuilder.append(str2);
                        stringBuilder.append(String.format(" %02X", new Object[]{Integer.valueOf(bArr[i2] & 255)}));
                        i3--;
                        i++;
                        if (i != 16) {
                        }
                        stringBuilder.append('\n');
                        i = 0;
                        i2++;
                    }
                    stringBuilder2 = stringBuilder.toString();
                    stringBuilder = new StringBuilder(51 + String.valueOf(stringBuilder2).length());
                    stringBuilder.append("Cert hash data has incorrect length (");
                    stringBuilder.append(length2);
                    stringBuilder.append("):\n");
                    stringBuilder.append(stringBuilder2);
                    Log.wtf(str, stringBuilder.toString(), new Exception());
                    bArr = Arrays.copyOfRange(bArr, 0, 25);
                    if (bArr.length == 25) {
                        z = false;
                    }
                    length = bArr.length;
                    stringBuilder3 = new StringBuilder(55);
                    stringBuilder3.append("cert hash data has incorrect length. length=");
                    stringBuilder3.append(length);
                    ac.m4386b(z, stringBuilder3.toString());
                }
            }
            stringBuilder2 = null;
            stringBuilder = new StringBuilder(51 + String.valueOf(stringBuilder2).length());
            stringBuilder.append("Cert hash data has incorrect length (");
            stringBuilder.append(length2);
            stringBuilder.append("):\n");
            stringBuilder.append(stringBuilder2);
            Log.wtf(str, stringBuilder.toString(), new Exception());
            bArr = Arrays.copyOfRange(bArr, 0, 25);
            if (bArr.length == 25) {
                z = false;
            }
            length = bArr.length;
            stringBuilder3 = new StringBuilder(55);
            stringBuilder3.append("cert hash data has incorrect length. length=");
            stringBuilder3.append(length);
            ac.m4386b(z, stringBuilder3.toString());
        }
        this.f18059a = Arrays.hashCode(bArr);
    }

    protected static byte[] m15919a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public final C1644a mo1571a() {
        return C6566m.m15848a(mo3406c());
    }

    public final int mo1572b() {
        return hashCode();
    }

    abstract byte[] mo3406c();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1765p)) {
            return false;
        }
        try {
            C1765p c1765p = (C1765p) obj;
            if (c1765p.mo1572b() != hashCode()) {
                return false;
            }
            C1644a a = c1765p.mo1571a();
            if (a == null) {
                return false;
            }
            return Arrays.equals(mo3406c(), (byte[]) C6566m.m15849a(a));
        } catch (Throwable e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    public int hashCode() {
        return this.f18059a;
    }
}
