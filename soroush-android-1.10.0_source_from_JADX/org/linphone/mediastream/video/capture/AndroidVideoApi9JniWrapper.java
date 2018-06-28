package org.linphone.mediastream.video.capture;

import android.annotation.TargetApi;
import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import java.util.List;
import org.linphone.mediastream.Log;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

@TargetApi(9)
public class AndroidVideoApi9JniWrapper {
    public static int detectCameras(int[] iArr, int[] iArr2, int[] iArr3) {
        return AndroidVideoApi5JniWrapper.detectCameras(iArr, iArr2, iArr3);
    }

    private static int[] findClosestEnclosingFpsRange(int i, List<int[]> list) {
        Object[] objArr = new Object[1];
        StringBuilder stringBuilder = new StringBuilder("Searching for closest fps range from ");
        stringBuilder.append(i);
        objArr[0] = stringBuilder.toString();
        Log.m22093d(objArr);
        if (list != null) {
            if (list.size() != 0) {
                int[] iArr = (int[]) list.get(0);
                int abs = Math.abs(iArr[0] - i) + Math.abs(iArr[1] - i);
                for (int[] iArr2 : list) {
                    if (iArr2[0] <= i && iArr2[1] >= i) {
                        int abs2 = Math.abs(iArr2[0] - i) + Math.abs(iArr2[1] - i);
                        if (abs2 < abs) {
                            objArr = new Object[1];
                            stringBuilder = new StringBuilder("a better range has been found: w=");
                            stringBuilder.append(iArr2[0]);
                            stringBuilder.append(",h=");
                            stringBuilder.append(iArr2[1]);
                            objArr[0] = stringBuilder.toString();
                            Log.m22093d(objArr);
                            iArr = iArr2;
                            abs = abs2;
                        }
                    }
                }
                Object[] objArr2 = new Object[1];
                StringBuilder stringBuilder2 = new StringBuilder("The closest fps range is w=");
                stringBuilder2.append(iArr[0]);
                stringBuilder2.append(",h=");
                stringBuilder2.append(iArr[1]);
                objArr2[0] = stringBuilder2.toString();
                Log.m22093d(objArr2);
                return iArr;
            }
        }
        return new int[]{0, 0};
    }

    public static int[] selectNearestResolutionAvailable(int i, int i2, int i3) {
        Object[] objArr = new Object[1];
        StringBuilder stringBuilder = new StringBuilder("selectNearestResolutionAvailable: ");
        stringBuilder.append(i);
        stringBuilder.append(", ");
        stringBuilder.append(i2);
        stringBuilder.append("x");
        stringBuilder.append(i3);
        objArr[0] = stringBuilder.toString();
        Log.m22093d(objArr);
        return AndroidVideoApi5JniWrapper.selectNearestResolutionAvailableForCamera(i, i2, i3);
    }

    private static void setCameraDisplayOrientation(int i, int i2, Camera camera) {
        CameraInfo cameraInfo = new CameraInfo();
        Camera.getCameraInfo(i2, cameraInfo);
        i = cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i) % 360)) % 360 : ((cameraInfo.orientation - i) + 360) % 360;
        Object[] objArr = new Object[1];
        StringBuilder stringBuilder = new StringBuilder("Camera preview orientation: ");
        stringBuilder.append(i);
        objArr[0] = stringBuilder.toString();
        Log.m22101w(objArr);
        try {
            camera.setDisplayOrientation(i);
        } catch (Exception e) {
            Object[] objArr2 = new Object[1];
            StringBuilder stringBuilder2 = new StringBuilder("Failed to execute: camera[");
            stringBuilder2.append(camera);
            stringBuilder2.append("].setDisplayOrientation(");
            stringBuilder2.append(i);
            stringBuilder2.append(")");
            objArr2[0] = stringBuilder2.toString();
            Log.m22095e(objArr2);
            e.printStackTrace();
        }
    }

    public static void setPreviewDisplaySurface(Object obj, Object obj2) {
        AndroidVideoApi5JniWrapper.setPreviewDisplaySurface(obj, obj2);
    }

    public static Object startRecording(int i, int i2, int i3, int i4, int i5, final long j) {
        Object[] objArr = new Object[1];
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
        objArr[0] = stringBuilder.toString();
        Log.m22093d(objArr);
        try {
            Camera open = Camera.open(i);
            Parameters parameters = open.getParameters();
            parameters.setPreviewSize(i2, i3);
            int[] findClosestEnclosingFpsRange = findClosestEnclosingFpsRange(i4 * IjkMediaCodecInfo.RANK_MAX, parameters.getSupportedPreviewFpsRange());
            parameters.setPreviewFpsRange(findClosestEnclosingFpsRange[0], findClosestEnclosingFpsRange[1]);
            open.setParameters(parameters);
            i2 = ((i2 * i3) * ImageFormat.getBitsPerPixel(parameters.getPreviewFormat())) / 8;
            open.addCallbackBuffer(new byte[i2]);
            open.addCallbackBuffer(new byte[i2]);
            open.setPreviewCallbackWithBuffer(new PreviewCallback() {
                public final void onPreviewFrame(byte[] bArr, Camera camera) {
                    if (bArr == null) {
                        Parameters parameters = camera.getParameters();
                        Size previewSize = parameters.getPreviewSize();
                        int bitsPerPixel = ((previewSize.width * previewSize.height) * ImageFormat.getBitsPerPixel(parameters.getPreviewFormat())) / 8;
                        camera.addCallbackBuffer(new byte[(bitsPerPixel + (bitsPerPixel / 20))]);
                        return;
                    }
                    if (AndroidVideoApi5JniWrapper.isRecording) {
                        AndroidVideoApi5JniWrapper.putImage(j, bArr);
                        camera.addCallbackBuffer(bArr);
                    }
                }
            });
            setCameraDisplayOrientation(i5, i, open);
            open.startPreview();
            AndroidVideoApi5JniWrapper.isRecording = true;
            Object[] objArr2 = new Object[1];
            StringBuilder stringBuilder2 = new StringBuilder("Returning camera object: ");
            stringBuilder2.append(open);
            objArr2[0] = stringBuilder2.toString();
            Log.m22093d(objArr2);
            return open;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void stopRecording(Object obj) {
        AndroidVideoApi5JniWrapper.isRecording = false;
        AndroidVideoApi8JniWrapper.stopRecording(obj);
    }
}
