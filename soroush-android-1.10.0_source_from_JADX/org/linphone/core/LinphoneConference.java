package org.linphone.core;

public interface LinphoneConference {
    LinphoneAddress[] getParticipants();

    int removeParticipant(LinphoneAddress linphoneAddress);
}
