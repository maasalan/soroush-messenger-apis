package org.jivesoftware.smackx.muc;

public interface AutoJoinFailedCallback {
    void autoJoinFailed(MultiUserChat multiUserChat, Exception exception);
}
