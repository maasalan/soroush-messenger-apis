package ir.pec.mpl.pecpayment.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Environment;
import android.os.Parcelable;
import android.view.View;
import android.view.WindowManager.LayoutParams;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import ir.pec.mpl.pecpayment.C2338R;
import ir.pec.mpl.pecpayment.p209a.C2343a;
import ir.pec.mpl.pecpayment.p209a.C2354h;
import ir.pec.mpl.pecpayment.p209a.C2355o;
import ir.pec.mpl.pecpayment.p209a.p211b.C2344a;
import ir.pec.mpl.pecpayment.p209a.p211b.C2346c;
import ir.pec.mpl.pecpayment.p209a.p211b.C2350g;
import ir.pec.mpl.pecpayment.p212b.p213a.C2361e;
import ir.pec.mpl.pecpayment.p212b.p213a.C2371o;
import ir.pec.mpl.pecpayment.view.p214a.C2374b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public class C5740v extends Dialog implements C2344a, C2346c, C2350g {
    public static ScrollView f15728b = null;
    public static boolean f15729c = false;
    public static String f15730d;
    private List<C2361e> f15731A = new ArrayList();
    private C2374b f15732B;
    private List<String> f15733C = new ArrayList();
    private List<String> f15734D = new ArrayList();
    private HashMap<String, Integer> f15735E = new HashMap();
    private HashMap<String, String> f15736F = new HashMap();
    private CheckBox f15737G;
    private TextView f15738H;
    private TextView f15739I;
    private TextView f15740J;
    private ImageView f15741K;
    private LinearLayout f15742L;
    private String f15743M;
    private String f15744N;
    private LinearLayout f15745O;
    private int f15746P = -1;
    private boolean f15747Q = false;
    private int f15748R;
    private String f15749S;
    private Boolean f15750T = Boolean.valueOf(false);
    public Context f15751a;
    private boolean f15752e = true;
    private String f15753f;
    private Activity f15754g;
    private int f15755h;
    private long f15756i;
    private Button f15757j;
    private String f15758k;
    private String f15759l;
    private String f15760m;
    private String f15761n;
    private String f15762o;
    private boolean f15763p = false;
    private Integer f15764q = Integer.valueOf(0);
    private ProgressBar f15765r;
    private String f15766s;
    private Bitmap f15767t;
    private Button f15768u;
    private KeyboardView f15769v;
    private AutoCompleteTextView f15770w;
    private CheckMarkView f15771x;
    private ErrorMarkView f15772y;
    private ImageView f15773z;

    public C5740v(Context context, String str, long j, String str2, String str3, String str4, String str5, String str6, Bitmap bitmap, String str7, ArrayList<String> arrayList, ArrayList<String> arrayList2, Activity activity, Boolean bool) {
        super(context);
        this.f15751a = context;
        this.f15754g = activity;
        this.f15753f = str;
        this.f15756i = j;
        this.f15759l = str2;
        this.f15758k = str3;
        this.f15760m = str4;
        this.f15761n = str5;
        this.f15762o = str6;
        this.f15766s = str7;
        this.f15767t = bitmap;
        this.f15746P = -1;
        this.f15733C = arrayList;
        this.f15734D = arrayList2;
        this.f15750T = bool;
        m12829a();
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
    }

    public C5740v(Context context, String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, Bitmap bitmap, String str8, ArrayList<String> arrayList, ArrayList<String> arrayList2, boolean z, int i, Activity activity, Boolean bool) {
        super(context);
        this.f15751a = context;
        this.f15754g = activity;
        this.f15753f = str;
        this.f15756i = j;
        this.f15759l = str3;
        this.f15758k = str4;
        this.f15760m = str5;
        this.f15761n = str6;
        this.f15762o = str7;
        this.f15766s = str8;
        this.f15749S = str2;
        this.f15748R = i;
        this.f15767t = bitmap;
        this.f15747Q = z;
        this.f15733C = arrayList;
        this.f15734D = arrayList2;
        this.f15750T = bool;
        m12829a();
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
    }

    public C5740v(Context context, String str, boolean z, String str2, String str3, long j, String str4, String str5, String str6, String str7, String str8, Bitmap bitmap, String str9, ArrayList<String> arrayList, ArrayList<String> arrayList2, Activity activity, Boolean bool) {
        super(context);
        this.f15751a = context;
        this.f15754g = activity;
        this.f15753f = str;
        this.f15756i = j;
        this.f15759l = str4;
        this.f15758k = str5;
        this.f15760m = str6;
        this.f15761n = str7;
        this.f15762o = str8;
        this.f15766s = str9;
        this.f15743M = str2;
        this.f15744N = str3;
        this.f15767t = bitmap;
        this.f15763p = z;
        this.f15733C = arrayList;
        this.f15734D = arrayList2;
        this.f15750T = bool;
        m12829a();
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
    }

    private void m12829a() {
        this.f15735E.put("603799", Integer.valueOf(C2338R.drawable.bank_meli_iran_pec));
        this.f15735E.put("589210", Integer.valueOf(C2338R.drawable.bank_sepah_pec));
        this.f15735E.put("627648", Integer.valueOf(C2338R.drawable.bank_tosee_saderat_pec));
        this.f15735E.put("207177", Integer.valueOf(C2338R.drawable.bank_tosee_saderat_pec));
        this.f15735E.put("627961", Integer.valueOf(C2338R.drawable.bank_sanaat_o_maadan_pec));
        this.f15735E.put("603770", Integer.valueOf(C2338R.drawable.bank_keshavarzi_pec));
        this.f15735E.put("639217", Integer.valueOf(C2338R.drawable.bank_keshavarzi_pec));
        this.f15735E.put("628023", Integer.valueOf(C2338R.drawable.bank_maskan_pec));
        this.f15735E.put("627760", Integer.valueOf(C2338R.drawable.bank_post_nabk_pec));
        this.f15735E.put("502908", Integer.valueOf(C2338R.drawable.bank_toose_taavon_pec));
        this.f15735E.put("627412", Integer.valueOf(C2338R.drawable.bank_eghtesad_novin_pec));
        this.f15735E.put("622106", Integer.valueOf(C2338R.drawable.bank_parsian_pec));
        this.f15735E.put("627884", Integer.valueOf(C2338R.drawable.bank_parsian_pec));
        this.f15735E.put("639347", Integer.valueOf(C2338R.drawable.bank_pasargad_pec));
        this.f15735E.put("502229", Integer.valueOf(C2338R.drawable.bank_pasargad_pec));
        this.f15735E.put("627488", Integer.valueOf(C2338R.drawable.bank_karafarin_pec));
        this.f15735E.put("502910", Integer.valueOf(C2338R.drawable.bank_karafarin_pec));
        this.f15735E.put("621986", Integer.valueOf(C2338R.drawable.bank_saman_pec));
        this.f15735E.put("639346", Integer.valueOf(C2338R.drawable.bank_sina_pec));
        this.f15735E.put("639607", Integer.valueOf(C2338R.drawable.bank_sarmaye_pec));
        this.f15735E.put("636214", Integer.valueOf(C2338R.drawable.bank_tat_pec));
        this.f15735E.put("502806", Integer.valueOf(C2338R.drawable.bank_shahr_pec));
        this.f15735E.put("504706", Integer.valueOf(C2338R.drawable.bank_shahr_pec));
        this.f15735E.put("502938", Integer.valueOf(C2338R.drawable.bank_dey_pec));
        this.f15735E.put("603769", Integer.valueOf(C2338R.drawable.bank_saderat_pec));
        this.f15735E.put("610433", Integer.valueOf(C2338R.drawable.bank_mellat_pec));
        this.f15735E.put("991975", Integer.valueOf(C2338R.drawable.bank_mellat_pec));
        this.f15735E.put("627353", Integer.valueOf(C2338R.drawable.bank_tejarat_pec));
        this.f15735E.put("589463", Integer.valueOf(C2338R.drawable.bank_refah_pec));
        this.f15735E.put("627381", Integer.valueOf(C2338R.drawable.bank_ansar_pec));
        this.f15735E.put("505785", Integer.valueOf(C2338R.drawable.bank_iran_zamin_pec));
        this.f15735E.put("585983", Integer.valueOf(C2338R.drawable.bank_tejarat_pec));
        this.f15735E.put("636949", Integer.valueOf(C2338R.drawable.bank_hekmat_pec));
        this.f15735E.put("505416", Integer.valueOf(C2338R.drawable.bank_gardeshgari_pec));
        this.f15735E.put("606373", Integer.valueOf(C2338R.drawable.bank_mehr_pec));
        this.f15735E.put("628157", Integer.valueOf(C2338R.drawable.bank_etebarie_tosee_pec));
        this.f15735E.put("639370", Integer.valueOf(C2338R.drawable.bank_mehr_pec));
        this.f15735E.put("639599", Integer.valueOf(C2338R.drawable.bank_ghavamin_pec));
        this.f15735E.put("170019", Integer.valueOf(C2338R.drawable.bank_meli_iran_pec));
        this.f15735E.put("502937", Integer.valueOf(C2338R.drawable.bank_dey_pec));
        this.f15735E.put("504172", Integer.valueOf(C2338R.drawable.bank_resalat_pec));
        this.f15735E.put("505801", Integer.valueOf(C2338R.drawable.default_bank_pec));
        this.f15735E.put("505809", Integer.valueOf(C2338R.drawable.bank_khavar_pec));
        this.f15735E.put("606256", Integer.valueOf(C2338R.drawable.default_bank_pec));
        this.f15735E.put("672041", Integer.valueOf(C2338R.drawable.bank_saman_pec));
        this.f15736F.put("603799", "ملی");
        this.f15736F.put("589210", "سپه");
        this.f15736F.put("585983", "تجارت");
        this.f15736F.put("627648", "توسعه صادرات");
        this.f15736F.put("207177", "توسعه صادرات");
        this.f15736F.put("627961", "صنعت و معدن");
        this.f15736F.put("603770", "کشاورزی");
        this.f15736F.put("639217", "کشاورزی");
        this.f15736F.put("628023", "مسکن");
        this.f15736F.put("627760", "پست بانک");
        this.f15736F.put("502908", "توسعه تعاون");
        this.f15736F.put("627412", "اقتصاد نوین");
        this.f15736F.put("622106", "پارسیان");
        this.f15736F.put("627884", "پارسیان");
        this.f15736F.put("639347", "پاسارگاد");
        this.f15736F.put("502229", "پاسارگاد");
        this.f15736F.put("627488", "کارآفرین");
        this.f15736F.put("502910", "کارآفرین");
        this.f15736F.put("621986", "سامان");
        this.f15736F.put("639346", "سینا");
        this.f15736F.put("639607", "سرمایه");
        this.f15736F.put("636214", "تات");
        this.f15736F.put("502806", "بانک شهر");
        this.f15736F.put("504706", "بانک شهر");
        this.f15736F.put("502938", "دی");
        this.f15736F.put("603769", "صادرات");
        this.f15736F.put("610433", "ملت");
        this.f15736F.put("991975", "ملت");
        this.f15736F.put("627353", "تجارت");
        this.f15736F.put("589463", "رفاه");
        this.f15736F.put("627381", "انصار");
        this.f15736F.put("505785", "ایران زمین");
        this.f15736F.put("636949", "حکمت ایرانیان");
        this.f15736F.put("505416", "گردشگری");
        this.f15736F.put("606373", "قرض الحسنه مهر");
        this.f15736F.put("628157", "اعتباری توسعه");
        this.f15736F.put("639370", "اعتباری مهر");
        this.f15736F.put("639599", "قوامین");
        this.f15736F.put("170019", "ملی");
        this.f15736F.put("502937", "دی");
        this.f15736F.put("504172", "رسالت");
        this.f15736F.put("505801", "اعتباری کوثر");
        this.f15736F.put("505809", "خاورمیانه");
        this.f15736F.put("606256", "اعتباری عسکریه");
        this.f15736F.put("672041", "سامان");
    }

    private boolean m12832a(String str) {
        int i;
        str = str.replace("-", "");
        int[] iArr = new int[str.length()];
        for (i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                iArr[i] = Character.getNumericValue(str.charAt(i)) * 2;
            } else {
                iArr[i] = Character.getNumericValue(str.charAt(i));
            }
        }
        i = 0;
        int i2 = i;
        while (i < str.length()) {
            i2 += iArr[i] >= 10 ? (iArr[i] % 10) + (iArr[i] / 10) : iArr[i];
            i++;
        }
        return i2 % 10 == 0;
    }

    public void mo2082a(int i) {
        if (i != IjkMediaCodecInfo.RANK_MAX) {
            C2343a.m6350a(this.f15751a).m6362a(null, null, -1, true, i);
        }
        this.f15768u.setText("خطا (تلاش مجدد)");
        this.f15737G.setEnabled(true);
        this.f15757j.setVisibility(0);
        this.f15768u.setBackgroundColor(Color.parseColor("#F4511E"));
        this.f15770w.setEnabled(true);
        this.f15769v.setEnabled(true);
        this.f15769v.m6563d();
        this.f15768u.setClickable(true);
        this.f15765r.setVisibility(4);
        this.f15763p = false;
    }

    public void m12854a(Activity activity, View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap drawingCache = view.getDrawingCache();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Environment.getExternalStorageDirectory());
        stringBuilder.append("/screenshot.png");
        File file = new File(stringBuilder.toString());
        try {
            OutputStream fileOutputStream = new FileOutputStream(file);
            drawingCache.compress(CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        Parcelable fromFile = Uri.fromFile(file);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/*");
        intent.putExtra("android.intent.extra.SUBJECT", "رسید");
        intent.putExtra("android.intent.extra.TEXT", "رسید تراکنش مالی ");
        intent.putExtra("android.intent.extra.STREAM", fromFile);
        activity.startActivity(Intent.createChooser(intent, "Share via"));
    }

    public void mo2083a(C2371o c2371o, String str, int i, ArrayList<C2361e> arrayList, boolean z, int i2) {
        PaymentInitiator paymentInitiator = new PaymentInitiator();
        paymentInitiator.m12809a();
        dismiss();
        this.f15765r.setVisibility(4);
        C2343a.m6350a(this.f15751a).m6364b((C2344a) this);
        if (this.f15764q.intValue() == 0) {
            Dialog dialog = new Dialog(r7.f15751a);
            dialog.requestWindowFeature(1);
            dialog.setCancelable(false);
            dialog.setContentView(C2338R.layout.payment_final_result_test);
            r7.f15731A.clear();
            r7.f15731A = arrayList;
            ListView listView = (ListView) dialog.findViewById(C2338R.id.FinalResponceLists);
            TextView textView = (TextView) dialog.findViewById(C2338R.id.resultMessage);
            String str2 = str;
            textView.setText(str2);
            Typeface createFromAsset = Typeface.createFromAsset(r7.f15751a.getAssets(), "IRANSansMobile.ttf");
            textView.setTypeface(createFromAsset);
            Button button = (Button) dialog.findViewById(C2338R.id.detail);
            Button button2 = (Button) dialog.findViewById(C2338R.id.share_btn);
            button.setTypeface(createFromAsset);
            button2.setTypeface(createFromAsset);
            r7.f15732B = new C2374b(getOwnerActivity(), r7.f15751a, r7.f15731A);
            listView.setAdapter(r7.f15732B);
            if (i == 0) {
                button.setVisibility(0);
                listView.setVisibility(8);
                button.setOnClickListener(new ac(r7, listView, button2, button));
                button2.setOnClickListener(new ad(r7, dialog));
                r7.f15771x = (CheckMarkView) dialog.findViewById(C2338R.id.checkmarks);
                r7.f15772y = (ErrorMarkView) dialog.findViewById(C2338R.id.errormarks);
                r7.f15772y.setVisibility(8);
                r7.f15771x.setVisibility(0);
                r7.f15771x.m6541a(500, new ae(r7));
            } else {
                listView.setVisibility(8);
                button.setVisibility(8);
                r7.f15772y = (ErrorMarkView) dialog.findViewById(C2338R.id.errormarks);
                r7.f15771x = (CheckMarkView) dialog.findViewById(C2338R.id.checkmarks);
                r7.f15771x.setVisibility(8);
                r7.f15772y.setVisibility(0);
                r7.f15772y.m6550a(500, new af(r7));
            }
            ((Button) dialog.findViewById(C2338R.id.extbtt)).setOnClickListener(new ag(r7, dialog, c2371o, str2, z, i2));
            r7.f15764q = Integer.valueOf(r7.f15764q.intValue() + 1);
            LayoutParams layoutParams = new LayoutParams();
            layoutParams.copyFrom(dialog.getWindow().getAttributes());
            layoutParams.width = -1;
            layoutParams.height = -2;
            dialog.show();
            dialog.getWindow().setAttributes(layoutParams);
            dismiss();
            new PaymentInitiator().m12809a();
        }
        PaymentInitiator.f15712b = false;
        paymentInitiator.m12818b();
        f15729c = false;
        r7.f15763p = false;
    }

    public void mo2084a(String str, String str2, int i, ArrayList<C2361e> arrayList, boolean z, int i2) {
        dismiss();
        cancel();
        new PaymentInitiator().m12809a();
        this.f15765r.setVisibility(4);
        C2354h.m6385a(this.f15751a).m6404b((C2346c) this);
        if (this.f15764q.intValue() == 0) {
            Dialog dialog = new Dialog(r8.f15751a);
            dialog.requestWindowFeature(1);
            dialog.setCancelable(false);
            dialog.setContentView(C2338R.layout.payment_final_result_test);
            r8.f15731A.clear();
            r8.f15731A = arrayList;
            ListView listView = (ListView) dialog.findViewById(C2338R.id.FinalResponceLists);
            TextView textView = (TextView) dialog.findViewById(C2338R.id.resultMessage);
            String str3 = str2;
            textView.setText(str3);
            Typeface createFromAsset = Typeface.createFromAsset(r8.f15751a.getAssets(), "IRANSansMobile.ttf");
            textView.setTypeface(createFromAsset);
            Button button = (Button) dialog.findViewById(C2338R.id.detail);
            Button button2 = (Button) dialog.findViewById(C2338R.id.share_btn);
            button.setTypeface(createFromAsset);
            button2.setTypeface(createFromAsset);
            r8.f15732B = new C2374b(getOwnerActivity(), r8.f15751a, r8.f15731A);
            listView.setAdapter(r8.f15732B);
            if (i == 0) {
                button.setVisibility(0);
                listView.setVisibility(8);
                button.setOnClickListener(new C2397x(r8, listView, button2, button));
                button2.setOnClickListener(new C2398y(r8, dialog));
                r8.f15771x = (CheckMarkView) dialog.findViewById(C2338R.id.checkmarks);
                r8.f15772y = (ErrorMarkView) dialog.findViewById(C2338R.id.errormarks);
                r8.f15772y.setVisibility(8);
                r8.f15771x.setVisibility(8);
                r8.f15771x.m6541a(500, new C2399z(r8));
            } else {
                listView.setVisibility(8);
                button.setVisibility(8);
                r8.f15772y = (ErrorMarkView) dialog.findViewById(C2338R.id.errormarks);
                r8.f15771x = (CheckMarkView) dialog.findViewById(C2338R.id.checkmarks);
                r8.f15771x.setVisibility(8);
                r8.f15772y.setVisibility(0);
                r8.f15772y.m6550a(500, new aa(r8));
            }
            Button button3 = (Button) dialog.findViewById(C2338R.id.extbtt);
            button3.setTypeface(createFromAsset);
            button3.setOnClickListener(new ab(r8, dialog, str, str3, i, z, i2));
            r8.f15764q = Integer.valueOf(r8.f15764q.intValue() + 1);
            LayoutParams layoutParams = new LayoutParams();
            layoutParams.copyFrom(dialog.getWindow().getAttributes());
            layoutParams.width = -1;
            layoutParams.height = -2;
            dialog.show();
            dialog.getWindow().setAttributes(layoutParams);
            dismiss();
            new PaymentInitiator().m12809a();
        }
        PaymentInitiator.f15712b = false;
    }

    public void mo2085b(int i) {
        this.f15768u.setText("خطا (تلاش مجدد)");
        if (i != IjkMediaCodecInfo.RANK_MAX) {
            C2354h.m6385a(this.f15751a).m6400a(null, null, -1, true, i);
        }
        this.f15737G.setEnabled(true);
        this.f15757j.setVisibility(0);
        this.f15768u.setBackgroundColor(Color.parseColor("#F4511E"));
        this.f15770w.setEnabled(true);
        this.f15769v.setEnabled(true);
        this.f15769v.m6563d();
        this.f15768u.setClickable(true);
        this.f15765r.setVisibility(4);
    }

    public void mo2086b(C2371o c2371o, String str, int i, ArrayList<C2361e> arrayList, boolean z, int i2) {
        PaymentInitiator paymentInitiator = new PaymentInitiator();
        paymentInitiator.m12809a();
        dismiss();
        this.f15765r.setVisibility(4);
        C2355o.m6409a(this.f15751a).m6414a((C2344a) this);
        if (this.f15764q.intValue() == 0) {
            Dialog dialog = new Dialog(r7.f15751a);
            dialog.requestWindowFeature(1);
            dialog.setCancelable(false);
            dialog.setContentView(C2338R.layout.payment_final_result_test);
            r7.f15731A.clear();
            r7.f15731A = arrayList;
            ListView listView = (ListView) dialog.findViewById(C2338R.id.FinalResponceLists);
            TextView textView = (TextView) dialog.findViewById(C2338R.id.resultMessage);
            String str2 = str;
            textView.setText(str2);
            Typeface createFromAsset = Typeface.createFromAsset(r7.f15751a.getAssets(), "IRANSansMobile.ttf");
            textView.setTypeface(createFromAsset);
            Button button = (Button) dialog.findViewById(C2338R.id.detail);
            Button button2 = (Button) dialog.findViewById(C2338R.id.share_btn);
            button.setTypeface(createFromAsset);
            button2.setTypeface(createFromAsset);
            r7.f15732B = new C2374b(getOwnerActivity(), r7.f15751a, r7.f15731A);
            listView.setAdapter(r7.f15732B);
            if (i == 0) {
                button.setVisibility(0);
                listView.setVisibility(8);
                button.setOnClickListener(new ai(r7, listView, button2, button));
                button2.setOnClickListener(new aj(r7, dialog));
                r7.f15771x = (CheckMarkView) dialog.findViewById(C2338R.id.checkmarks);
                r7.f15772y = (ErrorMarkView) dialog.findViewById(C2338R.id.errormarks);
                r7.f15772y.setVisibility(8);
                r7.f15771x.setVisibility(0);
                r7.f15771x.m6541a(500, new ak(r7));
            } else {
                listView.setVisibility(8);
                button.setVisibility(8);
                r7.f15772y = (ErrorMarkView) dialog.findViewById(C2338R.id.errormarks);
                r7.f15771x = (CheckMarkView) dialog.findViewById(C2338R.id.checkmarks);
                r7.f15771x.setVisibility(8);
                r7.f15772y.setVisibility(0);
                r7.f15772y.m6550a(500, new al(r7));
            }
            ((Button) dialog.findViewById(C2338R.id.extbtt)).setOnClickListener(new am(r7, dialog, c2371o, str2, z, i2));
            r7.f15764q = Integer.valueOf(r7.f15764q.intValue() + 1);
            LayoutParams layoutParams = new LayoutParams();
            layoutParams.copyFrom(dialog.getWindow().getAttributes());
            layoutParams.width = -1;
            layoutParams.height = -2;
            dialog.show();
            dialog.getWindow().setAttributes(layoutParams);
            dismiss();
            new PaymentInitiator().m12809a();
        }
        PaymentInitiator.f15712b = false;
        paymentInitiator.m12818b();
        f15729c = false;
        r7.f15763p = false;
        r7.f15747Q = false;
    }

    public void mo2087c(int i) {
        if (i != IjkMediaCodecInfo.RANK_MAX) {
            C2355o.m6409a(this.f15751a).m6422a(null, null, -1, true, i);
        }
        this.f15768u.setText("خطا (تلاش مجدد)");
        this.f15737G.setEnabled(true);
        this.f15757j.setVisibility(0);
        this.f15768u.setBackgroundColor(Color.parseColor("#F4511E"));
        this.f15770w.setEnabled(true);
        this.f15769v.setEnabled(true);
        this.f15769v.m6563d();
        this.f15768u.setClickable(true);
        this.f15765r.setVisibility(4);
        f15729c = false;
        PaymentInitiator.f15712b = false;
        this.f15763p = false;
        this.f15747Q = false;
    }

    protected void onCreate(android.os.Bundle r11) {
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
        r10 = this;
        super.onCreate(r11);
        r11 = r10.getWindow();	 Catch:{ Exception -> 0x0013 }
        r0 = 16;	 Catch:{ Exception -> 0x0013 }
        r11.setSoftInputMode(r0);	 Catch:{ Exception -> 0x0013 }
        r11 = "QQQQQQQQ";	 Catch:{ Exception -> 0x0013 }
        r0 = "onCreate";	 Catch:{ Exception -> 0x0013 }
        android.util.Log.d(r11, r0);	 Catch:{ Exception -> 0x0013 }
    L_0x0013:
        r11 = 1;
        r10.requestWindowFeature(r11);
        r0 = ir.pec.mpl.pecpayment.C2338R.layout.payment_view;
        r10.setContentView(r0);
        r0 = ir.pec.mpl.pecpayment.C2338R.id.bank_pic;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r1 = ir.pec.mpl.pecpayment.C2338R.id.pan;
        r1 = r10.findViewById(r1);
        r1 = (android.widget.AutoCompleteTextView) r1;
        r10.f15770w = r1;
        r1 = r10.f15733C;
        r1 = r1.size();
        r2 = 6;
        r3 = 12;
        r4 = 0;
        if (r1 <= 0) goto L_0x009b;
    L_0x003a:
        r1 = new java.lang.StringBuilder;
        r5 = "**** ";
        r1.<init>(r5);
        r5 = r10.f15733C;
        r5 = r5.get(r4);
        r5 = (java.lang.String) r5;
        r5 = r5.substring(r3);
        r1.append(r5);
        r1 = r1.toString();
        r5 = r10.f15734D;
        r5 = r5.get(r4);
        r5 = (java.lang.String) r5;
        f15730d = r5;
        f15729c = r11;
        r5 = new java.lang.StringBuilder;
        r6 = "**** **** ";
        r5.<init>(r6);
        r5.append(r1);
        r1 = r5.toString();
        r5 = r10.f15770w;
        r5.setText(r1);
        r0.setVisibility(r4);
        r1 = r10.f15735E;	 Catch:{ Exception -> 0x0092 }
        r5 = r10.f15733C;	 Catch:{ Exception -> 0x0092 }
        r5 = r5.get(r4);	 Catch:{ Exception -> 0x0092 }
        r5 = (java.lang.String) r5;	 Catch:{ Exception -> 0x0092 }
        r5 = r5.substring(r4, r2);	 Catch:{ Exception -> 0x0092 }
        r1 = r1.get(r5);	 Catch:{ Exception -> 0x0092 }
        r1 = (java.lang.Integer) r1;	 Catch:{ Exception -> 0x0092 }
        r1 = r1.intValue();	 Catch:{ Exception -> 0x0092 }
        r0.setImageResource(r1);	 Catch:{ Exception -> 0x0092 }
        goto L_0x0097;
    L_0x0092:
        r1 = ir.pec.mpl.pecpayment.C2338R.drawable.default_bank_pec;
        r0.setImageResource(r1);
    L_0x0097:
        r10.f15746P = r4;
        f15729c = r11;
    L_0x009b:
        r1 = ir.pec.mpl.pecpayment.C2338R.id.clear;
        r1 = r10.findViewById(r1);
        r1 = (android.widget.ImageButton) r1;
        r5 = new ir.pec.mpl.pecpayment.view.w;
        r5.<init>(r10);
        r1.setOnClickListener(r5);
        r1 = ir.pec.mpl.pecpayment.C2338R.id.payment_progress;
        r1 = r10.findViewById(r1);
        r1 = (android.widget.ProgressBar) r1;
        r10.f15765r = r1;
        r1 = r10.f15770w;
        r5 = new ir.pec.mpl.pecpayment.view.bj;
        r6 = r10.f15770w;
        r5.<init>(r6, r0);
        r1.addTextChangedListener(r5);
        r1 = ir.pec.mpl.pecpayment.C2338R.id.totalscroll;
        r1 = r10.findViewById(r1);
        r1 = (android.widget.ScrollView) r1;
        f15728b = r1;
        r1 = ir.pec.mpl.pecpayment.C2338R.id.RuleLayout;
        r1 = r10.findViewById(r1);
        r1 = (android.widget.LinearLayout) r1;
        r10.f15745O = r1;
        r1 = ir.pec.mpl.pecpayment.C2338R.id.rulesConf;
        r1 = r10.findViewById(r1);
        r1 = (android.widget.CheckBox) r1;
        r10.f15737G = r1;
        r1 = r10.f15737G;
        r5 = new ir.pec.mpl.pecpayment.view.ah;
        r5.<init>(r10);
        r1.setOnCheckedChangeListener(r5);
        r1 = ir.pec.mpl.pecpayment.C2338R.id.ruletxt;
        r1 = r10.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r10.f15738H = r1;
        r1 = r10.f15738H;
        r5 = new ir.pec.mpl.pecpayment.view.an;
        r5.<init>(r10);
        r1.setOnClickListener(r5);
        r1 = ir.pec.mpl.pecpayment.C2338R.id.Certificate;
        r1 = r10.findViewById(r1);
        r1 = (android.widget.ImageView) r1;
        r10.f15773z = r1;
        r1 = r10.f15773z;
        r5 = new ir.pec.mpl.pecpayment.view.aq;
        r5.<init>(r10);
        r1.setOnClickListener(r5);
        r1 = ir.pec.mpl.pecpayment.C2338R.id.PassKey;
        r1 = r10.findViewById(r1);
        r1 = (ir.pec.mpl.pecpayment.view.KeyboardView) r1;
        r10.f15769v = r1;
        r1 = r10.f15769v;
        r1.m6560a();
        r1 = r10.f15769v;
        r1.m6562c();
        r1 = ir.pec.mpl.pecpayment.C2338R.id.exitBtn;
        r1 = r10.findViewById(r1);
        r1 = (android.widget.Button) r1;
        r10.f15757j = r1;
        r5 = ir.pec.mpl.pecpayment.C2338R.id.Paybutton;
        r5 = r10.findViewById(r5);
        r5 = (android.widget.Button) r5;
        r10.f15768u = r5;
        r5 = ir.pec.mpl.pecpayment.C2338R.id.ShopImage;
        r5 = r10.findViewById(r5);
        r5 = (android.widget.ImageView) r5;
        r6 = ir.pec.mpl.pecpayment.C2338R.drawable.wait;
        r5.setImageResource(r6);
        r6 = r10.f15763p;
        if (r6 == 0) goto L_0x0161;
    L_0x014a:
        r6 = new ir.pec.mpl.pecpayment.view.c;
        r6.<init>(r5);
        r11 = new java.lang.String[r11];
        r5 = r10.f15751a;
        r5 = ir.pec.mpl.pecpayment.p209a.C2343a.m6350a(r5);
        r5 = r5.m6363b();
        r11[r4] = r5;
    L_0x015d:
        r6.execute(r11);
        goto L_0x0175;
    L_0x0161:
        r6 = new ir.pec.mpl.pecpayment.view.c;
        r6.<init>(r5);
        r11 = new java.lang.String[r11];
        r5 = r10.f15751a;
        r5 = ir.pec.mpl.pecpayment.p209a.C2354h.m6385a(r5);
        r5 = r5.m6390a();
        r11[r4] = r5;
        goto L_0x015d;
    L_0x0175:
        r11 = ir.pec.mpl.pecpayment.C2338R.id.ShopName;
        r11 = r10.findViewById(r11);
        r11 = (android.widget.TextView) r11;
        r5 = r10.f15766s;
        r11.setText(r5);
        r10.setCancelable(r4);
        r11 = new java.util.ArrayList;
        r11.<init>();
        r5 = r4;
    L_0x018b:
        r6 = r10.f15733C;
        r6 = r6.size();
        if (r5 >= r6) goto L_0x0240;
    L_0x0193:
        r6 = new ir.pec.mpl.pecpayment.b.a.d;	 Catch:{ Exception -> 0x0202 }
        r6.<init>();	 Catch:{ Exception -> 0x0202 }
        r7 = r10.f15735E;	 Catch:{ Exception -> 0x01b4 }
        r8 = r10.f15733C;	 Catch:{ Exception -> 0x01b4 }
        r8 = r8.get(r5);	 Catch:{ Exception -> 0x01b4 }
        r8 = (java.lang.String) r8;	 Catch:{ Exception -> 0x01b4 }
        r8 = r8.substring(r4, r2);	 Catch:{ Exception -> 0x01b4 }
        r7 = r7.get(r8);	 Catch:{ Exception -> 0x01b4 }
        r7 = (java.lang.Integer) r7;	 Catch:{ Exception -> 0x01b4 }
        r7 = r7.intValue();	 Catch:{ Exception -> 0x01b4 }
        r6.m6432a(r7);	 Catch:{ Exception -> 0x01b4 }
        goto L_0x01b9;
    L_0x01b4:
        r7 = ir.pec.mpl.pecpayment.C2338R.drawable.default_bank_pec;	 Catch:{ Exception -> 0x0202 }
        r6.m6432a(r7);	 Catch:{ Exception -> 0x0202 }
    L_0x01b9:
        r7 = r10.f15733C;	 Catch:{ Exception -> 0x0202 }
        r7 = r7.get(r5);	 Catch:{ Exception -> 0x0202 }
        r7 = (java.lang.String) r7;	 Catch:{ Exception -> 0x0202 }
        r6.m6435b(r7);	 Catch:{ Exception -> 0x0202 }
        r7 = r10.f15736F;	 Catch:{ Exception -> 0x01dc }
        r8 = r10.f15733C;	 Catch:{ Exception -> 0x01dc }
        r8 = r8.get(r5);	 Catch:{ Exception -> 0x01dc }
        r8 = (java.lang.String) r8;	 Catch:{ Exception -> 0x01dc }
        r8 = r8.substring(r4, r2);	 Catch:{ Exception -> 0x01dc }
        r7 = r7.get(r8);	 Catch:{ Exception -> 0x01dc }
        r7 = (java.lang.String) r7;	 Catch:{ Exception -> 0x01dc }
        r6.m6437c(r7);	 Catch:{ Exception -> 0x01dc }
        goto L_0x01e1;
    L_0x01dc:
        r7 = "بانک ناشناخته";	 Catch:{ Exception -> 0x0202 }
        r6.m6437c(r7);	 Catch:{ Exception -> 0x0202 }
    L_0x01e1:
        r7 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0202 }
        r8 = "**** ";	 Catch:{ Exception -> 0x0202 }
        r7.<init>(r8);	 Catch:{ Exception -> 0x0202 }
        r8 = r10.f15733C;	 Catch:{ Exception -> 0x0202 }
        r8 = r8.get(r5);	 Catch:{ Exception -> 0x0202 }
        r8 = (java.lang.String) r8;	 Catch:{ Exception -> 0x0202 }
        r8 = r8.substring(r3);	 Catch:{ Exception -> 0x0202 }
        r7.append(r8);	 Catch:{ Exception -> 0x0202 }
        r7 = r7.toString();	 Catch:{ Exception -> 0x0202 }
        r6.m6433a(r7);	 Catch:{ Exception -> 0x0202 }
        r11.add(r6);	 Catch:{ Exception -> 0x0202 }
        goto L_0x023c;
    L_0x0202:
        r6 = new ir.pec.mpl.pecpayment.b.a.d;
        r6.<init>();
        r7 = ir.pec.mpl.pecpayment.C2338R.drawable.default_bank_pec;
        r6.m6432a(r7);
        r7 = r10.f15733C;
        r7 = r7.get(r5);
        r7 = (java.lang.String) r7;
        r6.m6435b(r7);
        r7 = "ناشناس";
        r6.m6437c(r7);
        r7 = new java.lang.StringBuilder;
        r8 = "**** ";
        r7.<init>(r8);
        r8 = r10.f15733C;
        r8 = r8.get(r5);
        r8 = (java.lang.String) r8;
        r8 = r8.substring(r3);
        r7.append(r8);
        r7 = r7.toString();
        r6.m6433a(r7);
        r11.add(r6);
    L_0x023c:
        r5 = r5 + 1;
        goto L_0x018b;
    L_0x0240:
        r2 = new ir.pec.mpl.pecpayment.view.a.a;
        r3 = r10.f15751a;
        r5 = ir.pec.mpl.pecpayment.C2338R.layout.dropdown_item;
        r2.<init>(r3, r5, r11);
        r3 = r10.f15770w;
        r3.setAdapter(r2);
        r2 = r10.f15763p;
        r3 = 2000001; // 0x1e8481 float:2.802598E-39 double:9.88132E-318;
        if (r2 == 0) goto L_0x02e4;
    L_0x0255:
        r2 = ir.pec.mpl.pecpayment.C2338R.id.bill_name;
        r2 = r10.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r10.f15739I = r2;
        r2 = ir.pec.mpl.pecpayment.C2338R.id.bill_price;
        r2 = r10.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r10.f15740J = r2;
        r2 = ir.pec.mpl.pecpayment.C2338R.id.bill_pic;
        r2 = r10.findViewById(r2);
        r2 = (android.widget.ImageView) r2;
        r10.f15741K = r2;
        r2 = ir.pec.mpl.pecpayment.C2338R.id.bill_layout;
        r2 = r10.findViewById(r2);
        r2 = (android.widget.LinearLayout) r2;
        r10.f15742L = r2;
        r2 = r10.f15742L;
        r2.setVisibility(r4);
        r2 = new ir.pec.mpl.pecpayment.a.a.a;
        r2.<init>();
        r5 = r10.f15739I;
        r6 = r10.f15744N;
        r7 = r10.f15751a;
        r6 = r2.m6341a(r6, r7);
        r5.setText(r6);
        r5 = ir.pec.mpl.pecpayment.p212b.p213a.C2357a.m6424a();
        r6 = r10.f15744N;
        r7 = r10.f15751a;
        r6 = r2.m6341a(r6, r7);
        r5.m6426b(r6);
        r5 = r10.f15743M;
        r6 = "###,###,###,###";
        r7 = new java.text.DecimalFormat;
        r7.<init>(r6);
        r6 = java.lang.Integer.parseInt(r5);
        r8 = (long) r6;
        r6 = r7.format(r8);
        r7 = r10.f15740J;
        r6 = r6.toString();
        r7.setText(r6);
        r6 = r10.f15750T;
        r6 = r6.booleanValue();
        if (r6 != 0) goto L_0x02d3;
    L_0x02c6:
        r5 = java.lang.Integer.parseInt(r5);
        if (r5 >= r3) goto L_0x02d3;
    L_0x02cc:
        r3 = r10.f15769v;
        r3.m6561b();
        r10.f15752e = r4;
    L_0x02d3:
        r3 = r10.f15741K;
        r4 = r10.f15744N;
        r2 = r2.m6340a(r4);
    L_0x02db:
        r2 = r2.intValue();
        r3.setImageResource(r2);
        goto L_0x03e8;
    L_0x02e4:
        r2 = r10.f15747Q;
        if (r2 == 0) goto L_0x0368;
    L_0x02e8:
        r2 = ir.pec.mpl.pecpayment.C2338R.id.bill_name;
        r2 = r10.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r10.f15739I = r2;
        r2 = ir.pec.mpl.pecpayment.C2338R.id.bill_price;
        r2 = r10.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r10.f15740J = r2;
        r2 = ir.pec.mpl.pecpayment.C2338R.id.bill_pic;
        r2 = r10.findViewById(r2);
        r2 = (android.widget.ImageView) r2;
        r10.f15741K = r2;
        r2 = ir.pec.mpl.pecpayment.C2338R.id.bill_layout;
        r2 = r10.findViewById(r2);
        r2 = (android.widget.LinearLayout) r2;
        r10.f15742L = r2;
        r2 = r10.f15742L;
        r2.setVisibility(r4);
        r2 = new ir.pec.mpl.pecpayment.a.a.d;
        r2.<init>();
        r5 = r10.f15739I;
        r6 = "شارژ";
        r5.setText(r6);
        r5 = ir.pec.mpl.pecpayment.p212b.p213a.C2372p.m6529a();
        r6 = r10.f15748R;
        r6 = r2.m6349b(r6);
        r5.m6531b(r6);
        r5 = r10.f15749S;
        r6 = "###,###,###,###";
        r7 = new java.text.DecimalFormat;
        r7.<init>(r6);
        r6 = java.lang.Integer.parseInt(r5);
        r8 = (long) r6;
        r6 = r7.format(r8);
        r7 = r10.f15740J;
        r6 = r6.toString();
        r7.setText(r6);
        r6 = r10.f15750T;
        r6 = r6.booleanValue();
        if (r6 != 0) goto L_0x035e;
    L_0x0351:
        r5 = java.lang.Integer.parseInt(r5);
        if (r5 >= r3) goto L_0x035e;
    L_0x0357:
        r3 = r10.f15769v;
        r3.m6561b();
        r10.f15752e = r4;
    L_0x035e:
        r3 = r10.f15741K;
        r4 = r10.f15748R;
        r2 = r2.m6348a(r4);
        goto L_0x02db;
    L_0x0368:
        r2 = ir.pec.mpl.pecpayment.C2338R.id.bill_name;
        r2 = r10.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r10.f15739I = r2;
        r2 = ir.pec.mpl.pecpayment.C2338R.id.bill_price;
        r2 = r10.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r10.f15740J = r2;
        r2 = ir.pec.mpl.pecpayment.C2338R.id.bill_pic;
        r2 = r10.findViewById(r2);
        r2 = (android.widget.ImageView) r2;
        r10.f15741K = r2;
        r2 = ir.pec.mpl.pecpayment.C2338R.id.bill_layout;
        r2 = r10.findViewById(r2);
        r2 = (android.widget.LinearLayout) r2;
        r10.f15742L = r2;
        r2 = r10.f15742L;
        r2.setVisibility(r4);
        r2 = new ir.pec.mpl.pecpayment.a.a.a;
        r2.<init>();
        r2 = r10.f15739I;
        r5 = r10.f15751a;
        r6 = ir.pec.mpl.pecpayment.C2338R.string.payment_tag;
        r5 = r5.getString(r6);
        r2.setText(r5);
        r2 = "###,###,###,###";
        r5 = new java.text.DecimalFormat;
        r5.<init>(r2);
        r2 = r10.f15751a;
        r2 = ir.pec.mpl.pecpayment.p209a.C2354h.m6385a(r2);
        r2 = r2.m6406c();
        r6 = (long) r2;
        r2 = r5.format(r6);
        r5 = r10.f15740J;
        r2 = r2.toString();
        r5.setText(r2);
        r2 = r10.f15750T;
        r2 = r2.booleanValue();
        if (r2 != 0) goto L_0x03e1;
    L_0x03ce:
        r2 = r10.f15751a;
        r2 = ir.pec.mpl.pecpayment.p209a.C2354h.m6385a(r2);
        r2 = r2.m6406c();
        if (r2 >= r3) goto L_0x03e1;
    L_0x03da:
        r2 = r10.f15769v;
        r2.m6561b();
        r10.f15752e = r4;
    L_0x03e1:
        r2 = r10.f15741K;
        r3 = ir.pec.mpl.pecpayment.C2338R.drawable.buy_tag_pec;
        r2.setImageResource(r3);
    L_0x03e8:
        r2 = r10.f15751a;
        r2 = ir.pec.mpl.pecpayment.p209a.C2343a.m6350a(r2);
        r2.m6354a(r10);
        r2 = r10.f15751a;
        r2 = ir.pec.mpl.pecpayment.p209a.C2354h.m6385a(r2);
        r2.m6392a(r10);
        r2 = r10.f15751a;
        r2 = ir.pec.mpl.pecpayment.p209a.C2355o.m6409a(r2);
        r2.m6416a(r10);
        r2 = r10.f15770w;
        r3 = new ir.pec.mpl.pecpayment.view.at;
        r3.<init>(r10);
        r2.setOnClickListener(r3);
        r2 = r10.f15770w;
        r3 = new ir.pec.mpl.pecpayment.view.av;
        r3.<init>(r10);
        r2.setOnFocusChangeListener(r3);
        r2 = r10.f15770w;
        r3 = new ir.pec.mpl.pecpayment.view.ax;
        r3.<init>(r10, r11, r0);
        r2.setOnItemClickListener(r3);
        r0 = r10.f15768u;
        r2 = new ir.pec.mpl.pecpayment.view.ay;
        r2.<init>(r10, r1, r11);
        r0.setOnClickListener(r2);
        r11 = new ir.pec.mpl.pecpayment.view.az;
        r11.<init>(r10);
        r1.setOnClickListener(r11);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.pec.mpl.pecpayment.view.v.onCreate(android.os.Bundle):void");
    }
}
