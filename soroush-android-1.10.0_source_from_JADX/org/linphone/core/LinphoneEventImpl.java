package org.linphone.core;

public class LinphoneEventImpl implements LinphoneEvent {
    private long mNativePtr;
    private Object mUserContext;

    protected LinphoneEventImpl(long j) {
        this.mNativePtr = j;
    }

    private native int acceptSubscription(long j);

    private native void addCustomHeader(long j, String str, String str2);

    private native int denySubscription(long j, int i);

    private native Object getCore(long j);

    private native String getCustomHeader(long j, String str);

    private native long getErrorInfo(long j);

    private native String getEventName(long j);

    private native int getReason(long j);

    private native int getSubscriptionDir(long j);

    private native int getSubscriptionState(long j);

    private native int notify(long j, String str, String str2, byte[] bArr, String str3);

    private native void sendPublish(long j, String str, String str2, byte[] bArr, String str3);

    private native void sendSubscribe(long j, String str, String str2, byte[] bArr, String str3);

    private native int terminate(long j);

    private native void unref(long j);

    private native int updatePublish(long j, String str, String str2, byte[] bArr, String str3);

    private native int updateSubscribe(long j, String str, String str2, byte[] bArr, String str3);

    public synchronized void acceptSubscription() {
        synchronized (getCore()) {
            acceptSubscription(this.mNativePtr);
        }
    }

    public synchronized void addCustomHeader(String str, String str2) {
        addCustomHeader(this.mNativePtr, str, str2);
    }

    public synchronized void denySubscription(Reason reason) {
        synchronized (getCore()) {
            denySubscription(this.mNativePtr, reason.mValue);
        }
    }

    protected void finalize() {
        unref(this.mNativePtr);
    }

    public synchronized LinphoneCore getCore() {
        return (LinphoneCore) getCore(this.mNativePtr);
    }

    public synchronized String getCustomHeader(String str) {
        return getCustomHeader(this.mNativePtr, str);
    }

    public synchronized ErrorInfo getErrorInfo() {
        return new ErrorInfoImpl(getErrorInfo(this.mNativePtr));
    }

    public synchronized String getEventName() {
        return getEventName(this.mNativePtr);
    }

    public synchronized Reason getReason() {
        return Reason.fromInt(getReason(this.mNativePtr));
    }

    public synchronized SubscriptionDir getSubscriptionDir() {
        return SubscriptionDir.fromInt(getSubscriptionDir(this.mNativePtr));
    }

    public synchronized SubscriptionState getSubscriptionState() {
        try {
        } catch (LinphoneCoreException e) {
            e.printStackTrace();
            return SubscriptionState.Error;
        }
        return SubscriptionState.fromInt(getSubscriptionState(this.mNativePtr));
    }

    public synchronized Object getUserContext() {
        return this.mUserContext;
    }

    public void notify(LinphoneContent linphoneContent) {
        synchronized (getCore()) {
            notify(this.mNativePtr, linphoneContent.getType(), linphoneContent.getSubtype(), linphoneContent.getData(), linphoneContent.getEncoding());
        }
    }

    public void sendPublish(LinphoneContent linphoneContent) {
        synchronized (getCore()) {
            if (linphoneContent != null) {
                sendPublish(this.mNativePtr, linphoneContent.getType(), linphoneContent.getSubtype(), linphoneContent.getData(), linphoneContent.getEncoding());
            } else {
                sendPublish(this.mNativePtr, null, null, null, null);
            }
        }
    }

    public void sendSubscribe(LinphoneContent linphoneContent) {
        synchronized (getCore()) {
            if (linphoneContent != null) {
                sendSubscribe(this.mNativePtr, linphoneContent.getType(), linphoneContent.getSubtype(), linphoneContent.getData(), linphoneContent.getEncoding());
            } else {
                sendSubscribe(this.mNativePtr, null, null, null, null);
            }
        }
    }

    public synchronized void setUserContext(Object obj) {
        this.mUserContext = obj;
    }

    public void terminate() {
        synchronized (getCore()) {
            terminate(this.mNativePtr);
        }
    }

    public void updatePublish(LinphoneContent linphoneContent) {
        synchronized (getCore()) {
            updatePublish(this.mNativePtr, linphoneContent.getType(), linphoneContent.getSubtype(), linphoneContent.getData(), linphoneContent.getEncoding());
        }
    }

    public void updateSubscribe(LinphoneContent linphoneContent) {
        synchronized (getCore()) {
            updateSubscribe(this.mNativePtr, linphoneContent.getType(), linphoneContent.getSubtype(), linphoneContent.getData(), linphoneContent.getEncoding());
        }
    }
}
