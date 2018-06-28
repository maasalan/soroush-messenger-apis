package com.cocosw.bottomsheet;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.cocosw.bottomsheet.C1294e.C1289a;
import com.cocosw.bottomsheet.C1294e.C1290b;
import com.cocosw.bottomsheet.C1294e.C1291c;
import com.cocosw.bottomsheet.C1294e.C1292d;
import com.cocosw.bottomsheet.C1298f.C1297a;
import com.cocosw.bottomsheet.ClosableSlidingLayout.C1278a;
import java.util.ArrayList;
import java.util.Iterator;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;

public final class C1287c extends Dialog implements DialogInterface {
    private String f4042a;
    private Drawable f4043b;
    private Drawable f4044c;
    private boolean f4045d;
    private int f4046e;
    private GridView f4047f;
    private C1298f f4048g;
    private C1286a f4049h;
    private final SparseIntArray f4050i = new SparseIntArray();
    private boolean f4051j;
    private String f4052k;
    private boolean f4053l;
    private float f4054m;
    private RoundAvatarImageView f4055n;
    private int f4056o = -1;
    private boolean f4057p = true;
    private boolean f4058q = true;
    private C5286a f4059r;
    private C5286a f4060s;
    private C5286a f4061t;
    private OnDismissListener f4062u;

    class C12792 implements OnShowListener {
        final /* synthetic */ C1287c f4019a;

        C12792(C1287c c1287c) {
            this.f4019a = c1287c;
        }

        public final void onShow(DialogInterface dialogInterface) {
            this.f4019a.f4047f.setAdapter(this.f4019a.f4048g);
            this.f4019a.f4047f.startLayoutAnimation();
            if (this.f4019a.f4049h.f4036h != null) {
                this.f4019a.f4055n.setVisibility(0);
                this.f4019a.f4055n.setImageDrawable(this.f4019a.f4049h.f4036h);
            } else if (this.f4019a.f4049h.f4037i != null) {
                this.f4019a.f4055n.setVisibility(0);
                this.f4019a.f4055n.setName(this.f4019a.f4049h.f4037i);
                this.f4019a.f4055n.setBackgroundColor(this.f4019a.f4049h.f4038j);
            } else {
                this.f4019a.f4055n.setVisibility(8);
            }
        }
    }

    class C12813 extends BaseAdapter {
        final /* synthetic */ C1287c f4023a;

        class C1280a {
            TextView f4020a;
            ImageView f4021b;
            final /* synthetic */ C12813 f4022c;

            C1280a(C12813 c12813) {
                this.f4022c = c12813;
            }
        }

        C12813(C1287c c1287c) {
            this.f4023a = c1287c;
        }

        private MenuItem m3051a(int i) {
            return this.f4023a.f4061t.getItem(i);
        }

        public final boolean areAllItemsEnabled() {
            return false;
        }

        public final int getCount() {
            return this.f4023a.f4061t.size() - this.f4023a.f4050i.size();
        }

        public final /* synthetic */ Object getItem(int i) {
            return m3051a(i);
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            C1280a c1280a;
            if (view == null) {
                view = ((LayoutInflater) this.f4023a.getContext().getSystemService("layout_inflater")).inflate(this.f4023a.f4049h.f4032d ? C1291c.bs_grid_entry : C1291c.bs_list_entry, viewGroup, false);
                c1280a = new C1280a(this);
                c1280a.f4020a = (TextView) view.findViewById(C1290b.bs_list_title);
                c1280a.f4021b = (ImageView) view.findViewById(C1290b.bs_list_image);
                view.setTag(c1280a);
            } else {
                c1280a = (C1280a) view.getTag();
            }
            int i2 = i;
            for (i = 0; i < this.f4023a.f4050i.size(); i++) {
                if (this.f4023a.f4050i.valueAt(i) <= i2) {
                    i2++;
                }
            }
            MenuItem a = m3051a(i2);
            c1280a.f4020a.setText(a.getTitle());
            if (a.getIcon() == null) {
                c1280a.f4021b.setVisibility(this.f4023a.f4045d ? 8 : 4);
            } else {
                c1280a.f4021b.setVisibility(0);
                c1280a.f4021b.setImageDrawable(a.getIcon());
            }
            c1280a.f4021b.setEnabled(a.isEnabled());
            c1280a.f4020a.setEnabled(a.isEnabled());
            return view;
        }

