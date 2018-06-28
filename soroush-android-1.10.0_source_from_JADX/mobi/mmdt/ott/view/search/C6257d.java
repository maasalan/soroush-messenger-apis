package mobi.mmdt.ott.view.search;

import android.content.DialogInterface;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.C6389b.C0663a;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import java.util.Timer;
import java.util.TimerTask;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base.SearchChannelModel;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base.SuggestedChannelCategory;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base.SuggestedChannelsCategoryItemType;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6693b;
import mobi.mmdt.ott.logic.p261a.p298k.C6748m;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2709y;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5948x;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p395q.C3017a;
import mobi.mmdt.ott.view.components.p405e.C3150a;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p480d.C4503a;

public final class C6257d extends C3150a implements OnQueryTextListener, OnClickListener, C4349a {
    private final int f17022a = 50;
    private C6255b f17023b;
    private C6258e f17024c;
    private SearchView f17025e;
    private RecyclerView f17026f;
    private TextView f17027g;
    private LinearLayoutManager f17028h;
    private boolean f17029i = false;
    private boolean f17030j = true;
    private boolean f17031k = true;
    private int f17032l = 50;
    private int f17033m = 0;
    private boolean f17034n = false;
    private boolean f17035o = false;
    private boolean f17036p = false;
    private boolean f17037q = false;
    private boolean f17038r = false;
    private boolean f17039s = false;
    private boolean f17040t = true;
    private Timer f17041u;
    private View f17042v;

    class C43545 implements Runnable {
        final /* synthetic */ C6257d f12212a;

        class C43531 implements Runnable {
            final /* synthetic */ C43545 f12211a;

            C43531(C43545 c43545) {
                this.f12211a = c43545;
            }

            public final void run() {
                this.f12211a.f12212a.f17023b.m14581a(C3017a.m7529a(this.f12211a.f12212a.f17023b.f17019g, this.f12211a.f12212a.f17030j ? 5 : 50));
            }
        }

        C43545(C6257d c6257d) {
            this.f12212a = c6257d;
        }

        public final void run() {
            new Handler().postDelayed(new C43531(this), 500);
        }
    }

    class C43577 implements DialogInterface.OnClickListener {
        final /* synthetic */ C6257d f12219a;

        C43577(C6257d c6257d) {
            this.f12219a = c6257d;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C6257d.m14594h(this.f12219a);
        }
    }

    class C43588 implements DialogInterface.OnClickListener {
        final /* synthetic */ C6257d f12220a;

        C43588(C6257d c6257d) {
            this.f12220a = c6257d;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.cancel();
        }
    }

    class C62561 extends OnScrollListener {
        final /* synthetic */ C6257d f17021a;

        C62561(C6257d c6257d) {
            this.f17021a = c6257d;
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (i2 > 0) {
                if (C6257d.m14585a(this.f17021a, this.f17021a.f17028h.findLastVisibleItemPosition())) {
                    C6257d.m14587b(this.f17021a);
                }
            }
        }
    }

    static /* synthetic */ void m14583a(C6257d c6257d, String str) {
        C2808d.m7148b(new C6748m(str));
        c6257d.f17023b.f17019g = str;
    }

    private boolean m14584a(String str) {
        boolean z;
        if (!(this.f17034n || this.f17036p || this.f17038r)) {
            if (str != null) {
                z = false;
                if (z) {
                    return true;
                }
                final Cursor b;
                if (this.f17023b.f17014b == this.f17032l || this.f17035o) {
                    if (str.length() > 2 || this.f17023b.f17016d != this.f17032l || this.f17037q) {
                        if (this.f17023b.f17018f == this.f17032l || this.f17039s) {
                            this.f17031k = false;
                        } else {
                            this.f17038r = true;
                            this.f17032l += 50;
                            b = C2980g.m7438b(str, this.f17032l);
                            getActivity().runOnUiThread(new Runnable(this) {
                                final /* synthetic */ C6257d f12210b;

                                public final void run() {
                                    C6255b c = this.f12210b.f17023b;
                                    Cursor cursor = b;
                                    if (c.f17017e != null) {
                                        c.f17017e.close();
                                    }
                                    c.f17017e = cursor;
                                    if (cursor != null) {
                                        c.f17018f = cursor.getCount();
                                    }
                                    c.notifyDataSetChanged();
                                }
                            });
                            if (this.f17023b.f17018f != this.f17032l) {
                                this.f17032l = 50;
                                this.f17038r = false;
                                this.f17039s = true;
                                m14584a(str);
                            }
                            this.f17038r = false;
                            return false;
                        }
                    } else if (!this.f17030j) {
                        this.f17036p = true;
                        this.f17032l += 50;
                        b = C3017a.m7529a(str, this.f17032l);
                        getActivity().runOnUiThread(new Runnable(this) {
                            final /* synthetic */ C6257d f12208b;

                            public final void run() {
                                this.f12208b.f17023b.m14581a(b);
                            }
                        });
                        if (this.f17023b.f17016d != this.f17032l) {
                            this.f17032l = 50;
                            this.f17036p = false;
                            this.f17037q = true;
                            m14584a(str);
                        }
                        this.f17036p = false;
                        return false;
                    }
                    return false;
                }
                this.f17034n = true;
                this.f17032l += 50;
                b = C2980g.m7434a(str, this.f17032l);
                getActivity().runOnUiThread(new Runnable(this) {
                    final /* synthetic */ C6257d f12206b;

                    public final void run() {
                        C6255b c = this.f12206b.f17023b;
                        Cursor cursor = b;
                        if (c.f17013a != null) {
                            c.f17013a.close();
                        }
                        c.f17013a = cursor;
                        if (cursor != null) {
                            c.f17014b = cursor.getCount();
                        }
                        c.notifyDataSetChanged();
                    }
                });
                if (this.f17023b.f17014b != this.f17032l) {
                    this.f17032l = 50;
                    this.f17034n = false;
                    this.f17035o = true;
                    m14584a(str);
                }
                this.f17034n = false;
                return false;
            }
        }
        z = true;
        if (z) {
            return true;
        }
        if (this.f17023b.f17014b == this.f17032l) {
        }
        if (str.length() > 2) {
        }
        if (this.f17023b.f17018f == this.f17032l) {
        }
        this.f17031k = false;
        return false;
    }

