package com.google.android.gms.internal;

import java.io.IOException;

public final class oh extends IOException {
    public oh(String str) {
        super(str);
    }

    static oh m5118a() {
        return new oh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static oh m5119b() {
        return new oh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static oh m5120c() {
        return new oh("CodedInputStream encountered a malformed varint.");
    }

    static oh m5121d() {
        return new oh("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
