package org.linphone.core;

public abstract class LinphoneCoreFactory {
    private static String factoryName = "org.linphone.core.LinphoneCoreFactoryImpl";
    static LinphoneCoreFactory theLinphoneCoreFactory;

    public static final synchronized org.linphone.core.LinphoneCoreFactory instance() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = org.linphone.core.LinphoneCoreFactory.class;
        monitor-enter(r0);
        r1 = theLinphoneCoreFactory;	 Catch:{ Exception -> 0x0018 }
        if (r1 != 0) goto L_0x0032;	 Catch:{ Exception -> 0x0018 }
    L_0x0007:
        r1 = factoryName;	 Catch:{ Exception -> 0x0018 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ Exception -> 0x0018 }
        r1 = r1.newInstance();	 Catch:{ Exception -> 0x0018 }
        r1 = (org.linphone.core.LinphoneCoreFactory) r1;	 Catch:{ Exception -> 0x0018 }
        theLinphoneCoreFactory = r1;	 Catch:{ Exception -> 0x0018 }
        goto L_0x0032;
    L_0x0016:
        r1 = move-exception;
        goto L_0x0036;
    L_0x0018:
        r1 = java.lang.System.err;	 Catch:{ all -> 0x0016 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0016 }
        r3 = "Cannot instanciate factory [";	 Catch:{ all -> 0x0016 }
        r2.<init>(r3);	 Catch:{ all -> 0x0016 }
        r3 = factoryName;	 Catch:{ all -> 0x0016 }
        r2.append(r3);	 Catch:{ all -> 0x0016 }
        r3 = "]";	 Catch:{ all -> 0x0016 }
        r2.append(r3);	 Catch:{ all -> 0x0016 }
        r2 = r2.toString();	 Catch:{ all -> 0x0016 }
        r1.println(r2);	 Catch:{ all -> 0x0016 }
    L_0x0032:
        r1 = theLinphoneCoreFactory;	 Catch:{ all -> 0x0016 }
        monitor-exit(r0);
        return r1;
    L_0x0036:
        monitor-exit(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.linphone.core.LinphoneCoreFactory.instance():org.linphone.core.LinphoneCoreFactory");
    }

    public static void setFactoryClassName(String str) {
        factoryName = str;
    }

    public abstract LinphoneAuthInfo createAuthInfo(String str, String str2, String str3, String str4);

    public abstract LinphoneAuthInfo createAuthInfo(String str, String str2, String str3, String str4, String str5, String str6);

    public abstract LinphoneAddress createLinphoneAddress(String str);

    public abstract LinphoneAddress createLinphoneAddress(String str, String str2, String str3);

    public abstract LinphoneContent createLinphoneContent(String str, String str2, String str3);

    public abstract LinphoneContent createLinphoneContent(String str, String str2, byte[] bArr, String str3);

    public abstract LinphoneCore createLinphoneCore(LinphoneCoreListener linphoneCoreListener, Object obj);

    public abstract LinphoneCore createLinphoneCore(LinphoneCoreListener linphoneCoreListener, String str, String str2, Object obj, Object obj2);

    public abstract LinphoneFriend createLinphoneFriend();

    public abstract LinphoneFriend createLinphoneFriend(String str);

    public abstract LpConfig createLpConfig(String str);

    public abstract PresenceActivity createPresenceActivity(PresenceActivityType presenceActivityType, String str);

    public abstract PresenceModel createPresenceModel();

    public abstract PresenceModel createPresenceModel(PresenceActivityType presenceActivityType, String str);

    public abstract PresenceModel createPresenceModel(PresenceActivityType presenceActivityType, String str, String str2, String str3);

    public abstract PresenceService createPresenceService(String str, PresenceBasicStatus presenceBasicStatus, String str2);

    public abstract TunnelConfig createTunnelConfig();

    public abstract void enableLogCollection(boolean z);

    public abstract void setDebugMode(boolean z, String str);

    public abstract void setLogCollectionPath(String str);

    public abstract void setLogHandler(LinphoneLogHandler linphoneLogHandler);
}
