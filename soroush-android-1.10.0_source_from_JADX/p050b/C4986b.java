package p050b;

import java.io.InputStream;
import java.net.URL;

public final class C4986b implements C0845c {
    private Class f13874a;

    C4986b() {
        this(Object.class);
    }

    public C4986b(Class cls) {
        this.f13874a = cls;
    }

    public final InputStream mo909a(String str) {
        StringBuilder stringBuilder = new StringBuilder("/");
        stringBuilder.append(str.replace('.', '/'));
        stringBuilder.append(".class");
        return this.f13874a.getResourceAsStream(stringBuilder.toString());
    }

    public final URL mo910b(String str) {
        StringBuilder stringBuilder = new StringBuilder("/");
        stringBuilder.append(str.replace('.', '/'));
        stringBuilder.append(".class");
        return this.f13874a.getResource(stringBuilder.toString());
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f13874a.getName());
        stringBuilder.append(".class");
        return stringBuilder.toString();
    }
}
