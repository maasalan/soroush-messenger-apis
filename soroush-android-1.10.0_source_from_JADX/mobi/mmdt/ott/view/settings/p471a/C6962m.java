package mobi.mmdt.ott.view.settings.p471a;

import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.settings.mainsettings.C4377b;
import mobi.mmdt.ott.view.settings.p583b.C7389n;

public final class C6962m extends C6073e {
    private C4377b f19877b;
    private TextView f19878c;
    private ViewGroup f19879d;
    private SwitchCompat f19880e;
    private View f19881f;
    private boolean f19882g = false;

    class C43671 implements OnTouchListener {
        final /* synthetic */ C6962m f12238a;

        C43671(C6962m c6962m) {
            this.f12238a = c6962m;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f12238a.f19880e.dispatchTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), (float) ((this.f12238a.f19880e.getWidth() - this.f12238a.f19880e.getPaddingRight()) / 2), (float) (this.f12238a.f19880e.getHeight() / 2), motionEvent.getMetaState()));
            return false;
        }
    }

    class C43682 implements OnCheckedChangeListener {
        final /* synthetic */ C6962m f12239a;

        C43682(C6962m c6962m) {
            this.f12239a = c6962m;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!this.f12239a.f19882g) {
                this.f12239a.f19877b.mo3690a(this.f12239a.f16244a.f19503j, z);
            }
        }
    }

    public C6962m(C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup, C4377b c4377b) {
        super(layoutInflater, viewGroup, R.layout.settings_item_switch_single_line, c3126i);
        this.f19877b = c4377b;
        this.f19878c = (TextView) this.itemView.findViewById(R.id.textView1);
        this.f19880e = (SwitchCompat) this.itemView.findViewById(R.id.switch1);
        this.f19879d = (ViewGroup) this.itemView.findViewById(R.id.root_layout);
        this.f19881f = this.itemView.findViewById(R.id.divider_line);
        this.f19879d.setOnTouchListener(new C43671(this));
        this.f19880e.setOnCheckedChangeListener(new C43682(this));
        C2491i.m6796a(this.f19881f, UIThemeManager.getmInstance().getLine_divider_color());
        C2491i.m6802a(this.f19878c, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6803a(this.f19878c);
    }

    protected final void mo3180a(C6829g c6829g) {
        View view;
        C7389n c7389n = (C7389n) c6829g;
        this.f19878c.setText(c7389n.f21484a);
        this.f19882g = true;
        this.f19880e.setChecked(c7389n.f21485b);
        int i = 0;
        this.f19882g = false;
        if (c7389n.f19504k == 0) {
            view = this.f19881f;
            i = 4;
        } else {
            view = this.f19881f;
        }
        view.setVisibility(i);
        C2491i.m6794a(this.f19880e, UIThemeManager.getmInstance().getSwitch_line_color(), UIThemeManager.getmInstance().getAccent_color());
    }
}
