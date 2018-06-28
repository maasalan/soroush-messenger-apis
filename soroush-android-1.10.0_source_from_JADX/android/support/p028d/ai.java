package android.support.p028d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.support.v4.view.C0571r;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;

class ai implements ak {
    protected C0201a f12944a;

    static class C0201a extends ViewGroup {
        static Method f818a;
        ViewGroup f819b;
        View f820c;
        ArrayList<Drawable> f821d = null;
        ai f822e;

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = android.view.ViewGroup.class;	 Catch:{ NoSuchMethodException -> 0x001c }
            r1 = "invalidateChildInParentFast";	 Catch:{ NoSuchMethodException -> 0x001c }
            r2 = 3;	 Catch:{ NoSuchMethodException -> 0x001c }
            r2 = new java.lang.Class[r2];	 Catch:{ NoSuchMethodException -> 0x001c }
            r3 = 0;	 Catch:{ NoSuchMethodException -> 0x001c }
            r4 = java.lang.Integer.TYPE;	 Catch:{ NoSuchMethodException -> 0x001c }
            r2[r3] = r4;	 Catch:{ NoSuchMethodException -> 0x001c }
            r3 = 1;	 Catch:{ NoSuchMethodException -> 0x001c }
            r4 = java.lang.Integer.TYPE;	 Catch:{ NoSuchMethodException -> 0x001c }
            r2[r3] = r4;	 Catch:{ NoSuchMethodException -> 0x001c }
            r3 = 2;	 Catch:{ NoSuchMethodException -> 0x001c }
            r4 = android.graphics.Rect.class;	 Catch:{ NoSuchMethodException -> 0x001c }
            r2[r3] = r4;	 Catch:{ NoSuchMethodException -> 0x001c }
            r0 = r0.getDeclaredMethod(r1, r2);	 Catch:{ NoSuchMethodException -> 0x001c }
            f818a = r0;	 Catch:{ NoSuchMethodException -> 0x001c }
        L_0x001c:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.d.ai.a.<clinit>():void");
        }

        C0201a(Context context, ViewGroup viewGroup, View view, ai aiVar) {
            super(context);
            this.f819b = viewGroup;
            this.f820c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f822e = aiVar;
        }

        public final void m396a(View view) {
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f819b || viewGroup.getParent() == null || !C0571r.m1329G(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f819b.getLocationOnScreen(iArr2);
                    C0571r.m1363e(view, iArr[0] - iArr2[0]);
                    C0571r.m1359d(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view, getChildCount() - 1);
        }

        public final void m397b(View view) {
            super.removeView(view);
            Object obj = (getChildCount() == 0 && (this.f821d == null || this.f821d.size() == 0)) ? 1 : null;
            if (obj != null) {
                this.f819b.removeView(this);
            }
        }

        protected final void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f819b.getLocationOnScreen(iArr);
            this.f820c.getLocationOnScreen(iArr2);
            int i = 0;
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f820c.getWidth(), this.f820c.getHeight()));
            super.dispatchDraw(canvas);
            int size = this.f821d == null ? 0 : this.f821d.size();
            while (i < size) {
                ((Drawable) this.f821d.get(i)).draw(canvas);
                i++;
            }
        }

        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f819b != null) {
                rect.offset(iArr[0], iArr[1]);
                if (this.f819b instanceof ViewGroup) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    int[] iArr2 = new int[2];
                    int[] iArr3 = new int[2];
                    int[] iArr4 = new int[2];
                    this.f819b.getLocationOnScreen(iArr3);
                    this.f820c.getLocationOnScreen(iArr4);
                    iArr2[0] = iArr4[0] - iArr3[0];
                    iArr2[1] = iArr4[1] - iArr3[1];
                    rect.offset(iArr2[0], iArr2[1]);
                    return super.invalidateChildInParent(iArr, rect);
                }
                invalidate(rect);
            }
            return null;
        }

        public final void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        protected final boolean verifyDrawable(Drawable drawable) {
            if (!super.verifyDrawable(drawable)) {
                if (this.f821d == null || !this.f821d.contains(drawable)) {
                    return false;
                }
            }
            return true;
        }
    }

    ai(Context context, ViewGroup viewGroup, View view) {
        this.f12944a = new C0201a(context, viewGroup, view, this);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.support.p028d.ai m8636c(android.view.View r5) {
        /*
        r0 = r5;
    L_0x0001:
        r1 = 0;
        if (r0 == 0) goto L_0x0023;
    L_0x0004:
        r2 = r0.getId();
        r3 = 16908290; // 0x1020002 float:2.3877235E-38 double:8.353805E-317;
        if (r2 != r3) goto L_0x0014;
    L_0x000d:
        r2 = r0 instanceof android.view.ViewGroup;
        if (r2 == 0) goto L_0x0014;
    L_0x0011:
        r0 = (android.view.ViewGroup) r0;
        goto L_0x0024;
    L_0x0014:
        r1 = r0.getParent();
        r1 = r1 instanceof android.view.ViewGroup;
        if (r1 == 0) goto L_0x0001;
    L_0x001c:
        r0 = r0.getParent();
        r0 = (android.view.ViewGroup) r0;
        goto L_0x0001;
    L_0x0023:
        r0 = r1;
    L_0x0024:
        if (r0 == 0) goto L_0x0046;
    L_0x0026:
        r1 = r0.getChildCount();
        r2 = 0;
    L_0x002b:
        if (r2 >= r1) goto L_0x003d;
    L_0x002d:
        r3 = r0.getChildAt(r2);
        r4 = r3 instanceof android.support.p028d.ai.C0201a;
        if (r4 == 0) goto L_0x003a;
    L_0x0035:
        r3 = (android.support.p028d.ai.C0201a) r3;
        r5 = r3.f822e;
        return r5;
    L_0x003a:
        r2 = r2 + 1;
        goto L_0x002b;
    L_0x003d:
        r1 = new android.support.d.ab;
        r2 = r0.getContext();
        r1.<init>(r2, r0, r5);
    L_0x0046:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.d.ai.c(android.view.View):android.support.d.ai");
    }

    public final void mo74a(Drawable drawable) {
        Callback callback = this.f12944a;
        if (callback.f821d == null) {
            callback.f821d = new ArrayList();
        }
        if (!callback.f821d.contains(drawable)) {
            callback.f821d.add(drawable);
            callback.invalidate(drawable.getBounds());
            drawable.setCallback(callback);
        }
    }

    public final void mo75b(Drawable drawable) {
        C0201a c0201a = this.f12944a;
        if (c0201a.f821d != null) {
            c0201a.f821d.remove(drawable);
            c0201a.invalidate(drawable.getBounds());
            drawable.setCallback(null);
        }
    }
}
