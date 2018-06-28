package ir.pec.mpl.pecpayment.view;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.Toast;
import ir.pec.mpl.pecpayment.C2338R;
import ir.pec.mpl.pecpayment.p209a.C2343a;
import ir.pec.mpl.pecpayment.p209a.C2354h;
import ir.pec.mpl.pecpayment.p209a.C2355o;
import ir.pec.mpl.pecpayment.p209a.p210a.C2340b;
import ir.pec.mpl.pecpayment.p209a.p210a.C2341c;
import ir.pec.mpl.pecpayment.p209a.p211b.C2345b;
import ir.pec.mpl.pecpayment.p209a.p211b.C2347d;
import ir.pec.mpl.pecpayment.p209a.p211b.C2348e;
import ir.pec.mpl.pecpayment.p209a.p211b.C2349f;
import ir.pec.mpl.pecpayment.p209a.p211b.C2351h;
import ir.pec.mpl.pecpayment.p209a.p211b.C2353j;
import ir.pec.mpl.pecpayment.p212b.p213a.C2362f;
import ir.pec.mpl.pecpayment.p212b.p213a.C2363g;
import ir.pec.mpl.pecpayment.p212b.p213a.C2364h;
import ir.pec.mpl.pecpayment.p212b.p213a.C2365i;
import ir.pec.mpl.pecpayment.p212b.p213a.C2366j;
import ir.pec.mpl.pecpayment.p212b.p213a.C2367k;
import ir.pec.mpl.pecpayment.p212b.p213a.C2371o;
import java.util.ArrayList;
import java.util.HashMap;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smackx.muc.packet.MUCUser.Status;

public class PaymentInitiator extends Activity implements C2345b, C2347d, C2348e, C2349f, C2351h, C2353j {
    public static Integer f15711a = null;
    public static boolean f15712b = false;
    private static Context f15713c = null;
    private static String f15714d = null;
    private static Bitmap f15715g = null;
    private static C5740v f15716l = null;
    private static String f15717m = "fa";
    private static boolean f15718p = false;
    private static boolean f15719q = false;
    private long f15720e;
    private boolean f15721f = false;
    private String f15722h;
    private String f15723i;
    private int f15724j;
    private String f15725k;
    private ProgressDialog f15726n;
    private String f15727o = "pec.root.satate";

    private void m12800a(String str, Bitmap bitmap) {
        C2362f c2362f = new C2362f();
        c2362f.m6444a(this.f15720e);
        c2362f.m6445a(str);
        f15714d = str;
        f15715g = bitmap;
        f15718p = true;
        C2343a.m6350a(f15713c).m6356a((C2347d) f15713c);
        C2343a.m6350a(f15713c).m6358a(c2362f);
        this.f15726n.setMessage("در حال اتصال به درگاه ، لطفا منتظر بمانید ...");
        this.f15726n.setCancelable(false);
        this.f15726n.setButton(-2, "بی خیال", new bb(this));
        this.f15726n.show();
    }

