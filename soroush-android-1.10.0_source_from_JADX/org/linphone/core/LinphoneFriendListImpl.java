package org.linphone.core;

import java.io.Serializable;

class LinphoneFriendListImpl implements Serializable, LinphoneFriendList {
    protected final long nativePtr;

    protected LinphoneFriendListImpl(long j) {
        this.nativePtr = j;
    }

    protected LinphoneFriendListImpl(LinphoneCoreImpl linphoneCoreImpl) {
        this.nativePtr = newLinphoneFriendList(linphoneCoreImpl.nativePtr);
    }

    private native void addFriend(long j, long j2);

    private native void finalize(long j);

    private native LinphoneFriend findFriendByUri(long j, String str);

    private native Object getCore(long j);

    private Object getSyncObject() {
        return this;
    }

    private native long newLinphoneFriendList(long j);

    private native void setRLSUri(long j, String str);

    private native void updateSubscriptions(long j, long j2, boolean z);

    public void addFriend(LinphoneFriend linphoneFriend) {
        synchronized (getSyncObject()) {
            addFriend(this.nativePtr, linphoneFriend.getNativePtr());
        }
    }

    protected void finalize() {
        if (this.nativePtr != 0) {
            finalize(this.nativePtr);
        }
        super.finalize();
    }

    public LinphoneFriend findFriendByUri(String str) {
        LinphoneFriend findFriendByUri;
        synchronized (getSyncObject()) {
            findFriendByUri = findFriendByUri(this.nativePtr, str);
        }
        return findFriendByUri;
    }

    public long getNativePtr() {
        return this.nativePtr;
    }

    public void setRLSUri(String str) {
        synchronized (getSyncObject()) {
            setRLSUri(this.nativePtr, str);
        }
    }

    public void updateSubscriptions(LinphoneProxyConfig linphoneProxyConfig, boolean z) {
        synchronized (getSyncObject()) {
            updateSubscriptions(this.nativePtr, ((LinphoneProxyConfigImpl) linphoneProxyConfig).nativePtr, z);
        }
    }
}
