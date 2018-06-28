package org.linphone.core;

import org.linphone.core.LinphonePlayer.Listener;
import org.linphone.core.LinphonePlayer.State;

public class LinphonePlayerImpl implements LinphonePlayer {
    private long nativePtr = 0;

    LinphonePlayerImpl(long j) {
        this.nativePtr = j;
    }

    private native void close(long j);

    private native void destroy(long j);

    private native int getCurrentPosition(long j);

    private native int getDuration(long j);

    private native int getState(long j);

    private native int open(long j, String str, Listener listener);

    private native int pause(long j);

    private native int seek(long j, int i);

    private native int start(long j);

    public synchronized void close() {
        close(this.nativePtr);
    }

    protected void finalize() {
        destroy(this.nativePtr);
    }

    public synchronized int getCurrentPosition() {
        return getCurrentPosition(this.nativePtr);
    }

    public synchronized int getDuration() {
        return getDuration(this.nativePtr);
    }

    public synchronized State getState() {
        return State.fromValue(getState(this.nativePtr));
    }

    public synchronized int open(String str, Listener listener) {
        return open(this.nativePtr, str, listener);
    }

    public synchronized int pause() {
        return pause(this.nativePtr);
    }

    public synchronized int seek(int i) {
        return seek(this.nativePtr, i);
    }

    public synchronized int start() {
        return start(this.nativePtr);
    }
}