    private void m12801a(String str, String str2, String str3, String str4, String str5, ArrayList<String> arrayList, ArrayList<String> arrayList2, String str6, Boolean bool) {
        PaymentInitiator paymentInitiator = this;
        Point point;
        Display defaultDisplay;
        if (f15718p) {
            C5740v c5740v = r0;
            C5740v c5740v2 = new C5740v(f15713c, f15714d, true, paymentInitiator.f15722h, paymentInitiator.f15725k, paymentInitiator.f15720e, str2, str, str3, str4, str5, f15715g, str6, (ArrayList) arrayList, (ArrayList) arrayList2, (Activity) this, bool);
            c5740v2 = c5740v;
            f15716l = c5740v2;
            c5740v2.show();
            LayoutParams layoutParams = new LayoutParams();
            Window window = f15716l.getWindow();
            layoutParams.copyFrom(window.getAttributes());
            point = new Point();
            defaultDisplay = ((WindowManager) f15713c.getSystemService("window")).getDefaultDisplay();
            if (VERSION.SDK_INT >= 13) {
                defaultDisplay.getSize(point);
            }
            int i = point.x;
            int i2 = point.y;
            layoutParams.width = (i * 4) / 5;
            layoutParams.height = -2;
            window.setAttributes(layoutParams);
            f15718p = false;
            f15719q = false;
            return;
        }
        int i3 = 13;
        if (f15719q) {
            C5740v c5740v3 = c5740v2;
            c5740v2 = new C5740v(f15713c, f15714d, this.f15723i, this.f15720e, str2, str, str3, str4, str5, f15715g, str6, (ArrayList) arrayList, (ArrayList) arrayList2, true, this.f15724j, (Activity) this, bool);
            c5740v2 = c5740v3;
            f15716l = c5740v2;
            c5740v2.show();
            layoutParams = new LayoutParams();
            window = f15716l.getWindow();
            layoutParams.copyFrom(window.getAttributes());
            point = new Point();
            defaultDisplay = ((WindowManager) f15713c.getSystemService("window")).getDefaultDisplay();
            if (VERSION.SDK_INT >= 13) {
                defaultDisplay.getSize(point);
            }
            i = point.x;
            i2 = point.y;
            layoutParams.width = (i * 4) / 5;
            layoutParams.height = -2;
            window.setAttributes(layoutParams);
            f15718p = false;
            f15719q = false;
            return;
        }
        C5740v c5740v4 = c5740v2;
        c5740v2 = new C5740v(f15713c, f15714d, this.f15720e, str2, str, str3, str4, str5, f15715g, str6, arrayList, arrayList2, this, bool);
        c5740v2 = c5740v4;
        f15716l = c5740v2;
        c5740v2.show();
        layoutParams = new LayoutParams();
        window = f15716l.getWindow();
        layoutParams.copyFrom(window.getAttributes());
        point = new Point();
        defaultDisplay = ((WindowManager) f15713c.getSystemService("window")).getDefaultDisplay();
        if (VERSION.SDK_INT >= 13) {
            defaultDisplay.getSize(point);
        }
        i = point.x;
        i2 = point.y;
        layoutParams.width = (i * 4) / 5;
        layoutParams.height = -2;
        window.setAttributes(layoutParams);
    }

    private void m12805b(String str, Bitmap bitmap) {
        C2366j c2366j = new C2366j();
        c2366j.m6487a(this.f15720e);
        c2366j.m6488a(str);
        f15714d = str;
        f15715g = bitmap;
        f15719q = true;
        C2355o.m6409a(f15713c).m6415a((C2349f) f15713c);
        C2355o.m6409a(f15713c).m6418a(c2366j);
        this.f15726n.setMessage("در حال اتصال به درگاه ، لطفا منتظر بمانید ...");
        this.f15726n.setCancelable(false);
        this.f15726n.setButton(-2, "بی خیال", new bc(this));
        this.f15726n.show();
    }

    public void m12809a() {
        f15716l.dismiss();
    }

    public void mo2070a(int i) {
        f15718p = false;
        f15719q = false;
        f15712b = false;
        C2343a.m6350a(f15713c).m6357a((C2348e) this);
        Intent intent = new Intent();
        intent.putExtra("errorType", i);
        intent.putExtra("state", 4);
        setResult(4, intent);
        C2343a.m6352b(f15713c);
        C2355o.m6412b(f15713c);
        C2354h.m6389b(f15713c);
        finish();
    }

    public void mo2071a(int i, Integer num) {
        f15718p = false;
        f15712b = false;
        this.f15726n.dismiss();
        Intent intent = new Intent();
        intent.putExtra("errorType", i);
        intent.putExtra("OrderID", num);
        setResult(5, intent);
        C2354h.m6385a(f15713c).m6405b((C2348e) this);
        C2343a.m6352b(f15713c);
        C2355o.m6412b(f15713c);
        C2354h.m6389b(f15713c);
        finish();
    }

