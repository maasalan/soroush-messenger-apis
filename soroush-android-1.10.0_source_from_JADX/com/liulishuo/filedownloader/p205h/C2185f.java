package com.liulishuo.filedownloader.p205h;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.liulishuo.filedownloader.p198a.C2132b;
import com.liulishuo.filedownloader.p200c.C2147c.C2146a;
import com.liulishuo.filedownloader.p202e.C2164a;
import com.liulishuo.filedownloader.p204g.C2171a;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jivesoftware.smack.util.StringUtils;

public class C2185f {
    private static int f7259a = 65536;
    private static long f7260b = 2000;
    private static String f7261c;
    private static Boolean f7262d;
    private static Boolean f7263e;
    private static final Pattern f7264f = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"");
    private static final Pattern f7265g = Pattern.compile("attachment;\\s*filename\\s*=\\s*(.*)");

    public static int m5989a(String str, String str2) {
        return C2146a.f7150a.m5895a().mo1963b(str, str2, false);
    }

    public static int m5990a(String str, String str2, boolean z) {
        return C2146a.f7150a.m5895a().mo1963b(str, str2, z);
    }

    public static long m5991a(C2132b c2132b) {
        long j = C2185f.m6020j(C2185f.m6011c(c2132b));
        if (j < 0) {
            C2182d.m5984d(C2185f.class, "don't get instance length fromContent-Range header", new Object[0]);
            j = -1;
        }
        return (j == 0 && C2184e.m5988a().f7258h) ? -1 : j;
    }

    public static String m5992a(int i, C2132b c2132b) {
        if (c2132b == null) {
            throw new RuntimeException("connection is null when findEtag");
        }
        String a = c2132b.mo1825a("Etag");
        if (C2182d.f7249a) {
            C2182d.m5983c(C2185f.class, "etag find %s for task(%d)", a, Integer.valueOf(i));
        }
        return a;
    }

    public static String m5993a(C2132b c2132b, String str) {
        Object k = C2185f.m6021k(c2132b.mo1825a("Content-Disposition"));
        return TextUtils.isEmpty(k) ? C2185f.m6012c(str) : k;
    }

    public static String m5994a(String str) {
        String absolutePath;
        if (TextUtils.isEmpty(f7261c)) {
            absolutePath = (C2181c.f7248a.getExternalCacheDir() == null ? Environment.getDownloadCacheDirectory() : C2181c.f7248a.getExternalCacheDir()).getAbsolutePath();
        } else {
            absolutePath = f7261c;
        }
        return C2185f.m6013c(absolutePath, C2185f.m6012c(str));
    }

    public static String m5995a(String str, boolean z, String str2) {
        if (str == null) {
            return null;
        }
        if (z) {
            if (str2 == null) {
                return null;
            }
            str = C2185f.m6013c(str, str2);
        }
        return str;
    }

    public static String m5996a(String str, Object... objArr) {
        return String.format(Locale.ENGLISH, str, objArr);
    }

    public static void m5997a(int i) {
        if (C2185f.m6003a(C2181c.f7248a)) {
            f7259a = i;
            return;
        }
        throw new IllegalAccessException("This value is used in the :filedownloader process, so set this value in your process is without effect. You can add 'process.non-separate=true' in 'filedownloader.properties' to share the main process to FileDownloadService. Or you can configure this value in 'filedownloader.properties' by 'download.min-progress-step'.");
    }

    public static void m5998a(long j) {
        if (C2185f.m6003a(C2181c.f7248a)) {
            f7260b = j;
            return;
        }
        throw new IllegalAccessException("This value is used in the :filedownloader process, so set this value in your process is without effect. You can add 'process.non-separate=true' in 'filedownloader.properties' to share the main process to FileDownloadService. Or you can configure this value in 'filedownloader.properties' by 'download.min-progress-time'.");
    }

    public static boolean m5999a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) C2181c.f7248a.getSystemService("connectivity");
        if (connectivityManager == null) {
            C2182d.m5984d(C2185f.class, "failed to get connectivity manager!", new Object[0]);
            return true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo == null || activeNetworkInfo.getType() != 1;
    }

    public static boolean m6000a(int i, FileDownloadModel fileDownloadModel) {
        if (fileDownloadModel == null) {
            if (C2182d.f7249a) {
                C2182d.m5983c(C2185f.class, "can't continue %d model == null", Integer.valueOf(i));
            }
            return false;
        } else if (fileDownloadModel.m6061b() != null) {
            return C2185f.m6001a(i, fileDownloadModel, fileDownloadModel.m6061b());
        } else {
            if (C2182d.f7249a) {
                C2182d.m5983c(C2185f.class, "can't continue %d temp path == null", Integer.valueOf(i));
            }
            return false;
        }
    }

    public static boolean m6001a(int i, FileDownloadModel fileDownloadModel, String str) {
        Object obj;
        Object[] objArr;
        if (str == null) {
            if (C2182d.f7249a) {
                obj = C2185f.class;
                str = "can't continue %d path = null";
                objArr = new Object[]{Integer.valueOf(i)};
            }
            return false;
        }
        File file = new File(str);
        boolean exists = file.exists();
        boolean isDirectory = file.isDirectory();
        if (exists) {
            if (!isDirectory) {
                long length = file.length();
                long j = fileDownloadModel.f7295f.get();
                if (fileDownloadModel.f7299j > 1 || j != 0) {
                    long j2 = fileDownloadModel.f7296g;
                    if (length >= j) {
                        if (j2 != -1) {
                            if (length <= j2) {
                                if (j >= j2) {
                                }
                            }
                        }
                        return true;
                    }
                    if (C2182d.f7249a) {
                        C2182d.m5983c(C2185f.class, "can't continue %d dirty data fileLength[%d] sofar[%d] total[%d]", Integer.valueOf(i), Long.valueOf(length), Long.valueOf(j), Long.valueOf(j2));
                        return false;
                    }
                    return false;
                }
                if (C2182d.f7249a) {
                    obj = C2185f.class;
                    str = "can't continue %d the downloaded-record is zero.";
                    objArr = new Object[]{Integer.valueOf(i)};
                }
                return false;
            }
        }
        if (C2182d.f7249a) {
            C2182d.m5983c(C2185f.class, "can't continue %d file not suit, exists[%B], directory[%B]", Integer.valueOf(i), Boolean.valueOf(exists), Boolean.valueOf(isDirectory));
        }
        return false;
        C2182d.m5983c(obj, str, objArr);
        return false;
    }

    public static boolean m6002a(long j, long j2) {
        return j > ((long) f7259a) && j2 > f7260b;
    }

    public static boolean m6003a(Context context) {
        Boolean bool;
        if (f7262d != null) {
            bool = f7262d;
        } else {
            boolean z = false;
            if (C2184e.m5988a().f7254d) {
                z = true;
            } else {
                Object obj;
                String str;
                int myPid = Process.myPid();
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager == null) {
                    obj = C2185f.class;
                    str = "fail to get the activity manager!";
                } else {
                    List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        if (!runningAppProcesses.isEmpty()) {
                            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                                if (runningAppProcessInfo.pid == myPid) {
                                    z = runningAppProcessInfo.processName.endsWith(":filedownloader");
                                    break;
                                }
                            }
                        }
                    }
                    obj = C2185f.class;
                    str = "The running app process info list from ActivityManager is null or empty, maybe current App is not running.";
                }
                C2182d.m5984d(obj, str, new Object[0]);
                return false;
            }
            bool = Boolean.valueOf(z);
            f7262d = bool;
        }
        return bool.booleanValue();
    }

    public static long m6004b(C2132b c2132b) {
        long m = C2185f.m6023m(C2185f.m6011c(c2132b));
        return m < 0 ? -1 : m;
    }

    public static String m6005b() {
        return C2185f.m5996a("FileDownloader/%s", "1.7.3");
    }

    public static String m6006b(String str) {
        return C2185f.m5996a("%s.temp", str);
    }

    public static void m6007b(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.getFilesDir().getAbsolutePath());
        stringBuilder.append(File.separator);
        stringBuilder.append("filedownloader");
        File file = new File(stringBuilder.toString(), ".old_file_converted");
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void m6008b(String str, String str2) {
        if (str2 != null) {
            File file = new File(str2);
            if (file.exists()) {
                file.delete();
            }
        }
        C2185f.m6019i(str);
    }

    public static boolean m6009b(int i, C2132b c2132b) {
        if (i == 206 || i == 1) {
            return true;
        }
        return "bytes".equals(c2132b.mo1825a("Accept-Ranges"));
    }

    public static long m6010c(int i, C2132b c2132b) {
        long l = C2185f.m6022l(c2132b.mo1825a("Content-Length"));
        String a = c2132b.mo1825a("Transfer-Encoding");
        long j = -1;
        if (l < 0) {
            int i2 = (a == null || !a.equals("chunked")) ? 0 : 1;
            if (i2 == 0) {
                if (!C2184e.m5988a().f7253c) {
                    throw new C2164a("can't know the size of the download file, and its Transfer-Encoding is not Chunked either.\nyou can ignore such exception by add http.lenient=true to the filedownloader.properties");
                } else if (C2182d.f7249a) {
                    C2182d.m5983c(C2185f.class, "%d response header is not legal but HTTP lenient is true, so handle as the case of transfer encoding chunk", Integer.valueOf(i));
                    return -1;
                }
            }
        }
        j = l;
        return j;
    }

    private static String m6011c(C2132b c2132b) {
        return c2132b.mo1825a("Content-Range");
    }

    public static String m6012c(String str) {
        try {
            byte[] digest = MessageDigest.getInstance(StringUtils.MD5).digest(str.getBytes(StringUtils.UTF8));
            StringBuilder stringBuilder = new StringBuilder(digest.length * 2);
            for (byte b : digest) {
                int i = b & 255;
                if (i < 16) {
                    stringBuilder.append("0");
                }
                stringBuilder.append(Integer.toHexString(i));
            }
            return stringBuilder.toString();
        } catch (Throwable e) {
            throw new RuntimeException("Huh, MD5 should be supported?", e);
        } catch (Throwable e2) {
            throw new RuntimeException("Huh, UTF-8 should be supported?", e2);
        }
    }

    private static String m6013c(String str, String str2) {
        if (str2 == null) {
            throw new IllegalStateException("can't generate real path, the file name is null");
        } else if (str == null) {
            throw new IllegalStateException("can't generate real path, the directory is null");
        } else {
            return C2185f.m5996a("%s%s%s", str, File.separator, str2);
        }
    }

    public static long m6014d(String str) {
        StatFs statFs = new StatFs(str);
        return VERSION.SDK_INT >= 18 ? statFs.getAvailableBytes() : ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    public static String m6015e(String str) {
        int length = str.length();
        int i = 2;
        int i2 = (File.separatorChar == '\\' && length > 2 && str.charAt(1) == ':') ? 2 : 0;
        int lastIndexOf = str.lastIndexOf(File.separatorChar);
        if (lastIndexOf != -1 || i2 <= 0) {
            i = lastIndexOf;
        }
        if (i != -1) {
            if (str.charAt(length - 1) != File.separatorChar) {
                return (str.indexOf(File.separatorChar) == i && str.charAt(i2) == File.separatorChar) ? str.substring(0, i + 1) : str.substring(0, i);
            }
        }
        return null;
    }

    public static String m6016f(String str) {
        StringBuilder stringBuilder = new StringBuilder("FileDownloader-");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public static boolean m6017g(String str) {
        return C2181c.f7248a.checkCallingOrSelfPermission(str) == 0;
    }

    public static C2171a m6018h(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("found invalid internal destination path, empty");
        }
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            throw new RuntimeException(C2185f.m5996a("found invalid internal destination path[%s], & path is directory[%B]", str, Boolean.valueOf(file.isDirectory())));
        } else if (file.exists() || file.createNewFile()) {
            return C2146a.f7150a.m5898d().mo1936a(file);
        } else {
            throw new IOException(C2185f.m5996a("create new file error  %s", file.getAbsolutePath()));
        }
    }

    public static void m6019i(String str) {
        if (str != null) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    private static long m6020j(java.lang.String r6) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = -1;
        if (r6 != 0) goto L_0x0005;
    L_0x0004:
        return r0;
    L_0x0005:
        r2 = "/";
        r2 = r6.split(r2);
        r3 = r2.length;
        r4 = 2;
        if (r3 < r4) goto L_0x0023;
    L_0x000f:
        r3 = 1;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0017 }
        r4 = java.lang.Long.parseLong(r2);	 Catch:{ NumberFormatException -> 0x0017 }
        return r4;
    L_0x0017:
        r2 = com.liulishuo.filedownloader.p205h.C2185f.class;
        r4 = "parse instance length failed with %s";
        r3 = new java.lang.Object[r3];
        r5 = 0;
        r3[r5] = r6;
        com.liulishuo.filedownloader.p205h.C2182d.m5984d(r2, r4, r3);
    L_0x0023:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.h.f.j(java.lang.String):long");
    }

    private static java.lang.String m6021k(java.lang.String r4) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = 0;
        if (r4 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = f7264f;	 Catch:{ IllegalStateException -> 0x0027 }
        r1 = r1.matcher(r4);	 Catch:{ IllegalStateException -> 0x0027 }
        r2 = r1.find();	 Catch:{ IllegalStateException -> 0x0027 }
        r3 = 1;	 Catch:{ IllegalStateException -> 0x0027 }
        if (r2 == 0) goto L_0x0016;	 Catch:{ IllegalStateException -> 0x0027 }
    L_0x0011:
        r4 = r1.group(r3);	 Catch:{ IllegalStateException -> 0x0027 }
        return r4;	 Catch:{ IllegalStateException -> 0x0027 }
    L_0x0016:
        r1 = f7265g;	 Catch:{ IllegalStateException -> 0x0027 }
        r4 = r1.matcher(r4);	 Catch:{ IllegalStateException -> 0x0027 }
        r1 = r4.find();	 Catch:{ IllegalStateException -> 0x0027 }
        if (r1 == 0) goto L_0x0027;	 Catch:{ IllegalStateException -> 0x0027 }
    L_0x0022:
        r4 = r4.group(r3);	 Catch:{ IllegalStateException -> 0x0027 }
        return r4;
    L_0x0027:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.h.f.k(java.lang.String):java.lang.String");
    }

    private static long m6022l(java.lang.String r4) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = -1;
        if (r4 != 0) goto L_0x0005;
    L_0x0004:
        return r0;
    L_0x0005:
        r2 = java.lang.Long.parseLong(r4);	 Catch:{ NumberFormatException -> 0x000a }
        return r2;
    L_0x000a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.h.f.l(java.lang.String):long");
    }

    private static long m6023m(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        try {
            Matcher matcher = Pattern.compile("bytes (\\d+)-(\\d+)/\\d+").matcher(str);
            if (matcher.find()) {
                return (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
            }
        } catch (Throwable e) {
            C2182d.m5981a((Object) C2185f.class, e, "parse content length from content range error", new Object[0]);
        }
        return -1;
    }
}
