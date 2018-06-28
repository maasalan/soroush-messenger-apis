package org.jivesoftware.smackx.pubsub;

public enum SubscribeOptionFields {
    deliver,
    digest,
    digest_frequency,
    expire,
    include_body,
    show_values,
    subscription_type,
    subscription_depth;

    public static SubscribeOptionFields valueOfFromElement(String str) {
        str = str.substring(str.lastIndexOf(36));
        return "show-values".equals(str) ? show_values : valueOf(str);
    }

    public final String getFieldName() {
        StringBuilder stringBuilder;
        String replace;
        if (this == show_values) {
            stringBuilder = new StringBuilder("pubsub#");
            replace = toString().replace('_', '-');
        } else {
            stringBuilder = new StringBuilder("pubsub#");
            replace = toString();
        }
        stringBuilder.append(replace);
        return stringBuilder.toString();
    }
}
