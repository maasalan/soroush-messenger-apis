package mobi.mmdt.ott.view.components.imageslider;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.C0565n;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.RelativeLayout;
import java.util.Timer;
import java.util.TimerTask;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.imageslider.Indicators.PagerIndicator;
import mobi.mmdt.ott.view.components.imageslider.Indicators.PagerIndicator.C3161a;
import mobi.mmdt.ott.view.components.imageslider.Tricks.C6093b;
import mobi.mmdt.ott.view.components.imageslider.Tricks.InfiniteViewPager;
import mobi.mmdt.ott.view.components.imageslider.Tricks.ViewPagerEx;
import mobi.mmdt.ott.view.components.imageslider.Tricks.ViewPagerEx.C3179g;
import mobi.mmdt.ott.view.components.imageslider.p407a.C3183a;
import mobi.mmdt.ott.view.components.imageslider.p408b.C3188a;
import mobi.mmdt.ott.view.components.imageslider.p533c.C6097c;
import mobi.mmdt.ott.view.components.imageslider.p533c.C6834a;
import mobi.mmdt.ott.view.components.imageslider.p533c.C6835b;
import mobi.mmdt.ott.view.components.imageslider.p533c.C6836d;
import mobi.mmdt.ott.view.components.imageslider.p533c.C6837e;
import mobi.mmdt.ott.view.components.imageslider.p533c.C6838f;
import mobi.mmdt.ott.view.components.imageslider.p533c.C6839g;
import mobi.mmdt.ott.view.components.imageslider.p533c.C6840h;
import mobi.mmdt.ott.view.components.imageslider.p533c.C6841i;
import mobi.mmdt.ott.view.components.imageslider.p533c.C6842j;
import mobi.mmdt.ott.view.components.imageslider.p533c.C6843k;
import mobi.mmdt.ott.view.components.imageslider.p533c.C6844l;
import mobi.mmdt.ott.view.components.imageslider.p533c.C6845m;
import mobi.mmdt.ott.view.components.imageslider.p533c.C6846n;
import mobi.mmdt.ott.view.components.imageslider.p533c.C6847o;
import mobi.mmdt.ott.view.components.imageslider.p533c.C6848p;
import mobi.mmdt.ott.view.components.imageslider.p533c.C6849q;

public class SliderLayout extends RelativeLayout {
    public InfiniteViewPager f9824a;
    private C6094a f9825b;
    private PagerIndicator f9826c;
    private Timer f9827d;
    private TimerTask f9828e;
    private Timer f9829f;
    private TimerTask f9830g;
    private boolean f9831h;
    private boolean f9832i;
    private boolean f9833j;
    private long f9834k;
    private C3161a f9835l;
    private C6097c f9836m;
    private C3183a f9837n;
    private Handler f9838o;

    class C31641 implements OnTouchListener {
        final /* synthetic */ SliderLayout f9792a;

