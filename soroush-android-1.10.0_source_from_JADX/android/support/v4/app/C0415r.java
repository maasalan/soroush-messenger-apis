package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;
import android.transition.Transition.TransitionListener;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

final class C0415r {

    static class C04092 implements TransitionListener {
        final /* synthetic */ View f1473a;
        final /* synthetic */ ArrayList f1474b;

        C04092(View view, ArrayList arrayList) {
            this.f1473a = view;
            this.f1474b = arrayList;
        }

        public final void onTransitionCancel(Transition transition) {
        }

        public final void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f1473a.setVisibility(8);
            int size = this.f1474b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f1474b.get(i)).setVisibility(0);
            }
        }

        public final void onTransitionPause(Transition transition) {
        }

        public final void onTransitionResume(Transition transition) {
        }

        public final void onTransitionStart(Transition transition) {
        }
    }

    static class C04114 implements Runnable {
        final /* synthetic */ ArrayList f1480a;
        final /* synthetic */ Map f1481b;

        C04114(ArrayList arrayList, Map map) {
            this.f1480a = arrayList;
            this.f1481b = map;
        }

        public final void run() {
            int size = this.f1480a.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f1480a.get(i);
                String transitionName = view.getTransitionName();
                if (transitionName != null) {
                    for (Entry entry : this.f1481b.entrySet()) {
                        if (transitionName.equals(entry.getValue())) {
                            transitionName = (String) entry.getKey();
                            break;
                        }
                    }
                    transitionName = null;
                    view.setTransitionName(transitionName);
                }
            }
        }
    }

    static class C04147 implements Runnable {
        final /* synthetic */ ArrayList f1489a;
        final /* synthetic */ Map f1490b;

        C04147(ArrayList arrayList, Map map) {
            this.f1489a = arrayList;
            this.f1490b = map;
        }

        public final void run() {
            int size = this.f1489a.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f1489a.get(i);
                view.setTransitionName((String) this.f1490b.get(view.getTransitionName()));
            }
        }
    }

    public static Object m815a(Object obj) {
        return obj != null ? ((Transition) obj).clone() : null;
    }

    public static ArrayList<String> m816a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
            arrayList2.add(view.getTransitionName());
            view.setTransitionName(null);
        }
        return arrayList2;
    }

    public static void m817a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    public static void m818a(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        final int size = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = (View) arrayList.get(i);
            String transitionName = view2.getTransitionName();
            arrayList4.add(transitionName);
            if (transitionName != null) {
                view2.setTransitionName(null);
                String str = (String) map.get(transitionName);
                for (int i2 = 0; i2 < size; i2++) {
                    if (str.equals(arrayList3.get(i2))) {
                        ((View) arrayList2.get(i2)).setTransitionName(transitionName);
                        break;
                    }
                }
            }
        }
        final ArrayList<View> arrayList5 = arrayList2;
        final ArrayList<String> arrayList6 = arrayList3;
        final ArrayList<View> arrayList7 = arrayList;
        af.m738a(view, new Runnable() {
            public final void run() {
                for (int i = 0; i < size; i++) {
                    ((View) arrayList5.get(i)).setTransitionName((String) arrayList6.get(i));
                    ((View) arrayList7.get(i)).setTransitionName((String) arrayList4.get(i));
                }
            }
        });
    }

    public static void m819a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    public static void m820a(Object obj, final Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new EpicenterCallback() {
                public final Rect onGetEpicenter(Transition transition) {
                    if (rect != null) {
                        if (!rect.isEmpty()) {
                            return rect;
                        }
                    }
                    return null;
                }
            });
        }
    }

    public static void m821a(Object obj, View view) {
        if (view != null) {
            Transition transition = (Transition) obj;
            final Rect rect = new Rect();
            C0415r.m817a(view, rect);
            transition.setEpicenterCallback(new EpicenterCallback() {
                public final Rect onGetEpicenter(Transition transition) {
                    return rect;
                }
            });
        }
    }

    public static void m822a(Object obj, View view, ArrayList<View> arrayList) {
        obj = (TransitionSet) obj;
        List targets = obj.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) arrayList.get(i);
            int size2 = targets.size();
            if (!C0415r.m830a(targets, view2, size2)) {
                targets.add(view2);
                for (int i2 = size2; i2 < targets.size(); i2++) {
                    View view3 = (View) targets.get(i2);
                    if (view3 instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view3;
                        int childCount = viewGroup.getChildCount();
                        for (int i3 = 0; i3 < childCount; i3++) {
                            View childAt = viewGroup.getChildAt(i3);
                            if (!C0415r.m830a(targets, childAt, size2)) {
                                targets.add(childAt);
                            }
                        }
                    }
                }
            }
        }
        targets.add(view);
        arrayList.add(view);
        C0415r.m824a(obj, (ArrayList) arrayList);
    }

    public static void m823a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        final Object obj5 = obj2;
        final ArrayList<View> arrayList4 = arrayList;
        final Object obj6 = obj3;
        final ArrayList<View> arrayList5 = arrayList2;
        final Object obj7 = obj4;
        final ArrayList<View> arrayList6 = arrayList3;
        ((Transition) obj).addListener(new TransitionListener() {
            public final void onTransitionCancel(Transition transition) {
            }

            public final void onTransitionEnd(Transition transition) {
            }

            public final void onTransitionPause(Transition transition) {
            }

            public final void onTransitionResume(Transition transition) {
            }

            public final void onTransitionStart(Transition transition) {
                if (obj5 != null) {
                    C0415r.m831b(obj5, arrayList4, null);
                }
                if (obj6 != null) {
                    C0415r.m831b(obj6, arrayList5, null);
                }
                if (obj7 != null) {
                    C0415r.m831b(obj7, arrayList6, null);
                }
            }
        });
    }

    public static void m824a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            int transitionCount;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    C0415r.m824a(transitionSet.getTransitionAt(i), (ArrayList) arrayList);
                    i++;
                }
                return;
            }
            if (!C0415r.m828a(transition) && C0415r.m829a(transition.getTargets())) {
                transitionCount = arrayList.size();
                while (i < transitionCount) {
                    transition.addTarget((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    public static void m825a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            C0415r.m831b(transitionSet, arrayList, arrayList2);
        }
    }

    public static void m826a(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup.isTransitionGroup()) {
                    arrayList.add(viewGroup);
                    return;
                }
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    C0415r.m826a((ArrayList) arrayList, viewGroup.getChildAt(i));
                }
                return;
            }
            arrayList.add(view);
        }
    }

    public static void m827a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String transitionName = view.getTransitionName();
            if (transitionName != null) {
                map.put(transitionName, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    C0415r.m827a((Map) map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    private static boolean m828a(Transition transition) {
        if (C0415r.m829a(transition.getTargetIds()) && C0415r.m829a(transition.getTargetNames())) {
            if (C0415r.m829a(transition.getTargetTypes())) {
                return false;
            }
        }
        return true;
    }

    private static boolean m829a(List list) {
        if (list != null) {
            if (!list.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    private static boolean m830a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    public static void m831b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        Transition transition = (Transition) obj;
        int i = 0;
        int transitionCount;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                C0415r.m831b(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (!C0415r.m828a(transition)) {
            List targets = transition.getTargets();
            if (targets != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
                transitionCount = arrayList2 == null ? 0 : arrayList2.size();
                while (i < transitionCount) {
                    transition.addTarget((View) arrayList2.get(i));
                    i++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    transition.removeTarget((View) arrayList.get(size));
                }
            }
        }
    }
}
