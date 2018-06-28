package org.linphone.core;

import org.linphone.core.LinphoneAddress.TransportType;

public class LinphoneAddressImpl implements LinphoneAddress {
    protected final long nativePtr;

    public enum WrapMode {
        FromNew,
        FromConst,
        FromExisting
    }

    private LinphoneAddressImpl(long j) {
        this(j, WrapMode.FromConst);
    }

    protected LinphoneAddressImpl(long j, WrapMode wrapMode) {
        switch (wrapMode) {
            case FromNew:
                this.nativePtr = j;
                return;
            case FromConst:
                j = clone(j);
                break;
            case FromExisting:
                j = ref(j);
                break;
            default:
                j = 0;
                break;
        }
        this.nativePtr = j;
    }

    protected LinphoneAddressImpl(String str) {
        this.nativePtr = newLinphoneAddressImpl(str, null);
        if (this.nativePtr == 0) {
            StringBuilder stringBuilder = new StringBuilder("Cannot create LinphoneAdress from [");
            stringBuilder.append(str);
            stringBuilder.append("]");
            throw new LinphoneCoreException(stringBuilder.toString());
        }
    }

    protected LinphoneAddressImpl(String str, String str2, String str3) {
        this.nativePtr = newLinphoneAddressImpl(null, str3);
        setUserName(str);
        setDomain(str2);
    }

    private native long clone(long j);

    private native String getDisplayName(long j);

    private native String getDomain(long j);

    private native int getPort(long j);

    private native int getTransport(long j);

    private native String getUserName(long j);

    private native long newLinphoneAddressImpl(String str, String str2);

    private native long ref(long j);

    private native void setDisplayName(long j, String str);

    private native void setDomain(long j, String str);

    private native void setPort(long j, int i);

    private native void setTransport(long j, int i);

    private native void setUserName(long j, String str);

    private native String toString(long j);

    private native String toUri(long j);

    private native void unref(long j);

    public String asString() {
        return toString();
    }

    public String asStringUriOnly() {
        return toUri(this.nativePtr);
    }

    public void clean() {
        throw new RuntimeException("Not implemented");
    }

    protected void finalize() {
        if (this.nativePtr != 0) {
            unref(this.nativePtr);
        }
    }

    public String getDisplayName() {
        return getDisplayName(this.nativePtr);
    }

    public String getDomain() {
        return getDomain(this.nativePtr);
    }

    public int getPort() {
        return getPort(this.nativePtr);
    }

    public TransportType getTransport() {
        return TransportType.fromInt(getTransport(this.nativePtr));
    }

    public String getUserName() {
        return getUserName(this.nativePtr);
    }

    public void setDisplayName(String str) {
        setDisplayName(this.nativePtr, str);
    }

    public void setDomain(String str) {
        setDomain(this.nativePtr, str);
    }

    public void setPort(int i) {
        setPort(this.nativePtr, i);
    }

    public void setTransport(TransportType transportType) {
        setTransport(this.nativePtr, transportType.toInt());
    }

    public void setUserName(String str) {
        setUserName(this.nativePtr, str);
    }

    public String toString() {
        return toString(this.nativePtr);
    }

    public String toUri() {
        return toUri(this.nativePtr);
    }
}
