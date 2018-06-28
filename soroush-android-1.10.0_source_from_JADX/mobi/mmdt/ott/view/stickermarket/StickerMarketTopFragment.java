package mobi.mmdt.ott.view.stickermarket;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.base.Banner;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.ac.p266a.C2587e;
import mobi.mmdt.ott.logic.p261a.ac.p266a.C2588f;
import mobi.mmdt.ott.logic.p261a.ac.p267b.C6655f;
import mobi.mmdt.ott.view.components.imageslider.SliderLayout;
import mobi.mmdt.ott.view.components.imageslider.SliderLayout.C3169a;
import mobi.mmdt.ott.view.components.imageslider.SliderLayout.C3170b;
import mobi.mmdt.ott.view.components.imageslider.Tricks.ViewPagerEx.C3178f;
import mobi.mmdt.ott.view.components.imageslider.p408b.C3188a;
import mobi.mmdt.ott.view.components.imageslider.p408b.C3188a.C3186b;
import mobi.mmdt.ott.view.components.imageslider.p408b.C3188a.C3187c;
import mobi.mmdt.ott.view.components.imageslider.p408b.C6096b;
import mobi.mmdt.ott.view.components.p405e.C3150a;

public class StickerMarketTopFragment extends C3150a implements C3178f, C3186b {
    private View f17091a;
    private SliderLayout f17092b;
    private HashMap<String, String> f17093c = new HashMap();
    private C4454a f17094e;

    class C44531 implements Runnable {
        final /* synthetic */ StickerMarketTopFragment f12375a;

        C44531(StickerMarketTopFragment stickerMarketTopFragment) {
            this.f12375a = stickerMarketTopFragment;
        }

        public final void run() {
            for (String str : this.f12375a.f17093c.keySet()) {
                C3188a c6096b = new C6096b(this.f12375a.getActivity());
                c6096b.f9916e = str;
                C3188a a = c6096b.m7688a((String) this.f12375a.f17093c.get(str));
                a.f9917f = C3187c.f9909c;
                a.m7689a(this.f12375a);
                this.f12375a.f17092b.m7648a(c6096b);
            }
        }
    }

    public interface C4454a {
    }

    public final void mo2431a() {
    }

    public final void mo2266a(int i) {
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C2808d.m7148b(new C6655f());
    }

    public void onAttach(android.app.Activity r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        super.onAttach(r3);
        r0 = r3;	 Catch:{ ClassCastException -> 0x0009 }
        r0 = (mobi.mmdt.ott.view.stickermarket.StickerMarketTopFragment.C4454a) r0;	 Catch:{ ClassCastException -> 0x0009 }
        r2.f17094e = r0;	 Catch:{ ClassCastException -> 0x0009 }
        return;
    L_0x0009:
        r0 = new java.lang.ClassCastException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = r3.toString();
        r1.append(r3);
        r3 = " must implement OnStickerMarketTopFragmentInteractionListener";
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.stickermarket.StickerMarketTopFragment.onAttach(android.app.Activity):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f17091a = layoutInflater.inflate(R.layout.fragment_sticker_market_top, viewGroup, false);
        this.f17092b = (SliderLayout) this.f17091a.findViewById(R.id.slider);
        this.f17091a.findViewById(R.id.root_top_fragment_LinearLayout);
        this.f17092b.setPresetTransformer(C3170b.ZoomOutSlide);
        this.f17092b.setPresetIndicator(C3169a.Center_Bottom);
        this.f17092b.setDuration(3000);
        SliderLayout sliderLayout = this.f17092b;
        if (this != null) {
            sliderLayout.f9824a.m7683a((C3178f) this);
        }
        return this.f17091a;
    }

    public void onEvent(C2587e c2587e) {
    }

    public void onEvent(C2588f c2588f) {
        if (getActivity() != null && getView() != null) {
            Banner[] bannerArr = c2588f.f8441a;
            if (bannerArr != null) {
                for (Banner banner : bannerArr) {
                    HashMap hashMap = this.f17093c;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(banner.getmBannerId());
                    hashMap.put(stringBuilder.toString(), banner.getmLocationUrl());
                }
            }
            getActivity().runOnUiThread(new C44531(this));
        }
    }

    public void onResume() {
        super.onResume();
        this.f17092b.m7647a();
    }

    public void onStop() {
        super.onStop();
        this.f17092b.m7649b();
    }
}
