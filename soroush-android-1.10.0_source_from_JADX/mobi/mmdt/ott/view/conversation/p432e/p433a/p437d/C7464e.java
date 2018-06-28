package mobi.mmdt.ott.view.conversation.p432e.p433a.p437d;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p386h.C2987i;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.conversation.p418a.C3280a;
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p432e.p433a.C7194a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7599e;
import pl.droidsonroids.gif.GifImageView;
import pl.droidsonroids.gif.a;

public final class C7464e extends C7348b {
    private final int f22036e;
    private final int f22037f;
    private ImageView f22038g = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private ImageButton f22039h = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ProgressWheel f22040i = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private TextView f22041j = ((TextView) this.itemView.findViewById(R.id.progress_text_action_view));
    private C3284e f22042k;
    private C3283d f22043l;
    private GifImageView f22044m = ((GifImageView) this.itemView.findViewById(R.id.content_gifView));
    private a f22045n;
    private View f22046o = this.itemView.findViewById(R.id.bottom_gradient_view);
    private LinearLayout f22047p = ((LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));

    class C36251 implements OnClickListener {
        final /* synthetic */ C7464e f10831a;

        C36251(C7464e c7464e) {
            this.f10831a = c7464e;
        }

        public final void onClick(View view) {
            C7599e c7599e = (C7599e) this.f10831a.f16244a;
            switch (c7599e.f23276V) {
                case DELETED:
                case NOT_STARTED:
                    if (c7599e.f23278X == null || c7599e.f23278X.isEmpty()) {
                        this.f10831a.f22042k.mo2307a(c7599e.ac, false);
                        return;
                    } else {
                        this.f10831a.f22042k.mo2307a(c7599e.ac, true);
                        return;
                    }
                case TRANSMITTING:
                    this.f10831a.f22042k.mo2305a(c7599e.ac);
                    return;
                case CANCEL:
                    if (c7599e.f23278X == null || c7599e.f23278X.isEmpty()) {
                        this.f10831a.f22042k.mo2307a(c7599e.ac, false);
                        return;
                    } else {
                        this.f10831a.f22042k.mo2307a(c7599e.ac, true);
                        return;
                    }
                case ERROR:
                    if (c7599e.f23278X == null || c7599e.f23278X.isEmpty()) {
                        this.f10831a.f22042k.mo2307a(c7599e.ac, false);
                        return;
                    } else {
                        this.f10831a.f22042k.mo2307a(c7599e.ac, true);
                        return;
                    }
                case FINISHED:
                    this.f10831a.f22043l.mo2319b(c7599e.f23273S, c7599e.f21334t);
                    return;
                default:
                    return;
            }
        }
    }

    class C36262 implements OnClickListener {
        final /* synthetic */ C7464e f10832a;

        C36262(C7464e c7464e) {
            this.f10832a = c7464e;
        }

        public final void onClick(View view) {
            C7599e c7599e = (C7599e) this.f10832a.f16244a;
            if (c7599e.f23278X != null && !c7599e.f23278X.isEmpty()) {
                if (c7599e.f23276V == C2987i.FINISHED) {
                }
            } else if (C36273.f10833a[c7599e.f23276V.ordinal()] != 6) {
                return;
            }
            this.f10832a.f22043l.mo2319b(c7599e.f23273S, c7599e.f21334t);
        }
    }

    public C7464e(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3283d c3283d, C3280a c3280a, C3286g c3286g) {
        int i3 = i;
        int i4 = i2;
        super(activity, layoutInflater, viewGroup, R.layout.chat_gif_channel_output_list_item, c3280a, c3286g, c3284e);
        this.f22036e = i3;
        this.f22037f = i4;
        this.f22042k = c3284e;
        this.f22043l = c3283d;
        LayoutParams layoutParams = (LayoutParams) this.f22044m.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i3;
        LayoutParams layoutParams2 = (LayoutParams) this.f22046o.getLayoutParams();
        layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams2.width = i3;
        this.f22039h.setOnClickListener(new C36251(this));
        this.f22044m.setOnClickListener(new C36262(this));
    }

