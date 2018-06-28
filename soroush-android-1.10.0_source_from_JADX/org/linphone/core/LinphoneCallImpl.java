package org.linphone.core;

import org.linphone.core.LinphoneAddressImpl.WrapMode;
import org.linphone.core.LinphoneCall.LinphoneCallListener;
import org.linphone.core.LinphoneCall.State;

class LinphoneCallImpl implements LinphoneCall {
    private LinphoneCallStats audioStats;
    protected final long nativePtr;
    boolean ownPtr = false;
    Object userData;
    private LinphoneCallStats videoStats;

    private LinphoneCallImpl(long j) {
        this.nativePtr = j;
    }

    private native boolean cameraEnabled(long j);

    private native void enableCamera(long j, boolean z);

    private native void enableEchoCancellation(long j, boolean z);

    private native void enableEchoLimiter(long j, boolean z);

    private native void finalize(long j);

    private native String getAuthenticationToken(long j);

    private native float getAverageQuality(long j);

    private native long getCallLog(long j);

    private native long getChatRoom(long j);

    private native long getCurrentParamsCopy(long j);

    private native float getCurrentQuality(long j);

    private native int getDuration(long j);

    private native long getErrorInfo(long j);

    private native float getPlayVolume(long j);

    private native long getPlayer(long j);

    private native long getRemoteAddress(long j);

    private native String getRemoteContact(long j);

    private native long getRemoteParams(long j);

    private native String getRemoteUserAgent(long j);

    private native Object getReplacedCall(long j);

    private native int getState(long j);

    private native int getTransferState(long j);

    private native Object getTransferTargetCall(long j);

    private native Object getTransfererCall(long j);

    private native boolean isAuthenticationTokenVerified(long j);

    private native boolean isEchoCancellationEnabled(long j);

    private native boolean isEchoLimiterEnabled(long j);

    private native boolean isIncoming(long j);

    private native boolean mediaInProgress(long j);

    private native int sendInfoMessage(long j, long j2);

    private native void setAuthenticationTokenVerified(long j, boolean z);

    private native void setListener(long j, LinphoneCallListener linphoneCallListener);

    private native void startRecording(long j);

    private native void stopRecording(long j);

    private native void takeSnapshot(long j, String str);

    private native void zoomVideo(long j, float f, float f2, float f3);

    public boolean cameraEnabled() {
        return cameraEnabled(this.nativePtr);
    }

    public void enableCamera(boolean z) {
        enableCamera(this.nativePtr, z);
    }

    public void enableEchoCancellation(boolean z) {
        enableEchoCancellation(this.nativePtr, z);
    }

    public void enableEchoLimiter(boolean z) {
        enableEchoLimiter(this.nativePtr, z);
    }

    public boolean equals(Object obj) {
        return this == obj ? true : obj != null && (obj instanceof LinphoneCallImpl) && this.nativePtr == ((LinphoneCallImpl) obj).nativePtr;
    }

    protected void finalize() {
        finalize(this.nativePtr);
    }

    public LinphoneCallStats getAudioStats() {
        if (this.audioStats != null) {
            ((LinphoneCallStatsImpl) this.audioStats).updateRealTimeStats(this);
        }
        return this.audioStats;
    }

    public String getAuthenticationToken() {
        return getAuthenticationToken(this.nativePtr);
    }

    public float getAverageQuality() {
        return getAverageQuality(this.nativePtr);
    }

    public LinphoneCallLog getCallLog() {
        long callLog = getCallLog(this.nativePtr);
        return callLog != 0 ? new LinphoneCallLogImpl(callLog) : null;
    }

    public LinphoneChatRoom getChatRoom() {
        return new LinphoneChatRoomImpl(getChatRoom(this.nativePtr));
    }

    public LinphoneConference getConference() {
        return getConference(this.nativePtr);
    }

    public native LinphoneConference getConference(long j);

    public LinphoneCallParams getCurrentParamsCopy() {
        return new LinphoneCallParamsImpl(getCurrentParamsCopy(this.nativePtr));
    }

    public float getCurrentQuality() {
        return getCurrentQuality(this.nativePtr);
    }

