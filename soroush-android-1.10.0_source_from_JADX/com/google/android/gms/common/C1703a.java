package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import com.google.android.gms.common.internal.ac;

public final class C1703a extends DialogFragment {
    private Dialog f5208a = null;
    private OnCancelListener f5209b = null;

    public static C1703a m4303a(Dialog dialog, OnCancelListener onCancelListener) {
        C1703a c1703a = new C1703a();
        dialog = (Dialog) ac.m4377a((Object) dialog, (Object) "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        c1703a.f5208a = dialog;
        if (onCancelListener != null) {
            c1703a.f5209b = onCancelListener;
        }
        return c1703a;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        if (this.f5209b != null) {
            this.f5209b.onCancel(dialogInterface);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.f5208a == null) {
            setShowsDialog(false);
        }
        return this.f5208a;
    }

    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
