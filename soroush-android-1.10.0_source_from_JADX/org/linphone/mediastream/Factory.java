package org.linphone.mediastream;

public class Factory {
    private long mNativePtr;

    private Factory(long j) {
        this.mNativePtr = j;
    }

    private native void enableFilterFromName(long j, String str, boolean z);

    private native boolean filterFromNameEnabled(long j, String str);

    public void enableFilterFromName(String str, boolean z) {
        enableFilterFromName(this.mNativePtr, str, z);
    }

    public boolean filterFromNameEnabled(String str) {
        return filterFromNameEnabled(this.mNativePtr, str);
    }
}
