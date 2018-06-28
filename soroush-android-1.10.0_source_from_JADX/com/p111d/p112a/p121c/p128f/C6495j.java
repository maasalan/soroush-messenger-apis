package com.p111d.p112a.p121c.p128f;

import com.p111d.p112a.p113a.C1314h.C1313a;
import com.p111d.p112a.p113a.C1320j.C1319d;
import com.p111d.p112a.p113a.C1329q.C1327a;
import com.p111d.p112a.p113a.C1329q.C1328b;
import com.p111d.p112a.p113a.C1332s.C1331a;
import com.p111d.p112a.p114b.C1385s;
import com.p111d.p112a.p121c.C1507k.C5355a;
import com.p111d.p112a.p121c.C1545o.C5383a;
import com.p111d.p112a.p121c.C1546p.C5384a;
import com.p111d.p112a.p121c.C1549v;
import com.p111d.p112a.p121c.C5308b;
import com.p111d.p112a.p121c.C5308b.C1405a;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.p122a.C1394e.C1393a;
import com.p111d.p112a.p121c.p122a.C1397f.C1396b;
import com.p111d.p112a.p121c.p123b.C5306f;
import com.p111d.p112a.p121c.p131i.C1472a;
import com.p111d.p112a.p121c.p131i.C1477e;
import com.p111d.p112a.p121c.p134k.C7119d;
import com.p111d.p112a.p121c.p138m.C1527g;
import com.p111d.p112a.p121c.p138m.C1534n;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class C6495j extends C5308b implements Serializable {
    protected final C5308b f17724a;
    protected final C5308b f17725b;

    public C6495j(C5308b c5308b, C5308b c5308b2) {
        this.f17724a = c5308b;
        this.f17725b = c5308b2;
    }

    private static boolean m15600a(Object obj, Class<?> cls) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Class)) {
            return true;
        }
        Class<?> cls2 = (Class) obj;
        return (cls2 == cls || C1527g.m3983r(cls2)) ? false : true;
    }

    public final Collection<C5308b> allIntrospectors() {
        return allIntrospectors(new ArrayList());
    }

    public final Collection<C5308b> allIntrospectors(Collection<C5308b> collection) {
        this.f17724a.allIntrospectors(collection);
        this.f17725b.allIntrospectors(collection);
        return collection;
    }

    public final void findAndAddVirtualProperties(C5306f<?> c5306f, C5327b c5327b, List<C7119d> list) {
        this.f17724a.findAndAddVirtualProperties(c5306f, c5327b, list);
        this.f17725b.findAndAddVirtualProperties(c5306f, c5327b, list);
    }

    public final C1464z<?> findAutoDetectVisibility(C5327b c5327b, C1464z<?> c1464z) {
        return this.f17724a.findAutoDetectVisibility(c5327b, this.f17725b.findAutoDetectVisibility(c5327b, c1464z));
    }

    public final String findClassDescription(C5327b c5327b) {
        String findClassDescription = this.f17724a.findClassDescription(c5327b);
        return (findClassDescription == null || findClassDescription.isEmpty()) ? this.f17725b.findClassDescription(c5327b) : findClassDescription;
    }

    public final Object findContentDeserializer(C1449a c1449a) {
        Object findContentDeserializer = this.f17724a.findContentDeserializer(c1449a);
        return C6495j.m15600a(findContentDeserializer, C5355a.class) ? findContentDeserializer : this.f17725b.findContentDeserializer(c1449a);
    }

    public final Object findContentSerializer(C1449a c1449a) {
        Object findContentSerializer = this.f17724a.findContentSerializer(c1449a);
        return C6495j.m15600a(findContentSerializer, C5383a.class) ? findContentSerializer : this.f17725b.findContentSerializer(c1449a);
    }

    public final C1313a findCreatorBinding(C1449a c1449a) {
        C1313a findCreatorBinding = this.f17724a.findCreatorBinding(c1449a);
        return findCreatorBinding != null ? findCreatorBinding : this.f17725b.findCreatorBinding(c1449a);
    }

    public final Object findDeserializationContentConverter(C5328e c5328e) {
        Object findDeserializationContentConverter = this.f17724a.findDeserializationContentConverter(c5328e);
        return findDeserializationContentConverter == null ? this.f17725b.findDeserializationContentConverter(c5328e) : findDeserializationContentConverter;
    }

    @Deprecated
    public final Class<?> findDeserializationContentType(C1449a c1449a, C5354j c5354j) {
        Class<?> findDeserializationContentType = this.f17724a.findDeserializationContentType(c1449a, c5354j);
        return findDeserializationContentType == null ? this.f17725b.findDeserializationContentType(c1449a, c5354j) : findDeserializationContentType;
    }

    public final Object findDeserializationConverter(C1449a c1449a) {
        Object findDeserializationConverter = this.f17724a.findDeserializationConverter(c1449a);
        return findDeserializationConverter == null ? this.f17725b.findDeserializationConverter(c1449a) : findDeserializationConverter;
    }

    @Deprecated
    public final Class<?> findDeserializationKeyType(C1449a c1449a, C5354j c5354j) {
        Class<?> findDeserializationKeyType = this.f17724a.findDeserializationKeyType(c1449a, c5354j);
        return findDeserializationKeyType == null ? this.f17725b.findDeserializationKeyType(c1449a, c5354j) : findDeserializationKeyType;
    }

    @Deprecated
    public final Class<?> findDeserializationType(C1449a c1449a, C5354j c5354j) {
        Class<?> findDeserializationType = this.f17724a.findDeserializationType(c1449a, c5354j);
        return findDeserializationType != null ? findDeserializationType : this.f17725b.findDeserializationType(c1449a, c5354j);
    }

    public final Object findDeserializer(C1449a c1449a) {
        Object findDeserializer = this.f17724a.findDeserializer(c1449a);
        return C6495j.m15600a(findDeserializer, C5355a.class) ? findDeserializer : this.f17725b.findDeserializer(c1449a);
    }

    public final String findEnumValue(Enum<?> enumR) {
        String findEnumValue = this.f17724a.findEnumValue(enumR);
        return findEnumValue == null ? this.f17725b.findEnumValue(enumR) : findEnumValue;
    }

    public final String[] findEnumValues(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        return this.f17724a.findEnumValues(cls, enumArr, this.f17725b.findEnumValues(cls, enumArr, strArr));
    }

    public final Object findFilterId(C1449a c1449a) {
        Object findFilterId = this.f17724a.findFilterId(c1449a);
        return findFilterId == null ? this.f17725b.findFilterId(c1449a) : findFilterId;
    }

    public final C1319d findFormat(C1449a c1449a) {
        C1319d findFormat = this.f17724a.findFormat(c1449a);
        C1319d findFormat2 = this.f17725b.findFormat(c1449a);
        return findFormat2 == null ? findFormat : findFormat2.m3113a(findFormat);
    }

    public final Boolean findIgnoreUnknownProperties(C5327b c5327b) {
        Boolean findIgnoreUnknownProperties = this.f17724a.findIgnoreUnknownProperties(c5327b);
        return findIgnoreUnknownProperties == null ? this.f17725b.findIgnoreUnknownProperties(c5327b) : findIgnoreUnknownProperties;
    }

    public final String findImplicitPropertyName(C5328e c5328e) {
        String findImplicitPropertyName = this.f17724a.findImplicitPropertyName(c5328e);
        return findImplicitPropertyName == null ? this.f17725b.findImplicitPropertyName(c5328e) : findImplicitPropertyName;
    }

    public final Object findInjectableValueId(C5328e c5328e) {
        Object findInjectableValueId = this.f17724a.findInjectableValueId(c5328e);
        return findInjectableValueId == null ? this.f17725b.findInjectableValueId(c5328e) : findInjectableValueId;
    }

    public final Object findKeyDeserializer(C1449a c1449a) {
        Object findKeyDeserializer = this.f17724a.findKeyDeserializer(c1449a);
        return C6495j.m15600a(findKeyDeserializer, C5384a.class) ? findKeyDeserializer : this.f17725b.findKeyDeserializer(c1449a);
    }

    public final Object findKeySerializer(C1449a c1449a) {
        Object findKeySerializer = this.f17724a.findKeySerializer(c1449a);
        return C6495j.m15600a(findKeySerializer, C5383a.class) ? findKeySerializer : this.f17725b.findKeySerializer(c1449a);
    }

    public final C1549v findNameForDeserialization(C1449a c1449a) {
        C1549v findNameForDeserialization = this.f17724a.findNameForDeserialization(c1449a);
        if (findNameForDeserialization == null) {
            return this.f17725b.findNameForDeserialization(c1449a);
        }
        if (findNameForDeserialization == C1549v.f4835a) {
            C1549v findNameForDeserialization2 = this.f17725b.findNameForDeserialization(c1449a);
            if (findNameForDeserialization2 != null) {
                findNameForDeserialization = findNameForDeserialization2;
            }
        }
        return findNameForDeserialization;
    }

    public final C1549v findNameForSerialization(C1449a c1449a) {
        C1549v findNameForSerialization = this.f17724a.findNameForSerialization(c1449a);
        if (findNameForSerialization == null) {
            return this.f17725b.findNameForSerialization(c1449a);
        }
        if (findNameForSerialization == C1549v.f4835a) {
            C1549v findNameForSerialization2 = this.f17725b.findNameForSerialization(c1449a);
            if (findNameForSerialization2 != null) {
                findNameForSerialization = findNameForSerialization2;
            }
        }
        return findNameForSerialization;
    }

    public final Object findNamingStrategy(C5327b c5327b) {
        Object findNamingStrategy = this.f17724a.findNamingStrategy(c5327b);
        return findNamingStrategy == null ? this.f17725b.findNamingStrategy(c5327b) : findNamingStrategy;
    }

    public final Object findNullSerializer(C1449a c1449a) {
        Object findNullSerializer = this.f17724a.findNullSerializer(c1449a);
        return C6495j.m15600a(findNullSerializer, C5383a.class) ? findNullSerializer : this.f17725b.findNullSerializer(c1449a);
    }

    public final C1457t findObjectIdInfo(C1449a c1449a) {
        C1457t findObjectIdInfo = this.f17724a.findObjectIdInfo(c1449a);
        return findObjectIdInfo == null ? this.f17725b.findObjectIdInfo(c1449a) : findObjectIdInfo;
    }

    public final C1457t findObjectReferenceInfo(C1449a c1449a, C1457t c1457t) {
        return this.f17724a.findObjectReferenceInfo(c1449a, this.f17725b.findObjectReferenceInfo(c1449a, c1457t));
    }

    public final Class<?> findPOJOBuilder(C5327b c5327b) {
        Class<?> findPOJOBuilder = this.f17724a.findPOJOBuilder(c5327b);
        return findPOJOBuilder == null ? this.f17725b.findPOJOBuilder(c5327b) : findPOJOBuilder;
    }

    public final C1393a findPOJOBuilderConfig(C5327b c5327b) {
        C1393a findPOJOBuilderConfig = this.f17724a.findPOJOBuilderConfig(c5327b);
        return findPOJOBuilderConfig == null ? this.f17725b.findPOJOBuilderConfig(c5327b) : findPOJOBuilderConfig;
    }

    @Deprecated
    public final String[] findPropertiesToIgnore(C1449a c1449a) {
        String[] findPropertiesToIgnore = this.f17724a.findPropertiesToIgnore(c1449a);
        return findPropertiesToIgnore == null ? this.f17725b.findPropertiesToIgnore(c1449a) : findPropertiesToIgnore;
    }

    public final String[] findPropertiesToIgnore(C1449a c1449a, boolean z) {
        String[] findPropertiesToIgnore = this.f17724a.findPropertiesToIgnore(c1449a, z);
        return findPropertiesToIgnore == null ? this.f17725b.findPropertiesToIgnore(c1449a, z) : findPropertiesToIgnore;
    }

    public final C1331a findPropertyAccess(C1449a c1449a) {
        C1331a findPropertyAccess = this.f17724a.findPropertyAccess(c1449a);
        if (findPropertyAccess != null && findPropertyAccess != C1331a.AUTO) {
            return findPropertyAccess;
        }
        C1331a findPropertyAccess2 = this.f17725b.findPropertyAccess(c1449a);
        return findPropertyAccess2 != null ? findPropertyAccess2 : C1331a.AUTO;
    }

    public final C1477e<?> findPropertyContentTypeResolver(C5306f<?> c5306f, C5328e c5328e, C5354j c5354j) {
        C1477e<?> findPropertyContentTypeResolver = this.f17724a.findPropertyContentTypeResolver(c5306f, c5328e, c5354j);
        return findPropertyContentTypeResolver == null ? this.f17725b.findPropertyContentTypeResolver(c5306f, c5328e, c5354j) : findPropertyContentTypeResolver;
    }

    public final String findPropertyDefaultValue(C1449a c1449a) {
        String findPropertyDefaultValue = this.f17724a.findPropertyDefaultValue(c1449a);
        if (findPropertyDefaultValue != null) {
            if (!findPropertyDefaultValue.isEmpty()) {
                return findPropertyDefaultValue;
            }
        }
        return this.f17725b.findPropertyDefaultValue(c1449a);
    }

    public final String findPropertyDescription(C1449a c1449a) {
        String findPropertyDescription = this.f17724a.findPropertyDescription(c1449a);
        return findPropertyDescription == null ? this.f17725b.findPropertyDescription(c1449a) : findPropertyDescription;
    }

    public final C1328b findPropertyInclusion(C1449a c1449a) {
        C1328b findPropertyInclusion = this.f17725b.findPropertyInclusion(c1449a);
        C1328b findPropertyInclusion2 = this.f17724a.findPropertyInclusion(c1449a);
        return findPropertyInclusion == null ? findPropertyInclusion2 : findPropertyInclusion.m3138a(findPropertyInclusion2);
    }

    public final Integer findPropertyIndex(C1449a c1449a) {
        Integer findPropertyIndex = this.f17724a.findPropertyIndex(c1449a);
        return findPropertyIndex == null ? this.f17725b.findPropertyIndex(c1449a) : findPropertyIndex;
    }

    public final C1477e<?> findPropertyTypeResolver(C5306f<?> c5306f, C5328e c5328e, C5354j c5354j) {
        C1477e<?> findPropertyTypeResolver = this.f17724a.findPropertyTypeResolver(c5306f, c5328e, c5354j);
        return findPropertyTypeResolver == null ? this.f17725b.findPropertyTypeResolver(c5306f, c5328e, c5354j) : findPropertyTypeResolver;
    }

    public final C1405a findReferenceType(C5328e c5328e) {
        C1405a findReferenceType = this.f17724a.findReferenceType(c5328e);
        return findReferenceType == null ? this.f17725b.findReferenceType(c5328e) : findReferenceType;
    }

    public final C1549v findRootName(C5327b c5327b) {
        C1549v findRootName = this.f17724a.findRootName(c5327b);
        if (findRootName == null) {
            return this.f17725b.findRootName(c5327b);
        }
        if (findRootName.m4061c()) {
            return findRootName;
        }
        C1549v findRootName2 = this.f17725b.findRootName(c5327b);
        return findRootName2 == null ? findRootName : findRootName2;
    }

    public final Object findSerializationContentConverter(C5328e c5328e) {
        Object findSerializationContentConverter = this.f17724a.findSerializationContentConverter(c5328e);
        return findSerializationContentConverter == null ? this.f17725b.findSerializationContentConverter(c5328e) : findSerializationContentConverter;
    }

    @Deprecated
    public final Class<?> findSerializationContentType(C1449a c1449a, C5354j c5354j) {
        Class<?> findSerializationContentType = this.f17724a.findSerializationContentType(c1449a, c5354j);
        return findSerializationContentType == null ? this.f17725b.findSerializationContentType(c1449a, c5354j) : findSerializationContentType;
    }

    public final Object findSerializationConverter(C1449a c1449a) {
        Object findSerializationConverter = this.f17724a.findSerializationConverter(c1449a);
        return findSerializationConverter == null ? this.f17725b.findSerializationConverter(c1449a) : findSerializationConverter;
    }

    @Deprecated
    public final C1327a findSerializationInclusion(C1449a c1449a, C1327a c1327a) {
        return this.f17724a.findSerializationInclusion(c1449a, this.f17725b.findSerializationInclusion(c1449a, c1327a));
    }

    @Deprecated
    public final C1327a findSerializationInclusionForContent(C1449a c1449a, C1327a c1327a) {
        return this.f17724a.findSerializationInclusionForContent(c1449a, this.f17725b.findSerializationInclusionForContent(c1449a, c1327a));
    }

    @Deprecated
    public final Class<?> findSerializationKeyType(C1449a c1449a, C5354j c5354j) {
        Class<?> findSerializationKeyType = this.f17724a.findSerializationKeyType(c1449a, c5354j);
        return findSerializationKeyType == null ? this.f17725b.findSerializationKeyType(c1449a, c5354j) : findSerializationKeyType;
    }

    public final String[] findSerializationPropertyOrder(C5327b c5327b) {
        String[] findSerializationPropertyOrder = this.f17724a.findSerializationPropertyOrder(c5327b);
        return findSerializationPropertyOrder == null ? this.f17725b.findSerializationPropertyOrder(c5327b) : findSerializationPropertyOrder;
    }

    public final Boolean findSerializationSortAlphabetically(C1449a c1449a) {
        Boolean findSerializationSortAlphabetically = this.f17724a.findSerializationSortAlphabetically(c1449a);
        return findSerializationSortAlphabetically == null ? this.f17725b.findSerializationSortAlphabetically(c1449a) : findSerializationSortAlphabetically;
    }

    @Deprecated
    public final Class<?> findSerializationType(C1449a c1449a) {
        Class<?> findSerializationType = this.f17724a.findSerializationType(c1449a);
        return findSerializationType == null ? this.f17725b.findSerializationType(c1449a) : findSerializationType;
    }

    public final C1396b findSerializationTyping(C1449a c1449a) {
        C1396b findSerializationTyping = this.f17724a.findSerializationTyping(c1449a);
        return findSerializationTyping == null ? this.f17725b.findSerializationTyping(c1449a) : findSerializationTyping;
    }

    public final Object findSerializer(C1449a c1449a) {
        Object findSerializer = this.f17724a.findSerializer(c1449a);
        return C6495j.m15600a(findSerializer, C5383a.class) ? findSerializer : this.f17725b.findSerializer(c1449a);
    }

    public final List<C1472a> findSubtypes(C1449a c1449a) {
        Object findSubtypes = this.f17724a.findSubtypes(c1449a);
        Object findSubtypes2 = this.f17725b.findSubtypes(c1449a);
        if (findSubtypes == null || findSubtypes.isEmpty()) {
            return findSubtypes2;
        }
        if (findSubtypes2 == null || findSubtypes2.isEmpty()) {
            return findSubtypes;
        }
        List arrayList = new ArrayList(findSubtypes.size() + findSubtypes2.size());
        arrayList.addAll(findSubtypes);
        arrayList.addAll(findSubtypes2);
        return arrayList;
    }

    public final String findTypeName(C5327b c5327b) {
        String findTypeName = this.f17724a.findTypeName(c5327b);
        return (findTypeName == null || findTypeName.length() == 0) ? this.f17725b.findTypeName(c5327b) : findTypeName;
    }

    public final C1477e<?> findTypeResolver(C5306f<?> c5306f, C5327b c5327b, C5354j c5354j) {
        C1477e<?> findTypeResolver = this.f17724a.findTypeResolver(c5306f, c5327b, c5354j);
        return findTypeResolver == null ? this.f17725b.findTypeResolver(c5306f, c5327b, c5354j) : findTypeResolver;
    }

    public final C1534n findUnwrappingNameTransformer(C5328e c5328e) {
        C1534n findUnwrappingNameTransformer = this.f17724a.findUnwrappingNameTransformer(c5328e);
        return findUnwrappingNameTransformer == null ? this.f17725b.findUnwrappingNameTransformer(c5328e) : findUnwrappingNameTransformer;
    }

    public final Object findValueInstantiator(C5327b c5327b) {
        Object findValueInstantiator = this.f17724a.findValueInstantiator(c5327b);
        return findValueInstantiator == null ? this.f17725b.findValueInstantiator(c5327b) : findValueInstantiator;
    }

    public final Class<?>[] findViews(C1449a c1449a) {
        Class<?>[] findViews = this.f17724a.findViews(c1449a);
        return findViews == null ? this.f17725b.findViews(c1449a) : findViews;
    }

    public final C1549v findWrapperName(C1449a c1449a) {
        C1549v findWrapperName = this.f17724a.findWrapperName(c1449a);
        if (findWrapperName == null) {
            return this.f17725b.findWrapperName(c1449a);
        }
        if (findWrapperName == C1549v.f4835a) {
            C1549v findWrapperName2 = this.f17725b.findWrapperName(c1449a);
            if (findWrapperName2 != null) {
                findWrapperName = findWrapperName2;
            }
        }
        return findWrapperName;
    }

    public final boolean hasAnyGetterAnnotation(C7087f c7087f) {
        if (!this.f17724a.hasAnyGetterAnnotation(c7087f)) {
            if (!this.f17725b.hasAnyGetterAnnotation(c7087f)) {
                return false;
            }
        }
        return true;
    }

    public final boolean hasAnySetterAnnotation(C7087f c7087f) {
        if (!this.f17724a.hasAnySetterAnnotation(c7087f)) {
            if (!this.f17725b.hasAnySetterAnnotation(c7087f)) {
                return false;
            }
        }
        return true;
    }

    public final boolean hasAsValueAnnotation(C7087f c7087f) {
        if (!this.f17724a.hasAsValueAnnotation(c7087f)) {
            if (!this.f17725b.hasAsValueAnnotation(c7087f)) {
                return false;
            }
        }
        return true;
    }

    public final boolean hasCreatorAnnotation(C1449a c1449a) {
        if (!this.f17724a.hasCreatorAnnotation(c1449a)) {
            if (!this.f17725b.hasCreatorAnnotation(c1449a)) {
                return false;
            }
        }
        return true;
    }

    public final boolean hasIgnoreMarker(C5328e c5328e) {
        if (!this.f17724a.hasIgnoreMarker(c5328e)) {
            if (!this.f17725b.hasIgnoreMarker(c5328e)) {
                return false;
            }
        }
        return true;
    }

    public final Boolean hasRequiredMarker(C5328e c5328e) {
        Boolean hasRequiredMarker = this.f17724a.hasRequiredMarker(c5328e);
        return hasRequiredMarker == null ? this.f17725b.hasRequiredMarker(c5328e) : hasRequiredMarker;
    }

    public final boolean isAnnotationBundle(Annotation annotation) {
        if (!this.f17724a.isAnnotationBundle(annotation)) {
            if (!this.f17725b.isAnnotationBundle(annotation)) {
                return false;
            }
        }
        return true;
    }

    public final Boolean isIgnorableType(C5327b c5327b) {
        Boolean isIgnorableType = this.f17724a.isIgnorableType(c5327b);
        return isIgnorableType == null ? this.f17725b.isIgnorableType(c5327b) : isIgnorableType;
    }

    public final Boolean isTypeId(C5328e c5328e) {
        Boolean isTypeId = this.f17724a.isTypeId(c5328e);
        return isTypeId == null ? this.f17725b.isTypeId(c5328e) : isTypeId;
    }

    public final C5354j refineDeserializationType(C5306f<?> c5306f, C1449a c1449a, C5354j c5354j) {
        return this.f17724a.refineDeserializationType(c5306f, c1449a, this.f17725b.refineDeserializationType(c5306f, c1449a, c5354j));
    }

    public final C5354j refineSerializationType(C5306f<?> c5306f, C1449a c1449a, C5354j c5354j) {
        return this.f17724a.refineSerializationType(c5306f, c1449a, this.f17725b.refineSerializationType(c5306f, c1449a, c5354j));
    }

    public final C7087f resolveSetterConflict(C5306f<?> c5306f, C7087f c7087f, C7087f c7087f2) {
        C7087f resolveSetterConflict = this.f17724a.resolveSetterConflict(c5306f, c7087f, c7087f2);
        return resolveSetterConflict == null ? this.f17725b.resolveSetterConflict(c5306f, c7087f, c7087f2) : resolveSetterConflict;
    }

    public final C1385s version() {
        return this.f17724a.version();
    }
}
