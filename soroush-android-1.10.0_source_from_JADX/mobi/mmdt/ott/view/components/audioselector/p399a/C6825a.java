package mobi.mmdt.ott.view.components.audioselector.p399a;

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
import mobi.mmdt.ott.view.components.audioselector.C3107b;
import mobi.mmdt.ott.view.components.audioselector.p596b.C7323a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;

public final class C6825a extends C6073e {
    private TextView f19490b;
    private Activity f19491c;
    private C3107b f19492d;
    private RoundAvatarImageView f19493e;
    private TextView f19494f;
    private TextView f19495g;
    private CheckBox f19496h;
    private View f19497i;
    private boolean f19498j = false;

    class C31061 implements OnCheckedChangeListener {
        final /* synthetic */ C6825a f9671a;

        C31061(C6825a c6825a) {
            this.f9671a = c6825a;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!this.f9671a.f19498j) {
                C6829g c6829g;
                if (z) {
                    this.f9671a.f19492d;
                    c6829g = this.f9671a.f16244a;
                    return;
                }
                this.f9671a.f19492d;
                c6829g = this.f9671a.f16244a;
            }
        }
    }

    public C6825a(Activity activity, C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup, C3107b c3107b) {
        super(layoutInflater, viewGroup, R.layout.files_file_list_item, c3126i);
        this.f19491c = activity;
        this.f19492d = c3107b;
        this.f19497i = this.itemView.findViewById(R.id.divider_line);
        this.f19493e = (RoundAvatarImageView) this.itemView.findViewById(R.id.imageView1);
        this.f19494f = (TextView) this.itemView.findViewById(R.id.textView1);
        this.f19495g = (TextView) this.itemView.findViewById(R.id.textView2);
        this.f19490b = (TextView) this.itemView.findViewById(R.id.textView3);
        this.f19496h = (CheckBox) this.itemView.findViewById(R.id.checkBox);
        this.f19496h.setOnCheckedChangeListener(new C31061(this));
        C2491i.m6796a(this.f19497i, UIThemeManager.getmInstance().getLine_divider_color());
        C2491i.m6802a(this.f19494f, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f19495g, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6802a(this.f19490b, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6799a(this.f19496h, UIThemeManager.getmInstance().getAccent_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        C1274i a;
        C7323a c7323a = (C7323a) c6829g;
        this.f19494f.setText(c7323a.f21092b);
        this.f19495g.setText(c7323a.f21094d);
        if (c7323a.f21094d.isEmpty()) {
            this.f19495g.setVisibility(8);
        } else {
            this.f19495g.setVisibility(0);
        }
        this.f19490b.setText(C2491i.m6774a(this.f19491c, (long) c7323a.f21091a, true));
        this.f19493e.setBackgroundColor(C0346c.m687c(this.f19491c, R.color.file_background_color));
        this.f19493e.setTextColor(-1);
        this.f19493e.setImageBitmap(null);
        if (c7323a.f21096f == R.drawable.ic_file_selection_image) {
            a = C1212c.m2872a(this.f19491c).m10958e().m3037a(c7323a.f21093c);
        } else if (c7323a.f21096f == R.drawable.ic_file_selection_movie) {
            a = C1212c.m2872a(this.f19491c).m10950a(c7323a.f21093c);
        } else {
            a = C1212c.m2872a(this.f19491c).m10950a(Integer.valueOf(c7323a.f21096f));
            a.m3031a(this.f19493e);
            this.f19498j = true;
            this.f19496h.setChecked(c7323a.f21095e);
            this.f19498j = false;
            if (this.f19492d == null && this.f19492d.mo2233b()) {
                this.f19496h.setVisibility(0);
            } else {
                this.f19496h.setVisibility(8);
            }
            if (c7323a.f19504k != 0) {
                this.f19497i.setVisibility(4);
            } else {
                this.f19497i.setVisibility(0);
            }
        }
        a = a.m3034a(C1248f.m2945b().m2955b(C1144h.f3689a).m2949a(c7323a.f21096f));
        a.m3031a(this.f19493e);
        this.f19498j = true;
        this.f19496h.setChecked(c7323a.f21095e);
        this.f19498j = false;
        if (this.f19492d == null) {
        }
        this.f19496h.setVisibility(8);
        if (c7323a.f19504k != 0) {
            this.f19497i.setVisibility(0);
        } else {
            this.f19497i.setVisibility(4);
        }
    }
}
