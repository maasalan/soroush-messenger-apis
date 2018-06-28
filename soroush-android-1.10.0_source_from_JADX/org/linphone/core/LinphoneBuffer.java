package org.linphone.core;

public interface LinphoneBuffer {
    byte[] getContent();

    int getSize();

    void setContent(byte[] bArr);

    void setSize(int i);
}
