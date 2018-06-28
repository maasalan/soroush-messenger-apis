package mobi.mmdt.ott.view.vas.payservices.charge.view;

import android.app.Activity;
import android.app.Dialog;
import android.app.FragmentTransaction;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.v7.app.C6389b.C0663a;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.base.PaymentModule;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.vas_webservices.purchase_charge.PurchaseChargeResponse;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p329x.C2763c;
import mobi.mmdt.ott.logic.p261a.p329x.C2764d;
import mobi.mmdt.ott.logic.p261a.p329x.C6790e;
import mobi.mmdt.ott.logic.p261a.p329x.C6791f;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.logic.vas.p372a.C2910a;
import mobi.mmdt.ott.logic.vas.p372a.C2912b;
import mobi.mmdt.ott.logic.vas.p372a.p373a.C2906a;
import mobi.mmdt.ott.logic.vas.p372a.p373a.C2907c;
import mobi.mmdt.ott.logic.vas.p372a.p373a.C2908e;
import mobi.mmdt.ott.logic.vas.p372a.p373a.C2909g;
import mobi.mmdt.ott.logic.vas.p372a.p373a.C6006b;
import mobi.mmdt.ott.logic.vas.p372a.p373a.C6007d;
import mobi.mmdt.ott.logic.vas.p372a.p373a.C6008f;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.OttProvider;
import mobi.mmdt.ott.provider.p383e.C2962e;
import mobi.mmdt.ott.provider.p383e.C6016b;
import mobi.mmdt.ott.provider.p383e.C6017c;
import mobi.mmdt.ott.provider.p383e.C6018d;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p479c.C4501c;
import mobi.mmdt.ott.view.tools.p482f.C4507a;
import mobi.mmdt.ott.view.vas.payservices.payhistory.PayHistoryActivity;
import org.json.JSONObject;
import p000a.p001a.p002a.C0005c;

public class ChargeActivity extends C7576b implements C3101a, C4579d {
    C6287c f24550m;
    C6284a f24551n;
    C2910a f24552o;
    private TextView f24553p;
    private String f24554q;

    class C45661 implements Runnable {
        final /* synthetic */ ChargeActivity f12580a;

        C45661(ChargeActivity chargeActivity) {
            this.f12580a = chargeActivity;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
        }
    }

    class C45672 implements Runnable {
        final /* synthetic */ ChargeActivity f12581a;

        C45672(ChargeActivity chargeActivity) {
            this.f12581a = chargeActivity;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
        }
    }

    class C45683 implements Runnable {
        final /* synthetic */ ChargeActivity f12582a;

        C45683(ChargeActivity chargeActivity) {
            this.f12582a = chargeActivity;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
        }
    }

    class C45694 implements Runnable {
        final /* synthetic */ ChargeActivity f12583a;

        C45694(ChargeActivity chargeActivity) {
            this.f12583a = chargeActivity;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
        }
    }

