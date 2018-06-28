package mobi.mmdt.ott.view.conversation.p432e.p433a.p440g;

import android.app.Activity;
import android.os.Handler;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.AnimatorListenerAdapter;
import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.animation.ObjectAnimator;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p418a.C3288i;
import mobi.mmdt.ott.view.conversation.p432e.p433a.C7194a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7557b;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import mobi.mmdt.ott.view.tools.C4515k;

public abstract class C7351b extends C7194a {
    private TextView f21268d = ((TextView) this.itemView.findViewById(R.id.sender_textView));
    private TextView f21269e = ((TextView) this.itemView.findViewById(R.id.main_name_sender_textView));
    private RoundAvatarImageView f21270f = ((RoundAvatarImageView) this.itemView.findViewById(R.id.sender_imageView));
    private C3288i f21271g;
    private TextView f21272h;
    private TextView f21273i;
    private ImageView f21274j;
    private View f21275k;
    private ImageView f21276l;

    class C37771 implements OnClickListener {
        final /* synthetic */ C7351b f11110a;

        C37771(C7351b c7351b) {
            this.f11110a = c7351b;
        }

        public final void onClick(View view) {
            this.f11110a.f21271g.mo3226j(((C7557b) this.f11110a.f16244a).mo3631j());
        }
    }

