package org.jivesoftware.smackx.disco;

public class Feature {

    public enum Support {
        optional,
        recommended,
        required;

        public final boolean isNotRequired() {
            return !isRequired();
        }

        public final boolean isRequired() {
            return this == required;
        }
    }
}
