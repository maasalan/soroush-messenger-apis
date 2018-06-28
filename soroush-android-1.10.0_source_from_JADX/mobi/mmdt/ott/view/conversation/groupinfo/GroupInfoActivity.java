package mobi.mmdt.ott.view.conversation.groupinfo;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.C0417s.C0416a;
import android.support.v4.p029a.C0350e;
import android.support.v7.app.C6389b.C0663a;
import android.support.v7.app.C7406c;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.cocosw.bottomsheet.C1287c.C1286a;
import com.p072b.p073a.p074a.C1063i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p311r.p312a.p313a.C2733d;
import mobi.mmdt.ott.logic.p261a.p311r.p312a.p313a.C2734f;
import mobi.mmdt.ott.logic.p261a.p311r.p312a.p313a.C5957c;
import mobi.mmdt.ott.logic.p261a.p311r.p312a.p313a.C5958e;
import mobi.mmdt.ott.logic.p261a.p311r.p312a.p314b.C6769c;
import mobi.mmdt.ott.logic.p261a.p311r.p312a.p314b.C6772f;
import mobi.mmdt.ott.logic.p261a.p311r.p315b.p316a.C2739e;
import mobi.mmdt.ott.logic.p261a.p311r.p315b.p316a.C5961a;
import mobi.mmdt.ott.logic.p261a.p311r.p315b.p316a.C5962c;
import mobi.mmdt.ott.logic.p261a.p311r.p315b.p316a.C5963f;
import mobi.mmdt.ott.logic.p261a.p311r.p315b.p317b.C2742e;
import mobi.mmdt.ott.logic.p261a.p311r.p315b.p317b.C5964d;
import mobi.mmdt.ott.logic.p261a.p311r.p315b.p317b.C6774b;
import mobi.mmdt.ott.logic.p261a.p311r.p315b.p317b.C6775c;
import mobi.mmdt.ott.logic.p261a.p311r.p315b.p317b.C6776f;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p381c.C2955c;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p385g.C6023j;
import mobi.mmdt.ott.provider.p390l.C3003b;
import mobi.mmdt.ott.provider.p390l.C3004f;
import mobi.mmdt.ott.provider.p390l.C6036c;
import mobi.mmdt.ott.provider.p390l.C6037d;
import mobi.mmdt.ott.provider.p390l.C7319e;
import mobi.mmdt.ott.view.components.C7695a;
import mobi.mmdt.ott.view.components.MyNestedScrollView;
import mobi.mmdt.ott.view.components.MyNestedScrollView.C3092a;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6827b;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.groupinfo.p448a.C6913a;
import mobi.mmdt.ott.view.conversation.groupinfo.p574b.C7200a;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import mobi.mmdt.ott.view.main.C4144a;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4506e;
import mobi.mmdt.ott.view.tools.C4508f;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p479c.C4501c;

