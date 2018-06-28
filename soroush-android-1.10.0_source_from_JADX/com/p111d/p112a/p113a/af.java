package com.p111d.p112a.p113a;

import java.io.Serializable;

public abstract class af<T> implements Serializable {

    public static final class C1304a implements Serializable {
        public final Class<?> f4102a;
        public final Class<?> f4103b;
        public final Object f4104c;
        private final int f4105d;

        public C1304a(Class<?> cls, Class<?> cls2, Object obj) {
            if (obj == null) {
                throw new IllegalArgumentException("Can not construct IdKey for null key");
            }
            this.f4102a = cls;
            this.f4103b = cls2;
            this.f4104c = obj;
            int hashCode = obj.hashCode() + cls.getName().hashCode();
            if (cls2 != null) {
                hashCode ^= cls2.getName().hashCode();
            }
            this.f4105d = hashCode;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            C1304a c1304a = (C1304a) obj;
            return c1304a.f4104c.equals(this.f4104c) && c1304a.f4102a == this.f4102a && c1304a.f4103b == this.f4103b;
        }

        public final int hashCode() {
            return this.f4105d;
        }

        public final String toString() {
            String str = "[ObjectId: key=%s, type=%s, scope=%s]";
            Object[] objArr = new Object[3];
            objArr[0] = this.f4104c;
            objArr[1] = this.f4102a == null ? "NONE" : this.f4102a.getName();
            objArr[2] = this.f4103b == null ? "NONE" : this.f4103b.getName();
            return String.format(str, objArr);
        }
    }

    public abstract C1304a mo3340a(Object obj);

    public abstract af<T> mo3341a(Class<?> cls);

    public abstract Class<?> mo1267a();

    public abstract boolean mo1268a(af<?> afVar);

    public abstract af<T> mo3342b();

    public abstract T mo3343b(Object obj);
}
