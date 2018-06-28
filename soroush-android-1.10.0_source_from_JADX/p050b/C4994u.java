package p050b;

import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URL;

public final class C4994u implements C0845c {
    private WeakReference f13903a;

    public C4994u(ClassLoader classLoader) {
        this.f13903a = new WeakReference(classLoader);
    }

    public final InputStream mo909a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str.replace('.', '/'));
        stringBuilder.append(".class");
        str = stringBuilder.toString();
        ClassLoader classLoader = (ClassLoader) this.f13903a.get();
        return classLoader == null ? null : classLoader.getResourceAsStream(str);
    }

    public final URL mo910b(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str.replace('.', '/'));
        stringBuilder.append(".class");
        str = stringBuilder.toString();
        ClassLoader classLoader = (ClassLoader) this.f13903a.get();
        return classLoader == null ? null : classLoader.getResource(str);
    }

    public final String toString() {
        Object obj = this.f13903a != null ? this.f13903a.get() : null;
        return obj == null ? "<null>" : obj.toString();
    }
}
