package org.linphone.core;

import org.linphone.core.LinphoneCore.RegistrationState;

public interface LinphoneProxyConfig {
    boolean avpfEnabled();

    void done();

    LinphoneProxyConfig edit();

    void enableAvpf(boolean z);

    void enablePublish(boolean z);

    void enableQualityReporting(boolean z);

    LinphoneProxyConfig enableRegister(boolean z);

    LinphoneAddress getAddress();

    int getAvpfRRInterval();

    String getContactParameters();

    String getContactUriParameters();

    boolean getDialEscapePlus();

    String getDialPrefix();

    String getDomain();

    Reason getError();

    ErrorInfo getErrorInfo();

    int getExpires();

    String getIdentity();

    int getPrivacy();

    String getProxy();

    int getPublishExpires();

    String getQualityReportingCollector();

    int getQualityReportingInterval();

    String getRealm();

    String getRoute();

    RegistrationState getState();

    Object getUserData();

    boolean isPhoneNumber(String str);

    boolean isRegistered();

    int lookupCCCFromE164(String str);

    int lookupCCCFromIso(String str);

    String normalizePhoneNumber(String str);

    LinphoneAddress normalizeSipUri(String str);

    boolean publishEnabled();

    boolean qualityReportingEnabled();

    boolean registerEnabled();

    void setAddress(LinphoneAddress linphoneAddress);

    void setAvpfRRInterval(int i);

    void setContactParameters(String str);

    void setContactUriParameters(String str);

    void setDialEscapePlus(boolean z);

    void setDialPrefix(String str);

    void setExpires(int i);

    void setIdentity(String str);

    void setPrivacy(int i);

    void setProxy(String str);

    void setPublishExpires(int i);

    void setQualityReportingCollector(String str);

    void setQualityReportingInterval(int i);

    void setRealm(String str);

    void setRoute(String str);

    void setUserData(Object obj);
}
