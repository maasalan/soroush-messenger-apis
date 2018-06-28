package android.support.v4.p031b;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C0436b {

    private static class C0434a {
        int f1542a;
        boolean f1543b;

        C0434a() {
        }
    }

    public static class C0435b {
        public char f1544a;
        public float[] f1545b;

        C0435b(char c, float[] fArr) {
            this.f1544a = c;
            this.f1545b = fArr;
        }

        C0435b(C0435b c0435b) {
            this.f1544a = c0435b.f1544a;
            this.f1545b = C0436b.m918a(c0435b.f1545b, c0435b.f1545b.length);
        }

        private static void m910a(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d3;
            int ceil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d7);
            double sin = Math.sin(d7);
            double cos2 = Math.cos(d8);
            double sin2 = Math.sin(d8);
            double d11 = -d10;
            double d12 = d11 * cos;
            double d13 = d4 * sin;
            d11 *= sin;
            double d14 = d4 * cos;
            sin2 = (sin2 * d11) + (cos2 * d14);
            double d15 = d9 / ((double) ceil);
            int i = 0;
            double d16 = d6;
            double d17 = sin2;
            double d18 = (d12 * sin2) - (d13 * cos2);
            double d19 = d5;
            double d20 = d8;
            while (i < ceil) {
                double d21 = d11;
                d11 = d20 + d15;
                double sin3 = Math.sin(d11);
                double cos3 = Math.cos(d11);
                double d22 = d15;
                d15 = (d + ((d10 * cos) * cos3)) - (d13 * sin3);
                d10 = (d2 + ((d10 * sin) * cos3)) + (d14 * sin3);
                double d23 = (d12 * sin3) - (d13 * cos3);
                sin3 = (sin3 * d21) + (cos3 * d14);
                d20 = d11 - d20;
                double d24 = d14;
                d14 = Math.tan(d20 / 2.0d);
                double d25 = d11;
                d20 = (Math.sin(d20) * (Math.sqrt(4.0d + ((3.0d * d14) * d14)) - 1.0d)) / 3.0d;
                d11 = d19 + (d18 * d20);
                d14 = d16 + (d17 * d20);
                int i2 = ceil;
                double d26 = cos;
                double d27 = d15 - (d20 * d23);
                d20 = d10 - (d20 * sin3);
                double d28 = sin;
                Path path2 = path;
                path2.rLineTo(0.0f, 0.0f);
                path2.cubicTo((float) d11, (float) d14, (float) d27, (float) d20, (float) d15, (float) d10);
                i++;
                d16 = d10;
                d19 = d15;
                d11 = d21;
                d17 = sin3;
                d18 = d23;
                d15 = d22;
                d14 = d24;
                d20 = d25;
                ceil = i2;
                cos = d26;
                sin = d28;
                d10 = d3;
            }
        }

        private static void m911a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double toRadians;
            double cos;
            double d;
            double d2;
            double d3;
            double d4;
            double d5;
            double d6;
            double d7;
            double d8;
            double d9;
            double d10;
            double d11;
            double d12;
            double d13;
            double d14;
            float f8 = f;
            float f9 = f3;
            boolean z3 = z2;
            float f10 = f5;
            float f11 = f6;
            float f12 = f7;
            while (true) {
                toRadians = Math.toRadians((double) f12);
                cos = Math.cos(toRadians);
                double sin = Math.sin(toRadians);
                d = (double) f8;
                d2 = toRadians;
                toRadians = (double) f2;
                d3 = d;
                d = (double) f10;
                d4 = ((d * cos) + (toRadians * sin)) / d;
                d5 = toRadians;
                toRadians = (double) f11;
                float f13 = f10;
                float f14 = f11;
                d6 = ((((double) (-f8)) * sin) + (toRadians * cos)) / toRadians;
                d7 = (double) f4;
                d8 = ((((double) f9) * cos) + (d7 * sin)) / d;
                d9 = ((((double) (-f9)) * sin) + (d7 * cos)) / toRadians;
                d7 = d4 - d8;
                d10 = d6 - d9;
                d11 = (d4 + d8) / 2.0d;
                d12 = (d6 + d9) / 2.0d;
                d13 = sin;
                sin = (d7 * d7) + (d10 * d10);
                if (sin != 0.0d) {
                    d14 = cos;
                    cos = (1.0d / sin) - 0.25d;
                    if (cos >= 0.0d) {
                        break;
                    }
                    StringBuilder stringBuilder = new StringBuilder("Points are too far apart ");
                    stringBuilder.append(sin);
                    Log.w("PathParser", stringBuilder.toString());
                    f8 = (float) (Math.sqrt(sin) / 1.99999d);
                    f10 = f13 * f8;
                    f11 = f14 * f8;
                    f8 = f;
                    f9 = f3;
                    z3 = z2;
                    f12 = f7;
                } else {
                    Log.w("PathParser", " Points are coincident");
                    return;
                }
            }
            cos = Math.sqrt(cos);
            d7 *= cos;
            cos *= d10;
            boolean z4 = z2;
            if (z == z4) {
                d11 -= cos;
                d12 += d7;
            } else {
                d11 += cos;
                d12 -= d7;
            }
            d7 = Math.atan2(d6 - d12, d4 - d11);
            d9 = Math.atan2(d9 - d12, d8 - d11) - d7;
            if (z4 != (d9 >= 0.0d)) {
                d9 = d9 > 0.0d ? d9 - 6.283185307179586d : d9 + 6.283185307179586d;
            }
            d11 *= d;
            d12 *= toRadians;
            C0435b.m910a(path, (d11 * d14) - (d12 * d13), (d11 * d13) + (d12 * d14), d, toRadians, d3, d5, d2, d7, d9);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m912a(android.support.v4.p031b.C0436b.C0435b[] r31, android.graphics.Path r32) {
            /*
            r0 = r31;
            r11 = r32;
            r12 = 6;
            r13 = new float[r12];
            r14 = 0;
            r1 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
            r15 = r14;
        L_0x000b:
            r2 = r0.length;
            if (r15 >= r2) goto L_0x03a3;
        L_0x000e:
            r2 = r0[r15];
            r10 = r2.f1544a;
            r2 = r0[r15];
            r9 = r2.f1545b;
            r2 = r13[r14];
            r16 = 1;
            r3 = r13[r16];
            r17 = 2;
            r4 = r13[r17];
            r18 = 3;
            r5 = r13[r18];
            r19 = 4;
            r6 = r13[r19];
            r20 = 5;
            r7 = r13[r20];
            switch(r10) {
                case 65: goto L_0x0046;
                case 67: goto L_0x0043;
                case 72: goto L_0x0040;
                case 76: goto L_0x002f;
                case 77: goto L_0x002f;
                case 81: goto L_0x003d;
                case 83: goto L_0x003d;
                case 84: goto L_0x002f;
                case 86: goto L_0x0040;
                case 90: goto L_0x0032;
                case 97: goto L_0x0046;
                case 99: goto L_0x0043;
                case 104: goto L_0x0040;
                case 108: goto L_0x002f;
                case 109: goto L_0x002f;
                case 113: goto L_0x003d;
                case 115: goto L_0x003d;
                case 116: goto L_0x002f;
                case 118: goto L_0x0040;
                case 122: goto L_0x0032;
                default: goto L_0x002f;
            };
        L_0x002f:
            r21 = r17;
            goto L_0x0049;
        L_0x0032:
            r32.close();
            r11.moveTo(r6, r7);
            r2 = r6;
            r4 = r2;
            r3 = r7;
            r5 = r3;
            goto L_0x002f;
        L_0x003d:
            r21 = r19;
            goto L_0x0049;
        L_0x0040:
            r21 = r16;
            goto L_0x0049;
        L_0x0043:
            r21 = r12;
            goto L_0x0049;
        L_0x0046:
            r8 = 7;
            r21 = r8;
        L_0x0049:
            r22 = r6;
            r23 = r7;
            r8 = r14;
            r7 = r2;
            r6 = r3;
        L_0x0050:
            r2 = r9.length;
            if (r8 >= r2) goto L_0x0386;
        L_0x0053:
            r14 = 81;
            r2 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
            r3 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
            r26 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
            r12 = 0;
            switch(r10) {
                case 65: goto L_0x0335;
                case 67: goto L_0x0306;
                case 72: goto L_0x02f2;
                case 76: goto L_0x02d9;
                case 77: goto L_0x02b1;
                case 81: goto L_0x028a;
                case 83: goto L_0x0244;
                case 84: goto L_0x0214;
                case 86: goto L_0x0200;
                case 97: goto L_0x01b0;
                case 99: goto L_0x0176;
                case 104: goto L_0x015f;
                case 108: goto L_0x0147;
                case 109: goto L_0x0121;
                case 113: goto L_0x00f1;
                case 115: goto L_0x00ac;
                case 116: goto L_0x007f;
                case 118: goto L_0x006b;
                default: goto L_0x005f;
            };
        L_0x005f:
            r0 = r6;
            r29 = r8;
            r25 = r9;
            r30 = r10;
            r28 = r15;
            r15 = r7;
            goto L_0x0377;
        L_0x006b:
            r1 = r8 + 0;
            r2 = r9[r1];
            r11.rLineTo(r12, r2);
            r1 = r9[r1];
            r6 = r6 + r1;
            r29 = r8;
            r25 = r9;
            r30 = r10;
        L_0x007b:
            r28 = r15;
            goto L_0x0377;
        L_0x007f:
            if (r1 == r3) goto L_0x008c;
        L_0x0081:
            if (r1 == r2) goto L_0x008c;
        L_0x0083:
            if (r1 == r14) goto L_0x008c;
        L_0x0085:
            r2 = 84;
            if (r1 != r2) goto L_0x008a;
        L_0x0089:
            goto L_0x008c;
        L_0x008a:
            r1 = r12;
            goto L_0x0090;
        L_0x008c:
            r12 = r7 - r4;
            r1 = r6 - r5;
        L_0x0090:
            r2 = r8 + 0;
            r3 = r9[r2];
            r4 = r8 + 1;
            r5 = r9[r4];
            r11.rQuadTo(r12, r1, r3, r5);
            r12 = r12 + r7;
            r1 = r1 + r6;
            r2 = r9[r2];
            r7 = r7 + r2;
            r2 = r9[r4];
            r6 = r6 + r2;
            r5 = r1;
            r29 = r8;
            r25 = r9;
            r30 = r10;
            r4 = r12;
            goto L_0x007b;
        L_0x00ac:
            r2 = 99;
            if (r1 == r2) goto L_0x00c0;
        L_0x00b0:
            r2 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
            if (r1 == r2) goto L_0x00c0;
        L_0x00b4:
            r2 = 67;
            if (r1 == r2) goto L_0x00c0;
        L_0x00b8:
            r2 = 83;
            if (r1 != r2) goto L_0x00bd;
        L_0x00bc:
            goto L_0x00c0;
        L_0x00bd:
            r2 = r12;
            r3 = r2;
            goto L_0x00c6;
        L_0x00c0:
            r1 = r7 - r4;
            r2 = r6 - r5;
            r3 = r2;
            r2 = r1;
        L_0x00c6:
            r12 = r8 + 0;
            r4 = r9[r12];
            r14 = r8 + 1;
            r5 = r9[r14];
            r24 = r8 + 2;
            r25 = r9[r24];
            r26 = r8 + 3;
            r27 = r9[r26];
            r1 = r11;
            r0 = r6;
            r6 = r25;
            r28 = r15;
            r15 = r7;
            r7 = r27;
            r1.rCubicTo(r2, r3, r4, r5, r6, r7);
            r1 = r9[r12];
            r7 = r15 + r1;
            r1 = r9[r14];
            r6 = r0 + r1;
            r1 = r9[r24];
            r1 = r1 + r15;
            r2 = r9[r26];
            goto L_0x01a3;
        L_0x00f1:
            r0 = r6;
            r28 = r15;
            r15 = r7;
            r1 = r8 + 0;
            r2 = r9[r1];
            r3 = r8 + 1;
            r4 = r9[r3];
            r5 = r8 + 2;
            r6 = r9[r5];
            r7 = r8 + 3;
            r12 = r9[r7];
            r11.rQuadTo(r2, r4, r6, r12);
            r1 = r9[r1];
            r1 = r1 + r15;
            r2 = r9[r3];
            r6 = r0 + r2;
            r2 = r9[r5];
            r2 = r2 + r15;
            r3 = r9[r7];
            r0 = r0 + r3;
            r4 = r1;
            r7 = r2;
            r5 = r6;
            r29 = r8;
            r25 = r9;
            r30 = r10;
            r6 = r0;
            goto L_0x0377;
        L_0x0121:
            r0 = r6;
            r28 = r15;
            r15 = r7;
            r1 = r8 + 0;
            r2 = r9[r1];
            r7 = r15 + r2;
            r2 = r8 + 1;
            r3 = r9[r2];
            r6 = r0 + r3;
            if (r8 <= 0) goto L_0x013b;
        L_0x0133:
            r0 = r9[r1];
            r1 = r9[r2];
            r11.rLineTo(r0, r1);
            goto L_0x016e;
        L_0x013b:
            r0 = r9[r1];
            r1 = r9[r2];
            r11.rMoveTo(r0, r1);
            r23 = r6;
            r22 = r7;
            goto L_0x016e;
        L_0x0147:
            r0 = r6;
            r28 = r15;
            r15 = r7;
            r1 = r8 + 0;
            r2 = r9[r1];
            r3 = r8 + 1;
            r6 = r9[r3];
            r11.rLineTo(r2, r6);
            r1 = r9[r1];
            r7 = r15 + r1;
            r1 = r9[r3];
            r6 = r0 + r1;
            goto L_0x016e;
        L_0x015f:
            r0 = r6;
            r28 = r15;
            r15 = r7;
            r1 = r8 + 0;
            r2 = r9[r1];
            r11.rLineTo(r2, r12);
            r1 = r9[r1];
            r7 = r15 + r1;
        L_0x016e:
            r29 = r8;
            r25 = r9;
            r30 = r10;
            goto L_0x0377;
        L_0x0176:
            r0 = r6;
            r28 = r15;
            r15 = r7;
            r1 = r8 + 0;
            r2 = r9[r1];
            r1 = r8 + 1;
            r3 = r9[r1];
            r12 = r8 + 2;
            r4 = r9[r12];
            r14 = r8 + 3;
            r5 = r9[r14];
            r24 = r8 + 4;
            r6 = r9[r24];
            r25 = r8 + 5;
            r7 = r9[r25];
            r1 = r11;
            r1.rCubicTo(r2, r3, r4, r5, r6, r7);
            r1 = r9[r12];
            r7 = r15 + r1;
            r1 = r9[r14];
            r6 = r0 + r1;
            r1 = r9[r24];
            r1 = r1 + r15;
            r2 = r9[r25];
        L_0x01a3:
            r0 = r0 + r2;
            r5 = r6;
            r4 = r7;
            r29 = r8;
            r25 = r9;
            r30 = r10;
            r6 = r0;
            r7 = r1;
            goto L_0x0377;
        L_0x01b0:
            r0 = r6;
            r28 = r15;
            r15 = r7;
            r14 = r8 + 5;
            r1 = r9[r14];
            r4 = r1 + r15;
            r24 = r8 + 6;
            r1 = r9[r24];
            r5 = r1 + r0;
            r1 = r8 + 0;
            r6 = r9[r1];
            r1 = r8 + 1;
            r7 = r9[r1];
            r1 = r8 + 2;
            r25 = r9[r1];
            r1 = r8 + 3;
            r1 = r9[r1];
            r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1));
            if (r1 == 0) goto L_0x01d7;
        L_0x01d4:
            r26 = r16;
            goto L_0x01d9;
        L_0x01d7:
            r26 = 0;
        L_0x01d9:
            r1 = r8 + 4;
            r1 = r9[r1];
            r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1));
            if (r1 == 0) goto L_0x01e4;
        L_0x01e1:
            r12 = r16;
            goto L_0x01e5;
        L_0x01e4:
            r12 = 0;
        L_0x01e5:
            r1 = r11;
            r2 = r15;
            r3 = r0;
            r29 = r8;
            r8 = r25;
            r25 = r9;
            r9 = r26;
            r30 = r10;
            r10 = r12;
            android.support.v4.p031b.C0436b.C0435b.m911a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
            r1 = r25[r14];
            r7 = r15 + r1;
            r1 = r25[r24];
            r6 = r0 + r1;
            goto L_0x0375;
        L_0x0200:
            r29 = r8;
            r25 = r9;
            r30 = r10;
            r28 = r15;
            r15 = r7;
            r8 = r29 + 0;
            r0 = r25[r8];
            r11.lineTo(r15, r0);
            r6 = r25[r8];
            goto L_0x0377;
        L_0x0214:
            r0 = r6;
            r29 = r8;
            r25 = r9;
            r30 = r10;
            r28 = r15;
            r15 = r7;
            if (r1 == r3) goto L_0x0228;
        L_0x0220:
            if (r1 == r2) goto L_0x0228;
        L_0x0222:
            if (r1 == r14) goto L_0x0228;
        L_0x0224:
            r2 = 84;
            if (r1 != r2) goto L_0x0231;
        L_0x0228:
            r7 = r26 * r15;
            r7 = r7 - r4;
            r26 = r26 * r0;
            r6 = r26 - r5;
            r0 = r6;
            r15 = r7;
        L_0x0231:
            r8 = r29 + 0;
            r1 = r25[r8];
            r2 = r29 + 1;
            r3 = r25[r2];
            r11.quadTo(r15, r0, r1, r3);
            r7 = r25[r8];
            r6 = r25[r2];
            r5 = r0;
            r4 = r15;
            goto L_0x0377;
        L_0x0244:
            r0 = r6;
            r29 = r8;
            r25 = r9;
            r30 = r10;
            r28 = r15;
            r2 = 99;
            r15 = r7;
            if (r1 == r2) goto L_0x0262;
        L_0x0252:
            r2 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
            if (r1 == r2) goto L_0x0262;
        L_0x0256:
            r2 = 67;
            if (r1 == r2) goto L_0x0262;
        L_0x025a:
            r2 = 83;
            if (r1 != r2) goto L_0x025f;
        L_0x025e:
            goto L_0x0262;
        L_0x025f:
            r3 = r0;
            r2 = r15;
            goto L_0x026c;
        L_0x0262:
            r7 = r26 * r15;
            r7 = r7 - r4;
            r26 = r26 * r0;
            r26 = r26 - r5;
            r2 = r7;
            r3 = r26;
        L_0x026c:
            r8 = r29 + 0;
            r4 = r25[r8];
            r0 = r29 + 1;
            r5 = r25[r0];
            r9 = r29 + 2;
            r6 = r25[r9];
            r10 = r29 + 3;
            r7 = r25[r10];
            r1 = r11;
            r1.cubicTo(r2, r3, r4, r5, r6, r7);
            r1 = r25[r8];
            r0 = r25[r0];
            r7 = r25[r9];
            r6 = r25[r10];
            goto L_0x0332;
        L_0x028a:
            r29 = r8;
            r25 = r9;
            r30 = r10;
            r28 = r15;
            r8 = r29 + 0;
            r0 = r25[r8];
            r1 = r29 + 1;
            r2 = r25[r1];
            r3 = r29 + 2;
            r4 = r25[r3];
            r5 = r29 + 3;
            r6 = r25[r5];
            r11.quadTo(r0, r2, r4, r6);
            r0 = r25[r8];
            r1 = r25[r1];
            r7 = r25[r3];
            r6 = r25[r5];
            r4 = r0;
            r5 = r1;
            goto L_0x0377;
        L_0x02b1:
            r29 = r8;
            r25 = r9;
            r30 = r10;
            r28 = r15;
            r8 = r29 + 0;
            r7 = r25[r8];
            r0 = r29 + 1;
            r6 = r25[r0];
            if (r29 <= 0) goto L_0x02cc;
        L_0x02c3:
            r1 = r25[r8];
            r0 = r25[r0];
            r11.lineTo(r1, r0);
            goto L_0x0377;
        L_0x02cc:
            r1 = r25[r8];
            r0 = r25[r0];
            r11.moveTo(r1, r0);
            r23 = r6;
            r22 = r7;
            goto L_0x0377;
        L_0x02d9:
            r29 = r8;
            r25 = r9;
            r30 = r10;
            r28 = r15;
            r8 = r29 + 0;
            r0 = r25[r8];
            r1 = r29 + 1;
            r2 = r25[r1];
            r11.lineTo(r0, r2);
            r7 = r25[r8];
            r6 = r25[r1];
            goto L_0x0377;
        L_0x02f2:
            r0 = r6;
            r29 = r8;
            r25 = r9;
            r30 = r10;
            r28 = r15;
            r8 = r29 + 0;
            r1 = r25[r8];
            r11.lineTo(r1, r0);
            r7 = r25[r8];
            goto L_0x0377;
        L_0x0306:
            r29 = r8;
            r25 = r9;
            r30 = r10;
            r28 = r15;
            r8 = r29 + 0;
            r2 = r25[r8];
            r8 = r29 + 1;
            r3 = r25[r8];
            r8 = r29 + 2;
            r4 = r25[r8];
            r0 = r29 + 3;
            r5 = r25[r0];
            r9 = r29 + 4;
            r6 = r25[r9];
            r10 = r29 + 5;
            r7 = r25[r10];
            r1 = r11;
            r1.cubicTo(r2, r3, r4, r5, r6, r7);
            r7 = r25[r9];
            r6 = r25[r10];
            r1 = r25[r8];
            r0 = r25[r0];
        L_0x0332:
            r5 = r0;
            r4 = r1;
            goto L_0x0377;
        L_0x0335:
            r0 = r6;
            r29 = r8;
            r25 = r9;
            r30 = r10;
            r28 = r15;
            r15 = r7;
            r14 = r29 + 5;
            r4 = r25[r14];
            r24 = r29 + 6;
            r5 = r25[r24];
            r8 = r29 + 0;
            r6 = r25[r8];
            r8 = r29 + 1;
            r7 = r25[r8];
            r8 = r29 + 2;
            r8 = r25[r8];
            r1 = r29 + 3;
            r1 = r25[r1];
            r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1));
            if (r1 == 0) goto L_0x035e;
        L_0x035b:
            r9 = r16;
            goto L_0x035f;
        L_0x035e:
            r9 = 0;
        L_0x035f:
            r1 = r29 + 4;
            r1 = r25[r1];
            r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1));
            if (r1 == 0) goto L_0x036a;
        L_0x0367:
            r10 = r16;
            goto L_0x036b;
        L_0x036a:
            r10 = 0;
        L_0x036b:
            r1 = r11;
            r2 = r15;
            r3 = r0;
            android.support.v4.p031b.C0436b.C0435b.m911a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
            r7 = r25[r14];
            r6 = r25[r24];
        L_0x0375:
            r5 = r6;
            r4 = r7;
        L_0x0377:
            r8 = r29 + r21;
            r9 = r25;
            r15 = r28;
            r1 = r30;
            r10 = r1;
            r0 = r31;
            r12 = 6;
            r14 = 0;
            goto L_0x0050;
        L_0x0386:
            r0 = r6;
            r1 = r14;
            r28 = r15;
            r15 = r7;
            r13[r1] = r15;
            r13[r16] = r0;
            r13[r17] = r4;
            r13[r18] = r5;
            r13[r19] = r22;
            r13[r20] = r23;
            r0 = r31;
            r2 = r0[r28];
            r2 = r2.f1544a;
            r15 = r28 + 1;
            r1 = r2;
            r12 = 6;
            goto L_0x000b;
        L_0x03a3:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.b.b.b.a(android.support.v4.b.b$b[], android.graphics.Path):void");
        }

        public final void m913a(C0435b c0435b, C0435b c0435b2, float f) {
            for (int i = 0; i < c0435b.f1545b.length; i++) {
                this.f1545b[i] = (c0435b.f1545b[i] * (BallPulseIndicator.SCALE - f)) + (c0435b2.f1545b[i] * f);
            }
        }
    }

    private static int m914a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 65) * (charAt - 90) <= 0 || (charAt - 97) * (charAt - 122) <= 0) && charAt != 'e' && charAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    public static Path m915a(String str) {
        Path path = new Path();
        C0435b[] b = C0436b.m920b(str);
        if (b == null) {
            return null;
        }
        try {
            C0435b.m912a(b, path);
            return path;
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder("Error in parsing ");
            stringBuilder.append(str);
            throw new RuntimeException(stringBuilder.toString(), e);
        }
    }

    private static void m916a(ArrayList<C0435b> arrayList, char c, float[] fArr) {
        arrayList.add(new C0435b(c, fArr));
    }

    public static boolean m917a(C0435b[] c0435bArr, C0435b[] c0435bArr2) {
        if (c0435bArr == null || c0435bArr2 == null || c0435bArr.length != c0435bArr2.length) {
            return false;
        }
        int i = 0;
        while (i < c0435bArr.length) {
            if (c0435bArr[i].f1544a != c0435bArr2[i].f1544a || c0435bArr[i].f1545b.length != c0435bArr2[i].f1545b.length) {
                return false;
            }
            i++;
        }
        return true;
    }

    static float[] m918a(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        i -= 0;
        length = Math.min(i, length - 0);
        Object obj = new float[i];
        System.arraycopy(fArr, 0, obj, 0, length);
        return obj;
    }

    public static C0435b[] m919a(C0435b[] c0435bArr) {
        if (c0435bArr == null) {
            return null;
        }
        C0435b[] c0435bArr2 = new C0435b[c0435bArr.length];
        for (int i = 0; i < c0435bArr.length; i++) {
            c0435bArr2[i] = new C0435b(c0435bArr[i]);
        }
        return c0435bArr2;
    }

    public static C0435b[] m920b(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            i = C0436b.m914a(str, i);
            String trim = str.substring(i2, i).trim();
            if (trim.length() > 0) {
                C0436b.m916a(arrayList, trim.charAt(0), C0436b.m921c(trim));
            }
            i2 = i;
            i++;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            C0436b.m916a(arrayList, str.charAt(i2), new float[0]);
        }
        return (C0435b[]) arrayList.toArray(new C0435b[arrayList.size()]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float[] m921c(java.lang.String r13) {
        /*
        r0 = 0;
        r1 = r13.charAt(r0);
        r2 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        if (r1 == r2) goto L_0x009a;
    L_0x0009:
        r1 = r13.charAt(r0);
        r2 = 90;
        if (r1 != r2) goto L_0x0013;
    L_0x0011:
        goto L_0x009a;
    L_0x0013:
        r1 = r13.length();	 Catch:{ NumberFormatException -> 0x0080 }
        r1 = new float[r1];	 Catch:{ NumberFormatException -> 0x0080 }
        r2 = new android.support.v4.b.b$a;	 Catch:{ NumberFormatException -> 0x0080 }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x0080 }
        r3 = r13.length();	 Catch:{ NumberFormatException -> 0x0080 }
        r4 = 1;
        r6 = r0;
        r5 = r4;
    L_0x0025:
        if (r5 >= r3) goto L_0x007b;
    L_0x0027:
        r2.f1543b = r0;	 Catch:{ NumberFormatException -> 0x0080 }
        r8 = r0;
        r9 = r8;
        r10 = r9;
        r7 = r5;
    L_0x002d:
        r11 = r13.length();	 Catch:{ NumberFormatException -> 0x0080 }
        if (r7 >= r11) goto L_0x005f;
    L_0x0033:
        r11 = r13.charAt(r7);	 Catch:{ NumberFormatException -> 0x0080 }
        r12 = 32;
        if (r11 == r12) goto L_0x0058;
    L_0x003b:
        r12 = 69;
        if (r11 == r12) goto L_0x0056;
    L_0x003f:
        r12 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        if (r11 == r12) goto L_0x0056;
    L_0x0043:
        switch(r11) {
            case 44: goto L_0x0058;
            case 45: goto L_0x004f;
            case 46: goto L_0x0047;
            default: goto L_0x0046;
        };	 Catch:{ NumberFormatException -> 0x0080 }
    L_0x0046:
        goto L_0x0054;
    L_0x0047:
        if (r9 != 0) goto L_0x004c;
    L_0x0049:
        r8 = r0;
        r9 = r4;
        goto L_0x005a;
    L_0x004c:
        r2.f1543b = r4;	 Catch:{ NumberFormatException -> 0x0080 }
        goto L_0x0058;
    L_0x004f:
        if (r7 == r5) goto L_0x0054;
    L_0x0051:
        if (r8 != 0) goto L_0x0054;
    L_0x0053:
        goto L_0x004c;
    L_0x0054:
        r8 = r0;
        goto L_0x005a;
    L_0x0056:
        r8 = r4;
        goto L_0x005a;
    L_0x0058:
        r8 = r0;
        r10 = r4;
    L_0x005a:
        if (r10 != 0) goto L_0x005f;
    L_0x005c:
        r7 = r7 + 1;
        goto L_0x002d;
    L_0x005f:
        r2.f1542a = r7;	 Catch:{ NumberFormatException -> 0x0080 }
        r7 = r2.f1542a;	 Catch:{ NumberFormatException -> 0x0080 }
        if (r5 >= r7) goto L_0x0072;
    L_0x0065:
        r8 = r6 + 1;
        r5 = r13.substring(r5, r7);	 Catch:{ NumberFormatException -> 0x0080 }
        r5 = java.lang.Float.parseFloat(r5);	 Catch:{ NumberFormatException -> 0x0080 }
        r1[r6] = r5;	 Catch:{ NumberFormatException -> 0x0080 }
        r6 = r8;
    L_0x0072:
        r5 = r2.f1543b;	 Catch:{ NumberFormatException -> 0x0080 }
        if (r5 == 0) goto L_0x0078;
    L_0x0076:
        r5 = r7;
        goto L_0x0025;
    L_0x0078:
        r5 = r7 + 1;
        goto L_0x0025;
    L_0x007b:
        r0 = android.support.v4.p031b.C0436b.m918a(r1, r6);	 Catch:{ NumberFormatException -> 0x0080 }
        return r0;
    L_0x0080:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r2 = new java.lang.StringBuilder;
        r3 = "error in parsing \"";
        r2.<init>(r3);
        r2.append(r13);
        r13 = "\"";
        r2.append(r13);
        r13 = r2.toString();
        r1.<init>(r13, r0);
        throw r1;
    L_0x009a:
        r13 = new float[r0];
        return r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.b.b.c(java.lang.String):float[]");
    }
}
