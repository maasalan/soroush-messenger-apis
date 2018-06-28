package mobi.mmdt.ott.view.main.callslist.newdesign.callhistory;

import android.app.Activity;
import android.app.Dialog;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.C7249g;
import android.support.v7.app.C7406c;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
import com.cocosw.bottomsheet.C1287c.C1286a;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.componentsutils.p232b.C2474a;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.logic.p359k.C2837a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C6021g;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.provider.p389k.C6034d;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.main.callslist.C6233a;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4506e;
import mobi.mmdt.ott.view.tools.C4508f;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4516l;
import mobi.mmdt.ott.view.tools.C4522p;

public class CallHistoryProfileActivity extends C7576b implements C3101a {
    RoundAvatarImageView f24359m;
    private TextView f24360n;
    private String f24361o;
    private TextView f24362p;
    private String f24363q;
    private String f24364r = "";
    private long f24365s;
    private LoaderCallbacks<Cursor> f24366t = new C41811(this);

    class C41811 implements LoaderCallbacks<Cursor> {
        final /* synthetic */ CallHistoryProfileActivity f11925a;

        C41811(CallHistoryProfileActivity callHistoryProfileActivity) {
            this.f11925a = callHistoryProfileActivity;
        }

        public final Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
            return C2999a.m7511c(this.f11925a.f24361o);
        }

