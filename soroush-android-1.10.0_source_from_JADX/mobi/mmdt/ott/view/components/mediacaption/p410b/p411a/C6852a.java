package mobi.mmdt.ott.view.components.mediacaption.p410b.p411a;

import android.app.Activity;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.mediacaption.C3202a;
import mobi.mmdt.ott.view.components.mediacaption.p410b.p566b.C7330d;
import mobi.mmdt.ott.view.components.mediacaption.p410b.p566b.C7422b;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;

public final class C6852a extends C6073e {
    private Activity f19541b;
    private ImageView f19542c = ((ImageView) this.itemView.findViewById(R.id.content_imageView));
    private ImageButton f19543d = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private FrameLayout f19544e = ((FrameLayout) this.itemView.findViewById(R.id.root_frameLayout));
    private FrameLayout f19545f = ((FrameLayout) this.itemView.findViewById(R.id.select_lines_frameLayout));
    private C3202a f19546g;

    class C32051 implements OnClickListener {
        final /* synthetic */ C6852a f9935a;

        C32051(C6852a c6852a) {
            this.f9935a = c6852a;
        }

        public final void onClick(View view) {
            this.f9935a.f19546g.mo2279a((C7330d) this.f9935a.f16244a);
        }
    }

    class C32062 implements OnClickListener {
        final /* synthetic */ C6852a f9936a;

        C32062(C6852a c6852a) {
            this.f9936a = c6852a;
        }

        public final void onClick(View view) {
            this.f9936a.f19546g.mo2281b((C7330d) this.f9936a.f16244a);
        }
    }

    public C6852a(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3202a c3202a) {
        super(layoutInflater, viewGroup, R.layout.gif_caption_photo_list_item, null);
        this.f19541b = activity;
        LayoutParams layoutParams = (LayoutParams) this.f19542c.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        GridLayoutManager.LayoutParams layoutParams2 = (GridLayoutManager.LayoutParams) this.f19544e.getLayoutParams();
        layoutParams2.height = i2;
        layoutParams2.width = i;
        this.f19546g = c3202a;
        this.f19543d.setOnClickListener(new C32051(this));
        this.f19542c.setOnClickListener(new C32062(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        FrameLayout frameLayout;
        int i;
        C7422b c7422b = (C7422b) c6829g;
        if (c7422b.f21125a != null) {
            C1212c.m2872a(this.f19541b).m10958e().m3037a(c7422b.f21125a).m3034a(new C1248f().m2959e()).m3033a().m3031a(this.f19542c);
        }
        if (c7422b.f21126b) {
            frameLayout = this.f19545f;
            i = 0;
        } else {
            frameLayout = this.f19545f;
            i = 8;
        }
        frameLayout.setVisibility(i);
    }
}