    static /* synthetic */ boolean m14585a(C6257d c6257d, int i) {
        return i >= (c6257d.f17023b.getItemCount() - 1) + -5 && c6257d.f17031k;
    }

    public static C6257d m14586b() {
        return new C6257d();
    }

    static /* synthetic */ void m14587b(C6257d c6257d) {
        c6257d.f17033m = c6257d.f17023b.getItemCount();
        if (!c6257d.m14584a(c6257d.f17023b.f17019g) && c6257d.f17033m == c6257d.f17023b.getItemCount()) {
            c6257d.f17031k = false;
        }
    }

    private void m14589d() {
        this.f17029i = false;
        this.f17023b.m14580a();
        this.f17026f.setAdapter(this.f17024c);
        Cursor a = C4360g.m8113a();
        this.f17024c.m14596a(a);
        if (a == null || a.getCount() <= 0) {
            this.f17027g.setVisibility(8);
        } else {
            this.f17027g.setVisibility(0);
        }
    }

    static /* synthetic */ void m14591e(C6257d c6257d) {
        c6257d.f17032l = 50;
        c6257d.f17031k = true;
        c6257d.f17033m = 0;
        c6257d.f17034n = false;
        c6257d.f17035o = false;
        c6257d.f17036p = false;
        c6257d.f17037q = false;
        c6257d.f17038r = false;
        c6257d.f17039s = false;
        c6257d.f17040t = false;
    }

    static /* synthetic */ void m14593g(C6257d c6257d) {
        c6257d.f17026f.setAdapter(c6257d.f17023b);
        c6257d.f17027g.setVisibility(8);
        c6257d.f17029i = true;
    }

    static /* synthetic */ void m14594h(C6257d c6257d) {
        C2535a.m6888a().m6917a(new HashSet());
        Cursor a = C4360g.m8113a();
        c6257d.f17024c.m14596a(a);
        if (a == null || a.getCount() == 0) {
            c6257d.f17027g.setVisibility(8);
        }
    }

    public final void mo2426a() {
        C0663a c0663a = new C0663a(getActivity());
        c0663a.m1613b(C4522p.m8236a(R.string.search_history_remove_text));
        c0663a.m1610a(true);
        c0663a.m1609a(C4522p.m8236a(R.string.search_history_remove_ok), new C43577(this));
        c0663a.m1614b(C4522p.m8236a(R.string.search_history_remove_cancel), new C43588(this));
        c0663a.m1612a().show();
    }

    public final void onClick(View view) {
        getActivity().onBackPressed();
        getActivity().overridePendingTransition(0, 0);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bundle = getActivity().getIntent().getExtras();
        if (bundle != null) {
            this.f17030j = bundle.getBoolean("full_search");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_search, viewGroup, false);
    }

    public final void onEvent(C5948x c5948x) {
    }

    public final void onEvent(C2709y c2709y) {
        SearchChannelModel[] searchChannelModelArr = c2709y.f8651a;
        SuggestedChannelCategory[] suggestedChannelCategoryArr = new SuggestedChannelCategory[searchChannelModelArr.length];
        for (int i = 0; i < searchChannelModelArr.length; i++) {
            SearchChannelModel searchChannelModel = searchChannelModelArr[i];
            SuggestedChannelCategory suggestedChannelCategory = new SuggestedChannelCategory();
            suggestedChannelCategory.setParty(searchChannelModel.getChannelID());
            suggestedChannelCategory.setChannelLink(searchChannelModel.getChannelLink());
            suggestedChannelCategory.setTitle(searchChannelModel.getName());
            suggestedChannelCategory.setParentCategoryId(Integer.valueOf(-300000));
            suggestedChannelCategory.setDescription(searchChannelModel.getDescription());
            suggestedChannelCategory.setAvatarUrl(searchChannelModel.getAvatarURL());
            suggestedChannelCategory.setAvatarThumbnailUrl(searchChannelModel.getAvatarThumbnailURL());
            suggestedChannelCategory.setChannelCreationDate(Long.valueOf(searchChannelModel.getCreationDateInMilliSecond()));
            suggestedChannelCategory.setChannelMembersCount(Long.valueOf((long) searchChannelModel.getMembersCount()));
            suggestedChannelCategory.setItemType(SuggestedChannelsCategoryItemType.CHANNEL);
            suggestedChannelCategory.setItemIndex(Integer.valueOf(-100));
            suggestedChannelCategory.setIsDisabled(false);
            suggestedChannelCategoryArr[i] = suggestedChannelCategory;
        }
        C2808d.m7148b(new C6693b(suggestedChannelCategoryArr));
        getActivity().runOnUiThread(new C43545(this));
    }

