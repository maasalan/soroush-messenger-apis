package mobi.mmdt.ott.view.tools;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;

public final class C4514j {
    public static void m8229a(Activity activity, Fragment fragment, String str, int i, boolean z) {
        FragmentTransaction beginTransaction = activity.getFragmentManager().beginTransaction();
        beginTransaction.replace(i, fragment);
        beginTransaction.setTransition(4099);
        if (z) {
            beginTransaction.addToBackStack(str);
        }
        beginTransaction.commit();
    }
}
