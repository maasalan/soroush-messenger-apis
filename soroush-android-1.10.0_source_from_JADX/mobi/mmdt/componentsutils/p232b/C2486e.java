package mobi.mmdt.componentsutils.p232b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.media.ExifInterface;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import mobi.mmdt.componentsutils.C2468a;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;

public final class C2486e {
    public static Bitmap m6746a(String str) {
        if (str == null) {
            return null;
        }
        float f;
        Options options;
        Bitmap decodeFile;
        int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 1);
        Matrix matrix = new Matrix();
        if (attributeInt == 3) {
            f = 180.0f;
        } else if (attributeInt == 6) {
            f = 90.0f;
        } else if (attributeInt != 8) {
            options = new Options();
            options.inTempStorage = new byte[24576];
            options.inJustDecodeBounds = false;
            options.inSampleSize = 2;
            options.inPreferredConfig = Config.RGB_565;
            decodeFile = BitmapFactory.decodeFile(str, options);
            return Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
        } else {
            f = 270.0f;
        }
        matrix.postRotate(f);
        options = new Options();
        options.inTempStorage = new byte[24576];
        options.inJustDecodeBounds = false;
        options.inSampleSize = 2;
        options.inPreferredConfig = Config.RGB_565;
        decodeFile = BitmapFactory.decodeFile(str, options);
        return Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
    }

    public static void m6747a(String str, String str2) {
        Bitmap a = C2486e.m6746a(str);
        long length = new File(str).length();
        int i = 960;
        if ((a.getHeight() < 960 || a.getWidth() < 960) && length < 500000) {
            C2468a.m6701a(str, str2);
        } else {
            int i2;
            if (a.getWidth() < a.getHeight()) {
                i = (a.getHeight() * 960) / a.getWidth();
                i2 = 960;
            } else {
                i2 = (a.getWidth() * 960) / a.getHeight();
            }
            a = Bitmap.createScaledBitmap(a, i2, i, false);
            OutputStream fileOutputStream = new FileOutputStream(str2);
            a.compress(CompressFormat.JPEG, 90, fileOutputStream);
            try {
                fileOutputStream.close();
            } catch (Throwable e) {
                C2480b.m6737b("compress image", e);
            }
        }
        if (!a.isRecycled()) {
            a.recycle();
        }
    }

    public static C2484d m6748b(String str) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i = options.outWidth;
        int i2 = options.outHeight;
        if (i <= 0) {
            i = 0;
        }
        if (i2 <= 0) {
            i2 = 0;
        }
        return new C2484d(i, i2);
    }
}
