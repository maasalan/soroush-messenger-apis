package mobi.mmdt.ott.view.channel.addmembers;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.C6389b.C0663a;
import android.support.v7.app.C7406c;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.cocosw.bottomsheet.C1287c.C1286a;
import com.p072b.p073a.p074a.C1063i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p298k.C6737b;
import mobi.mmdt.ott.logic.p261a.p298k.C6744i;
import mobi.mmdt.ott.logic.p261a.p298k.C6745j;
import mobi.mmdt.ott.logic.p261a.p298k.C6747l;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2696b;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2697d;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2703o;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2704q;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2708w;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5939c;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5945p;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5947v;
import mobi.mmdt.ott.logic.p261a.p298k.p300b.C2711a;
import mobi.mmdt.ott.logic.p261a.p298k.p300b.C2712b;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p390l.C3004f;
import mobi.mmdt.ott.view.channel.addmembers.p397a.C6823a;
import mobi.mmdt.ott.view.channel.addmembers.p563b.C7173a;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6074f;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.conversation.editchannelinfo.AddChannelMemberContactSelectionListActivity;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4506e;
import mobi.mmdt.ott.view.tools.C4508f;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p479c.C4501c;

public class ManageFollowersActivity extends C7576b implements C3091a, C3101a, C3126i {
    public static String f23946m = "";
    private boolean f23947A = true;
    private boolean f23948B = false;
    private boolean f23949C = false;
    private ProgressWheel f23950D;
    final ArrayList<C6829g> f23951n = new ArrayList();
    private int f23952o = 20;
    private int f23953p = 0;
    private RecyclerView f23954q;
    private LinearLayoutManager f23955r;
    private C6822a f23956s;
    private LinearLayout f23957t;
    private String f23958u;
    private boolean f23959v;
    private boolean f23960w;
    private String f23961z;

    class C30791 implements OnClickListener {
        final /* synthetic */ ManageFollowersActivity f9609a;

        C30791(ManageFollowersActivity manageFollowersActivity) {
            this.f9609a = manageFollowersActivity;
        }

        public final void onClick(View view) {
            this.f9609a.f23949C = true;
            ManageFollowersActivity.m21010a(this.f9609a);
        }
    }

    class C30824 implements Runnable {
        final /* synthetic */ ManageFollowersActivity f9614a;

        C30824(ManageFollowersActivity manageFollowersActivity) {
            this.f9614a = manageFollowersActivity;
        }

        public final void run() {
            this.f9614a.f23951n.clear();
            this.f9614a.f23953p = 0;
            this.f9614a.mo3643g();
        }
    }

    class C30857 implements Runnable {
        final /* synthetic */ ManageFollowersActivity f9619a;

        C30857(ManageFollowersActivity manageFollowersActivity) {
            this.f9619a = manageFollowersActivity;
        }

        public final void run() {
            this.f9619a.f23956s.m13673a(this.f9619a.f23951n);
        }
    }

    class C30868 implements Runnable {
        final /* synthetic */ ManageFollowersActivity f9620a;

        C30868(ManageFollowersActivity manageFollowersActivity) {
            this.f9620a = manageFollowersActivity;
        }

        public final void run() {
            this.f9620a.f23956s.m13673a(this.f9620a.f23951n);
            Snackbar.m8770a(this.f9620a.f23957t, C4522p.m8236a(R.string.user_removed_from_channel), -1).m572a();
        }
    }

    class C30879 implements OnClickListener {
        final /* synthetic */ ManageFollowersActivity f9621a;

        C30879(ManageFollowersActivity manageFollowersActivity) {
            this.f9621a = manageFollowersActivity;
        }

        public final void onClick(View view) {
            this.f9621a.f23949C = false;
            ManageFollowersActivity.m21010a(this.f9621a);
        }
    }

    public class C6822a extends C6074f {
        final /* synthetic */ ManageFollowersActivity f19478a;

        public C6822a(ManageFollowersActivity manageFollowersActivity, Context context) {
            this.f19478a = manageFollowersActivity;
            super(context);
        }

