package org.linphone.core;

public enum ToneID {
    Undefined(0),
    Busy(1),
    CallWaiting(2),
    CallOnHold(3),
    CallLost(4);
    
    protected final int mValue;

    private ToneID(int i) {
        this.mValue = i;
    }

    protected static ToneID fromInt(int i) {
        switch (i) {
            case 0:
                return Undefined;
            case 1:
                return Busy;
            case 2:
                return CallWaiting;
            case 3:
                return CallOnHold;
            case 4:
                return CallLost;
            default:
                StringBuilder stringBuilder = new StringBuilder("Unhandled enum value ");
                stringBuilder.append(i);
                stringBuilder.append(" for LinphoneToneID");
                throw new LinphoneCoreException(stringBuilder.toString());
        }
    }
}
