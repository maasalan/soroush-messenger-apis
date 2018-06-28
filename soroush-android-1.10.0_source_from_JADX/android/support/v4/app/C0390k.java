package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.app.Fragment.SavedState;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public abstract class C0390k {

    public interface C0388a {
        String mo246g();
    }

    public static abstract class C0389b {
        public void mo30a(Fragment fragment) {
        }

        public void mo31b(Fragment fragment) {
        }

        public void mo32c(Fragment fragment) {
        }
    }

    public abstract SavedState mo250a(Fragment fragment);

    public abstract Fragment mo251a(int i);

    public abstract Fragment mo252a(Bundle bundle, String str);

    public abstract Fragment mo253a(String str);

    public abstract C0401p mo254a();

    public abstract void mo255a(Bundle bundle, String str, Fragment fragment);

    public abstract void mo256a(C0389b c0389b);

    public abstract void mo257a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void mo258b(int i);

    public abstract boolean mo259b();

    public abstract C0388a mo260c(int i);

    public abstract boolean mo261c();

    public abstract int mo262d();

    public abstract List<Fragment> mo263e();

    public abstract boolean mo264f();
}
