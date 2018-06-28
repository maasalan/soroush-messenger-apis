package com.p072b.p073a.p074a.p079f;

import com.p072b.p073a.p074a.p079f.p511a.C5076a;
import com.p072b.p073a.p074a.p079f.p511a.C5077b;
import com.p072b.p073a.p074a.p079f.p511a.C5078c;
import com.p072b.p073a.p074a.p079f.p511a.C5079d;
import com.p072b.p073a.p074a.p079f.p511a.C5080e;
import com.p072b.p073a.p074a.p079f.p511a.C5081f;
import com.p072b.p073a.p074a.p079f.p511a.C5082g;
import com.p072b.p073a.p074a.p079f.p511a.C5083h;
import com.p072b.p073a.p074a.p079f.p511a.C5084i;
import com.p072b.p073a.p074a.p079f.p511a.C5085j;
import com.p072b.p073a.p074a.p079f.p511a.C5086k;
import java.util.HashMap;
import java.util.Map;

public enum C1038i {
    CALLBACK(C5077b.class, 0),
    CANCEL_RESULT_CALLBACK(C5079d.class, 0),
    RUN_JOB(C5084i.class, 0),
    COMMAND(C5080e.class, 0),
    PUBLIC_QUERY(C5083h.class, 0),
    JOB_CONSUMER_IDLE(C5082g.class, 0),
    ADD_JOB(C5076a.class, 1),
    CANCEL(C5078c.class, 1),
    CONSTRAINT_CHANGE(C5081f.class, 2),
    RUN_JOB_RESULT(C5085j.class, 3),
    SCHEDULER(C5086k.class, 4);
    
    static final Map<Class<? extends C1033b>, C1038i> f3353m = null;
    public static final int f3354o = 0;
    final Class<? extends C1033b> f3356l;
    final int f3357n;

    static {
        f3353m = new HashMap();
        C1038i[] values = C1038i.values();
        int length = values.length;
        int i = 0;
        int i2;
        while (i2 < length) {
            C1038i c1038i = values[i2];
            f3353m.put(c1038i.f3356l, c1038i);
            if (c1038i.f3357n > i) {
                i = c1038i.f3357n;
            }
            i2++;
        }
        f3354o = i;
    }

    private C1038i(Class<? extends C1033b> cls, int i) {
        this.f3356l = cls;
        this.f3357n = i;
    }
}
