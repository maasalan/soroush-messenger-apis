package mobi.mmdt.ott.view.contact.p415a.p417b;

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
import mobi.mmdt.ott.view.contact.p415a.C3266c;
import mobi.mmdt.ott.view.contact.p415a.p569c.C7337b;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6869a extends C6073e {
    private String f19584b;
    private Activity f19585c;
    private RoundAvatarImageView f19586d;
    private TextView f19587e;
    private TextView f19588f;
    private CheckBox f19589g;
    private FrameLayout f19590h;
    private View f19591i;
    private C3266c f19592j;
    private boolean f19593k = false;

    class C32631 implements OnTouchListener {
        final /* synthetic */ C6869a f10031a;

        C32631(C6869a c6869a) {
            this.f10031a = c6869a;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (((C7337b) this.f10031a.f16244a).f21172i) {
                this.f10031a.f19589g.dispatchTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), (float) ((this.f10031a.f19589g.getWidth() - this.f10031a.f19589g.getPaddingRight()) / 2), (float) (this.f10031a.f19589g.getHeight() / 2), motionEvent.getMetaState()));
            }
            return false;
        }
    }

    class C32642 implements OnCheckedChangeListener {
        final /* synthetic */ C6869a f10032a;

        C32642(C6869a c6869a) {
            this.f10032a = c6869a;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (((C7337b) this.f10032a.f16244a).f21172i && !this.f10032a.f19593k) {
                if (z) {
                    this.f10032a.f19592j.mo2290c(((C7337b) this.f10032a.f16244a).f21164a);
                    return;
                }
                this.f10032a.f19592j.mo2291d(((C7337b) this.f10032a.f16244a).f21164a);
            }
        }
    }

    public C6869a(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3266c c3266c) {
        super(layoutInflater, viewGroup, R.layout.list_item_checkable_contacts, null);
        this.f19585c = activity;
        this.f19592j = c3266c;
        this.f19591i = this.itemView.findViewById(R.id.divider_line);
        this.f19586d = (RoundAvatarImageView) this.itemView.findViewById(R.id.imageView1);
        this.f19587e = (TextView) this.itemView.findViewById(R.id.textView1);
        this.f19588f = (TextView) this.itemView.findViewById(R.id.textView2);
        this.f19589g = (CheckBox) this.itemView.findViewById(R.id.checkBox);
        this.f19590h = (FrameLayout) this.itemView.findViewById(R.id.root_layout);
        this.f19584b = C2535a.m6888a().m6919b();
        this.f19590h.setOnTouchListener(new C32631(this));
        this.f19589g.setOnCheckedChangeListener(new C32642(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        TextView textView;
        CharSequence b;
        C1274i a;
        C7337b c7337b = (C7337b) c6829g;
        if (this.f19584b.equals("fa")) {
            this.f19587e.setText(C2491i.m6814b(c7337b.f21166c));
            textView = this.f19588f;
            String a2 = (c7337b.f21167d == null || c7337b.f21167d.isEmpty()) ? C4522p.m8236a(R.string.im_using_soroush) : c7337b.f21167d;
            b = C2491i.m6814b(a2);
        } else {
            this.f19587e.setText(c7337b.f21166c);
            textView = this.f19588f;
            b = (c7337b.f21167d == null || c7337b.f21167d.isEmpty()) ? C4522p.m8236a(R.string.im_using_soroush) : c7337b.f21167d;
        }
        textView.setText(b);
        this.f19586d.setImageBitmap(null);
        if (c7337b.f21168e != null) {
            a = C1212c.m2872a(this.f19585c).m10950a(C4515k.m8231a(C2556b.m6998a(c7337b.f21168e))).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a)).m3033a();
        } else if (c7337b.f21169f != null) {
            a = C1212c.m2872a(this.f19585c).m10950a(c7337b.f21169f).m3033a().m3034a(C1248f.m2945b());
        } else {
            C1212c.m2872a(this.f19585c).m10953a(this.f19586d);
            this.f19586d.setName(c7337b.f21166c);
            this.f19586d.setBackgroundColor(c7337b.f21170g);
            this.f19589g.setEnabled(c7337b.f21172i);
            this.f19593k = true;
            this.f19589g.setChecked(c7337b.f21171h);
            this.f19593k = false;
            C2491i.m6796a(this.f19591i, UIThemeManager.getmInstance().getLine_divider_color());
            C2491i.m6802a(this.f19587e, UIThemeManager.getmInstance().getText_primary_color());
            C2491i.m6802a(this.f19588f, UIThemeManager.getmInstance().getText_secondary_color());
            C2491i.m6799a(this.f19589g, UIThemeManager.getmInstance().getAccent_color());
        }
        a.m3031a(this.f19586d);
        this.f19586d.setName(c7337b.f21166c);
        this.f19586d.setBackgroundColor(c7337b.f21170g);
        this.f19589g.setEnabled(c7337b.f21172i);
        this.f19593k = true;
        this.f19589g.setChecked(c7337b.f21171h);
        this.f19593k = false;
        C2491i.m6796a(this.f19591i, UIThemeManager.getmInstance().getLine_divider_color());
        C2491i.m6802a(this.f19587e, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f19588f, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6799a(this.f19589g, UIThemeManager.getmInstance().getAccent_color());
    }
}
