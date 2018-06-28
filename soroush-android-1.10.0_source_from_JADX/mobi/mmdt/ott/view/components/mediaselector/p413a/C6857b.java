package mobi.mmdt.ott.view.components.mediaselector.p413a;

import android.app.Activity;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.mediaselector.p567b.C7423c;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;

public final class C6857b extends C6073e {
    private Activity f19561b;
    private ImageView f19562c = ((ImageView) this.itemView.findViewById(R.id.content_imageView));
    private FrameLayout f19563d = ((FrameLayout) this.itemView.findViewById(R.id.root_frameLayout));
    private FrameLayout f19564e = ((FrameLayout) this.itemView.findViewById(R.id.content_frameLayout));
    private CheckBox f19565f = ((CheckBox) this.itemView.findViewById(R.id.check_checkBox));

    public C6857b(Activity activity, C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2) {
        super(layoutInflater, viewGroup, R.layout.media_gif_list_item, c3126i);
        this.f19561b = activity;
        LayoutParams layoutParams = (LayoutParams) this.f19562c.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        GridLayoutManager.LayoutParams layoutParams2 = (GridLayoutManager.LayoutParams) this.f19563d.getLayoutParams();
        layoutParams2.height = i2;
        layoutParams2.width = i;
        C2491i.m6799a(this.f19565f, UIThemeManager.getmInstance().getAccent_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        C7423c c7423c = (C7423c) c6829g;
        this.f19562c.setImageBitmap(null);
        C1212c.m2872a(this.f19561b).m10958e().m3037a(c7423c.f21133a).m3034a(new C1248f().m2959e()).m3033a().m3031a(this.f19562c);
    }
}
