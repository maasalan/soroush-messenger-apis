package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.FileDescriptor;
import org.jivesoftware.smack.sm.packet.StreamManagement.AckRequest;

final class GifInfoHandle {
    static final GifInfoHandle f24882a = new GifInfoHandle();
    private volatile long f24883b;

    static {
        C7846f.m22136a(null, "pl_droidsonroids_gif");
    }

    private GifInfoHandle() {
    }

    GifInfoHandle(AssetFileDescriptor assetFileDescriptor) {
        try {
            this.f24883b = openFd(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), false);
        } finally {
            assetFileDescriptor.close();
        }
    }

    GifInfoHandle(String str) {
        this.f24883b = openFile(str, false);
    }

    static GifInfoHandle m22103a(ContentResolver contentResolver, Uri uri) {
        return "file".equals(uri.getScheme()) ? new GifInfoHandle(uri.getPath()) : new GifInfoHandle(contentResolver.openAssetFileDescriptor(uri, AckRequest.ELEMENT));
    }

    private static native void free(long j);

    private static native int getCurrentFrameIndex(long j);

    private static native int getCurrentLoop(long j);

    private static native int getCurrentPosition(long j);

    private static native int getDuration(long j);

    private static native int getHeight(long j);

    private static native int getLoopCount(long j);

    private static native int getNativeErrorCode(long j);

    private static native int getNumberOfFrames(long j);

    private static native long[] getSavedState(long j);

    private static native int getWidth(long j);

    private static native boolean isOpaque(long j);

    static native long openFd(FileDescriptor fileDescriptor, long j, boolean z);

    static native long openFile(String str, boolean z);

    private synchronized void m22104p() {
        free(this.f24883b);
        this.f24883b = 0;
    }

    private static native long renderFrame(long j, Bitmap bitmap);

    private static native boolean reset(long j);

    private static native long restoreRemainder(long j);

    private static native int restoreSavedState(long j, long[] jArr, Bitmap bitmap);

    private static native void saveRemainder(long j);

    private static native void seekToTime(long j, int i, Bitmap bitmap);

    final synchronized int m22105a(long[] jArr, Bitmap bitmap) {
        return restoreSavedState(this.f24883b, jArr, bitmap);
    }

    final synchronized long m22106a() {
        return restoreRemainder(this.f24883b);
    }

    final synchronized long m22107a(Bitmap bitmap) {
        return renderFrame(this.f24883b, bitmap);
    }

    final synchronized void m22108a(int i, Bitmap bitmap) {
        seekToTime(this.f24883b, i, bitmap);
    }

    final synchronized boolean m22109b() {
        return reset(this.f24883b);
    }

    final synchronized void m22110c() {
        saveRemainder(this.f24883b);
    }

    final synchronized int m22111d() {
        return getLoopCount(this.f24883b);
    }

    final synchronized int m22112e() {
        return getNativeErrorCode(this.f24883b);
    }

    final synchronized int m22113f() {
        return getDuration(this.f24883b);
    }

    protected final void finalize() {
        try {
            m22104p();
        } finally {
            super.finalize();
        }
    }

    final synchronized int m22114g() {
        return getCurrentPosition(this.f24883b);
    }

    final synchronized int m22115h() {
        return getCurrentFrameIndex(this.f24883b);
    }

    final synchronized int m22116i() {
        return getCurrentLoop(this.f24883b);
    }

    final synchronized boolean m22117j() {
        return this.f24883b == 0;
    }

    final synchronized long[] m22118k() {
        return getSavedState(this.f24883b);
    }

    final synchronized int m22119l() {
        return getWidth(this.f24883b);
    }

    final synchronized int m22120m() {
        return getHeight(this.f24883b);
    }

    final synchronized int m22121n() {
        return getNumberOfFrames(this.f24883b);
    }

    final synchronized boolean m22122o() {
        return isOpaque(this.f24883b);
    }
}
