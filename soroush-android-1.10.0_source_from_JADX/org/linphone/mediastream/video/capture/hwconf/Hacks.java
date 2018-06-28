package org.linphone.mediastream.video.capture.hwconf;

import android.os.Build;
import org.linphone.mediastream.Log;
import org.linphone.mediastream.Version;

public final class Hacks {
    private static BuiltInEchoCancellerModel[] mBuiltInEchoCancellerModels = new BuiltInEchoCancellerModel[]{new BuiltInEchoCancellerModel("samsung", "GT-I9100"), new BuiltInEchoCancellerModel("samsung", "GT-I9300")};

    private static class BuiltInEchoCancellerModel {
        public String manufacturer;
        public String model;

        public BuiltInEchoCancellerModel(String str, String str2) {
            this.manufacturer = str;
            this.model = str2;
        }
    }

    private Hacks() {
    }

    public static boolean hasBuiltInEchoCanceller() {
        Object[] objArr;
        StringBuilder stringBuilder;
        for (BuiltInEchoCancellerModel builtInEchoCancellerModel : mBuiltInEchoCancellerModels) {
            if (Build.MANUFACTURER.equals(builtInEchoCancellerModel.manufacturer) && Build.MODEL.startsWith(builtInEchoCancellerModel.model)) {
                objArr = new Object[1];
                stringBuilder = new StringBuilder();
                stringBuilder.append(Build.MANUFACTURER);
                stringBuilder.append(" ");
                stringBuilder.append(Build.MODEL);
                stringBuilder.append(" has a built-in echo canceller");
                objArr[0] = stringBuilder.toString();
                Log.m22099i(objArr);
                return true;
            }
        }
        objArr = new Object[1];
        stringBuilder = new StringBuilder();
        stringBuilder.append(Build.MANUFACTURER);
        stringBuilder.append(" ");
        stringBuilder.append(Build.MODEL);
        stringBuilder.append(" doesn't have a built-in echo canceller");
        objArr[0] = stringBuilder.toString();
        Log.m22099i(objArr);
        return false;
    }

    public static boolean hasCamera() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 9;
        r0 = org.linphone.mediastream.Version.sdkAboveOrEqual(r0);
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x002e;
    L_0x000a:
        r0 = android.hardware.Camera.class;	 Catch:{ Exception -> 0x0020 }
        r3 = "getNumberOfCameras";	 Catch:{ Exception -> 0x0020 }
        r4 = 0;	 Catch:{ Exception -> 0x0020 }
        r0 = r0.getMethod(r3, r4);	 Catch:{ Exception -> 0x0020 }
        r3 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0020 }
        r0 = r0.invoke(r4, r3);	 Catch:{ Exception -> 0x0020 }
        r0 = (java.lang.Integer) r0;	 Catch:{ Exception -> 0x0020 }
        r0 = r0.intValue();	 Catch:{ Exception -> 0x0020 }
        goto L_0x002a;
    L_0x0020:
        r0 = new java.lang.Object[r1];
        r3 = "Error getting number of cameras";
        r0[r2] = r3;
        org.linphone.mediastream.Log.m22095e(r0);
        r0 = r2;
    L_0x002a:
        if (r0 <= 0) goto L_0x002d;
    L_0x002c:
        return r1;
    L_0x002d:
        return r2;
    L_0x002e:
        r0 = new java.lang.Object[r1];
        r3 = "Hack: considering there IS a camera.\nIf it is not the case, report DEVICE and MODEL to linphone-users@nongnu.org";
        r0[r2] = r3;
        org.linphone.mediastream.Log.m22099i(r0);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.linphone.mediastream.video.capture.hwconf.Hacks.hasCamera():boolean");
    }

    public static final boolean hasTwoCamerasRear0Front1() {
        if (!(isLGP970() || isSPHD700())) {
            if (!isADR6400()) {
                return false;
            }
        }
        return true;
    }

    private static final boolean isADR6400() {
        if (!Build.MODEL.startsWith("ADR6400")) {
            if (!Build.DEVICE.startsWith("ADR6400")) {
                return false;
            }
        }
        return true;
    }

    private static boolean isGT9000() {
        return Build.DEVICE.startsWith("GT-I9000");
    }

    private static boolean isGTP1000() {
        return Build.DEVICE.startsWith("GT-P1000");
    }

    private static boolean isGalaxyS() {
        if (!(isGT9000() || isSC02B() || isSGHI896())) {
            if (!isSPHD700()) {
                return false;
            }
        }
        return true;
    }

    public static boolean isGalaxySOrTab() {
        if (!isGalaxyS()) {
            if (!isGalaxyTab()) {
                return false;
            }
        }
        return true;
    }

    public static boolean isGalaxySOrTabWithFrontCamera() {
        return isGalaxySOrTab() && !isGalaxySOrTabWithoutFrontCamera();
    }

    private static boolean isGalaxySOrTabWithoutFrontCamera() {
        if (!isSC02B()) {
            if (!isSGHI896()) {
                return false;
            }
        }
        return true;
    }

    public static boolean isGalaxyTab() {
        return isGTP1000();
    }

    private static final boolean isLGP970() {
        return Build.DEVICE.startsWith("LG-P970");
    }

    private static boolean isSC02B() {
        return Build.DEVICE.startsWith("SC-02B");
    }

    private static boolean isSGHI896() {
        return Build.DEVICE.startsWith("SGH-I896");
    }

    private static final boolean isSPHD700() {
        return Build.DEVICE.startsWith("SPH-D700");
    }

    public static boolean needGalaxySAudioHack() {
        return isGalaxySOrTab() && !isSC02B();
    }

    public static boolean needPausingCallForSpeakers() {
        return needGalaxySAudioHack();
    }

    public static boolean needSoftvolume() {
        return isGalaxySOrTab() && Version.sdkStrictlyBelow(9);
    }

    public static final void sleep(int r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = (long) r2;
        java.lang.Thread.sleep(r0);	 Catch:{ InterruptedException -> 0x0004 }
    L_0x0004:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.linphone.mediastream.video.capture.hwconf.Hacks.sleep(int):void");
    }
}
