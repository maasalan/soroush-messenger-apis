package com.p085c.p086a.p089c.p098d.p099a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.Log;
import com.p085c.p086a.p089c.p092b.p093a.C1106e;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C1192r {
    private static final Paint f3784a = new Paint(6);
    private static final Paint f3785b = new Paint(7);
    private static final Paint f3786c;
    private static final List<String> f3787d;
    private static final Lock f3788e;

    private static final class C1191a implements Lock {
        C1191a() {
        }

        public final void lock() {
        }

        public final void lockInterruptibly() {
        }

        public final Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        public final boolean tryLock() {
            return true;
        }

        public final boolean tryLock(long j, TimeUnit timeUnit) {
            return true;
        }

        public final void unlock() {
        }
    }

    static {
        List asList = Arrays.asList(new String[]{"XT1097", "XT1085"});
        f3787d = asList;
        Lock reentrantLock = (asList.contains(Build.MODEL) && VERSION.SDK_INT == 22) ? new ReentrantLock() : new C1191a();
        f3788e = reentrantLock;
        Paint paint = new Paint(7);
        f3786c = paint;
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
    }

    public static int m2835a(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    private static Config m2836a(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Config.ARGB_8888;
    }

    public static Bitmap m2837a(C1106e c1106e, Bitmap bitmap, int i) {
        Matrix matrix = new Matrix();
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, BallPulseIndicator.SCALE);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
            default:
                break;
        }
        matrix.postScale(-1.0f, BallPulseIndicator.SCALE);
        if (matrix.isIdentity()) {
            return bitmap;
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap a = c1106e.mo1134a(Math.round(rectF.width()), Math.round(rectF.height()), C1192r.m2836a(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        C1192r.m2841a(bitmap, a, matrix);
        return a;
    }

    public static Bitmap m2838a(C1106e c1106e, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        float height;
        float width;
        Matrix matrix = new Matrix();
        float f = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            height = ((float) i2) / ((float) bitmap.getHeight());
            width = (((float) i) - (((float) bitmap.getWidth()) * height)) * 0.5f;
        } else {
            height = ((float) i) / ((float) bitmap.getWidth());
            f = (((float) i2) - (((float) bitmap.getHeight()) * height)) * 0.5f;
            width = 0.0f;
        }
        matrix.setScale(height, height);
        matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (f + 0.5f)));
        Bitmap a = c1106e.mo1134a(i, i2, C1192r.m2836a(bitmap));
        C1192r.m2840a(bitmap, a);
        C1192r.m2841a(bitmap, a, matrix);
        return a;
    }

    public static Lock m2839a() {
        return f3788e;
    }

    private static void m2840a(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    private static void m2841a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        f3788e.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f3784a);
            canvas.setBitmap(null);
        } finally {
            f3788e.unlock();
        }
    }

    public static Bitmap m2842b(C1106e c1106e, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        int width = (int) (((float) bitmap.getWidth()) * min);
        int height = (int) (((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == width && bitmap.getHeight() == height) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap a = c1106e.mo1134a(width, height, C1192r.m2836a(bitmap));
        C1192r.m2840a(bitmap, a);
        if (Log.isLoggable("TransformationUtils", 2)) {
            StringBuilder stringBuilder = new StringBuilder("request: ");
            stringBuilder.append(i);
            stringBuilder.append("x");
            stringBuilder.append(i2);
            Log.v("TransformationUtils", stringBuilder.toString());
            StringBuilder stringBuilder2 = new StringBuilder("toFit:   ");
            stringBuilder2.append(bitmap.getWidth());
            stringBuilder2.append("x");
            stringBuilder2.append(bitmap.getHeight());
            Log.v("TransformationUtils", stringBuilder2.toString());
            stringBuilder2 = new StringBuilder("toReuse: ");
            stringBuilder2.append(a.getWidth());
            stringBuilder2.append("x");
            stringBuilder2.append(a.getHeight());
            Log.v("TransformationUtils", stringBuilder2.toString());
            stringBuilder2 = new StringBuilder("minPct:   ");
            stringBuilder2.append(min);
            Log.v("TransformationUtils", stringBuilder2.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        C1192r.m2841a(bitmap, a, matrix);
        return a;
    }

    public static Bitmap m2843c(C1106e c1106e, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return C1192r.m2842b(c1106e, bitmap, i, i2);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    public static Bitmap m2844d(C1106e c1106e, Bitmap bitmap, int i, int i2) {
        Bitmap bitmap2;
        Object obj;
        i = Math.min(i, i2);
        float f = (float) i;
        float f2 = f / 2.0f;
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        float max = Math.max(f / width, f / height);
        width *= max;
        max *= height;
        height = (f - width) / 2.0f;
        f = (f - max) / 2.0f;
        RectF rectF = new RectF(height, f, width + height, max + f);
        if (Config.ARGB_8888.equals(bitmap.getConfig())) {
            bitmap2 = bitmap;
        } else {
            bitmap2 = c1106e.mo1134a(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
            new Canvas(bitmap2).drawBitmap(bitmap, 0.0f, 0.0f, null);
        }
        Bitmap a = c1106e.mo1134a(i, i, Config.ARGB_8888);
        a.setHasAlpha(true);
        f3788e.lock();
        try {
            Canvas canvas = new Canvas(a);
            canvas.drawCircle(f2, f2, f2, f3785b);
            canvas.drawBitmap(bitmap2, null, rectF, f3786c);
            canvas.setBitmap(null);
            if (!bitmap2.equals(obj)) {
                c1106e.mo1138a(bitmap2);
            }
            return a;
        } finally {
            obj = f3788e;
            obj.unlock();
        }
    }
}