    public final boolean onQueryTextChange(final String str) {
        if (!this.f17040t) {
            this.f17040t = true;
        }
        if (this.f17041u != null) {
            this.f17041u.cancel();
            this.f17041u.purge();
        }
        if (str.length() > 0) {
            this.f17041u = new Timer();
            this.f17041u.schedule(new TimerTask(this) {
                final /* synthetic */ C6257d f12218b;

                public final void run() {
                    C6257d.m14591e(this.f12218b);
                    Cursor cursor = null;
                    final Cursor a = this.f12218b.f17030j ? C2980g.m7434a(str, 50) : null;
                    final Cursor b = this.f12218b.f17030j ? C2980g.m7438b(str, 50) : null;
                    if (str.length() > 2) {
                        int i = this.f12218b.f17030j ? 5 : 50;
                        if (a == null || a.getCount() < 50) {
                            cursor = C3017a.m7529a(str, i);
                        }
                        C6257d.m14583a(this.f12218b, str);
                    }
                    this.f12218b.getActivity().runOnUiThread(new Runnable(this) {
                        final /* synthetic */ C43566 f12216d;

                        public final void run() {
                            C6255b c = this.f12216d.f12218b.f17023b;
                            Cursor cursor = a;
                            Cursor cursor2 = cursor;
                            Cursor cursor3 = b;
                            c.m14580a();
                            c.f17013a = cursor;
                            c.f17015c = cursor2;
                            c.f17017e = cursor3;
                            int i = 0;
                            c.f17014b = c.f17013a != null ? c.f17013a.getCount() : 0;
                            c.f17018f = c.f17017e != null ? c.f17017e.getCount() : 0;
                            if (c.f17015c != null) {
                                i = c.f17015c.getCount();
                            }
                            c.f17016d = i;
                            c.notifyDataSetChanged();
                            if (!this.f12216d.f12218b.f17029i) {
                                C6257d.m14593g(this.f12216d.f12218b);
                            }
                        }
                    });
                }
            }, 300);
        } else {
            m14589d();
        }
        return false;
    }

    public final boolean onQueryTextSubmit(String str) {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.d = (Toolbar) view.findViewById(R.id.toolbar);
        this.d.setNavigationOnClickListener(this);
        this.f17042v = view.findViewById(R.id.shadow_line_top);
        this.f17025e = (SearchView) view.findViewById(R.id.search);
        this.f17025e.setOnQueryTextListener(this);
        this.f17026f = (RecyclerView) view.findViewById(R.id.recyclerViewSearch);
        this.f17028h = new LinearLayoutManager(getActivity());
        this.f17026f.setLayoutManager(this.f17028h);
        this.f17027g = (TextView) view.findViewById(R.id.search_help_remove_textview);
        this.f17027g.setText(C4522p.m8236a(R.string.search_history_remove_help_text));
        this.f17026f.setItemAnimator(null);
        this.f17026f.setNestedScrollingEnabled(false);
        this.f17026f.addOnScrollListener(new C62561(this));
        this.f17023b = new C6255b(getActivity());
        this.f17024c = new C6258e(getActivity(), this);
        m14589d();
        C2491i.m6796a(view.findViewById(R.id.search_fragment_rootView), UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6802a(this.f17027g, UIThemeManager.getmInstance().getText_secondary_color());
        C4503a.m8196a(false, this.f17027g);
        C2475a.m6720a(getActivity().getWindow(), UIThemeManager.getmInstance().getPrimary_dark_color());
        C2491i.m6796a(this.d, UIThemeManager.getmInstance().getPrimary_color());
        C2491i.m6801a((ImageView) this.f17025e.findViewById(R.id.search_close_btn), UIThemeManager.getmInstance().getIcon_not_selected_color());
        TextView textView = (TextView) this.f17025e.findViewById(R.id.search_src_text);
        C4503a.m8196a(false, textView);
        C2491i.m6802a(textView, UIThemeManager.getmInstance().getIcon_not_selected_color());
        textView.setHintTextColor(UIThemeManager.getmInstance().getIcon_not_selected_color());
        C2491i.m6790a(this.d.getNavigationIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
        C2491i.m6797a(this.f17042v, UIThemeManager.getmInstance().getShadow_toolbar_start_gradient_color(), UIThemeManager.getmInstance().getShadow_toolbar_end_gradient_color());
    }
}