    public void mo2072a(int i, String str) {
        f15718p = false;
        f15712b = false;
        this.f15726n.dismiss();
        Intent intent = new Intent();
        intent.putExtra("errorType", i);
        setResult(6, intent);
        C2343a.m6352b(f15713c);
        C2355o.m6412b(f15713c);
        C2354h.m6389b(f15713c);
        finish();
    }

    public void m12813a(C2345b c2345b) {
        C2343a.m6350a(f15713c).m6355a(c2345b);
    }

    public void m12814a(C2353j c2353j) {
        C2354h.m6385a(f15713c).m6394a(c2353j);
    }

    public void mo2073a(C2371o c2371o, String str, int i) {
        this.f15726n.dismiss();
        C2363g c2363g;
        HashMap a;
        if (C2341c.m6344a()) {
            this.f15726n.dismiss();
            if (getSharedPreferences(this.f15727o, 0).getString("rooted", "no").equals("yes")) {
                c2363g = (C2363g) c2371o.m6527c();
                if (i != 0) {
                    Toast.makeText(f15713c, str, 0).show();
                    return;
                }
                a = C2340b.m6342a(c2363g.m6459g());
                if (!f15712b) {
                    f15712b = true;
                    this.f15722h = ((C2363g) c2371o.m6527c()).m6453d();
                    this.f15725k = ((C2363g) c2371o.m6527c()).m6451c();
                    m12801a(c2363g.m6461h(), c2363g.m6463i(), c2363g.m6465j(), (String) a.get("Exponent"), (String) a.get("Modulus"), c2363g.m6457f(), c2363g.m6449b(), c2363g.m6455e(), c2363g.m6446a());
                    C2343a.m6350a(f15713c).m6357a((C2348e) f15713c);
                }
                return;
            } else if (VERSION.SDK_INT >= 11) {
                new Builder(f15713c, C2338R.style.AppCompatAlertDialogStyle).setTitle("هشدار").setMessage(C2338R.string.rooted).setPositiveButton("انصراف", new bg(this)).setNegativeButton("ادامه", new bf(this, c2371o, i, str)).show();
                return;
            } else {
                Toast.makeText(f15713c, C2338R.string.root_string, 0).show();
                C2343a.m6350a(f15713c).m6362a(null, null, -1, true, 2334);
                f15718p = false;
                f15712b = false;
                return;
            }
        }
        c2363g = (C2363g) c2371o.m6527c();
        if (i != 0) {
            Toast.makeText(f15713c, str, 0).show();
            return;
        }
        a = C2340b.m6342a(c2363g.m6459g());
        if (this.f15721f) {
            this.f15721f = false;
            f15712b = false;
            f15718p = false;
            f15719q = false;
        } else if (!f15712b) {
            f15712b = true;
            this.f15722h = ((C2363g) c2371o.m6527c()).m6453d();
            this.f15725k = ((C2363g) c2371o.m6527c()).m6451c();
            m12801a(c2363g.m6461h(), c2363g.m6463i(), c2363g.m6465j(), (String) a.get("Exponent"), (String) a.get("Modulus"), c2363g.m6457f(), c2363g.m6449b(), c2363g.m6455e(), c2363g.m6446a());
            C2343a.m6350a(f15713c).m6357a((C2348e) f15713c);
        }
    }

    public void m12816a(String str, int i) {
        C2364h c2364h = new C2364h();
        c2364h.m6466a(this.f15720e);
        c2364h.m6467a(str);
        f15714d = str;
        C2354h.m6385a(f15713c).m6398a(str);
        C2354h.m6385a(f15713c).m6403b(i);
        C2354h.m6385a(f15713c).m6393a((C2348e) f15713c);
        C2354h.m6385a(f15713c).m6395a(c2364h);
        this.f15726n.setMessage("در حال اتصال به درگاه ، لطفا منتظر بمانید ...");
        this.f15726n.setCancelable(false);
        this.f15726n.setButton(-2, "بی خیال", new ba(this));
        this.f15726n.show();
    }

