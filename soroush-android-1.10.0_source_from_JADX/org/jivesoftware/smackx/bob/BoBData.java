package org.jivesoftware.smackx.bob;

import org.jivesoftware.smack.util.stringencoder.Base64;

public class BoBData {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private byte[] contentBinary;
    private String contentString;
    private final int maxAge;
    private final String type;

    public BoBData(String str, String str2) {
        this(str, str2, -1);
    }

    public BoBData(String str, String str2, int i) {
        this.type = str;
        this.contentString = str2;
        this.maxAge = i;
    }

    public BoBData(String str, byte[] bArr) {
        this(str, bArr, -1);
    }

    public BoBData(String str, byte[] bArr, int i) {
        this.type = str;
        this.contentBinary = bArr;
        this.maxAge = i;
    }

    private void setContentBinaryIfRequired() {
        if (this.contentBinary == null) {
            this.contentBinary = Base64.decode(this.contentString);
        }
    }

    public byte[] getContent() {
        setContentBinaryIfRequired();
        return (byte[]) this.contentBinary.clone();
    }

    public String getContentBase64Encoded() {
        if (this.contentString == null) {
            this.contentString = Base64.encodeToString(getContent());
        }
        return this.contentString;
    }

    public int getMaxAge() {
        return this.maxAge;
    }

    public String getType() {
        return this.type;
    }

    public boolean isOfReasonableSize() {
        setContentBinaryIfRequired();
        return this.contentBinary.length <= 8192;
    }
}
