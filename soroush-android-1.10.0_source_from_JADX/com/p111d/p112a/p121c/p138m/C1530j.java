package com.p111d.p112a.p121c.p138m;

import com.p111d.p112a.p121c.C5308b;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.HashMap;

public final class C1530j implements Serializable {
    protected final Class<Enum<?>> f4769a;
    protected final Enum<?>[] f4770b;
    protected final HashMap<String, Enum<?>> f4771c;

    public C1530j(Class<Enum<?>> cls, Enum<?>[] enumArr, HashMap<String, Enum<?>> hashMap) {
        this.f4769a = cls;
        this.f4770b = enumArr;
        this.f4771c = hashMap;
    }

    public static C1530j m3993a(Class<Enum<?>> cls, C5308b c5308b) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        if (enumArr == null) {
            StringBuilder stringBuilder = new StringBuilder("No enum constants for class ");
            stringBuilder.append(cls.getName());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        String[] findEnumValues = c5308b.findEnumValues(cls, enumArr, new String[enumArr.length]);
        HashMap hashMap = new HashMap();
        int length = enumArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = findEnumValues[i];
            if (obj == null) {
                obj = enumArr[i].name();
            }
            hashMap.put(obj, enumArr[i]);
        }
        return new C1530j(cls, enumArr, hashMap);
    }

    public static C1530j m3994a(Class<Enum<?>> cls, Method method) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        HashMap hashMap = new HashMap();
        int length = enumArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return new C1530j(cls, enumArr, hashMap);
            }
            Object obj = enumArr[length];
            try {
                Object invoke = method.invoke(obj, new Object[0]);
                if (invoke != null) {
                    hashMap.put(invoke.toString(), obj);
                }
            } catch (Exception e) {
                StringBuilder stringBuilder = new StringBuilder("Failed to access @JsonValue of Enum value ");
                stringBuilder.append(obj);
                stringBuilder.append(": ");
                stringBuilder.append(e.getMessage());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
    }

    public final C1528h m3995a() {
        return C1528h.m3988a(this.f4771c);
    }

    public final Enum<?> m3996a(String str) {
        return (Enum) this.f4771c.get(str);
    }

    public final Enum<?>[] m3997b() {
        return this.f4770b;
    }

    public final Class<Enum<?>> m3998c() {
        return this.f4769a;
    }
}
