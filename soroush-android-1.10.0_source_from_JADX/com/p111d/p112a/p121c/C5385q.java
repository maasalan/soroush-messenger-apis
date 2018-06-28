package com.p111d.p112a.p121c;

import com.p111d.p112a.p121c.p123b.C1406b;

public enum C5385q implements C1406b {
    USE_ANNOTATIONS(true),
    AUTO_DETECT_CREATORS(true),
    AUTO_DETECT_FIELDS(true),
    AUTO_DETECT_GETTERS(true),
    AUTO_DETECT_IS_GETTERS(true),
    AUTO_DETECT_SETTERS(true),
    REQUIRE_SETTERS_FOR_GETTERS(false),
    USE_GETTERS_AS_SETTERS(true),
    CAN_OVERRIDE_ACCESS_MODIFIERS(true),
    OVERRIDE_PUBLIC_ACCESS_MODIFIERS(true),
    INFER_PROPERTY_MUTATORS(true),
    ALLOW_FINAL_FIELDS_AS_MUTATORS(true),
    PROPAGATE_TRANSIENT_MARKER(false),
    USE_STATIC_TYPING(false),
    DEFAULT_VIEW_INCLUSION(true),
    SORT_PROPERTIES_ALPHABETICALLY(false),
    ACCEPT_CASE_INSENSITIVE_PROPERTIES(false),
    USE_WRAPPER_NAME_AS_PROPERTY_NAME(false),
    USE_STD_BEAN_NAMING(false),
    ALLOW_EXPLICIT_PROPERTY_RENAMING(false),
    IGNORE_DUPLICATE_MODULE_REGISTRATIONS(true);
    
    public final int f14968v;
    private final boolean f14969w;

    private C5385q(boolean z) {
        this.f14969w = z;
        this.f14968v = 1 << ordinal();
    }

    public final boolean mo1436a() {
        return this.f14969w;
    }

    public final int mo1437b() {
        return this.f14968v;
    }
}
