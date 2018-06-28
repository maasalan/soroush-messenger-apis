package mobi.mmdt.ott.view.main.p452b;

import android.app.Activity;
import android.app.Dialog;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
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
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.cocosw.bottomsheet.C1287c.C1286a;
import com.p196h.p197a.C2119a;
import com.p196h.p197a.C2124b;
import mobi.mmdt.componentsutils.p232b.C2474a;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.C2492j;
import mobi.mmdt.componentsutils.p232b.p233a.C2473a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.p261a.aa.p265a.C2577a;
import mobi.mmdt.ott.logic.p359k.C2837a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.view.components.p398a.C7176b;
import mobi.mmdt.ott.view.components.p398a.C7176b.C3102a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6827b;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import mobi.mmdt.ott.view.main.C6232c;
import mobi.mmdt.ott.view.main.C6235e;
import mobi.mmdt.ott.view.main.p452b.p453a.C6916a;
import mobi.mmdt.ott.view.main.p452b.p576b.C7209a;
import mobi.mmdt.ott.view.main.p452b.p576b.C7364b;
import mobi.mmdt.ott.view.newdesign.mainpage.C6244c;
import mobi.mmdt.ott.view.newdesign.mainpage.MainActivity;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4506e;
import mobi.mmdt.ott.view.tools.C4508f;
import mobi.mmdt.ott.view.tools.C4516l;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6918b extends C6232c implements LoaderCallbacks<Cursor>, C3102a, C3126i, C4156c {
    public LinearLayoutManager f19736a;
    public RecyclerView f19737b;
    private View f19738c;
    private C7209a f19739e;
    private FrameLayout f19740f;
    private LinearLayout f19741g;
    private C6244c f19742h;
    private int f19743i = 0;
    private String f19744j;
    private int f19745k = 0;
    private TextView f19746l;
    private boolean f19747m;
    private boolean f19748n;
    private String f19749o = "";

    class C41553 implements OnClickListener {
        final /* synthetic */ C6918b f11874a;

        C41553(C6918b c6918b) {
            this.f11874a = c6918b;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C2837a.m7167a(this.f11874a.getActivity(), "android.permission.RECORD_AUDIO", 186);
        }
    }

    class C69171 extends C6235e {
        final /* synthetic */ C6918b f19735a;

        C69171(C6918b c6918b) {
            this.f19735a = c6918b;
        }

        public final void mo3236a() {
            C6918b.m17867a(this.f19735a);
        }

        public final void mo3237b() {
            C6918b.m17871b(this.f19735a);
        }
    }

    private class C7209a extends C6827b implements C2119a {
        final /* synthetic */ C6918b f20819a;

        C7209a(C6918b c6918b, Context context) {
            this.f20819a = c6918b;
            super(context);
        }

        public final Character mo3448a(int i) {
            char c;
            if (mo2237a().getCount() == 0) {
                c = C4153a.values()[C4153a.values().length - 1].name().toCharArray()[0];
            } else {
                if (i >= mo2237a().getCount()) {
                    i = mo2237a().getCount() - 1;
                }
                c = ((C7364b) m17257b(i)).f21368d.charAt(0);
                int i2 = 65;
                if (c < 'A' || c > 'Z') {
                    i2 = 97;
                    if (c < 'a' || c > 'z') {
                        i = (c < '0' || c > '9') ? C4153a.values().length - 1 : 0;
                        c = C4153a.values()[i].name().toCharArray()[0];
                    }
                }
                i = (c - i2) + 1;
                c = C4153a.values()[i].name().toCharArray()[0];
            }
            return Character.valueOf(c);
        }

        public final C6073e mo3449a(ViewGroup viewGroup, int i) {
            return new C6916a(this.f20819a.getActivity(), this.f20819a, this.f19501b, viewGroup, this.f20819a, this.f20819a.f19747m, this.f20819a.f19748n);
        }

        protected final C6829g mo3450a(Cursor cursor, int i) {
            int i2 = cursor.getInt(cursor.getColumnIndex("_id"));
            String string = cursor.getString(cursor.getColumnIndex("members_moto"));
            String string2 = cursor.getString(cursor.getColumnIndex("members_avatar_thumbnail_url"));
            String string3 = cursor.getString(cursor.getColumnIndex("members_local_image_uri"));
            String string4 = cursor.getString(cursor.getColumnIndex("members_user_id"));
            int b = C2491i.m6806b(this.f, string4);
            String string5 = cursor.getString(cursor.getColumnIndex("members_local_name"));
            String string6 = cursor.getString(cursor.getColumnIndex("members_local_phone_number"));
            return new C7364b(i2, string4, C4508f.m8221a(string5, string6), string, string2, string3, b, cursor.getPosition(), this.f20819a.f19743i, this.f20819a.f19745k, cursor.getInt(cursor.getColumnIndex("members_is_soroush_member")) != 0, string6);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return mo3449a(viewGroup, i);
        }
    }

    public static C6918b m17866a(boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("KEY_FRAGMENT_IS_INVITE_FRIENDS_VISIBLE", z);
        bundle.putBoolean("KEY_FRAGMENT_IS_CHAT_ITEMS_VISIBLE", z2);
        C6918b c6918b = new C6918b();
        c6918b.setArguments(bundle);
        return c6918b;
    }

    static /* synthetic */ void m17867a(C6918b c6918b) {
        if (c6918b.f19742h != null) {
            c6918b.f19742h.m14472a();
        }
    }

    private void m17869b(Bundle bundle) {
        Fragment a = C7176b.m18967a(bundle, this);
        C0401p a2 = ((C7576b) getActivity()).m19188c().mo254a();
        a2.mo237a(a, "tag");
        a2.mo244d();
    }

    private void m17870b(String str) {
        String c = C2535a.m6888a().m6924c();
        if (c == null) {
            c = C2492j.m6841a(C2535a.m6888a().m6928d());
            C2535a.m6888a().m6916a(c);
        }
        C2473a.m6716a(getActivity(), str, C4522p.m8236a(R.string.invite_msg).concat(C4522p.m8236a(R.string.invite_link_url).concat(c).concat("/")));
    }

    static /* synthetic */ void m17871b(C6918b c6918b) {
        if (c6918b.f19742h != null) {
            c6918b.f19742h.m14473b();
        }
    }

    public final Dialog mo2398a(Bundle bundle) {
        int i = bundle.getInt("dialog_id");
        if (i == 317) {
            final String string = bundle.getString("KEY_DIALOG_USER_ID", "");
            C1286a c1286a = new C1286a(getActivity());
            c1286a.f4034f = new OnClickListener(this) {
                final /* synthetic */ C6918b f11873b;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (i == R.id.action_start_a_conversation) {
                        C4478a.m8150a(this.f11873b.getActivity(), string, false, null, "");
                        return;
                    }
                    if (i == R.id.action_free_call) {
                        if (!C2474a.m6718b(this.f11873b.getActivity())) {
                            Toast.makeText(this.f11873b.getActivity(), C4522p.m8236a(R.string.connection_error_message), 0).show();
                        } else if (C4516l.m8232a() && !C2837a.m7170a("android.permission.RECORD_AUDIO")) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("dialog_id", 82);
                            this.f11873b.m17869b(bundle);
                        } else if (string.equals(this.f11873b.f19744j)) {
                            Toast.makeText(this.f11873b.getActivity(), C4522p.m8236a(R.string.you_can_not_call_yourself), 0).show();
                        } else {
                            C4478a.m8163c(this.f11873b.getActivity(), string);
                        }
                    }
                }
            };
            C4506e.m8204a(getActivity(), c1286a, R.menu.context_menu_contacts_list_long_click);
            return c1286a.m3053a();
        } else if (i != 82) {
            return ((MainActivity) getActivity()).mo2299a(bundle);
        } else {
            return C4488b.m8182a(getActivity(), C4522p.m8236a(R.string.record_audio_permission), C4522p.m8236a(R.string.allow_soroush_access_to_your_microphone), C4522p.m8236a(R.string.movafegham), new C41553(this), C4522p.m8236a(R.string.felan_na), null);
        }
    }

    public final void m17878a(String str) {
        this.f19749o = str;
        Bundle bundle = new Bundle();
        Activity activity = getActivity();
        if (activity != null) {
            activity.getLoaderManager().restartLoader(7, bundle, this);
        }
        this.f19745k = C2999a.m7513d(str);
    }

    public final void mo3238a(C7209a c7209a) {
        C7364b c7364b = (C7364b) this.f19739e.m17257b(c7209a.f19504k);
        if (c7364b.f21365a) {
            String str = c7364b.f21369e;
            C4478a.m8150a(getActivity(), str, false, null, C2980g.m7433a(str) != null ? C2980g.m7433a(str).f9296p : null);
            return;
        }
        m17870b(c7364b.f21366b);
    }

    public final void mo3239b() {
        if (this.f19737b != null) {
            this.f19737b.scrollToPosition(0);
        }
    }

    public final void mo3240b(C7209a c7209a) {
        Cursor a = this.f19739e.mo2237a();
        a.moveToFirst();
        a.move(c7209a.f19504k);
        if ((a.getInt(a.getColumnIndex("members_is_soroush_member")) != 0 ? 1 : null) != null) {
            String string = a.getString(a.getColumnIndex("members_user_id"));
            String string2 = a.getString(a.getColumnIndex("members_local_name"));
            Bundle bundle = new Bundle();
            bundle.putInt("dialog_id", 317);
            bundle.putString("KEY_DIALOG_USER_ID", string);
            bundle.putString("KEY_DIALOG_USER_LOCAL_NAME", string2);
            m17869b(bundle);
        }
    }

    public final void mo2234c(int i) {
    }

    public final void mo3241c(C7209a c7209a) {
        m17870b(((C7364b) this.f19739e.m17257b(c7209a.f19504k)).f21366b);
    }

    public final void mo2235d(int i) {
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            if (getArguments().containsKey("KEY_FRAGMENT_IS_INVITE_FRIENDS_VISIBLE")) {
                this.f19747m = getArguments().getBoolean("KEY_FRAGMENT_IS_INVITE_FRIENDS_VISIBLE");
            }
            if (getArguments().containsKey("KEY_FRAGMENT_IS_CHAT_ITEMS_VISIBLE")) {
                this.f19748n = getArguments().getBoolean("KEY_FRAGMENT_IS_CHAT_ITEMS_VISIBLE");
            }
        }
    }

    public final Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        return C2999a.m7505b(this.f19749o);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f19738c = layoutInflater.inflate(R.layout.fragment_contacts_list, viewGroup, false);
        return this.f19738c;
    }

    public final void onEvent(C2577a c2577a) {
        this.f19745k = MyApplication.m12950a().f15897L;
    }

    public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Cursor cursor = (Cursor) obj;
        if (this.f19739e != null) {
            this.f19739e.m13684c(cursor);
            this.f19743i = this.f19739e.m13682b();
            if (this.f19743i > 0) {
                this.f19741g.setVisibility(8);
                return;
            }
            this.f19741g.setVisibility(0);
            this.f19740f.setVisibility(0);
            return;
        }
        this.f19741g.setVisibility(0);
    }

    public final void onLoaderReset(Loader<Cursor> loader) {
        if (this.f19739e != null) {
            this.f19739e.m13684c(null);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f19744j = C2535a.m6888a().m6928d();
        this.f19739e = new C7209a(this, getActivity());
        this.f19742h = (C6244c) getActivity().getFragmentManager().findFragmentByTag("tag_main_page_fragment");
        this.f19737b = (RecyclerView) this.f19738c.findViewById(R.id.recycler_view);
        this.f19741g = (LinearLayout) this.f19738c.findViewById(R.id.empty_state_linearLayout);
        this.f19746l = (TextView) this.f19738c.findViewById(R.id.empty_state_textView);
        this.f19740f = (FrameLayout) this.f19738c.findViewById(R.id.empty_state_frameLayout_image);
        this.f19737b.setAdapter(this.f19739e);
        this.f19736a = new LinearLayoutManager(getActivity());
        this.f19737b.setLayoutManager(this.f19736a);
        this.f19737b.addOnScrollListener(new C69171(this));
        C2124b c2124b = new C2124b(getActivity(), this.f19737b);
        c2124b.f7109a.setBackgroundColor(UIThemeManager.getmInstance().getAccent_color());
        Bundle bundle2 = new Bundle();
        this.f19745k = MyApplication.m12950a().f15897L;
        getActivity().getLoaderManager().initLoader(7, bundle2, this);
        int a = C2489g.m6754a().m6755a(BallPulseIndicator.SCALE);
        int b = C2489g.m6754a().m6756b(BallPulseIndicator.SCALE);
        if (getActivity().getResources().getConfiguration().orientation == 1) {
            a = (a * 50) / 100;
            b = a;
        } else {
            int i = (b * 40) / 100;
            b = (a * 40) / 100;
            a = i;
        }
        this.f19740f.setLayoutParams(new LayoutParams(a, b));
        C2491i.m6802a(this.f19746l, UIThemeManager.getmInstance().getText_primary_color());
    }
}
