package org.linphone.core;

public class LinphoneContentImpl implements LinphoneContent {
    private byte[] mData;
    private String mEncoding;
    private int mExpectedSize;
    private String mName;
    private String mSubtype;
    private String mType;

    public LinphoneContentImpl(String str, String str2, String str3, byte[] bArr, String str4, int i) {
        this.mType = str2;
        this.mSubtype = str3;
        this.mData = bArr;
        this.mEncoding = str4;
        this.mName = str;
        this.mExpectedSize = i;
    }

    public LinphoneContentImpl(String str, String str2, byte[] bArr, String str3) {
        this.mType = str;
        this.mSubtype = str2;
        this.mData = bArr;
        this.mEncoding = str3;
        this.mName = null;
        this.mExpectedSize = 0;
    }

    public byte[] getData() {
        return this.mData;
    }

    public String getDataAsString() {
        return this.mData != null ? new String(this.mData) : null;
    }

    public String getEncoding() {
        return this.mEncoding;
    }

    public int getExpectedSize() {
        return this.mExpectedSize;
    }

    public String getName() {
        return this.mName;
    }

    public int getRealSize() {
        return this.mData != null ? this.mData.length : 0;
    }

    public String getSubtype() {
        return this.mSubtype;
    }

    public String getType() {
        return this.mType;
    }

    public void setData(byte[] bArr) {
        this.mData = bArr;
    }

    public void setEncoding(String str) {
        this.mEncoding = str;
    }

    public void setExpectedSize(int i) {
        this.mExpectedSize = i;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setStringData(String str) {
        this.mData = str != null ? str.getBytes() : null;
    }

    public void setSubtype(String str) {
        this.mSubtype = str;
    }

    public void setType(String str) {
        this.mType = str;
    }
}
