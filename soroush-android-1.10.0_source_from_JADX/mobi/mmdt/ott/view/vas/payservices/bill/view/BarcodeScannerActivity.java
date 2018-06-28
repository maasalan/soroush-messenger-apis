package mobi.mmdt.ott.view.vas.payservices.bill.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.google.p173d.C2047n;
import me.p226a.p227a.p228a.C2441a;
import me.p226a.p227a.p229b.C5753a;
import me.p226a.p227a.p229b.C5753a.C2456a;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.vas.payservices.bill.p485b.C4555a;

public class BarcodeScannerActivity extends Activity implements C2456a {
    private C5753a f17142a;

    public final void mo2439a(C2047n c2047n) {
        String str = c2047n.f6872a;
        String a = C4555a.m8293a(str);
        String b = C4555a.m8295b(str);
        if (C4555a.m8297d(a) && C4555a.m8294a(a, b)) {
            this.f17142a.m6670a();
            Intent intent = new Intent(this, BillPaymentActivity.class);
            intent.putExtra("barcode", str);
            startActivity(intent);
            finish();
            return;
        }
        Toast.makeText(this, C4522p.m8236a(R.string.barcode_invalid_error), 0).show();
        C2441a c2441a = this.f17142a;
        c2441a.f15855d = this;
        if (c2441a.f8104a != null) {
            c2441a.f8104a.m6679a();
        }
    }

    public void onBackPressed() {
        startActivity(new Intent(this, BillPaymentActivity.class));
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f17142a = new C5753a(this);
        setContentView(this.f17142a);
    }

    public void onPause() {
        super.onPause();
        this.f17142a.m6670a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
        r6 = this;
        super.onResume();
        r0 = r6.f17142a;
        r0.setResultHandler(r6);
        r0 = r6.f17142a;
        r1 = android.hardware.Camera.getNumberOfCameras();
        r2 = new android.hardware.Camera$CameraInfo;
        r2.<init>();
        r3 = -1;
        r4 = 0;
    L_0x0015:
        r5 = r4;
        r4 = r3;
        r3 = r5;
        if (r3 >= r1) goto L_0x0025;
    L_0x001a:
        android.hardware.Camera.getCameraInfo(r3, r2);
        r4 = r2.facing;
        if (r4 != 0) goto L_0x0022;
    L_0x0021:
        goto L_0x0026;
    L_0x0022:
        r4 = r3 + 1;
        goto L_0x0015;
    L_0x0025:
        r3 = r4;
    L_0x0026:
        r1 = r0.f8105b;
        if (r1 != 0) goto L_0x0031;
    L_0x002a:
        r1 = new me.a.a.a.b;
        r1.<init>(r0);
        r0.f8105b = r1;
    L_0x0031:
        r0 = r0.f8105b;
        r1 = new android.os.Handler;
        r2 = r0.getLooper();
        r1.<init>(r2);
        r2 = new me.a.a.a.b$1;
        r2.<init>(r0, r3);
        r1.post(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.vas.payservices.bill.view.BarcodeScannerActivity.onResume():void");
    }
}
