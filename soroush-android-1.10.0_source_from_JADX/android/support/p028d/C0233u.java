package android.support.p028d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.support.v4.p038g.C0465c;
import android.support.v4.p038g.C0468f;
import android.support.v4.p038g.C4813a;
import android.support.v4.view.C0571r;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class C0233u implements Cloneable {
    private static ThreadLocal<C4813a<Animator, C0231a>> f882A = new ThreadLocal();
    private static final int[] f883i = new int[]{2, 1, 3, 4};
    private static final C0221l f884j = new C47171();
    private ViewGroup f885B = null;
    private ArrayList<Animator> f886C = new ArrayList();
    private int f887D = 0;
    private boolean f888E = false;
    private boolean f889F = false;
    private ArrayList<C0232b> f890G = null;
    private ArrayList<Animator> f891H = new ArrayList();
    private C4813a<String, String> f892I;
    long f893a = -1;
    long f894b = -1;
    ArrayList<Integer> f895c = new ArrayList();
    ArrayList<View> f896d = new ArrayList();
    C4719y f897e = null;
    boolean f898f = false;
    C0236x f899g;
    C0221l f900h = f884j;
    private String f901k = getClass().getName();
    private TimeInterpolator f902l = null;
    private ArrayList<String> f903m = null;
    private ArrayList<Class> f904n = null;
    private ArrayList<Integer> f905o = null;
    private ArrayList<View> f906p = null;
    private ArrayList<Class> f907q = null;
    private ArrayList<String> f908r = null;
    private ArrayList<Integer> f909s = null;
    private ArrayList<View> f910t = null;
    private ArrayList<Class> f911u = null;
    private aa f912v = new aa();
    private aa f913w = new aa();
    private int[] f914x = f883i;
    private ArrayList<C0237z> f915y;
    private ArrayList<C0237z> f916z;

    class C02303 extends AnimatorListenerAdapter {
        final /* synthetic */ C0233u f876a;

        C02303(C0233u c0233u) {
            this.f876a = c0233u;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f876a.m461d();
            animator.removeListener(this);
        }
    }

    private static class C0231a {
        View f877a;
        String f878b;
        C0237z f879c;
        av f880d;
        C0233u f881e;

        C0231a(View view, String str, C0233u c0233u, av avVar, C0237z c0237z) {
            this.f877a = view;
            this.f878b = str;
            this.f879c = c0237z;
            this.f880d = avVar;
            this.f881e = c0233u;
        }
    }

    public interface C0232b {
        void mo85a();

        void mo86a(C0233u c0233u);

        void mo87b();

        void mo88c();
    }

    static class C47171 extends C0221l {
        C47171() {
        }

        public final Path mo101a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    private void m434a(aa aaVar, aa aaVar2) {
        C4813a c4813a = new C4813a(aaVar.f812a);
        C4813a c4813a2 = new C4813a(aaVar2.f812a);
        int i = 0;
        for (int i2 : this.f914x) {
            int i22;
            int size;
            int i3;
            View view;
            View view2;
            C0237z c0237z;
            C0237z c0237z2;
            switch (i22) {
                case 1:
                    for (i22 = c4813a.size() - 1; i22 >= 0; i22--) {
                        View view3 = (View) c4813a.m1019b(i22);
                        if (view3 != null && m450a(view3)) {
                            C0237z c0237z3 = (C0237z) c4813a2.remove(view3);
                            if (!(c0237z3 == null || c0237z3.f923b == null || !m450a(c0237z3.f923b))) {
                                this.f915y.add((C0237z) c4813a.m1021d(i22));
                                this.f916z.add(c0237z3);
                            }
                        }
                    }
                    break;
                case 2:
                    C4813a c4813a3 = aaVar.f815d;
                    C4813a c4813a4 = aaVar2.f815d;
                    size = c4813a3.size();
                    for (i3 = 0; i3 < size; i3++) {
                        view = (View) c4813a3.m1020c(i3);
                        if (view != null && m450a(view)) {
                            view2 = (View) c4813a4.get(c4813a3.m1019b(i3));
                            if (view2 != null && m450a(view2)) {
                                c0237z = (C0237z) c4813a.get(view);
                                c0237z2 = (C0237z) c4813a2.get(view2);
                                if (!(c0237z == null || c0237z2 == null)) {
                                    this.f915y.add(c0237z);
                                    this.f916z.add(c0237z2);
                                    c4813a.remove(view);
                                    c4813a2.remove(view2);
                                }
                            }
                        }
                    }
                    break;
                case 3:
                    SparseArray sparseArray = aaVar.f813b;
                    SparseArray sparseArray2 = aaVar2.f813b;
                    size = sparseArray.size();
                    for (i3 = 0; i3 < size; i3++) {
                        view = (View) sparseArray.valueAt(i3);
                        if (view != null && m450a(view)) {
                            view2 = (View) sparseArray2.get(sparseArray.keyAt(i3));
                            if (view2 != null && m450a(view2)) {
                                c0237z = (C0237z) c4813a.get(view);
                                c0237z2 = (C0237z) c4813a2.get(view2);
                                if (!(c0237z == null || c0237z2 == null)) {
                                    this.f915y.add(c0237z);
                                    this.f916z.add(c0237z2);
                                    c4813a.remove(view);
                                    c4813a2.remove(view2);
                                }
                            }
                        }
                    }
                    break;
                case 4:
                    C0468f c0468f = aaVar.f814c;
                    C0468f c0468f2 = aaVar2.f814c;
                    size = c0468f.m987b();
                    for (i3 = 0; i3 < size; i3++) {
                        view = (View) c0468f.m988b(i3);
                        if (view != null && m450a(view)) {
                            view2 = (View) c0468f2.m984a(c0468f.m983a(i3));
                            if (view2 != null && m450a(view2)) {
                                c0237z = (C0237z) c4813a.get(view);
                                c0237z2 = (C0237z) c4813a2.get(view2);
                                if (!(c0237z == null || c0237z2 == null)) {
                                    this.f915y.add(c0237z);
                                    this.f916z.add(c0237z2);
                                    c4813a.remove(view);
                                    c4813a2.remove(view2);
                                }
                            }
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        for (int i4 = 0; i4 < c4813a.size(); i4++) {
            C0237z c0237z4 = (C0237z) c4813a.m1020c(i4);
            if (m450a(c0237z4.f923b)) {
                this.f915y.add(c0237z4);
                this.f916z.add(null);
            }
        }
        while (i < c4813a2.size()) {
            C0237z c0237z5 = (C0237z) c4813a2.m1020c(i);
            if (m450a(c0237z5.f923b)) {
                this.f916z.add(c0237z5);
                this.f915y.add(null);
            }
            i++;
        }
    }

    private static void m435a(aa aaVar, View view, C0237z c0237z) {
        aaVar.f812a.put(view, c0237z);
        int id = view.getId();
        if (id >= 0) {
            if (aaVar.f813b.indexOfKey(id) >= 0) {
                aaVar.f813b.put(id, null);
            } else {
                aaVar.f813b.put(id, view);
            }
        }
        String t = C0571r.m1383t(view);
        if (t != null) {
            if (aaVar.f815d.containsKey(t)) {
                aaVar.f815d.put(t, null);
            } else {
                aaVar.f815d.put(t, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C0468f c0468f = aaVar.f814c;
                if (c0468f.f1619b) {
                    c0468f.m985a();
                }
                if (C0465c.m976a(c0468f.f1620c, c0468f.f1622e, itemIdAtPosition) >= 0) {
                    view = (View) aaVar.f814c.m984a(itemIdAtPosition);
                    if (view != null) {
                        C0571r.m1345a(view, false);
                        aaVar.f814c.m986a(itemIdAtPosition, null);
                    }
                    return;
                }
                C0571r.m1345a(view, true);
                aaVar.f814c.m986a(itemIdAtPosition, view);
            }
        }
    }

    private static boolean m436a(C0237z c0237z, C0237z c0237z2, String str) {
        Object obj = c0237z.f922a.get(str);
        Object obj2 = c0237z2.f922a.get(str);
        return !(obj == null && obj2 == null) && (obj == null || obj2 == null || !obj.equals(obj2));
    }

    private void m437c(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            if (this.f905o != null && this.f905o.contains(Integer.valueOf(id))) {
                return;
            }
            if (this.f906p == null || !this.f906p.contains(view)) {
                int size;
                int i = 0;
                if (this.f907q != null) {
                    size = this.f907q.size();
                    int i2 = 0;
                    while (i2 < size) {
                        if (!((Class) this.f907q.get(i2)).isInstance(view)) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    C0237z c0237z = new C0237z();
                    c0237z.f923b = view;
                    if (z) {
                        mo92a(c0237z);
                    } else {
                        mo95b(c0237z);
                    }
                    c0237z.f924c.add(this);
                    mo110c(c0237z);
                    C0233u.m435a(z ? this.f912v : this.f913w, view, c0237z);
                }
                if ((view instanceof ViewGroup) && (this.f909s == null || !this.f909s.contains(Integer.valueOf(id)))) {
                    if (this.f910t == null || !this.f910t.contains(view)) {
                        if (this.f911u != null) {
                            id = this.f911u.size();
                            size = 0;
                            while (size < id) {
                                if (!((Class) this.f911u.get(size)).isInstance(view)) {
                                    size++;
                                } else {
                                    return;
                                }
                            }
                        }
                        ViewGroup viewGroup = (ViewGroup) view;
                        while (i < viewGroup.getChildCount()) {
                            m437c(viewGroup.getChildAt(i), z);
                            i++;
                        }
                    }
                }
            }
        }
    }

    private static C4813a<Animator, C0231a> m438f() {
        C4813a<Animator, C0231a> c4813a = (C4813a) f882A.get();
        if (c4813a != null) {
            return c4813a;
        }
        c4813a = new C4813a();
        f882A.set(c4813a);
        return c4813a;
    }

    public Animator mo91a(ViewGroup viewGroup, C0237z c0237z, C0237z c0237z2) {
        return null;
    }

    public C0233u mo102a(long j) {
        this.f894b = j;
        return this;
    }

    public C0233u mo103a(C0232b c0232b) {
        if (this.f890G == null) {
            this.f890G = new ArrayList();
        }
        this.f890G.add(c0232b);
        return this;
    }

    public final C0237z m442a(View view, boolean z) {
        C0233u c0233u = this;
        while (c0233u.f897e != null) {
            c0233u = c0233u.f897e;
        }
        return (C0237z) (z ? c0233u.f912v : c0233u.f913w).f812a.get(view);
    }

    String mo104a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append("@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        stringBuilder.append(": ");
        str = stringBuilder.toString();
        if (this.f894b != -1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("dur(");
            stringBuilder.append(this.f894b);
            stringBuilder.append(") ");
            str = stringBuilder.toString();
        }
        if (this.f893a != -1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("dly(");
            stringBuilder.append(this.f893a);
            stringBuilder.append(") ");
            str = stringBuilder.toString();
        }
        if (this.f902l != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("interp(");
            stringBuilder.append(this.f902l);
            stringBuilder.append(") ");
            str = stringBuilder.toString();
        }
        if (this.f895c.size() <= 0 && this.f896d.size() <= 0) {
            return str;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("tgts(");
        str = stringBuilder.toString();
        int i = 0;
        if (this.f895c.size() > 0) {
            String str2 = str;
            for (int i2 = 0; i2 < this.f895c.size(); i2++) {
                StringBuilder stringBuilder2;
                if (i2 > 0) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(str2);
                    stringBuilder2.append(", ");
                    str2 = stringBuilder2.toString();
                }
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str2);
                stringBuilder2.append(this.f895c.get(i2));
                str2 = stringBuilder2.toString();
            }
            str = str2;
        }
        if (this.f896d.size() > 0) {
            while (i < this.f896d.size()) {
                if (i > 0) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(", ");
                    str = stringBuilder.toString();
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(this.f896d.get(i));
                str = stringBuilder.toString();
                i++;
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public abstract void mo92a(C0237z c0237z);

    final void m445a(ViewGroup viewGroup) {
        this.f915y = new ArrayList();
        this.f916z = new ArrayList();
        m434a(this.f912v, this.f913w);
        C4813a f = C0233u.m438f();
        int size = f.size();
        av b = al.m405b(viewGroup);
        for (size--; size >= 0; size--) {
            Animator animator = (Animator) f.m1019b(size);
            if (animator != null) {
                C0231a c0231a = (C0231a) f.get(animator);
                if (!(c0231a == null || c0231a.f877a == null || !b.equals(c0231a.f880d))) {
                    C0237z c0237z = c0231a.f879c;
                    View view = c0231a.f877a;
                    C0237z a = m442a(view, true);
                    C0237z b2 = m454b(view, true);
                    boolean z = !(a == null && b2 == null) && c0231a.f881e.mo93a(c0237z, b2);
                    if (z) {
                        if (!animator.isRunning()) {
                            if (!animator.isStarted()) {
                                f.remove(animator);
                            }
                        }
                        animator.cancel();
                    }
                }
            }
        }
        mo105a(viewGroup, this.f912v, this.f913w, this.f915y, this.f916z);
        mo108b();
    }

    protected void mo105a(ViewGroup viewGroup, aa aaVar, aa aaVar2, ArrayList<C0237z> arrayList, ArrayList<C0237z> arrayList2) {
        C0233u c0233u = this;
        C4813a f = C0233u.m438f();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i = 0;
        while (i < size) {
            ViewGroup viewGroup2;
            int i2;
            Object obj;
            Animator a;
            View view;
            C0237z c0237z;
            Animator animator;
            C0237z c0237z2;
            Object obj2;
            C0237z c0237z3 = (C0237z) arrayList.get(i);
            C0237z c0237z4 = (C0237z) arrayList2.get(i);
            if (!(c0237z3 == null || c0237z3.f924c.contains(c0233u))) {
                c0237z3 = null;
            }
            if (!(c0237z4 == null || c0237z4.f924c.contains(c0233u))) {
                c0237z4 = null;
            }
            if (c0237z3 == null) {
                if (c0237z4 != null) {
                }
                viewGroup2 = viewGroup;
                i2 = size;
                i++;
                size = i2;
            }
            if (!(c0237z3 == null || c0237z4 == null)) {
                if (!mo93a(c0237z3, c0237z4)) {
                    obj = null;
                    if (obj != null) {
                        a = mo91a(viewGroup, c0237z3, c0237z4);
                        if (a != null) {
                            if (c0237z4 == null) {
                                view = c0237z4.f923b;
                                String[] a2 = mo94a();
                                if (view == null && a2 != null && a2.length > 0) {
                                    c0237z = new C0237z();
                                    c0237z.f923b = view;
                                    C0237z c0237z5 = (C0237z) aaVar2.f812a.get(view);
                                    if (c0237z5 != null) {
                                        animator = a;
                                        i2 = size;
                                        int i3 = 0;
                                        while (i3 < a2.length) {
                                            C0237z c0237z6 = c0237z5;
                                            c0237z.f922a.put(a2[i3], c0237z5.f922a.get(a2[i3]));
                                            i3++;
                                            c0237z5 = c0237z6;
                                            aa aaVar3 = aaVar2;
                                            ArrayList<C0237z> arrayList3 = arrayList;
                                        }
                                    } else {
                                        animator = a;
                                        i2 = size;
                                    }
                                    int size2 = f.size();
                                    for (int i4 = 0; i4 < size2; i4++) {
                                        C0231a c0231a = (C0231a) f.get((Animator) f.m1019b(i4));
                                        if (c0231a.f879c != null && c0231a.f877a == view && c0231a.f878b.equals(c0233u.f901k) && c0231a.f879c.equals(c0237z)) {
                                            c0237z2 = c0237z;
                                            obj2 = null;
                                            break;
                                        }
                                    }
                                } else {
                                    animator = a;
                                    i2 = size;
                                    c0237z = null;
                                }
                                c0237z2 = c0237z;
                                obj2 = animator;
                            } else {
                                animator = a;
                                i2 = size;
                                view = c0237z3.f923b;
                                obj2 = animator;
                                c0237z2 = null;
                            }
                            if (obj2 == null) {
                                if (c0233u.f899g != null) {
                                    long a3 = c0233u.f899g.m467a();
                                    sparseIntArray.put(c0233u.f891H.size(), (int) a3);
                                    j = Math.min(a3, j);
                                }
                                long j2 = j;
                                f.put(obj2, new C0231a(view, c0233u.f901k, c0233u, al.m405b(viewGroup), c0237z2));
                                c0233u.f891H.add(obj2);
                                j = j2;
                            }
                            i++;
                            size = i2;
                        }
                        i2 = size;
                        i++;
                        size = i2;
                    }
                    viewGroup2 = viewGroup;
                    i2 = size;
                    i++;
                    size = i2;
                }
            }
            obj = 1;
            if (obj != null) {
                a = mo91a(viewGroup, c0237z3, c0237z4);
                if (a != null) {
                    if (c0237z4 == null) {
                        animator = a;
                        i2 = size;
                        view = c0237z3.f923b;
                        obj2 = animator;
                        c0237z2 = null;
                    } else {
                        view = c0237z4.f923b;
                        String[] a22 = mo94a();
                        if (view == null) {
                        }
                        animator = a;
                        i2 = size;
                        c0237z = null;
                        c0237z2 = c0237z;
                        obj2 = animator;
                    }
                    if (obj2 == null) {
                        if (c0233u.f899g != null) {
                            long a32 = c0233u.f899g.m467a();
                            sparseIntArray.put(c0233u.f891H.size(), (int) a32);
                            j = Math.min(a32, j);
                        }
                        long j22 = j;
                        f.put(obj2, new C0231a(view, c0233u.f901k, c0233u, al.m405b(viewGroup), c0237z2));
                        c0233u.f891H.add(obj2);
                        j = j22;
                    }
                    i++;
                    size = i2;
                }
                i2 = size;
                i++;
                size = i2;
            }
            viewGroup2 = viewGroup;
            i2 = size;
            i++;
            size = i2;
        }
        if (j != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator2 = (Animator) c0233u.f891H.get(sparseIntArray.keyAt(i5));
                animator2.setStartDelay((((long) sparseIntArray.valueAt(i5)) - j) + animator2.getStartDelay());
            }
        }
    }

    final void m447a(ViewGroup viewGroup, boolean z) {
        m448a(z);
        int i = 0;
        if ((this.f895c.size() > 0 || this.f896d.size() > 0) && (this.f903m == null || this.f903m.isEmpty())) {
            int i2;
            int i3;
            View view;
            if (this.f904n != null) {
                if (this.f904n.isEmpty()) {
                }
            }
            for (i2 = 0; i2 < this.f895c.size(); i2++) {
                View findViewById = viewGroup.findViewById(((Integer) this.f895c.get(i2)).intValue());
                if (findViewById != null) {
                    C0237z c0237z = new C0237z();
                    c0237z.f923b = findViewById;
                    if (z) {
                        mo92a(c0237z);
                    } else {
                        mo95b(c0237z);
                    }
                    c0237z.f924c.add(this);
                    mo110c(c0237z);
                    C0233u.m435a(z ? this.f912v : this.f913w, findViewById, c0237z);
                }
            }
            for (i3 = 0; i3 < this.f896d.size(); i3++) {
                view = (View) this.f896d.get(i3);
                C0237z c0237z2 = new C0237z();
                c0237z2.f923b = view;
                if (z) {
                    mo92a(c0237z2);
                } else {
                    mo95b(c0237z2);
                }
                c0237z2.f924c.add(this);
                mo110c(c0237z2);
                C0233u.m435a(z ? this.f912v : this.f913w, view, c0237z2);
            }
            if (!z && this.f892I != null) {
                i3 = this.f892I.size();
                ArrayList arrayList = new ArrayList(i3);
                for (i2 = 0; i2 < i3; i2++) {
                    arrayList.add(this.f912v.f815d.remove((String) this.f892I.m1019b(i2)));
                }
                while (i < i3) {
                    view = (View) arrayList.get(i);
                    if (view != null) {
                        this.f912v.f815d.put((String) this.f892I.m1020c(i), view);
                    }
                    i++;
                }
                return;
            }
        }
        m437c(viewGroup, z);
        if (!z) {
        }
    }

    final void m448a(boolean z) {
        aa aaVar;
        if (z) {
            this.f912v.f812a.clear();
            this.f912v.f813b.clear();
            aaVar = this.f912v;
        } else {
            this.f913w.f812a.clear();
            this.f913w.f813b.clear();
            aaVar = this.f913w;
        }
        aaVar.f814c.m989c();
    }

    public boolean mo93a(C0237z c0237z, C0237z c0237z2) {
        if (!(c0237z == null || c0237z2 == null)) {
            String[] a = mo94a();
            if (a != null) {
                for (String a2 : a) {
                    if (C0233u.m436a(c0237z, c0237z2, a2)) {
                        return true;
                    }
                }
            } else {
                for (String a3 : c0237z.f922a.keySet()) {
                    if (C0233u.m436a(c0237z, c0237z2, a3)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final boolean m450a(android.view.View r6) {
        /*
        r5 = this;
        r0 = r6.getId();
        r1 = r5.f905o;
        r2 = 0;
        if (r1 == 0) goto L_0x0016;
    L_0x0009:
        r1 = r5.f905o;
        r3 = java.lang.Integer.valueOf(r0);
        r1 = r1.contains(r3);
        if (r1 == 0) goto L_0x0016;
    L_0x0015:
        return r2;
    L_0x0016:
        r1 = r5.f906p;
        if (r1 == 0) goto L_0x0023;
    L_0x001a:
        r1 = r5.f906p;
        r1 = r1.contains(r6);
        if (r1 == 0) goto L_0x0023;
    L_0x0022:
        return r2;
    L_0x0023:
        r1 = r5.f907q;
        if (r1 == 0) goto L_0x0042;
    L_0x0027:
        r1 = r5.f907q;
        r1 = r1.size();
        r3 = r2;
    L_0x002e:
        if (r3 >= r1) goto L_0x0042;
    L_0x0030:
        r4 = r5.f907q;
        r4 = r4.get(r3);
        r4 = (java.lang.Class) r4;
        r4 = r4.isInstance(r6);
        if (r4 == 0) goto L_0x003f;
    L_0x003e:
        return r2;
    L_0x003f:
        r3 = r3 + 1;
        goto L_0x002e;
    L_0x0042:
        r1 = r5.f908r;
        if (r1 == 0) goto L_0x0059;
    L_0x0046:
        r1 = android.support.v4.view.C0571r.m1383t(r6);
        if (r1 == 0) goto L_0x0059;
    L_0x004c:
        r1 = r5.f908r;
        r3 = android.support.v4.view.C0571r.m1383t(r6);
        r1 = r1.contains(r3);
        if (r1 == 0) goto L_0x0059;
    L_0x0058:
        return r2;
    L_0x0059:
        r1 = r5.f895c;
        r1 = r1.size();
        r3 = 1;
        if (r1 != 0) goto L_0x0083;
    L_0x0062:
        r1 = r5.f896d;
        r1 = r1.size();
        if (r1 != 0) goto L_0x0083;
    L_0x006a:
        r1 = r5.f904n;
        if (r1 == 0) goto L_0x0076;
    L_0x006e:
        r1 = r5.f904n;
        r1 = r1.isEmpty();
        if (r1 == 0) goto L_0x0083;
    L_0x0076:
        r1 = r5.f903m;
        if (r1 == 0) goto L_0x0082;
    L_0x007a:
        r1 = r5.f903m;
        r1 = r1.isEmpty();
        if (r1 == 0) goto L_0x0083;
    L_0x0082:
        return r3;
    L_0x0083:
        r1 = r5.f895c;
        r0 = java.lang.Integer.valueOf(r0);
        r0 = r1.contains(r0);
        if (r0 != 0) goto L_0x00c9;
    L_0x008f:
        r0 = r5.f896d;
        r0 = r0.contains(r6);
        if (r0 == 0) goto L_0x0098;
    L_0x0097:
        return r3;
    L_0x0098:
        r0 = r5.f903m;
        if (r0 == 0) goto L_0x00a9;
    L_0x009c:
        r0 = r5.f903m;
        r1 = android.support.v4.view.C0571r.m1383t(r6);
        r0 = r0.contains(r1);
        if (r0 == 0) goto L_0x00a9;
    L_0x00a8:
        return r3;
    L_0x00a9:
        r0 = r5.f904n;
        if (r0 == 0) goto L_0x00c8;
    L_0x00ad:
        r0 = r2;
    L_0x00ae:
        r1 = r5.f904n;
        r1 = r1.size();
        if (r0 >= r1) goto L_0x00c8;
    L_0x00b6:
        r1 = r5.f904n;
        r1 = r1.get(r0);
        r1 = (java.lang.Class) r1;
        r1 = r1.isInstance(r6);
        if (r1 == 0) goto L_0x00c5;
    L_0x00c4:
        return r3;
    L_0x00c5:
        r0 = r0 + 1;
        goto L_0x00ae;
    L_0x00c8:
        return r2;
    L_0x00c9:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.d.u.a(android.view.View):boolean");
    }

    public String[] mo94a() {
        return null;
    }

    public C0233u mo106b(long j) {
        this.f893a = j;
        return this;
    }

    public C0233u mo107b(C0232b c0232b) {
        if (this.f890G == null) {
            return this;
        }
        this.f890G.remove(c0232b);
        if (this.f890G.size() == 0) {
            this.f890G = null;
        }
        return this;
    }

    final C0237z m454b(View view, boolean z) {
        C0233u c0233u = this;
        while (c0233u.f897e != null) {
            c0233u = c0233u.f897e;
        }
        ArrayList arrayList = z ? c0233u.f915y : c0233u.f916z;
        C0237z c0237z = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            C0237z c0237z2 = (C0237z) arrayList.get(i2);
            if (c0237z2 == null) {
                return null;
            }
            if (c0237z2.f923b == view) {
                i = i2;
                break;
            }
        }
        if (i >= 0) {
            c0237z = (C0237z) (z ? c0233u.f916z : c0233u.f915y).get(i);
        }
        return c0237z;
    }

    protected void mo108b() {
        m458c();
        final C4813a f = C0233u.m438f();
        Iterator it = this.f891H.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (f.containsKey(animator)) {
                m458c();
                if (animator != null) {
                    animator.addListener(new AnimatorListenerAdapter(this) {
                        final /* synthetic */ C0233u f875b;

                        public final void onAnimationEnd(Animator animator) {
                            f.remove(animator);
                            this.f875b.f886C.remove(animator);
                        }

                        public final void onAnimationStart(Animator animator) {
                            this.f875b.f886C.add(animator);
                        }
                    });
                    if (animator == null) {
                        m461d();
                    } else {
                        if (this.f894b >= 0) {
                            animator.setDuration(this.f894b);
                        }
                        if (this.f893a >= 0) {
                            animator.setStartDelay(this.f893a);
                        }
                        if (this.f902l != null) {
                            animator.setInterpolator(this.f902l);
                        }
                        animator.addListener(new C02303(this));
                        animator.start();
                    }
                }
            }
        }
        this.f891H.clear();
        m461d();
    }

    public abstract void mo95b(C0237z c0237z);

    public void mo109b(View view) {
        if (!this.f889F) {
            C4813a f = C0233u.m438f();
            int size = f.size();
            av b = al.m405b(view);
            for (size--; size >= 0; size--) {
                C0231a c0231a = (C0231a) f.m1020c(size);
                if (c0231a.f877a != null && b.equals(c0231a.f880d)) {
                    C0199a.m389a((Animator) f.m1019b(size));
                }
            }
            if (this.f890G != null && this.f890G.size() > 0) {
                ArrayList arrayList = (ArrayList) this.f890G.clone();
                int size2 = arrayList.size();
                for (size = 0; size < size2; size++) {
                    ((C0232b) arrayList.get(size)).mo85a();
                }
            }
            this.f888E = true;
        }
    }

    protected final void m458c() {
        if (this.f887D == 0) {
            if (this.f890G != null && this.f890G.size() > 0) {
                ArrayList arrayList = (ArrayList) this.f890G.clone();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((C0232b) arrayList.get(i)).mo88c();
                }
            }
            this.f889F = false;
        }
        this.f887D++;
    }

    void mo110c(C0237z c0237z) {
        if (!(this.f899g == null || c0237z.f922a.isEmpty())) {
            String[] b = this.f899g.m468b();
            if (b != null) {
                int i = 0;
                while (i < b.length && c0237z.f922a.containsKey(b[i])) {
                    i++;
                }
            }
        }
    }

    public void mo111c(View view) {
        if (this.f888E) {
            if (!this.f889F) {
                C4813a f = C0233u.m438f();
                int size = f.size();
                av b = al.m405b(view);
                for (size--; size >= 0; size--) {
                    C0231a c0231a = (C0231a) f.m1020c(size);
                    if (c0231a.f877a != null && b.equals(c0231a.f880d)) {
                        C0199a.m391b((Animator) f.m1019b(size));
                    }
                }
                if (this.f890G != null && this.f890G.size() > 0) {
                    ArrayList arrayList = (ArrayList) this.f890G.clone();
                    int size2 = arrayList.size();
                    for (size = 0; size < size2; size++) {
                        ((C0232b) arrayList.get(size)).mo87b();
                    }
                }
            }
            this.f888E = false;
        }
    }

    public /* synthetic */ Object clone() {
        return mo113e();
    }

    protected final void m461d() {
        this.f887D--;
        if (this.f887D == 0) {
            int i;
            View view;
            if (this.f890G != null && this.f890G.size() > 0) {
                ArrayList arrayList = (ArrayList) this.f890G.clone();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C0232b) arrayList.get(i2)).mo86a(this);
                }
            }
            for (i = 0; i < this.f912v.f814c.m987b(); i++) {
                view = (View) this.f912v.f814c.m988b(i);
                if (view != null) {
                    C0571r.m1345a(view, false);
                }
            }
            for (i = 0; i < this.f913w.f814c.m987b(); i++) {
                view = (View) this.f913w.f814c.m988b(i);
                if (view != null) {
                    C0571r.m1345a(view, false);
                }
            }
            this.f889F = true;
        }
    }

    public android.support.p028d.C0233u mo113e() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r3 = this;
        r0 = 0;
        r1 = super.clone();	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r1 = (android.support.p028d.C0233u) r1;	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r2 = new java.util.ArrayList;	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r2.<init>();	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r1.f891H = r2;	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r2 = new android.support.d.aa;	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r2.<init>();	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r1.f912v = r2;	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r2 = new android.support.d.aa;	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r2.<init>();	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r1.f913w = r2;	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r1.f915y = r0;	 Catch:{ CloneNotSupportedException -> 0x0021 }
        r1.f916z = r0;	 Catch:{ CloneNotSupportedException -> 0x0021 }
        return r1;
    L_0x0021:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.d.u.e():android.support.d.u");
    }

    public String toString() {
        return mo104a("");
    }
}
