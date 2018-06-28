package lecho.lib.hellocharts.p224g;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import lecho.lib.hellocharts.model.C2435e;
import lecho.lib.hellocharts.model.C2436g;
import lecho.lib.hellocharts.model.C2438h.C2437a;
import lecho.lib.hellocharts.model.C2439i;
import lecho.lib.hellocharts.model.Viewport;
import lecho.lib.hellocharts.p223f.C2425a;
import lecho.lib.hellocharts.p225h.C2429b;
import lecho.lib.hellocharts.view.C2440b;

public final class C6632d extends C5749a {
    private C2425a f18893q;
    private int f18894r;
    private float f18895s;
    private int f18896t;
    private Path f18897u = new Path();
    private Paint f18898v = new Paint();
    private Paint f18899w = new Paint();
    private Bitmap f18900x;
    private Canvas f18901y = new Canvas();
    private Viewport f18902z = new Viewport();

    public C6632d(Context context, C2440b c2440b, C2425a c2425a) {
        super(context, c2440b);
        this.f18893q = c2425a;
        this.f18896t = C2429b.m6640a(this.i, 4);
        this.f18898v.setAntiAlias(true);
        this.f18898v.setStyle(Style.STROKE);
        this.f18898v.setStrokeCap(Cap.ROUND);
        this.f18898v.setStrokeWidth((float) C2429b.m6640a(this.i, 3));
        this.f18899w.setAntiAlias(true);
        this.f18899w.setStyle(Style.FILL);
        this.f18894r = C2429b.m6640a(this.i, 2);
    }

    private void m17119a(Canvas canvas, C2435e c2435e) {
        int size = c2435e.f8085q.size();
        if (size >= 2) {
            Rect b = this.c.m6589b();
            float min = Math.min((float) b.bottom, Math.max(this.c.m6588b(this.f18895s), (float) b.top));
            float max = Math.max(this.c.m6577a(((C2436g) c2435e.f8085q.get(0)).f8086a), (float) b.left);
            this.f18897u.lineTo(Math.min(this.c.m6577a(((C2436g) c2435e.f8085q.get(size - 1)).f8086a), (float) b.right), min);
            this.f18897u.lineTo(max, min);
            this.f18897u.close();
            this.f18898v.setStyle(Style.FILL);
            this.f18898v.setAlpha(c2435e.f8072d);
            canvas.drawPath(this.f18897u, this.f18898v);
            this.f18898v.setStyle(Style.STROKE);
        }
    }

