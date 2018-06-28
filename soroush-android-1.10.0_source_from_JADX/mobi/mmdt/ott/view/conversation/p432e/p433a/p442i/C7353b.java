package mobi.mmdt.ott.view.conversation.p432e.p433a.p442i;

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
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p432e.p433a.C7194a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7559b;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public abstract class C7353b extends C7194a {
    private TextView f21280d = ((TextView) this.itemView.findViewById(R.id.sender_textView));
    private TextView f21281e = ((TextView) this.itemView.findViewById(R.id.visit_count_textView));
    private TextView f21282f = ((TextView) this.itemView.findViewById(R.id.like_count_textView));
    private ImageView f21283g = ((ImageView) this.itemView.findViewById(R.id.like_imageView));
    private ImageView f21284h = ((ImageView) this.itemView.findViewById(R.id.heart_imageView));
    private View f21285i = this.itemView.findViewById(R.id.layout);
    private ImageView f21286j = ((ImageView) this.itemView.findViewById(R.id.eye_imageView));

    public C7353b(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, C3286g c3286g, final C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, i, c3286g, c3284e, false);
        if (this.f21283g != null) {
            this.f21283g.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C7353b f11301b;

                public final void onClick(View view) {
                    final C7559b c7559b = (C7559b) this.f11301b.f16244a;
                    final boolean z = (c7559b.f23110X != 0 ? 1 : 0) ^ true;
                    this.f11301b.m19664a(this.f11301b.f21283g, z, true);
                    new Handler().postDelayed(new Runnable(this) {
                        final /* synthetic */ C38821 f11299c;

                        public final void run() {
                            C3284e c3284e;
                            String str;
                            if (c7559b.f21301B != null) {
                                c3284e = c3284e;
                                str = c7559b.f21301B;
                            } else {
                                c3284e = c3284e;
                                str = c7559b.f20777c;
                            }
                            c3284e.mo2308a(str, c7559b.f23108V, z);
                        }
                    }, 400);
                }
            });
        }
    }

    private void m19663a() {
        if (this.f21282f != null) {
            this.f21282f.setVisibility(8);
            if (this.f21284h != null) {
                this.f21284h.setVisibility(8);
            }
        }
        if (this.f21283g != null && this.f21285i != null) {
            this.f21283g.setVisibility(8);
            this.f21285i.setVisibility(8);
        }
    }

    private void m19664a(final ImageView imageView, final boolean z, boolean z2) {
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
                final /* synthetic */ C7353b f19648c;

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

    public void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7559b c7559b = (C7559b) c6829g;
        if (c7559b.mo3629f() == null || c7559b.mo3629f().isEmpty() || c7559b.f19503j == 62) {
            this.f21280d.setVisibility(8);
            m19663a();
            return;
        }
        if (c7559b.mo3628e() == null || !c7559b.mo3628e().equals(C2973m.CHANNEL)) {
            m19663a();
        } else {
            if (this.f21281e != null) {
                this.f21281e.setText(C2491i.m6765a(this.c, (float) ((long) c7559b.f23109W)));
            }
            if (this.f21282f != null) {
                this.f21282f.setText(C2491i.m6765a(this.c, (float) c7559b.f23108V));
                this.f21282f.setVisibility(0);
                if (this.f21284h != null) {
                    this.f21284h.setVisibility(0);
                }
            }
            if (!(this.f21283g == null || this.f21285i == null)) {
                m19664a(this.f21283g, c7559b.f23110X != 0, false);
                this.f21283g.setVisibility(0);
                this.f21285i.setVisibility(0);
            }
        }
        this.f21280d.setText(m19048a(c7559b.mo3627d(), c7559b.mo3628e(), c7559b.mo3629f()), BufferType.SPANNABLE);
        this.f21280d.setMovementMethod(LinkMovementMethod.getInstance());
        this.f21280d.setVisibility(0);
    }
}
