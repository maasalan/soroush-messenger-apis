package android.support.v4.app;

import android.os.Build.VERSION;
import android.support.v4.app.C0390k.C0388a;
import android.support.v4.app.C4783l.C0399f;
import android.support.v4.app.Fragment.C0366c;
import android.support.v4.p038g.C0467e;
import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import mobi.mmdt.ott.R;

final class C4777b extends C0401p implements C0388a, C0399f {
    static final boolean f13238a = (VERSION.SDK_INT >= 21);
    final C4783l f13239b;
    ArrayList<C0381a> f13240c = new ArrayList();
    int f13241d;
    int f13242e;
    int f13243f;
    int f13244g;
    int f13245h;
    int f13246i;
    boolean f13247j;
    boolean f13248k = true;
    String f13249l;
    boolean f13250m;
    int f13251n = -1;
    int f13252o;
    CharSequence f13253p;
    int f13254q;
    CharSequence f13255r;
    ArrayList<String> f13256s;
    ArrayList<String> f13257t;
    boolean f13258u = false;
    ArrayList<Runnable> f13259v;

    static final class C0381a {
        int f1408a;
        Fragment f1409b;
        int f1410c;
        int f1411d;
        int f1412e;
        int f1413f;

        C0381a() {
        }

        C0381a(int i, Fragment fragment) {
            this.f1408a = i;
            this.f1409b = fragment;
        }
    }

    public C4777b(C4783l c4783l) {
        this.f13239b = c4783l;
    }

