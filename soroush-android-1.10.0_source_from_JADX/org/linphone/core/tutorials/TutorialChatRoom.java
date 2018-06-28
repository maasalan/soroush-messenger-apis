package org.linphone.core.tutorials;

import java.nio.ByteBuffer;
import org.linphone.core.LinphoneAddress;
import org.linphone.core.LinphoneCall;
import org.linphone.core.LinphoneCall.State;
import org.linphone.core.LinphoneCallStats;
import org.linphone.core.LinphoneChatMessage;
import org.linphone.core.LinphoneChatMessage.StateListener;
import org.linphone.core.LinphoneChatRoom;
import org.linphone.core.LinphoneContent;
import org.linphone.core.LinphoneCore;
import org.linphone.core.LinphoneCore.EcCalibratorStatus;
import org.linphone.core.LinphoneCore.GlobalState;
import org.linphone.core.LinphoneCore.LogCollectionUploadState;
import org.linphone.core.LinphoneCore.RegistrationState;
import org.linphone.core.LinphoneCore.RemoteProvisioningState;
import org.linphone.core.LinphoneCoreListener;
import org.linphone.core.LinphoneEvent;
import org.linphone.core.LinphoneFriend;
import org.linphone.core.LinphoneInfoMessage;
import org.linphone.core.LinphoneProxyConfig;
import org.linphone.core.PublishState;
import org.linphone.core.SubscriptionState;

public class TutorialChatRoom implements StateListener, LinphoneCoreListener {
    private TutorialNotifier TutorialNotifier;
    private boolean running;

    public TutorialChatRoom() {
        this.TutorialNotifier = new TutorialNotifier();
    }

    public TutorialChatRoom(TutorialNotifier tutorialNotifier) {
        this.TutorialNotifier = tutorialNotifier;
    }

