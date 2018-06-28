package org.linphone.core;

import org.linphone.core.LinphoneAddressImpl.WrapMode;
import org.linphone.core.LinphoneChatMessage.State;
import org.linphone.core.LinphoneChatMessage.StateListener;

class LinphoneChatRoomImpl implements LinphoneChatRoom {
    protected final long nativePtr;

    protected LinphoneChatRoomImpl(long j) {
        this.nativePtr = j;
    }

    private native void compose(long j);

    private native long createFileTransferMessage(long j, String str, String str2, String str3, int i);

    private native long createLinphoneChatMessage(long j, String str);

    private native long createLinphoneChatMessage2(long j, String str, String str2, int i, long j2, boolean z, boolean z2);

    private native void deleteHistory(long j);

    private native void deleteMessage(long j, long j2);

    private native void destroy(long j);

    private native Object getCall(long j);

    private native long getChar(long j);

    private native Object getCore(long j);

    private native long[] getHistory(long j, int i);

    private LinphoneChatMessage[] getHistoryPrivate(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        LinphoneChatMessage[] linphoneChatMessageArr = new LinphoneChatMessage[jArr.length];
        for (int i = 0; i < linphoneChatMessageArr.length; i++) {
            linphoneChatMessageArr[i] = new LinphoneChatMessageImpl(jArr[i]);
        }
        return linphoneChatMessageArr;
    }

    private native long[] getHistoryRange(long j, int i, int i2);

    private native int getHistorySize(long j);

    private native long getPeerAddress(long j);

    private native int getUnreadMessagesCount(long j);

    private native boolean isRemoteComposing(long j);

    private native void markAsRead(long j);

    private native void sendChatMessage(long j, Object obj, long j2);

    private native void sendMessage(long j, String str);

    private native void sendMessage2(long j, Object obj, long j2, StateListener stateListener);

    public void compose() {
        synchronized (getCore()) {
            compose(this.nativePtr);
        }
    }

    public LinphoneChatMessage createFileTransferMessage(LinphoneContent linphoneContent) {
        LinphoneChatMessage linphoneChatMessageImpl;
        synchronized (getCore()) {
            linphoneChatMessageImpl = new LinphoneChatMessageImpl(createFileTransferMessage(this.nativePtr, linphoneContent.getName(), linphoneContent.getType(), linphoneContent.getSubtype(), linphoneContent.getRealSize()));
        }
        return linphoneChatMessageImpl;
    }

    public LinphoneChatMessage createLinphoneChatMessage(String str) {
        LinphoneChatMessage linphoneChatMessageImpl;
        synchronized (getCore()) {
            linphoneChatMessageImpl = new LinphoneChatMessageImpl(createLinphoneChatMessage(this.nativePtr, str));
        }
        return linphoneChatMessageImpl;
    }

    public LinphoneChatMessage createLinphoneChatMessage(String str, String str2, State state, long j, boolean z, boolean z2) {
        Throwable th;
        Throwable th2;
        synchronized (getCore()) {
            LinphoneChatRoomImpl linphoneChatRoomImpl;
            try {
                LinphoneChatMessage linphoneChatMessageImpl = new LinphoneChatMessageImpl(createLinphoneChatMessage2(this.nativePtr, str, str2, state.value(), j / 1000, z, z2));
                return linphoneChatMessageImpl;
            } catch (Throwable th3) {
                th = th3;
                th2 = th;
                throw th2;
            }
        }
    }

    public void deleteHistory() {
        synchronized (getCore()) {
            deleteHistory(this.nativePtr);
        }
    }

    public void deleteMessage(LinphoneChatMessage linphoneChatMessage) {
        synchronized (getCore()) {
            if (linphoneChatMessage != null) {
                deleteMessage(this.nativePtr, ((LinphoneChatMessageImpl) linphoneChatMessage).getNativePtr());
            }
        }
    }

    public LinphoneCall getCall() {
        return (LinphoneCall) getCall(this.nativePtr);
    }

    public long getChar() {
        return getChar(this.nativePtr);
    }

    public synchronized LinphoneCore getCore() {
        return (LinphoneCore) getCore(this.nativePtr);
    }

    public LinphoneChatMessage[] getHistory() {
        LinphoneChatMessage[] history;
        synchronized (getCore()) {
            history = getHistory(0);
        }
        return history;
    }

    public LinphoneChatMessage[] getHistory(int i) {
        LinphoneChatMessage[] historyPrivate;
        synchronized (getCore()) {
            historyPrivate = getHistoryPrivate(getHistory(this.nativePtr, i));
        }
        return historyPrivate;
    }

    public LinphoneChatMessage[] getHistoryRange(int i, int i2) {
        LinphoneChatMessage[] historyPrivate;
        synchronized (getCore()) {
            historyPrivate = getHistoryPrivate(getHistoryRange(this.nativePtr, i, i2));
        }
        return historyPrivate;
    }

    public int getHistorySize() {
        int historySize;
        synchronized (getCore()) {
            historySize = getHistorySize(this.nativePtr);
        }
        return historySize;
    }

    public LinphoneAddress getPeerAddress() {
        return new LinphoneAddressImpl(getPeerAddress(this.nativePtr), WrapMode.FromConst);
    }

    public int getUnreadMessagesCount() {
        int unreadMessagesCount;
        synchronized (getCore()) {
            unreadMessagesCount = getUnreadMessagesCount(this.nativePtr);
        }
        return unreadMessagesCount;
    }

    public boolean isRemoteComposing() {
        boolean isRemoteComposing;
        synchronized (getCore()) {
            isRemoteComposing = isRemoteComposing(this.nativePtr);
        }
        return isRemoteComposing;
    }

    public void markAsRead() {
        synchronized (getCore()) {
            markAsRead(this.nativePtr);
        }
    }

    public void sendChatMessage(LinphoneChatMessage linphoneChatMessage) {
        sendChatMessage(this.nativePtr, linphoneChatMessage, ((LinphoneChatMessageImpl) linphoneChatMessage).getNativePtr());
    }

    public void sendMessage(String str) {
        synchronized (getCore()) {
            sendMessage(this.nativePtr, str);
        }
    }

    public void sendMessage(LinphoneChatMessage linphoneChatMessage, StateListener stateListener) {
        synchronized (getCore()) {
            sendMessage2(this.nativePtr, linphoneChatMessage, ((LinphoneChatMessageImpl) linphoneChatMessage).getNativePtr(), stateListener);
        }
    }
}
