package mobi.mmdt.ott.view.conversation.p432e.p433a.p441h;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C1274i;
import com.p085c.p086a.p105g.C1247e;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.p261a.af.C2613o;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p386h.C2987i;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p432e.p433a.C7194a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7653g;

public final class C7518g extends C7352b {
    private ImageView f22680d;
    private ImageView f22681e;
    private View f22682f;
    private ImageButton f22683g;
    private TextView f22684h;
    private ProgressWheel f22685i;
    private C3284e f22686j;
    private C3283d f22687k;
    private int f22688l;
    private LinearLayout f22689m;
    private C1247e<Drawable> f22690n = new C61821(this);

    class C38412 implements OnClickListener {
        final /* synthetic */ C7518g f11218a;

        C38412(C7518g c7518g) {
            this.f11218a = c7518g;
        }

        public final void onClick(View view) {
            C7653g c7653g = (C7653g) this.f11218a.f16244a;
            switch (c7653g.f23631V) {
                case DELETED:
                case NOT_STARTED:
                    if (c7653g.f23633Z == null || c7653g.f23633Z.isEmpty()) {
                        this.f11218a.f22686j.mo2307a(c7653g.mo3604b(), false);
                        return;
                    } else {
                        this.f11218a.f22686j.mo2307a(c7653g.mo3604b(), true);
                        return;
                    }
                case TRANSMITTING:
                    this.f11218a.f22686j.mo2305a(c7653g.mo3604b());
                    return;
                case CANCEL:
                    if (c7653g.f23633Z == null || c7653g.f23633Z.isEmpty()) {
                        this.f11218a.f22686j.mo2307a(c7653g.mo3604b(), false);
                        return;
                    } else {
                        this.f11218a.f22686j.mo2307a(c7653g.mo3604b(), true);
                        return;
                    }
                case ERROR:
                    if (c7653g.f23633Z == null || c7653g.f23633Z.isEmpty()) {
                        this.f11218a.f22686j.mo2307a(c7653g.mo3604b(), false);
                        return;
                    } else {
                        this.f11218a.f22686j.mo2307a(c7653g.mo3604b(), true);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    class C38423 implements OnClickListener {
        final /* synthetic */ C7518g f11219a;

        C38423(C7518g c7518g) {
            this.f11219a = c7518g;
        }

        public final void onClick(View view) {
            C7653g c7653g = (C7653g) this.f11219a.f16244a;
            if (c7653g.f23633Z == null || c7653g.f23633Z.isEmpty()) {
                int[] iArr = C38434.f11220a;
                c7653g.f23631V.ordinal();
                this.f11219a.f22687k.mo2325c(c7653g.f23628S, c7653g.f21334t);
            } else if (c7653g.f23631V == C2987i.FINISHED) {
                this.f11219a.f22687k.mo2325c(c7653g.f23628S, c7653g.f21334t);
            }
        }
    }

    class C61821 implements C1247e<Drawable> {
        final /* synthetic */ C7518g f16707a;

        C61821(C7518g c7518g) {
            this.f16707a = c7518g;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7653g c7653g = (C7653g) this.f16707a.f16244a;
            int i = c7653g.f23626Q;
            if (i > 0 && c7653g.f23627R > 0) {
                Point b = C2491i.m6807b(this.f16707a.f22688l, i, c7653g.f23627R);
                LayoutParams layoutParams = (LayoutParams) this.f16707a.f22680d.getLayoutParams();
                i = i < this.f16707a.f22688l ? this.f16707a.f22688l : b.x;
                layoutParams.width = i;
                layoutParams.height = b.y;
                int dimension = (int) this.f16707a.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
                layoutParams = (LayoutParams) this.f16707a.f22682f.getLayoutParams();
                layoutParams.width = i;
                layoutParams.height = dimension;
            }
            return false;
        }
    }

    public C7518g(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3283d c3283d, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_image_output_list_item, c3286g, c3284e);
        this.f22686j = c3284e;
        this.f22687k = c3283d;
        this.f22688l = i;
        this.f22680d = (ImageView) this.itemView.findViewById(R.id.content_imageView);
        this.f22681e = (ImageView) this.itemView.findViewById(R.id.status_imageView);
        this.f22682f = this.itemView.findViewById(R.id.bottom_gradient_view);
        this.f22683g = (ImageButton) this.itemView.findViewById(R.id.action_imageView);
        this.f22684h = (TextView) this.itemView.findViewById(R.id.progress_text_action_view);
        this.f22685i = (ProgressWheel) this.itemView.findViewById(R.id.progress_wheel);
        this.f22689m = (LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background);
        LayoutParams layoutParams = (LayoutParams) this.f22680d.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        LayoutParams layoutParams2 = (LayoutParams) this.f22682f.getLayoutParams();
        layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams2.width = i;
        this.f22683g.setOnClickListener(new C38412(this));
        this.f22680d.setOnClickListener(new C38423(this));
    }

    private void m20385a(C7653g c7653g, C2971k c2971k) {
        boolean z = ((c7653g.f23633Z == null || c7653g.f23633Z.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22683g, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        C1274i a;
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7653g c7653g = (C7653g) c6829g;
        Object a2 = C2613o.m7045a(c7653g.f23631V, c7653g.f23632Y, c7653g.f23628S, c7653g.f23629T, c7653g.f21300A);
        this.f22680d.setImageBitmap(null);
        if (c7653g.f23626Q <= 0 || c7653g.f23627R <= 0) {
            a = C1212c.m2872a(this.c).m10950a(a2).m3034a(new C1248f().m2959e().m2954b(this.f22688l, this.f22688l)).m3033a();
        } else {
            Point a3 = C2491i.m6763a(this.f22688l, c7653g.f23626Q, c7653g.f23627R);
            a = C1212c.m2872a(this.c).m10950a(a2).m3033a().m3034a(new C1248f().m2954b(a3.x, a3.y));
        }
        a.f3986c = this.f22690n;
        a.m3031a(this.f22680d);
        switch (c7653g.f21337w) {
            case ERROR:
                imageView = this.f22681e;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22681e;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22681e;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22681e;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        switch (c7653g.f23631V) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22685i.setVisibility(8);
                this.f22683g.setVisibility(0);
                this.f22684h.setVisibility(8);
                m20385a(c7653g, c7653g.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22685i.setVisibility(0);
                this.f22683g.setVisibility(0);
                this.f22683g.setImageResource(R.drawable.ic_file_stop_download);
                this.f22684h.setVisibility(0);
                this.f22684h.setText(c7653g.f23625P);
                if (c7653g.f23630U > 0) {
                    progressWheel = this.f22685i;
                    f = ((float) c7653g.f23630U) * 0.01f;
                } else {
                    progressWheel = this.f22685i;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f22685i.setVisibility(8);
                this.f22683g.setVisibility(8);
                this.f22684h.setVisibility(8);
                break;
            default:
                break;
        }
        m19051a((C7358a) c7653g, this.f22689m, true);
    }
}
