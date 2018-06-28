package org.linphone.mediastream;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.List;
import org.linphone.mediastream.video.capture.hwconf.Hacks;

public class Version {
    public static final int API03_CUPCAKE_15 = 3;
    public static final int API04_DONUT_16 = 4;
    public static final int API05_ECLAIR_20 = 5;
    public static final int API06_ECLAIR_201 = 6;
    public static final int API07_ECLAIR_21 = 7;
    public static final int API08_FROYO_22 = 8;
    public static final int API09_GINGERBREAD_23 = 9;
    public static final int API10_GINGERBREAD_MR1_233 = 10;
    public static final int API11_HONEYCOMB_30 = 11;
    public static final int API12_HONEYCOMB_MR1_31X = 12;
    public static final int API13_HONEYCOMB_MR2_32 = 13;
    public static final int API14_ICE_CREAM_SANDWICH_40 = 14;
    public static final int API15_ICE_CREAM_SANDWICH_403 = 15;
    public static final int API16_JELLY_BEAN_41 = 16;
    public static final int API17_JELLY_BEAN_42 = 17;
    public static final int API18_JELLY_BEAN_43 = 18;
    public static final int API19_KITKAT_44 = 19;
    public static final int API21_LOLLIPOP_50 = 21;
    public static final int API22_LOLLIPOP_51 = 22;
    private static final int buildVersion = VERSION.SDK_INT;
    private static Boolean hasNeon;
    private static Boolean sCacheHasZrtp;

    public static void dumpCapabilities() {
        StringBuilder stringBuilder = new StringBuilder(" ==== Capabilities dump ====\n");
        if (isArmv7()) {
            stringBuilder.append("Has neon: ");
            stringBuilder.append(Boolean.toString(hasNeon()));
            stringBuilder.append("\n");
        }
        stringBuilder.append("Has ZRTP: ");
        stringBuilder.append(Boolean.toString(hasZrtp()));
        stringBuilder.append("\n");
        Log.m22099i(stringBuilder.toString());
    }

    public static List<String> getCpuAbis() {
        List<String> arrayList = new ArrayList();
        if (sdkAboveOrEqual(21)) {
            try {
                for (Object add : (String[]) Build.class.getField("SUPPORTED_ABIS").get(null)) {
                    arrayList.add(add);
                }
            } catch (Throwable th) {
                Log.m22094e(th, new Object[0]);
                return arrayList;
            }
        }
        arrayList.add(Build.CPU_ABI);
        arrayList.add(Build.CPU_ABI2);
        return arrayList;
    }

    public static boolean hasFastCpu() {
        return !isArmv5();
    }

    public static boolean hasFastCpuWithAsmOptim() {
        return !(isX86() || isArmv5() || !hasNeon()) || isX86();
    }

    public static boolean hasNeon() {
        if (hasNeon == null) {
            hasNeon = Boolean.valueOf(nativeHasNeon());
        }
        return hasNeon.booleanValue();
    }

    public static boolean hasZrtp() {
        if (sCacheHasZrtp == null) {
            sCacheHasZrtp = Boolean.valueOf(nativeHasZrtp());
        }
        return sCacheHasZrtp.booleanValue();
    }

    private static boolean isArmv5() {
        try {
            return ((String) getCpuAbis().get(0)).equals("armeabi");
        } catch (Throwable th) {
            Log.m22094e(th, new Object[0]);
            return false;
        }
    }

    private static boolean isArmv7() {
        try {
            return ((String) getCpuAbis().get(0)).startsWith("armeabi-v7");
        } catch (Throwable th) {
            Log.m22094e(th, new Object[0]);
            return false;
        }
    }

    public static boolean isHDVideoCapable() {
        return isVideoCapable() && hasFastCpuWithAsmOptim() && Runtime.getRuntime().availableProcessors() > 1;
    }

    public static boolean isVideoCapable() {
        return !sdkStrictlyBelow(5) && hasFastCpu() && Hacks.hasCamera();
    }

    private static boolean isX86() {
        try {
            return ((String) getCpuAbis().get(0)).startsWith("x86");
        } catch (Throwable th) {
            Log.m22094e(th, new Object[0]);
            return false;
        }
    }

    public static boolean isXLargeScreen(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 4;
    }

    private static native boolean nativeHasNeon();

    private static native boolean nativeHasZrtp();

    public static int sdk() {
        return buildVersion;
    }

    public static final boolean sdkAboveOrEqual(int i) {
        return buildVersion >= i;
    }

    public static final boolean sdkStrictlyBelow(int i) {
        return buildVersion < i;
    }
}
