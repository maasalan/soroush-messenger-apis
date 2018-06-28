package mobi.mmdt.ott.view.vas.payservices.charge.view;

import android.app.Dialog;
import android.app.SearchManager;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.SearchView.OnCloseListener;
import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p398a.C7176b.C3102a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p405e.C3150a;

public final class C6284a extends C3150a implements C3102a, C3126i {
    private C6285b f17160a;
    private SearchView f17161b;
    private String f17162c = "";
    private boolean f17163e = false;

    class C45721 implements OnClickListener {
        final /* synthetic */ C6284a f12588a;

        C45721(C6284a c6284a) {
            this.f12588a = c6284a;
        }

        public final void onClick(View view) {
            this.f12588a.f17163e = true;
        }
    }

    class C62822 implements OnCloseListener {
        final /* synthetic */ C6284a f17158a;

        C62822(C6284a c6284a) {
            this.f17158a = c6284a;
        }

        public final boolean onClose() {
            this.f17158a.f17163e = false;
            return false;
        }
    }

    class C62833 implements OnQueryTextListener {
        final /* synthetic */ C6284a f17159a;

        C62833(C6284a c6284a) {
            this.f17159a = c6284a;
        }

        public final boolean onQueryTextChange(String str) {
            this.f17159a.f17162c = str;
            this.f17159a.f17160a.mo2375a(str);
            return false;
        }

        public final boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public final Dialog mo2398a(Bundle bundle) {
        bundle.getInt("dialog_id", -1);
        return null;
    }

    public final void mo2234c(int i) {
    }

    public final void mo2235d(int i) {
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.menu_charge, menu);
        MenuItem findItem = menu.findItem(R.id.action_search);
        SearchManager searchManager = (SearchManager) getActivity().getSystemService("search");
        if (findItem != null) {
            this.f17161b = (SearchView) findItem.getActionView();
            if (this.f17161b != null) {
                this.f17161b.setSearchableInfo(searchManager.getSearchableInfo(getActivity().getComponentName()));
                this.f17161b = (SearchView) findItem.getActionView();
                ImageView imageView = (ImageView) this.f17161b.findViewById(R.id.search_button);
                imageView.setImageResource(R.drawable.ic_search);
                C2491i.m6801a(imageView, UIThemeManager.getmInstance().getIcon_not_selected_color());
                imageView = (ImageView) this.f17161b.findViewById(R.id.search_close_btn);
                imageView.setImageResource(R.drawable.ic_close_gray);
                C2491i.m6801a(imageView, UIThemeManager.getmInstance().getIcon_not_selected_color());
                View view = (TextView) this.f17161b.findViewById(R.id.search_src_text);
                view.setTextColor(UIThemeManager.getmInstance().getText_primary_new_design_color());
                view.setHintTextColor(UIThemeManager.getmInstance().getText_primary_new_design_with_opacity_color());
                C2491i.m6818b(view, UIThemeManager.getmInstance().getAccent_color());
                Display defaultDisplay = getActivity().getWindowManager().getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                this.f17161b.setMaxWidth(point.x);
            }
        }
        this.f17161b.setOnSearchClickListener(new C45721(this));
        this.f17161b.setOnCloseListener(new C62822(this));
        if (this.f17163e) {
            this.f17161b.setIconified(false);
            this.f17161b.setQuery(this.f17162c, true);
            if (!(this.f17162c.isEmpty() || this.f17160a == null)) {
                this.f17160a.mo2375a(this.f17162c);
            }
        }
        this.f17161b.setImeOptions(this.f17161b.getImeOptions() | 268435456);
        this.f17161b.setOnQueryTextListener(new C62833(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f17160a = C6285b.m14679a(getActivity(), (ChargeActivity) getActivity());
        C2491i.m6796a(layoutInflater.inflate(R.layout.fragment_charge, viewGroup, false), UIThemeManager.getmInstance().getRecycler_view_background_color());
        setHasOptionsMenu(true);
        return this.f17160a.m8003c();
    }

    public final void onDestroyView() {
        super.onDestroyView();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }
}
