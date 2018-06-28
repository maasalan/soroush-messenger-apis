package me.p226a.p227a.p228a;

import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import java.util.List;

public final class C2448d {
    public static android.hardware.Camera m6683a(int r1) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = -1;
        if (r1 != r0) goto L_0x0008;
    L_0x0003:
        r1 = android.hardware.Camera.open();	 Catch:{ Exception -> 0x000d }
        return r1;	 Catch:{ Exception -> 0x000d }
    L_0x0008:
        r1 = android.hardware.Camera.open(r1);	 Catch:{ Exception -> 0x000d }
        return r1;
    L_0x000d:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: me.a.a.a.d.a(int):android.hardware.Camera");
    }

    public static boolean m6684a(Camera camera) {
        if (camera != null) {
            Parameters parameters = camera.getParameters();
            if (parameters.getFlashMode() == null) {
                return false;
            }
            List supportedFlashModes = parameters.getSupportedFlashModes();
            if (!(supportedFlashModes == null || supportedFlashModes.isEmpty())) {
                return (supportedFlashModes.size() == 1 && ((String) supportedFlashModes.get(0)).equals("off")) ? false : true;
            }
        }
        return false;
    }
}
