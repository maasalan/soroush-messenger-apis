package org.linphone.mediastream.video.capture;

import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;
import org.linphone.mediastream.Log;

public class AndroidVideoApi8JniWrapper {
    public static int detectCameras(int[] iArr, int[] iArr2, int[] iArr3) {
        return AndroidVideoApi5JniWrapper.detectCameras(iArr, iArr2, iArr3);
    }

    public static int[] selectNearestResolutionAvailable(int i, int i2, int i3) {
        return AndroidVideoApi5JniWrapper.selectNearestResolutionAvailable(i, i2, i3);
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
        Camera open = Camera.open();
        AndroidVideoApi5JniWrapper.applyCameraParameters(open, i2, i3, i4);
        i2 = ((i2 * i3) * ImageFormat.getBitsPerPixel(open.getParameters().getPreviewFormat())) / 8;
        open.addCallbackBuffer(new byte[i2]);
        open.addCallbackBuffer(new byte[i2]);
        open.setPreviewCallbackWithBuffer(new PreviewCallback() {
            public final void onPreviewFrame(byte[] bArr, Camera camera) {
                if (AndroidVideoApi5JniWrapper.isRecording) {
                    AndroidVideoApi5JniWrapper.putImage(j, bArr);
                    camera.addCallbackBuffer(bArr);
                }
            }
        });
        open.startPreview();
        AndroidVideoApi5JniWrapper.isRecording = true;
        Object[] objArr2 = new Object[1];
        StringBuilder stringBuilder2 = new StringBuilder("Returning camera object: ");
        stringBuilder2.append(open);
        objArr2[0] = stringBuilder2.toString();
        Log.m22093d(objArr2);
        return open;
    }

    public static void stopRecording(Object obj) {
        AndroidVideoApi5JniWrapper.isRecording = false;
        Object[] objArr = new Object[1];
        StringBuilder stringBuilder = new StringBuilder("stopRecording(");
        stringBuilder.append(obj);
        stringBuilder.append(")");
        objArr[0] = stringBuilder.toString();
        Log.m22093d(objArr);
        Camera camera = (Camera) obj;
        if (camera != null) {
            camera.setPreviewCallbackWithBuffer(null);
            camera.stopPreview();
            camera.release();
            return;
        }
        Log.m22099i("Cannot stop recording ('camera' is null)");
    }
}
