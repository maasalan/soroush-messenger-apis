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

public class TutorialBuddyStatus implements LinphoneCoreListener {
    private TutorialNotifier TutorialNotifier;
    private boolean running;

    public TutorialBuddyStatus() {
        this.TutorialNotifier = new TutorialNotifier();
    }

    public TutorialBuddyStatus(TutorialNotifier tutorialNotifier) {
        this.TutorialNotifier = tutorialNotifier;
    }

    public static void main(String[] strArr) {
        if (strArr.length > 0) {
            if (strArr.length <= 3) {
                TutorialBuddyStatus tutorialBuddyStatus = new TutorialBuddyStatus();
                try {
                    String str = strArr[1];
                    String str2 = null;
                    String str3 = strArr.length > 1 ? strArr[1] : null;
                    if (strArr.length > 2) {
                        str2 = strArr[2];
                    }
                    tutorialBuddyStatus.launchTutorial(str, str3, str2);
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder("Bad number of arguments [");
        stringBuilder.append(strArr.length);
        stringBuilder.append("] should be 1, 2 or 3");
        throw new IllegalArgumentException(stringBuilder.toString());
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
    }

    public void launchTutorial(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r0 = org.linphone.core.LinphoneCoreFactory.instance();
        r1 = 0;
        r2 = r0.createLinphoneCore(r6, r1);
        r7 = r0.createLinphoneFriend(r7);	 Catch:{ all -> 0x00ae }
        if (r7 != 0) goto L_0x0022;	 Catch:{ all -> 0x00ae }
    L_0x000f:
        r7 = "Could not create friend; weird SIP address?";	 Catch:{ all -> 0x00ae }
    L_0x0011:
        r6.write(r7);	 Catch:{ all -> 0x00ae }
    L_0x0014:
        r7 = "Shutting down...";
        r6.write(r7);
        r2.destroy();
        r7 = "Exited";
        r6.write(r7);
        return;
    L_0x0022:
        r3 = 1;
        if (r8 == 0) goto L_0x0059;
    L_0x0025:
        r4 = r0.createLinphoneAddress(r8);	 Catch:{ all -> 0x00ae }
        r5 = r4.getUserName();	 Catch:{ all -> 0x00ae }
        r4 = r4.getDomain();	 Catch:{ all -> 0x00ae }
        if (r9 == 0) goto L_0x003a;	 Catch:{ all -> 0x00ae }
    L_0x0033:
        r9 = r0.createAuthInfo(r5, r9, r1, r4);	 Catch:{ all -> 0x00ae }
        r2.addAuthInfo(r9);	 Catch:{ all -> 0x00ae }
    L_0x003a:
        r8 = r2.createProxyConfig(r8, r4, r1, r3);	 Catch:{ all -> 0x00ae }
        r8.enablePublish(r3);	 Catch:{ all -> 0x00ae }
        r2.addProxyConfig(r8);	 Catch:{ all -> 0x00ae }
        r2.setDefaultProxyConfig(r8);	 Catch:{ all -> 0x00ae }
    L_0x0047:
        r9 = r8.isRegistered();	 Catch:{ all -> 0x00ae }
        if (r9 != 0) goto L_0x0059;	 Catch:{ all -> 0x00ae }
    L_0x004d:
        r2.iterate();	 Catch:{ all -> 0x00ae }
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        java.lang.Thread.sleep(r4);	 Catch:{ InterruptedException -> 0x0056 }
        goto L_0x0047;
    L_0x0056:
        r7 = "Interrupted!\nAborting";	 Catch:{ all -> 0x00ae }
        goto L_0x0011;	 Catch:{ all -> 0x00ae }
    L_0x0059:
        r7.enableSubscribes(r3);	 Catch:{ all -> 0x00ae }
        r8 = org.linphone.core.LinphoneFriend.SubscribePolicy.SPAccept;	 Catch:{ all -> 0x00ae }
        r7.setIncSubscribePolicy(r8);	 Catch:{ all -> 0x00ae }
        r2.addFriend(r7);	 Catch:{ LinphoneCoreException -> 0x0091 }
        r8 = org.linphone.core.OnlineStatus.Online;	 Catch:{ all -> 0x00ae }
        r9 = 0;	 Catch:{ all -> 0x00ae }
        r2.setPresenceInfo(r9, r1, r8);	 Catch:{ all -> 0x00ae }
        r6.running = r3;	 Catch:{ all -> 0x00ae }
    L_0x006c:
        r8 = r6.running;	 Catch:{ all -> 0x00ae }
        if (r8 == 0) goto L_0x007c;	 Catch:{ all -> 0x00ae }
    L_0x0070:
        r2.iterate();	 Catch:{ all -> 0x00ae }
        r3 = 50;
        java.lang.Thread.sleep(r3);	 Catch:{ InterruptedException -> 0x0079 }
        goto L_0x006c;
    L_0x0079:
        r7 = "Interrupted!\nAborting";	 Catch:{ all -> 0x00ae }
        goto L_0x0011;	 Catch:{ all -> 0x00ae }
    L_0x007c:
        r8 = org.linphone.core.OnlineStatus.Offline;	 Catch:{ all -> 0x00ae }
        r2.setPresenceInfo(r9, r1, r8);	 Catch:{ all -> 0x00ae }
        r2.iterate();	 Catch:{ all -> 0x00ae }
        r7.edit();	 Catch:{ all -> 0x00ae }
        r7.enableSubscribes(r9);	 Catch:{ all -> 0x00ae }
        r7.done();	 Catch:{ all -> 0x00ae }
        r2.iterate();	 Catch:{ all -> 0x00ae }
        goto L_0x0014;	 Catch:{ all -> 0x00ae }
    L_0x0091:
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ae }
        r9 = "Error while adding friend ";	 Catch:{ all -> 0x00ae }
        r8.<init>(r9);	 Catch:{ all -> 0x00ae }
        r7 = r7.getAddress();	 Catch:{ all -> 0x00ae }
        r7 = r7.getUserName();	 Catch:{ all -> 0x00ae }
        r8.append(r7);	 Catch:{ all -> 0x00ae }
        r7 = " to linphone";	 Catch:{ all -> 0x00ae }
        r8.append(r7);	 Catch:{ all -> 0x00ae }
        r7 = r8.toString();	 Catch:{ all -> 0x00ae }
        goto L_0x0011;
    L_0x00ae:
        r7 = move-exception;
        r8 = "Shutting down...";
        r6.write(r8);
        r2.destroy();
        r8 = "Exited";
        r6.write(r8);
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.linphone.core.tutorials.TutorialBuddyStatus.launchTutorial(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public void messageReceived(LinphoneCore linphoneCore, LinphoneChatRoom linphoneChatRoom, LinphoneChatMessage linphoneChatMessage) {
    }

    public void newSubscriptionRequest(org.linphone.core.LinphoneCore r2, org.linphone.core.LinphoneFriend r3, java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r4 = new java.lang.StringBuilder;
        r0 = "[";
        r4.<init>(r0);
        r0 = r3.getAddress();
        r0 = r0.getUserName();
        r4.append(r0);
        r0 = "] wants to see your status, accepting";
        r4.append(r0);
        r4 = r4.toString();
        r1.write(r4);
        r3.edit();
        r4 = org.linphone.core.LinphoneFriend.SubscribePolicy.SPAccept;
        r3.setIncSubscribePolicy(r4);
        r3.done();
        r2.addFriend(r3);	 Catch:{ LinphoneCoreException -> 0x002d }
        return;
    L_0x002d:
        r2 = new java.lang.StringBuilder;
        r4 = "Error while adding friend [";
        r2.<init>(r4);
        r3 = r3.getAddress();
        r3 = r3.getUserName();
        r2.append(r3);
        r3 = "] to linphone in the callback";
        r2.append(r3);
        r2 = r2.toString();
        r1.write(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.linphone.core.tutorials.TutorialBuddyStatus.newSubscriptionRequest(org.linphone.core.LinphoneCore, org.linphone.core.LinphoneFriend, java.lang.String):void");
    }

    public void notifyPresenceReceived(LinphoneCore linphoneCore, LinphoneFriend linphoneFriend) {
        StringBuilder stringBuilder = new StringBuilder("New state [");
        stringBuilder.append(linphoneFriend.getStatus());
        stringBuilder.append("] for user id [");
        stringBuilder.append(linphoneFriend.getAddress().getUserName());
        stringBuilder.append("]");
        write(stringBuilder.toString());
    }

    public void notifyReceived(LinphoneCore linphoneCore, LinphoneCall linphoneCall, LinphoneAddress linphoneAddress, byte[] bArr) {
    }

    public void notifyReceived(LinphoneCore linphoneCore, LinphoneEvent linphoneEvent, String str, LinphoneContent linphoneContent) {
    }

    public void publishStateChanged(LinphoneCore linphoneCore, LinphoneEvent linphoneEvent, PublishState publishState) {
    }

    public void registrationState(LinphoneCore linphoneCore, LinphoneProxyConfig linphoneProxyConfig, RegistrationState registrationState, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(linphoneProxyConfig.getIdentity());
        stringBuilder.append(" : ");
        stringBuilder.append(str);
        stringBuilder.append("\n");
        write(stringBuilder.toString());
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
