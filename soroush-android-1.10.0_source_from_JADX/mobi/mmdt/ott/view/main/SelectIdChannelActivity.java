package mobi.mmdt.ott.view.main;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.p029a.C0346c;
import android.support.v7.app.C7406c;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p072b.p073a.p074a.C1063i;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Pattern;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base.ChannelLocation;
import mobi.mmdt.ott.logic.C2775a;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p298k.C6738c;
import mobi.mmdt.ott.logic.p261a.p298k.C6739d;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2698e;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2699h;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5940f;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5941g;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.view.components.C7695a;
import mobi.mmdt.ott.view.conversation.activities.C3383b;
import mobi.mmdt.ott.view.conversation.activities.ConversationActivity;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p479c.C4501c;

public class SelectIdChannelActivity extends C7695a {
    private EditText f24755A;
    private double f24756B;
    private double f24757C;
    private String f24758D = "";
    private boolean f24759E = false;
    private Timer f24760F = null;
    private boolean f24761G = false;
    private String f24762H;
    private String f24763I;
    private String f24764J;
    private boolean f24765K;
    private boolean f24766L = false;
    private TextView f24767M;
    private TextView f24768N;
    private TextView f24769O;
    private LinearLayout f24770P;
    private LinearLayout f24771Q;
    private TextWatcher f24772R = new C41351(this);
    private LinearLayout f24773z;

    class C41351 implements TextWatcher {
        String f11820a = "^[a-z0-9_.]+$";
        Pattern f11821b = Pattern.compile(this.f11820a);
        final /* synthetic */ SelectIdChannelActivity f11822c;

        C41351(SelectIdChannelActivity selectIdChannelActivity) {
            this.f11822c = selectIdChannelActivity;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(final CharSequence charSequence, int i, int i2, int i3) {
            this.f11822c.f24770P.setVisibility(8);
            if (!this.f11822c.f24759E) {
                this.f11822c.f24759E = true;
                this.f11822c.f24766L = false;
                this.f11822c.f24768N.setVisibility(0);
                this.f11822c.f24768N.setText(C4522p.m8236a(R.string.checking_channel_id_message));
                this.f11822c.f24768N.setTextColor(C0346c.m687c(this.f11822c.getApplicationContext(), R.color.textColorSecondary));
            }
            if (this.f11822c.f24760F != null) {
                this.f11822c.f24760F.cancel();
                this.f11822c.f24760F.purge();
            }
            this.f11822c.f24760F = new Timer();
            this.f11822c.f24760F.schedule(new TimerTask(this) {
                final /* synthetic */ C41351 f11819b;

                class C41321 implements Runnable {
                    final /* synthetic */ C41341 f11816a;

                    C41321(C41341 c41341) {
                        this.f11816a = c41341;
                    }

                    public final void run() {
                        this.f11816a.f11819b.f11822c.runOnUiThread(new Runnable(this.f11816a.f11819b.f11822c, C4522p.m8236a(R.string.at_least_count_channel_id_error_message)) {
                            final /* synthetic */ SelectIdChannelActivity f11824b;

                            public final void run() {
                                this.f11824b.f24766L = true;
                                this.f11824b.f24768N.setVisibility(0);
                                this.f11824b.f24768N.setText(r2);
                                this.f11824b.f24768N.setTextColor(C0346c.m687c(this.f11824b.getApplicationContext(), R.color.colorErrorText));
                                this.f11824b.m21977y();
                            }
                        });
                    }
                }

                class C41332 implements Runnable {
                    final /* synthetic */ C41341 f11817a;

                    C41332(C41341 c41341) {
                        this.f11817a = c41341;
                    }

                    public final void run() {
                        this.f11817a.f11819b.f11822c.runOnUiThread(/* anonymous class already generated */);
                    }
                }

                public final void run() {
                    this.f11819b.f11822c.f24759E = false;
                    if (!(this.f11819b.f11822c.f24766L || charSequence.toString().isEmpty())) {
                        SelectIdChannelActivity selectIdChannelActivity;
                        Runnable c41321;
                        if (charSequence.length() < 6) {
                            selectIdChannelActivity = this.f11819b.f11822c;
                            c41321 = new C41321(this);
                        } else if (charSequence.length() > 64) {
                            selectIdChannelActivity = this.f11819b.f11822c;
                            c41321 = new C41332(this);
                        } else {
                            C2808d.m7147a(new C6738c(charSequence.toString()));
                        }
                        selectIdChannelActivity.runOnUiThread(c41321);
                    }
                }
            }, 500);
            if (charSequence.toString().isEmpty()) {
                this.f11822c.f24766L = false;
                this.f11822c.f24768N.setText("");
                this.f11822c.f24768N.setVisibility(8);
            } else if (this.f11821b.matcher(charSequence.toString().toLowerCase()).find()) {
                this.f11822c.f24766L = false;
            } else {
                this.f11822c.runOnUiThread(/* anonymous class already generated */);
            }
        }
    }

