package com.liulishuo.filedownloader.message;

import com.liulishuo.filedownloader.message.C2202c.C2201b;
import com.liulishuo.filedownloader.p205h.C2175b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public final class C2206e {
    final List<C2205a> f7287a = new ArrayList();
    final C2201b f7288b;

    public class C2205a {
        final List<Integer> f7284a = new ArrayList();
        final /* synthetic */ C2206e f7285b;
        private final Executor f7286c;

        public C2205a(C2206e c2206e, int i) {
            this.f7285b = c2206e;
            StringBuilder stringBuilder = new StringBuilder("Flow-");
            stringBuilder.append(i);
            this.f7286c = C2175b.m5967a(1, stringBuilder.toString());
        }

        public final void m6056a(final MessageSnapshot messageSnapshot) {
            this.f7286c.execute(new Runnable(this) {
                final /* synthetic */ C2205a f7283b;

                public final void run() {
                    this.f7283b.f7285b.f7288b.mo1966a(messageSnapshot);
                    this.f7283b.f7284a.remove(Integer.valueOf(messageSnapshot.f15595a));
                }
            });
        }
    }

    C2206e(C2201b c2201b) {
        this.f7288b = c2201b;
        for (int i = 0; i < 5; i++) {
            this.f7287a.add(new C2205a(this, i));
        }
    }
}
