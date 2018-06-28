package com.liulishuo.filedownloader.p205h;

import android.annotation.SuppressLint;
import android.content.Context;
import com.liulishuo.filedownloader.C2231x;
import com.liulishuo.filedownloader.message.C2202c.C2200a;
import com.liulishuo.filedownloader.message.C2203d;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.liulishuo.filedownloader.p198a.C2132b;
import com.liulishuo.filedownloader.p199b.C2137a;
import com.liulishuo.filedownloader.p202e.C2167e;
import com.liulishuo.filedownloader.p204g.C2171a;
import java.io.File;

public final class C2181c {
    @SuppressLint({"StaticFieldLeak"})
    public static Context f7248a;

    public interface C2176a {
        int mo1822a(long j);
    }

    public interface C2177b {
        C2132b mo1823a(String str);
    }

    public interface C2178c {
        C2137a m5971a();
    }

    public interface C2179d {
        int mo1962a(String str, String str2, boolean z);

        int mo1963b(String str, String str2, boolean z);
    }

    public interface C2180e {
        C2171a mo1936a(File file);
    }

    public static boolean m5975a(int i, long j, String str, String str2, C2231x c2231x) {
        if (!(str2 == null || str == null)) {
            int a = c2231x.mo1964a(str, i);
            if (a != 0) {
                C2200a.f7279a.m6048a(C2203d.m6052a(i, j, new C2167e(a, str, str2)));
                return true;
            }
        }
        return false;
    }

    public static boolean m5976a(int i, FileDownloadModel fileDownloadModel, C2231x c2231x, boolean z) {
        if (!c2231x.mo1965a(fileDownloadModel)) {
            return false;
        }
        C2200a.f7279a.m6048a(C2203d.m6051a(i, fileDownloadModel.f7295f.get(), fileDownloadModel.f7296g, z));
        return true;
    }

    public static boolean m5977a(int i, String str, boolean z, boolean z2) {
        if (!(z || str == null)) {
            File file = new File(str);
            if (file.exists()) {
                C2200a.f7279a.m6048a(C2203d.m6053a(i, file, z2));
                return true;
            }
        }
        return false;
    }
}
