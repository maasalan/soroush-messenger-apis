package org.jivesoftware.smack.experimental;

import org.jivesoftware.smack.initializer.UrlInitializer;

public class ExperimentalInitializer extends UrlInitializer {
    protected String getConfigUrl() {
        return "classpath:org.jivesoftware.smack.experimental/experimental.xml";
    }

    protected String getProvidersUrl() {
        return "classpath:org.jivesoftware.smack.experimental/experimental.providers";
    }
}
