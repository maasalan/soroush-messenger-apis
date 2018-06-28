package org.linphone.core;

import org.linphone.core.LinphoneCore.MediaDirection;
import org.linphone.core.LinphoneCore.MediaEncryption;
import org.linphone.core.LinphoneCore.StreamType;

public class LinphoneCallParamsImpl implements LinphoneCallParams {
    protected final long nativePtr;

    public LinphoneCallParamsImpl(long j) {
        this.nativePtr = j;
    }

    private native void addCustomHeader(long j, String str, String str2);

    private native void addCustomSdpAttribute(long j, String str, String str2);

    private native void addCustomSdpMediaAttribute(long j, int i, String str, String str2);

    private native void audioBandwidth(long j, int i);

    private native boolean audioMulticastEnabled(long j);

    private native void clearCustomSdpAttributes(long j);

    private native void clearCustomSdpMediaAttributes(long j, int i);

    private native void destroy(long j);

    private native void enableAudioMulticast(long j, boolean z);

    private native void enableLowBandwidth(long j, boolean z);

    private native void enableRealTimeText(long j, boolean z);

    private native void enableVideo(long j, boolean z);

    private native void enableVideoMulticast(long j, boolean z);

    private native int getAudioDirection(long j);

    private native String getCustomHeader(long j, String str);

    private native String getCustomSdpAttribute(long j, String str);

    private native String getCustomSdpMediaAttribute(long j, int i, String str);

    private native int getMediaEncryption(long j);

    private native int getPrivacy(long j);

    private native int[] getReceivedVideoSize(long j);

    private native int[] getSentVideoSize(long j);

    private native String getSessionName(long j);

    private native long getUsedAudioCodec(long j);

    private native long getUsedVideoCodec(long j);

    private native int getVideoDirection(long j);

    private native boolean getVideoEnabled(long j);

    private native boolean isLowBandwidthEnabled(long j);

    private native boolean localConferenceMode(long j);

    private native boolean realTimeTextEnabled(long j);

    private native void setAudioDirection(long j, int i);

    private native void setMediaEncryption(long j, int i);

    private native void setPrivacy(long j, int i);

    private native void setRecordFile(long j, String str);

    private native void setSessionName(long j, String str);

    private native void setVideoDirection(long j, int i);

    private native boolean videoMulticastEnabled(long j);

    public void addCustomHeader(String str, String str2) {
        addCustomHeader(this.nativePtr, str, str2);
    }

    public void addCustomSdpAttribute(String str, String str2) {
        addCustomSdpAttribute(this.nativePtr, str, str2);
    }

    public void addCustomSdpMediaAttribute(StreamType streamType, String str, String str2) {
        addCustomSdpMediaAttribute(this.nativePtr, streamType.mValue, str, str2);
    }

    public boolean audioMulticastEnabled() {
        return audioMulticastEnabled(this.nativePtr);
    }

    public void clearCustomSdpAttributes() {
        clearCustomSdpAttributes(this.nativePtr);
    }

    public void clearCustomSdpMediaAttributes(StreamType streamType) {
        clearCustomSdpMediaAttributes(this.nativePtr, streamType.mValue);
    }

    public void enableAudioMulticast(boolean z) {
        enableAudioMulticast(this.nativePtr, z);
    }

    public void enableLowBandwidth(boolean z) {
        enableLowBandwidth(this.nativePtr, z);
    }

    public void enableRealTimeText(boolean z) {
        enableRealTimeText(this.nativePtr, z);
    }

    public void enableVideoMulticast(boolean z) {
        enableVideoMulticast(this.nativePtr, z);
    }

    protected void finalize() {
        destroy(this.nativePtr);
        super.finalize();
    }

    public MediaDirection getAudioDirection() {
        return MediaDirection.fromInt(getAudioDirection(this.nativePtr));
    }

    public String getCustomHeader(String str) {
        return getCustomHeader(this.nativePtr, str);
    }

    public String getCustomSdpAttribute(String str) {
        return getCustomSdpAttribute(this.nativePtr, str);
    }

    public String getCustomSdpMediaAttribute(StreamType streamType, String str) {
        return getCustomSdpMediaAttribute(this.nativePtr, streamType.mValue, str);
    }

    public MediaEncryption getMediaEncryption() {
        return MediaEncryption.fromInt(getMediaEncryption(this.nativePtr));
    }

    public int getPrivacy() {
        return getPrivacy(this.nativePtr);
    }

    public VideoSize getReceivedVideoSize() {
        int[] receivedVideoSize = getReceivedVideoSize(this.nativePtr);
        VideoSize videoSize = new VideoSize();
        videoSize.width = receivedVideoSize[0];
        videoSize.height = receivedVideoSize[1];
        return videoSize;
    }

    public VideoSize getSentVideoSize() {
        int[] sentVideoSize = getSentVideoSize(this.nativePtr);
        VideoSize videoSize = new VideoSize();
        videoSize.width = sentVideoSize[0];
        videoSize.height = sentVideoSize[1];
        return videoSize;
    }

    public String getSessionName() {
        return getSessionName(this.nativePtr);
    }

    public PayloadType getUsedAudioCodec() {
        long usedAudioCodec = getUsedAudioCodec(this.nativePtr);
        return usedAudioCodec == 0 ? null : new PayloadTypeImpl(usedAudioCodec);
    }

    public PayloadType getUsedVideoCodec() {
        long usedVideoCodec = getUsedVideoCodec(this.nativePtr);
        return usedVideoCodec == 0 ? null : new PayloadTypeImpl(usedVideoCodec);
    }

    public MediaDirection getVideoDirection() {
        return MediaDirection.fromInt(getVideoDirection(this.nativePtr));
    }

    public boolean getVideoEnabled() {
        return getVideoEnabled(this.nativePtr);
    }

    public boolean isLowBandwidthEnabled() {
        return isLowBandwidthEnabled(this.nativePtr);
    }

    public boolean localConferenceMode() {
        return localConferenceMode(this.nativePtr);
    }

    public boolean realTimeTextEnabled() {
        return realTimeTextEnabled(this.nativePtr);
    }

    public void setAudioBandwidth(int i) {
        audioBandwidth(this.nativePtr, i);
    }

    public void setAudioDirection(MediaDirection mediaDirection) {
        setAudioDirection(this.nativePtr, mediaDirection.mValue);
    }

    public void setMediaEnctyption(MediaEncryption mediaEncryption) {
        setMediaEncryption(this.nativePtr, mediaEncryption.mValue);
    }

    public void setPrivacy(int i) {
        setPrivacy(this.nativePtr, i);
    }

    public void setRecordFile(String str) {
        setRecordFile(this.nativePtr, str);
    }

    public void setSessionName(String str) {
        setSessionName(this.nativePtr, str);
    }

    public void setVideoDirection(MediaDirection mediaDirection) {
        setVideoDirection(this.nativePtr, mediaDirection.mValue);
    }

    public void setVideoEnabled(boolean z) {
        enableVideo(this.nativePtr, z);
    }

    public boolean videoMulticastEnabled() {
        return videoMulticastEnabled(this.nativePtr);
    }
}