    public CallDirection getDirection() {
        return isIncoming(this.nativePtr) ? CallDirection.Incoming : CallDirection.Outgoing;
    }

    public int getDuration() {
        return getDuration(this.nativePtr);
    }

    public ErrorInfo getErrorInfo() {
        return new ErrorInfoImpl(getErrorInfo(this.nativePtr));
    }

    public float getPlayVolume() {
        return getPlayVolume(this.nativePtr);
    }

    public LinphonePlayer getPlayer() {
        return new LinphonePlayerImpl(getPlayer(this.nativePtr));
    }

    public Reason getReason() {
        return null;
    }

    public LinphoneAddress getRemoteAddress() {
        long remoteAddress = getRemoteAddress(this.nativePtr);
        return remoteAddress != 0 ? new LinphoneAddressImpl(remoteAddress, WrapMode.FromConst) : null;
    }

    public String getRemoteContact() {
        return getRemoteContact(this.nativePtr);
    }

    public LinphoneCallParams getRemoteParams() {
        long remoteParams = getRemoteParams(this.nativePtr);
        return remoteParams == 0 ? null : new LinphoneCallParamsImpl(remoteParams);
    }

    public String getRemoteUserAgent() {
        return getRemoteUserAgent(this.nativePtr);
    }

    public LinphoneCall getReplacedCall() {
        return (LinphoneCall) getReplacedCall(this.nativePtr);
    }

    public State getState() {
        return State.fromInt(getState(this.nativePtr));
    }

    public State getTransferState() {
        return State.fromInt(getTransferState(this.nativePtr));
    }

    public LinphoneCall getTransferTargetCall() {
        return (LinphoneCall) getTransferTargetCall(this.nativePtr);
    }

    public LinphoneCall getTransfererCall() {
        return (LinphoneCall) getTransfererCall(this.nativePtr);
    }

    public Object getUserData() {
        return this.userData;
    }

    public LinphoneCallStats getVideoStats() {
        if (this.videoStats != null) {
            ((LinphoneCallStatsImpl) this.videoStats).updateRealTimeStats(this);
        }
        return this.videoStats;
    }

    public int hashCode() {
        return 527 + ((int) (this.nativePtr ^ (this.nativePtr >>> 32)));
    }

    public boolean isAuthenticationTokenVerified() {
        return isAuthenticationTokenVerified(this.nativePtr);
    }

    public boolean isEchoCancellationEnabled() {
        return isEchoCancellationEnabled(this.nativePtr);
    }

    public boolean isEchoLimiterEnabled() {
        return isEchoLimiterEnabled(this.nativePtr);
    }

    public boolean isInConference() {
        return getConference() != null;
    }

    public boolean mediaInProgress() {
        return mediaInProgress(this.nativePtr);
    }

    public void sendInfoMessage(LinphoneInfoMessage linphoneInfoMessage) {
        sendInfoMessage(this.nativePtr, ((LinphoneInfoMessageImpl) linphoneInfoMessage).nativePtr);
    }

    public void setAudioStats(LinphoneCallStats linphoneCallStats) {
        this.audioStats = linphoneCallStats;
    }

    public void setAuthenticationTokenVerified(boolean z) {
        setAuthenticationTokenVerified(this.nativePtr, z);
    }

    public void setListener(LinphoneCallListener linphoneCallListener) {
        setListener(this.nativePtr, linphoneCallListener);
    }

    public void setUserData(Object obj) {
        this.userData = obj;
    }

    public void setVideoStats(LinphoneCallStats linphoneCallStats) {
        this.videoStats = linphoneCallStats;
    }

    public void startRecording() {
        startRecording(this.nativePtr);
    }

    public void stopRecording() {
        stopRecording(this.nativePtr);
    }

    public void takeSnapshot(String str) {
        takeSnapshot(this.nativePtr, str);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Call ");
        stringBuilder.append(this.nativePtr);
        return stringBuilder.toString();
    }

    public void zoomVideo(float f, float f2, float f3) {
        zoomVideo(this.nativePtr, f, f2, f3);
    }
}
