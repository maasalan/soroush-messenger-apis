package pl.droidsonroids.gif;

import java.io.IOException;
import java.util.Locale;

public class GifIOException extends IOException {
    public final C7840b f24880a;

    GifIOException(int i) {
        this(C7840b.m22127a(i));
    }

    private GifIOException(C7840b c7840b) {
        super(String.format(Locale.ENGLISH, "GifError %d: %s", new Object[]{Integer.valueOf(c7840b.f24927w), c7840b.f24926v}));
        this.f24880a = c7840b;
    }
}