public class GroupInfoActivity extends C7695a implements C3101a, C3126i {
    private String f24705A = "";
    private EditText f24706B;
    private TextView f24707C;
    private TextInputLayout f24708D;
    private TextInputLayout f24709E;
    private EditText f24710F;
    private EditText f24711G;
    private View f24712H;
    private LinearLayout f24713I;
    private TextView f24714J;
    private String f24715K;
    private boolean f24716L = false;
    private MenuItem f24717M;
    private MenuItem f24718N;
    private Button f24719O;
    private C1063i f24720P;
    private boolean f24721Q;
    private String f24722R;
    private C3004f f24723S = C3004f.NONE;
    private String f24724T;
    private String f24725U;
    private String f24726V;
    private String f24727W;
    private int f24728X = 0;
    private LinearLayoutManager f24729Y;
    private RecyclerView f24730Z;
    private C7199a aa;
    private MenuItem ab;
    private String ac = "";
    private LinearLayout ad;
    private ImageView ae;
    private FrameLayout af;
    private View ag;
    private LinearLayout ah;
    private LinearLayout ai;
    private MenuItem aj;
    private C0416a<Cursor> ak = new C0416a<Cursor>(this) {
        final /* synthetic */ GroupInfoActivity f16835a;

        {
            this.f16835a = r1;
        }

        public final C0350e<Cursor> mo2226a(int i, Bundle bundle) {
            return C2980g.m7443d(this.f16835a.f24715K);
        }

        public final void mo2227a() {
        }

        public final /* synthetic */ void mo2228a(C0350e c0350e, Object obj) {
            Cursor cursor = (Cursor) obj;
            if (cursor.moveToFirst()) {
                EditText l;
                CharSequence j;
                C6023j c6023j = new C6023j(cursor);
                String a = C4522p.m8236a(R.string.member);
                String a2 = C4522p.m8236a(R.string.members);
                int d = c6023j.m13426d();
                if (d > 1) {
                    a = a2;
                }
                this.f16835a.f24723S = c6023j.m13424b();
                this.f16835a.f24707C.setText(C4522p.m8236a(R.string.members_cap_start));
                GroupInfoActivity groupInfoActivity = this.f16835a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(d);
                stringBuilder.append(" ");
                stringBuilder.append(a);
                groupInfoActivity.ac = stringBuilder.toString();
                this.f16835a.m21056c(this.f16835a.ac);
                this.f16835a.m21053a(c6023j.m7352a("dialog_title"), false);
                if (!this.f16835a.f24731z.isEmpty() || this.f16835a.f24716L) {
                    l = this.f16835a.f24710F;
                    j = this.f16835a.f24731z;
                } else {
                    l = this.f16835a.f24710F;
                    j = c6023j.m7352a("dialog_title");
                }
                l.setText(j);
                this.f16835a.f24726V = c6023j.m7352a("dialog_title");
                if (!this.f16835a.f24716L) {
                    if (c6023j.m7352a("dialog_description") == null || c6023j.m7352a("dialog_description").isEmpty()) {
                        this.f16835a.f24709E.setVisibility(8);
                        this.f16835a.f24713I.setVisibility(8);
                        this.f16835a.f24712H.setVisibility(8);
                        a = c6023j.m7352a("dialog_avatar_thumbnail_url");
                        this.f16835a.f24724T = c6023j.m7352a("dialog_avatar_url");
                        this.f16835a.f24725U = a;
                        if (this.f16835a.s == null || this.f16835a.s.isEmpty()) {
                            if (!this.f16835a.u) {
                                this.f16835a.f24724T = null;
                                this.f16835a.f24725U = null;
                                this.f16835a.m21069o();
                                this.f16835a.m21070p();
                            } else if (a != null || a.isEmpty()) {
                                this.f16835a.f24724T = null;
                                this.f16835a.f24725U = null;
                                this.f16835a.m21069o();
                                this.f16835a.m21070p();
                            } else {
                                this.f16835a.s = "";
                                this.f16835a.m21052a(C4515k.m8231a(C2556b.m6998a(a)));
                                this.f16835a.m21055b(C4515k.m8231a(C2556b.m6998a(a)));
                            }
                        }
                        GroupInfoActivity.m21910y(this.f16835a);
                        this.f16835a.m21909y();
                    }
                }
                this.f16835a.f24709E.setVisibility(0);
                this.f16835a.f24713I.setVisibility(0);
                this.f16835a.f24712H.setVisibility(0);
                if (!this.f16835a.f24705A.isEmpty() || this.f16835a.f24716L) {
                    l = this.f16835a.f24706B;
                    j = this.f16835a.f24705A;
                } else {
                    l = this.f16835a.f24706B;
                    j = c6023j.m7352a("dialog_description");
                }
                l.setText(j);
                a = c6023j.m7352a("dialog_avatar_thumbnail_url");
                this.f16835a.f24724T = c6023j.m7352a("dialog_avatar_url");
                this.f16835a.f24725U = a;
                if (!this.f16835a.u) {
                    this.f16835a.f24724T = null;
                    this.f16835a.f24725U = null;
                    this.f16835a.m21069o();
                    this.f16835a.m21070p();
                } else {
                    if (a != null) {
                    }
                    this.f16835a.f24724T = null;
                    this.f16835a.f24725U = null;
                    this.f16835a.m21069o();
                    this.f16835a.m21070p();
                }
                GroupInfoActivity.m21910y(this.f16835a);
                this.f16835a.m21909y();
            }
        }
    };
    private OnClickListener al = new OnClickListener(this) {
        final /* synthetic */ GroupInfoActivity f11657a;

        {
            this.f11657a = r1;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            GroupInfoActivity.m21850B(this.f11657a);
        }
    };
    private OnClickListener am = new OnClickListener(this) {
        final /* synthetic */ GroupInfoActivity f11658a;

        {
            this.f11658a = r1;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f11658a.setResult(0);
            super.onBackPressed();
        }
    };
    private OnClickListener an = new C40713(this);
    private C0416a<Cursor> ao = new C62194(this);
    private String f24731z = "";

    class C40671 implements View.OnClickListener {
        final /* synthetic */ GroupInfoActivity f11654a;

        C40671(GroupInfoActivity groupInfoActivity) {
            this.f11654a = groupInfoActivity;
        }

        public final void onClick(View view) {
            this.f11654a.m21911z();
        }
    }

    class C40713 implements OnClickListener {
        final /* synthetic */ GroupInfoActivity f11666a;

        C40713(GroupInfoActivity groupInfoActivity) {
            this.f11666a = groupInfoActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            final C5891a F = GroupInfoActivity.m21854F(this.f11666a);
            this.f11666a.runOnUiThread(new Runnable(this) {
                final /* synthetic */ C40713 f11665b;

                public final void run() {
                    C4501c.m8189a().m8192a(GroupInfoActivity.m21855G(this.f11665b.f11666a), F);
                }
            });
        }
    }

    class C40735 implements Runnable {
        final /* synthetic */ GroupInfoActivity f11668a;

        class C40721 implements Runnable {
            final /* synthetic */ C40735 f11667a;

            C40721(C40735 c40735) {
                this.f11667a = c40735;
            }

            public final void run() {
                this.f11667a.f11668a.finish();
                this.f11667a.f11668a.overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
            }
        }

        C40735(GroupInfoActivity groupInfoActivity) {
            this.f11668a = groupInfoActivity;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
            new Handler().postDelayed(new C40721(this), 100);
        }
    }

    class C40756 implements Runnable {
        final /* synthetic */ GroupInfoActivity f11670a;

        class C40741 implements Runnable {
            final /* synthetic */ C40756 f11669a;

            C40741(C40756 c40756) {
                this.f11669a = c40756;
            }

            public final void run() {
                this.f11669a.f11670a.setResult(1479);
                this.f11669a.f11670a.finish();
                this.f11669a.f11670a.overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
            }
        }

