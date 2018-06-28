package org.linphone.core;

import android.util.Log;
import java.io.File;
import org.linphone.mediastream.MediastreamerAndroidContext;
import org.linphone.mediastream.Version;

public class LinphoneCoreFactoryImpl extends LinphoneCoreFactory {
    static {
        Object obj;
        Throwable th = null;
        for (String str : Version.getCpuAbis()) {
            StringBuilder stringBuilder = new StringBuilder("Trying to load liblinphone for ");
            stringBuilder.append(str);
            Log.i("LinphoneCoreFactoryImpl", stringBuilder.toString());
            String str2 = str.startsWith("armeabi") ? "arm" : str;
            stringBuilder = new StringBuilder("ffmpeg-linphone-");
            stringBuilder.append(str2);
            loadOptionalLibrary(stringBuilder.toString());
            try {
                StringBuilder stringBuilder2 = new StringBuilder("linphone-");
                stringBuilder2.append(str);
                System.loadLibrary(stringBuilder2.toString());
                stringBuilder = new StringBuilder("Loading done with ");
                stringBuilder.append(str);
                Log.i("LinphoneCoreFactoryImpl", stringBuilder.toString());
                obj = 1;
                break;
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
        }
        obj = null;
        if (obj == null) {
            throw new RuntimeException(th);
        }
        Version.dumpCapabilities();
    }

    private native Object _createTunnelConfig();

    private native void _setLogHandler(Object obj);

    public static boolean isArmv7() {
        return System.getProperty("os.arch").contains("armv7");
    }

    private static boolean loadOptionalLibrary(java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        java.lang.System.loadLibrary(r3);	 Catch:{ Throwable -> 0x0005 }
        r3 = 1;
        return r3;
    L_0x0005:
        r0 = "LinphoneCoreFactoryImpl";
        r1 = new java.lang.StringBuilder;
        r2 = "Unable to load optional library lib";
        r1.<init>(r2);
        r1.append(r3);
        r3 = r1.toString();
        android.util.Log.w(r0, r3);
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.linphone.core.LinphoneCoreFactoryImpl.loadOptionalLibrary(java.lang.String):boolean");
    }

    public LinphoneAuthInfo createAuthInfo(String str, String str2, String str3, String str4) {
        return new LinphoneAuthInfoImpl(str, str2, str3, str4);
    }

    public LinphoneAuthInfo createAuthInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        return new LinphoneAuthInfoImpl(str, str2, str3, str4, str5, str6);
    }

    public LinphoneAddress createLinphoneAddress(String str) {
        return new LinphoneAddressImpl(str);
    }

    public LinphoneAddress createLinphoneAddress(String str, String str2, String str3) {
        return new LinphoneAddressImpl(str, str2, str3);
    }

    public LinphoneContent createLinphoneContent(String str, String str2, String str3) {
        return new LinphoneContentImpl(str, str2, str3 == null ? null : str3.getBytes(), null);
    }

    public LinphoneContent createLinphoneContent(String str, String str2, byte[] bArr, String str3) {
        return new LinphoneContentImpl(str, str2, bArr, str3);
    }

    public LinphoneCore createLinphoneCore(LinphoneCoreListener linphoneCoreListener, Object obj) {
        try {
            MediastreamerAndroidContext.setContext(obj);
            LinphoneCore linphoneCoreImpl = new LinphoneCoreImpl(linphoneCoreListener);
            if (obj != null) {
                linphoneCoreImpl.setContext(obj);
            }
            return linphoneCoreImpl;
        } catch (Throwable e) {
            throw new LinphoneCoreException("Cannot create LinphoneCore", e);
        }
    }

    public LinphoneCore createLinphoneCore(LinphoneCoreListener linphoneCoreListener, String str, String str2, Object obj, Object obj2) {
        try {
            MediastreamerAndroidContext.setContext(obj2);
            File file = null;
            File file2 = str == null ? null : new File(str);
            if (str2 != null) {
                file = new File(str2);
            }
            LinphoneCore linphoneCoreImpl = new LinphoneCoreImpl(linphoneCoreListener, file2, file, obj);
            if (obj2 != null) {
                linphoneCoreImpl.setContext(obj2);
            }
            return linphoneCoreImpl;
        } catch (Throwable e) {
            throw new LinphoneCoreException("Cannot create LinphoneCore", e);
        }
    }

    public LinphoneFriend createLinphoneFriend() {
        return createLinphoneFriend(null);
    }

    public LinphoneFriend createLinphoneFriend(String str) {
        return new LinphoneFriendImpl(str);
    }

    public LpConfig createLpConfig(String str) {
        return new LpConfigImpl(str);
    }

    public PresenceActivity createPresenceActivity(PresenceActivityType presenceActivityType, String str) {
        return new PresenceActivityImpl(presenceActivityType, str);
    }

    public PresenceModel createPresenceModel() {
        return new PresenceModelImpl();
    }

    public PresenceModel createPresenceModel(PresenceActivityType presenceActivityType, String str) {
        return new PresenceModelImpl(presenceActivityType, str);
    }

    public PresenceModel createPresenceModel(PresenceActivityType presenceActivityType, String str, String str2, String str3) {
        return new PresenceModelImpl(presenceActivityType, str, str2, str3);
    }

    public PresenceService createPresenceService(String str, PresenceBasicStatus presenceBasicStatus, String str2) {
        return new PresenceServiceImpl(str, presenceBasicStatus, str2);
    }

    public TunnelConfig createTunnelConfig() {
        return (TunnelConfig) _createTunnelConfig();
    }

    public native void enableLogCollection(boolean z);

    public native void setDebugMode(boolean z, String str);

    public native void setLogCollectionPath(String str);

    public void setLogHandler(LinphoneLogHandler linphoneLogHandler) {
        _setLogHandler(linphoneLogHandler);
    }
}
