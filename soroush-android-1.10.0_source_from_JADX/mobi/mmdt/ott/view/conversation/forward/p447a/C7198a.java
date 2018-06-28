package mobi.mmdt.ott.view.conversation.forward.p447a;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C1274i;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.forward.C4054e;
import mobi.mmdt.ott.view.conversation.forward.p599b.C7360a;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C7198a extends C6073e {
    private FrameLayout f19686b;
    private CheckBox f19687c;
    private String f19688d;
    private Activity f19689e;
    private RoundAvatarImageView f19690f;
    private TextView f19691g;
    private TextView f19692h;
    private View f19693i;
    private boolean f19694j = false;
    private C4054e f19695k;

    class C40511 implements OnTouchListener {
        final /* synthetic */ C7198a f11614a;

        C40511(C7198a c7198a) {
            this.f11614a = c7198a;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f11614a.f19687c.dispatchTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), (float) ((this.f11614a.f19687c.getWidth() - this.f11614a.f19687c.getPaddingRight()) / 2), (float) (this.f11614a.f19687c.getHeight() / 2), motionEvent.getMetaState()));
            return false;
        }
    }

    class C40522 implements OnCheckedChangeListener {
        final /* synthetic */ C7198a f11615a;

        C40522(C7198a c7198a) {
            this.f11615a = c7198a;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!((C7360a) this.f11615a.f16244a).f21354h) {
                this.f11615a.f19695k.mo2377e(this.f11615a.f16244a.f19504k);
            } else if (!this.f11615a.f19694j) {
                if (z) {
                    this.f11615a.f19695k.mo2374a(this.f11615a.f16244a.f19504k);
                } else {
                    this.f11615a.f19695k.mo2376b(this.f11615a.f16244a.f19504k);
                }
            }
        }
    }

    public C7198a(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C4054e c4054e) {
        super(layoutInflater, viewGroup, R.layout.list_item_contacts_without_invite, null);
        this.f19689e = activity;
        this.f19695k = c4054e;
        this.f19693i = this.itemView.findViewById(R.id.divider_line);
        this.f19690f = (RoundAvatarImageView) this.itemView.findViewById(R.id.imageView1);
        this.f19691g = (TextView) this.itemView.findViewById(R.id.textView1);
        this.f19692h = (TextView) this.itemView.findViewById(R.id.textView2);
        this.f19688d = C2535a.m6888a().m6919b();
        this.f19687c = (CheckBox) this.itemView.findViewById(R.id.checkBox);
        this.f19686b = (FrameLayout) this.itemView.findViewById(R.id.root_frameLayout);
        this.f19686b.setOnTouchListener(new C40511(this));
        this.f19687c.setOnCheckedChangeListener(new C40522(this));
        C2491i.m6796a(this.f19693i, UIThemeManager.getmInstance().getLine_divider_in_main_activity_color());
        C2491i.m6802a(this.f19691g, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f19692h, UIThemeManager.getmInstance().getText_secondary_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        TextView textView;
        CharSequence b;
        C1274i a;
        C7360a c7360a = (C7360a) c6829g;
        if (this.f19688d.equals("fa")) {
            this.f19691g.setText(C2491i.m6814b(c7360a.f21347a));
            textView = this.f19692h;
            String a2 = (c7360a.f21349c == null || c7360a.f21349c.isEmpty()) ? C4522p.m8236a(R.string.im_using_soroush) : c7360a.f21349c;
            b = C2491i.m6814b(a2);
        } else {
            this.f19691g.setText(c7360a.f21347a);
            textView = this.f19692h;
            b = (c7360a.f21349c == null || c7360a.f21349c.isEmpty()) ? C4522p.m8236a(R.string.im_using_soroush) : c7360a.f21349c;
        }
        textView.setText(b);
        this.f19690f.setImageBitmap(null);
        if (c7360a.f21350d != null && !c7360a.f21350d.isEmpty()) {
            a = C1212c.m2872a(this.f19689e).m10950a(C4515k.m8231a(C2556b.m6998a(c7360a.f21350d))).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a));
        } else if (c7360a.f21351e != null) {
            a = C1212c.m2872a(this.f19689e).m10950a(c7360a.f21351e).m3034a(C1248f.m2945b()).m3033a();
        } else {
            C1212c.m2872a(this.f19689e).m10953a(this.f19690f);
            this.f19690f.setName(c7360a.f21347a);
            this.f19690f.setBackgroundColor(c7360a.f21352f);
            if (c7360a.f19504k != 0) {
                this.f19693i.setVisibility(4);
            } else {
                this.f19693i.setVisibility(0);
            }
            if (c7360a.f21354h) {
                this.f19687c.setVisibility(8);
            } else {
                this.f19687c.setVisibility(0);
                this.f19694j = true;
                this.f19687c.setChecked(c7360a.f21353g);
                this.f19694j = false;
            }
            C2491i.m6799a(this.f19687c, UIThemeManager.getmInstance().getAccent_color());
        }
        a.m3031a(this.f19690f);
        this.f19690f.setName(c7360a.f21347a);
        this.f19690f.setBackgroundColor(c7360a.f21352f);
        if (c7360a.f19504k != 0) {
            this.f19693i.setVisibility(0);
        } else {
            this.f19693i.setVisibility(4);
        }
        if (c7360a.f21354h) {
            this.f19687c.setVisibility(8);
        } else {
            this.f19687c.setVisibility(0);
            this.f19694j = true;
            this.f19687c.setChecked(c7360a.f21353g);
            this.f19694j = false;
        }
        C2491i.m6799a(this.f19687c, UIThemeManager.getmInstance().getAccent_color());
    }
}
