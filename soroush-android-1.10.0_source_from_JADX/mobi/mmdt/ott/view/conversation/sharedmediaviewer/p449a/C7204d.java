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
import mobi.mmdt.ott.view.conversation.sharedmediaviewer.p575b.C7363d;

public final class C7204d extends C6914a {
    private Activity f20801b;
    private ImageView f20802c = ((ImageView) this.itemView.findViewById(R.id.content_imageView));

    public C7204d(Activity activity, C3126i c3126i, C3284e c3284e, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2) {
        super(c3126i, c3284e, R.layout.shared_media_video_list_item, layoutInflater, viewGroup);
        this.f20801b = activity;
        LayoutParams layoutParams = (LayoutParams) this.f20802c.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7363d c7363d = (C7363d) c6829g;
        this.f20802c.setImageBitmap(null);
        if (c7363d.f21363f != null) {
            C1212c.m2872a(this.f20801b).m10950a(c7363d.f21363f).m3034a(new C1248f().m2959e()).m3033a().m3031a(this.f20802c);
        } else if (c7363d.f21362e != null) {
            C1212c.m2872a(this.f20801b).m10950a(c7363d.f21362e).m3034a(new C1248f().m2959e()).m3033a().m3031a(this.f20802c);
        } else {
            C1212c.m2872a(this.f20801b).m10953a(this.f20802c);
        }
    }
}
