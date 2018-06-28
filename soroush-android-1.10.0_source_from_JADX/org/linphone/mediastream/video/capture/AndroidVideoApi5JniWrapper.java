package org.linphone.mediastream.video.capture;

import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import android.view.SurfaceView;
import java.util.List;
import org.linphone.mediastream.Log;
import org.linphone.mediastream.Version;
import org.linphone.mediastream.video.capture.hwconf.AndroidCameraConfiguration;
import org.linphone.mediastream.video.capture.hwconf.AndroidCameraConfiguration.AndroidCamera;
import org.linphone.mediastream.video.capture.hwconf.AndroidCameraConfiguration.AndroidCamera.Size;

public class AndroidVideoApi5JniWrapper {
    public static boolean isRecording = false;

    public static void activateAutoFocus(Object obj) {
        Object[] objArr = new Object[2];
        objArr[0] = "mediastreamer";
        StringBuilder stringBuilder = new StringBuilder("Turning on autofocus on camera ");
        stringBuilder.append(obj);
        objArr[1] = stringBuilder.toString();
        Log.m22093d(objArr);
        Camera camera = (Camera) obj;
        if (camera == null) {
            return;
        }
        if (camera.getParameters().getFocusMode() == "auto" || camera.getParameters().getFocusMode() == "macro") {
            camera.autoFocus(null);
        }
    }

    protected static void applyCameraParameters(Camera camera, int i, int i2, int i3) {
        Parameters parameters = camera.getParameters();
        parameters.setPreviewSize(i, i2);
        List<Integer> supportedPreviewFrameRates = parameters.getSupportedPreviewFrameRates();
        if (supportedPreviewFrameRates != null) {
            i2 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            for (Integer num : supportedPreviewFrameRates) {
                int abs = Math.abs(num.intValue() - i3);
                if (abs < i2) {
                    parameters.setPreviewFrameRate(num.intValue());
                    i2 = abs;
                }
            }
            Object[] objArr = new Object[2];
            objArr[0] = "mediastreamer";
            StringBuilder stringBuilder = new StringBuilder("Preview framerate set:");
            stringBuilder.append(parameters.getPreviewFrameRate());
            objArr[1] = stringBuilder.toString();
            Log.m22093d(objArr);
        }
        camera.setParameters(parameters);
    }

    public static int detectCameras(int[] iArr, int[] iArr2, int[] iArr3) {
        Log.m22093d("detectCameras\n");
        AndroidCamera[] retrieveCameras = AndroidCameraConfiguration.retrieveCameras();
        int length = retrieveCameras.length;
        int i = 0;
        int i2 = i;
        while (i < length) {
            AndroidCamera androidCamera = retrieveCameras[i];
            if (i2 == 2) {
                Log.m22101w("Returning only the 2 first cameras (increase buffer size to retrieve all)");
                return i2;
            }
            iArr[i2] = androidCamera.id;
            iArr2[i2] = androidCamera.frontFacing;
            iArr3[i2] = androidCamera.orientation;
            i2++;
            i++;
        }
        return i2;
    }

    public static native void putImage(long j, byte[] bArr);

    public static int[] selectNearestResolutionAvailable(int i, int i2, int i3) {
        Object[] objArr = new Object[2];
        objArr[0] = "mediastreamer";
        StringBuilder stringBuilder = new StringBuilder("selectNearestResolutionAvailable: ");
        stringBuilder.append(i);
        stringBuilder.append(", ");
        stringBuilder.append(i2);
        stringBuilder.append("x");
        stringBuilder.append(i3);
        objArr[1] = stringBuilder.toString();
        Log.m22093d(objArr);
        return selectNearestResolutionAvailableForCamera(i, i2, i3);
    }

