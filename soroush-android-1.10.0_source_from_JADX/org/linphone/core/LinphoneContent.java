package org.linphone.core;

public interface LinphoneContent {
    byte[] getData();

    String getDataAsString();

    String getEncoding();

    int getExpectedSize();

    String getName();

    int getRealSize();

    String getSubtype();

    String getType();

    void setData(byte[] bArr);

    void setEncoding(String str);

    void setExpectedSize(int i);

    void setName(String str);

    void setStringData(String str);

    void setSubtype(String str);

    void setType(String str);
}
