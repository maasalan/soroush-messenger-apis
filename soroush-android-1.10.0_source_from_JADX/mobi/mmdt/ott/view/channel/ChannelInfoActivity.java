package mobi.mmdt.ott.view.channel;

import android.app.Activity;
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
import com.p072b.p073a.p074a.C1063i;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base.ChannelLocation;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2651r;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5923q;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6700i;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6707p;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p385g.C2974a;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p385g.C6023j;
import mobi.mmdt.ott.view.components.C7695a;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.C4533r;
import mobi.mmdt.ott.view.tools.p479c.C4501c;
import org.json.JSONArray;
import org.json.JSONException;

public class ChannelInfoActivity extends C7695a implements C3101a {
    private EditText f24578A;
    private String f24579B;
    private Button f24580C;
    private boolean f24581D;
    private String f24582E;
    private String f24583F;
    private String f24584G;
    private String f24585H;
    private String f24586I;
    private EditText f24587J;
    private TextInputLayout f24588K;
    private TextInputLayout f24589L;
    private ChannelLocation[] f24590M;
    private ImageView f24591N;
    private RelativeLayout f24592O;
    private LinearLayout f24593P;
    private FrameLayout f24594Q;
    private View f24595R;
    private C0416a<Cursor> f24596S = new C60541(this);
    private OnClickListener f24597T = new C30718(this);
    private TextView f24598z;

    class C30632 implements TransformFilter {
        final /* synthetic */ ChannelInfoActivity f9577a;

        C30632(ChannelInfoActivity channelInfoActivity) {
            this.f9577a = channelInfoActivity;
        }

        public final String transformUrl(Matcher matcher, String str) {
            StringBuilder stringBuilder = new StringBuilder("#");
            stringBuilder.append(str.substring(1, str.length()));
            return stringBuilder.toString();
        }
    }

    class C30664 implements Runnable {
        final /* synthetic */ ChannelInfoActivity f9582a;

        class C30651 implements Runnable {
            final /* synthetic */ C30664 f9581a;

            C30651(C30664 c30664) {
                this.f9581a = c30664;
            }

            public final void run() {
                this.f9581a.f9582a.setResult(1479);
                this.f9581a.f9582a.finish();
                this.f9581a.f9582a.overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
            }
        }

        C30664(ChannelInfoActivity channelInfoActivity) {
            this.f9582a = channelInfoActivity;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
            new Handler().postDelayed(new C30651(this), 100);
        }
    }

    class C30696 implements View.OnClickListener {
        final /* synthetic */ ChannelInfoActivity f9586a;

        C30696(ChannelInfoActivity channelInfoActivity) {
            this.f9586a = channelInfoActivity;
        }

        public final void onClick(View view) {
            C4533r.m8256a(ChannelInfoActivity.m21562h(this.f9586a), this.f9586a.f24582E);
        }
    }

    class C30707 implements View.OnClickListener {
        final /* synthetic */ ChannelInfoActivity f9587a;

        C30707(ChannelInfoActivity channelInfoActivity) {
            this.f9587a = channelInfoActivity;
        }

        public final void onClick(View view) {
            ChannelInfoActivity.m21565j(this.f9587a);
        }
    }

    class C30718 implements OnClickListener {
        final /* synthetic */ ChannelInfoActivity f9588a;

        C30718(ChannelInfoActivity channelInfoActivity) {
            this.f9588a = channelInfoActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C4501c.m8189a().m8192a(ChannelInfoActivity.m21567l(this.f9588a), ChannelInfoActivity.m21566k(this.f9588a));
        }
    }

    class C30729 implements View.OnClickListener {
        final /* synthetic */ ChannelInfoActivity f9589a;

        C30729(ChannelInfoActivity channelInfoActivity) {
            this.f9589a = channelInfoActivity;
        }

        public final void onClick(View view) {
            C4533r.m8256a(ChannelInfoActivity.m21568m(this.f9589a), this.f9589a.f24582E);
        }
    }

    class C60541 implements C0416a<Cursor> {
        final /* synthetic */ ChannelInfoActivity f16207a;

        C60541(ChannelInfoActivity channelInfoActivity) {
            this.f16207a = channelInfoActivity;
        }