        public final int getViewTypeCount() {
            return 1;
        }

        public final boolean isEnabled(int i) {
            return m3051a(i).isEnabled();
        }
    }

    class C12835 implements OnClickListener {
        final /* synthetic */ C1287c f4026a;

        C12835(C1287c c1287c) {
            this.f4026a = c1287c;
        }

        public final void onClick(View view) {
            C1287c.m3067i(this.f4026a);
        }
    }

    class C12846 implements OnGlobalLayoutListener {
        final /* synthetic */ C1287c f4027a;

        C12846(C1287c c1287c) {
            this.f4027a = c1287c;
        }

        public final void onGlobalLayout() {
            if (VERSION.SDK_INT < 16) {
                this.f4027a.f4047f.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            } else {
                this.f4027a.f4047f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            View childAt = this.f4027a.f4047f.getChildAt(this.f4027a.f4047f.getChildCount() - 1);
            if (childAt != null) {
                this.f4027a.f4047f.setLayoutParams(new LayoutParams(-1, (childAt.getBottom() + childAt.getPaddingBottom()) + this.f4027a.f4047f.getPaddingBottom()));
            }
        }
    }

    class C12857 implements OnDismissListener {
        final /* synthetic */ C1287c f4028a;

        C12857(C1287c c1287c) {
            this.f4028a = c1287c;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            if (this.f4028a.f4062u != null) {
                this.f4028a.f4062u.onDismiss(dialogInterface);
            }
            if (this.f4028a.f4056o != ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
                C1287c.m3067i(this.f4028a);
            }
        }
    }

    public static class C1286a {
        public final Context f4029a;
        public final C5286a f4030b;
        public CharSequence f4031c;
        boolean f4032d;
        int f4033e;
        public DialogInterface.OnClickListener f4034f;
        OnDismissListener f4035g;
        Drawable f4036h;
        String f4037i;
        public int f4038j;
        int f4039k;
        OnMenuItemClickListener f4040l;
        private int f4041m;

        public C1286a(Activity activity) {
            this(activity, C1292d.BottomSheet_Dialog);
            TypedArray obtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{C1289a.bottomSheetStyle1});
            try {
                this.f4041m = obtainStyledAttributes.getResourceId(0, C1292d.BottomSheet_Dialog);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        private C1286a(Context context, int i) {
            this.f4033e = 3;
            this.f4039k = -1;
            this.f4029a = context;
            this.f4041m = i;
            this.f4030b = new C5286a(context);
        }

        public final C1286a m3052a(int i) {
            this.f4032d = true;
            this.f4033e = i;
            return this;
        }

        @SuppressLint({"Override"})
        public final C1287c m3053a() {
            C1287c c1287c = new C1287c(this.f4029a, this.f4041m);
            c1287c.f4049h = this;
            return c1287c;
        }
    }

    class C52881 implements C1278a {
        final /* synthetic */ C1287c f14677a;

        C52881(C1287c c1287c) {
            this.f14677a = c1287c;
        }

        public final void mo1250a() {
            this.f14677a.dismiss();
        }

        public final void mo1251b() {
            C1287c.m3057a(this.f14677a);
        }
    }