    private void m17120a(Canvas canvas, C2435e c2435e, float f, float f2, float f3) {
        if (C2439i.SQUARE.equals(c2435e.f8082n)) {
            canvas.drawRect(f - f3, f2 - f3, f + f3, f2 + f3, this.f18899w);
        } else if (C2439i.CIRCLE.equals(c2435e.f8082n)) {
            canvas.drawCircle(f, f2, f3, this.f18899w);
        } else if (C2439i.DIAMOND.equals(c2435e.f8082n)) {
            canvas.save();
            canvas.rotate(45.0f, f, f2);
            canvas.drawRect(f - f3, f2 - f3, f + f3, f2 + f3, this.f18899w);
            canvas.restore();
        } else {
            StringBuilder stringBuilder = new StringBuilder("Invalid point shape: ");
            stringBuilder.append(c2435e.f8082n);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    private void m17121a(Canvas canvas, C2435e c2435e, int i, int i2) {
        C2435e c2435e2 = c2435e;
        int i3 = i2;
        this.f18899w.setColor(c2435e2.f8070b == 0 ? c2435e2.f8069a : c2435e2.f8070b);
        int i4 = 0;
        for (C2436g c2436g : c2435e2.f8085q) {
            int a = C2429b.m6640a(r7.i, c2435e2.f8074f);
            float a2 = r7.c.m6577a(c2436g.f8086a);
            float b = r7.c.m6588b(c2436g.f8087b);
            if (r7.c.m6586a(a2, b, (float) r7.f18894r)) {
                if (i3 == 0) {
                    m17120a(canvas, c2435e2, a2, b, (float) a);
                    if (c2435e2.f8077i) {
                        m17122a(canvas, c2435e2, c2436g, a2, b, (float) (a + r7.m));
                    }
                } else if (1 == i3) {
                    if (r7.k.f8097a == i && r7.k.f8098b == i4) {
                        int a3 = C2429b.m6640a(r7.i, c2435e2.f8074f);
                        r7.f18899w.setColor(c2435e2.f8071c);
                        m17120a(canvas, c2435e2, a2, b, (float) (r7.f18896t + a3));
                        if (c2435e2.f8077i || c2435e2.f8078j) {
                            m17122a(canvas, c2435e2, c2436g, a2, b, (float) (a3 + r7.m));
                        }
                    }
                    i4++;
                } else {
                    StringBuilder stringBuilder = new StringBuilder("Cannot process points in mode: ");
                    stringBuilder.append(i3);
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
            a = i;
            i4++;
        }
    }

    private void m17122a(Canvas canvas, C2435e c2435e, C2436g c2436g, float f, float f2, float f3) {
        Rect b = this.c.m6589b();
        int a = c2435e.f8084p.mo2096a(this.l, c2436g);
        if (a != 0) {
            float f4;
            float f5;
            float measureText = this.d.measureText(this.l, this.l.length - a, a);
            int abs = Math.abs(this.g.ascent);
            float f6 = measureText / 2.0f;
            float f7 = (f - f6) - ((float) this.n);
            f6 = (f6 + f) + ((float) this.n);
            if (c2436g.f8087b >= this.f18895s) {
                f4 = f2 - f3;
                f5 = (f4 - ((float) abs)) - ((float) (this.n * 2));
            } else {
                f5 = f2 + f3;
                f4 = (((float) abs) + f5) + ((float) (this.n * 2));
            }
            if (f5 < ((float) b.top)) {
                f5 = f2 + f3;
                f4 = (((float) abs) + f5) + ((float) (this.n * 2));
            }
            if (f4 > ((float) b.bottom)) {
                f4 = f2 - f3;
                f5 = (f4 - ((float) abs)) - ((float) (this.n * 2));
            }
            if (f7 < ((float) b.left)) {
                f2 = (f + measureText) + ((float) (this.n * 2));
                f7 = f;
            } else {
                f2 = f6;
            }
            if (f2 > ((float) b.right)) {
                f7 = (f - measureText) - ((float) (this.n * 2));
            } else {
                f = f2;
            }
            this.f.set(f7, f5, f, f4);
            m12870a(canvas, this.l, this.l.length - a, a, c2435e.f8071c);
        }
    }

    private static boolean m17123a(C2435e c2435e) {
        return c2435e.f8075g || c2435e.f8085q.size() == 1;
    }

    private void m17124b(C2435e c2435e) {
        this.f18898v.setStrokeWidth((float) C2429b.m6640a(this.i, c2435e.f8073e));
        this.f18898v.setColor(c2435e.f8069a);
        this.f18898v.setPathEffect(c2435e.f8083o);
    }

    private int m17125j() {
        int i = 0;
        for (C2435e c2435e : this.f18893q.getLineChartData().f18903k) {
            if (C6632d.m17123a(c2435e)) {
                int i2 = c2435e.f8074f + 4;
                if (i2 > i) {
                    i = i2;
                }
            }
        }
        return C2429b.m6640a(this.i, i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3157a(android.graphics.Canvas r24) {
        /*
        r23 = this;
        r0 = r23;
        r1 = r0.f18893q;
        r1 = r1.getLineChartData();
        r2 = r0.f18900x;
        r3 = 0;
        if (r2 == 0) goto L_0x0015;
    L_0x000d:
        r2 = r0.f18901y;
        r4 = android.graphics.PorterDuff.Mode.CLEAR;
        r2.drawColor(r3, r4);
        goto L_0x0017;
    L_0x0015:
        r2 = r24;
    L_0x0017:
        r1 = r1.f18903k;
        r1 = r1.iterator();
    L_0x001d:
        r4 = r1.hasNext();
        r5 = 0;
        if (r4 == 0) goto L_0x01bf;
    L_0x0024:
        r4 = r1.next();
        r4 = (lecho.lib.hellocharts.model.C2435e) r4;
        r6 = r4.f8076h;
        if (r6 == 0) goto L_0x001d;
    L_0x002e:
        r6 = r4.f8079k;
        if (r6 == 0) goto L_0x012f;
    L_0x0032:
        r0.m17124b(r4);
        r5 = r4.f8085q;
        r5 = r5.size();
        r6 = 2143289344; // 0x7fc00000 float:NaN double:1.058925634E-314;
        r7 = r6;
        r8 = r7;
        r9 = r8;
        r10 = r9;
        r11 = r10;
        r12 = r11;
        r6 = r3;
    L_0x0044:
        if (r6 >= r5) goto L_0x011a;
    L_0x0046:
        r13 = java.lang.Float.isNaN(r7);
        if (r13 == 0) goto L_0x0069;
    L_0x004c:
        r7 = r4.f8085q;
        r7 = r7.get(r6);
        r7 = (lecho.lib.hellocharts.model.C2436g) r7;
        r9 = r0.c;
        r13 = r7.f8086a;
        r9 = r9.m6577a(r13);
        r13 = r0.c;
        r7 = r7.f8087b;
        r7 = r13.m6588b(r7);
        r22 = r9;
        r9 = r7;
        r7 = r22;
    L_0x0069:
        r13 = java.lang.Float.isNaN(r8);
        if (r13 == 0) goto L_0x0093;
    L_0x006f:
        if (r6 <= 0) goto L_0x0091;
    L_0x0071:
        r8 = r4.f8085q;
        r11 = r6 + -1;
        r8 = r8.get(r11);
        r8 = (lecho.lib.hellocharts.model.C2436g) r8;
        r11 = r0.c;
        r13 = r8.f8086a;
        r11 = r11.m6577a(r13);
        r13 = r0.c;
        r8 = r8.f8087b;
        r8 = r13.m6588b(r8);
        r22 = r11;
        r11 = r8;
        r8 = r22;
        goto L_0x0093;
    L_0x0091:
        r8 = r7;
        r11 = r9;
    L_0x0093:
        r13 = java.lang.Float.isNaN(r10);
        if (r13 == 0) goto L_0x00ba;
    L_0x0099:
        r10 = 1;
        if (r6 <= r10) goto L_0x00b7;
    L_0x009c:
        r10 = r4.f8085q;
        r12 = r6 + -2;
        r10 = r10.get(r12);
        r10 = (lecho.lib.hellocharts.model.C2436g) r10;
        r12 = r0.c;
        r13 = r10.f8086a;
        r12 = r12.m6577a(r13);
        r13 = r0.c;
        r10 = r10.f8087b;
        r10 = r13.m6588b(r10);
        goto L_0x00bf;
    L_0x00b7:
        r12 = r8;
        r10 = r11;
        goto L_0x00bf;
    L_0x00ba:
        r22 = r12;
        r12 = r10;
        r10 = r22;
    L_0x00bf:
        r13 = r5 + -1;
        if (r6 >= r13) goto L_0x00e2;
    L_0x00c3:
        r13 = r4.f8085q;
        r14 = r6 + 1;
        r13 = r13.get(r14);
        r13 = (lecho.lib.hellocharts.model.C2436g) r13;
        r14 = r0.c;
        r15 = r13.f8086a;
        r14 = r14.m6577a(r15);
        r15 = r0.c;
        r13 = r13.f8087b;
        r13 = r15.m6588b(r13);
        r21 = r13;
        r20 = r14;
        goto L_0x00e6;
    L_0x00e2:
        r20 = r7;
        r21 = r9;
    L_0x00e6:
        if (r6 != 0) goto L_0x00ee;
    L_0x00e8:
        r10 = r0.f18897u;
        r10.moveTo(r7, r9);
        goto L_0x010e;
    L_0x00ee:
        r12 = r7 - r12;
        r10 = r9 - r10;
        r13 = r20 - r8;
        r14 = r21 - r11;
        r15 = 1042536202; // 0x3e23d70a float:0.16 double:5.15081322E-315;
        r12 = r12 * r15;
        r12 = r12 + r8;
        r10 = r10 * r15;
        r10 = r10 + r11;
        r13 = r13 * r15;
        r16 = r7 - r13;
        r15 = r15 * r14;
        r17 = r9 - r15;
        r13 = r0.f18897u;
        r14 = r12;
        r15 = r10;
        r18 = r7;
        r19 = r9;
        r13.cubicTo(r14, r15, r16, r17, r18, r19);
    L_0x010e:
        r6 = r6 + 1;
        r10 = r8;
        r12 = r11;
        r8 = r7;
        r11 = r9;
        r7 = r20;
        r9 = r21;
        goto L_0x0044;
    L_0x011a:
        r5 = r0.f18897u;
        r6 = r0.f18898v;
        r2.drawPath(r5, r6);
        r5 = r4.f8081m;
        if (r5 == 0) goto L_0x0128;
    L_0x0125:
        r0.m17119a(r2, r4);
    L_0x0128:
        r4 = r0.f18897u;
        r4.reset();
        goto L_0x001d;
    L_0x012f:
        r6 = r4.f8080l;
        if (r6 == 0) goto L_0x017c;
    L_0x0133:
        r0.m17124b(r4);
        r6 = r4.f8085q;
        r6 = r6.iterator();
        r7 = r5;
        r5 = r3;
    L_0x013e:
        r8 = r6.hasNext();
        if (r8 == 0) goto L_0x0170;
    L_0x0144:
        r8 = r6.next();
        r8 = (lecho.lib.hellocharts.model.C2436g) r8;
        r9 = r0.c;
        r10 = r8.f8086a;
        r9 = r9.m6577a(r10);
        r10 = r0.c;
        r8 = r8.f8087b;
        r8 = r10.m6588b(r8);
        if (r5 != 0) goto L_0x0162;
    L_0x015c:
        r7 = r0.f18897u;
        r7.moveTo(r9, r8);
        goto L_0x016c;
    L_0x0162:
        r10 = r0.f18897u;
        r10.lineTo(r9, r7);
        r7 = r0.f18897u;
        r7.lineTo(r9, r8);
    L_0x016c:
        r5 = r5 + 1;
        r7 = r8;
        goto L_0x013e;
    L_0x0170:
        r5 = r0.f18897u;
        r6 = r0.f18898v;
        r2.drawPath(r5, r6);
        r5 = r4.f8081m;
        if (r5 == 0) goto L_0x0128;
    L_0x017b:
        goto L_0x0125;
    L_0x017c:
        r0.m17124b(r4);
        r5 = r4.f8085q;
        r5 = r5.iterator();
        r6 = r3;
    L_0x0186:
        r7 = r5.hasNext();
        if (r7 == 0) goto L_0x01b2;
    L_0x018c:
        r7 = r5.next();
        r7 = (lecho.lib.hellocharts.model.C2436g) r7;
        r8 = r0.c;
        r9 = r7.f8086a;
        r8 = r8.m6577a(r9);
        r9 = r0.c;
        r7 = r7.f8087b;
        r7 = r9.m6588b(r7);
        if (r6 != 0) goto L_0x01aa;
    L_0x01a4:
        r9 = r0.f18897u;
        r9.moveTo(r8, r7);
        goto L_0x01af;
    L_0x01aa:
        r9 = r0.f18897u;
        r9.lineTo(r8, r7);
    L_0x01af:
        r6 = r6 + 1;
        goto L_0x0186;
    L_0x01b2:
        r5 = r0.f18897u;
        r6 = r0.f18898v;
        r2.drawPath(r5, r6);
        r5 = r4.f8081m;
        if (r5 == 0) goto L_0x0128;
    L_0x01bd:
        goto L_0x0125;
    L_0x01bf:
        r1 = r0.f18900x;
        if (r1 == 0) goto L_0x01cb;
    L_0x01c3:
        r1 = r0.f18900x;
        r2 = 0;
        r3 = r24;
        r3.drawBitmap(r1, r5, r5, r2);
    L_0x01cb:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: lecho.lib.hellocharts.g.d.a(android.graphics.Canvas):void");
    }

    public final boolean mo3158a(float f, float f2) {
        this.k.m6662a();
        int i = 0;
        for (C2435e c2435e : this.f18893q.getLineChartData().f18903k) {
            if (C6632d.m17123a(c2435e)) {
                int a = C2429b.m6640a(this.i, c2435e.f8074f);
                int i2 = 0;
                for (C2436g c2436g : c2435e.f8085q) {
                    if ((Math.pow((double) (f - this.c.m6577a(c2436g.f8086a)), 2.0d) + Math.pow((double) (f2 - this.c.m6588b(c2436g.f8087b)), 2.0d) <= 2.0d * Math.pow((double) ((float) (this.f18896t + a)), 2.0d) ? 1 : null) != null) {
                        this.k.m6663a(i, i2, C2437a.LINE);
                    }
                    i2++;
                }
            }
            i++;
        }
        return mo2102c();
    }

    public final void mo2100b() {
        super.mo2100b();
        int j = m17125j();
        this.c.m6590b(j, j, j, j);
        this.f18895s = this.f18893q.getLineChartData().f18904l;
        mo3161i();
    }

    public final void mo3159b(Canvas canvas) {
        int i = 0;
        for (C2435e c2435e : this.f18893q.getLineChartData().f18903k) {
            if (C6632d.m17123a(c2435e)) {
                m17121a(canvas, c2435e, i, 0);
            }
            i++;
        }
        if (mo2102c()) {
            int i2 = this.k.f8097a;
            m17121a(canvas, (C2435e) this.f18893q.getLineChartData().f18903k.get(i2), i2, 1);
        }
    }

    public final void mo3160h() {
        int j = m17125j();
        this.c.m6590b(j, j, j, j);
        if (this.c.m6597g() > 0 && this.c.m6598h() > 0) {
            this.f18900x = Bitmap.createBitmap(this.c.m6597g(), this.c.m6598h(), Config.ARGB_8888);
            this.f18901y.setBitmap(this.f18900x);
        }
    }

    public final void mo3161i() {
        if (this.h) {
            this.f18902z.m6646a(Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, Float.MAX_VALUE);
            for (C2435e c2435e : this.f18893q.getLineChartData().f18903k) {
                for (C2436g c2436g : c2435e.f8085q) {
                    if (c2436g.f8086a < this.f18902z.f8050a) {
                        this.f18902z.f8050a = c2436g.f8086a;
                    }
                    if (c2436g.f8086a > this.f18902z.f8052c) {
                        this.f18902z.f8052c = c2436g.f8086a;
                    }
                    if (c2436g.f8087b < this.f18902z.f8053d) {
                        this.f18902z.f8053d = c2436g.f8087b;
                    }
                    if (c2436g.f8087b > this.f18902z.f8051b) {
                        this.f18902z.f8051b = c2436g.f8087b;
                    }
                }
            }
            this.c.m6591b(this.f18902z);
            this.c.m6585a(this.c.m6595e());
        }
    }
}
