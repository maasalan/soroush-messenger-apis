package com.p111d.p112a.p121c;

import com.p111d.p112a.p113a.C1320j.C1319d;
import com.p111d.p112a.p113a.af;
import com.p111d.p112a.p113a.ah;
import com.p111d.p112a.p114b.C1341a;
import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.p123b.C1407c;
import com.p111d.p112a.p121c.p123b.C5306f;
import com.p111d.p112a.p121c.p124c.C1434i;
import com.p111d.p112a.p121c.p124c.C1435j;
import com.p111d.p112a.p121c.p124c.C1436m;
import com.p111d.p112a.p121c.p124c.C1437n;
import com.p111d.p112a.p121c.p124c.C1440q;
import com.p111d.p112a.p121c.p124c.p125a.C1421s;
import com.p111d.p112a.p121c.p124c.p125a.C5315u;
import com.p111d.p112a.p121c.p131i.C1475c;
import com.p111d.p112a.p121c.p133j.C1480j;
import com.p111d.p112a.p121c.p137l.C1513m;
import com.p111d.p112a.p121c.p138m.C1519b;
import com.p111d.p112a.p121c.p138m.C1533m;
import com.p111d.p112a.p121c.p138m.C1535o;
import com.p111d.p112a.p121c.p540d.C6490b;
import com.p111d.p112a.p121c.p540d.C7085d;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.jivesoftware.smack.tcp.XMPPTCPConnection.PacketWriter;

public abstract class C5347g extends C1448e implements Serializable {
    protected final C1436m f14854a;
    protected final C1437n f14855b;
    protected final C7089f f14856c;
    protected final int f14857d;
    protected final Class<?> f14858e;
    protected transient C5303j f14859f;
    protected final C1479i f14860g;
    protected transient C1519b f14861h;
    protected transient C1535o f14862i;
    protected transient DateFormat f14863j;
    protected transient C1407c f14864k;
    protected C1533m<C5354j> f14865l;

    protected C5347g(C1437n c1437n) {
        if (c1437n == null) {
            throw new IllegalArgumentException("Can not pass null DeserializerFactory");
        }
        this.f14855b = c1437n;
        this.f14854a = new C1436m();
        this.f14857d = 0;
        this.f14856c = null;
        this.f14860g = null;
        this.f14858e = null;
        this.f14864k = null;
    }

    protected C5347g(C5347g c5347g, C7089f c7089f, C5303j c5303j, C1479i c1479i) {
        this.f14854a = c5347g.f14854a;
        this.f14855b = c5347g.f14855b;
        this.f14856c = c7089f;
        this.f14857d = c7089f.m18518f();
        this.f14858e = c7089f.m15417w();
        this.f14859f = c5303j;
        this.f14860g = c1479i;
        this.f14864k = c7089f.m15418x();
    }

    public static C5364l m11430a(C5303j c5303j, C1380m c1380m, String str) {
        String format = String.format("Unexpected token (%s), expected %s", new Object[]{c5303j.getCurrentToken(), c1380m});
        if (str != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(format);
            stringBuilder.append(": ");
            stringBuilder.append(str);
            format = stringBuilder.toString();
        }
        return C5364l.m11572a(c5303j, format);
    }

