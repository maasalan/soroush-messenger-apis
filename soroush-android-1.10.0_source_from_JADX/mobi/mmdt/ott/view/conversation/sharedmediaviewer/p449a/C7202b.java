package mobi.mmdt.ott.view.conversation.sharedmediaviewer.p449a;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.sharedmediaviewer.p575b.C7361b;

public final class C7202b extends C6914a {
    private Activity f20796b;
    private ImageView f20797c = ((ImageView) this.itemView.findViewById(R.id.content_imageView));

    public C7202b(Activity activity, C3126i c3126i, C3284e c3284e, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2) {
        super(c3126i, c3284e, R.layout.shared_media_gif_list_item, layoutInflater, viewGroup);
        this.f20796b = activity;
        LayoutParams layoutParams = (LayoutParams) this.f20797c.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7361b c7361b = (C7361b) c6829g;
        this.f20797c.setImageBitmap(null);
        if (c7361b.f21356e != null) {
            C1212c.m2872a(this.f20796b).m10950a(c7361b.f21357f).m3034a(new C1248f().m2959e()).m3033a().m3031a(this.f20797c);
        } else {
            C1212c.m2872a(this.f20796b).m10953a(this.f20797c);
        }
    }
}
