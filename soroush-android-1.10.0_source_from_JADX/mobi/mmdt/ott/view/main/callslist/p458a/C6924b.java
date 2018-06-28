package mobi.mmdt.ott.view.main.callslist.p458a;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.main.callslist.C4180c;
import mobi.mmdt.ott.view.main.callslist.p577b.C7367c;

public final class C6924b extends C6073e {
    private String f19780b = C2535a.m6888a().m6919b();
    private Activity f19781c;
    private RoundAvatarImageView f19782d = ((RoundAvatarImageView) this.itemView.findViewById(R.id.imageView1));
    private ImageView f19783e = ((ImageView) this.itemView.findViewById(R.id.imageView3));
    private ImageView f19784f = ((ImageView) this.itemView.findViewById(R.id.imageView2));
    private TextView f19785g = ((TextView) this.itemView.findViewById(R.id.textView1));
    private TextView f19786h = ((TextView) this.itemView.findViewById(R.id.textView3));
    private View f19787i = this.itemView.findViewById(R.id.divider_line);

    public C6924b(Activity activity, C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup, final C4180c c4180c) {
        super(layoutInflater, viewGroup, R.layout.list_item_calls_new_design, c3126i);
        this.f19781c = activity;
        this.f19784f.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ C6924b f11919b;

            public final void onClick(View view) {
                c4180c.mo2399b(((C7367c) this.f11919b.f16244a).f21411c);
            }
        });
        C2491i.m6796a(this.f19787i, UIThemeManager.getmInstance().getLine_divider_color());
        C2491i.m6802a(this.f19785g, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f19786h, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6801a(this.f19784f, UIThemeManager.getmInstance().getText_primary_color());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void mo3180a(mobi.mmdt.ott.view.components.p401c.C6829g r4) {
        /*
        r3 = this;
        r4 = (mobi.mmdt.ott.view.main.callslist.p577b.C7367c) r4;
        r0 = r3.f19780b;
        r1 = "fa";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0023;
    L_0x000c:
        r0 = r3.f19785g;
        r1 = r4.f21410b;
        r1 = mobi.mmdt.componentsutils.p232b.C2491i.m6814b(r1);
        r0.setText(r1);
        r0 = r3.f19786h;
        r1 = r4.f21415g;
        r1 = mobi.mmdt.componentsutils.p232b.C2491i.m6814b(r1);
    L_0x001f:
        r0.setText(r1);
        goto L_0x002f;
    L_0x0023:
        r0 = r3.f19785g;
        r1 = r4.f21410b;
        r0.setText(r1);
        r0 = r3.f19786h;
        r1 = r4.f21415g;
        goto L_0x001f;
    L_0x002f:
        r0 = r3.f19782d;
        r1 = 0;
        r0.setImageBitmap(r1);
        r0 = r4.f21412d;
        if (r0 == 0) goto L_0x0069;
    L_0x0039:
        r0 = r4.f21412d;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0069;
    L_0x0041:
        r0 = r3.f19781c;
        r0 = com.p085c.p086a.C1212c.m2872a(r0);
        r1 = r4.f21412d;
        r1 = mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b.m6998a(r1);
        r1 = mobi.mmdt.ott.view.tools.C4515k.m8231a(r1);
        r0 = r0.m10950a(r1);
        r1 = com.p085c.p086a.p105g.C1248f.m2945b();
        r2 = com.p085c.p086a.p089c.p092b.C1144h.f3689a;
        r1 = r1.m2955b(r2);
        r0 = r0.m3034a(r1);
    L_0x0063:
        r1 = r3.f19782d;
        r0.m3031a(r1);
        goto L_0x0091;
    L_0x0069:
        r0 = r4.f21413e;
        if (r0 == 0) goto L_0x0086;
    L_0x006d:
        r0 = r3.f19781c;
        r0 = com.p085c.p086a.C1212c.m2872a(r0);
        r1 = r4.f21413e;
        r0 = r0.m10950a(r1);
        r1 = com.p085c.p086a.p105g.C1248f.m2945b();
        r0 = r0.m3034a(r1);
        r0 = r0.m3033a();
        goto L_0x0063;
    L_0x0086:
        r0 = r3.f19781c;
        r0 = com.p085c.p086a.C1212c.m2872a(r0);
        r1 = r3.f19782d;
        r0.m10953a(r1);
    L_0x0091:
        r0 = r3.f19782d;
        r1 = r4.f21410b;
        r0.setName(r1);
        r0 = r3.f19782d;
        r1 = r4.f21414f;
        r0.setBackgroundColor(r1);
        r0 = mobi.mmdt.ott.view.main.callslist.p458a.C6924b.C41762.f11921b;
        r1 = r4.f21417i;
        r1 = r1.ordinal();
        r0 = r0[r1];
        switch(r0) {
            case 1: goto L_0x00cf;
            case 2: goto L_0x00ad;
            default: goto L_0x00ac;
        };
    L_0x00ac:
        goto L_0x00e5;
    L_0x00ad:
        r0 = mobi.mmdt.ott.view.main.callslist.p458a.C6924b.C41762.f11920a;
        r1 = r4.f21416h;
        r1 = r1.ordinal();
        r0 = r0[r1];
        switch(r0) {
            case 1: goto L_0x00c5;
            case 2: goto L_0x00bb;
            default: goto L_0x00ba;
        };
    L_0x00ba:
        goto L_0x00e5;
    L_0x00bb:
        r0 = r3.f19781c;
        r0 = com.p085c.p086a.C1212c.m2872a(r0);
        r1 = 2131231839; // 0x7f08045f float:1.807977E38 double:1.052968435E-314;
        goto L_0x00d8;
    L_0x00c5:
        r0 = r3.f19781c;
        r0 = com.p085c.p086a.C1212c.m2872a(r0);
        r1 = 2131231841; // 0x7f080461 float:1.8079774E38 double:1.052968436E-314;
        goto L_0x00d8;
    L_0x00cf:
        r0 = r3.f19781c;
        r0 = com.p085c.p086a.C1212c.m2872a(r0);
        r1 = 2131231840; // 0x7f080460 float:1.8079772E38 double:1.0529684355E-314;
    L_0x00d8:
        r1 = java.lang.Integer.valueOf(r1);
        r0 = r0.m10950a(r1);
        r1 = r3.f19783e;
        r0.m3031a(r1);
    L_0x00e5:
        r4 = r4.f19504k;
        if (r4 != 0) goto L_0x00f0;
    L_0x00e9:
        r4 = r3.f19787i;
        r0 = 4;
    L_0x00ec:
        r4.setVisibility(r0);
        return;
    L_0x00f0:
        r4 = r3.f19787i;
        r0 = 0;
        goto L_0x00ec;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.main.callslist.a.b.a(mobi.mmdt.ott.view.components.c.g):void");
    }
}
