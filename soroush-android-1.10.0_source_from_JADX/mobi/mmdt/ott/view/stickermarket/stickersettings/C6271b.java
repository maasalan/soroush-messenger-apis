package mobi.mmdt.ott.view.stickermarket.stickersettings;

import android.app.LoaderManager.LoaderCallbacks;
import android.content.Context;
import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.C0401p;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.provider.p394p.C3014a;
import mobi.mmdt.ott.provider.p394p.C3015b;
import mobi.mmdt.ott.provider.p394p.C3016f;
import mobi.mmdt.ott.provider.p394p.C6048d;
import mobi.mmdt.ott.view.components.p398a.C7175a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6827b;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.components.p405e.C3150a;
import mobi.mmdt.ott.view.stickermarket.stickersettings.p476a.C6989a;
import mobi.mmdt.ott.view.stickermarket.stickersettings.p589b.C7394b;

public final class C6271b extends C3150a implements LoaderCallbacks<Cursor>, C3126i, C4467a {
    private RecyclerView f17114a;
    private FrameLayout f17115b;
    private LinearLayout f17116c;
    private C7394b f17117e;
    private LinearLayoutManager f17118f;
    private C7231a f17119g;
    private int f17120h = 0;
    private RelativeLayout f17121i;
    private TextView f17122j;
    private TextView f17123k;
    private View f17124l;
    private TextView f17125m;

    public interface C7231a {
    }

    public class C7394b extends C6827b {
        final /* synthetic */ C6271b f20878a;

        public C7394b(C6271b c6271b, Context context) {
            this.f20878a = c6271b;
            super(context);
        }

        public final C6073e mo3449a(ViewGroup viewGroup, int i) {
            return new C6989a(this.f20878a.getActivity(), this.f20878a, this.f19501b, viewGroup, this.f20878a);
        }

        protected final C6829g mo3450a(Cursor cursor, int i) {
            C6048d c6048d = new C6048d(cursor);
            int b = c6048d.m13582b();
            String a = c6048d.m7352a("stickerspackage_name");
            if (a == null) {
                throw new NullPointerException("The value of 'name' in the database was null, which is not allowed according to the model definition");
            }
            String c = c6048d.m13583c();
            Boolean d = c6048d.m7355d("stickerspackage_is_hidden");
            if (d != null) {
                return new mobi.mmdt.ott.view.stickermarket.stickersettings.p589b.C7394b(b, a, c, d.booleanValue(), c6048d.getPosition());
            }
            throw new NullPointerException("The value of 'is_hidden' in the database was null, which is not allowed according to the model definition");
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return mo3449a(viewGroup, i);
        }
    }

    private void m14646b(Bundle bundle) {
        Fragment k = C7175a.m18964k(bundle);
        C0401p a = ((StickerSettingsActivity) getActivity()).m19188c().mo254a();
        a.mo237a(k, "tag");
        a.mo244d();
    }

    public final void m14647a(Bundle bundle) {
        int i = bundle.getInt("BOTTOM_SHEET_DO_ACTION_DELETE_STICKER_METHOD");
        int i2 = bundle.getInt("KEY_DIALOG_PACKAGE_ID");
        switch (i) {
            case 101:
                C3014a.m7527a(getActivity(), i2, bundle.getBoolean("KEY_DIALOG_IS_HIDDEN"));
                return;
            case 102:
                bundle = new Bundle();
                bundle.putInt("dialog_id", 10);
                bundle.putInt("KEY_DIALOG_PACKAGE_ID", i2);
                m14646b(bundle);
                return;
            default:
                return;
        }
    }

    public final void mo2432a(C7394b c7394b) {
        C3014a.m7527a(getActivity(), c7394b.f21502a, false);
    }

    public final void mo2433b(C7394b c7394b) {
        C3014a.m7527a(getActivity(), c7394b.f21502a, true);
    }

    public final void mo2234c(int i) {
        C7394b c7394b = (C7394b) this.f17117e.m17257b(i);
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 20);
        bundle.putString("KEY_DIALOG_TITLE_BOTTOM_SHEET", c7394b.f21503b);
        bundle.putInt("KEY_DIALOG_PACKAGE_ID", c7394b.f21502a);
        bundle.putBoolean("KEY_DIALOG_IS_HIDDEN", c7394b.f21505d ^ 1);
        m14646b(bundle);
    }

    public final void mo2235d(int i) {
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
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
        r0 = (mobi.mmdt.ott.view.stickermarket.stickersettings.C6271b.C7231a) r0;	 Catch:{ ClassCastException -> 0x0009 }
        r2.f17119g = r0;	 Catch:{ ClassCastException -> 0x0009 }
        return;
    L_0x0009:
        r0 = new java.lang.ClassCastException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = r3.toString();
        r1.append(r3);
        r3 = " must implement OnStickerSettingsFragmentInteractionListener";
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.stickermarket.stickersettings.b.onAttach(android.app.Activity):void");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null && getArguments().containsKey("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION")) {
            this.f17120h = getArguments().getInt("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION");
        }
    }

    public final Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        String[] strArr = new String[1];
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C3016f.READY.ordinal());
        strArr[0] = stringBuilder.toString();
        return new CursorLoader(getActivity(), C3015b.f9463a, null, "stickerspackage_download_state =? ", strArr, "_id ASC");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_sticker_settings, viewGroup, false);
    }

    public final void onDestroyView() {
        if (this.f17114a != null) {
            this.f17114a.setItemAnimator(null);
            this.f17114a.setAdapter(null);
            this.f17114a = null;
        }
        this.f17117e = null;
        super.onDestroyView();
    }

    public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Cursor cursor = (Cursor) obj;
        if (this.f17117e != null) {
            this.f17117e.m13684c(cursor);
            if (this.f17117e.m13682b() > 0) {
                this.f17116c.setVisibility(8);
                return;
            } else {
                this.f17116c.setVisibility(0);
                return;
            }
        }
        this.f17116c.setVisibility(0);
    }

    public final void onLoaderReset(Loader<Cursor> loader) {
        if (this.f17117e != null) {
            this.f17117e.m13684c(null);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f17118f = new LinearLayoutManager(getActivity());
        this.f17121i = (RelativeLayout) getView().findViewById(R.id.root_relativeLayout);
        this.f17114a = (RecyclerView) getView().findViewById(R.id.recycler_view);
        this.f17116c = (LinearLayout) getView().findViewById(R.id.empty_state_linearLayout);
        this.f17115b = (FrameLayout) getView().findViewById(R.id.empty_state_frameLayout_image);
        this.f17125m = (TextView) getView().findViewById(R.id.empty_state_textView);
        this.f17122j = (TextView) getView().findViewById(R.id.visibility_textView);
        this.f17123k = (TextView) getView().findViewById(R.id.sticker_package_textView);
        this.f17124l = getView().findViewById(R.id.dividerView);
        this.f17117e = new C7394b(this, getActivity());
        this.f17114a.setHasFixedSize(true);
        this.f17114a.setAdapter(this.f17117e);
        this.f17114a.setLayoutManager(this.f17118f);
        this.f17114a.scrollToPosition(this.f17120h);
        C2491i.m6786a(getActivity(), this.f17115b);
        getLoaderManager().initLoader(28, null, this);
        C2491i.m6796a(this.f17124l, UIThemeManager.getmInstance().getToolbar_line_separator_color());
        C2491i.m6802a(this.f17122j, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f17123k, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f17125m, UIThemeManager.getmInstance().getText_primary_color());
    }
}
