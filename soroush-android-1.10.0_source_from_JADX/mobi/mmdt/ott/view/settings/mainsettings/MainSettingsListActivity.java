package mobi.mmdt.ott.view.settings.mainsettings;

import android.content.Intent;
import android.os.Bundle;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.settings.C4370d;
import mobi.mmdt.ott.view.settings.C6260b;
import mobi.mmdt.ott.view.settings.C7722a;
import mobi.mmdt.ott.view.settings.mainsettings.appearance.AppearanceSettingActivity;
import mobi.mmdt.ott.view.settings.mainsettings.general.GeneralSettingActivity;
import mobi.mmdt.ott.view.settings.mainsettings.mediastorage.MediaAndStorageSettingActivity;
import mobi.mmdt.ott.view.settings.mainsettings.notifications.NotificationsSettingsListActivity;
import mobi.mmdt.ott.view.settings.mainsettings.privacy.PrivacySettingsListActivity;
import mobi.mmdt.ott.view.settings.mainsettings.support.SupportSettingActivity;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4522p;
import org.jivesoftware.smack.roster.Roster;

public class MainSettingsListActivity extends C7722a {
    public final void mo3690a(int i, boolean z) {
    }

    public final void mo3705c(int i) {
        Intent intent;
        if (i == 1003) {
            intent = new Intent(getApplicationContext(), NotificationsSettingsListActivity.class);
        } else if (i == 1007) {
            intent = new Intent(getApplicationContext(), PrivacySettingsListActivity.class);
        } else if (i != 9001) {
            switch (i) {
                case 1021:
                    intent = new Intent(getApplicationContext(), GeneralSettingActivity.class);
                    break;
                case 1022:
                    intent = new Intent(getApplicationContext(), MediaAndStorageSettingActivity.class);
                    break;
                case 1023:
                    intent = new Intent(getApplicationContext(), AppearanceSettingActivity.class);
                    break;
                case Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE /*1024*/:
                    startActivity(new Intent(getApplicationContext(), SupportSettingActivity.class));
                    overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
                    return;
                default:
                    return;
            }
        } else {
            C4478a.m8138a(this);
            return;
        }
        startActivity(intent);
        overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
    }

    protected final String mo3643g() {
        return C4522p.m8236a(R.string.settings);
    }

    protected final C6260b mo3706h() {
        return new C6965c();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String a = C4370d.m8116a(this);
        this.f24430o.setVisibility(0);
        this.f24430o.setText(String.format(C4522p.m8236a(R.string.version), new Object[]{C2491i.m6777a(C2535a.m6888a().m6919b(), a)}));
    }
}