        public final C0350e<Cursor> mo2226a(int i, Bundle bundle) {
            return C2980g.m7443d(this.f16207a.f24579B);
        }

        public final void mo2227a() {
        }

        public final /* synthetic */ void mo2228a(C0350e c0350e, Object obj) {
            Cursor cursor = (Cursor) obj;
            if (cursor.moveToFirst()) {
                C6023j c6023j = new C6023j(cursor);
                String a = c6023j.m7352a("dialog_link");
                int d = c6023j.m13426d();
                C2974a m = c6023j.m13435m();
                boolean z = m != null && (m.equals(C2974a.OFFICIAL) || m.equals(C2974a.OFFICIAL_PAYMENT));
                this.f16207a.m21053a(c6023j.m7352a("dialog_title"), z);
                CharSequence a2 = c6023j.m7352a("dialog_description");
                if (a2 == null || a2.trim().isEmpty()) {
                    this.f16207a.f24578A.setVisibility(8);
                } else {
                    this.f16207a.f24578A.setText(a2);
                }
                if (a != null) {
                    EditText c = this.f16207a.f24587J;
                    StringBuilder stringBuilder = new StringBuilder("@");
                    stringBuilder.append(a);
                    c.setText(stringBuilder.toString());
                    this.f16207a.f24587J.setClickable(true);
                } else {
                    this.f16207a.f24587J.setText("");
                    this.f16207a.f24587J.setClickable(false);
                }
                this.f16207a.m21056c(C2491i.m6766a(ChannelInfoActivity.m21554d(this.f16207a), (float) d, C4522p.m8236a(R.string.follower), C4522p.m8236a(R.string.followers)));
                this.f16207a.f24582E = C2491i.m6769a(ChannelInfoActivity.m21556e(this.f16207a), a);
                ChannelInfoActivity.m21549a(this.f16207a, c6023j);
                a = c6023j.m7352a("dialog_avatar_thumbnail_url");
                this.f16207a.f24583F = c6023j.m7352a("dialog_avatar_url");
                this.f16207a.f24584G = c6023j.m7352a("dialog_avatar_thumbnail_url");
                this.f16207a.f24585H = c6023j.m7352a("dialog_title");
                if (a == null || a.isEmpty()) {
                    this.f16207a.f24583F = null;
                    this.f16207a.f24584G = null;
                    this.f16207a.m21069o();
                    this.f16207a.m21070p();
                } else {
                    this.f16207a.s = "";
                    this.f16207a.m21052a(C4515k.m8231a(C2556b.m6998a(a)));
                    this.f16207a.m21055b(C4515k.m8231a(C2556b.m6998a(a)));
                }
            }
        }
    }

