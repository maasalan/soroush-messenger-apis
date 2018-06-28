package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.util.C1785d;
import com.google.android.gms.measurement.AppMeasurement.C5527a;
import com.google.android.gms.measurement.AppMeasurement.C5529e;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.security.auth.x500.X500Principal;
import org.jivesoftware.smack.roster.Roster;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smackx.pubsub.EventElement;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class ju extends hq {
    private static String[] f18218a = new String[]{"firebase_"};
    private SecureRandom f18219b;
    private final AtomicLong f18220c = new AtomicLong(0);
    private int f18221d;

    ju(gr grVar) {
        super(grVar);
    }

    private final int m16559a(String str, Object obj, boolean z) {
        if (z) {
            int length;
            String str2 = "param";
            int i = 1;
            if (obj instanceof Parcelable[]) {
                length = ((Parcelable[]) obj).length;
            } else {
                if (obj instanceof ArrayList) {
                    length = ((ArrayList) obj).size();
                }
                if (i == 0) {
                    return 17;
                }
            }
            if (length > IjkMediaCodecInfo.RANK_MAX) {
                mo1623t().f18136c.m4849a("Parameter array is too long; discarded. Value kind, name, array length", str2, str, Integer.valueOf(length));
                i = 0;
            }
            if (i == 0) {
                return 17;
            }
        }
        return m16584h(str) ? m16571a("param", str, 256, obj, z) : m16571a("param", str, 100, obj, z) ? 0 : 4;
    }

    private static Object m16560a(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if (!((obj instanceof String) || (obj instanceof Character))) {
                if (!(obj instanceof CharSequence)) {
                    return null;
                }
            }
            return m16563a(String.valueOf(obj), i, z);
        }
    }

    public static Object m16561a(kf kfVar, String str) {
        for (kg kgVar : kfVar.f18270a) {
            if (kgVar.f18276a.equals(str)) {
                if (kgVar.f18277b != null) {
                    return kgVar.f18277b;
                }
                if (kgVar.f18278c != null) {
                    return kgVar.f18278c;
                }
                if (kgVar.f18279d != null) {
                    return kgVar.f18279d;
                }
            }
        }
        return null;
    }

    public static Object m16562a(String str, Object obj) {
        boolean z;
        int i = 256;
        if ("_ev".equals(str)) {
            z = true;
        } else {
            if (!m16584h(str)) {
                i = 100;
            }
            z = false;
        }
        return m16560a(i, obj, z);
    }

    public static String m16563a(String str, int i, boolean z) {
        if (str.codePointCount(0, str.length()) > i) {
            if (z) {
                return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
            }
            str = null;
        }
        return str;
    }

    public static String m16564a(String str, String[] strArr, String[] strArr2) {
        ac.m4376a((Object) strArr);
        ac.m4376a((Object) strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            if (m16578b(str, strArr[i])) {
                return strArr2[i];
            }
        }
        return null;
    }

    private static void m16565a(Bundle bundle, Object obj) {
        ac.m4376a((Object) bundle);
        if (obj == null) {
            return;
        }
        if ((obj instanceof String) || (obj instanceof CharSequence)) {
            bundle.putLong("_el", (long) String.valueOf(obj).length());
        }
    }

    public static boolean m16566a(android.content.Context r3, java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = 0;
        r1 = r3.getPackageManager();	 Catch:{ NameNotFoundException -> 0x001a }
        if (r1 != 0) goto L_0x0008;	 Catch:{ NameNotFoundException -> 0x001a }
    L_0x0007:
        return r0;	 Catch:{ NameNotFoundException -> 0x001a }
    L_0x0008:
        r2 = new android.content.ComponentName;	 Catch:{ NameNotFoundException -> 0x001a }
        r2.<init>(r3, r4);	 Catch:{ NameNotFoundException -> 0x001a }
        r3 = 4;	 Catch:{ NameNotFoundException -> 0x001a }
        r3 = r1.getServiceInfo(r2, r3);	 Catch:{ NameNotFoundException -> 0x001a }
        if (r3 == 0) goto L_0x001a;	 Catch:{ NameNotFoundException -> 0x001a }
    L_0x0014:
        r3 = r3.enabled;	 Catch:{ NameNotFoundException -> 0x001a }
        if (r3 == 0) goto L_0x001a;
    L_0x0018:
        r3 = 1;
        return r3;
    L_0x001a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ju.a(android.content.Context, java.lang.String):boolean");
    }

    public static boolean m16567a(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (!("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra))) {
            if (!"android-app://com.google.appcrawler".equals(stringExtra)) {
                return false;
            }
        }
        return true;
    }

    private static boolean m16568a(Bundle bundle, int i) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    static boolean m16569a(zzcfx com_google_android_gms_internal_zzcfx, zzcff com_google_android_gms_internal_zzcff) {
        ac.m4376a((Object) com_google_android_gms_internal_zzcfx);
        ac.m4376a((Object) com_google_android_gms_internal_zzcff);
        return !TextUtils.isEmpty(com_google_android_gms_internal_zzcff.f18518b);
    }

    static boolean m16570a(String str) {
        ac.m4378a(str);
        if (str.charAt(0) == '_') {
            if (!str.equals("_ep")) {
                return false;
            }
        }
        return true;
    }

    private final boolean m16571a(String str, String str2, int i, Object obj, boolean z) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!((obj instanceof String) || (obj instanceof Character))) {
            if (!(obj instanceof CharSequence)) {
                if ((obj instanceof Bundle) && z) {
                    return true;
                }
                int length;
                Object obj2;
                if ((obj instanceof Parcelable[]) && z) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    length = parcelableArr.length;
                    i = 0;
                    while (i < length) {
                        obj2 = parcelableArr[i];
                        if (obj2 instanceof Bundle) {
                            i++;
                        } else {
                            mo1623t().f18136c.m4848a("All Parcelable[] elements must be of type Bundle. Value type, name", obj2.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                } else if (!(obj instanceof ArrayList) || !z) {
                    return false;
                } else {
                    ArrayList arrayList = (ArrayList) obj;
                    length = arrayList.size();
                    i = 0;
                    while (i < length) {
                        obj2 = arrayList.get(i);
                        i++;
                        if (!(obj2 instanceof Bundle)) {
                            mo1623t().f18136c.m4848a("All ArrayList elements must be of type Bundle. Value type, name", obj2.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        String valueOf = String.valueOf(obj);
        if (valueOf.codePointCount(0, valueOf.length()) > i) {
            mo1623t().f18136c.m4849a("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
            return false;
        }
        return true;
    }

    public static boolean m16572a(long[] jArr, int i) {
        return i < (jArr.length << 6) && (jArr[i / 64] & (1 << (i % 64))) != 0;
    }

    static byte[] m16573a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            byte[] marshall = obtain.marshall();
            return marshall;
        } finally {
            obtain.recycle();
        }
    }

    public static long[] m16574a(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    jArr[i] = jArr[i] | (1 << i2);
                }
            }
        }
        return jArr;
    }

    public static Bundle[] m16575a(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        Object[] copyOf;
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            copyOf = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            copyOf = arrayList.toArray(new Bundle[arrayList.size()]);
        }
        return (Bundle[]) copyOf;
    }

    static kg[] m16576a(kg[] kgVarArr, String str, Object obj) {
        for (kg kgVar : kgVarArr) {
            if (Objects.equals(kgVar.f18276a, str)) {
                kgVar.f18278c = null;
                kgVar.f18277b = null;
                kgVar.f18279d = null;
                if (obj instanceof Long) {
                    kgVar.f18278c = (Long) obj;
                    return kgVarArr;
                } else if (obj instanceof String) {
                    kgVar.f18277b = (String) obj;
                    return kgVarArr;
                } else {
                    if (obj instanceof Double) {
                        kgVar.f18279d = (Double) obj;
                    }
                    return kgVarArr;
                }
            }
        }
        Object obj2 = new kg[(kgVarArr.length + 1)];
        System.arraycopy(kgVarArr, 0, obj2, 0, kgVarArr.length);
        kg kgVar2 = new kg();
        kgVar2.f18276a = str;
        if (obj instanceof Long) {
            kgVar2.f18278c = (Long) obj;
        } else if (obj instanceof String) {
            kgVar2.f18277b = (String) obj;
        } else if (obj instanceof Double) {
            kgVar2.f18279d = (Double) obj;
        }
        obj2[kgVarArr.length] = kgVar2;
        return obj2;
    }

    public static java.lang.Object m16577b(java.lang.Object r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = 0;
        if (r4 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = new java.io.ByteArrayOutputStream;	 Catch:{ all -> 0x0032 }
        r1.<init>();	 Catch:{ all -> 0x0032 }
        r2 = new java.io.ObjectOutputStream;	 Catch:{ all -> 0x0032 }
        r2.<init>(r1);	 Catch:{ all -> 0x0032 }
        r2.writeObject(r4);	 Catch:{ all -> 0x002f }
        r2.flush();	 Catch:{ all -> 0x002f }
        r4 = new java.io.ObjectInputStream;	 Catch:{ all -> 0x002f }
        r3 = new java.io.ByteArrayInputStream;	 Catch:{ all -> 0x002f }
        r1 = r1.toByteArray();	 Catch:{ all -> 0x002f }
        r3.<init>(r1);	 Catch:{ all -> 0x002f }
        r4.<init>(r3);	 Catch:{ all -> 0x002f }
        r1 = r4.readObject();	 Catch:{ all -> 0x002d }
        r2.close();	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
        r4.close();	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
        return r1;	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
    L_0x002d:
        r1 = move-exception;	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
        goto L_0x0035;	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
    L_0x002f:
        r1 = move-exception;	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
        r4 = r0;	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
        goto L_0x0035;	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
    L_0x0032:
        r1 = move-exception;	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
        r4 = r0;	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
        r2 = r4;	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
    L_0x0035:
        if (r2 == 0) goto L_0x003a;	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
    L_0x0037:
        r2.close();	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
    L_0x003a:
        if (r4 == 0) goto L_0x003f;	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
    L_0x003c:
        r4.close();	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
    L_0x003f:
        throw r1;	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
    L_0x0040:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ju.b(java.lang.Object):java.lang.Object");
    }

    public static boolean m16578b(String str, String str2) {
        return (str == null && str2 == null) ? true : str == null ? false : str.equals(str2);
    }

    static long m16579c(byte[] bArr) {
        ac.m4376a((Object) bArr);
        long j = null;
        ac.m4381a(bArr.length > 0);
        long j2 = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j += 8;
            length--;
            j2 += (((long) bArr[length]) & 255) << j;
        }
        return j2;
    }

    public static Object m16580c(String str, Object obj) {
        int p;
        boolean z;
        if ("_ldl".equals(str)) {
            p = m16589p(str);
            z = true;
        } else {
            p = m16589p(str);
            z = false;
        }
        return m16560a(p, obj, z);
    }

    private final boolean m16581c(Context context, String str) {
        Object e;
        fv fvVar;
        String str2;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b = dz.m4762a(context).m4760b(str, 64);
            if (!(b == null || b.signatures == null || b.signatures.length <= 0)) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(b.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
        } catch (CertificateException e2) {
            e = e2;
            fvVar = mo1623t().f18134a;
            str2 = "Error obtaining certificate";
            fvVar.m4847a(str2, e);
            return true;
        } catch (NameNotFoundException e3) {
            e = e3;
            fvVar = mo1623t().f18134a;
            str2 = "Package name not found";
            fvVar.m4847a(str2, e);
            return true;
        }
        return true;
    }

    private final boolean m16582c(String str, String str2) {
        if (str2 == null) {
            mo1623t().f18134a.m4847a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo1623t().f18134a.m4847a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                codePointAt = Character.charCount(codePointAt);
                while (codePointAt < length) {
                    int codePointAt2 = str2.codePointAt(codePointAt);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        codePointAt += Character.charCount(codePointAt2);
                    } else {
                        mo1623t().f18134a.m4848a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            mo1623t().f18134a.m4848a("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    static java.security.MessageDigest m16583f(java.lang.String r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = 0;
    L_0x0001:
        r1 = 2;
        if (r0 >= r1) goto L_0x000e;
    L_0x0004:
        r1 = java.security.MessageDigest.getInstance(r2);	 Catch:{ NoSuchAlgorithmException -> 0x000b }
        if (r1 == 0) goto L_0x000b;
    L_0x000a:
        return r1;
    L_0x000b:
        r0 = r0 + 1;
        goto L_0x0001;
    L_0x000e:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ju.f(java.lang.String):java.security.MessageDigest");
    }

    public static boolean m16584h(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    static boolean m16585j(String str) {
        return str != null && str.matches("(\\+|-)?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static boolean m16586m(String str) {
        boolean z;
        ac.m4378a(str);
        int hashCode = str.hashCode();
        if (hashCode != 94660) {
            if (hashCode != 95025) {
                if (hashCode == 95027) {
                    if (str.equals("_ui")) {
                        z = true;
                        switch (z) {
                            case false:
                            case true:
                            case true:
                                return true;
                            default:
                                return false;
                        }
                    }
                }
            } else if (str.equals("_ug")) {
                z = true;
                switch (z) {
                    case false:
                    case true:
                    case true:
                        return true;
                    default:
                        return false;
                }
            }
        } else if (str.equals("_in")) {
            z = false;
            switch (z) {
                case false:
                case true:
                case true:
                    return true;
                default:
                    return false;
            }
        }
        z = true;
        switch (z) {
            case false:
            case true:
            case true:
                return true;
            default:
                return false;
        }
    }

    private final int m16587n(String str) {
        return !m16602a("event param", str) ? 3 : !m16603a("event param", null, str) ? 14 : !m16601a("event param", 40, str) ? 3 : 0;
    }

    private final int m16588o(String str) {
        return !m16582c("event param", str) ? 3 : !m16603a("event param", null, str) ? 14 : !m16601a("event param", 40, str) ? 3 : 0;
    }

    private static int m16589p(String str) {
        return "_ldl".equals(str) ? 2048 : 36;
    }

    public final Bundle m16590a(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            Object queryParameter;
            Object queryParameter2;
            Object queryParameter3;
            Object queryParameter4;
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
            } else {
                queryParameter = null;
                queryParameter2 = queryParameter;
                queryParameter3 = queryParameter2;
                queryParameter4 = queryParameter3;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3)) {
                if (TextUtils.isEmpty(queryParameter4)) {
                    return null;
                }
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            queryParameter = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("content", queryParameter);
            }
            queryParameter = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("aclid", queryParameter);
            }
            queryParameter = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("cp1", queryParameter);
            }
            Object queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            mo1623t().f18136c.m4847a("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    final Bundle m16591a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object a = m16562a(str, bundle.get(str));
                if (a == null) {
                    mo1623t().f18136c.m4847a("Param value can't be null", mo1618o().m16196b(str));
                } else {
                    m16597a(bundle2, str, a);
                }
            }
        }
        return bundle2;
    }

    public final Bundle m16592a(String str, Bundle bundle, List<String> list, boolean z, boolean z2) {
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int i = 0;
        for (String str2 : bundle.keySet()) {
            int i2;
            if (list != null) {
                if (list.contains(str2)) {
                    i2 = 0;
                    if (i2 != 0) {
                        i2 = m16559a(str2, bundle.get(str2), z2);
                        if (i2 != 0 || "_ev".equals(str2)) {
                            if (m16570a(str2)) {
                                i++;
                                if (i > 25) {
                                    StringBuilder stringBuilder = new StringBuilder(48);
                                    stringBuilder.append("Event can't contain more then 25 params");
                                    mo1623t().f18134a.m4848a(stringBuilder.toString(), mo1618o().m16194a(str), mo1618o().m16188a(bundle));
                                    m16568a(bundle2, 5);
                                }
                            }
                        } else if (m16568a(bundle2, i2)) {
                            bundle2.putString("_ev", m16563a(str2, 40, true));
                            m16565a(bundle2, bundle.get(str2));
                        }
                    } else if (m16568a(bundle2, i2)) {
                        bundle2.putString("_ev", m16563a(str2, 40, true));
                        if (i2 == 3) {
                            m16565a(bundle2, (Object) str2);
                        }
                    }
                    bundle2.remove(str2);
                }
            }
            i2 = z ? m16587n(str2) : 0;
            if (i2 == 0) {
                i2 = m16588o(str2);
            }
            if (i2 != 0) {
                i2 = m16559a(str2, bundle.get(str2), z2);
                if (i2 != 0) {
                }
                if (m16570a(str2)) {
                    i++;
                    if (i > 25) {
                        StringBuilder stringBuilder2 = new StringBuilder(48);
                        stringBuilder2.append("Event can't contain more then 25 params");
                        mo1623t().f18134a.m4848a(stringBuilder2.toString(), mo1618o().m16194a(str), mo1618o().m16188a(bundle));
                        m16568a(bundle2, 5);
                    }
                }
            } else if (m16568a(bundle2, i2)) {
                bundle2.putString("_ev", m16563a(str2, 40, true));
                if (i2 == 3) {
                    m16565a(bundle2, (Object) str2);
                }
            }
            bundle2.remove(str2);
        }
        return bundle2;
    }

    final <T extends android.os.Parcelable> T m16593a(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r4 = this;
        r0 = 0;
        if (r5 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = android.os.Parcel.obtain();
        r2 = r5.length;	 Catch:{ dl -> 0x001c }
        r3 = 0;	 Catch:{ dl -> 0x001c }
        r1.unmarshall(r5, r3, r2);	 Catch:{ dl -> 0x001c }
        r1.setDataPosition(r3);	 Catch:{ dl -> 0x001c }
        r5 = r6.createFromParcel(r1);	 Catch:{ dl -> 0x001c }
        r5 = (android.os.Parcelable) r5;	 Catch:{ dl -> 0x001c }
        r1.recycle();
        return r5;
    L_0x001a:
        r5 = move-exception;
        goto L_0x002b;
    L_0x001c:
        r5 = r4.mo1623t();	 Catch:{ all -> 0x001a }
        r5 = r5.f18134a;	 Catch:{ all -> 0x001a }
        r6 = "Failed to load parcelable from buffer";	 Catch:{ all -> 0x001a }
        r5.m4846a(r6);	 Catch:{ all -> 0x001a }
        r1.recycle();
        return r0;
    L_0x002b:
        r1.recycle();
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ju.a(byte[], android.os.Parcelable$Creator):T");
    }

    final zzcfx m16594a(String str, Bundle bundle, String str2, long j) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (m16612c(str) != 0) {
            mo1623t().f18134a.m4847a("Invalid conditional property event name", mo1618o().m16198c(str));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        return new zzcfx(str, new zzcfu(m16591a(m16592a(str, bundle2, Collections.singletonList("_o"), false, false))), str2, j);
    }

    public final /* bridge */ /* synthetic */ void mo1604a() {
        super.mo1604a();
    }

    public final void m16596a(int i, String str, String str2, int i2) {
        m16610b(i, str, str2, i2);
    }

    public final void m16597a(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else {
                if (str != null) {
                    mo1623t().f18137d.m4848a("Not putting event parameter. Invalid value type. name, type", mo1618o().m16196b(str), obj != null ? obj.getClass().getSimpleName() : null);
                }
            }
        }
    }

    public final void m16598a(kg kgVar, Object obj) {
        ac.m4376a(obj);
        kgVar.f18277b = null;
        kgVar.f18278c = null;
        kgVar.f18279d = null;
        if (obj instanceof String) {
            kgVar.f18277b = (String) obj;
        } else if (obj instanceof Long) {
            kgVar.f18278c = (Long) obj;
        } else if (obj instanceof Double) {
            kgVar.f18279d = (Double) obj;
        } else {
            mo1623t().f18134a.m4847a("Ignoring invalid (type) event param value", obj);
        }
    }

    public final void m16599a(kk kkVar, Object obj) {
        ac.m4376a(obj);
        kkVar.f18323c = null;
        kkVar.f18324d = null;
        kkVar.f18325e = null;
        if (obj instanceof String) {
            kkVar.f18323c = (String) obj;
        } else if (obj instanceof Long) {
            kkVar.f18324d = (Long) obj;
        } else if (obj instanceof Double) {
            kkVar.f18325e = (Double) obj;
        } else {
            mo1623t().f18134a.m4847a("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final boolean m16600a(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(mo1614k().mo1575a() - j) > j2;
    }

    public final boolean m16601a(String str, int i, String str2) {
        if (str2 == null) {
            mo1623t().f18134a.m4847a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            mo1623t().f18134a.m4849a("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    public final boolean m16602a(String str, String str2) {
        if (str2 == null) {
            mo1623t().f18134a.m4847a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo1623t().f18134a.m4847a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt)) {
                int length = str2.length();
                codePointAt = Character.charCount(codePointAt);
                while (codePointAt < length) {
                    int codePointAt2 = str2.codePointAt(codePointAt);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        codePointAt += Character.charCount(codePointAt2);
                    } else {
                        mo1623t().f18134a.m4848a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            mo1623t().f18134a.m4848a("Name must start with a letter. Type, name", str, str2);
            return false;
        }
    }

    public final boolean m16603a(String str, String[] strArr, String str2) {
        if (str2 == null) {
            mo1623t().f18134a.m4847a("Name is required and can't be null. Type", str);
            return false;
        }
        boolean z;
        ac.m4376a((Object) str2);
        for (String startsWith : f18218a) {
            if (str2.startsWith(startsWith)) {
                z = true;
                break;
            }
        }
        z = false;
        if (z) {
            mo1623t().f18134a.m4848a("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr != null) {
            boolean z2;
            ac.m4376a((Object) strArr);
            for (String startsWith2 : strArr) {
                if (m16578b(str2, startsWith2)) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
            if (z2) {
                mo1623t().f18134a.m4848a("Name is reserved. Type, name", str, str2);
                return false;
            }
        }
        return true;
    }

    public final byte[] m16604a(kh khVar) {
        try {
            byte[] bArr = new byte[khVar.m5129f()];
            oa a = oa.m5073a(bArr, bArr.length);
            khVar.mo1667a(a);
            a.m5085a();
            return bArr;
        } catch (IOException e) {
            mo1623t().f18134a.m4847a("Data loss. Failed to serialize batch", e);
            return null;
        }
    }

    public final byte[] m16605a(byte[] bArr) {
        try {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            mo1623t().f18134a.m4847a("Failed to gzip content", e);
            throw e;
        }
    }

    public final int m16606b(String str) {
        return !m16602a(EventElement.ELEMENT, str) ? 2 : !m16603a(EventElement.ELEMENT, C5527a.f15309a, str) ? 13 : !m16601a(EventElement.ELEMENT, 40, str) ? 2 : 0;
    }

    public final int m16607b(String str, Object obj) {
        return "_ldl".equals(str) ? m16571a("user property referrer", str, m16589p(str), obj, false) : m16571a("user property", str, m16589p(str), obj, false) ? 0 : 7;
    }

    final long m16608b(Context context, String str) {
        mo1606c();
        ac.m4376a((Object) context);
        ac.m4378a(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest f = m16583f(StringUtils.MD5);
        if (f == null) {
            mo1623t().f18134a.m4846a("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!m16581c(context, str)) {
                    PackageInfo b = dz.m4762a(context).m4760b(mo1615l().getPackageName(), 64);
                    if (b.signatures != null && b.signatures.length > 0) {
                        return m16579c(f.digest(b.signatures[0].toByteArray()));
                    }
                    mo1623t().f18136c.m4846a("Could not get signatures");
                    return -1;
                }
            } catch (NameNotFoundException e) {
                mo1623t().f18134a.m4847a("Package name not found", e);
            }
        }
        return 0;
    }

    public final /* bridge */ /* synthetic */ void mo1605b() {
        super.mo1605b();
    }

    public final void m16610b(int i, String str, String str2, int i2) {
        Bundle bundle = new Bundle();
        m16568a(bundle, i);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString(str, str2);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        this.s.m4909h().m16397a("auto", "_err", bundle);
    }

    public final byte[] m16611b(byte[] bArr) {
        try {
            InputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            mo1623t().f18134a.m4847a("Failed to ungzip content", e);
            throw e;
        }
    }

    public final int m16612c(String str) {
        return !m16582c(EventElement.ELEMENT, str) ? 2 : !m16603a(EventElement.ELEMENT, C5527a.f15309a, str) ? 13 : !m16601a(EventElement.ELEMENT, 40, str) ? 2 : 0;
    }

    public final /* bridge */ /* synthetic */ void mo1606c() {
        super.mo1606c();
    }

    public final int m16614d(String str) {
        return !m16582c("user property", str) ? 6 : !m16603a("user property", C5529e.f15313a, str) ? 15 : !m16601a("user property", 24, str) ? 6 : 0;
    }

    public final /* bridge */ /* synthetic */ eo mo1607d() {
        return super.mo1607d();
    }

    protected final void d_() {
        mo1606c();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                mo1623t().f18136c.m4846a("Utils falling back to Random for random id");
            }
        }
        this.f18220c.set(nextLong);
    }

    public final /* bridge */ /* synthetic */ eu mo1608e() {
        return super.mo1608e();
    }

    public final boolean m16617e(String str) {
        if (TextUtils.isEmpty(str)) {
            mo1623t().f18134a.m4846a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        ac.m4376a((Object) str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        mo1623t().f18134a.m4847a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", str);
        return false;
    }

    public final /* bridge */ /* synthetic */ hs mo1609f() {
        return super.mo1609f();
    }

    public final /* bridge */ /* synthetic */ fo mo1610g() {
        return super.mo1610g();
    }

    public final boolean m16620g(String str) {
        mo1606c();
        if (dz.m4762a(mo1615l()).m4756a(str) == 0) {
            return true;
        }
        mo1623t().f18139f.m4847a("Permission not granted", str);
        return false;
    }

    public final /* bridge */ /* synthetic */ fd mo1611h() {
        return super.mo1611h();
    }

    public final /* bridge */ /* synthetic */ il mo1612i() {
        return super.mo1612i();
    }

    public final boolean m16623i(String str) {
        return TextUtils.isEmpty(str) ? false : mo1625v().m11917A().equals(str);
    }

    public final /* bridge */ /* synthetic */ ih mo1613j() {
        return super.mo1613j();
    }

    public final /* bridge */ /* synthetic */ C1785d mo1614k() {
        return super.mo1614k();
    }

    final boolean m16626k(String str) {
        return "1".equals(mo1620q().m16295a(str, "measurement.upload.blacklist_internal"));
    }

    public final /* bridge */ /* synthetic */ Context mo1615l() {
        return super.mo1615l();
    }

    final boolean m16628l(String str) {
        return "1".equals(mo1620q().m16295a(str, "measurement.upload.blacklist_public"));
    }

    public final /* bridge */ /* synthetic */ fp mo1616m() {
        return super.mo1616m();
    }

    public final /* bridge */ /* synthetic */ ex mo1617n() {
        return super.mo1617n();
    }

    public final /* bridge */ /* synthetic */ fr mo1618o() {
        return super.mo1618o();
    }

    public final /* bridge */ /* synthetic */ ju mo1619p() {
        return super.mo1619p();
    }

    public final /* bridge */ /* synthetic */ gl mo1620q() {
        return super.mo1620q();
    }

    public final /* bridge */ /* synthetic */ jk mo1621r() {
        return super.mo1621r();
    }

    public final /* bridge */ /* synthetic */ gm mo1622s() {
        return super.mo1622s();
    }

    public final /* bridge */ /* synthetic */ ft mo1623t() {
        return super.mo1623t();
    }

    public final /* bridge */ /* synthetic */ gd mo1624u() {
        return super.mo1624u();
    }

    public final /* bridge */ /* synthetic */ ew mo1625v() {
        return super.mo1625v();
    }

    protected final boolean mo3036w() {
        return true;
    }

    public final long m16640y() {
        if (this.f18220c.get() == 0) {
            long j;
            synchronized (this.f18220c) {
                long nextLong = new Random(System.nanoTime() ^ mo1614k().mo1575a()).nextLong();
                int i = this.f18221d + 1;
                this.f18221d = i;
                j = nextLong + ((long) i);
            }
            return j;
        }
        synchronized (this.f18220c) {
            this.f18220c.compareAndSet(-1, 1);
            nextLong = this.f18220c.getAndIncrement();
        }
        return nextLong;
    }

    final SecureRandom m16641z() {
        mo1606c();
        if (this.f18219b == null) {
            this.f18219b = new SecureRandom();
        }
        return this.f18219b;
    }
}
