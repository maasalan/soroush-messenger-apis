package org.linphone.mediastream;

public final class Log {
    public static String TAG = "Linphone";
    private static boolean isLogEnabled = true;
    private static final boolean useIsLoggable = false;

    public Log(String str, boolean z) {
        TAG = str;
        isLogEnabled = z;
    }

    public static void m22092d(Throwable th, Object... objArr) {
        if (isLoggable(3)) {
            android.util.Log.d(TAG, toString(objArr), th);
        }
    }

    public static void m22093d(Object... objArr) {
        if (isLoggable(3)) {
            android.util.Log.d(TAG, toString(objArr));
        }
    }

    public static void m22094e(Throwable th, Object... objArr) {
        if (isLoggable(6)) {
            android.util.Log.e(TAG, toString(objArr), th);
        }
    }

    public static void m22095e(Object... objArr) {
        if (isLoggable(6)) {
            android.util.Log.e(TAG, toString(objArr));
        }
    }

    public static void m22096f(Throwable th, Object... objArr) {
        if (isLoggable(6)) {
            android.util.Log.e(TAG, toString(objArr), th);
            StringBuilder stringBuilder = new StringBuilder("Fatal error : ");
            stringBuilder.append(toString(objArr));
            throw new RuntimeException(stringBuilder.toString(), th);
        }
    }

    public static void m22097f(Object... objArr) {
        if (isLoggable(6)) {
            android.util.Log.e(TAG, toString(objArr));
            StringBuilder stringBuilder = new StringBuilder("Fatal error : ");
            stringBuilder.append(toString(objArr));
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static void m22098i(Throwable th, Object... objArr) {
        if (isLoggable(4)) {
            android.util.Log.i(TAG, toString(objArr), th);
        }
    }

    public static void m22099i(Object... objArr) {
        if (isLoggable(4)) {
            android.util.Log.i(TAG, toString(objArr));
        }
    }

    private static boolean isLoggable(int i) {
        return isLogEnabled;
    }

    private static String toString(Object... objArr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object append : objArr) {
            stringBuilder.append(append);
        }
        return stringBuilder.toString();
    }

    public static void m22100w(Throwable th, Object... objArr) {
        if (isLoggable(5)) {
            android.util.Log.w(TAG, toString(objArr), th);
        }
    }

    public static void m22101w(Object... objArr) {
        if (isLoggable(5)) {
            android.util.Log.w(TAG, toString(objArr));
        }
    }
}
