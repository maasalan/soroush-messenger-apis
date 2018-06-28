package mobi.mmdt.ott.view.components.mediacaption.p410b.p411a;

import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;

public final class C6853b extends C6073e {
    private ImageView f19547b = ((ImageView) this.itemView.findViewById(R.id.content_imageView));
    private FrameLayout f19548c = ((FrameLayout) this.itemView.findViewById(R.id.root_frameLayout));

    public C6853b(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2) {
        super(layoutInflater, viewGroup, R.layout.image_caption_add_button_list_item, null);
        LayoutParams layoutParams = (LayoutParams) this.f19547b.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        GridLayoutManager.LayoutParams layoutParams2 = (GridLayoutManager.LayoutParams) this.f19548c.getLayoutParams();
        layoutParams2.height = i2;
        layoutParams2.width = i;
    }

    protected final void mo3180a(C6829g c6829g) {
    }
}
