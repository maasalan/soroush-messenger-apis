package android.support.constraint;

import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.constraint.C0193d.C4708a;
import android.support.constraint.C0198g.C0197b;
import android.support.constraint.ConstraintLayout.C0165a;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C0192c {
    private static final int[] f804b = new int[]{0, 4, 8};
    private static SparseIntArray f805c;
    HashMap<Integer, C0191a> f806a = new HashMap();

    private static class C0191a {
        public int f752A;
        public int f753B;
        public int f754C;
        public int f755D;
        public int f756E;
        public int f757F;
        public int f758G;
        public int f759H;
        public int f760I;
        public int f761J;
        public int f762K;
        public int f763L;
        public int f764M;
        public int f765N;
        public int f766O;
        public int f767P;
        public float f768Q;
        public float f769R;
        public int f770S;
        public int f771T;
        public float f772U;
        public boolean f773V;
        public float f774W;
        public float f775X;
        public float f776Y;
        public float f777Z;
        boolean f778a;
        public float aa;
        public float ab;
        public float ac;
        public float ad;
        public float ae;
        public float af;
        public float ag;
        public boolean ah;
        public boolean ai;
        public int aj;
        public int ak;
        public int al;
        public int am;
        public int an;
        public int ao;
        public float ap;
        public float aq;
        public int ar;
        public int as;
        public int[] at;
        public int f779b;
        public int f780c;
        int f781d;
        public int f782e;
        public int f783f;
        public float f784g;
        public int f785h;
        public int f786i;
        public int f787j;
        public int f788k;
        public int f789l;
        public int f790m;
        public int f791n;
        public int f792o;
        public int f793p;
        public int f794q;
        public int f795r;
        public int f796s;
        public int f797t;
        public float f798u;
        public float f799v;
        public String f800w;
        public int f801x;
        public int f802y;
        public float f803z;

        private C0191a() {
            this.f778a = false;
            this.f782e = -1;
            this.f783f = -1;
            this.f784g = -1.0f;
            this.f785h = -1;
            this.f786i = -1;
            this.f787j = -1;
            this.f788k = -1;
            this.f789l = -1;
            this.f790m = -1;
            this.f791n = -1;
            this.f792o = -1;
            this.f793p = -1;
            this.f794q = -1;
            this.f795r = -1;
            this.f796s = -1;
            this.f797t = -1;
            this.f798u = 0.5f;
            this.f799v = 0.5f;
            this.f800w = null;
            this.f801x = -1;
            this.f802y = 0;
            this.f803z = 0.0f;
            this.f752A = -1;
            this.f753B = -1;
            this.f754C = -1;
            this.f755D = -1;
            this.f756E = -1;
            this.f757F = -1;
            this.f758G = -1;
            this.f759H = -1;
            this.f760I = -1;
            this.f761J = 0;
            this.f762K = -1;
            this.f763L = -1;
            this.f764M = -1;
            this.f765N = -1;
            this.f766O = -1;
            this.f767P = -1;
            this.f768Q = 0.0f;
            this.f769R = 0.0f;
            this.f770S = 0;
            this.f771T = 0;
            this.f772U = BallPulseIndicator.SCALE;
            this.f773V = false;
            this.f774W = 0.0f;
            this.f775X = 0.0f;
            this.f776Y = 0.0f;
            this.f777Z = 0.0f;
            this.aa = BallPulseIndicator.SCALE;
            this.ab = BallPulseIndicator.SCALE;
            this.ac = Float.NaN;
            this.ad = Float.NaN;
            this.ae = 0.0f;
            this.af = 0.0f;
            this.ag = 0.0f;
            this.ah = false;
            this.ai = false;
            this.aj = -1;
            this.ak = -1;
            this.al = -1;
            this.am = -1;
            this.an = -1;
            this.ao = -1;
            this.ap = BallPulseIndicator.SCALE;
            this.aq = BallPulseIndicator.SCALE;
            this.ar = -1;
            this.as = -1;
        }

        final void m384a(int i, C4708a c4708a) {
            this.f781d = i;
            this.f785h = c4708a.f519d;
            this.f786i = c4708a.f520e;
            this.f787j = c4708a.f521f;
            this.f788k = c4708a.f522g;
            this.f789l = c4708a.f523h;
            this.f790m = c4708a.f524i;
            this.f791n = c4708a.f525j;
            this.f792o = c4708a.f526k;
            this.f793p = c4708a.f527l;
            this.f794q = c4708a.f531p;
            this.f795r = c4708a.f532q;
            this.f796s = c4708a.f533r;
            this.f797t = c4708a.f534s;
            this.f798u = c4708a.f541z;
            this.f799v = c4708a.f490A;
            this.f800w = c4708a.f491B;
            this.f801x = c4708a.f528m;
            this.f802y = c4708a.f529n;
            this.f803z = c4708a.f530o;
            this.f752A = c4708a.f506Q;
            this.f753B = c4708a.f507R;
            this.f754C = c4708a.f508S;
            this.f784g = c4708a.f518c;
            this.f782e = c4708a.f516a;
            this.f783f = c4708a.f517b;
            this.f779b = c4708a.width;
            this.f780c = c4708a.height;
            this.f755D = c4708a.leftMargin;
            this.f756E = c4708a.rightMargin;
            this.f757F = c4708a.topMargin;
            this.f758G = c4708a.bottomMargin;
            this.f768Q = c4708a.f495F;
            this.f769R = c4708a.f494E;
            this.f771T = c4708a.f497H;
            this.f770S = c4708a.f496G;
            this.ah = c4708a.f509T;
            this.ai = c4708a.f510U;
            this.aj = c4708a.f498I;
            this.ak = c4708a.f499J;
            this.ah = c4708a.f509T;
            this.al = c4708a.f502M;
            this.am = c4708a.f503N;
            this.an = c4708a.f500K;
            this.ao = c4708a.f501L;
            this.ap = c4708a.f504O;
            this.aq = c4708a.f505P;
            if (VERSION.SDK_INT >= 17) {
                this.f759H = c4708a.getMarginEnd();
                this.f760I = c4708a.getMarginStart();
            }
            this.f772U = c4708a.an;
            this.f775X = c4708a.aq;
            this.f776Y = c4708a.ar;
            this.f777Z = c4708a.as;
            this.aa = c4708a.at;
            this.ab = c4708a.au;
            this.ac = c4708a.av;
            this.ad = c4708a.aw;
            this.ae = c4708a.ax;
            this.af = c4708a.ay;
            this.ag = c4708a.az;
            this.f774W = c4708a.ap;
            this.f773V = c4708a.ao;
        }

        public final void m385a(C0165a c0165a) {
            c0165a.f519d = this.f785h;
            c0165a.f520e = this.f786i;
            c0165a.f521f = this.f787j;
            c0165a.f522g = this.f788k;
            c0165a.f523h = this.f789l;
            c0165a.f524i = this.f790m;
            c0165a.f525j = this.f791n;
            c0165a.f526k = this.f792o;
            c0165a.f527l = this.f793p;
            c0165a.f531p = this.f794q;
            c0165a.f532q = this.f795r;
            c0165a.f533r = this.f796s;
            c0165a.f534s = this.f797t;
            c0165a.leftMargin = this.f755D;
            c0165a.rightMargin = this.f756E;
            c0165a.topMargin = this.f757F;
            c0165a.bottomMargin = this.f758G;
            c0165a.f539x = this.f767P;
            c0165a.f540y = this.f766O;
            c0165a.f541z = this.f798u;
            c0165a.f490A = this.f799v;
            c0165a.f528m = this.f801x;
            c0165a.f529n = this.f802y;
            c0165a.f530o = this.f803z;
            c0165a.f491B = this.f800w;
            c0165a.f506Q = this.f752A;
            c0165a.f507R = this.f753B;
            c0165a.f495F = this.f768Q;
            c0165a.f494E = this.f769R;
            c0165a.f497H = this.f771T;
            c0165a.f496G = this.f770S;
            c0165a.f509T = this.ah;
            c0165a.f510U = this.ai;
            c0165a.f498I = this.aj;
            c0165a.f499J = this.ak;
            c0165a.f502M = this.al;
            c0165a.f503N = this.am;
            c0165a.f500K = this.an;
            c0165a.f501L = this.ao;
            c0165a.f504O = this.ap;
            c0165a.f505P = this.aq;
            c0165a.f508S = this.f754C;
            c0165a.f518c = this.f784g;
            c0165a.f516a = this.f782e;
            c0165a.f517b = this.f783f;
            c0165a.width = this.f779b;
            c0165a.height = this.f780c;
            if (VERSION.SDK_INT >= 17) {
                c0165a.setMarginStart(this.f760I);
                c0165a.setMarginEnd(this.f759H);
            }
            c0165a.m264a();
        }

        public final /* synthetic */ Object clone() {
            C0191a c0191a = new C0191a();
            c0191a.f778a = this.f778a;
            c0191a.f779b = this.f779b;
            c0191a.f780c = this.f780c;
            c0191a.f782e = this.f782e;
            c0191a.f783f = this.f783f;
            c0191a.f784g = this.f784g;
            c0191a.f785h = this.f785h;
            c0191a.f786i = this.f786i;
            c0191a.f787j = this.f787j;
            c0191a.f788k = this.f788k;
            c0191a.f789l = this.f789l;
            c0191a.f790m = this.f790m;
            c0191a.f791n = this.f791n;
            c0191a.f792o = this.f792o;
            c0191a.f793p = this.f793p;
            c0191a.f794q = this.f794q;
            c0191a.f795r = this.f795r;
            c0191a.f796s = this.f796s;
            c0191a.f797t = this.f797t;
            c0191a.f798u = this.f798u;
            c0191a.f799v = this.f799v;
            c0191a.f800w = this.f800w;
            c0191a.f752A = this.f752A;
            c0191a.f753B = this.f753B;
            c0191a.f798u = this.f798u;
            c0191a.f798u = this.f798u;
            c0191a.f798u = this.f798u;
            c0191a.f798u = this.f798u;
            c0191a.f798u = this.f798u;
            c0191a.f754C = this.f754C;
            c0191a.f755D = this.f755D;
            c0191a.f756E = this.f756E;
            c0191a.f757F = this.f757F;
            c0191a.f758G = this.f758G;
            c0191a.f759H = this.f759H;
            c0191a.f760I = this.f760I;
            c0191a.f761J = this.f761J;
            c0191a.f762K = this.f762K;
            c0191a.f763L = this.f763L;
            c0191a.f764M = this.f764M;
            c0191a.f765N = this.f765N;
            c0191a.f766O = this.f766O;
            c0191a.f767P = this.f767P;
            c0191a.f768Q = this.f768Q;
            c0191a.f769R = this.f769R;
            c0191a.f770S = this.f770S;
            c0191a.f771T = this.f771T;
            c0191a.f772U = this.f772U;
            c0191a.f773V = this.f773V;
            c0191a.f774W = this.f774W;
            c0191a.f775X = this.f775X;
            c0191a.f776Y = this.f776Y;
            c0191a.f777Z = this.f777Z;
            c0191a.aa = this.aa;
            c0191a.ab = this.ab;
            c0191a.ac = this.ac;
            c0191a.ad = this.ad;
            c0191a.ae = this.ae;
            c0191a.af = this.af;
            c0191a.ag = this.ag;
            c0191a.ah = this.ah;
            c0191a.ai = this.ai;
            c0191a.aj = this.aj;
            c0191a.ak = this.ak;
            c0191a.al = this.al;
            c0191a.am = this.am;
            c0191a.an = this.an;
            c0191a.ao = this.ao;
            c0191a.ap = this.ap;
            c0191a.aq = this.aq;
            c0191a.ar = this.ar;
            c0191a.as = this.as;
            if (this.at != null) {
                c0191a.at = Arrays.copyOf(this.at, this.at.length);
            }
            c0191a.f801x = this.f801x;
            c0191a.f802y = this.f802y;
            c0191a.f803z = this.f803z;
            return c0191a;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f805c = sparseIntArray;
        sparseIntArray.append(C0197b.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        f805c.append(C0197b.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        f805c.append(C0197b.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        f805c.append(C0197b.ConstraintSet_layout_constraintRight_toRightOf, 30);
        f805c.append(C0197b.ConstraintSet_layout_constraintTop_toTopOf, 36);
        f805c.append(C0197b.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        f805c.append(C0197b.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        f805c.append(C0197b.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        f805c.append(C0197b.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        f805c.append(C0197b.ConstraintSet_layout_editor_absoluteX, 6);
        f805c.append(C0197b.ConstraintSet_layout_editor_absoluteY, 7);
        f805c.append(C0197b.ConstraintSet_layout_constraintGuide_begin, 17);
        f805c.append(C0197b.ConstraintSet_layout_constraintGuide_end, 18);
        f805c.append(C0197b.ConstraintSet_layout_constraintGuide_percent, 19);
        f805c.append(C0197b.ConstraintSet_android_orientation, 27);
        f805c.append(C0197b.ConstraintSet_layout_constraintStart_toEndOf, 32);
        f805c.append(C0197b.ConstraintSet_layout_constraintStart_toStartOf, 33);
        f805c.append(C0197b.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        f805c.append(C0197b.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        f805c.append(C0197b.ConstraintSet_layout_goneMarginLeft, 13);
        f805c.append(C0197b.ConstraintSet_layout_goneMarginTop, 16);
        f805c.append(C0197b.ConstraintSet_layout_goneMarginRight, 14);
        f805c.append(C0197b.ConstraintSet_layout_goneMarginBottom, 11);
        f805c.append(C0197b.ConstraintSet_layout_goneMarginStart, 15);
        f805c.append(C0197b.ConstraintSet_layout_goneMarginEnd, 12);
        f805c.append(C0197b.ConstraintSet_layout_constraintVertical_weight, 40);
        f805c.append(C0197b.ConstraintSet_layout_constraintHorizontal_weight, 39);
        f805c.append(C0197b.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        f805c.append(C0197b.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        f805c.append(C0197b.ConstraintSet_layout_constraintHorizontal_bias, 20);
        f805c.append(C0197b.ConstraintSet_layout_constraintVertical_bias, 37);
        f805c.append(C0197b.ConstraintSet_layout_constraintDimensionRatio, 5);
        f805c.append(C0197b.ConstraintSet_layout_constraintLeft_creator, 64);
        f805c.append(C0197b.ConstraintSet_layout_constraintTop_creator, 64);
        f805c.append(C0197b.ConstraintSet_layout_constraintRight_creator, 64);
        f805c.append(C0197b.ConstraintSet_layout_constraintBottom_creator, 64);
        f805c.append(C0197b.ConstraintSet_layout_constraintBaseline_creator, 64);
        f805c.append(C0197b.ConstraintSet_android_layout_marginLeft, 24);
        f805c.append(C0197b.ConstraintSet_android_layout_marginRight, 28);
        f805c.append(C0197b.ConstraintSet_android_layout_marginStart, 31);
        f805c.append(C0197b.ConstraintSet_android_layout_marginEnd, 8);
        f805c.append(C0197b.ConstraintSet_android_layout_marginTop, 34);
        f805c.append(C0197b.ConstraintSet_android_layout_marginBottom, 2);
        f805c.append(C0197b.ConstraintSet_android_layout_width, 23);
        f805c.append(C0197b.ConstraintSet_android_layout_height, 21);
        f805c.append(C0197b.ConstraintSet_android_visibility, 22);
        f805c.append(C0197b.ConstraintSet_android_alpha, 43);
        f805c.append(C0197b.ConstraintSet_android_elevation, 44);
        f805c.append(C0197b.ConstraintSet_android_rotationX, 45);
        f805c.append(C0197b.ConstraintSet_android_rotationY, 46);
        f805c.append(C0197b.ConstraintSet_android_rotation, 60);
        f805c.append(C0197b.ConstraintSet_android_scaleX, 47);
        f805c.append(C0197b.ConstraintSet_android_scaleY, 48);
        f805c.append(C0197b.ConstraintSet_android_transformPivotX, 49);
        f805c.append(C0197b.ConstraintSet_android_transformPivotY, 50);
        f805c.append(C0197b.ConstraintSet_android_translationX, 51);
        f805c.append(C0197b.ConstraintSet_android_translationY, 52);
        f805c.append(C0197b.ConstraintSet_android_translationZ, 53);
        f805c.append(C0197b.ConstraintSet_layout_constraintWidth_default, 54);
        f805c.append(C0197b.ConstraintSet_layout_constraintHeight_default, 55);
        f805c.append(C0197b.ConstraintSet_layout_constraintWidth_max, 56);
        f805c.append(C0197b.ConstraintSet_layout_constraintHeight_max, 57);
        f805c.append(C0197b.ConstraintSet_layout_constraintWidth_min, 58);
        f805c.append(C0197b.ConstraintSet_layout_constraintHeight_min, 59);
        f805c.append(C0197b.ConstraintSet_layout_constraintCircle, 61);
        f805c.append(C0197b.ConstraintSet_layout_constraintCircleRadius, 62);
        f805c.append(C0197b.ConstraintSet_layout_constraintCircleAngle, 63);
        f805c.append(C0197b.ConstraintSet_android_id, 38);
    }

    private static int m386a(TypedArray typedArray, int i, int i2) {
        i2 = typedArray.getResourceId(i, i2);
        return i2 == -1 ? typedArray.getInt(i, -1) : i2;
    }

    static void m387a(C0191a c0191a, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            int i2 = f805c.get(index);
            switch (i2) {
                case 1:
                    c0191a.f793p = C0192c.m386a(typedArray, index, c0191a.f793p);
                    break;
                case 2:
                    c0191a.f758G = typedArray.getDimensionPixelSize(index, c0191a.f758G);
                    break;
                case 3:
                    c0191a.f792o = C0192c.m386a(typedArray, index, c0191a.f792o);
                    break;
                case 4:
                    c0191a.f791n = C0192c.m386a(typedArray, index, c0191a.f791n);
                    break;
                case 5:
                    c0191a.f800w = typedArray.getString(index);
                    break;
                case 6:
                    c0191a.f752A = typedArray.getDimensionPixelOffset(index, c0191a.f752A);
                    break;
                case 7:
                    c0191a.f753B = typedArray.getDimensionPixelOffset(index, c0191a.f753B);
                    break;
                case 8:
                    c0191a.f759H = typedArray.getDimensionPixelSize(index, c0191a.f759H);
                    break;
                case 9:
                    c0191a.f797t = C0192c.m386a(typedArray, index, c0191a.f797t);
                    break;
                case 10:
                    c0191a.f796s = C0192c.m386a(typedArray, index, c0191a.f796s);
                    break;
                case 11:
                    c0191a.f765N = typedArray.getDimensionPixelSize(index, c0191a.f765N);
                    break;
                case 12:
                    c0191a.f766O = typedArray.getDimensionPixelSize(index, c0191a.f766O);
                    break;
                case 13:
                    c0191a.f762K = typedArray.getDimensionPixelSize(index, c0191a.f762K);
                    break;
                case 14:
                    c0191a.f764M = typedArray.getDimensionPixelSize(index, c0191a.f764M);
                    break;
                case 15:
                    c0191a.f767P = typedArray.getDimensionPixelSize(index, c0191a.f767P);
                    break;
                case 16:
                    c0191a.f763L = typedArray.getDimensionPixelSize(index, c0191a.f763L);
                    break;
                case 17:
                    c0191a.f782e = typedArray.getDimensionPixelOffset(index, c0191a.f782e);
                    break;
                case 18:
                    c0191a.f783f = typedArray.getDimensionPixelOffset(index, c0191a.f783f);
                    break;
                case 19:
                    c0191a.f784g = typedArray.getFloat(index, c0191a.f784g);
                    break;
                case 20:
                    c0191a.f798u = typedArray.getFloat(index, c0191a.f798u);
                    break;
                case 21:
                    c0191a.f780c = typedArray.getLayoutDimension(index, c0191a.f780c);
                    break;
                case 22:
                    c0191a.f761J = typedArray.getInt(index, c0191a.f761J);
                    c0191a.f761J = f804b[c0191a.f761J];
                    break;
                case 23:
                    c0191a.f779b = typedArray.getLayoutDimension(index, c0191a.f779b);
                    break;
                case 24:
                    c0191a.f755D = typedArray.getDimensionPixelSize(index, c0191a.f755D);
                    break;
                case 25:
                    c0191a.f785h = C0192c.m386a(typedArray, index, c0191a.f785h);
                    break;
                case 26:
                    c0191a.f786i = C0192c.m386a(typedArray, index, c0191a.f786i);
                    break;
                case 27:
                    c0191a.f754C = typedArray.getInt(index, c0191a.f754C);
                    break;
                case 28:
                    c0191a.f756E = typedArray.getDimensionPixelSize(index, c0191a.f756E);
                    break;
                case 29:
                    c0191a.f787j = C0192c.m386a(typedArray, index, c0191a.f787j);
                    break;
                case 30:
                    c0191a.f788k = C0192c.m386a(typedArray, index, c0191a.f788k);
                    break;
                case 31:
                    c0191a.f760I = typedArray.getDimensionPixelSize(index, c0191a.f760I);
                    break;
                case 32:
                    c0191a.f794q = C0192c.m386a(typedArray, index, c0191a.f794q);
                    break;
                case 33:
                    c0191a.f795r = C0192c.m386a(typedArray, index, c0191a.f795r);
                    break;
                case 34:
                    c0191a.f757F = typedArray.getDimensionPixelSize(index, c0191a.f757F);
                    break;
                case 35:
                    c0191a.f790m = C0192c.m386a(typedArray, index, c0191a.f790m);
                    break;
                case 36:
                    c0191a.f789l = C0192c.m386a(typedArray, index, c0191a.f789l);
                    break;
                case 37:
                    c0191a.f799v = typedArray.getFloat(index, c0191a.f799v);
                    break;
                case 38:
                    c0191a.f781d = typedArray.getResourceId(index, c0191a.f781d);
                    break;
                case 39:
                    c0191a.f769R = typedArray.getFloat(index, c0191a.f769R);
                    break;
                case 40:
                    c0191a.f768Q = typedArray.getFloat(index, c0191a.f768Q);
                    break;
                case 41:
                    c0191a.f770S = typedArray.getInt(index, c0191a.f770S);
                    break;
                case 42:
                    c0191a.f771T = typedArray.getInt(index, c0191a.f771T);
                    break;
                case 43:
                    c0191a.f772U = typedArray.getFloat(index, c0191a.f772U);
                    break;
                case 44:
                    c0191a.f773V = true;
                    c0191a.f774W = typedArray.getDimension(index, c0191a.f774W);
                    break;
                case 45:
                    c0191a.f776Y = typedArray.getFloat(index, c0191a.f776Y);
                    break;
                case 46:
                    c0191a.f777Z = typedArray.getFloat(index, c0191a.f777Z);
                    break;
                case 47:
                    c0191a.aa = typedArray.getFloat(index, c0191a.aa);
                    break;
                case 48:
                    c0191a.ab = typedArray.getFloat(index, c0191a.ab);
                    break;
                case 49:
                    c0191a.ac = typedArray.getFloat(index, c0191a.ac);
                    break;
                case 50:
                    c0191a.ad = typedArray.getFloat(index, c0191a.ad);
                    break;
                case 51:
                    c0191a.ae = typedArray.getDimension(index, c0191a.ae);
                    break;
                case 52:
                    c0191a.af = typedArray.getDimension(index, c0191a.af);
                    break;
                case 53:
                    c0191a.ag = typedArray.getDimension(index, c0191a.ag);
                    break;
                default:
                    String str;
                    StringBuilder stringBuilder;
                    switch (i2) {
                        case 60:
                            c0191a.f775X = typedArray.getFloat(index, c0191a.f775X);
                            continue;
                        case 61:
                            c0191a.f801x = C0192c.m386a(typedArray, index, c0191a.f801x);
                            continue;
                        case 62:
                            c0191a.f802y = typedArray.getDimensionPixelSize(index, c0191a.f802y);
                            continue;
                        case 63:
                            c0191a.f803z = typedArray.getFloat(index, c0191a.f803z);
                            continue;
                        case 64:
                            str = "ConstraintSet";
                            stringBuilder = new StringBuilder("unused attribute 0x");
                            break;
                        default:
                            str = "ConstraintSet";
                            stringBuilder = new StringBuilder("Unknown attribute 0x");
                            break;
                    }
                    stringBuilder.append(Integer.toHexString(index));
                    stringBuilder.append("   ");
                    stringBuilder.append(f805c.get(index));
                    Log.w(str, stringBuilder.toString());
                    break;
            }
        }
    }

    final void m388a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f806a.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (this.f806a.containsKey(Integer.valueOf(id))) {
                hashSet.remove(Integer.valueOf(id));
                C0191a c0191a = (C0191a) this.f806a.get(Integer.valueOf(id));
                if (c0191a.as != -1) {
                    if (c0191a.as == 1) {
                        C4707a c4707a = (C4707a) childAt;
                        c4707a.setId(id);
                        c4707a.setReferencedIds(c0191a.at);
                        c4707a.setType(c0191a.ar);
                        c0191a.m385a(ConstraintLayout.m265a());
                    }
                }
                C0165a c0165a = (C0165a) childAt.getLayoutParams();
                c0191a.m385a(c0165a);
                childAt.setLayoutParams(c0165a);
                childAt.setVisibility(c0191a.f761J);
                if (VERSION.SDK_INT >= 17) {
                    childAt.setAlpha(c0191a.f772U);
                    childAt.setRotation(c0191a.f775X);
                    childAt.setRotationX(c0191a.f776Y);
                    childAt.setRotationY(c0191a.f777Z);
                    childAt.setScaleX(c0191a.aa);
                    childAt.setScaleY(c0191a.ab);
                    if (!Float.isNaN(c0191a.ac)) {
                        childAt.setPivotX(c0191a.ac);
                    }
                    if (!Float.isNaN(c0191a.ad)) {
                        childAt.setPivotY(c0191a.ad);
                    }
                    childAt.setTranslationX(c0191a.ae);
                    childAt.setTranslationY(c0191a.af);
                    if (VERSION.SDK_INT >= 21) {
                        childAt.setTranslationZ(c0191a.ag);
                        if (c0191a.f773V) {
                            childAt.setElevation(c0191a.f774W);
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0191a c0191a2 = (C0191a) this.f806a.get(num);
            if (c0191a2.as != -1) {
                if (c0191a2.as == 1) {
                    childAt = new C4707a(constraintLayout.getContext());
                    childAt.setId(num.intValue());
                    childAt.setReferencedIds(c0191a2.at);
                    childAt.setType(c0191a2.ar);
                    LayoutParams a = ConstraintLayout.m265a();
                    c0191a2.m385a(a);
                    constraintLayout.addView(childAt, a);
                }
            }
            if (c0191a2.f778a) {
                childAt = new C0194e(constraintLayout.getContext());
                childAt.setId(num.intValue());
                LayoutParams a2 = ConstraintLayout.m265a();
                c0191a2.m385a(a2);
                constraintLayout.addView(childAt, a2);
            }
        }
    }
}
