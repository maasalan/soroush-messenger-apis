package pl.droidsonroids.gif;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Iterator;

final class C7845e extends Handler {
    private final WeakReference<C7839a> f24933a;

    public C7845e(C7839a c7839a) {
        super(Looper.getMainLooper());
        this.f24933a = new WeakReference(c7839a);
    }

    public final void handleMessage(Message message) {
        C7839a c7839a = (C7839a) this.f24933a.get();
        if (c7839a != null) {
            if (message.what == -1) {
                c7839a.invalidateSelf();
                return;
            }
            Iterator it = c7839a.f24891g.iterator();
            while (it.hasNext()) {
                it.next();
                int i = message.what;
            }
        }
    }
}
