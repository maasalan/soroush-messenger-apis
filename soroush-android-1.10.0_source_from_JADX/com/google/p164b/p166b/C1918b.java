package com.google.p164b.p166b;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

public final class C1918b {
    static final Type[] f6393a = new Type[0];

    private static final class C1915a implements Serializable, GenericArrayType {
        private final Type f6387a;

        public C1915a(Type type) {
            this.f6387a = C1918b.m5253a(type);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C1918b.m5258a((Type) this, (GenericArrayType) obj);
        }

        public final Type getGenericComponentType() {
            return this.f6387a;
        }

        public final int hashCode() {
            return this.f6387a.hashCode();
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(C1918b.m5262c(this.f6387a));
            stringBuilder.append("[]");
            return stringBuilder.toString();
        }
    }

    private static final class C1916b implements Serializable, ParameterizedType {
        private final Type f6388a;
        private final Type f6389b;
        private final Type[] f6390c;

        public C1916b(Type type, Type type2, Type... typeArr) {
            int i = 0;
            if (type2 instanceof Class) {
                int i2;
                Class cls = (Class) type2;
                boolean z = true;
                if (!Modifier.isStatic(cls.getModifiers())) {
                    if (cls.getEnclosingClass() != null) {
                        i2 = 0;
                        if (type == null) {
                            if (i2 != 0) {
                                z = false;
                            }
                        }
                        C1914a.m5251a(z);
                    }
                }
                i2 = true;
                if (type == null) {
                    if (i2 != 0) {
                        z = false;
                    }
                }
                C1914a.m5251a(z);
            }
            this.f6388a = type == null ? null : C1918b.m5253a(type);
            this.f6389b = C1918b.m5253a(type2);
            this.f6390c = (Type[]) typeArr.clone();
            int length = this.f6390c.length;
            while (i < length) {
                C1914a.m5250a(this.f6390c[i]);
                C1918b.m5264e(this.f6390c[i]);
                this.f6390c[i] = C1918b.m5253a(this.f6390c[i]);
                i++;
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C1918b.m5258a((Type) this, (ParameterizedType) obj);
        }

        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f6390c.clone();
        }

        public final Type getOwnerType() {
            return this.f6388a;
        }

        public final Type getRawType() {
            return this.f6389b;
        }

        public final int hashCode() {
            return (Arrays.hashCode(this.f6390c) ^ this.f6389b.hashCode()) ^ C1918b.m5252a(this.f6388a);
        }

        public final String toString() {
            int length = this.f6390c.length;
            if (length == 0) {
                return C1918b.m5262c(this.f6389b);
            }
            StringBuilder stringBuilder = new StringBuilder(30 * (length + 1));
            stringBuilder.append(C1918b.m5262c(this.f6389b));
            stringBuilder.append("<");
            stringBuilder.append(C1918b.m5262c(this.f6390c[0]));
            for (int i = 1; i < length; i++) {
                stringBuilder.append(", ");
                stringBuilder.append(C1918b.m5262c(this.f6390c[i]));
            }
            stringBuilder.append(">");
            return stringBuilder.toString();
        }
    }

    private static final class C1917c implements Serializable, WildcardType {
        private final Type f6391a;
        private final Type f6392b;

        public C1917c(Type[] typeArr, Type[] typeArr2) {
            Type type;
            boolean z = true;
            C1914a.m5251a(typeArr2.length <= 1);
            C1914a.m5251a(typeArr.length == 1);
            if (typeArr2.length == 1) {
                C1914a.m5250a(typeArr2[0]);
                C1918b.m5264e(typeArr2[0]);
                if (typeArr[0] != Object.class) {
                    z = false;
                }
                C1914a.m5251a(z);
                this.f6392b = C1918b.m5253a(typeArr2[0]);
                type = Object.class;
            } else {
                C1914a.m5250a(typeArr[0]);
                C1918b.m5264e(typeArr[0]);
                this.f6392b = null;
                type = C1918b.m5253a(typeArr[0]);
            }
            this.f6391a = type;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C1918b.m5258a((Type) this, (WildcardType) obj);
        }

        public final Type[] getLowerBounds() {
            if (this.f6392b == null) {
                return C1918b.f6393a;
            }
            return new Type[]{this.f6392b};
        }

        public final Type[] getUpperBounds() {
            return new Type[]{this.f6391a};
        }

        public final int hashCode() {
            return (this.f6392b != null ? this.f6392b.hashCode() + 31 : 1) ^ (31 + this.f6391a.hashCode());
        }

