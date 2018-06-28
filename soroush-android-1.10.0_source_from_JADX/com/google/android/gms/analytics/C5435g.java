package com.google.android.gms.analytics;

import android.content.Context;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class C5435g implements C1661b {
    private final TreeSet<String> f15088a = new TreeSet();

    public C5435g(Context context, Collection<String> collection) {
        m11721a(context, (Collection) collection);
    }

    private static Throwable m11720a(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    private void m11721a(Context context, Collection<String> collection) {
        this.f15088a.clear();
        Set<String> hashSet = new HashSet();
        if (collection != null) {
            hashSet.addAll(collection);
        }
        if (context != null) {
            hashSet.add(context.getApplicationContext().getPackageName());
        }
        for (String str : hashSet) {
            Object obj = 1;
            Iterator it = this.f15088a.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str.startsWith(str2)) {
                    obj = null;
                } else {
                    if (str2.startsWith(str)) {
                        this.f15088a.remove(str2);
                    }
                    if (obj != null) {
                        this.f15088a.add(str);
                    }
                }
            }
            if (obj != null) {
                this.f15088a.add(str);
            }
        }
    }

    public final String mo1534a(String str, Throwable th) {
        StackTraceElement stackTraceElement;
        StringBuilder stringBuilder;
        String[] split;
        String str2;
        Throwable a = C5435g.m11720a(th);
        StackTraceElement[] stackTrace = C5435g.m11720a(th).getStackTrace();
        if (stackTrace != null) {
            if (stackTrace.length != 0) {
                loop0:
                for (StackTraceElement stackTraceElement2 : stackTrace) {
                    String className = stackTraceElement2.getClassName();
                    Iterator it = this.f15088a.iterator();
                    while (it.hasNext()) {
                        if (className.startsWith((String) it.next())) {
                            break loop0;
                        }
                    }
                }
                stackTraceElement2 = stackTrace[0];
                stringBuilder = new StringBuilder();
                stringBuilder.append(a.getClass().getSimpleName());
                if (stackTraceElement2 != null) {
                    split = stackTraceElement2.getClassName().split("\\.");
                    str2 = IjkMediaMeta.IJKM_VAL_TYPE__UNKNOWN;
                    if (split != null && split.length > 0) {
                        str2 = split[split.length - 1];
                    }
                    stringBuilder.append(String.format(" (@%s:%s:%s)", new Object[]{str2, stackTraceElement2.getMethodName(), Integer.valueOf(stackTraceElement2.getLineNumber())}));
                }
                if (str != null) {
                    stringBuilder.append(String.format(" {%s}", new Object[]{str}));
                }
                return stringBuilder.toString();
            }
        }
        stackTraceElement2 = null;
        stringBuilder = new StringBuilder();
        stringBuilder.append(a.getClass().getSimpleName());
        if (stackTraceElement2 != null) {
            split = stackTraceElement2.getClassName().split("\\.");
            str2 = IjkMediaMeta.IJKM_VAL_TYPE__UNKNOWN;
            str2 = split[split.length - 1];
            stringBuilder.append(String.format(" (@%s:%s:%s)", new Object[]{str2, stackTraceElement2.getMethodName(), Integer.valueOf(stackTraceElement2.getLineNumber())}));
        }
        if (str != null) {
            stringBuilder.append(String.format(" {%s}", new Object[]{str}));
        }
        return stringBuilder.toString();
    }
}
