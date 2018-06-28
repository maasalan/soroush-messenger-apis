package org.linphone.core;

import java.util.Vector;

public interface LinphoneCall {

    public interface LinphoneCallListener {
        void onNextVideoFrameDecoded(LinphoneCall linphoneCall);
    }

    public static class State {
        public static final State CallEarlyUpdatedByRemote = new State(19, "EarlyUpdatedByRemote");
        public static final State CallEarlyUpdating = new State(20, "EarlyUpdating");
        public static final State CallEnd = new State(13, "CallEnd");
        public static final State CallIncomingEarlyMedia = new State(16, "IncomingEarlyMedia");
        public static final State CallReleased = new State(18, "Released");
        public static final State CallUpdatedByRemote = new State(15, "UpdatedByRemote");
        public static final State CallUpdating = new State(17, "Updating");
        public static final State Connected = new State(6, "Connected");
        public static final State Error = new State(12, "Error");
        public static final State Idle = new State(0, "Idle");
        public static final State IncomingReceived = new State(1, "IncomingReceived");
        public static final State OutgoingEarlyMedia = new State(5, "OutgoingEarlyMedia");
        public static final State OutgoingInit = new State(2, "OutgoingInit");
        public static final State OutgoingProgress = new State(3, "OutgoingProgress");
        public static final State OutgoingRinging = new State(4, "OutgoingRinging");
        public static final State Paused = new State(9, "Paused");
        public static final State PausedByRemote = new State(14, "PausedByRemote");
        public static final State Pausing = new State(8, "Pausing");
        public static final State Refered = new State(11, "Refered");
        public static final State Resuming = new State(10, "Resuming");
        public static final State StreamsRunning = new State(7, "StreamsRunning");
        private static Vector<State> values = new Vector();
        private final String mStringValue;
        private final int mValue;

        private State(int i, String str) {
            this.mValue = i;
            values.addElement(this);
            this.mStringValue = str;
        }

        public static State fromInt(int i) {
            for (int i2 = 0; i2 < values.size(); i2++) {
                State state = (State) values.elementAt(i2);
                if (state.mValue == i) {
                    return state;
                }
            }
            StringBuilder stringBuilder = new StringBuilder("state not found [");
            stringBuilder.append(i);
            stringBuilder.append("]");
            throw new RuntimeException(stringBuilder.toString());
        }

        public String toString() {
            return this.mStringValue;
        }

        public final int value() {
            return this.mValue;
        }
    }

    boolean cameraEnabled();

    void enableCamera(boolean z);

    void enableEchoCancellation(boolean z);

    void enableEchoLimiter(boolean z);

    LinphoneCallStats getAudioStats();

    String getAuthenticationToken();

    float getAverageQuality();

    LinphoneCallLog getCallLog();

    LinphoneChatRoom getChatRoom();

    LinphoneConference getConference();

    LinphoneCallParams getCurrentParamsCopy();

    float getCurrentQuality();

    CallDirection getDirection();

    int getDuration();

    ErrorInfo getErrorInfo();

    float getPlayVolume();

    LinphonePlayer getPlayer();

    Reason getReason();

    LinphoneAddress getRemoteAddress();

    String getRemoteContact();

    LinphoneCallParams getRemoteParams();

    String getRemoteUserAgent();

    LinphoneCall getReplacedCall();

    State getState();

    State getTransferState();

    LinphoneCall getTransferTargetCall();

    LinphoneCall getTransfererCall();

    Object getUserData();

    LinphoneCallStats getVideoStats();

    boolean isAuthenticationTokenVerified();

    boolean isEchoCancellationEnabled();

    boolean isEchoLimiterEnabled();

    boolean isInConference();

    boolean mediaInProgress();

    void sendInfoMessage(LinphoneInfoMessage linphoneInfoMessage);

    void setAuthenticationTokenVerified(boolean z);

    void setListener(LinphoneCallListener linphoneCallListener);

    void setUserData(Object obj);

    void startRecording();

    void stopRecording();

    void takeSnapshot(String str);

    void zoomVideo(float f, float f2, float f3);
}
