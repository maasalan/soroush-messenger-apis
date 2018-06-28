package org.jivesoftware.smack.provider;

import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class ProviderFileLoader implements ProviderLoader {
    private static final Logger LOGGER = Logger.getLogger(ProviderFileLoader.class.getName());
    private List<Exception> exceptions;
    private final Collection<ExtensionProviderInfo> extProviders;
    private final Collection<IQProviderInfo> iqProviders;
    private final Collection<StreamFeatureProviderInfo> sfProviders;

    public ProviderFileLoader(InputStream inputStream) {
        this(inputStream, ProviderFileLoader.class.getClassLoader());
    }

    public ProviderFileLoader(java.io.InputStream r13, java.lang.ClassLoader r14) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r12 = this;
        r12.<init>();
        r0 = new java.util.LinkedList;
        r0.<init>();
        r12.iqProviders = r0;
        r0 = new java.util.LinkedList;
        r0.<init>();
        r12.extProviders = r0;
        r0 = new java.util.LinkedList;
        r0.<init>();
        r12.sfProviders = r0;
        r0 = new java.util.LinkedList;
        r0.<init>();
        r12.exceptions = r0;
        r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance();	 Catch:{ Exception -> 0x0195 }
        r0 = r0.newPullParser();	 Catch:{ Exception -> 0x0195 }
        r1 = "http://xmlpull.org/v1/doc/features.html#process-namespaces";	 Catch:{ Exception -> 0x0195 }
        r2 = 1;	 Catch:{ Exception -> 0x0195 }
        r0.setFeature(r1, r2);	 Catch:{ Exception -> 0x0195 }
        r1 = "UTF-8";	 Catch:{ Exception -> 0x0195 }
        r0.setInput(r13, r1);	 Catch:{ Exception -> 0x0195 }
        r1 = r0.getEventType();	 Catch:{ Exception -> 0x0195 }
    L_0x0036:
        r3 = 2;	 Catch:{ Exception -> 0x0195 }
        if (r1 != r3) goto L_0x0189;	 Catch:{ Exception -> 0x0195 }
    L_0x0039:
        r1 = r0.getName();	 Catch:{ Exception -> 0x0195 }
        r4 = "smackProviders";	 Catch:{ IllegalArgumentException -> 0x0169 }
        r4 = r4.equals(r1);	 Catch:{ IllegalArgumentException -> 0x0169 }
        if (r4 != 0) goto L_0x0189;	 Catch:{ IllegalArgumentException -> 0x0169 }
    L_0x0045:
        r0.next();	 Catch:{ IllegalArgumentException -> 0x0169 }
        r0.next();	 Catch:{ IllegalArgumentException -> 0x0169 }
        r4 = r0.nextText();	 Catch:{ IllegalArgumentException -> 0x0169 }
        r0.next();	 Catch:{ IllegalArgumentException -> 0x0169 }
        r0.next();	 Catch:{ IllegalArgumentException -> 0x0169 }
        r5 = r0.nextText();	 Catch:{ IllegalArgumentException -> 0x0169 }
        r0.next();	 Catch:{ IllegalArgumentException -> 0x0169 }
        r0.next();	 Catch:{ IllegalArgumentException -> 0x0169 }
        r6 = r0.nextText();	 Catch:{ IllegalArgumentException -> 0x0169 }
        r7 = r14.loadClass(r6);	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r8 = -1;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r9 = r1.hashCode();	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r10 = -797518000; // 0xffffffffd076d750 float:-1.65652234E10 double:NaN;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r11 = 0;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        if (r9 == r10) goto L_0x0090;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
    L_0x0072:
        r10 = 80611175; // 0x4ce0767 float:4.8437165E-36 double:3.9827212E-316;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        if (r9 == r10) goto L_0x0087;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
    L_0x0077:
        r3 = 1834143545; // 0x6d52cf39 float:4.077648E27 double:9.06187315E-315;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        if (r9 == r3) goto L_0x007d;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
    L_0x007c:
        goto L_0x009a;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
    L_0x007d:
        r3 = "iqProvider";	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r3 = r1.equals(r3);	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        if (r3 == 0) goto L_0x009a;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
    L_0x0085:
        r3 = r11;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        goto L_0x009b;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
    L_0x0087:
        r9 = "streamFeatureProvider";	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r9 = r1.equals(r9);	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        if (r9 == 0) goto L_0x009a;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
    L_0x008f:
        goto L_0x009b;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
    L_0x0090:
        r3 = "extensionProvider";	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r3 = r1.equals(r3);	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        if (r3 == 0) goto L_0x009a;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
    L_0x0098:
        r3 = r2;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        goto L_0x009b;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
    L_0x009a:
        r3 = r8;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
    L_0x009b:
        switch(r3) {
            case 0: goto L_0x00f7;
            case 1: goto L_0x00bc;
            case 2: goto L_0x00a2;
            default: goto L_0x009e;
        };	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
    L_0x009e:
        r3 = LOGGER;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        goto L_0x012e;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
    L_0x00a2:
        r3 = new java.lang.Class[r11];	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r3 = r7.getConstructor(r3);	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r7 = new java.lang.Object[r11];	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r3 = r3.newInstance(r7);	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r3 = (org.jivesoftware.smack.provider.ExtensionElementProvider) r3;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r7 = r12.sfProviders;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r8 = new org.jivesoftware.smack.provider.StreamFeatureProviderInfo;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r8.<init>(r4, r5, r3);	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
    L_0x00b7:
        r7.add(r8);	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        goto L_0x0189;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
    L_0x00bc:
        r3 = org.jivesoftware.smack.provider.ExtensionElementProvider.class;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r3 = r3.isAssignableFrom(r7);	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        if (r3 == 0) goto L_0x00da;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
    L_0x00c4:
        r3 = new java.lang.Class[r11];	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r3 = r7.getConstructor(r3);	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r7 = new java.lang.Object[r11];	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r3 = r3.newInstance(r7);	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r3 = (org.jivesoftware.smack.provider.ExtensionElementProvider) r3;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r7 = r12.extProviders;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r8 = new org.jivesoftware.smack.provider.ExtensionProviderInfo;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r8.<init>(r4, r5, r3);	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        goto L_0x00b7;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
    L_0x00da:
        r3 = r12.exceptions;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r5 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r5.<init>();	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r5.append(r6);	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r7 = " is not a PacketExtensionProvider";	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r5.append(r7);	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r5 = r5.toString();	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r4.<init>(r5);	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
    L_0x00f2:
        r3.add(r4);	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        goto L_0x0189;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
    L_0x00f7:
        r3 = org.jivesoftware.smack.provider.IQProvider.class;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r3 = r3.isAssignableFrom(r7);	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        if (r3 == 0) goto L_0x0115;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
    L_0x00ff:
        r3 = new java.lang.Class[r11];	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r3 = r7.getConstructor(r3);	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r7 = new java.lang.Object[r11];	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r3 = r3.newInstance(r7);	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r3 = (org.jivesoftware.smack.provider.IQProvider) r3;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r7 = r12.iqProviders;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r8 = new org.jivesoftware.smack.provider.IQProviderInfo;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r8.<init>(r4, r5, r3);	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        goto L_0x00b7;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
    L_0x0115:
        r3 = r12.exceptions;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r5 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r5.<init>();	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r5.append(r6);	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r7 = " is not a IQProvider";	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r5.append(r7);	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r5 = r5.toString();	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r4.<init>(r5);	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        goto L_0x00f2;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
    L_0x012e:
        r4 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r5 = "Unknown provider type: ";	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r4.<init>(r5);	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r4.append(r1);	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r4 = r4.toString();	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        r3.warning(r4);	 Catch:{ ClassNotFoundException -> 0x015c, InstantiationException -> 0x0140 }
        goto L_0x0189;
    L_0x0140:
        r3 = move-exception;
        r4 = LOGGER;	 Catch:{ IllegalArgumentException -> 0x0169 }
        r5 = java.util.logging.Level.SEVERE;	 Catch:{ IllegalArgumentException -> 0x0169 }
        r7 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0169 }
        r8 = "Could not instanciate ";	 Catch:{ IllegalArgumentException -> 0x0169 }
        r7.<init>(r8);	 Catch:{ IllegalArgumentException -> 0x0169 }
        r7.append(r6);	 Catch:{ IllegalArgumentException -> 0x0169 }
        r6 = r7.toString();	 Catch:{ IllegalArgumentException -> 0x0169 }
        r4.log(r5, r6, r3);	 Catch:{ IllegalArgumentException -> 0x0169 }
        r4 = r12.exceptions;	 Catch:{ IllegalArgumentException -> 0x0169 }
    L_0x0158:
        r4.add(r3);	 Catch:{ IllegalArgumentException -> 0x0169 }
        goto L_0x0189;	 Catch:{ IllegalArgumentException -> 0x0169 }
    L_0x015c:
        r3 = move-exception;	 Catch:{ IllegalArgumentException -> 0x0169 }
        r4 = LOGGER;	 Catch:{ IllegalArgumentException -> 0x0169 }
        r5 = java.util.logging.Level.SEVERE;	 Catch:{ IllegalArgumentException -> 0x0169 }
        r6 = "Could not find provider class";	 Catch:{ IllegalArgumentException -> 0x0169 }
        r4.log(r5, r6, r3);	 Catch:{ IllegalArgumentException -> 0x0169 }
        r4 = r12.exceptions;	 Catch:{ IllegalArgumentException -> 0x0169 }
        goto L_0x0158;
    L_0x0169:
        r3 = move-exception;
        r4 = LOGGER;	 Catch:{ Exception -> 0x0195 }
        r5 = java.util.logging.Level.SEVERE;	 Catch:{ Exception -> 0x0195 }
        r6 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0195 }
        r7 = "Invalid provider type found [";	 Catch:{ Exception -> 0x0195 }
        r6.<init>(r7);	 Catch:{ Exception -> 0x0195 }
        r6.append(r1);	 Catch:{ Exception -> 0x0195 }
        r1 = "] when expecting iqProvider or extensionProvider";	 Catch:{ Exception -> 0x0195 }
        r6.append(r1);	 Catch:{ Exception -> 0x0195 }
        r1 = r6.toString();	 Catch:{ Exception -> 0x0195 }
        r4.log(r5, r1, r3);	 Catch:{ Exception -> 0x0195 }
        r1 = r12.exceptions;	 Catch:{ Exception -> 0x0195 }
        r1.add(r3);	 Catch:{ Exception -> 0x0195 }
    L_0x0189:
        r1 = r0.next();	 Catch:{ Exception -> 0x0195 }
        if (r1 != r2) goto L_0x0036;
    L_0x018f:
        r13.close();	 Catch:{ Exception -> 0x0192 }
    L_0x0192:
        return;
    L_0x0193:
        r14 = move-exception;
        goto L_0x01a8;
    L_0x0195:
        r14 = move-exception;
        r0 = LOGGER;	 Catch:{ all -> 0x0193 }
        r1 = java.util.logging.Level.SEVERE;	 Catch:{ all -> 0x0193 }
        r2 = "Unknown error occurred while parsing provider file";	 Catch:{ all -> 0x0193 }
        r0.log(r1, r2, r14);	 Catch:{ all -> 0x0193 }
        r0 = r12.exceptions;	 Catch:{ all -> 0x0193 }
        r0.add(r14);	 Catch:{ all -> 0x0193 }
        r13.close();	 Catch:{ Exception -> 0x01a7 }
    L_0x01a7:
        return;
    L_0x01a8:
        r13.close();	 Catch:{ Exception -> 0x01ab }
    L_0x01ab:
        throw r14;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.provider.ProviderFileLoader.<init>(java.io.InputStream, java.lang.ClassLoader):void");
    }

    public Collection<ExtensionProviderInfo> getExtensionProviderInfo() {
        return this.extProviders;
    }

    public Collection<IQProviderInfo> getIQProviderInfo() {
        return this.iqProviders;
    }

    public List<Exception> getLoadingExceptions() {
        return Collections.unmodifiableList(this.exceptions);
    }

    public Collection<StreamFeatureProviderInfo> getStreamFeatureProviderInfo() {
        return this.sfProviders;
    }
}
