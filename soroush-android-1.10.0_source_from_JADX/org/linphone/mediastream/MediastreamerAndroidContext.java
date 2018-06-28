package org.linphone.mediastream;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build.VERSION;

public class MediastreamerAndroidContext {
    private static final int DEVICE_CHOICE = 0;
    private static final int DEVICE_HAS_BUILTIN_AEC = 1;
    private static final int DEVICE_HAS_BUILTIN_AEC_CRAPPY = 2;
    private static final int DEVICE_HAS_BUILTIN_OPENSLES_AEC = 8;
    private static final int DEVICE_USE_ANDROID_MIC = 4;
    private static MediastreamerAndroidContext instance;
    private static Context mContext;

    private MediastreamerAndroidContext() {
    }

    public static void addSoundDeviceDesc(String str, String str2, String str3, int i, int i2, int i3) {
        getInstance().addSoundDeviceDescription(str, str2, str3, i, i2, i3);
    }

    private native void addSoundDeviceDescription(String str, String str2, String str3, int i, int i2, int i3);

    public static void enableFilterFromName(String str, boolean z) {
        if (getInstance().enableFilterFromNameImpl(str, z) != 0) {
            StringBuilder stringBuilder = new StringBuilder("Cannot ");
            stringBuilder.append(z ? "enable" : "disable");
            stringBuilder.append(" filter  name [");
            stringBuilder.append(str);
            stringBuilder.append("]");
            throw new MediastreamException(stringBuilder.toString());
        }
    }

    private native int enableFilterFromNameImpl(String str, boolean z);

    public static boolean filterFromNameEnabled(String str) {
        return getInstance().filterFromNameEnabledImpl(str);
    }

    private native boolean filterFromNameEnabledImpl(String str);

    public static Context getContext() {
        return mContext;
    }

    private static MediastreamerAndroidContext getInstance() {
        if (instance == null) {
            instance = new MediastreamerAndroidContext();
        }
        return instance;
    }

    private static int parseInt(java.lang.String r4, int r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = java.lang.Integer.parseInt(r4);	 Catch:{ NumberFormatException -> 0x0006 }
        r5 = r0;
        return r5;
    L_0x0006:
        r0 = 1;
        r0 = new java.lang.Object[r0];
        r1 = 0;
        r2 = new java.lang.StringBuilder;
        r3 = "Can't parse ";
        r2.<init>(r3);
        r2.append(r4);
        r4 = " to integer ; using default value ";
        r2.append(r4);
        r2.append(r5);
        r4 = r2.toString();
        r0[r1] = r4;
        org.linphone.mediastream.Log.m22095e(r0);
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.linphone.mediastream.MediastreamerAndroidContext.parseInt(java.lang.String, int):int");
    }

    @TargetApi(19)
    public static void setContext(Object obj) {
        if (obj != null) {
            mContext = (Context) obj;
            MediastreamerAndroidContext instance = getInstance();
            if (VERSION.SDK_INT >= 19) {
                AudioManager audioManager = (AudioManager) mContext.getSystemService("audio");
                int parseInt = parseInt(audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER"), 64);
                int parseInt2 = parseInt(audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE"), 44100);
                Object[] objArr = new Object[1];
                StringBuilder stringBuilder = new StringBuilder("Setting buffer size to ");
                stringBuilder.append(parseInt);
                stringBuilder.append(" and sample rate to ");
                stringBuilder.append(parseInt2);
                stringBuilder.append(" for OpenSLES MS sound card.");
                objArr[0] = stringBuilder.toString();
                Log.m22099i(objArr);
                instance.setDeviceFavoriteSampleRate(parseInt2);
                instance.setDeviceFavoriteBufferSize(parseInt);
                return;
            }
            Log.m22099i("Android < 4.4 detected, android context not used.");
        }
    }

    private native void setDeviceFavoriteBufferSize(int i);

    private native void setDeviceFavoriteSampleRate(int i);
}
