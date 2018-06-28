package mobi.mmdt.ott.logic.p351h.p352a;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.C2791c;
import mobi.mmdt.ott.p246d.p248b.C2535a;

public final class C2821a {
    private static final HashMap<String, File> f8893a;

    static {
        HashMap hashMap = new HashMap();
        f8893a = hashMap;
        hashMap.put(C2826e.Image.toString(), new File(C2791c.m7109a().f8815a));
        f8893a.put(C2826e.Thumbnail.toString(), new File(C2791c.m7109a().f8817c));
        f8893a.put(C2826e.Temps.toString(), new File(C2791c.m7109a().f8823i));
        f8893a.put(C2826e.Video.toString(), new File(C2791c.m7109a().f8816b));
        f8893a.put(C2826e.Voice.toString(), new File(C2791c.m7109a().f8818d));
        f8893a.put(C2826e.Other.toString(), new File(C2791c.m7109a().f8819e));
    }

    public static long m7154a() {
        long j = 0;
        for (Entry value : f8893a.entrySet()) {
            j += C2821a.m7155a((File) value.getValue());
        }
        return j;
    }

    private static long m7155a(File file) {
        long j = 0;
        if (file != null) {
            if (!file.exists()) {
                return 0;
            }
            if (file.isDirectory()) {
                try {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null) {
                        for (File file2 : listFiles) {
                            j += file2.isDirectory() ? C2821a.m7155a(file2) : file2.length();
                        }
                    }
                } catch (Throwable th) {
                    C2480b.m6737b("Error in calculate directory size in cache setting", th);
                    return 0;
                }
            } else if (file.isFile()) {
                j = 0 + file.length();
            }
        }
        return j;
    }

    public static void m7156a(int i) {
        PendingIntent service = PendingIntent.getService(MyApplication.m12952b(), 100001, new Intent(MyApplication.m12952b(), C2823b.class), 0);
        AlarmManager alarmManager = (AlarmManager) MyApplication.m12952b().getSystemService("alarm");
        if (i == C2824c.f8897c) {
            alarmManager.cancel(service);
        } else {
            alarmManager.setInexactRepeating(2, 86400000, 86400000, service);
        }
        C2535a.m6888a().f8278a.edit().putInt("mobi.mmdt.ott.model.pref.KEY_KEEP_MEDIA", i - 1).apply();
    }

    public static void m7157a(long r13) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = java.lang.System.currentTimeMillis();
        r2 = f8893a;
        r2 = r2.entrySet();
        r2 = r2.iterator();
    L_0x000e:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x0079;
    L_0x0014:
        r3 = r2.next();
        r3 = (java.util.Map.Entry) r3;
        r3 = r3.getValue();
        r3 = (java.io.File) r3;
        r3 = r3.listFiles();
        if (r3 == 0) goto L_0x000e;
    L_0x0026:
        r4 = r3.length;
        r5 = 0;
    L_0x0028:
        if (r5 >= r4) goto L_0x000e;
    L_0x002a:
        r6 = r3[r5];
        r7 = r6.isFile();
        if (r7 == 0) goto L_0x0076;
    L_0x0032:
        r7 = r6.getName();
        r8 = ".nomedia";
        r7 = r7.equals(r8);
        if (r7 != 0) goto L_0x0076;
    L_0x003e:
        r7 = android.os.Build.VERSION.SDK_INT;
        r8 = 21;
        if (r7 < r8) goto L_0x0069;
    L_0x0044:
        r7 = r6.getPath();	 Catch:{ Exception -> 0x0076 }
        r7 = android.system.Os.stat(r7);	 Catch:{ Exception -> 0x0076 }
        r8 = r7.st_atime;	 Catch:{ Exception -> 0x0076 }
        r10 = 0;	 Catch:{ Exception -> 0x0076 }
        r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));	 Catch:{ Exception -> 0x0076 }
        if (r12 == 0) goto L_0x0060;	 Catch:{ Exception -> 0x0076 }
    L_0x0054:
        r7 = r7.st_atime;	 Catch:{ Exception -> 0x0076 }
        r9 = r7 + r13;	 Catch:{ Exception -> 0x0076 }
        r7 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));	 Catch:{ Exception -> 0x0076 }
        if (r7 >= 0) goto L_0x0076;	 Catch:{ Exception -> 0x0076 }
    L_0x005c:
        r6.delete();	 Catch:{ Exception -> 0x0076 }
        goto L_0x0076;	 Catch:{ Exception -> 0x0076 }
    L_0x0060:
        r7 = r7.st_mtime;	 Catch:{ Exception -> 0x0076 }
        r9 = r7 + r13;
        r7 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
        if (r7 >= 0) goto L_0x0076;
    L_0x0068:
        goto L_0x005c;
    L_0x0069:
        r7 = r6.lastModified();
        r9 = r7 + r13;
        r7 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
        if (r7 >= 0) goto L_0x0076;
    L_0x0073:
        r6.delete();
    L_0x0076:
        r5 = r5 + 1;
        goto L_0x0028;
    L_0x0079:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.h.a.a.a(long):void");
    }

    public static void m7158a(ArrayList<C2826e> arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2821a.m7160b((File) f8893a.get(((C2826e) it.next()).toString()));
        }
    }

    public static ArrayList<C2825d> m7159b() {
        ArrayList<C2825d> arrayList = new ArrayList();
        for (Entry entry : f8893a.entrySet()) {
            arrayList.add(new C2825d((File) entry.getValue(), (String) entry.getKey(), C2821a.m7155a((File) entry.getValue())));
        }
        return arrayList;
    }

    private static void m7160b(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File b : listFiles) {
                    C2821a.m7160b(b);
                }
            }
        }
        file.delete();
    }

    public static long m7161c() {
        return C2821a.m7155a(MyApplication.m12952b().getDatabasePath("ott.db"));
    }
}
