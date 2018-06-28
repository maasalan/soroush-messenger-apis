package mobi.mmdt.ott.view.components.mediaselector.videoselection;

import android.app.LoaderManager.LoaderCallbacks;
import android.content.Context;
import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore.Video.Media;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import mobi.mmdt.componentsutils.C2468a;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.mediaselector.C6105a;
import mobi.mmdt.ott.view.components.mediaselector.p413a.C6859d;
import mobi.mmdt.ott.view.components.mediaselector.p567b.C7333e;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6074f;
import mobi.mmdt.ott.view.components.p405e.C3150a;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C6111a extends C3150a implements C3126i {
    private RecyclerView f16409a;
    private C6865a f16410b;
    private GridLayoutManager f16411c;
    private C3222b f16412e;
    private int f16413f;
    private int f16414g;
    private String f16415h;
    private String f16416i;
    private LoaderCallbacks<Cursor> f16417j = new C32211(this);

    class C32211 implements LoaderCallbacks<Cursor> {
        final /* synthetic */ C6111a f9952a;
        private final String[] f9953b = new String[]{"_data", "_display_name", "datetaken", "_id"};

        C32211(C6111a c6111a) {
            this.f9952a = c6111a;
        }

        public final Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
            Context activity = this.f9952a.getActivity();
            Uri uri = Media.EXTERNAL_CONTENT_URI;
            String[] strArr = this.f9953b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f9953b[0]);
            stringBuilder.append(" like '%");
            stringBuilder.append(this.f9952a.f16415h);
            stringBuilder.append("%'");
            String stringBuilder2 = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.f9953b[2]);
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
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f9953b[0]));
                        if (new File(string).getParentFile().getAbsolutePath().equals(this.f9952a.f16415h) && !C2468a.m6711h(string).equalsIgnoreCase(VideoSelectorActivity.f24035m)) {
                            arrayList.add(new C7333e(i, cursor.getString(cursor.getColumnIndexOrThrow(this.f9953b[1])), string, string, cursor.getLong(cursor.getColumnIndexOrThrow(this.f9953b[2]))));
                            i++;
                        }
                    } while (cursor.moveToNext());
                    this.f9952a.f16410b.m13673a(arrayList);
                }
            }
        }

        public final void onLoaderReset(Loader<Cursor> loader) {
        }
    }

    public interface C3222b {
        void mo3661a(String str);
    }

    public class C6865a extends C6074f {
        final /* synthetic */ C6111a f19581a;

        C6865a(C6111a c6111a, Context context) {
            this.f19581a = c6111a;
            super(context);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C6859d(this.f19581a.getActivity(), this.f19581a, this.f16246b, viewGroup, this.f19581a.f16413f, this.f19581a.f16414g);
        }
    }

    public final void mo2234c(int i) {
        this.f16412e.mo3661a(((C7333e) this.f16410b.m13671a(i)).f21138a);
    }

    public final void mo2235d(int i) {
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getActivity().getLoaderManager().initLoader(29, null, this.f16417j);
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
        r0 = (mobi.mmdt.ott.view.components.mediaselector.videoselection.C6111a.C3222b) r0;	 Catch:{ ClassCastException -> 0x0009 }
        r2.f16412e = r0;	 Catch:{ ClassCastException -> 0x0009 }
        return;
    L_0x0009:
        r0 = new java.lang.ClassCastException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = r3.toString();
        r1.append(r3);
        r3 = " must implement OnVideoSelectorFragmentInteractionListener";
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.components.mediaselector.videoselection.a.onAttach(android.app.Activity):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_media_video_selector, viewGroup, false);
    }

    public final void onDestroyView() {
        if (this.f16409a != null) {
            this.f16409a.setItemAnimator(null);
            this.f16409a.setAdapter(null);
            this.f16409a = null;
        }
        this.f16410b = null;
        super.onDestroyView();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f16415h = getArguments().getString("KEY_FOLDER_PATH");
        this.f16416i = getArguments().getString("KEY_FOLDER_NAME");
        int a = C2489g.m6754a().m6755a(BallPulseIndicator.SCALE);
        int i = getResources().getConfiguration().orientation == 1 ? 3 : 5;
        a /= i;
        this.f16413f = a;
        this.f16414g = a;
        this.f16411c = new GridLayoutManager(getActivity(), i);
        this.f16409a = (RecyclerView) getView().findViewById(R.id.recycler_view);
        this.f16409a.addItemDecoration(new C6105a((int) C2491i.m6804b(getActivity(), 2.0f), i));
        this.f16410b = new C6865a(this, getActivity());
        this.f16409a.setHasFixedSize(true);
        this.f16409a.setAdapter(this.f16410b);
        this.f16409a.setLayoutManager(this.f16411c);
    }
}