    private String m11431c(Class<?> cls) {
        if (!cls.isArray()) {
            return cls.getName();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(m11431c(cls.getComponentType()));
        stringBuilder.append("[]");
        return stringBuilder.toString();
    }

    private static String m11432d(String str) {
        if (str == null) {
            return "[N/A]";
        }
        if (str.length() > PacketWriter.QUEUE_SIZE) {
            return String.format("\"%s]...[%s\"", new Object[]{str.substring(0, PacketWriter.QUEUE_SIZE), str.substring(str.length() - PacketWriter.QUEUE_SIZE)});
        }
        StringBuilder stringBuilder = new StringBuilder("\"");
        stringBuilder.append(str);
        stringBuilder.append("\"");
        return stringBuilder.toString();
    }

    public final /* bridge */ /* synthetic */ C5306f mo1296a() {
        return this.f14856c;
    }

    public abstract C1421s mo2811a(Object obj, af<?> afVar, ah ahVar);

    public final C5354j m11435a(Class<?> cls) {
        return this.f14856c.m11079b(cls);
    }

    public final C1507k<Object> m11436a(C5354j c5354j) {
        return this.f14854a.m3551a(this, this.f14855b, c5354j);
    }

    public final C1507k<Object> m11437a(C5354j c5354j, C1446d c1446d) {
        C1507k<Object> a = this.f14854a.m3551a(this, this.f14855b, c5354j);
        return a != null ? m11455b(a, c1446d, c5354j) : a;
    }

    public final C1507k<?> m11438a(C1507k<?> c1507k, C1446d c1446d, C5354j c5354j) {
        if (!(c1507k instanceof C1434i)) {
            return c1507k;
        }
        this.f14865l = new C1533m(c5354j, this.f14865l);
        try {
            c1507k = ((C1434i) c1507k).mo2801a(this, c1446d);
            return c1507k;
        } finally {
            this.f14865l = this.f14865l.f4778b;
        }
    }

    public final C5364l m11439a(C5354j c5354j, String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder("Could not resolve type id '");
        stringBuilder.append(str);
        stringBuilder.append("' into a subtype of ");
        stringBuilder.append(c5354j);
        String stringBuilder2 = stringBuilder.toString();
        if (str2 != null) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(stringBuilder2);
            stringBuilder3.append(": ");
            stringBuilder3.append(str2);
            stringBuilder2 = stringBuilder3.toString();
        }
        return C5364l.m11572a(this.f14859f, stringBuilder2);
    }

    public final C5364l m11440a(Class<?> cls, C1380m c1380m) {
        return C5364l.m11572a(this.f14859f, String.format("Can not deserialize instance of %s out of %s token", new Object[]{m11431c((Class) cls), c1380m}));
    }

    public final C5364l m11441a(Class<?> cls, String str) {
        return C5364l.m11572a(this.f14859f, String.format("Can not construct instance of %s, problem: %s", new Object[]{cls.getName(), str}));
    }

    public final C5364l m11442a(Class<?> cls, String str, String str2) {
        return C6490b.m15564a(this.f14859f, String.format("Can not construct Map key of type %s from String (%s): %s", new Object[]{cls.getName(), C5347g.m11432d(str), str2}), str, cls);
    }

    public final C5364l m11443a(Class<?> cls, Throwable th) {
        return C5364l.m11573a(this.f14859f, String.format("Can not construct instance of %s, problem: %s", new Object[]{cls.getName(), th.getMessage()}), th);
    }

    public final C5364l m11444a(Number number, Class<?> cls, String str) {
        return C6490b.m15564a(this.f14859f, String.format("Can not construct instance of %s from number value (%s): %s", new Object[]{cls.getName(), String.valueOf(number), str}), number, cls);
    }

    public final C5364l m11445a(String str, Class<?> cls, String str2) {
        return C6490b.m15564a(this.f14859f, String.format("Can not construct instance of %s from String value (%s): %s", new Object[]{cls.getName(), C5347g.m11432d(str), str2}), str, cls);
    }

    public final C5364l m11446a(String str, Object... objArr) {
        return C5364l.m11572a(this.f14859f, String.format(str, objArr));
    }

    public final Class<?> m11447a(String str) {
        return this.f14856c.m11092p().m3925a(str);
    }

    public final Calendar m11448a(Date date) {
        Calendar instance = Calendar.getInstance(this.f14856c.m11095s());
        instance.setTime(date);
        return instance;
    }

    public final void m11449a(C1535o c1535o) {
        if (this.f14862i == null || c1535o.m4012b() >= this.f14862i.m4012b()) {
            this.f14862i = c1535o;
        }
    }

    public final void m11450a(Object obj, String str, C1507k<?> c1507k) {
        if (m11452a(C5348h.FAIL_ON_UNKNOWN_PROPERTIES)) {
            throw C7085d.m18466a(this.f14859f, obj, str, c1507k == null ? null : c1507k.mo2808c());
        }
    }

    public final boolean m11451a(int i) {
        return (i & this.f14857d) != 0;
    }

    public final boolean m11452a(C5348h c5348h) {
        return (c5348h.f14891y & this.f14857d) != 0;
    }

