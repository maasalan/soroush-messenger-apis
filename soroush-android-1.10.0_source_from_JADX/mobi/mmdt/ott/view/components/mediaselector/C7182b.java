package mobi.mmdt.ott.view.components.mediaselector;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore.Images.Media;
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
import mobi.mmdt.ott.view.components.p401c.C6074f;
import mobi.mmdt.ott.view.components.p401c.C6075j;
import mobi.mmdt.ott.view.components.p401c.C6075j.C3128a;
import mobi.mmdt.ott.view.components.p405e.C6830b;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C7182b extends C6830b implements C3128a {
    private RecyclerView f20638a;
    private ImageView ae;
    private View af;
    private C0416a<Cursor> ag = new C61061(this);
    private C7181a f20639b;
    private GridLayoutManager f20640c;
    private C7331b f20641d;
    private int f20642e;
    private int f20643f;
    private FrameLayout f20644g;
    private TextView f20645h;
    private LinearLayout f20646i;

    public interface C7331b {
        void mo3658c(String str, String str2);
    }

    class C61061 implements C0416a<Cursor> {
        final /* synthetic */ C7182b f16376a;
        private final String[] f16377b = new String[]{"_data", "_display_name", "datetaken", "_id"};

        C61061(C7182b c7182b) {
            this.f16376a = c7182b;
        }

        public final C0350e<Cursor> mo2226a(int i, Bundle bundle) {
            Context k = this.f16376a.m8911k();
            Uri uri = Media.EXTERNAL_CONTENT_URI;
            String[] strArr = this.f16377b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f16377b[2]);
            stringBuilder.append(" DESC");
            return new C6356d(k, uri, strArr, null, null, stringBuilder.toString());
        }

        public final void mo2227a() {
        }

        public final /* synthetic */ void mo2228a(C0350e c0350e, Object obj) {
            LinearLayout b;
            C61061 c61061 = this;
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
                        long j = cursor.getLong(cursor.getColumnIndexOrThrow(c61061.f16377b[2]));
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(c61061.f16377b[0]));
                        File file = new File(string);
                        if (C2468a.m6708e(file.getAbsolutePath())) {
                            file = file.getParentFile();
                            String absolutePath = file.getAbsolutePath();
                            if (hashMap.containsKey(absolutePath)) {
                                c3214e = (C3214e) hashMap.get(absolutePath);
                                c3214e.f9945d++;
                            } else {
                                C3214e c3214e2 = new C3214e();
                                c3214e2.f9945d = 1;
                                c3214e2.f9942a = file.getName();
                                c3214e2.f9943b = absolutePath;
                                c3214e2.f9944c = string;
                                c3214e2.f9946e = j;
                                hashMap.put(absolutePath, c3214e2);
                            }
                        }
                    } while (cursor.moveToNext());
                    for (Entry value : hashMap.entrySet()) {
                        c3214e = (C3214e) value.getValue();
                        arrayList.add(new C7331b(i, c3214e.f9942a, c3214e.f9943b, c3214e.f9944c, C2491i.m6764a(c3214e.f9945d), c3214e.f9946e));
                        i++;
                    }
                    Collections.sort(arrayList);
                    c61061.f16376a.f20639b.m13673a(arrayList);
                    b = c61061.f16376a.f20646i;
                    i = 8;
                    b.setVisibility(i);
                }
            }
            b = c61061.f16376a.f20646i;
            b.setVisibility(i);
        }
    }

    public class C7181a extends C6074f {
        final /* synthetic */ C7182b f19576a;

        public C7181a(C7182b c7182b, Context context) {
            this.f19576a = c7182b;
            super(context);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C6856a(this.f19576a.m8911k(), this.f16246b, viewGroup, this.f19576a.f20642e, this.f19576a.f20643f);
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
        r0 = (mobi.mmdt.ott.view.components.mediaselector.C7182b.C7331b) r0;	 Catch:{ ClassCastException -> 0x0009 }
        r2.f20641d = r0;	 Catch:{ ClassCastException -> 0x0009 }
        return;
    L_0x0009:
        r0 = new java.lang.ClassCastException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = r3.toString();
        r1.append(r3);
        r3 = " must implement OnMediaSelectorGifInteractionListener";
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.components.mediaselector.b.a(android.app.Activity):void");
    }

    public final void mo3453a(View view, Bundle bundle) {
        super.mo3453a(view, bundle);
        int a = C2489g.m6754a().m6755a(BallPulseIndicator.SCALE);
        int i = m8912l().getConfiguration().orientation == 1 ? 2 : 4;
        a /= i;
        this.f20642e = a;
        this.f20643f = a;
        this.f20640c = new GridLayoutManager(m8911k(), i);
        this.f20638a = (RecyclerView) this.af.findViewById(R.id.recycler_view);
        this.ae = (ImageView) this.af.findViewById(R.id.empty_state_icon);
        this.f20646i = (LinearLayout) this.af.findViewById(R.id.empty_state_linearLayout);
        this.f20644g = (FrameLayout) this.af.findViewById(R.id.empty_state_frameLayout_image);
        this.f20645h = (TextView) this.af.findViewById(R.id.empty_state_textView);
        this.ae.setImageResource(R.drawable.ic_video_icon);
        this.f20645h.setText(C4522p.m8236a(R.string.empty_state_gifs_list));
        this.f20638a.addItemDecoration(new C6105a((int) C2491i.m6804b(m8911k(), 2.0f), i));
        this.f20639b = new C7181a(this, m8911k());
        this.f20638a.addOnItemTouchListener(new C6075j(m8911k(), this.f20638a, this));
        this.f20638a.setHasFixedSize(true);
        this.f20638a.setAdapter(this.f20639b);
        this.f20638a.setLayoutManager(this.f20640c);
        C2491i.m6786a(m8911k(), this.f20644g);
        C2491i.m6802a(this.f20645h, UIThemeManager.getmInstance().getText_primary_color());
    }

    public final void mo2280b(int i) {
    }

    public final void mo2531c(Bundle bundle) {
        super.mo2531c(bundle);
        m8911k().m19190e().mo268a(39, null, this.ag);
    }

    public final void c_(int i) {
        C7331b c7331b = (C7331b) this.f20639b.m13671a(i);
        this.f20641d.mo3658c(c7331b.f21129b, c7331b.f21128a);
    }

    public final void mo2536h() {
        if (this.f20638a != null) {
            this.f20638a.setItemAnimator(null);
            this.f20638a.setAdapter(null);
            this.f20638a = null;
        }
        this.f20639b = null;
        super.mo2536h();
    }
}
