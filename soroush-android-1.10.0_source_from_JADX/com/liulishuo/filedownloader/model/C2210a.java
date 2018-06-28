package com.liulishuo.filedownloader.model;

import android.content.ContentValues;
import com.liulishuo.filedownloader.p205h.C2185f;
import java.util.List;
import org.jivesoftware.smackx.message_correct.element.MessageCorrectExtension;

public final class C2210a {
    public int f7305a;
    public int f7306b;
    public long f7307c;
    public long f7308d;
    public long f7309e;

    public static long m6066a(List<C2210a> list) {
        long j = 0;
        for (C2210a c2210a : list) {
            j += c2210a.f7308d - c2210a.f7307c;
        }
        return j;
    }

    public final ContentValues m6067a() {
        ContentValues contentValues = new ContentValues();
        contentValues.put(MessageCorrectExtension.ID_TAG, Integer.valueOf(this.f7305a));
        contentValues.put("connectionIndex", Integer.valueOf(this.f7306b));
        contentValues.put("startOffset", Long.valueOf(this.f7307c));
        contentValues.put("currentOffset", Long.valueOf(this.f7308d));
        contentValues.put("endOffset", Long.valueOf(this.f7309e));
        return contentValues;
    }

    public final String toString() {
        return C2185f.m5996a("id[%d] index[%d] range[%d, %d) current offset(%d)", Integer.valueOf(this.f7305a), Integer.valueOf(this.f7306b), Long.valueOf(this.f7307c), Long.valueOf(this.f7309e), Long.valueOf(this.f7308d));
    }
}
