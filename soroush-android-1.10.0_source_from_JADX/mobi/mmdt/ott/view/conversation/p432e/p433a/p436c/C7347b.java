package mobi.mmdt.ott.view.conversation.p432e.p433a.p436c;

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
import android.widget.LinearLayout;
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
import mobi.mmdt.ott.provider.p390l.C3004f;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3280a;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p432e.p433a.C7194a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7553b;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import mobi.mmdt.ott.view.tools.C4515k;

public abstract class C7347b extends C7194a {
    protected C3280a f21230d;
    private ImageView f21231e;
    private TextView f21232f;
    private TextView f21233g;
    private ImageView f21234h = ((ImageView) this.itemView.findViewById(R.id.like_imageView));
    private TextView f21235i;
    private RoundAvatarImageView f21236j;
    private View f21237k;
    private ImageView f21238l;
    private ImageView f21239m;

    class C35651 implements OnClickListener {
        final /* synthetic */ C7347b f10728a;

        C35651(C7347b c7347b) {
            this.f10728a = c7347b;
        }

        public final void onClick(View view) {
            this.f10728a.f21230d.mo3226j(((C7553b) this.f10728a.f16244a).mo3626j());
        }
    }

    public C7347b(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, final C3280a c3280a, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, i, c3286g, c3284e, false);
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.root_like_imageView);
        this.f21232f = (TextView) this.itemView.findViewById(R.id.like_count_textView);
        this.f21233g = (TextView) this.itemView.findViewById(R.id.visit_count_textView);
        this.f21238l = (ImageView) this.itemView.findViewById(R.id.heart_imageView);
        this.f21239m = (ImageView) this.itemView.findViewById(R.id.eye_imageView);
        this.f21231e = (ImageView) this.itemView.findViewById(R.id.forward_imageView);
        this.f21235i = (TextView) this.itemView.findViewById(R.id.sender_textView);
        this.f21236j = (RoundAvatarImageView) this.itemView.findViewById(R.id.sender_imageView);
        this.f21230d = c3280a;
        this.f21237k = this.itemView.findViewById(R.id.view_avatar_image);
        if (this.f21236j != null) {
            this.f21236j.setOnClickListener(new C35651(this));
        }
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C7347b f10730b;

                public final void onClick(View view) {
                    C7347b.m19649a(this.f10730b, c3280a);
                }
            });
        }
        if (this.f21234h != null) {
            this.f21234h.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C7347b f10732b;

                public final void onClick(View view) {
                    C7347b.m19649a(this.f10732b, c3280a);
                }
            });
        }
    }

    private void m19648a(final ImageView imageView, final boolean z, boolean z2) {
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
                final /* synthetic */ C7347b f19627c;

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

    static /* synthetic */ void m19649a(C7347b c7347b, C3280a c3280a) {
        final C7553b c7553b = (C7553b) c7347b.f16244a;
        if (c3280a.ad() != C3004f.NONE) {
            final boolean z = (c7553b.ad != 0 ? 1 : 0) ^ true;
            if (c7347b.f21234h != null) {
                c7347b.m19648a(c7347b.f21234h, z, true);
            }
            new Handler().postDelayed(new Runnable(c7347b) {
                final /* synthetic */ C7347b f10735c;

                public final void run() {
                    C3280a c3280a;
                    String str;
                    if (c7553b.f21301B != null) {
                        c3280a = this.f10735c.f21230d;
                        str = c7553b.f21301B;
                    } else {
                        c3280a = this.f10735c.f21230d;
                        str = c7553b.f20777c;
                    }
                    c3280a.mo3205a(str, c7553b.ae, z, true);
                }
            }, 400);
            return;
        }
        new Handler().postDelayed(new Runnable(c7347b) {
            final /* synthetic */ C7347b f10737b;

            public final void run() {
                C3280a c3280a;
                String str;
                if (c7553b.f21301B != null) {
                    c3280a = this.f10737b.f21230d;
                    str = c7553b.f21301B;
                } else {
                    c3280a = this.f10737b.f21230d;
                    str = c7553b.f20777c;
                }
                c3280a.mo3205a(str, c7553b.ae, false, false);
            }
        }, 50);
    }

    protected void mo3180a(C6829g c6829g) {
        boolean z;
        CharSequence b;
        super.mo3180a(c6829g);
        C7553b c7553b = (C7553b) c6829g;
        boolean z2 = true;
        if (c7553b.ag != C3004f.OWNER) {
            if (c7553b.ag != C3004f.ADMIN) {
                z = false;
                if (c7553b.mo3629f() == null && !c7553b.mo3629f().isEmpty() && c7553b.f19503j != 64) {
                    this.f21235i.setText(m19048a(c7553b.mo3627d(), c7553b.mo3628e(), c7553b.mo3629f()), BufferType.SPANNABLE);
                    this.f21235i.setMovementMethod(LinkMovementMethod.getInstance());
                } else if (z) {
                    this.f21235i.setVisibility(8);
                    if (z) {
                        if (this.f21237k != null) {
                            this.f21237k.setVisibility(8);
                        }
                        this.f21236j.setVisibility(8);
                    } else {
                        this.f21236j.setName(c7553b.f21335u);
                        this.f21236j.setBackgroundColor(C2491i.m6806b(this.c, c7553b.mo3626j()));
                        this.f21236j.setImageBitmap(null);
                        if (!(c7553b.ab == null || c7553b.ab.isEmpty())) {
                            C1212c.m2872a(this.c).m10950a(C4515k.m8231a(C2556b.m6998a(c7553b.ab))).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a)).m3033a().m3031a(this.f21236j);
                        }
                        if (this.f21237k != null) {
                            this.f21237k.setVisibility(0);
                        }
                        this.f21236j.setVisibility(0);
                    }
                    if (c7553b.ah != C2973m.CHANNEL_REPLY) {
                        if (this.f21232f != null) {
                            this.f21232f.setVisibility(8);
                        }
                        if (this.f21238l != null) {
                            this.f21238l.setVisibility(8);
                        }
                        if (this.f21234h != null) {
                            this.f21234h.setVisibility(8);
                        }
                        this.f21233g.setVisibility(8);
                        this.f21239m.setVisibility(8);
                    } else {
                        if (this.f21232f != null) {
                            this.f21232f.setVisibility(0);
                        }
                        if (this.f21238l != null) {
                            this.f21238l.setVisibility(0);
                        }
                        if (this.f21234h != null) {
                            this.f21234h.setVisibility(0);
                        }
                        this.f21233g.setVisibility(0);
                        this.f21239m.setVisibility(0);
                        if (c7553b.ad == 0) {
                            z2 = false;
                        }
                        if (this.f21234h != null) {
                            m19648a(this.f21234h, z2, false);
                        }
                        b = C2491i.m6810b(this.c, (float) c7553b.ae);
                        if (this.f21232f != null) {
                            this.f21232f.setText(b);
                        }
                        this.f21233g.setText(C2491i.m6810b(this.c, (float) ((long) c7553b.af)));
                    }
                    if (this.f21231e != null) {
                        this.f21231e.setVisibility(0);
                    }
                    m19050a((C7358a) c7553b, this.f21237k);
                } else {
                    this.f21235i.setText(c7553b.f21335u);
                }
                this.f21235i.setVisibility(0);
                if (z) {
                    if (this.f21237k != null) {
                        this.f21237k.setVisibility(8);
                    }
                    this.f21236j.setVisibility(8);
                } else {
                    this.f21236j.setName(c7553b.f21335u);
                    this.f21236j.setBackgroundColor(C2491i.m6806b(this.c, c7553b.mo3626j()));
                    this.f21236j.setImageBitmap(null);
                    C1212c.m2872a(this.c).m10950a(C4515k.m8231a(C2556b.m6998a(c7553b.ab))).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a)).m3033a().m3031a(this.f21236j);
                    if (this.f21237k != null) {
                        this.f21237k.setVisibility(0);
                    }
                    this.f21236j.setVisibility(0);
                }
                if (c7553b.ah != C2973m.CHANNEL_REPLY) {
                    if (this.f21232f != null) {
                        this.f21232f.setVisibility(0);
                    }
                    if (this.f21238l != null) {
                        this.f21238l.setVisibility(0);
                    }
                    if (this.f21234h != null) {
                        this.f21234h.setVisibility(0);
                    }
                    this.f21233g.setVisibility(0);
                    this.f21239m.setVisibility(0);
                    if (c7553b.ad == 0) {
                        z2 = false;
                    }
                    if (this.f21234h != null) {
                        m19648a(this.f21234h, z2, false);
                    }
                    b = C2491i.m6810b(this.c, (float) c7553b.ae);
                    if (this.f21232f != null) {
                        this.f21232f.setText(b);
                    }
                    this.f21233g.setText(C2491i.m6810b(this.c, (float) ((long) c7553b.af)));
                } else {
                    if (this.f21232f != null) {
                        this.f21232f.setVisibility(8);
                    }
                    if (this.f21238l != null) {
                        this.f21238l.setVisibility(8);
                    }
                    if (this.f21234h != null) {
                        this.f21234h.setVisibility(8);
                    }
                    this.f21233g.setVisibility(8);
                    this.f21239m.setVisibility(8);
                }
                if (this.f21231e != null) {
                    this.f21231e.setVisibility(0);
                }
                m19050a((C7358a) c7553b, this.f21237k);
            }
        }
        z = true;
        if (c7553b.mo3629f() == null) {
        }
        if (z) {
            this.f21235i.setVisibility(8);
            if (z) {
                this.f21236j.setName(c7553b.f21335u);
                this.f21236j.setBackgroundColor(C2491i.m6806b(this.c, c7553b.mo3626j()));
                this.f21236j.setImageBitmap(null);
                C1212c.m2872a(this.c).m10950a(C4515k.m8231a(C2556b.m6998a(c7553b.ab))).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a)).m3033a().m3031a(this.f21236j);
                if (this.f21237k != null) {
                    this.f21237k.setVisibility(0);
                }
                this.f21236j.setVisibility(0);
            } else {
                if (this.f21237k != null) {
                    this.f21237k.setVisibility(8);
                }
                this.f21236j.setVisibility(8);
            }
            if (c7553b.ah != C2973m.CHANNEL_REPLY) {
                if (this.f21232f != null) {
                    this.f21232f.setVisibility(8);
                }
                if (this.f21238l != null) {
                    this.f21238l.setVisibility(8);
                }
                if (this.f21234h != null) {
                    this.f21234h.setVisibility(8);
                }
                this.f21233g.setVisibility(8);
                this.f21239m.setVisibility(8);
            } else {
                if (this.f21232f != null) {
                    this.f21232f.setVisibility(0);
                }
                if (this.f21238l != null) {
                    this.f21238l.setVisibility(0);
                }
                if (this.f21234h != null) {
                    this.f21234h.setVisibility(0);
                }
                this.f21233g.setVisibility(0);
                this.f21239m.setVisibility(0);
                if (c7553b.ad == 0) {
                    z2 = false;
                }
                if (this.f21234h != null) {
                    m19648a(this.f21234h, z2, false);
                }
                b = C2491i.m6810b(this.c, (float) c7553b.ae);
                if (this.f21232f != null) {
                    this.f21232f.setText(b);
                }
                this.f21233g.setText(C2491i.m6810b(this.c, (float) ((long) c7553b.af)));
            }
            if (this.f21231e != null) {
                this.f21231e.setVisibility(0);
            }
            m19050a((C7358a) c7553b, this.f21237k);
        }
        this.f21235i.setText(c7553b.f21335u);
        this.f21235i.setVisibility(0);
        if (z) {
            if (this.f21237k != null) {
                this.f21237k.setVisibility(8);
            }
            this.f21236j.setVisibility(8);
        } else {
            this.f21236j.setName(c7553b.f21335u);
            this.f21236j.setBackgroundColor(C2491i.m6806b(this.c, c7553b.mo3626j()));
            this.f21236j.setImageBitmap(null);
            C1212c.m2872a(this.c).m10950a(C4515k.m8231a(C2556b.m6998a(c7553b.ab))).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a)).m3033a().m3031a(this.f21236j);
            if (this.f21237k != null) {
                this.f21237k.setVisibility(0);
            }
            this.f21236j.setVisibility(0);
        }
        if (c7553b.ah != C2973m.CHANNEL_REPLY) {
            if (this.f21232f != null) {
                this.f21232f.setVisibility(0);
            }
            if (this.f21238l != null) {
                this.f21238l.setVisibility(0);
            }
            if (this.f21234h != null) {
                this.f21234h.setVisibility(0);
            }
            this.f21233g.setVisibility(0);
            this.f21239m.setVisibility(0);
            if (c7553b.ad == 0) {
                z2 = false;
            }
            if (this.f21234h != null) {
                m19648a(this.f21234h, z2, false);
            }
            b = C2491i.m6810b(this.c, (float) c7553b.ae);
            if (this.f21232f != null) {
                this.f21232f.setText(b);
            }
            this.f21233g.setText(C2491i.m6810b(this.c, (float) ((long) c7553b.af)));
        } else {
            if (this.f21232f != null) {
                this.f21232f.setVisibility(8);
            }
            if (this.f21238l != null) {
                this.f21238l.setVisibility(8);
            }
            if (this.f21234h != null) {
                this.f21234h.setVisibility(8);
            }
            this.f21233g.setVisibility(8);
            this.f21239m.setVisibility(8);
        }
        if (this.f21231e != null) {
            this.f21231e.setVisibility(0);
        }
        m19050a((C7358a) c7553b, this.f21237k);
    }
}
