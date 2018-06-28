package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.NestedScrollView;
import android.support.v4.widget.NestedScrollView.C0589b;
import android.support.v7.p041a.C0645a.C0635a;
import android.support.v7.p041a.C0645a.C0644j;
import android.support.v7.widget.ListPopupWindow;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.ref.WeakReference;

final class AlertController {
    TextView f2146A;
    TextView f2147B;
    View f2148C;
    ListAdapter f2149D;
    int f2150E = -1;
    int f2151F;
    int f2152G;
    int f2153H;
    int f2154I;
    int f2155J;
    int f2156K;
    boolean f2157L;
    int f2158M = 0;
    Handler f2159N;
    final OnClickListener f2160O = new C06461(this);
    final Context f2161a;
    final C4870k f2162b;
    final Window f2163c;
    CharSequence f2164d;
    CharSequence f2165e;
    ListView f2166f;
    View f2167g;
    int f2168h;
    int f2169i;
    int f2170j;
    int f2171k;
    int f2172l;
    boolean f2173m = false;
    Button f2174n;
    CharSequence f2175o;
    Message f2176p;
    Button f2177q;
    CharSequence f2178r;
    Message f2179s;
    Button f2180t;
    CharSequence f2181u;
    Message f2182v;
    NestedScrollView f2183w;
    int f2184x = 0;
    Drawable f2185y;
    ImageView f2186z;

    class C06461 implements OnClickListener {
        final /* synthetic */ AlertController f2083a;

        C06461(AlertController alertController) {
            this.f2083a = alertController;
        }

        public final void onClick(View view) {
            Message message;
            if (view == this.f2083a.f2174n && this.f2083a.f2176p != null) {
                message = this.f2083a.f2176p;
            } else if (view == this.f2083a.f2177q && this.f2083a.f2179s != null) {
                message = this.f2083a.f2179s;
            } else if (view != this.f2083a.f2180t || this.f2083a.f2182v == null) {
                message = null;
                if (message != null) {
                    message.sendToTarget();
                }
                this.f2083a.f2159N.obtainMessage(1, this.f2083a.f2162b).sendToTarget();
            } else {
                message = this.f2083a.f2182v;
            }
            message = Message.obtain(message);
            if (message != null) {
                message.sendToTarget();
            }
            this.f2083a.f2159N.obtainMessage(1, this.f2083a.f2162b).sendToTarget();
        }
    }

    class C06473 implements Runnable {
        final /* synthetic */ View f2084a;
        final /* synthetic */ View f2085b;
        final /* synthetic */ AlertController f2086c;

        C06473(AlertController alertController, View view, View view2) {
            this.f2086c = alertController;
            this.f2084a = view;
            this.f2085b = view2;
        }

        public final void run() {
            AlertController.m1572a(this.f2086c.f2183w, this.f2084a, this.f2085b);
        }
    }

    class C06484 implements OnScrollListener {
        final /* synthetic */ View f2087a;
        final /* synthetic */ View f2088b;
        final /* synthetic */ AlertController f2089c;

        C06484(AlertController alertController, View view, View view2) {
            this.f2089c = alertController;
            this.f2087a = view;
            this.f2088b = view2;
        }

        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.m1572a(absListView, this.f2087a, this.f2088b);
        }

        public final void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    class C06495 implements Runnable {
        final /* synthetic */ View f2090a;
        final /* synthetic */ View f2091b;
        final /* synthetic */ AlertController f2092c;

        C06495(AlertController alertController, View view, View view2) {
            this.f2092c = alertController;
            this.f2090a = view;
            this.f2091b = view2;
        }

        public final void run() {
            AlertController.m1572a(this.f2092c.f2166f, this.f2090a, this.f2091b);
        }
    }

