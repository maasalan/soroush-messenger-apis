package mobi.mmdt.ott.view.newdesign.mainpage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.Loader;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout.Behavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.C0273d;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.C0283b;
import android.support.design.widget.TabLayout.C0288e;
import android.support.v4.app.C0401p;
import android.support.v4.app.Fragment;
import android.support.v4.p029a.C0346c;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.cocosw.bottomsheet.C1287c.C1286a;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.aa.C6645d;
import mobi.mmdt.ott.logic.p261a.ag.p545b.C6674a;
import mobi.mmdt.ott.logic.p341b.C2776a;
import mobi.mmdt.ott.logic.p359k.C2837a;
import mobi.mmdt.ott.logic.p360l.C2849f;
import mobi.mmdt.ott.logic.p360l.p362b.C2843a;
import mobi.mmdt.ott.logic.p360l.p362b.C2844b;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.provider.p389k.C6034d;
import mobi.mmdt.ott.view.components.p398a.C7176b;
import mobi.mmdt.ott.view.components.p398a.C7176b.C3102a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.components.p405e.C3150a;
import mobi.mmdt.ott.view.main.CreateChannelActivity;
import mobi.mmdt.ott.view.main.NewBulkMessageContactSelectionListActivity;
import mobi.mmdt.ott.view.main.NewConversationContactSelectionListActivity;
import mobi.mmdt.ott.view.main.NewGroupActivity;
import mobi.mmdt.ott.view.main.p452b.C6918b;
import mobi.mmdt.ott.view.newdesign.mainpage.p465a.C4254a;
import mobi.mmdt.ott.view.newdesign.mainpage.p466b.C4257a;
import mobi.mmdt.ott.view.newdesign.mainpage.p467c.C4271a;
import mobi.mmdt.ott.view.newdesign.mainpage.p467c.C4272c;
import mobi.mmdt.ott.view.newdesign.mainpage.p469d.C4274a;
import mobi.mmdt.ott.view.newdesign.mainpage.p470e.C4278c;
import mobi.mmdt.ott.view.newdesign.mainpage.p470e.C4279d;
import mobi.mmdt.ott.view.newdesign.mainpage.p470e.C6940a;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4506e;
import mobi.mmdt.ott.view.tools.C4509g;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4516l;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.NonSwipeableViewPager.NonSwipeableViewPager;

public final class C6244c extends C3150a implements C3102a, C3126i, C4275d {
    public NonSwipeableViewPager f16900a;
    CoordinatorLayout f16901b;
    public AlertDialog f16902c;
    public C4257a f16903e;
    private C4254a f16904f;
    private TabLayout f16905g;
    private View f16906h;
    private Activity f16907i;
    private String f16908j;
    private C4274a f16909k;
    private View f16910l;
    private int f16911m;
    private boolean f16912n = true;
    private C4278c f16913o;
    private C4271a f16914p;
    private final LoaderCallbacks<Cursor> f16915q = new LoaderCallbacks<Cursor>(this) {
        final /* synthetic */ C6244c f12036a;

        {
            this.f12036a = r1;
        }

        public final Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
            return C2999a.m7511c(C2535a.m6888a().m6928d());
        }

