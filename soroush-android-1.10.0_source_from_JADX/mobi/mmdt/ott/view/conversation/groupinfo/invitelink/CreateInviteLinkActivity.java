package mobi.mmdt.ott.view.conversation.groupinfo.invitelink;

import android.app.Dialog;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.C6389b.C0663a;
import android.support.v7.app.C7406c;
import android.text.ClipboardManager;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.p072b.p073a.p074a.C1063i;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p311r.p312a.p313a.C5956a;
import mobi.mmdt.ott.logic.p357j.C6809a;
import mobi.mmdt.ott.logic.p357j.C6810b;
import mobi.mmdt.ott.logic.p357j.C6813e;
import mobi.mmdt.ott.logic.p357j.p358a.C2828a;
import mobi.mmdt.ott.logic.p357j.p358a.C2829c;
import mobi.mmdt.ott.logic.p357j.p358a.C2835l;
import mobi.mmdt.ott.logic.p357j.p358a.C5986b;
import mobi.mmdt.ott.logic.p357j.p358a.C5989k;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.view.components.C7695a;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p479c.C4501c;

public class CreateInviteLinkActivity extends C7695a implements C3101a {
    private TextView f24732A;
    private String f24733B = "";
    private String f24734C = "";
    private String f24735D = "";
    private String f24736E = "";
    private Button f24737F;
    private RelativeLayout f24738G;
    private TextView f24739H;
    private TextView f24740I;
    private TextView f24741z;

    class C40801 implements OnClickListener {
        final /* synthetic */ CreateInviteLinkActivity f11681a;

        C40801(CreateInviteLinkActivity createInviteLinkActivity) {
            this.f11681a = createInviteLinkActivity;
        }

        public final void onClick(View view) {
            CreateInviteLinkActivity.m21923a(this.f11681a);
        }
    }

    class C40812 implements DialogInterface.OnClickListener {
        final /* synthetic */ CreateInviteLinkActivity f11682a;

        C40812(CreateInviteLinkActivity createInviteLinkActivity) {
            this.f11682a = createInviteLinkActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f11682a.m21926b(true);
        }
    }

    class C40823 implements DialogInterface.OnClickListener {
        final /* synthetic */ CreateInviteLinkActivity f11683a;

        C40823(CreateInviteLinkActivity createInviteLinkActivity) {
            this.f11683a = createInviteLinkActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            CreateInviteLinkActivity.m21936l(this.f11683a);
        }
    }

    class C40834 implements OnClickListener {
        final /* synthetic */ CreateInviteLinkActivity f11684a;

        C40834(CreateInviteLinkActivity createInviteLinkActivity) {
            this.f11684a = createInviteLinkActivity;
        }

        public final void onClick(View view) {
            CreateInviteLinkActivity.m21925b(this.f11684a);
        }
    }

    class C40845 implements DialogInterface.OnClickListener {
        final /* synthetic */ CreateInviteLinkActivity f11685a;

        C40845(CreateInviteLinkActivity createInviteLinkActivity) {
            this.f11685a = createInviteLinkActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            switch (i) {
                case 0:
                    Context context = this.f11685a;
                    CharSequence charSequence = this.f11685a.f24741z.getText().toString();
                    if (VERSION.SDK_INT < 11) {
                        ((ClipboardManager) context.getSystemService("clipboard")).setText(charSequence);
                    } else {
                        ((android.content.ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(C4522p.m8236a(R.string.app_name), charSequence));
                    }
                    Toast.makeText(context, C4522p.m8236a(R.string.message_copied_to_clipboard), 0).show();
                    return;
                case 1:
                    Bundle bundle = new Bundle();
                    bundle.putInt("dialog_id", 101);
                    this.f11685a.b_(bundle);
                    return;
                default:
                    return;
            }
        }
    }

    class C40856 implements Runnable {
        final /* synthetic */ CreateInviteLinkActivity f11686a;

        C40856(CreateInviteLinkActivity createInviteLinkActivity) {
            this.f11686a = createInviteLinkActivity;
        }

        public final void run() {
            if (this.f11686a.f24734C == null || this.f11686a.f24734C.isEmpty()) {
                this.f11686a.m21926b(false);
            } else {
                C4501c.m8189a().m8193b();
                if (this.f11686a.f24741z != null) {
                    this.f11686a.m21938z();
                    this.f11686a.f24741z.setText(this.f11686a.f24734C);
                }
            }
        }
    }

    class C40878 implements Runnable {
        final /* synthetic */ CreateInviteLinkActivity f11689a;

        C40878(CreateInviteLinkActivity createInviteLinkActivity) {
            this.f11689a = createInviteLinkActivity;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
            if (this.f11689a.f24734C != null && !this.f11689a.f24734C.isEmpty() && this.f11689a.f24741z != null) {
                this.f11689a.f24741z.setText(this.f11689a.f24734C);
                this.f11689a.m21938z();
            }
        }
    }

