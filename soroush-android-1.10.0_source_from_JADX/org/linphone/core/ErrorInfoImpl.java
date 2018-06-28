package org.linphone.core;

public class ErrorInfoImpl implements ErrorInfo {
    private int mCode;
    private String mDetails;
    private String mPhrase;
    private Reason mReason;

    public ErrorInfoImpl(long j) {
        this.mReason = Reason.fromInt(getReason(j));
        this.mCode = getProtocolCode(j);
        this.mPhrase = getPhrase(j);
        this.mDetails = getDetails(j);
    }

    private native String getDetails(long j);

    private native String getPhrase(long j);

    private native int getProtocolCode(long j);

    private native int getReason(long j);

    public String getDetails() {
        return this.mDetails;
    }

    public String getPhrase() {
        return this.mPhrase;
    }

    public int getProtocolCode() {
        return this.mCode;
    }

    public Reason getReason() {
        return this.mReason;
    }
}
