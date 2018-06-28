package org.jivesoftware.smack;

import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.initializer.SmackInitializer;
import org.jivesoftware.smack.util.StringUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public final class SmackInitialization {
    private static final String DEFAULT_CONFIG_FILE = "classpath:org.jivesoftware.smack/smack-config.xml";
    private static final Logger LOGGER = Logger.getLogger(SmackInitialization.class.getName());
    static final String SMACK_VERSION;

    static {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = org.jivesoftware.smack.SmackInitialization.class;
        r0 = r0.getName();
        r0 = java.util.logging.Logger.getLogger(r0);
        LOGGER = r0;
        r0 = "4.2.0 (4.2.0-rc2-49-gb9b8b1a-4.2 2017-03-10)";	 Catch:{ Exception -> 0x0036 }
        r1 = new java.io.ByteArrayInputStream;	 Catch:{ Exception -> 0x0036 }
        r2 = "UTF-8";	 Catch:{ Exception -> 0x0036 }
        r0 = r0.getBytes(r2);	 Catch:{ Exception -> 0x0036 }
        r1.<init>(r0);	 Catch:{ Exception -> 0x0036 }
        r0 = new java.io.BufferedReader;	 Catch:{ Exception -> 0x0036 }
        r2 = new java.io.InputStreamReader;	 Catch:{ Exception -> 0x0036 }
        r2.<init>(r1);	 Catch:{ Exception -> 0x0036 }
        r0.<init>(r2);	 Catch:{ Exception -> 0x0036 }
        r1 = r0.readLine();	 Catch:{ Exception -> 0x0036 }
        r0.close();	 Catch:{ IOException -> 0x002b }
        goto L_0x0042;
    L_0x002b:
        r0 = move-exception;
        r2 = LOGGER;	 Catch:{ Exception -> 0x0036 }
        r3 = java.util.logging.Level.WARNING;	 Catch:{ Exception -> 0x0036 }
        r4 = "IOException closing stream";	 Catch:{ Exception -> 0x0036 }
        r2.log(r3, r4, r0);	 Catch:{ Exception -> 0x0036 }
        goto L_0x0042;
    L_0x0036:
        r0 = move-exception;
        r1 = LOGGER;
        r2 = java.util.logging.Level.SEVERE;
        r3 = "Could not determine Smack version";
        r1.log(r2, r3, r0);
        r1 = "unkown";
    L_0x0042:
        SMACK_VERSION = r1;
        r0 = "smack.disabledClasses";
        r0 = java.lang.System.getProperty(r0);
        r1 = 0;
        if (r0 == 0) goto L_0x0061;
    L_0x004d:
        r2 = ",";
        r0 = r0.split(r2);
        r2 = r0.length;
        r3 = r1;
    L_0x0055:
        if (r3 >= r2) goto L_0x0061;
    L_0x0057:
        r4 = r0[r3];
        r5 = org.jivesoftware.smack.SmackConfiguration.disabledSmackClasses;
        r5.add(r4);
        r3 = r3 + 1;
        goto L_0x0055;
    L_0x0061:
        r0 = "classpath:org.jivesoftware.smack/disabledClasses";	 Catch:{ Exception -> 0x00f3 }
        r2 = org.jivesoftware.smack.SmackConfiguration.disabledSmackClasses;	 Catch:{ Exception -> 0x00f3 }
        org.jivesoftware.smack.util.FileUtils.addLines(r0, r2);	 Catch:{ Exception -> 0x00f3 }
        r0 = 0;
        r2 = "org.jivesoftware.smack.CustomSmackConfiguration";	 Catch:{ ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091 }
        r2 = java.lang.Class.forName(r2);	 Catch:{ ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091 }
        r3 = "DISABLED_SMACK_CLASSES";	 Catch:{ ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091 }
        r2 = r2.getField(r3);	 Catch:{ ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091 }
        r2 = r2.get(r0);	 Catch:{ ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091 }
        r2 = (java.lang.String[]) r2;	 Catch:{ ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091 }
        if (r2 == 0) goto L_0x0091;	 Catch:{ ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091 }
    L_0x007d:
        r3 = LOGGER;	 Catch:{ ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091 }
        r4 = "Using CustomSmackConfig is deprecated and will be removed in a future release";	 Catch:{ ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091 }
        r3.warning(r4);	 Catch:{ ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091 }
        r3 = r2.length;	 Catch:{ ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091 }
    L_0x0085:
        if (r1 >= r3) goto L_0x0091;	 Catch:{ ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091 }
    L_0x0087:
        r4 = r2[r1];	 Catch:{ ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091 }
        r5 = org.jivesoftware.smack.SmackConfiguration.disabledSmackClasses;	 Catch:{ ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091 }
        r5.add(r4);	 Catch:{ ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091, ClassNotFoundException -> 0x0091 }
        r1 = r1 + 1;
        goto L_0x0085;
    L_0x0091:
        r1 = "<?xml version=\"1.0\"?>\n<!-- Smack configuration file. -->\n<smack>\n    <!-- Classes that will be loaded when Smack starts -->\n    <startupClasses>\n        <className>org.jivesoftware.smack.initializer.VmArgInitializer</className>\n        <className>org.jivesoftware.smack.ReconnectionManager</className>\n    </startupClasses>\n\n    <optionalStartupClasses>\n        <className>org.jivesoftware.smack.util.dns.javax.JavaxResolver</className>\n        <className>org.jivesoftware.smack.util.dns.minidns.MiniDnsResolver</className>\n        <className>org.jivesoftware.smack.util.dns.dnsjava.DNSJavaResolver</className>\n        <className>org.jivesoftware.smack.extensions.ExtensionsInitializer</className>\n        <className>org.jivesoftware.smack.experimental.ExperimentalInitializer</className>\n        <className>org.jivesoftware.smack.legacy.LegacyInitializer</className>\n        <className>org.jivesoftware.smack.tcp.TCPInitializer</className>\n        <className>org.jivesoftware.smack.sasl.javax.SASLJavaXSmackInitializer</className>\n        <className>org.jivesoftware.smack.sasl.provided.SASLProvidedSmackInitializer</className>\n        <className>org.jivesoftware.smack.android.AndroidSmackInitializer</className>\n        <className>org.jivesoftware.smack.java7.Java7SmackInitializer</className>\n        <className>org.jivesoftware.smack.im.SmackImInitializer</className>\n    </optionalStartupClasses>\n</smack>";	 Catch:{ Exception -> 0x00ec }
        r2 = new java.io.ByteArrayInputStream;	 Catch:{ Exception -> 0x00ec }
        r3 = "UTF-8";	 Catch:{ Exception -> 0x00ec }
        r1 = r1.getBytes(r3);	 Catch:{ Exception -> 0x00ec }
        r2.<init>(r1);	 Catch:{ Exception -> 0x00ec }
        processConfigFile(r2, r0);	 Catch:{ Exception -> 0x00e5 }
        r0 = org.jivesoftware.smack.SmackConfiguration.compressionHandlers;
        r1 = new org.jivesoftware.smack.compression.Java7ZlibInputOutputStream;
        r1.<init>();
        r0.add(r1);
        r0 = 1;
        r1 = "smack.debugEnabled";	 Catch:{ Exception -> 0x00b6 }
        r1 = java.lang.Boolean.getBoolean(r1);	 Catch:{ Exception -> 0x00b6 }
        if (r1 == 0) goto L_0x00b6;	 Catch:{ Exception -> 0x00b6 }
    L_0x00b4:
        org.jivesoftware.smack.SmackConfiguration.DEBUG = r0;	 Catch:{ Exception -> 0x00b6 }
    L_0x00b6:
        r1 = new org.jivesoftware.smack.sasl.core.SCRAMSHA1Mechanism;
        r1.<init>();
        org.jivesoftware.smack.SASLAuthentication.registerSASLMechanism(r1);
        r1 = new org.jivesoftware.smack.sasl.core.ScramSha1PlusMechanism;
        r1.<init>();
        org.jivesoftware.smack.SASLAuthentication.registerSASLMechanism(r1);
        r1 = new org.jivesoftware.smack.sasl.core.SASLXOauth2Mechanism;
        r1.<init>();
        org.jivesoftware.smack.SASLAuthentication.registerSASLMechanism(r1);
        r1 = new org.jivesoftware.smack.sasl.core.SASLAnonymous;
        r1.<init>();
        org.jivesoftware.smack.SASLAuthentication.registerSASLMechanism(r1);
        r1 = "bind";
        r2 = "urn:ietf:params:xml:ns:xmpp-bind";
        r3 = new org.jivesoftware.smack.provider.BindIQProvider;
        r3.<init>();
        org.jivesoftware.smack.provider.ProviderManager.addIQProvider(r1, r2, r3);
        org.jivesoftware.smack.SmackConfiguration.smackInitialized = r0;
        return;
    L_0x00e5:
        r0 = move-exception;
        r1 = new java.lang.IllegalStateException;
        r1.<init>(r0);
        throw r1;
    L_0x00ec:
        r0 = move-exception;
        r1 = new java.lang.IllegalStateException;
        r1.<init>(r0);
        throw r1;
    L_0x00f3:
        r0 = move-exception;
        r1 = new java.lang.IllegalStateException;
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.SmackInitialization.<clinit>():void");
    }

    private static void loadSmackClass(String str, boolean z, ClassLoader classLoader) {
        try {
            Logger logger;
            Level level;
            StringBuilder stringBuilder;
            Class cls = Class.forName(str, true, classLoader);
            if (SmackInitializer.class.isAssignableFrom(cls)) {
                List<Exception> initialize = ((SmackInitializer) cls.getConstructor(new Class[0]).newInstance(new Object[0])).initialize();
                if (initialize != null) {
                    if (initialize.size() != 0) {
                        for (Exception log : initialize) {
                            LOGGER.log(Level.SEVERE, "Exception in loadSmackClass", log);
                        }
                        return;
                    }
                }
                logger = LOGGER;
                level = Level.FINE;
                stringBuilder = new StringBuilder("Loaded SmackInitializer ");
            } else {
                logger = LOGGER;
                level = Level.FINE;
                stringBuilder = new StringBuilder("Loaded ");
            }
            stringBuilder.append(str);
            logger.log(level, stringBuilder.toString());
        } catch (ClassNotFoundException e) {
            Level level2 = z ? Level.FINE : Level.WARNING;
            Logger logger2 = LOGGER;
            StringBuilder stringBuilder2 = new StringBuilder("A startup class '");
            stringBuilder2.append(str);
            stringBuilder2.append("' could not be loaded.");
            logger2.log(level2, stringBuilder2.toString());
            if (!z) {
                throw e;
            }
        }
    }

    private static void parseClassesToLoad(XmlPullParser xmlPullParser, boolean z, Collection<Exception> collection, ClassLoader classLoader) {
        String name = xmlPullParser.getName();
        while (true) {
            int next = xmlPullParser.next();
            String name2 = xmlPullParser.getName();
            if (next == 2 && "className".equals(name2)) {
                String nextText = xmlPullParser.nextText();
                if (!SmackConfiguration.isDisabledSmackClass(nextText)) {
                    try {
                        loadSmackClass(nextText, z, classLoader);
                    } catch (Exception e) {
                        if (collection != null) {
                            collection.add(e);
                        } else {
                            throw e;
                        }
                    }
                }
            }
            if (next == 3 && name.equals(name2)) {
                return;
            }
        }
    }

    public static void processConfigFile(InputStream inputStream, Collection<Exception> collection) {
        processConfigFile(inputStream, collection, SmackInitialization.class.getClassLoader());
    }

    public static void processConfigFile(InputStream inputStream, Collection<Exception> collection, ClassLoader classLoader) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        newPullParser.setInput(inputStream, StringUtils.UTF8);
        int eventType = newPullParser.getEventType();
        do {
            if (eventType == 2) {
                if (newPullParser.getName().equals("startupClasses")) {
                    parseClassesToLoad(newPullParser, false, collection, classLoader);
                } else if (newPullParser.getName().equals("optionalStartupClasses")) {
                    parseClassesToLoad(newPullParser, true, collection, classLoader);
                }
            }
            eventType = newPullParser.next();
        } while (eventType != 1);
        try {
            inputStream.close();
        } catch (Throwable e) {
            LOGGER.log(Level.SEVERE, "Error while closing config file input stream", e);
        }
    }
}
