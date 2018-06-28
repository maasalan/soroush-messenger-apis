package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertController.C0654a;
import android.support.v7.app.AlertController.C0654a.C06501;
import android.support.v7.app.AlertController.C0654a.C06512;
import android.support.v7.app.AlertController.C0654a.C06523;
import android.support.v7.app.AlertController.C0654a.C06534;
import android.support.v7.app.AlertController.C0656c;
import android.support.v7.app.AlertController.RecycleListView;
import android.support.v7.p041a.C0645a.C0635a;
import android.support.v7.widget.ListPopupWindow;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;

public final class C6389b extends C4870k implements DialogInterface {
    final AlertController f17479a = new AlertController(getContext(), this, getWindow());

    public static class C0663a {
        public final C0654a f2211a;
        private final int f2212b;

        public C0663a(Context context) {
            this(context, C6389b.m15113a(context, 0));
        }

        public C0663a(Context context, int i) {
            this.f2211a = new C0654a(new ContextThemeWrapper(context, C6389b.m15113a(context, i)));
            this.f2212b = i;
        }

        public final C0663a m1607a(View view) {
            this.f2211a.f2141w = view;
            this.f2211a.f2140v = 0;
            this.f2211a.f2108B = false;
            return this;
        }

        public final C0663a m1608a(CharSequence charSequence) {
            this.f2211a.f2124f = charSequence;
            return this;
        }

        public final C0663a m1609a(CharSequence charSequence, OnClickListener onClickListener) {
            this.f2211a.f2127i = charSequence;
            this.f2211a.f2128j = onClickListener;
            return this;
        }

        public final C0663a m1610a(boolean z) {
            this.f2211a.f2133o = z;
            return this;
        }

        public final C0663a m1611a(CharSequence[] charSequenceArr, OnClickListener onClickListener) {
            this.f2211a.f2137s = charSequenceArr;
            this.f2211a.f2139u = onClickListener;
            return this;
        }

