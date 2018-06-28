package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.support.v4.app.C0390k;
import android.support.v4.app.C6358f;
import com.google.android.gms.common.internal.ac;

public final class C7138f extends C6358f {
    private Dialog ae = null;
    private OnCancelListener af = null;

    public static C7138f m18787a(Dialog dialog, OnCancelListener onCancelListener) {
        C7138f c7138f = new C7138f();
        dialog = (Dialog) ac.m4377a((Object) dialog, (Object) "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        c7138f.ae = dialog;
        if (onCancelListener != null) {
            c7138f.af = onCancelListener;
        }
        return c7138f;
    }

    public final void mo3404a(C0390k c0390k, String str) {
        super.mo3404a(c0390k, str);
    }

    public final Dialog mo2533e() {
        if (this.ae == null) {
            this.f17403d = false;
        }
        return this.ae;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        if (this.af != null) {
            this.af.onCancel(dialogInterface);
        }
    }
}