    public void mo2074a(String str, String str2, int i) {
        C2343a.m6350a(f15713c).m6357a((C2348e) this);
        f15718p = false;
        f15719q = false;
        f15712b = false;
        Intent intent = new Intent();
        intent.putExtra("enData", str);
        intent.putExtra(Message.ELEMENT, str2);
        intent.putExtra(Status.ELEMENT, i);
        intent.putExtra("state", 3);
        setResult(3, intent);
        C2343a.m6352b(f15713c);
        C2355o.m6412b(f15713c);
        C2354h.m6389b(f15713c);
        finish();
    }

    public void m12818b() {
        f15718p = false;
    }

    public void mo2075b(int i) {
        f15718p = false;
        f15719q = false;
        f15712b = false;
        C2355o.m6409a(f15713c).m6423b((C2349f) this);
        Intent intent = new Intent();
        intent.putExtra("errorType", i);
        intent.putExtra("state", 6);
        setResult(8, intent);
        C2343a.m6352b(f15713c);
        C2355o.m6412b(f15713c);
        C2354h.m6389b(f15713c);
        finish();
    }

    public void mo2076b(int i, Integer num) {
        f15718p = false;
        f15712b = false;
        Intent intent = new Intent();
        intent.putExtra("errorType", i);
        intent.putExtra("OrderID", num);
        intent.putExtra("state", 2);
        setResult(2, intent);
        C2354h.m6385a(f15713c).m6405b((C2348e) this);
        C2343a.m6352b(f15713c);
        C2355o.m6412b(f15713c);
        C2354h.m6389b(f15713c);
        finish();
    }

    public void mo2077b(int i, String str) {
        f15718p = false;
        f15719q = false;
        f15712b = false;
        this.f15726n.dismiss();
        Intent intent = new Intent();
        intent.putExtra("errorType", i);
        setResult(9, intent);
        C2343a.m6352b(f15713c);
        C2355o.m6412b(f15713c);
        C2354h.m6389b(f15713c);
        finish();
    }

    public void mo2078b(C2371o c2371o, String str, int i) {
        this.f15726n.dismiss();
        C2365i c2365i;
        HashMap a;
        if (C2341c.m6344a()) {
            this.f15726n.dismiss();
            if (getSharedPreferences(this.f15727o, 0).getString("rooted", "no").equals("yes")) {
                c2365i = (C2365i) c2371o.m6527c();
                if (i != 0) {
                    Toast.makeText(f15713c, "خasdasd", 0).show();
                    return;
                }
                a = C2340b.m6342a(c2365i.m6480f());
                if (!f15712b) {
                    f15712b = true;
                    m12801a(c2365i.m6482g(), c2365i.m6484h(), c2365i.m6485i(), (String) a.get("Exponent"), (String) a.get("Modulus"), c2365i.m6476d(), c2365i.m6474c(), c2365i.m6472b(), c2365i.m6468a());
                    C2354h.m6385a(f15713c).m6405b((C2348e) f15713c);
                }
                return;
            } else if (VERSION.SDK_INT >= 11) {
                new Builder(f15713c, C2338R.style.AppCompatAlertDialogStyle).setTitle("هشدار").setMessage(C2338R.string.rooted).setPositiveButton("انصراف", new be(this)).setNegativeButton("ادامه", new bd(this, c2371o, i)).show();
                return;
            } else {
                Toast.makeText(f15713c, C2338R.string.root_string, 0).show();
                C2354h.m6385a(f15713c).m6400a(null, null, -1, true, 2334);
                f15718p = false;
                f15712b = false;
                return;
            }
        }
        c2365i = (C2365i) c2371o.m6527c();
        if (i != 0) {
            Context context = f15713c;
            StringBuilder stringBuilder = new StringBuilder(" خطایی رخ داده با شماره خطای ");
            stringBuilder.append(Integer.toString(i));
            Toast.makeText(context, stringBuilder.toString(), 0).show();
            return;
        }
        a = C2340b.m6342a(c2365i.m6480f());
        if (this.f15721f) {
            this.f15721f = false;
            f15718p = false;
            f15719q = false;
            f15712b = false;
        } else if (!f15712b) {
            f15712b = true;
            m12801a(c2365i.m6482g(), c2365i.m6484h(), c2365i.m6485i(), (String) a.get("Exponent"), (String) a.get("Modulus"), c2365i.m6476d(), c2365i.m6474c(), c2365i.m6472b(), c2365i.m6468a());
            C2354h.m6385a(f15713c).m6405b((C2348e) f15713c);
        }
    }

