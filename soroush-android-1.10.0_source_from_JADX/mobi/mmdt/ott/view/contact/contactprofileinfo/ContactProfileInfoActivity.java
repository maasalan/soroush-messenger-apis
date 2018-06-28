package mobi.mmdt.ott.view.contact.contactprofileinfo;

import android.app.Activity;
import android.app.Dialog;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.ClipData;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.C7406c;
import android.text.ClipboardManager;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.p072b.p073a.p074a.C1063i;
import mobi.mmdt.componentsutils.p232b.C2474a;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.aa.C6643b;
import mobi.mmdt.ott.logic.p261a.p276b.C2622a;
import mobi.mmdt.ott.logic.p261a.p276b.C2622a.C2621a;
import mobi.mmdt.ott.logic.p261a.p276b.C2624e;
import mobi.mmdt.ott.logic.p261a.p276b.C5908d;
import mobi.mmdt.ott.logic.p261a.p276b.C6679b;
import mobi.mmdt.ott.logic.p359k.C2837a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.provider.p389k.C6034d;
import mobi.mmdt.ott.view.components.C7695a;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4508f;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4516l;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p479c.C4501c;

public class ContactProfileInfoActivity extends C7695a implements C3101a {
    private TextInputLayout f24599A;
    private TextInputLayout f24600B;
    private TextView f24601C;
    private EditText f24602D;
    private EditText f24603E;
    private MenuItem f24604F;
    private MenuItem f24605G;
    private MenuItem f24606H;
    private MenuItem f24607I;
    private String f24608J = "";
    private String f24609K = "";
    private boolean f24610L;
    private boolean f24611M;
    private boolean f24612N;
    private boolean f24613O;
    private String f24614P;
    private String f24615Q;
    private String f24616R;
    private String f24617S = "";
    private String f24618T;
    private RelativeLayout f24619U;
    private LinearLayout f24620V;
    private FrameLayout f24621W;
    private ImageView f24622X;
    private TextView f24623Y;
    private String f24624Z = "";
    private View aa;
    private EditText ab;
    private OnClickListener ac = new C32711(this);
    private OnClickListener ad = new C32766(this);
    private LoaderCallbacks<Cursor> ae = new C32777(this);
    private TextInputLayout f24625z;

    class C32711 implements OnClickListener {
        final /* synthetic */ ContactProfileInfoActivity f10045a;

        C32711(ContactProfileInfoActivity contactProfileInfoActivity) {
            this.f10045a = contactProfileInfoActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ContactProfileInfoActivity.m21589a(this.f10045a);
        }
    }

    class C32722 implements OnClickListener {
        final /* synthetic */ ContactProfileInfoActivity f10046a;

        C32722(ContactProfileInfoActivity contactProfileInfoActivity) {
            this.f10046a = contactProfileInfoActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C2837a.m7167a(ContactProfileInfoActivity.m21585A(this.f10046a), "android.permission.RECORD_AUDIO", 186);
        }
    }

    class C32733 implements OnClickListener {
        final /* synthetic */ ContactProfileInfoActivity f10047a;

        C32733(ContactProfileInfoActivity contactProfileInfoActivity) {
            this.f10047a = contactProfileInfoActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C4488b.m8184a(ContactProfileInfoActivity.m21586B(this.f10047a));
        }
    }

    class C32744 implements Runnable {
        final /* synthetic */ ContactProfileInfoActivity f10048a;

        C32744(ContactProfileInfoActivity contactProfileInfoActivity) {
            this.f10048a = contactProfileInfoActivity;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
        }
    }

    class C32766 implements OnClickListener {
        final /* synthetic */ ContactProfileInfoActivity f10051a;

        C32766(ContactProfileInfoActivity contactProfileInfoActivity) {
            this.f10051a = contactProfileInfoActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ContactProfileInfoActivity.m21593b(this.f10051a);
        }
    }

    class C32777 implements LoaderCallbacks<Cursor> {
        final /* synthetic */ ContactProfileInfoActivity f10052a;

        C32777(ContactProfileInfoActivity contactProfileInfoActivity) {
            this.f10052a = contactProfileInfoActivity;
        }

        public final Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
            return C2999a.m7511c(this.f10052a.f24609K);
        }

