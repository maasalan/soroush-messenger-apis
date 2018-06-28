package mobi.mmdt.ott.provider.p381c;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class C2955c<T extends C2955c<?>> {
    public final StringBuilder f9181a = new StringBuilder();
    protected final List<String> f9182b = new ArrayList(5);
    Boolean f9183c;
    String f9184d;
    String f9185e;
    Integer f9186f;
    private final StringBuilder f9187g = new StringBuilder();

    protected static String m7356a(Object obj) {
        return obj instanceof Date ? String.valueOf(((Date) obj).getTime()) : obj instanceof Boolean ? ((Boolean) obj).booleanValue() ? "1" : "0" : obj instanceof Enum ? String.valueOf(((Enum) obj).ordinal()) : String.valueOf(obj);
    }

    protected static Object[] m7357a(Boolean bool) {
        return new Object[]{bool};
    }

    protected static Object[] m7358a(int... iArr) {
        Object[] objArr = new Object[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            objArr[i] = Integer.valueOf(iArr[i]);
        }
        return objArr;
    }

    protected static Object[] m7359a(long... jArr) {
        Object[] objArr = new Object[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            objArr[i] = Long.valueOf(jArr[i]);
        }
        return objArr;
    }

    public final int m7360a(Context context) {
        return context.getContentResolver().delete(m7372g(), this.f9181a.toString(), m7370e());
    }

    public final T m7361a() {
        this.f9181a.append("(");
        return this;
    }

    public final T m7362a(int i) {
        this.f9186f = Integer.valueOf(i);
        return this;
    }

    public final T m7363a(String str, boolean z) {
        if (this.f9187g.length() > 0) {
            this.f9187g.append(",");
        }
        this.f9187g.append(str);
        if (z) {
            this.f9187g.append(" DESC");
        }
        return this;
    }

    protected final void m7364a(String str, Object obj) {
        this.f9181a.append(str);
        this.f9181a.append("<=?");
        this.f9182b.add(C2955c.m7356a(obj));
    }

    protected final void m7365a(String str, Object[] objArr) {
        this.f9181a.append(str);
        if (objArr == null) {
            this.f9181a.append(" IS NULL");
            return;
        }
        int i = 0;
        if (objArr.length > 1) {
            this.f9181a.append(" IN (");
            while (i < objArr.length) {
                this.f9181a.append("?");
                if (i < objArr.length - 1) {
                    this.f9181a.append(",");
                }
                this.f9182b.add(C2955c.m7356a(objArr[i]));
                i++;
            }
            this.f9181a.append(")");
        } else if (objArr[0] == null) {
            this.f9181a.append(" IS NULL");
        } else {
            this.f9181a.append("=?");
            this.f9182b.add(C2955c.m7356a(objArr[0]));
        }
    }

    public final T m7366b() {
        this.f9181a.append(")");
        return this;
    }

    protected final void m7367b(String str, Object[] objArr) {
        this.f9181a.append(str);
        if (objArr == null) {
            this.f9181a.append(" IS NOT NULL");
            return;
        }
        int i = 0;
        if (objArr.length > 1) {
            this.f9181a.append(" NOT IN (");
            while (i < objArr.length) {
                this.f9181a.append("?");
                if (i < objArr.length - 1) {
                    this.f9181a.append(",");
                }
                this.f9182b.add(C2955c.m7356a(objArr[i]));
                i++;
            }
            this.f9181a.append(")");
        } else if (objArr[0] == null) {
            this.f9181a.append(" IS NOT NULL");
        } else {
            this.f9181a.append("<>?");
            this.f9182b.add(C2955c.m7356a(objArr[0]));
        }
    }

    public final T m7368c() {
        this.f9181a.append(" AND ");
        return this;
    }

    public final T m7369d() {
        this.f9181a.append(" OR ");
        return this;
    }

    public final String[] m7370e() {
        int size = this.f9182b.size();
        return size == 0 ? null : (String[]) this.f9182b.toArray(new String[size]);
    }

    public final String m7371f() {
        return this.f9187g.length() > 0 ? this.f9187g.toString() : null;
    }

    public final Uri m7372g() {
        Uri h = mo2223h();
        if (this.f9183c != null) {
            h = C2957d.m7374a(h, this.f9183c.booleanValue());
        }
        if (this.f9184d != null) {
            h = C2957d.m7375d(h, this.f9184d);
        }
        if (this.f9185e != null) {
            h = C2957d.m7376e(h, this.f9185e);
        }
        return this.f9186f != null ? C2957d.m7377f(h, String.valueOf(this.f9186f)) : h;
    }

    public abstract Uri mo2223h();
}
