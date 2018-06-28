package p000a.p003b.p004a.p009d;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000a.p003b.p004a.p016k.C0075g;

public class C6320e extends C4642a {
    public static final C0040d f17267b = new C6320e();
    private static final Logger f17268c = Logger.getLogger(C6320e.class.getName());
    private static final Pattern f17269d = Pattern.compile("^nameserver\\s+(.*)$");
    private static String[] f17270e;
    private static long f17271f;

    private C6320e() {
        super(C6320e.class.getSimpleName(), 2000);
    }

    public final String[] mo2472c() {
        BufferedReader bufferedReader;
        Throwable e;
        File file = new File("/etc/resolv.conf");
        if (!file.exists()) {
            return null;
        }
        long lastModified = file.lastModified();
        if (lastModified == f17271f && f17270e != null) {
            return f17270e;
        }
        List arrayList = new ArrayList();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            while (true) {
                try {
                    CharSequence readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        Matcher matcher = f17269d.matcher(readLine);
                        if (matcher.matches()) {
                            arrayList.add(matcher.group(1).trim());
                        }
                    } else {
                        try {
                            break;
                        } catch (Throwable e2) {
                            f17268c.log(Level.WARNING, "Could not close reader", e2);
                        }
                    }
                } catch (IOException e3) {
                    e2 = e3;
                }
            }
            bufferedReader.close();
            if (arrayList.isEmpty()) {
                f17268c.fine("Could not find any nameservers in /etc/resolv.conf");
                return null;
            }
            f17270e = (String[]) arrayList.toArray(new String[arrayList.size()]);
            f17271f = lastModified;
            return f17270e;
        } catch (IOException e4) {
            e2 = e4;
            bufferedReader = null;
            try {
                f17268c.log(Level.WARNING, "Could not read from /etc/resolv.conf", e2);
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                        return null;
                    } catch (Throwable e22) {
                        f17268c.log(Level.WARNING, "Could not close reader", e22);
                        return null;
                    }
                }
                return null;
            } catch (Throwable th) {
                e22 = th;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable e5) {
                        f17268c.log(Level.WARNING, "Could not close reader", e5);
                    }
                }
                throw e22;
            }
        } catch (Throwable th2) {
            e22 = th2;
            bufferedReader = null;
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            throw e22;
        }
    }

    public final boolean mo2473d() {
        return !C0075g.m124a() && new File("/etc/resolv.conf").exists();
    }
}
