package ir.pec.mpl.pecpayment.p209a;

import android.content.Context;
import com.p067a.p070b.C0989n;
import com.p067a.p070b.C0991o;
import com.p067a.p070b.C5058d;
import com.p067a.p070b.p071a.C0976k;
import ir.pec.mpl.pecpayment.p209a.p211b.C2344a;
import ir.pec.mpl.pecpayment.p209a.p211b.C2345b;
import ir.pec.mpl.pecpayment.p209a.p211b.C2347d;
import ir.pec.mpl.pecpayment.p209a.p211b.C2348e;
import ir.pec.mpl.pecpayment.p212b.p213a.C2361e;
import ir.pec.mpl.pecpayment.p212b.p213a.C2362f;
import ir.pec.mpl.pecpayment.p212b.p213a.C2369m;
import ir.pec.mpl.pecpayment.p212b.p213a.C2371o;
import ir.pec.mpl.pecpayment.view.C5740v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class C2343a {
    static C0991o f7701a;
    public static String f7702b;
    private static C2343a f7703d;
    private static C2356v f7704e;
    private static String f7705f;
    ArrayList<C2361e> f7706c = new ArrayList();
    private Context f7707g;
    private HashSet<C2347d> f7708h = new HashSet();
    private HashSet<C2344a> f7709i = new HashSet();
    private HashSet<C2345b> f7710j = new HashSet();

    private C2343a(Context context) {
        this.f7707g = context;
    }

    public static C2343a m6350a(Context context) {
        f7701a = C0976k.m2434a(context);
        f7704e = new C2356v();
        if (f7703d == null) {
            f7703d = new C2343a(context);
        }
        return f7703d;
    }

    public static void m6352b(Context context) {
        f7701a = C0976k.m2434a(context);
        f7704e = new C2356v();
        f7703d = new C2343a(context);
    }

    public String m6353a() {
        return f7705f;
    }

    public void m6354a(C2344a c2344a) {
        this.f7709i.add(c2344a);
    }

    public void m6355a(C2345b c2345b) {
        if (!this.f7710j.contains(c2345b)) {
            this.f7710j.add(c2345b);
        }
    }

    public void m6356a(C2347d c2347d) {
        this.f7708h.add(c2347d);
    }

    public void m6357a(C2348e c2348e) {
        this.f7708h.remove(c2348e);
    }

    public void m6358a(C2362f c2362f) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Token", c2362f.m6443a());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C0989n c7150d = new C7150d(this, 1, f7704e.f7737b, jSONObject, new C5728b(this), new C5729c(this));
        c7150d.setRetryPolicy(new C5058d(35000));
        f7701a.m2442a(c7150d);
    }

    public void m6359a(C2369m c2369m, String str, String str2, String str3, String str4) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("/");
        stringBuilder.append(str2);
        String stringBuilder2 = stringBuilder.toString();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Token", c2369m.m6517b());
            if (C5740v.f15729c) {
                jSONObject.put("CardToken", C5740v.f15730d);
            }
            jSONObject.put("PayInfo", c2369m.m6512a());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C0989n c7151g = new C7151g(this, 1, stringBuilder2, jSONObject, new C5730e(this), new C5731f(this), c2369m);
        c7151g.setRetryPolicy(new C5058d(35000));
        f7701a.m2442a(c7151g);
    }

    public void m6360a(C2371o c2371o, String str, int i, boolean z, int i2) {
        if (this.f7708h != null) {
            Iterator it = this.f7708h.iterator();
            while (it.hasNext()) {
                C2347d c2347d = (C2347d) it.next();
                if (!z && c2347d != null) {
                    c2347d.mo2073a(c2371o, str, i);
                } else if (z && c2347d != null) {
                    c2347d.mo2072a(i2, str);
                }
            }
        }
    }

    public void m6361a(C2371o c2371o, String str, int i, boolean z, int i2, ArrayList<C2361e> arrayList) {
        if (this.f7709i != null) {
            Iterator it = this.f7709i.iterator();
            while (it.hasNext()) {
                C2344a c2344a = (C2344a) it.next();
                if (!z && c2344a != null) {
                    c2344a.mo2083a(c2371o, str, i, arrayList, z, i2);
                } else if (z && c2344a != null) {
                    c2344a.mo2082a(i2);
                }
            }
        }
    }

    public void m6362a(String str, String str2, int i, boolean z, int i2) {
        if (this.f7710j != null) {
            Iterator it = this.f7710j.iterator();
            while (it.hasNext()) {
                C2345b c2345b = (C2345b) it.next();
                if (!z && c2345b != null) {
                    c2345b.mo2074a(str, str2, i);
                } else if (z && c2345b != null) {
                    c2345b.mo2070a(i2);
                }
            }
        }
    }

    public String m6363b() {
        return f7702b;
    }

    public void m6364b(ir.pec.mpl.pecpayment.p209a.p211b.C2344a r2) {
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
        r0 = r1.f7709i;	 Catch:{ Exception -> 0x0005 }
        r0.remove(r2);	 Catch:{ Exception -> 0x0005 }
    L_0x0005:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.pec.mpl.pecpayment.a.a.b(ir.pec.mpl.pecpayment.a.b.a):void");
    }
}
