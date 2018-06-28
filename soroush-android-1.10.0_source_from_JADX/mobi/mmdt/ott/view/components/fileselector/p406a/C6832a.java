package mobi.mmdt.ott.view.components.fileselector.p406a;

import android.app.Activity;
import android.support.v4.p029a.C0346c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C1274i;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.fileselector.C3159b;
import mobi.mmdt.ott.view.components.fileselector.p565b.C7324b;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;

public final class C6832a extends C6073e {
    private Activity f19522b;
    private C3159b f19523c;
    private RoundAvatarImageView f19524d;
    private TextView f19525e;
    private TextView f19526f;
    private CheckBox f19527g;
    private View f19528h;
    private boolean f19529i = false;

    class C31581 implements OnCheckedChangeListener {
        final /* synthetic */ C6832a f9781a;

        C31581(C6832a c6832a) {
            this.f9781a = c6832a;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!this.f9781a.f19529i) {
                if (z) {
                    this.f9781a.f19523c.mo2263a((C7324b) this.f9781a.f16244a);
                    return;
                }
                this.f9781a.f19523c.mo2265b((C7324b) this.f9781a.f16244a);
            }
        }
    }

    public C6832a(Activity activity, C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup, C3159b c3159b) {
        super(layoutInflater, viewGroup, R.layout.files_file_list_item, c3126i);
        this.f19522b = activity;
        this.f19523c = c3159b;
        this.f19528h = this.itemView.findViewById(R.id.divider_line);
        this.f19524d = (RoundAvatarImageView) this.itemView.findViewById(R.id.imageView1);
        this.f19525e = (TextView) this.itemView.findViewById(R.id.textView1);
        this.f19526f = (TextView) this.itemView.findViewById(R.id.textView2);
        this.f19527g = (CheckBox) this.itemView.findViewById(R.id.checkBox);
        this.f19527g.setOnCheckedChangeListener(new C31581(this));
        C2491i.m6796a(this.f19528h, UIThemeManager.getmInstance().getLine_divider_color());
        C2491i.m6802a(this.f19525e, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f19526f, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6799a(this.f19527g, UIThemeManager.getmInstance().getAccent_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        C1274i a;
        int i;
        View view;
        C7324b c7324b = (C7324b) c6829g;
        this.f19525e.setText(c7324b.f21097a);
        this.f19526f.setText(c7324b.f21099c);
        this.f19524d.setBackgroundColor(C0346c.m687c(this.f19522b, R.color.file_background_color));
        this.f19524d.setTextColor(-1);
        this.f19524d.setImageBitmap(null);
        if (c7324b.f21101e == R.drawable.ic_file_selection_image) {
            a = C1212c.m2872a(this.f19522b).m10958e().m3037a(c7324b.f21098b);
        } else if (c7324b.f21101e == R.drawable.ic_file_selection_movie) {
            a = C1212c.m2872a(this.f19522b).m10950a(c7324b.f21098b);
        } else {
            a = C1212c.m2872a(this.f19522b).m10950a(Integer.valueOf(c7324b.f21101e));
            a.m3031a(this.f19524d);
            this.f19529i = true;
            this.f19527g.setChecked(c7324b.f21100d);
            i = 0;
            this.f19529i = false;
            if (this.f19523c == null && this.f19523c.mo2264a()) {
                this.f19527g.setVisibility(0);
            } else {
                this.f19527g.setVisibility(8);
            }
            if (c7324b.f19504k != 0) {
                view = this.f19528h;
                i = 4;
            } else {
                view = this.f19528h;
            }
            view.setVisibility(i);
        }
        a = a.m3034a(C1248f.m2945b().m2955b(C1144h.f3689a).m2949a(c7324b.f21101e));
        a.m3031a(this.f19524d);
        this.f19529i = true;
        this.f19527g.setChecked(c7324b.f21100d);
        i = 0;
        this.f19529i = false;
        if (this.f19523c == null) {
        }
        this.f19527g.setVisibility(8);
        if (c7324b.f19504k != 0) {
            view = this.f19528h;
        } else {
            view = this.f19528h;
            i = 4;
        }
        view.setVisibility(i);
    }
}
