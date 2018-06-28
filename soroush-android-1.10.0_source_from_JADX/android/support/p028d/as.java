package android.support.p028d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.support.p028d.C0233u.C0232b;
import android.support.p028d.C4710b.C0206a;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public abstract class as extends C0233u {
    private static final String[] f12952j = new String[]{"android:visibility:visibility", "android:visibility:parent"};
    int f12953i = 3;

    private static class C0205b {
        boolean f831a;
        boolean f832b;
        int f833c;
        int f834d;
        ViewGroup f835e;
        ViewGroup f836f;

        private C0205b() {
        }
    }

    private static class C4709a extends AnimatorListenerAdapter implements C0206a, C0232b {
        boolean f12946a = false;
        private final View f12947b;
        private final int f12948c;
        private final ViewGroup f12949d;
        private final boolean f12950e;
        private boolean f12951f;

        C4709a(View view, int i) {
            this.f12947b = view;
            this.f12948c = i;
            this.f12949d = (ViewGroup) view.getParent();
            this.f12950e = true;
            m8650a(true);
        }

        private void m8650a(boolean z) {
            if (this.f12950e && this.f12951f != z && this.f12949d != null) {
                this.f12951f = z;
                ae.m393a(this.f12949d, z);
            }
        }

        private void m8651d() {
            if (!this.f12946a) {
                al.m402a(this.f12947b, this.f12948c);
                if (this.f12949d != null) {
                    this.f12949d.invalidate();
                }
            }
            m8650a(false);
        }

        public final void mo85a() {
            m8650a(false);
        }

        public final void mo86a(C0233u c0233u) {
            m8651d();
            c0233u.mo107b((C0232b) this);
        }

        public final void mo87b() {
            m8650a(true);
        }

        public final void mo88c() {
        }

        public final void onAnimationCancel(Animator animator) {
            this.f12946a = true;
        }

        public final void onAnimationEnd(Animator animator) {
            m8651d();
        }

        public final void onAnimationPause(Animator animator) {
            if (!this.f12946a) {
                al.m402a(this.f12947b, this.f12948c);
            }
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationResume(Animator animator) {
            if (!this.f12946a) {
                al.m402a(this.f12947b, 0);
            }
        }

        public final void onAnimationStart(Animator animator) {
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.support.p028d.as.C0205b m8656b(android.support.p028d.C0237z r6, android.support.p028d.C0237z r7) {
        /*
        r0 = new android.support.d.as$b;
        r1 = 0;
        r0.<init>();
        r0.f831a = r1;
        r0.f832b = r1;
        r2 = 0;
        r3 = -1;
        if (r6 == 0) goto L_0x0035;
    L_0x000e:
        r4 = r6.f922a;
        r5 = "android:visibility:visibility";
        r4 = r4.containsKey(r5);
        if (r4 == 0) goto L_0x0035;
    L_0x0018:
        r4 = r6.f922a;
        r5 = "android:visibility:visibility";
        r4 = r4.get(r5);
        r4 = (java.lang.Integer) r4;
        r4 = r4.intValue();
        r0.f833c = r4;
        r4 = r6.f922a;
        r5 = "android:visibility:parent";
        r4 = r4.get(r5);
        r4 = (android.view.ViewGroup) r4;
        r0.f835e = r4;
        goto L_0x0039;
    L_0x0035:
        r0.f833c = r3;
        r0.f835e = r2;
    L_0x0039:
        if (r7 == 0) goto L_0x0060;
    L_0x003b:
        r4 = r7.f922a;
        r5 = "android:visibility:visibility";
        r4 = r4.containsKey(r5);
        if (r4 == 0) goto L_0x0060;
    L_0x0045:
        r2 = r7.f922a;
        r3 = "android:visibility:visibility";
        r2 = r2.get(r3);
        r2 = (java.lang.Integer) r2;
        r2 = r2.intValue();
        r0.f834d = r2;
        r2 = r7.f922a;
        r3 = "android:visibility:parent";
        r2 = r2.get(r3);
        r2 = (android.view.ViewGroup) r2;
        goto L_0x0062;
    L_0x0060:
        r0.f834d = r3;
    L_0x0062:
        r0.f836f = r2;
        r2 = 1;
        if (r6 == 0) goto L_0x0090;
    L_0x0067:
        if (r7 == 0) goto L_0x0090;
    L_0x0069:
        r6 = r0.f833c;
        r7 = r0.f834d;
        if (r6 != r7) goto L_0x0076;
    L_0x006f:
        r6 = r0.f835e;
        r7 = r0.f836f;
        if (r6 != r7) goto L_0x0076;
    L_0x0075:
        return r0;
    L_0x0076:
        r6 = r0.f833c;
        r7 = r0.f834d;
        if (r6 == r7) goto L_0x0086;
    L_0x007c:
        r6 = r0.f833c;
        if (r6 != 0) goto L_0x0081;
    L_0x0080:
        goto L_0x00a1;
    L_0x0081:
        r6 = r0.f834d;
        if (r6 != 0) goto L_0x00a4;
    L_0x0085:
        goto L_0x0096;
    L_0x0086:
        r6 = r0.f836f;
        if (r6 != 0) goto L_0x008b;
    L_0x008a:
        goto L_0x00a1;
    L_0x008b:
        r6 = r0.f835e;
        if (r6 != 0) goto L_0x00a4;
    L_0x008f:
        goto L_0x0096;
    L_0x0090:
        if (r6 != 0) goto L_0x009b;
    L_0x0092:
        r6 = r0.f834d;
        if (r6 != 0) goto L_0x009b;
    L_0x0096:
        r0.f832b = r2;
    L_0x0098:
        r0.f831a = r2;
        return r0;
    L_0x009b:
        if (r7 != 0) goto L_0x00a4;
    L_0x009d:
        r6 = r0.f833c;
        if (r6 != 0) goto L_0x00a4;
    L_0x00a1:
        r0.f832b = r1;
        goto L_0x0098;
    L_0x00a4:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.d.as.b(android.support.d.z, android.support.d.z):android.support.d.as$b");
    }

    private static void m8657d(C0237z c0237z) {
        c0237z.f922a.put("android:visibility:visibility", Integer.valueOf(c0237z.f923b.getVisibility()));
        c0237z.f922a.put("android:visibility:parent", c0237z.f923b.getParent());
        Object obj = new int[2];
        c0237z.f923b.getLocationOnScreen(obj);
        c0237z.f922a.put("android:visibility:screenLocation", obj);
    }

    public Animator mo2506a(View view, C0237z c0237z) {
        return null;
    }

    public final Animator mo91a(ViewGroup viewGroup, C0237z c0237z, C0237z c0237z2) {
        as asVar = this;
        View view = viewGroup;
        C0237z c0237z3 = c0237z;
        C0237z c0237z4 = c0237z2;
        C0205b b = as.m8656b(c0237z, c0237z2);
        View view2 = null;
        if (!b.f831a || (b.f835e == null && b.f836f == null)) {
            return null;
        }
        if (!b.f832b) {
            int i = b.f834d;
            if ((asVar.f12953i & 2) != 2) {
                return null;
            }
            int i2;
            Animator b2;
            int visibility;
            C0232b c4709a;
            View view3 = c0237z3 != null ? c0237z3.f923b : null;
            View view4 = c0237z4 != null ? c0237z4.f923b : null;
            if (view4 != null) {
                if (view4.getParent() != null) {
                    if (i != 4) {
                        if (view3 == view4) {
                        }
                        view2 = view3;
                        view4 = null;
                    }
                    if (view2 == null && c0237z3 != null) {
                        int[] iArr = (int[]) c0237z3.f922a.get("android:visibility:screenLocation");
                        int i3 = iArr[0];
                        i2 = iArr[1];
                        int[] iArr2 = new int[2];
                        view.getLocationOnScreen(iArr2);
                        view2.offsetLeftAndRight((i3 - iArr2[0]) - view2.getLeft());
                        view2.offsetTopAndBottom((i2 - iArr2[1]) - view2.getTop());
                        final ad a = ae.m392a(viewGroup);
                        a.mo2504a(view2);
                        b2 = mo2507b(view2, c0237z3);
                        if (b2 == null) {
                            a.mo2505b(view2);
                            return b2;
                        }
                        b2.addListener(new AnimatorListenerAdapter(asVar) {
                            final /* synthetic */ as f830c;

                            public final void onAnimationEnd(Animator animator) {
                                a.mo2505b(view2);
                            }
                        });
                        return b2;
                    } else if (view4 != null) {
                        return null;
                    } else {
                        visibility = view4.getVisibility();
                        al.m402a(view4, 0);
                        b2 = mo2507b(view4, c0237z3);
                        if (b2 == null) {
                            c4709a = new C4709a(view4, i);
                            b2.addListener(c4709a);
                            C0199a.m390a(b2, c4709a);
                            mo103a(c4709a);
                            return b2;
                        }
                        al.m402a(view4, visibility);
                        return b2;
                    }
                }
            }
            if (view4 != null) {
                view2 = view4;
                view4 = null;
            } else {
                if (view3 != null) {
                    if (view3.getParent() != null) {
                        if (view3.getParent() instanceof View) {
                            view4 = (View) view3.getParent();
                            if (as.m8656b(m442a(view4, true), m454b(view4, true)).f831a) {
                                if (view4.getParent() == null) {
                                    i2 = view4.getId();
                                    if (!(i2 == -1 || view.findViewById(i2) == null || !asVar.f)) {
                                    }
                                }
                                view2 = null;
                            } else {
                                Bitmap bitmap;
                                Matrix matrix = new Matrix();
                                matrix.setTranslate((float) (-view4.getScrollX()), (float) (-view4.getScrollY()));
                                al.m404a(view3, matrix);
                                al.m406b(view, matrix);
                                RectF rectF = new RectF(0.0f, 0.0f, (float) view3.getWidth(), (float) view3.getHeight());
                                matrix.mapRect(rectF);
                                int round = Math.round(rectF.left);
                                int round2 = Math.round(rectF.top);
                                int round3 = Math.round(rectF.right);
                                int round4 = Math.round(rectF.bottom);
                                View imageView = new ImageView(view3.getContext());
                                imageView.setScaleType(ScaleType.CENTER_CROP);
                                int round5 = Math.round(rectF.width());
                                int round6 = Math.round(rectF.height());
                                if (round5 <= 0 || round6 <= 0) {
                                    bitmap = null;
                                } else {
                                    float min = Math.min(BallPulseIndicator.SCALE, 1048576.0f / ((float) (round5 * round6)));
                                    round5 = (int) (((float) round5) * min);
                                    int i4 = (int) (((float) round6) * min);
                                    matrix.postTranslate(-rectF.left, -rectF.top);
                                    matrix.postScale(min, min);
                                    bitmap = Bitmap.createBitmap(round5, i4, Config.ARGB_8888);
                                    Canvas canvas = new Canvas(bitmap);
                                    canvas.concat(matrix);
                                    view3.draw(canvas);
                                }
                                if (bitmap != null) {
                                    imageView.setImageBitmap(bitmap);
                                }
                                imageView.measure(MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                imageView.layout(round, round2, round3, round4);
                                view2 = imageView;
                            }
                            view4 = null;
                        }
                    }
                    view2 = view3;
                    view4 = null;
                }
                view4 = null;
                view2 = null;
            }
            if (view2 == null) {
            }
            if (view4 != null) {
                return null;
            }
            visibility = view4.getVisibility();
            al.m402a(view4, 0);
            b2 = mo2507b(view4, c0237z3);
            if (b2 == null) {
                al.m402a(view4, visibility);
                return b2;
            }
            c4709a = new C4709a(view4, i);
            b2.addListener(c4709a);
            C0199a.m390a(b2, c4709a);
            mo103a(c4709a);
            return b2;
        } else if ((asVar.f12953i & 1) != 1 || c0237z4 == null) {
            return null;
        } else {
            if (c0237z3 == null) {
                view = (View) c0237z4.f923b.getParent();
                if (as.m8656b(m454b(view, false), m442a(view, false)).f831a) {
                    return null;
                }
            }
            return mo2506a(c0237z4.f923b, c0237z3);
        }
    }

    public void mo92a(C0237z c0237z) {
        as.m8657d(c0237z);
    }

    public final boolean mo93a(C0237z c0237z, C0237z c0237z2) {
        if (c0237z == null && c0237z2 == null) {
            return false;
        }
        if (c0237z != null && c0237z2 != null && c0237z2.f922a.containsKey("android:visibility:visibility") != c0237z.f922a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C0205b b = as.m8656b(c0237z, c0237z2);
        return b.f831a && (b.f833c == 0 || b.f834d == 0);
    }

    public final String[] mo94a() {
        return f12952j;
    }

    public Animator mo2507b(View view, C0237z c0237z) {
        return null;
    }

    public final void mo95b(C0237z c0237z) {
        as.m8657d(c0237z);
    }
}
