package mobi.mmdt.ott.view.conversation.emojisticker;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.C0565n;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.C0523f;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.provider.p394p.C3016f;
import mobi.mmdt.ott.provider.p394p.C6048d;
import mobi.mmdt.ott.provider.p394p.C6049e;
import mobi.mmdt.ott.view.conversation.emojisticker.C4010a.C4009a;
import mobi.mmdt.ott.view.conversation.emojisticker.emoji.C6207a;
import mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon.emoji.Emojicon;
import mobi.mmdt.ott.view.conversation.emojisticker.sticker.C6208a;
import mobi.mmdt.ott.view.conversation.emojisticker.sticker.C6209b;
import mobi.mmdt.ott.view.conversation.emojisticker.viewpagerindicator.C4046a;
import mobi.mmdt.ott.view.conversation.emojisticker.viewpagerindicator.C4047d;
import mobi.mmdt.ott.view.conversation.emojisticker.viewpagerindicator.C6210b;
import mobi.mmdt.ott.view.conversation.emojisticker.viewpagerindicator.C6211c;
import mobi.mmdt.ott.view.conversation.emojisticker.viewpagerindicator.C6212e;
import mobi.mmdt.ott.view.conversation.emojisticker.viewpagerindicator.IconPageIndicator;
import mobi.mmdt.ott.view.conversation.emojisticker.viewpagerindicator.IconPageIndicator.C4045a;

public final class C6205b extends PopupWindow implements C4009a, C4045a {
    public C4016a f16754a;
    private ArrayList<C4010a> f16755b = new ArrayList();
    private ArrayList<C4046a> f16756c = new ArrayList();
    private ArrayList<C4010a> f16757d = new ArrayList();
    private ArrayList<C4046a> f16758e = new ArrayList();
    private Activity f16759f;
    private View f16760g;
    private C6204b f16761h;
    private ViewPager f16762i;
    private ImageButton f16763j;
    private C6212e f16764k;
    private OnClickListener f16765l = new C40133(this);
    private C4019d f16766m = new C4019d(new C40144(this));
    private OnClickListener f16767n = new C40155(this);

    class C40122 implements Runnable {
        final /* synthetic */ C6205b f11543a;

        public C40122(C6205b c6205b) {
            this.f11543a = c6205b;
        }

        public final void run() {
            Context f = this.f11543a.f16759f;
            C6049e c6049e = new C6049e();
            ((C6049e) c6049e.m13584a(C3016f.READY).m7368c()).m13589i();
            final C6048d b = c6049e.m13585b(f);
            if (this.f11543a.f16759f != null && this.f11543a.f16761h != null) {
                this.f11543a.f16759f.runOnUiThread(new Runnable(this) {
                    final /* synthetic */ C40122 f11542b;

                    public final void run() {
                        this.f11542b.f11543a.f16757d.clear();
                        this.f11542b.f11543a.f16758e.clear();
                        this.f11542b.f11543a.f16762i.removeAllViews();
                        this.f11542b.f11543a.f16757d.addAll(this.f11542b.f11543a.f16755b);
                        this.f11542b.f11543a.f16758e.addAll(this.f11542b.f11543a.f16756c);
                        int size = this.f11542b.f11543a.f16757d.size();
                        if (b.moveToFirst()) {
                            do {
                                int b = b.m13582b();
                                String c = b.m13583c();
                                this.f11542b.f11543a.f16757d.add(C6209b.m14308a(this.f11542b.f11543a.f16759f, b));
                                this.f11542b.f11543a.f16758e.add(new C6211c(size, b, c, c));
                                size++;
                            } while (b.moveToNext());
                        } else {
                            this.f11542b.f11543a.f16757d.add(new C6208a(this.f11542b.f11543a.f16759f));
                            this.f11542b.f11543a.f16758e.add(new C6210b(size, 7, R.drawable.emoji_sticker, R.drawable.emoji_sticker_focus));
                        }
                        b.close();
                        Iterator it = this.f11542b.f11543a.f16757d.iterator();
                        while (it.hasNext()) {
                            ((C4010a) it.next()).m7893a(this.f11542b.f11543a);
                        }
                        this.f11542b.f11543a.f16761h.m1270d();
                        this.f11542b.f11543a.f16764k.mo3233a();
                        if (this.f11542b.f11543a.f16757d.size() <= 0 || ((C4010a) this.f11542b.f11543a.f16757d.get(0)).mo2370b() <= 0) {
                            this.f11542b.f11543a.f16762i.setCurrentItem(1);
                        } else {
                            this.f11542b.f11543a.f16762i.setCurrentItem(0);
                        }
                    }
                });
            }
        }
    }

    class C40133 implements OnClickListener {
        final /* synthetic */ C6205b f11544a;

        C40133(C6205b c6205b) {
            this.f11544a = c6205b;
        }

        public final void onClick(View view) {
            if (this.f11544a.f16754a != null) {
                this.f11544a.f16754a.mo2342q();
            }
        }
    }

    class C40144 implements OnClickListener {
        final /* synthetic */ C6205b f11545a;

        C40144(C6205b c6205b) {
            this.f11545a = c6205b;
        }

        public final void onClick(View view) {
            if (this.f11545a.f16754a != null) {
                this.f11545a.f16754a.mo2342q();
            }
        }
    }

    class C40155 implements OnClickListener {
        final /* synthetic */ C6205b f11546a;

