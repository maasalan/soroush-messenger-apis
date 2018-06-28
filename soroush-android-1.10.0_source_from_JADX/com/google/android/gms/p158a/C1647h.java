package com.google.android.gms.p158a;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

final class C1647h implements OnClickListener {
    private /* synthetic */ Context f5107a;
    private /* synthetic */ Intent f5108b;

    C1647h(Context context, Intent intent) {
        this.f5107a = context;
        this.f5108b = intent;
    }

    public final void onClick(View view) {
        try {
            this.f5107a.startActivity(this.f5108b);
        } catch (Throwable e) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
        }
    }
}
