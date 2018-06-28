package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

final class am extends Handler {
    private /* synthetic */ ai f5370a;

    public am(ai aiVar, Looper looper) {
        this.f5370a = aiVar;
        super(looper);
    }

    private static void m4428a(Message message) {
        ((an) message.obj).m4432c();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m4429b(android.os.Message r3) {
        /*
        r0 = r3.what;
        r1 = 1;
        r2 = 2;
        if (r0 == r2) goto L_0x0012;
    L_0x0006:
        r0 = r3.what;
        if (r0 == r1) goto L_0x0012;
    L_0x000a:
        r3 = r3.what;
        r0 = 7;
        if (r3 != r0) goto L_0x0010;
    L_0x000f:
        return r1;
    L_0x0010:
        r3 = 0;
        return r3;
    L_0x0012:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.am.b(android.os.Message):boolean");
    }

    public final void handleMessage(Message message) {
        if (this.f5370a.f5349f.get() != message.arg1) {
            if (m4429b(message)) {
                m4428a(message);
            }
        } else if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !this.f5370a.m4416c()) {
            m4428a(message);
        } else if (message.what == 4) {
            this.f5370a.f5368y = new ConnectionResult(message.arg2);
            if (!this.f5370a.m4406p() || this.f5370a.f5369z) {
                r7 = this.f5370a.f5368y != null ? this.f5370a.f5368y : new ConnectionResult(8);
                this.f5370a.f5348e.mo1554a(r7);
                this.f5370a.m4411a(r7);
                return;
            }
            this.f5370a.m4391a(3, null);
        } else if (message.what == 5) {
            r7 = this.f5370a.f5368y != null ? this.f5370a.f5368y : new ConnectionResult(8);
            this.f5370a.f5348e.mo1554a(r7);
            this.f5370a.m4411a(r7);
        } else {
            PendingIntent pendingIntent = null;
            if (message.what == 3) {
                if (message.obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) message.obj;
                }
                ConnectionResult connectionResult = new ConnectionResult(message.arg2, pendingIntent);
                this.f5370a.f5348e.mo1554a(connectionResult);
                this.f5370a.m4411a(connectionResult);
            } else if (message.what == 6) {
                this.f5370a.m4391a(5, null);
                if (this.f5370a.f5364u != null) {
                    ak f = this.f5370a.f5364u;
                    int i = message.arg2;
                    f.mo1566b();
                }
                ai aiVar = this.f5370a;
                aiVar.f5344a = message.arg2;
                aiVar.f5345b = System.currentTimeMillis();
                this.f5370a.m4394a(5, 1, null);
            } else if (message.what == 2 && !this.f5370a.m4415b()) {
                m4428a(message);
            } else if (m4429b(message)) {
                ((an) message.obj).m4431b();
            } else {
                int i2 = message.what;
                StringBuilder stringBuilder = new StringBuilder(45);
                stringBuilder.append("Don't know how to handle message: ");
                stringBuilder.append(i2);
                Log.wtf("GmsClient", stringBuilder.toString(), new Exception());
            }
        }
    }
}
