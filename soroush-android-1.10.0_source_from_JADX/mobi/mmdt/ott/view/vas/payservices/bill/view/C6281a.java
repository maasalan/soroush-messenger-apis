package mobi.mmdt.ott.view.vas.payservices.bill.view;

import android.app.Activity;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.base.PaymentModule;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.aa;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.ab;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.ac;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.ad;
import mobi.mmdt.ott.logic.p261a.p329x.C2763c;
import mobi.mmdt.ott.logic.p261a.p329x.C2764d;
import mobi.mmdt.ott.logic.p261a.p329x.C6790e;
import mobi.mmdt.ott.logic.p261a.p329x.p330a.C2762b;
import mobi.mmdt.ott.logic.p261a.p329x.p330a.C5970a;
import mobi.mmdt.ott.logic.p261a.p329x.p330a.C6787c;
import mobi.mmdt.ott.logic.p359k.C2837a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p382d.C2959e;
import mobi.mmdt.ott.provider.p382d.C6013a;
import mobi.mmdt.ott.provider.p382d.C6014c;
import mobi.mmdt.ott.provider.p382d.C6015d;
import mobi.mmdt.ott.view.components.p405e.C3150a;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p479c.C4501c;
import mobi.mmdt.ott.view.vas.payservices.bill.p485b.C4555a;
import org.json.JSONObject;

public final class C6281a extends C3150a implements TextWatcher {
    String f17143a;
    private Activity f17144b;
    private RelativeLayout f17145c;
    private TextView f17146e;
    private AutoCompleteTextView f17147f;
    private EditText f17148g;
    private TextView f17149h;
    private TextView f17150i;
    private ImageView f17151j;
    private TextView f17152k;
    private View f17153l;
    private String f17154m;
    private String f17155n;
    private String f17156o;
    private LoaderCallbacks<Cursor> f17157p = new C45604(this);

    class C45561 implements OnClickListener {
        final /* synthetic */ C6281a f12569a;

        C45561(C6281a c6281a) {
            this.f12569a = c6281a;
        }

        public final void onClick(View view) {
            C6281a.m14663a(this.f12569a);
        }
    }

    class C45572 implements OnClickListener {
        final /* synthetic */ C6281a f12570a;

        C45572(C6281a c6281a) {
            this.f12570a = c6281a;
        }

        public final void onClick(View view) {
            C6281a.m14666b(this.f12570a);
        }
    }

    class C45583 implements OnFocusChangeListener {
        final /* synthetic */ C6281a f12571a;

        C45583(C6281a c6281a) {
            this.f12571a = c6281a;
        }

        public final void onFocusChange(View view, boolean z) {
            this.f12571a.m14665b();
        }
    }

    class C45604 implements LoaderCallbacks<Cursor> {
        final /* synthetic */ C6281a f12574a;

        C45604(C6281a c6281a) {
            this.f12574a = c6281a;
        }

        public final Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
            return C2959e.m7385a(MyApplication.m12952b());
        }