        public final C6389b m1612a() {
            C6389b c6389b = new C6389b(this.f2211a.f2119a, this.f2212b);
            C0654a c0654a = this.f2211a;
            AlertController alertController = c6389b.f17479a;
            if (c0654a.f2125g != null) {
                alertController.f2148C = c0654a.f2125g;
            } else {
                if (c0654a.f2124f != null) {
                    alertController.m1577a(c0654a.f2124f);
                }
                if (c0654a.f2122d != null) {
                    Drawable drawable = c0654a.f2122d;
                    alertController.f2185y = drawable;
                    alertController.f2184x = 0;
                    if (alertController.f2186z != null) {
                        if (drawable != null) {
                            alertController.f2186z.setVisibility(0);
                            alertController.f2186z.setImageDrawable(drawable);
                        } else {
                            alertController.f2186z.setVisibility(8);
                        }
                    }
                }
                if (c0654a.f2121c != 0) {
                    alertController.m1575a(c0654a.f2121c);
                }
                if (c0654a.f2123e != 0) {
                    int i = c0654a.f2123e;
                    TypedValue typedValue = new TypedValue();
                    alertController.f2161a.getTheme().resolveAttribute(i, typedValue, true);
                    alertController.m1575a(typedValue.resourceId);
                }
            }
            if (c0654a.f2126h != null) {
                CharSequence charSequence = c0654a.f2126h;
                alertController.f2165e = charSequence;
                if (alertController.f2147B != null) {
                    alertController.f2147B.setText(charSequence);
                }
            }
            if (c0654a.f2127i != null) {
                alertController.m1576a(-1, c0654a.f2127i, c0654a.f2128j, null);
            }
            if (c0654a.f2129k != null) {
                alertController.m1576a(-2, c0654a.f2129k, c0654a.f2130l, null);
            }
            if (c0654a.f2131m != null) {
                alertController.m1576a(-3, c0654a.f2131m, c0654a.f2132n, null);
            }
            if (!(c0654a.f2137s == null && c0654a.f2114H == null && c0654a.f2138t == null)) {
                ListAdapter simpleCursorAdapter;
                OnItemClickListener c06523;
                RecycleListView recycleListView = (RecycleListView) c0654a.f2120b.inflate(alertController.f2153H, null);
                if (!c0654a.f2110D) {
                    i = c0654a.f2111E ? alertController.f2155J : alertController.f2156K;
                    simpleCursorAdapter = c0654a.f2114H != null ? new SimpleCursorAdapter(c0654a.f2119a, i, c0654a.f2114H, new String[]{c0654a.f2115I}, new int[]{16908308}) : c0654a.f2138t != null ? c0654a.f2138t : new C0656c(c0654a.f2119a, i, c0654a.f2137s);
                } else if (c0654a.f2114H == null) {
                    r4 = new C06501(c0654a, c0654a.f2119a, alertController.f2154I, c0654a.f2137s, recycleListView);
                } else {
                    r4 = new C06512(c0654a, c0654a.f2119a, c0654a.f2114H, recycleListView, alertController);
                }
                alertController.f2149D = simpleCursorAdapter;
                alertController.f2150E = c0654a.f2112F;
                if (c0654a.f2139u != null) {
                    c06523 = new C06523(c0654a, alertController);
                } else {
                    if (c0654a.f2113G != null) {
                        c06523 = new C06534(c0654a, recycleListView, alertController);
                    }
                    if (c0654a.f2117K != null) {
                        recycleListView.setOnItemSelectedListener(c0654a.f2117K);
                    }
                    if (c0654a.f2111E) {
                        recycleListView.setChoiceMode(1);
                    } else if (c0654a.f2110D) {
                        recycleListView.setChoiceMode(2);
                    }
                    alertController.f2166f = recycleListView;
                }
                recycleListView.setOnItemClickListener(c06523);
                if (c0654a.f2117K != null) {
                    recycleListView.setOnItemSelectedListener(c0654a.f2117K);
                }
                if (c0654a.f2111E) {
                    recycleListView.setChoiceMode(1);
                } else if (c0654a.f2110D) {
                    recycleListView.setChoiceMode(2);
                }
                alertController.f2166f = recycleListView;
            }
            int i2;
            if (c0654a.f2141w == null) {
                if (c0654a.f2140v != 0) {
                    i2 = c0654a.f2140v;
                    alertController.f2167g = null;
                    alertController.f2168h = i2;
                }
                c6389b.setCancelable(r0.f2211a.f2133o);
                if (r0.f2211a.f2133o) {
                    c6389b.setCanceledOnTouchOutside(true);
                }
                c6389b.setOnCancelListener(r0.f2211a.f2134p);
                c6389b.setOnDismissListener(r0.f2211a.f2135q);
                if (r0.f2211a.f2136r != null) {
                    c6389b.setOnKeyListener(r0.f2211a.f2136r);
                }
                return c6389b;
            } else if (c0654a.f2108B) {
                View view = c0654a.f2141w;
                int i3 = c0654a.f2142x;
                int i4 = c0654a.f2143y;
                int i5 = c0654a.f2144z;
                i2 = c0654a.f2107A;
                alertController.f2167g = view;
                alertController.f2168h = 0;
                alertController.f2173m = true;
                alertController.f2169i = i3;
                alertController.f2170j = i4;
                alertController.f2171k = i5;
                alertController.f2172l = i2;
                c6389b.setCancelable(r0.f2211a.f2133o);
                if (r0.f2211a.f2133o) {
                    c6389b.setCanceledOnTouchOutside(true);
                }
                c6389b.setOnCancelListener(r0.f2211a.f2134p);
                c6389b.setOnDismissListener(r0.f2211a.f2135q);
                if (r0.f2211a.f2136r != null) {
                    c6389b.setOnKeyListener(r0.f2211a.f2136r);
                }
                return c6389b;
            } else {
                alertController.f2167g = c0654a.f2141w;
                alertController.f2168h = 0;
            }
            alertController.f2173m = false;
            c6389b.setCancelable(r0.f2211a.f2133o);
            if (r0.f2211a.f2133o) {
                c6389b.setCanceledOnTouchOutside(true);
            }
            c6389b.setOnCancelListener(r0.f2211a.f2134p);
            c6389b.setOnDismissListener(r0.f2211a.f2135q);
            if (r0.f2211a.f2136r != null) {
                c6389b.setOnKeyListener(r0.f2211a.f2136r);
            }
            return c6389b;
        }

        public final C0663a m1613b(CharSequence charSequence) {
            this.f2211a.f2126h = charSequence;
            return this;
        }

        public final C0663a m1614b(CharSequence charSequence, OnClickListener onClickListener) {
            this.f2211a.f2129k = charSequence;
            this.f2211a.f2130l = onClickListener;
            return this;
        }

