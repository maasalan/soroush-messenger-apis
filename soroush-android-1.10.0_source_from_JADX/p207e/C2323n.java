package p207e;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import p056c.ad;
import p206d.C2277r;
import p206d.C6623c;

final class C2323n {
    static final Type[] f7653a = new Type[0];

    private static final class C2320a implements GenericArrayType {
        private final Type f7647a;

        C2320a(Type type) {
            this.f7647a = type;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C2323n.m6313a((Type) this, (GenericArrayType) obj);
        }

        public final Type getGenericComponentType() {
            return this.f7647a;
        }

        public final int hashCode() {
            return this.f7647a.hashCode();
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(C2323n.m6315b(this.f7647a));
            stringBuilder.append("[]");
            return stringBuilder.toString();
        }
    }

    private static final class C2321b implements ParameterizedType {
        private final Type f7648a;
        private final Type f7649b;
        private final Type[] f7650c;

        C2321b(Type type, Type type2, Type... typeArr) {
            int i;
            int i2 = 0;
            if (type2 instanceof Class) {
                i = 1;
                int i3 = type == null ? 1 : 0;
                if (((Class) type2).getEnclosingClass() != null) {
                    i = 0;
                }
                if (i3 != i) {
                    throw new IllegalArgumentException();
                }
            }
            i = typeArr.length;
            while (i2 < i) {
                Object obj = typeArr[i2];
                C2323n.m6308a(obj, "typeArgument == null");
                C2323n.m6317c(obj);
                i2++;
            }
            this.f7648a = type;
            this.f7649b = type2;
            this.f7650c = (Type[]) typeArr.clone();
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C2323n.m6313a((Type) this, (ParameterizedType) obj);
        }

        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f7650c.clone();
        }

        public final Type getOwnerType() {
            return this.f7648a;
        }

        public final Type getRawType() {
            return this.f7649b;
        }

        public final int hashCode() {
            return (Arrays.hashCode(this.f7650c) ^ this.f7649b.hashCode()) ^ C2323n.m6305a(this.f7648a);
        }

