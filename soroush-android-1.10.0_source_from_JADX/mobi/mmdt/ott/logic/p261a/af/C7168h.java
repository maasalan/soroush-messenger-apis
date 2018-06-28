package mobi.mmdt.ott.logic.p261a.af;

import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.perf.C2096a;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.p072b.p073a.p074a.C1073q;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.C2492j;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.p250a.p251a.C2547a;
import mobi.mmdt.ott.lib_webservicescomponent.p255b.C2552a;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2557c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.C2560a;
import mobi.mmdt.ott.logic.p261a.af.p271b.C2607a;
import mobi.mmdt.ott.logic.p370r.C2896b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import org.jivesoftware.smack.roster.Roster;
import org.json.JSONObject;
import p056c.C0925e;
import p056c.C0926f;
import p056c.C5047x;
import p056c.C5049z;
import p056c.aa.C0915a;
import p056c.ac;

public final class C7168h extends C6664c {
    private String f20611h;
    private Uri f20612i;
    private String f20613j;
    private int f20614k = 0;
    private Trace f20615l;
    private Trace f20616m;

    public C7168h(int i, String str, String str2, Uri uri, boolean z, boolean z2, String str3, C2896b c2896b) {
        super(i, z, z2, str3, c2896b);
        this.f20611h = str;
        this.f20612i = uri;
        this.f20613j = str2;
    }

    static /* synthetic */ void m18954a(C7168h c7168h, ac acVar, File file, long j, C0925e c0925e) {
        C7168h c7168h2 = c7168h;
        ac acVar2 = acVar;
        long j2 = j;
        CharSequence a = acVar2.m2260a("Content-Disposition");
        int i = (a == null || TextUtils.isEmpty(a)) ? 0 : 1;
        if (i != 0) {
            MyApplication.m12950a().m12960c("download_started");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(acVar2.f2825g.m2268c());
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            byte[] bArr = new byte[Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE];
            long j3 = (long) ((int) j2);
            long b = acVar2.f2825g.mo958b() + j3;
            randomAccessFile.seek(j2);
            c7168h2.f20615l.stop();
            int i2 = 0;
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    break;
                } else if (c7168h2.a) {
                    c0925e.mo1021c();
                    c7168h.m17157c();
                    return;
                } else {
                    long j4 = j3 + ((long) read);
                    randomAccessFile.write(bArr, 0, read);
                    read = (int) ((100 * j4) / b);
                    if (read > i2 + 1) {
                        c7168h2.m17153a(read);
                        i2 = read;
                    }
                    j3 = j4;
                }
            }
            randomAccessFile.close();
            bufferedInputStream.close();
            if (c7168h2.a) {
                c7168h.m17157c();
                return;
            }
            c7168h2.f20616m.stop();
            c7168h.m17158d();
            MyApplication.m12950a().m12960c("download_finished");
            return;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(acVar2.f2825g.m2268c()));
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                StringBuilder stringBuilder2 = new StringBuilder("Receive WebService <<");
                stringBuilder2.append(stringBuilder.toString());
                stringBuilder2.append(">>");
                C2480b.m6736b(stringBuilder2.toString());
                c7168h2.m17154a((Object) new C2607a(c7168h2.b, new JSONObject(stringBuilder.toString()), c7168h2.e));
                return;
            } else if (c7168h2.a) {
                c7168h.m17157c();
                return;
            } else {
                stringBuilder.append(readLine);
                stringBuilder.append("\n");
            }
        }
    }

    protected final void mo3446a() {
        long length;
        C2096a.m5726a();
        this.f20615l = C2096a.m5727a("startDownload");
        this.f20615l.start();
        C2096a.m5726a();
        this.f20616m = C2096a.m5727a("downloadDuration");
        this.f20616m.start();
        this.f20614k++;
        String a = C2492j.m6840a(MyApplication.m12952b());
        this.f20611h = C2556b.m6998a(this.f20611h);
        if (!this.c) {
            String d = C2535a.m6888a().m6928d();
            String a2 = C2547a.m6986a();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f20613j);
            stringBuilder.append(d);
            stringBuilder.append(a2);
            C2560a.m7006a(MyApplication.m12952b());
            stringBuilder.append(C2560a.m7010d());
            String a3 = C2557c.m7002a(stringBuilder.toString());
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(this.f20611h);
            stringBuilder2.append("/");
            stringBuilder2.append(d);
            stringBuilder2.append("/");
            C2560a.m7006a(MyApplication.m12952b());
            stringBuilder2.append(C2560a.m7008b());
            stringBuilder2.append("/");
            stringBuilder2.append(a3);
            stringBuilder2.append("/");
            stringBuilder2.append(a2);
            this.f20611h = stringBuilder2.toString();
        }
        final File file = new File(this.f20612i.getPath());
        new File(file.getParent()).mkdirs();
        if (file.exists()) {
            length = file.length();
        } else {
            file.createNewFile();
            length = 0;
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(this.f20611h);
        stringBuilder3.append("/");
        stringBuilder3.append(length);
        stringBuilder3.append("/0");
        this.f20611h = stringBuilder3.toString();
        stringBuilder3 = new StringBuilder("Post WebService <<>>Url:");
        stringBuilder3.append(this.f20611h);
        C2480b.m6736b(stringBuilder3.toString());
        C5047x a4 = C2552a.m6993a(this.f20611h, MyApplication.m12952b());
        C0915a c0915a = new C0915a();
        c0915a.m2239a(this.f20611h).m2244b("http.agent", a).m2244b("User-Agent", a);
        if (length > 0) {
            stringBuilder = new StringBuilder("bytes=");
            stringBuilder.append(length);
            stringBuilder.append("-");
            c0915a.m2244b("Range", stringBuilder.toString());
        }
        try {
            FirebasePerfOkHttpClient.enqueue(C5049z.m10240a(a4, c0915a.m2242a(), false), new C0926f(this) {
                final /* synthetic */ C7168h f16065c;

                public final void mo1782a(C0925e c0925e, ac acVar) {
                    try {
                        C7168h.m18954a(this.f16065c, acVar, file, length, c0925e);
                    } catch (Exception e) {
                        this.f16065c.m17154a((Object) e);
                    }
                    StringBuilder stringBuilder = new StringBuilder("##### Download File Info: < Url : ");
                    stringBuilder.append(this.f16065c.f20611h);
                    stringBuilder.append(" > < Local Address: ");
                    stringBuilder.append(this.f16065c.f20612i);
                    stringBuilder.append(" > < Download Length: ");
                    stringBuilder.append(C2491i.m6824c(MyApplication.m12952b(), acVar.f2825g.mo958b()));
                    stringBuilder.append("  >");
                    C2480b.m6736b(stringBuilder.toString());
                }

                public final void mo1783a(C0925e c0925e, IOException iOException) {
                    iOException.printStackTrace();
                    this.f16065c.m17154a((Object) iOException);
                }
            });
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
        if (this.f20614k > 3) {
            return super.shouldReRunOnThrowable(th, i, i2);
        }
        this.d = (Exception) th;
        return C1073q.f3503a;
    }
}
