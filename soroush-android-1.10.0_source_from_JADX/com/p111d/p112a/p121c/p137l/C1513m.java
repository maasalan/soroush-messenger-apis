package com.p111d.p112a.p121c.p137l;

import com.p111d.p112a.p114b.p119f.C1366b;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.p137l.C1516o.C1515a;
import com.p111d.p112a.p121c.p138m.C1527g;
import com.p111d.p112a.p121c.p138m.C1532l;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;

public final class C1513m implements Serializable {
    protected static final C1513m f4704a = new C1513m();
    protected static final C1512l f4705b = C1512l.m3899a();
    protected static final C7126j f4706c = new C7126j(f4720u);
    protected static final C7126j f4707d = new C7126j(f4721v);
    protected static final C7126j f4708e = new C7126j(f4722w);
    protected static final C7126j f4709f = new C7126j(f4715p);
    protected static final C7126j f4710g = new C7126j(f4716q);
    protected static final C7126j f4711h = new C7126j(f4717r);
    protected static final C7126j f4712i = new C7126j(f4719t);
    protected static final C7126j f4713j = new C7126j(f4718s);
    private static final C5354j[] f4714o = new C5354j[0];
    private static final Class<?> f4715p = String.class;
    private static final Class<?> f4716q = Object.class;
    private static final Class<?> f4717r = Comparable.class;
    private static final Class<?> f4718s = Class.class;
    private static final Class<?> f4719t = Enum.class;
    private static final Class<?> f4720u = Boolean.TYPE;
    private static final Class<?> f4721v = Integer.TYPE;
    private static final Class<?> f4722w = Long.TYPE;
    protected final C1532l<Class<?>, C5354j> f4723k = new C1532l(16, 100);
    protected final C1514n[] f4724l = null;
    protected final C1516o f4725m = new C1516o(this);
    protected final ClassLoader f4726n = null;

    private C1513m() {
    }