        public final void mo3181a(C6073e c6073e, int i) {
            C7173a c7173a = (C7173a) ((C6829g) this.c.get(i));
            if (this.f19478a.f23960w || i != this.f19478a.f23951n.size() - 1) {
                c7173a.f20632i = false;
            } else {
                c7173a.f20632i = true;
                this.f19478a.mo3643g();
            }
            super.mo3181a(c6073e, i);
        }

        public final /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
            mo3181a((C6073e) viewHolder, i);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i != 1) {
                return null;
            }
            return new C6823a(ManageFollowersActivity.m21031p(this.f19478a), this.f19478a, this.f16246b, viewGroup, this.f19478a);
        }
    }

    static /* synthetic */ void m21010a(ManageFollowersActivity manageFollowersActivity) {
        if (manageFollowersActivity.f23947A) {
            manageFollowersActivity.f23947A = false;
            manageFollowersActivity.f23948B = true;
            final C1063i c6745j = new C6745j(manageFollowersActivity.f23961z, manageFollowersActivity.f23949C);
            C2808d.m7148b(c6745j);
            manageFollowersActivity.runOnUiThread(new Runnable(manageFollowersActivity) {
                final /* synthetic */ ManageFollowersActivity f9596b;

                public final void run() {
                    C4501c.m8189a().m8192a(ManageFollowersActivity.m21014b(this.f9596b), c6745j);
                }
            });
        }
    }

    static /* synthetic */ void m21011a(ManageFollowersActivity manageFollowersActivity, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 54);
        bundle.putString("KEY_DIALOG_MANAGE_FOLLOWERS_USER_ID", str);
        manageFollowersActivity.b_(bundle);
    }

    static /* synthetic */ void m21012a(ManageFollowersActivity manageFollowersActivity, String str, C3004f c3004f) {
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 53);
        bundle.putString("KEY_DIALOG_MANAGE_FOLLOWERS_USER_ID", str);
        bundle.putSerializable("KEY_DIALOG_MANAGE_FOLLOWERS_ENUM_TYPE", c3004f);
        manageFollowersActivity.b_(bundle);
    }

    static /* synthetic */ C7406c m21014b(ManageFollowersActivity manageFollowersActivity) {
        return manageFollowersActivity;
    }

    static /* synthetic */ C7406c m21019e(ManageFollowersActivity manageFollowersActivity) {
        return manageFollowersActivity;
    }

    private void m21023h() {
        C2808d.m7148b(new C6744i(this.f23961z, this.f23953p, this.f23952o));
    }

    static /* synthetic */ C7406c m21026k(ManageFollowersActivity manageFollowersActivity) {
        return manageFollowersActivity;
    }

    static /* synthetic */ C7406c m21029n(ManageFollowersActivity manageFollowersActivity) {
        return manageFollowersActivity;
    }

    static /* synthetic */ C7406c m21030o(ManageFollowersActivity manageFollowersActivity) {
        return manageFollowersActivity;
    }

    static /* synthetic */ C7406c m21031p(ManageFollowersActivity manageFollowersActivity) {
        return manageFollowersActivity;
    }

    public final Dialog mo2299a(Bundle bundle) {
        int i = bundle.getInt("dialog_id");
        if (i != 333) {
            final String string;
            switch (i) {
                case 53:
                    C3004f c3004f = (C3004f) bundle.get("KEY_DIALOG_MANAGE_FOLLOWERS_ENUM_TYPE");
                    string = bundle.getString("KEY_DIALOG_MANAGE_FOLLOWERS_USER_ID", "");
                    C0663a c0663a = new C0663a(this, R.style.AppCompatAlertDialogStyle);
                    c0663a.m1608a(C4522p.m8236a(R.string.select_user_access_level));
                    View inflate = getLayoutInflater().inflate(R.layout.dialog_user_access_level_selection, null);
                    final RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.radioGroup);
                    RadioButton radioButton = (RadioButton) inflate.findViewById(R.id.radioButton1);
                    RadioButton radioButton2 = (RadioButton) inflate.findViewById(R.id.radioButton2);
                    C2491i.m6782a(UIThemeManager.getmInstance().getAccent_color(), radioButton, radioButton2);
                    radioButton.setText(C4522p.m8236a(R.string.channel_admin_change_role));
                    radioButton2.setText(C4522p.m8236a(R.string.channel_member_change_role));
                    if (c3004f == C3004f.ADMIN) {
                        radioButton.setChecked(true);
                    } else {
                        radioButton2.setChecked(true);
                    }
                    c0663a.m1614b(C4522p.m8236a(R.string.cancel_cap), null);
                    c0663a.m1607a(inflate);
                    c0663a.m1609a(C4522p.m8236a(R.string.action_change), new DialogInterface.OnClickListener(this) {
                        final /* synthetic */ ManageFollowersActivity f9608c;

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                            C3004f c3004f = C3004f.MEMBER;
                            switch (checkedRadioButtonId) {
                                case R.id.radioButton1:
                                    c3004f = C3004f.ADMIN;
                                    break;
                                case R.id.radioButton2:
                                    c3004f = C3004f.MEMBER;
                                    break;
                                default:
                                    break;
                            }
                            C2808d.m7148b(new C6737b(this.f9608c.f23961z, string, c3004f));
                        }
                    });
                    Dialog a = c0663a.m1612a();
                    a.show();
                    a.m15114a(-2).setTextColor(UIThemeManager.getmInstance().getAccent_color());
                    a.m15114a(-1).setTextColor(UIThemeManager.getmInstance().getAccent_color());
                    return a;
                case 54:
                    string = bundle.getString("KEY_DIALOG_MANAGE_FOLLOWERS_USER_ID", "");
                    return C4488b.m8181a(this, C4522p.m8236a(R.string.are_you_sure_to_remove_this_follower), C4522p.m8236a(R.string.ok_cap), new DialogInterface.OnClickListener(this) {
                        final /* synthetic */ ManageFollowersActivity f9611b;

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C2808d.m7148b(new C6747l(this.f9611b.f23961z, string));
                        }
                    }, C4522p.m8236a(R.string.cancel), null);
                default:
                    return null;
            }
        }
        final String string2 = bundle.getString("KEY_DIALOG_MANAGE_FOLLOWERS_USER_ID");
        bundle.getBoolean("KEY_BOTTOM_SHEET_ADD_FOLLOWERS_ADDED_ME");
        final C3004f c3004f2 = (C3004f) bundle.get("KEY_DIALOG_MANAGE_FOLLOWERS_ENUM_TYPE");
        C1286a c1286a = new C1286a(this);
        c1286a.f4034f = new DialogInterface.OnClickListener(this) {
            final /* synthetic */ ManageFollowersActivity f9605c;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (string2 != null && string2.equals(this.f9605c.f23958u)) {
                    Snackbar.m8770a(this.f9605c.f23957t, C4522p.m8236a(R.string.you_cannot_change_your_membership_status_yourself), -1).m572a();
                } else if (i == R.id.action_change_role) {
                    ManageFollowersActivity.m21012a(this.f9605c, string2, c3004f2);
                } else if (i == R.id.action_remove_from_group) {
                    ManageFollowersActivity.m21011a(this.f9605c, string2);
                }
            }
        };
        C4506e.m8204a(this, c1286a, R.menu.menu_bottom_sheet_channel_member_long_click);
        return c1286a.m3053a();
    }

    public final void mo3645a(C7173a c7173a) {
        C4478a.m8149a((Activity) this, c7173a.f20626c, true);
    }

    public final void mo3646b(C7173a c7173a) {
        String str = c7173a.f20625b;
        Serializable serializable = c7173a.f20631h;
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 333);
        bundle.putString("KEY_DIALOG_MANAGE_FOLLOWERS_USER_ID", str);
        bundle.putBoolean("KEY_BOTTOM_SHEET_ADD_FOLLOWERS_ADDED_ME", true);
        bundle.putSerializable("KEY_DIALOG_MANAGE_FOLLOWERS_ENUM_TYPE", serializable);
        b_(bundle);
    }

    public final void mo2234c(int i) {
    }

    public final void mo2235d(int i) {
    }

    public final void mo3643g() {
        if (!this.f23959v) {
            if (this.f23953p == 0) {
                this.f23950D.setVisibility(0);
            }
            this.f23959v = true;
            m21023h();
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_manage_follower);
        if (getIntent().getExtras().containsKey("KEY_CHANNEL_ID")) {
            this.f23961z = getIntent().getExtras().getString("KEY_CHANNEL_ID");
        }
        this.f23958u = C2535a.m6888a().m6928d();
        this.f23956s = new C6822a(this, this);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        this.y = findViewById(R.id.shadow_line_top);
        this.f23957t = (LinearLayout) findViewById(R.id.root_layout);
        View view = (LinearLayout) findViewById(R.id.root_member_linear_layout);
        View view2 = (LinearLayout) findViewById(R.id.root_button_linear_layout);
        TextView textView = (TextView) findViewById(R.id.add_administrator_textView);
        TextView textView2 = (TextView) findViewById(R.id.members_count_textView);
        TextView textView3 = (TextView) findViewById(R.id.add_follower_textView);
        this.f23954q = (RecyclerView) findViewById(R.id.recycler_view);
        this.f23950D = (ProgressWheel) findViewById(R.id.progress_wheel);
        if (this.f23954q != null) {
            this.f23954q.setHasFixedSize(true);
            this.f23954q.setNestedScrollingEnabled(false);
            this.f23954q.setAdapter(this.f23956s);
            this.f23955r = new LinearLayoutManager(this);
            this.f23954q.setLayoutManager(this.f23955r);
            RecyclerView recyclerView = this.f23954q;
            int findFirstCompletelyVisibleItemPosition = recyclerView.getLayoutManager() != null ? ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition() : 0;
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.scrollToPosition(findFirstCompletelyVisibleItemPosition);
        }
        if (textView != null) {
            textView.setOnClickListener(new C30791(this));
        }
        if (textView3 != null) {
            textView3.setOnClickListener(new C30879(this));
        }
        m20721a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
        C2491i.m6796a(this.f23957t, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6796a(view, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6796a(view2, UIThemeManager.getmInstance().getSpacer_view_color());
        C2491i.m6796a((View) textView, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6802a(textView, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6828c(textView, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6796a((View) textView3, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6802a(textView3, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6828c(textView3, UIThemeManager.getmInstance().getText_secondary_color());
        View[] viewArr = new View[]{textView3, textView};
        C2491i.m6802a(textView2, UIThemeManager.getmInstance().getText_secondary_color());
        m20726u();
    }

    public void onEvent(C2696b c2696b) {
        runOnUiThread(new C30824(this));
    }

    public void onEvent(final C5939c c5939c) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ ManageFollowersActivity f9616b;

            public final void run() {
                C4513i.m8228a(ManageFollowersActivity.m21029n(this.f9616b), c5939c.f8890a);
                this.f9616b.f23959v = false;
            }
        });
    }

    public void onEvent(C2697d c2697d) {
        String str = c2697d.f8639a;
        C3004f c3004f = c2697d.f8640b;
        if (this.f23951n != null) {
            Iterator it = this.f23951n.iterator();
            while (it.hasNext()) {
                C6829g c6829g = (C6829g) it.next();
                C7173a c7173a = (C7173a) c6829g;
                if (c7173a.f20625b.equals(str)) {
                    c7173a.f20631h = c3004f;
                    this.f23951n.set(c6829g.f19504k, c6829g);
                    runOnUiThread(new C30857(this));
                    return;
                }
            }
        }
    }

    public void onEvent(C2703o c2703o) {
        boolean z = true;
        this.f23947A = true;
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ ManageFollowersActivity f9597a;

            {
                this.f9597a = r1;
            }

            public final void run() {
                C4501c.m8189a().m8193b();
                this.f9597a.f23950D.setVisibility(8);
            }
        });
        ArrayList arrayList = c2703o.f8642a;
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                C2711a c2711a = (C2711a) it.next();
                long j = c2711a.f8655c.f9415a;
                Long l = c2711a.f8655c.f9421g;
                String str = c2711a.f8655c.f9418d;
                String str2 = c2711a.f8655c.f9429o;
                int i2 = i + 1;
                r0.f23951n.add(new C7173a(i, j, str, c2711a.f8654b, c2711a.f8655c.f9422h ? C4508f.m8221a(c2711a.f8655c.f9425k, c2711a.f8655c.f9420f) : C4508f.m8220a(c2711a.f8655c.f9416b), c2711a.f8655c.f9426l, str2, c2711a.f8655c.f9427m != null ? c2711a.f8655c.f9427m.toString() : "", C2491i.m6806b(getApplicationContext(), str), c2711a.f8653a, l));
                i = i2;
            }
            if (arrayList.size() >= 20) {
                r0.f23953p += 20;
                r0.f23959v = false;
                if (r0 != null) {
                    runOnUiThread(new Runnable(r0) {
                        final /* synthetic */ ManageFollowersActivity f9598a;

                        {
                            this.f9598a = r1;
                        }

                        public final void run() {
                            if (this.f9598a.f23951n != null) {
                                this.f9598a.f23956s.m13673a(this.f9598a.f23951n);
                            }
                        }
                    });
                }
            }
            z = true;
        }
        r0.f23960w = z;
        r0.f23959v = false;
        if (r0 != null) {
            runOnUiThread(/* anonymous class already generated */);
        }
    }

    public void onEvent(final C5945p c5945p) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ ManageFollowersActivity f9613b;

            public final void run() {
                this.f9613b.f23950D.setVisibility(8);
                C4501c.m8189a().m8193b();
                this.f9613b.f23959v = false;
                C4513i.m8228a(ManageFollowersActivity.m21026k(this.f9613b), c5945p.f8890a);
                this.f9613b.f23947A = true;
            }
        });
    }

    public void onEvent(C2704q c2704q) {
        this.f23947A = true;
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ ManageFollowersActivity f9599a;

            {
                this.f9599a = r1;
            }

            public final void run() {
                C4501c.m8189a().m8193b();
            }
        });
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = c2704q.f8643a;
        arrayList = new ArrayList();
        Iterator it = arrayList2.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            int i2 = i + 1;
            arrayList.add(((C2712b) arrayList2.get(i)).f8656a);
            i = i2;
        }
        new Thread(new Runnable(this) {
            final /* synthetic */ ManageFollowersActivity f9602b;

            class C30781 implements Runnable {
                final /* synthetic */ AnonymousClass14 f9600a;

                C30781(AnonymousClass14 anonymousClass14) {
                    this.f9600a = anonymousClass14;
                }

                public final void run() {
                    Activity e = ManageFollowersActivity.m21019e(this.f9600a.f9602b);
                    String f = this.f9600a.f9602b.f23961z;
                    Serializable serializable = arrayList;
                    boolean g = this.f9600a.f9602b.f23949C;
                    Intent intent = new Intent(e, AddChannelMemberContactSelectionListActivity.class);
                    intent.putExtra("KEY_CHECKED_USERNAME_ARRAYLIST", serializable);
                    intent.putExtra("KEY_IS_CONTACT_SELECTION_LIMIT", false);
                    if (g) {
                        intent.putExtra("KEY_IS_ADD_ADMINISTRATOR_MODE", true);
                    }
                    intent.putExtra("KEY_CHANNEL_ID", f);
                    if (e != null) {
                        e.startActivity(intent);
                        C4478a.m8165c(e, true);
                    }
                }
            }

            public final void run() {
                this.f9602b.runOnUiThread(new C30781(this));
            }
        }).start();
        this.f23948B = false;
    }

    public void onEvent(final C5947v c5947v) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ ManageFollowersActivity f9618b;

            public final void run() {
                C4513i.m8228a(ManageFollowersActivity.m21030o(this.f9618b), c5947v.f8890a);
                this.f9618b.f23959v = false;
            }
        });
    }

    public void onEvent(C2708w c2708w) {
        String str = c2708w.f8650a;
        if (this.f23951n != null) {
            Iterator it = this.f23951n.iterator();
            while (it.hasNext()) {
                C6829g c6829g = (C6829g) it.next();
                if (((C7173a) c6829g).f20625b.equals(str)) {
                    this.f23951n.remove(c6829g);
                    runOnUiThread(new C30868(this));
                    return;
                }
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m21023h();
    }

    protected void onResume() {
        super.onResume();
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
        C2475a.m6719a((Activity) this, C4522p.m8236a(R.string.title_manage_followers_activity));
    }
}
