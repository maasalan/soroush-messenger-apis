package org.linphone.core;

import java.util.Vector;

public class OnlineStatus {
    public static OnlineStatus Away = new OnlineStatus(4, "Away");
    public static OnlineStatus BeRightBack = new OnlineStatus(3, "BeRightBack");
    public static OnlineStatus Busy = new OnlineStatus(2, "Busy");
    public static OnlineStatus DoNotDisturb = new OnlineStatus(7, "DoNotDisturb");
    public static OnlineStatus Offline = new OnlineStatus(0, "Offline");
    public static OnlineStatus OnThePhone = new OnlineStatus(5, "OnThePhone");
    public static OnlineStatus Online = new OnlineStatus(1, "Online");
    public static OnlineStatus OutToLunch = new OnlineStatus(6, "OutToLunch ");
    public static OnlineStatus Pending = new OnlineStatus(10, "Pending");
    public static OnlineStatus StatusAltService = new OnlineStatus(9, "StatusAltService");
    public static OnlineStatus StatusMoved = new OnlineStatus(8, "StatusMoved");
    private static Vector<OnlineStatus> values = new Vector();
    private final String mStringValue;
    protected final int mValue;

    private OnlineStatus(int i, String str) {
        this.mValue = i;
        values.addElement(this);
        this.mStringValue = str;
    }

    public static OnlineStatus fromInt(int i) {
        for (int i2 = 0; i2 < values.size(); i2++) {
            OnlineStatus onlineStatus = (OnlineStatus) values.elementAt(i2);
            if (onlineStatus.mValue == i) {
                return onlineStatus;
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
}
