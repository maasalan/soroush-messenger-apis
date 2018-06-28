package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.C1720i;
import com.google.android.gms.common.api.Status;

public final class au<R extends C1720i> extends Handler {
    public au() {
        this(Looper.getMainLooper());
    }

    public au(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                Pair pair = (Pair) message.obj;
                Object obj = pair.first;
                Object obj2 = pair.second;
                return;
            case 2:
                ((as) message.obj).m11771c(Status.f17978d);
                return;
            default:
                int i = message.what;
                StringBuilder stringBuilder = new StringBuilder(45);
                stringBuilder.append("Don't know how to handle message: ");
                stringBuilder.append(i);
                Log.wtf("BasePendingResult", stringBuilder.toString(), new Exception());
                return;
        }
    }
}
