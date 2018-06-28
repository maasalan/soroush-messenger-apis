package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.internal.C1732v;

public abstract class ba implements OnClickListener {
    public static ba m4445a(Activity activity, Intent intent) {
        return new bb(intent, activity);
    }

    public static ba m4446a(C1732v c1732v, Intent intent) {
        return new bc(intent, c1732v);
    }

    protected abstract void mo1564a();

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo1564a();
        } catch (Throwable e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
