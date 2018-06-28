package android.support.v4.p038g;

import android.util.Log;
import java.io.Writer;

public final class C0467e extends Writer {
    private final String f1616a;
    private StringBuilder f1617b = new StringBuilder(128);

    public C0467e(String str) {
        this.f1616a = str;
    }

    private void m981a() {
        if (this.f1617b.length() > 0) {
            Log.d(this.f1616a, this.f1617b.toString());
            this.f1617b.delete(0, this.f1617b.length());
        }
    }

    public final void close() {
        m981a();
    }

    public final void flush() {
        m981a();
    }

    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m981a();
            } else {
                this.f1617b.append(c);
            }
        }
    }
}
