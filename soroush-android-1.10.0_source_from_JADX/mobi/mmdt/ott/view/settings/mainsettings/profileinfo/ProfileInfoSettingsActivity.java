package mobi.mmdt.ott.view.settings.mainsettings.profileinfo;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.v7.app.C7406c;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.C2680g;
import mobi.mmdt.ott.logic.p261a.C6713f;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.newdesign.mainpage.C4258b;
import mobi.mmdt.ott.view.registeration.profileinfo.ProfileInfoActivity;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4522p;

public class ProfileInfoSettingsActivity extends ProfileInfoActivity implements C3101a {
    private boolean f24820N = false;
    private OnClickListener f24821O = new C44304(this);
    private OnClickListener f24822P = new C44315(this);
    private OnClickListener f24823Q = new C44326(this);

    class C44271 implements TextWatcher {
        final /* synthetic */ ProfileInfoSettingsActivity f12337a;
        private String f12338b;

        C44271(ProfileInfoSettingsActivity profileInfoSettingsActivity) {
            this.f12337a = profileInfoSettingsActivity;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f12338b = charSequence.toString();
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!(this.f12338b == null || this.f12338b.equals(charSequence.toString()))) {
                this.f12337a.f24820N = true;
            }
            this.f12338b = charSequence.toString();
        }
    }

    class C44282 implements TextWatcher {
        final /* synthetic */ ProfileInfoSettingsActivity f12339a;
        private String f12340b;

        C44282(ProfileInfoSettingsActivity profileInfoSettingsActivity) {
            this.f12339a = profileInfoSettingsActivity;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f12340b = charSequence.toString();
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!(this.f12340b == null || this.f12340b.equals(charSequence.toString()))) {
                this.f12339a.f24820N = true;
            }
            this.f12340b = charSequence.toString();
        }
    }

    class C44293 implements TextWatcher {
        final /* synthetic */ ProfileInfoSettingsActivity f12341a;
        private String f12342b;

        C44293(ProfileInfoSettingsActivity profileInfoSettingsActivity) {
            this.f12341a = profileInfoSettingsActivity;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f12342b = charSequence.toString();
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!(this.f12342b == null || this.f12342b.equals(charSequence.toString()))) {
                this.f12341a.f24820N = true;
            }
            this.f12342b = charSequence.toString();
        }
    }

    class C44304 implements OnClickListener {
        final /* synthetic */ ProfileInfoSettingsActivity f12343a;

        C44304(ProfileInfoSettingsActivity profileInfoSettingsActivity) {
            this.f12343a = profileInfoSettingsActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f12343a.mo3703y();
        }
    }

    class C44315 implements OnClickListener {
        final /* synthetic */ ProfileInfoSettingsActivity f12344a;

        C44315(ProfileInfoSettingsActivity profileInfoSettingsActivity) {
            this.f12344a = profileInfoSettingsActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            super.onBackPressed();
        }
    }

    class C44326 implements OnClickListener {
        final /* synthetic */ ProfileInfoSettingsActivity f12345a;

        C44326(ProfileInfoSettingsActivity profileInfoSettingsActivity) {
            this.f12345a = profileInfoSettingsActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C2808d.m7148b(new C6713f());
        }
    }

    class C44337 implements Runnable {
        final /* synthetic */ ProfileInfoSettingsActivity f12346a;

        C44337(ProfileInfoSettingsActivity profileInfoSettingsActivity) {
            this.f12346a = profileInfoSettingsActivity;
        }

        public final void run() {
            C4258b.m8066a(ProfileInfoSettingsActivity.m22082d(this.f12346a));
        }
    }

    static /* synthetic */ C7406c m22082d(ProfileInfoSettingsActivity profileInfoSettingsActivity) {
        return profileInfoSettingsActivity;
    }

    public final Dialog mo2299a(Bundle bundle) {
        String a;
        String a2;
        String a3;
        OnClickListener onClickListener;
        String a4;
        OnClickListener onClickListener2;
        int i = bundle.getInt("dialog_id");
        if (i == 10) {
            a = C4522p.m8236a(R.string.save_changes);
            a2 = C4522p.m8236a(R.string.are_you_sure_to_save);
            a3 = C4522p.m8236a(R.string.save);
            onClickListener = this.f24821O;
            a4 = C4522p.m8236a(R.string.cancel);
            onClickListener2 = this.f24822P;
        } else if (i != 13) {
            return super.mo2299a(bundle);
        } else {
            a = C4522p.m8236a(R.string.log_out_title_dialog);
            a2 = C4522p.m8236a(R.string.log_out_description_dialog);
            a3 = C4522p.m8236a(R.string.ok_cap);
            onClickListener = this.f24823Q;
            a4 = C4522p.m8236a(R.string.cancel);
            onClickListener2 = null;
        }
        return C4488b.m8182a(this, a, a2, a3, onClickListener, a4, onClickListener2);
    }

    public void onBackPressed() {
        if (!this.f24820N) {
            if (!this.t) {
                super.onBackPressed();
                return;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 10);
        b_(bundle);
    }

    public void onCreate(Bundle bundle) {
        boolean z = true;
        this.E = true;
        this.D = true;
        this.z = R.layout.fragment_profile_info;
        this.A = true;
        super.onCreate(bundle);
        if (bundle == null || !bundle.containsKey("KEY_IS_CHANGE_OCCURRED") || !bundle.getBoolean("KEY_IS_CHANGE_OCCURRED")) {
            z = false;
        }
        this.f24820N = z;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_profile_info_settings, menu);
        menu.findItem(R.id.action_log_out).setTitle(C4522p.m8236a(R.string.action_log_out));
        return true;
    }

    public void onEvent(C2680g c2680g) {
        runOnUiThread(new C44337(this));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_done) {
            onBackPressed();
            return true;
        } else if (itemId != R.id.action_log_out) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            Bundle bundle = new Bundle();
            bundle.putInt("dialog_id", 13);
            b_(bundle);
            return true;
        }
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        this.f24782I.setVisibility(0);
        this.f24785L.setVisibility(0);
        this.f24786M.setVisibility(0);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("KEY_IS_CHANGE_OCCURRED", this.f24820N);
    }

    protected final void mo3704z() {
        super.mo3704z();
        this.F.addTextChangedListener(new C44271(this));
        this.J.addTextChangedListener(new C44282(this));
        this.G.addTextChangedListener(new C44293(this));
    }
}