        C40756(GroupInfoActivity groupInfoActivity) {
            this.f11670a = groupInfoActivity;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
            new Handler().postDelayed(new C40741(this), 100);
        }
    }

    class C62194 implements C0416a<Cursor> {
        final /* synthetic */ GroupInfoActivity f16836a;

        C62194(GroupInfoActivity groupInfoActivity) {
            this.f16836a = groupInfoActivity;
        }

        public final C0350e<Cursor> mo2226a(int i, Bundle bundle) {
            String b = this.f16836a.f24715K;
            StringBuilder stringBuilder = new StringBuilder("SELECT members_group._id as _id,members_group.members_group_added_by_me,members_group.members_group_group_id,members_group.members_group_user_id,members_group.members_group_user_role,members.members_nick_name,members.members_avatar_url,members.members_avatar_thumbnail_url,members.members_user_id,members.members_last_online,members.members_can_reply,members.members_is_anouncer,members.members_local_name,members.members_local_phone_number,members.members_is_local_user,members.members_moto,members.members_local_image_uri FROM ( members_group LEFT JOIN members ON members_group.members_group_user_id = members.members_user_id) WHERE members_group.members_group_group_id = '");
            stringBuilder.append(b);
            stringBuilder.append("' ORDER BY members.members_last_online DESC");
            return new C7319e(C3003b.f9438a, stringBuilder.toString(), new Uri[0]);
        }

        public final void mo2227a() {
            if (this.f16836a.aa != null) {
                this.f16836a.aa.m13684c(null);
            }
        }

        public final /* synthetic */ void mo2228a(C0350e c0350e, Object obj) {
            Cursor cursor = (Cursor) obj;
            if (this.f16836a.aa != null) {
                this.f16836a.aa.m13684c(cursor);
                LayoutParams layoutParams = (LayoutParams) this.f16836a.f24730Z.getLayoutParams();
                int b = C2489g.m6754a().m6756b(BallPulseIndicator.SCALE) - (C2491i.m6759a(GroupInfoActivity.m21857I(this.f16836a)) + C2491i.m6805b(GroupInfoActivity.m21858J(this.f16836a)));
                int dimension = (int) this.f16836a.getResources().getDimension(R.dimen.list_height);
                if (cursor.getCount() < b / dimension) {
                    layoutParams.height = cursor.getCount() * dimension;
                    return;
                }
                layoutParams.height = (int) (((float) b) - (((float) this.f16836a.f24719O.getHeight()) + C2491i.m6804b(this.f16836a.getApplicationContext(), 8.0f)));
            }
        }
    }

    public class C7199a extends C6827b {
        final /* synthetic */ GroupInfoActivity f20786a;

        public C7199a(GroupInfoActivity groupInfoActivity, Context context) {
            this.f20786a = groupInfoActivity;
            super(context);
        }

        public final C6073e mo3449a(ViewGroup viewGroup, int i) {
            return i != 1 ? null : new C6913a(GroupInfoActivity.m21860L(this.f20786a), this.f20786a, this.f19501b, viewGroup);
        }

        protected final C6829g mo3450a(Cursor cursor, int i) {
            long j = cursor.getLong(cursor.getColumnIndex("_id"));
            String string = cursor.getString(cursor.getColumnIndex("members_user_id"));
            long j2 = cursor.getLong(cursor.getColumnIndex("members_last_online"));
            String string2 = cursor.getString(cursor.getColumnIndex("members_moto"));
            String string3 = cursor.getString(cursor.getColumnIndex("members_avatar_thumbnail_url"));
            int i2 = cursor.getInt(cursor.getColumnIndex("members_group_user_role"));
            String string4 = cursor.getString(cursor.getColumnIndex("members_nick_name"));
            int b = C2491i.m6806b(GroupInfoActivity.m21861M(this.f20786a), string);
            String a = (string == null || this.f20786a.f24722R == null || !string.equals(this.f20786a.f24722R)) ? (cursor.getInt(cursor.getColumnIndex("members_is_local_user")) != 0 ? 1 : null) != null ? C4508f.m8221a(cursor.getString(cursor.getColumnIndex("members_local_name")), cursor.getString(cursor.getColumnIndex("members_local_phone_number"))) : C4508f.m8220a(string4) : C4522p.m8236a(R.string.you);
            return new C7200a(i, j, string, a, string2, string3, b, C3004f.values()[i2], j2);
        }

        public final int getItemViewType(int i) {
            return 1;
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return mo3449a(viewGroup, i);
        }
    }

    private void m21847A() {
        C1063i c6775c = new C6775c(this.f24715K);
        this.f24720P = c6775c;
        C2808d.m7148b(c6775c);
    }

