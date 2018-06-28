package com.p085c.p086a.p089c;

import com.p085c.p086a.p089c.C1206f.C1205a;
import com.p085c.p086a.p089c.p092b.p093a.C1104b;
import com.p085c.p086a.p089c.p098d.p099a.C1190p;
import java.io.InputStream;
import java.util.List;

public final class C1207g {
    public static C1205a m2862a(List<C1206f> list, InputStream inputStream, C1104b c1104b) {
        if (inputStream == null) {
            return C1205a.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C1190p(inputStream, c1104b);
        }
        inputStream.mark(5242880);
        for (C1206f a : list) {
            try {
                C1205a a2 = a.mo1208a(inputStream);
                if (a2 != C1205a.UNKNOWN) {
                    inputStream.reset();
                    return a2;
                }
                inputStream.reset();
            } catch (Throwable th) {
                inputStream.reset();
            }
        }
        return C1205a.UNKNOWN;
    }

    public static int m2863b(List<C1206f> list, InputStream inputStream, C1104b c1104b) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C1190p(inputStream, c1104b);
        }
        inputStream.mark(5242880);
        for (C1206f a : list) {
            try {
                int a2 = a.mo1207a(inputStream, c1104b);
                if (a2 != -1) {
                    inputStream.reset();
                    return a2;
                }
                inputStream.reset();
            } catch (Throwable th) {
                inputStream.reset();
            }
        }
        return -1;
    }
}
