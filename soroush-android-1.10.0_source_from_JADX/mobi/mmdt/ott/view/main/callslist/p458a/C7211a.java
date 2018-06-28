package mobi.mmdt.ott.view.main.callslist.p458a;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;

public final class C7211a extends C6073e {
    private TextView f19770b;
    private String f19771c;
    private Activity f19772d;
    private ImageView f19773e = ((ImageView) this.itemView.findViewById(R.id.imageView2));
    private TextView f19774f;
    private TextView f19775g;
    private TextView f19776h;
    private RelativeLayout f19777i = ((RelativeLayout) this.itemView.findViewById(R.id.bg_relativeLayout));
    private RelativeLayout f19778j = ((RelativeLayout) this.itemView.findViewById(R.id.root_call_history));
    private View f19779k = this.itemView.findViewById(R.id.inner_divider_line);

    public C7211a(Activity activity, final C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater, viewGroup, R.layout.list_item_calls_info_new_design, c3126i);
        this.f19772d = activity;
        RelativeLayout relativeLayout = (RelativeLayout) this.itemView.findViewById(R.id.main_relativeLayout);
        this.f19775g = (TextView) this.itemView.findViewById(R.id.textView3);
        this.f19770b = (TextView) this.itemView.findViewById(R.id.date_call_history);
        this.f19774f = (TextView) this.itemView.findViewById(R.id.textView1);
        this.f19776h = (TextView) this.itemView.findViewById(R.id.textView2);
        this.f19771c = C2535a.m6888a().m6919b();
        relativeLayout.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ C7211a f11913b;

