package mobi.mmdt.ott.view.tools;

import com.google.firebase.crash.FirebaseCrash;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.Thread.UncaughtExceptionHandler;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import mobi.mmdt.componentsutils.p232b.p235c.C2478a;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b.C2479a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.report.base.ReportType;
import mobi.mmdt.ott.logic.p371s.C2900c;

public final class C4502c {
    public static C4502c f12455a;
    boolean f12456b = false;
    long f12457c = 0;

    class C44901 implements UncaughtExceptionHandler {
        final /* synthetic */ C4502c f12437a;

        C44901(C4502c c4502c) {
            this.f12437a = c4502c;
        }

        public final void uncaughtException(Thread thread, final Throwable th) {
            try {
                final Writer stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                this.f12437a.f12456b = false;
                this.f12437a.f12457c = System.currentTimeMillis();
                new Thread(new Runnable(this) {
                    final /* synthetic */ C44901 f12436c;

                    public final void run() {
                        try {
                            C2480b.m6738b(th);
                            if (!((th instanceof SocketException) || (th instanceof SocketTimeoutException))) {
                                FirebaseCrash.m5601a(th);
                                if (C2480b.f8158a) {
                                    String message = th.getMessage();
                                    int i = C2479a.f8155b;
                                    String stringWriter = stringWriter.toString();
                                    ReportType reportType = null;
                                    switch (C44912.f12438a[i - 1]) {
                                        case 1:
                                            reportType = ReportType.bug;
                                            break;
                                        case 2:
                                            reportType = ReportType.error;
                                            break;
                                        case 3:
                                            reportType = ReportType.info;
                                            break;
                                        default:
                                            break;
                                    }
                                    C2900c.m7279a(message, reportType, stringWriter, C2478a.m6728a());
                                }
                            }
                        } catch (Throwable e) {
                            C2480b.m6738b(e);
                        }
                        this.f12436c.f12437a.f12456b = true;
                    }
                }).start();
            } catch (Throwable th2) {
                C2480b.m6738b(th2);
            }
            if (thread != null && thread.getName().equals("main")) {
                while (!this.f12437a.f12456b) {
                    try {
                        Thread.currentThread();
                        Thread.sleep(100);
                    } catch (Throwable e) {
                        C2480b.m6738b(e);
                    }
                    if (System.currentTimeMillis() - this.f12437a.f12457c > 5000) {
                        break;
                    }
                }
                System.exit(1);
            }
        }
    }

    static /* synthetic */ class C44912 {
        static final /* synthetic */ int[] f12438a = new int[C2479a.m6730a().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = mobi.mmdt.componentsutils.p232b.p235c.C2480b.C2479a.m6730a();
            r0 = r0.length;
            r0 = new int[r0];
            f12438a = r0;
            r0 = 1;
            r1 = f12438a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = mobi.mmdt.componentsutils.p232b.p235c.C2480b.C2479a.f8154a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r1 = f12438a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = mobi.mmdt.componentsutils.p232b.p235c.C2480b.C2479a.f8155b;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r3 = 2;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            r1 = f12438a;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = mobi.mmdt.componentsutils.p232b.p235c.C2480b.C2479a.f8156c;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r0 = 3;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.tools.c.2.<clinit>():void");
        }
    }

    public C4502c() {
        if (C2480b.f8159b) {
            Thread.setDefaultUncaughtExceptionHandler(new C44901(this));
        }
    }
}