    private C5354j m3906a(C1510c c1510c, Type type, C1512l c1512l) {
        C5354j a;
        int i = 0;
        if (type instanceof Class) {
            a = m3919a(c1510c, (Class) type, f4705b);
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class cls = (Class) parameterizedType.getRawType();
            if (cls == f4719t) {
                a = f4712i;
            } else if (cls == f4717r) {
                a = f4711h;
            } else if (cls == f4718s) {
                a = f4713j;
            } else {
                C1512l c1512l2;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                r2 = actualTypeArguments == null ? 0 : actualTypeArguments.length;
                if (r2 == 0) {
                    c1512l2 = f4705b;
                } else {
                    C5354j[] c5354jArr = new C5354j[r2];
                    for (int i2 = 0; i2 < r2; i2++) {
                        c5354jArr[i2] = m3906a(c1510c, actualTypeArguments[i2], c1512l);
                    }
                    c1512l2 = C1512l.m3903a(cls, c5354jArr);
                }
                a = m3919a(c1510c, cls, c1512l2);
            }
        } else if (type instanceof C5354j) {
            return (C5354j) type;
        } else {
            if (type instanceof GenericArrayType) {
                a = C7122a.m18648a(m3906a(c1510c, ((GenericArrayType) type).getGenericComponentType(), c1512l), c1512l);
            } else if (type instanceof TypeVariable) {
                C5354j c5354j;
                TypeVariable typeVariable = (TypeVariable) type;
                String name = typeVariable.getName();
                r2 = c1512l.f4700a.length;
                for (int i3 = 0; i3 < r2; i3++) {
                    if (name.equals(c1512l.f4700a[i3])) {
                        c5354j = c1512l.f4701b[i3];
                        break;
                    }
                }
                c5354j = null;
                if (c5354j != null) {
                    a = c5354j;
                } else {
                    String[] strArr;
                    if (c1512l.f4702c != null) {
                        r2 = c1512l.f4702c.length;
                        do {
                            r2--;
                            if (r2 >= 0) {
                            }
                        } while (!name.equals(c1512l.f4702c[r2]));
                        r2 = 1;
                        if (r2 == 0) {
                            a = f4710g;
                        } else {
                            r2 = c1512l.f4702c != null ? 0 : c1512l.f4702c.length;
                            strArr = r2 != 0 ? new String[1] : (String[]) Arrays.copyOf(c1512l.f4702c, r2 + 1);
                            strArr[r2] = name;
                            a = m3906a(c1510c, typeVariable.getBounds()[0], new C1512l(c1512l.f4700a, c1512l.f4701b, strArr));
                        }
                    }
                    r2 = 0;
                    if (r2 == 0) {
                        if (c1512l.f4702c != null) {
                        }
                        if (r2 != 0) {
                        }
                        strArr[r2] = name;
                        a = m3906a(c1510c, typeVariable.getBounds()[0], new C1512l(c1512l.f4700a, c1512l.f4701b, strArr));
                    } else {
                        a = f4710g;
                    }
                }
            } else if (type instanceof WildcardType) {
                a = m3906a(c1510c, ((WildcardType) type).getUpperBounds()[0], c1512l);
            } else {
                StringBuilder stringBuilder = new StringBuilder("Unrecognized Type: ");
                stringBuilder.append(type == null ? "[null]" : type.toString());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        if (!(this.f4724l == null || r7.mo3391n())) {
            C1514n[] c1514nArr = this.f4724l;
            int length = c1514nArr.length;
            while (i < length) {
                a = c1514nArr[i].m3928a();
                i++;
            }
        }
        return a;
    }

    public static C5354j m3907a(Class<?> cls) {
        C1512l c1512l = f4705b;
        if (c1512l.m3904b()) {
            C5354j b = C1513m.m3913b((Class) cls);
            if (b != null) {
                return b;
            }
        }
        return C1513m.m3908a(cls, c1512l, null, null);
    }

    private static C5354j m3908a(Class<?> cls, C1512l c1512l, C5354j c5354j, C5354j[] c5354jArr) {
        return new C7126j(cls, c1512l, c5354j, c5354jArr);
    }

    public static C1513m m3909a() {
        return f4704a;
    }

    public static Class<?> m3910a(Type type) {
        return type instanceof Class ? (Class) type : f4704a.m3927b(type).m11531e();
    }

    public static C5354j m3911b() {
        return f4710g;
    }

    public static C5354j m3912b(C5354j c5354j, Class<?> cls) {
        Class<?> e = c5354j.m11531e();
        if (e == cls) {
            return c5354j;
        }
        C5354j e2 = c5354j.mo2934e(cls);
        if (e2 != null) {
            return e2;
        }
        if (cls.isAssignableFrom(e)) {
            throw new IllegalArgumentException(String.format("Internal error: class %s not included as super-type for %s", new Object[]{cls.getName(), c5354j}));
        }
        throw new IllegalArgumentException(String.format("Class %s not a super-type of %s", new Object[]{cls.getName(), c5354j}));
    }

    private static C5354j m3913b(Class<?> cls) {
        if (cls.isPrimitive()) {
            if (cls == f4720u) {
                return f4706c;
            }
            if (cls == f4721v) {
                return f4707d;
            }
            if (cls == f4722w) {
                return f4708e;
            }
        } else if (cls == f4715p) {
            return f4709f;
        } else {
            if (cls == f4716q) {
                return f4710g;
            }
        }
        return null;
    }

    private static C5354j m3914b(Class<?> cls, C1512l c1512l, C5354j c5354j, C5354j[] c5354jArr) {
        for (C5354j a : c5354jArr) {
            C5354j a2 = a2.mo3379a(cls, c1512l, c5354j, c5354jArr);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    private C5354j[] m3915b(C1510c c1510c, Class<?> cls, C1512l c1512l) {
        Type[] m = C1527g.m3978m(cls);
        if (m != null) {
            if (m.length != 0) {
                int length = m.length;
                C5354j[] c5354jArr = new C5354j[length];
                for (int i = 0; i < length; i++) {
                    c5354jArr[i] = m3906a(c1510c, m[i], c1512l);
                }
                return c5354jArr;
            }
        }
        return f4714o;
    }

    public static C5354j[] m3916c(C5354j c5354j, Class<?> cls) {
        c5354j = c5354j.mo2934e(cls);
        return c5354j == null ? f4714o : c5354j.mo2936x().f4701b;
    }

    public final C5354j m3917a(C1366b<?> c1366b) {
        return m3906a(null, c1366b.m3309a(), f4705b);
    }

    public final C5354j m3918a(C5354j c5354j, Class<?> cls) {
        Class<?> e = c5354j.m11531e();
        if (e == cls) {
            return c5354j;
        }
        C1512l a;
        if (e != Object.class) {
            if (!e.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(String.format("Class %s not subtype of %s", new Object[]{cls.getName(), c5354j}));
            } else if (!c5354j.mo2936x().m3904b()) {
                if (c5354j.mo3391n()) {
                    if (c5354j.mo3397p()) {
                        if (cls == HashMap.class || cls == LinkedHashMap.class || cls == EnumMap.class || cls == TreeMap.class) {
                            a = C1512l.m3901a(cls, c5354j.mo3398t(), c5354j.mo3394u());
                            return m3919a(null, (Class) cls, a);
                        }
                    } else if (c5354j.mo3396o()) {
                        if (!(cls == ArrayList.class || cls == LinkedList.class || cls == HashSet.class)) {
                            if (cls != TreeSet.class) {
                                if (e == EnumSet.class) {
                                    return c5354j;
                                }
                            }
                        }
                        a = C1512l.m3900a((Class) cls, c5354j.mo3394u());
                        return m3919a(null, (Class) cls, a);
                    }
                }
                if (cls.getTypeParameters().length != 0) {
                    if (c5354j.m11537k()) {
                        c5354j = c5354j.mo3379a(cls, C1512l.m3899a(), null, new C5354j[]{c5354j});
                    } else {
                        c5354j = c5354j.mo3379a(cls, C1512l.m3899a(), c5354j, f4714o);
                    }
                    if (c5354j != null) {
                        return c5354j;
                    }
                }
            }
        }
        a = C1512l.m3899a();
        return m3919a(null, (Class) cls, a);
    }

    protected final C5354j m3919a(C1510c c1510c, Class<?> cls, C1512l c1512l) {
        C1513m c1513m = this;
        C1510c c1510c2 = c1510c;
        Class<?> cls2 = cls;
        C1512l c1512l2 = c1512l;
        C5354j b = C1513m.m3913b((Class) cls);
        if (b != null) {
            return b;
        }
        int i;
        C1510c c1510c3;
        C1510c a;
        C5354j c7125i;
        Type l;
        C5354j a2;
        C5354j[] b2;
        List c;
        int size;
        StringBuilder stringBuilder;
        C5354j c5354j;
        C5354j c5354j2;
        if (c1512l2 != null) {
            if (!c1512l.m3904b()) {
                i = 0;
                if (i != 0) {
                    b = (C5354j) c1513m.f4723k.m3999a(cls2);
                    if (b != null) {
                        return b;
                    }
                }
                if (c1510c2 != null) {
                    c1510c3 = new C1510c(cls2);
                } else {
                    a = c1510c.m3895a((Class) cls);
                    if (a == null) {
                        c7125i = new C7125i(cls2, f4705b);
                        if (a.f4688c == null) {
                            a.f4688c = new ArrayList();
                        }
                        a.f4688c.add(c7125i);
                        return c7125i;
                    }
                    c1510c3 = new C1510c(c1510c2, cls2);
                }
                if (cls.isArray()) {
                    if (!cls.isInterface()) {
                        l = C1527g.m3977l(cls);
                        if (l == null) {
                            a2 = m3906a(c1510c3, l, c1512l2);
                            b2 = m3915b(c1510c3, cls2, c1512l2);
                            if (cls2 != Properties.class) {
                                b = C7306g.m19521a(cls2, c1512l2, a2, b2, f4709f, f4709f);
                            } else if (a2 != null) {
                                b = a2.mo3379a(cls2, c1512l2, a2, b2);
                            }
                            c7125i = b;
                            if (c7125i == null) {
                                if (cls2 != Map.class) {
                                    if (cls2 != Properties.class) {
                                        c7125i = f4709f;
                                    } else {
                                        c = c1512l.m3905c();
                                        size = c.size();
                                        if (size == 0) {
                                            c7125i = f4710g;
                                        } else if (size == 2) {
                                            stringBuilder = new StringBuilder("Strange Map type ");
                                            stringBuilder.append(cls.getName());
                                            stringBuilder.append(": can not determine type parameters");
                                            throw new IllegalArgumentException(stringBuilder.toString());
                                        } else {
                                            c5354j = (C5354j) c.get(1);
                                            c5354j2 = (C5354j) c.get(0);
                                            c7125i = C7306g.m19521a(cls2, c1512l2, a2, b2, c5354j2, c5354j);
                                        }
                                    }
                                    c5354j2 = c7125i;
                                    c5354j = c5354j2;
                                    c7125i = C7306g.m19521a(cls2, c1512l2, a2, b2, c5354j2, c5354j);
                                } else if (cls2 != Collection.class) {
                                    c = c1512l.m3905c();
                                    if (!c.isEmpty()) {
                                        c7125i = f4710g;
                                    } else if (c.size() != 1) {
                                        c7125i = (C5354j) c.get(0);
                                    } else {
                                        stringBuilder = new StringBuilder("Strange Collection type ");
                                        stringBuilder.append(cls.getName());
                                        stringBuilder.append(": can not determine type parameters");
                                        throw new IllegalArgumentException(stringBuilder.toString());
                                    }
                                    c7125i = C7305e.m19502a(cls2, c1512l2, a2, b2, c7125i);
                                } else if (cls2 != AtomicReference.class) {
                                    c = c1512l.m3905c();
                                    if (!c.isEmpty()) {
                                        c7125i = f4710g;
                                    } else if (c.size() != 1) {
                                        c7125i = (C5354j) c.get(0);
                                    } else {
                                        stringBuilder = new StringBuilder("Strange Reference type ");
                                        stringBuilder.append(cls.getName());
                                        stringBuilder.append(": can not determine type parameters");
                                        throw new IllegalArgumentException(stringBuilder.toString());
                                    }
                                    c7125i = C7307h.m19542a(cls2, c1512l2, a2, b2, c7125i);
                                } else {
                                    c7125i = null;
                                }
                                if (c7125i == null) {
                                    c7125i = C1513m.m3914b(cls2, c1512l2, a2, b2);
                                    if (c7125i == null) {
                                        c7125i = C1513m.m3908a(cls2, c1512l2, a2, b2);
                                    }
                                }
                            }
                        }
                    }
                    a2 = null;
                    b2 = m3915b(c1510c3, cls2, c1512l2);
                    if (cls2 != Properties.class) {
                        b = C7306g.m19521a(cls2, c1512l2, a2, b2, f4709f, f4709f);
                    } else if (a2 != null) {
                        b = a2.mo3379a(cls2, c1512l2, a2, b2);
                    }
                    c7125i = b;
                    if (c7125i == null) {
                        if (cls2 != Map.class) {
                            if (cls2 != Properties.class) {
                                c = c1512l.m3905c();
                                size = c.size();
                                if (size == 0) {
                                    c7125i = f4710g;
                                } else if (size == 2) {
                                    c5354j = (C5354j) c.get(1);
                                    c5354j2 = (C5354j) c.get(0);
                                    c7125i = C7306g.m19521a(cls2, c1512l2, a2, b2, c5354j2, c5354j);
                                } else {
                                    stringBuilder = new StringBuilder("Strange Map type ");
                                    stringBuilder.append(cls.getName());
                                    stringBuilder.append(": can not determine type parameters");
                                    throw new IllegalArgumentException(stringBuilder.toString());
                                }
                            }
                            c7125i = f4709f;
                            c5354j2 = c7125i;
                            c5354j = c5354j2;
                            c7125i = C7306g.m19521a(cls2, c1512l2, a2, b2, c5354j2, c5354j);
                        } else if (cls2 != Collection.class) {
                            c = c1512l.m3905c();
                            if (!c.isEmpty()) {
                                c7125i = f4710g;
                            } else if (c.size() != 1) {
                                stringBuilder = new StringBuilder("Strange Collection type ");
                                stringBuilder.append(cls.getName());
                                stringBuilder.append(": can not determine type parameters");
                                throw new IllegalArgumentException(stringBuilder.toString());
                            } else {
                                c7125i = (C5354j) c.get(0);
                            }
                            c7125i = C7305e.m19502a(cls2, c1512l2, a2, b2, c7125i);
                        } else if (cls2 != AtomicReference.class) {
                            c7125i = null;
                        } else {
                            c = c1512l.m3905c();
                            if (!c.isEmpty()) {
                                c7125i = f4710g;
                            } else if (c.size() != 1) {
                                stringBuilder = new StringBuilder("Strange Reference type ");
                                stringBuilder.append(cls.getName());
                                stringBuilder.append(": can not determine type parameters");
                                throw new IllegalArgumentException(stringBuilder.toString());
                            } else {
                                c7125i = (C5354j) c.get(0);
                            }
                            c7125i = C7307h.m19542a(cls2, c1512l2, a2, b2, c7125i);
                        }
                        if (c7125i == null) {
                            c7125i = C1513m.m3914b(cls2, c1512l2, a2, b2);
                            if (c7125i == null) {
                                c7125i = C1513m.m3908a(cls2, c1512l2, a2, b2);
                            }
                        }
                    }
                } else {
                    c7125i = C7122a.m18648a(m3906a(c1510c3, cls.getComponentType(), c1512l2), c1512l2);
                }
                c1510c3.m3896a(c7125i);
                if (i != 0) {
                    c1513m.f4723k.m4001b(cls2, c7125i);
                }
                return c7125i;
            }
        }
        i = 1;
        if (i != 0) {
            b = (C5354j) c1513m.f4723k.m3999a(cls2);
            if (b != null) {
                return b;
            }
        }
        if (c1510c2 != null) {
            a = c1510c.m3895a((Class) cls);
            if (a == null) {
                c1510c3 = new C1510c(c1510c2, cls2);
            } else {
                c7125i = new C7125i(cls2, f4705b);
                if (a.f4688c == null) {
                    a.f4688c = new ArrayList();
                }
                a.f4688c.add(c7125i);
                return c7125i;
            }
        }
        c1510c3 = new C1510c(cls2);
        if (cls.isArray()) {
            if (cls.isInterface()) {
                l = C1527g.m3977l(cls);
                if (l == null) {
                    a2 = m3906a(c1510c3, l, c1512l2);
                    b2 = m3915b(c1510c3, cls2, c1512l2);
                    if (cls2 != Properties.class) {
                        b = C7306g.m19521a(cls2, c1512l2, a2, b2, f4709f, f4709f);
                    } else if (a2 != null) {
                        b = a2.mo3379a(cls2, c1512l2, a2, b2);
                    }
                    c7125i = b;
                    if (c7125i == null) {
                        if (cls2 != Map.class) {
                            if (cls2 != Properties.class) {
                                c7125i = f4709f;
                            } else {
                                c = c1512l.m3905c();
                                size = c.size();
                                if (size == 0) {
                                    c7125i = f4710g;
                                } else if (size == 2) {
                                    stringBuilder = new StringBuilder("Strange Map type ");
                                    stringBuilder.append(cls.getName());
                                    stringBuilder.append(": can not determine type parameters");
                                    throw new IllegalArgumentException(stringBuilder.toString());
                                } else {
                                    c5354j = (C5354j) c.get(1);
                                    c5354j2 = (C5354j) c.get(0);
                                    c7125i = C7306g.m19521a(cls2, c1512l2, a2, b2, c5354j2, c5354j);
                                }
                            }
                            c5354j2 = c7125i;
                            c5354j = c5354j2;
                            c7125i = C7306g.m19521a(cls2, c1512l2, a2, b2, c5354j2, c5354j);
                        } else if (cls2 != Collection.class) {
                            c = c1512l.m3905c();
                            if (!c.isEmpty()) {
                                c7125i = f4710g;
                            } else if (c.size() != 1) {
                                c7125i = (C5354j) c.get(0);
                            } else {
                                stringBuilder = new StringBuilder("Strange Collection type ");
                                stringBuilder.append(cls.getName());
                                stringBuilder.append(": can not determine type parameters");
                                throw new IllegalArgumentException(stringBuilder.toString());
                            }
                            c7125i = C7305e.m19502a(cls2, c1512l2, a2, b2, c7125i);
                        } else if (cls2 != AtomicReference.class) {
                            c = c1512l.m3905c();
                            if (!c.isEmpty()) {
                                c7125i = f4710g;
                            } else if (c.size() != 1) {
                                c7125i = (C5354j) c.get(0);
                            } else {
                                stringBuilder = new StringBuilder("Strange Reference type ");
                                stringBuilder.append(cls.getName());
                                stringBuilder.append(": can not determine type parameters");
                                throw new IllegalArgumentException(stringBuilder.toString());
                            }
                            c7125i = C7307h.m19542a(cls2, c1512l2, a2, b2, c7125i);
                        } else {
                            c7125i = null;
                        }
                        if (c7125i == null) {
                            c7125i = C1513m.m3914b(cls2, c1512l2, a2, b2);
                            if (c7125i == null) {
                                c7125i = C1513m.m3908a(cls2, c1512l2, a2, b2);
                            }
                        }
                    }
                }
            }
            a2 = null;
            b2 = m3915b(c1510c3, cls2, c1512l2);
            if (cls2 != Properties.class) {
                b = C7306g.m19521a(cls2, c1512l2, a2, b2, f4709f, f4709f);
            } else if (a2 != null) {
                b = a2.mo3379a(cls2, c1512l2, a2, b2);
            }
            c7125i = b;
            if (c7125i == null) {
                if (cls2 != Map.class) {
                    if (cls2 != Properties.class) {
                        c = c1512l.m3905c();
                        size = c.size();
                        if (size == 0) {
                            c7125i = f4710g;
                        } else if (size == 2) {
                            c5354j = (C5354j) c.get(1);
                            c5354j2 = (C5354j) c.get(0);
                            c7125i = C7306g.m19521a(cls2, c1512l2, a2, b2, c5354j2, c5354j);
                        } else {
                            stringBuilder = new StringBuilder("Strange Map type ");
                            stringBuilder.append(cls.getName());
                            stringBuilder.append(": can not determine type parameters");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    c7125i = f4709f;
                    c5354j2 = c7125i;
                    c5354j = c5354j2;
                    c7125i = C7306g.m19521a(cls2, c1512l2, a2, b2, c5354j2, c5354j);
                } else if (cls2 != Collection.class) {
                    c = c1512l.m3905c();
                    if (!c.isEmpty()) {
                        c7125i = f4710g;
                    } else if (c.size() != 1) {
                        stringBuilder = new StringBuilder("Strange Collection type ");
                        stringBuilder.append(cls.getName());
                        stringBuilder.append(": can not determine type parameters");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    } else {
                        c7125i = (C5354j) c.get(0);
                    }
                    c7125i = C7305e.m19502a(cls2, c1512l2, a2, b2, c7125i);
                } else if (cls2 != AtomicReference.class) {
                    c7125i = null;
                } else {
                    c = c1512l.m3905c();
                    if (!c.isEmpty()) {
                        c7125i = f4710g;
                    } else if (c.size() != 1) {
                        stringBuilder = new StringBuilder("Strange Reference type ");
                        stringBuilder.append(cls.getName());
                        stringBuilder.append(": can not determine type parameters");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    } else {
                        c7125i = (C5354j) c.get(0);
                    }
                    c7125i = C7307h.m19542a(cls2, c1512l2, a2, b2, c7125i);
                }
                if (c7125i == null) {
                    c7125i = C1513m.m3914b(cls2, c1512l2, a2, b2);
                    if (c7125i == null) {
                        c7125i = C1513m.m3908a(cls2, c1512l2, a2, b2);
                    }
                }
            }
        } else {
            c7125i = C7122a.m18648a(m3906a(c1510c3, cls.getComponentType(), c1512l2), c1512l2);
        }
        c1510c3.m3896a(c7125i);
        if (i != 0) {
            c1513m.f4723k.m4001b(cls2, c7125i);
        }
        return c7125i;
    }

    public final C5354j m3920a(Type type, C1512l c1512l) {
        return m3906a(null, type, c1512l);
    }

    public final C7305e m3921a(Class<? extends Collection> cls, C5354j c5354j) {
        return (C7305e) m3919a(null, (Class) cls, C1512l.m3900a((Class) cls, c5354j));
    }

    public final C7305e m3922a(Class<? extends Collection> cls, Class<?> cls2) {
        return m3921a((Class) cls, m3919a(null, (Class) cls2, f4705b));
    }

    public final C7306g m3923a(Class<? extends Map> cls, C5354j c5354j, C5354j c5354j2) {
        return (C7306g) m3919a(null, (Class) cls, C1512l.m3903a((Class) cls, new C5354j[]{c5354j, c5354j2}));
    }

    public final C7306g m3924a(Class<? extends Map> cls, Class<?> cls2, Class<?> cls3) {
        C5354j c5354j;
        C5354j c5354j2;
        if (cls == Properties.class) {
            c5354j = f4709f;
            c5354j2 = c5354j;
        } else {
            c5354j = m3919a(null, (Class) cls2, f4705b);
            c5354j2 = m3919a(null, (Class) cls3, f4705b);
        }
        return m3923a((Class) cls, c5354j, c5354j2);
    }

    public final Class<?> m3925a(String str) {
        Throwable th = null;
        if (str.indexOf(46) < 0) {
            Class<?> cls = "int".equals(str) ? Integer.TYPE : "long".equals(str) ? Long.TYPE : "float".equals(str) ? Float.TYPE : "double".equals(str) ? Double.TYPE : "boolean".equals(str) ? Boolean.TYPE : "byte".equals(str) ? Byte.TYPE : "char".equals(str) ? Character.TYPE : "short".equals(str) ? Short.TYPE : "void".equals(str) ? Void.TYPE : null;
            if (cls != null) {
                return cls;
            }
        }
        ClassLoader classLoader = this.f4726n;
        if (classLoader == null) {
            classLoader = Thread.currentThread().getContextClassLoader();
        }
        if (classLoader != null) {
            try {
                return Class.forName(str, true, classLoader);
            } catch (Throwable e) {
                th = C1527g.m3953a(e);
            }
        }
        try {
            return Class.forName(str);
        } catch (Throwable e2) {
            if (th == null) {
                th = C1527g.m3953a(e2);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw new ClassNotFoundException(th.getMessage(), th);
        }
    }

    public final C5354j m3926b(String str) {
        C1516o c1516o = this.f4725m;
        C1515a c1515a = new C1515a(str.trim());
        C5354j a = c1516o.m3934a(c1515a);
        if (!c1515a.hasMoreTokens()) {
            return a;
        }
        throw C1516o.m3933a(c1515a, "Unexpected tokens after complete type");
    }

    public final C5354j m3927b(Type type) {
        return m3906a(null, type, f4705b);
    }
}
