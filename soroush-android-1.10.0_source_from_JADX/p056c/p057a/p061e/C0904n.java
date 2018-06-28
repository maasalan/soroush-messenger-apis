package p056c.p057a.p061e;

import java.io.IOException;

public final class C0904n extends IOException {
    public final C0887b f2763a;

    public C0904n(C0887b c0887b) {
        StringBuilder stringBuilder = new StringBuilder("stream was reset: ");
        stringBuilder.append(c0887b);
        super(stringBuilder.toString());
        this.f2763a = c0887b;
    }
}
