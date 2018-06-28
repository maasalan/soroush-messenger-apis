package mobi.mmdt.ott.view.stickermarket;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p072b.p073a.p074a.C1063i;
import java.util.ArrayList;
import java.util.List;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.base.StickerCategory;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.base.StickerCollection;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.ac.p266a.C2583a;
import mobi.mmdt.ott.logic.p261a.ac.p266a.C2584b;
import mobi.mmdt.ott.logic.p261a.ac.p266a.C2590h;
import mobi.mmdt.ott.logic.p261a.ac.p266a.C2591i;
import mobi.mmdt.ott.logic.p261a.ac.p266a.C2592j;
import mobi.mmdt.ott.logic.p261a.ac.p267b.C6653d;
import mobi.mmdt.ott.logic.p261a.ac.p267b.C6654e;
import mobi.mmdt.ott.logic.p261a.ac.p267b.C6658i;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6074f;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.components.p405e.C3150a;
import mobi.mmdt.ott.view.stickermarket.p534a.C6987a;
import mobi.mmdt.ott.view.stickermarket.p588b.C7229a;
import mobi.mmdt.ott.view.stickermarket.p588b.C7392b;
import mobi.mmdt.ott.view.stickermarket.p588b.C7393c;

public final class C6269a extends C3150a implements C3126i {
    private int f17098a = 20;
    private int f17099b = 0;
    private ArrayList<C6829g> f17100c = new ArrayList();
    private ProgressWheel f17101e;
    private C6988b f17102f;
    private LinearLayoutManager f17103g;
    private C6987a f17104h;
    private int f17105i = C4462b.f12383a;
    private String f17106j;
    private boolean f17107k;
    private boolean f17108l;
    private FrameLayout f17109m;
    private LinearLayout f17110n;
    private TextView f17111o;
    private RecyclerView f17112p;

    class C44552 implements Runnable {
        final /* synthetic */ C6269a f12376a;

        C44552(C6269a c6269a) {
            this.f12376a = c6269a;
        }

        public final void run() {
            this.f12376a.f17104h.mo3643g();
            this.f12376a.f17101e.setVisibility(8);
        }
    }

    class C44563 implements Runnable {
        final /* synthetic */ C6269a f12377a;

        C44563(C6269a c6269a) {
            this.f12377a = c6269a;
        }

        public final void run() {
            this.f12377a.f17104h.mo3643g();
            this.f12377a.f17101e.setVisibility(8);
        }
    }

    class C44585 implements Runnable {
        final /* synthetic */ C6269a f12380a;

        C44585(C6269a c6269a) {
            this.f12380a = c6269a;
        }

        public final void run() {
            if (this.f12380a.getView() != null) {
                if (this.f12380a.f17100c == null || this.f12380a.f17100c.isEmpty()) {
                    this.f12380a.f17110n.setVisibility(0);
                } else {
                    this.f12380a.f17101e.setVisibility(8);
                    this.f12380a.f17102f.m13673a(this.f12380a.f17100c);
                    this.f12380a.f17110n.setVisibility(8);
                }
            }
        }
    }

    class C44596 implements Runnable {
        final /* synthetic */ C6269a f12381a;

        C44596(C6269a c6269a) {
            this.f12381a = c6269a;
        }

        public final void run() {
            if (this.f12381a.getView() != null) {
                if (this.f12381a.f17100c == null || this.f12381a.f17100c.isEmpty()) {
                    this.f12381a.f17110n.setVisibility(0);
                } else {
                    this.f12381a.f17101e.setVisibility(8);
                    this.f12381a.f17102f.m13673a(this.f12381a.f17100c);
                    this.f12381a.f17110n.setVisibility(8);
                }
            }
        }
    }

