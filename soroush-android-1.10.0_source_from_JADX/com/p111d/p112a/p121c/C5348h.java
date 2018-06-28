package com.p111d.p112a.p121c;

import com.p111d.p112a.p121c.p123b.C1406b;

public enum C5348h implements C1406b {
    USE_BIG_DECIMAL_FOR_FLOATS(false),
    USE_BIG_INTEGER_FOR_INTS(false),
    USE_LONG_FOR_INTS(false),
    USE_JAVA_ARRAY_FOR_JSON_ARRAY(false),
    READ_ENUMS_USING_TO_STRING(false),
    FAIL_ON_UNKNOWN_PROPERTIES(true),
    FAIL_ON_NULL_FOR_PRIMITIVES(false),
    FAIL_ON_NUMBERS_FOR_ENUMS(false),
    FAIL_ON_INVALID_SUBTYPE(true),
    FAIL_ON_READING_DUP_TREE_KEY(false),
    FAIL_ON_IGNORED_PROPERTIES(false),
    FAIL_ON_UNRESOLVED_OBJECT_IDS(true),
    FAIL_ON_MISSING_CREATOR_PROPERTIES(false),
    WRAP_EXCEPTIONS(true),
    ACCEPT_SINGLE_VALUE_AS_ARRAY(false),
    UNWRAP_SINGLE_VALUE_ARRAYS(false),
    UNWRAP_ROOT_VALUE(false),
    ACCEPT_EMPTY_STRING_AS_NULL_OBJECT(false),
    ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT(false),
    ACCEPT_FLOAT_AS_INT(true),
    READ_UNKNOWN_ENUM_VALUES_AS_NULL(false),
    READ_DATE_TIMESTAMPS_AS_NANOSECONDS(true),
    ADJUST_DATES_TO_CONTEXT_TIME_ZONE(true),
    EAGER_DESERIALIZER_FETCH(true);
    
    public final int f14891y;
    private final boolean f14892z;

    private C5348h(boolean z) {
        this.f14892z = z;
        this.f14891y = 1 << ordinal();
    }

    public final boolean mo1436a() {
        return this.f14892z;
    }

    public final boolean m11480a(int i) {
        return (i & this.f14891y) != 0;
    }

    public final int mo1437b() {
        return this.f14891y;
    }
}
