package org.linphone.core;

import java.nio.ByteBuffer;
import org.linphone.core.LinphoneCall.State;
import org.linphone.core.LinphoneCore.EcCalibratorStatus;
import org.linphone.core.LinphoneCore.GlobalState;
import org.linphone.core.LinphoneCore.LogCollectionUploadState;
import org.linphone.core.LinphoneCore.RegistrationState;
import org.linphone.core.LinphoneCore.RemoteProvisioningState;

public interface LinphoneCoreListener {
    void authInfoRequested(LinphoneCore linphoneCore, String str, String str2, String str3);

    void callEncryptionChanged(LinphoneCore linphoneCore, LinphoneCall linphoneCall, boolean z, String str);

    void callState(LinphoneCore linphoneCore, LinphoneCall linphoneCall, State state, String str);

    void callStatsUpdated(LinphoneCore linphoneCore, LinphoneCall linphoneCall, LinphoneCallStats linphoneCallStats);

    void configuringStatus(LinphoneCore linphoneCore, RemoteProvisioningState remoteProvisioningState, String str);

    void displayMessage(LinphoneCore linphoneCore, String str);

    void displayStatus(LinphoneCore linphoneCore, String str);

    void displayWarning(LinphoneCore linphoneCore, String str);

    void dtmfReceived(LinphoneCore linphoneCore, LinphoneCall linphoneCall, int i);

    void ecCalibrationStatus(LinphoneCore linphoneCore, EcCalibratorStatus ecCalibratorStatus, int i, Object obj);

    void fileTransferProgressIndication(LinphoneCore linphoneCore, LinphoneChatMessage linphoneChatMessage, LinphoneContent linphoneContent, int i);

    void fileTransferRecv(LinphoneCore linphoneCore, LinphoneChatMessage linphoneChatMessage, LinphoneContent linphoneContent, byte[] bArr, int i);

    int fileTransferSend(LinphoneCore linphoneCore, LinphoneChatMessage linphoneChatMessage, LinphoneContent linphoneContent, ByteBuffer byteBuffer, int i);

    void globalState(LinphoneCore linphoneCore, GlobalState globalState, String str);

    void infoReceived(LinphoneCore linphoneCore, LinphoneCall linphoneCall, LinphoneInfoMessage linphoneInfoMessage);

    void isComposingReceived(LinphoneCore linphoneCore, LinphoneChatRoom linphoneChatRoom);

    void messageReceived(LinphoneCore linphoneCore, LinphoneChatRoom linphoneChatRoom, LinphoneChatMessage linphoneChatMessage);

    void newSubscriptionRequest(LinphoneCore linphoneCore, LinphoneFriend linphoneFriend, String str);

    void notifyPresenceReceived(LinphoneCore linphoneCore, LinphoneFriend linphoneFriend);

    void notifyReceived(LinphoneCore linphoneCore, LinphoneCall linphoneCall, LinphoneAddress linphoneAddress, byte[] bArr);

    void notifyReceived(LinphoneCore linphoneCore, LinphoneEvent linphoneEvent, String str, LinphoneContent linphoneContent);

    void publishStateChanged(LinphoneCore linphoneCore, LinphoneEvent linphoneEvent, PublishState publishState);

    void registrationState(LinphoneCore linphoneCore, LinphoneProxyConfig linphoneProxyConfig, RegistrationState registrationState, String str);

    void show(LinphoneCore linphoneCore);

    void subscriptionStateChanged(LinphoneCore linphoneCore, LinphoneEvent linphoneEvent, SubscriptionState subscriptionState);

    void transferState(LinphoneCore linphoneCore, LinphoneCall linphoneCall, State state);

    void uploadProgressIndication(LinphoneCore linphoneCore, int i, int i2);

    void uploadStateChanged(LinphoneCore linphoneCore, LogCollectionUploadState logCollectionUploadState, String str);
}