    private void m20015a(C7599e c7599e, C2971k c2971k) {
        boolean z = ((c7599e.f23278X == null || c7599e.f23278X.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22039h, z);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void mo3180a(mobi.mmdt.ott.view.components.p401c.C6829g r7) {
        /*
        r6 = this;
        super.mo3180a(r7);
        r7 = (mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7599e) r7;
        r0 = r7.f23276V;
        r1 = r7.f23277W;
        r2 = r7.f23273S;
        r3 = r7.f23274T;
        r4 = r7.f21300A;
        r0 = mobi.mmdt.ott.logic.p261a.af.C2613o.m7045a(r0, r1, r2, r3, r4);
        if (r0 == 0) goto L_0x0025;
    L_0x0015:
        r1 = new pl.droidsonroids.gif.a;	 Catch:{ IOException -> 0x0021 }
        r2 = r0.getPath();	 Catch:{ IOException -> 0x0021 }
        r1.<init>(r2);	 Catch:{ IOException -> 0x0021 }
        r6.f22045n = r1;	 Catch:{ IOException -> 0x0021 }
        goto L_0x0025;
    L_0x0021:
        r1 = move-exception;
        r1.printStackTrace();
    L_0x0025:
        r1 = r6.f22045n;
        if (r1 == 0) goto L_0x003a;
    L_0x0029:
        r0 = r6.f22044m;
        r1 = r6.f22045n;
        r0.setImageDrawable(r1);
        r0 = r6.f22045n;
        if (r0 == 0) goto L_0x0053;
    L_0x0034:
        r0 = r6.f22045n;
        r0.stop();
        goto L_0x0053;
    L_0x003a:
        if (r0 == 0) goto L_0x0053;
    L_0x003c:
        r1 = r6.c;
        r1 = com.p085c.p086a.C1212c.m2872a(r1);
        r0 = r0.getPath();
        r0 = r1.m10950a(r0);
        r0 = r0.m3033a();
        r1 = r6.f22044m;
        r0.m3031a(r1);
    L_0x0053:
        r0 = r7.f23270P;
        if (r0 <= 0) goto L_0x0091;
    L_0x0057:
        r0 = r7.f23271Q;
        if (r0 <= 0) goto L_0x0091;
    L_0x005b:
        r0 = r6.f22036e;
        r1 = r7.f23270P;
        r2 = r7.f23271Q;
        r0 = mobi.mmdt.componentsutils.p232b.C2491i.m6807b(r0, r1, r2);
        r1 = r6.f22044m;
        r1 = r1.getLayoutParams();
        r1 = (android.widget.FrameLayout.LayoutParams) r1;
        r2 = r0.y;
        r1.height = r2;
        r2 = r0.x;
        r1.width = r2;
        r1 = r6.c;
        r1 = r1.getResources();
        r2 = 2131165433; // 0x7f0700f9 float:1.7945083E38 double:1.052935626E-314;
        r1 = r1.getDimension(r2);
        r1 = (int) r1;
        r2 = r6.f22046o;
        r2 = r2.getLayoutParams();
        r2 = (android.widget.FrameLayout.LayoutParams) r2;
        r2.height = r1;
        r0 = r0.x;
        r2.width = r0;
    L_0x0091:
        r0 = mobi.mmdt.ott.view.conversation.p432e.p433a.p437d.C7464e.C36273.f10834b;
        r1 = r7.f21337w;
        r1 = r1.ordinal();
        r0 = r0[r1];
        switch(r0) {
            case 1: goto L_0x00b1;
            case 2: goto L_0x00ab;
            case 3: goto L_0x00a5;
            case 4: goto L_0x00a5;
            case 5: goto L_0x00a5;
            case 6: goto L_0x00a5;
            case 7: goto L_0x009f;
            default: goto L_0x009e;
        };
    L_0x009e:
        goto L_0x00b9;
    L_0x009f:
        r0 = r6.f22038g;
        r1 = 2131231989; // 0x7f0804f5 float:1.8080075E38 double:1.052968509E-314;
        goto L_0x00b6;
    L_0x00a5:
        r0 = r6.f22038g;
        r1 = 2131231990; // 0x7f0804f6 float:1.8080077E38 double:1.0529685096E-314;
        goto L_0x00b6;
    L_0x00ab:
        r0 = r6.f22038g;
        r1 = 2131231987; // 0x7f0804f3 float:1.808007E38 double:1.052968508E-314;
        goto L_0x00b6;
    L_0x00b1:
        r0 = r6.f22038g;
        r1 = 2131231983; // 0x7f0804ef float:1.8080062E38 double:1.052968506E-314;
    L_0x00b6:
        r0.setImageResource(r1);
    L_0x00b9:
        r0 = mobi.mmdt.ott.view.conversation.p432e.p433a.p437d.C7464e.C36273.f10833a;
        r1 = r7.f23276V;
        r1 = r1.ordinal();
        r0 = r0[r1];
        r1 = 0;
        r2 = 8;
        switch(r0) {
            case 1: goto L_0x0120;
            case 2: goto L_0x0120;
            case 3: goto L_0x00ed;
            case 4: goto L_0x00e2;
            case 5: goto L_0x0125;
            case 6: goto L_0x00ca;
            default: goto L_0x00c9;
        };
    L_0x00c9:
        goto L_0x0139;
    L_0x00ca:
        r0 = r6.f22040i;
        r0.setVisibility(r2);
        r0 = r6.f22039h;
        r0.setVisibility(r1);
        r0 = r6.f22039h;
        r1 = 2131231922; // 0x7f0804b2 float:1.8079939E38 double:1.052968476E-314;
        r0.setImageResource(r1);
        r0 = r6.f22041j;
        r0.setVisibility(r2);
        goto L_0x0139;
    L_0x00e2:
        r0 = r6.f22040i;
        r0.setVisibility(r2);
        r0 = r6.f22039h;
        r0.setVisibility(r1);
        goto L_0x0134;
    L_0x00ed:
        r0 = r6.f22040i;
        r0.setVisibility(r1);
        r0 = r6.f22039h;
        r0.setVisibility(r1);
        r0 = r6.f22039h;
        r2 = 2131231909; // 0x7f0804a5 float:1.8079912E38 double:1.0529684696E-314;
        r0.setImageResource(r2);
        r0 = r6.f22041j;
        r0.setVisibility(r1);
        r0 = r6.f22041j;
        r1 = r7.f23272R;
        r0.setText(r1);
        r0 = r7.f23275U;
        if (r0 <= 0) goto L_0x011c;
    L_0x010f:
        r0 = r6.f22040i;
        r1 = r7.f23275U;
        r1 = (float) r1;
        r2 = 1008981770; // 0x3c23d70a float:0.01 double:4.9850323E-315;
        r1 = r1 * r2;
    L_0x0118:
        r0.setProgress(r1);
        goto L_0x0139;
    L_0x011c:
        r0 = r6.f22040i;
        r1 = 0;
        goto L_0x0118;
    L_0x0120:
        r0 = r6.f22040i;
        r0.setVisibility(r2);
    L_0x0125:
        r0 = r6.f22040i;
        r0.setVisibility(r2);
        r0 = r6.f22039h;
        r0.setVisibility(r1);
        r0 = r6.f22041j;
        r0.setVisibility(r2);
    L_0x0134:
        r0 = r7.f21337w;
        r6.m20015a(r7, r0);
    L_0x0139:
        r0 = r6.f22047p;
        r1 = 1;
        r6.m19051a(r7, r0, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.e.a.d.e.a(mobi.mmdt.ott.view.components.c.g):void");
    }
}