    C1287c(android.content.Context r8, int r9) {
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
        r7 = this;
        r7.<init>(r8, r9);
        r9 = new android.util.SparseIntArray;
        r9.<init>();
        r7.f4050i = r9;
        r9 = -1;
        r7.f4056o = r9;
        r9 = 1;
        r7.f4057p = r9;
        r7.f4058q = r9;
        r0 = r7.getContext();
        r1 = com.cocosw.bottomsheet.C1294e.C1293e.BottomSheet;
        r2 = com.cocosw.bottomsheet.C1294e.C1289a.bottomSheetStyle1;
        r3 = 0;
        r4 = 0;
        r0 = r0.obtainStyledAttributes(r3, r1, r2, r4);
        r1 = com.cocosw.bottomsheet.C1294e.C1293e.BottomSheet_bs_moreDrawable;	 Catch:{ all -> 0x010a }
        r1 = r0.getDrawable(r1);	 Catch:{ all -> 0x010a }
        r7.f4044c = r1;	 Catch:{ all -> 0x010a }
        r1 = com.cocosw.bottomsheet.C1294e.C1293e.BottomSheet_bs_closeDrawable;	 Catch:{ all -> 0x010a }
        r1 = r0.getDrawable(r1);	 Catch:{ all -> 0x010a }
        r7.f4043b = r1;	 Catch:{ all -> 0x010a }
        r1 = com.cocosw.bottomsheet.C1294e.C1293e.BottomSheet_bs_moreText;	 Catch:{ all -> 0x010a }
        r1 = r0.getString(r1);	 Catch:{ all -> 0x010a }
        r7.f4042a = r1;	 Catch:{ all -> 0x010a }
        r1 = com.cocosw.bottomsheet.C1294e.C1293e.BottomSheet_bs_collapseListIcons;	 Catch:{ all -> 0x010a }
        r1 = r0.getBoolean(r1, r9);	 Catch:{ all -> 0x010a }
        r7.f4045d = r1;	 Catch:{ all -> 0x010a }
        r0.recycle();
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 19;
        if (r0 < r1) goto L_0x0109;
    L_0x0049:
        r0 = "window";
        r0 = r8.getSystemService(r0);
        r0 = (android.view.WindowManager) r0;
        r1 = r8.getResources();
        r1 = r1.getConfiguration();
        r1 = r1.orientation;
        if (r1 != r9) goto L_0x005f;
    L_0x005d:
        r1 = r9;
        goto L_0x0060;
    L_0x005f:
        r1 = r4;
    L_0x0060:
        r7.f4051j = r1;
        r1 = "android.os.SystemProperties";	 Catch:{ Throwable -> 0x0086 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ Throwable -> 0x0086 }
        r2 = "get";	 Catch:{ Throwable -> 0x0086 }
        r5 = new java.lang.Class[r9];	 Catch:{ Throwable -> 0x0086 }
        r6 = java.lang.String.class;	 Catch:{ Throwable -> 0x0086 }
        r5[r4] = r6;	 Catch:{ Throwable -> 0x0086 }
        r1 = r1.getDeclaredMethod(r2, r5);	 Catch:{ Throwable -> 0x0086 }
        r1.setAccessible(r9);	 Catch:{ Throwable -> 0x0086 }
        r2 = new java.lang.Object[r9];	 Catch:{ Throwable -> 0x0086 }
        r5 = "qemu.hw.mainkeys";	 Catch:{ Throwable -> 0x0086 }
        r2[r4] = r5;	 Catch:{ Throwable -> 0x0086 }
        r1 = r1.invoke(r3, r2);	 Catch:{ Throwable -> 0x0086 }
        r1 = (java.lang.String) r1;	 Catch:{ Throwable -> 0x0086 }
        r7.f4052k = r1;	 Catch:{ Throwable -> 0x0086 }
        goto L_0x0088;
    L_0x0086:
        r7.f4052k = r3;
    L_0x0088:
        r1 = new int[r9];
        r2 = 16843760; // 0x10103f0 float:2.3696383E-38 double:8.321923E-317;
        r1[r4] = r2;
        r1 = r8.obtainStyledAttributes(r1);
        r2 = r1.getBoolean(r4, r4);	 Catch:{ all -> 0x0104 }
        r7.f4053l = r2;	 Catch:{ all -> 0x0104 }
        r1.recycle();
        r1 = r8;
        r1 = (android.app.Activity) r1;
        r1 = r1.getWindow();
        r1 = r1.getAttributes();
        r1 = r1.flags;
        r2 = 134217728; // 0x8000000 float:3.85186E-34 double:6.63123685E-316;
        r1 = r1 & r2;
        if (r1 == 0) goto L_0x00b0;
    L_0x00ae:
        r7.f4053l = r9;
    L_0x00b0:
        r9 = new android.util.DisplayMetrics;
        r9.<init>();
        r1 = android.os.Build.VERSION.SDK_INT;
        r3 = 16;
        if (r1 < r3) goto L_0x00c3;
    L_0x00bb:
        r0 = r0.getDefaultDisplay();
        r0.getRealMetrics(r9);
        goto L_0x00ca;
    L_0x00c3:
        r0 = r0.getDefaultDisplay();
        r0.getMetrics(r9);
    L_0x00ca:
        r0 = r9.widthPixels;
        r0 = (float) r0;
        r1 = r9.density;
        r0 = r0 / r1;
        r1 = r9.heightPixels;
        r1 = (float) r1;
        r9 = r9.density;
        r1 = r1 / r9;
        r9 = java.lang.Math.min(r0, r1);
        r7.f4054m = r9;
        r9 = r7.f4053l;
        if (r9 == 0) goto L_0x00f7;
    L_0x00e0:
        r9 = r7.getWindow();
        if (r9 == 0) goto L_0x00f7;
    L_0x00e6:
        r0 = r9.getAttributes();
        r1 = r0.flags;
        r3 = 67108864; // 0x4000000 float:1.5046328E-36 double:3.31561842E-316;
        r1 = r1 | r3;
        r0.flags = r1;
        r9.setAttributes(r0);
        r9.setFlags(r2, r2);
    L_0x00f7:
        r8 = r8.getResources();
        r9 = "status_bar_height";
        r8 = com.cocosw.bottomsheet.C1287c.m3055a(r8, r9);
        r7.f4046e = r8;
        return;
    L_0x0104:
        r8 = move-exception;
        r1.recycle();
        throw r8;
    L_0x0109:
        return;
    L_0x010a:
        r8 = move-exception;
        r0.recycle();
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cocosw.bottomsheet.c.<init>(android.content.Context, int):void");
    }

