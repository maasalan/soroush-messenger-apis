package org.jivesoftware.smack.util;

import java.util.Collection;

public class CollectionUtil {
    public static <T> Collection<T> requireNotEmpty(Collection<T> collection, String str) {
        StringBuilder stringBuilder;
        if (collection == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" must not be null.");
            throw new NullPointerException(stringBuilder.toString());
        } else if (!collection.isEmpty()) {
            return collection;
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" must not be empty.");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
