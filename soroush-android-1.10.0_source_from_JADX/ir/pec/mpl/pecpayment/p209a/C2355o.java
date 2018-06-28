package ir.pec.mpl.pecpayment.p209a;

import android.content.Context;
import com.p067a.p070b.C0989n;
import com.p067a.p070b.C0991o;
import com.p067a.p070b.C5058d;
import com.p067a.p070b.p071a.C0976k;
import ir.pec.mpl.pecpayment.p209a.p211b.C2349f;
import ir.pec.mpl.pecpayment.p209a.p211b.C2350g;
import ir.pec.mpl.pecpayment.p209a.p211b.C2351h;
import ir.pec.mpl.pecpayment.p212b.p213a.C2361e;
import ir.pec.mpl.pecpayment.p212b.p213a.C2366j;
import ir.pec.mpl.pecpayment.p212b.p213a.C2369m;
import ir.pec.mpl.pecpayment.p212b.p213a.C2371o;
import ir.pec.mpl.pecpayment.view.C5740v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class C2355o {
    static C0991o f7726a;
    public static String f7727b;
    private static C2355o f7728d;
    private static C2356v f7729e;
    private static String f7730g;
    ArrayList<C2361e> f7731c = new ArrayList();
    private Context f7732f;
    private HashSet<C2349f> f7733h = new HashSet();
    private HashSet<C2350g> f7734i = new HashSet();
    private HashSet<C2351h> f7735j = new HashSet();

    private C2355o(Context context) {
        this.f7732f = context;
    }

    public static C2355o m6409a(Context context) {
        f7726a = C0976k.m2434a(context);
        f7729e = new C2356v();
        if (f7728d == null) {
            f7728d = new C2355o(context);
        }
        return f7728d;
    }

    public static void m6412b(Context context) {
        f7726a = C0976k.m2434a(context);
        f7729e = new C2356v();
        f7728d = new C2355o(context);
    }

    public String m6413a() {
        return f7730g;
    }

    public void m6414a(ir.pec.mpl.pecpayment.p209a.p211b.C2344a r2) {
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
        r0 = r1.f7734i;	 Catch:{ Exception -> 0x0005 }
        r0.remove(r2);	 Catch:{ Exception -> 0x0005 }
    L_0x0005:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.pec.mpl.pecpayment.a.o.a(ir.pec.mpl.pecpayment.a.b.a):void");
    }

    public void m6415a(C2349f c2349f) {
        this.f7733h.add(c2349f);
    }

    public void m6416a(C2350g c2350g) {
        this.f7734i.add(c2350g);
    }

    public void m6417a(C2351h c2351h) {
        if (!this.f7735j.contains(c2351h)) {
            this.f7735j.add(c2351h);
        }
    }

    public void m6418a(C2366j c2366j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Token", c2366j.m6486a());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C0989n c7154r = new C7154r(this, 1, f7729e.f7738c, jSONObject, new C5736p(this), new C5737q(this));
        c7154r.setRetryPolicy(new C5058d(35000));
        f7726a.m2442a(c7154r);
    }

    public void m6419a(C2369m c2369m, String str, String str2, String str3, String str4) {
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
        C0989n c7155u = new C7155u(this, 1, stringBuilder2, jSONObject, new C5738s(this), new C5739t(this));
        c7155u.setRetryPolicy(new C5058d(35000));
        f7726a.m2442a(c7155u);
    }

    public void m6420a(C2371o c2371o, String str, int i, boolean z, int i2) {
        if (this.f7733h != null) {
            Iterator it = this.f7733h.iterator();
            while (it.hasNext()) {
                C2349f c2349f = (C2349f) it.next();
                if (!z && c2349f != null) {
                    c2349f.mo2080c(c2371o, str, i);
                } else if (z && c2349f != null) {
                    c2349f.mo2077b(i2, str);
                }
            }
        }
    }

    public void m6421a(C2371o c2371o, String str, int i, boolean z, int i2, ArrayList<C2361e> arrayList) {
        if (this.f7734i != null) {
            Iterator it = this.f7734i.iterator();
            while (it.hasNext()) {
                C2350g c2350g = (C2350g) it.next();
                if (!z && c2350g != null) {
                    c2350g.mo2086b(c2371o, str, i, arrayList, z, i2);
                } else if (z && c2350g != null) {
                    c2350g.mo2087c(i2);
                }
            }
        }
    }

    public void m6422a(String str, String str2, int i, boolean z, int i2) {
        if (this.f7735j != null) {
            Iterator it = this.f7735j.iterator();
            while (it.hasNext()) {
                C2351h c2351h = (C2351h) it.next();
                if (!z && c2351h != null) {
                    c2351h.mo2079b(str, str2, i);
                } else if (z && c2351h != null) {
                    c2351h.mo2075b(i2);
                }
            }
        }
    }

    public void m6423b(C2349f c2349f) {
        this.f7733h.remove(c2349f);
    }
}
