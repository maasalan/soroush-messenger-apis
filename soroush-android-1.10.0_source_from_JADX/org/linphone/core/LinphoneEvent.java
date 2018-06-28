package org.linphone.core;

public interface LinphoneEvent {
    void acceptSubscription();

    void addCustomHeader(String str, String str2);

    void denySubscription(Reason reason);

    LinphoneCore getCore();

    String getCustomHeader(String str);

    ErrorInfo getErrorInfo();

    String getEventName();

    Reason getReason();

    SubscriptionDir getSubscriptionDir();

    SubscriptionState getSubscriptionState();

    Object getUserContext();

    void notify(LinphoneContent linphoneContent);

    void sendPublish(LinphoneContent linphoneContent);

    void sendSubscribe(LinphoneContent linphoneContent);

    void setUserContext(Object obj);

    void terminate();

    void updatePublish(LinphoneContent linphoneContent);

    void updateSubscribe(LinphoneContent linphoneContent);
}