    private int m3054a() {
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
        r0 = 1;
        r1 = android.widget.GridView.class;	 Catch:{ Exception -> 0x0013 }
        r2 = "mRequestedNumColumns";	 Catch:{ Exception -> 0x0013 }
        r1 = r1.getDeclaredField(r2);	 Catch:{ Exception -> 0x0013 }
        r1.setAccessible(r0);	 Catch:{ Exception -> 0x0013 }
        r2 = r3.f4047f;	 Catch:{ Exception -> 0x0013 }
        r1 = r1.getInt(r2);	 Catch:{ Exception -> 0x0013 }
        return r1;
    L_0x0013:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cocosw.bottomsheet.c.a():int");
    }

    private static int m3055a(Resources resources, String str) {
        int identifier = resources.getIdentifier(str, "dimen", "android");
        return identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
    }

    static /* synthetic */ void m3057a(C1287c c1287c) {
        if (VERSION.SDK_INT >= 19) {
            Transition changeBounds = new ChangeBounds();
            changeBounds.setDuration(300);
            TransitionManager.beginDelayedTransition(c1287c.f4047f, changeBounds);
        }
        c1287c.f4061t = c1287c.f4059r;
        c1287c.m3059b();
        c1287c.f4048g.notifyDataSetChanged();
        c1287c.f4047f.setLayoutParams(new LayoutParams(-1, -1));
        c1287c.f4055n.setVisibility(0);
        c1287c.f4055n.setImageDrawable(c1287c.f4043b);
        c1287c.f4055n.setOnClickListener(new C12835(c1287c));
        c1287c.m3061c();
    }

    private void m3059b() {
        Iterator it = this.f4061t.f14661b.iterator();
        while (it.hasNext()) {
            if (!((C5287b) it.next()).isVisible()) {
                it.remove();
            }
        }
        if (!this.f4049h.f4032d && this.f4061t.size() > 0) {
            int i = 0;
            int groupId = this.f4061t.getItem(0).getGroupId();
            ArrayList arrayList = new ArrayList();
            while (i < this.f4061t.size()) {
                if (this.f4061t.getItem(i).getGroupId() != groupId) {
                    groupId = this.f4061t.getItem(i).getGroupId();
                    arrayList.add(new C1297a(i, null));
                }
                i++;
            }
            if (arrayList.size() > 0) {
                C1297a[] c1297aArr = new C1297a[arrayList.size()];
                arrayList.toArray(c1297aArr);
                C1298f c1298f = this.f4048g;
                c1298f.f4071b = c1297aArr;
                c1298f.m3075a();
                return;
            }
            this.f4048g.f4070a.clear();
        }
    }

    private void m3061c() {
        if ((this.f4048g.f4070a.size() > 0 ? 1 : null) != null) {
            this.f4047f.getViewTreeObserver().addOnGlobalLayoutListener(new C12846(this));
        }
    }

