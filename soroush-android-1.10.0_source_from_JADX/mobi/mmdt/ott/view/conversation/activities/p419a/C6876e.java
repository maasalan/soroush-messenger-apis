package mobi.mmdt.ott.view.conversation.activities.p419a;

import android.app.Activity;
import android.app.Dialog;
import android.app.SearchManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.C0417s.C0416a;
import android.support.v4.p029a.C0350e;
import android.support.v7.app.C7406c;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.widget.Toast;
import com.p072b.p073a.p074a.C1063i;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p105g.C1248f;
import com.p085c.p086a.p105g.p106a.C7408b;
import com.p085c.p086a.p105g.p107b.C1242b;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.base.ArchiveRetrieveMode;
import mobi.mmdt.ott.logic.C2775a;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2646i;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2647j;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2649n;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2652u;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5919h;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5920k;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5921m;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5925t;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6702k;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6703l;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6704m;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6711v;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p289a.C2657a;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6720i;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6721j;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6725n;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6726o;
import mobi.mmdt.ott.logic.p261a.p301l.p302a.C2716a;
import mobi.mmdt.ott.logic.p261a.p301l.p548b.C6754a;
import mobi.mmdt.ott.logic.p261a.p301l.p548b.C6757d;
import mobi.mmdt.ott.logic.p261a.p303m.C6762d;
import mobi.mmdt.ott.logic.p261a.p308q.p310b.C2731a;
import mobi.mmdt.ott.logic.p261a.p311r.p312a.p313a.C2734f;
import mobi.mmdt.ott.logic.p261a.p311r.p312a.p313a.C5958e;
import mobi.mmdt.ott.logic.p261a.p311r.p312a.p314b.C6770d;
import mobi.mmdt.ott.logic.p261a.p311r.p312a.p314b.C6772f;
import mobi.mmdt.ott.logic.p261a.p320t.C6777a;
import mobi.mmdt.ott.logic.p347d.C2806c;
import mobi.mmdt.ott.p240c.C2524c.C2522a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p385g.C6023j;
import mobi.mmdt.ott.provider.p386h.C2988j;
import mobi.mmdt.ott.provider.p390l.C3004f;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.conversation.activities.a.e.AnonymousClass12;
import mobi.mmdt.ott.view.conversation.activities.p419a.C6876e;
import mobi.mmdt.ott.view.conversation.activities.p419a.C6876e.12.C33612;
import mobi.mmdt.ott.view.conversation.groupinfo.GroupInfoActivity;
import mobi.mmdt.ott.view.conversation.groupinfo.GroupInfoActivityThemeDialog;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p479c.C4501c;