        public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
            C32777 c32777 = this;
            Cursor cursor = (Cursor) obj;
            if (cursor.moveToFirst()) {
                C6034d c6034d = new C6034d(cursor);
                if (c6034d.m13510b().equals(c32777.f10052a.f24609K)) {
                    String a;
                    String a2;
                    Long c;
                    String a3;
                    boolean e;
                    String str;
                    String str2;
                    String a4 = c6034d.m7352a("members_local_name");
                    String a5 = c6034d.m7352a("members_soroush_id");
                    String a6 = c6034d.m7352a("members_nick_name");
                    String a7 = c6034d.m7352a("members_moto");
                    String a8 = c6034d.m7352a("members_extra");
                    c32777.f10052a.f24624Z = c6034d.m7352a("members_last_position");
                    if (a8 != null) {
                        if (!a8.equals("1")) {
                            if (a8.equals("0")) {
                                c32777.f10052a.f24611M = true;
                            }
                            if (!(c32777.f10052a.f24606H == null || c32777.f10052a.f24605G == null)) {
                                if (c32777.f10052a.f24611M) {
                                    c32777.f10052a.f24606H.setVisible(false);
                                    c32777.f10052a.f24605G.setVisible(true);
                                } else {
                                    c32777.f10052a.f24606H.setVisible(true);
                                    c32777.f10052a.f24605G.setVisible(false);
                                }
                            }
                            if (c32777.f10052a.f24623Y != null) {
                                c32777.f10052a.f24623Y.setVisibility(c32777.f10052a.f24611M ? 0 : 8);
                            }
                            a8 = c6034d.m7352a("members_avatar_url");
                            a = c6034d.m7352a("members_avatar_thumbnail_url");
                            a2 = c6034d.m7352a("members_local_image_uri");
                            c = c6034d.m7354c("members_last_online");
                            if (c == null) {
                                c = Long.valueOf(0);
                            }
                            a3 = c32777.f10052a.f24613O ? C4508f.m8221a(a4, c6034d.m7352a("members_local_phone_number")) : C4508f.m8220a(a6);
                            c32777.f10052a.f24608J = a3;
                            c32777.f10052a.f24616R = a3;
                            e = c6034d.m13513e();
                            if (c32777.f10052a.f24608J != null) {
                                if (c32777.f10052a.f24608J.isEmpty()) {
                                    c32777.f10052a.m21053a(c32777.f10052a.f24608J, e);
                                    if (c.longValue() != -1 || c.longValue() == 0) {
                                        str = a;
                                        c32777.f10052a.m21056c("");
                                    } else {
                                        str = a;
                                        a4 = C2491i.m6772a(c32777.f10052a.getApplicationContext(), C2778b.m7093a(), c.longValue());
                                        if (c32777.f10052a.f24618T.equals("fa")) {
                                            if (!(a4.contains(c32777.f10052a.getString(R.string.online)) || a4.contains(c32777.f10052a.getString(R.string.one_minute_ago)) || a4.contains(c32777.f10052a.getString(R.string.minutes_ago)) || a4.contains(c32777.f10052a.getString(R.string.today)))) {
                                                if (!a4.contains(c32777.f10052a.getString(R.string.yesterday))) {
                                                    c32777.f10052a.m21056c(C2491i.m6825c(ContactProfileInfoActivity.m21612k(c32777.f10052a), c.longValue(), c32777.f10052a.f24618T));
                                                }
                                            }
                                            c32777.f10052a.m21056c(a4);
                                        } else {
                                            c32777.f10052a.m21056c(a4);
                                        }
                                    }
                                    if (a7 != null || a7.isEmpty()) {
                                        c32777.f10052a.f24602D.setText("");
                                        c32777.f10052a.f24625z.setVisibility(8);
                                    } else {
                                        if (c32777.f10052a.f24618T.equals("fa")) {
                                            c32777.f10052a.f24602D.setText(C2491i.m6814b(a7));
                                        } else {
                                            c32777.f10052a.f24602D.setText(a7);
                                        }
                                        c32777.f10052a.f24625z.setVisibility(0);
                                    }
                                    if (a5 != null || a5.isEmpty()) {
                                        c32777.f10052a.ab.setText("");
                                        c32777.f10052a.f24600B.setVisibility(8);
                                    } else {
                                        EditText n = c32777.f10052a.ab;
                                        StringBuilder stringBuilder = new StringBuilder("@");
                                        stringBuilder.append(a5);
                                        n.setText(stringBuilder.toString());
                                        c32777.f10052a.f24600B.setVisibility(0);
                                    }
                                    if (c6034d.m13511c()) {
                                        c32777.f10052a.f24603E.setText(c6034d.m7352a("members_local_phone_number"));
                                        c32777.f10052a.f24599A.setVisibility(0);
                                        c32777.f10052a.f24603E.setVisibility(0);
                                        c32777.f10052a.f24603E.setEnabled(true);
                                    } else {
                                        c32777.f10052a.f24599A.setVisibility(8);
                                        c32777.f10052a.f24603E.setVisibility(8);
                                        c32777.f10052a.f24603E.setEnabled(false);
                                    }
                                    c32777.f10052a.f24614P = a8;
                                    str2 = str;
                                    c32777.f10052a.f24615Q = str2;
                                    if (str2 == null && !str2.isEmpty()) {
                                        c32777.f10052a.m21052a(C4515k.m8231a(C2556b.m6998a(str2)));
                                        c32777.f10052a.m21055b(C4515k.m8231a(C2556b.m6998a(str2)));
                                        return;
                                    } else if (a2 != null || a2.isEmpty()) {
                                        c32777.f10052a.f24614P = null;
                                        c32777.f10052a.f24615Q = null;
                                        c32777.f10052a.m21069o();
                                        c32777.f10052a.m21070p();
                                    } else {
                                        c32777.f10052a.f24614P = a2;
                                        c32777.f10052a.f24615Q = null;
                                        c32777.f10052a.m21052a(a2);
                                        c32777.f10052a.m21055b(a2);
                                        return;
                                    }
                                }
                            }
                            if (a4 != null || a4.isEmpty()) {
                                if (a6 != null || a6.isEmpty()) {
                                    c32777.f10052a.m21053a("Contact Name", false);
                                } else {
                                    c32777.f10052a.m21053a(a6, e);
                                    c32777.f10052a.f24608J = a6;
                                }
                                if (c.longValue() != -1) {
                                }
                                str = a;
                                c32777.f10052a.m21056c("");
                                if (a7 != null) {
                                }
                                c32777.f10052a.f24602D.setText("");
                                c32777.f10052a.f24625z.setVisibility(8);
                                if (a5 != null) {
                                }
                                c32777.f10052a.ab.setText("");
                                c32777.f10052a.f24600B.setVisibility(8);
                                if (c6034d.m13511c()) {
                                    c32777.f10052a.f24599A.setVisibility(8);
                                    c32777.f10052a.f24603E.setVisibility(8);
                                    c32777.f10052a.f24603E.setEnabled(false);
                                } else {
                                    c32777.f10052a.f24603E.setText(c6034d.m7352a("members_local_phone_number"));
                                    c32777.f10052a.f24599A.setVisibility(0);
                                    c32777.f10052a.f24603E.setVisibility(0);
                                    c32777.f10052a.f24603E.setEnabled(true);
                                }
                                c32777.f10052a.f24614P = a8;
                                str2 = str;
                                c32777.f10052a.f24615Q = str2;
                                if (str2 == null) {
                                }
                                if (a2 != null) {
                                }
                                c32777.f10052a.f24614P = null;
                                c32777.f10052a.f24615Q = null;
                                c32777.f10052a.m21069o();
                                c32777.f10052a.m21070p();
                            } else {
                                c32777.f10052a.m21053a(a4, e);
                                c32777.f10052a.f24608J = a4;
                                if (c.longValue() != -1) {
                                }
                                str = a;
                                c32777.f10052a.m21056c("");
                                if (a7 != null) {
                                }
                                c32777.f10052a.f24602D.setText("");
                                c32777.f10052a.f24625z.setVisibility(8);
                                if (a5 != null) {
                                }
                                c32777.f10052a.ab.setText("");
                                c32777.f10052a.f24600B.setVisibility(8);
                                if (c6034d.m13511c()) {
                                    c32777.f10052a.f24603E.setText(c6034d.m7352a("members_local_phone_number"));
                                    c32777.f10052a.f24599A.setVisibility(0);
                                    c32777.f10052a.f24603E.setVisibility(0);
                                    c32777.f10052a.f24603E.setEnabled(true);
                                } else {
                                    c32777.f10052a.f24599A.setVisibility(8);
                                    c32777.f10052a.f24603E.setVisibility(8);
                                    c32777.f10052a.f24603E.setEnabled(false);
                                }
                                c32777.f10052a.f24614P = a8;
                                str2 = str;
                                c32777.f10052a.f24615Q = str2;
                                if (str2 == null) {
                                }
                                if (a2 != null) {
                                }
                                c32777.f10052a.f24614P = null;
                                c32777.f10052a.f24615Q = null;
                                c32777.f10052a.m21069o();
                                c32777.f10052a.m21070p();
                            }
                        }
                    }
                    c32777.f10052a.f24611M = false;
                    if (c32777.f10052a.f24611M) {
                        c32777.f10052a.f24606H.setVisible(false);
                        c32777.f10052a.f24605G.setVisible(true);
                    } else {
                        c32777.f10052a.f24606H.setVisible(true);
                        c32777.f10052a.f24605G.setVisible(false);
                    }
                    if (c32777.f10052a.f24623Y != null) {
                        if (c32777.f10052a.f24611M) {
                        }
                        c32777.f10052a.f24623Y.setVisibility(c32777.f10052a.f24611M ? 0 : 8);
                    }
                    a8 = c6034d.m7352a("members_avatar_url");
                    a = c6034d.m7352a("members_avatar_thumbnail_url");
                    a2 = c6034d.m7352a("members_local_image_uri");
                    c = c6034d.m7354c("members_last_online");
                    if (c == null) {
                        c = Long.valueOf(0);
                    }
                    if (c32777.f10052a.f24613O) {
                    }
                    c32777.f10052a.f24608J = a3;
                    c32777.f10052a.f24616R = a3;
                    e = c6034d.m13513e();
                    if (c32777.f10052a.f24608J != null) {
                        if (c32777.f10052a.f24608J.isEmpty()) {
                            c32777.f10052a.m21053a(c32777.f10052a.f24608J, e);
                            if (c.longValue() != -1) {
                            }
                            str = a;
                            c32777.f10052a.m21056c("");
                            if (a7 != null) {
                            }
                            c32777.f10052a.f24602D.setText("");
                            c32777.f10052a.f24625z.setVisibility(8);
                            if (a5 != null) {
                            }
                            c32777.f10052a.ab.setText("");
                            c32777.f10052a.f24600B.setVisibility(8);
                            if (c6034d.m13511c()) {
                                c32777.f10052a.f24599A.setVisibility(8);
                                c32777.f10052a.f24603E.setVisibility(8);
                                c32777.f10052a.f24603E.setEnabled(false);
                            } else {
                                c32777.f10052a.f24603E.setText(c6034d.m7352a("members_local_phone_number"));
                                c32777.f10052a.f24599A.setVisibility(0);
                                c32777.f10052a.f24603E.setVisibility(0);
                                c32777.f10052a.f24603E.setEnabled(true);
                            }
                            c32777.f10052a.f24614P = a8;
                            str2 = str;
                            c32777.f10052a.f24615Q = str2;
                            if (str2 == null) {
                            }
                            if (a2 != null) {
                            }
                            c32777.f10052a.f24614P = null;
                            c32777.f10052a.f24615Q = null;
                            c32777.f10052a.m21069o();
                            c32777.f10052a.m21070p();
                        }
                    }
                    if (a4 != null) {
                    }
                    if (a6 != null) {
                    }
                    c32777.f10052a.m21053a("Contact Name", false);
                    if (c.longValue() != -1) {
                    }
                    str = a;
                    c32777.f10052a.m21056c("");
                    if (a7 != null) {
                    }
                    c32777.f10052a.f24602D.setText("");
                    c32777.f10052a.f24625z.setVisibility(8);
                    if (a5 != null) {
                    }
                    c32777.f10052a.ab.setText("");
                    c32777.f10052a.f24600B.setVisibility(8);
                    if (c6034d.m13511c()) {
                        c32777.f10052a.f24603E.setText(c6034d.m7352a("members_local_phone_number"));
                        c32777.f10052a.f24599A.setVisibility(0);
                        c32777.f10052a.f24603E.setVisibility(0);
                        c32777.f10052a.f24603E.setEnabled(true);
                    } else {
                        c32777.f10052a.f24599A.setVisibility(8);
                        c32777.f10052a.f24603E.setVisibility(8);
                        c32777.f10052a.f24603E.setEnabled(false);
                    }
                    c32777.f10052a.f24614P = a8;
                    str2 = str;
                    c32777.f10052a.f24615Q = str2;
                    if (str2 == null) {
                    }
                    if (a2 != null) {
                    }
                    c32777.f10052a.f24614P = null;
                    c32777.f10052a.f24615Q = null;
                    c32777.f10052a.m21069o();
                    c32777.f10052a.m21070p();
                }
            }
        }

        public final void onLoaderReset(Loader<Cursor> loader) {
        }
    }

    class C32788 implements View.OnClickListener {
        final /* synthetic */ ContactProfileInfoActivity f10053a;

        C32788(ContactProfileInfoActivity contactProfileInfoActivity) {
            this.f10053a = contactProfileInfoActivity;
        }

        public final void onClick(View view) {
            C4478a.m8150a((Activity) this.f10053a, this.f10053a.f24609K, true, null, this.f10053a.f24624Z);
        }
    }

    static /* synthetic */ C7406c m21585A(ContactProfileInfoActivity contactProfileInfoActivity) {
        return contactProfileInfoActivity;
    }

    static /* synthetic */ C7406c m21586B(ContactProfileInfoActivity contactProfileInfoActivity) {
        return contactProfileInfoActivity;
    }

    static /* synthetic */ C7406c m21587C(ContactProfileInfoActivity contactProfileInfoActivity) {
        return contactProfileInfoActivity;
    }

    static /* synthetic */ void m21589a(ContactProfileInfoActivity contactProfileInfoActivity) {
        final C1063i c6679b = new C6679b(new C2622a(contactProfileInfoActivity.f24609K, C2621a.f8519a));
        C2808d.m7148b(c6679b);
        contactProfileInfoActivity.runOnUiThread(new Runnable(contactProfileInfoActivity) {
            final /* synthetic */ ContactProfileInfoActivity f10055b;

            public final void run() {
                C4501c.m8189a().m8192a(ContactProfileInfoActivity.m21626u(this.f10055b), c6679b);
            }
        });
    }

    static /* synthetic */ void m21593b(ContactProfileInfoActivity contactProfileInfoActivity) {
        final C1063i c6679b = new C6679b(new C2622a(contactProfileInfoActivity.f24609K, C2621a.f8520b));
        C2808d.m7148b(c6679b);
        contactProfileInfoActivity.runOnUiThread(new Runnable(contactProfileInfoActivity) {
            final /* synthetic */ ContactProfileInfoActivity f10037b;

            public final void run() {
                C4501c.m8189a().m8192a(ContactProfileInfoActivity.m21627v(this.f10037b), c6679b);
            }
        });
    }

    static /* synthetic */ C7406c m21612k(ContactProfileInfoActivity contactProfileInfoActivity) {
        return contactProfileInfoActivity;
    }

    static /* synthetic */ C7406c m21626u(ContactProfileInfoActivity contactProfileInfoActivity) {
        return contactProfileInfoActivity;
    }

    static /* synthetic */ C7406c m21627v(ContactProfileInfoActivity contactProfileInfoActivity) {
        return contactProfileInfoActivity;
    }

    static /* synthetic */ C7406c m21629x(ContactProfileInfoActivity contactProfileInfoActivity) {
        return contactProfileInfoActivity;
    }

    private void m21631y() {
        if (!C2474a.m6718b(getApplicationContext())) {
            Toast.makeText(this, C4522p.m8236a(R.string.connection_error_message), 0).show();
        } else if (C4516l.m8232a() && !C2837a.m7170a("android.permission.RECORD_AUDIO")) {
            Bundle bundle = new Bundle();
            bundle.putInt("dialog_id", 82);
            b_(bundle);
        } else if (this.f24609K.equals(this.f24617S)) {
            Toast.makeText(this, C4522p.m8236a(R.string.you_can_not_call_yourself), 0).show();
        } else {
            C4478a.m8163c((Activity) this, this.f24609K);
        }
    }

    public final Dialog mo2299a(Bundle bundle) {
        int i = bundle.getInt("dialog_id");
        if (i == 85) {
            return C4488b.m8182a(this, C4522p.m8236a(R.string.record_audio_permission), C4522p.m8236a(R.string.soroush_needs_record_audio_permission_to_record_and_send_audio_messages), C4522p.m8236a(R.string.ok_cap), null, C4522p.m8236a(R.string.settings), new C32733(this));
        }
        StringBuilder stringBuilder;
        switch (i) {
            case 80:
                stringBuilder = new StringBuilder();
                stringBuilder.append(C4522p.m8236a(R.string.action_block));
                stringBuilder.append(" ");
                stringBuilder.append(this.f24608J);
                return C4488b.m8182a(this, stringBuilder.toString(), String.format(C4522p.m8236a(R.string.are_you_sure_to_block), new Object[]{this.f24608J}), C4522p.m8236a(R.string.action_block), this.ac, C4522p.m8236a(R.string.cancel), null);
            case 81:
                stringBuilder = new StringBuilder();
                stringBuilder.append(C4522p.m8236a(R.string.action_unblock));
                stringBuilder.append(" ");
                stringBuilder.append(this.f24608J);
                return C4488b.m8182a(this, stringBuilder.toString(), String.format(C4522p.m8236a(R.string.are_you_sure_to_unblock), new Object[]{this.f24608J}), C4522p.m8236a(R.string.action_unblock), this.ad, C4522p.m8236a(R.string.cancel), null);
            case 82:
                return C4488b.m8182a(this, C4522p.m8236a(R.string.record_audio_permission), C4522p.m8236a(R.string.allow_soroush_access_to_your_microphone), C4522p.m8236a(R.string.movafegham), new C32722(this), C4522p.m8236a(R.string.felan_na), null);
            default:
                return super.mo2299a(bundle);
        }
    }

    protected final int mo3643g() {
        return R.drawable.ic_place_holder_contact;
    }

    protected final String mo3695h() {
        return this.f24609K != null ? this.f24609K : "";
    }

    protected final C2973m mo3696i() {
        return C2973m.SINGLE;
    }

    protected final void mo3697j() {
    }

    protected void mo3698k() {
        this.v = 0.75d;
        this.w = 0.5d;
    }

    protected final void mo3699l() {
        if (this.f24614P != null && this.f24615Q != null) {
            C4478a.m8164c(this, this.f24614P, this.f24615Q, this.f24616R);
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_call) {
            Intent intent = new Intent("android.intent.action.DIAL");
            StringBuilder stringBuilder = new StringBuilder("tel:");
            stringBuilder.append(this.f24603E.getText().toString());
            intent.setData(Uri.parse(stringBuilder.toString()));
            startActivity(intent);
        } else if (itemId == R.id.action_copy) {
            CharSequence obj = this.f24603E.getText().toString();
            if (VERSION.SDK_INT < 11) {
                ((ClipboardManager) getSystemService("clipboard")).setText(obj);
            } else {
                ((android.content.ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(C4522p.m8236a(R.string.app_name), obj));
            }
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m21057e((int) R.layout.fragment_contact_profile_info);
        this.f24610L = true;
        m21058f((int) R.drawable.ic_conversation_white_new_design);
        m21051a(new C32788(this));
        this.f24617S = C2535a.m6888a().m6928d();
        if (getIntent().getExtras().containsKey("KEY_IS_NOT_SHOW_START_CHAT_BOOLEAN")) {
            this.f24612N = getIntent().getExtras().getBoolean("KEY_IS_NOT_SHOW_START_CHAT_BOOLEAN");
        }
        if (getIntent().getExtras().containsKey("KEY_SHOW_LOCAL_INFO_BOOLEAN")) {
            this.f24613O = getIntent().getExtras().getBoolean("KEY_SHOW_LOCAL_INFO_BOOLEAN");
        }
        this.f24609K = getIntent().getExtras().getString("KEY_CONTACT_USER_ID_STRING");
        this.f24618T = C2535a.m6888a().m6919b();
        if (bundle != null) {
            this.f24608J = bundle.getString("KEY_NAME_USER", "");
        }
        this.f24619U = (RelativeLayout) findViewById(R.id.root_layout);
        this.f24620V = (LinearLayout) findViewById(R.id.linearLayout);
        this.f24621W = (FrameLayout) findViewById(R.id.top_frameLayout);
        this.f24601C = (TextView) findViewById(R.id.sharedMedia_textView);
        this.f24622X = (ImageView) findViewById(R.id.share_image_view);
        this.f24625z = (TextInputLayout) findViewById(R.id.profileStatus_textInputLayout);
        this.f24602D = (EditText) findViewById(R.id.profileStatus_editText);
        this.f24600B = (TextInputLayout) findViewById(R.id.userId_textInputLayout);
        this.ab = (EditText) findViewById(R.id.userId_editText);
        this.f24599A = (TextInputLayout) findViewById(R.id.phone_textInputLayout);
        this.f24603E = (EditText) findViewById(R.id.phone_editText);
        this.f24623Y = (TextView) findViewById(R.id.blocked_textView);
        this.aa = findViewById(R.id.spacer_view);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        if (this.f24619U != null) {
            LayoutParams layoutParams = this.f24619U.getLayoutParams();
            if (!getResources().getBoolean(R.bool.xlarge)) {
                layoutParams.height = (int) (((float) (point.y - (C2491i.m6759a(getApplicationContext()) + C2491i.m6805b(getApplicationContext())))) + C2491i.m6804b(getApplicationContext(), 10.0f));
                if (getResources().getConfiguration().orientation == 2) {
                    layoutParams.width = (int) (((double) point.x) * 0.75d);
                }
            }
        }
        this.f24599A.setVisibility(8);
        this.f24600B.setVisibility(8);
        this.f24603E.setVisibility(8);
        this.f24602D.setEnabled(false);
        this.f24603E.setEnabled(false);
        this.ab.setEnabled(false);
        new Thread(new Runnable(this) {
            final /* synthetic */ ContactProfileInfoActivity f10042a;

            {
                this.f10042a = r1;
            }

            public final void run() {
                Thread.currentThread().setPriority(1);
                final int h = C2966b.m7417h(this.f10042a.f24609K);
                this.f10042a.runOnUiThread(new Runnable(this) {
                    final /* synthetic */ AnonymousClass11 f10041b;

                    class C32681 implements View.OnClickListener {
                        final /* synthetic */ C32701 f10038a;

                        C32681(C32701 c32701) {
                            this.f10038a = c32701;
                        }

                        public final void onClick(View view) {
                            C4478a.m8147a(ContactProfileInfoActivity.m21629x(this.f10038a.f10041b.f10042a), this.f10038a.f10041b.f10042a.f24609K, this.f10038a.f10041b.f10042a.f24616R, C2973m.SINGLE);
                        }
                    }

                    class C32692 implements View.OnClickListener {
                        final /* synthetic */ C32701 f10039a;

                        C32692(C32701 c32701) {
                            this.f10039a = c32701;
                        }

                        public final void onClick(View view) {
                            Toast.makeText(this.f10039a.f10041b.f10042a, C4522p.m8236a(R.string.no_media_found), 0).show();
                        }
                    }

                    public final void run() {
                        TextView w;
                        CharSequence b;
                        View.OnClickListener c32681;
                        if (this.f10041b.f10042a.f24618T.equals("fa")) {
                            w = this.f10041b.f10042a.f24601C;
                            b = C2491i.m6814b(String.format(C4522p.m8236a(R.string.shared_media), new Object[]{Integer.valueOf(h)}));
                        } else {
                            w = this.f10041b.f10042a.f24601C;
                            b = String.format(C4522p.m8236a(R.string.shared_media), new Object[]{Integer.valueOf(h)});
                        }
                        w.setText(b);
                        if (h > 0) {
                            w = this.f10041b.f10042a.f24601C;
                            c32681 = new C32681(this);
                        } else {
                            w = this.f10041b.f10042a.f24601C;
                            c32681 = new C32692(this);
                        }
                        w.setOnClickListener(c32681);
                    }
                });
            }
        }).start();
        this.f24602D.setFocusable(false);
        this.f24603E.setFocusable(false);
        this.ab.setFocusable(false);
        this.f24601C.setFocusable(false);
        this.f24603E.setOnClickListener(new View.OnClickListener(this) {
            final /* synthetic */ ContactProfileInfoActivity f10043a;

            {
                this.f10043a = r1;
            }

            public final void onClick(View view) {
                this.f10043a.openContextMenu(this.f10043a.f24603E);
            }
        });
        C2491i.m6796a(this.f24619U, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6796a(this.f24620V, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6796a(this.f24621W, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6796a(this.aa, UIThemeManager.getmInstance().getSpacer_view_color());
        C2491i.m6802a(this.f24601C, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6801a(this.f24622X, UIThemeManager.getmInstance().getText_secondary_color());
        new View[1][0] = this.f24601C;
        C2491i.m6802a(this.f24623Y, UIThemeManager.getmInstance().getBlock_text_color());
        C2491i.m6796a(this.f24623Y, UIThemeManager.getmInstance().getBlock_background_color());
        C2491i.m6780a(UIThemeManager.getmInstance().getText_primary_color(), UIThemeManager.getmInstance().getAccent_color(), this.f24602D, this.f24603E, this.ab);
        C2491i.m6781a(UIThemeManager.getmInstance().getAccent_color(), this.f24625z, this.f24599A, this.f24600B);
        m21062h(C2491i.m6806b(getApplicationContext(), this.f24609K));
        getLoaderManager().initLoader(6, null, this.ae);
        C2808d.m7149c(new C6643b(new String[]{this.f24609K}, true, true));
        getWindow().setSoftInputMode(3);
        this.f24602D.setFocusable(false);
        this.ab.setFocusable(false);
        this.f24601C.setFocusable(false);
        registerForContextMenu(this.f24603E);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        getMenuInflater().inflate(R.menu.context_menu_contact_profile_info, contextMenu);
        MenuItem findItem = contextMenu.findItem(R.id.action_call);
        MenuItem findItem2 = contextMenu.findItem(R.id.action_copy);
        findItem.setTitle(C4522p.m8236a(R.string.action_call));
        findItem2.setTitle(C4522p.m8236a(R.string.action_copy));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!this.f24609K.equals(this.f24617S)) {
            getMenuInflater().inflate(R.menu.menu_contact_profile_info, menu);
            this.f24605G = menu.findItem(R.id.action_block);
            this.f24606H = menu.findItem(R.id.action_unblock);
            this.f24607I = menu.findItem(R.id.action_report);
            this.f24604F = menu.findItem(R.id.action_call);
            this.f24605G.setTitle(C4522p.m8236a(R.string.action_block));
            this.f24606H.setTitle(C4522p.m8236a(R.string.action_unblock));
            this.f24604F.setTitle(C4522p.m8236a(R.string.action_call));
            this.f24607I.setTitle(C4522p.m8236a(R.string.action_report));
            C2491i.m6790a(this.f24604F.getIcon(), UIThemeManager.getmInstance().getMenu_item_white_color());
            if (this.f24611M) {
                this.f24606H.setVisible(true);
                this.f24605G.setVisible(false);
            } else {
                this.f24606H.setVisible(false);
                this.f24605G.setVisible(true);
            }
            if (this.f24612N) {
                this.f24604F.setVisible(false);
                m21058f((int) R.drawable.ic_fab_call);
                m21051a(new View.OnClickListener(this) {
                    final /* synthetic */ ContactProfileInfoActivity f10044a;

                    {
                        this.f10044a = r1;
                    }

                    public final void onClick(View view) {
                        this.f10044a.m21631y();
                    }
                });
            } else {
                this.f24604F.setVisible(true);
            }
        }
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy() {
        super.onDestroy();
        this.f24610L = false;
        getLoaderManager().destroyLoader(6);
    }

    public void onEvent(final C5908d c5908d) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ ContactProfileInfoActivity f10050b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a(ContactProfileInfoActivity.m21587C(this.f10050b), c5908d.f8890a);
            }
        });
    }

    public void onEvent(C2624e c2624e) {
        runOnUiThread(new C32744(this));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_call) {
            m21631y();
            return true;
        }
        Bundle bundle;
        String str;
        int i;
        if (itemId == R.id.action_block) {
            bundle = new Bundle();
            str = "dialog_id";
            i = 80;
        } else if (itemId != R.id.action_unblock) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            bundle = new Bundle();
            str = "dialog_id";
            i = 81;
        }
        bundle.putInt(str, i);
        b_(bundle);
        return true;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 186 && iArr[0] != -1) {
            if (this.f24609K.equals(this.f24617S)) {
                Toast.makeText(this, C4522p.m8236a(R.string.you_can_not_call_yourself), 0).show();
            } else {
                C4478a.m8163c((Activity) this, this.f24609K);
            }
        }
    }

    protected void onResume() {
        super.onResume();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("KEY_NAME_USER", this.f24608J);
    }
}
