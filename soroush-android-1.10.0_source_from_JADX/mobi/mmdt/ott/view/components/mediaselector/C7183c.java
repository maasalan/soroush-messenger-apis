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

public final class C7183c extends C6830b implements C3128a {
    private RecyclerView f20647a;
    private ImageView ae;
    private C0416a<Cursor> af = new C61071(this);
    private C6861a f20648b;
    private GridLayoutManager f20649c;
    private C3212b f20650d;
    private int f20651e;
    private int f20652f;
    private FrameLayout f20653g;
    private TextView f20654h;
    private LinearLayout f20655i;

    public interface C3212b {
        void mo3656a(String str, String str2);
    }

    class C61071 implements C0416a<Cursor> {
        final /* synthetic */ C7183c f16378a;
        private final String[] f16379b = new String[]{"_data", "_display_name", "datetaken", "_id"};

        C61071(C7183c c7183c) {
            this.f16378a = c7183c;
        }

        public final C0350e<Cursor> mo2226a(int i, Bundle bundle) {
            Context k = this.f16378a.m8911k();
            Uri uri = Media.EXTERNAL_CONTENT_URI;
            String[] strArr = this.f16379b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f16379b[2]);
            stringBuilder.append(" DESC");
            return new C6356d(k, uri, strArr, null, null, stringBuilder.toString());
        }

        public final void mo2227a() {
        }

        public final /* synthetic */ void mo2228a(C0350e c0350e, Object obj) {
            C61071 c61071 = this;
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
                        long j = cursor.getLong(cursor.getColumnIndexOrThrow(c61071.f16379b[2]));
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(c61071.f16379b[0]));
                        File file = new File(string);
                        if (!C2468a.m6708e(file.getAbsolutePath())) {
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
                    if (c61071.f16378a.f20648b != null) {
                        c61071.f16378a.f20648b.m13673a(arrayList);
                        c61071.f16378a.f20655i.setVisibility(8);
                    }
                    return;
                }
            }
            c61071.f16378a.f20655i.setVisibility(0);
        }
    }

    public class C6861a extends C6074f {
        final /* synthetic */ C7183c f19577a;

        public C6861a(C7183c c7183c, Context context) {
            this.f19577a = c7183c;
            super(context);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C6856a(this.f19577a.m8911k(), this.f16246b, viewGroup, this.f19577a.f20651e, this.f19577a.f20652f);
        }
    }

    public final View mo3056a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_main_media_selector, viewGroup, false);
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
        r0 = (mobi.mmdt.ott.view.components.mediaselector.C7183c.C3212b) r0;	 Catch:{ ClassCastException -> 0x0009 }
        r2.f20650d = r0;	 Catch:{ ClassCastException -> 0x0009 }
        return;
    L_0x0009:
        r0 = new java.lang.ClassCastException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = r3.toString();
        r1.append(r3);
        r3 = " must implement OnMediaSelectorPhotoInteractionListener";
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.components.mediaselector.c.a(android.app.Activity):void");
    }

    public final void mo3453a(View view, Bundle bundle) {
        super.mo3453a(view, bundle);
        int a = C2489g.m6754a().m6755a(BallPulseIndicator.SCALE);
        int i = m8912l().getConfiguration().orientation == 1 ? 2 : 4;
        a /= i;
        this.f20651e = a;
        this.f20652f = a;
        this.f20649c = new GridLayoutManager(m8911k(), i);
        this.f20647a = (RecyclerView) this.f13189Q.findViewById(R.id.recycler_view);
        this.f20653g = (FrameLayout) this.f13189Q.findViewById(R.id.empty_state_frameLayout_image);
        this.ae = (ImageView) this.f13189Q.findViewById(R.id.empty_state_icon);
        this.f20654h = (TextView) this.f13189Q.findViewById(R.id.empty_state_textView);
        this.ae.setImageResource(R.drawable.ic_photo_icon);
        this.f20654h.setText(C4522p.m8236a(R.string.empty_state_photos_list));
        this.f20655i = (LinearLayout) this.f13189Q.findViewById(R.id.empty_state_linearLayout);
        this.f20647a.addItemDecoration(new C6105a((int) C2491i.m6804b(m8911k(), 2.0f), i));
        this.f20648b = new C6861a(this, m8911k());
        this.f20647a.addOnItemTouchListener(new C6075j(m8911k(), this.f20647a, this));
        this.f20647a.setHasFixedSize(true);
        this.f20647a.setAdapter(this.f20648b);
        this.f20647a.setLayoutManager(this.f20649c);
        C2491i.m6786a(m8911k(), this.f20653g);
        C2491i.m6802a(this.f20654h, UIThemeManager.getmInstance().getText_primary_color());
    }

    public final void mo2280b(int i) {
    }

    public final void mo2531c(Bundle bundle) {
        super.mo2531c(bundle);
        m8911k().m19190e().mo268a(38, null, this.af);
    }

    public final void c_(int i) {
        C7331b c7331b = (C7331b) this.f20648b.m13671a(i);
        this.f20650d.mo3656a(c7331b.f21129b, c7331b.f21128a);
    }

    public final void mo2536h() {
        if (this.f20647a != null) {
            this.f20647a.setItemAnimator(null);
            this.f20647a.setAdapter(null);
            this.f20647a = null;
        }
        this.f20648b = null;
        super.mo2536h();
    }
}