    public C7351b(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, C3288i c3288i, C3286g c3286g, final C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, i, c3286g, c3284e, false);
        this.f21271g = c3288i;
        this.c = activity;
        this.f21273i = (TextView) this.itemView.findViewById(R.id.like_count_textView);
        this.f21272h = (TextView) this.itemView.findViewById(R.id.visit_count_textView);
        this.f21276l = (ImageView) this.itemView.findViewById(R.id.heart_imageView);
        this.f21274j = (ImageView) this.itemView.findViewById(R.id.like_imageView);
        this.f21275k = this.itemView.findViewById(R.id.layout);
        this.f21270f.setOnClickListener(new C37771(this));
        if (this.f21274j != null) {
            this.f21274j.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C7351b f11112b;

                public final void onClick(View view) {
                    C7351b.m19659a(this.f11112b, (C7557b) this.f11112b.f16244a, c3284e);
                }
            });
        }
    }

    private void m19657a() {
        if (this.f21273i != null) {
            this.f21273i.setVisibility(8);
        }
        if (this.f21276l != null) {
            this.f21276l.setVisibility(8);
        }
        if (this.f21274j != null && this.f21275k != null) {
            this.f21274j.setVisibility(8);
            this.f21275k.setVisibility(8);
        }
    }

    private void m19658a(final ImageView imageView, final boolean z, boolean z2) {
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            String str = "rotation";
            float[] fArr = new float[2];
            fArr[0] = 0.0f;
            fArr[1] = z ? 360.0f : -360.0f;
            Animator ofFloat = ObjectAnimator.ofFloat((Object) imageView, str, fArr);
            ofFloat.setDuration(300);
            ofFloat.setInterpolator(new AccelerateInterpolator());
            Animator ofFloat2 = ObjectAnimator.ofFloat((Object) imageView, "scaleX", 0.2f, BallPulseIndicator.SCALE);
            ofFloat2.setDuration(300);
            ofFloat2.setInterpolator(new OvershootInterpolator());
            Animator ofFloat3 = ObjectAnimator.ofFloat((Object) imageView, "scaleY", 0.2f, BallPulseIndicator.SCALE);
            ofFloat3.setDuration(300);
            ofFloat3.setInterpolator(new OvershootInterpolator());
            ofFloat3.addListener(new AnimatorListenerAdapter(this) {
                final /* synthetic */ C7351b f19641c;

                public final void onAnimationStart(Animator animator) {
                    ImageView imageView;
                    int input_fill_like_image_color;
                    if (z) {
                        imageView.setImageResource(R.drawable.ic_like_fill_bold);
                        imageView = imageView;
                        input_fill_like_image_color = UIThemeManager.getmInstance().getInput_fill_like_image_color();
                    } else {
                        imageView.setImageResource(R.drawable.ic_like_stroke_bold);
                        imageView = imageView;
                        input_fill_like_image_color = UIThemeManager.getmInstance().getInput_outline_like_image_color();
                    }
                    C2491i.m6801a(imageView, input_fill_like_image_color);
                }
            });
            animatorSet.play(ofFloat);
            animatorSet.play(ofFloat2).with(ofFloat3).after(ofFloat);
            animatorSet.start();
        } else if (z) {
            imageView.setImageResource(R.drawable.ic_like_fill_bold);
            C2491i.m6801a(imageView, UIThemeManager.getmInstance().getInput_fill_like_image_color());
        } else {
            imageView.setImageResource(R.drawable.ic_like_stroke_bold);
            C2491i.m6801a(imageView, UIThemeManager.getmInstance().getInput_outline_like_image_color());
        }
    }

    static /* synthetic */ void m19659a(C7351b c7351b, final C7557b c7557b, final C3284e c3284e) {
        final boolean z = (c7557b.f23104Z != 0 ? 1 : 0) ^ true;
        c7351b.m19658a(c7351b.f21274j, z, true);
        new Handler().postDelayed(new Runnable(c7351b) {
            final /* synthetic */ C7351b f11116d;

            public final void run() {
                C3284e c3284e;
                String str;
                if (c7557b.f21301B != null) {
                    c3284e = c3284e;
                    str = c7557b.f21301B;
                } else {
                    c3284e = c3284e;
                    str = c7557b.f20777c;
                }
                c3284e.mo2308a(str, c7557b.f23102X, z);
            }
        }, 400);
    }

    protected void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7557b c7557b = (C7557b) c6829g;
        if (c7557b.mo3629f() == null || c7557b.mo3629f().isEmpty() || c7557b.f19503j == 63) {
            if (this.f21269e != null) {
                this.f21269e.setVisibility(8);
            }
            this.f21268d.setText(c7557b.f21335u);
            m19657a();
        } else {
            if (c7557b.mo3628e() == null || !c7557b.mo3628e().equals(C2973m.CHANNEL)) {
                m19657a();
            } else {
                if (this.f21272h != null) {
                    this.f21272h.setText(C2491i.m6765a(this.c, (float) ((long) c7557b.f23103Y)));
                }
                if (this.f21273i != null) {
                    this.f21273i.setText(C2491i.m6765a(this.c, (float) c7557b.f23102X));
                    this.f21273i.setVisibility(0);
                    if (this.f21276l != null) {
                        this.f21276l.setVisibility(0);
                    }
                }
                if (!(this.f21274j == null || this.f21275k == null)) {
                    m19658a(this.f21274j, c7557b.f23104Z != 0, false);
                    this.f21274j.setVisibility(0);
                    this.f21275k.setVisibility(0);
                }
            }
            this.f21268d.setText(m19048a(c7557b.mo3627d(), c7557b.mo3628e(), c7557b.mo3629f()), BufferType.SPANNABLE);
            this.f21268d.setMovementMethod(LinkMovementMethod.getInstance());
            this.f21269e.setVisibility(0);
            this.f21269e.setText(c7557b.f21335u);
        }
        this.f21270f.setName(c7557b.f21335u);
        this.f21270f.setBackgroundColor(C2491i.m6806b(this.c, c7557b.mo3631j()));
        this.f21270f.setImageBitmap(null);
        if (c7557b.f23100V == null || c7557b.f23100V.isEmpty()) {
            C1212c.m2872a(this.c).m10953a(this.f21270f);
        } else {
            C1212c.m2872a(this.c).m10950a(C4515k.m8231a(C2556b.m6998a(c7557b.f23100V))).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a)).m3033a().m3031a(this.f21270f);
        }
    }
}