    public static void main(String[] strArr) {
        if (strArr.length != 1) {
            throw new IllegalArgumentException("Bad number of arguments");
        }
        try {
            new TutorialChatRoom().launchTutorial(strArr[1]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void write(String str) {
        this.TutorialNotifier.notify(str);
    }

    public void authInfoRequested(LinphoneCore linphoneCore, String str, String str2, String str3) {
    }

    public void byeReceived(LinphoneCore linphoneCore, String str) {
    }

    public void callEncryptionChanged(LinphoneCore linphoneCore, LinphoneCall linphoneCall, boolean z, String str) {
    }

    public void callState(LinphoneCore linphoneCore, LinphoneCall linphoneCall, State state, String str) {
    }

    public void callStatsUpdated(LinphoneCore linphoneCore, LinphoneCall linphoneCall, LinphoneCallStats linphoneCallStats) {
    }

    public void configuringStatus(LinphoneCore linphoneCore, RemoteProvisioningState remoteProvisioningState, String str) {
    }

    public void displayMessage(LinphoneCore linphoneCore, String str) {
    }

    public void displayStatus(LinphoneCore linphoneCore, String str) {
    }

    public void displayWarning(LinphoneCore linphoneCore, String str) {
    }

    public void dtmfReceived(LinphoneCore linphoneCore, LinphoneCall linphoneCall, int i) {
    }

    public void ecCalibrationStatus(LinphoneCore linphoneCore, EcCalibratorStatus ecCalibratorStatus, int i, Object obj) {
    }

    public void fileTransferProgressIndication(LinphoneCore linphoneCore, LinphoneChatMessage linphoneChatMessage, LinphoneContent linphoneContent, int i) {
    }

    public void fileTransferRecv(LinphoneCore linphoneCore, LinphoneChatMessage linphoneChatMessage, LinphoneContent linphoneContent, byte[] bArr, int i) {
    }

    public int fileTransferSend(LinphoneCore linphoneCore, LinphoneChatMessage linphoneChatMessage, LinphoneContent linphoneContent, ByteBuffer byteBuffer, int i) {
        return 0;
    }

    public void globalState(LinphoneCore linphoneCore, GlobalState globalState, String str) {
    }

    public void infoReceived(LinphoneCore linphoneCore, LinphoneCall linphoneCall, LinphoneInfoMessage linphoneInfoMessage) {
    }

    public void isComposingReceived(LinphoneCore linphoneCore, LinphoneChatRoom linphoneChatRoom) {
        write(linphoneChatRoom.isRemoteComposing() ? "Remote is writing a message" : "Remote has stop writing");
    }

    public void launchTutorial(java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = org.linphone.core.LinphoneCoreFactory.instance();
        r1 = 0;
        r0 = r0.createLinphoneCore(r3, r1);
        r4 = r0.getOrCreateChatRoom(r4);	 Catch:{ all -> 0x0039 }
        r1 = "Hello world";	 Catch:{ all -> 0x0039 }
        r1 = r4.createLinphoneChatMessage(r1);	 Catch:{ all -> 0x0039 }
        r4.sendMessage(r1, r3);	 Catch:{ all -> 0x0039 }
        r4 = 1;	 Catch:{ all -> 0x0039 }
        r3.running = r4;	 Catch:{ all -> 0x0039 }
    L_0x0019:
        r4 = r3.running;	 Catch:{ all -> 0x0039 }
        if (r4 == 0) goto L_0x002b;	 Catch:{ all -> 0x0039 }
    L_0x001d:
        r0.iterate();	 Catch:{ all -> 0x0039 }
        r1 = 50;
        java.lang.Thread.sleep(r1);	 Catch:{ InterruptedException -> 0x0026 }
        goto L_0x0019;
    L_0x0026:
        r4 = "Interrupted!\nAborting";	 Catch:{ all -> 0x0039 }
        r3.write(r4);	 Catch:{ all -> 0x0039 }
    L_0x002b:
        r4 = "Shutting down...";
        r3.write(r4);
        r0.destroy();
        r4 = "Exited";
        r3.write(r4);
        return;
    L_0x0039:
        r4 = move-exception;
        r1 = "Shutting down...";
        r3.write(r1);
        r0.destroy();
        r0 = "Exited";
        r3.write(r0);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.linphone.core.tutorials.TutorialChatRoom.launchTutorial(java.lang.String):void");
    }

    public void messageReceived(LinphoneCore linphoneCore, LinphoneChatRoom linphoneChatRoom, LinphoneChatMessage linphoneChatMessage) {
        StringBuilder stringBuilder = new StringBuilder("Message [");
        stringBuilder.append(linphoneChatMessage.getText());
        stringBuilder.append("] received from [");
        stringBuilder.append(linphoneChatMessage.getFrom().asString());
        stringBuilder.append("]");
        write(stringBuilder.toString());
    }

    public void newSubscriptionRequest(LinphoneCore linphoneCore, LinphoneFriend linphoneFriend, String str) {
    }

    public void notifyPresenceReceived(LinphoneCore linphoneCore, LinphoneFriend linphoneFriend) {
    }

    public void notifyReceived(LinphoneCore linphoneCore, LinphoneCall linphoneCall, LinphoneAddress linphoneAddress, byte[] bArr) {
    }

    public void notifyReceived(LinphoneCore linphoneCore, LinphoneEvent linphoneEvent, String str, LinphoneContent linphoneContent) {
    }

    public void onLinphoneChatMessageStateChanged(LinphoneChatMessage linphoneChatMessage, LinphoneChatMessage.State state) {
        StringBuilder stringBuilder = new StringBuilder("Sent message [");
        stringBuilder.append(linphoneChatMessage.getText());
        stringBuilder.append("] new state is ");
        stringBuilder.append(state.toString());
        write(stringBuilder.toString());
    }

    public void publishStateChanged(LinphoneCore linphoneCore, LinphoneEvent linphoneEvent, PublishState publishState) {
    }

    public void registrationState(LinphoneCore linphoneCore, LinphoneProxyConfig linphoneProxyConfig, RegistrationState registrationState, String str) {
    }

    public void show(LinphoneCore linphoneCore) {
    }

    public void stopMainLoop() {
        this.running = false;
    }

    public void subscriptionStateChanged(LinphoneCore linphoneCore, LinphoneEvent linphoneEvent, SubscriptionState subscriptionState) {
    }

    public void transferState(LinphoneCore linphoneCore, LinphoneCall linphoneCall, State state) {
    }

    public void uploadProgressIndication(LinphoneCore linphoneCore, int i, int i2) {
    }

    public void uploadStateChanged(LinphoneCore linphoneCore, LogCollectionUploadState logCollectionUploadState, String str) {
    }
}