    static /* synthetic */ void m21923a(CreateInviteLinkActivity createInviteLinkActivity) {
        if (createInviteLinkActivity.f24734C != null) {
            if (!createInviteLinkActivity.f24734C.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putInt("dialog_id", 100);
                createInviteLinkActivity.b_(bundle);
                return;
            }
        }
        createInviteLinkActivity.m21926b(true);
    }

    static /* synthetic */ void m21925b(CreateInviteLinkActivity createInviteLinkActivity) {
        C0663a c0663a = new C0663a(createInviteLinkActivity);
        c0663a.m1611a(new CharSequence[]{C4522p.m8236a(R.string.action_copy), C4522p.m8236a(R.string.action_delete)}, new C40845(createInviteLinkActivity));
        c0663a.m1615b();
    }

    private void m21926b(boolean z) {
        C1063i c6809a = new C6809a(this.f24733B);
        C2808d.m7148b(c6809a);
        if (z) {
            C4501c.m8189a().m8192a(this, c6809a);
        }
    }

    static /* synthetic */ C7406c m21931g(CreateInviteLinkActivity createInviteLinkActivity) {
        return createInviteLinkActivity;
    }

    static /* synthetic */ C7406c m21933i(CreateInviteLinkActivity createInviteLinkActivity) {
        return createInviteLinkActivity;
    }

    static /* synthetic */ C7406c m21934j(CreateInviteLinkActivity createInviteLinkActivity) {
        return createInviteLinkActivity;
    }

    static /* synthetic */ void m21936l(CreateInviteLinkActivity createInviteLinkActivity) {
        C1063i c6813e = new C6813e(createInviteLinkActivity.f24733B);
        C2808d.m7148b(c6813e);
        C4501c.m8189a().m8192a(createInviteLinkActivity, c6813e);
    }

    private void m21937y() {
        if (this.f24741z != null) {
            this.f24741z.setVisibility(8);
            this.f24732A.setVisibility(8);
        }
    }

    private void m21938z() {
        if (this.f24741z != null) {
            this.f24741z.setVisibility(0);
            this.f24732A.setVisibility(0);
        }
    }

    public final Dialog mo2299a(Bundle bundle) {
        switch (bundle.getInt("dialog_id")) {
            case 100:
                DialogInterface.OnClickListener c40812 = new C40812(this);
                return C4488b.m8181a(this, C4522p.m8236a(R.string.title_dialog_revoke_invite_link), C4522p.m8236a(R.string.ok_cap), c40812, C4522p.m8236a(R.string.cancel_cap), null);
            case 101:
                return C4488b.m8181a(this, C4522p.m8236a(R.string.title_dialog_delete_invite_link), C4522p.m8236a(R.string.ok_cap), new C40823(this), C4522p.m8236a(R.string.cancel_cap), null);
            default:
                return null;
        }
    }

    protected final int mo3643g() {
        return R.drawable.ic_place_holder_group;
    }

    protected final String mo3695h() {
        return null;
    }

    protected final C2973m mo3696i() {
        return C2973m.GROUP;
    }

    protected final void mo3697j() {
    }

    protected final void mo3698k() {
        this.v = 0.75d;
        this.w = 0.5d;
    }

