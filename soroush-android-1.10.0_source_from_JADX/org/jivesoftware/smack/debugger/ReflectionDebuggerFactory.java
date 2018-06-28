package org.jivesoftware.smack.debugger;

import java.io.Reader;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.XMPPConnection;

public class ReflectionDebuggerFactory implements SmackDebuggerFactory {
    private static final String DEBUGGER_CLASS_PROPERTY_NAME = "smack.debuggerClass";
    private static final String[] DEFAULT_DEBUGGERS = new String[]{"org.jivesoftware.smackx.debugger.EnhancedDebugger", "org.jivesoftware.smackx.debugger.android.AndroidDebugger", "org.jivesoftware.smack.debugger.ConsoleDebugger", "org.jivesoftware.smack.debugger.LiteDebugger", "org.jivesoftware.smack.debugger.JulDebugger"};
    private static final Logger LOGGER = Logger.getLogger(ReflectionDebuggerFactory.class.getName());

    private static java.lang.String getCustomDebuggerClassName() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "smack.debuggerClass";	 Catch:{ Throwable -> 0x0007 }
        r0 = java.lang.System.getProperty(r0);	 Catch:{ Throwable -> 0x0007 }
        return r0;
    L_0x0007:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.debugger.ReflectionDebuggerFactory.getCustomDebuggerClassName():java.lang.String");
    }

    public static Class<SmackDebugger> getDebuggerClass() {
        String customDebuggerClassName = getCustomDebuggerClassName();
        if (customDebuggerClassName == null) {
            return getOneOfDefaultDebuggerClasses();
        }
        try {
            return Class.forName(customDebuggerClassName);
        } catch (Throwable e) {
            Logger logger = LOGGER;
            Level level = Level.WARNING;
            StringBuilder stringBuilder = new StringBuilder("Unable to instantiate debugger class ");
            stringBuilder.append(customDebuggerClassName);
            logger.log(level, stringBuilder.toString(), e);
            return null;
        }
    }

    private static java.lang.Class<org.jivesoftware.smack.debugger.SmackDebugger> getOneOfDefaultDebuggerClasses() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = DEFAULT_DEBUGGERS;
        r1 = 0;
        r2 = r0.length;
    L_0x0004:
        if (r1 >= r2) goto L_0x003b;
    L_0x0006:
        r3 = r0[r1];
        r4 = org.jivesoftware.smack.SmackConfiguration.isDisabledSmackClass(r3);
        if (r4 != 0) goto L_0x0038;
    L_0x000e:
        r4 = java.lang.Class.forName(r3);	 Catch:{ ClassNotFoundException -> 0x0020, ClassCastException -> 0x0018, Exception -> 0x0013 }
        return r4;
    L_0x0013:
        r3 = LOGGER;
        r4 = "Unable to instantiate either Smack debugger class";
        goto L_0x001c;
    L_0x0018:
        r3 = LOGGER;
        r4 = "Found debugger class that does not appears to implement SmackDebugger interface";
    L_0x001c:
        r3.warning(r4);
        goto L_0x0038;
    L_0x0020:
        r4 = LOGGER;
        r5 = new java.lang.StringBuilder;
        r6 = "Did not find debugger class '";
        r5.<init>(r6);
        r5.append(r3);
        r3 = "'";
        r5.append(r3);
        r3 = r5.toString();
        r4.fine(r3);
    L_0x0038:
        r1 = r1 + 1;
        goto L_0x0004;
    L_0x003b:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.debugger.ReflectionDebuggerFactory.getOneOfDefaultDebuggerClasses():java.lang.Class<org.jivesoftware.smack.debugger.SmackDebugger>");
    }

    public static void setDebuggerClass(Class<? extends SmackDebugger> cls) {
        if (cls == null) {
            System.clearProperty(DEBUGGER_CLASS_PROPERTY_NAME);
        } else {
            System.setProperty(DEBUGGER_CLASS_PROPERTY_NAME, cls.getCanonicalName());
        }
    }

    public SmackDebugger create(XMPPConnection xMPPConnection, Writer writer, Reader reader) {
        Class debuggerClass = getDebuggerClass();
        if (debuggerClass == null) {
            return null;
        }
        try {
            return (SmackDebugger) debuggerClass.getConstructor(new Class[]{XMPPConnection.class, Writer.class, Reader.class}).newInstance(new Object[]{xMPPConnection, writer, reader});
        } catch (Throwable e) {
            throw new IllegalArgumentException("Can't initialize the configured debugger!", e);
        }
    }
}
