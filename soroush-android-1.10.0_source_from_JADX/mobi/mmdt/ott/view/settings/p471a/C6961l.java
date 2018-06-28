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
import mobi.mmdt.ott.view.settings.p583b.C7388m;

public final class C6961l extends C6073e {
    private C4377b f19870b;
    private TextView f19871c;
    private TextView f19872d;
    private ViewGroup f19873e;
    private SwitchCompat f19874f;
    private View f19875g;
    private boolean f19876h = false;

    class C43651 implements OnTouchListener {
        final /* synthetic */ C6961l f12236a;

        C43651(C6961l c6961l) {
            this.f12236a = c6961l;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f12236a.f19874f.dispatchTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), (float) ((this.f12236a.f19874f.getWidth() - this.f12236a.f19874f.getPaddingRight()) / 2), (float) (this.f12236a.f19874f.getHeight() / 2), motionEvent.getMetaState()));
            return false;
        }
    }

    class C43662 implements OnCheckedChangeListener {
        final /* synthetic */ C6961l f12237a;

        C43662(C6961l c6961l) {
            this.f12237a = c6961l;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!this.f12237a.f19876h) {
                this.f12237a.f19870b.mo3690a(this.f12237a.f16244a.f19503j, z);
            }
        }
    }

    public C6961l(C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup, C4377b c4377b) {
        super(layoutInflater, viewGroup, R.layout.settings_item_switch_double_line, c3126i);
        this.f19870b = c4377b;
        this.f19871c = (TextView) this.itemView.findViewById(R.id.textView1);
        this.f19872d = (TextView) this.itemView.findViewById(R.id.textView2);
        this.f19874f = (SwitchCompat) this.itemView.findViewById(R.id.switch1);
        this.f19873e = (ViewGroup) this.itemView.findViewById(R.id.root_layout);
        this.f19875g = this.itemView.findViewById(R.id.divider_line);
        this.f19873e.setOnTouchListener(new C43651(this));
        this.f19874f.setOnCheckedChangeListener(new C43662(this));
        C2491i.m6796a(this.f19875g, UIThemeManager.getmInstance().getLine_divider_color());
        C2491i.m6802a(this.f19871c, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f19872d, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6803a(this.f19871c);
    }

    protected final void mo3180a(C6829g c6829g) {
        View view;
        C7388m c7388m = (C7388m) c6829g;
        this.f19871c.setText(c7388m.f21481a);
        this.f19872d.setText(c7388m.f21482b);
        this.f19876h = true;
        this.f19874f.setChecked(c7388m.f21483c);
        int i = 0;
        this.f19876h = false;
        if (c7388m.f19504k == 0) {
            view = this.f19875g;
            i = 4;
        } else {
            view = this.f19875g;
        }
        view.setVisibility(i);
        C2491i.m6794a(this.f19874f, UIThemeManager.getmInstance().getSwitch_line_color(), UIThemeManager.getmInstance().getAccent_color());
    }
}