        public final C6389b m1615b() {
            C6389b a = m1612a();
            a.show();
            return a;
        }
    }

    protected C6389b(Context context, int i) {
        super(context, C6389b.m15113a(context, i));
    }

    static int m15113a(Context context, int i) {
        if (((i >>> 24) & 255) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0635a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final Button m15114a(int i) {
        AlertController alertController = this.f17479a;
        switch (i) {
            case -3:
                return alertController.f2180t;
            case ListPopupWindow.WRAP_CONTENT /*-2*/:
                return alertController.f2177q;
            case -1:
                return alertController.f2174n;
            default:
                return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void onCreate(android.os.Bundle r15) {
        /*
        r14 = this;
        super.onCreate(r15);
        r15 = r14.f17479a;
        r0 = r15.f2152G;
        r1 = 1;
        if (r0 == 0) goto L_0x0011;
    L_0x000a:
        r0 = r15.f2158M;
        if (r0 != r1) goto L_0x0011;
    L_0x000e:
        r0 = r15.f2152G;
        goto L_0x0013;
    L_0x0011:
        r0 = r15.f2151F;
    L_0x0013:
        r2 = r15.f2162b;
        r2.setContentView(r0);
        r0 = r15.f2163c;
        r2 = android.support.v7.p041a.C0645a.C0640f.parentPanel;
        r0 = r0.findViewById(r2);
        r2 = android.support.v7.p041a.C0645a.C0640f.topPanel;
        r2 = r0.findViewById(r2);
        r3 = android.support.v7.p041a.C0645a.C0640f.contentPanel;
        r3 = r0.findViewById(r3);
        r4 = android.support.v7.p041a.C0645a.C0640f.buttonPanel;
        r4 = r0.findViewById(r4);
        r5 = android.support.v7.p041a.C0645a.C0640f.customPanel;
        r0 = r0.findViewById(r5);
        r0 = (android.view.ViewGroup) r0;
        r5 = r15.f2167g;
        r6 = 0;
        r7 = 0;
        if (r5 == 0) goto L_0x0043;
    L_0x0040:
        r5 = r15.f2167g;
        goto L_0x0055;
    L_0x0043:
        r5 = r15.f2168h;
        if (r5 == 0) goto L_0x0054;
    L_0x0047:
        r5 = r15.f2161a;
        r5 = android.view.LayoutInflater.from(r5);
        r8 = r15.f2168h;
        r5 = r5.inflate(r8, r0, r7);
        goto L_0x0055;
    L_0x0054:
        r5 = r6;
    L_0x0055:
        if (r5 == 0) goto L_0x0059;
    L_0x0057:
        r8 = r1;
        goto L_0x005a;
    L_0x0059:
        r8 = r7;
    L_0x005a:
        if (r8 == 0) goto L_0x0062;
    L_0x005c:
        r9 = android.support.v7.app.AlertController.m1574a(r5);
        if (r9 != 0) goto L_0x0069;
    L_0x0062:
        r9 = r15.f2163c;
        r10 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r9.setFlags(r10, r10);
    L_0x0069:
        r9 = -1;
        r10 = 8;
        if (r8 == 0) goto L_0x009d;
    L_0x006e:
        r8 = r15.f2163c;
        r11 = android.support.v7.p041a.C0645a.C0640f.custom;
        r8 = r8.findViewById(r11);
        r8 = (android.widget.FrameLayout) r8;
        r11 = new android.view.ViewGroup$LayoutParams;
        r11.<init>(r9, r9);
        r8.addView(r5, r11);
        r5 = r15.f2173m;
        if (r5 == 0) goto L_0x008f;
    L_0x0084:
        r5 = r15.f2169i;
        r11 = r15.f2170j;
        r12 = r15.f2171k;
        r13 = r15.f2172l;
        r8.setPadding(r5, r11, r12, r13);
    L_0x008f:
        r5 = r15.f2166f;
        if (r5 == 0) goto L_0x00a0;
    L_0x0093:
        r5 = r0.getLayoutParams();
        r5 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r5;
        r8 = 0;
        r5.weight = r8;
        goto L_0x00a0;
    L_0x009d:
        r0.setVisibility(r10);
    L_0x00a0:
        r5 = android.support.v7.p041a.C0645a.C0640f.topPanel;
        r5 = r0.findViewById(r5);
        r8 = android.support.v7.p041a.C0645a.C0640f.contentPanel;
        r8 = r0.findViewById(r8);
        r11 = android.support.v7.p041a.C0645a.C0640f.buttonPanel;
        r11 = r0.findViewById(r11);
        r2 = android.support.v7.app.AlertController.m1571a(r5, r2);
        r3 = android.support.v7.app.AlertController.m1571a(r8, r3);
        r4 = android.support.v7.app.AlertController.m1571a(r11, r4);
        r5 = r15.f2163c;
        r8 = android.support.v7.p041a.C0645a.C0640f.scrollView;
        r5 = r5.findViewById(r8);
        r5 = (android.support.v4.widget.NestedScrollView) r5;
        r15.f2183w = r5;
        r5 = r15.f2183w;
        r5.setFocusable(r7);
        r5 = r15.f2183w;
        r5.setNestedScrollingEnabled(r7);
        r5 = 16908299; // 0x102000b float:2.387726E-38 double:8.3538097E-317;
        r5 = r3.findViewById(r5);
        r5 = (android.widget.TextView) r5;
        r15.f2147B = r5;
        r5 = r15.f2147B;
        if (r5 == 0) goto L_0x011e;
    L_0x00e3:
        r5 = r15.f2165e;
        if (r5 == 0) goto L_0x00ef;
    L_0x00e7:
        r5 = r15.f2147B;
        r8 = r15.f2165e;
        r5.setText(r8);
        goto L_0x011e;
    L_0x00ef:
        r5 = r15.f2147B;
        r5.setVisibility(r10);
        r5 = r15.f2183w;
        r8 = r15.f2147B;
        r5.removeView(r8);
        r5 = r15.f2166f;
        if (r5 == 0) goto L_0x011b;
    L_0x00ff:
        r5 = r15.f2183w;
        r5 = r5.getParent();
        r5 = (android.view.ViewGroup) r5;
        r8 = r15.f2183w;
        r8 = r5.indexOfChild(r8);
        r5.removeViewAt(r8);
        r11 = r15.f2166f;
        r12 = new android.view.ViewGroup$LayoutParams;
        r12.<init>(r9, r9);
        r5.addView(r11, r8, r12);
        goto L_0x011e;
    L_0x011b:
        r3.setVisibility(r10);
    L_0x011e:
        r5 = 16908313; // 0x1020019 float:2.38773E-38 double:8.3538166E-317;
        r5 = r4.findViewById(r5);
        r5 = (android.widget.Button) r5;
        r15.f2174n = r5;
        r5 = r15.f2174n;
        r8 = r15.f2160O;
        r5.setOnClickListener(r8);
        r5 = r15.f2175o;
        r5 = android.text.TextUtils.isEmpty(r5);
        if (r5 == 0) goto L_0x013f;
    L_0x0138:
        r5 = r15.f2174n;
        r5.setVisibility(r10);
        r5 = r7;
        goto L_0x014c;
    L_0x013f:
        r5 = r15.f2174n;
        r8 = r15.f2175o;
        r5.setText(r8);
        r5 = r15.f2174n;
        r5.setVisibility(r7);
        r5 = r1;
    L_0x014c:
        r8 = 16908314; // 0x102001a float:2.3877302E-38 double:8.353817E-317;
        r8 = r4.findViewById(r8);
        r8 = (android.widget.Button) r8;
        r15.f2177q = r8;
        r8 = r15.f2177q;
        r11 = r15.f2160O;
        r8.setOnClickListener(r11);
        r8 = r15.f2178r;
        r8 = android.text.TextUtils.isEmpty(r8);
        if (r8 == 0) goto L_0x016c;
    L_0x0166:
        r8 = r15.f2177q;
        r8.setVisibility(r10);
        goto L_0x017a;
    L_0x016c:
        r8 = r15.f2177q;
        r11 = r15.f2178r;
        r8.setText(r11);
        r8 = r15.f2177q;
        r8.setVisibility(r7);
        r5 = r5 | 2;
    L_0x017a:
        r8 = 16908315; // 0x102001b float:2.3877305E-38 double:8.3538176E-317;
        r8 = r4.findViewById(r8);
        r8 = (android.widget.Button) r8;
        r15.f2180t = r8;
        r8 = r15.f2180t;
        r11 = r15.f2160O;
        r8.setOnClickListener(r11);
        r8 = r15.f2181u;
        r8 = android.text.TextUtils.isEmpty(r8);
        if (r8 == 0) goto L_0x019a;
    L_0x0194:
        r8 = r15.f2180t;
        r8.setVisibility(r10);
        goto L_0x01a8;
    L_0x019a:
        r8 = r15.f2180t;
        r11 = r15.f2181u;
        r8.setText(r11);
        r8 = r15.f2180t;
        r8.setVisibility(r7);
        r5 = r5 | 4;
    L_0x01a8:
        r8 = r15.f2161a;
        r11 = new android.util.TypedValue;
        r11.<init>();
        r8 = r8.getTheme();
        r12 = android.support.v7.p041a.C0645a.C0635a.alertDialogCenterButtons;
        r8.resolveAttribute(r12, r11, r1);
        r8 = r11.data;
        if (r8 == 0) goto L_0x01be;
    L_0x01bc:
        r8 = r1;
        goto L_0x01bf;
    L_0x01be:
        r8 = r7;
    L_0x01bf:
        r11 = 2;
        if (r8 == 0) goto L_0x01d5;
    L_0x01c2:
        if (r5 != r1) goto L_0x01ca;
    L_0x01c4:
        r8 = r15.f2174n;
    L_0x01c6:
        android.support.v7.app.AlertController.m1573a(r8);
        goto L_0x01d5;
    L_0x01ca:
        if (r5 != r11) goto L_0x01cf;
    L_0x01cc:
        r8 = r15.f2177q;
        goto L_0x01c6;
    L_0x01cf:
        r8 = 4;
        if (r5 != r8) goto L_0x01d5;
    L_0x01d2:
        r8 = r15.f2180t;
        goto L_0x01c6;
    L_0x01d5:
        if (r5 == 0) goto L_0x01d9;
    L_0x01d7:
        r5 = r1;
        goto L_0x01da;
    L_0x01d9:
        r5 = r7;
    L_0x01da:
        if (r5 != 0) goto L_0x01df;
    L_0x01dc:
        r4.setVisibility(r10);
    L_0x01df:
        r5 = r15.f2148C;
        if (r5 == 0) goto L_0x01fb;
    L_0x01e3:
        r5 = new android.view.ViewGroup$LayoutParams;
        r8 = -2;
        r5.<init>(r9, r8);
        r8 = r15.f2148C;
        r2.addView(r8, r7, r5);
        r5 = r15.f2163c;
        r8 = android.support.v7.p041a.C0645a.C0640f.title_template;
        r5 = r5.findViewById(r8);
        r5.setVisibility(r10);
        goto L_0x0276;
    L_0x01fb:
        r5 = r15.f2163c;
        r8 = 16908294; // 0x1020006 float:2.3877246E-38 double:8.353807E-317;
        r5 = r5.findViewById(r8);
        r5 = (android.widget.ImageView) r5;
        r15.f2186z = r5;
        r5 = r15.f2164d;
        r5 = android.text.TextUtils.isEmpty(r5);
        r5 = r5 ^ r1;
        if (r5 == 0) goto L_0x0263;
    L_0x0211:
        r5 = r15.f2157L;
        if (r5 == 0) goto L_0x0263;
    L_0x0215:
        r5 = r15.f2163c;
        r8 = android.support.v7.p041a.C0645a.C0640f.alertTitle;
        r5 = r5.findViewById(r8);
        r5 = (android.widget.TextView) r5;
        r15.f2146A = r5;
        r5 = r15.f2146A;
        r8 = r15.f2164d;
        r5.setText(r8);
        r5 = r15.f2184x;
        if (r5 == 0) goto L_0x0234;
    L_0x022c:
        r5 = r15.f2186z;
        r8 = r15.f2184x;
        r5.setImageResource(r8);
        goto L_0x0276;
    L_0x0234:
        r5 = r15.f2185y;
        if (r5 == 0) goto L_0x0240;
    L_0x0238:
        r5 = r15.f2186z;
        r8 = r15.f2185y;
        r5.setImageDrawable(r8);
        goto L_0x0276;
    L_0x0240:
        r5 = r15.f2146A;
        r8 = r15.f2186z;
        r8 = r8.getPaddingLeft();
        r9 = r15.f2186z;
        r9 = r9.getPaddingTop();
        r12 = r15.f2186z;
        r12 = r12.getPaddingRight();
        r13 = r15.f2186z;
        r13 = r13.getPaddingBottom();
        r5.setPadding(r8, r9, r12, r13);
        r5 = r15.f2186z;
        r5.setVisibility(r10);
        goto L_0x0276;
    L_0x0263:
        r5 = r15.f2163c;
        r8 = android.support.v7.p041a.C0645a.C0640f.title_template;
        r5 = r5.findViewById(r8);
        r5.setVisibility(r10);
        r5 = r15.f2186z;
        r5.setVisibility(r10);
        r2.setVisibility(r10);
    L_0x0276:
        if (r0 == 0) goto L_0x0280;
    L_0x0278:
        r0 = r0.getVisibility();
        if (r0 == r10) goto L_0x0280;
    L_0x027e:
        r0 = r1;
        goto L_0x0281;
    L_0x0280:
        r0 = r7;
    L_0x0281:
        if (r2 == 0) goto L_0x028b;
    L_0x0283:
        r5 = r2.getVisibility();
        if (r5 == r10) goto L_0x028b;
    L_0x0289:
        r5 = r1;
        goto L_0x028c;
    L_0x028b:
        r5 = r7;
    L_0x028c:
        if (r4 == 0) goto L_0x0296;
    L_0x028e:
        r4 = r4.getVisibility();
        if (r4 == r10) goto L_0x0296;
    L_0x0294:
        r4 = r1;
        goto L_0x0297;
    L_0x0296:
        r4 = r7;
    L_0x0297:
        if (r4 != 0) goto L_0x02a6;
    L_0x0299:
        if (r3 == 0) goto L_0x02a6;
    L_0x029b:
        r8 = android.support.v7.p041a.C0645a.C0640f.textSpacerNoButtons;
        r8 = r3.findViewById(r8);
        if (r8 == 0) goto L_0x02a6;
    L_0x02a3:
        r8.setVisibility(r7);
    L_0x02a6:
        if (r5 == 0) goto L_0x02c5;
    L_0x02a8:
        r8 = r15.f2183w;
        if (r8 == 0) goto L_0x02b1;
    L_0x02ac:
        r8 = r15.f2183w;
        r8.setClipToPadding(r1);
    L_0x02b1:
        r8 = r15.f2165e;
        if (r8 != 0) goto L_0x02bc;
    L_0x02b5:
        r8 = r15.f2166f;
        if (r8 == 0) goto L_0x02ba;
    L_0x02b9:
        goto L_0x02bc;
    L_0x02ba:
        r2 = r6;
        goto L_0x02c2;
    L_0x02bc:
        r8 = android.support.v7.p041a.C0645a.C0640f.titleDividerNoCustom;
        r2 = r2.findViewById(r8);
    L_0x02c2:
        if (r2 == 0) goto L_0x02d2;
    L_0x02c4:
        goto L_0x02cf;
    L_0x02c5:
        if (r3 == 0) goto L_0x02d2;
    L_0x02c7:
        r2 = android.support.v7.p041a.C0645a.C0640f.textSpacerNoTitle;
        r2 = r3.findViewById(r2);
        if (r2 == 0) goto L_0x02d2;
    L_0x02cf:
        r2.setVisibility(r7);
    L_0x02d2:
        r2 = r15.f2166f;
        r2 = r2 instanceof android.support.v7.app.AlertController.RecycleListView;
        if (r2 == 0) goto L_0x02fd;
    L_0x02d8:
        r2 = r15.f2166f;
        r2 = (android.support.v7.app.AlertController.RecycleListView) r2;
        if (r4 == 0) goto L_0x02e0;
    L_0x02de:
        if (r5 != 0) goto L_0x02fd;
    L_0x02e0:
        r8 = r2.getPaddingLeft();
        if (r5 == 0) goto L_0x02eb;
    L_0x02e6:
        r9 = r2.getPaddingTop();
        goto L_0x02ed;
    L_0x02eb:
        r9 = r2.f2093a;
    L_0x02ed:
        r10 = r2.getPaddingRight();
        if (r4 == 0) goto L_0x02f8;
    L_0x02f3:
        r12 = r2.getPaddingBottom();
        goto L_0x02fa;
    L_0x02f8:
        r12 = r2.f2094b;
    L_0x02fa:
        r2.setPadding(r8, r9, r10, r12);
    L_0x02fd:
        if (r0 != 0) goto L_0x0385;
    L_0x02ff:
        r0 = r15.f2166f;
        if (r0 == 0) goto L_0x0306;
    L_0x0303:
        r0 = r15.f2166f;
        goto L_0x0308;
    L_0x0306:
        r0 = r15.f2183w;
    L_0x0308:
        if (r0 == 0) goto L_0x0385;
    L_0x030a:
        if (r4 == 0) goto L_0x030d;
    L_0x030c:
        r7 = r11;
    L_0x030d:
        r2 = r5 | r7;
        r4 = r15.f2163c;
        r5 = android.support.v7.p041a.C0645a.C0640f.scrollIndicatorUp;
        r4 = r4.findViewById(r5);
        r5 = r15.f2163c;
        r7 = android.support.v7.p041a.C0645a.C0640f.scrollIndicatorDown;
        r5 = r5.findViewById(r7);
        r7 = android.os.Build.VERSION.SDK_INT;
        r8 = 23;
        if (r7 < r8) goto L_0x0333;
    L_0x0325:
        android.support.v4.view.C0571r.m1366f(r0, r2);
        if (r4 == 0) goto L_0x032d;
    L_0x032a:
        r3.removeView(r4);
    L_0x032d:
        if (r5 == 0) goto L_0x0385;
    L_0x032f:
        r3.removeView(r5);
        goto L_0x0385;
    L_0x0333:
        if (r4 == 0) goto L_0x033d;
    L_0x0335:
        r0 = r2 & 1;
        if (r0 != 0) goto L_0x033d;
    L_0x0339:
        r3.removeView(r4);
        r4 = r6;
    L_0x033d:
        if (r5 == 0) goto L_0x0347;
    L_0x033f:
        r0 = r2 & 2;
        if (r0 != 0) goto L_0x0347;
    L_0x0343:
        r3.removeView(r5);
        r5 = r6;
    L_0x0347:
        if (r4 != 0) goto L_0x034b;
    L_0x0349:
        if (r5 == 0) goto L_0x0385;
    L_0x034b:
        r0 = r15.f2165e;
        if (r0 == 0) goto L_0x0364;
    L_0x034f:
        r0 = r15.f2183w;
        r2 = new android.support.v7.app.AlertController$2;
        r2.<init>(r15, r4, r5);
        r0.setOnScrollChangeListener(r2);
        r0 = r15.f2183w;
        r2 = new android.support.v7.app.AlertController$3;
        r2.<init>(r15, r4, r5);
        r0.post(r2);
        goto L_0x0385;
    L_0x0364:
        r0 = r15.f2166f;
        if (r0 == 0) goto L_0x037d;
    L_0x0368:
        r0 = r15.f2166f;
        r2 = new android.support.v7.app.AlertController$4;
        r2.<init>(r15, r4, r5);
        r0.setOnScrollListener(r2);
        r0 = r15.f2166f;
        r2 = new android.support.v7.app.AlertController$5;
        r2.<init>(r15, r4, r5);
        r0.post(r2);
        goto L_0x0385;
    L_0x037d:
        if (r4 == 0) goto L_0x0382;
    L_0x037f:
        r3.removeView(r4);
    L_0x0382:
        if (r5 == 0) goto L_0x0385;
    L_0x0384:
        goto L_0x032f;
    L_0x0385:
        r0 = r15.f2166f;
        if (r0 == 0) goto L_0x039c;
    L_0x0389:
        r2 = r15.f2149D;
        if (r2 == 0) goto L_0x039c;
    L_0x038d:
        r2 = r15.f2149D;
        r0.setAdapter(r2);
        r15 = r15.f2150E;
        if (r15 < 0) goto L_0x039c;
    L_0x0396:
        r0.setItemChecked(r15, r1);
        r0.setSelection(r15);
    L_0x039c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.b.onCreate(android.os.Bundle):void");
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        AlertController alertController = this.f17479a;
        boolean z = alertController.f2183w != null && alertController.f2183w.m15062a(keyEvent);
        return z ? true : super.onKeyDown(i, keyEvent);
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        AlertController alertController = this.f17479a;
        boolean z = alertController.f2183w != null && alertController.f2183w.m15062a(keyEvent);
        return z ? true : super.onKeyUp(i, keyEvent);
    }

    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f17479a.m1577a(charSequence);
    }
}
