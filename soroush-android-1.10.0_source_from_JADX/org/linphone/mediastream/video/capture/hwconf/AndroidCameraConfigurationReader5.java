package org.linphone.mediastream.video.capture.hwconf;

import android.hardware.Camera;
import java.util.ArrayList;
import java.util.List;
import org.linphone.mediastream.Log;
import org.linphone.mediastream.video.capture.hwconf.AndroidCameraConfiguration.AndroidCamera;

class AndroidCameraConfigurationReader5 {
    AndroidCameraConfigurationReader5() {
    }

    public static AndroidCamera[] probeCameras() {
        Object androidCamera;
        List arrayList = new ArrayList(1);
        Camera open = Camera.open();
        List supportedPreviewSizes = open.getParameters().getSupportedPreviewSizes();
        open.release();
        if (Hacks.isGalaxySOrTab()) {
            Log.m22093d("Hack Galaxy S : has one or more cameras");
            if (Hacks.isGalaxySOrTabWithFrontCamera()) {
                Log.m22093d("Hack Galaxy S : HAS a front camera with id=2");
                arrayList.add(new AndroidCamera(2, true, 90, supportedPreviewSizes));
            } else {
                Log.m22093d("Hack Galaxy S : NO front camera");
            }
            Log.m22093d("Hack Galaxy S : HAS a rear camera with id=1");
            androidCamera = new AndroidCamera(1, false, 90, supportedPreviewSizes);
        } else {
            arrayList.add(new AndroidCamera(0, false, 90, supportedPreviewSizes));
            if (Hacks.hasTwoCamerasRear0Front1()) {
                Log.m22093d("Hack SPHD700 has 2 cameras a rear with id=0 and a front with id=1");
                androidCamera = new AndroidCamera(1, true, 90, supportedPreviewSizes);
            }
            return (AndroidCamera[]) arrayList.toArray(new AndroidCamera[arrayList.size()]);
        }
        arrayList.add(androidCamera);
        return (AndroidCamera[]) arrayList.toArray(new AndroidCamera[arrayList.size()]);
    }
}