    static /* synthetic */ void m21549a(ChannelInfoActivity channelInfoActivity, C6023j c6023j) {
        String string = c6023j.getString(c6023j.getColumnIndex("dialog_extra"));
        if (string != null) {
            try {
                channelInfoActivity.f24590M = ChannelLocation.toChanneLocationsArray(new JSONArray(string));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (channelInfoActivity.f24590M == null || channelInfoActivity.f24590M.length <= 0) {
            channelInfoActivity.m21577y();
            return;
        }
        ChannelLocation channelLocation = channelInfoActivity.f24590M[0];
        double latitude = channelLocation.getLatitude();
        double longitude = channelLocation.getLongitude();
        channelLocation.getLabel();
        if (latitude == 0.0d || longitude == 0.0d) {
            channelInfoActivity.m21577y();
            return;
        }
        channelInfoActivity.m21058f((int) R.drawable.ic_location_white);
        channelInfoActivity.m21051a(new C30707(channelInfoActivity));
    }

    static /* synthetic */ C7406c m21554d(ChannelInfoActivity channelInfoActivity) {
        return channelInfoActivity;
    }

    static /* synthetic */ C7406c m21556e(ChannelInfoActivity channelInfoActivity) {
        return channelInfoActivity;
    }

    static /* synthetic */ C7406c m21562h(ChannelInfoActivity channelInfoActivity) {
        return channelInfoActivity;
    }

    static /* synthetic */ void m21565j(ChannelInfoActivity channelInfoActivity) {
        if (C3337b.m7816c((Activity) channelInfoActivity) && channelInfoActivity.f24590M != null && channelInfoActivity.f24590M.length > 0) {
            ChannelLocation channelLocation = channelInfoActivity.f24590M[0];
            C4478a.m8140a((Activity) channelInfoActivity, channelLocation.getLatitude(), channelLocation.getLongitude(), true);
        }
    }

    static /* synthetic */ C5891a m21566k(ChannelInfoActivity channelInfoActivity) {
        C1063i c6707p = new C6707p(channelInfoActivity.f24579B);
        C2808d.m7147a(c6707p);
        return c6707p;
    }

    static /* synthetic */ C7406c m21567l(ChannelInfoActivity channelInfoActivity) {
        return channelInfoActivity;
    }

    static /* synthetic */ C7406c m21568m(ChannelInfoActivity channelInfoActivity) {
        return channelInfoActivity;
    }

    static /* synthetic */ C7406c m21569n(ChannelInfoActivity channelInfoActivity) {
        return channelInfoActivity;
    }

    private void onLeaveAndDeleteChannelPressed() {
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 10);
        b_(bundle);
    }

    static /* synthetic */ C7406c m21573r(ChannelInfoActivity channelInfoActivity) {
        return channelInfoActivity;
    }

    static /* synthetic */ C7406c m21576u(ChannelInfoActivity channelInfoActivity) {
        return channelInfoActivity;
    }

    private void m21577y() {
        m21058f((int) R.drawable.ic_share_white_24);
        m21051a(new C30696(this));
    }

    public final Dialog mo2299a(Bundle bundle) {
        return bundle.getInt("dialog_id") != 10 ? null : C4488b.m8181a(this, C4522p.m8236a(R.string.are_you_sure_to_leave_and_delete_this_channel), C4522p.m8236a(R.string.action_leave_and_delete_channel), this.f24597T, C4522p.m8236a(R.string.cancel), null);
    }

    protected final int mo3643g() {
        return R.drawable.ic_place_holder_channel;
    }

    protected final String mo3695h() {
        return this.f24579B;
    }

    protected final C2973m mo3696i() {
        return C2973m.CHANNEL;
    }

    protected final void mo3697j() {
    }

    protected void mo3698k() {
        this.v = 0.75d;
        this.w = 0.5d;
    }

    protected final void mo3699l() {
        if (this.f24583F != null && this.f24584G != null) {
            C4478a.m8164c(this, this.f24583F, this.f24584G, this.f24585H);
        }
    }

    public void onBackPressed() {
        setResult(0);
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m21057e((int) R.layout.fragment_channel_info);
        this.f24579B = getIntent().getExtras().getString("KEY_CHANNEL_ID");
        this.f24581D = getIntent().getBooleanExtra("KEY_IS_FOLLOWED", false);
        this.f24586I = C2535a.m6888a().m6919b();
        C2808d.m7148b(new C6700i(this.f24579B));
        this.f24592O = (RelativeLayout) findViewById(R.id.root_layout);
        this.f24593P = (LinearLayout) findViewById(R.id.linearLayout);
        this.f24594Q = (FrameLayout) findViewById(R.id.top_frameLayout);
        this.f24598z = (TextView) findViewById(R.id.sharedMedia_textView);
        this.f24591N = (ImageView) findViewById(R.id.share_image_view);
        this.f24580C = (Button) findViewById(R.id.leave_and_delete_button);
        this.f24580C.setText(C4522p.m8236a(R.string.action_leave_and_delete_channel));
        this.f24589L = (TextInputLayout) findViewById(R.id.channelDescriptions_textInputLayout);
        this.f24578A = (EditText) findViewById(R.id.channelDescriptions_editText);
        EditText editText = this.f24578A;
        final TransformFilter anonymousClass13 = new TransformFilter(this) {
            final /* synthetic */ ChannelInfoActivity f9576a;

            {
                this.f9576a = r1;
            }

            public final String transformUrl(Matcher matcher, String str) {
                StringBuilder stringBuilder = new StringBuilder("https://sapp.ir/");
                stringBuilder.append(str.substring(1, str.length()));
                return stringBuilder.toString();
            }
        };
        final TransformFilter c30632 = new C30632(this);
        editText.setCursorVisible(false);
        editText.setKeyListener(null);
        editText.setAutoLinkMask(1);
        editText.setLinksClickable(true);
        editText.setMovementMethod(LinkMovementMethod.getInstance());
        editText.setFocusable(false);
        editText.addTextChangedListener(new TextWatcher(this) {
            final /* synthetic */ ChannelInfoActivity f9580c;

            public final void afterTextChanged(Editable editable) {
                Linkify.addLinks(editable, Pattern.compile("@[A-Za-z0-9_.]+"), null, null, anonymousClass13);
                Linkify.addLinks(editable, Pattern.compile("#[^#\\s]+"), null, null, c30632);
                Linkify.addLinks(editable, Patterns.PHONE, "tel:");
                Linkify.addLinks(editable, Patterns.EMAIL_ADDRESS, "mailto:");
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f24588K = (TextInputLayout) findViewById(R.id.channelID_textInputLayout);
        this.f24595R = findViewById(R.id.spacer_view);
        this.f24587J = (EditText) findViewById(R.id.channelID_editText);
        if (this.f24587J != null) {
            this.f24587J.setFocusable(false);
            this.f24587J.setOnClickListener(new C30729(this));
            this.f24587J.setOnLongClickListener(new OnLongClickListener(this) {
                final /* synthetic */ ChannelInfoActivity f9569a;

                {
                    this.f9569a = r1;
                }

                public final boolean onLongClick(View view) {
                    C4533r.m8256a(ChannelInfoActivity.m21569n(this.f9569a), this.f9569a.f24582E);
                    return false;
                }
            });
        }
        this.f24578A.setFilters(new InputFilter[]{new LengthFilter(256)});
        editText = (EditText) findViewById(R.id.junk_editText);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        LayoutParams layoutParams = this.f24592O != null ? this.f24592O.getLayoutParams() : null;
        if (!(getResources().getBoolean(R.bool.xlarge) || layoutParams == null)) {
            layoutParams.height = (int) (((float) (point.y - (C2491i.m6759a(getApplicationContext()) + C2491i.m6805b(getApplicationContext())))) + C2491i.m6804b(getApplicationContext(), 8.0f));
            if (getResources().getConfiguration().orientation == 2) {
                layoutParams.width = (int) (((double) point.x) * 0.75d);
            }
        }
        editText.requestFocus();
        if (this.f24581D) {
            this.f24580C.setVisibility(0);
        } else {
            this.f24580C.setVisibility(8);
        }
        this.f24580C.setOnClickListener(new View.OnClickListener(this) {
            final /* synthetic */ ChannelInfoActivity f9570a;

            {
                this.f9570a = r1;
            }

            public final void onClick(View view) {
                this.f9570a.onLeaveAndDeleteChannelPressed();
            }
        });
        new Thread(new Runnable(this) {
            final /* synthetic */ ChannelInfoActivity f9575a;

            {
                this.f9575a = r1;
            }

            public final void run() {
                Thread.currentThread().setPriority(1);
                final int h = C2966b.m7417h(this.f9575a.f24579B);
                this.f9575a.runOnUiThread(new Runnable(this) {
                    final /* synthetic */ AnonymousClass12 f9574b;

                    class C30601 implements View.OnClickListener {
                        final /* synthetic */ C30621 f9571a;

                        C30601(C30621 c30621) {
                            this.f9571a = c30621;
                        }

                        public final void onClick(View view) {
                            C4478a.m8147a(ChannelInfoActivity.m21573r(this.f9571a.f9574b.f9575a), this.f9571a.f9574b.f9575a.f24579B, this.f9571a.f9574b.f9575a.f24585H, C2973m.CHANNEL);
                        }
                    }

                    class C30612 implements View.OnClickListener {
                        final /* synthetic */ C30621 f9572a;

                        C30612(C30621 c30621) {
                            this.f9572a = c30621;
                        }

                        public final void onClick(View view) {
                            Snackbar.m8770a(this.f9572a.f9574b.f9575a.m, C4522p.m8236a(R.string.no_media_found), -1).m572a();
                        }
                    }

                    public final void run() {
                        TextView q;
                        CharSequence b;
                        View.OnClickListener c30601;
                        if (this.f9574b.f9575a.f24586I.equals("fa")) {
                            q = this.f9574b.f9575a.f24598z;
                            b = C2491i.m6814b(String.format(C4522p.m8236a(R.string.shared_media), new Object[]{Integer.valueOf(h)}));
                        } else {
                            q = this.f9574b.f9575a.f24598z;
                            b = String.format(C4522p.m8236a(R.string.shared_media), new Object[]{Integer.valueOf(h)});
                        }
                        q.setText(b);
                        if (h > 0) {
                            q = this.f9574b.f9575a.f24598z;
                            c30601 = new C30601(this);
                        } else {
                            q = this.f9574b.f9575a.f24598z;
                            c30601 = new C30612(this);
                        }
                        q.setOnClickListener(c30601);
                    }
                });
            }
        }).start();
        C2491i.m6796a(this.f24592O, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6796a(this.f24593P, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6796a(this.f24594Q, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6819b(this.f24580C, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6798a(this.f24580C, UIThemeManager.getmInstance().getButton_text_color());
        C2491i.m6796a(this.f24595R, UIThemeManager.getmInstance().getSpacer_view_color());
        C2491i.m6802a(this.f24598z, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6801a(this.f24591N, UIThemeManager.getmInstance().getText_secondary_color());
        new View[1][0] = this.f24598z;
        C2491i.m6781a(UIThemeManager.getmInstance().getAccent_color(), this.f24588K, this.f24589L);
        C2491i.m6780a(UIThemeManager.getmInstance().getText_primary_color(), UIThemeManager.getmInstance().getAccent_color(), this.f24587J, this.f24578A);
        m21062h(C2491i.m6806b(getApplicationContext(), this.f24579B));
        m21069o();
        m21070p();
        if (bundle != null) {
            if (bundle.containsKey("KEY_CHANNEL_NAME")) {
                m21053a(bundle.getString("KEY_CHANNEL_NAME"), false);
            }
            if (bundle.containsKey("KEY_CHANNEL_DESCRIPTIONS")) {
                this.f24578A.setText(bundle.getString("KEY_CHANNEL_DESCRIPTIONS"));
            }
            if (bundle.containsKey("KEY_CHANNEL_FOLLOWERS")) {
                m21056c(bundle.getString("KEY_CHANNEL_FOLLOWERS"));
            }
            if (bundle.containsKey("KEY_CHANNEL_LINK")) {
                this.f24582E = bundle.getString("KEY_CHANNEL_LINK");
            }
        }
        if (this.s != null) {
            m21052a(this.s);
            m21055b(this.s);
        }
        m19190e().mo268a(5, null, this.f24596S);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.f24581D) {
            getMenuInflater().inflate(R.menu.menu_channel_info, menu);
            menu.findItem(R.id.action_leave_and_delete).setTitle(C4522p.m8236a(R.string.action_leave_and_delete_channel));
        }
        return true;
    }

    protected void onDestroy() {
        super.onDestroy();
        m19190e().mo269a(5);
    }

    public void onEvent(final C5923q c5923q) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ ChannelInfoActivity f9585b;

            class C30671 implements Runnable {
                final /* synthetic */ C30685 f9583a;

                C30671(C30685 c30685) {
                    this.f9583a = c30685;
                }

                public final void run() {
                    C4513i.m8228a(ChannelInfoActivity.m21576u(this.f9583a.f9585b), c5923q.f8890a);
                }
            }

            public final void run() {
                C4501c.m8189a().m8193b();
                new Handler().postDelayed(new C30671(this), 100);
            }
        });
    }

    public void onEvent(C2651r c2651r) {
        runOnUiThread(new C30664(this));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.action_leave_and_delete) {
            onLeaveAndDeleteChannelPressed();
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
        q = this.f24578A.getText().toString().trim();
        if (!q.isEmpty()) {
            bundle.putString("KEY_CHANNEL_DESCRIPTIONS", q);
        }
        q = m21072r();
        if (!q.isEmpty()) {
            bundle.putString("KEY_CHANNEL_FOLLOWERS", q);
        }
        q = this.f24582E;
        if (!q.isEmpty()) {
            bundle.putString("KEY_CHANNEL_LINK", q);
        }
    }
}