    public void mo2079b(String str, String str2, int i) {
        C2355o.m6409a(f15713c).m6423b((C2349f) this);
        f15718p = false;
        f15719q = false;
        f15712b = false;
        Intent intent = new Intent();
        intent.putExtra("enData", str);
        intent.putExtra(Message.ELEMENT, str2);
        intent.putExtra(Status.ELEMENT, i);
        intent.putExtra("state", 5);
        setResult(7, intent);
        C2343a.m6352b(f15713c);
        C2355o.m6412b(f15713c);
        C2354h.m6389b(f15713c);
        finish();
    }

    public void mo2080c(C2371o c2371o, String str, int i) {
        this.f15726n.dismiss();
        C2367k c2367k;
        HashMap a;
        if (C2341c.m6344a()) {
            this.f15726n.dismiss();
            if (getSharedPreferences(this.f15727o, 0).getString("rooted", "no").equals("yes")) {
                c2367k = (C2367k) c2371o.m6527c();
                if (i != 0) {
                    Toast.makeText(f15713c, str, 0).show();
                    return;
                }
                a = C2340b.m6342a(c2367k.m6503g());
                if (!f15712b) {
                    f15712b = true;
                    this.f15723i = ((C2367k) c2371o.m6527c()).m6497d();
                    this.f15724j = ((C2367k) c2371o.m6527c()).m6495c();
                    m12801a(c2367k.m6505h(), c2367k.m6507i(), c2367k.m6508j(), (String) a.get("Exponent"), (String) a.get("Modulus"), c2367k.m6501f(), c2367k.m6493b(), c2367k.m6499e(), c2367k.m6489a());
                    C2355o.m6409a(f15713c).m6423b((C2349f) f15713c);
                }
                return;
            } else if (VERSION.SDK_INT >= 11) {
                new Builder(f15713c, C2338R.style.AppCompatAlertDialogStyle).setTitle("هشدار").setMessage(C2338R.string.rooted).setPositiveButton("انصراف", new bi(this)).setNegativeButton("ادامه", new bh(this, c2371o, i, str)).show();
                return;
            } else {
                Toast.makeText(f15713c, C2338R.string.root_string, 0).show();
                C2355o.m6409a(f15713c).m6422a(null, null, -1, true, 2334);
                f15718p = false;
                f15719q = false;
                f15712b = false;
                return;
            }
        }
        c2367k = (C2367k) c2371o.m6527c();
        if (i != 0) {
            Toast.makeText(f15713c, str, 0).show();
            return;
        }
        a = C2340b.m6342a(c2367k.m6503g());
        if (this.f15721f) {
            this.f15721f = false;
            f15712b = false;
            f15718p = false;
            f15719q = false;
        } else if (!f15712b) {
            f15712b = true;
            this.f15723i = ((C2367k) c2371o.m6527c()).m6497d();
            this.f15724j = ((C2367k) c2371o.m6527c()).m6495c();
            m12801a(c2367k.m6505h(), c2367k.m6507i(), c2367k.m6508j(), (String) a.get("Exponent"), (String) a.get("Modulus"), c2367k.m6501f(), c2367k.m6493b(), c2367k.m6499e(), c2367k.m6489a());
            C2355o.m6409a(f15713c).m6423b((C2349f) f15713c);
        }
    }

    public void mo2081c(String str, String str2, int i) {
        f15718p = false;
        f15712b = false;
        Intent intent = new Intent();
        intent.putExtra("enData", str);
        intent.putExtra(Message.ELEMENT, str2);
        intent.putExtra(Status.ELEMENT, i);
        intent.putExtra("state", 1);
        setResult(1, intent);
        C2343a.m6352b(f15713c);
        C2355o.m6412b(f15713c);
        C2354h.m6389b(f15713c);
        finish();
    }

