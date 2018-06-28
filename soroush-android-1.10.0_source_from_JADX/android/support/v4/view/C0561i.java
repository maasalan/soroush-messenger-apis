package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

public final class C0561i {
    public boolean f1852a;
    private ViewParent f1853b;
    private ViewParent f1854c;
    private final View f1855d;
    private int[] f1856e;

    public C0561i(View view) {
        this.f1855d = view;
    }

    private void m1243a(int i, ViewParent viewParent) {
        switch (i) {
            case 0:
                this.f1853b = viewParent;
                return;
            case 1:
                this.f1854c = viewParent;
                return;
            default:
                return;
        }
    }

    private ViewParent m1244c(int i) {
        switch (i) {
            case 0:
                return this.f1853b;
            case 1:
                return this.f1854c;
            default:
                return null;
        }
    }

    public final void m1245a(boolean z) {
        if (this.f1852a) {
            C0571r.m1325C(this.f1855d);
        }
        this.f1852a = z;
    }

    public final boolean m1246a(float f, float f2) {
        if (this.f1852a) {
            ViewParent c = m1244c(0);
            if (c != null) {
                return C0576u.m1405a(c, this.f1855d, f, f2);
            }
        }
        return false;
    }

    public final boolean m1247a(float f, float f2, boolean z) {
        if (this.f1852a) {
            ViewParent c = m1244c(0);
            if (c != null) {
                return C0576u.m1406a(c, this.f1855d, f, f2, z);
            }
        }
        return false;
    }

    public final boolean m1248a(int i) {
        return m1244c(i) != null;
    }

    public final boolean m1249a(int i, int i2) {
        if (m1248a(i2)) {
            return true;
        }
        if (this.f1852a) {
            View view = this.f1855d;
            for (ViewParent parent = this.f1855d.getParent(); parent != null; parent = parent.getParent()) {
                if (C0576u.m1407a(parent, view, this.f1855d, i, i2)) {
                    m1243a(i2, parent);
                    C0576u.m1408b(parent, view, this.f1855d, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public final boolean m1250a(int i, int i2, int i3, int i4, int[] iArr) {
        return m1251a(i, i2, i3, i4, iArr, 0);
    }

    public final boolean m1251a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        int[] iArr2 = iArr;
        if (this.f1852a) {
            int i6 = i5;
            ViewParent c = m1244c(i6);
            if (c == null) {
                return false;
            }
            int i7;
            int i8;
            if (i == 0 && i2 == 0 && i3 == 0) {
                if (i4 == 0) {
                    if (iArr2 != null) {
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        return false;
                    }
                }
            }
            if (iArr2 != null) {
                r0.f1855d.getLocationInWindow(iArr2);
                i7 = iArr2[0];
                i8 = iArr2[1];
            } else {
                i7 = 0;
                i8 = i7;
            }
            C0576u.m1403a(c, r0.f1855d, i, i2, i3, i4, i6);
            if (iArr2 != null) {
                r0.f1855d.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i7;
                iArr2[1] = iArr2[1] - i8;
            }
            return true;
        }
        return false;
    }

    public final boolean m1252a(int i, int i2, int[] iArr, int[] iArr2) {
        return m1253a(i, i2, iArr, iArr2, 0);
    }

    public final boolean m1253a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        if (this.f1852a) {
            ViewParent c = m1244c(i3);
            if (c == null) {
                return false;
            }
            int i4;
            int i5;
            if (i == 0) {
                if (i2 == 0) {
                    if (iArr2 != null) {
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        return false;
                    }
                }
            }
            if (iArr2 != null) {
                this.f1855d.getLocationInWindow(iArr2);
                i4 = iArr2[0];
                i5 = iArr2[1];
            } else {
                i4 = 0;
                i5 = i4;
            }
            if (iArr == null) {
                if (this.f1856e == null) {
                    this.f1856e = new int[2];
                }
                iArr = this.f1856e;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            C0576u.m1404a(c, this.f1855d, i, i2, iArr, i3);
            if (iArr2 != null) {
                this.f1855d.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i4;
                iArr2[1] = iArr2[1] - i5;
            }
            return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
        }
        return false;
    }

    public final void m1254b(int i) {
        ViewParent c = m1244c(i);
        if (c != null) {
            C0576u.m1402a(c, this.f1855d, i);
            m1243a(i, null);
        }
    }
}
