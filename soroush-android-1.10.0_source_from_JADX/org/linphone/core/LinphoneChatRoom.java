package org.linphone.core;

import org.linphone.core.LinphoneChatMessage.State;
import org.linphone.core.LinphoneChatMessage.StateListener;

public interface LinphoneChatRoom {
    void compose();

    LinphoneChatMessage createFileTransferMessage(LinphoneContent linphoneContent);

    LinphoneChatMessage createLinphoneChatMessage(String str);

    LinphoneChatMessage createLinphoneChatMessage(String str, String str2, State state, long j, boolean z, boolean z2);

    void deleteHistory();

    void deleteMessage(LinphoneChatMessage linphoneChatMessage);

    LinphoneCall getCall();

    long getChar();

    LinphoneCore getCore();

    LinphoneChatMessage[] getHistory();

    LinphoneChatMessage[] getHistory(int i);

    LinphoneChatMessage[] getHistoryRange(int i, int i2);

    int getHistorySize();

    LinphoneAddress getPeerAddress();

    int getUnreadMessagesCount();

    boolean isRemoteComposing();

    void markAsRead();

    void sendChatMessage(LinphoneChatMessage linphoneChatMessage);

    void sendMessage(String str);

    @Deprecated
    void sendMessage(LinphoneChatMessage linphoneChatMessage, StateListener stateListener);
}
