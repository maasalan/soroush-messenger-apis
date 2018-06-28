package mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p556c;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.p561a.C7166j;
import mobi.mmdt.ott.view.components.imageslider.C6094a;
import mobi.mmdt.ott.view.components.imageslider.SliderLayout;
import mobi.mmdt.ott.view.components.imageslider.p408b.C3188a;
import mobi.mmdt.ott.view.components.imageslider.p408b.C3188a.C3186b;
import mobi.mmdt.ott.view.components.imageslider.p408b.C3188a.C3187c;
import mobi.mmdt.ott.view.components.imageslider.p408b.C6096b;
import mobi.mmdt.ott.view.components.p401c.C6071a;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.C4224d;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p464d.C7372e;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p464d.p580a.C7219c;
import mobi.mmdt.ott.view.tools.C4534s;

public final class C6936c extends C6071a implements C3186b {
    private C4224d f19820c;
    private final C4534s f19821d;
    private final C7166j f19822e = ((C7166j) this.f16237a);

    public C6936c(Activity activity, int i, ViewGroup viewGroup, C4224d c4224d) {
        super(C7166j.m18947a(LayoutInflater.from(activity), viewGroup), i, null);
        this.f19820c = c4224d;
        this.f19821d = new C4534s(activity, this);
        FrameLayout frameLayout = this.f19822e.f20598d;
        frameLayout.removeAllViews();
        frameLayout.addView(this.f19821d.f12493a);
        frameLayout.getLayoutParams().height = C2489g.m6754a().m6755a(0.5f);
    }

    public final void mo2431a() {
        this.f19821d.f12495c.m7649b();
        C6829g c6829g = this.f16238b;
        C4534s c4534s = this.f19821d;
        int parseInt = c4534s.f12495c != null ? Integer.parseInt(c4534s.f12495c.getCurrentSlider().f9916e) : -1;
        if (parseInt >= 0) {
            C7219c c7219c = (C7219c) ((C7372e) c6829g).f21449b.get(parseInt);
            String str = c7219c.f20854b;
            String str2 = c7219c.f20855c;
            this.f19820c.mo3248a(c7219c.f20856d, str2, str, c7219c.f20853a);
            StringBuilder stringBuilder = new StringBuilder(" %%%%%%%%%%%% currentPosition : ");
            stringBuilder.append(str);
            stringBuilder.append("  getAvatarThumbnailUrl : ");
            stringBuilder.append(c7219c.f20857e);
            stringBuilder.append(" getActionData : ");
            stringBuilder.append(str2);
            C2480b.m6742f(stringBuilder.toString());
        }
    }

    protected final void mo3188b() {
    }

    protected final void mo3189b(C6829g c6829g) {
        Iterator it;
        C7372e c7372e = (C7372e) c6829g;
        C4534s c4534s = this.f19821d;
        ArrayList arrayList = c7372e.f21449b;
        int i = c7372e.f21448a;
        SliderLayout sliderLayout = c4534s.f12495c;
        if (sliderLayout.getRealAdapter() != null) {
            int size = sliderLayout.getRealAdapter().f16354a.size();
            C6094a realAdapter = sliderLayout.getRealAdapter();
            realAdapter.f16354a.clear();
            realAdapter.m1270d();
            sliderLayout.f9824a.m7682a(sliderLayout.f9824a.getCurrentItem() + size, false);
        }
        HashMap hashMap = new HashMap();
        if (arrayList != null) {
            it = arrayList.iterator();
            while (it.hasNext()) {
                C6829g c6829g2 = (C6829g) it.next();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(c6829g2.f19504k);
                hashMap.put(stringBuilder.toString(), ((C7219c) c6829g2).f20857e);
            }
        }
        for (String str : hashMap.keySet()) {
            C3188a c6096b = new C6096b(c4534s.f12495c.getContext());
            String str2 = (String) hashMap.get(str);
            c6096b.f9916e = str;
            C3188a a = c6096b.m7688a(str2);
            a.f9917f = C3187c.f9909c;
            a.m7689a(c4534s.f12494b);
            c4534s.f12495c.m7648a(c6096b);
        }
        c4534s.f12495c.setDuration((long) i);
    }
}
