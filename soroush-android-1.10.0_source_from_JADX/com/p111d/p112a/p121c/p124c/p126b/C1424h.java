package com.p111d.p112a.p121c.p124c.p126b;

import com.p111d.p112a.p113a.C1320j.C1319d;
import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5348h;
import com.p111d.p112a.p121c.p122a.C1387a;
import com.p111d.p112a.p121c.p124c.C1434i;
import com.p111d.p112a.p121c.p138m.C1539t;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.TimeZone;

public final class C1424h {
    private static final HashSet<String> f4507a = new HashSet();

    protected static abstract class C7057b<T> extends aa<T> implements C1434i {
        protected final DateFormat f20154b;
        protected final String f20155c;

        protected C7057b(C7057b<T> c7057b, DateFormat dateFormat, String str) {
            super(c7057b.y);
            this.f20154b = dateFormat;
            this.f20155c = str;
        }

        protected C7057b(Class<?> cls) {
            super(cls);
            this.f20154b = null;
            this.f20155c = null;
        }

        protected abstract C7057b<T> mo3529a(DateFormat dateFormat, String str);

        public C1507k<?> mo2801a(C5347g c5347g, C1446d c1446d) {
            if (c1446d != null) {
                C1319d findFormat = c5347g.m11468g().findFormat(c1446d.mo1354c());
                if (findFormat != null) {
                    TimeZone b = findFormat.m3115b();
                    if (findFormat.m3116c()) {
                        String str = findFormat.f4139a;
                        DateFormat simpleDateFormat = new SimpleDateFormat(str, findFormat.m3117d() ? findFormat.f4141c : c5347g.m11469h());
                        if (b == null) {
                            b = c5347g.m11470i();
                        }
                        simpleDateFormat.setTimeZone(b);
                        return mo3529a(simpleDateFormat, str);
                    } else if (b != null) {
                        DateFormat a;
                        DateFormat q = c5347g.m11460c().m11093q();
                        if (q.getClass() == C1539t.class) {
                            a = ((C1539t) q).m4025a(b).m4024a(findFormat.m3117d() ? findFormat.f4141c : c5347g.m11469h());
                        } else {
                            a = (DateFormat) q.clone();
                            a.setTimeZone(b);
                        }
                        return mo3529a(a, this.f20155c);
                    }
                }
            }
            return this;
        }