        public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
            Cursor cursor = (Cursor) obj;
            final ArrayList arrayList = new ArrayList();
            C6015d c6015d = new C6015d(cursor);
            if (c6015d.moveToFirst()) {
                do {
                    arrayList.add(c6015d.m7352a("BillId"));
                } while (c6015d.moveToNext());
            }
            this.f12574a.f17144b.runOnUiThread(new Runnable(this) {
                final /* synthetic */ C45604 f12573b;

                public final void run() {
                    this.f12573b.f12574a.f17147f.setAdapter(new ArrayAdapter(this.f12573b.f12574a.getActivity(), R.layout.autocomplete_text_view, arrayList));
                    this.f12573b.f12574a.f17147f.setThreshold(1);
                }
            });
        }

        public final void onLoaderReset(Loader<Cursor> loader) {
        }
    }

    class C45615 implements Runnable {
        final /* synthetic */ C6281a f12575a;

        C45615(C6281a c6281a) {
            this.f12575a = c6281a;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
        }
    }

    class C45626 implements Runnable {
        final /* synthetic */ C6281a f12576a;

        C45626(C6281a c6281a) {
            this.f12576a = c6281a;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
            Snackbar.m8770a(this.f12576a.f17144b.findViewById(16908290), C4522p.m8236a(R.string.bill_purchase_get_error), 0).m572a();
        }
    }

    class C45637 implements Runnable {
        final /* synthetic */ C6281a f12577a;

        C45637(C6281a c6281a) {
            this.f12577a = c6281a;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
        }
    }

    class C45648 implements Runnable {
        final /* synthetic */ C6281a f12578a;

        C45648(C6281a c6281a) {
            this.f12578a = c6281a;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
        }
    }

    static /* synthetic */ void m14663a(C6281a c6281a) {
        if (C2837a.m7170a("android.permission.CAMERA")) {
            c6281a.m14671a();
        } else {
            C2837a.m7167a(c6281a.f17144b, "android.permission.CAMERA", 1);
        }
    }

    private static String m14664b(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C4522p.m8236a(R.string.bill_payment_amount));
        stringBuilder.append(" : ");
        stringBuilder.append(C2491i.m6777a(C2535a.m6888a().m6919b(), C2491i.m6776a(str)));
        stringBuilder.append(" ");
        stringBuilder.append(C4522p.m8236a(R.string.rial));
        return stringBuilder.toString();
    }

    private void m14665b() {
        TextView textView;
        CharSequence f;
        if (C4555a.m8297d(this.f17154m)) {
            this.f17151j.setImageResource(C4555a.m8298e(this.f17154m));
            textView = this.f17146e;
            f = C4555a.m8299f(this.f17154m);
        } else {
            this.f17151j.setImageResource(R.drawable.bill_enable);
            textView = this.f17146e;
            f = C4522p.m8236a(R.string.bill_payment_bill_info);
        }
        textView.setText(f);
    }

    static /* synthetic */ void m14666b(C6281a c6281a) {
        c6281a.f17154m = c6281a.f17147f.getText().toString();
        c6281a.f17155n = c6281a.f17148g.getText().toString();
        if (C4555a.m8297d(c6281a.f17154m) && C4555a.m8294a(c6281a.f17154m, c6281a.f17155n)) {
            c6281a.f17156o = C4555a.m8292a();
            C2808d.m7148b(new C6787c(c6281a.f17154m, c6281a.f17155n, C4555a.m8296c(c6281a.f17155n), c6281a.f17156o));
            C4501c.m8189a().m8191a(c6281a.f17144b, R.string.please_wait_, true);
            return;
        }
        Snackbar.m8770a(c6281a.f17144b.findViewById(16908290), C4522p.m8236a(R.string.bill_information_invalid), 0).m572a();
    }

    private void m14669d() {
        ((InputMethodManager) this.f17144b.getSystemService("input_method")).hideSoftInputFromWindow(this.f17148g.getWindowToken(), 0);
    }

    public final void m14671a() {
        this.f17144b.startActivity(new Intent(this.f17144b, BarcodeScannerActivity.class));
        this.f17144b.finish();
    }

    public final void m14672a(String str) {
        this.f17154m = C4555a.m8293a(str);
        this.f17155n = C4555a.m8295b(str);
        if (this.f17147f != null) {
            this.f17147f.setText(this.f17154m);
            this.f17148g.setText(this.f17155n);
            this.f17152k.setText(C6281a.m14664b(C4555a.m8296c(this.f17155n)));
            this.f17151j.setImageResource(C4555a.m8298e(this.f17154m));
            this.f17146e.setText(C4555a.m8299f(this.f17154m));
            m14669d();
            this.f17145c.setVisibility(0);
        }
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    protected final void finalize() {
        super.finalize();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f17153l = layoutInflater.inflate(R.layout.fragment_another_bill_payment, viewGroup, false);
        this.f17144b = getActivity();
        this.f17146e = (TextView) this.f17153l.findViewById(R.id.bill_payment_header_text);
        this.f17149h = (TextView) this.f17153l.findViewById(R.id.bill_payment_accept_text);
        this.f17147f = (AutoCompleteTextView) this.f17153l.findViewById(R.id.bill_id_input);
        this.f17148g = (EditText) this.f17153l.findViewById(R.id.payment_id_input);
        this.f17151j = (ImageView) this.f17153l.findViewById(R.id.bill_payment_header_image);
        this.f17150i = (TextView) this.f17153l.findViewById(R.id.bill_payment_scan_barcode);
        this.f17152k = (TextView) this.f17153l.findViewById(R.id.bill_payment_amount);
        this.f17145c = (RelativeLayout) this.f17153l.findViewById(R.id.bill_payment_amount_relative);
        this.f17150i.setOnClickListener(new C45561(this));
        this.f17149h.setOnClickListener(new C45572(this));
        this.f17148g.addTextChangedListener(this);
        this.f17148g.setOnFocusChangeListener(new C45583(this));
        getActivity().getLoaderManager().initLoader(56, null, this.f17157p);
        ((GradientDrawable) this.f17149h.getBackground()).setColor(UIThemeManager.getmInstance().getAccent_color());
        ((GradientDrawable) this.f17150i.getBackground()).setColor(UIThemeManager.getmInstance().getAccent_color());
        if (getArguments() != null) {
            String string = getArguments().getString("barcode");
            if (string != null) {
                m14672a(string);
            }
        }
        return this.f17153l;
    }

    public final void onDestroy() {
        super.onDestroy();
        getLoaderManager().destroyLoader(56);
    }

    public final void onEvent(aa aaVar) {
        this.f17144b.runOnUiThread(new C45648(this));
        Snackbar.m8770a(this.f17144b.findViewById(16908290), C4522p.m8236a(R.string.bill_purchase_get_error), 0).m572a();
    }

    public final void onEvent(ab abVar) {
        this.f17143a = abVar.f8635a;
        Context b = MyApplication.m12952b();
        String str = this.f17156o;
        String str2 = this.f17143a;
        C6014c c6014c = new C6014c();
        c6014c.m13312e(str2);
        C6013a c6013a = new C6013a();
        c6013a.m13302a(str);
        c6014c.m13304a(b, c6013a);
        if (abVar.f8637c.equals(PaymentModule.PARSIANMPL4FACTOR) || abVar.f8637c.equals(PaymentModule.PARSIANMPL)) {
            MyApplication.m12950a().m12960c("BILL_REQUEST_TO_PARSIANMPL");
            Activity activity = this.f17144b;
            JSONObject jSONObject = abVar.f8636b;
            C2763c c2763c = C2763c.BillPayment;
            C2764d.m7089a(activity, jSONObject);
        }
    }

    public final void onEvent(ac acVar) {
        this.f17144b.runOnUiThread(new C45626(this));
    }

    public final void onEvent(ad adVar) {
        C2480b.m6732a("****************************OnVerifyTransactionSuccessfulEvent");
        Context b = MyApplication.m12952b();
        String str = this.f17156o;
        C6014c c6014c = new C6014c();
        c6014c.m13306a(Integer.valueOf(1));
        C6013a c6013a = new C6013a();
        c6013a.m13302a(str);
        c6014c.m13304a(b, c6013a);
        this.f17144b.runOnUiThread(new C45615(this));
        Snackbar.m8770a(this.f17144b.findViewById(16908290), C4522p.m8236a(R.string.bill_done_successfully), 0).m572a();
    }

    public final void onEvent(C5970a c5970a) {
        this.f17144b.runOnUiThread(new C45637(this));
        Snackbar.m8770a(this.f17144b.findViewById(16908290), C4522p.m8236a(R.string.bill_purchase_get_error), 0).m572a();
    }

    public final void onEvent(C2762b c2762b) {
        String str = c2762b.f8723a;
        String str2 = c2762b.f8725c;
        PaymentModule[] paymentModuleArr = c2762b.f8726d;
        if (paymentModuleArr != null && paymentModuleArr.length > 0) {
            int length = paymentModuleArr.length;
            int i = 0;
            while (i < length) {
                PaymentModule paymentModule = paymentModuleArr[i];
                if (paymentModule != PaymentModule.PARSIANMPL4FACTOR) {
                    if (paymentModule != PaymentModule.PARSIANMPL) {
                        i++;
                    }
                }
                Context b = MyApplication.m12952b();
                C6014c c6014c = new C6014c();
                c6014c.m13309c();
                C6013a c6013a = new C6013a();
                c6013a.m13302a(str2);
                c6014c.m13304a(b, c6013a);
                C2808d.m7148b(new C6790e(str, c2762b.f8724b, paymentModule, C2763c.BillPayment));
                return;
            }
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        TextView textView;
        CharSequence b;
        this.f17154m = this.f17147f.getText().toString();
        this.f17155n = this.f17148g.getText().toString();
        m14665b();
        if (C4555a.m8294a(this.f17154m, this.f17155n)) {
            m14669d();
            this.f17145c.setVisibility(0);
            textView = this.f17152k;
            b = C6281a.m14664b(C4555a.m8296c(this.f17155n));
        } else {
            this.f17145c.setVisibility(8);
            textView = this.f17152k;
            b = "";
        }
        textView.setText(b);
    }
}
