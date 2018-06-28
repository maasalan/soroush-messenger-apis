package p056c.p057a.p062f;

import java.io.File;
import java.io.IOException;

public interface C0905a {
    public static final C0905a f2764a = new C50251();

    class C50251 implements C0905a {
        C50251() {
        }

        public final void mo984a(File file) {
            if (!file.delete() && file.exists()) {
                StringBuilder stringBuilder = new StringBuilder("failed to delete ");
                stringBuilder.append(file);
                throw new IOException(stringBuilder.toString());
            }
        }
    }

    void mo984a(File file);
}
