package com.p111d.p112a.p121c.p124c.p126b;

import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5364l;
import com.p111d.p112a.p121c.p124c.C6485d;
import com.p111d.p112a.p121c.p124c.C6488s;
import com.p111d.p112a.p121c.p124c.C7080c;
import com.p111d.p112a.p121c.p138m.C1534n;
import org.jivesoftware.smack.packet.Message;

public class af extends C7080c {
    public af(C7080c c7080c) {
        super(c7080c);
        this.i = false;
    }

    private af(C7080c c7080c, C1534n c1534n) {
        super((C6485d) c7080c, c1534n);
    }

    public final C1507k<Object> mo2806a(C1534n c1534n) {
        return getClass() != af.class ? this : new af(this, c1534n);
    }

    public final Object a_(C5303j c5303j, C5347g c5347g) {
        if (this.g != null) {
            return mo3331c(c5303j, c5347g);
        }
        if (this.e != null) {
            return this.d.mo1316a(c5347g, this.e.mo1304a(c5303j, c5347g));
        }
        if (this.b.mo3388f()) {
            StringBuilder stringBuilder = new StringBuilder("Can not instantiate abstract type ");
            stringBuilder.append(this.b);
            stringBuilder.append(" (need to add/enable type information?)");
            throw C5364l.m11572a(c5303j, stringBuilder.toString());
        }
        boolean c = this.d.mo1322c();
        boolean h = this.d.mo1303h();
        if (c || h) {
            int i = 0;
            int i2 = 0;
            Object obj = null;
            Object[] objArr = obj;
            while (c5303j.getCurrentToken() != C1380m.END_OBJECT) {
                String currentName = c5303j.getCurrentName();
                C6488s a = this.j.m3463a(currentName);
                c5303j.nextToken();
                int i3;
                if (a != null) {
                    if (obj != null) {
                        a.mo3335a(c5303j, c5347g, obj);
                    } else {
                        if (objArr == null) {
                            int i4 = this.j.f4450b;
                            objArr = new Object[(i4 + i4)];
                        }
                        i3 = i2 + 1;
                        objArr[i2] = a;
                        i2 = i3 + 1;
                        objArr[i3] = a.m15538a(c5303j, c5347g);
                    }
                } else if (Message.ELEMENT.equals(currentName) && c) {
                    obj = this.d.mo1317a(c5347g, c5303j.getText());
                    if (objArr != null) {
                        for (i3 = 0; i3 < i2; i3 += 2) {
                            ((C6488s) objArr[i3]).mo3336a(obj, objArr[i3 + 1]);
                        }
                        objArr = null;
                    }
                } else if (this.m != null && this.m.contains(currentName)) {
                    c5303j.skipChildren();
                } else if (this.l != null) {
                    this.l.m3580a(c5303j, c5347g, obj, currentName);
                } else {
                    mo2807b(c5303j, c5347g, obj, currentName);
                }
                c5303j.nextToken();
            }
            if (obj == null) {
                obj = c ? this.d.mo1317a(c5347g, null) : this.d.mo1300a(c5347g);
                if (objArr != null) {
                    while (i < i2) {
                        ((C6488s) objArr[i]).mo3336a(obj, objArr[i + 1]);
                        i += 2;
                    }
                }
            }
            return obj;
        }
        stringBuilder = new StringBuilder("Can not deserialize Throwable of type ");
        stringBuilder.append(this.b);
        stringBuilder.append(" without having a default contructor, a single-String-arg constructor; or explicit @JsonCreator");
        throw C5364l.m11572a(c5303j, stringBuilder.toString());
    }
}
