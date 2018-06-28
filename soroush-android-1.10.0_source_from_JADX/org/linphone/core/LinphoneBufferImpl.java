package org.linphone.core;

public class LinphoneBufferImpl implements LinphoneBuffer {
    private byte[] mData;
    private int mSize;

    public LinphoneBufferImpl(byte[] bArr, int i) {
        this.mData = bArr;
        this.mSize = i;
    }

    public byte[] getContent() {
        return this.mData;
    }

    public int getSize() {
        return this.mSize;
    }

    public void setContent(byte[] bArr) {
        this.mData = bArr;
    }

    public void setSize(int i) {
        this.mSize = i;
    }
}
