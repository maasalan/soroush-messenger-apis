package org.linphone.core;

public enum SubscriptionDir {
    Incoming(0),
    Outgoing(1),
    Invalid(2);
    
    protected final int mValue;

    private SubscriptionDir(int i) {
        this.mValue = i;
    }

    protected static SubscriptionDir fromInt(int i) {
        switch (i) {
            case 0:
                return Incoming;
            case 1:
                return Outgoing;
            default:
                return Invalid;
        }
    }
}
