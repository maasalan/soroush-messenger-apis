package p000a.p003b.p004a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;
import org.linphone.core.Privacy;
import p000a.p003b.p004a.C0076k.C0070b;
import p000a.p003b.p004a.p010e.C0043a;
import p000a.p003b.p004a.p010e.C4643b;
import p000a.p003b.p004a.p010e.C4644c;
import p000a.p003b.p004a.p014i.C0061g;
import p000a.p003b.p004a.p014i.C4664o;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class C0054g {
    static final /* synthetic */ boolean f237h = true;
    public final int f238a;
    public final int f239b;
    public final int f240c;
    public final int f241d;
    public final List<C0043a> f242e;
    public final boolean f243f;
    C0076k<C4664o> f244g;
    private String f245i;

    public static class C4648a {
        int f225a;
        int f226b;
        int f227c;
        public boolean f228d;
        List<C0043a> f229e;

        private C4648a() {
        }

        public final C4648a m94a(int i) {
            if (i > InBandBytestreamManager.MAXIMUM_BLOCK_SIZE) {
                StringBuilder stringBuilder = new StringBuilder("UDP payload size must not be greater than 65536, was ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            this.f225a = i;
            return this;
        }
    }

    public enum C0052b {
        UNKNOWN(-1, C4644c.class),
        NSID(3, C4643b.class);
        
        private static Map<Integer, C0052b> f232e;
        public final int f234c;
        public final Class<? extends C0043a> f235d;

        static {
            f232e = new HashMap(C0052b.values().length);
            C0052b[] values = C0052b.values();
            int length = values.length;
            int i;
            while (i < length) {
                C0052b c0052b = values[i];
                f232e.put(Integer.valueOf(c0052b.f234c), c0052b);
                i++;
            }
        }

        private C0052b(int i, Class<? extends C0043a> cls) {
            this.f234c = i;
            this.f235d = cls;
        }

        public static C0052b m95a(int i) {
            C0052b c0052b = (C0052b) f232e.get(Integer.valueOf(i));
            return c0052b == null ? UNKNOWN : c0052b;
        }
    }

    public C0054g(C4648a c4648a) {
        this.f238a = c4648a.f225a;
        this.f239b = c4648a.f226b;
        this.f240c = c4648a.f227c;
        int i = c4648a.f228d ? Privacy.DEFAULT : 0;
        this.f243f = c4648a.f228d;
        this.f241d = i;
        this.f242e = c4648a.f229e != null ? c4648a.f229e : Collections.emptyList();
    }

    public C0054g(C0076k<C4664o> c0076k) {
        if (f237h || c0076k.f341b == C0070b.OPT) {
            this.f238a = c0076k.f343d;
            this.f239b = (int) ((c0076k.f344e >> 8) & 255);
            this.f240c = (int) ((c0076k.f344e >> 16) & 255);
            this.f241d = ((int) c0076k.f344e) & InBandBytestreamManager.MAXIMUM_BLOCK_SIZE;
            this.f243f = (c0076k.f344e & IjkMediaMeta.AV_CH_TOP_BACK_LEFT) > 0;
            this.f242e = ((C4664o) c0076k.f345f).f12826a;
            this.f244g = c0076k;
            return;
        }
        throw new AssertionError();
    }

    public static C4648a m100a() {
        return new C4648a();
    }

    public static C0054g m101a(C0076k<? extends C0061g> c0076k) {
        return c0076k.f341b != C0070b.OPT ? null : new C0054g((C0076k) c0076k);
    }

    public String toString() {
        if (this.f245i == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("EDNS: version: ");
            stringBuilder.append(this.f240c);
            stringBuilder.append(", flags:");
            if (this.f243f) {
                stringBuilder.append(" do");
            }
            stringBuilder.append("; udp: ");
            stringBuilder.append(this.f238a);
            if (!this.f242e.isEmpty()) {
                stringBuilder.append('\n');
                Iterator it = this.f242e.iterator();
                while (it.hasNext()) {
                    C0043a c0043a = (C0043a) it.next();
                    stringBuilder.append(c0043a.mo10a());
                    stringBuilder.append(": ");
                    stringBuilder.append(c0043a.m68c());
                    if (it.hasNext()) {
                        stringBuilder.append('\n');
                    }
                }
            }
            this.f245i = stringBuilder.toString();
        }
        return this.f245i;
    }
}
