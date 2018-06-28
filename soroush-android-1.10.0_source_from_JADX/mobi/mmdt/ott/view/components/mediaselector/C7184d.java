package mobi.mmdt.ott.view.components.mediaselector;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore.Video.Media;
import android.support.v4.app.C0417s.C0416a;
import android.support.v4.p029a.C0350e;
import android.support.v4.p029a.C6356d;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import mobi.mmdt.componentsutils.C2468a;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.mediaselector.p413a.C6856a;
import mobi.mmdt.ott.view.components.mediaselector.p567b.C7331b;
import mobi.mmdt.ott.view.components.mediaselector.videoselection.VideoSelectorActivity;
import mobi.mmdt.ott.view.components.p401c.C6074f;
import mobi.mmdt.ott.view.components.p401c.C6075j;
import mobi.mmdt.ott.view.components.p401c.C6075j.C3128a;
import mobi.mmdt.ott.view.components.p405e.C6830b;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C7184d extends C6830b implements C3128a {
    private RecyclerView f20656a;
    private ImageView ae;
    private View af;
    private C0416a<Cursor> ag = new C61081(this);
    private C6862a f20657b;
    private GridLayoutManager f20658c;
    private C3213b f20659d;
    private int f20660e;
    private int f20661f;
    private FrameLayout f20662g;
    private TextView f20663h;
    private LinearLayout f20664i;

    public interface C3213b {
        void mo3657b(String str, String str2);
    }

    class C61081 implements C0416a<Cursor> {
        final /* synthetic */ C7184d f16380a;
        private final String[] f16381b = new String[]{"_data", "_display_name", "datetaken", "_id"};

        C61081(C7184d c7184d) {
            this.f16380a = c7184d;
        }

        public final C0350e<Cursor> mo2226a(int i, Bundle bundle) {
            Context k = this.f16380a.m8911k();
            Uri uri = Media.EXTERNAL_CONTENT_URI;
            String[] strArr = this.f16381b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f16381b[2]);
            stringBuilder.append(" DESC");
            return new C6356d(k, uri, strArr, null, null, stringBuilder.toString());
        }

        public final void mo2227a() {
        }

        public final /* synthetic */ void mo2228a(C0350e c0350e, Object obj) {
            LinearLayout b;
            C61081 c61081 = this;
            Cursor cursor = (Cursor) obj;
            int i = 0;
            if (cursor != null) {
                int count = cursor.getCount();
                List arrayList = new ArrayList();
                HashMap hashMap = new HashMap();
                if (count > 0) {
                    C3214e c3214e;
                    cursor.moveToFirst();
                    do {
                        long j = cursor.getLong(cursor.getColumnIndexOrThrow(c61081.f16381b[2]));
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(c61081.f16381b[0]));
                        File parentFile = new File(string).getParentFile();
                        String absolutePath = parentFile.getAbsolutePath();
                        if (!C2468a.m6711h(string).equalsIgnoreCase(VideoSelectorActivity.f24035m)) {
                            if (hashMap.containsKey(absolutePath)) {
                                c3214e = (C3214e) hashMap.get(absolutePath);
                                c3214e.f9945d++;
                            } else {
                                C3214e c3214e2 = new C3214e();
                                c3214e2.f9945d = 1;
                                c3214e2.f9942a = parentFile.getName();
                                c3214e2.f9943b = absolutePath;
                                c3214e2.f9944c = string;
                                c3214e2.f9946e = j;
                                hashMap.put(absolutePath, c3214e2);
                            }
                        }
                    } while (cursor.moveToNext());
                    for (Entry value : hashMap.entrySet()) {
                        c3214e = (C3214e) value.getValue();
                        int i2 = i;
                        arrayList.add(new C7331b(i2, c3214e.f9942a, c3214e.f9943b, c3214e.f9944c, C2491i.m6764a(c3214e.f9945d), c3214e.f9946e));
                        i++;
                    }
                    Collections.sort(arrayList);
                    c61081.f16380a.f20657b.m13673a(arrayList);
                    b = c61081.f16380a.f20664i;
                    i = 8;
                    b.setVisibility(i);
                }
            }
            b = c61081.f16380a.f20664i;
            b.setVisibility(i);
        }
    }

    public class C6862a extends C6074f {
        final /* synthetic */ C7184d f19578a;

        public C6862a(C7184d c7184d, Context context) {
            this.f19578a = c7184d;
            super(context);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C6856a(this.f19578a.m8911k(), this.f16246b, viewGroup, this.f19578a.f20660e, this.f19578a.f20661f);
        }
    }

    public final View mo3056a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.af = layoutInflater.inflate(R.layout.fragment_main_media_selector, viewGroup, false);
        return this.af;
    }

    public final void mo3057a(android.app.Activity r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        super.mo3057a(r3);
        r0 = r3;	 Catch:{ ClassCastException -> 0x0009 }
        r0 = (mobi.mmdt.ott.view.components.mediaselector.C7184d.C3213b) r0;	 Catch:{ ClassCastException -> 0x0009 }
        r2.f20659d = r0;	 Catch:{ ClassCastException -> 0x0009 }
        return;
    L_0x0009:
        r0 = new java.lang.ClassCastException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = r3.toString();
        r1.append(r3);
        r3 = " must implement OnMediaSelectorVideoInteractionListener";
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.components.mediaselector.d.a(android.app.Activity):void");
    }

    public final void mo3453a(View view, Bundle bundle) {
        super.mo3453a(view, bundle);
        int a = C2489g.m6754a().m6755a(BallPulseIndicator.SCALE);
        int i = m8912l().getConfiguration().orientation == 1 ? 2 : 4;
        a /= i;
        this.f20660e = a;
        this.f20661f = a;
        this.f20658c = new GridLayoutManager(m8911k(), i);
        this.f20656a = (RecyclerView) this.af.findViewById(R.id.recycler_view);
        this.ae = (ImageView) this.af.findViewById(R.id.empty_state_icon);
        this.f20664i = (LinearLayout) this.af.findViewById(R.id.empty_state_linearLayout);
        this.f20662g = (FrameLayout) this.af.findViewById(R.id.empty_state_frameLayout_image);
        this.f20663h = (TextView) this.af.findViewById(R.id.empty_state_textView);
        this.ae.setImageResource(R.drawable.ic_video_icon);
        this.f20663h.setText(C4522p.m8236a(R.string.empty_state_videos_list));
        this.f20656a.addItemDecoration(new C6105a((int) C2491i.m6804b(m8911k(), 2.0f), i));
        this.f20657b = new C6862a(this, m8911k());
        this.f20656a.addOnItemTouchListener(new C6075j(m8911k(), this.f20656a, this));
        this.f20656a.setHasFixedSize(true);
        this.f20656a.setAdapter(this.f20657b);
        this.f20656a.setLayoutManager(this.f20658c);
        C2491i.m6786a(m8911k(), this.f20662g);
        C2491i.m6802a(this.f20663h, UIThemeManager.getmInstance().getText_primary_color());
    }

    public final void mo2280b(int i) {
    }

    public final void mo2531c(Bundle bundle) {
        super.mo2531c(bundle);
        m8911k().m19190e().mo268a(37, null, this.ag);
    }

    public final void c_(int i) {
        C7331b c7331b = (C7331b) this.f20657b.m13671a(i);
        this.f20659d.mo3657b(c7331b.f21129b, c7331b.f21128a);
    }

    public final void mo2536h() {
        if (this.f20656a != null) {
            this.f20656a.setItemAnimator(null);
            this.f20656a.setAdapter(null);
            this.f20656a = null;
        }
        this.f20657b = null;
        super.mo2536h();
    }
}