public final class C6876e extends C6123a implements C3101a {
    private OnClickListener aA = new OnClickListener(this) {
        final /* synthetic */ C6876e f10328a;

        {
            this.f10328a = r1;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C6876e c6876e = this.f10328a;
            C1063i c6772f = new C6772f(c6876e.ai, c6876e.aj);
            C2808d.m7147a(c6772f);
            C4501c.m8189a().m8192a((C7576b) this.f10328a.f10377a, c6772f);
        }
    };
    private OnClickListener aB = new OnClickListener(this) {
        final /* synthetic */ C6876e f10329a;

        {
            this.f10329a = r1;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C2808d.m7148b(new C6754a(this.f10329a.ai));
        }
    };
    public C3004f ah = C3004f.NONE;
    String ai;
    boolean aj;
    MenuItem ak;
    String al;
    int am = -1;
    MenuItem an;
    MenuItem ao;
    String ap = "";
    boolean aq;
    boolean ar;
    boolean as;
    private final String at;
    private boolean au;
    private MenuItem av;
    private SearchView aw;
    private boolean ax = false;
    private boolean ay;
    private C0416a<Cursor> az = new C0416a<Cursor>(this) {
        final /* synthetic */ C6876e f16511a;

        class C33612 implements Runnable {
            final /* synthetic */ AnonymousClass12 f10322a;

            C33612(AnonymousClass12 anonymousClass12) {
                this.f10322a = anonymousClass12;
            }

            public final void run() {
                if (this.f10322a.f16511a.ak != null) {
                    this.f10322a.f16511a.ak.setChecked(this.f10322a.f16511a.n);
                }
            }
        }

        {
            this.f16511a = r1;
        }

        public final C0350e<Cursor> mo2226a(int i, Bundle bundle) {
            return C2980g.m7443d(this.f16511a.ai);
        }

        public final void mo2227a() {
        }

        public final /* synthetic */ void mo2228a(C0350e c0350e, Object obj) {
            Cursor cursor = (Cursor) obj;
            if (cursor.moveToFirst()) {
                C6023j c6023j = new C6023j(cursor);
                if (this.f16511a.ai.equals(c6023j.m13423a())) {
                    C6876e c6876e;
                    this.f16511a.ah = c6023j.m13424b();
                    this.f16511a.i.setBackgroundColor(C2491i.m6806b((C7576b) this.f16511a.f10377a, this.f16511a.ai));
                    this.f16511a.m13978a(c6023j.m7352a("dialog_title"), false);
                    String a = C4522p.m8236a(R.string.member);
                    String a2 = C4522p.m8236a(R.string.members);
                    int i = cursor.getInt(cursor.getColumnIndex("dialog_members_count"));
                    if (i > 1) {
                        a = a2;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(i);
                    stringBuilder.append(" ");
                    stringBuilder.append(a);
                    String stringBuilder2 = stringBuilder.toString();
                    if (this.f16511a.al.equals("fa")) {
                        c6876e = this.f16511a;
                        stringBuilder2 = C2491i.m6814b(stringBuilder2);
                    } else {
                        c6876e = this.f16511a;
                    }
                    c6876e.m13990b(stringBuilder2);
                    this.f16511a.m13983a(false);
                    stringBuilder2 = c6023j.m7352a("dialog_avatar_thumbnail_url");
                    if (stringBuilder2 == null || stringBuilder2.isEmpty()) {
                        C1212c.m2872a((C7576b) this.f16511a.f10377a).m10950a(Integer.valueOf(R.drawable.ic_place_holder_group)).m3034a(C1248f.m2945b()).m3033a().m3031a(this.f16511a.i);
                    } else {
                        int b = (int) C2491i.m6804b((C7576b) this.f16511a.f10377a, 36.0f);
                        C1212c.m2873a((C7576b) this.f16511a.f10377a).m10958e().m3037a(C4515k.m8231a(C2556b.m6998a(stringBuilder2))).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a).m2949a((int) R.drawable.ic_place_holder_group).m2962h().m2954b(b, b)).m3032a(new C7408b(this, this.f16511a.i) {
                            final /* synthetic */ AnonymousClass12 f23138b;

                            public final /* bridge */ /* synthetic */ void mo3320a(Object obj, C1242b c1242b) {
                                super.mo3320a((Bitmap) obj, c1242b);
                            }
                        });
                    }
                    if (this.f16511a.ah != C3004f.VISITOR) {
                        if (this.f16511a.ah != C3004f.NONE) {
                            this.f16511a.m13938K();
                            if (this.f16511a.ah == C3004f.NONE) {
                                this.f16511a.m13990b(null);
                                this.f16511a.m13983a(false);
                            }
                            this.f16511a.n = c6023j.m13428f();
                            new Handler().postDelayed(new C33612(this), 500);
                        }
                    }
                    this.f16511a.m13939L();
                    if (this.f16511a.ah == C3004f.NONE) {
                        this.f16511a.m13990b(null);
                        this.f16511a.m13983a(false);
                    }
                    this.f16511a.n = c6023j.m13428f();
                    new Handler().postDelayed(new C33612(this), 500);
                }
            }
        }
    };

    class C33621 implements View.OnClickListener {
        final /* synthetic */ C6876e f10330a;

        C33621(C6876e c6876e) {
            this.f10330a = c6876e;
        }

        public final void onClick(View view) {
            this.f10330a.o = true;
            this.f10330a.aq = true;
            this.f10330a.m13936I();
            if (this.f10330a.f16457C) {
                this.f10330a.m14020i();
                this.f10330a.as = true;
            }
            this.f10330a.j.m14069e((C7576b) this.f10330a.f10377a);
            this.f10330a.ak.setVisible(false);
            this.f10330a.an.setVisible(false);
            this.f10330a.ao.setVisible(false);
            this.f10330a.aq = true;
            this.f10330a.m.clear();
        }
    }

    class C33642 implements Runnable {
        final /* synthetic */ C6876e f10332a;

        class C33631 implements Runnable {
            final /* synthetic */ C33642 f10331a;

            C33631(C33642 c33642) {
                this.f10331a = c33642;
            }

            public final void run() {
                this.f10331a.f10332a.m14012g();
                this.f10331a.f10332a.m13958a((int) R.anim.anim_slide_in_right, (int) R.anim.anim_slide_out_right);
            }
        }

        C33642(C6876e c6876e) {
            this.f10332a = c6876e;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
            new Handler().postDelayed(new C33631(this), 100);
        }
    }

    class C33708 implements Runnable {
        final /* synthetic */ C6876e f10343a;

        C33708(C6876e c6876e) {
            this.f10343a = c6876e;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
        }
    }

    class C33719 implements OnAttachStateChangeListener {
        final /* synthetic */ C6876e f10344a;

        C33719(C6876e c6876e) {
            this.f10344a = c6876e;
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            this.f10344a.m13936I();
            this.f10344a.aq = false;
            this.f10344a.j.m14070f();
            this.f10344a.ak.setVisible(true);
            this.f10344a.an.setVisible(true);
            this.f10344a.ao.setVisible(true);
            this.f10344a.ar = false;
            if (this.f10344a.as && !this.f10344a.f16469O) {
                this.f10344a.m14023j();
            }
        }
    }

    public C6876e(C7406c c7406c, Intent intent, String str, String str2, C2973m c2973m) {
        super(c7406c, intent, str, c2973m, str2);
        this.at = str2;
    }

    private void m17462a(final C2775a c2775a) {
        this.e--;
        m13940M();
        Log.d("ccc ", " ccc in S ErrEvnt");
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6876e f10327b;

            public final void run() {
                this.f10327b.g.m14091b(true);
                C4501c.m8189a().m8193b();
                C4513i.m8228a((C7576b) this.f10327b.f10377a, c2775a);
            }
        });
    }

    private void m17463a(boolean z, final boolean z2) {
        this.e--;
        m13940M();
        z ^= 1;
        StringBuilder stringBuilder = new StringBuilder(" ccc in G SuEvnt notMM:");
        stringBuilder.append(z);
        stringBuilder.append(" UWM:");
        stringBuilder.append(z2);
        Log.d("ccc ", stringBuilder.toString());
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6876e f10325c;

            public final void run() {
                this.f10325c.g.f16545D = z;
                if (z) {
                    this.f10325c.g.mo2354a(false);
                    this.f10325c.g.m14107n();
                    this.f10325c.m13930C();
                }
                if (z2) {
                    this.f10325c.g.m14091b(true);
                    if (this.f10325c.am > 0) {
                        this.f10325c.g.m14089a(false, false, false);
                        this.f10325c.m13930C();
                        return;
                    }
                    this.f10325c.g.m14106m();
                    this.f10325c.m13930C();
                    return;
                }
                C4501c.m8189a().m8193b();
            }
        });
    }

    private void ad() {
        C2808d.m7148b(new C6702k(this.ai));
        this.e++;
        m13940M();
    }

    private void ae() {
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 124);
        bundle.putBoolean("KEY_DIALOG_IS_DELETE_GROUP", this.aj);
        m14004e(bundle);
    }

    public final void mo3190N() {
        if (!this.ay) {
            this.ay = true;
            if (this.at != null) {
                if (!this.at.isEmpty()) {
                    C2808d.m7148b(new C6703l(this.ai, this.at, C2778b.m7093a(), ArchiveRetrieveMode.NEW_MSG));
                    this.g.f16549H = true;
                    this.e++;
                    m13940M();
                    return;
                }
            }
            ad();
        }
    }

    public final void mo3191O() {
        ad();
    }

    public final boolean mo3192P() {
        return true;
    }

    protected final void mo3193Q() {
        boolean z = ((C7576b) this.f10377a).getResources().getBoolean(R.bool.xlarge);
        if (this.ah != C3004f.NONE) {
            Intent intent;
            if (z) {
                intent = new Intent((C7576b) this.f10377a, GroupInfoActivityThemeDialog.class);
                intent.putExtra("KEY_GROUP_ID", this.ai);
                m13968a(intent, 1478);
                m13958a((int) R.anim.anim_fade_in_activity_theme_dialog, (int) R.anim.anim_fade_out_activity_theme_dialog);
            } else {
                intent = new Intent((C7576b) this.f10377a, GroupInfoActivity.class);
                intent.putExtra("KEY_GROUP_ID", this.ai);
                m13968a(intent, 1478);
                m13958a((int) R.anim.anim_slide_in_left, (int) R.anim.anim_slide_out_left);
            }
        }
    }

    protected final void mo3194R() {
        if (this.aw != null) {
            this.aq = false;
            this.ak.setVisible(true);
            this.an.setVisible(true);
            this.ao.setVisible(true);
            this.av.collapseActionView();
            this.j.m14067d((C7576b) this.f10377a);
        }
    }

    public final int mo3195S() {
        return this.k > 0 ? this.k + 50 : 50;
    }

    public final int mo3196T() {
        return 50;
    }

    public final int mo3197U() {
        return this.am;
    }

    public final boolean mo3198V() {
        return this.aq;
    }

    public final void mo3199W() {
        this.aq = false;
    }

    public final void mo3200X() {
        this.am = -1;
    }

    public final String mo3201Y() {
        return this.ap;
    }

    public final void mo3202Z() {
        this.ax = true;
        if (this.ak != null) {
            this.ak.setVisible(false);
            this.an.setVisible(false);
            this.ao.setVisible(false);
            this.av.setVisible(false);
        }
    }

    public final Dialog mo2299a(Bundle bundle) {
        String a;
        String a2;
        OnClickListener onClickListener;
        Activity activity;
        switch (bundle.getInt("dialog_id")) {
            case 123:
                C7576b c7576b = (C7576b) this.f10377a;
                a = C4522p.m8236a(R.string.are_you_sure_to_clear_history_of_this_conversation);
                a2 = C4522p.m8236a(R.string.action_clear_history);
                onClickListener = this.aB;
                break;
            case 124:
                String a3;
                int i;
                if (bundle.getBoolean("KEY_DIALOG_IS_DELETE_GROUP")) {
                    a3 = C4522p.m8236a(R.string.are_you_sure_to_leave_and_delete_this_conversation);
                    i = R.string.action_leave_and_delete;
                } else {
                    a3 = C4522p.m8236a(R.string.are_you_sure_to_leave_this_conversation);
                    i = R.string.action_leave_group;
                }
                a = a3;
                a2 = C4522p.m8236a(i);
                activity = (C7576b) this.f10377a;
                onClickListener = this.aA;
                break;
            default:
                return super.mo2299a(bundle);
        }
        return C4488b.m8181a(activity, a, a2, onClickListener, C4522p.m8236a(R.string.cancel), null);
    }

    public final void mo2300a() {
        super.mo2300a();
        this.au = true;
        MyApplication.m12950a().f15918x = this.ai;
    }

    protected final void mo3203a(int i, int i2, int i3, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.ai);
        C2808d.m7147a(new C6725n(arrayList, str, i, i2, i3, this.ai, C2973m.GROUP, str2, null));
    }

    public final void mo2303a(int i, int i2, Intent intent) {
        super.mo2303a(i, i2, intent);
        if (i2 == 1479) {
            m14012g();
            m13958a((int) R.anim.anim_slide_in_right, (int) R.anim.anim_slide_out_right);
        }
    }

    public final void mo3204a(int i, boolean z, boolean z2, boolean z3) {
        this.am = i;
        this.g.m14089a(z, z2, z3);
    }

    protected final void mo3206a(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.ai);
        C2808d.m7147a(new C6720i(arrayList, str, str2, this.ai, C2973m.GROUP, str3));
    }

    protected final void mo3207a(String str, String str2, C2988j c2988j, String str3, C2731a c2731a, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.ai);
        C2808d.m7147a(new C6721j(arrayList, str2, str, c2988j, this.ai, C2973m.GROUP, str3, c2731a, z));
    }

    protected final void mo3208a(String str, String str2, C2988j c2988j, C2731a c2731a, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.ai);
        C2808d.m7147a(new C6721j(arrayList, str2, str, c2988j, this.ai, C2973m.GROUP, c2731a, z));
    }

    public final void mo3209a(C2522a c2522a) {
    }

    public final boolean mo3210a(Menu menu) {
        ((C7576b) this.f10377a).getMenuInflater().inflate(R.menu.menu_group_conversation, menu);
        this.ak = menu.findItem(R.id.action_mute_notification);
        this.av = menu.findItem(R.id.action_search_chat);
        this.an = menu.findItem(R.id.action_leave_and_delete);
        this.ao = menu.findItem(R.id.action_clear_history);
        this.ak.setTitle(C4522p.m8236a(R.string.action_mute_notification));
        this.av.setTitle(C4522p.m8236a(R.string.action_search_chat));
        this.an.setTitle(C4522p.m8236a(R.string.action_leave_and_delete));
        this.ao.setTitle(C4522p.m8236a(R.string.action_clear_history));
        SearchManager searchManager = (SearchManager) ((C7576b) this.f10377a).getSystemService("search");
        if (this.av != null) {
            this.aw = (SearchView) this.av.getActionView();
        }
        if (this.aw != null) {
            this.aw.setSearchableInfo(searchManager.getSearchableInfo(((C7576b) this.f10377a).getComponentName()));
            this.aw = m13955a(this.aw);
        }
        this.aw.setOnSearchClickListener(new C33621(this));
        this.aw.addOnAttachStateChangeListener(new C33719(this));
        if (!this.ap.isEmpty()) {
            this.av.expandActionView();
            this.ak.setVisible(false);
            this.an.setVisible(false);
            this.ao.setVisible(false);
            this.aq = true;
            this.aw.setQuery(this.ap, this.ar);
            if (this.ar) {
                C2808d.m7147a(new C6757d(this.ai, this.ap));
            }
        }
        this.aw.setImeOptions(this.aw.getImeOptions() | 268435456);
        this.aw.setOnQueryTextListener(new OnQueryTextListener(this) {
            final /* synthetic */ C6876e f16510a;

            {
                this.f16510a = r1;
            }

            public final boolean onQueryTextChange(String str) {
                this.f16510a.ar = false;
                this.f16510a.ap = "";
                return false;
            }

            public final boolean onQueryTextSubmit(String str) {
                C2808d.m7147a(new C6757d(this.f16510a.ai, str));
                this.f16510a.ar = true;
                return false;
            }
        });
        if (this.ax) {
            mo3202Z();
        }
        return super.mo3210a(menu);
    }

    public final boolean mo2315a(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_leave_group) {
            this.aj = false;
        } else {
            if (itemId == R.id.action_mute_notification) {
                C2808d.m7148b(new C6777a(C2973m.GROUP, this.ai, true ^ this.n));
            } else if (itemId == R.id.action_clear_history) {
                Bundle bundle = new Bundle();
                bundle.putInt("dialog_id", 123);
                m14004e(bundle);
            } else if (itemId == R.id.action_leave_and_delete) {
                this.aj = true;
            } else if (itemId == R.id.action_create_poll) {
                C4478a.m8167d((C7576b) this.f10377a, this.ai);
            }
            return super.mo2315a(menuItem);
        }
        ae();
        return super.mo2315a(menuItem);
    }

    public final void aa() {
        this.ax = false;
        if (this.ak != null) {
            this.ak.setVisible(true);
            this.an.setVisible(true);
            this.ao.setVisible(true);
            this.av.setVisible(true);
        }
    }

    public final void ab() {
        if (this.av != null) {
            this.av.collapseActionView();
        }
    }

    protected final boolean ac() {
        return true;
    }

    public final C0350e<Cursor> mo3217b(int i) {
        return C2966b.m7401a(this.ai, i);
    }

    public final void mo2316b() {
        super.mo2316b();
        this.au = false;
        MyApplication.m12950a().f15918x = null;
    }

    protected final void mo3218b(int i, int i2, int i3, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.ai);
        C2808d.m7147a(new C6725n(arrayList, str, i, i2, i3, this.ai, C2973m.GROUP, null, null));
    }

    public final void mo2318b(Bundle bundle) {
        if (!(this.f16471Q == null || this.f16471Q.getExtras() == null || !this.f16471Q.getExtras().containsKey("KEY_PARTY"))) {
            this.ai = this.f16471Q.getStringExtra("KEY_PARTY");
        }
        if (bundle != null) {
            this.aj = bundle.getBoolean("KEY_IS_DELETE_GROUP");
            this.ah = (C3004f) bundle.get("KEY_MY_ROLE_TYPE");
            if (bundle.containsKey("KEY_SEARCH_ROTATE")) {
                this.ap = bundle.getString("KEY_SEARCH_ROTATE", "");
            }
            if (bundle.containsKey("KEY_IS_SUBMIT_PRESSED")) {
                this.ar = bundle.getBoolean("KEY_IS_SUBMIT_PRESSED", false);
            }
        }
        super.mo2318b(bundle);
        this.al = C2535a.m6888a().m6919b();
        ((C7576b) this.f10377a).m19190e().mo268a(15, null, this.az);
        m14026m();
        C2808d.m7149c(new C6770d(this.ai));
    }

    public final void mo3219b(String str, String str2, String[] strArr, String str3) {
        if (strArr.length <= 0) {
            if (str3.length() <= 0) {
                Toast.makeText((C7576b) this.f10377a, C4522p.m8236a(R.string.you_must_answer_before_submitting), 0).show();
                return;
            }
        }
        C2808d.m7148b(new C6711v(str, str2, strArr, str3));
    }

    public final void mo2323c(Bundle bundle) {
        super.mo2323c(bundle);
    }

    public final void mo2326d() {
        super.mo2326d();
        ((C7576b) this.f10377a).m19190e().mo269a(15);
    }

    public final void mo2327d(Bundle bundle) {
        super.mo2327d(bundle);
        bundle.putBoolean("KEY_IS_DELETE_GROUP", this.aj);
        bundle.putSerializable("KEY_MY_ROLE_TYPE", this.ah);
        bundle.putBoolean("KEY_IS_SUBMIT_PRESSED", this.ar);
        if (this.aw != null) {
            bundle.putString("KEY_SEARCH_ROTATE", this.aw.getQuery() != null ? this.aw.getQuery().toString() : "");
        }
    }

    protected final void mo3220f(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.ai);
        C2808d.m7147a(new C6726o(arrayList, str, this.ai, C2973m.GROUP, null, null));
    }

    public final void mo3221g(String str) {
        Log.d("ccc ", " ccc in G LoadMore");
        C2808d.m7148b(new C6702k(this.ai, str));
        this.e++;
        m13940M();
    }

    public final void mo3222h(String str) {
        if (this.aw != null) {
            this.av.expandActionView();
            this.j.m14069e((C7576b) this.f10377a);
            this.ak.setVisible(false);
            this.an.setVisible(false);
            this.ao.setVisible(false);
            this.aw.setQuery(str, true);
            this.aq = true;
            this.m.clear();
            this.ar = false;
        }
    }

    protected final void mo3223h(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.ai);
        C2808d.m7147a(new C6726o(arrayList, str, this.ai, C2973m.GROUP, str2, null));
    }

    public final void mo3224i(String str) {
    }

    protected final void mo3225i(String str, String str2) {
        C2808d.m7147a(new C6762d(str, this.ai, C2973m.GROUP, str2));
    }

    public final void mo3226j(String str) {
        C4478a.m8149a((C7576b) this.f10377a, str, true);
    }

    public final void mo3227k(String str) {
        final C1063i c6704m = new C6704m(str);
        C2808d.m7148b(c6704m);
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6876e f10336b;

            public final void run() {
                C4501c.m8189a().m8192a((C7576b) this.f10336b.f10377a, c6704m);
            }
        });
    }

    public final void onEvent(C5919h c5919h) {
        m17462a(c5919h.f8890a);
    }

    public final void onEvent(C2646i c2646i) {
        m17463a(c2646i.f8553a, c2646i.f8554b);
    }

    public final void onEvent(C2647j c2647j) {
        m17463a(c2647j.f8556a, c2647j.f8557b);
        this.g.f16550I = true;
    }

    public final void onEvent(C5920k c5920k) {
        m17462a(c5920k.f8890a);
    }

    public final void onEvent(final C5921m c5921m) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6876e f10342b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a((C7576b) this.f10342b.f10377a, c5921m.f8890a);
            }
        });
    }

    public final void onEvent(final C2649n c2649n) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6876e f10338b;

            public final void run() {
                C4501c.m8189a().m8193b();
                this.f10338b.f = c2649n.f8564a;
                this.f10338b.m13979a(this.f10338b.f);
            }
        });
    }

    public final void onEvent(final C5925t c5925t) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6876e f10340b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a((C7576b) this.f10340b.f10377a, c5925t.f8890a);
            }
        });
    }

    public final void onEvent(C2652u c2652u) {
        ((C7576b) this.f10377a).runOnUiThread(new C33708(this));
    }

    public final void onEvent(C2657a c2657a) {
        Toast.makeText((C7576b) this.f10377a, C4522p.m8236a(R.string.user_not_have_permission), 0).show();
    }

    public final void onEvent(C2716a c2716a) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6876e f10321a;

            {
                this.f10321a = r1;
            }

            public final void run() {
                C4501c.m8189a().m8193b();
                this.f10321a.m14012g();
                this.f10321a.m13958a((int) R.anim.anim_slide_in_right, (int) R.anim.anim_slide_out_right);
            }
        });
    }

    public final void onEvent(final C5958e c5958e) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6876e f10334b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a((C7576b) this.f10334b.f10377a, c5958e.f8890a);
            }
        });
    }

    public final void onEvent(C2734f c2734f) {
        ((C7576b) this.f10377a).runOnUiThread(new C33642(this));
    }

    public final void onEvent(C2806c c2806c) {
    }
}
