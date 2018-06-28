package mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2;

import android.content.Context;
import android.view.TextureView;

public final class C6229l extends TextureView implements C4119k {
    private C4114e f16859a = new C4114e(this);

    public C6229l(Context context) {
        super(context);
    }

    public final void mo2396a(int i, int i2) {
        if (i > 0 && i2 > 0) {
            C4114e c4114e = this.f16859a;
            c4114e.f11778a = i;
            c4114e.f11779b = i2;
            requestLayout();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void onMeasure(int r10, int r11) {
        /*
        r9 = this;
        r0 = r9.f16859a;
        r1 = r0.f11782e;
        r2 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        r3 = 90;
        if (r1 == r3) goto L_0x000e;
    L_0x000a:
        r1 = r0.f11782e;
        if (r1 != r2) goto L_0x0011;
    L_0x000e:
        r8 = r11;
        r11 = r10;
        r10 = r8;
    L_0x0011:
        r1 = r0.f11778a;
        r1 = android.view.View.getDefaultSize(r1, r10);
        r4 = r0.f11779b;
        r4 = android.view.View.getDefaultSize(r4, r11);
        r5 = r0.f11785h;
        r6 = 3;
        if (r5 != r6) goto L_0x0024;
    L_0x0022:
        goto L_0x0109;
    L_0x0024:
        r5 = r0.f11778a;
        if (r5 <= 0) goto L_0x0107;
    L_0x0028:
        r5 = r0.f11779b;
        if (r5 <= 0) goto L_0x0107;
    L_0x002c:
        r1 = android.view.View.MeasureSpec.getMode(r10);
        r10 = android.view.View.MeasureSpec.getSize(r10);
        r4 = android.view.View.MeasureSpec.getMode(r11);
        r11 = android.view.View.MeasureSpec.getSize(r11);
        r5 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r1 != r5) goto L_0x00b0;
    L_0x0040:
        if (r4 != r5) goto L_0x00b0;
    L_0x0042:
        r1 = (float) r10;
        r4 = (float) r11;
        r5 = r1 / r4;
        r6 = r0.f11785h;
        switch(r6) {
            case 4: goto L_0x0072;
            case 5: goto L_0x0064;
            default: goto L_0x004b;
        };
    L_0x004b:
        r2 = r0.f11778a;
        r2 = (float) r2;
        r3 = r0.f11779b;
        r3 = (float) r3;
        r6 = r2 / r3;
        r2 = r0.f11780c;
        if (r2 <= 0) goto L_0x007f;
    L_0x0057:
        r2 = r0.f11781d;
        if (r2 <= 0) goto L_0x007f;
    L_0x005b:
        r2 = r0.f11780c;
        r2 = (float) r2;
        r6 = r6 * r2;
        r2 = r0.f11781d;
        r2 = (float) r2;
        r6 = r6 / r2;
        goto L_0x007f;
    L_0x0064:
        r6 = 1068149419; // 0x3faaaaab float:1.3333334 double:5.277359326E-315;
        r7 = r0.f11782e;
        if (r7 == r3) goto L_0x006f;
    L_0x006b:
        r3 = r0.f11782e;
        if (r3 != r2) goto L_0x007f;
    L_0x006f:
        r6 = 1061158912; // 0x3f400000 float:0.75 double:5.24282163E-315;
        goto L_0x007f;
    L_0x0072:
        r6 = 1071877689; // 0x3fe38e39 float:1.7777778 double:5.295779427E-315;
        r7 = r0.f11782e;
        if (r7 == r3) goto L_0x007d;
    L_0x0079:
        r3 = r0.f11782e;
        if (r3 != r2) goto L_0x007f;
    L_0x007d:
        r6 = 1058013184; // 0x3f100000 float:0.5625 double:5.22727967E-315;
    L_0x007f:
        r2 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1));
        if (r2 <= 0) goto L_0x0085;
    L_0x0083:
        r2 = 1;
        goto L_0x0086;
    L_0x0085:
        r2 = 0;
    L_0x0086:
        r3 = r0.f11785h;
        switch(r3) {
            case 0: goto L_0x009b;
            case 1: goto L_0x0098;
            case 2: goto L_0x008b;
            case 3: goto L_0x008b;
            case 4: goto L_0x009b;
            case 5: goto L_0x009b;
            default: goto L_0x008b;
        };
    L_0x008b:
        if (r2 == 0) goto L_0x00a5;
    L_0x008d:
        r11 = r0.f11778a;
        r10 = java.lang.Math.min(r11, r10);
        r11 = (float) r10;
        r11 = r11 / r6;
        r11 = (int) r11;
        goto L_0x0109;
    L_0x0098:
        if (r2 == 0) goto L_0x009d;
    L_0x009a:
        goto L_0x00a1;
    L_0x009b:
        if (r2 == 0) goto L_0x00a1;
    L_0x009d:
        r1 = r1 / r6;
        r11 = (int) r1;
        goto L_0x0109;
    L_0x00a1:
        r4 = r4 * r6;
        r10 = (int) r4;
        goto L_0x0109;
    L_0x00a5:
        r10 = r0.f11779b;
        r11 = java.lang.Math.min(r10, r11);
        r10 = (float) r11;
        r10 = r10 * r6;
        r10 = (int) r10;
        goto L_0x0109;
    L_0x00b0:
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r1 != r2) goto L_0x00d4;
    L_0x00b4:
        if (r4 != r2) goto L_0x00d4;
    L_0x00b6:
        r1 = r0.f11778a;
        r1 = r1 * r11;
        r2 = r0.f11779b;
        r2 = r2 * r10;
        if (r1 >= r2) goto L_0x00c5;
    L_0x00be:
        r10 = r0.f11778a;
        r10 = r10 * r11;
        r1 = r0.f11779b;
        r10 = r10 / r1;
        goto L_0x0109;
    L_0x00c5:
        r1 = r0.f11778a;
        r1 = r1 * r11;
        r2 = r0.f11779b;
        r2 = r2 * r10;
        if (r1 <= r2) goto L_0x0109;
    L_0x00cd:
        r11 = r0.f11779b;
        r11 = r11 * r10;
        r1 = r0.f11778a;
        r11 = r11 / r1;
        goto L_0x0109;
    L_0x00d4:
        if (r1 != r2) goto L_0x00e3;
    L_0x00d6:
        r1 = r0.f11779b;
        r1 = r1 * r10;
        r2 = r0.f11778a;
        r1 = r1 / r2;
        if (r4 != r5) goto L_0x00e1;
    L_0x00de:
        if (r1 <= r11) goto L_0x00e1;
    L_0x00e0:
        goto L_0x0109;
    L_0x00e1:
        r11 = r1;
        goto L_0x0109;
    L_0x00e3:
        if (r4 != r2) goto L_0x00f2;
    L_0x00e5:
        r2 = r0.f11778a;
        r2 = r2 * r11;
        r3 = r0.f11779b;
        r2 = r2 / r3;
        if (r1 != r5) goto L_0x00f0;
    L_0x00ed:
        if (r2 <= r10) goto L_0x00f0;
    L_0x00ef:
        goto L_0x0109;
    L_0x00f0:
        r10 = r2;
        goto L_0x0109;
    L_0x00f2:
        r2 = r0.f11778a;
        r3 = r0.f11779b;
        if (r4 != r5) goto L_0x0101;
    L_0x00f8:
        if (r3 <= r11) goto L_0x0101;
    L_0x00fa:
        r2 = r0.f11778a;
        r2 = r2 * r11;
        r3 = r0.f11779b;
        r2 = r2 / r3;
        goto L_0x0102;
    L_0x0101:
        r11 = r3;
    L_0x0102:
        if (r1 != r5) goto L_0x00f0;
    L_0x0104:
        if (r2 <= r10) goto L_0x00f0;
    L_0x0106:
        goto L_0x00cd;
    L_0x0107:
        r10 = r1;
        r11 = r4;
    L_0x0109:
        r0.f11783f = r10;
        r0.f11784g = r11;
        r10 = r9.f16859a;
        r10 = r10.f11783f;
        r11 = r9.f16859a;
        r11 = r11.f11784g;
        r9.setMeasuredDimension(r10, r11);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.l.onMeasure(int, int):void");
    }

    public final void setAspectRatio(int i) {
        this.f16859a.f11785h = i;
        requestLayout();
    }
}
