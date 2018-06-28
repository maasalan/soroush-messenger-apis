package mobi.mmdt.ott.view.vas.owghat.setting.p484a;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.AppCompatSpinner;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.vas.owghat.setting.C4554b;
import mobi.mmdt.ott.view.vas.owghat.setting.p600b.C7397a;

public final class C6991a extends C6073e {
    private TextView f19970b = ((TextView) this.itemView.findViewById(R.id.textView1));
    private AppCompatSpinner f19971c = ((AppCompatSpinner) this.itemView.findViewById(R.id.spinner1));
    private View f19972d = this.itemView.findViewById(R.id.divider_line);
    private RelativeLayout f19973e = ((RelativeLayout) this.itemView.findViewById(R.id.spinner_layout));
    private C4554b f19974f;

    class C45511 implements OnClickListener {
        final /* synthetic */ C6991a f12563a;

        C45511(C6991a c6991a) {
            this.f12563a = c6991a;
        }

        public final void onClick(View view) {
            this.f12563a.f19971c.performClick();
        }
    }

    public C6991a(C3126i c3126i, C4554b c4554b, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater, viewGroup, R.layout.settings_item_double_line_with_spinner, c3126i);
        this.f19974f = c4554b;
        C2491i.m6796a(this.f19972d, UIThemeManager.getmInstance().getLine_divider_color());
        C2491i.m6802a(this.f19970b, UIThemeManager.getmInstance().getText_primary_color());
        this.f19971c.setPopupBackgroundDrawable(new ColorDrawable(UIThemeManager.getmInstance().getRecycler_view_background_color()));
    }

    protected final void mo3180a(C6829g c6829g) {
        View view;
        int i;
        final C7397a c7397a = (C7397a) c6829g;
        this.f19970b.setText(c7397a.f21510a);
        this.f19971c.setAdapter(c7397a.f21511b);
        this.f19971c.setSelection(c7397a.f21512c);
        if (c7397a.f19504k == 0) {
            view = this.f19972d;
            i = 4;
        } else {
            view = this.f19972d;
            i = 0;
        }
        view.setVisibility(i);
        this.f19973e.setOnClickListener(new C45511(this));
        this.f19971c.setOnItemSelectedListener(new OnItemSelectedListener(this) {
            final /* synthetic */ C6991a f12565b;

            public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                this.f12565b.f19974f.mo3689a(i, c7397a.f19503j);
            }

            public final void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
}
