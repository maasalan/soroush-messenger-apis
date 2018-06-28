package org.linphone.core.tutorials;

import java.nio.ByteBuffer;
import org.linphone.core.LinphoneAddress;
import org.linphone.core.LinphoneCall;
import org.linphone.core.LinphoneCall.State;
import org.linphone.core.LinphoneCallStats;
import org.linphone.core.LinphoneChatMessage;
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

public class TutorialHelloWorld implements LinphoneCoreListener {
    private TutorialNotifier TutorialNotifier;
    private boolean running;

    public TutorialHelloWorld() {
        this.TutorialNotifier = new TutorialNotifier();
    }

    public TutorialHelloWorld(TutorialNotifier tutorialNotifier) {
        this.TutorialNotifier = tutorialNotifier;
    }

    public static void main(String[] strArr) {
        if (strArr.length != 1) {
            throw new IllegalArgumentException("Bad number of arguments");
        }
        try {
            new TutorialHelloWorld().launchTutorial(strArr[1]);
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
        StringBuilder stringBuilder = new StringBuilder("State: ");
        stringBuilder.append(str);
        write(stringBuilder.toString());
        if (State.CallEnd.equals(state)) {
            this.running = false;
        }
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
    }

    public void launchTutorial(java.lang.String r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = org.linphone.core.LinphoneCoreFactory.instance();
        r1 = 0;
        r0 = r0.createLinphoneCore(r4, r1);
        r1 = r0.invite(r5);	 Catch:{ all -> 0x0071 }
        if (r1 != 0) goto L_0x0033;	 Catch:{ all -> 0x0071 }
    L_0x000f:
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0071 }
        r2 = "Could not place call to ";	 Catch:{ all -> 0x0071 }
        r1.<init>(r2);	 Catch:{ all -> 0x0071 }
        r1.append(r5);	 Catch:{ all -> 0x0071 }
        r5 = r1.toString();	 Catch:{ all -> 0x0071 }
        r4.write(r5);	 Catch:{ all -> 0x0071 }
        r5 = "Aborting";	 Catch:{ all -> 0x0071 }
    L_0x0022:
        r4.write(r5);	 Catch:{ all -> 0x0071 }
    L_0x0025:
        r5 = "Shutting down...";
        r4.write(r5);
        r0.destroy();
        r5 = "Exited";
        r4.write(r5);
        return;
    L_0x0033:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0071 }
        r3 = "Call to ";	 Catch:{ all -> 0x0071 }
        r2.<init>(r3);	 Catch:{ all -> 0x0071 }
        r2.append(r5);	 Catch:{ all -> 0x0071 }
        r5 = " is in progress...";	 Catch:{ all -> 0x0071 }
        r2.append(r5);	 Catch:{ all -> 0x0071 }
        r5 = r2.toString();	 Catch:{ all -> 0x0071 }
        r4.write(r5);	 Catch:{ all -> 0x0071 }
        r5 = 1;	 Catch:{ all -> 0x0071 }
        r4.running = r5;	 Catch:{ all -> 0x0071 }
    L_0x004c:
        r5 = r4.running;	 Catch:{ all -> 0x0071 }
        if (r5 == 0) goto L_0x005c;	 Catch:{ all -> 0x0071 }
    L_0x0050:
        r0.iterate();	 Catch:{ all -> 0x0071 }
        r2 = 50;
        java.lang.Thread.sleep(r2);	 Catch:{ InterruptedException -> 0x0059 }
        goto L_0x004c;
    L_0x0059:
        r5 = "Interrupted!\nAborting";	 Catch:{ all -> 0x0071 }
        goto L_0x0022;	 Catch:{ all -> 0x0071 }
    L_0x005c:
        r5 = org.linphone.core.LinphoneCall.State.CallEnd;	 Catch:{ all -> 0x0071 }
        r2 = r1.getState();	 Catch:{ all -> 0x0071 }
        r5 = r5.equals(r2);	 Catch:{ all -> 0x0071 }
        if (r5 != 0) goto L_0x0025;	 Catch:{ all -> 0x0071 }
    L_0x0068:
        r5 = "Terminating the call";	 Catch:{ all -> 0x0071 }
        r4.write(r5);	 Catch:{ all -> 0x0071 }
        r0.terminateCall(r1);	 Catch:{ all -> 0x0071 }
        goto L_0x0025;
    L_0x0071:
        r5 = move-exception;
        r1 = "Shutting down...";
        r4.write(r1);
        r0.destroy();
        r0 = "Exited";
        r4.write(r0);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.linphone.core.tutorials.TutorialHelloWorld.launchTutorial(java.lang.String):void");
    }

    public void messageReceived(LinphoneCore linphoneCore, LinphoneChatRoom linphoneChatRoom, LinphoneChatMessage linphoneChatMessage) {
    }

    public void newSubscriptionRequest(LinphoneCore linphoneCore, LinphoneFriend linphoneFriend, String str) {
    }

    public void notifyPresenceReceived(LinphoneCore linphoneCore, LinphoneFriend linphoneFriend) {
    }

    public void notifyReceived(LinphoneCore linphoneCore, LinphoneCall linphoneCall, LinphoneAddress linphoneAddress, byte[] bArr) {
    }

    public void notifyReceived(LinphoneCore linphoneCore, LinphoneEvent linphoneEvent, String str, LinphoneContent linphoneContent) {
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

    public void textReceived(LinphoneCore linphoneCore, LinphoneChatRoom linphoneChatRoom, LinphoneAddress linphoneAddress, String str) {
    }

    public void transferState(LinphoneCore linphoneCore, LinphoneCall linphoneCall, State state) {
    }

    public void uploadProgressIndication(LinphoneCore linphoneCore, int i, int i2) {
    }

    public void uploadStateChanged(LinphoneCore linphoneCore, LogCollectionUploadState logCollectionUploadState, String str) {
    }
}
