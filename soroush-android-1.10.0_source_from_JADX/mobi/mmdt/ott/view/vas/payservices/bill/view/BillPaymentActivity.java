package mobi.mmdt.ott.view.vas.payservices.bill.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.aa;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.ab;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.ac;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.ad;
import mobi.mmdt.ott.logic.p261a.p329x.C2763c;
import mobi.mmdt.ott.logic.p261a.p329x.C6791f;
import mobi.mmdt.ott.logic.p261a.p329x.p330a.C2762b;
import mobi.mmdt.ott.logic.p261a.p329x.p330a.C5970a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.logic.vas.p372a.p373a.C6008f;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p479c.C4501c;
import mobi.mmdt.ott.view.tools.p482f.C4507a;
import mobi.mmdt.ott.view.vas.payservices.payhistory.PayHistoryActivity;
import p000a.p001a.p002a.C0005c;

public class BillPaymentActivity extends C7576b {
    private C6281a f24548m;
    private TextView f24549n;

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (C2535a.m6888a().m6972t()) {
                MyApplication.m12950a().f15901P = System.currentTimeMillis();
            }
            if (intent == null || !intent.hasExtra("enData")) {
                C4501c.m8189a().m8193b();
                C0005c.m0a().m9d(new C6008f(new Exception("Problem in payment")));
            } else {
                C2808d.m7148b(new C6791f(this.f24548m.f17143a, intent.getStringExtra("enData"), C2763c.BillPayment));
            }
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_bill_payment);
        getWindow().setSoftInputMode(2);
        this.f24548m = new C6281a();
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            String string = getIntent().getExtras().getString("barcode");
            Bundle bundle2 = new Bundle();
            bundle2.putString("barcode", string);
            this.f24548m.setArguments(bundle2);
            this.f24548m.m14672a(string);
        }
        getFragmentManager().beginTransaction().add(R.id.bill_payment_frame_layout, this.f24548m).commit();
        this.x = (Toolbar) findViewById(R.id.bill_payment_toolbar);
        this.f24549n = (TextView) findViewById(R.id.title_toolbar_textView);
        this.x.setTitle((CharSequence) "");
        this.f24549n.setText(C4522p.m8236a(R.string.bill_payment));
        m20723a(true, UIThemeManager.getmInstance().getIcon_toolbar_dark_color());
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
        C4507a.m8206a((Activity) this, findViewById(R.id.image_bg), false);
        m20721a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
        C2491i.m6802a(this.f24549n, UIThemeManager.getmInstance().getSubtitle_toolbar_color());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_bill_payment_activity, menu);
        MenuItem findItem = menu.findItem(R.id.action_bill_payment_history);
        findItem.setTitle(C4522p.m8236a(R.string.charge_history));
        C2491i.m6790a(findItem.getIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
        return super.onCreateOptionsMenu(menu);
    }

    public void onEvent(aa aaVar) {
        if (this.f24548m != null) {
            this.f24548m.onEvent(aaVar);
        }
    }

    public void onEvent(ab abVar) {
        if (this.f24548m != null) {
            this.f24548m.onEvent(abVar);
        }
    }

    public void onEvent(ac acVar) {
        if (this.f24548m != null) {
            this.f24548m.onEvent(acVar);
        }
    }

    public void onEvent(ad adVar) {
        if (this.f24548m != null) {
            this.f24548m.onEvent(adVar);
        }
    }

    public void onEvent(C5970a c5970a) {
        if (this.f24548m != null) {
            this.f24548m.onEvent(c5970a);
        }
    }

    public void onEvent(C2762b c2762b) {
        if (this.f24548m != null) {
            this.f24548m.onEvent(c2762b);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
        } else if (itemId == R.id.action_bill_payment_history) {
            Intent intent = new Intent(this, PayHistoryActivity.class);
            intent.putExtra("PAYMENT_TYPE_KEY", C2763c.BillPayment);
            startActivity(intent);
            overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 1 && iArr.length > 0) {
            if (iArr[0] == -1) {
                Toast.makeText(this, C4522p.m8236a(R.string.bill_scanner_permission_denied), 0).show();
                return;
            }
            this.f24548m.m14671a();
        }
    }
}
