package org.linphone.core;

import java.util.Vector;

public interface LinphoneFriend {

    public static class SubscribePolicy {
        public static final SubscribePolicy SPAccept = new SubscribePolicy(2, "SPAccept");
        public static final SubscribePolicy SPDeny = new SubscribePolicy(1, "SPDeny");
        public static final SubscribePolicy SPWait = new SubscribePolicy(0, "SPWait");
        private static Vector<SubscribePolicy> values = new Vector();
        private final String mStringValue;
        protected final int mValue;

        private SubscribePolicy(int i, String str) {
            this.mValue = i;
            values.addElement(this);
            this.mStringValue = str;
        }

        public static SubscribePolicy fromInt(int i) {
            for (int i2 = 0; i2 < values.size(); i2++) {
                SubscribePolicy subscribePolicy = (SubscribePolicy) values.elementAt(i2);
                if (subscribePolicy.mValue == i) {
                    return subscribePolicy;
                }
            }
            StringBuilder stringBuilder = new StringBuilder("Policy not found [");
            stringBuilder.append(i);
            stringBuilder.append("]");
            throw new RuntimeException(stringBuilder.toString());
        }

        public String toString() {
            return this.mStringValue;
        }
    }

    void done();

    void edit();

    void enableSubscribes(boolean z);

    LinphoneAddress getAddress();

    SubscribePolicy getIncSubscribePolicy();

    long getNativePtr();

    PresenceModel getPresenceModel();

    String getRefKey();

    OnlineStatus getStatus();

    boolean isSubscribesEnabled();

    void setAddress(LinphoneAddress linphoneAddress);

    void setIncSubscribePolicy(SubscribePolicy subscribePolicy);

    void setRefKey(String str);

    String toString();
}