    private void m21849B() {
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 52);
        b_(bundle);
    }

    static /* synthetic */ void m21850B(GroupInfoActivity groupInfoActivity) {
        String obj = groupInfoActivity.f24706B.getText().toString();
        String obj2 = groupInfoActivity.f24710F.getText().toString();
        if (obj2.trim().isEmpty()) {
            groupInfoActivity.f24708D.setErrorEnabled(true);
            groupInfoActivity.f24708D.setError(C4522p.m8236a(R.string.group_name_can_t_be_empty_));
            C4144a.m8004a(groupInfoActivity.f24708D);
            return;
        }
        groupInfoActivity.f24708D.setErrorEnabled(false);
        final C1063i c6769c = new C6769c(groupInfoActivity.f24715K, obj2, obj, groupInfoActivity.t, groupInfoActivity.s);
        groupInfoActivity.f24720P = c6769c;
        C2808d.m7148b(c6769c);
        groupInfoActivity.runOnUiThread(new Runnable(groupInfoActivity) {
            final /* synthetic */ GroupInfoActivity f11663b;

            public final void run() {
                C4501c.m8189a().m8192a(GroupInfoActivity.m21853E(this.f11663b), c6769c);
            }
        });
    }

    static /* synthetic */ C7406c m21852D(GroupInfoActivity groupInfoActivity) {
        return groupInfoActivity;
    }

    static /* synthetic */ C7406c m21853E(GroupInfoActivity groupInfoActivity) {
        return groupInfoActivity;
    }

    static /* synthetic */ C5891a m21854F(GroupInfoActivity groupInfoActivity) {
        C1063i c6772f = new C6772f(groupInfoActivity.f24715K, groupInfoActivity.f24721Q);
        groupInfoActivity.f24720P = c6772f;
        C2808d.m7148b(c6772f);
        return c6772f;
    }

    static /* synthetic */ C7406c m21855G(GroupInfoActivity groupInfoActivity) {
        return groupInfoActivity;
    }

    static /* synthetic */ C7406c m21857I(GroupInfoActivity groupInfoActivity) {
        return groupInfoActivity;
    }

    static /* synthetic */ C7406c m21858J(GroupInfoActivity groupInfoActivity) {
        return groupInfoActivity;
    }

    static /* synthetic */ C7406c m21860L(GroupInfoActivity groupInfoActivity) {
        return groupInfoActivity;
    }

    static /* synthetic */ C7406c m21861M(GroupInfoActivity groupInfoActivity) {
        return groupInfoActivity;
    }

    static /* synthetic */ C7406c m21863O(GroupInfoActivity groupInfoActivity) {
        return groupInfoActivity;
    }

    static /* synthetic */ C7406c m21864P(GroupInfoActivity groupInfoActivity) {
        return groupInfoActivity;
    }

    static /* synthetic */ C7406c m21865Q(GroupInfoActivity groupInfoActivity) {
        return groupInfoActivity;
    }

    static /* synthetic */ C7406c m21866R(GroupInfoActivity groupInfoActivity) {
        return groupInfoActivity;
    }

    static /* synthetic */ C7406c m21868T(GroupInfoActivity groupInfoActivity) {
        return groupInfoActivity;
    }

    static /* synthetic */ void m21873a(GroupInfoActivity groupInfoActivity, String str, C3004f c3004f) {
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 53);
        bundle.putString("KEY_DIALOG_GROUP_INFO_USER_ID", str);
        bundle.putSerializable("KEY_DIALOG_GROUP_INFO_ENUM_TYPE", c3004f);
        groupInfoActivity.b_(bundle);
    }

    static /* synthetic */ void m21874a(GroupInfoActivity groupInfoActivity, String str, C3004f c3004f, C3004f c3004f2) {
        C1063i c6774b = new C6774b(groupInfoActivity.f24715K, new String[]{str}, new C3004f[]{c3004f}, new C3004f[]{c3004f2});
        groupInfoActivity.f24720P = c6774b;
        C2808d.m7148b(c6774b);
    }

    static /* synthetic */ C7406c m21881e(GroupInfoActivity groupInfoActivity) {
        return groupInfoActivity;
    }

    static /* synthetic */ void m21896l(GroupInfoActivity groupInfoActivity, String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(str);
        arrayList2.add(C3004f.NONE);
        C1063i c6776f = new C6776f(groupInfoActivity.f24715K, arrayList, arrayList2);
        groupInfoActivity.f24720P = c6776f;
        C2808d.m7148b(c6776f);
    }

    private void m21909y() {
        if (this.ab != null) {
            if (this.f24723S != C3004f.ADMIN) {
                if (this.f24723S != C3004f.OWNER) {
                    this.ab.setVisible(false);
                    return;
                }
            }
            this.ab.setVisible(true);
        }
    }

    static /* synthetic */ void m21910y(GroupInfoActivity groupInfoActivity) {
        groupInfoActivity.f24710F.addTextChangedListener(new TextWatcher(groupInfoActivity) {
            final /* synthetic */ GroupInfoActivity f11652a;
            private String f11653b;

            {
                this.f11652a = r1;
            }

            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                this.f11653b = charSequence.toString();
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (!(this.f11653b == null || this.f11653b.equals(charSequence.toString()))) {
                    this.f11652a.f24716L = true;
                }
                this.f11652a.f24731z = charSequence.toString();
                this.f11653b = charSequence.toString();
            }
        });
        groupInfoActivity.f24706B.addTextChangedListener(new TextWatcher(groupInfoActivity) {
            final /* synthetic */ GroupInfoActivity f11655a;
            private String f11656b;

            {
                this.f11655a = r1;
            }

            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                this.f11656b = charSequence.toString();
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                this.f11655a.f24705A = charSequence.toString();
                if (!(this.f11656b == null || this.f11656b.equals(charSequence.toString()))) {
                    this.f11655a.f24716L = true;
                }
                this.f11656b = charSequence.toString();
            }
        });
    }

    private void m21911z() {
        new Thread(new Runnable(this) {
            final /* synthetic */ GroupInfoActivity f11661a;

            {
                this.f11661a = r1;
            }

            public final void run() {
                String b = this.f11661a.f24715K;
                C2955c c6037d = new C6037d();
                String[] strArr = new String[1];
                int i = 0;
                strArr[0] = b;
                c6037d.m13531a(strArr);
                Cursor query = MyApplication.m12952b().getContentResolver().query(c6037d.m7372g(), null, c6037d.f9181a.toString(), c6037d.m7370e(), c6037d.m7371f());
                C6036c c6036c = query == null ? null : new C6036c(query);
                String[] strArr2 = new String[c6036c.getCount()];
                if (c6036c.moveToFirst()) {
                    while (true) {
                        int i2 = i + 1;
                        strArr2[i] = c6036c.m13530a();
                        if (!c6036c.moveToNext()) {
                            break;
                        }
                        i = i2;
                    }
                }
                c6036c.close();
                final Object arrayList = new ArrayList();
                Collections.addAll(arrayList, strArr2);
                this.f11661a.runOnUiThread(new Runnable(this) {
                    final /* synthetic */ AnonymousClass23 f11660b;

                    public final void run() {
                        Activity D = GroupInfoActivity.m21852D(this.f11660b.f11661a);
                        String b = this.f11660b.f11661a.f24715K;
                        Serializable serializable = arrayList;
                        Intent intent = new Intent(D, AddParticipantsGroupContactSelectionListActivity.class);
                        intent.putExtra("KEY_GROUP_ID", b);
                        intent.putExtra("KEY_IS_CONTACT_SELECTION_LIMIT", true);
                        intent.putExtra("KEY_CHECKED_USERNAME_ARRAYLIST", serializable);
                        if (D != null) {
                            D.startActivity(intent);
                            C4478a.m8165c(D, true);
                        }
                    }
                });
            }
        }).start();
    }

    public final Dialog mo2299a(Bundle bundle) {
        String a;
        switch (bundle.getInt("dialog_id")) {
            case 50:
            case 51:
                return C4488b.m8182a(this, C4522p.m8236a(R.string.save_changes), C4522p.m8236a(R.string.are_you_sure_to_save), C4522p.m8236a(R.string.save), this.al, C4522p.m8236a(R.string.cancel), this.am);
            case 52:
                int i;
                if (this.f24721Q) {
                    a = C4522p.m8236a(R.string.are_you_sure_to_leave_and_delete_this_conversation);
                    i = R.string.action_leave_and_delete;
                } else {
                    a = C4522p.m8236a(R.string.are_you_sure_to_leave_this_conversation);
                    i = R.string.action_leave_group;
                }
                return C4488b.m8181a(this, a, C4522p.m8236a(i), this.an, C4522p.m8236a(R.string.cancel), null);
            case 53:
                final C3004f c3004f = (C3004f) bundle.get("KEY_DIALOG_GROUP_INFO_ENUM_TYPE");
                a = bundle.getString("KEY_DIALOG_GROUP_INFO_USER_ID", "");
                C0663a c0663a = new C0663a(this, R.style.AppCompatAlertDialogStyle);
                c0663a.m1608a(C4522p.m8236a(R.string.select_user_access_level));
                View inflate = getLayoutInflater().inflate(R.layout.dialog_user_access_level_selection, null);
                final RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.radioGroup);
                RadioButton radioButton = (RadioButton) inflate.findViewById(R.id.radioButton1);
                RadioButton radioButton2 = (RadioButton) inflate.findViewById(R.id.radioButton2);
                C2491i.m6782a(UIThemeManager.getmInstance().getAccent_color(), radioButton, radioButton2);
                radioButton.setText(C4522p.m8236a(R.string.group_admin));
                radioButton2.setText(C4522p.m8236a(R.string.group_member));
                if (c3004f == C3004f.ADMIN) {
                    radioButton.setChecked(true);
                } else {
                    radioButton2.setChecked(true);
                }
                c0663a.m1614b(C4522p.m8236a(R.string.cancel_cap), null);
                c0663a.m1607a(inflate);
                c0663a.m1609a(C4522p.m8236a(R.string.action_change), new OnClickListener(this) {
                    final /* synthetic */ GroupInfoActivity f11647d;

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
                        GroupInfoActivity.m21874a(this.f11647d, a, c3004f, c3004f);
                    }
                });
                Dialog a2 = c0663a.m1612a();
                a2.show();
                a2.m15114a(-2).setTextColor(UIThemeManager.getmInstance().getAccent_color());
                a2.m15114a(-1).setTextColor(UIThemeManager.getmInstance().getAccent_color());
                return a2;
            case 54:
                final String string = bundle.getString("KEY_DIALOG_GROUP_INFO_USER_ID");
                final C3004f c3004f2 = (C3004f) bundle.get("KEY_DIALOG_GROUP_INFO_ENUM_TYPE");
                C1286a c1286a = new C1286a(this);
                c1286a.f4034f = new OnClickListener(this) {
                    final /* synthetic */ GroupInfoActivity f11650c;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (string == null || !string.equals(this.f11650c.f24722R)) {
                            if (!(this.f11650c.f24723S == C3004f.ADMIN || this.f11650c.f24723S == C3004f.OWNER)) {
                                if (this.f11650c.f24723S != C3004f.MEMBER) {
                                    Toast.makeText(this.f11650c, C4522p.m8236a(R.string.permission_denied), 0).show();
                                    return;
                                }
                            }
                            if (i == R.id.action_change_role) {
                                GroupInfoActivity.m21873a(this.f11650c, string, c3004f2);
                                return;
                            } else if (i == R.id.action_remove_from_group) {
                                GroupInfoActivity.m21896l(this.f11650c, string);
                                return;
                            } else {
                                return;
                            }
                        }
                        Toast.makeText(this.f11650c, C4522p.m8236a(R.string.you_cannot_change_your_membership_status_yourself), 0).show();
                    }
                };
                C4506e.m8204a(this, c1286a, R.menu.menu_bottom_sheet_group_member_long_click);
                return c1286a.m3053a();
            default:
                return super.mo2299a(bundle);
        }
    }

    public final void mo2234c(int i) {
        C4478a.m8149a((Activity) this, ((C6036c) this.aa.m13685c(i)).m13530a(), true);
    }

    public final void mo2235d(int i) {
        C6036c c6036c = (C6036c) this.aa.m13685c(i);
        String a = c6036c.m13530a();
        Boolean d = c6036c.m7355d("members_group_added_by_me");
        if (d == null) {
            throw new NullPointerException("The value of 'user_affiliation' in the database was null, which is not allowed according to the model definition");
        }
        boolean booleanValue = d.booleanValue();
        Integer b = c6036c.m7353b("members_group_user_role");
        if (b == null) {
            throw new NullPointerException("The value of 'user_role' in the database was null, which is not allowed according to the model definition");
        }
        Serializable serializable = C3004f.values()[b.intValue()];
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 54);
        bundle.putString("KEY_DIALOG_GROUP_INFO_USER_ID", a);
        bundle.putBoolean("KEY_BOTTOM_SHEET_GROUP_INFO_USER_PARTY", booleanValue);
        bundle.putSerializable("KEY_DIALOG_GROUP_INFO_ENUM_TYPE", serializable);
        b_(bundle);
    }

    protected final int mo3643g() {
        return R.drawable.ic_place_holder_group;
    }

    protected final String mo3695h() {
        return this.f24715K;
    }

    protected final C2973m mo3696i() {
        return C2973m.GROUP;
    }

    protected final void mo3697j() {
        if (this.f24718N != null) {
            this.f24718N.setVisible(true);
        }
    }

    protected void mo3698k() {
        this.v = 0.75d;
        this.w = 0.5d;
    }

    protected final void mo3699l() {
        if (this.f24724T != null && this.f24725U != null) {
            C4478a.m8164c(this, this.f24724T, this.f24725U, this.f24726V);
        }
    }

    public void onBackPressed() {
        if (!this.f24716L) {
            if (!this.t) {
                setResult(0);
                super.onBackPressed();
                return;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 51);
        b_(bundle);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m21057e((int) R.layout.fragment_group_info);
        this.f24715K = getIntent().getExtras().getString("KEY_GROUP_ID");
        this.f24722R = C2535a.m6888a().m6928d();
        this.f24727W = C2535a.m6888a().m6919b();
        this.ad = (LinearLayout) findViewById(R.id.root_layout);
        this.ah = (LinearLayout) findViewById(R.id.details_layout);
        this.ai = (LinearLayout) findViewById(R.id.root_recycler_view_linear_layout);
        this.ag = findViewById(R.id.spacer_view);
        this.af = (FrameLayout) findViewById(R.id.top_frameLayout);
        this.ae = (ImageView) findViewById(R.id.sharedMedia_imageView);
        this.f24714J = (TextView) findViewById(R.id.sharedMedia_textView);
        this.f24719O = (Button) findViewById(R.id.add_participants_button);
        this.f24719O.setText(C4522p.m8236a(R.string.action_add_participants));
        this.f24708D = (TextInputLayout) findViewById(R.id.groupName_textInputLayout);
        this.f24710F = (EditText) findViewById(R.id.groupName_editText);
        this.f24709E = (TextInputLayout) findViewById(R.id.groupMotto_textInputLayout);
        this.f24706B = (EditText) findViewById(R.id.groupMotto_editText);
        this.f24707C = (TextView) findViewById(R.id.members_count_textView);
        this.f24711G = (EditText) findViewById(R.id.junk_editText);
        this.f24712H = findViewById(R.id.spacer_view);
        this.f24713I = (LinearLayout) findViewById(R.id.details_layout);
        boolean z = true;
        this.f24710F.setFilters(new InputFilter[]{new LengthFilter(128)});
        this.f24710F.setSingleLine(true);
        this.f24710F.setMaxLines(1);
        this.f24706B.setFilters(new InputFilter[]{new LengthFilter(140)});
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        ViewGroup.LayoutParams layoutParams = this.ad.getLayoutParams();
        if (!getResources().getBoolean(R.bool.xlarge)) {
            layoutParams.height = (int) (((float) (point.y - (C2491i.m6759a(getApplicationContext()) + C2491i.m6805b(getApplicationContext())))) + C2491i.m6804b(getApplicationContext(), 8.0f));
            if (getResources().getConfiguration().orientation == 2) {
                layoutParams.width = (int) (((double) point.x) * 0.75d);
            }
        }
        this.f24710F.setText("");
        this.f24706B.setText("");
        this.f24711G.requestFocus();
        this.f24708D.setVisibility(8);
        this.f24709E.setVisibility(8);
        this.f24713I.setVisibility(8);
        this.f24712H.setVisibility(8);
        this.f24719O.setOnClickListener(new C40671(this));
        new Thread(new Runnable(this) {
            final /* synthetic */ GroupInfoActivity f11641a;

            {
                this.f11641a = r1;
            }

            public final void run() {
                Thread.currentThread().setPriority(1);
                final int h = C2966b.m7417h(this.f11641a.f24715K);
                this.f11641a.runOnUiThread(new Runnable(this) {
                    final /* synthetic */ AnonymousClass12 f11640b;

                    class C40641 implements View.OnClickListener {
                        final /* synthetic */ C40661 f11637a;

                        C40641(C40661 c40661) {
                            this.f11637a = c40661;
                        }

                        public final void onClick(View view) {
                            C4478a.m8147a(GroupInfoActivity.m21881e(this.f11637a.f11640b.f11641a), this.f11637a.f11640b.f11641a.f24715K, this.f11637a.f11640b.f11641a.f24726V, C2973m.GROUP);
                        }
                    }

                    class C40652 implements View.OnClickListener {
                        final /* synthetic */ C40661 f11638a;

                        C40652(C40661 c40661) {
                            this.f11638a = c40661;
                        }

                        public final void onClick(View view) {
                            Toast.makeText(this.f11638a.f11640b.f11641a, C4522p.m8236a(R.string.no_media_found), 0).show();
                        }
                    }

                    public final void run() {
                        TextView d;
                        CharSequence b;
                        View.OnClickListener c40641;
                        if (this.f11640b.f11641a.f24727W.equals("fa")) {
                            d = this.f11640b.f11641a.f24714J;
                            b = C2491i.m6814b(String.format(C4522p.m8236a(R.string.shared_media), new Object[]{Integer.valueOf(h)}));
                        } else {
                            d = this.f11640b.f11641a.f24714J;
                            b = String.format(C4522p.m8236a(R.string.shared_media), new Object[]{Integer.valueOf(h)});
                        }
                        d.setText(b);
                        if (h > 0) {
                            d = this.f11640b.f11641a.f24714J;
                            c40641 = new C40641(this);
                        } else {
                            d = this.f11640b.f11641a.f24714J;
                            c40641 = new C40652(this);
                        }
                        d.setOnClickListener(c40641);
                    }
                });
            }
        }).start();
        this.aa = new C7199a(this, this);
        m19190e().mo268a(17, null, this.ao);
        this.f24730Z = (RecyclerView) findViewById(R.id.recycler_view);
        if (this.f24730Z != null) {
            this.f24730Z.setHasFixedSize(true);
            this.f24730Z.setNestedScrollingEnabled(false);
            this.f24730Z.setAdapter(this.aa);
            this.f24729Y = new LinearLayoutManager(this);
            this.f24730Z.setLayoutManager(this.f24729Y);
            this.f24730Z.scrollToPosition(this.f24728X);
        }
        ((MyNestedScrollView) this.o).setOnScrollChangedListener(new C3092a(this) {
            final /* synthetic */ GroupInfoActivity f16834a;

            {
                this.f16834a = r1;
            }

            public final void mo2378a() {
                this.f16834a.f24730Z.setNestedScrollingEnabled(false);
            }

            public final void mo2379b() {
                this.f16834a.f24730Z.setNestedScrollingEnabled(true);
            }
        });
        C2491i.m6796a(this.ad, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6796a(this.ah, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6796a(this.ai, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6796a(this.af, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6796a(this.f24730Z, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6819b(this.f24719O, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6798a(this.f24719O, UIThemeManager.getmInstance().getButton_text_color());
        C2491i.m6796a(this.ag, UIThemeManager.getmInstance().getSpacer_view_color());
        C2491i.m6802a(this.f24714J, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6801a(this.ae, UIThemeManager.getmInstance().getText_secondary_color());
        new View[1][0] = this.f24714J;
        C2491i.m6780a(UIThemeManager.getmInstance().getText_primary_color(), UIThemeManager.getmInstance().getAccent_color(), this.f24706B, this.f24710F);
        C2491i.m6781a(UIThemeManager.getmInstance().getAccent_color(), this.f24709E, this.f24708D);
        m21062h(C2491i.m6806b(getApplicationContext(), this.f24715K));
        m21069o();
        m21070p();
        if (bundle != null) {
            if (bundle.containsKey("KEY_GROUP_NAME")) {
                String string = bundle.getString("KEY_GROUP_NAME");
                this.f24710F.setText(string);
                m21053a(string, false);
                this.f24731z = string;
            }
            if (bundle.containsKey("KEY_GROUP_MOTTO")) {
                Object string2 = bundle.getString("KEY_GROUP_MOTTO");
                this.f24706B.setText(string2);
                this.f24705A = string2;
            }
            if (!bundle.containsKey("KEY_IS_CHANGE_OCCURRED") || !bundle.getBoolean("KEY_IS_CHANGE_OCCURRED")) {
                z = false;
            }
            this.f24716L = z;
        }
        if (this.s != null) {
            m21052a(this.s);
            m21055b(this.s);
        }
        m19190e().mo268a(16, null, this.ak);
        m21847A();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_group_info, menu);
        this.f24717M = menu.findItem(R.id.action_edit);
        this.f24718N = menu.findItem(R.id.action_done);
        this.ab = menu.findItem(R.id.action_create_invite_group_link);
        this.aj = menu.findItem(R.id.action_report);
        if (!this.f24716L) {
            if (!this.t) {
                this.f24718N.setVisible(false);
                if (this.f24716L) {
                    this.f24717M.setVisible(false);
                }
                if (this.f24716L) {
                    this.f24708D.setVisibility(8);
                } else {
                    this.f24708D.setVisibility(0);
                    this.f24713I.setVisibility(0);
                    this.f24712H.setVisibility(0);
                }
                this.f24710F.setEnabled(this.f24716L);
                this.f24706B.setEnabled(this.f24716L);
                m21909y();
                return true;
            }
        }
        this.f24718N.setVisible(true);
        if (this.f24716L) {
            this.f24717M.setVisible(false);
        }
        if (this.f24716L) {
            this.f24708D.setVisibility(8);
        } else {
            this.f24708D.setVisibility(0);
            this.f24713I.setVisibility(0);
            this.f24712H.setVisibility(0);
        }
        this.f24710F.setEnabled(this.f24716L);
        this.f24706B.setEnabled(this.f24716L);
        m21909y();
        return true;
    }

    protected void onDestroy() {
        super.onDestroy();
        if (this.f24730Z != null) {
            this.f24730Z.setItemAnimator(null);
            this.f24730Z.setAdapter(null);
            this.f24730Z = null;
        }
        this.aa = null;
        m19190e().mo269a(16);
    }

    public void onEvent(final C5957c c5957c) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ GroupInfoActivity f11635b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a(GroupInfoActivity.m21866R(this.f11635b), c5957c.f8890a);
            }
        });
    }

    public void onEvent(C2733d c2733d) {
        runOnUiThread(new C40735(this));
    }

    public void onEvent(final C5958e c5958e) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ GroupInfoActivity f11643b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a(GroupInfoActivity.m21868T(this.f11643b), c5958e.f8890a);
            }
        });
    }

    public void onEvent(C2734f c2734f) {
        runOnUiThread(new C40756(this));
    }

    public void onEvent(final C5961a c5961a) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ GroupInfoActivity f11674b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a(GroupInfoActivity.m21864P(this.f11674b), c5961a.f8890a);
            }
        });
    }

    public void onEvent(final C5962c c5962c) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ GroupInfoActivity f11672b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a(GroupInfoActivity.m21863O(this.f11672b), c5962c.f8890a);
            }
        });
    }

    public void onEvent(C2739e c2739e) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ GroupInfoActivity f11636a;

            {
                this.f11636a = r1;
            }

            public final void run() {
                this.f11636a.m21847A();
            }
        });
    }

    public void onEvent(final C5963f c5963f) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ GroupInfoActivity f11676b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a(GroupInfoActivity.m21865Q(this.f11676b), c5963f.f8890a);
            }
        });
    }

    public void onEvent(C5964d c5964d) {
    }

    public void onEvent(C2742e c2742e) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ GroupInfoActivity f11651a;

            {
                this.f11651a = r1;
            }

            public final void run() {
                if (this.f11651a.aa != null) {
                    this.f11651a.aa.notifyDataSetChanged();
                }
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_done) {
            if (!this.f24716L) {
                if (!this.t) {
                    super.onBackPressed();
                }
            }
            Bundle bundle = new Bundle();
            bundle.putInt("dialog_id", 50);
            b_(bundle);
        } else if (itemId == R.id.action_edit) {
            this.f24717M.setVisible(false);
            this.f24718N.setVisible(true);
            this.f24710F.setEnabled(true);
            this.f24706B.setEnabled(true);
            this.f24709E.setVisibility(0);
            this.f24708D.setVisibility(0);
            this.f24713I.setVisibility(0);
            this.f24712H.setVisibility(0);
            this.f24710F.requestFocus();
        } else {
            if (itemId == R.id.action_leave_group) {
                this.f24721Q = false;
            } else if (itemId == R.id.action_leave_and_delete) {
                this.f24721Q = true;
            } else if (itemId == R.id.action_add_participants) {
                m21911z();
            } else if (itemId == R.id.action_create_invite_group_link) {
                String str;
                String obj;
                String str2;
                if (this.s == null || this.s.isEmpty()) {
                    str = this.f24715K;
                    obj = this.f24710F.getText().toString();
                    str2 = this.f24725U;
                } else {
                    str = this.f24715K;
                    obj = this.f24710F.getText().toString();
                    str2 = this.s;
                }
                C4478a.m8145a((Activity) this, str, obj, str2, this.ac);
            } else if (itemId == R.id.action_report) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("dialog_id", 11);
                b_(bundle2);
                return true;
            }
            m21849B();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    protected void onResume() {
        super.onResume();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        if (!(this.f24710F == null || this.f24706B == null)) {
            String obj = this.f24710F.getText().toString();
            if (!obj.isEmpty()) {
                bundle.putString("KEY_GROUP_NAME", obj);
            }
            obj = this.f24706B.getText().toString();
            if (!obj.isEmpty()) {
                bundle.putString("KEY_GROUP_MOTTO", obj);
            }
        }
        bundle.putBoolean("KEY_IS_CHANGE_OCCURRED", this.f24716L);
        super.onSaveInstanceState(bundle);
    }
}
