package android.support.v7.app;

import android.app.Dialog;
import android.support.v4.app.C6358f;

public class C7024l extends C6358f {
    public void mo3305a(Dialog dialog, int i) {
        if (dialog instanceof C4870k) {
            C4870k c4870k = (C4870k) dialog;
            switch (i) {
                case 1:
                case 2:
                    break;
                case 3:
                    dialog.getWindow().addFlags(24);
                    break;
                default:
                    return;
            }
            c4870k.m9371a();
            return;
        }
        super.mo3305a(dialog, i);
    }

    public Dialog mo2533e() {
        return new C4870k(m8909j(), this.f17401b);
    }
}
