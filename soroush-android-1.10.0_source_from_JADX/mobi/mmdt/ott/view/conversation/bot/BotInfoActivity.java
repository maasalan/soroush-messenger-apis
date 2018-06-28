package mobi.mmdt.ott.view.conversation.bot;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.database.Cursor;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.C0417s.C0416a;
import android.support.v4.p029a.C0350e;
import android.support.v7.app.C7406c;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.text.util.Linkify.TransformFilter;
import android.util.Patterns;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p277c.C6684d;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2651r;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5923q;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p385g.C6023j;
import mobi.mmdt.ott.view.components.C7695a;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.C4533r;

public class BotInfoActivity extends C7695a implements C3101a {
    private EditText f24626A;
    private String f24627B;
    private Button f24628C;
    private boolean f24629D;
    private String f24630E;
    private String f24631F;
    private String f24632G;
    private String f24633H;
    private String f24634I;
    private EditText f24635J;
    private TextInputLayout f24636K;
    private TextInputLayout f24637L;
    private C0416a<Cursor> f24638M = new C61281(this);
    private OnClickListener f24639N = new C34134(this);
    private ImageView f24640O;
    private RelativeLayout f24641P;
    private LinearLayout f24642Q;
    private FrameLayout f24643R;
    private View f24644S;
    private TextView f24645z;

    class C34102 implements Runnable {
        final /* synthetic */ BotInfoActivity f10443a;

        class C34091 implements Runnable {
            final /* synthetic */ C34102 f10442a;

            C34091(C34102 c34102) {
                this.f10442a = c34102;
            }

            public final void run() {
                this.f10442a.f10443a.setResult(1479);
                this.f10442a.f10443a.finish();
                this.f10442a.f10443a.overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
            }
        }

        C34102(BotInfoActivity botInfoActivity) {
            this.f10443a = botInfoActivity;
        }

        public final void run() {
            new Handler().postDelayed(new C34091(this), 100);
        }
    }

    class C34134 implements OnClickListener {
        final /* synthetic */ BotInfoActivity f10447a;

        C34134(BotInfoActivity botInfoActivity) {
            this.f10447a = botInfoActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            BotInfoActivity.m21659j(this.f10447a);
        }
    }

    class C34145 implements View.OnClickListener {
        final /* synthetic */ BotInfoActivity f10448a;

        C34145(BotInfoActivity botInfoActivity) {
            this.f10448a = botInfoActivity;
        }

        public final void onClick(View view) {
            C4533r.m8256a(BotInfoActivity.m21660k(this.f10448a), this.f10448a.f24630E);
        }
    }

    class C34156 implements OnLongClickListener {
        final /* synthetic */ BotInfoActivity f10449a;

        C34156(BotInfoActivity botInfoActivity) {
            this.f10449a = botInfoActivity;
        }

        public final boolean onLongClick(View view) {
            C4533r.m8256a(BotInfoActivity.m21661l(this.f10449a), this.f10449a.f24630E);
            return false;
        }
    }

    class C34167 implements View.OnClickListener {
        final /* synthetic */ BotInfoActivity f10450a;

        C34167(BotInfoActivity botInfoActivity) {
            this.f10450a = botInfoActivity;
        }

        public final void onClick(View view) {
            this.f10450a.m21669y();
        }
    }

    class C34208 implements Runnable {
        final /* synthetic */ BotInfoActivity f10455a;

        C34208(BotInfoActivity botInfoActivity) {
            this.f10455a = botInfoActivity;
        }

        public final void run() {
            Thread.currentThread().setPriority(1);
            final int h = C2966b.m7417h(this.f10455a.f24627B);
            this.f10455a.runOnUiThread(new Runnable(this) {
                final /* synthetic */ C34208 f10454b;

                class C34171 implements View.OnClickListener {
                    final /* synthetic */ C34191 f10451a;

                    C34171(C34191 c34191) {
                        this.f10451a = c34191;
                    }

                    public final void onClick(View view) {
                        C4478a.m8147a(BotInfoActivity.m21665p(this.f10451a.f10454b.f10455a), this.f10451a.f10454b.f10455a.f24627B, this.f10451a.f10454b.f10455a.f24633H, C2973m.BOT);
                    }
                }

                class C34182 implements View.OnClickListener {
                    final /* synthetic */ C34191 f10452a;

                    C34182(C34191 c34191) {
                        this.f10452a = c34191;
                    }

                    public final void onClick(View view) {
                        Snackbar.m8770a(this.f10452a.f10454b.f10455a.m, C4522p.m8236a(R.string.no_media_found), -1).m572a();
                    }
                }

                public final void run() {
                    TextView o;
                    CharSequence b;
                    View.OnClickListener c34171;
                    if (this.f10454b.f10455a.f24634I.equals("fa")) {
                        o = this.f10454b.f10455a.f24645z;
                        b = C2491i.m6814b(String.format(C4522p.m8236a(R.string.shared_media), new Object[]{Integer.valueOf(h)}));
                    } else {
                        o = this.f10454b.f10455a.f24645z;
                        b = String.format(C4522p.m8236a(R.string.shared_media), new Object[]{Integer.valueOf(h)});
                    }
                    o.setText(b);
                    if (h > 0) {
                        o = this.f10454b.f10455a.f24645z;
                        c34171 = new C34171(this);
                    } else {
                        o = this.f10454b.f10455a.f24645z;
                        c34171 = new C34182(this);
                    }
                    o.setOnClickListener(c34171);
                }
            });
        }
    }

