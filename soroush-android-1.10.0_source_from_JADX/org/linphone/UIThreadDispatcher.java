package org.linphone;

import android.os.Handler;
import android.os.Looper;

public class UIThreadDispatcher {
    private static Handler mHandler = new Handler(Looper.getMainLooper());

    public static void dispatch(Runnable runnable) {
        mHandler.post(runnable);
    }
}