    public final boolean m11453a(C5385q c5385q) {
        return this.f14856c.m11077a(c5385q);
    }

    public final C1507k<Object> m11454b(C5354j c5354j) {
        C1507k a = this.f14854a.m3551a(this, this.f14855b, c5354j);
        if (a == null) {
            return null;
        }
        C1507k<Object> b = m11455b(a, null, c5354j);
        C1475c a2 = this.f14855b.mo1338a(this.f14856c, c5354j);
        return a2 != null ? new C5315u(a2.mo2895a(null), b) : b;
    }

    public final C1507k<?> m11455b(C1507k<?> c1507k, C1446d c1446d, C5354j c5354j) {
        if (!(c1507k instanceof C1434i)) {
            return c1507k;
        }
        this.f14865l = new C1533m(c5354j, this.f14865l);
        try {
            c1507k = ((C1434i) c1507k).mo2801a(this, c1446d);
            return c1507k;
        } finally {
            this.f14865l = this.f14865l.f4778b;
        }
    }

    public final C1513m mo1297b() {
        return this.f14856c.m11092p();
    }

    public final C5364l m11457b(Class<?> cls) {
        return m11440a((Class) cls, this.f14859f.getCurrentToken());
    }

    public final Object m11458b(Object obj) {
        if (this.f14860g != null) {
            return this.f14860g.m3807a();
        }
        StringBuilder stringBuilder = new StringBuilder("No 'injectableValues' configured, can not inject value with id [");
        stringBuilder.append(obj);
        stringBuilder.append("]");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final Date m11459b(String str) {
        try {
            DateFormat dateFormat;
            if (this.f14863j != null) {
                dateFormat = this.f14863j;
            } else {
                dateFormat = (DateFormat) this.f14856c.m11093q().clone();
                this.f14863j = dateFormat;
            }
            return dateFormat.parse(str);
        } catch (ParseException e) {
            throw new IllegalArgumentException(String.format("Failed to parse Date value '%s': %s", new Object[]{str, e.getMessage()}));
        }
    }

    public final C7089f m11460c() {
        return this.f14856c;
    }

    public abstract C1507k<Object> mo2812c(Object obj);

    public final C5364l m11462c(String str) {
        return C5364l.m11572a(this.f14859f, str);
    }

    public final C1546p m11463c(C5354j c5354j) {
        C1546p a = this.f14855b.mo1347a(this, c5354j);
        if (a == null) {
            StringBuilder stringBuilder = new StringBuilder("Can not find a (Map) Key deserializer for type ");
            stringBuilder.append(c5354j);
            throw C5364l.m11574a(this, stringBuilder.toString());
        }
        if (a instanceof C1440q) {
            ((C1440q) a).mo2802c(this);
        }
        return a instanceof C1435j ? ((C1435j) a).m3545a() : a;
    }

    public abstract C1546p mo2813d(Object obj);

    public final Class<?> m11465d() {
        return this.f14858e;
    }

    public final boolean m11466e() {
        return this.f14856c.m11086j();
    }

    public final C1319d m11467f() {
        return this.f14856c.mo3362d();
    }

    public final C5308b m11468g() {
        return this.f14856c.mo3358a();
    }

    public final Locale m11469h() {
        return this.f14856c.m11094r();
    }

    public final TimeZone m11470i() {
        return this.f14856c.m11095s();
    }

    public final int m11471j() {
        return this.f14857d;
    }

    public final C5303j m11472k() {
        return this.f14859f;
    }

    public final C1341a m11473l() {
        return this.f14856c.m11096t();
    }

    public final C1480j m11474m() {
        return this.f14856c.m18520h();
    }

    public abstract void mo2814n();

    public final C1535o m11476o() {
        C1535o c1535o = this.f14862i;
        if (c1535o == null) {
            return new C1535o();
        }
        this.f14862i = null;
        return c1535o;
    }

    public final C1519b m11477p() {
        if (this.f14861h == null) {
            this.f14861h = new C1519b();
        }
        return this.f14861h;
    }

    public final boolean m11478q() {
        this.f14856c.m18519g();
        return false;
    }
}
