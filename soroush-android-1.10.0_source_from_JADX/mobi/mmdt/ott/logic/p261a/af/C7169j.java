package mobi.mmdt.ott.logic.p261a.af;

import android.net.Uri;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.p072b.p073a.p074a.C1073q;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.RandomAccessFile;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.p255b.C2552a;
import mobi.mmdt.ott.logic.p370r.C2896b;
import org.jivesoftware.smack.roster.Roster;
import p056c.C0925e;
import p056c.C5047x;
import p056c.C5049z;
import p056c.aa.C0915a;
import p056c.ac;

public final class C7169j extends C6664c {
    private String f20617h;
    private Uri f20618i;
    private int f20619j = 0;

    public C7169j(int i, String str, Uri uri, String str2, C2896b c2896b) {
        super(i, true, false, str2, c2896b);
        this.f20617h = str;
        this.f20618i = uri;
    }

    protected final void mo3446a() {
        this.f20619j++;
        File file = new File(this.f20618i.getPath());
        new File(file.getParent()).mkdirs();
        if (file.exists()) {
            file.length();
        } else {
            file.createNewFile();
        }
        StringBuilder stringBuilder = new StringBuilder("Post WebService <<>>Url:");
        stringBuilder.append(this.f20617h);
        C2480b.m6736b(stringBuilder.toString());
        C5047x a = C2552a.m6993a(this.f20617h, MyApplication.m12952b());
        C0915a c0915a = new C0915a();
        c0915a.m2239a(this.f20617h);
        try {
            C0925e a2 = C5049z.m10240a(a, c0915a.m2242a(), false);
            ac execute = FirebasePerfOkHttpClient.execute(a2);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(execute.f2825g.m2268c());
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            byte[] bArr = new byte[Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE];
            long b = execute.f2825g.mo958b();
            long j = 0;
            int i = 0;
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    break;
                } else if (this.a) {
                    a2.mo1021c();
                    m17157c();
                    return;
                } else {
                    long j2 = j + ((long) read);
                    randomAccessFile.write(bArr, 0, read);
                    int i2 = (int) ((100 * j2) / b);
                    if (i2 > i + 1) {
                        m17153a(i2);
                        i = i2;
                    }
                    j = j2;
                }
            }
            randomAccessFile.close();
            bufferedInputStream.close();
            if (this.a) {
                m17157c();
            } else {
                m17158d();
            }
        } catch (Exception e) {
            m17154a((Object) e);
            throw e;
        }
    }

    public final void onRun() {
        try {
            mo3446a();
        } catch (Exception e) {
            m17154a((Object) e);
        }
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        if (this.f20619j > 3) {
            return super.shouldReRunOnThrowable(th, i, i2);
        }
        this.d = (Exception) th;
        return C1073q.f3503a;
    }
}
