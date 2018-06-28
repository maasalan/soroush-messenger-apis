package ir.pec.mpl.pecpayment.p209a;

import android.content.Context;
import android.util.Log;
import com.p067a.p070b.C0989n;
import com.p067a.p070b.C0991o;
import com.p067a.p070b.C0991o.C50631;
import com.p067a.p070b.C5058d;
import com.p067a.p070b.p071a.C0976k;
import ir.pec.mpl.pecpayment.p209a.p211b.C2346c;
import ir.pec.mpl.pecpayment.p209a.p211b.C2348e;
import ir.pec.mpl.pecpayment.p209a.p211b.C2352i;
import ir.pec.mpl.pecpayment.p209a.p211b.C2353j;
import ir.pec.mpl.pecpayment.p212b.p213a.C2358b;
import ir.pec.mpl.pecpayment.p212b.p213a.C2361e;
import ir.pec.mpl.pecpayment.p212b.p213a.C2364h;
import ir.pec.mpl.pecpayment.p212b.p213a.C2369m;
import ir.pec.mpl.pecpayment.p212b.p213a.C2371o;
import ir.pec.mpl.pecpayment.view.C5740v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class C2354h {
    public static ArrayList<C2358b> f7711b = new ArrayList();
    private static String f7712j;
    private static C2354h f7713o;
    C0991o f7714a;
    ArrayList<C2361e> f7715c = new ArrayList();
    private Context f7716d;
    private C2356v f7717e;
    private String f7718f;
    private int f7719g;
    private Integer f7720h;
    private String f7721i;
    private HashSet<C2348e> f7722k = new HashSet();
    private HashSet<C2346c> f7723l = new HashSet();
    private HashSet<C2353j> f7724m = new HashSet();
    private HashSet<C2352i> f7725n = new HashSet();

    private C2354h(Context context) {
        this.f7716d = context;
        this.f7714a = C0976k.m2434a(context);
        this.f7717e = new C2356v();
    }

    public static C2354h m6385a(Context context) {
        if (f7713o == null) {
            f7713o = new C2354h(context);
        }
        return f7713o;
    }

    public static void m6389b(Context context) {
        f7713o = new C2354h(context);
    }

    public String m6390a() {
        return f7712j;
    }

    public void m6391a(int i) {
        this.f7720h = Integer.valueOf(i);
    }

    public void m6392a(C2346c c2346c) {
        this.f7723l.add(c2346c);
    }

    public void m6393a(C2348e c2348e) {
        if (!this.f7722k.contains(c2348e)) {
            this.f7722k.add(c2348e);
        }
    }

    public void m6394a(C2353j c2353j) {
        if (!this.f7724m.contains(c2353j)) {
            this.f7724m.add(c2353j);
        }
    }

    public void m6395a(C2364h c2364h) {
        Log.d("*******************", "sad1111");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Token", this.f7718f);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C0989n c7152k = new C7152k(this, 1, this.f7717e.f7736a, jSONObject, new C5732i(this), new C5733j(this));
        c7152k.setRetryPolicy(new C5058d(35000));
        this.f7714a.m2442a(c7152k);
    }

    public void m6396a(C2369m c2369m, String str, String str2, String str3, String str4) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("/");
        stringBuilder.append(str2);
        String stringBuilder2 = stringBuilder.toString();
        JSONObject jSONObject = new JSONObject();
        try {
            if (C5740v.f15729c) {
                jSONObject.put("CardToken", C5740v.f15730d);
            }
            jSONObject.put("PayInfo", c2369m.m6512a());
            jSONObject.put("Token", this.f7718f);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C0989n c7153n = new C7153n(this, 1, stringBuilder2, jSONObject, new C5734l(this), new C5735m(this));
        c7153n.setRetryPolicy(new C5058d(35000));
        this.f7714a.m2442a(c7153n);
    }

    public void m6397a(C2371o c2371o, String str, int i, boolean z, int i2) {
        if (this.f7722k != null) {
            Iterator it = this.f7722k.iterator();
            while (it.hasNext()) {
                C2348e c2348e = (C2348e) it.next();
                if (!z && c2348e != null) {
                    c2348e.mo2078b(c2371o, str, i);
                } else if (z && c2348e != null) {
                    c2348e.mo2071a(i2, Integer.valueOf(this.f7719g));
                }
            }
        }
    }

    public void m6398a(String str) {
        this.f7718f = str;
    }

    public void m6399a(String str, int i, boolean z, int i2) {
        if (this.f7722k != null) {
            Iterator it = this.f7725n.iterator();
            while (it.hasNext()) {
                C2352i c2352i = (C2352i) it.next();
                if (!z && c2352i != null) {
                    c2352i.m6382a(str, i);
                } else if (z && c2352i != null) {
                    c2352i.m6381a(i2);
                }
            }
        }
    }

    public void m6400a(String str, String str2, int i, boolean z, int i2) {
        if (this.f7724m != null) {
            Iterator it = this.f7724m.iterator();
            while (it.hasNext()) {
                C2353j c2353j = (C2353j) it.next();
                if (!z && c2353j != null) {
                    c2353j.mo2081c(str, str2, i);
                } else if (z && c2353j != null) {
                    c2353j.mo2076b(i2, Integer.valueOf(m6407d()));
                }
            }
        }
    }

    public void m6401a(String str, String str2, int i, boolean z, int i2, ArrayList<C2361e> arrayList) {
        if (this.f7723l != null) {
            Iterator it = this.f7723l.iterator();
            while (it.hasNext()) {
                C2346c c2346c = (C2346c) it.next();
                if (!z && c2346c != null) {
                    c2346c.mo2084a(str, str2, i, arrayList, z, i2);
                } else if (z && c2346c != null) {
                    c2346c.mo2085b(i2);
                }
            }
        }
    }

    public String m6402b() {
        return this.f7721i;
    }

    public void m6403b(int i) {
        this.f7719g = i;
    }

    public void m6404b(ir.pec.mpl.pecpayment.p209a.p211b.C2346c r2) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r1 = this;
        r0 = r1.f7723l;	 Catch:{ Exception -> 0x0005 }
        r0.remove(r2);	 Catch:{ Exception -> 0x0005 }
    L_0x0005:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.pec.mpl.pecpayment.a.h.b(ir.pec.mpl.pecpayment.a.b.c):void");
    }

    public void m6405b(C2348e c2348e) {
        this.f7722k.remove(c2348e);
    }

    public int m6406c() {
        return this.f7720h.intValue();
    }

    public int m6407d() {
        return this.f7719g;
    }

    public void m6408e() {
        C0991o c0991o = this.f7714a;
        Context context = this.f7716d;
        if (context == null) {
            throw new IllegalArgumentException("Cannot cancelAll with a null tag");
        }
        c0991o.m2444a(new C50631(c0991o, context));
    }
}
