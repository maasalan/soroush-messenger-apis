package com.p111d.p112a.p121c;

import com.p111d.p112a.p121c.p123b.C1406b;

public enum C5387z implements C1406b {
    WRAP_ROOT_VALUE(false),
    INDENT_OUTPUT(false),
    FAIL_ON_EMPTY_BEANS(true),
    FAIL_ON_SELF_REFERENCES(true),
    WRAP_EXCEPTIONS(true),
    FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS(true),
    CLOSE_CLOSEABLE(false),
    FLUSH_AFTER_WRITE_VALUE(true),
    WRITE_DATES_AS_TIMESTAMPS(true),
    WRITE_DATE_KEYS_AS_TIMESTAMPS(false),
    WRITE_DATES_WITH_ZONE_ID(false),
    WRITE_DURATIONS_AS_TIMESTAMPS(true),
    WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS(false),
    WRITE_ENUMS_USING_TO_STRING(false),
    WRITE_ENUMS_USING_INDEX(false),
    WRITE_NULL_MAP_VALUES(true),
    WRITE_EMPTY_JSON_ARRAYS(true),
    WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED(false),
    WRITE_BIGDECIMAL_AS_PLAIN(false),
    WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS(true),
    ORDER_MAP_ENTRIES_BY_KEYS(false),
    EAGER_SERIALIZER_FETCH(true),
    USE_EQUALITY_FOR_OBJECT_ID(false);
    
    final int f14994x;
    private final boolean f14995y;

    private C5387z(boolean z) {
        this.f14995y = z;
        this.f14994x = 1 << ordinal();
    }

    public final boolean mo1436a() {
        return this.f14995y;
    }

    public final int mo1437b() {
        return this.f14994x;
    }
}
