package mobi.mmdt.componentsutils.p232b.p518g;

import java.net.DatagramPacket;
import java.net.InetAddress;
import org.apache.p493a.p494a.C4606a;
import org.apache.p493a.p494a.p495a.C4603b;
import org.apache.p493a.p494a.p495a.C4604c;
import org.apache.p493a.p494a.p495a.C4605d;
import org.apache.p493a.p494a.p495a.C6300a;

public final class C5762a extends C4606a {
    private int f15869e = 3;

    public final C4604c m12939a(InetAddress inetAddress) {
        if (!m8343b()) {
            m8342a();
        }
        C4603b c6300a = new C6300a();
        c6300a.mo2443a();
        c6300a.mo2444a(this.f15869e);
        DatagramPacket e = c6300a.mo2449e();
        e.setAddress(inetAddress);
        e.setPort(123);
        C4603b c6300a2 = new C6300a();
        DatagramPacket e2 = c6300a2.mo2449e();
        c6300a.mo2445a(C4605d.m8340a());
        this.b.send(e);
        this.b.receive(e2);
        return new C4604c(c6300a2, System.currentTimeMillis());
    }
}
