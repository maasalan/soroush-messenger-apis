package com.p111d.p112a.p121c.p131i;

import com.p111d.p112a.p113a.aa.C1301a;
import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5354j;

public abstract class C1475c {
    public static Object m3771a(C5303j c5303j, C5354j c5354j) {
        Class e = c5354j.m11531e();
        C1380m currentToken = c5303j.getCurrentToken();
        if (currentToken != null) {
            switch (currentToken) {
                case VALUE_STRING:
                    if (e.isAssignableFrom(String.class)) {
                        return c5303j.getText();
                    }
                    break;
                case VALUE_NUMBER_INT:
                    if (e.isAssignableFrom(Integer.class)) {
                        return Integer.valueOf(c5303j.getIntValue());
                    }
                    break;
                case VALUE_NUMBER_FLOAT:
                    if (e.isAssignableFrom(Double.class)) {
                        return Double.valueOf(c5303j.getDoubleValue());
                    }
                    break;
                case VALUE_TRUE:
                    if (e.isAssignableFrom(Boolean.class)) {
                        return Boolean.TRUE;
                    }
                    break;
                case VALUE_FALSE:
                    if (e.isAssignableFrom(Boolean.class)) {
                        return Boolean.FALSE;
                    }
                    break;
                default:
                    break;
            }
        }
        return null;
    }

    public abstract C1301a mo2894a();

    public abstract C1475c mo2895a(C1446d c1446d);

    public abstract Object mo2896a(C5303j c5303j, C5347g c5347g);

    public abstract Object mo2897b(C5303j c5303j, C5347g c5347g);

    public abstract String mo1452b();

    public abstract C1476d mo1453c();

    public abstract Object mo2898c(C5303j c5303j, C5347g c5347g);

    public abstract Class<?> mo1454d();

    public abstract Object mo2899d(C5303j c5303j, C5347g c5347g);
}
