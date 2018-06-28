package android.support.p028d;

import android.support.p028d.C0226r.C0225a;
import android.support.v4.p038g.C4813a;
import android.support.v4.view.C0571r;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public final class C0235w {
    private static C0233u f919a = new C6339e();
    private static ThreadLocal<WeakReference<C4813a<ViewGroup, ArrayList<C0233u>>>> f920b = new ThreadLocal();
    private static ArrayList<ViewGroup> f921c = new ArrayList();

    private static class C0234a implements OnAttachStateChangeListener, OnPreDrawListener {
        C0233u f917a;
        ViewGroup f918b;

        C0234a(C0233u c0233u, ViewGroup viewGroup) {
            this.f917a = c0233u;
            this.f918b = viewGroup;
        }

        private void m463a() {
            this.f918b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f918b.removeOnAttachStateChangeListener(this);
        }

        public final boolean onPreDraw() {
            m463a();
            if (!C0235w.f921c.remove(this.f918b)) {
                return true;
            }
            final C4813a a = C0235w.m464a();
            ArrayList arrayList = (ArrayList) a.get(this.f918b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                a.put(this.f918b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f917a);
            this.f917a.mo103a(new C4718v(this) {
                final /* synthetic */ C0234a f17334b;

                public final void mo86a(C0233u c0233u) {
                    ((ArrayList) a.get(this.f17334b.f918b)).remove(c0233u);
                }
            });
            this.f917a.m447a(this.f918b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C0233u) it.next()).mo111c(this.f918b);
                }
            }
            this.f917a.m445a(this.f918b);
            return true;
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            m463a();
            C0235w.f921c.remove(this.f918b);
            ArrayList arrayList = (ArrayList) C0235w.m464a().get(this.f918b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C0233u) it.next()).mo111c(this.f918b);
                }
            }
            this.f917a.m448a(true);
        }
    }

    static C4813a<ViewGroup, ArrayList<C0233u>> m464a() {
        WeakReference weakReference = (WeakReference) f920b.get();
        if (weakReference == null || weakReference.get() == null) {
            WeakReference weakReference2 = new WeakReference(new C4813a());
            f920b.set(weakReference2);
            weakReference = weakReference2;
        }
        return (C4813a) weakReference.get();
    }

    public static void m465a(ViewGroup viewGroup, C0233u c0233u) {
        if (!f921c.contains(viewGroup) && C0571r.m1326D(viewGroup)) {
            f921c.add(viewGroup);
            if (c0233u == null) {
                c0233u = f919a;
            }
            c0233u = c0233u.mo113e();
            ArrayList arrayList = (ArrayList) C0235w.m464a().get(viewGroup);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C0233u) it.next()).mo109b((View) viewGroup);
                }
            }
            if (c0233u != null) {
                c0233u.m447a(viewGroup, true);
            }
            C0228t a = C0228t.m428a(viewGroup);
            if (!(a == null || C0228t.m428a(a.f872a) != a || a.f873b == null)) {
                a.f873b.run();
            }
            viewGroup.setTag(C0225a.transition_current_scene, null);
            if (c0233u != null && viewGroup != null) {
                Object c0234a = new C0234a(c0233u, viewGroup);
                viewGroup.addOnAttachStateChangeListener(c0234a);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(c0234a);
            }
        }
    }
}