        public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
            Cursor cursor = (Cursor) obj;
            if (cursor.moveToFirst()) {
                C6034d c6034d = new C6034d(cursor);
                if (c6034d.m13510b().equals(this.f11925a.f24361o)) {
                    C7249g c7249g;
                    CallHistoryProfileActivity callHistoryProfileActivity;
                    String a = c6034d.m7352a("members_local_name");
                    String a2 = c6034d.m7352a("members_nick_name");
                    String a3 = c6034d.m7352a("members_avatar_url");
                    String a4 = c6034d.m7352a("members_avatar_thumbnail_url");
                    boolean c = c6034d.m13511c();
                    String a5 = c6034d.m7352a("members_local_image_uri");
                    String a6 = c ? C4508f.m8221a(a, c6034d.m7352a("members_local_phone_number")) : C4508f.m8220a(a2);
                    if (a6 != null) {
                        if (!a6.isEmpty()) {
                            this.f11925a.f24360n.setText(a6);
                            this.f11925a.f24359m.setBackgroundColor(C2491i.m6806b(CallHistoryProfileActivity.m21280b(this.f11925a), this.f11925a.f24361o));
                            if (a4 == null && !a4.isEmpty()) {
                                this.f11925a.m21285a(C4515k.m8231a(C2556b.m6998a(a4)));
                                return;
                            } else if (a3 == null && !a3.isEmpty()) {
                                this.f11925a.m21285a(C4515k.m8231a(C2556b.m6998a(a3)));
                                return;
                            } else if (a5 != null || a5.isEmpty()) {
                                c7249g = this.f11925a;
                                C1212c.m2873a(c7249g).m10950a(Integer.valueOf(R.drawable.ic_place_holder_contact)).m3034a(C1248f.m2945b()).m3031a(c7249g.f24359m);
                            } else {
                                this.f11925a.m21285a(a5);
                                return;
                            }
                        }
                    }
                    if (a != null && !a.isEmpty()) {
                        callHistoryProfileActivity = this.f11925a;
                    } else if (a2 == null || a2.isEmpty()) {
                        callHistoryProfileActivity = this.f11925a;
                        a = "Contact Name";
                    } else {
                        this.f11925a.f24360n.setText(a2);
                        this.f11925a.f24359m.setBackgroundColor(C2491i.m6806b(CallHistoryProfileActivity.m21280b(this.f11925a), this.f11925a.f24361o));
                        if (a4 == null) {
                        }
                        if (a3 == null) {
                        }
                        if (a5 != null) {
                        }
                        c7249g = this.f11925a;
                        C1212c.m2873a(c7249g).m10950a(Integer.valueOf(R.drawable.ic_place_holder_contact)).m3034a(C1248f.m2945b()).m3031a(c7249g.f24359m);
                    }
                    callHistoryProfileActivity.f24360n.setText(a);
                    this.f11925a.f24359m.setBackgroundColor(C2491i.m6806b(CallHistoryProfileActivity.m21280b(this.f11925a), this.f11925a.f24361o));
                    if (a4 == null) {
                    }
                    if (a3 == null) {
                    }
                    if (a5 != null) {
                    }
                    c7249g = this.f11925a;
                    C1212c.m2873a(c7249g).m10950a(Integer.valueOf(R.drawable.ic_place_holder_contact)).m3034a(C1248f.m2945b()).m3031a(c7249g.f24359m);
                }
            }
        }

        public final void onLoaderReset(Loader<Cursor> loader) {
        }
    }

    class C41833 implements OnClickListener {
        final /* synthetic */ CallHistoryProfileActivity f11928a;

        C41833(CallHistoryProfileActivity callHistoryProfileActivity) {
            this.f11928a = callHistoryProfileActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C2837a.m7167a(CallHistoryProfileActivity.m21282d(this.f11928a), "android.permission.RECORD_AUDIO", 186);
        }
    }

    class C41844 implements OnClickListener {
        final /* synthetic */ CallHistoryProfileActivity f11929a;

        C41844(CallHistoryProfileActivity callHistoryProfileActivity) {
            this.f11929a = callHistoryProfileActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C4488b.m8184a(CallHistoryProfileActivity.m21283e(this.f11929a));
        }
    }

    static /* synthetic */ C7406c m21280b(CallHistoryProfileActivity callHistoryProfileActivity) {
        return callHistoryProfileActivity;
    }

    static /* synthetic */ C7406c m21282d(CallHistoryProfileActivity callHistoryProfileActivity) {
        return callHistoryProfileActivity;
    }

    static /* synthetic */ C7406c m21283e(CallHistoryProfileActivity callHistoryProfileActivity) {
        return callHistoryProfileActivity;
    }

    public final Dialog mo2299a(Bundle bundle) {
        int i = bundle.getInt("dialog_id");
        if (i == 82) {
            return C4488b.m8182a(this, C4522p.m8236a(R.string.record_audio_permission), C4522p.m8236a(R.string.allow_soroush_access_to_your_microphone), C4522p.m8236a(R.string.movafegham), new C41833(this), C4522p.m8236a(R.string.felan_na), null);
        }
        if (i == 85) {
            return C4488b.m8182a(this, C4522p.m8236a(R.string.record_audio_permission), C4522p.m8236a(R.string.soroush_needs_record_audio_permission_to_record_and_send_audio_messages), C4522p.m8236a(R.string.ok_cap), null, C4522p.m8236a(R.string.settings), new C41844(this));
        }
        if (i != 417) {
            return null;
        }
        bundle.getString("KEY_DIALOG_NAME", "");
        final String string = bundle.getString("KEY_DIALOG_USER_NAME", "");
        C1286a c1286a = new C1286a(this);
        c1286a.f4034f = new OnClickListener(this) {
            final /* synthetic */ CallHistoryProfileActivity f11927b;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (i == R.id.action_delete) {
                    String str = string;
                    new C6021g().m13378a(str).m7360a(MyApplication.m12952b());
                }
            }
        };
        C4506e.m8204a(this, c1286a, R.menu.context_menu_calls_list_long_click);
        return c1286a.m3053a();
    }

    protected final void m21285a(String str) {
        C1212c.m2873a((C7249g) this).m10950a((Object) str).m3034a(C1248f.m2945b()).m3031a(this.f24359m);
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_call_history);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        this.f24360n = (TextView) this.x.findViewById(R.id.contact_title);
        this.f24362p = (TextView) findViewById(R.id.contact_subtitle);
        this.f24359m = (RoundAvatarImageView) findViewById(R.id.logo_imageView);
        this.y = findViewById(R.id.shadow_line_top);
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
        C2475a.m6719a((Activity) this, "");
        this.f24364r = C2535a.m6888a().m6928d();
        this.f24363q = C2535a.m6888a().m6919b();
        Intent intent = getIntent();
        bundle = intent != null ? intent.getExtras() : null;
        this.f24361o = bundle != null ? bundle.getString("KEY_CONTACT_USER_ID_STRING") : "";
        long j = (bundle == null || !bundle.containsKey("KEY_TIME_CALL")) ? -1 : bundle.getLong("KEY_TIME_CALL");
        this.f24365s = j;
        getLoaderManager().initLoader(35, null, this.f24366t);
        Fragment c6233a = new C6233a();
        Bundle bundle2 = new Bundle();
        bundle2.putString("KEY_USER_ID", this.f24361o);
        bundle2.putLong("KEY_DATE", this.f24365s);
        c6233a.setArguments(bundle2);
        if (!c6233a.isDetached()) {
            FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
            beginTransaction.replace(R.id.container_frame, c6233a);
            beginTransaction.setTransition(4099);
            beginTransaction.commit();
        }
        CharSequence a = C4522p.m8236a(R.string.call_history);
        if (a != null) {
            if (!a.isEmpty()) {
                TextView textView;
                if (this.f24363q.equals("fa")) {
                    textView = this.f24362p;
                    a = C2491i.m6814b((String) a);
                } else {
                    textView = this.f24362p;
                }
                textView.setText(a);
                this.f24362p.setVisibility(0);
                m20721a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
                C2491i.m6784a(UIThemeManager.getmInstance().getText_primary_new_design_color(), this.f24360n, this.f24362p);
                m20726u();
                if (getWindow() != null && getWindow().getDecorView() != null) {
                    getWindow().getDecorView().setBackgroundColor(UIThemeManager.getmInstance().getSpacer_view_color());
                    return;
                }
            }
        }
        this.f24362p.setText("");
        this.f24362p.setVisibility(8);
        m20721a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
        C2491i.m6784a(UIThemeManager.getmInstance().getText_primary_new_design_color(), this.f24360n, this.f24362p);
        m20726u();
        if (getWindow() != null) {
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_contact_profile_info, menu);
        MenuItem findItem = menu.findItem(R.id.action_block);
        MenuItem findItem2 = menu.findItem(R.id.action_unblock);
        MenuItem findItem3 = menu.findItem(R.id.action_report);
        findItem2.setVisible(false);
        findItem.setVisible(false);
        findItem3.setVisible(false);
        findItem = menu.findItem(R.id.action_call);
        findItem.setTitle(C4522p.m8236a(R.string.action_call));
        C2491i.m6790a(findItem.getIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_call) {
            int i;
            if (!C2474a.m6718b(getApplicationContext())) {
                i = R.string.connection_error_message;
            } else if (C4516l.m8232a() && !C2837a.m7170a("android.permission.RECORD_AUDIO")) {
                Bundle bundle = new Bundle();
                bundle.putInt("dialog_id", 82);
                b_(bundle);
                return true;
            } else if (this.f24361o.equals(this.f24364r)) {
                i = R.string.you_can_not_call_yourself;
            } else {
                C4478a.m8163c((Activity) this, this.f24361o);
                return true;
            }
            Toast.makeText(this, C4522p.m8236a(i), 0).show();
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            onBackPressed();
            return true;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 186 && iArr[0] != -1) {
            if (this.f24361o.equals(this.f24364r)) {
                Toast.makeText(this, C4522p.m8236a(R.string.you_can_not_call_yourself), 0).show();
            } else {
                C4478a.m8163c((Activity) this, this.f24361o);
            }
        }
    }
}
