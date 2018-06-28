package mobi.mmdt.ott.view.conversation.activities.p419a;

import android.app.Activity;
import android.app.Dialog;
import android.app.SearchManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import com.p072b.p073a.p074a.C1063i;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C1274i;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p105g.C1248f;
import com.p085c.p086a.p105g.p106a.C7408b;
import com.p085c.p086a.p105g.p107b.C1242b;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.C2474a;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.base.ArchiveRetrieveMode;
import mobi.mmdt.ott.logic.C2775a;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.aa.C2580f;
import mobi.mmdt.ott.logic.p261a.aa.C6648h;
import mobi.mmdt.ott.logic.p261a.ah.C2619b;
import mobi.mmdt.ott.logic.p261a.ah.C5906a;
import mobi.mmdt.ott.logic.p261a.ah.C5907c;
import mobi.mmdt.ott.logic.p261a.ah.p273a.C6676a;
import mobi.mmdt.ott.logic.p261a.ah.p273a.C6677b;
import mobi.mmdt.ott.logic.p261a.p276b.C2622a;
import mobi.mmdt.ott.logic.p261a.p276b.C2622a.C2621a;
import mobi.mmdt.ott.logic.p261a.p276b.C2624e;
import mobi.mmdt.ott.logic.p261a.p276b.C5908d;
import mobi.mmdt.ott.logic.p261a.p276b.C6679b;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2648l;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2649n;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2652u;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5921m;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5925t;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6704m;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6711v;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6718g;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6720i;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6721j;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6724m;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6725n;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6726o;
import mobi.mmdt.ott.logic.p261a.p301l.p302a.C2716a;
import mobi.mmdt.ott.logic.p261a.p301l.p548b.C6755b;
import mobi.mmdt.ott.logic.p261a.p301l.p548b.C6757d;
import mobi.mmdt.ott.logic.p261a.p303m.C6762d;
import mobi.mmdt.ott.logic.p261a.p308q.p310b.C2731a;
import mobi.mmdt.ott.logic.p261a.p320t.C6777a;
import mobi.mmdt.ott.logic.p347d.C2804a;
import mobi.mmdt.ott.logic.p347d.C2807d;
import mobi.mmdt.ott.logic.p359k.C2837a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p240c.C2524c.C2522a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2967c;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p384f.C7316h;
import mobi.mmdt.ott.provider.p385g.C2981h;
import mobi.mmdt.ott.provider.p385g.C7317l;
import mobi.mmdt.ott.provider.p386h.C2985d;
import mobi.mmdt.ott.provider.p386h.C2988j;
import mobi.mmdt.ott.provider.p389k.C3000b;
import mobi.mmdt.ott.provider.p389k.C6034d;
import mobi.mmdt.ott.provider.p393o.C3012b;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.contact.contactprofileinfo.ContactProfileInfoActivity;
import mobi.mmdt.ott.view.contact.contactprofileinfo.ContactProfileInfoActivityThemeDialog;
import mobi.mmdt.ott.view.conversation.activities.C3382a;
import mobi.mmdt.ott.view.conversation.activities.a.f.AnonymousClass13;
import mobi.mmdt.ott.view.conversation.activities.a.f.AnonymousClass19;
import mobi.mmdt.ott.view.conversation.activities.p419a.C6877f;
import mobi.mmdt.ott.view.conversation.activities.p419a.C6877f.19.C33722;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4508f;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4516l;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p479c.C4501c;

