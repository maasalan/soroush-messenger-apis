package me.p226a.p227a.p228a;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;

public final class C2450f {
    public static int m6685a(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        return defaultDisplay.getWidth() == defaultDisplay.getHeight() ? 3 : defaultDisplay.getWidth() < defaultDisplay.getHeight() ? 1 : 2;
    }
}
