package org.linphone.core;

public enum PresenceBasicStatus {
    Open(0),
    Closed(1),
    Invalid(2);
    
    protected final int mValue;

    private PresenceBasicStatus(int i) {
        this.mValue = i;
    }

    protected static PresenceBasicStatus fromInt(int i) {
        switch (i) {
            case 0:
                return Open;
            case 1:
                return Closed;
            default:
                return Invalid;
        }
    }

    public final int toInt() {
        return this.mValue;
    }
}
