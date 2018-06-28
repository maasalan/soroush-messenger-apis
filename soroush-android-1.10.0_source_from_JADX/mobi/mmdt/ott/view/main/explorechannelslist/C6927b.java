package mobi.mmdt.ott.view.main.explorechannelslist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.main.C6232c;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.C6930a;
import mobi.mmdt.ott.view.tools.C4514j;

public final class C6927b extends C6232c {
    private C6930a f19798a;

    public final void mo3239b() {
        this.f19798a.mo3239b();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_parent_explore_channels_list, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f19798a = new C6930a();
        bundle = new Bundle();
        bundle.putInt("LANDING_PAGE_NUMBER", 0);
        this.f19798a.setArguments(bundle);
        C4514j.m8229a(getActivity(), this.f19798a, "ROOT_EXPLORE_CHANNEL_FRAGMENT_TAG", R.id.frameLayoutContainer, true);
    }
}
