package org.jivesoftware.smack;

import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.HostnameVerifier;
import org.jivesoftware.smack.compression.XMPPInputOutputStream;
import org.jivesoftware.smack.debugger.ReflectionDebuggerFactory;
import org.jivesoftware.smack.debugger.SmackDebugger;
import org.jivesoftware.smack.debugger.SmackDebuggerFactory;
import org.jivesoftware.smack.parsing.ExceptionThrowingCallback;
import org.jivesoftware.smack.parsing.ParsingExceptionCallback;

public final class SmackConfiguration {
    public static boolean DEBUG = false;
    static final List<XMPPInputOutputStream> compressionHandlers = new ArrayList(2);
    private static SmackDebuggerFactory debuggerFactory = new ReflectionDebuggerFactory();
    private static ParsingExceptionCallback defaultCallback = new ExceptionThrowingCallback();
    private static HostnameVerifier defaultHostnameVerififer = null;
    private static List<String> defaultMechs = new ArrayList();
    private static int defaultPacketReplyTimeout = 5000;
    static Set<String> disabledSmackClasses = new HashSet();
    private static int packetCollectorSize = 5000;
    static boolean smackInitialized = false;

    public static void addCompressionHandler(XMPPInputOutputStream xMPPInputOutputStream) {
        compressionHandlers.add(xMPPInputOutputStream);
    }

    public static void addDisabledSmackClass(Class<?> cls) {
        addDisabledSmackClass(cls.getName());
    }

    public static void addDisabledSmackClass(String str) {
        disabledSmackClasses.add(str);
    }

    public static void addDisabledSmackClasses(String... strArr) {
        for (String addDisabledSmackClass : strArr) {
            addDisabledSmackClass(addDisabledSmackClass);
        }
    }

    public static void addSaslMech(String str) {
        if (!defaultMechs.contains(str)) {
            defaultMechs.add(str);
        }
    }

    public static void addSaslMechs(Collection<String> collection) {
        for (String addSaslMech : collection) {
            addSaslMech(addSaslMech);
        }
    }

    public static SmackDebugger createDebugger(XMPPConnection xMPPConnection, Writer writer, Reader reader) {
        SmackDebuggerFactory debuggerFactory = getDebuggerFactory();
        return debuggerFactory == null ? null : debuggerFactory.create(xMPPConnection, writer, reader);
    }

    public static List<XMPPInputOutputStream> getCompresionHandlers() {
        List<XMPPInputOutputStream> arrayList = new ArrayList(compressionHandlers.size());
        for (XMPPInputOutputStream xMPPInputOutputStream : compressionHandlers) {
            if (xMPPInputOutputStream.isSupported()) {
                arrayList.add(xMPPInputOutputStream);
            }
        }
        return arrayList;
    }

    public static SmackDebuggerFactory getDebuggerFactory() {
        return debuggerFactory;
    }

    static HostnameVerifier getDefaultHostnameVerifier() {
        return defaultHostnameVerififer;
    }

    @Deprecated
    public static int getDefaultPacketReplyTimeout() {
        return getDefaultReplyTimeout();
    }

    public static ParsingExceptionCallback getDefaultParsingExceptionCallback() {
        return defaultCallback;
    }

    public static int getDefaultReplyTimeout() {
        if (defaultPacketReplyTimeout <= 0) {
            defaultPacketReplyTimeout = 5000;
        }
        return defaultPacketReplyTimeout;
    }

    public static List<String> getSaslMechs() {
        return Collections.unmodifiableList(defaultMechs);
    }

    public static int getStanzaCollectorSize() {
        return packetCollectorSize;
    }

    public static String getVersion() {
        return SmackInitialization.SMACK_VERSION;
    }

    public static boolean isDisabledSmackClass(String str) {
        for (String str2 : disabledSmackClasses) {
            if (str2.equals(str)) {
                return true;
            }
            int lastIndexOf = str2.lastIndexOf(46);
            if (str2.length() > lastIndexOf && !Character.isUpperCase(str2.charAt(lastIndexOf + 1)) && str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSmackInitialized() {
        return smackInitialized;
    }

    public static void removeSaslMech(String str) {
        defaultMechs.remove(str);
    }

    public static void removeSaslMechs(Collection<String> collection) {
        defaultMechs.removeAll(collection);
    }

    public static void setDebuggerFactory(SmackDebuggerFactory smackDebuggerFactory) {
        debuggerFactory = smackDebuggerFactory;
    }

    public static void setDefaultHostnameVerifier(HostnameVerifier hostnameVerifier) {
        defaultHostnameVerififer = hostnameVerifier;
    }

    @Deprecated
    public static void setDefaultPacketReplyTimeout(int i) {
        setDefaultReplyTimeout(i);
    }

    public static void setDefaultParsingExceptionCallback(ParsingExceptionCallback parsingExceptionCallback) {
        defaultCallback = parsingExceptionCallback;
    }

    public static void setDefaultReplyTimeout(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException();
        }
        defaultPacketReplyTimeout = i;
    }

    public static void setStanzaCollectorSize(int i) {
        packetCollectorSize = i;
    }
}