    protected static int[] selectNearestResolutionAvailableForCamera(int i, int i2, int i3) {
        int i4;
        int max;
        if (i3 > i2) {
            int i5 = i3;
            i3 = i2;
            i2 = i5;
        }
        List list = null;
        for (AndroidCamera androidCamera : AndroidCameraConfiguration.retrieveCameras()) {
            if (androidCamera.id == i) {
                list = androidCamera.resolutions;
            }
        }
        if (r5 == null) {
            Log.m22095e("mediastreamer", "Failed to retrieve supported resolutions.");
            return null;
        }
        Object[] objArr = new Object[2];
        objArr[0] = "mediastreamer";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(r5.size());
        stringBuilder.append(" supported resolutions :");
        objArr[1] = stringBuilder.toString();
        Log.m22093d(objArr);
        for (Size size : r5) {
            Object[] objArr2 = new Object[2];
            objArr2[0] = "mediastreamer";
            StringBuilder stringBuilder2 = new StringBuilder("\t");
            stringBuilder2.append(size.width);
            stringBuilder2.append("x");
            stringBuilder2.append(size.height);
            objArr2[1] = stringBuilder2.toString();
            Log.m22093d(objArr2);
        }
        max = Math.max(i2, i3);
        i2 = Math.min(i2, i3);
        try {
            Size size2 = (Size) r5.get(0);
            i4 = max * i2;
            int i6 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            int i7 = 0;
            for (Size size3 : r5) {
                int i8 = (i4 - (size3.width * size3.height)) * -1;
                if (((size3.width >= max && size3.height >= i2) || (size3.width >= i2 && size3.height >= max)) && i8 < r6) {
                    i7 = 0;
                    size2 = size3;
                    i6 = i8;
                }
                int i9 = -1 * (i4 - ((size3.width * size3.height) / 4));
                if (((size3.width / 2 >= max && size3.height / 2 >= i2) || (size3.width / 2 >= i2 && size3.height / 2 >= max)) && i9 < r6) {
                    if (Version.hasFastCpuWithAsmOptim()) {
                        i7 = 1;
                        size2 = size3;
                        i6 = i9;
                    } else {
                        i7 = 0;
                        size2 = size3;
                    }
                }
                if (size3.width == max && size3.height == i2) {
                    i7 = 0;
                    size2 = size3;
                    break;
                }
            }
            int[] iArr = new int[]{size2.width, size2.height, i7};
            Object[] objArr3 = new Object[2];
            objArr3[0] = "mediastreamer";
            StringBuilder stringBuilder3 = new StringBuilder("resolution selection done (");
            stringBuilder3.append(iArr[0]);
            stringBuilder3.append(", ");
            stringBuilder3.append(iArr[1]);
            stringBuilder3.append(", ");
            stringBuilder3.append(iArr[2]);
            stringBuilder3.append(")");
            objArr3[1] = stringBuilder3.toString();
            Log.m22093d(objArr3);
            return iArr;
        } catch (Throwable e) {
            Log.m22094e(e, "mediastreamer", " resolution selection failed");
            return null;
        }
    }

    public static void setPreviewDisplaySurface(Object obj, Object obj2) {
        Object[] objArr = new Object[2];
        objArr[0] = "mediastreamer";
        StringBuilder stringBuilder = new StringBuilder("setPreviewDisplaySurface(");
        stringBuilder.append(obj);
        stringBuilder.append(", ");
        stringBuilder.append(obj2);
        stringBuilder.append(")");
        objArr[1] = stringBuilder.toString();
        Log.m22093d(objArr);
        try {
            ((Camera) obj).setPreviewDisplay(((SurfaceView) obj2).getHolder());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Object startRecording(int i, int i2, int i3, int i4, int i5, final long j) {
        Object[] objArr = new Object[2];
        objArr[0] = "mediastreamer";
        StringBuilder stringBuilder = new StringBuilder("startRecording(");
        stringBuilder.append(i);
        stringBuilder.append(", ");
        stringBuilder.append(i2);
        stringBuilder.append(", ");
        stringBuilder.append(i3);
        stringBuilder.append(", ");
        stringBuilder.append(i4);
        stringBuilder.append(", ");
        stringBuilder.append(i5);
        stringBuilder.append(", ");
        stringBuilder.append(j);
        stringBuilder.append(")");
        objArr[1] = stringBuilder.toString();
        Log.m22093d(objArr);
        Camera open = Camera.open();
        applyCameraParameters(open, i2, i3, i4);
        open.setPreviewCallback(new PreviewCallback() {
            public final void onPreviewFrame(byte[] bArr, Camera camera) {
                if (AndroidVideoApi5JniWrapper.isRecording) {
                    AndroidVideoApi5JniWrapper.putImage(j, bArr);
                }
            }
        });
        open.startPreview();
        isRecording = true;
        Object[] objArr2 = new Object[2];
        objArr2[0] = "mediastreamer";
        StringBuilder stringBuilder2 = new StringBuilder("Returning camera object: ");
        stringBuilder2.append(open);
        objArr2[1] = stringBuilder2.toString();
        Log.m22093d(objArr2);
        return open;
    }

    public static void stopRecording(Object obj) {
        isRecording = false;
        Object[] objArr = new Object[2];
        objArr[0] = "mediastreamer";
        StringBuilder stringBuilder = new StringBuilder("stopRecording(");
        stringBuilder.append(obj);
        stringBuilder.append(")");
        objArr[1] = stringBuilder.toString();
        Log.m22093d(objArr);
        Camera camera = (Camera) obj;
        if (camera != null) {
            camera.setPreviewCallback(null);
            camera.stopPreview();
            camera.release();
            return;
        }
        Log.m22099i("mediastreamer", "Cannot stop recording ('camera' is null)");
    }
}
