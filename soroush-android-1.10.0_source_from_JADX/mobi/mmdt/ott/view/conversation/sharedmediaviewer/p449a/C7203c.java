package mobi.mmdt.ott.view.conversation.sharedmediaviewer.p449a;

import android.app.Activity;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.provider.p386h.C2987i;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.sharedmediaviewer.p575b.C7362c;

public final class C7203c extends C6914a {
    private Activity f20798b;
    private ImageView f20799c = ((ImageView) this.itemView.findViewById(R.id.content_imageView));
    private C3284e f20800d;

    static /* synthetic */ class C40932 {
        static final /* synthetic */ int[] f11696a = new int[C2987i.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = mobi.mmdt.ott.provider.p386h.C2987i.values();
            r0 = r0.length;
            r0 = new int[r0];
            f11696a = r0;
            r0 = f11696a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.sharedmediaviewer.a.c.2.<clinit>():void");
        }
    }

    public C7203c(Activity activity, final C3126i c3126i, C3284e c3284e, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2) {
        super(c3126i, c3284e, R.layout.shared_media_photo_list_item, layoutInflater, viewGroup);
        this.f20798b = activity;
        this.f20800d = c3284e;
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.root_frameLayout);
        LayoutParams layoutParams = (LayoutParams) this.f20799c.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        GridLayoutManager.LayoutParams layoutParams2 = (GridLayoutManager.LayoutParams) frameLayout.getLayoutParams();
        layoutParams2.height = i2;
        layoutParams2.width = i;
        this.f20799c.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ C7203c f11695b;

            public final void onClick(View view) {
                C7362c c7362c = (C7362c) this.f11695b.f16244a;
                if (C40932.f11696a[c7362c.f20806d.ordinal()] == 1) {
                    c3126i.mo2234c(c7362c.f19504k);
                }
            }
        });
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7362c c7362c = (C7362c) c6829g;
        this.f20799c.setImageBitmap(null);
        if (c7362c.f21360f != null) {
            C1212c.m2872a(this.f20798b).m10950a(c7362c.f21360f).m3034a(new C1248f().m2959e()).m3033a().m3031a(this.f20799c);
        } else if (c7362c.f21359e != null) {
            C1212c.m2872a(this.f20798b).m10950a(c7362c.f21359e).m3034a(new C1248f().m2959e()).m3033a().m3031a(this.f20799c);
        } else {
            C1212c.m2872a(this.f20798b).m10953a(this.f20799c);
        }
    }
}
