package mobi.mmdt.ott.view.components.audioselector;

import android.app.LoaderManager.LoaderCallbacks;
import android.content.Context;
import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore.Audio.Media;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.audioselector.p596b.C7323a;
import mobi.mmdt.ott.view.components.fileselector.p565b.C7178a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6074f;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.components.p405e.C3150a;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6059a extends C3150a implements LoaderCallbacks<Cursor>, C3107b, C3126i {
    C6825a f16213a;
    LinearLayoutManager f16214b;
    boolean f16215c;
    private RecyclerView f16216e;
    private C3105b f16217f;
    private LinearLayout f16218g;
    private View f16219h;
    private FrameLayout f16220i;
    private int f16221j = 10;
    private int f16222k = 1;
    private int f16223l = 0;
    private TextView f16224m;
    private final String[] f16225n = new String[]{"_data", "_display_name", "date_added", "album", "duration", "_id"};

    public interface C3105b {
        void mo3649a(String str);

        void mo3643g();
    }

    public class C6825a extends C6074f {
        final /* synthetic */ C6059a f19489a;

        public C6825a(C6059a c6059a, Context context) {
            this.f19489a = c6059a;
            super(context);
        }

        public final void mo3181a(C6073e c6073e, int i) {
            C7323a c7323a = (C7323a) ((C6829g) this.c.get(i));
            c7323a.f21095e = this.f19489a.m13641d().containsKey(c7323a.f21093c);
            super.mo3181a(c6073e, i);
        }

        public final /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
            mo3181a((C6073e) viewHolder, i);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new mobi.mmdt.ott.view.components.audioselector.p399a.C6825a(this.f19489a.getActivity(), this.f19489a, this.f16246b, viewGroup, this.f19489a);
        }
    }

    private void m13639a(C7323a c7323a) {
        c7323a.f21095e = false;
        if (m13641d().size() > 0 && m13641d().containsKey(c7323a.f21093c)) {
            m13641d().remove(c7323a.f21093c);
        }
        this.f16217f.mo3643g();
        this.f16213a.notifyDataSetChanged();
    }

    private void m13640b(C7323a c7323a) {
        c7323a.f21095e = true;
        if (m13641d().size() >= this.f16221j) {
            c7323a.f21095e = false;
            Toast.makeText(getActivity(), String.format(C4522p.m8236a(R.string.format_string_can_not_share_more_than_for_audio), new Object[]{Integer.valueOf(this.f16221j)}), 0).show();
        } else if (!m13641d().containsKey(c7323a.f21093c)) {
            m13641d().put(c7323a.f21093c, Boolean.valueOf(true));
        }
        m13642a();
        this.f16217f.mo3643g();
        this.f16213a.notifyDataSetChanged();
    }

    private LinkedHashMap<String, Boolean> m13641d() {
        return ((MyApplication) getActivity().getApplication()).f15914t;
    }

    public final void m13642a() {
        if (!this.f16215c) {
            this.f16215c = true;
            if (this.f16213a != null) {
                this.f16213a.notifyDataSetChanged();
            }
        }
    }

    public final boolean mo2233b() {
        return this.f16215c;
    }

    public final void mo2234c(int i) {
        C7323a c7323a = (C7323a) ((C7178a) this.f16213a.m13671a(i));
        if (this.f16222k != 1) {
            if (this.f16222k == 2) {
                this.f16217f.mo3649a(c7323a.f21093c);
            }
        } else if (!this.f16215c) {
            this.f16217f.mo3649a(c7323a.f21093c);
        } else if (c7323a.f21095e) {
            m13639a(c7323a);
        } else {
            m13640b(c7323a);
        }
    }

    public final void mo2235d(int i) {
        if (this.f16222k == 1) {
            C7178a c7178a = (C7178a) this.f16213a.m13671a(i);
            if (c7178a.f19503j == 1) {
                C7323a c7323a = (C7323a) c7178a;
                if (c7323a.f21095e) {
                    m13639a(c7323a);
                    return;
                }
                m13640b(c7323a);
            }
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getLoaderManager().initLoader(19, null, this);
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
        r0 = (mobi.mmdt.ott.view.components.audioselector.C6059a.C3105b) r0;	 Catch:{ ClassCastException -> 0x0009 }
        r2.f16217f = r0;	 Catch:{ ClassCastException -> 0x0009 }
        return;
    L_0x0009:
        r0 = new java.lang.ClassCastException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = r3.toString();
        r1.append(r3);
        r3 = " must implement OnAudioSelectorInteractionListener";
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.components.audioselector.a.onAttach(android.app.Activity):void");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            if (getArguments().containsKey("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION")) {
                this.f16223l = getArguments().getInt("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION");
            }
            if (getArguments().containsKey("EXTRA_MAX_PHOTO_SELECT_COUNT")) {
                this.f16221j = getArguments().getInt("EXTRA_MAX_PHOTO_SELECT_COUNT");
            }
            if (getArguments().containsKey("EXTRA_SELECT_MODE")) {
                this.f16222k = getArguments().getInt("EXTRA_SELECT_MODE");
            }
        }
    }

    public final Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        Context activity = getActivity();
        Uri uri = Media.EXTERNAL_CONTENT_URI;
        String[] strArr = this.f16225n;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f16225n[1]);
        stringBuilder.append(" ASC");
        return new CursorLoader(activity, uri, strArr, null, null, stringBuilder.toString());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f16219h = layoutInflater.inflate(R.layout.fragment_audio_selector, viewGroup, false);
        return this.f16219h;
    }

    public final void onDestroyView() {
        if (this.f16216e != null) {
            this.f16216e.setItemAnimator(null);
            this.f16216e.setAdapter(null);
            this.f16216e = null;
        }
        this.f16213a = null;
        super.onDestroyView();
    }

    public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor != null) {
            List arrayList = new ArrayList();
            if (cursor.getCount() > 0 && cursor.moveToFirst()) {
                int i = 0;
                do {
                    String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f16225n[0]));
                    String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f16225n[1]));
                    String string3 = cursor.getString(cursor.getColumnIndexOrThrow(this.f16225n[3]));
                    int i2 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f16225n[4]));
                    boolean z = m13641d().containsKey(string) && ((Boolean) m13641d().get(string)).booleanValue();
                    arrayList.add(new C7323a(string2, string, string3, i2, z, i));
                    i++;
                } while (cursor.moveToNext());
                this.f16213a.m13673a(arrayList);
            }
            return;
        }
        this.f16218g.setVisibility(0);
    }

    public final void onLoaderReset(Loader<Cursor> loader) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (m13641d().size() > 0) {
            this.f16215c = true;
        }
        this.f16214b = new LinearLayoutManager(getActivity());
        this.f16216e = (RecyclerView) this.f16219h.findViewById(R.id.recycler_view);
        this.f16218g = (LinearLayout) this.f16219h.findViewById(R.id.empty_state_linearLayout);
        this.f16220i = (FrameLayout) this.f16219h.findViewById(R.id.empty_state_frameLayout_image);
        this.f16224m = (TextView) this.f16219h.findViewById(R.id.empty_state_textView);
        this.f16213a = new C6825a(this, getActivity());
        this.f16216e.setHasFixedSize(true);
        this.f16216e.setAdapter(this.f16213a);
        this.f16216e.setLayoutManager(this.f16214b);
        this.f16216e.scrollToPosition(this.f16223l);
        C2491i.m6786a(getActivity(), this.f16220i);
        C2491i.m6802a(this.f16224m, UIThemeManager.getmInstance().getText_primary_color());
    }
}
