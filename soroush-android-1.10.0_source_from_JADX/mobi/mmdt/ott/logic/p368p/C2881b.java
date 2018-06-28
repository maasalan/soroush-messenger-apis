package mobi.mmdt.ott.logic.p368p;

import java.util.Vector;

public final class C2881b {
    public static final C2881b f8993a = new C2881b(0, "Idle");
    public static final C2881b f8994b = new C2881b(1, "IncomingReceived");
    public static final C2881b f8995c = new C2881b(2, "OutgoingInit");
    public static final C2881b f8996d = new C2881b(3, "OutgoingProgress");
    public static final C2881b f8997e = new C2881b(4, "OutgoingRinging");
    public static final C2881b f8998f = new C2881b(5, "OutgoingEarlyMedia");
    public static final C2881b f8999g = new C2881b(6, "Connected");
    public static final C2881b f9000h = new C2881b(7, "StreamsRunning");
    public static final C2881b f9001i = new C2881b(8, "Pausing");
    public static final C2881b f9002j = new C2881b(9, "Paused");
    public static final C2881b f9003k = new C2881b(10, "Resuming");
    public static final C2881b f9004l = new C2881b(11, "Refered");
    public static final C2881b f9005m = new C2881b(12, "Error");
    public static final C2881b f9006n = new C2881b(13, "CallEnd");
    public static final C2881b f9007o = new C2881b(14, "PausedByRemote");
    public static final C2881b f9008p = new C2881b(15, "UpdatedByRemote");
    public static final C2881b f9009q = new C2881b(16, "IncomingEarlyMedia");
    public static final C2881b f9010r = new C2881b(17, "Updating");
    public static final C2881b f9011s = new C2881b(18, "Released");
    private Vector<C2881b> f9012t = new Vector();
    private final int f9013u;
    private final String f9014v;

    private C2881b(int i, String str) {
        this.f9013u = i;
        this.f9012t.addElement(this);
        this.f9014v = str;
    }

    public final String toString() {
        return this.f9014v;
    }
}