    protected void onCreate(android.os.Bundle r4) {
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
        super.onCreate(r4);
        f15713c = r3;
        r4 = f15713c;
        r4 = (ir.pec.mpl.pecpayment.p209a.p211b.C2353j) r4;
        r3.m12814a(r4);
        r4 = f15713c;
        r4 = (ir.pec.mpl.pecpayment.p209a.p211b.C2345b) r4;
        r3.m12813a(r4);
        r4 = f15713c;
        r4 = ir.pec.mpl.pecpayment.p209a.C2355o.m6409a(r4);
        r0 = f15713c;
        r0 = (ir.pec.mpl.pecpayment.p209a.p211b.C2351h) r0;
        r4.m6417a(r0);
        r4 = android.os.Build.VERSION.SDK_INT;
        r0 = 11;
        if (r4 < r0) goto L_0x0030;
    L_0x0026:
        r4 = new android.app.ProgressDialog;
        r0 = ir.pec.mpl.pecpayment.C2338R.style.AppCompatAlertDialogStyle;
        r4.<init>(r3, r0);
    L_0x002d:
        r3.f15726n = r4;
        goto L_0x0036;
    L_0x0030:
        r4 = new android.app.ProgressDialog;
        r4.<init>(r3);
        goto L_0x002d;
    L_0x0036:
        r4 = r3.getIntent();
        r0 = "Type";
        r0 = r4.getStringExtra(r0);
        r1 = "1";
        r1 = r0.equals(r1);
        r2 = 0;
        if (r1 == 0) goto L_0x0071;
    L_0x0049:
        r0 = "Token";	 Catch:{ Exception -> 0x0065 }
        r0 = r4.getStringExtra(r0);	 Catch:{ Exception -> 0x0065 }
        r1 = "OrderID";	 Catch:{ Exception -> 0x0065 }
        r4 = r4.getIntExtra(r1, r2);	 Catch:{ Exception -> 0x0065 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ Exception -> 0x0065 }
        f15711a = r4;	 Catch:{ Exception -> 0x0065 }
        r4 = f15711a;	 Catch:{ Exception -> 0x0065 }
        r4 = r4.intValue();	 Catch:{ Exception -> 0x0065 }
        r3.m12816a(r0, r4);	 Catch:{ Exception -> 0x0065 }
        return;
    L_0x0065:
        r4 = f15713c;
        r0 = "خطایی رخ داده";
        r4 = android.widget.Toast.makeText(r4, r0, r2);
        r4.show();
        return;
    L_0x0071:
        r1 = "2";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0085;
    L_0x0079:
        r0 = "Token";	 Catch:{ Exception -> 0x0065 }
        r4 = r4.getStringExtra(r0);	 Catch:{ Exception -> 0x0065 }
        r0 = f15715g;	 Catch:{ Exception -> 0x0065 }
        r3.m12800a(r4, r0);	 Catch:{ Exception -> 0x0065 }
        return;
    L_0x0085:
        r1 = "3";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x00a4;
    L_0x008d:
        r0 = "Token";	 Catch:{ Exception -> 0x0099 }
        r4 = r4.getStringExtra(r0);	 Catch:{ Exception -> 0x0099 }
        r0 = f15715g;	 Catch:{ Exception -> 0x0099 }
        r3.m12805b(r4, r0);	 Catch:{ Exception -> 0x0099 }
        return;
    L_0x0099:
        r4 = f15713c;
        r0 = "خطایی رخ داده";
        r4 = android.widget.Toast.makeText(r4, r0, r2);
        r4.show();
    L_0x00a4:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.pec.mpl.pecpayment.view.PaymentInitiator.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        this.f15726n.dismiss();
    }

    protected void onResume() {
        super.onResume();
        this.f15721f = false;
    }
}
