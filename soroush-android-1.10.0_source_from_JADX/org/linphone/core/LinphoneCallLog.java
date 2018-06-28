package org.linphone.core;

import java.util.Vector;

public interface LinphoneCallLog {

    public static class CallStatus {
        public static final CallStatus Aborted = new CallStatus(1, "Aborted");
        public static final CallStatus Declined = new CallStatus(3, "Declined");
        public static final CallStatus Missed = new CallStatus(2, "Missed");
        public static final CallStatus Success = new CallStatus(0, "Sucess");
        private static Vector<CallStatus> values = new Vector();
        private final String mStringValue;
        private final int mValue;

        private CallStatus(int i, String str) {
            this.mValue = i;
            values.addElement(this);
            this.mStringValue = str;
        }

        public static CallStatus fromInt(int i) {
            for (int i2 = 0; i2 < values.size(); i2++) {
                CallStatus callStatus = (CallStatus) values.elementAt(i2);
                if (callStatus.mValue == i) {
                    return callStatus;
                }
            }
            StringBuilder stringBuilder = new StringBuilder("CallStatus not found [");
            stringBuilder.append(i);
            stringBuilder.append("]");
            throw new RuntimeException(stringBuilder.toString());
        }

        public int toInt() {
            return this.mValue;
        }

        public String toString() {
            return this.mStringValue;
        }
    }

    int getCallDuration();

    String getCallId();

    CallDirection getDirection();

    LinphoneAddress getFrom();

    String getStartDate();

    CallStatus getStatus();

    long getTimestamp();

    LinphoneAddress getTo();

    boolean wasConference();
}