        public final String toString() {
            StringBuilder stringBuilder;
            Type type;
            if (this.f6392b != null) {
                stringBuilder = new StringBuilder("? super ");
                type = this.f6392b;
            } else if (this.f6391a == Object.class) {
                return "?";
            } else {
                stringBuilder = new StringBuilder("? extends ");
                type = this.f6391a;
            }
            stringBuilder.append(C1918b.m5262c(type));
            return stringBuilder.toString();
        }
    }

    static int m5252a(Object obj) {
        return obj != null ? obj.hashCode() : 0;
    }

    public static Type m5253a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                cls = new C1915a(C1918b.m5253a(cls.getComponentType()));
            }
            return cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C1916b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new C1915a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new C1917c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    public static Type m5254a(Type type, Class<?> cls) {
        type = C1918b.m5260b(type, cls, Collection.class);
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        return type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class;
    }

    private static Type m5255a(Type type, Class<?> cls, Class<?> cls2) {
        Class cls3;
        while (cls2 != cls3) {
            if (cls2.isInterface()) {
                Class[] interfaces = cls3.getInterfaces();
                int length = interfaces.length;
                for (int i = 0; i < length; i++) {
                    if (interfaces[i] == cls2) {
                        return cls3.getGenericInterfaces()[i];
                    }
                    if (cls2.isAssignableFrom(interfaces[i])) {
                        Type type2 = cls3.getGenericInterfaces()[i];
                        Class cls4 = interfaces[i];
                        break;
                    }
                }
            }
            if (!cls3.isInterface()) {
                while (cls3 != Object.class) {
                    Class<?> superclass = cls3.getSuperclass();
                    if (superclass == cls2) {
                        return cls3.getGenericSuperclass();
                    }
                    if (cls2.isAssignableFrom(superclass)) {
                        type2 = cls3.getGenericSuperclass();
                        Type type3 = type2;
                        cls3 = cls4;
                        type = type3;
                    } else {
                        cls = superclass;
                    }
                }
            }
            return cls2;
        }
        return type;
    }

    public static Type m5256a(Type type, Class<?> cls, Type type2) {
        return C1918b.m5257a(type, cls, type2, new HashSet());
    }

    private static Type m5257a(Type type, Class<?> cls, Type type2, Collection<TypeVariable> collection) {
        Type type3;
        do {
            int i = 0;
            if (type2 instanceof TypeVariable) {
                type3 = (TypeVariable) type2;
                if (collection.contains(type3)) {
                    return type2;
                }
                collection.add(type3);
                GenericDeclaration genericDeclaration = type3.getGenericDeclaration();
                Class cls2 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
                if (cls2 != null) {
                    Type a = C1918b.m5255a(type, (Class) cls, cls2);
                    if (a instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls2.getTypeParameters();
                        int length = typeParameters.length;
                        while (i < length) {
                            if (type3.equals(typeParameters[i])) {
                                type2 = ((ParameterizedType) a).getActualTypeArguments()[i];
                                continue;
                            } else {
                                i++;
                            }
                        }
                        throw new NoSuchElementException();
                    }
                }
                type2 = type3;
                continue;
            } else {
                if (type2 instanceof Class) {
                    Class cls3 = (Class) type2;
                    if (cls3.isArray()) {
                        type2 = cls3.getComponentType();
                        type = C1918b.m5257a(type, cls, type2, collection);
                        return type2 == type ? cls3 : C1918b.m5265f(type);
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type2;
                    type3 = genericArrayType.getGenericComponentType();
                    type = C1918b.m5257a(type, cls, type3, collection);
                    return type3 == type ? genericArrayType : C1918b.m5265f(type);
                } else if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type2;
                    type3 = parameterizedType.getOwnerType();
                    Type a2 = C1918b.m5257a(type, cls, type3, collection);
                    int i2 = a2 != type3 ? 1 : 0;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length2 = actualTypeArguments.length;
                    while (i < length2) {
                        Type a3 = C1918b.m5257a(type, cls, actualTypeArguments[i], collection);
                        if (a3 != actualTypeArguments[i]) {
                            if (i2 == 0) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                i2 = 1;
                            }
                            actualTypeArguments[i] = a3;
                        }
                        i++;
                    }
                    return i2 != 0 ? new C1916b(a2, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                } else {
                    if (type2 instanceof WildcardType) {
                        type2 = (WildcardType) type2;
                        Type[] lowerBounds = type2.getLowerBounds();
                        Type[] upperBounds = type2.getUpperBounds();
                        if (lowerBounds.length == 1) {
                            type = C1918b.m5257a(type, cls, lowerBounds[0], collection);
                            if (type != lowerBounds[0]) {
                                return new C1917c(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
                            }
                        } else if (upperBounds.length == 1) {
                            type = C1918b.m5257a(type, cls, upperBounds[0], collection);
                            if (type != upperBounds[0]) {
                                return new C1917c(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, f6393a);
                            }
                        }
                    }
                    return type2;
                }
            }
        } while (type2 != type3);
        return type2;
    }

    public static boolean m5258a(Type type, Type type2) {
        Object genericComponentType;
        Object genericComponentType2;
        while (genericComponentType != genericComponentType2) {
            if (genericComponentType instanceof Class) {
                return genericComponentType.equals(genericComponentType2);
            }
            if (genericComponentType instanceof ParameterizedType) {
                if (!(genericComponentType2 instanceof ParameterizedType)) {
                    return false;
                }
                boolean z;
                ParameterizedType parameterizedType = (ParameterizedType) genericComponentType;
                ParameterizedType parameterizedType2 = (ParameterizedType) genericComponentType2;
                Type ownerType = parameterizedType.getOwnerType();
                Type ownerType2 = parameterizedType2.getOwnerType();
                if (ownerType != ownerType2) {
                    if (ownerType == null || !ownerType.equals(ownerType2)) {
                        z = false;
                        return z && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
                    }
                }
                z = true;
                if (!z) {
                }
            } else if (genericComponentType instanceof GenericArrayType) {
                if (!(genericComponentType2 instanceof GenericArrayType)) {
                    return false;
                }
                GenericArrayType genericArrayType = (GenericArrayType) genericComponentType2;
                genericComponentType = ((GenericArrayType) genericComponentType).getGenericComponentType();
                genericComponentType2 = genericArrayType.getGenericComponentType();
            } else if (genericComponentType instanceof WildcardType) {
                if (!(genericComponentType2 instanceof WildcardType)) {
                    return false;
                }
                WildcardType wildcardType = (WildcardType) genericComponentType;
                WildcardType wildcardType2 = (WildcardType) genericComponentType2;
                return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
            } else if (!(genericComponentType instanceof TypeVariable) || !(genericComponentType2 instanceof TypeVariable)) {
                return false;
            } else {
                TypeVariable typeVariable = (TypeVariable) genericComponentType;
                TypeVariable typeVariable2 = (TypeVariable) genericComponentType2;
                return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
            }
        }
        return true;
    }

    public static Class<?> m5259b(Type type) {
        Object obj;
        while (!(obj instanceof Class)) {
            if (obj instanceof ParameterizedType) {
                type = ((ParameterizedType) obj).getRawType();
                C1914a.m5251a(type instanceof Class);
                return (Class) type;
            } else if (obj instanceof GenericArrayType) {
                return Array.newInstance(C1918b.m5259b(((GenericArrayType) obj).getGenericComponentType()), 0).getClass();
            } else {
                if (obj instanceof TypeVariable) {
                    return Object.class;
                }
                if (obj instanceof WildcardType) {
                    obj = ((WildcardType) obj).getUpperBounds()[0];
                } else {
                    String name = obj == null ? "null" : obj.getClass().getName();
                    StringBuilder stringBuilder = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
                    stringBuilder.append(obj);
                    stringBuilder.append("> is of type ");
                    stringBuilder.append(name);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
        }
        return (Class) obj;
    }

    private static Type m5260b(Type type, Class<?> cls, Class<?> cls2) {
        C1914a.m5251a(cls2.isAssignableFrom(cls));
        return C1918b.m5256a(type, (Class) cls, C1918b.m5255a(type, (Class) cls, (Class) cls2));
    }

    public static Type[] m5261b(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        type = C1918b.m5260b(type, cls, Map.class);
        if (type instanceof ParameterizedType) {
            return ((ParameterizedType) type).getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    public static String m5262c(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static Type m5263d(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    static void m5264e(Type type) {
        boolean z;
        if (type instanceof Class) {
            if (((Class) type).isPrimitive()) {
                z = false;
                C1914a.m5251a(z);
            }
        }
        z = true;
        C1914a.m5251a(z);
    }

    private static GenericArrayType m5265f(Type type) {
        return new C1915a(type);
    }
}
