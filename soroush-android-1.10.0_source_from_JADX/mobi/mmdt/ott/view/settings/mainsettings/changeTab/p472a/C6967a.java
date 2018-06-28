package mobi.mmdt.ott.view.settings.mainsettings.changeTab.p472a;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.contact.p415a.C3266c;
import mobi.mmdt.ott.view.settings.mainsettings.changeTab.p584b.C7224a;

public final class C6967a extends C6073e {
    private LinearLayout f19892b;
    private CheckBox f19893c;
    private TextView f19894d;
    private boolean f19895e = false;
    private C3266c f19896f;

    class C43811 implements OnTouchListener {
        final /* synthetic */ C6967a f12250a;

        C43811(C6967a c6967a) {
            this.f12250a = c6967a;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (((C7224a) this.f12250a.f16244a).f20865c) {
                this.f12250a.f19893c.dispatchTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), (float) ((this.f12250a.f19893c.getWidth() - this.f12250a.f19893c.getPaddingRight()) / 2), (float) (this.f12250a.f19893c.getHeight() / 2), motionEvent.getMetaState()));
            }
            return false;
        }
    }

    class C43822 implements OnCheckedChangeListener {
        final /* synthetic */ C6967a f12251a;

        C43822(C6967a c6967a) {
            this.f12251a = c6967a;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (((C7224a) this.f12251a.f16244a).f20865c && !this.f12251a.f19895e) {
                if (z) {
                    this.f12251a.f19896f.mo2290c(this.f12251a.f16244a.f19504k);
                    return;
                }
                this.f12251a.f19896f.mo2291d(this.f12251a.f16244a.f19504k);
            }
        }
    }

    public C6967a(LayoutInflater layoutInflater, ViewGroup viewGroup, C3266c c3266c) {
        super(layoutInflater, viewGroup, R.layout.list_item_change_tab_check_box, null);
        this.f19896f = c3266c;
        this.f19892b = (LinearLayout) this.itemView.findViewById(R.id.rootLinearLayout);
        this.f19893c = (CheckBox) this.itemView.findViewById(R.id.checkBox);
        this.f19894d = (TextView) this.itemView.findViewById(R.id.tab_name);
        this.f19892b.setOnTouchListener(new C43811(this));
        this.f19893c.setOnCheckedChangeListener(new C43822(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        C7224a c7224a = (C7224a) c6829g;
        this.f19894d.setText(c7224a.f20864b);
        this.f19895e = true;
        this.f19893c.setChecked(c7224a.f20866d);
        this.f19893c.setEnabled(c7224a.f20865c);
        this.f19895e = false;
        C2491i.m6802a(this.f19894d, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6782a(UIThemeManager.getmInstance().getAccent_color(), this.f19893c);
    }
}