            public final void onClick(View view) {
                c3126i.mo2234c(this.f11913b.f16244a.f19504k);
            }
        });
        relativeLayout.setOnLongClickListener(new OnLongClickListener(this) {
            final /* synthetic */ C7211a f11915b;

            public final boolean onLongClick(View view) {
                c3126i.mo2235d(this.f11915b.f16244a.f19504k);
                return false;
            }
        });
        this.f19770b.setOnClickListener(null);
        this.f19777i.setOnClickListener(null);
        this.f19778j.setOnClickListener(null);
        C2491i.m6796a(this.f19779k, UIThemeManager.getmInstance().getLine_divider_color());
        C2491i.m6802a(this.f19774f, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f19770b, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f19775g, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6802a(this.f19776h, UIThemeManager.getmInstance().getText_secondary_color());
    }

    private void m17926a(Drawable drawable) {
        C2491i.m6790a(drawable, UIThemeManager.getmInstance().getExplore_channel_item_background_color());
        if (VERSION.SDK_INT >= 16) {
            this.f19777i.setBackground(drawable);
        } else {
            this.f19777i.setBackgroundDrawable(drawable);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void mo3180a(mobi.mmdt.ott.view.components.p401c.C6829g r6) {
        /*
        r5 = this;
        r6 = (mobi.mmdt.ott.view.main.callslist.p577b.C7366b) r6;
        r0 = r6.f21398a;
        r1 = r5.f19771c;
        r2 = "fa";
        r1 = r1.equals(r2);
        r2 = 8;
        r3 = 0;
        if (r1 == 0) goto L_0x004f;
    L_0x0011:
        r1 = r5.f19774f;
        r4 = r6.f21402e;
        r4 = mobi.mmdt.componentsutils.p232b.C2491i.m6814b(r4);
        r1.setText(r4);
        if (r0 == 0) goto L_0x0033;
    L_0x001e:
        r1 = r0.isEmpty();
        if (r1 != 0) goto L_0x0033;
    L_0x0024:
        r1 = r5.f19775g;
        r0 = mobi.mmdt.componentsutils.p232b.C2491i.m6814b(r0);
        r1.setText(r0);
        r0 = r5.f19775g;
        r0.setVisibility(r3);
        goto L_0x0038;
    L_0x0033:
        r0 = r5.f19775g;
        r0.setVisibility(r2);
    L_0x0038:
        r0 = r5.f19776h;
        r1 = r6.f21401d;
        r1 = mobi.mmdt.componentsutils.p232b.C2491i.m6814b(r1);
        r0.setText(r1);
        r0 = r5.f19770b;
        r1 = r6.f21399b;
        r1 = mobi.mmdt.componentsutils.p232b.C2491i.m6814b(r1);
    L_0x004b:
        r0.setText(r1);
        goto L_0x007a;
    L_0x004f:
        r1 = r5.f19774f;
        r4 = r6.f21402e;
        r1.setText(r4);
        if (r0 == 0) goto L_0x0069;
    L_0x0058:
        r1 = r0.isEmpty();
        if (r1 != 0) goto L_0x0069;
    L_0x005e:
        r1 = r5.f19775g;
        r1.setText(r0);
        r0 = r5.f19775g;
        r0.setVisibility(r3);
        goto L_0x006e;
    L_0x0069:
        r0 = r5.f19775g;
        r0.setVisibility(r2);
    L_0x006e:
        r0 = r5.f19776h;
        r1 = r6.f21401d;
        r0.setText(r1);
        r0 = r5.f19770b;
        r1 = r6.f21399b;
        goto L_0x004b;
    L_0x007a:
        r0 = mobi.mmdt.ott.view.main.callslist.p458a.C7211a.C41743.f11917b;
        r1 = r6.f21404g;
        r1 = r1.ordinal();
        r0 = r0[r1];
        switch(r0) {
            case 1: goto L_0x00aa;
            case 2: goto L_0x0088;
            default: goto L_0x0087;
        };
    L_0x0087:
        goto L_0x00c0;
    L_0x0088:
        r0 = mobi.mmdt.ott.view.main.callslist.p458a.C7211a.C41743.f11916a;
        r1 = r6.f21403f;
        r1 = r1.ordinal();
        r0 = r0[r1];
        switch(r0) {
            case 1: goto L_0x00a0;
            case 2: goto L_0x0096;
            default: goto L_0x0095;
        };
    L_0x0095:
        goto L_0x00c0;
    L_0x0096:
        r0 = r5.f19772d;
        r0 = com.p085c.p086a.C1212c.m2872a(r0);
        r1 = 2131231839; // 0x7f08045f float:1.807977E38 double:1.052968435E-314;
        goto L_0x00b3;
    L_0x00a0:
        r0 = r5.f19772d;
        r0 = com.p085c.p086a.C1212c.m2872a(r0);
        r1 = 2131231841; // 0x7f080461 float:1.8079774E38 double:1.052968436E-314;
        goto L_0x00b3;
    L_0x00aa:
        r0 = r5.f19772d;
        r0 = com.p085c.p086a.C1212c.m2872a(r0);
        r1 = 2131231840; // 0x7f080460 float:1.8079772E38 double:1.0529684355E-314;
    L_0x00b3:
        r1 = java.lang.Integer.valueOf(r1);
        r0 = r0.m10950a(r1);
        r1 = r5.f19773e;
        r0.m3031a(r1);
    L_0x00c0:
        r6 = r6.f21400c;
        switch(r6) {
            case 1: goto L_0x010b;
            case 2: goto L_0x00f4;
            case 3: goto L_0x00dd;
            case 4: goto L_0x00c6;
            default: goto L_0x00c5;
        };
    L_0x00c5:
        return;
    L_0x00c6:
        r6 = r5.f19772d;
        r0 = 2131230882; // 0x7f0800a2 float:1.807783E38 double:1.052967962E-314;
        r6 = android.support.v4.p029a.C0346c.m682a(r6, r0);
        r5.m17926a(r6);
        r6 = r5.f19770b;
        r6.setVisibility(r2);
        r6 = r5.f19779k;
        r6.setVisibility(r3);
        return;
    L_0x00dd:
        r6 = r5.f19772d;
        r0 = 2131230880; // 0x7f0800a0 float:1.8077825E38 double:1.052967961E-314;
        r6 = android.support.v4.p029a.C0346c.m682a(r6, r0);
        r5.m17926a(r6);
        r6 = r5.f19770b;
        r6.setVisibility(r3);
        r6 = r5.f19779k;
        r6.setVisibility(r2);
        return;
    L_0x00f4:
        r6 = r5.f19772d;
        r0 = 2131230881; // 0x7f0800a1 float:1.8077827E38 double:1.0529679617E-314;
        r6 = android.support.v4.p029a.C0346c.m682a(r6, r0);
        r5.m17926a(r6);
        r6 = r5.f19770b;
        r6.setVisibility(r2);
        r6 = r5.f19779k;
        r6.setVisibility(r3);
        return;
    L_0x010b:
        r6 = r5.f19772d;
        r0 = 2131230883; // 0x7f0800a3 float:1.8077831E38 double:1.0529679626E-314;
        r6 = android.support.v4.p029a.C0346c.m682a(r6, r0);
        r5.m17926a(r6);
        r6 = r5.f19770b;
        r6.setVisibility(r3);
        r6 = r5.f19779k;
        r6.setVisibility(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.main.callslist.a.a.a(mobi.mmdt.ott.view.components.c.g):void");
    }
}
