package p000a.p003b.p004a.p005a;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import org.jivesoftware.smack.roster.Roster;
import p000a.p003b.p004a.C0025b;
import p000a.p003b.p004a.C0041d;
import p000a.p003b.p004a.C0076k;

public final class C4626a extends C0025b {
    protected long f12725a;
    protected long f12726b;
    protected long f12727c;
    protected int f76d;
    protected long f12729e;
    protected LinkedHashMap<C0041d, C0041d> f12730f;

    private C4626a() {
        this.f12725a = 0;
        this.f12726b = 0;
        this.f12727c = 0;
        this.f76d = Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE;
        this.f12729e = Long.MAX_VALUE;
        this.f12730f = new LinkedHashMap<C0041d, C0041d>(this, Math.min(1282, 11)) {
            final /* synthetic */ int f78a = Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE;
            final /* synthetic */ C4626a f79b;

            protected final boolean removeEldestEntry(Entry<C0041d, C0041d> entry) {
                return size() > this.f78a;
            }
        };
    }

    public C4626a(byte b) {
        this();
    }

    protected final synchronized void mo1a(C0041d c0041d, C0041d c0041d2) {
        if (c0041d2.f169q > 0) {
            this.f12730f.put(c0041d, c0041d2);
        }
    }

    protected final synchronized C0041d mo2b(C0041d c0041d) {
        C0041d c0041d2 = (C0041d) this.f12730f.get(c0041d);
        if (c0041d2 == null) {
            this.f12725a++;
            return null;
        }
        long j = this.f12729e;
        for (C0076k c0076k : c0041d2.f164l) {
            j = Math.min(j, c0076k.f344e);
        }
        if (c0041d2.f169q + j < System.currentTimeMillis()) {
            this.f12725a++;
            this.f12726b++;
            this.f12730f.remove(c0041d);
            return null;
        }
        this.f12727c++;
        return c0041d2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LRUCache{usage=");
        stringBuilder.append(this.f12730f.size());
        stringBuilder.append("/");
        stringBuilder.append(this.f76d);
        stringBuilder.append(", hits=");
        stringBuilder.append(this.f12727c);
        stringBuilder.append(", misses=");
        stringBuilder.append(this.f12725a);
        stringBuilder.append(", expires=");
        stringBuilder.append(this.f12726b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
