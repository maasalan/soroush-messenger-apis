package org.linphone;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import mobi.mmdt.componentsutils.b.c.b;
import mobi.mmdt.ott.b.a.a;
import mobi.mmdt.ott.b.a.c;
import org.linphone.LinphonePreferences.AccountBuilder;
import org.linphone.core.LinphoneCore;

public class PreferencesMigrator {
    private LinphonePreferences mNewPrefs;
    private SharedPreferences mOldPrefs;
    private Resources mResources;

    public PreferencesMigrator(Context context) {
        this.mNewPrefs = LinphonePreferences.instance(context);
        this.mResources = context.getResources();
        this.mOldPrefs = PreferenceManager.getDefaultSharedPreferences(context);
    }

    private void deleteAllOldPreferences() {
        Editor edit = this.mOldPrefs.edit();
        edit.clear();
        edit.apply();
    }

    private void doAccountMigration(int i, boolean z) {
        String valueOf = i == 0 ? "" : String.valueOf(i);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getString(c.pref_username_key));
        stringBuilder.append(valueOf);
        String prefString = getPrefString(stringBuilder.toString(), null);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(getString(c.pref_auth_userid_key));
        stringBuilder2.append(valueOf);
        String prefString2 = getPrefString(stringBuilder2.toString(), null);
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(getString(c.pref_passwd_key));
        stringBuilder3.append(valueOf);
        String prefString3 = getPrefString(stringBuilder3.toString(), null);
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append(getString(c.pref_domain_key));
        stringBuilder4.append(valueOf);
        String prefString4 = getPrefString(stringBuilder4.toString(), null);
        if (prefString != null && prefString.length() > 0 && prefString3 != null) {
            StringBuilder stringBuilder5 = new StringBuilder();
            stringBuilder5.append(getString(c.pref_proxy_key));
            stringBuilder5.append(valueOf);
            AccountBuilder expires = new AccountBuilder(LinphoneManager.getLc()).setUsername(prefString).setUserId(prefString2).setDomain(prefString4).setPassword(prefString3).setProxy(getPrefString(stringBuilder5.toString(), null)).setExpires(getPrefString(c.pref_expire_key, null));
            StringBuilder stringBuilder6 = new StringBuilder();
            stringBuilder6.append(getString(c.pref_enable_outbound_proxy_key));
            stringBuilder6.append(valueOf);
            if (getPrefBoolean(stringBuilder6.toString(), false)) {
                expires.setOutboundProxyEnabled(true);
            }
            if (this.mResources.getBoolean(a.enable_push_id)) {
                valueOf = this.mNewPrefs.getPushNotificationRegistrationID();
                String string = getString(c.push_sender_id);
                if (valueOf != null && this.mNewPrefs.isPushNotificationEnabled()) {
                    stringBuilder2 = new StringBuilder("app-id=");
                    stringBuilder2.append(string);
                    stringBuilder2.append(";pn-type=google;pn-tok=");
                    stringBuilder2.append(valueOf);
                    expires.setContactParameters(stringBuilder2.toString());
                }
            }
            try {
                expires.saveNewAccount();
            } catch (Throwable e) {
                b.b("Error in Migrate account", e);
            }
            if (z) {
                this.mNewPrefs.setDefaultAccount(i);
            }
        }
    }

    private void doAccountsMigration() {
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        lcIfManagerNotDestroyedOrNull.clearAuthInfos();
        lcIfManagerNotDestroyedOrNull.clearProxyConfigs();
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < this.mOldPrefs.getInt(getString(c.pref_extra_accounts), 1)) {
                if (i != getPrefInt(c.pref_default_account_key, 0)) {
                    z = false;
                }
                doAccountMigration(i, z);
                i++;
            } else {
                return;
            }
        }
    }

    private boolean getPrefBoolean(int i, boolean z) {
        return this.mOldPrefs.getBoolean(this.mResources.getString(i), z);
    }

    private boolean getPrefBoolean(String str, boolean z) {
        return this.mOldPrefs.getBoolean(str, z);
    }

    private int getPrefInt(int i, int i2) {
        return this.mOldPrefs.getInt(this.mResources.getString(i), i2);
    }

    private String getPrefString(int i, String str) {
        return this.mOldPrefs.getString(this.mResources.getString(i), str);
    }

    private String getPrefString(String str, String str2) {
        return this.mOldPrefs.getString(str, str2);
    }

    private String getString(int i) {
        return this.mResources.getString(i);
    }

    public void doEchoMigration() {
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        if (!(lcIfManagerNotDestroyedOrNull == null || lcIfManagerNotDestroyedOrNull.needsEchoCalibration())) {
            this.mNewPrefs.setEchoCancellation(false);
        }
    }

    public void doMigration() {
        this.mNewPrefs.firstLaunchSuccessful();
        this.mNewPrefs.removePreviousVersionAuthInfoRemoval();
        this.mNewPrefs.setWifiOnlyEnabled(Boolean.valueOf(false));
        this.mNewPrefs.useRandomPort(false, false);
        this.mNewPrefs.setPushNotificationEnabled(false);
        this.mNewPrefs.setPushNotificationRegistrationID(getPrefString(c.push_reg_id_key, null));
        this.mNewPrefs.setDebugEnabled(true);
        this.mNewPrefs.setBackgroundModeEnabled(true);
        this.mNewPrefs.setAnimationsEnabled(false);
        this.mNewPrefs.setAutoStart(getPrefBoolean(c.pref_autostart_key, false));
        this.mNewPrefs.setSharingPictureServerUrl(getPrefString(c.pref_image_sharing_server_key, null));
        this.mNewPrefs.setRemoteProvisioningUrl(getPrefString(c.pref_remote_provisioning_key, null));
        doAccountsMigration();
        deleteAllOldPreferences();
    }

    public boolean isEchoMigratioNeeded() {
        LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
        return (lcIfManagerNotDestroyedOrNull == null || this.mNewPrefs.isEchoConfigurationUpdated() || lcIfManagerNotDestroyedOrNull.needsEchoCalibration() || !this.mNewPrefs.isEchoCancellationEnabled()) ? false : true;
    }

    public boolean isMigrationNeeded() {
        return this.mOldPrefs.getInt(getString(c.pref_extra_accounts), -1) != -1;
    }

    public void migrateRemoteProvisioningUriIfNeeded() {
        String string = this.mNewPrefs.getConfig().getString("app", "remote_provisioning", null);
        String remoteProvisioningUrl = this.mNewPrefs.getRemoteProvisioningUrl();
        if (string != null && string.length() > 0 && remoteProvisioningUrl == null) {
            this.mNewPrefs.setRemoteProvisioningUrl(string);
            this.mNewPrefs.getConfig().setString("app", "remote_provisioning", null);
            this.mNewPrefs.getConfig().sync();
        }
    }

    public void migrateSharingServerUrlIfNeeded() {
        String string = this.mNewPrefs.getConfig().getString("app", "sharing_server", null);
        if (string == null || string.equals("https://www.linphone.org:444/upload.php")) {
            this.mNewPrefs.setSharingPictureServerUrl("https://www.linphone.org:444/lft.php");
            this.mNewPrefs.getConfig().sync();
        }
    }
}
