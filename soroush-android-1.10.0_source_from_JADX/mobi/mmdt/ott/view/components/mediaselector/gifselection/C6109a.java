package mobi.mmdt.ott.view.components.mediaselector.gifselection;

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
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import mobi.mmdt.componentsutils.C2468a;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.mediaselector.C6105a;
import mobi.mmdt.ott.view.components.mediaselector.p413a.C6857b;
import mobi.mmdt.ott.view.components.mediaselector.p567b.C7423c;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6074f;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.components.p405e.C3150a;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C6109a extends C3150a implements C3126i {
    GridLayoutManager f16382a;
    private RecyclerView f16383b;
    private C6863a f16384c;
    private C3216b f16385e;
    private int f16386f;
    private int f16387g;
    private String f16388h;
    private String f16389i;
    private View f16390j;
    private boolean f16391k;
    private int f16392l = 0;
    private int f16393m = 2;
    private int f16394n = 10;
    private LoaderCallbacks<Cursor> f16395o = new C32151(this);

    class C32151 implements LoaderCallbacks<Cursor> {
        final /* synthetic */ C6109a f9947a;
        private final String[] f9948b = new String[]{"_data", "_display_name", "datetaken", "_id"};

        C32151(C6109a c6109a) {
            this.f9947a = c6109a;
        }

        public final Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
            Context activity = this.f9947a.getActivity();
            Uri uri = Media.EXTERNAL_CONTENT_URI;
            String[] strArr = this.f9948b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f9948b[0]);
            stringBuilder.append(" like '%");
            stringBuilder.append(this.f9947a.f16388h);
            stringBuilder.append("%'");
            String stringBuilder2 = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.f9948b[2]);
            stringBuilder.append(" DESC");
            return new CursorLoader(activity, uri, strArr, stringBuilder2, null, stringBuilder.toString());
        }

        public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
            Cursor cursor = (Cursor) obj;
            if (cursor != null) {
                int count = cursor.getCount();
                List arrayList = new ArrayList();
                if (count > 0) {
                    cursor.moveToFirst();
                    int i = 0;
                    do {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f9948b[0]));
                        File file = new File(string);
                        if (file.getParentFile().getAbsolutePath().equals(this.f9947a.f16388h)) {
                            String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f9948b[1]));
                            long j = cursor.getLong(cursor.getColumnIndexOrThrow(this.f9948b[2]));
                            boolean z = this.f9947a.m13824a().containsKey(string) && ((Boolean) this.f9947a.m13824a().get(string)).booleanValue();
                            if (C2468a.m6708e(file.getPath())) {
                                int i2 = i + 1;
                                arrayList.add(new C7423c(i, string2, string, string, j, z));
                                i = i2;
                            }
                        }
                    } while (cursor.moveToNext());
                    this.f9947a.f16384c.m13673a(arrayList);
                }
            }
        }

        public final void onLoaderReset(Loader<Cursor> loader) {
        }
    }

    public interface C3216b {
        void mo3659a(String str);
    }

    public class C6863a extends C6074f {
        final /* synthetic */ C6109a f19579a;

        public C6863a(C6109a c6109a, Context context) {
            this.f19579a = c6109a;
            super(context);
        }

        public final void mo3181a(C6073e c6073e, int i) {
            C6829g c6829g = (C6829g) this.c.get(i);
            if (c6073e.getItemViewType() == 4) {
                C7423c c7423c = (C7423c) c6829g;
                c7423c.f21135c = this.f19579a.m13824a().containsKey(c7423c.f21133a);
            }
            super.mo3181a(c6073e, i);
        }

        public final /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
            mo3181a((C6073e) viewHolder, i);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i != 4) {
                return null;
            }
            return new C6857b(this.f19579a.getActivity(), this.f19579a, this.f16246b, viewGroup, this.f19579a.f16386f, this.f19579a.f16387g);
        }
    }

    private LinkedHashMap<String, Boolean> m13824a() {
        return ((MyApplication) getActivity().getApplication()).f15913s;
    }

    public final void mo2234c(int i) {
        this.f16385e.mo3659a(((C7423c) this.f16384c.m13671a(i)).f21133a);
    }

    public final void mo2235d(int i) {
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getActivity().getLoaderManager().initLoader(40, null, this.f16395o);
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
        r0 = (mobi.mmdt.ott.view.components.mediaselector.gifselection.C6109a.C3216b) r0;	 Catch:{ ClassCastException -> 0x0009 }
        r2.f16385e = r0;	 Catch:{ ClassCastException -> 0x0009 }
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
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.components.mediaselector.gifselection.a.onAttach(android.app.Activity):void");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            if (getArguments().containsKey("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION")) {
                this.f16392l = getArguments().getInt("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION");
            }
            if (getArguments().containsKey("EXTRA_MAX_PHOTO_SELECT_COUNT")) {
                this.f16394n = getArguments().getInt("EXTRA_MAX_PHOTO_SELECT_COUNT");
            }
            if (getArguments().containsKey("EXTRA_SELECT_MODE")) {
                this.f16393m = getArguments().getInt("EXTRA_SELECT_MODE");
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f16390j = layoutInflater.inflate(R.layout.fragment_media_photo_selector, viewGroup, false);
        return this.f16390j;
    }

    public final void onDestroyView() {
        if (this.f16383b != null) {
            this.f16383b.setItemAnimator(null);
            this.f16383b.setAdapter(null);
            this.f16383b = null;
        }
        this.f16384c = null;
        super.onDestroyView();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (m13824a().size() > 0) {
            this.f16391k = true;
        }
        this.f16388h = getArguments().getString("KEY_FOLDER_PATH");
        this.f16389i = getArguments().getString("KEY_FOLDER_NAME");
        int a = C2489g.m6754a().m6755a(BallPulseIndicator.SCALE);
        int b = C2489g.m6754a().m6756b(BallPulseIndicator.SCALE);
        int i = 5;
        if (getResources().getConfiguration().orientation == 1) {
            a /= 3;
            this.f16386f = a;
            this.f16387g = a;
            i = 3;
        } else {
            b /= 5;
            this.f16386f = b;
            this.f16387g = b;
        }
        this.f16382a = new GridLayoutManager(getActivity(), i);
        this.f16383b = (RecyclerView) this.f16390j.findViewById(R.id.recycler_view);
        this.f16383b.addItemDecoration(new C6105a((int) C2491i.m6804b(getActivity(), 2.0f), i));
        this.f16384c = new C6863a(this, getActivity());
        this.f16383b.setHasFixedSize(true);
        this.f16383b.setAdapter(this.f16384c);
        this.f16383b.setLayoutManager(this.f16382a);
        this.f16383b.scrollToPosition(this.f16392l);
    }
}