    protected final void mo3699l() {
        if (this.f24735D != null && !this.f24735D.isEmpty() && this.f24736E != null && !this.f24736E.isEmpty()) {
            C4478a.m8164c(this, this.f24735D, this.f24735D, this.f24736E);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m21057e((int) R.layout.activity_create_invite_link);
        this.f24737F = (Button) findViewById(R.id.revoke_invite_link_button);
        this.f24737F.setText(C4522p.m8236a(R.string.action_revoke_invite_link));
        this.f24739H = (TextView) findViewById(R.id.caption_textView);
        this.f24740I = (TextView) findViewById(R.id.enter_textView);
        this.f24741z = (TextView) findViewById(R.id.invite_link_text_view);
        this.f24741z.setPaintFlags(this.f24741z.getPaintFlags() | 8);
        this.f24732A = (TextView) findViewById(R.id.enter_textView);
        m21937y();
        if (this.f24737F != null) {
            this.f24737F.setOnClickListener(new C40801(this));
        }
        this.f24741z.setOnClickListener(new C40834(this));
        this.f24738G = (RelativeLayout) findViewById(R.id.root_layout);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        LayoutParams layoutParams = this.f24738G.getLayoutParams();
        layoutParams.height = (int) (((float) (point.y - (C2491i.m6759a(getApplicationContext()) + C2491i.m6805b(getApplicationContext())))) + C2491i.m6804b(getApplicationContext(), 8.0f));
        if (getResources().getConfiguration().orientation == 2) {
            layoutParams.width = (int) (((double) point.x) * 0.75d);
        }
        C2491i.m6796a(this.f24738G, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6802a(this.f24739H, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f24740I, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f24741z, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6821b(this.f24741z, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6819b(this.f24737F, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6798a(this.f24737F, UIThemeManager.getmInstance().getButton_text_color());
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            if (getIntent().getExtras().containsKey("KEY_GROUP_ID")) {
                this.f24733B = getIntent().getExtras().getString("KEY_GROUP_ID");
            }
            if (getIntent().getExtras().containsKey("KEY_GROUP_NAME")) {
                this.f24736E = getIntent().getExtras().getString("KEY_GROUP_NAME");
                m21053a(this.f24736E, false);
            }
            if (getIntent().getExtras().containsKey("KEY_GROUP_MEMBER_COUNT")) {
                m21056c(getIntent().getExtras().getString("KEY_GROUP_MEMBER_COUNT"));
            }
            if (getIntent().getExtras().containsKey("KEY_GROUP_IMAGE")) {
                this.f24735D = getIntent().getExtras().getString("KEY_GROUP_IMAGE");
                if (this.f24735D != null) {
                    m21052a(C4515k.m8231a(C2556b.m6998a(this.f24735D)));
                    m21055b(C4515k.m8231a(C2556b.m6998a(this.f24735D)));
                } else {
                    m21062h(C2491i.m6806b(getApplicationContext(), this.f24733B));
                    m21069o();
                    m21070p();
                }
            }
        }
        if (bundle != null) {
            if (bundle.containsKey("KEY_GROUP_NAME")) {
                this.f24736E = bundle.getString("KEY_GROUP_NAME");
                m21053a(this.f24736E, false);
            }
            if (bundle.containsKey("KEY_GROUP_LINK")) {
                this.f24734C = bundle.getString("KEY_GROUP_LINK");
                if (!(this.f24741z == null || this.f24734C == null || this.f24734C.isEmpty())) {
                    this.f24741z.setText(this.f24734C);
                    m21938z();
                }
            }
            if (bundle.containsKey("KEY_GROUP_IMAGE")) {
                this.f24735D = bundle.getString("KEY_GROUP_IMAGE");
                if (this.f24735D != null) {
                    m21052a(C4515k.m8231a(C2556b.m6998a(this.f24735D)));
                    m21055b(C4515k.m8231a(C2556b.m6998a(this.f24735D)));
                }
            }
        }
        m21067m();
        if ((this.f24734C == null || (this.f24734C != null && this.f24734C.isEmpty())) && bundle == null) {
            C1063i c6810b = new C6810b(this.f24733B);
            C2808d.m7148b(c6810b);
            C4501c.m8189a().m8192a(this, c6810b);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public void onEvent(final C5956a c5956a) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ CreateInviteLinkActivity f11691b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a(CreateInviteLinkActivity.m21933i(this.f11691b), c5956a.f8890a);
                if (this.f11691b.f24734C != null) {
                    this.f11691b.f24734C = "";
                    if (this.f11691b.f24741z != null) {
                        this.f11691b.m21937y();
                    }
                }
            }
        });
    }

    public void onEvent(C2828a c2828a) {
        this.f24734C = c2828a.f8909a;
        runOnUiThread(new C40878(this));
    }

    public void onEvent(final C5986b c5986b) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ CreateInviteLinkActivity f11688b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a(CreateInviteLinkActivity.m21931g(this.f11688b), c5986b.f8890a);
                if (this.f11688b.f24734C != null) {
                    this.f11688b.f24734C = "";
                    if (this.f11688b.f24741z != null) {
                        this.f11688b.m21937y();
                    }
                }
            }
        });
    }

    public void onEvent(C2829c c2829c) {
        this.f24734C = c2829c.f8910a;
        runOnUiThread(new C40856(this));
    }

    public void onEvent(final C5989k c5989k) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ CreateInviteLinkActivity f11680b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a(CreateInviteLinkActivity.m21934j(this.f11680b), c5989k.f8890a);
            }
        });
    }

    public void onEvent(C2835l c2835l) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ CreateInviteLinkActivity f11678a;

            {
                this.f11678a = r1;
            }

            public final void run() {
                C4501c.m8189a().m8193b();
                this.f11678a.f24734C = "";
                Toast.makeText(this.f11678a, C4522p.m8236a(R.string.delete_invite_link_message), 0).show();
                if (this.f11678a.f24741z != null) {
                    this.f11678a.m21937y();
                }
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getItemId();
        return super.onOptionsItemSelected(menuItem);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f24734C != null && !this.f24734C.isEmpty()) {
            bundle.putString("KEY_GROUP_LINK", this.f24734C);
        }
    }
}
