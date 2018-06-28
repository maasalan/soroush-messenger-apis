package com.google.p173d;

import java.util.List;

public enum C2007e {
    OTHER(Object.class),
    PURE_BARCODE(Void.class),
    POSSIBLE_FORMATS(List.class),
    TRY_HARDER(Void.class),
    CHARACTER_SET(String.class),
    ALLOWED_LENGTHS(int[].class),
    ASSUME_CODE_39_CHECK_DIGIT(Void.class),
    ASSUME_GS1(Void.class),
    RETURN_CODABAR_START_END(Void.class),
    NEED_RESULT_POINT_CALLBACK(C2050q.class),
    ALLOWED_EAN_EXTENSIONS(int[].class);
    
    private final Class<?> f6733l;

    private C2007e(Class<?> cls) {
        this.f6733l = cls;
    }
}