    private void m8943a(int i, Fragment fragment, String str, int i2) {
        Class cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers)) {
            if (!cls.isMemberClass() || Modifier.isStatic(modifiers)) {
                StringBuilder stringBuilder;
                fragment.f13173A = this.f13239b;
                if (str != null) {
                    if (fragment.f13180H == null || str.equals(fragment.f13180H)) {
                        fragment.f13180H = str;
                    } else {
                        stringBuilder = new StringBuilder("Can't change tag of fragment ");
                        stringBuilder.append(fragment);
                        stringBuilder.append(": was ");
                        stringBuilder.append(fragment.f13180H);
                        stringBuilder.append(" now ");
                        stringBuilder.append(str);
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
                if (i != 0) {
                    if (i == -1) {
                        stringBuilder = new StringBuilder("Can't add fragment ");
                        stringBuilder.append(fragment);
                        stringBuilder.append(" with tag ");
                        stringBuilder.append(str);
                        stringBuilder.append(" to container view with no id");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    } else if (fragment.f13178F == 0 || fragment.f13178F == i) {
                        fragment.f13178F = i;
                        fragment.f13179G = i;
                    } else {
                        stringBuilder = new StringBuilder("Can't change container ID of fragment ");
                        stringBuilder.append(fragment);
                        stringBuilder.append(": was ");
                        stringBuilder.append(fragment.f13178F);
                        stringBuilder.append(" now ");
                        stringBuilder.append(i);
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
                m8955a(new C0381a(i2, fragment));
                return;
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder("Fragment ");
        stringBuilder2.append(cls.getCanonicalName());
        stringBuilder2.append(" must be a public static class to be  properly recreated from instance state.");
        throw new IllegalStateException(stringBuilder2.toString());
    }

    private int m8944b(boolean z) {
        if (this.f13250m) {
            throw new IllegalStateException("commit already called");
        }
        if (C4783l.f13284a) {
            StringBuilder stringBuilder = new StringBuilder("Commit: ");
            stringBuilder.append(this);
            Log.v("FragmentManager", stringBuilder.toString());
            PrintWriter printWriter = new PrintWriter(new C0467e("FragmentManager"));
            m8956a("  ", printWriter);
            printWriter.close();
        }
        this.f13250m = true;
        this.f13251n = this.f13247j ? this.f13239b.m9032a(this) : -1;
        this.f13239b.m9046a((C0399f) this, z);
        return this.f13251n;
    }

    static boolean m8945b(C0381a c0381a) {
        Fragment fragment = c0381a.f1409b;
        return (fragment == null || !fragment.f13208t || fragment.f13189Q == null || fragment.f13182J || fragment.f13181I || !fragment.m8873M()) ? false : true;
    }

    final Fragment m8946a(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f13240c.size()) {
            C0381a c0381a = (C0381a) this.f13240c.get(i);
            switch (c0381a.f1408a) {
                case 1:
                case 7:
                    arrayList.add(c0381a.f1409b);
                    break;
                case 2:
                    Fragment fragment3 = c0381a.f1409b;
                    int i2 = fragment3.f13179G;
                    Fragment fragment4 = fragment2;
                    int i3 = i;
                    i = 0;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment5 = (Fragment) arrayList.get(size);
                        if (fragment5.f13179G == i2) {
                            if (fragment5 == fragment3) {
                                i = 1;
                            } else {
                                if (fragment5 == fragment4) {
                                    this.f13240c.add(i3, new C0381a(9, fragment5));
                                    i3++;
                                    fragment4 = null;
                                }
                                C0381a c0381a2 = new C0381a(3, fragment5);
                                c0381a2.f1410c = c0381a.f1410c;
                                c0381a2.f1412e = c0381a.f1412e;
                                c0381a2.f1411d = c0381a.f1411d;
                                c0381a2.f1413f = c0381a.f1413f;
                                this.f13240c.add(i3, c0381a2);
                                arrayList.remove(fragment5);
                                i3++;
                            }
                        }
                    }
                    if (i != 0) {
                        this.f13240c.remove(i3);
                        i = i3 - 1;
                    } else {
                        c0381a.f1408a = 1;
                        arrayList.add(fragment3);
                        i = i3;
                    }
                    fragment2 = fragment4;
                    break;
                case 3:
                case 6:
                    arrayList.remove(c0381a.f1409b);
                    if (c0381a.f1409b != fragment2) {
                        break;
                    }
                    this.f13240c.add(i, new C0381a(9, c0381a.f1409b));
                    i++;
                    fragment2 = null;
                    break;
                case 8:
                    this.f13240c.add(i, new C0381a(9, fragment2));
                    i++;
                    fragment2 = c0381a.f1409b;
                    break;
                default:
                    break;
            }
            i++;
        }
        return fragment2;
    }

    public final C0401p mo233a() {
        this.f13245h = 4099;
        return this;
    }

    public final C0401p mo234a(int i, Fragment fragment) {
        m8943a(i, fragment, null, 1);
        return this;
    }

    public final C0401p mo235a(int i, Fragment fragment, String str) {
        m8943a(i, fragment, str, 1);
        return this;
    }

    public final C0401p mo236a(Fragment fragment) {
        m8955a(new C0381a(3, fragment));
        return this;
    }

    public final C0401p mo237a(Fragment fragment, String str) {
        m8943a(0, fragment, str, 1);
        return this;
    }

    public final C0401p mo238a(String str) {
        if (this.f13248k) {
            this.f13247j = true;
            this.f13249l = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    final void m8953a(int i) {
        if (this.f13247j) {
            if (C4783l.f13284a) {
                StringBuilder stringBuilder = new StringBuilder("Bump nesting in ");
                stringBuilder.append(this);
                stringBuilder.append(" by ");
                stringBuilder.append(i);
                Log.v("FragmentManager", stringBuilder.toString());
            }
            int size = this.f13240c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0381a c0381a = (C0381a) this.f13240c.get(i2);
                if (c0381a.f1409b != null) {
                    Fragment fragment = c0381a.f1409b;
                    fragment.f13214z += i;
                    if (C4783l.f13284a) {
                        StringBuilder stringBuilder2 = new StringBuilder("Bump nesting of ");
                        stringBuilder2.append(c0381a.f1409b);
                        stringBuilder2.append(" to ");
                        stringBuilder2.append(c0381a.f1409b.f13214z);
                        Log.v("FragmentManager", stringBuilder2.toString());
                    }
                }
            }
        }
    }

    final void m8954a(C0366c c0366c) {
        for (int i = 0; i < this.f13240c.size(); i++) {
            C0381a c0381a = (C0381a) this.f13240c.get(i);
            if (C4777b.m8945b(c0381a)) {
                c0381a.f1409b.m8884a(c0366c);
            }
        }
    }

    final void m8955a(C0381a c0381a) {
        this.f13240c.add(c0381a);
        c0381a.f1410c = this.f13241d;
        c0381a.f1411d = this.f13242e;
        c0381a.f1412e = this.f13243f;
        c0381a.f1413f = this.f13244g;
    }

    public final void m8956a(String str, PrintWriter printWriter) {
        m8957a(str, printWriter, true);
    }

    public final void m8957a(String str, PrintWriter printWriter, boolean z) {
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f13249l);
            printWriter.print(" mIndex=");
            printWriter.print(this.f13251n);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f13250m);
            if (this.f13245h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f13245h));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f13246i));
            }
            if (!(this.f13241d == 0 && this.f13242e == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f13241d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f13242e));
            }
            if (!(this.f13243f == 0 && this.f13244g == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f13243f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f13244g));
            }
            if (!(this.f13252o == 0 && this.f13253p == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f13252o));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f13253p);
            }
            if (!(this.f13254q == 0 && this.f13255r == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f13254q));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f13255r);
            }
        }
        if (!this.f13240c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("    ");
            int size = this.f13240c.size();
            for (int i = 0; i < size; i++) {
                String str2;
                C0381a c0381a = (C0381a) this.f13240c.get(i);
                switch (c0381a.f1408a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    default:
                        StringBuilder stringBuilder2 = new StringBuilder("cmd=");
                        stringBuilder2.append(c0381a.f1408a);
                        str2 = stringBuilder2.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(c0381a.f1409b);
                if (z) {
                    if (!(c0381a.f1410c == 0 && c0381a.f1411d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c0381a.f1410c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c0381a.f1411d));
                    }
                    if (c0381a.f1412e != 0 || c0381a.f1413f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c0381a.f1412e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c0381a.f1413f));
                    }
                }
            }
        }
    }

    final void m8958a(boolean z) {
        for (int size = this.f13240c.size() - 1; size >= 0; size--) {
            C0381a c0381a = (C0381a) this.f13240c.get(size);
            Fragment fragment = c0381a.f1409b;
            if (fragment != null) {
                fragment.m8878a(C4783l.m9017e(this.f13245h), this.f13246i);
            }
            int i = c0381a.f1408a;
            if (i != 1) {
                switch (i) {
                    case 3:
                        fragment.d_(c0381a.f1412e);
                        this.f13239b.m9043a(fragment, false);
                        break;
                    case 4:
                        fragment.d_(c0381a.f1412e);
                        C4783l.m9021g(fragment);
                        break;
                    case 5:
                        fragment.d_(c0381a.f1413f);
                        C4783l.m9019f(fragment);
                        break;
                    case 6:
                        fragment.d_(c0381a.f1412e);
                        this.f13239b.m9074i(fragment);
                        break;
                    case 7:
                        fragment.d_(c0381a.f1413f);
                        this.f13239b.m9072h(fragment);
                        break;
                    case 8:
                        this.f13239b.m9075j(null);
                        break;
                    case 9:
                        this.f13239b.m9075j(fragment);
                        break;
                    default:
                        StringBuilder stringBuilder = new StringBuilder("Unknown cmd: ");
                        stringBuilder.append(c0381a.f1408a);
                        throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            fragment.d_(c0381a.f1413f);
            this.f13239b.m9068e(fragment);
            if (!(this.f13258u || c0381a.f1408a == 3 || fragment == null)) {
                this.f13239b.m9062c(fragment);
            }
        }
        if (!this.f13258u && z) {
            this.f13239b.m9038a(this.f13239b.f13301l, true);
        }
    }

    final boolean m8959a(ArrayList<C4777b> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f13240c.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            C0381a c0381a = (C0381a) this.f13240c.get(i4);
            int i5 = c0381a.f1409b != null ? c0381a.f1409b.f13179G : 0;
            if (!(i5 == 0 || i5 == r3)) {
                for (i3 = i; i3 < i2; i3++) {
                    C4777b c4777b = (C4777b) arrayList.get(i3);
                    int size2 = c4777b.f13240c.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        C0381a c0381a2 = (C0381a) c4777b.f13240c.get(i6);
                        if ((c0381a2.f1409b != null ? c0381a2.f1409b.f13179G : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    public final boolean mo239a(ArrayList<C4777b> arrayList, ArrayList<Boolean> arrayList2) {
        if (C4783l.f13284a) {
            StringBuilder stringBuilder = new StringBuilder("Run: ");
            stringBuilder.append(this);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        arrayList.add(this);
        arrayList2.add(Boolean.valueOf(false));
        if (this.f13247j) {
            C4783l c4783l = this.f13239b;
            if (c4783l.f13296g == null) {
                c4783l.f13296g = new ArrayList();
            }
            c4783l.f13296g.add(this);
        }
        return true;
    }

    final Fragment m8961b(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int i = 0; i < this.f13240c.size(); i++) {
            C0381a c0381a = (C0381a) this.f13240c.get(i);
            int i2 = c0381a.f1408a;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = c0381a.f1409b;
                            break;
                        default:
                            break;
                    }
                }
                arrayList.add(c0381a.f1409b);
            }
            arrayList.remove(c0381a.f1409b);
        }
        return fragment;
    }

    public final C0401p mo240b(Fragment fragment) {
        m8955a(new C0381a(6, fragment));
        return this;
    }

    public final C0401p mo241b(Fragment fragment, String str) {
        m8943a(R.id.weather_frame_layout, fragment, str, 2);
        return this;
    }

    public final void m8964b() {
        if (this.f13259v != null) {
            int size = this.f13259v.size();
            for (int i = 0; i < size; i++) {
                ((Runnable) this.f13259v.get(i)).run();
            }
            this.f13259v = null;
        }
    }

    final boolean m8965b(int i) {
        int size = this.f13240c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0381a c0381a = (C0381a) this.f13240c.get(i2);
            int i3 = c0381a.f1409b != null ? c0381a.f1409b.f13179G : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    public final int mo242c() {
        return m8944b(false);
    }

    public final C0401p mo243c(Fragment fragment) {
        m8955a(new C0381a(7, fragment));
        return this;
    }

    public final int mo244d() {
        return m8944b(true);
    }

    public final void mo245e() {
        if (this.f13247j) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f13248k = false;
        C4783l c4783l = this.f13239b;
        if (c4783l.f13302m != null && !c4783l.f13308t) {
            c4783l.m9071h();
            if (mo239a(c4783l.f13311w, c4783l.f13312x)) {
                c4783l.f13292c = true;
                try {
                    c4783l.m9048a(c4783l.f13311w, c4783l.f13312x);
                } finally {
                    c4783l.m9073i();
                }
            }
            c4783l.m9077k();
            c4783l.m9079m();
        }
    }

    final void m8970f() {
        int size = this.f13240c.size();
        for (int i = 0; i < size; i++) {
            C0381a c0381a = (C0381a) this.f13240c.get(i);
            Fragment fragment = c0381a.f1409b;
            if (fragment != null) {
                fragment.m8878a(this.f13245h, this.f13246i);
            }
            int i2 = c0381a.f1408a;
            if (i2 != 1) {
                switch (i2) {
                    case 3:
                        fragment.d_(c0381a.f1411d);
                        this.f13239b.m9068e(fragment);
                        break;
                    case 4:
                        fragment.d_(c0381a.f1411d);
                        C4783l.m9019f(fragment);
                        break;
                    case 5:
                        fragment.d_(c0381a.f1410c);
                        C4783l.m9021g(fragment);
                        break;
                    case 6:
                        fragment.d_(c0381a.f1411d);
                        this.f13239b.m9072h(fragment);
                        break;
                    case 7:
                        fragment.d_(c0381a.f1410c);
                        this.f13239b.m9074i(fragment);
                        break;
                    case 8:
                        this.f13239b.m9075j(fragment);
                        break;
                    case 9:
                        this.f13239b.m9075j(null);
                        break;
                    default:
                        StringBuilder stringBuilder = new StringBuilder("Unknown cmd: ");
                        stringBuilder.append(c0381a.f1408a);
                        throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            fragment.d_(c0381a.f1410c);
            this.f13239b.m9043a(fragment, false);
            if (!(this.f13258u || c0381a.f1408a == 1 || fragment == null)) {
                this.f13239b.m9062c(fragment);
            }
        }
        if (!this.f13258u) {
            this.f13239b.m9038a(this.f13239b.f13301l, true);
        }
    }

    public final String mo246g() {
        return this.f13249l;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("BackStackEntry{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f13251n >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.f13251n);
        }
        if (this.f13249l != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.f13249l);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
