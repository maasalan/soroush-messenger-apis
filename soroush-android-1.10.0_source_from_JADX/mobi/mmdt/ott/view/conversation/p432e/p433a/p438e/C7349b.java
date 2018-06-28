package mobi.mmdt.ott.view.conversation.p432e.p433a.p438e;

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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7555b;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import mobi.mmdt.ott.view.tools.C4515k;

public abstract class C7349b extends C7194a {
    protected C3280a f21248d;
    private final LinearLayout f21249e = ((LinearLayout) this.itemView.findViewById(R.id.root_like_imageView));
    private TextView f21250f = ((TextView) this.itemView.findViewById(R.id.like_count_textView));
    private TextView f21251g = ((TextView) this.itemView.findViewById(R.id.visit_count_textView));
    private ImageView f21252h = ((ImageView) this.itemView.findViewById(R.id.like_imageView));
    private TextView f21253i = ((TextView) this.itemView.findViewById(R.id.sender_textView));
    private RoundAvatarImageView f21254j = ((RoundAvatarImageView) this.itemView.findViewById(R.id.sender_imageView));
    private View f21255k;
    private ImageView f21256l = ((ImageView) this.itemView.findViewById(R.id.heart_imageView));
    private ImageView f21257m = ((ImageView) this.itemView.findViewById(R.id.eye_imageView));
    private View f21258n = this.itemView.findViewById(R.id.like_layout);
    private ImageView f21259o = ((ImageView) this.itemView.findViewById(R.id.forward_imageView));

    class C36711 implements OnClickListener {
        final /* synthetic */ C7349b f10919a;

        C36711(C7349b c7349b) {
            this.f10919a = c7349b;
        }

        public final void onClick(View view) {
            this.f10919a.f21248d.mo3226j(((C7555b) this.f10919a.f16244a).mo3630j());
        }
    }

