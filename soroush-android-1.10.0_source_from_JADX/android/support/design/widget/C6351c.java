package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.design.C0249a.C0239b;
import android.support.design.C0249a.C0243f;
import android.support.design.C0249a.C0245h;
import android.support.design.C0249a.C0247j;
import android.support.design.widget.BottomSheetBehavior.C0265a;
import android.support.v4.view.C0547a;
import android.support.v4.view.C0571r;
import android.support.v4.view.p039a.C0536b;
import android.support.v7.app.C4870k;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;

public final class C6351c extends C4870k {
    boolean f17375a;
    boolean f17376b;
    boolean f17377c;
    private BottomSheetBehavior<FrameLayout> f17378d;
    private C0265a f17379e;

    class C03071 implements OnClickListener {
        final /* synthetic */ C6351c f1152a;

        C03071(C6351c c6351c) {
            this.f1152a = c6351c;
        }

        public final void onClick(View view) {
            if (this.f1152a.f17375a && this.f1152a.isShowing()) {
                C6351c c6351c = this.f1152a;
                if (!c6351c.f17377c) {
                    if (VERSION.SDK_INT < 11) {
                        c6351c.f17376b = true;
                    } else {
                        TypedArray obtainStyledAttributes = c6351c.getContext().obtainStyledAttributes(new int[]{16843611});
                        c6351c.f17376b = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    }
                    c6351c.f17377c = true;
                }
                if (c6351c.f17376b) {
                    this.f1152a.cancel();
                }
            }
        }
    }

    class C03083 implements OnTouchListener {
        final /* synthetic */ C6351c f1153a;

        C03083(C6351c c6351c) {
            this.f1153a = c6351c;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    class C47502 extends C0547a {
        final /* synthetic */ C6351c f13127a;

        C47502(C6351c c6351c) {
            this.f13127a = c6351c;
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C0536b c0536b) {
            boolean z;
            super.onInitializeAccessibilityNodeInfo(view, c0536b);
            if (this.f13127a.f17375a) {
                c0536b.m1192a(1048576);
                z = true;
            } else {
                z = false;
            }
            c0536b.m1203e(z);
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i != 1048576 || !this.f13127a.f17375a) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            this.f13127a.cancel();
            return true;
        }
    }

    class C47514 extends C0265a {
        final /* synthetic */ C6351c f13128a;

        C47514(C6351c c6351c) {
            this.f13128a = c6351c;
        }

        public final void mo187a(int i) {
            if (i == 5) {
                this.f13128a.cancel();
            }
        }
    }

    public C6351c(Context context) {
        this(context, 0);
    }

    public C6351c(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = context.getTheme().resolveAttribute(C0239b.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : C0247j.Theme_Design_Light_BottomSheetDialog;
        }
        super(context, i);
        this.f17375a = true;
        this.f17376b = true;
        this.f17379e = new C47514(this);
        m9371a();
    }

    private View m14923a(int i, View view, LayoutParams layoutParams) {
        FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C0245h.design_bottom_sheet_dialog, null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) frameLayout.findViewById(C0243f.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        View view2 = (FrameLayout) coordinatorLayout.findViewById(C0243f.design_bottom_sheet);
        this.f17378d = BottomSheetBehavior.m8727b(view2);
        this.f17378d.f13054i = this.f17379e;
        this.f17378d.f13048c = this.f17375a;
        if (layoutParams == null) {
            view2.addView(view);
        } else {
            view2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C0243f.touch_outside).setOnClickListener(new C03071(this));
        C0571r.m1340a(view2, new C47502(this));
        view2.setOnTouchListener(new C03083(this));
        return frameLayout;
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    protected final void onStart() {
        super.onStart();
        if (this.f17378d != null) {
            this.f17378d.m8743c(4);
        }
    }

    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f17375a != z) {
            this.f17375a = z;
            if (this.f17378d != null) {
                this.f17378d.f13048c = z;
            }
        }
    }

    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f17375a) {
            this.f17375a = true;
        }
        this.f17376b = z;
        this.f17377c = true;
    }

    public final void setContentView(int i) {
        super.setContentView(m14923a(i, null, null));
    }

    public final void setContentView(View view) {
        super.setContentView(m14923a(0, view, null));
    }

    public final void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(m14923a(0, view, layoutParams));
    }
}
