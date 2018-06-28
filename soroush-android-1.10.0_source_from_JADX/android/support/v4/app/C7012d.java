package android.support.v4.app;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

abstract class C7012d extends C6357c {
    boolean f20032b;

    C7012d() {
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!(this.f20032b || i == -1)) {
            C6357c.m14951b(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!(this.a || i == -1)) {
            C6357c.m14951b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
