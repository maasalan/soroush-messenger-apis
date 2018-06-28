package p000a.p003b.p004a.p009d;

import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.InetAddress;
import java.util.HashSet;
import java.util.logging.Level;
import p000a.p003b.p004a.p016k.C0075g;

public class C6318b extends C4642a {
    public static final C0040d f17265b = new C6318b();

    private C6318b() {
        super(C6318b.class.getSimpleName(), 999);
    }

    public final String[] mo2472c() {
        try {
            LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(Runtime.getRuntime().exec("getprop").getInputStream()));
            HashSet hashSet = new HashSet(6);
            while (true) {
                String readLine = lineNumberReader.readLine();
                if (readLine == null) {
                    break;
                }
                int indexOf = readLine.indexOf("]: [");
                if (indexOf != -1) {
                    String substring = readLine.substring(1, indexOf);
                    readLine = readLine.substring(indexOf + 4, readLine.length() - 1);
                    if (!readLine.isEmpty() && (substring.endsWith(".dns") || substring.endsWith(".dns1") || substring.endsWith(".dns2") || substring.endsWith(".dns3") || substring.endsWith(".dns4"))) {
                        InetAddress byName = InetAddress.getByName(readLine);
                        if (byName != null) {
                            readLine = byName.getHostAddress();
                            if (!(readLine == null || readLine.length() == 0)) {
                                hashSet.add(readLine);
                            }
                        }
                    }
                }
            }
            if (hashSet.size() > 0) {
                return (String[]) hashSet.toArray(new String[hashSet.size()]);
            }
        } catch (Throwable e) {
            a.log(Level.WARNING, "Exception in findDNSByExec", e);
        }
        return null;
    }

    public final boolean mo2473d() {
        return C0075g.m124a();
    }
}
