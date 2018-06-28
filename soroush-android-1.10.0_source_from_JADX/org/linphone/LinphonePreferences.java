package org.linphone;

import android.content.Context;
import mobi.mmdt.componentsutils.b.c.b;
import mobi.mmdt.ott.b.a.c;
import org.linphone.core.LinphoneAddress.TransportType;
import org.linphone.core.LinphoneCore;
import org.linphone.core.LinphoneCore.Transports;
import org.linphone.core.LinphoneCoreFactory;
import org.linphone.core.LinphoneProxyConfig;
import org.linphone.core.LpConfig;
import org.linphone.mediastream.Log;

public class LinphonePreferences {
    private static final int LINPHONE_CORE_RANDOM_PORT = -1;
    private static LinphonePreferences instance;
    private Context mContext;

    public static class AccountBuilder {
        private LinphoneCore lc;
        private boolean tempAvpfEnabled = false;
        private int tempAvpfRRInterval = 0;
        private String tempContactsParams;
        private String tempDisplayName;
        private String tempDomain;
        private boolean tempEnabled = true;
        private String tempExpire;
        private boolean tempNoDefault = false;
        private boolean tempOutboundProxy;
        private String tempPassword;
        private String tempProxy;
        private String tempQualityReportingCollector;
        private boolean tempQualityReportingEnabled = false;
        private int tempQualityReportingInterval = 0;
        private String tempRealm;
        private TransportType tempTransport;
        private String tempUserId;
        private String tempUsername;

        public AccountBuilder(LinphoneCore linphoneCore) {
            this.lc = linphoneCore;
        }

