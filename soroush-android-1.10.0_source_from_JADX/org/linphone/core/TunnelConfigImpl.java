package org.linphone.core;

public class TunnelConfigImpl implements TunnelConfig {
    long mNativePtr;

    protected TunnelConfigImpl(long j) {
        this.mNativePtr = j;
    }

    private native void destroy(long j);

    private native void enableSip(long j, boolean z);

    private native int getDelay(long j);

    private native String getHost(long j);

    private native int getPort(long j);

    private native int getRemoteUdpMirrorPort(long j);

    private native void setDelay(long j, int i);

    private native void setHost(long j, String str);

    private native void setPort(long j, int i);

    private native void setRemoteUdpMirrorPort(long j, int i);

    protected void finalize() {
        if (this.mNativePtr != 0) {
            destroy(this.mNativePtr);
        }
    }

    public int getDelay() {
        return getDelay(this.mNativePtr);
    }

    public String getHost() {
        return getHost(this.mNativePtr);
    }

    public int getPort() {
        return getPort(this.mNativePtr);
    }

    public int getRemoteUdpMirrorPort() {
        return getRemoteUdpMirrorPort(this.mNativePtr);
    }

    public void setDelay(int i) {
        setDelay(this.mNativePtr, i);
    }

    public void setHost(String str) {
        setHost(this.mNativePtr, str);
    }

    public void setPort(int i) {
        setPort(this.mNativePtr, i);
    }

    public void setRemoteUdpMirrorPort(int i) {
        setRemoteUdpMirrorPort(this.mNativePtr, i);
    }
}
