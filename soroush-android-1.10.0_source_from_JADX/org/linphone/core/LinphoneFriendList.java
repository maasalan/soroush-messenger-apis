package org.linphone.core;

public interface LinphoneFriendList {
    void addFriend(LinphoneFriend linphoneFriend);

    LinphoneFriend findFriendByUri(String str);

    long getNativePtr();

    void setRLSUri(String str);

    void updateSubscriptions(LinphoneProxyConfig linphoneProxyConfig, boolean z);
}
