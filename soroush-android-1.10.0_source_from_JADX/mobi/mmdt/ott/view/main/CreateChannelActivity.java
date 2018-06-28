package mobi.mmdt.ott.view.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.google.android.gms.location.places.C1832a;
import com.google.android.gms.location.places.p161a.C5508a;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.view.components.C7695a;
import mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4522p;

public class CreateChannelActivity extends C7695a implements OnClickListener {
    private EditText f24742A;
    private TextInputLayout f24743B;
    private EditText f24744C;
    private CheckBox f24745D;
    private RelativeLayout f24746E;
    private double f24747F;
    private double f24748G;
    private TextInputLayout f24749z;

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

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 100) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            C1832a a = C5508a.m12042a(intent, MyApplication.m12952b());
            this.f24747F = a.mo3044a().f18734a;
            this.f24748G = a.mo3044a().f18735b;
            if (!(this.f24748G == 0.0d || this.f24747F == 0.0d)) {
                Toast.makeText(this, C4522p.m8236a(R.string.the_location_submitted), 0).show();
            }
        }
    }

    public void onClick(View view) {
        C3337b.m7811b((Activity) this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m21057e((int) R.layout.fragment_new_channel);
        m21053a(C4522p.m8236a(R.string.new_channel), false);
        this.f24749z = (TextInputLayout) findViewById(R.id.channelName_textInputLayout);
        this.f24742A = (EditText) findViewById(R.id.channelName_editText);
        this.f24743B = (TextInputLayout) findViewById(R.id.channelDescriptions_textInputLayout);
        this.f24744C = (EditText) findViewById(R.id.channelDescriptions_editText);
        this.f24745D = (CheckBox) findViewById(R.id.allowReply_checkBox);
        this.f24742A.setFilters(new InputFilter[]{new LengthFilter(128)});
        this.f24742A.setMaxLines(1);
        this.f24742A.setSingleLine(true);
        this.f24742A.requestFocus();
        this.f24744C.setFilters(new InputFilter[]{new LengthFilter(256)});
        this.f24744C.setMaxLines(5);
        this.f24746E = (RelativeLayout) findViewById(R.id.root_layout);
        int a = C2489g.m6754a().m6755a(BallPulseIndicator.SCALE);
        int b = C2489g.m6754a().m6756b(BallPulseIndicator.SCALE);
        LayoutParams layoutParams = this.f24746E.getLayoutParams();
        layoutParams.height = (int) (((float) (b - (C2491i.m6759a(getApplicationContext()) + C2491i.m6805b(getApplicationContext())))) + C2491i.m6804b(getApplicationContext(), 8.0f));
        if (getResources().getConfiguration().orientation == 2) {
            layoutParams.width = (int) (((double) a) * 0.75d);
            layoutParams.height = (int) (((double) b) * 1.1d);
        }
        m21060g(0);
        m21068n();
        m21054b((OnClickListener) this);
        m21062h(C2491i.m6806b(getApplicationContext(), null));
        m21069o();
        m21070p();
        if (this.s != null) {
            m21052a(this.s);
            m21055b(this.s);
        }
        C2491i.m6796a(this.f24746E, UIThemeManager.getmInstance().getRecycler_view_background_color());
        this.f24745D.setTextColor(UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6780a(UIThemeManager.getmInstance().getText_primary_color(), UIThemeManager.getmInstance().getAccent_color(), this.f24742A, this.f24744C);
        C2491i.m6799a(this.f24745D, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6781a(UIThemeManager.getmInstance().getAccent_color(), this.f24743B, this.f24749z);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_done_bar_white, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.action_done) {
            String trim = this.f24742A.getText().toString().trim();
            String trim2 = this.f24744C.getText().toString().trim();
            if (trim.trim().isEmpty()) {
                this.f24749z.setErrorEnabled(true);
                this.f24749z.setError(C4522p.m8236a(R.string.channel_name_can_t_be_empty_));
                C4144a.m8005a(this.f24749z);
            } else {
                this.f24749z.setErrorEnabled(false);
                boolean isChecked = this.f24745D.isChecked();
                overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
                String str = this.s;
                double d = this.f24747F;
                double d2 = this.f24748G;
                Intent intent = new Intent(this, SelectIdChannelActivity.class);
                intent.putExtra("KEY_CHANNEL_NAME", trim);
                intent.putExtra("KEY_CHANNEL_DESCRIPTIONS", trim2);
                intent.putExtra("KEY_CHANNEL_IS_REPLY", isChecked);
                intent.putExtra("KEY_CHANNEL_LATITUDE_LOCATION", d);
                intent.putExtra("KEY_CHANNEL_LONGITUDE_LOCATION", d2);
                intent.putExtra("KEY_CHANNEL_IMAGE", str);
                if (this != null) {
                    startActivity(intent);
                    C4478a.m8161b((Activity) this, false);
                    C4478a.m8165c((Activity) this, true);
                }
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
