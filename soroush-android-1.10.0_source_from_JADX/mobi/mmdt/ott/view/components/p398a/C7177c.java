package mobi.mmdt.ott.view.components.p398a;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.C6358f;

public final class C7177c extends C6358f {
    private C3103a ae;

    public interface C3103a {
        Dialog mo3683b(Bundle bundle);
    }

    public static C7177c m18970k(Bundle bundle) {
        C7177c c7177c = new C7177c();
        c7177c.mo3059e(bundle);
        return c7177c;
    }

    public final void mo3057a(Activity activity) {
        super.mo3057a(activity);
        if (activity instanceof C3103a) {
            this.ae = (C3103a) activity;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(activity.toString());
        stringBuilder.append(" must implement AlertDialogFragment.IAlertDialogInteractionColorPicker");
        throw new ClassCastException(stringBuilder.toString());
    }

    public final Dialog mo2533e() {
        return this.ae.mo3683b(this.f13204p);
    }
}