        public final String toString() {
            if (this.f7650c.length == 0) {
                return C2323n.m6315b(this.f7649b);
            }
            int i = 1;
            StringBuilder stringBuilder = new StringBuilder(30 * (this.f7650c.length + 1));
            stringBuilder.append(C2323n.m6315b(this.f7649b));
            stringBuilder.append("<");
            stringBuilder.append(C2323n.m6315b(this.f7650c[0]));
            while (i < this.f7650c.length) {
                stringBuilder.append(", ");
                stringBuilder.append(C2323n.m6315b(this.f7650c[i]));
                i++;
            }
            stringBuilder.append(">");
            return stringBuilder.toString();
        }
    }

    private static final class C2322c implements WildcardType {
        private final Type f7651a;
        private final Type f7652b;

        C2322c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            Type type;
            if (typeArr2.length == 1) {
                if (typeArr2[0] == null) {
                    throw new NullPointerException();
                }
                C2323n.m6317c(typeArr2[0]);
                if (typeArr[0] != Object.class) {
                    throw new IllegalArgumentException();
                }
                this.f7652b = typeArr2[0];
                type = Object.class;
            } else if (typeArr[0] == null) {
                throw new NullPointerException();
            } else {
                C2323n.m6317c(typeArr[0]);
                this.f7652b = null;
                type = typeArr[0];
            }
            this.f7651a = type;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C2323n.m6313a((Type) this, (WildcardType) obj);
        }

        public final Type[] getLowerBounds() {
            if (this.f7652b == null) {
                return C2323n.f7653a;
            }
            return new Type[]{this.f7652b};
        }

        public final Type[] getUpperBounds() {
            return new Type[]{this.f7651a};
        }

        public final int hashCode() {
            return (this.f7652b != null ? this.f7652b.hashCode() + 31 : 1) ^ (31 + this.f7651a.hashCode());
        }

        public final String toString() {
            StringBuilder stringBuilder;
            Type type;
            if (this.f7652b != null) {
                stringBuilder = new StringBuilder("? super ");
                type = this.f7652b;
            } else if (this.f7651a == Object.class) {
                return "?";
            } else {
                stringBuilder = new StringBuilder("? extends ");
                type = this.f7651a;
            }
            stringBuilder.append(C2323n.m6315b(type));
            return stringBuilder.toString();
        }
    }

    static int m6305a(Object obj) {
        return obj != null ? obj.hashCode() : 0;
    }

    static ad m6306a(ad adVar) {
        C2277r c6623c = new C6623c();
        adVar.mo959d().mo3120a(c6623c);
        return ad.m2264a(adVar.mo957a(), adVar.mo958b(), c6623c);
    }

    static Class<?> m6307a(Type type) {
        Object obj;
        while (true) {
            C2323n.m6308a(obj, "type == null");
            if (obj instanceof Class) {
                return (Class) obj;
            }
            if (obj instanceof ParameterizedType) {
                break;
            } else if (obj instanceof GenericArrayType) {
                return Array.newInstance(C2323n.m6307a(((GenericArrayType) obj).getGenericComponentType()), 0).getClass();
            } else {
                if (obj instanceof TypeVariable) {
                    return Object.class;
                }
                if (obj instanceof WildcardType) {
                    obj = ((WildcardType) obj).getUpperBounds()[0];
                } else {
                    StringBuilder stringBuilder = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
                    stringBuilder.append(obj);
                    stringBuilder.append("> is of type ");
                    stringBuilder.append(obj.getClass().getName());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
        }
        type = ((ParameterizedType) obj).getRawType();
        if (type instanceof Class) {
            return (Class) type;
        }
        throw new IllegalArgumentException();
    }

    static <T> T m6308a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    static Type m6309a(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0) {
            if (i < actualTypeArguments.length) {
                Type type = actualTypeArguments[i];
                return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
            }
        }
        StringBuilder stringBuilder = new StringBuilder("Index ");
        stringBuilder.append(i);
        stringBuilder.append(" not in range [0,");
        stringBuilder.append(actualTypeArguments.length);
        stringBuilder.append(") for ");
        stringBuilder.append(parameterizedType);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    static Type m6310a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C2323n.m6311a(type, (Class) cls, C2323n.m6316b(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    private static Type m6311a(Type type, Class<?> cls, Type type2) {
        Type type3;
        while (true) {
            int i = 0;
            if (!(type2 instanceof TypeVariable)) {
                break;
            }
            type2 = (TypeVariable) type2;
            GenericDeclaration genericDeclaration = type2.getGenericDeclaration();
            Class cls2 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls2 != null) {
                Type b = C2323n.m6316b(type, cls, cls2);
                if (b instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls2.getTypeParameters();
                    while (i < typeParameters.length) {
                        if (type2.equals(typeParameters[i])) {
                            type3 = ((ParameterizedType) b).getActualTypeArguments()[i];
                            if (type3 == type2) {
                                return type3;
                            }
                            type2 = type3;
                        } else {
                            i++;
                        }
                    }
                    throw new NoSuchElementException();
                }
            }
            type3 = type2;
            if (type3 == type2) {
                return type3;
            }
            type2 = type3;
        }
        if (type2 instanceof Class) {
            cls2 = (Class) type2;
            if (cls2.isArray()) {
                type2 = cls2.getComponentType();
                type = C2323n.m6311a(type, (Class) cls, type2);
                return type2 == type ? cls2 : new C2320a(type);
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            type3 = genericArrayType.getGenericComponentType();
            type = C2323n.m6311a(type, (Class) cls, type3);
            return type3 == type ? genericArrayType : new C2320a(type);
        } else if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            type3 = parameterizedType.getOwnerType();
            Type a = C2323n.m6311a(type, (Class) cls, type3);
            int i2 = a != type3 ? 1 : 0;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i < length) {
                Type a2 = C2323n.m6311a(type, (Class) cls, actualTypeArguments[i]);
                if (a2 != actualTypeArguments[i]) {
                    if (i2 == 0) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        i2 = 1;
                    }
                    actualTypeArguments[i] = a2;
                }
                i++;
            }
            return i2 != 0 ? new C2321b(a, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        } else {
            if (type2 instanceof WildcardType) {
                type2 = (WildcardType) type2;
                Type[] lowerBounds = type2.getLowerBounds();
                Type[] upperBounds = type2.getUpperBounds();
                if (lowerBounds.length == 1) {
                    if (C2323n.m6311a(type, (Class) cls, lowerBounds[0]) != lowerBounds[0]) {
                        return new C2322c(new Type[]{Object.class}, new Type[]{C2323n.m6311a(type, (Class) cls, lowerBounds[0])});
                    }
                } else if (upperBounds.length == 1 && C2323n.m6311a(type, (Class) cls, upperBounds[0]) != upperBounds[0]) {
                    return new C2322c(new Type[]{C2323n.m6311a(type, (Class) cls, upperBounds[0])}, f7653a);
                }
            }
            return type2;
        }
    }

    static <T> void m6312a(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        } else if (cls.getInterfaces().length > 0) {
            throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
        }
    }

    static boolean m6313a(Type type, Type type2) {
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

    static boolean m6314a(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Object isInstance : annotationArr) {
            if (cls.isInstance(isInstance)) {
                return true;
            }
        }
        return false;
    }

    static String m6315b(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    private static Type m6316b(Type type, Class<?> cls, Class<?> cls2) {
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

    static void m6317c(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    static boolean m6318d(Type type) {
        Object genericComponentType;
        while (!(genericComponentType instanceof Class)) {
            if (genericComponentType instanceof ParameterizedType) {
                for (Type d : ((ParameterizedType) genericComponentType).getActualTypeArguments()) {
                    if (C2323n.m6318d(d)) {
                        return true;
                    }
                }
                return false;
            } else if (genericComponentType instanceof GenericArrayType) {
                genericComponentType = ((GenericArrayType) genericComponentType).getGenericComponentType();
            } else if ((genericComponentType instanceof TypeVariable) || (genericComponentType instanceof WildcardType)) {
                return true;
            } else {
                String name = genericComponentType == null ? "null" : genericComponentType.getClass().getName();
                StringBuilder stringBuilder = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
                stringBuilder.append(genericComponentType);
                stringBuilder.append("> is of type ");
                stringBuilder.append(name);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return false;
    }

    static Type m6319e(Type type) {
        if (type instanceof ParameterizedType) {
            return C2323n.m6309a(0, (ParameterizedType) type);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
