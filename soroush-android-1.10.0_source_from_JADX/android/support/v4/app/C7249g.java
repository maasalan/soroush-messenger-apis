package android.support.v4.app;

import android.app.Activity;
import android.arch.lifecycle.C0093d;
import android.arch.lifecycle.C0093d.C0092b;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.v4.app.C4767a.C0372a;
import android.support.v4.app.C4767a.C0373b;
import android.support.v4.app.C4787t.C4786a;
import android.support.v4.p038g.C0482m;
import android.support.v4.p038g.C0483n;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public class C7249g extends C7012d implements C0372a, C0373b {
    final Handler f20937c = new C03841(this);
    public final C0387i f20938d = new C0387i(new C6359a(this));
    boolean f20939e;
    boolean f20940f;
    boolean f20941g = true;
    boolean f20942h = true;
    boolean f20943i;
    boolean f20944j;
    int f20945k;
    C0483n<String> f20946l;

    class C03841 extends Handler {
        final /* synthetic */ C7249g f1418a;

        C03841(C7249g c7249g) {
            this.f1418a = c7249g;
        }

        public final void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    if (this.f1418a.f20941g) {
                        this.f1418a.m19187a(false);
                    }
                    return;
                case 2:
                    this.f1418a.l_();
                    this.f1418a.f20938d.m757b();
                    return;
                default:
                    super.handleMessage(message);
                    return;
            }
        }
    }

    static final class C0385b {
        Object f1419a;
        C0400m f1420b;
        C0482m<String, C0417s> f1421c;

        C0385b() {
        }
    }

    class C6359a extends C4778j<C7249g> {
        final /* synthetic */ C7249g f17409a;

        public C6359a(C7249g c7249g) {
            this.f17409a = c7249g;
            super(c7249g);
        }

        public final View mo222a(int i) {
            return this.f17409a.findViewById(i);
        }

        public final void mo2537a(Intent intent) {
            Activity activity = this.f17409a;
            activity.b = true;
            try {
                C4767a.m8921a(activity, intent);
            } finally {
                activity.b = false;
            }
        }

        public final void mo2538a(String str, PrintWriter printWriter, String[] strArr) {
            this.f17409a.dump(str, null, printWriter, strArr);
        }

        public final boolean mo223a() {
            Window window = this.f17409a.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        public final boolean mo2539b() {
            return !this.f17409a.isFinishing();
        }

        public final LayoutInflater mo2540c() {
            return this.f17409a.getLayoutInflater().cloneInContext(this.f17409a);
        }

        public final void mo2541d() {
            this.f17409a.n_();
        }

        public final boolean mo2542e() {
            return this.f17409a.getWindow() != null;
        }

        public final int mo2543f() {
            Window window = this.f17409a.getWindow();
            return window == null ? 0 : window.getAttributes().windowAnimations;
        }
    }

    private static void m19184a(C0390k c0390k, C0092b c0092b) {
        for (Fragment fragment : c0390k.mo263e()) {
            if (fragment != null) {
                fragment.ad.m8544a(c0092b);
                C7249g.m19184a(fragment.m8913m(), c0092b);
            }
        }
    }

    final View mo3483a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f20938d.f1422a.f13264f.onCreateView(view, str, context, attributeSet);
    }

    public final void mo3484a(int i) {
        if (!this.f20944j && i != -1) {
            C6357c.m14951b(i);
        }
    }

    final void m19187a(boolean z) {
        if (this.f20942h) {
            if (z) {
                this.f20938d.m758c();
                this.f20938d.m756a(true);
            }
            return;
        }
        this.f20942h = true;
        this.f20943i = z;
        this.f20937c.removeMessages(1);
        this.f20938d.m756a(this.f20943i);
        this.f20938d.f1422a.f13264f.m9065d(2);
    }

    public final C0390k m19188c() {
        return this.f20938d.f1422a.f13264f;
    }

    public final C0093d mo39d() {
        return super.mo39d();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("  ");
        String stringBuilder2 = stringBuilder.toString();
        printWriter.print(stringBuilder2);
        printWriter.print("mCreated=");
        printWriter.print(this.f20939e);
        printWriter.print("mResumed=");
        printWriter.print(this.f20940f);
        printWriter.print(" mStopped=");
        printWriter.print(this.f20941g);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.f20942h);
        C4778j c4778j = this.f20938d.f1422a;
        printWriter.print(stringBuilder2);
        printWriter.print("mLoadersStarted=");
        printWriter.println(c4778j.f13269k);
        if (c4778j.f13267i != null) {
            printWriter.print(stringBuilder2);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString(System.identityHashCode(c4778j.f13267i)));
            printWriter.println(":");
            C4787t c4787t = c4778j.f13267i;
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(stringBuilder2);
            stringBuilder3.append("  ");
            c4787t.m9120a(stringBuilder3.toString(), fileDescriptor, printWriter, strArr);
        }
        this.f20938d.f1422a.f13264f.mo257a(str, fileDescriptor, printWriter, strArr);
    }

    public final C0417s m19190e() {
        C4778j c4778j = this.f20938d.f1422a;
        if (c4778j.f13267i != null) {
            return c4778j.f13267i;
        }
        c4778j.f13268j = true;
        c4778j.f13267i = c4778j.m8972a("(root)", c4778j.f13269k, true);
        return c4778j.f13267i;
    }

    protected final void l_() {
        this.f20938d.f1422a.f13264f.m9084r();
    }

    @Deprecated
    public void n_() {
        invalidateOptionsMenu();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.f20938d.m755a();
        int i3 = i >> 16;
        if (i3 != 0) {
            i3--;
            String str = (String) this.f20946l.m1025a(i3);
            this.f20946l.m1028b(i3);
            if (str == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            } else if (this.f20938d.m754a(str) == null) {
                StringBuilder stringBuilder = new StringBuilder("Activity result no fragment exists for who: ");
                stringBuilder.append(str);
                Log.w("FragmentActivity", stringBuilder.toString());
                return;
            } else {
                Fragment.m8855q();
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        C0390k c0390k = this.f20938d.f1422a.f13264f;
        boolean f = c0390k.mo264f();
        if (!f || VERSION.SDK_INT > 25) {
            if (f || !c0390k.mo261c()) {
                super.onBackPressed();
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f20938d.f1422a.f13264f.m9039a(configuration);
    }

    public void onCreate(Bundle bundle) {
        C0387i c0387i = this.f20938d;
        C0400m c0400m = null;
        c0387i.f1422a.f13264f.m9044a(c0387i.f1422a, c0387i.f1422a, null);
        super.onCreate(bundle);
        C0385b c0385b = (C0385b) getLastNonConfigurationInstance();
        if (c0385b != null) {
            C0387i c0387i2 = this.f20938d;
            C0482m c0482m = c0385b.f1421c;
            C4778j c4778j = c0387i2.f1422a;
            if (c0482m != null) {
                int size = c0482m.size();
                for (int i = 0; i < size; i++) {
                    ((C4787t) c0482m.m1020c(i)).f13345h = c4778j;
                }
            }
            c4778j.f13265g = c0482m;
        }
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            C0387i c0387i3 = this.f20938d;
            if (c0385b != null) {
                c0400m = c0385b.f1420b;
            }
            c0387i3.f1422a.f13264f.m9041a(parcelable, c0400m);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f20945k = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (!(intArray == null || stringArray == null)) {
                    if (intArray.length == stringArray.length) {
                        this.f20946l = new C0483n(intArray.length);
                        for (int i2 = 0; i2 < intArray.length; i2++) {
                            this.f20946l.m1026a(intArray[i2], stringArray[i2]);
                        }
                    }
                }
                Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
            }
        }
        if (this.f20946l == null) {
            this.f20946l = new C0483n();
            this.f20945k = 0;
        }
        this.f20938d.f1422a.f13264f.m9081o();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        C0387i c0387i = this.f20938d;
        return onCreatePanelMenu | c0387i.f1422a.f13264f.m9051a(menu, getMenuInflater());
    }

    public /* bridge */ /* synthetic */ View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(view, str, context, attributeSet);
    }

    public /* bridge */ /* synthetic */ View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    public void onDestroy() {
        super.onDestroy();
        m19187a(false);
        this.f20938d.f1422a.f13264f.m9086t();
        C4778j c4778j = this.f20938d.f1422a;
        if (c4778j.f13267i != null) {
            c4778j.f13267i.m9128h();
        }
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f20938d.f1422a.f13264f.m9087u();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return super.onMenuItemSelected(i, menuItem) ? true : i != 0 ? i != 6 ? false : this.f20938d.f1422a.f13264f.m9060b(menuItem) : this.f20938d.f1422a.f13264f.m9052a(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f20938d.f1422a.f13264f.m9049a(z);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f20938d.m755a();
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f20938d.f1422a.f13264f.m9057b(menu);
        }
        super.onPanelClosed(i, menu);
    }

    public void onPause() {
        super.onPause();
        this.f20940f = false;
        if (this.f20937c.hasMessages(2)) {
            this.f20937c.removeMessages(2);
            l_();
        }
        this.f20938d.f1422a.f13264f.m9065d(4);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f20938d.f1422a.f13264f.m9058b(z);
    }

    protected void onPostResume() {
        super.onPostResume();
        this.f20937c.removeMessages(2);
        l_();
        this.f20938d.m757b();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return (i != 0 || menu == null) ? super.onPreparePanel(i, view, menu) : super.onPreparePanel(0, view, menu) | this.f20938d.f1422a.f13264f.m9050a(menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        i = (i >> 16) & InBandBytestreamManager.MAXIMUM_BLOCK_SIZE;
        if (i != 0) {
            String str;
            i--;
            String str2 = (String) this.f20946l.m1025a(i);
            this.f20946l.m1028b(i);
            if (str2 == null) {
                str = "FragmentActivity";
                str2 = "Activity result delivered for unknown Fragment.";
            } else if (this.f20938d.m754a(str2) == null) {
                str = "FragmentActivity";
                StringBuilder stringBuilder = new StringBuilder("Activity result no fragment exists for who: ");
                stringBuilder.append(str2);
                str2 = stringBuilder.toString();
            } else {
                Fragment.m8856r();
            }
            Log.w(str, str2);
        }
    }

    public void onResume() {
        super.onResume();
        this.f20937c.sendEmptyMessage(2);
        this.f20940f = true;
        this.f20938d.m757b();
    }

    public final Object onRetainNonConfigurationInstance() {
        if (this.f20941g) {
            m19187a(true);
        }
        C4783l c4783l = this.f20938d.f1422a.f13264f;
        C4783l.m9000a(c4783l.f13288C);
        C0400m c0400m = c4783l.f13288C;
        C4778j c4778j = this.f20938d.f1422a;
        int i = 0;
        if (c4778j.f13265g != null) {
            int size = c4778j.f13265g.size();
            C4787t[] c4787tArr = new C4787t[size];
            for (int i2 = size - 1; i2 >= 0; i2--) {
                c4787tArr[i2] = (C4787t) c4778j.f13265g.m1020c(i2);
            }
            boolean z = c4778j.f13266h;
            int i3 = 0;
            while (i < size) {
                C4787t c4787t = c4787tArr[i];
                if (!c4787t.f13343f && z) {
                    if (!c4787t.f13342e) {
                        c4787t.m9123c();
                    }
                    c4787t.m9125e();
                }
                if (c4787t.f13343f) {
                    i3 = true;
                } else {
                    c4787t.m9128h();
                    c4778j.f13265g.remove(c4787t.f13341d);
                }
                i++;
            }
            i = i3;
        }
        C0482m c0482m = i != 0 ? c4778j.f13265g : null;
        if (c0400m == null && c0482m == null) {
            return null;
        }
        C0385b c0385b = new C0385b();
        c0385b.f1419a = null;
        c0385b.f1420b = c0400m;
        c0385b.f1421c = c0482m;
        return c0385b;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C7249g.m19184a(this.f20938d.f1422a.f13264f, C0092b.CREATED);
        Parcelable l = this.f20938d.f1422a.f13264f.m9078l();
        if (l != null) {
            bundle.putParcelable("android:support:fragments", l);
        }
        if (this.f20946l.m1024a() > 0) {
            bundle.putInt("android:support:next_request_index", this.f20945k);
            int[] iArr = new int[this.f20946l.m1024a()];
            String[] strArr = new String[this.f20946l.m1024a()];
            for (int i = 0; i < this.f20946l.m1024a(); i++) {
                iArr[i] = this.f20946l.m1031d(i);
                strArr[i] = (String) this.f20946l.m1032e(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    public void onStart() {
        super.onStart();
        this.f20941g = false;
        this.f20942h = false;
        this.f20937c.removeMessages(1);
        if (!this.f20939e) {
            this.f20939e = true;
            this.f20938d.f1422a.f13264f.m9082p();
        }
        this.f20938d.m755a();
        this.f20938d.m757b();
        this.f20938d.m758c();
        this.f20938d.f1422a.f13264f.m9083q();
        C4778j c4778j = this.f20938d.f1422a;
        if (c4778j.f13265g != null) {
            int size = c4778j.f13265g.size();
            C4787t[] c4787tArr = new C4787t[size];
            for (int i = size - 1; i >= 0; i--) {
                c4787tArr[i] = (C4787t) c4778j.f13265g.m1020c(i);
            }
            for (int i2 = 0; i2 < size; i2++) {
                C4787t c4787t = c4787tArr[i2];
                if (c4787t.f13343f) {
                    if (C4787t.f13338a) {
                        StringBuilder stringBuilder = new StringBuilder("Finished Retaining in ");
                        stringBuilder.append(c4787t);
                        Log.v("LoaderManager", stringBuilder.toString());
                    }
                    c4787t.f13343f = false;
                    for (int a = c4787t.f13339b.m1024a() - 1; a >= 0; a--) {
                        C4786a c4786a = (C4786a) c4787t.f13339b.m1032e(a);
                        if (c4786a.f13331i) {
                            if (C4787t.f13338a) {
                                StringBuilder stringBuilder2 = new StringBuilder("  Finished Retaining: ");
                                stringBuilder2.append(c4786a);
                                Log.v("LoaderManager", stringBuilder2.toString());
                            }
                            c4786a.f13331i = false;
                            if (!(c4786a.f13330h == c4786a.f13332j || c4786a.f13330h)) {
                                c4786a.m9110b();
                            }
                        }
                        if (c4786a.f13330h && c4786a.f13327e && !c4786a.f13333k) {
                            c4786a.m9111b(c4786a.f13326d, c4786a.f13329g);
                        }
                    }
                }
                c4787t.m9127g();
            }
        }
    }

    public void onStateNotSaved() {
        this.f20938d.m755a();
    }

    public void onStop() {
        super.onStop();
        this.f20941g = true;
        C7249g.m19184a(this.f20938d.f1422a.f13264f, C0092b.CREATED);
        this.f20937c.sendEmptyMessage(1);
        this.f20938d.f1422a.f13264f.m9085s();
    }

    public void startActivityForResult(Intent intent, int i) {
        if (!(this.b || i == -1)) {
            C6357c.m14951b(i);
        }
        super.startActivityForResult(intent, i);
    }

    public /* bridge */ /* synthetic */ void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