    class C34219 implements TransformFilter {
        final /* synthetic */ BotInfoActivity f10456a;

        C34219(BotInfoActivity botInfoActivity) {
            this.f10456a = botInfoActivity;
        }

        public final String transformUrl(Matcher matcher, String str) {
            StringBuilder stringBuilder = new StringBuilder("https://soroush-app.me/channel/");
            stringBuilder.append(str.substring(1, str.length()));
            return stringBuilder.toString();
        }
    }

    class C61281 implements C0416a<Cursor> {
        final /* synthetic */ BotInfoActivity f16539a;

        class C34081 implements View.OnClickListener {
            final /* synthetic */ C61281 f10437a;

            C34081(C61281 c61281) {
                this.f10437a = c61281;
            }

            public final void onClick(View view) {
                C4533r.m8256a(BotInfoActivity.m21651f(this.f10437a.f16539a), this.f10437a.f16539a.f24630E);
            }
        }

        C61281(BotInfoActivity botInfoActivity) {
            this.f16539a = botInfoActivity;
        }

        public final C0350e<Cursor> mo2226a(int i, Bundle bundle) {
            return C2980g.m7443d(this.f16539a.f24627B);
        }

        public final void mo2227a() {
        }

        public final /* synthetic */ void mo2228a(C0350e c0350e, Object obj) {
            Cursor cursor = (Cursor) obj;
            if (cursor.moveToFirst()) {
                EditText c;
                boolean z;
                C6023j c6023j = new C6023j(cursor);
                String a = c6023j.m7352a("dialog_link");
                int d = c6023j.m13426d();
                this.f16539a.m21053a(c6023j.m7352a("dialog_title"), false);
                this.f16539a.f24626A.setText(c6023j.m7352a("dialog_description"));
                if (a != null) {
                    c = this.f16539a.f24635J;
                    StringBuilder stringBuilder = new StringBuilder("@");
                    stringBuilder.append(a);
                    c.setText(stringBuilder.toString());
                    c = this.f16539a.f24635J;
                    z = true;
                } else {
                    this.f16539a.f24635J.setText("");
                    c = this.f16539a.f24635J;
                    z = false;
                }
                c.setClickable(z);
                this.f16539a.m21056c(C2491i.m6766a(BotInfoActivity.m21647d(this.f16539a), (float) d, C4522p.m8236a(R.string.follower), C4522p.m8236a(R.string.followers)));
                this.f16539a.f24630E = C2491i.m6769a(BotInfoActivity.m21649e(this.f16539a), a);
                this.f16539a.m21051a(new C34081(this));
                a = c6023j.m7352a("dialog_avatar_thumbnail_url");
                this.f16539a.f24631F = c6023j.m7352a("dialog_avatar_url");
                this.f16539a.f24632G = c6023j.m7352a("dialog_avatar_thumbnail_url");
                this.f16539a.f24633H = c6023j.m7352a("dialog_title");
                if (a == null || a.isEmpty()) {
                    this.f16539a.f24631F = null;
                    this.f16539a.f24632G = null;
                    this.f16539a.m21069o();
                    this.f16539a.m21070p();
                } else {
                    this.f16539a.s = "";
                    this.f16539a.m21052a(C4515k.m8231a(C2556b.m6998a(a)));
                    this.f16539a.m21055b(C4515k.m8231a(C2556b.m6998a(a)));
                }
            }
        }
    }

    static /* synthetic */ C7406c m21647d(BotInfoActivity botInfoActivity) {
        return botInfoActivity;
    }

    static /* synthetic */ C7406c m21649e(BotInfoActivity botInfoActivity) {
        return botInfoActivity;
    }

