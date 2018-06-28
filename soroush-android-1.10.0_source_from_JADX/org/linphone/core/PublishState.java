package org.linphone.core;

public enum PublishState {
    None(0),
    Progress(1),
    Ok(2),
    Error(3),
    Expiring(4),
    Cleared(5);
    
    protected final int mValue;

    private PublishState(int i) {
        this.mValue = i;
    }

    protected static PublishState fromInt(int i) {
        switch (i) {
            case 0:
                return None;
            case 1:
                return Progress;
            case 2:
                return Ok;
            case 3:
                return Error;
            case 4:
                return Expiring;
            case 5:
                return Cleared;
            default:
                StringBuilder stringBuilder = new StringBuilder("Unhandled enum value ");
                stringBuilder.append(i);
                stringBuilder.append(" for PublishState");
                throw new LinphoneCoreException(stringBuilder.toString());
        }
    }
}
