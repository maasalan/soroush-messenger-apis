package mobi.mmdt.ott.logic.p261a.af.p270a;

import java.io.BufferedInputStream;
import java.io.InputStream;

public final class C2598d {
    InputStream f8455a;
    long f8456b;
    long f8457c = -1;

    public C2598d(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        this.f8455a = inputStream;
    }
}
