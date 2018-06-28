package com.p196h.p197a;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import com.nineoldandroids.view.ViewHelper;
import com.p196h.p197a.C2126c.C2125a;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C2124b extends RelativeLayout {
    public View f7109a;
    protected int f7110b;
    private View f7111c;
    private Activity f7112d;
    private C5646b f7113e = new C5646b(this, this);
    private boolean f7114f = true;
    private int f7115g = 2500;
    private boolean f7116h = true;
    private RecyclerView f7117i;
    private C2127d f7118j;
    private int f7119k = 17170443;
    private C2122a f7120l;

    class C21201 implements OnTouchListener {
        final /* synthetic */ C2124b f7102a;

        C21201(C2124b c2124b) {
            this.f7102a = c2124b;
        }

        public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r11 = this;
            r12 = r13.getAction();
            r0 = 4;
            r1 = 1;
            if (r12 == r1) goto L_0x0091;
        L_0x0008:
            r12 = r11.f7102a;	 Catch:{ NullPointerException -> 0x0089 }
            r12 = r12.f7117i;	 Catch:{ NullPointerException -> 0x0089 }
            r2 = r11.f7102a;	 Catch:{ NullPointerException -> 0x0089 }
            r2 = r2.f7117i;	 Catch:{ NullPointerException -> 0x0089 }
            r2 = r2.getAdapter();	 Catch:{ NullPointerException -> 0x0089 }
            r2 = r2.getItemCount();	 Catch:{ NullPointerException -> 0x0089 }
            r2 = (float) r2;	 Catch:{ NullPointerException -> 0x0089 }
            r13 = r13.getY();	 Catch:{ NullPointerException -> 0x0089 }
            r3 = r11.f7102a;	 Catch:{ NullPointerException -> 0x0089 }
            r3 = r3.getHeight();	 Catch:{ NullPointerException -> 0x0089 }
            r4 = r11.f7102a;	 Catch:{ NullPointerException -> 0x0089 }
            r4 = r4.f7109a;	 Catch:{ NullPointerException -> 0x0089 }
            r4 = r4.getHeight();	 Catch:{ NullPointerException -> 0x0089 }
            r3 = r3 - r4;	 Catch:{ NullPointerException -> 0x0089 }
            r3 = (float) r3;	 Catch:{ NullPointerException -> 0x0089 }
            r13 = r13 / r3;	 Catch:{ NullPointerException -> 0x0089 }
            r2 = r2 * r13;	 Catch:{ NullPointerException -> 0x0089 }
            r13 = (int) r2;	 Catch:{ NullPointerException -> 0x0089 }
            r12.scrollToPosition(r13);	 Catch:{ NullPointerException -> 0x0089 }
            r12 = r11.f7102a;	 Catch:{ NullPointerException -> 0x0089 }
            r12 = r12.f7118j;	 Catch:{ NullPointerException -> 0x0089 }
            r13 = 0;	 Catch:{ NullPointerException -> 0x0089 }
            if (r12 == 0) goto L_0x0057;	 Catch:{ NullPointerException -> 0x0089 }
        L_0x0042:
            r12 = r11.f7102a;	 Catch:{ NullPointerException -> 0x0089 }
            r12 = r12.f7118j;	 Catch:{ NullPointerException -> 0x0089 }
            r12 = r12.getVisibility();	 Catch:{ NullPointerException -> 0x0089 }
            if (r12 != r0) goto L_0x0057;	 Catch:{ NullPointerException -> 0x0089 }
        L_0x004e:
            r12 = r11.f7102a;	 Catch:{ NullPointerException -> 0x0089 }
            r12 = r12.f7118j;	 Catch:{ NullPointerException -> 0x0089 }
            r12.setVisibility(r13);	 Catch:{ NullPointerException -> 0x0089 }
        L_0x0057:
            r12 = r11.f7102a;
            r12 = r12.f7116h;
            if (r12 == 0) goto L_0x00d3;
        L_0x005f:
            r12 = r11.f7102a;
            r12 = r12.f7114f;
            if (r12 == 0) goto L_0x00d3;
        L_0x0067:
            r12 = r11.f7102a;
            r12.f7114f = r13;
            r12 = new android.view.animation.TranslateAnimation;
            r3 = 1;
            r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            r5 = 1;
            r6 = 0;
            r7 = 2;
            r8 = 0;
            r9 = 2;
            r10 = 0;
            r2 = r12;
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10);
            r2 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
            r12.setDuration(r2);
            r12.setFillAfter(r1);
            r13 = r11.f7102a;
            r13.startAnimation(r12);
            return r1;
        L_0x0089:
            r12 = new com.h.a.b$c;
            r13 = r11.f7102a;
            r12.<init>(r13);
            throw r12;
        L_0x0091:
            r12 = r11.f7102a;
            r12 = r12.f7118j;
            if (r12 == 0) goto L_0x00ae;
        L_0x0099:
            r12 = r11.f7102a;
            r12 = r12.f7118j;
            r12 = r12.getVisibility();
            if (r12 != 0) goto L_0x00ae;
        L_0x00a5:
            r12 = r11.f7102a;
            r12 = r12.f7118j;
            r12.setVisibility(r0);
        L_0x00ae:
            r12 = r11.f7102a;
            r12 = r12.f7116h;
            if (r12 == 0) goto L_0x00d3;
        L_0x00b6:
            r12 = r11.f7102a;
            r12 = r12.f7120l;
            r12.f7106c = r1;
            r12 = r11.f7102a;
            r12 = r12.f7120l;
            r2 = java.lang.System.currentTimeMillis();
            r13 = r11.f7102a;
            r13 = r13.f7115g;
            r4 = (long) r13;
            r6 = r2 + r4;
            r12.f7105b = r6;
        L_0x00d3:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.h.a.b.1.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    class C2122a extends Thread {
        C2124b f7104a;
        long f7105b = 0;
        boolean f7106c = false;
        final /* synthetic */ C2124b f7107d;

        class C21211 implements Runnable {
            final /* synthetic */ C2122a f7103a;

            C21211(C2122a c2122a) {
                this.f7103a = c2122a;
            }

            public final void run() {
                Animation translateAnimation = new TranslateAnimation(2, 0.0f, 1, BallPulseIndicator.SCALE, 2, 0.0f, 2, 0.0f);
                translateAnimation.setDuration(500);
                translateAnimation.setFillAfter(true);
                this.f7103a.f7107d.f7114f = true;
                this.f7103a.f7104a.startAnimation(translateAnimation);
            }
        }

        C2122a(C2124b c2124b, C2124b c2124b2) {
            this.f7107d = c2124b;
            this.f7104a = c2124b2;
        }

        public final void run() {
            while (true) {
                try {
                    if (this.f7106c && this.f7105b <= System.currentTimeMillis()) {
                        this.f7106c = false;
                        this.f7104a.f7112d.runOnUiThread(new C21211(this));
                    }
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
    }

    class C2123c extends RuntimeException {
        final /* synthetic */ C2124b f7108a;

        public C2123c(C2124b c2124b) {
            this.f7108a = c2124b;
            super("You failed to run setRecyclerView()! You must do this.");
        }
    }

    private class C5646b extends OnScrollListener {
        C2124b f15503a;
        final /* synthetic */ C2124b f15504b;

        C5646b(C2124b c2124b, C2124b c2124b2) {
            this.f15504b = c2124b;
            this.f15503a = c2124b2;
        }

        private float m12395a(RecyclerView recyclerView) {
            int findLastCompletelyVisibleItemPosition = ((LinearLayoutManager) recyclerView.getLayoutManager()).findLastCompletelyVisibleItemPosition();
            View childAt = recyclerView.getChildAt(0);
            if (childAt == null) {
                return 0.0f;
            }
            int height = recyclerView.getHeight() / recyclerView.getChildViewHolder(childAt).itemView.getHeight();
            int itemCount = recyclerView.getAdapter().getItemCount();
            height = itemCount - height;
            findLastCompletelyVisibleItemPosition -= (itemCount - height) - 1;
            if (this.f15504b.f7118j != null && this.f15504b.f7118j.getVisibility() == 0) {
                C2127d d;
                Character a;
                if (findLastCompletelyVisibleItemPosition == 0) {
                    d = this.f15504b.f7118j;
                    a = ((C2119a) recyclerView.getAdapter()).mo3448a(findLastCompletelyVisibleItemPosition);
                } else {
                    d = this.f15504b.f7118j;
                    a = ((C2119a) recyclerView.getAdapter()).mo3448a(findLastCompletelyVisibleItemPosition - 1);
                }
                d.m5804a(a);
            }
            return ((float) findLastCompletelyVisibleItemPosition) / ((float) height);
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (this.f15504b.f7116h) {
                if (i == 0) {
                    this.f15504b.f7120l.f7105b = System.currentTimeMillis() + ((long) this.f15504b.f7115g);
                    this.f15504b.f7120l.f7106c = true;
                } else if (i == 1) {
                    this.f15504b.f7120l.f7106c = false;
                    if (this.f15504b.f7114f) {
                        this.f15504b.f7114f = false;
                        Animation translateAnimation = new TranslateAnimation(1, BallPulseIndicator.SCALE, 1, 0.0f, 2, 0.0f, 2, 0.0f);
                        translateAnimation.setDuration(500);
                        translateAnimation.setFillAfter(true);
                        this.f15503a.startAnimation(translateAnimation);
                    }
                }
            }
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            ViewHelper.setY(this.f15504b.f7109a, m12395a(recyclerView) * ((float) (this.f15503a.getHeight() - this.f15504b.f7109a.getHeight())));
            if (this.f15504b.f7118j != null && this.f15504b.f7118j.getVisibility() == 0) {
                View d = this.f15504b.f7118j;
                float a = (m12395a(recyclerView) * ((float) (this.f15503a.getHeight() - this.f15504b.f7109a.getHeight()))) - ((float) C2128e.m5805a(74, d));
                if (a < 0.0f) {
                    a += (float) C2128e.m5805a(100, d);
                    ViewHelper.setScaleY(d.f7121a, -1.0f);
                    ViewHelper.setScaleY(d.f7122b, -1.0f);
                    ViewHelper.setY(d.f7121a, a);
                    return;
                }
                ViewHelper.setScaleY(d.f7121a, BallPulseIndicator.SCALE);
                ViewHelper.setScaleY(d.f7122b, BallPulseIndicator.SCALE);
                ViewHelper.setY(d.f7121a, a);
            }
        }
    }

    public C2124b(Context context, RecyclerView recyclerView) {
        super(context);
        if (!isInEditMode()) {
            this.f7112d = (Activity) context;
        }
        this.f7111c = new View(context);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(C2128e.m5805a(8, this), -1);
        layoutParams.addRule(11);
        this.f7111c.setLayoutParams(layoutParams);
        this.f7111c.setBackgroundColor(getResources().getColor(17170432));
        ViewHelper.setAlpha(this.f7111c, 0.4f);
        this.f7109a = new View(context);
        layoutParams = new RelativeLayout.LayoutParams(C2128e.m5805a(8, this), C2128e.m5805a(48, this));
        layoutParams.addRule(11);
        this.f7109a.setLayoutParams(layoutParams);
        if (VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{16843829});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            this.f7110b = color;
        } else {
            this.f7110b = Color.parseColor("#9c9c9c");
        }
        this.f7109a.setBackgroundColor(this.f7110b);
        addView(this.f7111c);
        addView(this.f7109a);
        setId(C2125a.reservedNamedId);
        LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(C2128e.m5805a(20, this), -1);
        layoutParams2.addRule(11);
        ((ViewGroup) recyclerView.getParent()).addView(this, layoutParams2);
        recyclerView.addOnScrollListener(this.f7113e);
        this.f7117i = recyclerView;
        setOnTouchListener(new C21201(this));
        this.f7120l = new C2122a(this, this);
        this.f7120l.start();
        Animation translateAnimation = new TranslateAnimation(2, 0.0f, 1, BallPulseIndicator.SCALE, 2, 0.0f, 2, 0.0f);
        translateAnimation.setFillAfter(true);
        startAnimation(translateAnimation);
    }
}
