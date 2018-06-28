package org.linphone.core;

import org.linphone.core.LinphoneCore.MediaDirection;
import org.linphone.core.LinphoneCore.MediaEncryption;
import org.linphone.core.LinphoneCore.StreamType;

public interface LinphoneCallParams {
    void addCustomHeader(String str, String str2);

    void addCustomSdpAttribute(String str, String str2);

    void addCustomSdpMediaAttribute(StreamType streamType, String str, String str2);

    boolean audioMulticastEnabled();

    void clearCustomSdpAttributes();

    void clearCustomSdpMediaAttributes(StreamType streamType);

    void enableAudioMulticast(boolean z);

    void enableLowBandwidth(boolean z);

    void enableRealTimeText(boolean z);

    void enableVideoMulticast(boolean z);

    MediaDirection getAudioDirection();

    String getCustomHeader(String str);

    String getCustomSdpAttribute(String str);

    String getCustomSdpMediaAttribute(StreamType streamType, String str);

    MediaEncryption getMediaEncryption();

    int getPrivacy();

    VideoSize getReceivedVideoSize();

    VideoSize getSentVideoSize();

    String getSessionName();

    PayloadType getUsedAudioCodec();

    PayloadType getUsedVideoCodec();

    MediaDirection getVideoDirection();

    boolean getVideoEnabled();

    boolean isLowBandwidthEnabled();

    boolean realTimeTextEnabled();

    void setAudioBandwidth(int i);

    void setAudioDirection(MediaDirection mediaDirection);

    void setMediaEnctyption(MediaEncryption mediaEncryption);

    void setPrivacy(int i);

    void setRecordFile(String str);

    void setSessionName(String str);

    void setVideoDirection(MediaDirection mediaDirection);

    void setVideoEnabled(boolean z);

    boolean videoMulticastEnabled();
}
