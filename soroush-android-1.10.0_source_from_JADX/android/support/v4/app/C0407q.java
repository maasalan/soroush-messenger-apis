package android.support.v4.app;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.app.C0415r.C04092;
import android.support.v4.app.C0415r.C04114;
import android.support.v4.app.C0415r.C04147;
import android.support.v4.app.C4777b.C0381a;
import android.support.v4.p038g.C0475h;
import android.support.v4.p038g.C4813a;
import android.support.v4.view.C0571r;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

final class C0407q {
    private static final int[] f1471a = new int[]{0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    static class C0406a {
        public Fragment f1465a;
        public boolean f1466b;
        public C4777b f1467c;
        public Fragment f1468d;
        public boolean f1469e;
        public C4777b f1470f;

        C0406a() {
        }
    }

    private static C0406a m791a(C0406a c0406a, SparseArray<C0406a> sparseArray, int i) {
        if (c0406a != null) {
            return c0406a;
        }
        c0406a = new C0406a();
        sparseArray.put(i, c0406a);
        return c0406a;
    }

    private static C4813a<String, String> m792a(int i, ArrayList<C4777b> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        C4813a<String, String> c4813a = new C4813a();
        for (i3--; i3 >= i2; i3--) {
            C4777b c4777b = (C4777b) arrayList.get(i3);
            if (c4777b.m8965b(i)) {
                boolean booleanValue = ((Boolean) arrayList2.get(i3)).booleanValue();
                if (c4777b.f13256s != null) {
                    ArrayList arrayList3;
                    ArrayList arrayList4;
                    int size = c4777b.f13256s.size();
                    if (booleanValue) {
                        arrayList3 = c4777b.f13256s;
                        arrayList4 = c4777b.f13257t;
                    } else {
                        ArrayList arrayList5 = c4777b.f13256s;
                        arrayList3 = c4777b.f13257t;
                        arrayList4 = arrayList5;
                    }
                    for (int i4 = 0; i4 < size; i4++) {
                        String str = (String) arrayList4.get(i4);
                        String str2 = (String) arrayList3.get(i4);
                        String str3 = (String) c4813a.remove(str2);
                        if (str3 != null) {
                            c4813a.put(str, str3);
                        } else {
                            c4813a.put(str, str2);
                        }
                    }
                }
            }
        }
        return c4813a;
    }

    private static Object m795a(Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        Object obj;
        TransitionSet transitionSet;
        if (z) {
            if (fragment2.f13196X != null) {
                if (fragment2.f13196X.f1357l != Fragment.f13172j) {
                    obj = fragment2.f13196X.f1357l;
                    obj = C0415r.m815a(obj);
                    if (obj != null) {
                        return null;
                    }
                    transitionSet = new TransitionSet();
                    transitionSet.addTransition((Transition) obj);
                    return transitionSet;
                }
                fragment = fragment2;
            }
            obj = null;
            obj = C0415r.m815a(obj);
            if (obj != null) {
                return null;
            }
            transitionSet = new TransitionSet();
            transitionSet.addTransition((Transition) obj);
            return transitionSet;
        }
        if (fragment.f13196X == null) {
            obj = null;
            obj = C0415r.m815a(obj);
            if (obj != null) {
                return null;
            }
            transitionSet = new TransitionSet();
            transitionSet.addTransition((Transition) obj);
            return transitionSet;
        }
        obj = fragment.f13196X.f1356k;
        obj = C0415r.m815a(obj);
        if (obj != null) {
            return null;
        }
        transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    private static Object m796a(Fragment fragment, boolean z) {
        Object obj = null;
        if (fragment == null) {
            return null;
        }
        if (!z) {
            obj = fragment.m8917x();
        } else if (fragment.f13196X != null) {
            obj = fragment.f13196X.f1355j == Fragment.f13172j ? fragment.m8918y() : fragment.f13196X.f1355j;
        }
        return C0415r.m815a(obj);
    }

    private static Object m797a(Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean booleanValue;
        Transition transition;
        Transition transition2;
        Transition transition3;
        Transition transition4;
        TransitionSet transitionSet;
        TransitionSet transitionSet2;
        if (!(obj == null || obj2 == null || fragment == null)) {
            Boolean bool;
            if (z) {
                if (fragment.f13196X != null) {
                    if (fragment.f13196X.f1358m != null) {
                        bool = fragment.f13196X.f1358m;
                    }
                }
            } else if (fragment.f13196X != null) {
                if (fragment.f13196X.f1359n != null) {
                    bool = fragment.f13196X.f1359n;
                }
            }
            booleanValue = bool.booleanValue();
            if (booleanValue) {
                transition = null;
                transition2 = (Transition) obj2;
                transition3 = (Transition) obj;
                transition4 = (Transition) obj3;
                if (transition2 == null && transition3 != null) {
                    transition = new TransitionSet().addTransition(transition2).addTransition(transition3).setOrdering(1);
                } else if (transition2 != null) {
                    transition = transition2;
                } else if (transition3 != null) {
                    transition = transition3;
                }
                if (transition4 != null) {
                    return transition;
                }
                transitionSet = new TransitionSet();
                if (transition != null) {
                    transitionSet.addTransition(transition);
                }
                transitionSet.addTransition(transition4);
                return transitionSet;
            }
            transitionSet2 = new TransitionSet();
            if (obj2 != null) {
                transitionSet2.addTransition((Transition) obj2);
            }
            if (obj != null) {
                transitionSet2.addTransition((Transition) obj);
            }
            if (obj3 != null) {
                transitionSet2.addTransition((Transition) obj3);
            }
            return transitionSet2;
        }
        booleanValue = true;
        if (booleanValue) {
            transition = null;
            transition2 = (Transition) obj2;
            transition3 = (Transition) obj;
            transition4 = (Transition) obj3;
            if (transition2 == null) {
            }
            if (transition2 != null) {
                transition = transition2;
            } else if (transition3 != null) {
                transition = transition3;
            }
            if (transition4 != null) {
                return transition;
            }
            transitionSet = new TransitionSet();
            if (transition != null) {
                transitionSet.addTransition(transition);
            }
            transitionSet.addTransition(transition4);
            return transitionSet;
        }
        transitionSet2 = new TransitionSet();
        if (obj2 != null) {
            transitionSet2.addTransition((Transition) obj2);
        }
        if (obj != null) {
            transitionSet2.addTransition((Transition) obj);
        }
        if (obj3 != null) {
            transitionSet2.addTransition((Transition) obj3);
        }
        return transitionSet2;
    }

    private static String m798a(C4813a<String, String> c4813a, String str) {
        int size = c4813a.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(c4813a.m1020c(i))) {
                return (String) c4813a.m1019b(i);
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m801a(android.support.v4.app.C4777b r11, android.support.v4.app.C4777b.C0381a r12, android.util.SparseArray<android.support.v4.app.C0407q.C0406a> r13, boolean r14, boolean r15) {
        /*
        r6 = r12.f1409b;
        if (r6 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r7 = r6.f13179G;
        if (r7 != 0) goto L_0x000a;
    L_0x0009:
        return;
    L_0x000a:
        if (r14 == 0) goto L_0x0013;
    L_0x000c:
        r0 = f1471a;
        r12 = r12.f1408a;
        r12 = r0[r12];
        goto L_0x0015;
    L_0x0013:
        r12 = r12.f1408a;
    L_0x0015:
        r0 = 0;
        r1 = 1;
        if (r12 == r1) goto L_0x0076;
    L_0x0019:
        switch(r12) {
            case 3: goto L_0x004c;
            case 4: goto L_0x0034;
            case 5: goto L_0x0021;
            case 6: goto L_0x004c;
            case 7: goto L_0x0076;
            default: goto L_0x001c;
        };
    L_0x001c:
        r12 = r0;
        r1 = r12;
        r8 = r1;
        goto L_0x0089;
    L_0x0021:
        if (r15 == 0) goto L_0x0030;
    L_0x0023:
        r12 = r6.f13198Z;
        if (r12 == 0) goto L_0x0085;
    L_0x0027:
        r12 = r6.f13181I;
        if (r12 != 0) goto L_0x0085;
    L_0x002b:
        r12 = r6.f13208t;
        if (r12 == 0) goto L_0x0085;
    L_0x002f:
        goto L_0x0083;
    L_0x0030:
        r12 = r6.f13181I;
        goto L_0x0086;
    L_0x0034:
        if (r15 == 0) goto L_0x0043;
    L_0x0036:
        r12 = r6.f13198Z;
        if (r12 == 0) goto L_0x0067;
    L_0x003a:
        r12 = r6.f13208t;
        if (r12 == 0) goto L_0x0067;
    L_0x003e:
        r12 = r6.f13181I;
        if (r12 == 0) goto L_0x0067;
    L_0x0042:
        goto L_0x0065;
    L_0x0043:
        r12 = r6.f13208t;
        if (r12 == 0) goto L_0x0067;
    L_0x0047:
        r12 = r6.f13181I;
        if (r12 != 0) goto L_0x0067;
    L_0x004b:
        goto L_0x0042;
    L_0x004c:
        if (r15 == 0) goto L_0x0069;
    L_0x004e:
        r12 = r6.f13208t;
        if (r12 != 0) goto L_0x0067;
    L_0x0052:
        r12 = r6.f13189Q;
        if (r12 == 0) goto L_0x0067;
    L_0x0056:
        r12 = r6.f13189Q;
        r12 = r12.getVisibility();
        if (r12 != 0) goto L_0x0067;
    L_0x005e:
        r12 = r6.aa;
        r2 = 0;
        r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1));
        if (r12 < 0) goto L_0x0067;
    L_0x0065:
        r12 = r1;
        goto L_0x0072;
    L_0x0067:
        r12 = r0;
        goto L_0x0072;
    L_0x0069:
        r12 = r6.f13208t;
        if (r12 == 0) goto L_0x0067;
    L_0x006d:
        r12 = r6.f13181I;
        if (r12 != 0) goto L_0x0067;
    L_0x0071:
        goto L_0x0065;
    L_0x0072:
        r8 = r12;
        r12 = r1;
        r1 = r0;
        goto L_0x0089;
    L_0x0076:
        if (r15 == 0) goto L_0x007b;
    L_0x0078:
        r12 = r6.f13197Y;
        goto L_0x0086;
    L_0x007b:
        r12 = r6.f13208t;
        if (r12 != 0) goto L_0x0085;
    L_0x007f:
        r12 = r6.f13181I;
        if (r12 != 0) goto L_0x0085;
    L_0x0083:
        r12 = r1;
        goto L_0x0086;
    L_0x0085:
        r12 = r0;
    L_0x0086:
        r8 = r0;
        r0 = r12;
        r12 = r8;
    L_0x0089:
        r2 = r13.get(r7);
        r2 = (android.support.v4.app.C0407q.C0406a) r2;
        if (r0 == 0) goto L_0x009b;
    L_0x0091:
        r2 = android.support.v4.app.C0407q.m791a(r2, r13, r7);
        r2.f1465a = r6;
        r2.f1466b = r14;
        r2.f1467c = r11;
    L_0x009b:
        r9 = r2;
        r10 = 0;
        if (r15 != 0) goto L_0x00c2;
    L_0x009f:
        if (r1 == 0) goto L_0x00c2;
    L_0x00a1:
        if (r9 == 0) goto L_0x00a9;
    L_0x00a3:
        r0 = r9.f1468d;
        if (r0 != r6) goto L_0x00a9;
    L_0x00a7:
        r9.f1468d = r10;
    L_0x00a9:
        r0 = r11.f13239b;
        r1 = r6.f13199k;
        if (r1 > 0) goto L_0x00c2;
    L_0x00af:
        r1 = r0.f13301l;
        if (r1 <= 0) goto L_0x00c2;
    L_0x00b3:
        r1 = r11.f13258u;
        if (r1 != 0) goto L_0x00c2;
    L_0x00b7:
        r0.m9066d(r6);
        r2 = 1;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r1 = r6;
        r0.m9042a(r1, r2, r3, r4, r5);
    L_0x00c2:
        if (r8 == 0) goto L_0x00d4;
    L_0x00c4:
        if (r9 == 0) goto L_0x00ca;
    L_0x00c6:
        r0 = r9.f1468d;
        if (r0 != 0) goto L_0x00d4;
    L_0x00ca:
        r9 = android.support.v4.app.C0407q.m791a(r9, r13, r7);
        r9.f1468d = r6;
        r9.f1469e = r14;
        r9.f1470f = r11;
    L_0x00d4:
        if (r15 != 0) goto L_0x00e0;
    L_0x00d6:
        if (r12 == 0) goto L_0x00e0;
    L_0x00d8:
        if (r9 == 0) goto L_0x00e0;
    L_0x00da:
        r11 = r9.f1465a;
        if (r11 != r6) goto L_0x00e0;
    L_0x00de:
        r9.f1465a = r10;
    L_0x00e0:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.q.a(android.support.v4.app.b, android.support.v4.app.b$a, android.util.SparseArray, boolean, boolean):void");
    }

    private static void m802a(C4777b c4777b, SparseArray<C0406a> sparseArray, boolean z) {
        int size = c4777b.f13240c.size();
        for (int i = 0; i < size; i++) {
            C0407q.m801a(c4777b, (C0381a) c4777b.f13240c.get(i), (SparseArray) sparseArray, false, z);
        }
    }

    static void m803a(C4783l c4783l, ArrayList<C4777b> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        C4783l c4783l2 = c4783l;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        int i3 = i2;
        boolean z2 = z;
        if (c4783l2.f13301l > 0 && VERSION.SDK_INT >= 21) {
            SparseArray sparseArray = new SparseArray();
            for (int i4 = i; i4 < i3; i4++) {
                C4777b c4777b = (C4777b) arrayList3.get(i4);
                if (((Boolean) arrayList4.get(i4)).booleanValue()) {
                    C0407q.m813b(c4777b, sparseArray, z2);
                } else {
                    C0407q.m802a(c4777b, sparseArray, z2);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(c4783l2.f13302m.f13261c);
                int size = sparseArray.size();
                int i5 = 0;
                while (i5 < size) {
                    SparseArray sparseArray2;
                    int i6;
                    int i7;
                    int i8;
                    int i9;
                    int i10;
                    ArrayList<C4777b> arrayList5;
                    ArrayList<Boolean> arrayList6;
                    int i11;
                    int keyAt = sparseArray.keyAt(i5);
                    C4813a a = C0407q.m792a(keyAt, arrayList3, arrayList4, i, i3);
                    final C0406a c0406a = (C0406a) sparseArray.valueAt(i5);
                    Fragment fragment;
                    Object b;
                    Fragment fragment2;
                    Object a2;
                    C4813a b2;
                    ArrayList b3;
                    Object a3;
                    ArrayList a4;
                    if (z2) {
                        ViewGroup viewGroup = c4783l2.f13303n.mo223a() ? (ViewGroup) c4783l2.f13303n.mo222a(keyAt) : null;
                        if (viewGroup != null) {
                            boolean z3;
                            ArrayList arrayList7;
                            C4813a c4813a;
                            final ArrayList b4;
                            Fragment fragment3 = c0406a.f1465a;
                            fragment = c0406a.f1468d;
                            boolean z4 = c0406a.f1466b;
                            boolean z5 = c0406a.f1469e;
                            arrayList4 = new ArrayList();
                            ArrayList arrayList8 = new ArrayList();
                            Object a5 = C0407q.m796a(fragment3, z4);
                            b = C0407q.m810b(fragment, z5);
                            sparseArray2 = sparseArray;
                            fragment2 = c0406a.f1465a;
                            Fragment fragment4 = c0406a.f1468d;
                            if (fragment2 != null) {
                                i6 = i5;
                                i7 = size;
                                fragment2.f13189Q.setVisibility(0);
                            } else {
                                i6 = i5;
                                i7 = size;
                            }
                            if (fragment2 != null) {
                                if (fragment4 != null) {
                                    boolean z6 = c0406a.f1466b;
                                    a2 = a.isEmpty() ? null : C0407q.m795a(fragment2, fragment4, z6);
                                    b2 = C0407q.m808b(a, a2, c0406a);
                                    z3 = z4;
                                    C4813a c = C0407q.m814c(a, a2, c0406a);
                                    if (a.isEmpty()) {
                                        if (b2 != null) {
                                            b2.clear();
                                        }
                                        if (c != null) {
                                            c.clear();
                                        }
                                        a2 = null;
                                    } else {
                                        Object obj = a2;
                                        C0407q.m807a(arrayList8, b2, a.keySet());
                                        C0407q.m807a(arrayList4, c, a.values());
                                        a2 = obj;
                                    }
                                    if (a5 == null && b == null && a2 == null) {
                                        arrayList7 = arrayList4;
                                        c4813a = a;
                                        a2 = null;
                                        b4 = C0407q.m811b(b, fragment, arrayList8, view);
                                        arrayList4 = arrayList7;
                                        b3 = C0407q.m811b(a5, fragment3, arrayList4, view);
                                        C0407q.m806a(b3, 4);
                                        a3 = C0407q.m797a(a5, b, a2, fragment3, z3);
                                        if (a3 != null) {
                                            fragment.m8899d(true);
                                            ((Transition) b).addListener(new C04092(fragment.f13189Q, b4));
                                            af.m738a(fragment.f13188P, new Runnable() {
                                                public final void run() {
                                                    C0407q.m806a(b4, 4);
                                                }
                                            });
                                            a4 = C0415r.m816a(arrayList4);
                                            C0415r.m823a(a3, a5, b3, b, b4, a2, arrayList4);
                                            C0415r.m819a(viewGroup, a3);
                                            C0415r.m818a(viewGroup, arrayList8, arrayList4, a4, c4813a);
                                            i8 = 0;
                                            C0407q.m806a(b3, 0);
                                            C0415r.m825a(a2, arrayList8, arrayList4);
                                        }
                                    } else {
                                        Rect rect;
                                        View view2;
                                        C0407q.m812b(fragment2, fragment4, z6, b2);
                                        if (a2 != null) {
                                            arrayList4.add(view);
                                            C0415r.m822a(a2, view, arrayList8);
                                            c4813a = a;
                                            arrayList7 = arrayList4;
                                            C0407q.m804a(a2, b, b2, c0406a.f1469e, c0406a.f1470f);
                                            Rect rect2 = new Rect();
                                            View b5 = C0407q.m809b(c, c0406a, a5, z6);
                                            if (b5 != null) {
                                                C0415r.m820a(a5, rect2);
                                            }
                                            rect = rect2;
                                            view2 = b5;
                                        } else {
                                            arrayList7 = arrayList4;
                                            c4813a = a;
                                            view2 = null;
                                            rect = view2;
                                        }
                                        final Fragment fragment5 = fragment2;
                                        final Fragment fragment6 = fragment4;
                                        final boolean z7 = z6;
                                        final C4813a c4813a2 = c;
                                        af.m738a(viewGroup, new Runnable() {
                                            public final void run() {
                                                C0407q.m812b(fragment5, fragment6, z7, c4813a2);
                                                if (view2 != null) {
                                                    C0415r.m817a(view2, rect);
                                                }
                                            }
                                        });
                                        if (!(a5 == null && a2 == null && b == null)) {
                                            b4 = C0407q.m811b(b, fragment, arrayList8, view);
                                            arrayList4 = arrayList7;
                                            b3 = C0407q.m811b(a5, fragment3, arrayList4, view);
                                            C0407q.m806a(b3, 4);
                                            a3 = C0407q.m797a(a5, b, a2, fragment3, z3);
                                            if (a3 != null) {
                                                if (fragment != null && b != null && fragment.f13208t && fragment.f13181I && fragment.f13198Z) {
                                                    fragment.m8899d(true);
                                                    ((Transition) b).addListener(new C04092(fragment.f13189Q, b4));
                                                    af.m738a(fragment.f13188P, /* anonymous class already generated */);
                                                }
                                                a4 = C0415r.m816a(arrayList4);
                                                C0415r.m823a(a3, a5, b3, b, b4, a2, arrayList4);
                                                C0415r.m819a(viewGroup, a3);
                                                C0415r.m818a(viewGroup, arrayList8, arrayList4, a4, c4813a);
                                                i8 = 0;
                                                C0407q.m806a(b3, 0);
                                                C0415r.m825a(a2, arrayList8, arrayList4);
                                            }
                                        }
                                    }
                                }
                            }
                            arrayList7 = arrayList4;
                            c4813a = a;
                            z3 = z4;
                            a2 = null;
                            b4 = C0407q.m811b(b, fragment, arrayList8, view);
                            arrayList4 = arrayList7;
                            b3 = C0407q.m811b(a5, fragment3, arrayList4, view);
                            C0407q.m806a(b3, 4);
                            a3 = C0407q.m797a(a5, b, a2, fragment3, z3);
                            if (a3 != null) {
                                fragment.m8899d(true);
                                ((Transition) b).addListener(new C04092(fragment.f13189Q, b4));
                                af.m738a(fragment.f13188P, /* anonymous class already generated */);
                                a4 = C0415r.m816a(arrayList4);
                                C0415r.m823a(a3, a5, b3, b, b4, a2, arrayList4);
                                C0415r.m819a(viewGroup, a3);
                                C0415r.m818a(viewGroup, arrayList8, arrayList4, a4, c4813a);
                                i8 = 0;
                                C0407q.m806a(b3, 0);
                                C0415r.m825a(a2, arrayList8, arrayList4);
                            }
                        } else {
                            sparseArray2 = sparseArray;
                            i6 = i5;
                            i7 = size;
                        }
                        i8 = 0;
                    } else {
                        C4783l c4783l3 = c4783l2;
                        sparseArray2 = sparseArray;
                        b2 = a;
                        i6 = i5;
                        i7 = size;
                        i8 = 0;
                        ViewGroup viewGroup2 = c4783l3.f13303n.mo223a() ? (ViewGroup) c4783l3.f13303n.mo222a(keyAt) : null;
                        if (viewGroup2 != null) {
                            Object a6;
                            Object obj2;
                            C0406a c0406a2;
                            ArrayList arrayList9;
                            ArrayList arrayList10;
                            Object a7;
                            final View view3;
                            final Fragment fragment7;
                            final ArrayList arrayList11;
                            ArrayList arrayList12;
                            Object obj3;
                            Fragment fragment8 = c0406a.f1465a;
                            fragment2 = c0406a.f1468d;
                            boolean z8 = c0406a.f1466b;
                            boolean z9 = c0406a.f1469e;
                            a2 = C0407q.m796a(fragment8, z8);
                            Object b6 = C0407q.m810b(fragment2, z9);
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = new ArrayList();
                            Fragment fragment9 = c0406a.f1465a;
                            fragment = c0406a.f1468d;
                            if (fragment9 != null) {
                                if (fragment != null) {
                                    z9 = c0406a.f1466b;
                                    a6 = b2.isEmpty() ? null : C0407q.m795a(fragment9, fragment, z9);
                                    C4813a b7 = C0407q.m808b(b2, a6, c0406a);
                                    if (b2.isEmpty()) {
                                        obj2 = null;
                                    } else {
                                        arrayList13.addAll(b7.values());
                                        obj2 = a6;
                                    }
                                    if (a2 == null && b6 == null && obj2 == null) {
                                        c0406a2 = c0406a;
                                        arrayList9 = arrayList14;
                                        arrayList10 = arrayList13;
                                        obj2 = b6;
                                        b = a2;
                                        a6 = null;
                                        i9 = i6;
                                        i10 = i7;
                                        if (b != null) {
                                        }
                                        b3 = C0407q.m811b(obj2, fragment2, arrayList10, view);
                                        obj2 = null;
                                        if (b != null) {
                                            ((Transition) b).addTarget(view);
                                        }
                                        a7 = C0407q.m797a(b, obj2, a6, fragment8, c0406a2.f1466b);
                                        if (a7 == null) {
                                            a4 = new ArrayList();
                                            C0415r.m823a(a7, b, a4, obj2, b3, a6, arrayList9);
                                            a3 = b;
                                            arrayList3 = a4;
                                            view3 = view;
                                            b6 = a7;
                                            fragment7 = fragment8;
                                            arrayList11 = arrayList9;
                                            arrayList14 = arrayList3;
                                            arrayList13 = b3;
                                            b = b6;
                                            b6 = obj2;
                                            af.m738a(viewGroup2, new Runnable() {
                                                public final void run() {
                                                    if (a3 != null) {
                                                        Object obj = a3;
                                                        View view = view3;
                                                        if (obj != null) {
                                                            ((Transition) obj).removeTarget(view);
                                                        }
                                                        arrayList14.addAll(C0407q.m811b(a3, fragment7, arrayList11, view3));
                                                    }
                                                    if (arrayList13 != null) {
                                                        if (b6 != null) {
                                                            ArrayList arrayList = new ArrayList();
                                                            arrayList.add(view3);
                                                            C0415r.m831b(b6, arrayList13, arrayList);
                                                        }
                                                        arrayList13.clear();
                                                        arrayList13.add(view3);
                                                    }
                                                }
                                            });
                                            arrayList12 = arrayList9;
                                            af.m738a(viewGroup2, new C04114(arrayList12, b2));
                                            C0415r.m819a(viewGroup2, b);
                                            af.m738a(viewGroup2, new C04147(arrayList12, b2));
                                        }
                                        i5 = i9 + 1;
                                        size = i10;
                                        sparseArray = sparseArray2;
                                        c4783l2 = c4783l;
                                        arrayList5 = arrayList;
                                        arrayList6 = arrayList2;
                                        i3 = i2;
                                        z2 = z;
                                    } else {
                                        boolean z10;
                                        Fragment fragment10;
                                        Rect rect3;
                                        C0407q.m812b(fragment9, fragment, z9, b7);
                                        if (obj2 != null) {
                                            Rect rect4 = new Rect();
                                            C0415r.m822a(obj2, view, arrayList13);
                                            z10 = z9;
                                            fragment10 = fragment;
                                            C0407q.m804a(obj2, b6, b7, c0406a.f1469e, c0406a.f1470f);
                                            if (a2 != null) {
                                                C0415r.m820a(a2, rect4);
                                            }
                                            rect3 = rect4;
                                        } else {
                                            z10 = z9;
                                            fragment10 = fragment;
                                            rect3 = null;
                                        }
                                        final C4813a c4813a3 = b2;
                                        final Object obj4 = obj2;
                                        c0406a2 = c0406a;
                                        Fragment fragment11 = fragment9;
                                        arrayList11 = arrayList14;
                                        arrayList9 = arrayList14;
                                        final View view4 = view;
                                        arrayList10 = arrayList13;
                                        i9 = i6;
                                        final Fragment fragment12 = fragment11;
                                        Object obj5 = obj2;
                                        obj2 = b6;
                                        final Fragment fragment13 = fragment10;
                                        obj3 = a2;
                                        i10 = i7;
                                        final boolean z11 = z10;
                                        final ArrayList arrayList15 = arrayList10;
                                        final Object obj6 = obj3;
                                        af.m738a(viewGroup2, new Runnable() {
                                            public final void run() {
                                                C4813a a = C0407q.m814c(c4813a3, obj4, c0406a);
                                                if (a != null) {
                                                    arrayList11.addAll(a.values());
                                                    arrayList11.add(view4);
                                                }
                                                C0407q.m812b(fragment12, fragment13, z11, a);
                                                if (obj4 != null) {
                                                    C0415r.m825a(obj4, arrayList15, arrayList11);
                                                    View a2 = C0407q.m809b(a, c0406a, obj6, z11);
                                                    if (a2 != null) {
                                                        C0415r.m817a(a2, rect3);
                                                    }
                                                }
                                            }
                                        });
                                        a6 = obj5;
                                        b = obj3;
                                        if (b != null && a6 == null && obj2 == null) {
                                            i5 = i9 + 1;
                                            size = i10;
                                            sparseArray = sparseArray2;
                                            c4783l2 = c4783l;
                                            arrayList5 = arrayList;
                                            arrayList6 = arrayList2;
                                            i3 = i2;
                                            z2 = z;
                                        } else {
                                            b3 = C0407q.m811b(obj2, fragment2, arrayList10, view);
                                            if (b3 == null || b3.isEmpty()) {
                                                obj2 = null;
                                            }
                                            if (b != null) {
                                                ((Transition) b).addTarget(view);
                                            }
                                            a7 = C0407q.m797a(b, obj2, a6, fragment8, c0406a2.f1466b);
                                            if (a7 == null) {
                                                a4 = new ArrayList();
                                                C0415r.m823a(a7, b, a4, obj2, b3, a6, arrayList9);
                                                a3 = b;
                                                arrayList3 = a4;
                                                view3 = view;
                                                b6 = a7;
                                                fragment7 = fragment8;
                                                arrayList11 = arrayList9;
                                                arrayList14 = arrayList3;
                                                arrayList13 = b3;
                                                b = b6;
                                                b6 = obj2;
                                                af.m738a(viewGroup2, /* anonymous class already generated */);
                                                arrayList12 = arrayList9;
                                                af.m738a(viewGroup2, new C04114(arrayList12, b2));
                                                C0415r.m819a(viewGroup2, b);
                                                af.m738a(viewGroup2, new C04147(arrayList12, b2));
                                            }
                                            i5 = i9 + 1;
                                            size = i10;
                                            sparseArray = sparseArray2;
                                            c4783l2 = c4783l;
                                            arrayList5 = arrayList;
                                            arrayList6 = arrayList2;
                                            i3 = i2;
                                            z2 = z;
                                        }
                                    }
                                }
                            }
                            i11 = 0;
                            c0406a2 = c0406a;
                            arrayList9 = arrayList14;
                            arrayList10 = arrayList13;
                            obj2 = b6;
                            obj3 = a2;
                            i9 = i6;
                            i10 = i7;
                            a6 = null;
                            b = obj3;
                            if (b != null) {
                            }
                            b3 = C0407q.m811b(obj2, fragment2, arrayList10, view);
                            obj2 = null;
                            if (b != null) {
                                ((Transition) b).addTarget(view);
                            }
                            a7 = C0407q.m797a(b, obj2, a6, fragment8, c0406a2.f1466b);
                            if (a7 == null) {
                                a4 = new ArrayList();
                                C0415r.m823a(a7, b, a4, obj2, b3, a6, arrayList9);
                                a3 = b;
                                arrayList3 = a4;
                                view3 = view;
                                b6 = a7;
                                fragment7 = fragment8;
                                arrayList11 = arrayList9;
                                arrayList14 = arrayList3;
                                arrayList13 = b3;
                                b = b6;
                                b6 = obj2;
                                af.m738a(viewGroup2, /* anonymous class already generated */);
                                arrayList12 = arrayList9;
                                af.m738a(viewGroup2, new C04114(arrayList12, b2));
                                C0415r.m819a(viewGroup2, b);
                                af.m738a(viewGroup2, new C04147(arrayList12, b2));
                            }
                            i5 = i9 + 1;
                            size = i10;
                            sparseArray = sparseArray2;
                            c4783l2 = c4783l;
                            arrayList5 = arrayList;
                            arrayList6 = arrayList2;
                            i3 = i2;
                            z2 = z;
                        }
                    }
                    i11 = i8;
                    i9 = i6;
                    i10 = i7;
                    i5 = i9 + 1;
                    size = i10;
                    sparseArray = sparseArray2;
                    c4783l2 = c4783l;
                    arrayList5 = arrayList;
                    arrayList6 = arrayList2;
                    i3 = i2;
                    z2 = z;
                }
            }
        }
    }

    private static void m804a(Object obj, Object obj2, C4813a<String, View> c4813a, boolean z, C4777b c4777b) {
        if (c4777b.f13256s != null && !c4777b.f13256s.isEmpty()) {
            View view = (View) c4813a.get((String) (z ? c4777b.f13257t : c4777b.f13256s).get(0));
            C0415r.m821a(obj, view);
            if (obj2 != null) {
                C0415r.m821a(obj2, view);
            }
        }
    }

    private static void m806a(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    private static void m807a(ArrayList<View> arrayList, C4813a<String, View> c4813a, Collection<String> collection) {
        for (int size = c4813a.size() - 1; size >= 0; size--) {
            View view = (View) c4813a.m1020c(size);
            if (collection.contains(C0571r.m1383t(view))) {
                arrayList.add(view);
            }
        }
    }

    private static C4813a<String, View> m808b(C4813a<String, String> c4813a, Object obj, C0406a c0406a) {
        if (!c4813a.isEmpty()) {
            if (obj != null) {
                ak H;
                Collection collection;
                Fragment fragment = c0406a.f1468d;
                Map c4813a2 = new C4813a();
                C0415r.m827a(c4813a2, fragment.f13189Q);
                C4777b c4777b = c0406a.f1470f;
                if (c0406a.f1469e) {
                    H = fragment.m8868H();
                    collection = c4777b.f13257t;
                } else {
                    H = fragment.m8869I();
                    collection = c4777b.f13256s;
                }
                C0475h.m990a(c4813a2, collection);
                if (H != null) {
                    for (int size = collection.size() - 1; size >= 0; size--) {
                        String str = (String) collection.get(size);
                        View view = (View) c4813a2.get(str);
                        if (view == null) {
                            c4813a.remove(str);
                        } else if (!str.equals(C0571r.m1383t(view))) {
                            c4813a.put(C0571r.m1383t(view), (String) c4813a.remove(str));
                        }
                    }
                } else {
                    C0475h.m990a((Map) c4813a, c4813a2.keySet());
                }
                return c4813a2;
            }
        }
        c4813a.clear();
        return null;
    }

    private static View m809b(C4813a<String, View> c4813a, C0406a c0406a, Object obj, boolean z) {
        C4777b c4777b = c0406a.f1467c;
        if (obj == null || c4813a == null || c4777b.f13256s == null || c4777b.f13256s.isEmpty()) {
            return null;
        }
        return (View) c4813a.get((String) (z ? c4777b.f13256s : c4777b.f13257t).get(0));
    }

    private static Object m810b(Fragment fragment, boolean z) {
        Object obj = null;
        if (fragment == null) {
            return null;
        }
        if (!z) {
            obj = fragment.m8918y();
        } else if (fragment.f13196X != null) {
            obj = fragment.f13196X.f1353h == Fragment.f13172j ? fragment.m8917x() : fragment.f13196X.f1353h;
        }
        return C0415r.m815a(obj);
    }

    private static ArrayList<View> m811b(Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        ArrayList<View> arrayList2;
        if (obj != null) {
            arrayList2 = new ArrayList();
            View view2 = fragment.f13189Q;
            if (view2 != null) {
                C0415r.m826a((ArrayList) arrayList2, view2);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                arrayList2.add(view);
                C0415r.m824a(obj, (ArrayList) arrayList2);
                return arrayList2;
            }
        }
        arrayList2 = null;
        return arrayList2;
    }

    private static void m812b(Fragment fragment, Fragment fragment2, boolean z, C4813a<String, View> c4813a) {
        if ((z ? fragment2.m8868H() : fragment.m8868H()) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            int size = c4813a == null ? 0 : c4813a.size();
            while (i < size) {
                arrayList2.add(c4813a.m1019b(i));
                arrayList.add(c4813a.m1020c(i));
                i++;
            }
        }
    }

    private static void m813b(C4777b c4777b, SparseArray<C0406a> sparseArray, boolean z) {
        if (c4777b.f13239b.f13303n.mo223a()) {
            for (int size = c4777b.f13240c.size() - 1; size >= 0; size--) {
                C0407q.m801a(c4777b, (C0381a) c4777b.f13240c.get(size), (SparseArray) sparseArray, true, z);
            }
        }
    }

    private static C4813a<String, View> m814c(C4813a<String, String> c4813a, Object obj, C0406a c0406a) {
        Fragment fragment = c0406a.f1465a;
        View view = fragment.f13189Q;
        if (!(c4813a.isEmpty() || obj == null)) {
            if (view != null) {
                ak I;
                Collection collection;
                Map c4813a2 = new C4813a();
                C0415r.m827a(c4813a2, view);
                C4777b c4777b = c0406a.f1467c;
                if (c0406a.f1466b) {
                    I = fragment.m8869I();
                    collection = c4777b.f13256s;
                } else {
                    I = fragment.m8868H();
                    collection = c4777b.f13257t;
                }
                if (collection != null) {
                    C0475h.m990a(c4813a2, collection);
                }
                int size;
                if (I != null) {
                    for (size = collection.size() - 1; size >= 0; size--) {
                        String str = (String) collection.get(size);
                        View view2 = (View) c4813a2.get(str);
                        if (view2 == null) {
                            str = C0407q.m798a((C4813a) c4813a, str);
                            if (str != null) {
                                c4813a.remove(str);
                            }
                        } else if (!str.equals(C0571r.m1383t(view2))) {
                            str = C0407q.m798a((C4813a) c4813a, str);
                            if (str != null) {
                                c4813a.put(str, C0571r.m1383t(view2));
                            }
                        }
                    }
                } else {
                    for (size = c4813a.size() - 1; size >= 0; size--) {
                        if (!c4813a2.containsKey((String) c4813a.m1020c(size))) {
                            c4813a.m1021d(size);
                        }
                    }
                }
                return c4813a2;
            }
        }
        c4813a.clear();
        return null;
    }
}
