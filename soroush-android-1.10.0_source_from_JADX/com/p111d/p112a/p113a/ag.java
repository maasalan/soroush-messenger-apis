package com.p111d.p112a.p113a;

public final class ag {

    private static abstract class C5291a<T> extends af<T> {
        protected final Class<?> f14678a;

        protected C5291a(Class<?> cls) {
            this.f14678a = cls;
        }

        public final Class<?> mo1267a() {
            return this.f14678a;
        }

        public boolean mo1268a(af<?> afVar) {
            return afVar.getClass() == getClass() && afVar.mo1267a() == this.f14678a;
        }
    }

    public static abstract class C5292b extends af<Object> {
    }

    public static abstract class C6463c extends C5291a<Object> {
        protected C6463c(Class<?> cls) {
            super(cls);
        }

        public /* bridge */ /* synthetic */ boolean mo1268a(af afVar) {
            return super.mo1268a(afVar);
        }
    }
}
