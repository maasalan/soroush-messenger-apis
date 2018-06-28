package org.linphone.core;

public interface ErrorInfo {
    String getDetails();

    String getPhrase();

    int getProtocolCode();

    Reason getReason();
}