    private void m21515g() {
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.container_frame, this.f24550m);
        beginTransaction.setTransition(4099);
        beginTransaction.commit();
    }

    public final Dialog mo2299a(Bundle bundle) {
        return null;
    }

    public final void mo3691a(final String str) {
        m21515g();
        new Handler().postDelayed(new Runnable(this) {
            final /* synthetic */ ChargeActivity f12585b;

            public final void run() {
                C6287c a = this.f12585b.f24550m;
                String str = str;
                a.f17172a.setText(String.format("0%s", new Object[]{str.substring(2, str.length())}));
            }
        }, 500);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            MyApplication a = MyApplication.m12950a();
            StringBuilder stringBuilder = new StringBuilder("CHARGE_RESULT_");
            stringBuilder.append(i2);
            a.m12960c(stringBuilder.toString());
            if (intent != null && intent.hasExtra("errorType")) {
                a = MyApplication.m12950a();
                StringBuilder stringBuilder2 = new StringBuilder("CHARGE_ERROR_");
                stringBuilder2.append(intent.getIntExtra("errorType", 0));
                a.m12960c(stringBuilder2.toString());
            }
            if (C2535a.m6888a().m6972t()) {
                MyApplication.m12950a().f15901P = System.currentTimeMillis();
            }
            if (intent == null || !intent.hasExtra("enData")) {
                C0005c.m0a().m9d(new C6008f(new Exception("Problem in payment")));
            } else {
                C2808d.m7148b(new C6791f(this.f24554q, intent.getStringExtra("enData"), C2763c.ChargePayment));
            }
        }
    }

    public void onBackPressed() {
        if (this.f24550m.isVisible()) {
            super.onBackPressed();
            overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
            return;
        }
        m21515g();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_charge);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        this.f24553p = (TextView) this.x.findViewById(R.id.title_toolbar_textView);
        this.y = findViewById(R.id.shadow_line_top);
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
        C2475a.m6719a((Activity) this, "");
        this.f24553p.setText(C4522p.m8236a(R.string.purchase_charge));
        this.x.setTitle((CharSequence) "");
        C4507a.m8206a((Activity) this, findViewById(R.id.image_bg), false);
        m20721a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
        C2491i.m6802a(this.f24553p, UIThemeManager.getmInstance().getSubtitle_toolbar_color());
        this.f24550m = new C6287c();
        this.f24551n = new C6284a();
        if (!this.f24550m.isAdded()) {
            FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
            beginTransaction.replace(R.id.container_frame, this.f24550m);
            beginTransaction.setTransition(4099);
            beginTransaction.commit();
        }
        MyApplication.m12950a().m12960c("CHARGE_ACTIVITY_OPENED");
    }

    public void onEvent(C2906a c2906a) {
        C4501c.m8189a().m8193b();
    }

    public void onEvent(C6006b c6006b) {
        Snackbar.m8770a(findViewById(16908290), C4522p.m8236a(R.string.purchase_charge_get_error), 0).m572a();
        runOnUiThread(new C45661(this));
    }

    public void onEvent(C2907c c2907c) {
        PurchaseChargeResponse purchaseChargeResponse = c2907c.f9066a;
        if (purchaseChargeResponse != null && purchaseChargeResponse.getmValidModules().length > 0) {
            PaymentModule paymentModule = PaymentModule.PARSIANMPL;
            PaymentModule[] paymentModuleArr = purchaseChargeResponse.getmValidModules();
            int length = paymentModuleArr.length;
            int i = 0;
            while (i < length) {
                PaymentModule paymentModule2 = paymentModuleArr[i];
                if (!paymentModule.equals(PaymentModule.PARSIANMPL)) {
                    if (!paymentModule.equals(PaymentModule.PARSIANMPL4FACTOR)) {
                        i++;
                    }
                }
                paymentModule = paymentModule2;
                break;
            }
            String str = purchaseChargeResponse.getmPaymentId();
            Context b = MyApplication.m12952b();
            String str2 = this.f24552o.f9074a;
            C6016b c6016b = new C6016b();
            c6016b.m13326e(str);
            C6018d c6018d = new C6018d();
            c6018d.m13329a(str2);
            c6016b.m13314a(b, c6018d);
            C2808d.m7147a(new C6790e(str, this.f24550m.f17173b.f9078e, paymentModule, C2763c.ChargePayment));
        }
    }

    public void onEvent(C6007d c6007d) {
        Snackbar.m8770a(findViewById(16908290), C4522p.m8236a(R.string.purchase_charge_get_error), 0).m572a();
        runOnUiThread(new C45672(this));
    }

    public void onEvent(C2908e c2908e) {
        this.f24554q = c2908e.f9067a;
        Context b = MyApplication.m12952b();
        String str = this.f24552o.f9074a;
        String str2 = this.f24554q;
        C6016b c6016b = new C6016b();
        c6016b.m13327f(str2);
        C6018d c6018d = new C6018d();
        c6018d.m13329a(str);
        c6016b.m13314a(b, c6018d);
        if (c2908e.f9069c.equals(PaymentModule.PARSIANMPL4FACTOR) || c2908e.f9069c.equals(PaymentModule.PARSIANMPL)) {
            MyApplication.m12950a().m12960c("CHARGE_REQUEST_TO_PARSIANMPL");
            JSONObject jSONObject = c2908e.f9068b;
            C2763c c2763c = C2763c.ChargePayment;
            C2764d.m7089a(this, jSONObject);
        }
    }

    public void onEvent(C6008f c6008f) {
        C2480b.m6732a("****************************OnVerifyChargeTransactionErrorEvent");
        Snackbar.m8770a(findViewById(16908290), C4522p.m8236a(R.string.purchase_charge_get_error), 0).m572a();
        runOnUiThread(new C45694(this));
    }

    public void onEvent(C2909g c2909g) {
        C6017c c6017c;
        C2480b.m6732a("****************************OnVerifyChargeTransactionSuccessfulEvent");
        Context b = MyApplication.m12952b();
        String str = this.f24552o.f9074a;
        String str2 = c2909g.f9072b;
        String str3 = c2909g.f9071a;
        C6016b c6016b = new C6016b();
        c6016b.m13321b(str2).m13326e(str3).m13316a(Integer.valueOf(1));
        c6016b.m13314a(b, new C6018d().m13329a(str));
        Snackbar.m8770a(findViewById(16908290), C4522p.m8236a(R.string.purchase_charge_done_successfully), 0).m572a();
        runOnUiThread(new C45683(this));
        str3 = "SELECT * FROM charge WHERE IsFavorite = 1";
        C6018d c6018d = new C6018d();
        ContentProviderClient acquireContentProviderClient = MyApplication.m12952b().getContentResolver().acquireContentProviderClient("mobi.mmdt.ott.provider");
        if (((OttProvider) acquireContentProviderClient.getLocalContentProvider()) != null) {
            Cursor b2 = ((OttProvider) acquireContentProviderClient.getLocalContentProvider()).mo2212b(c6018d.m7372g(), str3);
            acquireContentProviderClient.release();
            if (b2 != null) {
                c6017c = new C6017c(b2);
                if ((c6017c.getCount() <= 0 ? 1 : 0) == 0) {
                    final C2910a c2910a = this.f24552o;
                    C0663a c0663a = new C0663a(this, R.style.AppCompatAlertDialogStyle);
                    View inflate = getLayoutInflater().inflate(R.layout.dialog_show_favorite_charge, null);
                    c0663a.m1607a(inflate);
                    TextView textView = (TextView) inflate.findViewById(R.id.favorite_charge);
                    ((TextView) inflate.findViewById(R.id.favorite_charge_header)).setText(R.string.favorite_charge_question);
                    Object[] objArr = new Object[3];
                    objArr[0] = C2912b.m7287b(c2910a.f9076c);
                    objArr[1] = C2912b.m7285a(c2910a.f9079f);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(C2491i.m6777a(C2535a.m6888a().m6919b(), C2491i.m6776a(c2910a.f9078e)));
                    stringBuilder.append(" ");
                    stringBuilder.append(C4522p.m8236a(R.string.rial));
                    objArr[2] = stringBuilder.toString();
                    textView.setText(String.format("%s - %s - %s", objArr));
                    c0663a.m1614b(C4522p.m8236a(R.string.cancel), null);
                    c0663a.m1609a(C4522p.m8236a(R.string.ok_cap), new OnClickListener(this) {
                        final /* synthetic */ ChargeActivity f12587b;

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C2962e.m7388a(C7576b.m20720x(), c2910a.f9074a, true);
                        }
                    });
                    c0663a.m1612a().show();
                }
            }
        }
        c6017c = null;
        if (c6017c.getCount() <= 0) {
        }
        if ((c6017c.getCount() <= 0 ? 1 : 0) == 0) {
            final C2910a c2910a2 = this.f24552o;
            C0663a c0663a2 = new C0663a(this, R.style.AppCompatAlertDialogStyle);
            View inflate2 = getLayoutInflater().inflate(R.layout.dialog_show_favorite_charge, null);
            c0663a2.m1607a(inflate2);
            TextView textView2 = (TextView) inflate2.findViewById(R.id.favorite_charge);
            ((TextView) inflate2.findViewById(R.id.favorite_charge_header)).setText(R.string.favorite_charge_question);
            Object[] objArr2 = new Object[3];
            objArr2[0] = C2912b.m7287b(c2910a2.f9076c);
            objArr2[1] = C2912b.m7285a(c2910a2.f9079f);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(C2491i.m6777a(C2535a.m6888a().m6919b(), C2491i.m6776a(c2910a2.f9078e)));
            stringBuilder2.append(" ");
            stringBuilder2.append(C4522p.m8236a(R.string.rial));
            objArr2[2] = stringBuilder2.toString();
            textView2.setText(String.format("%s - %s - %s", objArr2));
            c0663a2.m1614b(C4522p.m8236a(R.string.cancel), null);
            c0663a2.m1609a(C4522p.m8236a(R.string.ok_cap), /* anonymous class already generated */);
            c0663a2.m1612a().show();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId != R.id.menu_history_icon) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            getLoaderManager().destroyLoader(55);
            Intent intent = new Intent(this, PayHistoryActivity.class);
            intent.putExtra("PAYMENT_TYPE_KEY", C2763c.ChargePayment);
            startActivity(intent);
            overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
            return true;
        }
    }

    protected void onResume() {
        super.onResume();
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
    }
}
