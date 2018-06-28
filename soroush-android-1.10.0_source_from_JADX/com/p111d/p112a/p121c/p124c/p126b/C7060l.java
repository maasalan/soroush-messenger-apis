package com.p111d.p112a.p121c.p124c.p126b;

import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5348h;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5364l;
import com.p111d.p112a.p121c.p138m.C1527g;
import com.p111d.p112a.p121c.p540d.C6490b;
import java.io.File;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

public abstract class C7060l<T> extends aa<T> {

    public static class C7269a extends C7060l<Object> {
        protected final int f21005a;

        protected C7269a(Class<?> cls, int i) {
            super(cls);
            this.f21005a = i;
        }

        protected final Object mo3528a(String str, C5347g c5347g) {
            int indexOf;
            int indexOf2;
            switch (this.f21005a) {
                case 1:
                    return new File(str);
                case 2:
                    return new URL(str);
                case 3:
                    return URI.create(str);
                case 4:
                    try {
                        return c5347g.m11447a(str);
                    } catch (Throwable e) {
                        throw c5347g.m11443a(this.y, C1527g.m3953a(e));
                    }
                case 5:
                    return c5347g.mo1297b().m3926b(str);
                case 6:
                    return Currency.getInstance(str);
                case 7:
                    return Pattern.compile(str);
                case 8:
                    indexOf = str.indexOf(95);
                    if (indexOf < 0) {
                        return new Locale(str);
                    }
                    String substring = str.substring(0, indexOf);
                    str = str.substring(indexOf + 1);
                    indexOf2 = str.indexOf(95);
                    return indexOf2 < 0 ? new Locale(substring, str) : new Locale(substring, str.substring(0, indexOf2), str.substring(indexOf2 + 1));
                case 9:
                    return Charset.forName(str);
                case 10:
                    return TimeZone.getTimeZone(str);
                case 11:
                    return InetAddress.getByName(str);
                case 12:
                    if (str.startsWith("[")) {
                        indexOf = str.lastIndexOf(93);
                        if (indexOf == -1) {
                            throw new C6490b(c5347g.m11472k(), "Bracketed IPv6 address must contain closing bracket", str, InetSocketAddress.class);
                        }
                        indexOf2 = str.indexOf(58, indexOf);
                        return new InetSocketAddress(str.substring(0, indexOf + 1), indexOf2 >= 0 ? Integer.parseInt(str.substring(indexOf2 + 1)) : 0);
                    }
                    indexOf2 = str.indexOf(58);
                    if (indexOf2 >= 0) {
                        indexOf = indexOf2 + 1;
                        if (str.indexOf(58, indexOf) < 0) {
                            return new InetSocketAddress(str.substring(0, indexOf2), Integer.parseInt(str.substring(indexOf)));
                        }
                    }
                    return new InetSocketAddress(str, 0);
                default:
                    throw new IllegalArgumentException();
            }
        }

        protected final Object mo3530g() {
            return this.f21005a == 3 ? URI.create("") : super.mo3530g();
        }
    }

    protected C7060l(Class<?> cls) {
        super(cls);
    }

    public static C7269a m18339a(Class<?> cls) {
        int i;
        if (cls == File.class) {
            i = 1;
        } else if (cls == URL.class) {
            i = 2;
        } else if (cls == URI.class) {
            i = 3;
        } else if (cls == Class.class) {
            i = 4;
        } else if (cls == C5354j.class) {
            i = 5;
        } else if (cls == Currency.class) {
            i = 6;
        } else if (cls == Pattern.class) {
            i = 7;
        } else if (cls == Locale.class) {
            i = 8;
        } else if (cls == Charset.class) {
            i = 9;
        } else if (cls == TimeZone.class) {
            i = 10;
        } else if (cls == InetAddress.class) {
            i = 11;
        } else if (cls != InetSocketAddress.class) {
            return null;
        } else {
            i = 12;
        }
        return new C7269a(cls, i);
    }

    public static Class<?>[] m18340f() {
        return new Class[]{File.class, URL.class, URI.class, Class.class, C5354j.class, Currency.class, Pattern.class, Locale.class, Charset.class, TimeZone.class, InetAddress.class, InetSocketAddress.class};
    }

    public final T mo1304a(C5303j c5303j, C5347g c5347g) {
        if (c5303j.getCurrentToken() == C1380m.START_ARRAY && c5347g.m11452a(C5348h.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            c5303j.nextToken();
            T a = mo1304a(c5303j, c5347g);
            if (c5303j.nextToken() == C1380m.END_ARRAY) {
                return a;
            }
            C1380m c1380m = C1380m.END_ARRAY;
            StringBuilder stringBuilder = new StringBuilder("Attempted to unwrap single value array for single '");
            stringBuilder.append(this.y.getName());
            stringBuilder.append("' value but there was more than a single value in the array");
            throw C5347g.m11430a(c5303j, c1380m, stringBuilder.toString());
        }
        String valueAsString = c5303j.getValueAsString();
        Throwable th = null;
        if (valueAsString != null) {
            if (valueAsString.length() != 0) {
                String trim = valueAsString.trim();
                if (trim.length() != 0) {
                    try {
                        T a2 = mo3528a(trim, c5347g);
                        if (a2 != null) {
                            return a2;
                        }
                    } catch (IllegalArgumentException e) {
                        th = e;
                    }
                    valueAsString = "not a valid textual representation";
                    if (th != null) {
                        String message = th.getMessage();
                        if (message != null) {
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append(valueAsString);
                            stringBuilder2.append(", problem: ");
                            stringBuilder2.append(message);
                            valueAsString = stringBuilder2.toString();
                        }
                    }
                    C5364l a3 = c5347g.m11445a(trim, this.y, valueAsString);
                    if (th != null) {
                        a3.initCause(th);
                    }
                    throw a3;
                }
            }
            return mo3530g();
        } else if (c5303j.getCurrentToken() == C1380m.VALUE_EMBEDDED_OBJECT) {
            Object embeddedObject = c5303j.getEmbeddedObject();
            return embeddedObject == null ? null : this.y.isAssignableFrom(embeddedObject.getClass()) ? embeddedObject : mo3527a(embeddedObject, c5347g);
        } else {
            throw c5347g.m11457b(this.y);
        }
    }

    protected T mo3527a(Object obj, C5347g c5347g) {
        throw c5347g.m11446a("Don't know how to convert embedded Object of type %s into %s", obj.getClass().getName(), this.y.getName());
    }

    protected abstract T mo3528a(String str, C5347g c5347g);

    protected T mo3530g() {
        return null;
    }
}
