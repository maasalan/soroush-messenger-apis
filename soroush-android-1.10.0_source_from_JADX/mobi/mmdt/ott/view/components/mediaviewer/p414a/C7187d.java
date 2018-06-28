package mobi.mmdt.ott.view.components.mediaviewer.p414a;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.p085c.p086a.C1212c;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.mediaviewer.p568b.C7336d;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.tools.C4478a;

public final class C7187d extends C6867a {
    private ImageView f20675b = ((ImageView) this.itemView.findViewById(R.id.content_imageView));
    private ImageButton f20676c = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private Activity f20677d;

    class C32301 implements OnClickListener {
        final /* synthetic */ C7187d f9963a;

        C32301(C7187d c7187d) {
            this.f9963a = c7187d;
        }

        public final void onClick(View view) {
            C4478a.m8158b(this.f9963a.f20677d, ((C7336d) this.f9963a.f16244a).f20678a);
        }
    }

    public C7187d(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater, viewGroup, R.layout.media_viewer_video_list_item);
        this.f20677d = activity;
        this.f20676c.setOnClickListener(new C32301(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        C1212c.m2872a(this.f20677d).m10950a(((C7336d) c6829g).f20678a).m3033a().m3031a(this.f20675b);
    }
}
