package mobi.mmdt.ott.view.components.mediaselector.photoselection;

import android.app.LoaderManager.LoaderCallbacks;
import android.content.Context;
import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore.Images.Media;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.mediaselector.C6105a;
import mobi.mmdt.ott.view.components.mediaselector.p413a.C6858c;
import mobi.mmdt.ott.view.components.mediaselector.p567b.C7332d;
import mobi.mmdt.ott.view.components.mediaselector.p567b.C7423c;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6074f;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.components.p405e.C3150a;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C6110b extends C3150a implements C3126i, C3218a {
    C6864a f16396a;
    GridLayoutManager f16397b;
    boolean f16398c;
    private RecyclerView f16399e;
    private C3220b f16400f;
    private int f16401g;
    private int f16402h;
    private String f16403i;
    private String f16404j;
    private int f16405k = 0;
    private int f16406l = 2;
    private int f16407m = 10;
    private LoaderCallbacks<Cursor> f16408n = new C32191(this);

    class C32191 implements LoaderCallbacks<Cursor> {
        final /* synthetic */ C6110b f9950a;
        private final String[] f9951b = new String[]{"_data", "_display_name", "datetaken", "_id"};

        C32191(C6110b c6110b) {
            this.f9950a = c6110b;
        }

        public final Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
            Context activity = this.f9950a.getActivity();
            Uri uri = Media.EXTERNAL_CONTENT_URI;
            String[] strArr = this.f9951b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f9951b[0]);
            stringBuilder.append(" like '");
            stringBuilder.append(this.f9950a.f16403i);
            stringBuilder.append("%' AND lower(");
            stringBuilder.append(this.f9951b[0]);
            stringBuilder.append(") NOT LIKE '%.gif'");
            String stringBuilder2 = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.f9951b[2]);
            stringBuilder.append(" DESC");
            return new CursorLoader(activity, uri, strArr, stringBuilder2, null, stringBuilder.toString());
        }

        public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
            Cursor cursor = (Cursor) obj;
            if (cursor != null) {
                List arrayList = new ArrayList();
                if (cursor.getCount() > 0 && cursor.moveToFirst()) {
                    int i = 0;
                    do {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f9951b[0]));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f9951b[1]));
                        long j = cursor.getLong(cursor.getColumnIndexOrThrow(this.f9951b[2]));
                        boolean z = this.f9950a.m13836d().containsKey(string) && ((Boolean) this.f9950a.m13836d().get(string)).booleanValue();
                        arrayList.add(new C7332d(i, string2, string, string, j, z));
                        i++;
                    } while (cursor.moveToNext());
                    this.f9950a.f16396a.m13673a(arrayList);
                }
            }
        }

        public final void onLoaderReset(Loader<Cursor> loader) {
        }
    }

    public interface C3220b {
        void mo3660a(String str);

        void mo3643g();
    }

    public class C6864a extends C6074f {
        final /* synthetic */ C6110b f19580a;

        public C6864a(C6110b c6110b, Context context) {
            this.f19580a = c6110b;
            super(context);
        }

        public final void mo3181a(C6073e c6073e, int i) {
            C7332d c7332d;
            C6829g c6829g = (C6829g) this.c.get(i);
            if (c6073e.getItemViewType() == 2) {
                c7332d = (C7332d) c6829g;
            } else {
                if (c6073e.getItemViewType() == 4) {
                    C7423c c7423c = (C7423c) c6829g;
                }
                super.mo3181a(c6073e, i);
            }
            c7332d.f21135c = this.f19580a.m13836d().containsKey(c7332d.f21133a);
            super.mo3181a(c6073e, i);
        }

        public final /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
            mo3181a((C6073e) viewHolder, i);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i != 2) {
                return null;
            }
            return new C6858c(this.f19580a.getActivity(), this.f19580a, this.f16246b, viewGroup, this.f19580a.f16401g, this.f19580a.f16402h, this.f19580a);
        }
    }

    private void m13834c(C7332d c7332d) {
        c7332d.f21135c = true;
        if (this.f16407m != -1) {
            if (m13836d().size() >= this.f16407m) {
                c7332d.f21135c = false;
                Context activity = getActivity();
                StringBuilder stringBuilder = new StringBuilder("Can not share more than ");
                stringBuilder.append(this.f16407m);
                stringBuilder.append(" photos!");
                Toast.makeText(activity, stringBuilder.toString(), 0).show();
                m13841b();
                this.f16400f.mo3643g();
                this.f16396a.notifyDataSetChanged();
            }
        }
        if (!m13836d().containsKey(c7332d.f21133a)) {
            m13836d().put(c7332d.f21133a, Boolean.valueOf(true));
        }
        m13841b();
        this.f16400f.mo3643g();
        this.f16396a.notifyDataSetChanged();
    }

    private LinkedHashMap<String, Boolean> m13836d() {
        return ((MyApplication) getActivity().getApplication()).f15913s;
    }

    private void m13837d(C7332d c7332d) {
        c7332d.f21135c = false;
        if (m13836d().size() > 0 && m13836d().containsKey(c7332d.f21133a)) {
            m13836d().remove(c7332d.f21133a);
        }
        this.f16400f.mo3643g();
        this.f16396a.notifyDataSetChanged();
    }

    public final void mo2283a(C7332d c7332d) {
        m13834c(c7332d);
    }

    public final boolean mo2284a() {
        return this.f16398c;
    }

    public final void m13841b() {
        if (!this.f16398c) {
            this.f16398c = true;
            if (this.f16396a != null) {
                this.f16396a.notifyDataSetChanged();
            }
        }
    }

    public final void mo2285b(C7332d c7332d) {
        m13837d(c7332d);
    }

    public final void mo2234c(int i) {
        C7332d c7332d = (C7332d) this.f16396a.m13671a(i);
        if (this.f16406l != 1) {
            if (this.f16406l != 3) {
                if (this.f16406l == 2) {
                    this.f16400f.mo3660a(c7332d.f21133a);
                }
                return;
            }
        }
        if (!this.f16398c) {
            this.f16400f.mo3660a(c7332d.f21133a);
        } else if (c7332d.f21135c) {
            m13837d(c7332d);
        } else {
            m13834c(c7332d);
        }
    }

    public final void mo2235d(int i) {
        if (this.f16406l == 1) {
            C7332d c7332d = (C7332d) this.f16396a.m13671a(i);
            if (c7332d.f21135c) {
                m13837d(c7332d);
                return;
            }
            m13834c(c7332d);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getActivity().getLoaderManager().initLoader(20, null, this.f16408n);
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
        r0 = (mobi.mmdt.ott.view.components.mediaselector.photoselection.C6110b.C3220b) r0;	 Catch:{ ClassCastException -> 0x0009 }
        r2.f16400f = r0;	 Catch:{ ClassCastException -> 0x0009 }
        return;
    L_0x0009:
        r0 = new java.lang.ClassCastException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = r3.toString();
        r1.append(r3);
        r3 = " must implement OnPhotoSelectorFragmentInteractionListener";
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.components.mediaselector.photoselection.b.onAttach(android.app.Activity):void");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            if (getArguments().containsKey("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION")) {
                this.f16405k = getArguments().getInt("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION");
            }
            if (getArguments().containsKey("EXTRA_MAX_PHOTO_SELECT_COUNT")) {
                this.f16407m = getArguments().getInt("EXTRA_MAX_PHOTO_SELECT_COUNT");
            }
            if (getArguments().containsKey("EXTRA_SELECT_MODE")) {
                this.f16406l = getArguments().getInt("EXTRA_SELECT_MODE");
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_media_photo_selector, viewGroup, false);
    }

    public final void onDestroyView() {
        if (this.f16399e != null) {
            this.f16399e.setItemAnimator(null);
            this.f16399e.setAdapter(null);
            this.f16399e = null;
        }
        this.f16396a = null;
        super.onDestroyView();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (m13836d().size() > 0) {
            this.f16398c = true;
        }
        this.f16403i = getArguments().getString("KEY_FOLDER_PATH");
        this.f16404j = getArguments().getString("KEY_FOLDER_NAME");
        int a = C2489g.m6754a().m6755a(BallPulseIndicator.SCALE);
        int i = getResources().getConfiguration().orientation == 1 ? 3 : 5;
        a /= i;
        this.f16401g = a;
        this.f16402h = a;
        this.f16397b = new GridLayoutManager(getActivity(), i);
        this.f16399e = (RecyclerView) getView().findViewById(R.id.recycler_view);
        this.f16399e.addItemDecoration(new C6105a((int) C2491i.m6804b(getActivity(), 2.0f), i));
        this.f16396a = new C6864a(this, getActivity());
        this.f16399e.setHasFixedSize(true);
        this.f16399e.setAdapter(this.f16396a);
        this.f16399e.setLayoutManager(this.f16397b);
        this.f16399e.scrollToPosition(this.f16405k);
    }
}
