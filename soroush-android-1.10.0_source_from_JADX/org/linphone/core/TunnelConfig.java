package org.linphone.core;

public interface TunnelConfig {
    int getDelay();

    String getHost();

    int getPort();

    int getRemoteUdpMirrorPort();

    void setDelay(int i);

    void setHost(String str);

    void setPort(int i);

    void setRemoteUdpMirrorPort(int i);
}
