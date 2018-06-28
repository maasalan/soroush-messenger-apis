package org.linphone.core;

import java.io.UnsupportedEncodingException;
import org.jivesoftware.smack.util.StringUtils;
import org.linphone.core.LinphoneAddressImpl.WrapMode;
import org.linphone.core.LinphoneChatMessage.LinphoneChatMessageListener;
import org.linphone.core.LinphoneChatMessage.State;

public class LinphoneChatMessageImpl implements LinphoneChatMessage {
    protected final long nativePtr;

    protected LinphoneChatMessageImpl(long j) {
        this.nativePtr = j;
    }

    private native void addCustomHeader(long j, String str, String str2);

    private native void cancelFileTransfer(long j);

    private native int downloadFile(long j);

    private native String getAppData(long j);

    private native String getCustomHeader(long j, String str);

    private native long getErrorInfo(long j);

    private native String getExternalBodyUrl(long j);

    private native Object getFileTransferInformation(long j);

    private native long getFrom(long j);

    private native long getPeerAddress(long j);

    private native int getReason(long j);

    private native int getStatus(long j);

    private native int getStorageId(long j);

    private native byte[] getText(long j);

    private native long getTime(long j);

    private native long getTo(long j);

    private native boolean isOutgoing(long j);

    private native boolean isRead(long j);

    private native void putChar(long j, long j2);

    private native void setAppData(long j, String str);

    private native void setExternalBodyUrl(long j, String str);

    private native void setFileTransferFilepath(long j, String str);

    private native void setListener(long j, LinphoneChatMessageListener linphoneChatMessageListener);

    private native void store(long j);

    private native void unref(long j);

    public void addCustomHeader(String str, String str2) {
        addCustomHeader(this.nativePtr, str, str2);
    }

    public void cancelFileTransfer() {
        cancelFileTransfer(this.nativePtr);
    }

    public int downloadFile() {
        return downloadFile(this.nativePtr);
    }

    protected void finalize() {
        unref(this.nativePtr);
        super.finalize();
    }

    public String getAppData() {
        return getAppData(this.nativePtr);
    }

    public String getCustomHeader(String str) {
        return getCustomHeader(this.nativePtr, str);
    }

    public ErrorInfo getErrorInfo() {
        return new ErrorInfoImpl(getErrorInfo(this.nativePtr));
    }

    public String getExternalBodyUrl() {
        return getExternalBodyUrl(this.nativePtr);
    }

    public LinphoneContent getFileTransferInformation() {
        return (LinphoneContent) getFileTransferInformation(this.nativePtr);
    }

    public LinphoneAddress getFrom() {
        return new LinphoneAddressImpl(getFrom(this.nativePtr), WrapMode.FromConst);
    }

    public long getNativePtr() {
        return this.nativePtr;
    }

    public LinphoneAddress getPeerAddress() {
        return new LinphoneAddressImpl(getPeerAddress(this.nativePtr), WrapMode.FromConst);
    }

    public Reason getReason() {
        return Reason.fromInt(getReason(this.nativePtr));
    }

    public State getStatus() {
        return State.fromInt(getStatus(this.nativePtr));
    }

    public int getStorageId() {
        return getStorageId(this.nativePtr);
    }

    public String getText() {
        try {
            byte[] text = getText(this.nativePtr);
            if (text != null) {
                return new String(text, StringUtils.UTF8);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public long getTime() {
        return getTime(this.nativePtr) * 1000;
    }

    public LinphoneAddress getTo() {
        return new LinphoneAddressImpl(getTo(this.nativePtr), WrapMode.FromConst);
    }

    public boolean isOutgoing() {
        return isOutgoing(this.nativePtr);
    }

    public boolean isRead() {
        return isRead(this.nativePtr);
    }

    public void putChar(long j) {
        putChar(this.nativePtr, j);
    }

    public void setAppData(String str) {
        setAppData(this.nativePtr, str);
    }

    public void setExternalBodyUrl(String str) {
        setExternalBodyUrl(this.nativePtr, str);
    }

    public void setFileTransferFilepath(String str) {
        setFileTransferFilepath(this.nativePtr, str);
    }

    public void setListener(LinphoneChatMessageListener linphoneChatMessageListener) {
        setListener(this.nativePtr, linphoneChatMessageListener);
    }

    public void store() {
        store(this.nativePtr);
    }
}
