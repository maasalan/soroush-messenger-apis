package android.support.v4.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.util.AttributeSet;
import android.view.View;

abstract class C6357c extends am {
    boolean f17399a;

    C6357c() {
    }

    static void m14951b(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    abstract View mo3483a(View view, String str, Context context, AttributeSet attributeSet);

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a = mo3483a(view, str, context, attributeSet);
        return a == null ? super.onCreateView(view, str, context, attributeSet) : a;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View a = mo3483a(null, str, context, attributeSet);
        return a == null ? super.onCreateView(str, context, attributeSet) : a;
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!(this.f17399a || i == -1)) {
            C6357c.m14951b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }
}
