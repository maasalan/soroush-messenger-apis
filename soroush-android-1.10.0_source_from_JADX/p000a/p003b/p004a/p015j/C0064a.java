package p000a.p003b.p004a.p015j;

import java.net.InetAddress;
import org.jivesoftware.smack.roster.Roster;
import p000a.p003b.p004a.C0041d;

public abstract class C0064a {
    protected int f268a = Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE;
    protected int f269b = 5000;

    public final int m109a() {
        return this.f268a;
    }

    public abstract C0041d mo19a(C0041d c0041d, InetAddress inetAddress);
}
