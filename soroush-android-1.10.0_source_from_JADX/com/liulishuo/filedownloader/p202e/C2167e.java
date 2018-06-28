package com.liulishuo.filedownloader.p202e;

import com.liulishuo.filedownloader.p205h.C2185f;

public final class C2167e extends IllegalAccessException {
    private final String f7239a;
    private final String f7240b;
    private final int f7241c;

    public C2167e(int i, String str, String str2) {
        super(C2185f.m5996a("There is an another running task(%d) with the same downloading path(%s), because of they are with the same target-file-path(%s), so if the current task is started, the path of the file is sure to be written by multiple tasks, it is wrong, then you receive this exception to avoid such conflict.", Integer.valueOf(i), str, str2));
        this.f7241c = i;
        this.f7239a = str;
        this.f7240b = str2;
    }
}