    static /* synthetic */ C7406c m21651f(BotInfoActivity botInfoActivity) {
        return botInfoActivity;
    }

    static /* synthetic */ void m21659j(BotInfoActivity botInfoActivity) {
        C2808d.m7147a(new C6684d(botInfoActivity.f24627B));
        botInfoActivity.setResult(1479);
        botInfoActivity.finish();
        botInfoActivity.overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    static /* synthetic */ C7406c m21660k(BotInfoActivity botInfoActivity) {
        return botInfoActivity;
    }

    static /* synthetic */ C7406c m21661l(BotInfoActivity botInfoActivity) {
        return botInfoActivity;
    }

    static /* synthetic */ C7406c m21665p(BotInfoActivity botInfoActivity) {
        return botInfoActivity;
    }

    static /* synthetic */ C7406c m21668s(BotInfoActivity botInfoActivity) {
        return botInfoActivity;
    }

    private void m21669y() {
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 10);
        b_(bundle);
    }

    public final Dialog mo2299a(Bundle bundle) {
        return bundle.getInt("dialog_id") != 10 ? null : C4488b.m8181a(this, C4522p.m8236a(R.string.are_you_sure_to_stop_and_block_this_bot), C4522p.m8236a(R.string.stop_bot), this.f24639N, C4522p.m8236a(R.string.cancel), null);
    }

    protected final int mo3643g() {
        return R.drawable.ic_place_holder_channel;
    }

    protected final String mo3695h() {
        return this.f24627B;
    }

    protected final C2973m mo3696i() {
        return C2973m.CHANNEL;
    }

    protected final void mo3697j() {
    }

    protected final void mo3698k() {
        this.v = 0.75d;
        this.w = 0.5d;
    }

    protected final void mo3699l() {
        if (this.f24631F != null && this.f24632G != null) {
            C4478a.m8164c(this, this.f24631F, this.f24632G, this.f24633H);
        }
    }

