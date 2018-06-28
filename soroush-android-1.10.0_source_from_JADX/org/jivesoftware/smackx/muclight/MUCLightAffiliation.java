package org.jivesoftware.smackx.muclight;

import java.util.Locale;

public enum MUCLightAffiliation {
    owner,
    member,
    none;

    public static MUCLightAffiliation fromString(String str) {
        return str == null ? null : valueOf(str.toLowerCase(Locale.US));
    }
}
