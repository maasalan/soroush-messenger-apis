package com.liulishuo.filedownloader;

import com.liulishuo.filedownloader.C2135a.C5647a;
import com.liulishuo.filedownloader.C2186h.C2173a;
import com.liulishuo.filedownloader.message.C2202c.C2201b;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.p205h.C2182d;
import java.util.List;

public final class C5677z implements C2201b {
    private boolean m12648a(List<C5647a> list, MessageSnapshot messageSnapshot) {
        if (list.size() > 1 && messageSnapshot.mo3094b() == (byte) -3) {
            for (C5647a c5647a : list) {
                synchronized (c5647a.mo1880K()) {
                    if (c5647a.mo1872C().mo3081c(messageSnapshot)) {
                        C2182d.m5983c(this, "updateMoreLikelyCompleted", new Object[0]);
                        return true;
                    }
                }
            }
        }
        for (C5647a c5647a2 : list) {
            synchronized (c5647a2.mo1880K()) {
                if (c5647a2.mo1872C().mo3079b(messageSnapshot)) {
                    C2182d.m5983c(this, "updateKeepFlow", new Object[0]);
                    return true;
                }
            }
        }
        if ((byte) -4 == messageSnapshot.mo3094b()) {
            for (C5647a c5647a22 : list) {
                synchronized (c5647a22.mo1880K()) {
                    if (c5647a22.mo1872C().mo3083d(messageSnapshot)) {
                        C2182d.m5983c(this, "updateSampleFilePathTaskRunning", new Object[0]);
                        return true;
                    }
                }
            }
        }
        if (list.size() != 1) {
            return false;
        }
        boolean a;
        C5647a c5647a3 = (C5647a) list.get(0);
        synchronized (c5647a3.mo1880K()) {
            C2182d.m5983c(this, "updateKeepAhead", new Object[0]);
            a = c5647a3.mo1872C().mo3077a(messageSnapshot);
        }
        return a;
    }

    public final void mo1966a(MessageSnapshot messageSnapshot) {
        synchronized (Integer.toString(messageSnapshot.f15595a).intern()) {
            List<C5647a> c = C2173a.f7243a.m6029c(messageSnapshot.f15595a);
            if (c.size() > 0) {
                C2135a B = ((C5647a) c.get(0)).mo1871B();
                if (C2182d.f7249a) {
                    C2182d.m5983c(this, "~~~callback %s old[%s] new[%s] %d", Integer.valueOf(messageSnapshot.f15595a), Byte.valueOf(B.mo1911s()), Byte.valueOf(messageSnapshot.mo3094b()), Integer.valueOf(c.size()));
                }
                if (!m12648a(c, messageSnapshot)) {
                    StringBuilder stringBuilder = new StringBuilder("The event isn't consumed, id:");
                    stringBuilder.append(messageSnapshot.f15595a);
                    stringBuilder.append(" status:");
                    stringBuilder.append(messageSnapshot.mo3094b());
                    stringBuilder.append(" task-count:");
                    stringBuilder.append(c.size());
                    StringBuilder stringBuilder2 = new StringBuilder(stringBuilder.toString());
                    for (C5647a c5647a : c) {
                        stringBuilder2.append(" | ");
                        stringBuilder2.append(c5647a.mo1871B().mo1911s());
                    }
                    C2182d.m5982b(this, stringBuilder2.toString(), new Object[0]);
                }
            } else {
                C2182d.m5982b(this, "Receive the event %d, but there isn't any running task in the upper layer", Byte.valueOf(messageSnapshot.mo3094b()));
            }
        }
    }
}
