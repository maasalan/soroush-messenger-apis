package mobi.mmdt.ott.view.main.p454c;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.C0401p;
import android.support.v4.app.C0417s.C0416a;
import android.support.v4.app.Fragment;
import android.support.v4.p029a.C0350e;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.cocosw.bottomsheet.C1287c.C1286a;
import com.p072b.p073a.p074a.C1063i;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p105g.C1248f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mobi.mmdt.componentsutils.p232b.C2474a;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.ad.p268a.C2594a;
import mobi.mmdt.ott.logic.p261a.ad.p543b.C6659a;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2651r;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5923q;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6707p;
import mobi.mmdt.ott.logic.p261a.p301l.p548b.C6754a;
import mobi.mmdt.ott.logic.p261a.p301l.p548b.C6755b;
import mobi.mmdt.ott.logic.p261a.p311r.p312a.p313a.C2734f;
import mobi.mmdt.ott.logic.p261a.p311r.p312a.p313a.C5958e;
import mobi.mmdt.ott.logic.p261a.p311r.p312a.p314b.C6772f;
import mobi.mmdt.ott.logic.p261a.p323v.p324a.C2747a;
import mobi.mmdt.ott.logic.p261a.p331y.C6792a;
import mobi.mmdt.ott.logic.p359k.C2837a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p385g.C2978e;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p389k.C3001e;
import mobi.mmdt.ott.provider.p390l.C3004f;
import mobi.mmdt.ott.view.components.p398a.C7176b;
import mobi.mmdt.ott.view.components.p398a.C7176b.C3102a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6072d;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.main.C6232c;
import mobi.mmdt.ott.view.main.C6235e;
import mobi.mmdt.ott.view.main.p454c.C6922a;
import mobi.mmdt.ott.view.main.p454c.p455a.C7210a;
import mobi.mmdt.ott.view.main.p454c.p455a.p457b.C7365a;
import mobi.mmdt.ott.view.main.p459d.C4186a;
import mobi.mmdt.ott.view.main.p459d.p460a.C4185a;
import mobi.mmdt.ott.view.main.p459d.p554b.p555a.C6925a;
import mobi.mmdt.ott.view.main.p459d.p554b.p579b.C7369b;
import mobi.mmdt.ott.view.newdesign.mainpage.C6244c;
import mobi.mmdt.ott.view.newdesign.mainpage.C6244c.C42658;
import mobi.mmdt.ott.view.newdesign.mainpage.C6244c.C42669;
import mobi.mmdt.ott.view.newdesign.mainpage.MainActivity;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4506e;
import mobi.mmdt.ott.view.tools.C4508f;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4516l;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p479c.C4501c;

public final class C6922a extends C6232c implements C0416a<Cursor>, C3102a, C3126i, C4186a, C4185a {
    private View f19756a;
    private ViewGroup f19757b;
    private RecyclerView f19758c;
    private C7210a f19759e;
    private String f19760f;
    private LinearLayout f19761g;
    private FrameLayout f19762h;
    private String f19763i;
    private TextView f19764j;
    private C6244c f19765k;
    private int f19766l;
    private boolean f19767m;
    private int f19768n;
    private LinearLayout f19769o;

    class C41593 implements Runnable {
        final /* synthetic */ C6922a f11893a;

        C41593(C6922a c6922a) {
            this.f11893a = c6922a;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
        }
    }

    class C41604 implements Runnable {
        final /* synthetic */ C6922a f11894a;

        C41604(C6922a c6922a) {
            this.f11894a = c6922a;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
        }
    }

    class C41615 implements Runnable {
        final /* synthetic */ C6922a f11895a;

        C41615(C6922a c6922a) {
            this.f11895a = c6922a;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
        }
    }

    class C41626 implements Runnable {
        final /* synthetic */ C6922a f11896a;

        C41626(C6922a c6922a) {
            this.f11896a = c6922a;
        }

        public final void run() {
            this.f11896a.f19759e.notifyDataSetChanged();
        }
    }

    class C69191 extends C6235e {
        final /* synthetic */ C6922a f19750a;

        C69191(C6922a c6922a) {
            this.f19750a = c6922a;
        }

        public final void mo3236a() {
            C6922a.m17898a(this.f19750a);
        }

