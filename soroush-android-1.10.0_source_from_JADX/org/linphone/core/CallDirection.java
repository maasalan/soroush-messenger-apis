package org.linphone.core;

public class CallDirection {
    public static CallDirection Incoming = new CallDirection("Callincoming");
    public static CallDirection Outgoing = new CallDirection("CallOutgoing");
    private String mStringValue;

    private CallDirection(String str) {
        this.mStringValue = str;
    }

    public String toString() {
        return this.mStringValue;
    }
}
