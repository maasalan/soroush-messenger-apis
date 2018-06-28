package org.linphone.core;

public enum SubscriptionState {
    None(0),
    OutoingProgress(1),
    IncomingReceived(2),
    Pending(3),
    Active(4),
    Terminated(5),
    Error(6),
    Expiring(7);
    
    protected final int mValue;

    private SubscriptionState(int i) {
        this.mValue = i;
    }

    protected static SubscriptionState fromInt(int i) {
        switch (i) {
            case 0:
                return None;
            case 1:
                return OutoingProgress;
            case 2:
                return IncomingReceived;
            case 3:
                return Pending;
            case 4:
                return Active;
            case 5:
                return Terminated;
            case 6:
                return Error;
            case 7:
                return Expiring;
            default:
                StringBuilder stringBuilder = new StringBuilder("Unhandled enum value ");
                stringBuilder.append(i);
                stringBuilder.append(" for SubscriptionState");
                throw new LinphoneCoreException(stringBuilder.toString());
        }
    }
}