        protected final Date mo3345b(C5303j c5303j, C5347g c5347g) {
            if (this.f20154b != null) {
                C1380m currentToken = c5303j.getCurrentToken();
                Date parse;
                if (currentToken == C1380m.VALUE_STRING) {
                    String trim = c5303j.getText().trim();
                    if (trim.length() == 0) {
                        return (Date) mo3346b(c5347g);
                    }
                    synchronized (this.f20154b) {
                        try {
                            parse = this.f20154b.parse(trim);
                        } catch (ParseException e) {
                            StringBuilder stringBuilder = new StringBuilder("Failed to parse Date value '");
                            stringBuilder.append(trim);
                            stringBuilder.append("' (format: \"");
                            stringBuilder.append(this.f20155c);
                            stringBuilder.append("\"): ");
                            stringBuilder.append(e.getMessage());
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    return parse;
                } else if (currentToken == C1380m.START_ARRAY && c5347g.m11452a(C5348h.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                    c5303j.nextToken();
                    parse = mo3345b(c5303j, c5347g);
                    if (c5303j.nextToken() == C1380m.END_ARRAY) {
                        return parse;
                    }
                    throw C5347g.m11430a(c5303j, C1380m.END_ARRAY, "Attempted to unwrap single value array for single 'java.util.Date' value but there was more than a single value in the array");
                }
            }
            return super.mo3345b(c5303j, c5347g);
        }
    }

    @C1387a
    public static class C7265a extends C7057b<Calendar> {
        protected final Class<? extends Calendar> f21003a;

        public C7265a() {
            super(Calendar.class);
            this.f21003a = null;
        }

        private C7265a(C7265a c7265a, DateFormat dateFormat, String str) {
            super(c7265a, dateFormat, str);
            this.f21003a = c7265a.f21003a;
        }

        public C7265a(Class<? extends Calendar> cls) {
            super(cls);
            this.f21003a = cls;
        }

        private Calendar m19369c(C5303j c5303j, C5347g c5347g) {
            Date b = mo3345b(c5303j, c5347g);
            if (b == null) {
                return null;
            }
            if (this.f21003a == null) {
                return c5347g.m11448a(b);
            }
            try {
                Calendar calendar = (Calendar) this.f21003a.newInstance();
                calendar.setTimeInMillis(b.getTime());
                TimeZone i = c5347g.m11470i();
                if (i != null) {
                    calendar.setTimeZone(i);
                }
                return calendar;
            } catch (Throwable e) {
                throw c5347g.m11443a(this.f21003a, e);
            }
        }

        protected final /* synthetic */ C7057b mo3529a(DateFormat dateFormat, String str) {
            return new C7265a(this, dateFormat, str);
        }

        public final /* synthetic */ Object mo1304a(C5303j c5303j, C5347g c5347g) {
            return m19369c(c5303j, c5347g);
        }
    }

    public static class C7266c extends C7057b<Date> {
        public static final C7266c f21004a = new C7266c();

        public C7266c() {
            super(Date.class);
        }

        private C7266c(C7266c c7266c, DateFormat dateFormat, String str) {
            super(c7266c, dateFormat, str);
        }

        protected final /* synthetic */ C7057b mo3529a(DateFormat dateFormat, String str) {
            return new C7266c(this, dateFormat, str);
        }

        public final /* synthetic */ Object mo1304a(C5303j c5303j, C5347g c5347g) {
            return mo3345b(c5303j, c5347g);
        }
    }

    public static class C7267d extends C7057b<java.sql.Date> {
        public C7267d() {
            super(java.sql.Date.class);
        }

        private C7267d(C7267d c7267d, DateFormat dateFormat, String str) {
            super(c7267d, dateFormat, str);
        }

        protected final /* synthetic */ C7057b mo3529a(DateFormat dateFormat, String str) {
            return new C7267d(this, dateFormat, str);
        }

        public final /* synthetic */ Object mo1304a(C5303j c5303j, C5347g c5347g) {
            Date b = mo3345b(c5303j, c5347g);
            return b == null ? null : new java.sql.Date(b.getTime());
        }
    }

    public static class C7268e extends C7057b<Timestamp> {
        public C7268e() {
            super(Timestamp.class);
        }

        private C7268e(C7268e c7268e, DateFormat dateFormat, String str) {
            super(c7268e, dateFormat, str);
        }

        protected final /* synthetic */ C7057b mo3529a(DateFormat dateFormat, String str) {
            return new C7268e(this, dateFormat, str);
        }

        public final /* synthetic */ Object mo1304a(C5303j c5303j, C5347g c5347g) {
            return new Timestamp(mo3345b(c5303j, c5347g).getTime());
        }
    }

    static {
        r1 = new Class[5];
        int i = 0;
        r1[0] = Calendar.class;
        r1[1] = GregorianCalendar.class;
        r1[2] = java.sql.Date.class;
        r1[3] = Date.class;
        r1[4] = Timestamp.class;
        while (i < 5) {
            f4507a.add(r1[i].getName());
            i++;
        }
    }

    public static C1507k<?> m3520a(Class<?> cls, String str) {
        if (f4507a.contains(str)) {
            if (cls == Calendar.class) {
                return new C7265a();
            }
            if (cls == Date.class) {
                return C7266c.f21004a;
            }
            if (cls == java.sql.Date.class) {
                return new C7267d();
            }
            if (cls == Timestamp.class) {
                return new C7268e();
            }
            if (cls == GregorianCalendar.class) {
                return new C7265a(GregorianCalendar.class);
            }
        }
        return null;
    }
}
