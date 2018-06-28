package com.p085c.p086a.p089c;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import org.jivesoftware.smack.util.StringUtils;

public interface C1208h {
    public static final Charset f3822a = Charset.forName(StringUtils.UTF8);

    void mo1158a(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
