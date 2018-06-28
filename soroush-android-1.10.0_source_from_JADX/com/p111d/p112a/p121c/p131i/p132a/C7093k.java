package com.p111d.p112a.p121c.p131i.p132a;

import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.p137l.C1513m;
import org.msgpack.util.TemplatePrecompiler;

public final class C7093k extends C6505j {
    protected final String f20210a;
    protected final String f20211b;

    protected C7093k(C5354j c5354j, C1513m c1513m) {
        super(c5354j, c1513m);
        String name = c5354j.m11531e().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf < 0) {
            this.f20210a = "";
            this.f20211b = TemplatePrecompiler.DEFAULT_DEST;
            return;
        }
        this.f20211b = name.substring(0, lastIndexOf + 1);
        this.f20210a = name.substring(0, lastIndexOf);
    }

    protected final C5354j mo3365a(String str, C1513m c1513m) {
        if (str.startsWith(TemplatePrecompiler.DEFAULT_DEST)) {
            StringBuilder stringBuilder = new StringBuilder(str.length() + this.f20210a.length());
            if (this.f20210a.length() == 0) {
                str = str.substring(1);
            } else {
                stringBuilder.append(this.f20210a);
            }
            stringBuilder.append(str);
            str = stringBuilder.toString();
        }
        return super.mo3365a(str, c1513m);
    }

    public final String mo2913a(Object obj) {
        String name = obj.getClass().getName();
        return name.startsWith(this.f20211b) ? name.substring(this.f20211b.length() - 1) : name;
    }
}
