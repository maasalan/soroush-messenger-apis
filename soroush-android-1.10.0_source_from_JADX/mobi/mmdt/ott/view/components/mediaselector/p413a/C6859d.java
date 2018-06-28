package mobi.mmdt.ott.view.components.mediaselector.p413a;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.mediaselector.p567b.C7333e;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;

public final class C6859d extends C6073e {
    private Activity f19574b;
    private ImageView f19575c = ((ImageView) this.itemView.findViewById(R.id.content_imageView));

    public C6859d(Activity activity, C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2) {
        super(layoutInflater, viewGroup, R.layout.media_video_list_item, c3126i);
        this.f19574b = activity;
        LayoutParams layoutParams = (LayoutParams) this.f19575c.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
    }

    protected final void mo3180a(C6829g c6829g) {
        C7333e c7333e = (C7333e) c6829g;
        this.f19575c.setImageBitmap(null);
        if (c7333e.f21139b != null) {
            C1212c.m2872a(this.f19574b).m10950a(c7333e.f21139b).m3034a(new C1248f().m2959e()).m3033a().m3031a(this.f19575c);
        }
    }
}
