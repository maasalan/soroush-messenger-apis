package mobi.mmdt.componentsutils.p232b;

import android.os.Environment;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;

public final class C2482c {
    public static ArrayList<String> m6743a() {
        BufferedReader bufferedReader;
        Throwable e;
        Throwable th;
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add(Environment.getExternalStorageDirectory().getPath());
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/mounts"));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        try {
                            bufferedReader.close();
                            return arrayList;
                        } catch (Throwable e2) {
                            C2480b.m6738b(e2);
                            return arrayList;
                        }
                    } else if (readLine.contains("vfat") || readLine.contains("/mnt")) {
                        StringTokenizer stringTokenizer = new StringTokenizer(readLine, " ");
                        stringTokenizer.nextToken();
                        String nextToken = stringTokenizer.nextToken();
                        if (!(arrayList.contains(nextToken) || !readLine.contains("/dev/block/vold") || readLine.contains("/mnt/secure") || readLine.contains("/mnt/asec") || readLine.contains("/mnt/obb") || readLine.contains("/dev/mapper") || readLine.contains("tmpfs"))) {
                            Object stringBuilder;
                            if (!new File(nextToken).isDirectory()) {
                                int lastIndexOf = nextToken.lastIndexOf(47);
                                if (lastIndexOf != -1) {
                                    StringBuilder stringBuilder2 = new StringBuilder("/storage/");
                                    stringBuilder2.append(nextToken.substring(lastIndexOf + 1));
                                    stringBuilder = stringBuilder2.toString();
                                    if (new File(stringBuilder).isDirectory()) {
                                        arrayList.add(stringBuilder);
                                    }
                                }
                            }
                            stringBuilder = nextToken;
                            arrayList.add(stringBuilder);
                        }
                    }
                } catch (Exception e3) {
                    e2 = e3;
                }
            }
        } catch (Throwable e4) {
            Throwable th2 = e4;
            bufferedReader = null;
            e2 = th2;
            try {
                C2480b.m6738b(e2);
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                        return arrayList;
                    } catch (Throwable e22) {
                        C2480b.m6738b(e22);
                        return arrayList;
                    }
                }
                return arrayList;
            } catch (Throwable th3) {
                th = th3;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable e222) {
                        C2480b.m6738b(e222);
                    }
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            throw th;
        }
    }
}
