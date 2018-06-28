package android.support.p025c;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.util.Log;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.zip.ZipFile;

public final class C0157a {
    private static final Set<File> f483a = new HashSet();
    private static final boolean f484b = C0157a.m246a(System.getProperty("java.vm.version"));

    private static final class C0155a {
        static void m238a(ClassLoader classLoader, List<? extends File> list, File file) {
            Object obj = C0157a.m248b(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(list);
            C0157a.m245a(obj, "dexElements", (Object[]) C0157a.m249b(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, new Object[]{arrayList2, file, arrayList}));
            if (arrayList.size() > 0) {
                Object obj2;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                }
                Field a = C0157a.m248b(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr = (IOException[]) a.get(obj);
                if (iOExceptionArr == null) {
                    obj2 = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    Object obj3 = new IOException[(arrayList.size() + iOExceptionArr.length)];
                    arrayList.toArray(obj3);
                    System.arraycopy(iOExceptionArr, 0, obj3, arrayList.size(), iOExceptionArr.length);
                    obj2 = obj3;
                }
                a.set(obj, obj2);
            }
        }
    }

    private static final class C0156b {
        static void m239a(ClassLoader classLoader, List<? extends File> list) {
            int size = list.size();
            Field a = C0157a.m248b(classLoader, "path");
            StringBuilder stringBuilder = new StringBuilder((String) a.get(classLoader));
            Object[] objArr = new String[size];
            Object[] objArr2 = new File[size];
            Object[] objArr3 = new ZipFile[size];
            Object[] objArr4 = new DexFile[size];
            ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File file = (File) listIterator.next();
                String absolutePath = file.getAbsolutePath();
                stringBuilder.append(':');
                stringBuilder.append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                objArr[previousIndex] = absolutePath;
                objArr2[previousIndex] = file;
                objArr3[previousIndex] = new ZipFile(file);
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(absolutePath);
                stringBuilder2.append(".dex");
                objArr4[previousIndex] = DexFile.loadDex(absolutePath, stringBuilder2.toString(), 0);
            }
            a.set(classLoader, stringBuilder.toString());
            C0157a.m245a((Object) classLoader, "mPaths", objArr);
            C0157a.m245a((Object) classLoader, "mFiles", objArr2);
            C0157a.m245a((Object) classLoader, "mZips", objArr3);
            C0157a.m245a((Object) classLoader, "mDexs", objArr4);
        }
    }

    private static java.io.File m240a(android.content.Context r2, java.io.File r3, java.lang.String r4) {
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
        r0 = new java.io.File;
        r1 = "code_cache";
        r0.<init>(r3, r1);
        android.support.p025c.C0157a.m244a(r0);	 Catch:{ IOException -> 0x000b }
        goto L_0x0019;
    L_0x000b:
        r0 = new java.io.File;
        r2 = r2.getFilesDir();
        r3 = "code_cache";
        r0.<init>(r2, r3);
        android.support.p025c.C0157a.m244a(r0);
    L_0x0019:
        r2 = new java.io.File;
        r2.<init>(r0, r4);
        android.support.p025c.C0157a.m244a(r2);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.c.a.a(android.content.Context, java.io.File, java.lang.String):java.io.File");
    }

