package org.jivesoftware.smack.initializer;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.SmackInitialization;
import org.jivesoftware.smack.provider.ProviderFileLoader;
import org.jivesoftware.smack.provider.ProviderManager;
import org.jivesoftware.smack.util.FileUtils;

public abstract class UrlInitializer implements SmackInitializer {
    private static final Logger LOGGER = Logger.getLogger(UrlInitializer.class.getName());

    protected String getConfigUrl() {
        return null;
    }

    protected String getProvidersUrl() {
        return null;
    }

    public List<Exception> initialize() {
        Logger logger;
        Level level;
        StringBuilder stringBuilder;
        ClassLoader classLoader = getClass().getClassLoader();
        List<Exception> linkedList = new LinkedList();
        String providersUrl = getProvidersUrl();
        if (providersUrl != null) {
            try {
                InputStream streamForUrl = FileUtils.getStreamForUrl(providersUrl, classLoader);
                if (streamForUrl != null) {
                    logger = LOGGER;
                    level = Level.FINE;
                    stringBuilder = new StringBuilder("Loading providers for providerUrl [");
                    stringBuilder.append(providersUrl);
                    stringBuilder.append("]");
                    logger.log(level, stringBuilder.toString());
                    Object providerFileLoader = new ProviderFileLoader(streamForUrl, classLoader);
                    ProviderManager.addLoader(providerFileLoader);
                    linkedList.addAll(providerFileLoader.getLoadingExceptions());
                } else {
                    Logger logger2 = LOGGER;
                    Level level2 = Level.WARNING;
                    StringBuilder stringBuilder2 = new StringBuilder("No input stream created for ");
                    stringBuilder2.append(providersUrl);
                    logger2.log(level2, stringBuilder2.toString());
                    StringBuilder stringBuilder3 = new StringBuilder("No input stream created for ");
                    stringBuilder3.append(providersUrl);
                    linkedList.add(new IOException(stringBuilder3.toString()));
                }
            } catch (Throwable e) {
                logger = LOGGER;
                level = Level.SEVERE;
                stringBuilder = new StringBuilder("Error trying to load provider file ");
                stringBuilder.append(providersUrl);
                logger.log(level, stringBuilder.toString(), e);
                linkedList.add(e);
            }
        }
        providersUrl = getConfigUrl();
        if (providersUrl != null) {
            try {
                SmackInitialization.processConfigFile(FileUtils.getStreamForUrl(providersUrl, classLoader), linkedList, classLoader);
                return linkedList;
            } catch (Exception e2) {
                linkedList.add(e2);
            }
        }
        return linkedList;
    }
}
