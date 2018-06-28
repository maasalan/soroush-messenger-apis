package mobi.mmdt.ott.view.settings.p471a;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.settings.mainsettings.profileinfo.deactivateaccount.DeactivateAccountActivity;
import mobi.mmdt.ott.view.settings.p583b.C7377b;

public final class C6950a extends C6073e {
    private Button f19837b = ((Button) this.itemView.findViewById(R.id.deactive_button));
    private View f19838c = this.itemView.findViewById(R.id.divider_line);

    public C6950a(final Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater, viewGroup, R.layout.settings_item_button, null);
        this.f19837b.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ C6950a f12233b;

            public final void onClick(View view) {
                activity.startActivity(new Intent(activity, DeactivateAccountActivity.class));
                activity.overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
            }
        });
        C2491i.m6796a(this.f19838c, UIThemeManager.getmInstance().getLine_divider_color());
        C2491i.m6819b(this.f19837b, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6798a(this.f19837b, UIThemeManager.getmInstance().getButton_text_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        View view;
        int i;
        C7377b c7377b = (C7377b) c6829g;
        this.f19837b.setText(c7377b.f21455a);
        if (c7377b.f19504k == 0) {
            view = this.f19838c;
            i = 4;
        } else {
            view = this.f19838c;
            i = 0;
        }
        view.setVisibility(i);
    }
}
