package com.p111d.p112a.p121c;

import com.p111d.p112a.p113a.C1314h.C1313a;
import com.p111d.p112a.p113a.C1320j.C1319d;
import com.p111d.p112a.p113a.C1329q.C1327a;
import com.p111d.p112a.p113a.C1329q.C1328b;
import com.p111d.p112a.p113a.C1332s.C1331a;
import com.p111d.p112a.p114b.C1385s;
import com.p111d.p112a.p114b.C1386t;
import com.p111d.p112a.p121c.p122a.C1394e.C1393a;
import com.p111d.p112a.p121c.p122a.C1397f.C1396b;
import com.p111d.p112a.p121c.p123b.C5306f;
import com.p111d.p112a.p121c.p128f.C1449a;
import com.p111d.p112a.p121c.p128f.C1457t;
import com.p111d.p112a.p121c.p128f.C1464z;
import com.p111d.p112a.p121c.p128f.C5327b;
import com.p111d.p112a.p121c.p128f.C5328e;
import com.p111d.p112a.p121c.p128f.C6495j;
import com.p111d.p112a.p121c.p128f.C6497s;
import com.p111d.p112a.p121c.p128f.C7087f;
import com.p111d.p112a.p121c.p131i.C1472a;
import com.p111d.p112a.p121c.p131i.C1477e;
import com.p111d.p112a.p121c.p134k.C7119d;
import com.p111d.p112a.p121c.p137l.C1513m;
import com.p111d.p112a.p121c.p137l.C7124f;
import com.p111d.p112a.p121c.p138m.C1534n;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class C5308b implements C1386t, Serializable {

    public static class C1405a {
        public final int f4420a;
        public final String f4421b;

        public enum C1403a {
            ;
            
            public static final int f4417a = 1;
            public static final int f4418b = 2;

            static {
                f4419c = new int[]{f4417a, f4418b};
            }
        }

        public C1405a(int i, String str) {
            this.f4420a = i;
            this.f4421b = str;
        }

        public final boolean m3415a() {
            return this.f4420a == C1403a.f4418b;
        }
    }

    public static C5308b nopInstance() {
        return C6497s.f17726a;
    }

    public static C5308b pair(C5308b c5308b, C5308b c5308b2) {
        return new C6495j(c5308b, c5308b2);
    }

    protected <A extends Annotation> A _findAnnotation(C1449a c1449a, Class<A> cls) {
        return c1449a.mo1357a((Class) cls);
    }

    protected boolean _hasAnnotation(C1449a c1449a, Class<? extends Annotation> cls) {
        return c1449a.mo1361b(cls);
    }

    protected boolean _hasOneOf(C1449a c1449a, Class<? extends Annotation>[] clsArr) {
        return c1449a.mo1359a((Class[]) clsArr);
    }

    public Collection<C5308b> allIntrospectors() {
        return Collections.singletonList(this);
    }

    public Collection<C5308b> allIntrospectors(Collection<C5308b> collection) {
        collection.add(this);
        return collection;
    }

    public void findAndAddVirtualProperties(C5306f<?> c5306f, C5327b c5327b, List<C7119d> list) {
    }

    public C1464z<?> findAutoDetectVisibility(C5327b c5327b, C1464z<?> c1464z) {
        return c1464z;
    }

    public String findClassDescription(C5327b c5327b) {
        return null;
    }

    public Object findContentDeserializer(C1449a c1449a) {
        return null;
    }

    public Object findContentSerializer(C1449a c1449a) {
        return null;
    }

    public C1313a findCreatorBinding(C1449a c1449a) {
        return null;
    }

    public Object findDeserializationContentConverter(C5328e c5328e) {
        return null;
    }

    @Deprecated
    public Class<?> findDeserializationContentType(C1449a c1449a, C5354j c5354j) {
        return null;
    }

    public Object findDeserializationConverter(C1449a c1449a) {
        return null;
    }

    @Deprecated
    public Class<?> findDeserializationKeyType(C1449a c1449a, C5354j c5354j) {
        return null;
    }

    @Deprecated
    public Class<?> findDeserializationType(C1449a c1449a, C5354j c5354j) {
        return null;
    }

    public Object findDeserializer(C1449a c1449a) {
        return null;
    }

    public String findEnumValue(Enum<?> enumR) {
        return enumR.name();
    }

    public String[] findEnumValues(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        int length = enumArr.length;
        for (int i = 0; i < length; i++) {
            strArr[i] = findEnumValue(enumArr[i]);
        }
        return strArr;
    }

    public Object findFilterId(C1449a c1449a) {
        return null;
    }

    public C1319d findFormat(C1449a c1449a) {
        return null;
    }

    public Boolean findIgnoreUnknownProperties(C5327b c5327b) {
        return null;
    }

    public String findImplicitPropertyName(C5328e c5328e) {
        return null;
    }

    public Object findInjectableValueId(C5328e c5328e) {
        return null;
    }

    public Object findKeyDeserializer(C1449a c1449a) {
        return null;
    }

    public Object findKeySerializer(C1449a c1449a) {
        return null;
    }

    public C1549v findNameForDeserialization(C1449a c1449a) {
        return null;
    }

    public C1549v findNameForSerialization(C1449a c1449a) {
        return null;
    }

    public Object findNamingStrategy(C5327b c5327b) {
        return null;
    }

    public Object findNullSerializer(C1449a c1449a) {
        return null;
    }

    public C1457t findObjectIdInfo(C1449a c1449a) {
        return null;
    }

    public C1457t findObjectReferenceInfo(C1449a c1449a, C1457t c1457t) {
        return c1457t;
    }

    public Class<?> findPOJOBuilder(C5327b c5327b) {
        return null;
    }

    public C1393a findPOJOBuilderConfig(C5327b c5327b) {
        return null;
    }

    @Deprecated
    public String[] findPropertiesToIgnore(C1449a c1449a) {
        return findPropertiesToIgnore(c1449a, true);
    }

    public String[] findPropertiesToIgnore(C1449a c1449a, boolean z) {
        return null;
    }

    public C1331a findPropertyAccess(C1449a c1449a) {
        return null;
    }

    public C1477e<?> findPropertyContentTypeResolver(C5306f<?> c5306f, C5328e c5328e, C5354j c5354j) {
        return null;
    }

    public String findPropertyDefaultValue(C1449a c1449a) {
        return null;
    }

    public String findPropertyDescription(C1449a c1449a) {
        return null;
    }

    public C1328b findPropertyInclusion(C1449a c1449a) {
        return C1328b.m3136a();
    }

    public Integer findPropertyIndex(C1449a c1449a) {
        return null;
    }

    public C1477e<?> findPropertyTypeResolver(C5306f<?> c5306f, C5328e c5328e, C5354j c5354j) {
        return null;
    }

    public C1405a findReferenceType(C5328e c5328e) {
        return null;
    }

    public C1549v findRootName(C5327b c5327b) {
        return null;
    }

    public Object findSerializationContentConverter(C5328e c5328e) {
        return null;
    }

    @Deprecated
    public Class<?> findSerializationContentType(C1449a c1449a, C5354j c5354j) {
        return null;
    }

    public Object findSerializationConverter(C1449a c1449a) {
        return null;
    }

    @Deprecated
    public C1327a findSerializationInclusion(C1449a c1449a, C1327a c1327a) {
        return c1327a;
    }

    @Deprecated
    public C1327a findSerializationInclusionForContent(C1449a c1449a, C1327a c1327a) {
        return c1327a;
    }

    @Deprecated
    public Class<?> findSerializationKeyType(C1449a c1449a, C5354j c5354j) {
        return null;
    }

    public String[] findSerializationPropertyOrder(C5327b c5327b) {
        return null;
    }

    public Boolean findSerializationSortAlphabetically(C1449a c1449a) {
        return null;
    }

    @Deprecated
    public Class<?> findSerializationType(C1449a c1449a) {
        return null;
    }

    public C1396b findSerializationTyping(C1449a c1449a) {
        return null;
    }

    public Object findSerializer(C1449a c1449a) {
        return null;
    }

    public List<C1472a> findSubtypes(C1449a c1449a) {
        return null;
    }

    public String findTypeName(C5327b c5327b) {
        return null;
    }

    public C1477e<?> findTypeResolver(C5306f<?> c5306f, C5327b c5327b, C5354j c5354j) {
        return null;
    }

    public C1534n findUnwrappingNameTransformer(C5328e c5328e) {
        return null;
    }

    public Object findValueInstantiator(C5327b c5327b) {
        return null;
    }

    public Class<?>[] findViews(C1449a c1449a) {
        return null;
    }

    public C1549v findWrapperName(C1449a c1449a) {
        return null;
    }

    public boolean hasAnyGetterAnnotation(C7087f c7087f) {
        return false;
    }

    public boolean hasAnySetterAnnotation(C7087f c7087f) {
        return false;
    }

    public boolean hasAsValueAnnotation(C7087f c7087f) {
        return false;
    }

    public boolean hasCreatorAnnotation(C1449a c1449a) {
        return false;
    }

    public boolean hasIgnoreMarker(C5328e c5328e) {
        return false;
    }

    public Boolean hasRequiredMarker(C5328e c5328e) {
        return null;
    }

    public boolean isAnnotationBundle(Annotation annotation) {
        return false;
    }

    public Boolean isIgnorableType(C5327b c5327b) {
        return null;
    }

    public Boolean isTypeId(C5328e c5328e) {
        return null;
    }

    public C5354j refineDeserializationType(C5306f<?> c5306f, C1449a c1449a, C5354j c5354j) {
        C5354j t;
        Class findDeserializationKeyType;
        C1513m p = c5306f.m11092p();
        Class findDeserializationType = findDeserializationType(c1449a, c5354j);
        if (!(findDeserializationType == null || c5354j.m11526c(findDeserializationType))) {
            try {
                c5354j = p.m3918a(c5354j, findDeserializationType);
            } catch (Throwable e) {
                throw new C5364l(null, String.format("Failed to narrow type %s with annotation (value %s), from '%s': %s", new Object[]{c5354j, findDeserializationType.getName(), c1449a.mo1360b(), e.getMessage()}), e);
            }
        }
        if (c5354j.mo3397p()) {
            t = c5354j.mo3398t();
            findDeserializationKeyType = findDeserializationKeyType(c1449a, t);
            if (findDeserializationKeyType != null) {
                try {
                    c5354j = ((C7124f) c5354j).mo3553b(p.m3918a(t, findDeserializationKeyType));
                } catch (Throwable e2) {
                    throw new C5364l(null, String.format("Failed to narrow key type of %s with concrete-type annotation (value %s), from '%s': %s", new Object[]{c5354j, findDeserializationKeyType.getName(), c1449a.mo1360b(), e2.getMessage()}), e2);
                }
            }
        }
        t = c5354j.mo3394u();
        if (t != null) {
            findDeserializationKeyType = findDeserializationContentType(c1449a, t);
            if (findDeserializationKeyType != null) {
                try {
                    return c5354j.mo3378a(p.m3918a(t, findDeserializationKeyType));
                } catch (Throwable e22) {
                    throw new C5364l(null, String.format("Failed to narrow value type of %s with concrete-type annotation (value %s), from '%s': %s", new Object[]{c5354j, findDeserializationKeyType.getName(), c1449a.mo1360b(), e22.getMessage()}), e22);
                }
            }
        }
        return c5354j;
    }

    public C5354j refineSerializationType(C5306f<?> c5306f, C1449a c1449a, C5354j c5354j) {
        C5354j t;
        Class findSerializationKeyType;
        c5306f.m11092p();
        Class findSerializationType = findSerializationType(c1449a);
        if (findSerializationType != null) {
            if (c5354j.m11526c(findSerializationType)) {
                c5354j = c5354j.mo3385d();
            } else {
                try {
                    c5354j = C1513m.m3912b(c5354j, findSerializationType);
                } catch (Throwable e) {
                    throw new C5364l(null, String.format("Failed to widen type %s with annotation (value %s), from '%s': %s", new Object[]{c5354j, findSerializationType.getName(), c1449a.mo1360b(), e.getMessage()}), e);
                }
            }
        }
        if (c5354j.mo3397p()) {
            t = c5354j.mo3398t();
            findSerializationKeyType = findSerializationKeyType(c1449a, t);
            if (findSerializationKeyType != null) {
                if (t.m11526c(findSerializationKeyType)) {
                    t = t.mo3385d();
                } else {
                    try {
                        t = C1513m.m3912b(t, findSerializationKeyType);
                    } catch (Throwable e2) {
                        throw new C5364l(null, String.format("Failed to widen key type of %s with concrete-type annotation (value %s), from '%s': %s", new Object[]{c5354j, findSerializationKeyType.getName(), c1449a.mo1360b(), e2.getMessage()}), e2);
                    }
                }
                c5354j = ((C7124f) c5354j).mo3553b(t);
            }
        }
        t = c5354j.mo3394u();
        if (t != null) {
            findSerializationKeyType = findSerializationContentType(c1449a, t);
            if (findSerializationKeyType != null) {
                if (t.m11526c(findSerializationKeyType)) {
                    t = t.mo3385d();
                } else {
                    try {
                        t = C1513m.m3912b(t, findSerializationKeyType);
                    } catch (Throwable e22) {
                        throw new C5364l(null, String.format("Failed to widen value type of %s with concrete-type annotation (value %s), from '%s': %s", new Object[]{c5354j, findSerializationKeyType.getName(), c1449a.mo1360b(), e22.getMessage()}), e22);
                    }
                }
                return c5354j.mo3378a(t);
            }
        }
        return c5354j;
    }

    public C7087f resolveSetterConflict(C5306f<?> c5306f, C7087f c7087f, C7087f c7087f2) {
        return null;
    }

    public abstract C1385s version();
}