    public C7349b(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, final C3280a c3280a, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, i, c3286g, c3284e, false);
        this.f21248d = c3280a;
        this.f21255k = this.itemView.findViewById(R.id.view_avatar_image);
        if (this.f21254j != null) {
            this.f21254j.setOnClickListener(new C36711(this));
        }
        if (this.f21249e != null) {
            this.f21249e.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C7349b f10921b;

                public final void onClick(View view) {
                    C7349b.m19653a(this.f10921b, c3280a);
                }
            });
        }
        if (this.f21252h != null) {
            this.f21252h.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C7349b f10923b;

                public final void onClick(View view) {
                    C7349b.m19653a(this.f10923b, c3280a);
                }
            });
        }
    }

    private void m19652a(final ImageView imageView, final boolean z, boolean z2) {
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
                final /* synthetic */ C7349b f19634c;

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

    static /* synthetic */ void m19653a(C7349b c7349b, C3280a c3280a) {
        final C7555b c7555b = (C7555b) c7349b.f16244a;
        if (c3280a.ad() != C3004f.NONE) {
            final boolean z = (c7555b.f23089X != 0 ? 1 : 0) ^ true;
            if (c7349b.f21252h != null) {
                c7349b.m19652a(c7349b.f21252h, z, true);
            }
            new Handler().postDelayed(new Runnable(c7349b) {
                final /* synthetic */ C7349b f10926c;

                public final void run() {
                    C3280a c3280a;
                    String str;
                    if (c7555b.f21301B != null) {
                        c3280a = this.f10926c.f21248d;
                        str = c7555b.f21301B;
                    } else {
                        c3280a = this.f10926c.f21248d;
                        str = c7555b.f20777c;
                    }
                    c3280a.mo3205a(str, c7555b.f23090Y, z, true);
                }
            }, 400);
            return;
        }
        new Handler().postDelayed(new Runnable(c7349b) {
            final /* synthetic */ C7349b f10928b;

            public final void run() {
                C3280a c3280a;
                String str;
                if (c7555b.f21301B != null) {
                    c3280a = this.f10928b.f21248d;
                    str = c7555b.f21301B;
                } else {
                    c3280a = this.f10928b.f21248d;
                    str = c7555b.f20777c;
                }
                c3280a.mo3205a(str, c7555b.f23090Y, false, false);
            }
        }, 50);
    }

    protected void mo3180a(C6829g c6829g) {
        boolean z;
        CharSequence b;
        super.mo3180a(c6829g);
        C7555b c7555b = (C7555b) c6829g;
        boolean z2 = true;
        if (c7555b.aa != C3004f.OWNER) {
            if (c7555b.aa != C3004f.ADMIN) {
                z = false;
                if (c7555b.mo3629f() == null && !c7555b.mo3629f().isEmpty() && c7555b.f19503j != 64) {
                    this.f21253i.setText(m19048a(c7555b.mo3627d(), c7555b.mo3628e(), c7555b.mo3629f()), BufferType.SPANNABLE);
                    this.f21253i.setMovementMethod(LinkMovementMethod.getInstance());
                } else if (z) {
                    this.f21253i.setVisibility(8);
                    if (z) {
                        if (this.f21255k != null) {
                            this.f21255k.setVisibility(8);
                        }
                        this.f21254j.setVisibility(8);
                    } else {
                        this.f21254j.setName(c7555b.f21335u);
                        this.f21254j.setBackgroundColor(C2491i.m6806b(this.c, c7555b.mo3630j()));
                        this.f21254j.setImageBitmap(null);
                        if (!(c7555b.f23087V == null || c7555b.f23087V.isEmpty())) {
                            C1212c.m2872a(this.c).m10950a(C4515k.m8231a(C2556b.m6998a(c7555b.f23087V))).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a)).m3033a().m3031a(this.f21254j);
                        }
                        if (this.f21255k != null) {
                            this.f21255k.setVisibility(0);
                        }
                        this.f21254j.setVisibility(0);
                    }
                    if (c7555b.ab != C2973m.CHANNEL_REPLY) {
                        if (this.f21250f != null) {
                            this.f21250f.setVisibility(8);
                        }
                        if (this.f21252h != null) {
                            this.f21252h.setVisibility(8);
                        }
                        if (this.f21258n != null) {
                            this.f21258n.setVisibility(8);
                        }
                        this.f21251g.setVisibility(8);
                        if (this.f21257m != null) {
                            this.f21257m.setVisibility(8);
                        }
                        if (this.f21256l != null) {
                            this.f21256l.setVisibility(8);
                        }
                    } else {
                        if (this.f21250f != null) {
                            this.f21250f.setVisibility(0);
                        }
                        if (this.f21256l != null) {
                            this.f21256l.setVisibility(0);
                        }
                        if (this.f21252h != null) {
                            this.f21252h.setVisibility(0);
                        }
                        if (this.f21258n != null) {
                            this.f21258n.setVisibility(0);
                        }
                        this.f21251g.setVisibility(0);
                        if (this.f21257m != null) {
                            this.f21257m.setVisibility(0);
                        }
                        if (c7555b.f23089X == 0) {
                            z2 = false;
                        }
                        if (this.f21252h != null) {
                            m19652a(this.f21252h, z2, false);
                        }
                        b = C2491i.m6810b(this.c, (float) ((long) c7555b.f23090Y));
                        if (this.f21250f != null) {
                            this.f21250f.setText(b);
                        }
                        this.f21251g.setText(C2491i.m6810b(this.c, (float) ((long) c7555b.f23091Z)));
                    }
                    if (this.f21259o == null) {
                        this.f21259o.setVisibility(0);
                    }
                } else {
                    this.f21253i.setText(c7555b.f21335u);
                }
                this.f21253i.setVisibility(0);
                if (z) {
                    if (this.f21255k != null) {
                        this.f21255k.setVisibility(8);
                    }
                    this.f21254j.setVisibility(8);
                } else {
                    this.f21254j.setName(c7555b.f21335u);
                    this.f21254j.setBackgroundColor(C2491i.m6806b(this.c, c7555b.mo3630j()));
                    this.f21254j.setImageBitmap(null);
                    C1212c.m2872a(this.c).m10950a(C4515k.m8231a(C2556b.m6998a(c7555b.f23087V))).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a)).m3033a().m3031a(this.f21254j);
                    if (this.f21255k != null) {
                        this.f21255k.setVisibility(0);
                    }
                    this.f21254j.setVisibility(0);
                }
                if (c7555b.ab != C2973m.CHANNEL_REPLY) {
                    if (this.f21250f != null) {
                        this.f21250f.setVisibility(0);
                    }
                    if (this.f21256l != null) {
                        this.f21256l.setVisibility(0);
                    }
                    if (this.f21252h != null) {
                        this.f21252h.setVisibility(0);
                    }
                    if (this.f21258n != null) {
                        this.f21258n.setVisibility(0);
                    }
                    this.f21251g.setVisibility(0);
                    if (this.f21257m != null) {
                        this.f21257m.setVisibility(0);
                    }
                    if (c7555b.f23089X == 0) {
                        z2 = false;
                    }
                    if (this.f21252h != null) {
                        m19652a(this.f21252h, z2, false);
                    }
                    b = C2491i.m6810b(this.c, (float) ((long) c7555b.f23090Y));
                    if (this.f21250f != null) {
                        this.f21250f.setText(b);
                    }
                    this.f21251g.setText(C2491i.m6810b(this.c, (float) ((long) c7555b.f23091Z)));
                } else {
                    if (this.f21250f != null) {
                        this.f21250f.setVisibility(8);
                    }
                    if (this.f21252h != null) {
                        this.f21252h.setVisibility(8);
                    }
                    if (this.f21258n != null) {
                        this.f21258n.setVisibility(8);
                    }
                    this.f21251g.setVisibility(8);
                    if (this.f21257m != null) {
                        this.f21257m.setVisibility(8);
                    }
                    if (this.f21256l != null) {
                        this.f21256l.setVisibility(8);
                    }
                }
                if (this.f21259o == null) {
                    this.f21259o.setVisibility(0);
                }
            }
        }
        z = true;
        if (c7555b.mo3629f() == null) {
        }
        if (z) {
            this.f21253i.setVisibility(8);
            if (z) {
                this.f21254j.setName(c7555b.f21335u);
                this.f21254j.setBackgroundColor(C2491i.m6806b(this.c, c7555b.mo3630j()));
                this.f21254j.setImageBitmap(null);
                C1212c.m2872a(this.c).m10950a(C4515k.m8231a(C2556b.m6998a(c7555b.f23087V))).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a)).m3033a().m3031a(this.f21254j);
                if (this.f21255k != null) {
                    this.f21255k.setVisibility(0);
                }
                this.f21254j.setVisibility(0);
            } else {
                if (this.f21255k != null) {
                    this.f21255k.setVisibility(8);
                }
                this.f21254j.setVisibility(8);
            }
            if (c7555b.ab != C2973m.CHANNEL_REPLY) {
                if (this.f21250f != null) {
                    this.f21250f.setVisibility(8);
                }
                if (this.f21252h != null) {
                    this.f21252h.setVisibility(8);
                }
                if (this.f21258n != null) {
                    this.f21258n.setVisibility(8);
                }
                this.f21251g.setVisibility(8);
                if (this.f21257m != null) {
                    this.f21257m.setVisibility(8);
                }
                if (this.f21256l != null) {
                    this.f21256l.setVisibility(8);
                }
            } else {
                if (this.f21250f != null) {
                    this.f21250f.setVisibility(0);
                }
                if (this.f21256l != null) {
                    this.f21256l.setVisibility(0);
                }
                if (this.f21252h != null) {
                    this.f21252h.setVisibility(0);
                }
                if (this.f21258n != null) {
                    this.f21258n.setVisibility(0);
                }
                this.f21251g.setVisibility(0);
                if (this.f21257m != null) {
                    this.f21257m.setVisibility(0);
                }
                if (c7555b.f23089X == 0) {
                    z2 = false;
                }
                if (this.f21252h != null) {
                    m19652a(this.f21252h, z2, false);
                }
                b = C2491i.m6810b(this.c, (float) ((long) c7555b.f23090Y));
                if (this.f21250f != null) {
                    this.f21250f.setText(b);
                }
                this.f21251g.setText(C2491i.m6810b(this.c, (float) ((long) c7555b.f23091Z)));
            }
            if (this.f21259o == null) {
                this.f21259o.setVisibility(0);
            }
        }
        this.f21253i.setText(c7555b.f21335u);
        this.f21253i.setVisibility(0);
        if (z) {
            if (this.f21255k != null) {
                this.f21255k.setVisibility(8);
            }
            this.f21254j.setVisibility(8);
        } else {
            this.f21254j.setName(c7555b.f21335u);
            this.f21254j.setBackgroundColor(C2491i.m6806b(this.c, c7555b.mo3630j()));
            this.f21254j.setImageBitmap(null);
            C1212c.m2872a(this.c).m10950a(C4515k.m8231a(C2556b.m6998a(c7555b.f23087V))).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a)).m3033a().m3031a(this.f21254j);
            if (this.f21255k != null) {
                this.f21255k.setVisibility(0);
            }
            this.f21254j.setVisibility(0);
        }
        if (c7555b.ab != C2973m.CHANNEL_REPLY) {
            if (this.f21250f != null) {
                this.f21250f.setVisibility(0);
            }
            if (this.f21256l != null) {
                this.f21256l.setVisibility(0);
            }
            if (this.f21252h != null) {
                this.f21252h.setVisibility(0);
            }
            if (this.f21258n != null) {
                this.f21258n.setVisibility(0);
            }
            this.f21251g.setVisibility(0);
            if (this.f21257m != null) {
                this.f21257m.setVisibility(0);
            }
            if (c7555b.f23089X == 0) {
                z2 = false;
            }
            if (this.f21252h != null) {
                m19652a(this.f21252h, z2, false);
            }
            b = C2491i.m6810b(this.c, (float) ((long) c7555b.f23090Y));
            if (this.f21250f != null) {
                this.f21250f.setText(b);
            }
            this.f21251g.setText(C2491i.m6810b(this.c, (float) ((long) c7555b.f23091Z)));
        } else {
            if (this.f21250f != null) {
                this.f21250f.setVisibility(8);
            }
            if (this.f21252h != null) {
                this.f21252h.setVisibility(8);
            }
            if (this.f21258n != null) {
                this.f21258n.setVisibility(8);
            }
            this.f21251g.setVisibility(8);
            if (this.f21257m != null) {
                this.f21257m.setVisibility(8);
            }
            if (this.f21256l != null) {
                this.f21256l.setVisibility(8);
            }
        }
        if (this.f21259o == null) {
            this.f21259o.setVisibility(0);
        }
    }
}