        public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
            Cursor cursor = (Cursor) obj;
            if (cursor.moveToFirst()) {
                C6034d c6034d = new C6034d(cursor);
                C4272c c4272c = new C4272c(c6034d.m7352a("members_local_phone_number"), c6034d.m7352a("members_nick_name"), c6034d.m7352a("members_avatar_thumbnail_url"));
                C4271a i = this.f12036a.f16914p;
                Activity activity = this.f12036a.getActivity();
                if (!c4272c.equals(i.f12067j)) {
                    i.f12067j = c4272c;
                    i.f12066i.setBackgroundColor(C2491i.m6806b((Context) activity, c4272c.f12068a));
                    i.f12066i.setName(c4272c.f12069b);
                    i.f12066i.setTextColor(C0346c.m687c(activity, R.color.white));
                    if (c4272c.f12069b != null) {
                        TextView textView;
                        CharSequence b;
                        if (C2535a.m6888a().m6919b().equals("fa")) {
                            textView = i.f12062e;
                            b = C2491i.m6814b(c4272c.f12069b);
                        } else {
                            textView = i.f12062e;
                            b = c4272c.f12069b;
                        }
                        textView.setText(b);
                    }
                    i.f12066i.setImageBitmap(null);
                    if (c4272c.f12070c == null || c4272c.f12070c.isEmpty()) {
                        C1212c.m2872a(activity).m10953a(i.f12066i);
                    } else {
                        C1212c.m2872a(activity).m10950a(C4515k.m8231a(C2556b.m6998a(c4272c.f12070c))).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a)).m3031a(i.f12066i);
                    }
                    i.f12063f.setText(c4272c.f12068a);
                }
            }
        }

        public final void onLoaderReset(Loader<Cursor> loader) {
        }
    };

    class C42592 implements OnClickListener {
        final /* synthetic */ C6244c f12039a;

        C42592(C6244c c6244c) {
            this.f12039a = c6244c;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == R.id.action_new_contact) {
                C2491i.m6827c(this.f12039a.f16907i);
                this.f12039a.f16907i.overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
            } else if (i == R.id.action_sync_contact) {
                C2808d.m7147a(new C6645d());
                Toast.makeText(this.f12039a.f16907i, C4522p.m8236a(R.string.syncing_contacts), 0).show();
            }
        }
    }

    class C42603 implements Runnable {
        final /* synthetic */ C6244c f12040a;

        C42603(C6244c c6244c) {
            this.f12040a = c6244c;
        }

        public final void run() {
            this.f12040a.m14458e();
        }
    }

    class C42614 implements Runnable {
        final /* synthetic */ C6244c f12041a;

        C42614(C6244c c6244c) {
            this.f12041a = c6244c;
        }

        public final void run() {
            this.f12041a.f16909k.m8070a(this.f12041a.f16908j);
        }
    }

    class C42636 implements View.OnClickListener {
        final /* synthetic */ C6244c f12043a;

        C42636(C6244c c6244c) {
            this.f12043a = c6244c;
        }

        public final void onClick(View view) {
            if (this.f12043a.f16900a != null) {
                switch (C4278c.m8079b(this.f12043a.f16900a.getCurrentItem())) {
                    case MERGE:
                    case SINGLE:
                    case GROUP:
                    case CHANNEL:
                        C4478a.m8153a(this.f12043a.getActivity(), C4509g.WITH_NEW_SYNC_INVITE);
                        break;
                    case CONTACT:
                        Bundle bundle = new Bundle();
                        bundle.putInt("dialog_id", 318);
                        C6244c.m14452a(this.f12043a, bundle);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    class C42647 implements OnClickListener {
        final /* synthetic */ C6244c f12044a;

        C42647(C6244c c6244c) {
            this.f12044a = c6244c;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (this.f12044a.getActivity() != null) {
                C2837a.m7167a(this.f12044a.getActivity(), "android.permission.RECORD_AUDIO", 189);
            }
        }
    }

    class C42658 implements View.OnClickListener {
        final /* synthetic */ String f12045a;
        final /* synthetic */ String f12046b;
        final /* synthetic */ C6244c f12047c;

        public C42658(C6244c c6244c, String str, String str2) {
            this.f12047c = c6244c;
            this.f12045a = str;
            this.f12046b = str2;
        }

        public final void onClick(View view) {
            if (C4516l.m8232a() && !C2837a.m7170a("android.permission.RECORD_AUDIO")) {
                C4488b.m8185b(this.f12047c.getActivity(), C4522p.m8236a(R.string.record_audio_permission), C4522p.m8236a(R.string.allow_soroush_access_to_your_microphone), C4522p.m8236a(R.string.movafegham), new C42647(this.f12047c), C4522p.m8236a(R.string.felan_na), null);
            } else if (this.f12045a.equals(this.f12046b)) {
                Toast.makeText(this.f12047c.getActivity(), C4522p.m8236a(R.string.you_can_not_call_yourself), 0).show();
            } else {
                C4478a.m8163c(this.f12047c.getActivity(), this.f12045a);
            }
            if (this.f12047c.f16902c != null) {
                this.f12047c.f16902c.dismiss();
            }
        }
    }

    class C42669 implements View.OnClickListener {
        final /* synthetic */ String f12048a;
        final /* synthetic */ C6244c f12049b;

        public C42669(C6244c c6244c, String str) {
            this.f12049b = c6244c;
            this.f12048a = str;
        }

        public final void onClick(View view) {
            C4478a.m8150a(this.f12049b.getActivity(), this.f12048a, false, null, null);
            if (this.f12049b.f16902c != null) {
                this.f12049b.f16902c.dismiss();
            }
        }
    }

    class C62421 implements C0283b {
        final /* synthetic */ C6244c f16897a;

        C62421(C6244c c6244c) {
            this.f16897a = c6244c;
        }

        public final void mo176a() {
            if (this.f16897a.f16903e.m8064a(this.f16897a.f16900a)) {
                this.f16897a.f16904f.m8057a();
            } else {
                C6244c.m14460f(this.f16897a);
            }
        }

        public final void mo177a(C0288e c0288e) {
            this.f16897a.f16900a.m1154a(c0288e.f1033e, false);
            C6244c.m14451a(this.f16897a, c0288e.f1033e);
            C4274a c = this.f16897a.f16909k;
            View b = this.f16897a.f16901b;
            if (c.f12075d != null) {
                C0273d c0273d = (C0273d) c.f12075d.getLayoutParams();
                if (c0273d != null) {
                    Behavior behavior = (Behavior) c0273d.f987a;
                    if (behavior != null) {
                        behavior.mo3571a((CoordinatorLayout) b, c.f12075d, b, 0.0f, -1000.0f, true);
                    }
                }
            }
        }

        public final void mo178b(C0288e c0288e) {
            this.f16897a.f16903e.m8063a(c0288e.f1033e).mo3239b();
            if (this.f16897a.f16903e.m8064a(this.f16897a.f16900a)) {
                this.f16897a.f16904f.m8057a();
            }
        }
    }

    private void m14450a(int i) {
        switch (C4278c.m8079b(i)) {
            case MERGE:
            case SINGLE:
            case GROUP:
            case CHANNEL:
                this.f16904f.m8058a((int) R.drawable.ic_content_add);
                this.f16904f.m8060b();
                return;
            case CONTACT:
                this.f16904f.m8060b();
                this.f16904f.m8058a((int) R.drawable.ic_contact_tab_white_new_design);
                return;
            case EXPLORE:
                m14473b();
                return;
            default:
                return;
        }
    }

    static /* synthetic */ void m14451a(C6244c c6244c, int i) {
        c6244c.f16913o.m8080a(i);
        C4279d b = C4278c.m8079b(i);
        C2776a.m7091a(b.f12095g);
        switch (b) {
            case MERGE:
            case SINGLE:
            case GROUP:
            case CHANNEL:
            case CONTACT:
                c6244c.f16900a.setPagingEnabled(true);
                c6244c.m14450a(i);
                if (c6244c.f16912n) {
                    C4254a c4254a = c6244c.f16904f;
                    Context activity = c6244c.getActivity();
                    c4254a.f12026a.m8764a(null, true);
                    c4254a.f12026a.clearAnimation();
                    c4254a.f12026a.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.fab_scale_up));
                    return;
                }
                c6244c.m14472a();
                return;
            case EXPLORE:
                c6244c.f16900a.setPagingEnabled(false);
                c6244c.f16904f.m8057a();
                c6244c.f16912n = false;
                return;
            default:
                return;
        }
    }

    static /* synthetic */ void m14452a(C6244c c6244c, Bundle bundle) {
        Fragment a = C7176b.m18967a(bundle, c6244c);
        C0401p a2 = ((C7576b) c6244c.getActivity()).m19188c().mo254a();
        a2.mo237a(a, "tag");
        a2.mo244d();
    }

    private void m14458e() {
        if (this.f16905g != null) {
            int a = C2844b.m7200a();
            int d = C2844b.m7205d();
            int c = C2844b.m7204c();
            int b = C2844b.m7203b();
            C4278c c4278c = this.f16913o;
            String str = this.f16908j;
            if (c4278c.f12081a != null) {
                c4278c.f12081a.m8075a(str, a);
            }
            if (c4278c.f12082b != null) {
                c4278c.f12082b.m8075a(str, d);
            }
            if (c4278c.f12083c != null) {
                c4278c.f12083c.m8075a(str, c);
            }
            if (c4278c.f12084d != null) {
                c4278c.f12084d.m8075a(str, b);
            }
        }
    }

    private void m14459f() {
        if (this.f16900a != null) {
            if (this.f16900a.getChildCount() == 1) {
                getActivity().finish();
                return;
            }
            this.f16900a.m1154a(0, false);
        }
    }

    static /* synthetic */ void m14460f(C6244c c6244c) {
        if (c6244c.f16912n && c6244c.f16903e.m8064a(c6244c.f16900a)) {
            C4254a c4254a = c6244c.f16904f;
            Context activity = c6244c.getActivity();
            c4254a.f12026a.clearAnimation();
            c4254a.f12026a.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.fab_scale_down));
        }
    }

    static /* synthetic */ void m14464j(C6244c c6244c) {
        c6244c.f16907i.startActivity(new Intent(c6244c.f16907i, NewConversationContactSelectionListActivity.class));
        c6244c.f16907i.overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
    }

    static /* synthetic */ void m14465k(C6244c c6244c) {
        c6244c.f16907i.startActivity(new Intent(c6244c.f16907i, NewGroupActivity.class));
        c6244c.f16907i.overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
    }

    static /* synthetic */ void m14466l(C6244c c6244c) {
        c6244c.f16907i.startActivity(new Intent(c6244c.f16907i, CreateChannelActivity.class));
        c6244c.f16907i.overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
    }

    static /* synthetic */ void m14467m(C6244c c6244c) {
        c6244c.f16907i.startActivity(new Intent(c6244c.f16907i, NewBulkMessageContactSelectionListActivity.class));
        c6244c.f16907i.overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
    }

    public final Dialog mo2398a(Bundle bundle) {
        C1286a c1286a;
        Activity activity;
        int i;
        int i2 = bundle.getInt("dialog_id");
        if (i2 != 318) {
            switch (i2) {
                case 15:
                    c1286a = new C1286a(this.f16907i);
                    c1286a.f4034f = new OnClickListener(this) {
                        final /* synthetic */ C6244c f12037a;

                        {
                            this.f12037a = r1;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            switch (i) {
                                case R.id.action_new_bulk_message:
                                    C6244c.m14467m(this.f12037a);
                                    return;
                                case R.id.action_new_channel:
                                    C6244c.m14466l(this.f12037a);
                                    return;
                                case R.id.action_new_conversation:
                                    C6244c.m14464j(this.f12037a);
                                    return;
                                case R.id.action_new_group_chat:
                                    C6244c.m14465k(this.f12037a);
                                    return;
                                default:
                                    return;
                            }
                        }
                    };
                    activity = this.f16907i;
                    i = R.menu.menu_bottom_sheet_new_conversation_list;
                    break;
                case 16:
                    c1286a = new C1286a(this.f16907i);
                    c1286a.f4034f = new OnClickListener(this) {
                        final /* synthetic */ C6244c f12038a;

                        {
                            this.f12038a = r1;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            if (i == R.id.action_new_bulk_message) {
                                C6244c.m14467m(this.f12038a);
                            } else if (i == R.id.action_new_conversation) {
                                C6244c.m14464j(this.f12038a);
                            }
                        }
                    };
                    activity = getActivity();
                    i = R.menu.menu_bottom_sheet_new_single_conversation_list;
                    break;
                default:
                    return null;
            }
        }
        c1286a = new C1286a(this.f16907i);
        c1286a.f4034f = new C42592(this);
        activity = getActivity();
        i = R.menu.main_activity_contacts_list_fab_click;
        C4506e.m8204a(activity, c1286a, i);
        return c1286a.m3053a();
    }

    public final void m14472a() {
        if (this.f16904f != null) {
            this.f16912n = true;
            this.f16904f.m8060b();
        }
    }

    public final void m14473b() {
        if (this.f16904f != null) {
            this.f16912n = false;
            this.f16904f.m8057a();
        }
    }

    public final void mo2406b(Activity activity) {
        if (this.f16914p == null || !DrawerLayout.m1440g(this.f16914p.f12059b)) {
            if (this.f16900a != null && this.f16903e.m8064a(this.f16900a)) {
                int i;
                FragmentManager fragmentManager = this.f16903e.f12029b.getFragmentManager();
                String str = "ROOT_EXPLORE_CHANNEL_FRAGMENT_TAG";
                int i2 = 0;
                if (fragmentManager != null) {
                    int backStackEntryCount = fragmentManager.getBackStackEntryCount() - 1;
                    if (backStackEntryCount >= 0) {
                        String name = fragmentManager.getBackStackEntryAt(backStackEntryCount).getName();
                        if (!(name == null || name.equals(str))) {
                            i = 1;
                            if ((i ^ 1) == 0) {
                                i2 = 1;
                            } else {
                                fragmentManager.popBackStackImmediate();
                            }
                            if (i2 != 0) {
                                m14459f();
                                return;
                            }
                        }
                    }
                }
                i = 0;
                if ((i ^ 1) == 0) {
                    fragmentManager.popBackStackImmediate();
                } else {
                    i2 = 1;
                }
                if (i2 != 0) {
                    m14459f();
                    return;
                }
            } else if (this.f16900a == null || this.f16900a.getCurrentItem() <= 0 || this.f16903e.m8064a(this.f16900a)) {
                activity.finish();
            } else {
                m14459f();
                return;
            }
            return;
        }
        this.f16914p.m8068a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2234c(int r5) {
        /*
        r4 = this;
        r0 = r4.f16914p;
        r1 = r4.getActivity();
        r0 = r0.f12060c;
        r5 = r0.getItemViewType(r5);
        r0 = 2130771983; // 0x7f01000f float:1.7147072E38 double:1.052741236E-314;
        r2 = 2130771980; // 0x7f01000c float:1.7147065E38 double:1.0527412344E-314;
        switch(r5) {
            case 101: goto L_0x007e;
            case 102: goto L_0x0076;
            case 103: goto L_0x006e;
            case 104: goto L_0x0058;
            case 105: goto L_0x0015;
            case 106: goto L_0x004f;
            case 107: goto L_0x003c;
            case 108: goto L_0x002f;
            case 109: goto L_0x0015;
            case 110: goto L_0x0024;
            case 111: goto L_0x0017;
            default: goto L_0x0015;
        };
    L_0x0015:
        goto L_0x0088;
    L_0x0017:
        r5 = "ABOUT";
        mobi.mmdt.ott.logic.p355i.p356a.C2827a.m7164a(r5);
        r5 = new android.content.Intent;
        r3 = mobi.mmdt.ott.view.about.SupportActivity.class;
        r5.<init>(r1, r3);
        goto L_0x0048;
    L_0x0024:
        r5 = "CONTACTS";
        mobi.mmdt.ott.logic.p355i.p356a.C2827a.m7164a(r5);
        r5 = mobi.mmdt.ott.view.tools.C4509g.WITH_INVITE;
        mobi.mmdt.ott.view.tools.C4478a.m8153a(r1, r5);
        goto L_0x0088;
    L_0x002f:
        r5 = "SETTINGS";
        mobi.mmdt.ott.logic.p355i.p356a.C2827a.m7164a(r5);
        r5 = new android.content.Intent;
        r3 = mobi.mmdt.ott.view.settings.mainsettings.MainSettingsListActivity.class;
        r5.<init>(r1, r3);
        goto L_0x0048;
    L_0x003c:
        r5 = "CALL";
        mobi.mmdt.ott.logic.p355i.p356a.C2827a.m7164a(r5);
        r5 = new android.content.Intent;
        r3 = mobi.mmdt.ott.view.main.callslist.newdesign.calllog.CallLogActivity.class;
        r5.<init>(r1, r3);
    L_0x0048:
        r1.startActivity(r5);
        r1.overridePendingTransition(r2, r0);
        goto L_0x0088;
    L_0x004f:
        r5 = "STICKER_MARKET";
        mobi.mmdt.ott.logic.p355i.p356a.C2827a.m7164a(r5);
        mobi.mmdt.ott.view.tools.C4478a.m8162c(r1);
        goto L_0x0088;
    L_0x0058:
        r5 = "SERVICES";
        mobi.mmdt.ott.logic.p355i.p356a.C2827a.m7164a(r5);
        r5 = r4.f16900a;
        if (r5 == 0) goto L_0x0088;
    L_0x0061:
        r5 = r4.f16900a;
        r0 = r4.f16903e;
        r0 = r0.f12030c;
        r0 = r0 + -1;
        r1 = 0;
        r5.m1154a(r0, r1);
        goto L_0x0088;
    L_0x006e:
        r5 = "CREATE_CHANNEL";
        mobi.mmdt.ott.logic.p355i.p356a.C2827a.m7164a(r5);
        r5 = mobi.mmdt.ott.view.main.CreateChannelActivity.class;
        goto L_0x0085;
    L_0x0076:
        r5 = "CREATE_GROUP_CONVERSATION";
        mobi.mmdt.ott.logic.p355i.p356a.C2827a.m7164a(r5);
        r5 = mobi.mmdt.ott.view.main.NewGroupActivity.class;
        goto L_0x0085;
    L_0x007e:
        r5 = "START_SINGLE_CONVERSATION";
        mobi.mmdt.ott.logic.p355i.p356a.C2827a.m7164a(r5);
        r5 = mobi.mmdt.ott.view.main.NewConversationContactSelectionListActivity.class;
    L_0x0085:
        mobi.mmdt.ott.view.tools.C4478a.m8142a(r1, r5);
    L_0x0088:
        r5 = r4.f16914p;
        r5.m8068a();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.newdesign.mainpage.c.c(int):void");
    }

    public final void mo2235d(int i) {
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m14458e();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f16907i = getActivity();
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.menu_main_page, menu);
        MenuItem findItem = menu.findItem(R.id.action_search);
        if (findItem != null) {
            SearchView searchView = (SearchView) findItem.getActionView();
            if (searchView != null) {
                ImageView imageView = (ImageView) searchView.findViewById(R.id.search_button);
                imageView.setImageResource(R.drawable.ic_search);
                C2491i.m6801a(imageView, UIThemeManager.getmInstance().getIcon_not_selected_color());
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    final /* synthetic */ C6244c f12035a;

                    {
                        this.f12035a = r1;
                    }

                    public final void onClick(View view) {
                        Activity activity = this.f12035a.getActivity();
                        C6244c c6244c = this.f12035a;
                        C4478a.m8154a(activity, c6244c.f16903e.m8064a(c6244c.f16900a) ^ 1);
                    }
                });
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f16906h = layoutInflater.inflate(R.layout.fragment_main_page, viewGroup, false);
        return this.f16906h;
    }

    public final void onDestroy() {
        super.onDestroy();
        getLoaderManager().destroyLoader(8);
        getLoaderManager().destroyLoader(7);
        getLoaderManager().destroyLoader(22);
        getLoaderManager().destroyLoader(18);
    }

    public final void onEvent(C2843a c2843a) {
        if (this.f16907i != null) {
            this.f16907i.runOnUiThread(new C42603(this));
        }
    }

    public final void onEvent(C2849f c2849f) {
        if (this.f16907i != null) {
            this.f16907i.runOnUiThread(new C42614(this));
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (this.f16914p != null) {
            C4271a c4271a = this.f16914p;
            if (!(c4271a.f12058a == null || c4271a.f12059b == null)) {
                c4271a.f12058a.m1451e(c4271a.f12059b);
            }
        }
        return false;
    }

    public final void onResume() {
        super.onResume();
        this.f16909k.m8070a(this.f16908j);
        MyApplication.m12950a().f15910p.clear();
        MyApplication.m12950a().f15911q = "";
        MyApplication.m12950a().f15908n.clear();
        MyApplication.m12950a().f15906l = new int[MyApplication.f15885k];
        m14458e();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C4257a c4257a = this.f16903e;
        String str = "KEY_CONTACT_LIST_SAVE_INSTANCE_BUNDLE";
        if (c4257a.f12028a != null) {
            C6918b c6918b = c4257a.f12028a;
            Bundle bundle2 = new Bundle();
            bundle2.putInt("KEY_SCROLL_POSITION_IN_BUNDLE", c6918b.f19736a.findFirstVisibleItemPosition());
            bundle.putBundle(str, bundle2);
        }
        if (this.f16900a != null) {
            bundle.putInt("KEY_VIEW_PAGER_CURRENT_TAB_ROTATE", this.f16900a.getCurrentItem());
        }
        c4257a = this.f16903e;
        if (c4257a.f12029b != null) {
            c4257a.f12029b.onSaveInstanceState(bundle);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        int i = 0;
        if (C2778b.m7093a() > C2535a.m6888a().f8278a.getLong("mobi.mmdt.ott.model.pref.KEY_LAST_CHECK_VERSION_CALL", 0) + 86400000) {
            String b = C2535a.m6888a().m6919b();
            if (b.equals("en-us")) {
                b = "en";
            }
            C2808d.m7148b(new C6674a(b));
        }
        this.f16903e = new C4257a();
        if (bundle != null) {
            if (bundle.containsKey("KEY_VIEW_PAGER_CURRENT_TAB_ROTATE")) {
                this.f16911m = bundle.getInt("KEY_VIEW_PAGER_CURRENT_TAB_ROTATE");
            }
            C4257a c4257a = this.f16903e;
            String str = "KEY_CONTACT_LIST_SAVE_INSTANCE_BUNDLE";
            if (bundle.containsKey(str)) {
                C6918b c6918b = c4257a.f12028a;
                bundle = bundle.getBundle(str);
                if (!(bundle == null || c6918b.f19737b == null)) {
                    c6918b.f19737b.scrollToPosition(bundle.getInt("KEY_SCROLL_POSITION_IN_BUNDLE", 0));
                }
            }
        }
        setHasOptionsMenu(true);
        this.f16914p = new C4271a(getActivity(), this);
        C4271a c4271a = this.f16914p;
        if (c4271a.f12059b != null) {
            int text_primary_color = UIThemeManager.getmInstance().getText_primary_color();
            c4271a.f12059b.setItemIconTintList(ColorStateList.valueOf(text_primary_color));
            c4271a.f12059b.setItemTextColor(ColorStateList.valueOf(text_primary_color));
            c4271a.f12059b.setBackgroundColor(UIThemeManager.getmInstance().getRecycler_view_background_color());
            C2491i.m6801a(c4271a.f12064g, UIThemeManager.getmInstance().getAccent_color());
            C2491i.m6801a(c4271a.f12065h, UIThemeManager.getmInstance().getAccent_color());
            c4271a.f12061d.setBackgroundColor(UIThemeManager.getmInstance().getAccent_color());
        }
        this.f16908j = C2535a.m6888a().m6919b();
        this.d = (Toolbar) this.f16906h.findViewById(R.id.toolbar);
        this.f16909k = new C4274a(this.f16906h);
        this.f16910l = this.f16906h.findViewById(R.id.shadow_line_top);
        this.f16901b = (CoordinatorLayout) this.f16906h.findViewById(R.id.main_content);
        m7633a(getActivity());
        this.d.setNavigationIcon((int) R.drawable.ic_menu);
        if (this.d.getNavigationIcon() != null) {
            C2491i.m6790a(this.d.getNavigationIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
        }
        this.f16900a = (NonSwipeableViewPager) this.f16906h.findViewById(R.id.container);
        if (this.f16900a != null) {
            this.f16900a.setOffscreenPageLimit(this.f16903e.f12030c);
            this.f16900a.setAdapter(new C6940a(getFragmentManager(), this.f16903e));
        }
        this.f16905g = (TabLayout) this.f16906h.findViewById(R.id.tabs);
        if (this.f16905g != null) {
            this.f16905g.setupWithViewPager(this.f16900a);
            if (this.f16900a != null) {
                i = this.f16900a.getCurrentItem();
            }
            this.f16913o = new C4278c(this.f16907i, this.f16905g, this.f16903e.f12030c, i);
            C2776a.m7091a(C4278c.m8079b(this.f16911m).f12095g);
            this.f16905g.m543a(new C62421(this));
        }
        this.f16904f = new C4254a(this.f16906h);
        m14450a(this.f16900a.getCurrentItem());
        if (this.f16903e.f12030c == 1) {
            this.f16904f.m8057a();
        }
        this.f16904f.m8059a(new C42636(this));
        UIThemeManager uIThemeManager = UIThemeManager.getmInstance();
        C2491i.m6796a(this.d, uIThemeManager.getPrimary_color());
        C4274a c4274a = this.f16909k;
        UIThemeManager uIThemeManager2 = UIThemeManager.getmInstance();
        C2491i.m6802a(c4274a.f12074c, uIThemeManager2.getText_primary_new_design_color());
        if (c4274a.f12073b != null) {
            c4274a.f12073b.setIndicatorColor(uIThemeManager2.getText_primary_new_design_color());
        }
        if (c4274a.f12072a != null) {
            c4274a.f12072a.setIndicatorColor(uIThemeManager2.getText_primary_new_design_color());
        }
        if (this.f16905g != null) {
            C2491i.m6796a(this.f16905g, uIThemeManager.getPrimary_color());
            this.f16905g.setSelectedTabIndicatorColor(uIThemeManager.getTab_selected_color());
        }
        C2491i.m6797a(this.f16910l, uIThemeManager.getShadow_toolbar_start_gradient_color(), uIThemeManager.getShadow_toolbar_end_gradient_color());
        C7576b c7576b = (C7576b) getActivity();
        if (c7576b != null) {
            c7576b.m20725t();
        }
        getLoaderManager().initLoader(18, null, this.f16915q);
    }
}