        C31641(SliderLayout sliderLayout) {
            this.f9792a = sliderLayout;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                this.f9792a.m7646c();
            }
            return false;
        }
    }

    class C31652 extends Handler {
        final /* synthetic */ SliderLayout f9793a;

        C31652(SliderLayout sliderLayout) {
            this.f9793a = sliderLayout;
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            SliderLayout sliderLayout = this.f9793a;
            if (sliderLayout.getRealAdapter() == null) {
                throw new IllegalStateException("You did not set a slider adapter");
            }
            sliderLayout.f9824a.m7682a(sliderLayout.f9824a.getCurrentItem() + 1, true);
        }
    }

    class C31663 extends TimerTask {
        final /* synthetic */ SliderLayout f9794a;

        C31663(SliderLayout sliderLayout) {
            this.f9794a = sliderLayout;
        }

        public final void run() {
            this.f9794a.f9838o.sendEmptyMessage(0);
        }
    }

    class C31674 extends TimerTask {
        final /* synthetic */ SliderLayout f9795a;

        C31674(SliderLayout sliderLayout) {
            this.f9795a = sliderLayout;
        }

        public final void run() {
            this.f9795a.m7647a();
        }
    }

    public enum C3169a {
        Center_Bottom("Center_Bottom", R.id.default_center_bottom_indicator),
        Right_Bottom("Right_Bottom", R.id.default_bottom_right_indicator),
        Left_Bottom("Left_Bottom", R.id.default_bottom_left_indicator),
        Center_Top("Center_Top", R.id.default_center_top_indicator),
        Right_Top("Right_Top", R.id.default_center_top_right_indicator),
        Left_Top("Left_Top", R.id.default_center_top_left_indicator);
        
        final int f9804g;
        private final String f9805h;

        private C3169a(String str, int i) {
            this.f9805h = str;
            this.f9804g = i;
        }

        public final String toString() {
            return this.f9805h;
        }
    }

    public enum C3170b {
        Default("Default"),
        Accordion("Accordion"),
        Background2Foreground("Background2Foreground"),
        CubeIn("CubeIn"),
        DepthPage("DepthPage"),
        Fade("Fade"),
        FlipHorizontal("FlipHorizontal"),
        FlipPage("FlipPage"),
        Foreground2Background("Foreground2Background"),
        RotateDown("RotateDown"),
        RotateUp("RotateUp"),
        Stack("Stack"),
        Tablet("Tablet"),
        ZoomIn("ZoomIn"),
        ZoomOutSlide("ZoomOutSlide"),
        ZoomOut("ZoomOut");
        
        final String f9823q;

        private C3170b(String str) {
            this.f9823q = str;
        }

        public final String toString() {
            return this.f9823q;
        }
    }

    public SliderLayout(Context context) {
        this(context, null);
    }

    public SliderLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.SliderStyle);
    }

    public SliderLayout(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r7 = this;
        r7.<init>(r8, r9, r10);
        r0 = 1;
        r7.f9832i = r0;
        r1 = 4000; // 0xfa0 float:5.605E-42 double:1.9763E-320;
        r7.f9834k = r1;
        r1 = mobi.mmdt.ott.view.components.imageslider.Indicators.PagerIndicator.C3161a.Visible;
        r7.f9835l = r1;
        r1 = new mobi.mmdt.ott.view.components.imageslider.SliderLayout$2;
        r1.<init>(r7);
        r7.f9838o = r1;
        r1 = android.view.LayoutInflater.from(r8);
        r2 = 2131427889; // 0x7f0b0231 float:1.8477407E38 double:1.0530652965E-314;
        r1.inflate(r2, r7, r0);
        r8 = r8.getTheme();
        r1 = mobi.mmdt.ott.C2540d.C2534a.SliderLayout;
        r2 = 0;
        r8 = r8.obtainStyledAttributes(r9, r1, r10, r2);
        r9 = 3;
        r10 = 1100; // 0x44c float:1.541E-42 double:5.435E-321;
        r9 = r8.getInteger(r9, r10);
        r10 = mobi.mmdt.ott.view.components.imageslider.SliderLayout.C3170b.Default;
        r10 = r10.ordinal();
        r1 = 2;
        r10 = r8.getInt(r1, r10);
        r1 = r8.getBoolean(r2, r0);
        r7.f9833j = r1;
        r1 = r8.getInt(r0, r2);
        r3 = mobi.mmdt.ott.view.components.imageslider.Indicators.PagerIndicator.C3161a.values();
        r4 = r3.length;
    L_0x004b:
        if (r2 >= r4) goto L_0x005b;
    L_0x004d:
        r5 = r3[r2];
        r6 = r5.ordinal();
        if (r6 != r1) goto L_0x0058;
    L_0x0055:
        r7.f9835l = r5;
        goto L_0x005b;
    L_0x0058:
        r2 = r2 + 1;
        goto L_0x004b;
    L_0x005b:
        r1 = new mobi.mmdt.ott.view.components.imageslider.a;
        r1.<init>();
        r7.f9825b = r1;
        r1 = new mobi.mmdt.ott.view.components.imageslider.Tricks.b;
        r2 = r7.f9825b;
        r1.<init>(r2);
        r2 = 2131296664; // 0x7f090198 float:1.8211251E38 double:1.053000463E-314;
        r2 = r7.findViewById(r2);
        r2 = (mobi.mmdt.ott.view.components.imageslider.Tricks.InfiniteViewPager) r2;
        r7.f9824a = r2;
        r2 = r7.f9824a;
        r2.setAdapter(r1);
        r1 = r7.f9824a;
        r2 = new mobi.mmdt.ott.view.components.imageslider.SliderLayout$1;
        r2.<init>(r7);
        r1.setOnTouchListener(r2);
        r8.recycle();
        r8 = mobi.mmdt.ott.view.components.imageslider.SliderLayout.C3169a.Center_Bottom;
        r7.setPresetIndicator(r8);
        r7.setPresetTransformer(r10);
        r8 = mobi.mmdt.ott.view.components.imageslider.Tricks.ViewPagerEx.class;	 Catch:{ Exception -> 0x00a9 }
        r10 = "a";	 Catch:{ Exception -> 0x00a9 }
        r8 = r8.getDeclaredField(r10);	 Catch:{ Exception -> 0x00a9 }
        r8.setAccessible(r0);	 Catch:{ Exception -> 0x00a9 }
        r10 = new mobi.mmdt.ott.view.components.imageslider.Tricks.a;	 Catch:{ Exception -> 0x00a9 }
        r0 = r7.f9824a;	 Catch:{ Exception -> 0x00a9 }
        r0 = r0.getContext();	 Catch:{ Exception -> 0x00a9 }
        r10.<init>(r0, r9);	 Catch:{ Exception -> 0x00a9 }
        r9 = r7.f9824a;	 Catch:{ Exception -> 0x00a9 }
        r8.set(r9, r10);	 Catch:{ Exception -> 0x00a9 }
    L_0x00a9:
        r8 = r7.f9835l;
        r7.setIndicatorVisibility(r8);
        r8 = r7.f9833j;
        if (r8 == 0) goto L_0x00b5;
    L_0x00b2:
        r7.m7647a();
    L_0x00b5:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.components.imageslider.SliderLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void m7646c() {
        if (this.f9832i && this.f9833j && !this.f9831h) {
            if (!(this.f9830g == null || this.f9829f == null)) {
                this.f9829f.cancel();
                this.f9830g.cancel();
            }
            this.f9829f = new Timer();
            this.f9830g = new C31674(this);
            this.f9829f.schedule(this.f9830g, 6000);
        }
    }

    private C6093b getWrapperAdapter() {
        C0565n adapter = this.f9824a.getAdapter();
        return adapter != null ? (C6093b) adapter : null;
    }

    public final void m7647a() {
        long j = this.f9834k;
        long j2 = this.f9834k;
        boolean z = this.f9832i;
        if (this.f9827d != null) {
            this.f9827d.cancel();
        }
        if (this.f9828e != null) {
            this.f9828e.cancel();
        }
        if (this.f9830g != null) {
            this.f9830g.cancel();
        }
        if (this.f9829f != null) {
            this.f9829f.cancel();
        }
        this.f9834k = j2;
        this.f9827d = new Timer();
        this.f9832i = z;
        this.f9828e = new C31663(this);
        this.f9827d.schedule(this.f9828e, j, this.f9834k);
        this.f9831h = true;
        this.f9833j = true;
    }

    public final <T extends C3188a> void m7648a(T t) {
        C6094a c6094a = this.f9825b;
        t.f9915d = c6094a;
        c6094a.f16354a.add(t);
        c6094a.m1270d();
    }

    public final void m7649b() {
        if (this.f9828e != null) {
            this.f9828e.cancel();
        }
        if (this.f9827d != null) {
            this.f9827d.cancel();
        }
        if (this.f9829f != null) {
            this.f9829f.cancel();
        }
        if (this.f9830g != null) {
            this.f9830g.cancel();
        }
        this.f9833j = false;
        this.f9831h = false;
    }

    public int getCurrentPosition() {
        if (getRealAdapter() != null) {
            return getRealAdapter().f16354a.size() == 0 ? -1 : this.f9824a.getCurrentItem() % getRealAdapter().f16354a.size();
        } else {
            throw new IllegalStateException("You did not set a slider adapter");
        }
    }

    public C3188a getCurrentSlider() {
        if (getRealAdapter() == null) {
            throw new IllegalStateException("You did not set a slider adapter");
        }
        int currentItem = this.f9824a.getCurrentItem() % getRealAdapter().f16354a.size();
        C6094a realAdapter = getRealAdapter();
        if (currentItem >= 0) {
            if (currentItem < realAdapter.f16354a.size()) {
                return (C3188a) realAdapter.f16354a.get(currentItem);
            }
        }
        return null;
    }

    public C3161a getIndicatorVisibility() {
        return this.f9826c == null ? this.f9826c.getIndicatorVisibility() : C3161a.Invisible;
    }

    public PagerIndicator getPagerIndicator() {
        return this.f9826c;
    }

    public C6094a getRealAdapter() {
        C0565n adapter = this.f9824a.getAdapter();
        return adapter != null ? ((C6093b) adapter).f16353a : null;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (this.f9831h) {
            this.f9827d.cancel();
            this.f9828e.cancel();
            this.f9831h = false;
            return false;
        }
        if (!(this.f9829f == null || this.f9830g == null)) {
            m7646c();
        }
        return false;
    }

    public void setCurrentPosition(int i) {
        if (getRealAdapter() == null) {
            throw new IllegalStateException("You did not set a slider adapter");
        } else if (i >= getRealAdapter().f16354a.size()) {
            throw new IllegalStateException("Item position is not exist");
        } else {
            this.f9824a.m7682a((i - (this.f9824a.getCurrentItem() % getRealAdapter().f16354a.size())) + this.f9824a.getCurrentItem(), true);
        }
    }

    public void setCustomAnimation(C3183a c3183a) {
        this.f9837n = c3183a;
        if (this.f9836m != null) {
            this.f9836m.f16358a = this.f9837n;
        }
    }

    public void setCustomIndicator(PagerIndicator pagerIndicator) {
        if (this.f9826c != null) {
            PagerIndicator pagerIndicator2 = this.f9826c;
            if (pagerIndicator2.f16328a != null) {
                if (pagerIndicator2.f16328a.getAdapter() != null) {
                    C0565n c0565n = ((C6093b) pagerIndicator2.f16328a.getAdapter()).f16353a;
                    if (c0565n != null) {
                        c0565n.m1266b(pagerIndicator2.f16329b);
                    }
                    pagerIndicator2.removeAllViews();
                }
            }
        }
        this.f9826c = pagerIndicator;
        this.f9826c.setIndicatorVisibility(this.f9835l);
        this.f9826c.setViewPager(this.f9824a);
        this.f9826c.m13772a();
    }

    public void setDuration(long j) {
        if (j >= 500) {
            this.f9834k = j;
            if (this.f9833j && this.f9831h) {
                m7647a();
            }
        }
    }

    public void setIndicatorVisibility(C3161a c3161a) {
        if (this.f9826c != null) {
            this.f9826c.setIndicatorVisibility(c3161a);
        }
    }

    public void setPresetIndicator(C3169a c3169a) {
        setCustomIndicator((PagerIndicator) findViewById(c3169a.f9804g));
    }

    public void setPresetTransformer(int i) {
        for (C3170b c3170b : C3170b.values()) {
            if (c3170b.ordinal() == i) {
                setPresetTransformer(c3170b);
                return;
            }
        }
    }

    public void setPresetTransformer(String str) {
        for (C3170b c3170b : C3170b.values()) {
            Object obj = (str == null || !c3170b.f9823q.equals(str)) ? null : 1;
            if (obj != null) {
                setPresetTransformer(c3170b);
                return;
            }
        }
    }

    public void setPresetTransformer(C3170b c3170b) {
        C6097c c6837e;
        switch (c3170b) {
            case Default:
                c6837e = new C6837e();
                break;
            case Accordion:
                c6837e = new C6834a();
                break;
            case Background2Foreground:
                c6837e = new C6835b();
                break;
            case CubeIn:
                c6837e = new C6836d();
                break;
            case DepthPage:
                c6837e = new C6838f();
                break;
            case Fade:
                c6837e = new C6839g();
                break;
            case FlipHorizontal:
                c6837e = new C6840h();
                break;
            case FlipPage:
                c6837e = new C6841i();
                break;
            case Foreground2Background:
                c6837e = new C6842j();
                break;
            case RotateDown:
                c6837e = new C6843k();
                break;
            case RotateUp:
                c6837e = new C6844l();
                break;
            case Stack:
                c6837e = new C6845m();
                break;
            case Tablet:
                c6837e = new C6846n();
                break;
            case ZoomIn:
                c6837e = new C6847o();
                break;
            case ZoomOutSlide:
                c6837e = new C6848p();
                break;
            case ZoomOut:
                c6837e = new C6849q();
                break;
            default:
                c6837e = null;
                break;
        }
        this.f9836m = c6837e;
        this.f9836m.f16358a = this.f9837n;
        ViewPagerEx viewPagerEx = this.f9824a;
        C3179g c3179g = this.f9836m;
        int i = 1;
        boolean z = c3179g != null;
        if (z != (viewPagerEx.f9882b == null)) {
            i = 0;
        }
        viewPagerEx.f9882b = c3179g;
        viewPagerEx.setChildrenDrawingOrderEnabledCompat(z);
        if (z) {
            viewPagerEx.f9883c = 2;
        } else {
            viewPagerEx.f9883c = 0;
        }
        if (i != 0) {
            viewPagerEx.m7684b();
        }
    }
}