    public static class RecycleListView extends ListView {
        final int f2093a;
        final int f2094b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0644j.RecycleListView);
            this.f2094b = obtainStyledAttributes.getDimensionPixelOffset(C0644j.RecycleListView_paddingBottomNoButtons, -1);
            this.f2093a = obtainStyledAttributes.getDimensionPixelOffset(C0644j.RecycleListView_paddingTopNoTitle, -1);
        }
    }

    public static class C0654a {
        public int f2107A;
        public boolean f2108B = false;
        public boolean[] f2109C;
        public boolean f2110D;
        public boolean f2111E;
        public int f2112F = -1;
        public OnMultiChoiceClickListener f2113G;
        public Cursor f2114H;
        public String f2115I;
        public String f2116J;
        public OnItemSelectedListener f2117K;
        public boolean f2118L = true;
        public final Context f2119a;
        public final LayoutInflater f2120b;
        public int f2121c = 0;
        public Drawable f2122d;
        public int f2123e = 0;
        public CharSequence f2124f;
        public View f2125g;
        public CharSequence f2126h;
        public CharSequence f2127i;
        public DialogInterface.OnClickListener f2128j;
        public CharSequence f2129k;
        public DialogInterface.OnClickListener f2130l;
        public CharSequence f2131m;
        public DialogInterface.OnClickListener f2132n;
        public boolean f2133o;
        public OnCancelListener f2134p;
        public OnDismissListener f2135q;
        public OnKeyListener f2136r;
        public CharSequence[] f2137s;
        public ListAdapter f2138t;
        public DialogInterface.OnClickListener f2139u;
        public int f2140v;
        public View f2141w;
        public int f2142x;
        public int f2143y;
        public int f2144z;

        class C06501 extends ArrayAdapter<CharSequence> {
            final /* synthetic */ RecycleListView f2095a;
            final /* synthetic */ C0654a f2096b;

            C06501(C0654a c0654a, Context context, int i, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                this.f2096b = c0654a;
                this.f2095a = recycleListView;
                super(context, i, 16908308, charSequenceArr);
            }

            public final View getView(int i, View view, ViewGroup viewGroup) {
                view = super.getView(i, view, viewGroup);
                if (this.f2096b.f2109C != null && this.f2096b.f2109C[i]) {
                    this.f2095a.setItemChecked(i, true);
                }
                return view;
            }
        }

        class C06512 extends CursorAdapter {
            final /* synthetic */ RecycleListView f2097a;
            final /* synthetic */ AlertController f2098b;
            final /* synthetic */ C0654a f2099c;
            private final int f2100d;
            private final int f2101e;

            C06512(C0654a c0654a, Context context, Cursor cursor, RecycleListView recycleListView, AlertController alertController) {
                this.f2099c = c0654a;
                this.f2097a = recycleListView;
                this.f2098b = alertController;
                super(context, cursor, false);
                Cursor cursor2 = getCursor();
                this.f2100d = cursor2.getColumnIndexOrThrow(this.f2099c.f2115I);
                this.f2101e = cursor2.getColumnIndexOrThrow(this.f2099c.f2116J);
            }

            public final void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f2100d));
                RecycleListView recycleListView = this.f2097a;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f2101e) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return this.f2099c.f2120b.inflate(this.f2098b.f2154I, viewGroup, false);
            }
        }

        class C06523 implements OnItemClickListener {
            final /* synthetic */ AlertController f2102a;
            final /* synthetic */ C0654a f2103b;

            C06523(C0654a c0654a, AlertController alertController) {
                this.f2103b = c0654a;
                this.f2102a = alertController;
            }

            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                this.f2103b.f2139u.onClick(this.f2102a.f2162b, i);
                if (!this.f2103b.f2111E) {
                    this.f2102a.f2162b.dismiss();
                }
            }
        }

        class C06534 implements OnItemClickListener {
            final /* synthetic */ RecycleListView f2104a;
            final /* synthetic */ AlertController f2105b;
            final /* synthetic */ C0654a f2106c;

            C06534(C0654a c0654a, RecycleListView recycleListView, AlertController alertController) {
                this.f2106c = c0654a;
                this.f2104a = recycleListView;
                this.f2105b = alertController;
            }

            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (this.f2106c.f2109C != null) {
                    this.f2106c.f2109C[i] = this.f2104a.isItemChecked(i);
                }
                this.f2106c.f2113G.onClick(this.f2105b.f2162b, i, this.f2104a.isItemChecked(i));
            }
        }

        public C0654a(Context context) {
            this.f2119a = context;
            this.f2133o = true;
            this.f2120b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    private static final class C0655b extends Handler {
        private WeakReference<DialogInterface> f2145a;

        public C0655b(DialogInterface dialogInterface) {
            this.f2145a = new WeakReference(dialogInterface);
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                switch (i) {
                    case -3:
                    case ListPopupWindow.WRAP_CONTENT /*-2*/:
                    case -1:
                        ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f2145a.get(), message.what);
                        return;
                    default:
                        return;
                }
            }
            ((DialogInterface) message.obj).dismiss();
        }
    }

    private static class C0656c extends ArrayAdapter<CharSequence> {
        public C0656c(Context context, int i, CharSequence[] charSequenceArr) {
            super(context, i, 16908308, charSequenceArr);
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final boolean hasStableIds() {
            return true;
        }
    }

    class C48602 implements C0589b {
        final /* synthetic */ View f13498a;
        final /* synthetic */ View f13499b;
        final /* synthetic */ AlertController f13500c;

        C48602(AlertController alertController, View view, View view2) {
            this.f13500c = alertController;
            this.f13498a = view;
            this.f13499b = view2;
        }

        public final void mo440a(NestedScrollView nestedScrollView, int i) {
            AlertController.m1572a(nestedScrollView, this.f13498a, this.f13499b);
        }
    }

    public AlertController(Context context, C4870k c4870k, Window window) {
        this.f2161a = context;
        this.f2162b = c4870k;
        this.f2163c = window;
        this.f2159N = new C0655b(c4870k);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C0644j.AlertDialog, C0635a.alertDialogStyle, 0);
        this.f2151F = obtainStyledAttributes.getResourceId(C0644j.AlertDialog_android_layout, 0);
        this.f2152G = obtainStyledAttributes.getResourceId(C0644j.AlertDialog_buttonPanelSideLayout, 0);
        this.f2153H = obtainStyledAttributes.getResourceId(C0644j.AlertDialog_listLayout, 0);
        this.f2154I = obtainStyledAttributes.getResourceId(C0644j.AlertDialog_multiChoiceItemLayout, 0);
        this.f2155J = obtainStyledAttributes.getResourceId(C0644j.AlertDialog_singleChoiceItemLayout, 0);
        this.f2156K = obtainStyledAttributes.getResourceId(C0644j.AlertDialog_listItemLayout, 0);
        this.f2157L = obtainStyledAttributes.getBoolean(C0644j.AlertDialog_showTitle, true);
        obtainStyledAttributes.recycle();
        c4870k.m9371a();
    }

    static ViewGroup m1571a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    static void m1572a(View view, View view2, View view3) {
        int i = 4;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (view.canScrollVertically(1)) {
                i = 0;
            }
            view3.setVisibility(i);
        }
    }

    static void m1573a(Button button) {
        LayoutParams layoutParams = (LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    static boolean m1574a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m1574a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public final void m1575a(int i) {
        this.f2185y = null;
        this.f2184x = i;
        if (this.f2186z != null) {
            if (i != 0) {
                this.f2186z.setVisibility(0);
                this.f2186z.setImageResource(this.f2184x);
                return;
            }
            this.f2186z.setVisibility(8);
        }
    }

    public final void m1576a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        if (onClickListener != null) {
            message = this.f2159N.obtainMessage(i, onClickListener);
        }
        switch (i) {
            case -3:
                this.f2181u = charSequence;
                this.f2182v = message;
                return;
            case ListPopupWindow.WRAP_CONTENT /*-2*/:
                this.f2178r = charSequence;
                this.f2179s = message;
                return;
            case -1:
                this.f2175o = charSequence;
                this.f2176p = message;
                return;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }

    public final void m1577a(CharSequence charSequence) {
        this.f2164d = charSequence;
        if (this.f2146A != null) {
            this.f2146A.setText(charSequence);
        }
    }
}