public final class C6877f extends C6123a implements C3101a {
    private String aA;
    private boolean aB = false;
    private C0416a<Cursor> aC = new C0416a<Cursor>(this) {
        final /* synthetic */ C6877f f16513a;

        class C33722 implements Runnable {
            final /* synthetic */ AnonymousClass19 f10356a;

            C33722(AnonymousClass19 anonymousClass19) {
                this.f10356a = anonymousClass19;
            }

            public final void run() {
                if (this.f10356a.f16513a.au != null) {
                    this.f10356a.f16513a.au.setChecked(this.f10356a.f16513a.n);
                }
            }
        }

        {
            this.f16513a = r1;
        }

        public final C0350e<Cursor> mo2226a(int i, Bundle bundle) {
            String str = this.f16513a.ah;
            String str2 = "";
            if (str != null) {
                StringBuilder stringBuilder = new StringBuilder("members_user_id = '");
                stringBuilder.append(str);
                stringBuilder.append("' ");
                str2 = stringBuilder.toString();
            }
            StringBuilder stringBuilder2 = new StringBuilder("SELECT dialogs._id as _id,dialog_party,dialog_title,dialog_avatar_thumbnail_url,dialog_avatar_url,dialog_description,dialog_is_mute,dialog_is_pinned,dialog_my_role,dialog_creation_date,dialog_is_reply_allowed,dialog_show_all_messages,dialog_unread_messages_count,dialog_last_message_id,dialog_updated_at,dialog_link,dialog_state,dialog_last_position,dialog_extra,channel_owner,dialog_members_count,dialog_type,channel_type,dialog_keyboard,dialog_draft_data,members_nick_name,members_avatar_url,members_avatar_thumbnail_url,members_user_id,members_is_local_user,members_last_online,members_can_reply,members_is_anouncer,members_local_name,members_local_phone_number,members_is_new_user,members_is_deactivated_user,members_is_synced_contact,members_is_soroush_member,members_soroush_id,members_is_pined,members_last_position,members_is_mute,members_extra,members_local_image_uri FROM members LEFT JOIN dialogs ON members_user_id = dialog_party WHERE ");
            stringBuilder2.append(str2);
            stringBuilder2.append(" GROUP BY dialog_party");
            str = stringBuilder2.toString();
            return new C7317l(C3000b.f9413a, str, C3000b.f9413a, C2981h.f9316a);
        }

        public final void mo2227a() {
        }

        public final /* synthetic */ void mo2228a(C0350e c0350e, Object obj) {
            Cursor cursor = (Cursor) obj;
            if (cursor.moveToFirst()) {
                C6034d c6034d = new C6034d(cursor);
                String a = c6034d.m7352a("members_local_name");
                String a2 = c6034d.m7352a("members_nick_name");
                String b = c6034d.m13510b();
                String a3 = c6034d.m7352a("members_avatar_thumbnail_url");
                Object a4 = c6034d.m7352a("members_local_image_uri");
                Long c = c6034d.m7354c("members_last_online");
                this.f16513a.av = c6034d.m13512d();
                a = (!c6034d.m13511c() || a == null) ? C4508f.m8220a(a2) : C4508f.m8221a(a, c6034d.m7352a("members_local_phone_number"));
                this.f16513a.m13978a(a, c6034d.m13513e());
                this.f16513a.al = a;
                boolean z = false;
                if (c == null || c.longValue() == -1 || c.longValue() == 0) {
                    this.f16513a.m13983a(false);
                    this.f16513a.m13990b("");
                } else {
                    a2 = C2491i.m6772a((C7576b) this.f16513a.f10377a, C2778b.m7093a(), c.longValue());
                    this.f16513a.aj = a2;
                    if (!(!this.f16513a.ao.equals("fa") || a2.contains(C4522p.m8236a(R.string.online)) || a2.contains(C4522p.m8236a(R.string.one_minute_ago)) || a2.contains(C4522p.m8236a(R.string.minutes_ago)) || a2.contains(C4522p.m8236a(R.string.today)))) {
                        if (!a2.contains(C4522p.m8236a(R.string.yesterday))) {
                            a2 = C2491i.m6825c((C7576b) this.f16513a.f10377a, c.longValue(), this.f16513a.ao);
                        }
                    }
                    this.f16513a.m13983a(false);
                    this.f16513a.m13990b(a2);
                }
                this.f16513a.i.setBackgroundColor(C2491i.m6806b((C7576b) this.f16513a.f10377a, b));
                if (a3 == null || a3.isEmpty()) {
                    C1274i a5 = (a4 == null || a4.isEmpty()) ? C1212c.m2873a((C7576b) this.f16513a.f10377a).m10950a(Integer.valueOf(R.drawable.ic_place_holder_contact)) : C1212c.m2873a((C7576b) this.f16513a.f10377a).m10950a(a4);
                    a5.m3034a(C1248f.m2945b()).m3033a().m3031a(this.f16513a.i);
                } else {
                    int b2 = (int) C2491i.m6804b((C7576b) this.f16513a.f10377a, 36.0f);
                    C1212c.m2873a((C7576b) this.f16513a.f10377a).m10958e().m3037a(C4515k.m8231a(C2556b.m6998a(a3))).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a).m2962h().m2954b(b2, b2).m2949a((int) R.drawable.ic_place_holder_contact)).m3032a(new C7408b(this, this.f16513a.i) {
                        final /* synthetic */ AnonymousClass19 f23139b;

                        public final /* bridge */ /* synthetic */ void mo3320a(Object obj, C1242b c1242b) {
                            super.mo3320a((Bitmap) obj, c1242b);
                        }
                    });
                }
                String a6 = c6034d.m7352a("members_extra");
                if (!this.f16513a.ai.equals(this.f16513a.ah)) {
                    if (a6 != null) {
                        if (!a6.equals("1")) {
                            if (a6.equals("0")) {
                                this.f16513a.ak.setText(C4522p.m8236a(R.string.action_unblock));
                                this.f16513a.ak.setVisibility(0);
                                this.f16513a.m13939L();
                            }
                        }
                    }
                    this.f16513a.ak.setVisibility(8);
                    this.f16513a.m13938K();
                } else if (this.f16513a.aq != null) {
                    this.f16513a.aq.setVisible(false);
                }
                C6877f c6877f = this.f16513a;
                if (cursor.getInt(cursor.getColumnIndex("dialog_is_mute")) != 0) {
                    z = true;
                }
                c6877f.n = z;
                new Handler().postDelayed(new C33722(this), 500);
            }
        }
    };
    private OnClickListener aD = new OnClickListener(this) {
        final /* synthetic */ C6877f f10363a;

        {
            this.f10363a = r1;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C1063i c6755b = new C6755b(this.f10363a.ah);
            C2808d.m7147a(c6755b);
            C4501c.m8189a().m8192a((C7576b) this.f10363a.f10377a, c6755b);
        }
    };
    String ah;
    String ai;
    String aj;
    Button ak;
    String al = "";
    String am = "";
    int an = -1;
    String ao;
    MenuItem ap;
    MenuItem aq;
    boolean ar;
    boolean as;
    boolean at;
    MenuItem au;
    boolean av = true;
    private boolean aw;
    private SearchView ax;
    private MenuItem ay;
    private boolean az = false;

    class AnonymousClass13 implements Runnable {
        final /* synthetic */ C6679b f10349a;
        final /* synthetic */ C6877f f10350b;

        AnonymousClass13(C6877f c6877f, C6679b c6679b) {
            this.f10350b = c6877f;
            this.f10349a = c6679b;
        }

        public final void run() {
            C4501c.m8189a().m8192a((C7576b) this.f10350b.f10377a, this.f10349a);
        }
    }

    class C33731 implements View.OnClickListener {
        final /* synthetic */ C6877f f10357a;

        C33731(C6877f c6877f) {
            this.f10357a = c6877f;
        }

        public final void onClick(View view) {
            C6877f c6877f = this.f10357a;
            Bundle bundle = new Bundle();
            bundle.putInt("dialog_id", 81);
            c6877f.m14004e(bundle);
        }
    }

    class C33797 implements Runnable {
        final /* synthetic */ C6877f f10374a;

        C33797(C6877f c6877f) {
            this.f10374a = c6877f;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
        }
    }

    class C33808 implements OnClickListener {
        final /* synthetic */ C6877f f10375a;

        C33808(C6877f c6877f) {
            this.f10375a = c6877f;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C3382a c3382a = this.f10375a;
            C1063i c6679b = new C6679b(new C2622a(c3382a.ah, C2621a.f8520b));
            C2808d.m7148b(c6679b);
            ((C7576b) c3382a.f10377a).runOnUiThread(new AnonymousClass13(c3382a, c6679b));
        }
    }

    class C33819 implements OnClickListener {
        final /* synthetic */ C6877f f10376a;

        C33819(C6877f c6877f) {
            this.f10376a = c6877f;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C2837a.m7167a((C7576b) this.f10376a.f10377a, "android.permission.RECORD_AUDIO", 186);
        }
    }

    public C6877f(C7406c c7406c, Intent intent, String str, String str2, C2973m c2973m) {
        super(c7406c, intent, str, c2973m, str2);
        this.aA = str2;
    }

    private void m17504a(final C2775a c2775a) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6877f f10362b;

            public final void run() {
                C6877f c6877f = this.f10362b;
                c6877f.e--;
                this.f10362b.m13940M();
                this.f10362b.g.m14091b(true);
                C4501c.m8189a().m8193b();
                C4513i.m8228a((C7576b) this.f10362b.f10377a, c2775a);
            }
        });
    }

    private void m17506a(final boolean z, final boolean z2) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6877f f10360c;

            public final void run() {
                C6877f c6877f = this.f10360c;
                c6877f.e--;
                this.f10360c.m13940M();
                this.f10360c.g.f16545D = z;
                if (z) {
                    this.f10360c.g.mo2354a(false);
                    this.f10360c.g.m14107n();
                    this.f10360c.m13930C();
                } else {
                    this.f10360c.g.m14091b(true);
                }
                if (z2) {
                    this.f10360c.g.m14091b(true);
                    if (this.f10360c.an > 0) {
                        this.f10360c.g.m14089a(false, false, false);
                        this.f10360c.m13930C();
                        return;
                    }
                    this.f10360c.g.m14106m();
                    this.f10360c.m13930C();
                    return;
                }
                C4501c.m8189a().m8193b();
            }
        });
    }

    private void ae() {
        C2808d.m7148b(new C6676a(this.ah));
        this.e++;
        m13940M();
    }

    private void m17507b(C2522a c2522a) {
        String str;
        switch (c2522a) {
            case GONE:
                m13983a(false);
                return;
            case INACTIVE:
                m13983a(false);
                return;
            case ACTIVE:
                m13983a(false);
                str = this.aj;
                break;
            case COMPOSING:
                m13983a(true);
                str = C4522p.m8236a(R.string.typing);
                break;
            case PAUSED:
                m13983a(false);
                m13990b(this.aj);
                return;
            default:
                return;
        }
        m13990b(str);
    }

    public final void mo3190N() {
        StringBuilder stringBuilder = new StringBuilder(" ccc? S ");
        stringBuilder.append(this.aB ^ true);
        Log.d("ccc ", stringBuilder.toString());
        if (!this.aB) {
            this.aB = true;
            if (this.aA != null) {
                if (!this.aA.isEmpty()) {
                    C2808d.m7148b(new C6677b(this.ah, this.aA, C2778b.m7093a(), ArchiveRetrieveMode.NEW_MSG));
                    this.g.f16549H = true;
                    this.e++;
                    m13940M();
                    return;
                }
            }
            ae();
        }
    }

    public final void mo3191O() {
        ae();
    }

    public final boolean mo3192P() {
        return this.av;
    }

    protected final void mo3193Q() {
        Activity activity = (C7576b) this.f10377a;
        String str = this.ah;
        if (activity.getResources().getBoolean(R.bool.xlarge)) {
            Intent intent = new Intent(activity, ContactProfileInfoActivityThemeDialog.class);
            intent.putExtra("KEY_CONTACT_USER_ID_STRING", str);
            intent.putExtra("KEY_IS_NOT_SHOW_START_CHAT_BOOLEAN", true);
            activity.startActivity(intent);
            activity.overridePendingTransition(R.anim.anim_fade_in_activity_theme_dialog, R.anim.anim_fade_out_activity_theme_dialog);
            return;
        }
        intent = new Intent(activity, ContactProfileInfoActivity.class);
        intent.putExtra("KEY_CONTACT_USER_ID_STRING", str);
        intent.putExtra("KEY_IS_NOT_SHOW_START_CHAT_BOOLEAN", true);
        intent.putExtra("KEY_SHOW_LOCAL_INFO_BOOLEAN", true);
        activity.startActivity(intent);
        C4478a.m8161b(activity, false);
        C4478a.m8165c(activity, true);
    }

    protected final void mo3194R() {
        if (this.ax != null) {
            this.ar = false;
            this.aq.setVisible(true);
            this.ap.setVisible(true);
            ad();
            this.ay.collapseActionView();
            this.j.m14067d((C7576b) this.f10377a);
        }
    }

    public final int mo3195S() {
        return this.k > 0 ? this.k + 30 : 50;
    }

    public final int mo3196T() {
        return 30;
    }

    public final int mo3197U() {
        return this.an;
    }

    public final boolean mo3198V() {
        return this.ar;
    }

    public final void mo3199W() {
        this.ar = false;
    }

    public final void mo3200X() {
        this.an = -1;
    }

    public final String mo3201Y() {
        return this.am;
    }

    public final void mo3202Z() {
        this.az = true;
        if (this.aq != null) {
            this.aq.setVisible(false);
            this.ay.setVisible(false);
            this.ap.setVisible(false);
            this.au.setVisible(false);
        }
    }

    public final Dialog mo2299a(Bundle bundle) {
        int i = bundle.getInt("dialog_id");
        if (i == 14) {
            return C4488b.m8181a((C7576b) this.f10377a, C4522p.m8236a(R.string.are_you_sure_to_delete_this_conversation), C4522p.m8236a(R.string.action_delete), this.aD, C4522p.m8236a(R.string.cancel), null);
        }
        switch (i) {
            case 81:
                OnClickListener c33808 = new C33808(this);
                C7576b c7576b = (C7576b) this.f10377a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(C4522p.m8236a(R.string.action_unblock));
                stringBuilder.append(" ");
                stringBuilder.append(this.al);
                return C4488b.m8182a(c7576b, stringBuilder.toString(), String.format(C4522p.m8236a(R.string.are_you_sure_to_unblock), new Object[]{this.al}), C4522p.m8236a(R.string.action_unblock), c33808, C4522p.m8236a(R.string.cancel), null);
            case 82:
                return C4488b.m8182a((C7576b) this.f10377a, C4522p.m8236a(R.string.record_audio_permission), C4522p.m8236a(R.string.allow_soroush_access_to_your_microphone), C4522p.m8236a(R.string.movafegham), new C33819(this), C4522p.m8236a(R.string.felan_na), null);
            default:
                return super.mo2299a(bundle);
        }
    }

    public final void mo2300a() {
        super.mo2300a();
        this.aw = true;
        MyApplication.m12950a().f15918x = this.ah;
        C2808d.m7149c(new C6648h(new String[]{this.ah}));
        C2804a a = C2804a.m7145a();
        C2522a c2522a = (C2522a) a.f8868a.get(this.ah);
        if (c2522a != null) {
            m17507b(c2522a);
        }
    }

    protected final void mo3203a(int i, int i2, int i3, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.ah);
        C2808d.m7147a(new C6725n(arrayList, str, i, i2, i3, this.ah, C2973m.SINGLE, str2, null));
    }

    public final void mo3204a(int i, boolean z, boolean z2, boolean z3) {
        this.an = i;
        this.g.m14089a(z, z2, z3);
    }

    protected final void mo3206a(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.ah);
        C2808d.m7147a(new C6720i(arrayList, str, str2, this.ah, C2973m.SINGLE, str3));
    }

    protected final void mo3207a(String str, String str2, C2988j c2988j, String str3, C2731a c2731a, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.ah);
        C2808d.m7147a(new C6721j(arrayList, str2, str, c2988j, this.ah, C2973m.SINGLE, str3, c2731a, z));
    }

    protected final void mo3208a(String str, String str2, C2988j c2988j, C2731a c2731a, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.ah);
        C2808d.m7147a(new C6721j(arrayList, str2, str, c2988j, this.ah, C2973m.SINGLE, c2731a, z));
    }

    public final void mo3209a(C2522a c2522a) {
        C2808d.m7147a(new C6718g(this.ah, c2522a));
    }

    public final boolean mo3210a(Menu menu) {
        this.f10377a.getMenuInflater().inflate(R.menu.menu_single_conversation, menu);
        this.ay = menu.findItem(R.id.action_search_chat);
        this.aq = menu.findItem(R.id.action_call);
        if (!(!this.av || this.aq == null || this.aq.getActionView() == null)) {
            View actionView = this.aq.getActionView();
            ((ImageView) actionView).setImageResource(R.drawable.ic_action_communication_call);
            actionView.setOnClickListener(new View.OnClickListener(this) {
                final /* synthetic */ C6877f f10348a;

                {
                    this.f10348a = r1;
                }

                public final void onClick(View view) {
                    C3382a c3382a = this.f10348a;
                    if (!C2474a.m6718b((C7576b) c3382a.f10377a)) {
                        Toast.makeText((C7576b) c3382a.f10377a, C4522p.m8236a(R.string.connection_error_message), 0).show();
                    } else if (C4516l.m8232a() && !C2837a.m7170a("android.permission.RECORD_AUDIO")) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("dialog_id", 82);
                        c3382a.m14004e(bundle);
                    } else if (c3382a.ah.equals(c3382a.ai)) {
                        Toast.makeText((C7576b) c3382a.f10377a, C4522p.m8236a(R.string.you_can_not_call_yourself), 0).show();
                    } else {
                        C4478a.m8163c((C7576b) c3382a.f10377a, c3382a.ah);
                    }
                }
            });
        }
        this.ap = menu.findItem(R.id.action_delete_chat);
        this.au = menu.findItem(R.id.action_mute_notification);
        this.au.setTitle(C4522p.m8236a(R.string.action_mute_notification));
        this.ay.setTitle(C4522p.m8236a(R.string.action_search_chat));
        this.ap.setTitle(C4522p.m8236a(R.string.action_delete_chat));
        this.aq.setTitle(C4522p.m8236a(R.string.action_call));
        C2491i.m6790a(this.aq.getIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
        ad();
        SearchManager searchManager = (SearchManager) ((C7576b) this.f10377a).getSystemService("search");
        if (this.ay != null) {
            this.ax = (SearchView) this.ay.getActionView();
        }
        if (this.ax != null) {
            if (searchManager != null) {
                this.ax.setSearchableInfo(searchManager.getSearchableInfo(((C7576b) this.f10377a).getComponentName()));
            }
            this.ax = m13955a(this.ax);
            this.ax.setOnSearchClickListener(new View.OnClickListener(this) {
                final /* synthetic */ C6877f f10354a;

                {
                    this.f10354a = r1;
                }

                public final void onClick(View view) {
                    this.f10354a.o = true;
                    this.f10354a.ar = true;
                    this.f10354a.m13936I();
                    if (this.f10354a.f16457C) {
                        this.f10354a.m14020i();
                        this.f10354a.at = true;
                    }
                    this.f10354a.j.m14069e((C7576b) this.f10354a.f10377a);
                    this.f10354a.aq.setVisible(false);
                    this.f10354a.ap.setVisible(false);
                    this.f10354a.au.setVisible(false);
                }
            });
            this.ax.addOnAttachStateChangeListener(new OnAttachStateChangeListener(this) {
                final /* synthetic */ C6877f f10355a;

                {
                    this.f10355a = r1;
                }

                public final void onViewAttachedToWindow(View view) {
                }

                public final void onViewDetachedFromWindow(View view) {
                    this.f10355a.m13936I();
                    this.f10355a.ar = false;
                    this.f10355a.j.m14070f();
                    this.f10355a.aq.setVisible(true);
                    this.f10355a.ap.setVisible(true);
                    this.f10355a.ad();
                    this.f10355a.as = false;
                    if (this.f10355a.at && !this.f10355a.f16469O) {
                        this.f10355a.m14023j();
                    }
                }
            });
        }
        if (!this.am.isEmpty()) {
            this.ay.expandActionView();
            this.aq.setVisible(false);
            this.ap.setVisible(false);
            this.au.setVisible(false);
            this.ar = true;
            this.ax.setQuery(this.am, this.as);
            if (this.as) {
                C2808d.m7147a(new C6757d(this.ah, this.am));
            }
        }
        this.ax.setImeOptions(this.ax.getImeOptions() | 268435456);
        this.ax.setOnQueryTextListener(new OnQueryTextListener(this) {
            final /* synthetic */ C6877f f16512a;

            {
                this.f16512a = r1;
            }

            public final boolean onQueryTextChange(String str) {
                this.f16512a.as = false;
                this.f16512a.am = "";
                return false;
            }

            public final boolean onQueryTextSubmit(String str) {
                C2808d.m7147a(new C6757d(this.f16512a.ah, str));
                this.f16512a.as = true;
                return false;
            }
        });
        if (this.az) {
            mo3202Z();
        }
        return super.mo3210a(menu);
    }

    public final boolean mo2315a(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_delete_chat) {
            Bundle bundle = new Bundle();
            bundle.putInt("dialog_id", 14);
            m14004e(bundle);
            return true;
        }
        if (itemId == R.id.action_mute_notification) {
            C2808d.m7148b(new C6777a(C2973m.SINGLE, this.ah, this.au.isChecked() ^ true));
        }
        return super.mo2315a(menuItem);
    }

    public final void aa() {
        this.az = false;
        if (this.aq != null) {
            this.aq.setVisible(true);
            this.ay.setVisible(true);
            this.ap.setVisible(true);
            ad();
        }
    }

    public final void ab() {
        if (this.ay != null) {
            this.ay.collapseActionView();
        }
    }

    protected final boolean ac() {
        return true;
    }

    final void ad() {
        if (!(this.au == null || this.ah == null || this.ah.isEmpty())) {
            if (this.ah.equals(this.ai)) {
                this.au.setVisible(false);
            } else {
                this.au.setVisible(true);
            }
        }
    }

    public final C0350e<Cursor> mo3217b(int i) {
        String str = this.ah;
        StringBuilder stringBuilder = new StringBuilder("SELECT conversations._id as _id,conversations_message_id,conversations_event_type,conversations_event,conversations_send_time,conversations_receive_time,conversations_likes,conversations_my_like,conversations_visits,conversations_my_visit,conversations_my_vote,conversations_is_need_notify,conversations_reply_message_id,conversations_link_preview,conversations_direction_type,conversations_event_state,conversations_party,conversations_peer_user_id,conversations_group_type,conversations_file_id,conversations_sticker_id,conversations_forward_user_id,conversations_forward_group_type,conversations_forward_name,conversations_forward_message_id,conversations_edit_time,conversations_extra,files_file_uri,files_type,files_name,files_size,files_progress,files_thumbnail_uri,files_download_state,files_thumbnail_download_state,files_duration,files_audio_playing_time,files_audio_state,files_image_width,files_image_height,stickers_sticker_id,stickers_package_id,stickers_sticker_version,stickers_original_uri,stickers_thumbnail_uri,stickers_ver_span,stickers_hor_span,stickers_view_multiplier,stickers_download_state,members_nick_name,members_avatar_url,members_avatar_thumbnail_url,members_user_id,members_is_local_user,members_last_online,members_last_position,members_can_reply,members_is_anouncer,members_local_name,members_local_phone_number,members_moto,members_is_pined,members_is_mute,members_local_image_uri FROM ((( conversations LEFT JOIN files ON conversations_file_id = files._id) LEFT JOIN stickers ON conversations_sticker_id = stickers_complete_sticker_id) LEFT JOIN members ON conversations_peer_user_id = members_user_id) WHERE ");
        stringBuilder.append("conversations_party = '");
        stringBuilder.append(str);
        stringBuilder.append("' AND conversations_event_state <> '");
        stringBuilder.append(C2971k.DRAFT.ordinal());
        stringBuilder.append("' AND conversations_event_state <> '");
        stringBuilder.append(C2971k.DELETED.ordinal());
        stringBuilder.append("' ORDER BY conversations_send_time DESC LIMIT ");
        stringBuilder.append(i);
        String stringBuilder2 = stringBuilder.toString();
        return new C7316h(C2967c.f9203a, stringBuilder2, C2967c.f9203a, C2985d.f9350a, C3012b.f9455a);
    }

    public final void mo2316b() {
        super.mo2316b();
        this.aw = false;
        MyApplication.m12950a().f15918x = null;
    }

    protected final void mo3218b(int i, int i2, int i3, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.ah);
        C2808d.m7147a(new C6725n(arrayList, str, i, i2, i3, this.ah, C2973m.SINGLE, null, null));
    }

    public final void mo2318b(Bundle bundle) {
        if (!(this.f16471Q == null || this.f16471Q.getData() == null || !this.f16471Q.getData().getAuthority().equals("com.android.contacts"))) {
            Uri data = this.f16471Q.getData();
            ArrayList arrayList = new ArrayList();
            Cursor query = MyApplication.m12952b().getContentResolver().query(data, null, null, null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    arrayList.add(query.getString(query.getColumnIndex("data3")));
                }
                query.close();
            }
            this.ah = C2580f.m7024a(C2535a.m6888a().m6933e(), (String) arrayList.get(0));
        }
        if (!(this.f16471Q == null || this.f16471Q.getExtras() == null || !this.f16471Q.getExtras().containsKey("KEY_PARTY"))) {
            this.ah = this.f16471Q.getStringExtra("KEY_PARTY");
        }
        if (bundle != null) {
            this.al = bundle.getString("key_name_user", "");
            if (bundle.containsKey("KEY_SEARCH_ROTATE")) {
                this.am = bundle.getString("KEY_SEARCH_ROTATE", "");
            }
            if (bundle.containsKey("KEY_IS_SUBMIT_PRESSED")) {
                this.as = bundle.getBoolean("KEY_IS_SUBMIT_PRESSED", false);
            }
        }
        super.mo2318b(bundle);
        this.ai = C2535a.m6888a().m6928d();
        this.ao = C2535a.m6888a().m6919b();
        mo3209a(C2522a.ACTIVE);
        ((C7576b) this.f10377a).m19190e().mo268a(25, null, this.aC);
        m14026m();
        this.ak = (Button) this.b.findViewById(R.id.follow_button);
        this.ak.setVisibility(8);
        this.ak.setOnClickListener(new C33731(this));
        C2491i.m6819b(this.ak, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6798a(this.ak, UIThemeManager.getmInstance().getButton_text_color());
    }

    public final void mo3219b(String str, String str2, String[] strArr, String str3) {
        if (strArr.length <= 0) {
            if (str3.length() <= 0) {
                Toast.makeText((C7576b) this.f10377a, C4522p.m8236a(R.string.you_must_answer_before_submitting), 0).show();
                return;
            }
        }
        final C1063i c6711v = new C6711v(str, str2, strArr, str3);
        C2808d.m7148b(c6711v);
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6877f f10365b;

            public final void run() {
                C4501c.m8189a().m8192a((C7576b) this.f10365b.f10377a, c6711v);
            }
        });
    }

    public final void mo2322c() {
        super.mo2322c();
        this.aw = false;
        MyApplication.m12950a().f15918x = null;
    }

    public final void mo2323c(Bundle bundle) {
        super.mo2323c(bundle);
    }

    public final void mo2326d() {
        super.mo2326d();
        ((C7576b) this.f10377a).getLoaderManager().destroyLoader(24);
        ((C7576b) this.f10377a).getLoaderManager().destroyLoader(25);
    }

    public final void mo2327d(Bundle bundle) {
        super.mo2327d(bundle);
        bundle.putString("key_name_user", this.al);
        bundle.putBoolean("KEY_IS_SUBMIT_PRESSED", this.as);
        if (this.ax != null) {
            bundle.putString("KEY_SEARCH_ROTATE", this.ax.getQuery() != null ? this.ax.getQuery().toString() : "");
        }
    }

    protected final void mo3220f(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.ah);
        C2808d.m7147a(new C6726o(arrayList, str, this.ah, C2973m.SINGLE, null, null));
    }

    public final void mo3221g(String str) {
        Log.d("ccc ", " ccc in S LoadMore");
        C2808d.m7148b(new C6676a(this.ah, str));
        this.e++;
        m13940M();
    }

    public final void mo3222h(String str) {
        if (this.ax != null) {
            this.ay.expandActionView();
            this.j.m14069e((C7576b) this.f10377a);
            this.aq.setVisible(false);
            this.ap.setVisible(false);
            this.au.setVisible(false);
            this.ax.setQuery(str, true);
            this.ar = true;
            this.m.clear();
            this.as = false;
        }
    }

    protected final void mo3223h(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.ah);
        C2808d.m7147a(new C6726o(arrayList, str, this.ah, C2973m.SINGLE, str2, null));
    }

    public final void mo3224i(String str) {
        if (this.aw) {
            C2808d.m7147a(new C6724m(this.ah, str, C2973m.SINGLE));
        }
    }

    protected final void mo3225i(String str, String str2) {
        C2808d.m7147a(new C6762d(str, this.ah, C2973m.SINGLE, str2));
    }

    public final void mo3226j(String str) {
    }

    public final void mo3227k(String str) {
        final C1063i c6704m = new C6704m(str);
        C2808d.m7148b(c6704m);
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6877f f10367b;

            public final void run() {
                C4501c.m8189a().m8192a((C7576b) this.f10367b.f10377a, c6704m);
            }
        });
    }

    public final void onEvent(C5906a c5906a) {
        m17504a(c5906a.f8890a);
    }

    public final void onEvent(C2619b c2619b) {
        m17506a(c2619b.f8515a ^ 1, c2619b.f8516b);
    }

    public final void onEvent(C5907c c5907c) {
        m17504a(c5907c.f8890a);
    }

    public final void onEvent(final C5908d c5908d) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6877f f10347b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a((C7576b) this.f10347b.f10377a, c5908d.f8890a);
            }
        });
    }

    public final void onEvent(C2624e c2624e) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6877f f10345a;

            {
                this.f10345a = r1;
            }

            public final void run() {
                C4501c.m8189a().m8193b();
                this.f10345a.ak.setVisibility(8);
                this.f10345a.m13938K();
            }
        });
    }

    public final void onEvent(C2648l c2648l) {
        m17506a(c2648l.f8560a ^ true, c2648l.f8561b);
        this.g.f16550I = true;
    }

    public final void onEvent(final C5921m c5921m) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6877f f10373b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a((C7576b) this.f10373b.f10377a, c5921m.f8890a);
            }
        });
    }

    public final void onEvent(final C2649n c2649n) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6877f f10369b;

            public final void run() {
                C4501c.m8189a().m8193b();
                this.f10369b.f = c2649n.f8564a;
                this.f10369b.m13979a(this.f10369b.f);
            }
        });
    }

    public final void onEvent(final C5925t c5925t) {
        ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6877f f10371b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a((C7576b) this.f10371b.f10377a, c5925t.f8890a);
            }
        });
    }

    public final void onEvent(C2652u c2652u) {
        ((C7576b) this.f10377a).runOnUiThread(new C33797(this));
    }

    public final void onEvent(C2716a c2716a) {
        C4501c.m8189a().m8193b();
        m14012g();
        m13958a((int) R.anim.anim_slide_in_right, (int) R.anim.anim_slide_out_right);
    }

    public final void onEvent(final C2807d c2807d) {
        if (c2807d.f8871a.equals(this.ah)) {
            ((C7576b) this.f10377a).runOnUiThread(new Runnable(this) {
                final /* synthetic */ C6877f f10352b;

                public final void run() {
                    this.f10352b.m17507b(c2807d.f8872b);
                }
            });
        }
    }
}