    static /* synthetic */ void m3067i(C1287c c1287c) {
        c1287c.f4061t = c1287c.f4060s;
        c1287c.m3059b();
        c1287c.f4048g.notifyDataSetChanged();
        c1287c.m3061c();
        if (c1287c.f4049h.f4036h != null) {
            c1287c.f4055n.setVisibility(0);
            c1287c.f4055n.setImageDrawable(c1287c.f4049h.f4036h);
        } else if (c1287c.f4049h.f4037i != null) {
            c1287c.f4055n.setVisibility(0);
            c1287c.f4055n.setName(c1287c.f4049h.f4037i);
            c1287c.f4055n.setBackgroundColor(c1287c.f4049h.f4038j);
        } else {
            c1287c.f4055n.setVisibility(8);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void onCreate(android.os.Bundle r11) {
        /*
        r10 = this;
        super.onCreate(r11);
        r11 = r10.getContext();
        r0 = r10.f4057p;
        r10.setCanceledOnTouchOutside(r0);
        r0 = com.cocosw.bottomsheet.C1294e.C1291c.bottom_sheet_dialog;
        r1 = 0;
        r0 = android.view.View.inflate(r11, r0, r1);
        r6 = r0;
        r6 = (com.cocosw.bottomsheet.ClosableSlidingLayout) r6;
        r10.setContentView(r6);
        r0 = r10.f4058q;
        r7 = 0;
        if (r0 != 0) goto L_0x0020;
    L_0x001e:
        r6.f4003b = r7;
    L_0x0020:
        r0 = new com.cocosw.bottomsheet.c$1;
        r0.<init>(r10);
        r6.setSlideListener(r0);
        r0 = new com.cocosw.bottomsheet.c$2;
        r0.<init>(r10);
        r10.setOnShowListener(r0);
        r0 = 2;
        r0 = new int[r0];
        r6.getLocationOnScreen(r0);
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 19;
        r8 = 1;
        if (r1 < r2) goto L_0x00c2;
    L_0x003d:
        r0 = r0[r7];
        if (r0 != 0) goto L_0x0044;
    L_0x0041:
        r0 = r10.f4046e;
        goto L_0x0045;
    L_0x0044:
        r0 = r7;
    L_0x0045:
        r6.setPadding(r7, r0, r7, r7);
        r0 = r6.getChildAt(r7);
        r1 = r10.f4053l;
        if (r1 == 0) goto L_0x00be;
    L_0x0050:
        r1 = r10.getContext();
        r2 = r1.getResources();
        r3 = android.os.Build.VERSION.SDK_INT;
        r4 = 14;
        if (r3 < r4) goto L_0x00b7;
    L_0x005e:
        r3 = r1.getResources();
        r4 = "config_showNavigationBar";
        r5 = "bool";
        r9 = "android";
        r4 = r3.getIdentifier(r4, r5, r9);
        if (r4 == 0) goto L_0x0088;
    L_0x006e:
        r1 = r3.getBoolean(r4);
        r3 = "1";
        r4 = r10.f4052k;
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x007d;
    L_0x007c:
        goto L_0x0094;
    L_0x007d:
        r3 = "0";
        r4 = r10.f4052k;
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0095;
    L_0x0087:
        goto L_0x0092;
    L_0x0088:
        r1 = android.view.ViewConfiguration.get(r1);
        r1 = r1.hasPermanentMenuKey();
        if (r1 != 0) goto L_0x0094;
    L_0x0092:
        r1 = r8;
        goto L_0x0095;
    L_0x0094:
        r1 = r7;
    L_0x0095:
        if (r1 == 0) goto L_0x00b7;
    L_0x0097:
        r1 = r10.f4051j;
        if (r1 == 0) goto L_0x009e;
    L_0x009b:
        r1 = "navigation_bar_height";
        goto L_0x00b2;
    L_0x009e:
        r1 = r10.f4054m;
        r3 = 1142292480; // 0x44160000 float:600.0 double:5.64367472E-315;
        r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r1 >= 0) goto L_0x00ad;
    L_0x00a6:
        r1 = r10.f4051j;
        if (r1 == 0) goto L_0x00ab;
    L_0x00aa:
        goto L_0x00ad;
    L_0x00ab:
        r1 = r7;
        goto L_0x00ae;
    L_0x00ad:
        r1 = r8;
    L_0x00ae:
        if (r1 == 0) goto L_0x00b7;
    L_0x00b0:
        r1 = "navigation_bar_height_landscape";
    L_0x00b2:
        r1 = com.cocosw.bottomsheet.C1287c.m3055a(r2, r1);
        goto L_0x00b8;
    L_0x00b7:
        r1 = r7;
    L_0x00b8:
        r2 = r6.getPaddingBottom();
        r1 = r1 + r2;
        goto L_0x00bf;
    L_0x00be:
        r1 = r7;
    L_0x00bf:
        r0.setPadding(r7, r7, r7, r1);
    L_0x00c2:
        r0 = com.cocosw.bottomsheet.C1294e.C1290b.bottom_sheet_title;
        r0 = r6.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = r10.f4049h;
        r1 = r1.f4031c;
        if (r1 == 0) goto L_0x00da;
    L_0x00d0:
        r0.setVisibility(r7);
        r1 = r10.f4049h;
        r1 = r1.f4031c;
        r0.setText(r1);
    L_0x00da:
        r0 = com.cocosw.bottomsheet.C1294e.C1290b.bottom_sheet_title_image;
        r0 = r6.findViewById(r0);
        r0 = (mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView) r0;
        r10.f4055n = r0;
        r0 = com.cocosw.bottomsheet.C1294e.C1290b.bottom_sheet_gridview;
        r0 = r6.findViewById(r0);
        r0 = (android.widget.GridView) r0;
        r10.f4047f = r0;
        r0 = r10.f4047f;
        r6.f4002a = r0;
        r0 = r10.f4049h;
        r0 = r0.f4032d;
        if (r0 != 0) goto L_0x00fe;
    L_0x00f8:
        r0 = r10.f4047f;
        r0.setNumColumns(r8);
        goto L_0x0107;
    L_0x00fe:
        r0 = r10.f4047f;
        r1 = r10.f4049h;
        r1 = r1.f4033e;
        r0.setNumColumns(r1);
    L_0x0107:
        r0 = r10.f4049h;
        r0 = r0.f4032d;
        if (r0 == 0) goto L_0x0131;
    L_0x010d:
        r0 = r7;
    L_0x010e:
        r1 = r10.f4049h;
        r1 = r1.f4030b;
        r1 = r1.size();
        if (r0 >= r1) goto L_0x0131;
    L_0x0118:
        r1 = r10.f4049h;
        r1 = r1.f4030b;
        r1 = r1.getItem(r0);
        r1 = r1.getIcon();
        if (r1 != 0) goto L_0x012e;
    L_0x0126:
        r11 = new java.lang.IllegalArgumentException;
        r0 = "You must set titleIcon for each items in grid style";
        r11.<init>(r0);
        throw r11;
    L_0x012e:
        r0 = r0 + 1;
        goto L_0x010e;
    L_0x0131:
        r0 = r10.f4049h;
        r0 = r0.f4039k;
        if (r0 <= 0) goto L_0x0143;
    L_0x0137:
        r0 = r10.f4049h;
        r0 = r0.f4039k;
        r1 = r10.m3054a();
        r0 = r0 * r1;
    L_0x0140:
        r10.f4056o = r0;
        goto L_0x0147;
    L_0x0143:
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        goto L_0x0140;
    L_0x0147:
        r6.setCollapsible(r7);
        r0 = r10.f4049h;
        r0 = r0.f4030b;
        r10.f4061t = r0;
        r0 = r10.f4061t;
        r10.f4060s = r0;
        r0 = r10.f4049h;
        r0 = r0.f4030b;
        r0 = r0.size();
        r1 = r10.f4056o;
        if (r0 <= r1) goto L_0x01a4;
    L_0x0160:
        r0 = r10.f4049h;
        r0 = r0.f4030b;
        r10.f4059r = r0;
        r0 = r10.f4049h;
        r0 = r0.f4030b;
        r1 = r10.f4056o;
        r1 = r1 - r8;
        r2 = new com.cocosw.bottomsheet.a;
        r3 = r0.f14660a;
        r2.<init>(r3);
        r3 = new java.util.ArrayList;
        r0 = r0.f14661b;
        r0 = r0.subList(r7, r1);
        r3.<init>(r0);
        r2.f14661b = r3;
        r10.f4060s = r2;
        r9 = new com.cocosw.bottomsheet.b;
        r2 = 0;
        r3 = com.cocosw.bottomsheet.C1294e.C1290b.bs_more;
        r0 = r10.f4056o;
        r4 = r0 + -1;
        r5 = r10.f4042a;
        r0 = r9;
        r1 = r11;
        r0.<init>(r1, r2, r3, r4, r5);
        r0 = r10.f4044c;
        r9.setIcon(r0);
        r0 = r10.f4060s;
        r0.m10967a(r9);
        r0 = r10.f4060s;
        r10.f4061t = r0;
        r6.setCollapsible(r8);
    L_0x01a4:
        r2 = new com.cocosw.bottomsheet.c$3;
        r2.<init>(r10);
        r9 = new com.cocosw.bottomsheet.f;
        r3 = com.cocosw.bottomsheet.C1294e.C1291c.bs_list_divider;
        r4 = com.cocosw.bottomsheet.C1294e.C1290b.headerlayout;
        r5 = com.cocosw.bottomsheet.C1294e.C1290b.header;
        r0 = r9;
        r1 = r11;
        r0.<init>(r1, r2, r3, r4, r5);
        r10.f4048g = r9;
        r11 = r10.f4047f;
        r0 = r10.f4048g;
        r11.setAdapter(r0);
        r11 = r10.f4048g;
        r0 = r10.f4047f;
        r1 = r0 instanceof com.cocosw.bottomsheet.PinnedSectionGridView;
        if (r1 != 0) goto L_0x01cf;
    L_0x01c7:
        r11 = new java.lang.IllegalArgumentException;
        r0 = "Does your grid view extends PinnedSectionGridView?";
        r11.<init>(r0);
        throw r11;
    L_0x01cf:
        r11.f4077h = r0;
        r1 = r0.getStretchMode();
        r11.f4074e = r1;
        r1 = r0.getWidth();
        r2 = r11.f4077h;
        r2 = r2.getPaddingLeft();
        r3 = r11.f4077h;
        r3 = r3.getPaddingRight();
        r2 = r2 + r3;
        r1 = r1 - r2;
        r11.f4073d = r1;
        r0 = (com.cocosw.bottomsheet.PinnedSectionGridView) r0;
        r1 = r0.getNumColumns();
        r11.f4072c = r1;
        r1 = r0.getColumnWidth();
        r11.f4075f = r1;
        r0 = r0.getHorizontalSpacing();
        r11.f4076g = r0;
        r10.m3059b();
        r11 = r10.f4047f;
        r0 = new com.cocosw.bottomsheet.c$4;
        r0.<init>(r10, r6);
        r11.setOnItemClickListener(r0);
        r11 = r10.f4049h;
        r11 = r11.f4035g;
        if (r11 == 0) goto L_0x0219;
    L_0x0212:
        r11 = r10.f4049h;
        r11 = r11.f4035g;
        r10.setOnDismissListener(r11);
    L_0x0219:
        r10.m3061c();
        r11 = r10.getWindow();
        if (r11 == 0) goto L_0x025f;
    L_0x0222:
        r11 = r10.getWindow();
        r11 = r11.getAttributes();
        r0 = -2;
        r11.height = r0;
        r0 = 80;
        r11.gravity = r0;
        r0 = r10.getContext();
        r1 = new int[r8];
        r2 = 16842996; // 0x10100f4 float:2.3694242E-38 double:8.3215457E-317;
        r1[r7] = r2;
        r0 = r0.obtainStyledAttributes(r1);
        r1 = -1;
        r1 = r0.getLayoutDimension(r7, r1);	 Catch:{ all -> 0x025a }
        r11.width = r1;	 Catch:{ all -> 0x025a }
        r0.recycle();
        r0 = new com.cocosw.bottomsheet.c$7;
        r0.<init>(r10);
        super.setOnDismissListener(r0);
        r0 = r10.getWindow();
        r0.setAttributes(r11);
        return;
    L_0x025a:
        r11 = move-exception;
        r0.recycle();
        throw r11;
    L_0x025f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cocosw.bottomsheet.c.onCreate(android.os.Bundle):void");
    }

    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        this.f4057p = z;
    }

    public final void setOnDismissListener(OnDismissListener onDismissListener) {
        this.f4062u = onDismissListener;
    }
}
