package org.linphone.core;

public class LinphoneConferenceParamsImpl implements LinphoneConferenceParams {
    private long nativePtr = 0;

    public LinphoneConferenceParamsImpl(LinphoneConferenceParamsImpl linphoneConferenceParamsImpl) {
        this.nativePtr = copyInstance(linphoneConferenceParamsImpl.nativePtr);
    }

    public LinphoneConferenceParamsImpl(LinphoneCore linphoneCore) {
        this.nativePtr = createInstance((LinphoneCoreImpl) linphoneCore);
    }

    private native long copyInstance(long j);

    private native long createInstance(LinphoneCoreImpl linphoneCoreImpl);

    private native void destroyInstance(long j);

    private native void enableVideo(long j, boolean z);

    private native boolean isVideoRequested(long j);

    public void enableVideo(boolean z) {
        enableVideo(this.nativePtr, z);
    }

    public void finalize() {
        destroyInstance(this.nativePtr);
    }

    public boolean isVideoRequested() {
        return isVideoRequested(this.nativePtr);
    }
}