        public void saveNewAccount() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r9 = this;
            r0 = r9.tempUsername;
            if (r0 == 0) goto L_0x011b;
        L_0x0004:
            r0 = r9.tempUsername;
            r0 = r0.length();
            if (r0 <= 0) goto L_0x011b;
        L_0x000c:
            r0 = r9.tempDomain;
            if (r0 == 0) goto L_0x011b;
        L_0x0010:
            r0 = r9.tempDomain;
            r0 = r0.length();
            if (r0 > 0) goto L_0x001a;
        L_0x0018:
            goto L_0x011b;
        L_0x001a:
            r0 = new java.lang.StringBuilder;
            r1 = "sip:";
            r0.<init>(r1);
            r1 = r9.tempUsername;
            r0.append(r1);
            r1 = "@";
            r0.append(r1);
            r1 = r9.tempDomain;
            r0.append(r1);
            r0 = r0.toString();
            r1 = "sip:";
            r2 = r9.tempProxy;
            if (r2 != 0) goto L_0x004c;
        L_0x003a:
            r2 = new java.lang.StringBuilder;
            r2.<init>();
            r2.append(r1);
            r1 = r9.tempDomain;
        L_0x0044:
            r2.append(r1);
            r1 = r2.toString();
            goto L_0x0081;
        L_0x004c:
            r2 = r9.tempProxy;
            r3 = "sip:";
            r2 = r2.startsWith(r3);
            if (r2 != 0) goto L_0x007f;
        L_0x0056:
            r2 = r9.tempProxy;
            r3 = "<sip:";
            r2 = r2.startsWith(r3);
            if (r2 != 0) goto L_0x007f;
        L_0x0060:
            r2 = r9.tempProxy;
            r3 = "sips:";
            r2 = r2.startsWith(r3);
            if (r2 != 0) goto L_0x007f;
        L_0x006a:
            r2 = r9.tempProxy;
            r3 = "<sips:";
            r2 = r2.startsWith(r3);
            if (r2 != 0) goto L_0x007f;
        L_0x0074:
            r2 = new java.lang.StringBuilder;
            r2.<init>();
            r2.append(r1);
            r1 = r9.tempProxy;
            goto L_0x0044;
        L_0x007f:
            r1 = r9.tempProxy;
        L_0x0081:
            r2 = org.linphone.core.LinphoneCoreFactory.instance();
            r1 = r2.createLinphoneAddress(r1);
            r2 = org.linphone.core.LinphoneCoreFactory.instance();
            r0 = r2.createLinphoneAddress(r0);
            r2 = r9.tempDisplayName;
            if (r2 == 0) goto L_0x009a;
        L_0x0095:
            r2 = r9.tempDisplayName;
            r0.setDisplayName(r2);
        L_0x009a:
            r2 = r9.tempTransport;
            if (r2 == 0) goto L_0x00a3;
        L_0x009e:
            r2 = r9.tempTransport;
            r1.setTransport(r2);
        L_0x00a3:
            r2 = r9.tempOutboundProxy;
            if (r2 == 0) goto L_0x00ac;
        L_0x00a7:
            r2 = r1.asStringUriOnly();
            goto L_0x00ad;
        L_0x00ac:
            r2 = 0;
        L_0x00ad:
            r3 = r9.lc;
            r0 = r0.asString();
            r1 = r1.asStringUriOnly();
            r4 = r9.tempEnabled;
            r0 = r3.createProxyConfig(r0, r1, r2, r4);
            r1 = r9.tempContactsParams;
            if (r1 == 0) goto L_0x00c6;
        L_0x00c1:
            r1 = r9.tempContactsParams;
            r0.setContactUriParameters(r1);
        L_0x00c6:
            r1 = r9.tempExpire;
            if (r1 == 0) goto L_0x00d3;
        L_0x00ca:
            r1 = r9.tempExpire;	 Catch:{ NumberFormatException -> 0x00d3 }
            r1 = java.lang.Integer.parseInt(r1);	 Catch:{ NumberFormatException -> 0x00d3 }
            r0.setExpires(r1);	 Catch:{ NumberFormatException -> 0x00d3 }
        L_0x00d3:
            r1 = r9.tempAvpfEnabled;
            r0.enableAvpf(r1);
            r1 = r9.tempAvpfRRInterval;
            r0.setAvpfRRInterval(r1);
            r1 = r9.tempQualityReportingEnabled;
            r0.enableQualityReporting(r1);
            r1 = r9.tempQualityReportingCollector;
            r0.setQualityReportingCollector(r1);
            r1 = r9.tempQualityReportingInterval;
            r0.setQualityReportingInterval(r1);
            r1 = r9.tempRealm;
            if (r1 == 0) goto L_0x00f5;
        L_0x00f0:
            r1 = r9.tempRealm;
            r0.setRealm(r1);
        L_0x00f5:
            r2 = org.linphone.core.LinphoneCoreFactory.instance();
            r3 = r9.tempUsername;
            r4 = r9.tempUserId;
            r5 = r9.tempPassword;
            r6 = 0;
            r7 = 0;
            r8 = r9.tempDomain;
            r1 = r2.createAuthInfo(r3, r4, r5, r6, r7, r8);
            r2 = r9.lc;
            r2.addProxyConfig(r0);
            r2 = r9.lc;
            r2.addAuthInfo(r1);
            r1 = r9.tempNoDefault;
            if (r1 != 0) goto L_0x011a;
        L_0x0115:
            r1 = r9.lc;
            r1.setDefaultProxyConfig(r0);
        L_0x011a:
            return;
        L_0x011b:
            r0 = 1;
            r0 = new java.lang.Object[r0];
            r1 = 0;
            r2 = "Skipping account save: username or domain not provided";
            r0[r1] = r2;
            org.linphone.mediastream.Log.m22101w(r0);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.linphone.LinphonePreferences.AccountBuilder.saveNewAccount():void");
        }

        public AccountBuilder setAvpfRRInterval(int i) {
            this.tempAvpfRRInterval = i;
            return this;
        }

        public AccountBuilder setContactParameters(String str) {
            this.tempContactsParams = str;
            return this;
        }

        public AccountBuilder setDisplayName(String str) {
            this.tempDisplayName = str;
            return this;
        }

        public AccountBuilder setDomain(String str) {
            this.tempDomain = str;
            return this;
        }

        public AccountBuilder setExpires(String str) {
            this.tempExpire = str;
            return this;
        }

        public AccountBuilder setOutboundProxyEnabled(boolean z) {
            this.tempOutboundProxy = z;
            return this;
        }

        public AccountBuilder setPassword(String str) {
            this.tempPassword = str;
            return this;
        }

        public AccountBuilder setProxy(String str) {
            this.tempProxy = str;
            return this;
        }

        public AccountBuilder setTransport(TransportType transportType) {
            this.tempTransport = transportType;
            return this;
        }

        public AccountBuilder setUserId(String str) {
            this.tempUserId = str;
            return this;
        }