        public final void mo3237b() {
            C6922a.m17905b(this.f19750a);
        }
    }

    class C7210a extends C6072d {
        final /* synthetic */ C6922a f19751c;

        C7210a(C6922a c6922a, Activity activity) {
            this.f19751c = c6922a;
            super(activity);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    return new C6925a(this.f16242b, i, viewGroup, this.f19751c);
                default:
                    return null;
            }
        }
    }

    public static C6922a m17893a(int i, C2978e c2978e) {
        Bundle bundle = new Bundle();
        bundle.putInt("KEY_IDENTIFIER", i);
        bundle.putSerializable("KEY_DIALOGTYPE", c2978e);
        C6922a c6922a = new C6922a();
        c6922a.setArguments(bundle);
        return c6922a;
    }

    private void m17894a(int i, String str, String str2, String str3, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 115);
        bundle.putInt("KEY_DIALOG_MENU_RES_ID", i);
        bundle.putString("KEY_DIALOG_USER_NAME", str);
        bundle.putString("KEY_DIALOG_USER_OR_GROUP_ID", str3);
        bundle.putString("KEY_DIALOG_PARTY", str2);
        bundle.putBoolean("KEY_DIALOG_IS_GROUP", z);
        m17902b(bundle);
    }

    static /* synthetic */ void m17896a(String str, boolean z) {
        C6922a.m17897a(z ? C2978e.GROUP : C2978e.SINGLE, str, true);
    }

    private static void m17897a(C2978e c2978e, String str, boolean z) {
        C2808d.m7148b(new C6792a(c2978e, str, z));
    }

    static /* synthetic */ void m17898a(C6922a c6922a) {
        if (c6922a.f19765k != null) {
            c6922a.f19765k.m14472a();
        }
    }

    static /* synthetic */ void m17899a(C6922a c6922a, Bundle bundle) {
        if (bundle.getInt("alert_dialog_conversation_list_fragment_do_action_method") == 164) {
            C1063i c6772f = new C6772f(bundle.getString("KEY_DIALOG_PARTY", ""), bundle.getBoolean("KEY_DIALOG_IS_DELETE_GROUP", false));
            C2808d.m7147a(c6772f);
            C4501c.m8189a().m8192a(c6922a.getActivity(), c6772f);
        }
    }

    static /* synthetic */ void m17900a(C6922a c6922a, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 100);
        bundle.putString("KEY_DIALOG_PARTY", str);
        c6922a.m17902b(bundle);
    }

    static /* synthetic */ void m17901a(C6922a c6922a, String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 102);
        bundle.putBoolean("KEY_DIALOG_IS_DELETE_GROUP", z);
        bundle.putString("KEY_DIALOG_PARTY", str);
        c6922a.m17902b(bundle);
    }

    private void m17902b(Bundle bundle) {
        Fragment a = C7176b.m18967a(bundle, this);
        C0401p a2 = ((C7576b) getActivity()).m19188c().mo254a();
        a2.mo237a(a, "tag");
        a2.mo244d();
    }

    static /* synthetic */ void m17904b(String str, boolean z) {
        C6922a.m17897a(z ? C2978e.GROUP : C2978e.SINGLE, str, false);
    }

    static /* synthetic */ void m17905b(C6922a c6922a) {
        if (c6922a.f19765k != null) {
            c6922a.f19765k.m14473b();
        }
    }

    static /* synthetic */ void m17907b(C6922a c6922a, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 101);
        bundle.putString("KEY_DIALOG_PARTY", str);
        c6922a.m17902b(bundle);
    }

    static /* synthetic */ void m17911c(C6922a c6922a, String str) {
        C1063i c6707p = new C6707p(str);
        C2808d.m7147a(c6707p);
        C4501c.m8189a().m8192a(c6922a.getActivity(), c6707p);
    }

    public static C6922a m17913d() {
        Bundle bundle = new Bundle();
        bundle.putInt("KEY_IDENTIFIER", 8);
        C6922a c6922a = new C6922a();
        c6922a.setArguments(bundle);
        return c6922a;
    }

    private void onLeaveAndDeleteChannelPressed(String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 200);
        bundle.putString("KEY_DIALOG_PARTY", str);
        bundle.putBoolean("KEY_IS_BOT", z);
        m17902b(bundle);
    }

    public final Dialog mo2398a(final Bundle bundle) {
        try {
            int i = bundle.getInt("dialog_id");
            final String string = bundle.getString("KEY_DIALOG_PARTY", "");
            if (i == 82) {
                OnClickListener anonymousClass15 = new OnClickListener(this) {
                    final /* synthetic */ C6922a f11886a;

                    {
                        this.f11886a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C2837a.m7167a(this.f11886a.getActivity(), "android.permission.RECORD_AUDIO", 186);
                    }
                };
                return C4488b.m8182a(getActivity(), C4522p.m8236a(R.string.record_audio_permission), C4522p.m8236a(R.string.allow_soroush_access_to_your_microphone), C4522p.m8236a(R.string.ok_cap), anonymousClass15, C4522p.m8236a(R.string.cancel), null);
            } else if (i == 108) {
                return C4488b.m8181a(getActivity(), C4522p.m8236a(R.string.are_you_sure_to_clear_history_of_this_bot), C4522p.m8236a(R.string.action_clear_history), new OnClickListener(this) {
                    final /* synthetic */ C6922a f11880b;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C2808d.m7148b(new C6754a(string));
                    }
                }, C4522p.m8236a(R.string.cancel), null);
            } else if (i == 115) {
                i = bundle.getInt("KEY_DIALOG_MENU_RES_ID");
                r2 = bundle.getString("KEY_DIALOG_USER_NAME", "");
                if (this.f19760f.equals("fa")) {
                    r2 = C2491i.m6814b((String) r2);
                }
                r3 = new C1286a(getActivity());
                r3.f4031c = r2;
                r3.f4034f = new OnClickListener(this) {
                    final /* synthetic */ C6922a f11904c;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        switch (i) {
                            case R.id.action_clear_history:
                                C6922a.m17907b(this.f11904c, string);
                                return;
                            case R.id.action_delete_chat:
                                C6922a.m17900a(this.f11904c, string);
                                return;
                            case R.id.action_leave_and_delete:
                                C6922a.m17901a(this.f11904c, string, true);
                                return;
                            case R.id.action_leave_group:
                                C6922a.m17901a(this.f11904c, string, false);
                                return;
                            case R.id.action_pin_chat:
                                C6922a.m17896a(bundle.getString("KEY_DIALOG_USER_OR_GROUP_ID", ""), bundle.getBoolean("KEY_DIALOG_IS_GROUP", false));
                                return;
                            case R.id.action_unpin_chat:
                                C6922a.m17904b(bundle.getString("KEY_DIALOG_USER_OR_GROUP_ID", ""), bundle.getBoolean("KEY_DIALOG_IS_GROUP", false));
                                return;
                            default:
                                return;
                        }
                    }
                };
                C4506e.m8204a(getActivity(), r3, i);
                return r3.m3053a();
            } else if (i != 317) {
                switch (i) {
                    case 100:
                        return C4488b.m8181a(getActivity(), C4522p.m8236a(R.string.are_you_sure_to_delete_this_conversation), C4522p.m8236a(R.string.action_delete), new OnClickListener(this) {
                            final /* synthetic */ C6922a f11876b;

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                C2808d.m7147a(new C6755b(string));
                            }
                        }, C4522p.m8236a(R.string.cancel), null);
                    case 101:
                        return C4488b.m8181a(getActivity(), C4522p.m8236a(R.string.are_you_sure_to_clear_history_of_this_conversation), C4522p.m8236a(R.string.action_clear_history), new OnClickListener(this) {
                            final /* synthetic */ C6922a f11878b;

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                C2808d.m7148b(new C6754a(string));
                            }
                        }, C4522p.m8236a(R.string.cancel), null);
                    case 102:
                        if (bundle.getBoolean("KEY_DIALOG_IS_DELETE_GROUP", false)) {
                            r0 = C4522p.m8236a(R.string.are_you_sure_to_leave_and_delete_this_conversation);
                            string = C4522p.m8236a(R.string.action_leave_and_delete);
                        } else {
                            r0 = C4522p.m8236a(R.string.are_you_sure_to_leave_this_conversation);
                            string = C4522p.m8236a(R.string.action_leave_group);
                        }
                        return C4488b.m8181a(getActivity(), r0, string, new OnClickListener(this) {
                            final /* synthetic */ C6922a f11882b;

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                bundle.putInt("alert_dialog_conversation_list_fragment_do_action_method", 164);
                                C6922a.m17899a(this.f11882b, bundle);
                            }
                        }, C4522p.m8236a(R.string.cancel), null);
                    default:
                        switch (i) {
                            case 200:
                                final boolean z = bundle.getBoolean("KEY_IS_BOT");
                                return C4488b.m8181a(getActivity(), C4522p.m8236a(R.string.are_you_sure_to_leave_and_delete_this_channel), C4522p.m8236a(R.string.action_leave_and_delete_channel), new OnClickListener(this) {
                                    final /* synthetic */ C6922a f11892c;

                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        if (z) {
                                            C2808d.m7147a(new C6755b(string));
                                        } else {
                                            C6922a.m17911c(this.f11892c, string);
                                        }
                                    }
                                }, C4522p.m8236a(R.string.cancel), null);
                            case 201:
                                i = bundle.getInt("KEY_BOTTOM_SHEET_CHANNELS_MENU_RES_ID");
                                r2 = bundle.getString("KEY_BOTTOM_SHEET_CHANNELS_USER_NAME", "");
                                final boolean z2 = bundle.getBoolean("KEY_IS_BOT");
                                if (this.f19760f.equals("fa")) {
                                    r2 = C2491i.m6814b((String) r2);
                                }
                                C1286a c1286a = new C1286a(getActivity());
                                c1286a.f4031c = r2;
                                c1286a.f4034f = new OnClickListener(this) {
                                    final /* synthetic */ C6922a f11889c;

                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        switch (i) {
                                            case R.id.action_clear_history:
                                                C6922a.m17907b(this.f11889c, string);
                                                return;
                                            case R.id.action_leave_and_delete:
                                                this.f11889c.onLeaveAndDeleteChannelPressed(string, z2);
                                                return;
                                            case R.id.action_pin_channel:
                                                C6922a.m17897a(C2978e.CHANNEL, string, true);
                                                return;
                                            case R.id.action_pin_channel_admin_owner:
                                                C6922a.m17897a(C2978e.CHANNEL, string, true);
                                                return;
                                            case R.id.action_unpin_channel:
                                                C6922a.m17897a(C2978e.CHANNEL, string, false);
                                                return;
                                            case R.id.action_unpin_channel_admin_owner:
                                                C6922a.m17897a(C2978e.CHANNEL, string, false);
                                                return;
                                            default:
                                                return;
                                        }
                                    }
                                };
                                C4506e.m8204a(getActivity(), c1286a, i);
                                return c1286a.m3053a();
                            default:
                                return ((MainActivity) getActivity()).mo2299a(bundle);
                        }
                }
            } else {
                r0 = bundle.getString("KEY_DIALOG_LAST_POSITION", "");
                CharSequence string2 = bundle.getString("KEY_DIALOG_NAME", "");
                if (this.f19760f.equals("fa")) {
                    string2 = C2491i.m6814b((String) string2);
                }
                final String string3 = bundle.getString("KEY_DIALOG_USER_NAME", "");
                r3 = new C1286a(getActivity());
                r3.f4038j = C2491i.m6806b(getActivity(), string3);
                r3.f4031c = string2;
                r3.f4034f = new OnClickListener(this) {
                    final /* synthetic */ C6922a f11885c;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (i != R.id.action_free_call) {
                            if (i == R.id.action_start_a_conversation) {
                                C4478a.m8150a(this.f11885c.getActivity(), string3, false, null, r0);
                            }
                        } else if (!C2474a.m6718b(this.f11885c.getActivity())) {
                            Toast.makeText(this.f11885c.getActivity(), C4522p.m8236a(R.string.connection_error_message), 0).show();
                        } else if (C4516l.m8232a() && !C2837a.m7170a("android.permission.RECORD_AUDIO")) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("dialog_id", 82);
                            this.f11885c.m17902b(bundle);
                        } else if (string3.equals(this.f11885c.f19763i)) {
                            Toast.makeText(this.f11885c.getActivity(), C4522p.m8236a(R.string.you_can_not_call_yourself), 0).show();
                        } else {
                            C4478a.m8163c(this.f11885c.getActivity(), string3);
                        }
                    }
                };
                C4506e.m8204a(getActivity(), r3, R.menu.context_menu_contacts_list_long_click);
                return r3.m3053a();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ((MainActivity) getActivity()).mo2299a(bundle);
        }
    }

    public final C0350e<Cursor> mo2226a(int i, Bundle bundle) {
        C2978e[] c2978eArr;
        C0350e<Cursor> c0350e;
        if (i == 8) {
            c2978eArr = new C2978e[0];
        } else if (i == 44) {
            c2978eArr = new C2978e[]{C2978e.SINGLE};
        } else if (i == 46) {
            c2978eArr = new C2978e[]{C2978e.GROUP};
        } else if (i != 48) {
            c0350e = null;
            this.f19768n = i;
            return c0350e;
        } else {
            c2978eArr = new C2978e[]{C2978e.CHANNEL, C2978e.BOT};
        }
        c0350e = C2980g.m7435a(c2978eArr);
        this.f19768n = i;
        return c0350e;
    }

    public final void mo2227a() {
        if (this.f19759e != null) {
            this.f19759e.m13684c(null);
        }
    }

    public final /* synthetic */ void mo2228a(C0350e c0350e, Object obj) {
        Cursor cursor = (Cursor) obj;
        if (this.f19759e != null) {
            this.f19759e.m13684c(cursor);
            int b = this.f19759e.m13682b();
            if (b > 0) {
                if (c0350e.f1301n == 8) {
                    if (!this.f19767m && b < 10) {
                        C2808d.m7147a(new C6659a());
                    }
                    this.f19767m = true;
                }
                this.f19761g.setVisibility(8);
                return;
            }
            this.f19761g.setVisibility(0);
            this.f19762h.setVisibility(0);
            return;
        }
        this.f19761g.setVisibility(0);
    }

    public final void mo3242a(C6829g c6829g) {
        C7365a c7365a = (C7365a) c6829g;
        C2978e c2978e = c7365a.f20831y;
        StringBuilder stringBuilder = new StringBuilder("}}}}}} lastPosition getMessageIdLastPosition   lastPosition:  ");
        stringBuilder.append(c7365a.f21391r);
        C2480b.m6742f(stringBuilder.toString());
        if (c2978e == null) {
            Toast.makeText(getActivity(), "NO TYPE", 0).show();
            return;
        }
        String str = c7365a.f21391r;
        if (c2978e == C2978e.SINGLE) {
            C4478a.m8150a(getActivity(), c7365a.f20832z, false, null, str);
        } else if (c2978e == C2978e.GROUP) {
            C4478a.m8160b(getActivity(), c7365a.f20832z, false, null, str);
        } else if (c2978e == C2978e.CHANNEL) {
            C4478a.m8144a(getActivity(), c7365a.f20832z, null, str);
        } else {
            if (c2978e == C2978e.BOT) {
                C4478a.m8159b(getActivity(), c7365a.f20832z, null, str);
            }
        }
    }

    public final void mo3239b() {
        if (this.f19758c != null) {
            this.f19758c.scrollToPosition(0);
        }
    }

    public final void mo3243b(C6829g c6829g) {
        C7365a c7365a = (C7365a) c6829g;
        C2978e c2978e = c7365a.f20831y;
        boolean z = c7365a.f21390q;
        String str = c7365a.f21378c;
        if (c2978e == null) {
            Toast.makeText(getActivity(), "NO TYPE", 0).show();
        } else if (c2978e == C2978e.SINGLE) {
            String str2 = c7365a.f20832z;
            m17894a(z ? R.menu.context_menu_conversations_list_long_click_with_unpin_option : R.menu.context_menu_conversations_list_long_click_with_pin_option, str, str2, str2, false);
        } else if (c2978e == C2978e.GROUP) {
            String str3 = c7365a.f20832z;
            m17894a(z ? R.menu.context_menu_conversations_list_group_long_click_with_unpin_option : R.menu.context_menu_conversations_list_group_long_click_with_pin_option, c7365a.f21378c, str3, str3, true);
        } else {
            if (c2978e == C2978e.CHANNEL || c2978e == C2978e.BOT) {
                int i;
                String str4 = c7365a.f21378c;
                str = c7365a.f20832z;
                C3004f c3004f = c7365a.f21393t;
                Bundle bundle = new Bundle();
                if (c2978e == C2978e.CHANNEL) {
                    bundle.putBoolean("KEY_IS_BOT", false);
                    i = z ? R.menu.context_menu_channels_list_long_click_with_unpin_option : R.menu.context_menu_channels_list_long_click_with_pin_option;
                    if (c3004f == C3004f.ADMIN || c3004f == C3004f.OWNER) {
                        i = z ? R.menu.context_menu_channels_admin_owner_list_long_click_with_unpin_option : R.menu.context_menu_channels_admin_owner_list_long_click_with_pin_option;
                    }
                } else {
                    bundle.putBoolean("KEY_IS_BOT", true);
                    i = z ? R.menu.context_menu_bot_list_long_click_with_unpin_option : R.menu.context_menu_bot_list_long_click_with_pin_option;
                }
                bundle.putInt("dialog_id", 201);
                bundle.putInt("KEY_BOTTOM_SHEET_CHANNELS_MENU_RES_ID", i);
                bundle.putString("KEY_BOTTOM_SHEET_CHANNELS_USER_NAME", str4);
                bundle.putString("KEY_DIALOG_PARTY", str);
                m17902b(bundle);
            }
        }
    }

    public final void mo2234c(int i) {
    }

    public final void mo3244c(C6829g c6829g) {
        C6244c c6244c = this.f19765k;
        C7369b c7369b = (C7369b) c6829g;
        if (c7369b != null) {
            Activity activity = c6244c.getActivity();
            String d = C2535a.m6888a().m6928d();
            String b = C2535a.m6888a().m6919b();
            Object obj = c7369b.f21432c;
            CharSequence charSequence = c7369b.f21430a;
            String str = c7369b.f21433d;
            Builder builder = new Builder(activity, R.style.AppCompatAlertDialogStyle);
            View inflate = activity.getLayoutInflater().inflate(R.layout.dialog_suggest_contact, null);
            View view = (RoundAvatarImageView) inflate.findViewById(R.id.imageView);
            view.setBackgroundColor(c7369b.f21436g);
            TextView textView = (TextView) inflate.findViewById(R.id.name_textView);
            TextView textView2 = (TextView) inflate.findViewById(R.id.motto_textView);
            ((TextView) inflate.findViewById(R.id.call)).setOnClickListener(new C42658(c6244c, str, d));
            ((TextView) inflate.findViewById(R.id.send_message)).setOnClickListener(new C42669(c6244c, str));
            if (b.equals("fa")) {
                obj = C2491i.m6814b((String) obj);
                charSequence = C2491i.m6814b((String) charSequence);
            }
            if (obj == null || obj.isEmpty()) {
                textView.setVisibility(8);
            } else {
                textView.setText(obj);
            }
            if (charSequence == null || charSequence.isEmpty()) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequence);
            }
            view.setImageBitmap(null);
            String str2 = c7369b.f21434e;
            if (str2 == null || str2.isEmpty()) {
                C1212c.m2872a(activity).m10953a(view);
            } else {
                C1212c.m2872a(activity).m10950a(C4515k.m8231a(C2556b.m6998a(str2))).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a)).m3031a((ImageView) view);
            }
            int b2 = C2491i.m6806b(MyApplication.m12952b(), d);
            view.setName(obj);
            view.setBackgroundColor(b2);
            builder.setView(inflate);
            c6244c.f16902c = builder.create();
            c6244c.f16902c.show();
        }
    }

    public final void mo2235d(int i) {
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments().containsKey("KEY_IDENTIFIER")) {
            this.f19766l = getArguments().getInt("KEY_IDENTIFIER");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f19756a = layoutInflater.inflate(R.layout.fragment_conversations_list, viewGroup, false);
        return this.f19756a;
    }

    public final void onEvent(final C2594a c2594a) {
        final Activity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable(this) {
                final /* synthetic */ C6922a f11901c;

                public final void run() {
                    if (this.f11901c.f19769o != null) {
                        ArrayList arrayList = c2594a.f8449a;
                        if (arrayList != null) {
                            if (arrayList.size() > 0) {
                                boolean z = false;
                                this.f11901c.f19769o.setVisibility(0);
                                LayoutManager linearLayoutManager = new LinearLayoutManager(activity, 0, false);
                                RecyclerView recyclerView = (RecyclerView) this.f11901c.f19756a.findViewById(R.id.recycler_view_suggest_contact);
                                TextView textView = (TextView) this.f11901c.f19756a.findViewById(R.id.title);
                                textView.setTypeface(textView.getTypeface(), 1);
                                Adapter c7210a = new C7210a(this.f11901c, activity);
                                recyclerView.setHasFixedSize(true);
                                recyclerView.setAdapter(c7210a);
                                recyclerView.setLayoutManager(linearLayoutManager);
                                List arrayList2 = new ArrayList();
                                Iterator it = arrayList.iterator();
                                loop0:
                                while (true) {
                                    boolean z2 = z;
                                    while (it.hasNext()) {
                                        C3001e c3001e = (C3001e) it.next();
                                        if (c3001e != null) {
                                            boolean z3 = c3001e.f9422h;
                                            String a = z3 ? C4508f.m8221a(c3001e.f9425k, c3001e.f9420f) : C4508f.m8220a(c3001e.f9416b);
                                            int b = C2491i.m6806b(activity, c3001e.f9418d);
                                            String str = c3001e.f9426l;
                                            String str2 = c3001e.f9418d;
                                            String str3 = c3001e.f9429o;
                                            String uri = c3001e.f9427m != null ? c3001e.f9427m.toString() : null;
                                            String str4 = c3001e.f9433s;
                                            z = z2 + 1;
                                            arrayList2.add(new C7369b(a, str, str2, str3, z3, uri, b, str4, z2));
                                        }
                                    }
                                    break loop0;
                                }
                                c7210a.m13665a(arrayList2);
                            }
                        }
                        this.f11901c.f19769o.setVisibility(8);
                        return;
                    }
                    this.f11901c.f19759e.notifyDataSetChanged();
                }
            });
        }
    }

    public final void onEvent(C5923q c5923q) {
        if (getActivity() != null) {
            getActivity().runOnUiThread(new C41604(this));
        }
    }

    public final void onEvent(C2651r c2651r) {
        if (getActivity() != null) {
            getActivity().runOnUiThread(new C41593(this));
        }
    }

    public final void onEvent(final C5958e c5958e) {
        if (getActivity() != null) {
            getActivity().runOnUiThread(new Runnable(this) {
                final /* synthetic */ C6922a f11898b;

                public final void run() {
                    C4501c.m8189a().m8193b();
                    C4513i.m8228a(this.f11898b.getActivity(), c5958e.f8890a);
                }
            });
        }
    }

    public final void onEvent(C2734f c2734f) {
        if (getActivity() != null) {
            getActivity().runOnUiThread(new C41615(this));
        }
    }

    public final void onEvent(C2747a c2747a) {
        if (getActivity() != null && this.f19757b != null && this.f19759e != null) {
            getActivity().runOnUiThread(new C41626(this));
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f19769o = (LinearLayout) this.f19756a.findViewById(R.id.root_suggest_contact);
        this.f19761g = (LinearLayout) view.findViewById(R.id.empty_state_linearLayout);
        this.f19762h = (FrameLayout) view.findViewById(R.id.empty_state_frameLayout_image);
        this.f19764j = (TextView) view.findViewById(R.id.empty_state_textView);
        this.f19757b = (ViewGroup) view.findViewById(R.id.root_relativeLayout);
        this.f19758c = (RecyclerView) view.findViewById(R.id.recycler_view_conversation_list);
        this.f19759e = new C7210a(getActivity(), this.f19768n, this, this);
        this.f19760f = C2535a.m6888a().m6919b();
        this.f19763i = C2535a.m6888a().m6928d();
        this.f19765k = (C6244c) getActivity().getFragmentManager().findFragmentByTag("tag_main_page_fragment");
        this.f19758c.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f19758c.setHasFixedSize(true);
        this.f19758c.setAdapter(this.f19759e);
        this.f19758c.clearOnScrollListeners();
        this.f19758c.setItemAnimator(null);
        this.f19758c.addOnScrollListener(new C69191(this));
        C2491i.m6786a(getActivity(), this.f19762h);
        C2491i.m6802a(this.f19764j, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6796a(this.f19769o, UIThemeManager.getmInstance().getFrame_view_color());
        ((C7576b) getActivity()).m19190e().mo268a(this.f19766l, new Bundle(), this);
    }
}
