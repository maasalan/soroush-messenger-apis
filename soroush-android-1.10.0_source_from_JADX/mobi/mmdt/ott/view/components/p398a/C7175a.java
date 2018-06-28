package mobi.mmdt.ott.view.components.p398a;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.C6358f;

public final class C7175a extends C6358f {
    private C3101a ae;

    public interface C3101a {
        Dialog mo2299a(Bundle bundle);
    }

    public static C7175a m18964k(Bundle bundle) {
        C7175a c7175a = new C7175a();
        c7175a.mo3059e(bundle);
        return c7175a;
    }

    public final void mo3057a(Activity activity) {
        super.mo3057a(activity);
        if (activity instanceof C3101a) {
            this.ae = (C3101a) activity;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(activity.toString());
        stringBuilder.append(" must implement AlertDialogFragment.IAlertDialogInteraction");
        throw new ClassCastException(stringBuilder.toString());
    }

    public final Dialog mo2533e() {
        return this.ae.mo2299a(this.f13204p);
    }
}