        C40155(C6205b c6205b) {
            this.f11546a = c6205b;
        }

        public final void onClick(View view) {
            if (this.f11546a.f16754a != null) {
                this.f11546a.f16754a.mo2341p();
            }
        }
    }

    public interface C4016a {
        void mo2302a(int i, int i2, int i3, String str);

        void mo2313a(Emojicon emojicon);

        void mo2341p();

        void mo2342q();
    }

    class C62031 implements C0523f {
        final /* synthetic */ C6205b f16752a;

        C62031(C6205b c6205b) {
            this.f16752a = c6205b;
        }

        public final void mo173a(int i) {
        }

        public final void mo174a(int i, float f, int i2) {
        }

        public final void mo175b(int i) {
            ImageButton b;
            OnTouchListener d;
            if (this.f16752a.f16761h.mo2363a(i).f11608a == 1) {
                this.f16752a.f16763j.setImageResource(R.drawable.ic_emoji_backspace);
                this.f16752a.f16763j.setOnClickListener(this.f16752a.f16765l);
                b = this.f16752a.f16763j;
                d = this.f16752a.f16766m;
            } else {
                this.f16752a.f16763j.setImageResource(R.drawable.ic_sticker_add);
                this.f16752a.f16763j.setOnClickListener(this.f16752a.f16767n);
                b = this.f16752a.f16763j;
                d = null;
            }
            b.setOnTouchListener(d);
        }
    }

    class C6204b extends C0565n implements C4047d {
        final /* synthetic */ C6205b f16753a;

        public C6204b(C6205b c6205b) {
            this.f16753a = c6205b;
        }

        public final Object mo208a(ViewGroup viewGroup, int i) {
            View a = ((C4010a) this.f16753a.f16757d.get(i)).mo2368a();
            viewGroup.addView(a, 0);
            return a;
        }

        public final C4046a mo2363a(int i) {
            return (C4046a) this.f16753a.f16758e.get(i % this.f16753a.f16758e.size());
        }

        public final void mo211a(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        public final boolean mo213a(View view, Object obj) {
            return obj == view;
        }

        public final int mo2270b() {
            return this.f16753a.f16757d.size();
        }

        public final CharSequence mo2364b(int i) {
            return "";
        }
    }

    public C6205b(Activity activity, int i) {
        this.f16759f = activity;
        this.f16760g = activity.getLayoutInflater().inflate(R.layout.fragment_emoji_sticker_pane_layout, null);
        setContentView(this.f16760g);
        setAnimationStyle(R.style.PopupAnimation);
        setWidth(-1);
        setHeight(i);
        setFocusable(false);
        this.f16755b.add(C6207a.m14299a(this.f16759f, 6));
        this.f16755b.add(C6207a.m14299a(this.f16759f, 3));
        this.f16755b.add(C6207a.m14299a(this.f16759f, 1));
        this.f16755b.add(C6207a.m14299a(this.f16759f, 2));
        this.f16755b.add(C6207a.m14299a(this.f16759f, 4));
        this.f16755b.add(C6207a.m14299a(this.f16759f, 5));
        this.f16756c.add(new C6210b(0, 6, R.drawable.emoji_recent, R.drawable.emoji_recent_focus));
        this.f16756c.add(new C6210b(1, 3, R.drawable.emoji_smile, R.drawable.emoji_smile_focus));
        this.f16756c.add(new C6210b(2, 1, R.drawable.emoji_flower, R.drawable.emoji_flower_focus));
        this.f16756c.add(new C6210b(3, 2, R.drawable.emoji_bell, R.drawable.emoji_bell_focus));
        this.f16756c.add(new C6210b(4, 4, R.drawable.emoji_car, R.drawable.emoji_car_focus));
        this.f16756c.add(new C6210b(5, 5, R.drawable.emoji_symbols, R.drawable.emoji_symbols_focus));
        C2491i.m6796a((RelativeLayout) this.f16760g.findViewById(R.id.root_relative_layout), UIThemeManager.getmInstance().getRecycler_view_background_color());
        this.f16762i = (ViewPager) this.f16760g.findViewById(R.id.pager);
        this.f16762i.removeAllViews();
        this.f16761h = new C6204b(this);
        this.f16762i.setAdapter(this.f16761h);
        if (this.f16757d.size() > 0) {
            this.f16762i.setOffscreenPageLimit(this.f16757d.size());
        }
        this.f16764k = (IconPageIndicator) this.f16760g.findViewById(R.id.indicator);
        ((IconPageIndicator) this.f16764k).setIconPageIndicatorListener(this);
        this.f16764k.setViewPager(this.f16762i);
        int a = C2489g.m6754a().m6755a(0.125f);
        this.f16762i.m1155a(new C62031(this));
        this.f16763j = (ImageButton) this.f16760g.findViewById(R.id.backspace_imageButton);
        this.f16763j.getLayoutParams().width = a;
        this.f16763j.setOnClickListener(this.f16765l);
        this.f16763j.setOnTouchListener(this.f16766m);
    }

    public final void mo2365a(int i, int i2, int i3, String str) {
        if (this.f16754a != null) {
            this.f16754a.mo2302a(i, i2, i3, str);
        }
    }

    public final void mo2366a(Emojicon emojicon) {
        if (this.f16754a != null) {
            this.f16754a.mo2313a(emojicon);
        }
    }
}