        public AccountBuilder setUsername(String str) {
            this.tempUsername = str;
            return this;
        }
    }

    private LinphonePreferences(Context context) {
        this.mContext = context;
    }

    private LinphoneCore getLc() {
        return !LinphoneManager.isInstanciated() ? null : LinphoneManager.getLcIfManagerNotDestroyedOrNull();
    }

    private LinphoneProxyConfig getProxyConfig(int i) {
        LinphoneProxyConfig[] proxyConfigList = getLc().getProxyConfigList();
        if (i >= 0) {
            if (i < proxyConfigList.length) {
                return proxyConfigList[i];
            }
        }
        return null;
    }

    private String getString(int i) {
        if (this.mContext == null && LinphoneManager.isInstanciated()) {
            this.mContext = LinphoneManager.getInstanceWithoutContext().getContext();
        }
        return this.mContext != null ? this.mContext.getString(i) : "";
    }

    public static synchronized LinphonePreferences instance(Context context) {
        LinphonePreferences linphonePreferences;
        synchronized (LinphonePreferences.class) {
            if (instance == null) {
                instance = new LinphonePreferences(context);
            }
            linphonePreferences = instance;
        }
        return linphonePreferences;
    }

    public int deleteAccount(int i) {
        LinphoneProxyConfig proxyConfig = getProxyConfig(i);
        if (proxyConfig != null) {
            getLc().removeProxyConfig(proxyConfig);
        }
        if (getLc().getProxyConfigList().length != 0) {
            resetDefaultProxyConfig();
            i = 2;
        } else {
            getLc().setDefaultProxyConfig(null);
            i = 1;
        }
        getLc().refreshRegisters();
        return i;
    }

    public void echoConfigurationUpdated() {
        getConfig().setBool("app", "ec_updated", true);
    }

    public void firstLaunchSuccessful() {
        getConfig().setBool("app", "first_launch", false);
    }

    public int getAccountCount() {
        return (getLc() == null || getLc().getProxyConfigList() == null) ? 0 : getLc().getProxyConfigList().length;
    }

    public LpConfig getConfig() {
        LinphoneCore lc = getLc();
        if (lc != null) {
            return lc.getConfig();
        }
        LinphoneCoreFactory instance;
        String str;
        if (LinphoneManager.isInstanciated()) {
            instance = LinphoneCoreFactory.instance();
            str = LinphoneManager.getInstance(this.mContext).mLinphoneConfigFile;
        } else {
            Log.m22101w("LinphoneManager not instanciated yet...");
            instance = LinphoneCoreFactory.instance();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.mContext.getFilesDir().getAbsolutePath());
            stringBuilder.append("/.linphonerc");
            str = stringBuilder.toString();
        }
        return instance.createLpConfig(str);
    }

    public String getPushNotificationRegistrationID() {
        return getConfig().getString("app", "push_notification_regid", null);
    }

    public String getRemoteProvisioningUrl() {
        return getLc().getProvisioningUri();
    }

    public String getRingtone(String str) {
        String string = getConfig().getString("app", "ringtone", str);
        if (string != null) {
            if (string.length() == 0) {
                return str;
            }
            str = string;
        }
        return str;
    }

    public String getSharingPictureServerUrl() {
        return getConfig().getString("app", "sharing_server", null);
    }

    public String getTunnelMode() {
        return getConfig().getString("app", "tunnel", null);
    }

    public boolean isAccountEnabled(int i) {
        return getProxyConfig(i).registerEnabled();
    }

    public boolean isDebugEnabled() {
        return getConfig().getBool("app", "debug", false);
    }

    public boolean isEchoCancellationEnabled() {
        return getLc().isEchoCancellationEnabled();
    }

    public boolean isEchoConfigurationUpdated() {
        return getConfig().getBool("app", "ec_updated", false);
    }

    public boolean isProvisioningLoginViewEnabled() {
        return getConfig().getBool("app", "show_login_view", false);
    }

    public boolean isPushNotificationEnabled() {
        return getConfig().getBool("app", "push_notification", false);
    }

    public boolean isVideoEnabled() {
        return getLc().isVideoSupported() && getLc().isVideoEnabled();
    }

    public boolean isWifiOnlyEnabled() {
        return getConfig().getBool("app", "wifi_only", false);
    }

    public void removePreviousVersionAuthInfoRemoval() {
        getConfig().setBool("sip", "store_auth_info", true);
    }

    public void resetDefaultProxyConfig() {
        int length = getLc().getProxyConfigList().length;
        for (int i = 0; i < length; i++) {
            if (isAccountEnabled(i)) {
                getLc().setDefaultProxyConfig(getProxyConfig(i));
                break;
            }
        }
        if (getLc().getDefaultProxyConfig() == null) {
            getLc().setDefaultProxyConfig(getProxyConfig(0));
        }
    }

    public void setAnimationsEnabled(boolean z) {
        getConfig().setBool("app", "animations", z);
    }

    public void setAutoStart(boolean z) {
        getConfig().setBool("app", "auto_start", z);
    }

    public void setBackgroundModeEnabled(boolean z) {
        getConfig().setBool("app", "background_mode", z);
    }

    public void setDebugEnabled(boolean z) {
        getConfig().setBool("app", "debug", z);
        LinphoneCoreFactory.instance().enableLogCollection(z);
        LinphoneCoreFactory.instance().setDebugMode(z, getString(c.app_name));
    }

    public void setDefaultAccount(int i) {
        LinphoneProxyConfig[] proxyConfigList = getLc().getProxyConfigList();
        if (i >= 0 && i < proxyConfigList.length) {
            getLc().setDefaultProxyConfig(proxyConfigList[i]);
        }
    }

    public void setEchoCancellation(boolean z) {
        getLc().enableEchoCancellation(z);
    }

    public void setFrontCamAsDefault(boolean z) {
        getConfig().setBool("app", "front_camera_default", z);
    }

    public void setPushNotificationEnabled(boolean z) {
        getConfig().setBool("app", "push_notification", z);
        int i = 0;
        if (z) {
            String pushNotificationRegistrationID = getPushNotificationRegistrationID();
            String string = getString(c.push_sender_id);
            if (pushNotificationRegistrationID != null && getLc().getProxyConfigList().length > 0) {
                LinphoneProxyConfig[] proxyConfigList = getLc().getProxyConfigList();
                int length = proxyConfigList.length;
                while (i < length) {
                    LinphoneProxyConfig linphoneProxyConfig = proxyConfigList[i];
                    StringBuilder stringBuilder = new StringBuilder("app-id=");
                    stringBuilder.append(string);
                    stringBuilder.append(";pn-type=google;pn-tok=");
                    stringBuilder.append(pushNotificationRegistrationID);
                    String stringBuilder2 = stringBuilder.toString();
                    linphoneProxyConfig.edit();
                    linphoneProxyConfig.setContactUriParameters(stringBuilder2);
                    linphoneProxyConfig.done();
                    b.f("Push notif infos added to proxy config");
                    i++;
                }
                getLc().refreshRegisters();
            }
            return;
        }
        if (getLc().getProxyConfigList().length > 0) {
            LinphoneProxyConfig[] proxyConfigList2 = getLc().getProxyConfigList();
            int length2 = proxyConfigList2.length;
            while (i < length2) {
                LinphoneProxyConfig linphoneProxyConfig2 = proxyConfigList2[i];
                linphoneProxyConfig2.edit();
                linphoneProxyConfig2.setContactUriParameters(null);
                linphoneProxyConfig2.done();
                b.f("Push notif infos removed from proxy config");
                i++;
            }
            getLc().refreshRegisters();
        }
    }

    public void setPushNotificationRegistrationID(String str) {
        getConfig().setString("app", "push_notification_regid", str);
    }

    public void setRemoteProvisioningUrl(String str) {
        if (str != null && str.length() == 0) {
            str = null;
        }
        getLc().setProvisioningUri(str);
    }

    public void setSharingPictureServerUrl(String str) {
        getConfig().setString("app", "sharing_server", str);
    }

    public void setSipPort(int i) {
        if (getLc() != null) {
            Transports signalingTransportPorts = getLc().getSignalingTransportPorts();
            signalingTransportPorts.udp = i;
            signalingTransportPorts.tcp = i;
            signalingTransportPorts.tls = -1;
            getLc().setSignalingTransportPorts(signalingTransportPorts);
        }
    }

    public void setWifiOnlyEnabled(Boolean bool) {
        getConfig().setBool("app", "wifi_only", bool.booleanValue());
    }

    public boolean shouldAutomaticallyAcceptVideoRequests() {
        return getLc().getVideoAutoAcceptPolicy();
    }

    public boolean shouldInitiateVideoCall() {
        return getLc().getVideoAutoInitiatePolicy();
    }

    public boolean useFrontCam() {
        return getConfig().getBool("app", "front_camera_default", true);
    }

    public void useRandomPort(boolean z, boolean z2) {
        getConfig().setBool("app", "random_port", z);
        if (z2) {
            if (z) {
                setSipPort(-1);
                return;
            }
            setSipPort(5090);
        }
    }
}
