package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.internal.C1687b;
import com.google.android.gms.auth.api.signin.internal.zzn;
import com.google.android.gms.common.api.C1708a.C1704a.C6573e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.zzbej;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GoogleSignInOptions extends zzbej implements C6573e, ReflectedParcelable {
    public static final Creator<GoogleSignInOptions> CREATOR = new C1685c();
    public static final Scope f20346a = new Scope("profile");
    public static final Scope f20347b = new Scope("email");
    public static final Scope f20348c = new Scope("openid");
    public static final GoogleSignInOptions f20349d;
    public static final GoogleSignInOptions f20350e;
    private static Scope f20351f = new Scope("https://www.googleapis.com/auth/games");
    private static Comparator<Scope> f20352q = new C1684b();
    private int f20353g;
    private final ArrayList<Scope> f20354h;
    private Account f20355i;
    private boolean f20356j;
    private final boolean f20357k;
    private final boolean f20358l;
    private String f20359m;
    private String f20360n;
    private ArrayList<zzn> f20361o;
    private Map<Integer, zzn> f20362p;

    public static final class C1682a {
        Set<Scope> f5181a = new HashSet();
        private boolean f5182b;
        private boolean f5183c;
        private boolean f5184d;
        private String f5185e;
        private Account f5186f;
        private String f5187g;
        private Map<Integer, zzn> f5188h = new HashMap();

        public final C1682a m4281a() {
            this.f5181a.add(GoogleSignInOptions.f20348c);
            return this;
        }

        public final GoogleSignInOptions m4282b() {
            if (this.f5184d && (this.f5186f == null || !this.f5181a.isEmpty())) {
                m4281a();
            }
            return new GoogleSignInOptions(new ArrayList(this.f5181a), this.f5186f, this.f5184d, this.f5182b, this.f5183c, this.f5185e, this.f5187g, this.f5188h);
        }
    }

    static {
        C1682a a = new C1682a().m4281a();
        a.f5181a.add(f20346a);
        f20349d = a.m4282b();
        a = new C1682a();
        Scope[] scopeArr = new Scope[0];
        a.f5181a.add(f20351f);
        a.f5181a.addAll(Arrays.asList(scopeArr));
        f20350e = a.m4282b();
    }

    GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList<zzn> arrayList2) {
        this(i, (ArrayList) arrayList, account, z, z2, z3, str, str2, m18781a(arrayList2));
    }

    private GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, zzn> map) {
        this.f20353g = i;
        this.f20354h = arrayList;
        this.f20355i = account;
        this.f20356j = z;
        this.f20357k = z2;
        this.f20358l = z3;
        this.f20359m = str;
        this.f20360n = str2;
        this.f20361o = new ArrayList(map.values());
        this.f20362p = map;
    }

    private ArrayList<Scope> m18780a() {
        return new ArrayList(this.f20354h);
    }

    private static Map<Integer, zzn> m18781a(List<zzn> list) {
        Map<Integer, zzn> hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (zzn com_google_android_gms_auth_api_signin_internal_zzn : list) {
            hashMap.put(Integer.valueOf(com_google_android_gms_auth_api_signin_internal_zzn.f17964a), com_google_android_gms_auth_api_signin_internal_zzn);
        }
        return hashMap;
    }

    public boolean equals(java.lang.Object r4) {
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
        r3 = this;
        r0 = 0;
        if (r4 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4;	 Catch:{ ClassCastException -> 0x0076 }
        r1 = r3.f20361o;	 Catch:{ ClassCastException -> 0x0076 }
        r1 = r1.size();	 Catch:{ ClassCastException -> 0x0076 }
        if (r1 > 0) goto L_0x0076;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x000e:
        r1 = r4.f20361o;	 Catch:{ ClassCastException -> 0x0076 }
        r1 = r1.size();	 Catch:{ ClassCastException -> 0x0076 }
        if (r1 <= 0) goto L_0x0017;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0016:
        return r0;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0017:
        r1 = r3.f20354h;	 Catch:{ ClassCastException -> 0x0076 }
        r1 = r1.size();	 Catch:{ ClassCastException -> 0x0076 }
        r2 = r4.m18780a();	 Catch:{ ClassCastException -> 0x0076 }
        r2 = r2.size();	 Catch:{ ClassCastException -> 0x0076 }
        if (r1 != r2) goto L_0x0076;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0027:
        r1 = r3.f20354h;	 Catch:{ ClassCastException -> 0x0076 }
        r2 = r4.m18780a();	 Catch:{ ClassCastException -> 0x0076 }
        r1 = r1.containsAll(r2);	 Catch:{ ClassCastException -> 0x0076 }
        if (r1 != 0) goto L_0x0034;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0033:
        return r0;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0034:
        r1 = r3.f20355i;	 Catch:{ ClassCastException -> 0x0076 }
        if (r1 != 0) goto L_0x003d;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0038:
        r1 = r4.f20355i;	 Catch:{ ClassCastException -> 0x0076 }
        if (r1 != 0) goto L_0x0076;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x003c:
        goto L_0x0047;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x003d:
        r1 = r3.f20355i;	 Catch:{ ClassCastException -> 0x0076 }
        r2 = r4.f20355i;	 Catch:{ ClassCastException -> 0x0076 }
        r1 = r1.equals(r2);	 Catch:{ ClassCastException -> 0x0076 }
        if (r1 == 0) goto L_0x0076;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0047:
        r1 = r3.f20359m;	 Catch:{ ClassCastException -> 0x0076 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ ClassCastException -> 0x0076 }
        if (r1 == 0) goto L_0x0058;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x004f:
        r1 = r4.f20359m;	 Catch:{ ClassCastException -> 0x0076 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ ClassCastException -> 0x0076 }
        if (r1 == 0) goto L_0x0076;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0057:
        goto L_0x0062;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0058:
        r1 = r3.f20359m;	 Catch:{ ClassCastException -> 0x0076 }
        r2 = r4.f20359m;	 Catch:{ ClassCastException -> 0x0076 }
        r1 = r1.equals(r2);	 Catch:{ ClassCastException -> 0x0076 }
        if (r1 == 0) goto L_0x0076;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0062:
        r1 = r3.f20358l;	 Catch:{ ClassCastException -> 0x0076 }
        r2 = r4.f20358l;	 Catch:{ ClassCastException -> 0x0076 }
        if (r1 != r2) goto L_0x0076;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x0068:
        r1 = r3.f20356j;	 Catch:{ ClassCastException -> 0x0076 }
        r2 = r4.f20356j;	 Catch:{ ClassCastException -> 0x0076 }
        if (r1 != r2) goto L_0x0076;	 Catch:{ ClassCastException -> 0x0076 }
    L_0x006e:
        r1 = r3.f20357k;	 Catch:{ ClassCastException -> 0x0076 }
        r4 = r4.f20357k;	 Catch:{ ClassCastException -> 0x0076 }
        if (r1 != r4) goto L_0x0076;
    L_0x0074:
        r4 = 1;
        return r4;
    L_0x0076:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Object arrayList = new ArrayList();
        ArrayList arrayList2 = this.f20354h;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(((Scope) obj).f17973a);
        }
        Collections.sort(arrayList);
        return new C1687b().m4283a(arrayList).m4283a(this.f20355i).m4283a(this.f20359m).m4284a(this.f20358l).m4284a(this.f20356j).m4284a(this.f20357k).f5190a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = dm.m4723a(parcel, 20293);
        dm.m4743b(parcel, 1, this.f20353g);
        dm.m4745c(parcel, 2, m18780a());
        dm.m4731a(parcel, 3, this.f20355i, i);
        dm.m4735a(parcel, 4, this.f20356j);
        dm.m4735a(parcel, 5, this.f20357k);
        dm.m4735a(parcel, 6, this.f20358l);
        dm.m4733a(parcel, 7, this.f20359m);
        dm.m4733a(parcel, 8, this.f20360n);
        dm.m4745c(parcel, 9, this.f20361o);
        dm.m4742b(parcel, a);
    }
}
