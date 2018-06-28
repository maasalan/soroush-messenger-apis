package mobi.mmdt.ott.view.tools.p478b;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.util.LruCache;
import mobi.mmdt.componentsutils.p232b.p235c.C2478a;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import org.jivesoftware.smack.roster.Roster;

public final class C4484a {
    public static C4484a f12422a;
    public LruCache<Integer, Bitmap> f12423b;

    public C4484a() {
        int round = Math.round((0.2f * ((float) Runtime.getRuntime().maxMemory())) / 1024.0f);
        if (C2478a.m6728a()) {
            StringBuilder stringBuilder = new StringBuilder("Memory cache created (size = ");
            stringBuilder.append(round);
            stringBuilder.append(")");
            C2480b.m6742f(stringBuilder.toString());
        }
        this.f12423b = new LruCache<Integer, Bitmap>(this, round) {
            final /* synthetic */ C4484a f12421a;

            protected final /* synthetic */ int sizeOf(Object obj, Object obj2) {
                Bitmap bitmap = (Bitmap) obj2;
                int byteCount = ((VERSION.SDK_INT >= 12 ? 1 : 0) != 0 ? bitmap.getByteCount() : bitmap.getRowBytes() * bitmap.getHeight()) / Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE;
                return byteCount == 0 ? 1 : byteCount;
            }
        };
    }

    public final void m8175a(Integer num, Bitmap bitmap) {
        if (!(num == null || bitmap == null || this.f12423b == null || this.f12423b.get(num) != null)) {
            this.f12423b.put(num, bitmap);
        }
    }
}