    static /* synthetic */ class C44607 {
        static final /* synthetic */ int[] f12382a = new int[C4462b.m8129a().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = mobi.mmdt.ott.view.stickermarket.C4462b.m8129a();
            r0 = r0.length;
            r0 = new int[r0];
            f12382a = r0;
            r0 = 1;
            r1 = f12382a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = mobi.mmdt.ott.view.stickermarket.C4462b.f12383a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r1 = f12382a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = mobi.mmdt.ott.view.stickermarket.C4462b.f12384b;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r3 = 2;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            r1 = f12382a;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = mobi.mmdt.ott.view.stickermarket.C4462b.f12385c;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r3 = 3;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            r1 = f12382a;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r2 = mobi.mmdt.ott.view.stickermarket.C4462b.f12386d;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r3 = 4;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0029 }
        L_0x0029:
            r1 = f12382a;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r2 = mobi.mmdt.ott.view.stickermarket.C4462b.f12387e;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r0 = 5;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0031 }
        L_0x0031:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.stickermarket.a.7.<clinit>():void");
        }
    }

    public interface C6987a {
        void mo3687a(int i, String str, String str2, String str3);

        void mo3688a(String str, String str2);

        void mo3643g();
    }

    class C62661 extends OnScrollListener {
        final /* synthetic */ C6269a f17095a;

        C62661(C6269a c6269a) {
            this.f17095a = c6269a;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.f17095a.f17102f != null) {
                int i2 = 1;
                if (this.f17095a.f17103g.findLastVisibleItemPosition() != this.f17095a.f17102f.getItemCount() - 1) {
                    i2 = 0;
                }
                if (i2 != 0 && !this.f17095a.f17107k && !this.f17095a.f17108l) {
                    this.f17095a.m14641a();
                }
            }
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
        }
    }

    public class C6988b extends C6074f {
        final /* synthetic */ C6269a f19941a;

        public C6988b(C6269a c6269a, Context context) {
            this.f19941a = c6269a;
            super(context);
        }

        public final void mo3181a(C6073e c6073e, int i) {
            C6829g c6829g = (C6829g) this.c.get(i);
            boolean z = true;
            if (c6829g.f19503j == 1) {
                C7393c c7393c = (C7393c) c6829g;
                if (this.f19941a.f17108l || i != this.f19941a.f17100c.size() - 1) {
                    z = false;
                }
                c7393c.f21501f = z;
            }
            super.mo3181a(c6073e, i);
        }

        public final /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
            mo3181a((C6073e) viewHolder, i);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            switch (i) {
                case 1:
                    return new mobi.mmdt.ott.view.stickermarket.p534a.C6988b(this.f19941a.getActivity(), this.f19941a, this.f16246b, viewGroup);
                case 2:
                    return new C6987a(this.f19941a.getActivity(), this.f19941a, this.f16246b, viewGroup);
                default:
                    return null;
            }
        }
    }

    public static C6269a m14632a(int i, String str) {
        C6269a c6269a = new C6269a();
        Bundle bundle = new Bundle();
        bundle.putInt("KEY_LIST_TYPE", i - 1);
        bundle.putString("KEY_EXTRA_STRING", str);
        c6269a.setArguments(bundle);
        return c6269a;
    }

    private void m14634b() {
        C1063i c6658i = new C6658i(this.f17105i, this.f17098a, this.f17099b);
        switch (C44607.f12382a[this.f17105i - 1]) {
            case 1:
            case 2:
            case 3:
                c6658i = new C6658i(this.f17105i, this.f17098a, this.f17099b);
                break;
            case 4:
                c6658i = new C6654e(this.f17105i);
                break;
            case 5:
                c6658i = new C6653d(this.f17105i, this.f17106j, this.f17098a, this.f17099b);
                break;
            default:
                break;
        }
        C2808d.m7147a(c6658i);
    }

    public final void m14641a() {
        if (!this.f17107k) {
            if (this.f17099b == 0) {
                this.f17101e.setVisibility(0);
            }
            this.f17107k = true;
            m14634b();
        }
    }

    public final void mo2234c(int i) {
        C7229a c7229a = (C7229a) this.f17102f.m13671a(i);
        switch (c7229a.f19503j) {
            case 1:
                C7393c c7393c = (C7393c) c7229a;
                this.f17104h.mo3687a(c7393c.f21496a, c7393c.f21497b, c7393c.f21499d, c7393c.f21498c);
                return;
            case 2:
                C7392b c7392b = (C7392b) c7229a;
                this.f17104h.mo3688a(c7392b.f21492a, c7392b.f21493b);
                return;
            default:
                return;
        }
    }

    public final void mo2235d(int i) {
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m14634b();
    }

    public final void onAttach(android.app.Activity r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        super.onAttach(r3);
        r0 = r3;	 Catch:{ ClassCastException -> 0x0009 }
        r0 = (mobi.mmdt.ott.view.stickermarket.C6269a.C6987a) r0;	 Catch:{ ClassCastException -> 0x0009 }
        r2.f17104h = r0;	 Catch:{ ClassCastException -> 0x0009 }
        return;
    L_0x0009:
        r0 = new java.lang.ClassCastException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = r3.toString();
        r1.append(r3);
        r3 = " must implement IStickerMarketListFragmentCallback.";
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.stickermarket.a.onAttach(android.app.Activity):void");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            if (getArguments().containsKey("KEY_LIST_TYPE")) {
                this.f17105i = C4462b.m8129a()[getArguments().getInt("KEY_LIST_TYPE")];
            }
            if (getArguments().containsKey("KEY_EXTRA_STRING")) {
                this.f17106j = getArguments().getString("KEY_EXTRA_STRING");
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_sticker_market_list, viewGroup, false);
    }

    public final void onDestroyView() {
        if (this.f17112p != null) {
            this.f17112p.setItemAnimator(null);
            this.f17112p.setAdapter(null);
            this.f17112p = null;
        }
        this.f17102f = null;
        super.onDestroyView();
    }

    public final void onEvent(C2583a c2583a) {
        if (getActivity() != null) {
            getActivity().runOnUiThread(new C44552(this));
        }
        this.f17107k = false;
    }

    public final void onEvent(C2584b c2584b) {
        if (c2584b.f8433b == this.f17105i) {
            StickerCategory[] stickerCategoryArr = c2584b.f8432a;
            final List arrayList = new ArrayList();
            if (stickerCategoryArr != null) {
                for (int i = 0; i < stickerCategoryArr.length; i++) {
                    StickerCategory stickerCategory = stickerCategoryArr[i];
                    arrayList.add(new C7392b(stickerCategory.getmID(), stickerCategory.getmName(), stickerCategory.getmDescription(), stickerCategory.getmThumbnailAddress(), i));
                }
            }
            if (getActivity() != null) {
                getActivity().runOnUiThread(new Runnable(this) {
                    final /* synthetic */ C6269a f12379b;

                    public final void run() {
                        if (this.f12379b.getView() != null) {
                            if (arrayList == null || arrayList.isEmpty()) {
                                this.f12379b.f17110n.setVisibility(0);
                            } else {
                                this.f12379b.f17101e.setVisibility(8);
                                this.f12379b.f17102f.m13673a(arrayList);
                                this.f12379b.f17110n.setVisibility(8);
                            }
                        }
                    }
                });
            }
            this.f17107k = false;
        }
    }

    public final void onEvent(C2590h c2590h) {
        if (c2590h.f8444b == this.f17105i && c2590h.f8445c.equals(this.f17106j)) {
            StickerCollection[] stickerCollectionArr = c2590h.f8443a;
            if (!(stickerCollectionArr == null || stickerCollectionArr.length == 0)) {
                int size = this.f17100c.size();
                for (int i = 0; i < stickerCollectionArr.length; i++) {
                    StickerCollection stickerCollection = stickerCollectionArr[i];
                    this.f17100c.add(new C7393c(Integer.parseInt(stickerCollection.getmID()), stickerCollection.getmTitle(), stickerCollection.getmPrice(), stickerCollection.getmDownloads(), stickerCollection.getmThumbnail(), size + i));
                }
                if (stickerCollectionArr.length >= 20) {
                    this.f17099b += 20;
                    if (getActivity() != null) {
                        getActivity().runOnUiThread(new C44596(this));
                    }
                    this.f17107k = false;
                }
            }
            this.f17108l = true;
            if (getActivity() != null) {
                getActivity().runOnUiThread(new C44596(this));
            }
            this.f17107k = false;
        }
    }

    public final void onEvent(C2591i c2591i) {
        if (getActivity() != null) {
            getActivity().runOnUiThread(new C44563(this));
        }
        this.f17107k = false;
    }

    public final void onEvent(C2592j c2592j) {
        if (c2592j.f8447b == this.f17105i) {
            StickerCollection[] stickerCollectionArr = c2592j.f8446a;
            if (!(stickerCollectionArr == null || stickerCollectionArr.length == 0)) {
                int size = this.f17100c.size();
                for (int i = 0; i < stickerCollectionArr.length; i++) {
                    StickerCollection stickerCollection = stickerCollectionArr[i];
                    this.f17100c.add(new C7393c(Integer.parseInt(stickerCollection.getmID()), stickerCollection.getmTitle(), stickerCollection.getmPrice(), stickerCollection.getmDownloads(), stickerCollection.getmThumbnail(), size + i));
                }
                if (stickerCollectionArr.length >= 20) {
                    this.f17099b += 20;
                    if (getActivity() != null) {
                        getActivity().runOnUiThread(new C44585(this));
                    }
                    this.f17107k = false;
                }
            }
            this.f17108l = true;
            if (getActivity() != null) {
                getActivity().runOnUiThread(new C44585(this));
            }
            this.f17107k = false;
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f17103g = new LinearLayoutManager(getActivity());
        this.f17112p = (RecyclerView) getView().findViewById(R.id.recycler_view);
        this.f17110n = (LinearLayout) getView().findViewById(R.id.empty_state_linearLayout);
        this.f17109m = (FrameLayout) getView().findViewById(R.id.empty_state_frameLayout_image);
        this.f17111o = (TextView) getView().findViewById(R.id.empty_state_textView);
        this.f17101e = (ProgressWheel) getView().findViewById(R.id.progress_wheel);
        this.f17102f = new C6988b(this, getActivity());
        this.f17101e.setVisibility(0);
        this.f17112p.setHasFixedSize(true);
        this.f17112p.setAdapter(this.f17102f);
        this.f17112p.setLayoutManager(this.f17103g);
        C2491i.m6786a(getActivity(), this.f17109m);
        this.f17112p.addOnScrollListener(new C62661(this));
        C2491i.m6802a(this.f17111o, UIThemeManager.getmInstance().getText_primary_color());
    }
}
