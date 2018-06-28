package tv.danmaku.ijk.media.player.pragma;

import android.util.Log;
import java.util.Locale;

public class DebugLog {
    public static final boolean ENABLE_DEBUG = true;
    public static final boolean ENABLE_ERROR = true;
    public static final boolean ENABLE_INFO = true;
    public static final boolean ENABLE_VERBOSE = true;
    public static final boolean ENABLE_WARN = true;

    public static void m22146d(String str, String str2) {
        Log.d(str, str2);
    }

    public static void m22147d(String str, String str2, Throwable th) {
        Log.d(str, str2, th);
    }

    public static void dfmt(String str, String str2, Object... objArr) {
        Log.d(str, String.format(Locale.US, str2, objArr));
    }

    public static void m22148e(String str, String str2) {
        Log.e(str, str2);
    }

    public static void m22149e(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }

    public static void efmt(String str, String str2, Object... objArr) {
        Log.e(str, String.format(Locale.US, str2, objArr));
    }

    public static void m22150i(String str, String str2) {
        Log.i(str, str2);
    }

    public static void m22151i(String str, String str2, Throwable th) {
        Log.i(str, str2, th);
    }

    public static void ifmt(String str, String str2, Object... objArr) {
        Log.i(str, String.format(Locale.US, str2, objArr));
    }

    public static void printCause(Throwable th) {
        Throwable cause = th.getCause();
        if (cause != null) {
            th = cause;
        }
        printStackTrace(th);
    }

    public static void printStackTrace(Throwable th) {
        th.printStackTrace();
    }

    public static void m22152v(String str, String str2) {
        Log.v(str, str2);
    }

    public static void m22153v(String str, String str2, Throwable th) {
        Log.v(str, str2, th);
    }

    public static void vfmt(String str, String str2, Object... objArr) {
        Log.v(str, String.format(Locale.US, str2, objArr));
    }

    public static void m22154w(String str, String str2) {
        Log.w(str, str2);
    }

    public static void m22155w(String str, String str2, Throwable th) {
        Log.w(str, str2, th);
    }

    public static void wfmt(String str, String str2, Object... objArr) {
        Log.w(str, String.format(Locale.US, str2, objArr));
    }
}
