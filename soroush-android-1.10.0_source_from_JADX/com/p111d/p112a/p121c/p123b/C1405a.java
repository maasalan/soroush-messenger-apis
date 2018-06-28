package com.p111d.p112a.p121c.p123b;

import com.p111d.p112a.p114b.C1341a;
import com.p111d.p112a.p121c.C1550w;
import com.p111d.p112a.p121c.C5308b;
import com.p111d.p112a.p121c.p128f.C1453o;
import com.p111d.p112a.p121c.p128f.C1464z;
import com.p111d.p112a.p121c.p131i.C1477e;
import com.p111d.p112a.p121c.p137l.C1513m;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

public final class C1405a implements Serializable {
    private static final TimeZone f4422l = TimeZone.getTimeZone("UTC");
    protected final C1453o f4423a;
    protected final C5308b f4424b;
    protected final C1464z<?> f4425c;
    protected final C1550w f4426d;
    protected final C1513m f4427e;
    protected final C1477e<?> f4428f;
    protected final DateFormat f4429g;
    protected final C1409e f4430h;
    protected final Locale f4431i;
    protected final TimeZone f4432j;
    protected final C1341a f4433k;

    public C1405a(C1453o c1453o, C5308b c5308b, C1464z<?> c1464z, C1550w c1550w, C1513m c1513m, C1477e<?> c1477e, DateFormat dateFormat, C1409e c1409e, Locale locale, TimeZone timeZone, C1341a c1341a) {
        this.f4423a = c1453o;
        this.f4424b = c5308b;
        this.f4425c = c1464z;
        this.f4426d = c1550w;
        this.f4427e = c1513m;
        this.f4428f = c1477e;
        this.f4429g = dateFormat;
        this.f4430h = c1409e;
        this.f4431i = locale;
        this.f4432j = timeZone;
        this.f4433k = c1341a;
    }

    public final C1405a m3416a(C1453o c1453o) {
        if (this.f4423a == c1453o) {
            return this;
        }
        return new C1405a(c1453o, this.f4424b, this.f4425c, this.f4426d, this.f4427e, this.f4428f, this.f4429g, this.f4430h, this.f4431i, this.f4432j, this.f4433k);
    }

    public final C1453o m3417a() {
        return this.f4423a;
    }

    public final C5308b m3418b() {
        return this.f4424b;
    }

    public final C1464z<?> m3419c() {
        return this.f4425c;
    }

    public final C1550w m3420d() {
        return this.f4426d;
    }

    public final C1513m m3421e() {
        return this.f4427e;
    }

    public final C1477e<?> m3422f() {
        return this.f4428f;
    }

    public final DateFormat m3423g() {
        return this.f4429g;
    }

    public final C1409e m3424h() {
        return this.f4430h;
    }

    public final Locale m3425i() {
        return this.f4431i;
    }

    public final TimeZone m3426j() {
        TimeZone timeZone = this.f4432j;
        return timeZone == null ? f4422l : timeZone;
    }

    public final C1341a m3427k() {
        return this.f4433k;
    }
}