    public void onBackPressed() {
        setResult(0);
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m21057e((int) R.layout.fragment_bot_info);
        this.f24627B = getIntent().getExtras().getString("KEY_CHANNEL_ID");
        this.f24629D = getIntent().getBooleanExtra("KEY_IS_FOLLOWED", false);
        this.f24634I = C2535a.m6888a().m6919b();
        this.f24641P = (RelativeLayout) findViewById(R.id.root_layout);
        this.f24642Q = (LinearLayout) findViewById(R.id.linearLayout);
        this.f24643R = (FrameLayout) findViewById(R.id.top_frameLayout);
        this.f24645z = (TextView) findViewById(R.id.sharedMedia_textView);
        this.f24640O = (ImageView) findViewById(R.id.share_image_view);
        this.f24628C = (Button) findViewById(R.id.stop_bot_button);
        this.f24628C.setText(C4522p.m8236a(R.string.stop_bot));
        this.f24637L = (TextInputLayout) findViewById(R.id.channelDescriptions_textInputLayout);
        this.f24626A = (EditText) findViewById(R.id.channelDescriptions_editText);
        EditText editText = this.f24626A;
        final TransformFilter c34219 = new C34219(this);
        final TransformFilter anonymousClass10 = new TransformFilter(this) {
            final /* synthetic */ BotInfoActivity f10438a;

            {
                this.f10438a = r1;
            }

            public final String transformUrl(Matcher matcher, String str) {
                StringBuilder stringBuilder = new StringBuilder("#");
                stringBuilder.append(str.substring(1, str.length()));
                return stringBuilder.toString();
            }
        };
        editText.setCursorVisible(false);
        editText.setKeyListener(null);
        editText.setAutoLinkMask(1);
        editText.setLinksClickable(true);
        editText.setMovementMethod(LinkMovementMethod.getInstance());
        editText.setFocusable(false);
        editText.addTextChangedListener(new TextWatcher(this) {
            final /* synthetic */ BotInfoActivity f10441c;

            public final void afterTextChanged(Editable editable) {
                Linkify.addLinks(editable, Pattern.compile("@[A-Za-z0-9_.]+"), null, null, c34219);
                Linkify.addLinks(editable, Pattern.compile("#[^#\\s]+"), null, null, anonymousClass10);
                Linkify.addLinks(editable, Patterns.PHONE, "tel:");
                Linkify.addLinks(editable, Patterns.EMAIL_ADDRESS, "mailto:");
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f24636K = (TextInputLayout) findViewById(R.id.channelID_textInputLayout);
        this.f24644S = findViewById(R.id.spacer_view);
        this.f24635J = (EditText) findViewById(R.id.channelID_editText);
        if (this.f24635J != null) {
            this.f24635J.setFocusable(false);
            this.f24635J.setOnClickListener(new C34145(this));
            this.f24635J.setOnLongClickListener(new C34156(this));
        }
        this.f24626A.setFilters(new InputFilter[]{new LengthFilter(256)});
        editText = (EditText) findViewById(R.id.junk_editText);
        m21058f((int) R.drawable.ic_share_white_24);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        LayoutParams layoutParams = this.f24641P != null ? this.f24641P.getLayoutParams() : null;
        if (!(getResources().getBoolean(R.bool.xlarge) || layoutParams == null)) {
            layoutParams.height = (int) (((float) (point.y - (C2491i.m6759a(getApplicationContext()) + C2491i.m6805b(getApplicationContext())))) + C2491i.m6804b(getApplicationContext(), 8.0f));
            if (getResources().getConfiguration().orientation == 2) {
                layoutParams.width = (int) (((double) point.x) * 0.75d);
            }
        }
        editText.requestFocus();
        if (this.f24629D) {
            this.f24628C.setVisibility(0);
        } else {
            this.f24628C.setVisibility(8);
        }
        this.f24628C.setOnClickListener(new C34167(this));
        new Thread(new C34208(this)).start();
        C2491i.m6796a(this.f24641P, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6796a(this.f24642Q, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6796a(this.f24643R, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6819b(this.f24628C, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6798a(this.f24628C, UIThemeManager.getmInstance().getButton_text_color());
        C2491i.m6796a(this.f24644S, UIThemeManager.getmInstance().getSpacer_view_color());
        C2491i.m6802a(this.f24645z, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6801a(this.f24640O, UIThemeManager.getmInstance().getText_secondary_color());
        new View[1][0] = this.f24645z;
        C2491i.m6780a(UIThemeManager.getmInstance().getText_primary_color(), UIThemeManager.getmInstance().getAccent_color(), this.f24635J, this.f24626A);
        m21062h(C2491i.m6806b(getApplicationContext(), this.f24627B));
        m21069o();
        m21070p();
        if (bundle != null) {
            if (bundle.containsKey("KEY_CHANNEL_NAME")) {
                m21053a(bundle.getString("KEY_CHANNEL_NAME"), false);
            }
            if (bundle.containsKey("KEY_CHANNEL_DESCRIPTIONS")) {
                this.f24626A.setText(bundle.getString("KEY_CHANNEL_DESCRIPTIONS"));
            }
            if (bundle.containsKey("KEY_CHANNEL_FOLLOWERS")) {
                m21056c(bundle.getString("KEY_CHANNEL_FOLLOWERS"));
            }
            if (bundle.containsKey("KEY_CHANNEL_LINK")) {
                this.f24630E = bundle.getString("KEY_CHANNEL_LINK");
            }
        }
        if (this.s != null) {
            m21052a(this.s);
            m21055b(this.s);
        }
        m19190e().mo268a(5, null, this.f24638M);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.f24629D) {
            getMenuInflater().inflate(R.menu.menu_bot_info, menu);
        }
        return true;
    }

    protected void onDestroy() {
        super.onDestroy();
        m19190e().mo269a(5);
    }

    public void onEvent(final C5923q c5923q) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ BotInfoActivity f10446b;

            class C34111 implements Runnable {
                final /* synthetic */ C34123 f10444a;

                C34111(C34123 c34123) {
                    this.f10444a = c34123;
                }

                public final void run() {
                    C4513i.m8228a(BotInfoActivity.m21668s(this.f10444a.f10446b), c5923q.f8890a);
                }
            }

            public final void run() {
                new Handler().postDelayed(new C34111(this), 100);
            }
        });
    }

    public void onEvent(C2651r c2651r) {
        runOnUiThread(new C34102(this));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.action_leave_and_delete) {
            m21669y();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    protected void onResume() {
        super.onResume();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String q = m21071q();
        if (!q.isEmpty()) {
            bundle.putString("KEY_CHANNEL_NAME", q);
        }
        q = this.f24626A.getText().toString();
        if (!q.isEmpty()) {
            bundle.putString("KEY_CHANNEL_DESCRIPTIONS", q);
        }
        q = m21072r();
        if (!q.isEmpty()) {
            bundle.putString("KEY_CHANNEL_FOLLOWERS", q);
        }
        q = this.f24630E;
        if (!q.isEmpty()) {
            bundle.putString("KEY_CHANNEL_LINK", q);
        }
    }
}