    class C41373 extends ClickableSpan {
        final /* synthetic */ SelectIdChannelActivity f11825a;

        C41373(SelectIdChannelActivity selectIdChannelActivity) {
            this.f11825a = selectIdChannelActivity;
        }

        public final void onClick(View view) {
            C4187d.m8040a(this.f11825a, "scm@sapp.ir");
        }

        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    class C41384 implements Runnable {
        final /* synthetic */ SelectIdChannelActivity f11826a;

        C41384(SelectIdChannelActivity selectIdChannelActivity) {
            this.f11826a = selectIdChannelActivity;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
            String toLowerCase = this.f11826a.f24755A.getText().toString().toLowerCase();
            Activity h = SelectIdChannelActivity.m21974h(this.f11826a);
            Intent intent = new Intent(h, ConversationActivity.class);
            intent.putExtra("KEY_START_KIND", C3383b.f10381c - 1);
            intent.putExtra("KEY_PARTY", toLowerCase);
            intent.putExtra("KEY_FIRST", true);
            h.startActivity(intent);
            C4478a.m8165c(h, true);
            h.finish();
        }
    }

    class C41406 implements Runnable {
        final /* synthetic */ SelectIdChannelActivity f11829a;

        C41406(SelectIdChannelActivity selectIdChannelActivity) {
            this.f11829a = selectIdChannelActivity;
        }

        public final void run() {
            if (this.f11829a.f24755A.getText().toString().isEmpty()) {
                this.f11829a.f24768N.setVisibility(8);
                return;
            }
            this.f11829a.f24766L = false;
            this.f11829a.f24768N.setVisibility(0);
            this.f11829a.f24768N.setTextColor(C0346c.m687c(this.f11829a.getApplicationContext(), R.color.colorCorrectText));
            this.f11829a.f24768N.setText(this.f11829a.getString(R.string.available_channel_id_message, new Object[]{this.f11829a.f24755A.getText()}));
        }
    }

    static /* synthetic */ C7406c m21974h(SelectIdChannelActivity selectIdChannelActivity) {
        return selectIdChannelActivity;
    }

    static /* synthetic */ C7406c m21976j(SelectIdChannelActivity selectIdChannelActivity) {
        return selectIdChannelActivity;
    }

    private void m21977y() {
        C4144a.m8005a(this.f24773z);
    }

    protected final int mo3643g() {
        return R.drawable.ic_place_holder_channel;
    }

    protected final String mo3695h() {
        return null;
    }

    protected final C2973m mo3696i() {
        return C2973m.CHANNEL;
    }

    protected final void mo3697j() {
    }

    protected final void mo3698k() {
        this.v = 0.5d;
        this.w = 0.4d;
    }

