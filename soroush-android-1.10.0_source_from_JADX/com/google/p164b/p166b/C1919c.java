package com.google.p164b.p166b;

import com.google.p164b.C1942h;
import com.google.p164b.C5591l;
import com.google.p164b.p166b.C1919c;
import com.google.p164b.p169c.C1933a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public final class C1919c {
    private final Map<Type, C1942h<?>> f6394a;

    class C55662 implements C1928h<T> {
        final /* synthetic */ C1919c f15403a;

        C55662(C1919c c1919c) {
            this.f15403a = c1919c;
        }

        public final T mo1748a() {
            return new ConcurrentHashMap();
        }
    }

    class C55673 implements C1928h<T> {
        final /* synthetic */ C1919c f15404a;

        C55673(C1919c c1919c) {
            this.f15404a = c1919c;
        }

        public final T mo1748a() {
            return new TreeMap();
        }
    }

    class C55684 implements C1928h<T> {
        final /* synthetic */ C1919c f15405a;

        C55684(C1919c c1919c) {
            this.f15405a = c1919c;
        }

        public final T mo1748a() {
            return new LinkedHashMap();
        }
    }

    class C55695 implements C1928h<T> {
        final /* synthetic */ C1919c f15406a;

        C55695(C1919c c1919c) {
            this.f15406a = c1919c;
        }

        public final T mo1748a() {
            return new C1927g();
        }
    }

    class C55739 implements C1928h<T> {
        final /* synthetic */ C1919c f15416a;

        C55739(C1919c c1919c) {
            this.f15416a = c1919c;
        }

        public final T mo1748a() {
            return new TreeSet();
        }
    }

    public C1919c(Map<Type, C1942h<?>> map) {
        this.f6394a = map;
    }

    private <T> com.google.p164b.p166b.C1928h<T> m5266a(java.lang.Class<? super T> r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r1 = this;
        r0 = 0;
        r0 = new java.lang.Class[r0];	 Catch:{ NoSuchMethodException -> 0x0017 }
        r2 = r2.getDeclaredConstructor(r0);	 Catch:{ NoSuchMethodException -> 0x0017 }
        r0 = r2.isAccessible();	 Catch:{ NoSuchMethodException -> 0x0017 }
        if (r0 != 0) goto L_0x0011;	 Catch:{ NoSuchMethodException -> 0x0017 }
    L_0x000d:
        r0 = 1;	 Catch:{ NoSuchMethodException -> 0x0017 }
        r2.setAccessible(r0);	 Catch:{ NoSuchMethodException -> 0x0017 }
    L_0x0011:
        r0 = new com.google.b.b.c$8;	 Catch:{ NoSuchMethodException -> 0x0017 }
        r0.<init>(r1, r2);	 Catch:{ NoSuchMethodException -> 0x0017 }
        return r0;
    L_0x0017:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.b.b.c.a(java.lang.Class):com.google.b.b.h<T>");
    }

    public final <T> C1928h<T> m5267a(C1933a<T> c1933a) {
        final Type type = c1933a.f6423b;
        final Class cls = c1933a.f6422a;
        final C1942h c1942h = (C1942h) this.f6394a.get(type);
        if (c1942h != null) {
            return new C1928h<T>(this) {
                final /* synthetic */ C1919c f15402c;

                public final T mo1748a() {
                    return c1942h.m5352a();
                }
            };
        }
        c1942h = (C1942h) this.f6394a.get(cls);
        if (c1942h != null) {
            return new C1928h<T>(this) {
                final /* synthetic */ C1919c f15413c;

                public final T mo1748a() {
                    return c1942h.m5352a();
                }
            };
        }
        C1928h<T> a = m5266a(cls);
        if (a != null) {
            return a;
        }
        a = Collection.class.isAssignableFrom(cls) ? SortedSet.class.isAssignableFrom(cls) ? new C55739(this) : EnumSet.class.isAssignableFrom(cls) ? new C1928h<T>(this) {
            final /* synthetic */ C1919c f15395b;

            public final T mo1748a() {
                if (type instanceof ParameterizedType) {
                    Type type = ((ParameterizedType) type).getActualTypeArguments()[0];
                    if (type instanceof Class) {
                        return EnumSet.noneOf((Class) type);
                    }
                    StringBuilder stringBuilder = new StringBuilder("Invalid EnumSet type: ");
                    stringBuilder.append(type.toString());
                    throw new C5591l(stringBuilder.toString());
                }
                stringBuilder = new StringBuilder("Invalid EnumSet type: ");
                stringBuilder.append(type.toString());
                throw new C5591l(stringBuilder.toString());
            }
        } : Set.class.isAssignableFrom(cls) ? new C1928h<T>(this) {
            final /* synthetic */ C1919c f15396a;

            {
                this.f15396a = r1;
            }

            public final T mo1748a() {
                return new LinkedHashSet();
            }
        } : Queue.class.isAssignableFrom(cls) ? new C1928h<T>(this) {
            final /* synthetic */ C1919c f15397a;

            {
                this.f15397a = r1;
            }

            public final T mo1748a() {
                return new ArrayDeque();
            }
        } : new C1928h<T>(this) {
            final /* synthetic */ C1919c f15398a;

            {
                this.f15398a = r1;
            }

            public final T mo1748a() {
                return new ArrayList();
            }
        } : Map.class.isAssignableFrom(cls) ? ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new C1928h<T>(this) {
            final /* synthetic */ C1919c f15399a;

            {
                this.f15399a = r1;
            }

            public final T mo1748a() {
                return new ConcurrentSkipListMap();
            }
        } : ConcurrentMap.class.isAssignableFrom(cls) ? new C55662(this) : SortedMap.class.isAssignableFrom(cls) ? new C55673(this) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(C1933a.m5291a(((ParameterizedType) type).getActualTypeArguments()[0]).f6422a)) ? new C55695(this) : new C55684(this) : null;
        return a != null ? a : new C1928h<T>(this) {
            final /* synthetic */ C1919c f15409c;
            private final C1931k f15410d = C1931k.m5285a();

            public final T mo1748a() {
                try {
                    return this.f15410d.mo1749a(cls);
                } catch (Throwable e) {
                    StringBuilder stringBuilder = new StringBuilder("Unable to invoke no-args constructor for ");
                    stringBuilder.append(type);
                    stringBuilder.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
                    throw new RuntimeException(stringBuilder.toString(), e);
                }
            }
        };
    }

    public final String toString() {
        return this.f6394a.toString();
    }
}
