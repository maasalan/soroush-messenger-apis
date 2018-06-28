package pl.droidsonroids.gif;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

final class C7976i extends C7851j {
    C7976i(C7839a c7839a) {
        super(c7839a);
    }

    public final void mo4806a() {
        long a = this.c.f24890f.m22107a(this.c.f24889e);
        if (a >= 0) {
            this.c.f24887c = SystemClock.uptimeMillis() + a;
            if (this.c.isVisible() && this.c.f24886b && !this.c.f24892h) {
                this.c.f24885a.remove(this);
                this.c.f24894j = this.c.f24885a.schedule(this, a, TimeUnit.MILLISECONDS);
            }
            if (!this.c.f24891g.isEmpty() && this.c.f24890f.m22115h() == this.c.f24890f.m22121n() - 1) {
                C7845e c7845e = this.c.f24893i;
                C7839a c7839a = this.c;
                int i = c7839a.f24890f.m22116i();
                if (i != 0) {
                    if (i >= c7839a.f24890f.m22111d()) {
                        i--;
                    }
                }
                c7845e.sendEmptyMessageAtTime(i, this.c.f24887c);
            }
        } else {
            this.c.f24887c = Long.MIN_VALUE;
            this.c.f24886b = false;
        }
        if (this.c.isVisible() && !this.c.f24893i.hasMessages(-1)) {
            this.c.f24893i.sendEmptyMessageAtTime(-1, 0);
        }
    }
}