    protected final void mo3699l() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m21057e((int) R.layout.activity_select_id_channel);
        this.f24773z = (LinearLayout) findViewById(R.id.mChannelID_textInputLayout);
        TextView textView = (TextView) findViewById(R.id.enter_textView);
        this.f24755A = (EditText) findViewById(R.id.channelID_editText);
        this.f24755A.requestFocus();
        boolean z = true;
        this.f24755A.setMaxLines(1);
        this.f24755A.setSingleLine(true);
        this.f24767M = (TextView) findViewById(R.id.channelIdPrefix_textView);
        this.f24771Q = (LinearLayout) findViewById(R.id.root_error_textView);
        this.f24768N = (TextView) findViewById(R.id.error_textView2);
        this.f24768N.setVisibility(8);
        this.f24770P = (LinearLayout) findViewById(R.id.root_send_email);
        this.f24770P.setVisibility(8);
        this.f24769O = (TextView) findViewById(R.id.email_textView);
        this.f24769O.setLinkTextColor(UIThemeManager.getmInstance().getAccent_color());
        this.f24769O.setTextColor(UIThemeManager.getmInstance().getText_secondary_color());
        String a = C4522p.m8236a(R.string.email_string_un_clickable_string);
        String a2 = C4522p.m8236a(R.string.email_string_clickable_string);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a);
        stringBuilder.append(" ");
        stringBuilder.append(a2);
        a = stringBuilder.toString();
        this.f24769O.setText(a);
        CharSequence spannableString = new SpannableString(a);
        spannableString.setSpan(new C41373(this), a.lastIndexOf(a2), a.lastIndexOf(a2) + a2.length(), 33);
        spannableString.setSpan(new StyleSpan(1), a.lastIndexOf(a2), a.lastIndexOf(a2) + a2.length(), 33);
        this.f24769O.setText(spannableString);
        this.f24769O.setMovementMethod(LinkMovementMethod.getInstance());
        ImageView imageView = (ImageView) findViewById(R.id.left_icon);
        ImageView imageView2 = (ImageView) findViewById(R.id.right_icon);
        if (C2535a.m6888a().m6919b().equals("fa")) {
            this.f24770P.setGravity(8388613);
            this.f24771Q.setGravity(8388613);
            this.f24769O.setGravity(8388613);
            this.f24768N.setGravity(8388613);
            imageView.setVisibility(8);
            imageView2.setVisibility(0);
            C2491i.m6801a(imageView2, UIThemeManager.getmInstance().getText_secondary_color());
        } else {
            this.f24770P.setGravity(8388611);
            this.f24771Q.setGravity(8388611);
            this.f24769O.setGravity(8388611);
            this.f24768N.setGravity(8388611);
            imageView.setVisibility(0);
            imageView2.setVisibility(8);
            C2491i.m6801a(imageView, UIThemeManager.getmInstance().getText_secondary_color());
        }
        Rect rect = new Rect();
        this.f24767M.getPaint().getTextBounds(C4522p.m8236a(R.string.channel_address_short), 0, C4522p.m8236a(R.string.channel_address_short).length(), rect);
        this.f24755A.setPadding(rect.width() + 10, 0, 0, (int) C2491i.m6804b((Context) this, 12.0f));
        this.f24755A.addTextChangedListener(this.f24772R);
        View view = (RelativeLayout) findViewById(R.id.root_layout);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) (((float) (point.y - (C2491i.m6759a(getApplicationContext()) + C2491i.m6805b(getApplicationContext())))) + C2491i.m6804b(getApplicationContext(), 8.0f));
        if (getResources().getConfiguration().orientation == 2) {
            layoutParams.width = (int) (((double) point.x) * 0.75d);
        }
        C2491i.m6796a(view, UIThemeManager.getmInstance().getRecycler_view_background_color());
        this.f24755A.setTextColor(UIThemeManager.getmInstance().getText_primary_color());
        textView.setTextColor(UIThemeManager.getmInstance().getText_primary_color());
        this.f24767M.setTextColor(UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6780a(UIThemeManager.getmInstance().getText_primary_color(), UIThemeManager.getmInstance().getAccent_color(), this.f24755A);
        if (getIntent() == null) {
            z = false;
        }
        Bundle extras = z ? getIntent().getExtras() : null;
        if (extras != null) {
            if (extras.containsKey("KEY_CHANNEL_NAME")) {
                this.f24762H = extras.getString("KEY_CHANNEL_NAME");
                m21053a(this.f24762H, false);
            }
            if (extras.containsKey("KEY_CHANNEL_IMAGE")) {
                this.f24763I = extras.getString("KEY_CHANNEL_IMAGE");
                if (this.f24763I != null) {
                    m21052a(this.f24763I);
                    m21055b(this.f24763I);
                } else {
                    m21062h(C2491i.m6806b(getApplicationContext(), null));
                    m21069o();
                    m21070p();
                }
            }
            if (extras.containsKey("KEY_CHANNEL_DESCRIPTIONS")) {
                this.f24764J = extras.getString("KEY_CHANNEL_DESCRIPTIONS");
            }
            if (extras.containsKey("KEY_CHANNEL_IS_REPLY")) {
                this.f24765K = extras.getBoolean("KEY_CHANNEL_IS_REPLY");
            }
            if (extras.containsKey("KEY_CHANNEL_LATITUDE_LOCATION")) {
                this.f24756B = extras.getDouble("KEY_CHANNEL_LATITUDE_LOCATION");
            }
            if (extras.containsKey("KEY_CHANNEL_LONGITUDE_LOCATION")) {
                this.f24757C = extras.getDouble("KEY_CHANNEL_LONGITUDE_LOCATION");
            }
            if (extras.containsKey("KEY_CHANNEL_LABEL_LOCATION")) {
                this.f24758D = extras.getString("KEY_CHANNEL_LABEL_LOCATION");
            }
        }
        m21067m();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_done_bar_white, menu);
        return true;
    }

    public void onEvent(C2698e c2698e) {
        runOnUiThread(new C41406(this));
    }

    public void onEvent(final C5940f c5940f) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ SelectIdChannelActivity f11831b;

            public final void run() {
                if (c5940f.f8890a.equals(C2775a.CHANNEL_ID_ALREADY_EXIST_EXCEPTION)) {
                    this.f11831b.runOnUiThread(/* anonymous class already generated */);
                    if (this.f11831b.f24770P != null) {
                        this.f11831b.f24770P.setVisibility(0);
                    }
                } else if (c5940f.f8890a.equals(C2775a.INVALID_CHANNEL_ID)) {
                    this.f11831b.runOnUiThread(/* anonymous class already generated */);
                } else {
                    this.f11831b.f24766L = false;
                }
            }
        });
    }

    public void onEvent(final C5941g c5941g) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ SelectIdChannelActivity f11828b;

            public final void run() {
                C4501c.m8189a().m8193b();
                this.f11828b.f24761G = false;
                C4513i.m8228a(SelectIdChannelActivity.m21976j(this.f11828b), c5941g.f8890a);
            }
        });
    }

    public void onEvent(C2699h c2699h) {
        runOnUiThread(new C41384(this));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Activity activity = this;
        if (menuItem.getItemId() == R.id.action_done && !activity.f24766L) {
            int i;
            CharSequence charSequence;
            ChannelLocation[] channelLocationArr;
            String str;
            String str2;
            boolean z;
            C1063i c6739d;
            String toLowerCase = activity.f24755A.getText().toString().toLowerCase();
            String trim = toLowerCase.trim();
            if (trim.isEmpty()) {
                i = R.string.channel_id_can_t_be_empty_;
            } else if (trim.length() < 6) {
                i = R.string.at_least_count_channel_id_error_message;
            } else if (trim.length() > 64) {
                i = R.string.max_count_channel_id_error_message;
            } else {
                charSequence = "";
                if (charSequence.isEmpty()) {
                    activity.f24768N.setVisibility(0);
                    activity.f24768N.setText(charSequence);
                    m21977y();
                } else {
                    activity.f24768N.setVisibility(8);
                    channelLocationArr = new ChannelLocation[1];
                    channelLocationArr[0] = new ChannelLocation(1, activity.f24756B, activity.f24757C, activity.f24758D, -1);
                    str = activity.f24762H;
                    str2 = activity.f24764J;
                    z = activity.f24765K;
                    if (!activity.f24761G) {
                        activity.f24761G = true;
                        c6739d = new C6739d(toLowerCase.toLowerCase(), str, str2, activity.f24763I, z, channelLocationArr);
                        C2808d.m7147a(c6739d);
                        C4501c.m8189a().m8192a(activity, c6739d);
                    }
                }
            }
            charSequence = C4522p.m8236a(i);
            if (charSequence.isEmpty()) {
                activity.f24768N.setVisibility(0);
                activity.f24768N.setText(charSequence);
                m21977y();
            } else {
                activity.f24768N.setVisibility(8);
                channelLocationArr = new ChannelLocation[1];
                channelLocationArr[0] = new ChannelLocation(1, activity.f24756B, activity.f24757C, activity.f24758D, -1);
                str = activity.f24762H;
                str2 = activity.f24764J;
                z = activity.f24765K;
                if (activity.f24761G) {
                    activity.f24761G = true;
                    c6739d = new C6739d(toLowerCase.toLowerCase(), str, str2, activity.f24763I, z, channelLocationArr);
                    C2808d.m7147a(c6739d);
                    C4501c.m8189a().m8192a(activity, c6739d);
                }
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
