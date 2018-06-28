package org.linphone.mediastream.video.capture.hwconf;

import java.util.ArrayList;
import java.util.List;
import org.linphone.mediastream.Log;
import org.linphone.mediastream.Version;

public class AndroidCameraConfiguration {
    private static AndroidCamera[] camerasCache;

    public static class AndroidCamera {
        public boolean frontFacing;
        public int id;
        public int orientation;
        public List<Size> resolutions;

        public static class Size {
            public final int height;
            public final int width;

            public Size(int i, int i2) {
                this.width = i;
                this.height = i2;
            }
        }

        public AndroidCamera(int i, boolean z, int i2, List<android.hardware.Camera.Size> list) {
            this.resolutions = new ArrayList(list.size());
            for (android.hardware.Camera.Size size : list) {
                this.resolutions.add(new Size(size.width, size.height));
            }
            this.id = i;
            this.frontFacing = z;
            this.orientation = i2;
        }

        public AndroidCamera(int i, boolean z, List<Size> list, int i2) {
            this.id = i;
            this.frontFacing = z;
            this.orientation = i2;
            this.resolutions = list;
        }
    }

    public static boolean hasFrontCamera() {
        initCamerasCache();
        for (AndroidCamera androidCamera : camerasCache) {
            if (androidCamera.frontFacing) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasSeveralCameras() {
        initCamerasCache();
        return camerasCache.length > 1;
    }

    private static void initCamerasCache() {
        if (camerasCache == null || camerasCache.length == 0) {
            try {
                if (Version.sdk() < 9) {
                    camerasCache = probeCamerasSDK5();
                } else if (Version.sdk() >= 21) {
                    camerasCache = probeCamerasSDK21();
                } else {
                    camerasCache = probeCamerasSDK9();
                }
            } catch (Exception e) {
                Log.m22095e("Error: cannot retrieve cameras information (busy ?)", e);
                e.printStackTrace();
                camerasCache = new AndroidCamera[0];
            }
        }
    }

    static AndroidCamera[] probeCamerasSDK21() {
        return AndroidCameraConfigurationReader21.probeCameras();
    }

    static AndroidCamera[] probeCamerasSDK5() {
        return AndroidCameraConfigurationReader5.probeCameras();
    }

    static AndroidCamera[] probeCamerasSDK9() {
        return AndroidCameraConfigurationReader9.probeCameras();
    }

    public static AndroidCamera[] retrieveCameras() {
        initCamerasCache();
        return camerasCache;
    }
}
