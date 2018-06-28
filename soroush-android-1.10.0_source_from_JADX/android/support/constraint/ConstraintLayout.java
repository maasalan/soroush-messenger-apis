package android.support.constraint;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.support.constraint.C0198g.C0197b;
import android.support.constraint.p026a.C0185f;
import android.support.constraint.p026a.p027a.C0174d;
import android.support.constraint.p026a.p027a.C4700f;
import android.support.constraint.p026a.p027a.C6337e;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.ArrayList;
import java.util.HashMap;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class ConstraintLayout extends ViewGroup {
    SparseArray<View> f542a = new SparseArray();
    C6337e f543b = new C6337e();
    HashMap<String, Integer> f544c = new HashMap();
    int f545d = -1;
    int f546e = -1;
    int f547f = 0;
    int f548g = 0;
    private ArrayList<C0190b> f549h = new ArrayList(4);
    private final ArrayList<C0174d> f550i = new ArrayList(100);
    private int f551j = 0;
    private int f552k = 0;
    private int f553l = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    private int f554m = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    private boolean f555n = true;
    private int f556o = 3;
    private C0192c f557p = null;
    private int f558q = -1;
    private int f559r = -1;
    private int f560s = -1;
    private C0185f f561t;

    public static class C0165a extends MarginLayoutParams {
        public float f490A = 0.5f;
        public String f491B = null;
        float f492C = 0.0f;
        int f493D = 1;
        public float f494E = 0.0f;
        public float f495F = 0.0f;
        public int f496G = 0;
        public int f497H = 0;
        public int f498I = 0;
        public int f499J = 0;
        public int f500K = 0;
        public int f501L = 0;
        public int f502M = 0;
        public int f503N = 0;
        public float f504O = BallPulseIndicator.SCALE;
        public float f505P = BallPulseIndicator.SCALE;
        public int f506Q = -1;
        public int f507R = -1;
        public int f508S = -1;
        public boolean f509T = false;
        public boolean f510U = false;
        boolean f511V = true;
        boolean f512W = true;
        boolean f513X = false;
        boolean f514Y = false;
        boolean f515Z = false;
        public int f516a = -1;
        boolean aa = false;
        int ab = -1;
        int ac = -1;
        int ad = -1;
        int ae = -1;
        int af = -1;
        int ag = -1;
        float ah = 0.5f;
        int ai;
        int aj;
        float ak;
        C0174d al = new C0174d();
        public boolean am = false;
        public int f517b = -1;
        public float f518c = -1.0f;
        public int f519d = -1;
        public int f520e = -1;
        public int f521f = -1;
        public int f522g = -1;
        public int f523h = -1;
        public int f524i = -1;
        public int f525j = -1;
        public int f526k = -1;
        public int f527l = -1;
        public int f528m = -1;
        public int f529n = 0;
        public float f530o = 0.0f;
        public int f531p = -1;
        public int f532q = -1;
        public int f533r = -1;
        public int f534s = -1;
        public int f535t = -1;
        public int f536u = -1;
        public int f537v = -1;
        public int f538w = -1;
        public int f539x = -1;
        public int f540y = -1;
        public float f541z = 0.5f;

        private static class C0164a {
            public static final SparseIntArray f489a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f489a = sparseIntArray;
                sparseIntArray.append(C0197b.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintCircle, 2);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                f489a.append(C0197b.ConstraintLayout_Layout_android_orientation, 1);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                f489a.append(C0197b.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
            }
        }

        public C0165a() {
            super(-2, -2);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0165a(android.content.Context r10, android.util.AttributeSet r11) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r9 = this;
            r9.<init>(r10, r11);
            r0 = -1;
            r9.f516a = r0;
            r9.f517b = r0;
            r1 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
            r9.f518c = r1;
            r9.f519d = r0;
            r9.f520e = r0;
            r9.f521f = r0;
            r9.f522g = r0;
            r9.f523h = r0;
            r9.f524i = r0;
            r9.f525j = r0;
            r9.f526k = r0;
            r9.f527l = r0;
            r9.f528m = r0;
            r1 = 0;
            r9.f529n = r1;
            r2 = 0;
            r9.f530o = r2;
            r9.f531p = r0;
            r9.f532q = r0;
            r9.f533r = r0;
            r9.f534s = r0;
            r9.f535t = r0;
            r9.f536u = r0;
            r9.f537v = r0;
            r9.f538w = r0;
            r9.f539x = r0;
            r9.f540y = r0;
            r3 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
            r9.f541z = r3;
            r9.f490A = r3;
            r4 = 0;
            r9.f491B = r4;
            r9.f492C = r2;
            r4 = 1;
            r9.f493D = r4;
            r9.f494E = r2;
            r9.f495F = r2;
            r9.f496G = r1;
            r9.f497H = r1;
            r9.f498I = r1;
            r9.f499J = r1;
            r9.f500K = r1;
            r9.f501L = r1;
            r9.f502M = r1;
            r9.f503N = r1;
            r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            r9.f504O = r5;
            r9.f505P = r5;
            r9.f506Q = r0;
            r9.f507R = r0;
            r9.f508S = r0;
            r9.f509T = r1;
            r9.f510U = r1;
            r9.f511V = r4;
            r9.f512W = r4;
            r9.f513X = r1;
            r9.f514Y = r1;
            r9.f515Z = r1;
            r9.aa = r1;
            r9.ab = r0;
            r9.ac = r0;
            r9.ad = r0;
            r9.ae = r0;
            r9.af = r0;
            r9.ag = r0;
            r9.ah = r3;
            r3 = new android.support.constraint.a.a.d;
            r3.<init>();
            r9.al = r3;
            r9.am = r1;
            r3 = android.support.constraint.C0198g.C0197b.ConstraintLayout_Layout;
            r10 = r10.obtainStyledAttributes(r11, r3);
            r11 = r10.getIndexCount();
            r3 = r1;
        L_0x009a:
            if (r3 >= r11) goto L_0x03da;
        L_0x009c:
            r5 = r10.getIndex(r3);
            r6 = android.support.constraint.ConstraintLayout.C0165a.C0164a.f489a;
            r6 = r6.get(r5);
            r7 = -2;
            switch(r6) {
                case 0: goto L_0x03d6;
                case 1: goto L_0x03ce;
                case 2: goto L_0x03bb;
                case 3: goto L_0x03b2;
                case 4: goto L_0x0399;
                case 5: goto L_0x0390;
                case 6: goto L_0x0387;
                case 7: goto L_0x037e;
                case 8: goto L_0x036b;
                case 9: goto L_0x0358;
                case 10: goto L_0x0344;
                case 11: goto L_0x0330;
                case 12: goto L_0x031c;
                case 13: goto L_0x0308;
                case 14: goto L_0x02f4;
                case 15: goto L_0x02e0;
                case 16: goto L_0x02cc;
                case 17: goto L_0x02b8;
                case 18: goto L_0x02a4;
                case 19: goto L_0x0290;
                case 20: goto L_0x027c;
                case 21: goto L_0x0272;
                case 22: goto L_0x0268;
                case 23: goto L_0x025e;
                case 24: goto L_0x0254;
                case 25: goto L_0x024a;
                case 26: goto L_0x0240;
                case 27: goto L_0x0236;
                case 28: goto L_0x022c;
                case 29: goto L_0x0222;
                case 30: goto L_0x0218;
                case 31: goto L_0x0205;
                case 32: goto L_0x01f6;
                case 33: goto L_0x01e0;
                case 34: goto L_0x01ca;
                case 35: goto L_0x01bc;
                case 36: goto L_0x01a6;
                case 37: goto L_0x0190;
                case 38: goto L_0x0182;
                default: goto L_0x00aa;
            };
        L_0x00aa:
            switch(r6) {
                case 44: goto L_0x00e3;
                case 45: goto L_0x00db;
                case 46: goto L_0x00d3;
                case 47: goto L_0x00cb;
                case 48: goto L_0x00c3;
                case 49: goto L_0x00b9;
                case 50: goto L_0x00af;
                default: goto L_0x00ad;
            };
        L_0x00ad:
            goto L_0x03d6;
        L_0x00af:
            r6 = r9.f507R;
            r5 = r10.getDimensionPixelOffset(r5, r6);
            r9.f507R = r5;
            goto L_0x03d6;
        L_0x00b9:
            r6 = r9.f506Q;
            r5 = r10.getDimensionPixelOffset(r5, r6);
            r9.f506Q = r5;
            goto L_0x03d6;
        L_0x00c3:
            r5 = r10.getInt(r5, r1);
            r9.f497H = r5;
            goto L_0x03d6;
        L_0x00cb:
            r5 = r10.getInt(r5, r1);
            r9.f496G = r5;
            goto L_0x03d6;
        L_0x00d3:
            r5 = r10.getFloat(r5, r2);
            r9.f495F = r5;
            goto L_0x03d6;
        L_0x00db:
            r5 = r10.getFloat(r5, r2);
            r9.f494E = r5;
            goto L_0x03d6;
        L_0x00e3:
            r5 = r10.getString(r5);
            r9.f491B = r5;
            r5 = 2143289344; // 0x7fc00000 float:NaN double:1.058925634E-314;
            r9.f492C = r5;
            r9.f493D = r0;
            r5 = r9.f491B;
            if (r5 == 0) goto L_0x03d6;
        L_0x00f3:
            r5 = r9.f491B;
            r5 = r5.length();
            r6 = r9.f491B;
            r7 = 44;
            r6 = r6.indexOf(r7);
            if (r6 <= 0) goto L_0x0125;
        L_0x0103:
            r7 = r5 + -1;
            if (r6 >= r7) goto L_0x0125;
        L_0x0107:
            r7 = r9.f491B;
            r7 = r7.substring(r1, r6);
            r8 = "W";
            r8 = r7.equalsIgnoreCase(r8);
            if (r8 == 0) goto L_0x0118;
        L_0x0115:
            r9.f493D = r1;
            goto L_0x0122;
        L_0x0118:
            r8 = "H";
            r7 = r7.equalsIgnoreCase(r8);
            if (r7 == 0) goto L_0x0122;
        L_0x0120:
            r9.f493D = r4;
        L_0x0122:
            r6 = r6 + 1;
            goto L_0x0126;
        L_0x0125:
            r6 = r1;
        L_0x0126:
            r7 = r9.f491B;
            r8 = 58;
            r7 = r7.indexOf(r8);
            if (r7 < 0) goto L_0x0171;
        L_0x0130:
            r5 = r5 + -1;
            if (r7 >= r5) goto L_0x0171;
        L_0x0134:
            r5 = r9.f491B;
            r5 = r5.substring(r6, r7);
            r6 = r9.f491B;
            r7 = r7 + 1;
            r6 = r6.substring(r7);
            r7 = r5.length();
            if (r7 <= 0) goto L_0x03d6;
        L_0x0148:
            r7 = r6.length();
            if (r7 <= 0) goto L_0x03d6;
        L_0x014e:
            r5 = java.lang.Float.parseFloat(r5);	 Catch:{ NumberFormatException -> 0x03d6 }
            r6 = java.lang.Float.parseFloat(r6);	 Catch:{ NumberFormatException -> 0x03d6 }
            r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));	 Catch:{ NumberFormatException -> 0x03d6 }
            if (r7 <= 0) goto L_0x03d6;	 Catch:{ NumberFormatException -> 0x03d6 }
        L_0x015a:
            r7 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));	 Catch:{ NumberFormatException -> 0x03d6 }
            if (r7 <= 0) goto L_0x03d6;	 Catch:{ NumberFormatException -> 0x03d6 }
        L_0x015e:
            r7 = r9.f493D;	 Catch:{ NumberFormatException -> 0x03d6 }
            if (r7 != r4) goto L_0x016b;	 Catch:{ NumberFormatException -> 0x03d6 }
        L_0x0162:
            r6 = r6 / r5;	 Catch:{ NumberFormatException -> 0x03d6 }
            r5 = java.lang.Math.abs(r6);	 Catch:{ NumberFormatException -> 0x03d6 }
        L_0x0167:
            r9.f492C = r5;	 Catch:{ NumberFormatException -> 0x03d6 }
            goto L_0x03d6;	 Catch:{ NumberFormatException -> 0x03d6 }
        L_0x016b:
            r5 = r5 / r6;	 Catch:{ NumberFormatException -> 0x03d6 }
            r5 = java.lang.Math.abs(r5);	 Catch:{ NumberFormatException -> 0x03d6 }
            goto L_0x0167;
        L_0x0171:
            r5 = r9.f491B;
            r5 = r5.substring(r6);
            r6 = r5.length();
            if (r6 <= 0) goto L_0x03d6;
        L_0x017d:
            r5 = java.lang.Float.parseFloat(r5);	 Catch:{ NumberFormatException -> 0x03d6 }
            goto L_0x0167;
        L_0x0182:
            r6 = r9.f505P;
            r5 = r10.getFloat(r5, r6);
            r5 = java.lang.Math.max(r2, r5);
            r9.f505P = r5;
            goto L_0x03d6;
        L_0x0190:
            r6 = r9.f503N;	 Catch:{ Exception -> 0x019a }
            r6 = r10.getDimensionPixelSize(r5, r6);	 Catch:{ Exception -> 0x019a }
            r9.f503N = r6;	 Catch:{ Exception -> 0x019a }
            goto L_0x03d6;
        L_0x019a:
            r6 = r9.f503N;
            r5 = r10.getInt(r5, r6);
            if (r5 != r7) goto L_0x03d6;
        L_0x01a2:
            r9.f503N = r7;
            goto L_0x03d6;
        L_0x01a6:
            r6 = r9.f501L;	 Catch:{ Exception -> 0x01b0 }
            r6 = r10.getDimensionPixelSize(r5, r6);	 Catch:{ Exception -> 0x01b0 }
            r9.f501L = r6;	 Catch:{ Exception -> 0x01b0 }
            goto L_0x03d6;
        L_0x01b0:
            r6 = r9.f501L;
            r5 = r10.getInt(r5, r6);
            if (r5 != r7) goto L_0x03d6;
        L_0x01b8:
            r9.f501L = r7;
            goto L_0x03d6;
        L_0x01bc:
            r6 = r9.f504O;
            r5 = r10.getFloat(r5, r6);
            r5 = java.lang.Math.max(r2, r5);
            r9.f504O = r5;
            goto L_0x03d6;
        L_0x01ca:
            r6 = r9.f502M;	 Catch:{ Exception -> 0x01d4 }
            r6 = r10.getDimensionPixelSize(r5, r6);	 Catch:{ Exception -> 0x01d4 }
            r9.f502M = r6;	 Catch:{ Exception -> 0x01d4 }
            goto L_0x03d6;
        L_0x01d4:
            r6 = r9.f502M;
            r5 = r10.getInt(r5, r6);
            if (r5 != r7) goto L_0x03d6;
        L_0x01dc:
            r9.f502M = r7;
            goto L_0x03d6;
        L_0x01e0:
            r6 = r9.f500K;	 Catch:{ Exception -> 0x01ea }
            r6 = r10.getDimensionPixelSize(r5, r6);	 Catch:{ Exception -> 0x01ea }
            r9.f500K = r6;	 Catch:{ Exception -> 0x01ea }
            goto L_0x03d6;
        L_0x01ea:
            r6 = r9.f500K;
            r5 = r10.getInt(r5, r6);
            if (r5 != r7) goto L_0x03d6;
        L_0x01f2:
            r9.f500K = r7;
            goto L_0x03d6;
        L_0x01f6:
            r5 = r10.getInt(r5, r1);
            r9.f499J = r5;
            r5 = r9.f499J;
            if (r5 != r4) goto L_0x03d6;
        L_0x0200:
            r5 = "ConstraintLayout";
            r6 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
            goto L_0x0213;
        L_0x0205:
            r5 = r10.getInt(r5, r1);
            r9.f498I = r5;
            r5 = r9.f498I;
            if (r5 != r4) goto L_0x03d6;
        L_0x020f:
            r5 = "ConstraintLayout";
            r6 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
        L_0x0213:
            android.util.Log.e(r5, r6);
            goto L_0x03d6;
        L_0x0218:
            r6 = r9.f490A;
            r5 = r10.getFloat(r5, r6);
            r9.f490A = r5;
            goto L_0x03d6;
        L_0x0222:
            r6 = r9.f541z;
            r5 = r10.getFloat(r5, r6);
            r9.f541z = r5;
            goto L_0x03d6;
        L_0x022c:
            r6 = r9.f510U;
            r5 = r10.getBoolean(r5, r6);
            r9.f510U = r5;
            goto L_0x03d6;
        L_0x0236:
            r6 = r9.f509T;
            r5 = r10.getBoolean(r5, r6);
            r9.f509T = r5;
            goto L_0x03d6;
        L_0x0240:
            r6 = r9.f540y;
            r5 = r10.getDimensionPixelSize(r5, r6);
            r9.f540y = r5;
            goto L_0x03d6;
        L_0x024a:
            r6 = r9.f539x;
            r5 = r10.getDimensionPixelSize(r5, r6);
            r9.f539x = r5;
            goto L_0x03d6;
        L_0x0254:
            r6 = r9.f538w;
            r5 = r10.getDimensionPixelSize(r5, r6);
            r9.f538w = r5;
            goto L_0x03d6;
        L_0x025e:
            r6 = r9.f537v;
            r5 = r10.getDimensionPixelSize(r5, r6);
            r9.f537v = r5;
            goto L_0x03d6;
        L_0x0268:
            r6 = r9.f536u;
            r5 = r10.getDimensionPixelSize(r5, r6);
            r9.f536u = r5;
            goto L_0x03d6;
        L_0x0272:
            r6 = r9.f535t;
            r5 = r10.getDimensionPixelSize(r5, r6);
            r9.f535t = r5;
            goto L_0x03d6;
        L_0x027c:
            r6 = r9.f534s;
            r6 = r10.getResourceId(r5, r6);
            r9.f534s = r6;
            r6 = r9.f534s;
            if (r6 != r0) goto L_0x03d6;
        L_0x0288:
            r5 = r10.getInt(r5, r0);
            r9.f534s = r5;
            goto L_0x03d6;
        L_0x0290:
            r6 = r9.f533r;
            r6 = r10.getResourceId(r5, r6);
            r9.f533r = r6;
            r6 = r9.f533r;
            if (r6 != r0) goto L_0x03d6;
        L_0x029c:
            r5 = r10.getInt(r5, r0);
            r9.f533r = r5;
            goto L_0x03d6;
        L_0x02a4:
            r6 = r9.f532q;
            r6 = r10.getResourceId(r5, r6);
            r9.f532q = r6;
            r6 = r9.f532q;
            if (r6 != r0) goto L_0x03d6;
        L_0x02b0:
            r5 = r10.getInt(r5, r0);
            r9.f532q = r5;
            goto L_0x03d6;
        L_0x02b8:
            r6 = r9.f531p;
            r6 = r10.getResourceId(r5, r6);
            r9.f531p = r6;
            r6 = r9.f531p;
            if (r6 != r0) goto L_0x03d6;
        L_0x02c4:
            r5 = r10.getInt(r5, r0);
            r9.f531p = r5;
            goto L_0x03d6;
        L_0x02cc:
            r6 = r9.f527l;
            r6 = r10.getResourceId(r5, r6);
            r9.f527l = r6;
            r6 = r9.f527l;
            if (r6 != r0) goto L_0x03d6;
        L_0x02d8:
            r5 = r10.getInt(r5, r0);
            r9.f527l = r5;
            goto L_0x03d6;
        L_0x02e0:
            r6 = r9.f526k;
            r6 = r10.getResourceId(r5, r6);
            r9.f526k = r6;
            r6 = r9.f526k;
            if (r6 != r0) goto L_0x03d6;
        L_0x02ec:
            r5 = r10.getInt(r5, r0);
            r9.f526k = r5;
            goto L_0x03d6;
        L_0x02f4:
            r6 = r9.f525j;
            r6 = r10.getResourceId(r5, r6);
            r9.f525j = r6;
            r6 = r9.f525j;
            if (r6 != r0) goto L_0x03d6;
        L_0x0300:
            r5 = r10.getInt(r5, r0);
            r9.f525j = r5;
            goto L_0x03d6;
        L_0x0308:
            r6 = r9.f524i;
            r6 = r10.getResourceId(r5, r6);
            r9.f524i = r6;
            r6 = r9.f524i;
            if (r6 != r0) goto L_0x03d6;
        L_0x0314:
            r5 = r10.getInt(r5, r0);
            r9.f524i = r5;
            goto L_0x03d6;
        L_0x031c:
            r6 = r9.f523h;
            r6 = r10.getResourceId(r5, r6);
            r9.f523h = r6;
            r6 = r9.f523h;
            if (r6 != r0) goto L_0x03d6;
        L_0x0328:
            r5 = r10.getInt(r5, r0);
            r9.f523h = r5;
            goto L_0x03d6;
        L_0x0330:
            r6 = r9.f522g;
            r6 = r10.getResourceId(r5, r6);
            r9.f522g = r6;
            r6 = r9.f522g;
            if (r6 != r0) goto L_0x03d6;
        L_0x033c:
            r5 = r10.getInt(r5, r0);
            r9.f522g = r5;
            goto L_0x03d6;
        L_0x0344:
            r6 = r9.f521f;
            r6 = r10.getResourceId(r5, r6);
            r9.f521f = r6;
            r6 = r9.f521f;
            if (r6 != r0) goto L_0x03d6;
        L_0x0350:
            r5 = r10.getInt(r5, r0);
            r9.f521f = r5;
            goto L_0x03d6;
        L_0x0358:
            r6 = r9.f520e;
            r6 = r10.getResourceId(r5, r6);
            r9.f520e = r6;
            r6 = r9.f520e;
            if (r6 != r0) goto L_0x03d6;
        L_0x0364:
            r5 = r10.getInt(r5, r0);
            r9.f520e = r5;
            goto L_0x03d6;
        L_0x036b:
            r6 = r9.f519d;
            r6 = r10.getResourceId(r5, r6);
            r9.f519d = r6;
            r6 = r9.f519d;
            if (r6 != r0) goto L_0x03d6;
        L_0x0377:
            r5 = r10.getInt(r5, r0);
            r9.f519d = r5;
            goto L_0x03d6;
        L_0x037e:
            r6 = r9.f518c;
            r5 = r10.getFloat(r5, r6);
            r9.f518c = r5;
            goto L_0x03d6;
        L_0x0387:
            r6 = r9.f517b;
            r5 = r10.getDimensionPixelOffset(r5, r6);
            r9.f517b = r5;
            goto L_0x03d6;
        L_0x0390:
            r6 = r9.f516a;
            r5 = r10.getDimensionPixelOffset(r5, r6);
            r9.f516a = r5;
            goto L_0x03d6;
        L_0x0399:
            r6 = r9.f530o;
            r5 = r10.getFloat(r5, r6);
            r6 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
            r5 = r5 % r6;
            r9.f530o = r5;
            r5 = r9.f530o;
            r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
            if (r5 >= 0) goto L_0x03d6;
        L_0x03aa:
            r5 = r9.f530o;
            r5 = r6 - r5;
            r5 = r5 % r6;
            r9.f530o = r5;
            goto L_0x03d6;
        L_0x03b2:
            r6 = r9.f529n;
            r5 = r10.getDimensionPixelSize(r5, r6);
            r9.f529n = r5;
            goto L_0x03d6;
        L_0x03bb:
            r6 = r9.f528m;
            r6 = r10.getResourceId(r5, r6);
            r9.f528m = r6;
            r6 = r9.f528m;
            if (r6 != r0) goto L_0x03d6;
        L_0x03c7:
            r5 = r10.getInt(r5, r0);
            r9.f528m = r5;
            goto L_0x03d6;
        L_0x03ce:
            r6 = r9.f508S;
            r5 = r10.getInt(r5, r6);
            r9.f508S = r5;
        L_0x03d6:
            r3 = r3 + 1;
            goto L_0x009a;
        L_0x03da:
            r10.recycle();
            r9.m264a();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.a.<init>(android.content.Context, android.util.AttributeSet):void");
        }

        public C0165a(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public final void m264a() {
            this.f514Y = false;
            this.f511V = true;
            this.f512W = true;
            if (this.width == -2 && this.f509T) {
                this.f511V = false;
                this.f498I = 1;
            }
            if (this.height == -2 && this.f510U) {
                this.f512W = false;
                this.f499J = 1;
            }
            if (this.width == 0 || this.width == -1) {
                this.f511V = false;
                if (this.width == 0 && this.f498I == 1) {
                    this.width = -2;
                    this.f509T = true;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.f512W = false;
                if (this.height == 0 && this.f499J == 1) {
                    this.height = -2;
                    this.f510U = true;
                }
            }
            if (this.f518c != -1.0f || this.f516a != -1 || this.f517b != -1) {
                this.f514Y = true;
                this.f511V = true;
                this.f512W = true;
                if (!(this.al instanceof C4700f)) {
                    this.al = new C4700f();
                }
                ((C4700f) this.al).m8589j(this.f508S);
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        @android.annotation.TargetApi(17)
        public void resolveLayoutDirection(int r6) {
            /*
            r5 = this;
            r0 = r5.leftMargin;
            r1 = r5.rightMargin;
            super.resolveLayoutDirection(r6);
            r6 = -1;
            r5.ad = r6;
            r5.ae = r6;
            r5.ab = r6;
            r5.ac = r6;
            r5.af = r6;
            r5.ag = r6;
            r2 = r5.f535t;
            r5.af = r2;
            r2 = r5.f537v;
            r5.ag = r2;
            r2 = r5.f541z;
            r5.ah = r2;
            r2 = r5.f516a;
            r5.ai = r2;
            r2 = r5.f517b;
            r5.aj = r2;
            r2 = r5.f518c;
            r5.ak = r2;
            r2 = r5.getLayoutDirection();
            r3 = 0;
            r4 = 1;
            if (r4 != r2) goto L_0x0036;
        L_0x0034:
            r2 = r4;
            goto L_0x0037;
        L_0x0036:
            r2 = r3;
        L_0x0037:
            if (r2 == 0) goto L_0x00aa;
        L_0x0039:
            r2 = r5.f531p;
            if (r2 == r6) goto L_0x0043;
        L_0x003d:
            r2 = r5.f531p;
            r5.ad = r2;
        L_0x0041:
            r3 = r4;
            goto L_0x004c;
        L_0x0043:
            r2 = r5.f532q;
            if (r2 == r6) goto L_0x004c;
        L_0x0047:
            r2 = r5.f532q;
            r5.ae = r2;
            goto L_0x0041;
        L_0x004c:
            r2 = r5.f533r;
            if (r2 == r6) goto L_0x0055;
        L_0x0050:
            r2 = r5.f533r;
            r5.ac = r2;
            r3 = r4;
        L_0x0055:
            r2 = r5.f534s;
            if (r2 == r6) goto L_0x005e;
        L_0x0059:
            r2 = r5.f534s;
            r5.ab = r2;
            r3 = r4;
        L_0x005e:
            r2 = r5.f539x;
            if (r2 == r6) goto L_0x0066;
        L_0x0062:
            r2 = r5.f539x;
            r5.ag = r2;
        L_0x0066:
            r2 = r5.f540y;
            if (r2 == r6) goto L_0x006e;
        L_0x006a:
            r2 = r5.f540y;
            r5.af = r2;
        L_0x006e:
            r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            if (r3 == 0) goto L_0x0078;
        L_0x0072:
            r3 = r5.f541z;
            r3 = r2 - r3;
            r5.ah = r3;
        L_0x0078:
            r3 = r5.f514Y;
            if (r3 == 0) goto L_0x00da;
        L_0x007c:
            r3 = r5.f508S;
            if (r3 != r4) goto L_0x00da;
        L_0x0080:
            r3 = r5.f518c;
            r4 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
            r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
            if (r3 == 0) goto L_0x0092;
        L_0x0088:
            r3 = r5.f518c;
            r2 = r2 - r3;
            r5.ak = r2;
            r5.ai = r6;
            r5.aj = r6;
            goto L_0x00da;
        L_0x0092:
            r2 = r5.f516a;
            if (r2 == r6) goto L_0x009f;
        L_0x0096:
            r2 = r5.f516a;
            r5.aj = r2;
            r5.ai = r6;
        L_0x009c:
            r5.ak = r4;
            goto L_0x00da;
        L_0x009f:
            r2 = r5.f517b;
            if (r2 == r6) goto L_0x00da;
        L_0x00a3:
            r2 = r5.f517b;
            r5.ai = r2;
            r5.aj = r6;
            goto L_0x009c;
        L_0x00aa:
            r2 = r5.f531p;
            if (r2 == r6) goto L_0x00b2;
        L_0x00ae:
            r2 = r5.f531p;
            r5.ac = r2;
        L_0x00b2:
            r2 = r5.f532q;
            if (r2 == r6) goto L_0x00ba;
        L_0x00b6:
            r2 = r5.f532q;
            r5.ab = r2;
        L_0x00ba:
            r2 = r5.f533r;
            if (r2 == r6) goto L_0x00c2;
        L_0x00be:
            r2 = r5.f533r;
            r5.ad = r2;
        L_0x00c2:
            r2 = r5.f534s;
            if (r2 == r6) goto L_0x00ca;
        L_0x00c6:
            r2 = r5.f534s;
            r5.ae = r2;
        L_0x00ca:
            r2 = r5.f539x;
            if (r2 == r6) goto L_0x00d2;
        L_0x00ce:
            r2 = r5.f539x;
            r5.af = r2;
        L_0x00d2:
            r2 = r5.f540y;
            if (r2 == r6) goto L_0x00da;
        L_0x00d6:
            r2 = r5.f540y;
            r5.ag = r2;
        L_0x00da:
            r2 = r5.f533r;
            if (r2 != r6) goto L_0x012b;
        L_0x00de:
            r2 = r5.f534s;
            if (r2 != r6) goto L_0x012b;
        L_0x00e2:
            r2 = r5.f532q;
            if (r2 != r6) goto L_0x012b;
        L_0x00e6:
            r2 = r5.f531p;
            if (r2 != r6) goto L_0x012b;
        L_0x00ea:
            r2 = r5.f521f;
            if (r2 == r6) goto L_0x00fb;
        L_0x00ee:
            r2 = r5.f521f;
            r5.ad = r2;
            r2 = r5.rightMargin;
            if (r2 > 0) goto L_0x010a;
        L_0x00f6:
            if (r1 <= 0) goto L_0x010a;
        L_0x00f8:
            r5.rightMargin = r1;
            goto L_0x010a;
        L_0x00fb:
            r2 = r5.f522g;
            if (r2 == r6) goto L_0x010a;
        L_0x00ff:
            r2 = r5.f522g;
            r5.ae = r2;
            r2 = r5.rightMargin;
            if (r2 > 0) goto L_0x010a;
        L_0x0107:
            if (r1 <= 0) goto L_0x010a;
        L_0x0109:
            goto L_0x00f8;
        L_0x010a:
            r1 = r5.f519d;
            if (r1 == r6) goto L_0x011b;
        L_0x010e:
            r6 = r5.f519d;
            r5.ab = r6;
            r6 = r5.leftMargin;
            if (r6 > 0) goto L_0x012b;
        L_0x0116:
            if (r0 <= 0) goto L_0x012b;
        L_0x0118:
            r5.leftMargin = r0;
            return;
        L_0x011b:
            r1 = r5.f520e;
            if (r1 == r6) goto L_0x012b;
        L_0x011f:
            r6 = r5.f520e;
            r5.ac = r6;
            r6 = r5.leftMargin;
            if (r6 > 0) goto L_0x012b;
        L_0x0127:
            if (r0 <= 0) goto L_0x012b;
        L_0x0129:
            r5.leftMargin = r0;
        L_0x012b:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.a.resolveLayoutDirection(int):void");
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        m267a(null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m267a(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m267a(attributeSet);
    }

    protected static C0165a m265a() {
        return new C0165a();
    }

    private final C0174d m266a(int i) {
        if (i == 0) {
            return this.f543b;
        }
        View view = (View) this.f542a.get(i);
        return view == this ? this.f543b : view == null ? null : ((C0165a) view.getLayoutParams()).al;
    }

    private void m267a(android.util.AttributeSet r14) {
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
        r13 = this;
        r0 = r13.f543b;
        r0.f619W = r13;
        r0 = r13.f542a;
        r1 = r13.getId();
        r0.put(r1, r13);
        r0 = 0;
        r13.f557p = r0;
        if (r14 == 0) goto L_0x00e4;
    L_0x0012:
        r1 = r13.getContext();
        r2 = android.support.constraint.C0198g.C0197b.ConstraintLayout_Layout;
        r14 = r1.obtainStyledAttributes(r14, r2);
        r1 = r14.getIndexCount();
        r2 = 0;
        r3 = r2;
    L_0x0022:
        if (r3 >= r1) goto L_0x00e1;
    L_0x0024:
        r4 = r14.getIndex(r3);
        r5 = android.support.constraint.C0198g.C0197b.ConstraintLayout_Layout_android_minWidth;
        if (r4 != r5) goto L_0x0036;
    L_0x002c:
        r5 = r13.f551j;
        r4 = r14.getDimensionPixelOffset(r4, r5);
        r13.f551j = r4;
        goto L_0x00dd;
    L_0x0036:
        r5 = android.support.constraint.C0198g.C0197b.ConstraintLayout_Layout_android_minHeight;
        if (r4 != r5) goto L_0x0044;
    L_0x003a:
        r5 = r13.f552k;
        r4 = r14.getDimensionPixelOffset(r4, r5);
        r13.f552k = r4;
        goto L_0x00dd;
    L_0x0044:
        r5 = android.support.constraint.C0198g.C0197b.ConstraintLayout_Layout_android_maxWidth;
        if (r4 != r5) goto L_0x0052;
    L_0x0048:
        r5 = r13.f553l;
        r4 = r14.getDimensionPixelOffset(r4, r5);
        r13.f553l = r4;
        goto L_0x00dd;
    L_0x0052:
        r5 = android.support.constraint.C0198g.C0197b.ConstraintLayout_Layout_android_maxHeight;
        if (r4 != r5) goto L_0x0060;
    L_0x0056:
        r5 = r13.f554m;
        r4 = r14.getDimensionPixelOffset(r4, r5);
        r13.f554m = r4;
        goto L_0x00dd;
    L_0x0060:
        r5 = android.support.constraint.C0198g.C0197b.ConstraintLayout_Layout_layout_optimizationLevel;
        if (r4 != r5) goto L_0x006e;
    L_0x0064:
        r5 = r13.f556o;
        r4 = r14.getInt(r4, r5);
        r13.f556o = r4;
        goto L_0x00dd;
    L_0x006e:
        r5 = android.support.constraint.C0198g.C0197b.ConstraintLayout_Layout_constraintSet;
        if (r4 != r5) goto L_0x00dd;
    L_0x0072:
        r4 = r14.getResourceId(r4, r2);
        r5 = new android.support.constraint.c;	 Catch:{ NotFoundException -> 0x00d9 }
        r5.<init>();	 Catch:{ NotFoundException -> 0x00d9 }
        r13.f557p = r5;	 Catch:{ NotFoundException -> 0x00d9 }
        r5 = r13.f557p;	 Catch:{ NotFoundException -> 0x00d9 }
        r6 = r13.getContext();	 Catch:{ NotFoundException -> 0x00d9 }
        r7 = r6.getResources();	 Catch:{ NotFoundException -> 0x00d9 }
        r7 = r7.getXml(r4);	 Catch:{ NotFoundException -> 0x00d9 }
        r8 = r7.getEventType();	 Catch:{ XmlPullParserException -> 0x00d4, IOException -> 0x00cf }
    L_0x008f:
        r9 = 1;	 Catch:{ XmlPullParserException -> 0x00d4, IOException -> 0x00cf }
        if (r8 == r9) goto L_0x00db;	 Catch:{ XmlPullParserException -> 0x00d4, IOException -> 0x00cf }
    L_0x0092:
        if (r8 == 0) goto L_0x00c7;	 Catch:{ XmlPullParserException -> 0x00d4, IOException -> 0x00cf }
    L_0x0094:
        r10 = 2;	 Catch:{ XmlPullParserException -> 0x00d4, IOException -> 0x00cf }
        if (r8 == r10) goto L_0x0098;	 Catch:{ XmlPullParserException -> 0x00d4, IOException -> 0x00cf }
    L_0x0097:
        goto L_0x00ca;	 Catch:{ XmlPullParserException -> 0x00d4, IOException -> 0x00cf }
    L_0x0098:
        r8 = r7.getName();	 Catch:{ XmlPullParserException -> 0x00d4, IOException -> 0x00cf }
        r10 = android.util.Xml.asAttributeSet(r7);	 Catch:{ XmlPullParserException -> 0x00d4, IOException -> 0x00cf }
        r11 = new android.support.constraint.c$a;	 Catch:{ XmlPullParserException -> 0x00d4, IOException -> 0x00cf }
        r11.<init>();	 Catch:{ XmlPullParserException -> 0x00d4, IOException -> 0x00cf }
        r12 = android.support.constraint.C0198g.C0197b.ConstraintSet;	 Catch:{ XmlPullParserException -> 0x00d4, IOException -> 0x00cf }
        r10 = r6.obtainStyledAttributes(r10, r12);	 Catch:{ XmlPullParserException -> 0x00d4, IOException -> 0x00cf }
        android.support.constraint.C0192c.m387a(r11, r10);	 Catch:{ XmlPullParserException -> 0x00d4, IOException -> 0x00cf }
        r10.recycle();	 Catch:{ XmlPullParserException -> 0x00d4, IOException -> 0x00cf }
        r10 = "Guideline";	 Catch:{ XmlPullParserException -> 0x00d4, IOException -> 0x00cf }
        r8 = r8.equalsIgnoreCase(r10);	 Catch:{ XmlPullParserException -> 0x00d4, IOException -> 0x00cf }
        if (r8 == 0) goto L_0x00bb;	 Catch:{ XmlPullParserException -> 0x00d4, IOException -> 0x00cf }
    L_0x00b9:
        r11.f778a = r9;	 Catch:{ XmlPullParserException -> 0x00d4, IOException -> 0x00cf }
    L_0x00bb:
        r8 = r5.f806a;	 Catch:{ XmlPullParserException -> 0x00d4, IOException -> 0x00cf }
        r9 = r11.f781d;	 Catch:{ XmlPullParserException -> 0x00d4, IOException -> 0x00cf }
        r9 = java.lang.Integer.valueOf(r9);	 Catch:{ XmlPullParserException -> 0x00d4, IOException -> 0x00cf }
        r8.put(r9, r11);	 Catch:{ XmlPullParserException -> 0x00d4, IOException -> 0x00cf }
        goto L_0x00ca;	 Catch:{ XmlPullParserException -> 0x00d4, IOException -> 0x00cf }
    L_0x00c7:
        r7.getName();	 Catch:{ XmlPullParserException -> 0x00d4, IOException -> 0x00cf }
    L_0x00ca:
        r8 = r7.next();	 Catch:{ XmlPullParserException -> 0x00d4, IOException -> 0x00cf }
        goto L_0x008f;
    L_0x00cf:
        r5 = move-exception;
        r5.printStackTrace();	 Catch:{ NotFoundException -> 0x00d9 }
        goto L_0x00db;	 Catch:{ NotFoundException -> 0x00d9 }
    L_0x00d4:
        r5 = move-exception;	 Catch:{ NotFoundException -> 0x00d9 }
        r5.printStackTrace();	 Catch:{ NotFoundException -> 0x00d9 }
        goto L_0x00db;
    L_0x00d9:
        r13.f557p = r0;
    L_0x00db:
        r13.f558q = r4;
    L_0x00dd:
        r3 = r3 + 1;
        goto L_0x0022;
    L_0x00e1:
        r14.recycle();
    L_0x00e4:
        r14 = r13.f543b;
        r0 = r13.f556o;
        r14.as = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.a(android.util.AttributeSet):void");
    }

    private void m268a(Object obj, Object obj2) {
        if ((obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f544c == null) {
                this.f544c = new HashMap();
            }
            obj = (String) obj;
            int indexOf = obj.indexOf("/");
            if (indexOf != -1) {
                obj = obj.substring(indexOf + 1);
            }
            this.f544c.put(obj, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    private void m269b() {
        this.f543b.mo2503A();
        if (this.f561t != null) {
            C0185f c0185f = this.f561t;
            c0185f.f701c++;
        }
    }

    public final C0174d m270a(View view) {
        return view == this ? this.f543b : view == null ? null : ((C0165a) view.getLayoutParams()).al;
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0165a;
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    Object tag = childAt.getTag();
                    if (tag != null && (tag instanceof String)) {
                        String[] split = ((String) tag).split(",");
                        if (split.length == 4) {
                            int parseInt = Integer.parseInt(split[0]);
                            int parseInt2 = Integer.parseInt(split[1]);
                            parseInt = (int) ((((float) parseInt) / 1080.0f) * width);
                            parseInt2 = (int) ((((float) parseInt2) / 1920.0f) * height);
                            int parseInt3 = (int) ((((float) Integer.parseInt(split[2])) / 1080.0f) * width);
                            int parseInt4 = (int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height);
                            Paint paint = new Paint();
                            paint.setColor(-65536);
                            float f = (float) parseInt;
                            float f2 = (float) parseInt2;
                            float f3 = (float) (parseInt + parseInt3);
                            Canvas canvas2 = canvas;
                            float f4 = f2;
                            float f5 = f2;
                            f2 = f3;
                            float f6 = f;
                            Paint paint2 = paint;
                            canvas2.drawLine(f, f4, f2, f5, paint);
                            float f7 = (float) (parseInt2 + parseInt4);
                            float f8 = f3;
                            f = f7;
                            canvas2.drawLine(f8, f5, f2, f, paint);
                            f4 = f7;
                            f2 = f6;
                            canvas2.drawLine(f8, f4, f2, f, paint);
                            f8 = f6;
                            canvas2.drawLine(f8, f4, f2, f5, paint);
                            paint.setColor(-16711936);
                            f2 = f3;
                            Paint paint3 = paint;
                            canvas2.drawLine(f8, f5, f2, f7, paint);
                            canvas2.drawLine(f8, f7, f2, f5, paint);
                        }
                    }
                }
            }
        }
        ConstraintLayout constraintLayout = this;
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return new C0165a();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0165a(getContext(), attributeSet);
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0165a(layoutParams);
    }

    public int getMaxHeight() {
        return this.f554m;
    }

    public int getMaxWidth() {
        return this.f553l;
    }

    public int getMinHeight() {
        return this.f552k;
    }

    public int getMinWidth() {
        return this.f551j;
    }

    public int getOptimizationLevel() {
        return this.f543b.as;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        i2 = 0;
        for (i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0165a c0165a = (C0165a) childAt.getLayoutParams();
            C0174d c0174d = c0165a.al;
            if ((childAt.getVisibility() != 8 || c0165a.f514Y || c0165a.f515Z || isInEditMode) && !c0165a.aa) {
                int n = c0174d.m310n();
                int o = c0174d.m311o();
                int l = c0174d.m308l() + n;
                int m = c0174d.m309m() + o;
                childAt.layout(n, o, l, m);
                if (childAt instanceof C0195f) {
                    childAt = ((C0195f) childAt).getContent();
                    if (childAt != null) {
                        childAt.setVisibility(0);
                        childAt.layout(n, o, l, m);
                    }
                }
            }
        }
        childCount = this.f549h.size();
        if (childCount > 0) {
            while (i2 < childCount) {
                this.f549h.get(i2);
                i2++;
            }
        }
    }

    protected void onMeasure(int r64, int r65) {
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
        r63 = this;
        r0 = r63;
        r1 = r64;
        r2 = r65;
        java.lang.System.currentTimeMillis();
        r3 = android.view.View.MeasureSpec.getMode(r64);
        r4 = android.view.View.MeasureSpec.getSize(r64);
        r5 = android.view.View.MeasureSpec.getMode(r65);
        r6 = android.view.View.MeasureSpec.getSize(r65);
        r0.f547f = r3;
        r0.f548g = r5;
        r0.f545d = r4;
        r0.f546e = r6;
        r3 = r63.getPaddingLeft();
        r4 = r63.getPaddingTop();
        r5 = r0.f543b;
        r5.m288b(r3);
        r5 = r0.f543b;
        r5.m291c(r4);
        r5 = r0.f543b;
        r6 = r0.f553l;
        r5 = r5.f641s;
        r7 = 0;
        r5[r7] = r6;
        r5 = r0.f543b;
        r6 = r0.f554m;
        r5 = r5.f641s;
        r8 = 1;
        r5[r8] = r6;
        r5 = android.os.Build.VERSION.SDK_INT;
        r6 = 17;
        if (r5 < r6) goto L_0x0058;
    L_0x004b:
        r5 = r0.f543b;
        r9 = r63.getLayoutDirection();
        if (r9 != r8) goto L_0x0055;
    L_0x0053:
        r9 = r8;
        goto L_0x0056;
    L_0x0055:
        r9 = r7;
    L_0x0056:
        r5.f17323a = r9;
    L_0x0058:
        r5 = android.view.View.MeasureSpec.getMode(r64);
        r9 = android.view.View.MeasureSpec.getSize(r64);
        r10 = android.view.View.MeasureSpec.getMode(r65);
        r11 = android.view.View.MeasureSpec.getSize(r65);
        r12 = r63.getPaddingTop();
        r13 = r63.getPaddingBottom();
        r12 = r12 + r13;
        r13 = r63.getPaddingLeft();
        r14 = r63.getPaddingRight();
        r13 = r13 + r14;
        r14 = android.support.constraint.p026a.p027a.C0174d.C0173a.f592a;
        r15 = android.support.constraint.p026a.p027a.C0174d.C0173a.f592a;
        r63.getLayoutParams();
        r6 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r5 == r6) goto L_0x0098;
    L_0x0087:
        if (r5 == 0) goto L_0x0095;
    L_0x0089:
        if (r5 == r8) goto L_0x008d;
    L_0x008b:
        r5 = r7;
        goto L_0x009b;
    L_0x008d:
        r5 = r0.f553l;
        r5 = java.lang.Math.min(r5, r9);
        r5 = r5 - r13;
        goto L_0x009b;
    L_0x0095:
        r14 = android.support.constraint.p026a.p027a.C0174d.C0173a.f593b;
        goto L_0x008b;
    L_0x0098:
        r14 = android.support.constraint.p026a.p027a.C0174d.C0173a.f593b;
        r5 = r9;
    L_0x009b:
        if (r10 == r6) goto L_0x00af;
    L_0x009d:
        if (r10 == 0) goto L_0x00ac;
    L_0x009f:
        if (r10 == r8) goto L_0x00a3;
    L_0x00a1:
        r11 = r7;
        goto L_0x00b1;
    L_0x00a3:
        r6 = r0.f554m;
        r6 = java.lang.Math.min(r6, r11);
        r6 = r6 - r12;
        r11 = r6;
        goto L_0x00b1;
    L_0x00ac:
        r15 = android.support.constraint.p026a.p027a.C0174d.C0173a.f593b;
        goto L_0x00a1;
    L_0x00af:
        r15 = android.support.constraint.p026a.p027a.C0174d.C0173a.f593b;
    L_0x00b1:
        r6 = r0.f543b;
        r6.m299f(r7);
        r6 = r0.f543b;
        r6.m301g(r7);
        r6 = r0.f543b;
        r6.m303h(r14);
        r6 = r0.f543b;
        r6.m293d(r5);
        r5 = r0.f543b;
        r5.m305i(r15);
        r5 = r0.f543b;
        r5.m296e(r11);
        r5 = r0.f543b;
        r6 = r0.f551j;
        r9 = r63.getPaddingLeft();
        r6 = r6 - r9;
        r9 = r63.getPaddingRight();
        r6 = r6 - r9;
        r5.m299f(r6);
        r5 = r0.f543b;
        r6 = r0.f552k;
        r9 = r63.getPaddingTop();
        r6 = r6 - r9;
        r9 = r63.getPaddingBottom();
        r6 = r6 - r9;
        r5.m301g(r6);
        r5 = r0.f543b;
        r5 = r5.m308l();
        r6 = r0.f543b;
        r6 = r6.m309m();
        r9 = r0.f555n;
        r11 = 8;
        r12 = -1;
        if (r9 == 0) goto L_0x05a0;
    L_0x0104:
        r0.f555n = r7;
        r9 = r63.getChildCount();
        r13 = r7;
    L_0x010b:
        if (r13 >= r9) goto L_0x011c;
    L_0x010d:
        r14 = r0.getChildAt(r13);
        r14 = r14.isLayoutRequested();
        if (r14 == 0) goto L_0x0119;
    L_0x0117:
        r9 = 1;
        goto L_0x011d;
    L_0x0119:
        r13 = r13 + 1;
        goto L_0x010b;
    L_0x011c:
        r9 = r7;
    L_0x011d:
        if (r9 == 0) goto L_0x05a0;
    L_0x011f:
        r9 = r0.f550i;
        r9.clear();
        r9 = r63.isInEditMode();
        r13 = r63.getChildCount();
        if (r9 == 0) goto L_0x0169;
    L_0x012e:
        r14 = r7;
    L_0x012f:
        if (r14 >= r13) goto L_0x0169;
    L_0x0131:
        r15 = r0.getChildAt(r14);
        r8 = r63.getResources();	 Catch:{ NotFoundException -> 0x0164 }
        r10 = r15.getId();	 Catch:{ NotFoundException -> 0x0164 }
        r8 = r8.getResourceName(r10);	 Catch:{ NotFoundException -> 0x0164 }
        r10 = r15.getId();	 Catch:{ NotFoundException -> 0x0164 }
        r10 = java.lang.Integer.valueOf(r10);	 Catch:{ NotFoundException -> 0x0164 }
        r0.m268a(r8, r10);	 Catch:{ NotFoundException -> 0x0164 }
        r10 = 47;	 Catch:{ NotFoundException -> 0x0164 }
        r10 = r8.indexOf(r10);	 Catch:{ NotFoundException -> 0x0164 }
        if (r10 == r12) goto L_0x015a;	 Catch:{ NotFoundException -> 0x0164 }
    L_0x0154:
        r10 = r10 + 1;	 Catch:{ NotFoundException -> 0x0164 }
        r8 = r8.substring(r10);	 Catch:{ NotFoundException -> 0x0164 }
    L_0x015a:
        r10 = r15.getId();	 Catch:{ NotFoundException -> 0x0164 }
        r10 = r0.m266a(r10);	 Catch:{ NotFoundException -> 0x0164 }
        r10.f621Y = r8;	 Catch:{ NotFoundException -> 0x0164 }
    L_0x0164:
        r14 = r14 + 1;
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        goto L_0x012f;
    L_0x0169:
        r8 = r7;
    L_0x016a:
        if (r8 >= r13) goto L_0x017c;
    L_0x016c:
        r10 = r0.getChildAt(r8);
        r10 = r0.m270a(r10);
        if (r10 == 0) goto L_0x0179;
    L_0x0176:
        r10.mo61f();
    L_0x0179:
        r8 = r8 + 1;
        goto L_0x016a;
    L_0x017c:
        r8 = r0.f558q;
        if (r8 == r12) goto L_0x019e;
    L_0x0180:
        r8 = r7;
    L_0x0181:
        if (r8 >= r13) goto L_0x019e;
    L_0x0183:
        r10 = r0.getChildAt(r8);
        r14 = r10.getId();
        r15 = r0.f558q;
        if (r14 != r15) goto L_0x019b;
    L_0x018f:
        r14 = r10 instanceof android.support.constraint.C0193d;
        if (r14 == 0) goto L_0x019b;
    L_0x0193:
        r10 = (android.support.constraint.C0193d) r10;
        r10 = r10.getConstraintSet();
        r0.f557p = r10;
    L_0x019b:
        r8 = r8 + 1;
        goto L_0x0181;
    L_0x019e:
        r8 = r0.f557p;
        if (r8 == 0) goto L_0x01a7;
    L_0x01a2:
        r8 = r0.f557p;
        r8.m388a(r0);
    L_0x01a7:
        r8 = r0.f543b;
        r8.m8610E();
        r8 = r0.f549h;
        r8 = r8.size();
        if (r8 <= 0) goto L_0x01c5;
    L_0x01b4:
        r10 = r7;
    L_0x01b5:
        if (r10 >= r8) goto L_0x01c5;
    L_0x01b7:
        r14 = r0.f549h;
        r14 = r14.get(r10);
        r14 = (android.support.constraint.C0190b) r14;
        r14.m382a(r0);
        r10 = r10 + 1;
        goto L_0x01b5;
    L_0x01c5:
        r8 = r7;
    L_0x01c6:
        if (r8 >= r13) goto L_0x0203;
    L_0x01c8:
        r10 = r0.getChildAt(r8);
        r14 = r10 instanceof android.support.constraint.C0195f;
        if (r14 == 0) goto L_0x0200;
    L_0x01d0:
        r10 = (android.support.constraint.C0195f) r10;
        r14 = r10.f808a;
        if (r14 != r12) goto L_0x01e1;
    L_0x01d6:
        r14 = r10.isInEditMode();
        if (r14 != 0) goto L_0x01e1;
    L_0x01dc:
        r14 = r10.f810c;
        r10.setVisibility(r14);
    L_0x01e1:
        r14 = r10.f808a;
        r14 = r0.findViewById(r14);
        r10.f809b = r14;
        r14 = r10.f809b;
        if (r14 == 0) goto L_0x0200;
    L_0x01ed:
        r14 = r10.f809b;
        r14 = r14.getLayoutParams();
        r14 = (android.support.constraint.ConstraintLayout.C0165a) r14;
        r15 = 1;
        r14.aa = r15;
        r14 = r10.f809b;
        r14.setVisibility(r7);
        r10.setVisibility(r7);
    L_0x0200:
        r8 = r8 + 1;
        goto L_0x01c6;
    L_0x0203:
        r8 = r7;
    L_0x0204:
        if (r8 >= r13) goto L_0x05a0;
    L_0x0206:
        r10 = r0.getChildAt(r8);
        r14 = r0.m270a(r10);
        if (r14 == 0) goto L_0x058c;
    L_0x0210:
        r15 = r10.getLayoutParams();
        r15 = (android.support.constraint.ConstraintLayout.C0165a) r15;
        r15.m264a();
        r12 = r15.am;
        if (r12 == 0) goto L_0x0220;
    L_0x021d:
        r15.am = r7;
        goto L_0x024f;
    L_0x0220:
        if (r9 == 0) goto L_0x024f;
    L_0x0222:
        r12 = r63.getResources();	 Catch:{ NotFoundException -> 0x024f }
        r7 = r10.getId();	 Catch:{ NotFoundException -> 0x024f }
        r7 = r12.getResourceName(r7);	 Catch:{ NotFoundException -> 0x024f }
        r12 = r10.getId();	 Catch:{ NotFoundException -> 0x024f }
        r12 = java.lang.Integer.valueOf(r12);	 Catch:{ NotFoundException -> 0x024f }
        r0.m268a(r7, r12);	 Catch:{ NotFoundException -> 0x024f }
        r12 = "id/";	 Catch:{ NotFoundException -> 0x024f }
        r12 = r7.indexOf(r12);	 Catch:{ NotFoundException -> 0x024f }
        r12 = r12 + 3;	 Catch:{ NotFoundException -> 0x024f }
        r7 = r7.substring(r12);	 Catch:{ NotFoundException -> 0x024f }
        r12 = r10.getId();	 Catch:{ NotFoundException -> 0x024f }
        r12 = r0.m266a(r12);	 Catch:{ NotFoundException -> 0x024f }
        r12.f621Y = r7;	 Catch:{ NotFoundException -> 0x024f }
    L_0x024f:
        r7 = r10.getVisibility();
        r14.f620X = r7;
        r7 = r15.aa;
        if (r7 == 0) goto L_0x025b;
    L_0x0259:
        r14.f620X = r11;
    L_0x025b:
        r14.f619W = r10;
        r7 = r0.f543b;
        r7.m8611a(r14);
        r7 = r15.f512W;
        if (r7 == 0) goto L_0x026a;
    L_0x0266:
        r7 = r15.f511V;
        if (r7 != 0) goto L_0x026f;
    L_0x026a:
        r7 = r0.f550i;
        r7.add(r14);
    L_0x026f:
        r7 = r15.f514Y;
        if (r7 == 0) goto L_0x02a6;
    L_0x0273:
        r14 = (android.support.constraint.p026a.p027a.C4700f) r14;
        r7 = r15.ai;
        r10 = r15.aj;
        r12 = r15.ak;
        r11 = android.os.Build.VERSION.SDK_INT;
        r25 = r7;
        r7 = 17;
        if (r11 >= r7) goto L_0x028a;
    L_0x0283:
        r7 = r15.f516a;
        r10 = r15.f517b;
        r12 = r15.f518c;
        goto L_0x028c;
    L_0x028a:
        r7 = r25;
    L_0x028c:
        r11 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r11 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1));
        if (r11 == 0) goto L_0x0297;
    L_0x0292:
        r14.m8585a(r12);
        goto L_0x058c;
    L_0x0297:
        r11 = -1;
        if (r7 == r11) goto L_0x029f;
    L_0x029a:
        r14.m8590k(r7);
        goto L_0x058c;
    L_0x029f:
        if (r10 == r11) goto L_0x058c;
    L_0x02a1:
        r14.m8591l(r10);
        goto L_0x058c;
    L_0x02a6:
        r11 = -1;
        r7 = r15.f519d;
        if (r7 != r11) goto L_0x02ef;
    L_0x02ab:
        r7 = r15.f520e;
        if (r7 != r11) goto L_0x02ef;
    L_0x02af:
        r7 = r15.f521f;
        if (r7 != r11) goto L_0x02ef;
    L_0x02b3:
        r7 = r15.f522g;
        if (r7 != r11) goto L_0x02ef;
    L_0x02b7:
        r7 = r15.f532q;
        if (r7 != r11) goto L_0x02ef;
    L_0x02bb:
        r7 = r15.f531p;
        if (r7 != r11) goto L_0x02ef;
    L_0x02bf:
        r7 = r15.f533r;
        if (r7 != r11) goto L_0x02ef;
    L_0x02c3:
        r7 = r15.f534s;
        if (r7 != r11) goto L_0x02ef;
    L_0x02c7:
        r7 = r15.f523h;
        if (r7 != r11) goto L_0x02ef;
    L_0x02cb:
        r7 = r15.f524i;
        if (r7 != r11) goto L_0x02ef;
    L_0x02cf:
        r7 = r15.f525j;
        if (r7 != r11) goto L_0x02ef;
    L_0x02d3:
        r7 = r15.f526k;
        if (r7 != r11) goto L_0x02ef;
    L_0x02d7:
        r7 = r15.f527l;
        if (r7 != r11) goto L_0x02ef;
    L_0x02db:
        r7 = r15.f506Q;
        if (r7 != r11) goto L_0x02ef;
    L_0x02df:
        r7 = r15.f507R;
        if (r7 != r11) goto L_0x02ef;
    L_0x02e3:
        r7 = r15.f528m;
        if (r7 != r11) goto L_0x02ef;
    L_0x02e7:
        r7 = r15.width;
        if (r7 == r11) goto L_0x02ef;
    L_0x02eb:
        r7 = r15.height;
        if (r7 != r11) goto L_0x058c;
    L_0x02ef:
        r7 = r15.ab;
        r10 = r15.ac;
        r11 = r15.ad;
        r12 = r15.ae;
        r26 = r7;
        r7 = r15.af;
        r27 = r7;
        r7 = r15.ag;
        r28 = r7;
        r7 = r15.ah;
        r29 = r7;
        r7 = android.os.Build.VERSION.SDK_INT;
        r30 = r10;
        r10 = 17;
        if (r7 >= r10) goto L_0x0368;
    L_0x030d:
        r7 = r15.f519d;
        r11 = r15.f520e;
        r12 = r15.f521f;
        r10 = r15.f522g;
        r31 = r13;
        r13 = r15.f535t;
        r32 = r13;
        r13 = r15.f537v;
        r33 = r13;
        r13 = r15.f541z;
        r34 = r13;
        r13 = -1;
        if (r7 != r13) goto L_0x0339;
    L_0x0326:
        if (r11 != r13) goto L_0x0339;
    L_0x0328:
        r35 = r7;
        r7 = r15.f532q;
        if (r7 == r13) goto L_0x0331;
    L_0x032e:
        r7 = r15.f532q;
        goto L_0x033d;
    L_0x0331:
        r7 = r15.f531p;
        if (r7 == r13) goto L_0x033b;
    L_0x0335:
        r7 = r15.f531p;
        r11 = r7;
        goto L_0x033b;
    L_0x0339:
        r35 = r7;
    L_0x033b:
        r7 = r35;
    L_0x033d:
        if (r12 != r13) goto L_0x035b;
    L_0x033f:
        if (r10 != r13) goto L_0x035b;
    L_0x0341:
        r36 = r7;
        r7 = r15.f533r;
        if (r7 == r13) goto L_0x034f;
    L_0x0347:
        r7 = r15.f533r;
        r37 = r3;
        r38 = r4;
        r12 = r7;
        goto L_0x0361;
    L_0x034f:
        r7 = r15.f534s;
        if (r7 == r13) goto L_0x035d;
    L_0x0353:
        r7 = r15.f534s;
        r37 = r3;
        r38 = r4;
        r10 = r7;
        goto L_0x0361;
    L_0x035b:
        r36 = r7;
    L_0x035d:
        r37 = r3;
        r38 = r4;
    L_0x0361:
        r24 = r32;
        r3 = r34;
        r7 = r36;
        goto L_0x037b;
    L_0x0368:
        r31 = r13;
        r13 = -1;
        r37 = r3;
        r38 = r4;
        r10 = r12;
        r7 = r26;
        r24 = r27;
        r33 = r28;
        r3 = r29;
        r12 = r11;
        r11 = r30;
    L_0x037b:
        r4 = r15.f528m;
        if (r4 == r13) goto L_0x039c;
    L_0x037f:
        r3 = r15.f528m;
        r21 = r0.m266a(r3);
        if (r21 == 0) goto L_0x04ba;
    L_0x0387:
        r3 = r15.f530o;
        r4 = r15.f529n;
        r20 = android.support.constraint.p026a.p027a.C0171c.C0170c.CENTER;
        r22 = android.support.constraint.p026a.p027a.C0171c.C0170c.CENTER;
        r24 = 0;
        r19 = r14;
        r23 = r4;
        r19.m282a(r20, r21, r22, r23, r24);
        r14.f642t = r3;
        goto L_0x04ba;
    L_0x039c:
        r4 = r13;
        if (r7 == r4) goto L_0x03ac;
    L_0x039f:
        r21 = r0.m266a(r7);
        if (r21 == 0) goto L_0x03aa;
    L_0x03a5:
        r20 = android.support.constraint.p026a.p027a.C0171c.C0170c.LEFT;
        r22 = android.support.constraint.p026a.p027a.C0171c.C0170c.LEFT;
        goto L_0x03b8;
    L_0x03aa:
        r4 = -1;
        goto L_0x03c2;
    L_0x03ac:
        if (r11 == r4) goto L_0x03c2;
    L_0x03ae:
        r21 = r0.m266a(r11);
        if (r21 == 0) goto L_0x03aa;
    L_0x03b4:
        r20 = android.support.constraint.p026a.p027a.C0171c.C0170c.LEFT;
        r22 = android.support.constraint.p026a.p027a.C0171c.C0170c.RIGHT;
    L_0x03b8:
        r4 = r15.leftMargin;
        r19 = r14;
        r23 = r4;
        r19.m282a(r20, r21, r22, r23, r24);
        goto L_0x03aa;
    L_0x03c2:
        if (r12 == r4) goto L_0x03cf;
    L_0x03c4:
        r21 = r0.m266a(r12);
        if (r21 == 0) goto L_0x03e6;
    L_0x03ca:
        r20 = android.support.constraint.p026a.p027a.C0171c.C0170c.RIGHT;
        r22 = android.support.constraint.p026a.p027a.C0171c.C0170c.LEFT;
        goto L_0x03db;
    L_0x03cf:
        if (r10 == r4) goto L_0x03e6;
    L_0x03d1:
        r21 = r0.m266a(r10);
        if (r21 == 0) goto L_0x03e6;
    L_0x03d7:
        r20 = android.support.constraint.p026a.p027a.C0171c.C0170c.RIGHT;
        r22 = android.support.constraint.p026a.p027a.C0171c.C0170c.RIGHT;
    L_0x03db:
        r4 = r15.rightMargin;
        r19 = r14;
        r23 = r4;
        r24 = r33;
        r19.m282a(r20, r21, r22, r23, r24);
    L_0x03e6:
        r4 = r15.f523h;
        r7 = -1;
        if (r4 == r7) goto L_0x03f8;
    L_0x03eb:
        r4 = r15.f523h;
        r21 = r0.m266a(r4);
        if (r21 == 0) goto L_0x0416;
    L_0x03f3:
        r20 = android.support.constraint.p026a.p027a.C0171c.C0170c.TOP;
        r22 = android.support.constraint.p026a.p027a.C0171c.C0170c.TOP;
        goto L_0x0409;
    L_0x03f8:
        r4 = r15.f524i;
        r7 = -1;
        if (r4 == r7) goto L_0x0416;
    L_0x03fd:
        r4 = r15.f524i;
        r21 = r0.m266a(r4);
        if (r21 == 0) goto L_0x0416;
    L_0x0405:
        r20 = android.support.constraint.p026a.p027a.C0171c.C0170c.TOP;
        r22 = android.support.constraint.p026a.p027a.C0171c.C0170c.BOTTOM;
    L_0x0409:
        r4 = r15.topMargin;
        r7 = r15.f536u;
        r19 = r14;
        r23 = r4;
        r24 = r7;
        r19.m282a(r20, r21, r22, r23, r24);
    L_0x0416:
        r4 = r15.f525j;
        r7 = -1;
        if (r4 == r7) goto L_0x0428;
    L_0x041b:
        r4 = r15.f525j;
        r21 = r0.m266a(r4);
        if (r21 == 0) goto L_0x0446;
    L_0x0423:
        r20 = android.support.constraint.p026a.p027a.C0171c.C0170c.BOTTOM;
        r22 = android.support.constraint.p026a.p027a.C0171c.C0170c.TOP;
        goto L_0x0439;
    L_0x0428:
        r4 = r15.f526k;
        r7 = -1;
        if (r4 == r7) goto L_0x0446;
    L_0x042d:
        r4 = r15.f526k;
        r21 = r0.m266a(r4);
        if (r21 == 0) goto L_0x0446;
    L_0x0435:
        r20 = android.support.constraint.p026a.p027a.C0171c.C0170c.BOTTOM;
        r22 = android.support.constraint.p026a.p027a.C0171c.C0170c.BOTTOM;
    L_0x0439:
        r4 = r15.bottomMargin;
        r7 = r15.f538w;
        r19 = r14;
        r23 = r4;
        r24 = r7;
        r19.m282a(r20, r21, r22, r23, r24);
    L_0x0446:
        r4 = r15.f527l;
        r7 = -1;
        if (r4 == r7) goto L_0x049d;
    L_0x044b:
        r4 = r0.f542a;
        r7 = r15.f527l;
        r4 = r4.get(r7);
        r4 = (android.view.View) r4;
        r7 = r15.f527l;
        r7 = r0.m266a(r7);
        if (r7 == 0) goto L_0x049d;
    L_0x045d:
        if (r4 == 0) goto L_0x049d;
    L_0x045f:
        r10 = r4.getLayoutParams();
        r10 = r10 instanceof android.support.constraint.ConstraintLayout.C0165a;
        if (r10 == 0) goto L_0x049d;
    L_0x0467:
        r4 = r4.getLayoutParams();
        r4 = (android.support.constraint.ConstraintLayout.C0165a) r4;
        r10 = 1;
        r15.f513X = r10;
        r4.f513X = r10;
        r4 = android.support.constraint.p026a.p027a.C0171c.C0170c.BASELINE;
        r39 = r14.mo51a(r4);
        r4 = android.support.constraint.p026a.p027a.C0171c.C0170c.BASELINE;
        r40 = r7.mo51a(r4);
        r41 = 0;
        r42 = -1;
        r43 = android.support.constraint.p026a.p027a.C0171c.C0169b.f567b;
        r44 = 0;
        r45 = 1;
        r39.m273a(r40, r41, r42, r43, r44, r45);
        r4 = android.support.constraint.p026a.p027a.C0171c.C0170c.TOP;
        r4 = r14.mo51a(r4);
        r4.m275c();
        r4 = android.support.constraint.p026a.p027a.C0171c.C0170c.BOTTOM;
        r4 = r14.mo51a(r4);
        r4.m275c();
    L_0x049d:
        r4 = 0;
        r7 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        r10 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        if (r7 < 0) goto L_0x04aa;
    L_0x04a4:
        r7 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1));
        if (r7 == 0) goto L_0x04aa;
    L_0x04a8:
        r14.f617U = r3;
    L_0x04aa:
        r3 = r15.f490A;
        r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        if (r3 < 0) goto L_0x04ba;
    L_0x04b0:
        r3 = r15.f490A;
        r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1));
        if (r3 == 0) goto L_0x04ba;
    L_0x04b6:
        r3 = r15.f490A;
        r14.f618V = r3;
    L_0x04ba:
        if (r9 == 0) goto L_0x04cc;
    L_0x04bc:
        r3 = r15.f506Q;
        r4 = -1;
        if (r3 != r4) goto L_0x04c5;
    L_0x04c1:
        r3 = r15.f507R;
        if (r3 == r4) goto L_0x04cc;
    L_0x04c5:
        r3 = r15.f506Q;
        r4 = r15.f507R;
        r14.m281a(r3, r4);
    L_0x04cc:
        r3 = r15.f511V;
        if (r3 != 0) goto L_0x04f6;
    L_0x04d0:
        r3 = r15.width;
        r4 = -1;
        if (r3 != r4) goto L_0x04ef;
    L_0x04d5:
        r3 = android.support.constraint.p026a.p027a.C0174d.C0173a.f595d;
        r14.m303h(r3);
        r3 = android.support.constraint.p026a.p027a.C0171c.C0170c.LEFT;
        r3 = r14.mo51a(r3);
        r4 = r15.leftMargin;
        r3.f584e = r4;
        r3 = android.support.constraint.p026a.p027a.C0171c.C0170c.RIGHT;
        r3 = r14.mo51a(r3);
        r4 = r15.rightMargin;
        r3.f584e = r4;
        goto L_0x0500;
    L_0x04ef:
        r3 = android.support.constraint.p026a.p027a.C0174d.C0173a.f594c;
        r14.m303h(r3);
        r3 = 0;
        goto L_0x04fd;
    L_0x04f6:
        r3 = android.support.constraint.p026a.p027a.C0174d.C0173a.f592a;
        r14.m303h(r3);
        r3 = r15.width;
    L_0x04fd:
        r14.m293d(r3);
    L_0x0500:
        r3 = r15.f512W;
        if (r3 != 0) goto L_0x052a;
    L_0x0504:
        r3 = r15.height;
        r4 = -1;
        if (r3 != r4) goto L_0x0523;
    L_0x0509:
        r3 = android.support.constraint.p026a.p027a.C0174d.C0173a.f595d;
        r14.m305i(r3);
        r3 = android.support.constraint.p026a.p027a.C0171c.C0170c.TOP;
        r3 = r14.mo51a(r3);
        r4 = r15.topMargin;
        r3.f584e = r4;
        r3 = android.support.constraint.p026a.p027a.C0171c.C0170c.BOTTOM;
        r3 = r14.mo51a(r3);
        r4 = r15.bottomMargin;
        r3.f584e = r4;
        goto L_0x0534;
    L_0x0523:
        r3 = android.support.constraint.p026a.p027a.C0174d.C0173a.f594c;
        r14.m305i(r3);
        r3 = 0;
        goto L_0x0531;
    L_0x052a:
        r3 = android.support.constraint.p026a.p027a.C0174d.C0173a.f592a;
        r14.m305i(r3);
        r3 = r15.height;
    L_0x0531:
        r14.m296e(r3);
    L_0x0534:
        r3 = r15.f491B;
        if (r3 == 0) goto L_0x053d;
    L_0x0538:
        r3 = r15.f491B;
        r14.m285a(r3);
    L_0x053d:
        r3 = r15.f494E;
        r4 = r14.af;
        r7 = 0;
        r4[r7] = r3;
        r3 = r15.f495F;
        r4 = r14.af;
        r7 = 1;
        r4[r7] = r3;
        r3 = r15.f496G;
        r14.ab = r3;
        r3 = r15.f497H;
        r14.ac = r3;
        r3 = r15.f498I;
        r4 = r15.f500K;
        r7 = r15.f502M;
        r10 = r15.f504O;
        r14.f629g = r3;
        r14.f631i = r4;
        r14.f632j = r7;
        r14.f633k = r10;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r4 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1));
        if (r4 >= 0) goto L_0x0570;
    L_0x0569:
        r4 = r14.f629g;
        if (r4 != 0) goto L_0x0570;
    L_0x056d:
        r4 = 2;
        r14.f629g = r4;
    L_0x0570:
        r4 = r15.f499J;
        r7 = r15.f501L;
        r10 = r15.f503N;
        r11 = r15.f505P;
        r14.f630h = r4;
        r14.f634l = r7;
        r14.f635m = r10;
        r14.f636n = r11;
        r3 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1));
        if (r3 >= 0) goto L_0x0592;
    L_0x0584:
        r3 = r14.f630h;
        if (r3 != 0) goto L_0x0592;
    L_0x0588:
        r3 = 2;
        r14.f630h = r3;
        goto L_0x0592;
    L_0x058c:
        r37 = r3;
        r38 = r4;
        r31 = r13;
    L_0x0592:
        r8 = r8 + 1;
        r13 = r31;
        r3 = r37;
        r4 = r38;
        r7 = 0;
        r11 = 8;
        r12 = -1;
        goto L_0x0204;
    L_0x05a0:
        r37 = r3;
        r38 = r4;
        r3 = r0.f556o;
        r4 = 8;
        r3 = r3 & r4;
        if (r3 != r4) goto L_0x05ad;
    L_0x05ab:
        r3 = 1;
        goto L_0x05ae;
    L_0x05ad:
        r3 = 0;
    L_0x05ae:
        r4 = -2;
        if (r3 == 0) goto L_0x0890;
    L_0x05b1:
        r9 = r0.f543b;
        r9.m14862C();
        r10 = r9.as;
        r9.mo52a(r10);
        r9 = r0.f543b;
        r9.m14865e(r5, r6);
        r9 = r63.getPaddingTop();
        r10 = r63.getPaddingBottom();
        r9 = r9 + r10;
        r10 = r63.getPaddingLeft();
        r11 = r63.getPaddingRight();
        r10 = r10 + r11;
        r11 = r63.getChildCount();
        r12 = 0;
    L_0x05d7:
        if (r12 >= r11) goto L_0x06aa;
    L_0x05d9:
        r13 = r0.getChildAt(r12);
        r14 = r13.getVisibility();
        r15 = 8;
        if (r14 == r15) goto L_0x0697;
    L_0x05e5:
        r14 = r13.getLayoutParams();
        r14 = (android.support.constraint.ConstraintLayout.C0165a) r14;
        r15 = r14.al;
        r7 = r14.f514Y;
        if (r7 != 0) goto L_0x0697;
    L_0x05f1:
        r7 = r14.f515Z;
        if (r7 != 0) goto L_0x0697;
    L_0x05f5:
        r7 = r13.getVisibility();
        r15.f620X = r7;
        r7 = r14.width;
        r8 = r14.height;
        if (r7 == 0) goto L_0x0682;
    L_0x0601:
        if (r8 != 0) goto L_0x0605;
    L_0x0603:
        goto L_0x0682;
    L_0x0605:
        if (r7 != r4) goto L_0x060c;
    L_0x0607:
        r46 = r6;
        r16 = 1;
        goto L_0x0610;
    L_0x060c:
        r46 = r6;
        r16 = 0;
    L_0x0610:
        r6 = getChildMeasureSpec(r1, r10, r7);
        if (r8 != r4) goto L_0x0619;
    L_0x0616:
        r19 = 1;
        goto L_0x061b;
    L_0x0619:
        r19 = 0;
    L_0x061b:
        r4 = getChildMeasureSpec(r2, r9, r8);
        r13.measure(r6, r4);
        r4 = r0.f561t;
        if (r4 == 0) goto L_0x0635;
    L_0x0626:
        r4 = r0.f561t;
        r47 = r5;
        r5 = r4.f699a;
        r48 = r3;
        r20 = 1;
        r2 = r5 + r20;
        r4.f699a = r2;
        goto L_0x0639;
    L_0x0635:
        r48 = r3;
        r47 = r5;
    L_0x0639:
        r2 = -2;
        if (r7 != r2) goto L_0x063e;
    L_0x063c:
        r3 = 1;
        goto L_0x063f;
    L_0x063e:
        r3 = 0;
    L_0x063f:
        r15.f637o = r3;
        if (r8 != r2) goto L_0x0645;
    L_0x0643:
        r2 = 1;
        goto L_0x0646;
    L_0x0645:
        r2 = 0;
    L_0x0646:
        r15.f638p = r2;
        r2 = r13.getMeasuredWidth();
        r3 = r13.getMeasuredHeight();
        r15.m293d(r2);
        r15.m296e(r3);
        if (r16 == 0) goto L_0x065a;
    L_0x0658:
        r15.f615R = r2;
    L_0x065a:
        if (r19 == 0) goto L_0x065e;
    L_0x065c:
        r15.f616S = r3;
    L_0x065e:
        r4 = r14.f513X;
        if (r4 == 0) goto L_0x066b;
    L_0x0662:
        r4 = r13.getBaseline();
        r5 = -1;
        if (r4 == r5) goto L_0x066b;
    L_0x0669:
        r15.f612O = r4;
    L_0x066b:
        r4 = r14.f511V;
        if (r4 == 0) goto L_0x069d;
    L_0x066f:
        r4 = r14.f512W;
        if (r4 == 0) goto L_0x069d;
    L_0x0673:
        r4 = r15.m302h();
        r4.m8606a(r2);
        r2 = r15.m304i();
        r2.m8606a(r3);
        goto L_0x069d;
    L_0x0682:
        r48 = r3;
        r47 = r5;
        r46 = r6;
        r2 = r15.m302h();
        r2.m330c();
        r2 = r15.m304i();
        r2.m330c();
        goto L_0x069d;
    L_0x0697:
        r48 = r3;
        r47 = r5;
        r46 = r6;
    L_0x069d:
        r12 = r12 + 1;
        r6 = r46;
        r5 = r47;
        r3 = r48;
        r2 = r65;
        r4 = -2;
        goto L_0x05d7;
    L_0x06aa:
        r48 = r3;
        r47 = r5;
        r46 = r6;
        r2 = r0.f543b;
        r2.m14861B();
        r2 = 0;
    L_0x06b6:
        if (r2 >= r11) goto L_0x088b;
    L_0x06b8:
        r3 = r0.getChildAt(r2);
        r4 = r3.getVisibility();
        r5 = 8;
        if (r4 == r5) goto L_0x0874;
    L_0x06c4:
        r4 = r3.getLayoutParams();
        r4 = (android.support.constraint.ConstraintLayout.C0165a) r4;
        r5 = r4.al;
        r6 = r4.f514Y;
        if (r6 != 0) goto L_0x0874;
    L_0x06d0:
        r6 = r4.f515Z;
        if (r6 != 0) goto L_0x0874;
    L_0x06d4:
        r6 = r3.getVisibility();
        r5.f620X = r6;
        r6 = r4.width;
        r7 = r4.height;
        if (r6 == 0) goto L_0x06e2;
    L_0x06e0:
        if (r7 != 0) goto L_0x0874;
    L_0x06e2:
        r8 = android.support.constraint.p026a.p027a.C0171c.C0170c.LEFT;
        r8 = r5.mo51a(r8);
        r8 = r8.f580a;
        r12 = android.support.constraint.p026a.p027a.C0171c.C0170c.RIGHT;
        r12 = r5.mo51a(r12);
        r12 = r12.f580a;
        r13 = android.support.constraint.p026a.p027a.C0171c.C0170c.LEFT;
        r13 = r5.mo51a(r13);
        r13 = r13.f583d;
        if (r13 == 0) goto L_0x0708;
    L_0x06fc:
        r13 = android.support.constraint.p026a.p027a.C0171c.C0170c.RIGHT;
        r13 = r5.mo51a(r13);
        r13 = r13.f583d;
        if (r13 == 0) goto L_0x0708;
    L_0x0706:
        r13 = 1;
        goto L_0x0709;
    L_0x0708:
        r13 = 0;
    L_0x0709:
        r14 = android.support.constraint.p026a.p027a.C0171c.C0170c.TOP;
        r14 = r5.mo51a(r14);
        r14 = r14.f580a;
        r15 = android.support.constraint.p026a.p027a.C0171c.C0170c.BOTTOM;
        r15 = r5.mo51a(r15);
        r15 = r15.f580a;
        r49 = r11;
        r11 = android.support.constraint.p026a.p027a.C0171c.C0170c.TOP;
        r11 = r5.mo51a(r11);
        r11 = r11.f583d;
        if (r11 == 0) goto L_0x0731;
    L_0x0725:
        r11 = android.support.constraint.p026a.p027a.C0171c.C0170c.BOTTOM;
        r11 = r5.mo51a(r11);
        r11 = r11.f583d;
        if (r11 == 0) goto L_0x0731;
    L_0x072f:
        r11 = 1;
        goto L_0x0732;
    L_0x0731:
        r11 = 0;
    L_0x0732:
        if (r6 != 0) goto L_0x0744;
    L_0x0734:
        if (r7 != 0) goto L_0x0744;
    L_0x0736:
        if (r13 == 0) goto L_0x0744;
    L_0x0738:
        if (r11 != 0) goto L_0x073b;
    L_0x073a:
        goto L_0x0744;
    L_0x073b:
        r12 = r0;
        r50 = r2;
        r52 = r9;
        r53 = r10;
        goto L_0x087d;
    L_0x0744:
        r50 = r2;
        r2 = r0.f543b;
        r2 = r2.m320x();
        r51 = r4;
        r4 = android.support.constraint.p026a.p027a.C0174d.C0173a.f593b;
        if (r2 == r4) goto L_0x0754;
    L_0x0752:
        r2 = 1;
        goto L_0x0755;
    L_0x0754:
        r2 = 0;
    L_0x0755:
        r4 = r0.f543b;
        r4 = r4.m321y();
        r0 = android.support.constraint.p026a.p027a.C0174d.C0173a.f593b;
        if (r4 == r0) goto L_0x0761;
    L_0x075f:
        r0 = 1;
        goto L_0x0762;
    L_0x0761:
        r0 = 0;
    L_0x0762:
        if (r2 != 0) goto L_0x076b;
    L_0x0764:
        r4 = r5.m302h();
        r4.m330c();
    L_0x076b:
        if (r0 != 0) goto L_0x0774;
    L_0x076d:
        r4 = r5.m304i();
        r4.m330c();
    L_0x0774:
        if (r6 != 0) goto L_0x07a3;
    L_0x0776:
        if (r2 == 0) goto L_0x079a;
    L_0x0778:
        r4 = r5.m295d();
        if (r4 == 0) goto L_0x079a;
    L_0x077e:
        if (r13 == 0) goto L_0x079a;
    L_0x0780:
        r4 = r8.m332e();
        if (r4 == 0) goto L_0x079a;
    L_0x0786:
        r4 = r12.m332e();
        if (r4 == 0) goto L_0x079a;
    L_0x078c:
        r4 = r12.f12920f;
        r6 = r8.f12920f;
        r4 = r4 - r6;
        r6 = (int) r4;
        r4 = r5.m302h();
        r4.m8606a(r6);
        goto L_0x07b1;
    L_0x079a:
        r4 = -2;
        r2 = getChildMeasureSpec(r1, r10, r4);
        r12 = r2;
        r2 = 0;
        r4 = 1;
        goto L_0x07b7;
    L_0x07a3:
        r4 = -2;
        r8 = -1;
        if (r6 != r8) goto L_0x07ad;
    L_0x07a7:
        r12 = getChildMeasureSpec(r1, r10, r8);
        r4 = 0;
        goto L_0x07b7;
    L_0x07ad:
        if (r6 != r4) goto L_0x07b1;
    L_0x07af:
        r4 = 1;
        goto L_0x07b2;
    L_0x07b1:
        r4 = 0;
    L_0x07b2:
        r8 = getChildMeasureSpec(r1, r10, r6);
        r12 = r8;
    L_0x07b7:
        if (r7 != 0) goto L_0x07ea;
    L_0x07b9:
        if (r0 == 0) goto L_0x07df;
    L_0x07bb:
        r8 = r5.m297e();
        if (r8 == 0) goto L_0x07df;
    L_0x07c1:
        if (r11 == 0) goto L_0x07df;
    L_0x07c3:
        r8 = r14.m332e();
        if (r8 == 0) goto L_0x07df;
    L_0x07c9:
        r8 = r15.m332e();
        if (r8 == 0) goto L_0x07df;
    L_0x07cf:
        r7 = r15.f12920f;
        r8 = r14.f12920f;
        r7 = r7 - r8;
        r7 = (int) r7;
        r8 = r5.m304i();
        r8.m8606a(r7);
        r8 = r65;
        goto L_0x07fb;
    L_0x07df:
        r8 = r65;
        r11 = -2;
        r0 = getChildMeasureSpec(r8, r9, r11);
        r13 = r0;
        r0 = 0;
        r11 = 1;
        goto L_0x0800;
    L_0x07ea:
        r8 = r65;
        r11 = -2;
        r13 = -1;
        if (r7 != r13) goto L_0x07f7;
    L_0x07f0:
        r14 = getChildMeasureSpec(r8, r9, r13);
        r13 = r14;
        r11 = 0;
        goto L_0x0800;
    L_0x07f7:
        if (r7 != r11) goto L_0x07fb;
    L_0x07f9:
        r11 = 1;
        goto L_0x07fc;
    L_0x07fb:
        r11 = 0;
    L_0x07fc:
        r13 = getChildMeasureSpec(r8, r9, r7);
    L_0x0800:
        r3.measure(r12, r13);
        r12 = r63;
        r13 = r12.f561t;
        if (r13 == 0) goto L_0x0818;
    L_0x0809:
        r13 = r12.f561t;
        r14 = r13.f699a;
        r52 = r9;
        r53 = r10;
        r19 = 1;
        r9 = r14 + r19;
        r13.f699a = r9;
        goto L_0x081c;
    L_0x0818:
        r52 = r9;
        r53 = r10;
    L_0x081c:
        r9 = -2;
        if (r6 != r9) goto L_0x0821;
    L_0x081f:
        r6 = 1;
        goto L_0x0822;
    L_0x0821:
        r6 = 0;
    L_0x0822:
        r5.f637o = r6;
        if (r7 != r9) goto L_0x0828;
    L_0x0826:
        r6 = 1;
        goto L_0x0829;
    L_0x0828:
        r6 = 0;
    L_0x0829:
        r5.f638p = r6;
        r6 = r3.getMeasuredWidth();
        r7 = r3.getMeasuredHeight();
        r5.m293d(r6);
        r5.m296e(r7);
        if (r4 == 0) goto L_0x083d;
    L_0x083b:
        r5.f615R = r6;
    L_0x083d:
        if (r11 == 0) goto L_0x0841;
    L_0x083f:
        r5.f616S = r7;
    L_0x0841:
        if (r2 == 0) goto L_0x084c;
    L_0x0843:
        r2 = r5.m302h();
        r2.m8606a(r6);
        r4 = 2;
        goto L_0x0853;
    L_0x084c:
        r2 = r5.m302h();
        r4 = 2;
        r2.i = r4;
    L_0x0853:
        if (r0 == 0) goto L_0x085f;
    L_0x0855:
        r0 = r5.m304i();
        r0.m8606a(r7);
    L_0x085c:
        r0 = r51;
        goto L_0x0866;
    L_0x085f:
        r0 = r5.m304i();
        r0.i = r4;
        goto L_0x085c;
    L_0x0866:
        r0 = r0.f513X;
        if (r0 == 0) goto L_0x0880;
    L_0x086a:
        r0 = r3.getBaseline();
        r2 = -1;
        if (r0 == r2) goto L_0x0880;
    L_0x0871:
        r5.f612O = r0;
        goto L_0x0880;
    L_0x0874:
        r12 = r0;
        r50 = r2;
        r52 = r9;
        r53 = r10;
        r49 = r11;
    L_0x087d:
        r4 = 2;
        r8 = r65;
    L_0x0880:
        r2 = r50 + 1;
        r0 = r12;
        r11 = r49;
        r9 = r52;
        r10 = r53;
        goto L_0x06b6;
    L_0x088b:
        r12 = r0;
        r8 = r65;
        goto L_0x09ae;
    L_0x0890:
        r12 = r0;
        r8 = r2;
        r48 = r3;
        r47 = r5;
        r46 = r6;
        r0 = r63.getPaddingTop();
        r2 = r63.getPaddingBottom();
        r0 = r0 + r2;
        r2 = r63.getPaddingLeft();
        r3 = r63.getPaddingRight();
        r2 = r2 + r3;
        r3 = r63.getChildCount();
        r4 = 0;
    L_0x08af:
        if (r4 >= r3) goto L_0x09ae;
    L_0x08b1:
        r5 = r12.getChildAt(r4);
        r6 = r5.getVisibility();
        r7 = 8;
        if (r6 == r7) goto L_0x09a1;
    L_0x08bd:
        r6 = r5.getLayoutParams();
        r6 = (android.support.constraint.ConstraintLayout.C0165a) r6;
        r7 = r6.al;
        r9 = r6.f514Y;
        if (r9 != 0) goto L_0x09a1;
    L_0x08c9:
        r9 = r6.f515Z;
        if (r9 != 0) goto L_0x09a1;
    L_0x08cd:
        r9 = r5.getVisibility();
        r7.f620X = r9;
        r9 = r6.width;
        r10 = r6.height;
        r11 = r6.f511V;
        if (r11 != 0) goto L_0x08fe;
    L_0x08db:
        r11 = r6.f512W;
        if (r11 != 0) goto L_0x08fe;
    L_0x08df:
        r11 = r6.f511V;
        if (r11 != 0) goto L_0x08e9;
    L_0x08e3:
        r11 = r6.f498I;
        r15 = 1;
        if (r11 == r15) goto L_0x08ff;
    L_0x08e8:
        goto L_0x08ea;
    L_0x08e9:
        r15 = 1;
    L_0x08ea:
        r11 = r6.width;
        r13 = -1;
        if (r11 == r13) goto L_0x08ff;
    L_0x08ef:
        r11 = r6.f512W;
        if (r11 != 0) goto L_0x08fc;
    L_0x08f3:
        r11 = r6.f499J;
        if (r11 == r15) goto L_0x08ff;
    L_0x08f7:
        r11 = r6.height;
        if (r11 != r13) goto L_0x08fc;
    L_0x08fb:
        goto L_0x08ff;
    L_0x08fc:
        r11 = 0;
        goto L_0x0900;
    L_0x08fe:
        r15 = 1;
    L_0x08ff:
        r11 = r15;
    L_0x0900:
        if (r11 == 0) goto L_0x097d;
    L_0x0902:
        if (r9 != 0) goto L_0x090e;
    L_0x0904:
        r11 = -2;
        r13 = getChildMeasureSpec(r1, r2, r11);
        r14 = r13;
        r16 = r15;
        r13 = -1;
        goto L_0x0928;
    L_0x090e:
        r11 = -2;
        r13 = -1;
        if (r9 != r13) goto L_0x0919;
    L_0x0912:
        r14 = getChildMeasureSpec(r1, r2, r13);
        r16 = 0;
        goto L_0x0928;
    L_0x0919:
        if (r9 != r11) goto L_0x091d;
    L_0x091b:
        r14 = r15;
        goto L_0x091e;
    L_0x091d:
        r14 = 0;
    L_0x091e:
        r16 = getChildMeasureSpec(r1, r2, r9);
        r62 = r16;
        r16 = r14;
        r14 = r62;
    L_0x0928:
        if (r10 != 0) goto L_0x0932;
    L_0x092a:
        r17 = getChildMeasureSpec(r8, r0, r11);
        r13 = r15;
    L_0x092f:
        r11 = r17;
        goto L_0x0947;
    L_0x0932:
        if (r10 != r13) goto L_0x093c;
    L_0x0934:
        r17 = getChildMeasureSpec(r8, r0, r13);
        r11 = r17;
        r13 = 0;
        goto L_0x0947;
    L_0x093c:
        if (r10 != r11) goto L_0x0940;
    L_0x093e:
        r11 = r15;
        goto L_0x0941;
    L_0x0940:
        r11 = 0;
    L_0x0941:
        r17 = getChildMeasureSpec(r8, r0, r10);
        r13 = r11;
        goto L_0x092f;
    L_0x0947:
        r5.measure(r14, r11);
        r11 = r12.f561t;
        if (r11 == 0) goto L_0x095f;
    L_0x094e:
        r11 = r12.f561t;
        r54 = r2;
        r55 = r3;
        r2 = r11.f699a;
        r56 = r13;
        r18 = 1;
        r13 = r2 + r18;
        r11.f699a = r13;
        goto L_0x0965;
    L_0x095f:
        r54 = r2;
        r55 = r3;
        r56 = r13;
    L_0x0965:
        r2 = -2;
        if (r9 != r2) goto L_0x096a;
    L_0x0968:
        r3 = r15;
        goto L_0x096b;
    L_0x096a:
        r3 = 0;
    L_0x096b:
        r7.f637o = r3;
        if (r10 != r2) goto L_0x0971;
    L_0x096f:
        r2 = r15;
        goto L_0x0972;
    L_0x0971:
        r2 = 0;
    L_0x0972:
        r7.f638p = r2;
        r9 = r5.getMeasuredWidth();
        r10 = r5.getMeasuredHeight();
        goto L_0x0985;
    L_0x097d:
        r54 = r2;
        r55 = r3;
        r16 = 0;
        r56 = 0;
    L_0x0985:
        r7.m293d(r9);
        r7.m296e(r10);
        if (r16 == 0) goto L_0x098f;
    L_0x098d:
        r7.f615R = r9;
    L_0x098f:
        if (r56 == 0) goto L_0x0993;
    L_0x0991:
        r7.f616S = r10;
    L_0x0993:
        r2 = r6.f513X;
        if (r2 == 0) goto L_0x09a6;
    L_0x0997:
        r2 = r5.getBaseline();
        r3 = -1;
        if (r2 == r3) goto L_0x09a6;
    L_0x099e:
        r7.f612O = r2;
        goto L_0x09a6;
    L_0x09a1:
        r54 = r2;
        r55 = r3;
        r15 = 1;
    L_0x09a6:
        r4 = r4 + 1;
        r2 = r54;
        r3 = r55;
        goto L_0x08af;
    L_0x09ae:
        r15 = 1;
        r0 = r63.getChildCount();
        r2 = 0;
    L_0x09b4:
        if (r2 >= r0) goto L_0x09f8;
    L_0x09b6:
        r3 = r12.getChildAt(r2);
        r4 = r3 instanceof android.support.constraint.C0195f;
        if (r4 == 0) goto L_0x09f4;
    L_0x09be:
        r3 = (android.support.constraint.C0195f) r3;
        r4 = r3.f809b;
        if (r4 == 0) goto L_0x09f4;
    L_0x09c4:
        r4 = r3.getLayoutParams();
        r4 = (android.support.constraint.ConstraintLayout.C0165a) r4;
        r3 = r3.f809b;
        r3 = r3.getLayoutParams();
        r3 = (android.support.constraint.ConstraintLayout.C0165a) r3;
        r5 = r3.al;
        r10 = 0;
        r5.f620X = r10;
        r5 = r4.al;
        r6 = r3.al;
        r6 = r6.m308l();
        r5.m293d(r6);
        r4 = r4.al;
        r5 = r3.al;
        r5 = r5.m309m();
        r4.m296e(r5);
        r3 = r3.al;
        r4 = 8;
        r3.f620X = r4;
        goto L_0x09f5;
    L_0x09f4:
        r10 = 0;
    L_0x09f5:
        r2 = r2 + 1;
        goto L_0x09b4;
    L_0x09f8:
        r10 = 0;
        r0 = r12.f549h;
        r0 = r0.size();
        if (r0 <= 0) goto L_0x0a0c;
    L_0x0a01:
        r2 = r10;
    L_0x0a02:
        if (r2 >= r0) goto L_0x0a0c;
    L_0x0a04:
        r3 = r12.f549h;
        r3.get(r2);
        r2 = r2 + 1;
        goto L_0x0a02;
    L_0x0a0c:
        r0 = r63.getChildCount();
        if (r0 <= 0) goto L_0x0a15;
    L_0x0a12:
        r63.m269b();
    L_0x0a15:
        r0 = r12.f550i;
        r0 = r0.size();
        r2 = r63.getPaddingBottom();
        r4 = r38 + r2;
        r2 = r63.getPaddingRight();
        r3 = r37 + r2;
        if (r0 <= 0) goto L_0x0c38;
    L_0x0a29:
        r5 = r12.f543b;
        r5 = r5.m320x();
        r6 = android.support.constraint.p026a.p027a.C0174d.C0173a.f593b;
        if (r5 != r6) goto L_0x0a35;
    L_0x0a33:
        r5 = r15;
        goto L_0x0a36;
    L_0x0a35:
        r5 = r10;
    L_0x0a36:
        r6 = r12.f543b;
        r6 = r6.m321y();
        r7 = android.support.constraint.p026a.p027a.C0174d.C0173a.f593b;
        if (r6 != r7) goto L_0x0a42;
    L_0x0a40:
        r6 = r15;
        goto L_0x0a43;
    L_0x0a42:
        r6 = r10;
    L_0x0a43:
        r7 = r12.f543b;
        r7 = r7.m308l();
        r9 = r12.f551j;
        r7 = java.lang.Math.max(r7, r9);
        r9 = r12.f543b;
        r9 = r9.m309m();
        r11 = r12.f552k;
        r9 = java.lang.Math.max(r9, r11);
        r11 = r7;
        r13 = r9;
        r7 = r10;
        r9 = r7;
        r14 = r9;
    L_0x0a60:
        if (r7 >= r0) goto L_0x0b9d;
    L_0x0a62:
        r10 = r12.f550i;
        r10 = r10.get(r7);
        r10 = (android.support.constraint.p026a.p027a.C0174d) r10;
        r15 = r10.f619W;
        r15 = (android.view.View) r15;
        if (r15 == 0) goto L_0x0b82;
    L_0x0a70:
        r16 = r15.getLayoutParams();
        r2 = r16;
        r2 = (android.support.constraint.ConstraintLayout.C0165a) r2;
        r58 = r0;
        r0 = r2.f515Z;
        if (r0 != 0) goto L_0x0b84;
    L_0x0a7e:
        r0 = r2.f514Y;
        if (r0 != 0) goto L_0x0b84;
    L_0x0a82:
        r0 = r15.getVisibility();
        r59 = r9;
        r9 = 8;
        if (r0 == r9) goto L_0x0b7d;
    L_0x0a8c:
        if (r48 == 0) goto L_0x0aa2;
    L_0x0a8e:
        r0 = r10.m302h();
        r0 = r0.m332e();
        if (r0 == 0) goto L_0x0aa2;
    L_0x0a98:
        r0 = r10.m304i();
        r0 = r0.m332e();
        if (r0 != 0) goto L_0x0b7d;
    L_0x0aa2:
        r0 = r2.width;
        r9 = -2;
        if (r0 != r9) goto L_0x0ab2;
    L_0x0aa7:
        r0 = r2.f511V;
        if (r0 == 0) goto L_0x0ab2;
    L_0x0aab:
        r0 = r2.width;
        r0 = getChildMeasureSpec(r1, r3, r0);
        goto L_0x0abc;
    L_0x0ab2:
        r0 = r10.m308l();
        r9 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r9);
    L_0x0abc:
        r9 = r2.height;
        r1 = -2;
        if (r9 != r1) goto L_0x0acc;
    L_0x0ac1:
        r9 = r2.f512W;
        if (r9 == 0) goto L_0x0acc;
    L_0x0ac5:
        r9 = r2.height;
        r9 = getChildMeasureSpec(r8, r4, r9);
        goto L_0x0ad6;
    L_0x0acc:
        r9 = r10.m309m();
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r1);
    L_0x0ad6:
        r15.measure(r0, r9);
        r0 = r12.f561t;
        if (r0 == 0) goto L_0x0aec;
    L_0x0add:
        r0 = r12.f561t;
        r8 = r0.f700b;
        r61 = r3;
        r60 = r4;
        r16 = 1;
        r3 = r8 + r16;
        r0.f700b = r3;
        goto L_0x0af0;
    L_0x0aec:
        r61 = r3;
        r60 = r4;
    L_0x0af0:
        r0 = r15.getMeasuredWidth();
        r1 = r15.getMeasuredHeight();
        r3 = r10.m308l();
        if (r0 == r3) goto L_0x0b28;
    L_0x0afe:
        r10.m293d(r0);
        if (r48 == 0) goto L_0x0b0a;
    L_0x0b03:
        r3 = r10.m302h();
        r3.m8606a(r0);
    L_0x0b0a:
        if (r5 == 0) goto L_0x0b26;
    L_0x0b0c:
        r0 = r10.m314r();
        if (r0 <= r11) goto L_0x0b26;
    L_0x0b12:
        r0 = r10.m314r();
        r3 = android.support.constraint.p026a.p027a.C0171c.C0170c.RIGHT;
        r3 = r10.mo51a(r3);
        r3 = r3.m274b();
        r0 = r0 + r3;
        r0 = java.lang.Math.max(r11, r0);
        r11 = r0;
    L_0x0b26:
        r8 = 1;
        goto L_0x0b2a;
    L_0x0b28:
        r8 = r59;
    L_0x0b2a:
        r0 = r10.m309m();
        if (r1 == r0) goto L_0x0b59;
    L_0x0b30:
        r10.m296e(r1);
        if (r48 == 0) goto L_0x0b3c;
    L_0x0b35:
        r0 = r10.m304i();
        r0.m8606a(r1);
    L_0x0b3c:
        if (r6 == 0) goto L_0x0b58;
    L_0x0b3e:
        r0 = r10.m315s();
        if (r0 <= r13) goto L_0x0b58;
    L_0x0b44:
        r0 = r10.m315s();
        r1 = android.support.constraint.p026a.p027a.C0171c.C0170c.BOTTOM;
        r1 = r10.mo51a(r1);
        r1 = r1.m274b();
        r0 = r0 + r1;
        r0 = java.lang.Math.max(r13, r0);
        r13 = r0;
    L_0x0b58:
        r8 = 1;
    L_0x0b59:
        r0 = r2.f513X;
        if (r0 == 0) goto L_0x0b6c;
    L_0x0b5d:
        r0 = r15.getBaseline();
        r1 = -1;
        if (r0 == r1) goto L_0x0b6d;
    L_0x0b64:
        r2 = r10.f612O;
        if (r0 == r2) goto L_0x0b6d;
    L_0x0b68:
        r10.f612O = r0;
        r8 = 1;
        goto L_0x0b6d;
    L_0x0b6c:
        r1 = -1;
    L_0x0b6d:
        r0 = android.os.Build.VERSION.SDK_INT;
        r2 = 11;
        if (r0 < r2) goto L_0x0b7b;
    L_0x0b73:
        r0 = r15.getMeasuredState();
        r14 = combineMeasuredStates(r14, r0);
    L_0x0b7b:
        r9 = r8;
        goto L_0x0b8d;
    L_0x0b7d:
        r61 = r3;
        r60 = r4;
        goto L_0x0b8a;
    L_0x0b82:
        r58 = r0;
    L_0x0b84:
        r61 = r3;
        r60 = r4;
        r59 = r9;
    L_0x0b8a:
        r1 = -1;
        r9 = r59;
    L_0x0b8d:
        r7 = r7 + 1;
        r0 = r58;
        r4 = r60;
        r3 = r61;
        r1 = r64;
        r8 = r65;
        r10 = 0;
        r15 = 1;
        goto L_0x0a60;
    L_0x0b9d:
        r58 = r0;
        r61 = r3;
        r60 = r4;
        r59 = r9;
        if (r59 == 0) goto L_0x0be6;
    L_0x0ba7:
        r0 = r12.f543b;
        r1 = r47;
        r0.m293d(r1);
        r0 = r12.f543b;
        r1 = r46;
        r0.m296e(r1);
        if (r48 == 0) goto L_0x0bbc;
    L_0x0bb7:
        r0 = r12.f543b;
        r0.m14861B();
    L_0x0bbc:
        r63.m269b();
        r0 = r12.f543b;
        r0 = r0.m308l();
        if (r0 >= r11) goto L_0x0bce;
    L_0x0bc7:
        r0 = r12.f543b;
        r0.m293d(r11);
        r8 = 1;
        goto L_0x0bcf;
    L_0x0bce:
        r8 = 0;
    L_0x0bcf:
        r0 = r12.f543b;
        r0 = r0.m309m();
        if (r0 >= r13) goto L_0x0bdf;
    L_0x0bd7:
        r0 = r12.f543b;
        r0.m296e(r13);
        r57 = 1;
        goto L_0x0be1;
    L_0x0bdf:
        r57 = r8;
    L_0x0be1:
        if (r57 == 0) goto L_0x0be6;
    L_0x0be3:
        r63.m269b();
    L_0x0be6:
        r0 = r58;
        r1 = 0;
    L_0x0be9:
        if (r1 >= r0) goto L_0x0c3d;
    L_0x0beb:
        r2 = r12.f550i;
        r2 = r2.get(r1);
        r2 = (android.support.constraint.p026a.p027a.C0174d) r2;
        r3 = r2.f619W;
        r3 = (android.view.View) r3;
        if (r3 == 0) goto L_0x0c31;
    L_0x0bf9:
        r4 = r3.getMeasuredWidth();
        r5 = r2.m308l();
        if (r4 != r5) goto L_0x0c0d;
    L_0x0c03:
        r4 = r3.getMeasuredHeight();
        r5 = r2.m309m();
        if (r4 == r5) goto L_0x0c31;
    L_0x0c0d:
        r4 = r2.m308l();
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5);
        r2 = r2.m309m();
        r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5);
        r3.measure(r4, r2);
        r2 = r12.f561t;
        if (r2 == 0) goto L_0x0c33;
    L_0x0c26:
        r2 = r12.f561t;
        r3 = r2.f700b;
        r6 = 1;
        r8 = r3 + r6;
        r2.f700b = r8;
        goto L_0x0c35;
    L_0x0c31:
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
    L_0x0c33:
        r6 = 1;
    L_0x0c35:
        r1 = r1 + 1;
        goto L_0x0be9;
    L_0x0c38:
        r61 = r3;
        r60 = r4;
        r14 = 0;
    L_0x0c3d:
        r0 = r12.f543b;
        r0 = r0.m308l();
        r0 = r0 + r61;
        r1 = r12.f543b;
        r1 = r1.m309m();
        r1 = r1 + r60;
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 11;
        if (r2 < r3) goto L_0x0c84;
    L_0x0c53:
        r2 = r64;
        r0 = resolveSizeAndState(r0, r2, r14);
        r2 = r14 << 16;
        r3 = r65;
        r1 = resolveSizeAndState(r1, r3, r2);
        r2 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
        r0 = r0 & r2;
        r1 = r1 & r2;
        r2 = r12.f553l;
        r0 = java.lang.Math.min(r2, r0);
        r2 = r12.f554m;
        r1 = java.lang.Math.min(r2, r1);
        r2 = r12.f543b;
        r2 = r2.at;
        if (r2 == 0) goto L_0x0c7b;
    L_0x0c78:
        r2 = 16777216; // 0x1000000 float:2.3509887E-38 double:8.289046E-317;
        r0 = r0 | r2;
    L_0x0c7b:
        r2 = r12.f543b;
        r2 = r2.au;
        if (r2 == 0) goto L_0x0c84;
    L_0x0c81:
        r2 = 16777216; // 0x1000000 float:2.3509887E-38 double:8.289046E-317;
        r1 = r1 | r2;
    L_0x0c84:
        r12.setMeasuredDimension(r0, r1);
        r12.f559r = r0;
        r12.f560s = r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.onMeasure(int, int):void");
    }

    public void onViewAdded(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        C0174d a = m270a(view);
        if ((view instanceof C0194e) && !(a instanceof C4700f)) {
            C0165a c0165a = (C0165a) view.getLayoutParams();
            c0165a.al = new C4700f();
            c0165a.f514Y = true;
            ((C4700f) c0165a.al).m8589j(c0165a.f508S);
        }
        if (view instanceof C0190b) {
            C0190b c0190b = (C0190b) view;
            c0190b.m381a();
            ((C0165a) view.getLayoutParams()).f515Z = true;
            if (!this.f549h.contains(c0190b)) {
                this.f549h.add(c0190b);
            }
        }
        this.f542a.put(view.getId(), view);
        this.f555n = true;
    }

    public void onViewRemoved(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f542a.remove(view.getId());
        C0174d a = m270a(view);
        this.f543b.m8614b(a);
        this.f549h.remove(view);
        this.f550i.remove(a);
        this.f555n = true;
    }

    public void removeView(View view) {
        super.removeView(view);
        if (VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void requestLayout() {
        super.requestLayout();
        this.f555n = true;
        this.f559r = -1;
        this.f560s = -1;
        this.f545d = -1;
        this.f546e = -1;
        this.f547f = 0;
        this.f548g = 0;
    }

    public void setConstraintSet(C0192c c0192c) {
        this.f557p = c0192c;
    }

    public void setId(int i) {
        this.f542a.remove(getId());
        super.setId(i);
        this.f542a.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f554m) {
            this.f554m = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f553l) {
            this.f553l = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f552k) {
            this.f552k = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f551j) {
            this.f551j = i;
            requestLayout();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f543b.as = i;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
