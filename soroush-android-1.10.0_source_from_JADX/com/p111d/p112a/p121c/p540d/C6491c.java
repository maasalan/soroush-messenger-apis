package com.p111d.p112a.p121c.p540d;

import com.p111d.p112a.p114b.C1375h;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C5364l;
import java.io.Closeable;
import java.util.Collection;
import java.util.Iterator;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public abstract class C6491c extends C5364l {
    protected final Class<?> f17715d;
    protected final String f17716e;
    protected final Collection<Object> f17717f;
    protected transient String f17718g;

    protected C6491c(C5303j c5303j, String str, C1375h c1375h, Class<?> cls, String str2, Collection<Object> collection) {
        super((Closeable) c5303j, str, c1375h);
        this.f17715d = cls;
        this.f17716e = str2;
        this.f17717f = collection;
    }

    public final String mo2815c() {
        String str = this.f17718g;
        if (str != null || this.f17717f == null) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder(100);
        int size = this.f17717f.size();
        if (size == 1) {
            stringBuilder.append(" (one known property: \"");
            stringBuilder.append(String.valueOf(this.f17717f.iterator().next()));
            stringBuilder.append('\"');
        } else {
            stringBuilder.append(" (");
            stringBuilder.append(size);
            stringBuilder.append(" known properties: ");
            Iterator it = this.f17717f.iterator();
            while (it.hasNext()) {
                stringBuilder.append('\"');
                stringBuilder.append(String.valueOf(it.next()));
                stringBuilder.append('\"');
                if (stringBuilder.length() > IjkMediaCodecInfo.RANK_MAX) {
                    stringBuilder.append(" [truncated]");
                    break;
                } else if (it.hasNext()) {
                    stringBuilder.append(", ");
                }
            }
        }
        stringBuilder.append("])");
        str = stringBuilder.toString();
        this.f17718g = str;
        return str;
    }
}