    public static void m243a(Context context) {
        String str;
        String str2;
        Log.i("MultiDex", "Installing application");
        if (f484b) {
            str = "MultiDex";
            str2 = "VM has multidex support, MultiDex support library is disabled.";
        } else if (VERSION.SDK_INT < 4) {
            StringBuilder stringBuilder = new StringBuilder("MultiDex installation failed. SDK ");
            stringBuilder.append(VERSION.SDK_INT);
            stringBuilder.append(" is unsupported. Min SDK version is 4.");
            throw new RuntimeException(stringBuilder.toString());
        } else {
            try {
                ApplicationInfo b = C0157a.m247b(context);
                if (b == null) {
                    Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                    return;
                }
                File file = new File(b.sourceDir);
                File file2 = new File(b.dataDir);
                str2 = "secondary-dexes";
                String str3 = "";
                synchronized (f483a) {
                    if (!f483a.contains(file)) {
                        f483a.add(file);
                        if (VERSION.SDK_INT > 20) {
                            StringBuilder stringBuilder2 = new StringBuilder("MultiDex is not guaranteed to work in SDK version ");
                            stringBuilder2.append(VERSION.SDK_INT);
                            stringBuilder2.append(": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"");
                            stringBuilder2.append(System.getProperty("java.vm.version"));
                            stringBuilder2.append("\"");
                            Log.w("MultiDex", stringBuilder2.toString());
                        }
                        try {
                            ClassLoader classLoader = context.getClassLoader();
                            if (classLoader == null) {
                                Log.e("MultiDex", "Context class loader is null. Must be running in test mode. Skip patching.");
                            } else {
                                try {
                                    C0157a.m250c(context);
                                } catch (Throwable th) {
                                    Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th);
                                }
                                File a = C0157a.m240a(context, file2, str2);
                                Object a2 = C0161c.m253a(context, file, a, str3);
                                if (!a2.isEmpty()) {
                                    if (VERSION.SDK_INT >= 19) {
                                        C0155a.m238a(classLoader, a2, a);
                                    } else if (VERSION.SDK_INT >= 14) {
                                        Object obj = C0157a.m248b(classLoader, "pathList").get(classLoader);
                                        ArrayList arrayList = new ArrayList(a2);
                                        C0157a.m245a(obj, "dexElements", (Object[]) C0157a.m249b(obj, "makeDexElements", ArrayList.class, File.class).invoke(obj, new Object[]{arrayList, a}));
                                    } else {
                                        C0156b.m239a(classLoader, a2);
                                    }
                                }
                            }
                        } catch (Throwable e) {
                            Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e);
                        }
                    }
                }
                str = "MultiDex";
                str2 = "install done";
            } catch (Throwable e2) {
                Log.e("MultiDex", "MultiDex installation failure", e2);
                StringBuilder stringBuilder3 = new StringBuilder("MultiDex installation failed (");
                stringBuilder3.append(e2.getMessage());
                stringBuilder3.append(").");
                throw new RuntimeException(stringBuilder3.toString());
            }
        }
        Log.i(str, str2);
    }

    private static void m244a(File file) {
        file.mkdir();
        if (!file.isDirectory()) {
            StringBuilder stringBuilder;
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                stringBuilder = new StringBuilder("Failed to create dir ");
                stringBuilder.append(file.getPath());
                stringBuilder.append(". Parent file is null.");
                Log.e("MultiDex", stringBuilder.toString());
            } else {
                StringBuilder stringBuilder2 = new StringBuilder("Failed to create dir ");
                stringBuilder2.append(file.getPath());
                stringBuilder2.append(". parent file is a dir ");
                stringBuilder2.append(parentFile.isDirectory());
                stringBuilder2.append(", a file ");
                stringBuilder2.append(parentFile.isFile());
                stringBuilder2.append(", exists ");
                stringBuilder2.append(parentFile.exists());
                stringBuilder2.append(", readable ");
                stringBuilder2.append(parentFile.canRead());
                stringBuilder2.append(", writable ");
                stringBuilder2.append(parentFile.canWrite());
                Log.e("MultiDex", stringBuilder2.toString());
            }
            stringBuilder = new StringBuilder("Failed to create directory ");
            stringBuilder.append(file.getPath());
            throw new IOException(stringBuilder.toString());
        }
    }

    static /* synthetic */ void m245a(Object obj, String str, Object[] objArr) {
        Field b = C0157a.m248b(obj, str);
        Object[] objArr2 = (Object[]) b.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        b.set(obj, objArr3);
    }

    private static boolean m246a(java.lang.String r5) {
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
        r0 = 0;
        if (r5 == 0) goto L_0x002c;
    L_0x0003:
        r1 = "(\\d+)\\.(\\d+)(\\.\\d+)?";
        r1 = java.util.regex.Pattern.compile(r1);
        r1 = r1.matcher(r5);
        r2 = r1.matches();
        if (r2 == 0) goto L_0x002c;
    L_0x0013:
        r2 = 1;
        r3 = r1.group(r2);	 Catch:{ NumberFormatException -> 0x002c }
        r3 = java.lang.Integer.parseInt(r3);	 Catch:{ NumberFormatException -> 0x002c }
        r4 = 2;	 Catch:{ NumberFormatException -> 0x002c }
        r1 = r1.group(r4);	 Catch:{ NumberFormatException -> 0x002c }
        r1 = java.lang.Integer.parseInt(r1);	 Catch:{ NumberFormatException -> 0x002c }
        if (r3 > r4) goto L_0x002b;
    L_0x0027:
        if (r3 != r4) goto L_0x002c;
    L_0x0029:
        if (r1 <= 0) goto L_0x002c;
    L_0x002b:
        r0 = r2;
    L_0x002c:
        r1 = "MultiDex";
        r2 = new java.lang.StringBuilder;
        r3 = "VM with version ";
        r2.<init>(r3);
        r2.append(r5);
        if (r0 == 0) goto L_0x003d;
    L_0x003a:
        r5 = " has multidex support";
        goto L_0x003f;
    L_0x003d:
        r5 = " does not have multidex support";
    L_0x003f:
        r2.append(r5);
        r5 = r2.toString();
        android.util.Log.i(r1, r5);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.c.a.a(java.lang.String):boolean");
    }

    private static ApplicationInfo m247b(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (Throwable e) {
            Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e);
            return null;
        }
    }

    private static java.lang.reflect.Field m248b(java.lang.Object r3, java.lang.String r4) {
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
        r0 = r3.getClass();
    L_0x0004:
        if (r0 == 0) goto L_0x001a;
    L_0x0006:
        r1 = r0.getDeclaredField(r4);	 Catch:{ NoSuchFieldException -> 0x0015 }
        r2 = r1.isAccessible();	 Catch:{ NoSuchFieldException -> 0x0015 }
        if (r2 != 0) goto L_0x0014;	 Catch:{ NoSuchFieldException -> 0x0015 }
    L_0x0010:
        r2 = 1;	 Catch:{ NoSuchFieldException -> 0x0015 }
        r1.setAccessible(r2);	 Catch:{ NoSuchFieldException -> 0x0015 }
    L_0x0014:
        return r1;
    L_0x0015:
        r0 = r0.getSuperclass();
        goto L_0x0004;
    L_0x001a:
        r0 = new java.lang.NoSuchFieldException;
        r1 = new java.lang.StringBuilder;
        r2 = "Field ";
        r1.<init>(r2);
        r1.append(r4);
        r4 = " not found in ";
        r1.append(r4);
        r3 = r3.getClass();
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.c.a.b(java.lang.Object, java.lang.String):java.lang.reflect.Field");
    }

    private static java.lang.reflect.Method m249b(java.lang.Object r3, java.lang.String r4, java.lang.Class<?>... r5) {
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
        r0 = r3.getClass();
    L_0x0004:
        if (r0 == 0) goto L_0x001a;
    L_0x0006:
        r1 = r0.getDeclaredMethod(r4, r5);	 Catch:{ NoSuchMethodException -> 0x0015 }
        r2 = r1.isAccessible();	 Catch:{ NoSuchMethodException -> 0x0015 }
        if (r2 != 0) goto L_0x0014;	 Catch:{ NoSuchMethodException -> 0x0015 }
    L_0x0010:
        r2 = 1;	 Catch:{ NoSuchMethodException -> 0x0015 }
        r1.setAccessible(r2);	 Catch:{ NoSuchMethodException -> 0x0015 }
    L_0x0014:
        return r1;
    L_0x0015:
        r0 = r0.getSuperclass();
        goto L_0x0004;
    L_0x001a:
        r0 = new java.lang.NoSuchMethodException;
        r1 = new java.lang.StringBuilder;
        r2 = "Method ";
        r1.<init>(r2);
        r1.append(r4);
        r4 = " with parameters ";
        r1.append(r4);
        r4 = java.util.Arrays.asList(r5);
        r1.append(r4);
        r4 = " not found in ";
        r1.append(r4);
        r3 = r3.getClass();
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.c.a.b(java.lang.Object, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    private static void m250c(Context context) {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            String str;
            String str2;
            StringBuilder stringBuilder = new StringBuilder("Clearing old secondary dex dir (");
            stringBuilder.append(file.getPath());
            stringBuilder.append(").");
            Log.i("MultiDex", stringBuilder.toString());
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                str = "MultiDex";
                stringBuilder = new StringBuilder("Failed to list secondary dex dir content (");
                stringBuilder.append(file.getPath());
                str2 = ").";
            } else {
                for (File file2 : listFiles) {
                    StringBuilder stringBuilder2 = new StringBuilder("Trying to delete old file ");
                    stringBuilder2.append(file2.getPath());
                    stringBuilder2.append(" of size ");
                    stringBuilder2.append(file2.length());
                    Log.i("MultiDex", stringBuilder2.toString());
                    if (file2.delete()) {
                        stringBuilder2 = new StringBuilder("Deleted old file ");
                        stringBuilder2.append(file2.getPath());
                        Log.i("MultiDex", stringBuilder2.toString());
                    } else {
                        stringBuilder2 = new StringBuilder("Failed to delete old file ");
                        stringBuilder2.append(file2.getPath());
                        Log.w("MultiDex", stringBuilder2.toString());
                    }
                }
                if (file.delete()) {
                    stringBuilder = new StringBuilder("Deleted old secondary dex dir ");
                    stringBuilder.append(file.getPath());
                    Log.i("MultiDex", stringBuilder.toString());
                } else {
                    str = "MultiDex";
                    stringBuilder = new StringBuilder("Failed to delete secondary dex dir ");
                    str2 = file.getPath();
                }
            }
            stringBuilder.append(str2);
            Log.w(str, stringBuilder.toString());
        }
    }
}
