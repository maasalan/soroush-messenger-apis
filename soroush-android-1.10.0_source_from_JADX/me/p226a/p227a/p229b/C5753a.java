package me.p226a.p227a.p229b;

import android.content.Context;
import com.google.p173d.C1958a;
import com.google.p173d.C2007e;
import com.google.p173d.C2047n;
import com.google.p173d.C5628i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import me.p226a.p227a.p228a.C2441a;

public final class C5753a extends C2441a {
    public static final List<C1958a> f15854c;
    public C2456a f15855d;
    private C5628i f15856e;
    private List<C1958a> f15857f;

    public interface C2456a {
        void mo2439a(C2047n c2047n);
    }

    static {
        List arrayList = new ArrayList();
        f15854c = arrayList;
        arrayList.add(C1958a.AZTEC);
        f15854c.add(C1958a.CODABAR);
        f15854c.add(C1958a.CODE_39);
        f15854c.add(C1958a.CODE_93);
        f15854c.add(C1958a.CODE_128);
        f15854c.add(C1958a.DATA_MATRIX);
        f15854c.add(C1958a.EAN_8);
        f15854c.add(C1958a.EAN_13);
        f15854c.add(C1958a.ITF);
        f15854c.add(C1958a.MAXICODE);
        f15854c.add(C1958a.PDF_417);
        f15854c.add(C1958a.QR_CODE);
        f15854c.add(C1958a.RSS_14);
        f15854c.add(C1958a.RSS_EXPANDED);
        f15854c.add(C1958a.UPC_A);
        f15854c.add(C1958a.UPC_E);
        f15854c.add(C1958a.UPC_EAN_EXTENSION);
    }

    public C5753a(Context context) {
        super(context);
        m12898b();
    }

    private com.google.p173d.C5630k m12895a(byte[] r12, int r13, int r14) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r11 = this;
        r0 = r11.m6669a(r13, r14);
        r1 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r10 = new com.google.d.k;	 Catch:{ Exception -> 0x001e }
        r6 = r0.left;	 Catch:{ Exception -> 0x001e }
        r7 = r0.top;	 Catch:{ Exception -> 0x001e }
        r8 = r0.width();	 Catch:{ Exception -> 0x001e }
        r9 = r0.height();	 Catch:{ Exception -> 0x001e }
        r2 = r10;	 Catch:{ Exception -> 0x001e }
        r3 = r12;	 Catch:{ Exception -> 0x001e }
        r4 = r13;	 Catch:{ Exception -> 0x001e }
        r5 = r14;	 Catch:{ Exception -> 0x001e }
        r2.<init>(r3, r4, r5, r6, r7, r8, r9);	 Catch:{ Exception -> 0x001e }
        return r10;
    L_0x001e:
        r10 = r1;
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: me.a.a.b.a.a(byte[], int, int):com.google.d.k");
    }

    private void m12898b() {
        Map enumMap = new EnumMap(C2007e.class);
        enumMap.put(C2007e.POSSIBLE_FORMATS, getFormats());
        this.f15856e = new C5628i();
        this.f15856e.m12368a(enumMap);
    }

    public final Collection<C1958a> getFormats() {
        return this.f15857f == null ? f15854c : this.f15857f;
    }

    public final void onPreviewFrame(byte[] r18, android.hardware.Camera r19) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r17 = this;
        r1 = r17;
        r2 = r1.f15855d;
        if (r2 != 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r2 = r19.getParameters();	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = r2.getPreviewSize();	 Catch:{ RuntimeException -> 0x00e4 }
        r3 = r2.width;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = r2.height;	 Catch:{ RuntimeException -> 0x00e4 }
        r4 = r17.getContext();	 Catch:{ RuntimeException -> 0x00e4 }
        r4 = me.p226a.p227a.p228a.C2450f.m6685a(r4);	 Catch:{ RuntimeException -> 0x00e4 }
        r5 = 1;	 Catch:{ RuntimeException -> 0x00e4 }
        if (r4 != r5) goto L_0x006c;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x001e:
        r4 = r17.getRotationCount();	 Catch:{ RuntimeException -> 0x00e4 }
        r6 = 3;	 Catch:{ RuntimeException -> 0x00e4 }
        if (r4 == r5) goto L_0x0027;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x0025:
        if (r4 != r6) goto L_0x002c;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x0027:
        r16 = r3;	 Catch:{ RuntimeException -> 0x00e4 }
        r3 = r2;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = r16;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x002c:
        r4 = r19.getParameters();	 Catch:{ RuntimeException -> 0x00e4 }
        r4 = r4.getPreviewSize();	 Catch:{ RuntimeException -> 0x00e4 }
        r7 = r4.width;	 Catch:{ RuntimeException -> 0x00e4 }
        r4 = r4.height;	 Catch:{ RuntimeException -> 0x00e4 }
        r8 = r17.getRotationCount();	 Catch:{ RuntimeException -> 0x00e4 }
        if (r8 == r5) goto L_0x0040;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x003e:
        if (r8 != r6) goto L_0x006c;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x0040:
        r6 = 0;	 Catch:{ RuntimeException -> 0x00e4 }
        r9 = r4;	 Catch:{ RuntimeException -> 0x00e4 }
        r4 = r6;	 Catch:{ RuntimeException -> 0x00e4 }
        r10 = r7;	 Catch:{ RuntimeException -> 0x00e4 }
        r7 = r18;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x0046:
        if (r4 >= r8) goto L_0x006e;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x0048:
        r11 = r7.length;	 Catch:{ RuntimeException -> 0x00e4 }
        r11 = new byte[r11];	 Catch:{ RuntimeException -> 0x00e4 }
        r12 = r6;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x004c:
        if (r12 >= r9) goto L_0x0063;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x004e:
        r13 = r6;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x004f:
        if (r13 >= r10) goto L_0x0060;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x0051:
        r14 = r13 * r9;	 Catch:{ RuntimeException -> 0x00e4 }
        r14 = r14 + r9;	 Catch:{ RuntimeException -> 0x00e4 }
        r14 = r14 - r12;	 Catch:{ RuntimeException -> 0x00e4 }
        r14 = r14 - r5;	 Catch:{ RuntimeException -> 0x00e4 }
        r15 = r12 * r10;	 Catch:{ RuntimeException -> 0x00e4 }
        r15 = r15 + r13;	 Catch:{ RuntimeException -> 0x00e4 }
        r15 = r7[r15];	 Catch:{ RuntimeException -> 0x00e4 }
        r11[r14] = r15;	 Catch:{ RuntimeException -> 0x00e4 }
        r13 = r13 + 1;	 Catch:{ RuntimeException -> 0x00e4 }
        goto L_0x004f;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x0060:
        r12 = r12 + 1;	 Catch:{ RuntimeException -> 0x00e4 }
        goto L_0x004c;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x0063:
        r4 = r4 + 1;	 Catch:{ RuntimeException -> 0x00e4 }
        r7 = r11;	 Catch:{ RuntimeException -> 0x00e4 }
        r16 = r10;	 Catch:{ RuntimeException -> 0x00e4 }
        r10 = r9;	 Catch:{ RuntimeException -> 0x00e4 }
        r9 = r16;	 Catch:{ RuntimeException -> 0x00e4 }
        goto L_0x0046;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x006c:
        r7 = r18;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x006e:
        r4 = 0;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = r1.m12895a(r7, r3, r2);	 Catch:{ RuntimeException -> 0x00e4 }
        if (r2 == 0) goto L_0x00ca;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x0075:
        r3 = new com.google.d.c;	 Catch:{ RuntimeException -> 0x00e4 }
        r5 = new com.google.d.b.j;	 Catch:{ RuntimeException -> 0x00e4 }
        r5.<init>(r2);	 Catch:{ RuntimeException -> 0x00e4 }
        r3.<init>(r5);	 Catch:{ RuntimeException -> 0x00e4 }
        r5 = r1.f15856e;	 Catch:{ m -> 0x009d, NullPointerException -> 0x009a, ArrayIndexOutOfBoundsException -> 0x0094, all -> 0x008c }
        r3 = r5.m12365a(r3);	 Catch:{ m -> 0x009d, NullPointerException -> 0x009a, ArrayIndexOutOfBoundsException -> 0x0094, all -> 0x008c }
        r4 = r1.f15856e;	 Catch:{ RuntimeException -> 0x00e4 }
        r4.mo1758a();	 Catch:{ RuntimeException -> 0x00e4 }
        r4 = r3;	 Catch:{ RuntimeException -> 0x00e4 }
        goto L_0x00a0;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x008c:
        r0 = move-exception;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = r0;	 Catch:{ RuntimeException -> 0x00e4 }
        r3 = r1.f15856e;	 Catch:{ RuntimeException -> 0x00e4 }
        r3.mo1758a();	 Catch:{ RuntimeException -> 0x00e4 }
        throw r2;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x0094:
        r3 = r1.f15856e;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x0096:
        r3.mo1758a();	 Catch:{ RuntimeException -> 0x00e4 }
        goto L_0x00a0;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x009a:
        r3 = r1.f15856e;	 Catch:{ RuntimeException -> 0x00e4 }
        goto L_0x0096;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x009d:
        r3 = r1.f15856e;	 Catch:{ RuntimeException -> 0x00e4 }
        goto L_0x0096;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x00a0:
        if (r4 != 0) goto L_0x00ca;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x00a2:
        r2 = r2.mo1770c();	 Catch:{ RuntimeException -> 0x00e4 }
        r3 = new com.google.d.c;	 Catch:{ RuntimeException -> 0x00e4 }
        r5 = new com.google.d.b.j;	 Catch:{ RuntimeException -> 0x00e4 }
        r5.<init>(r2);	 Catch:{ RuntimeException -> 0x00e4 }
        r3.<init>(r5);	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = r1.f15856e;	 Catch:{ j -> 0x00c5, all -> 0x00bd }
        r2 = r2.m12365a(r3);	 Catch:{ j -> 0x00c5, all -> 0x00bd }
        r3 = r1.f15856e;	 Catch:{ RuntimeException -> 0x00e4 }
        r3.mo1758a();	 Catch:{ RuntimeException -> 0x00e4 }
        r4 = r2;	 Catch:{ RuntimeException -> 0x00e4 }
        goto L_0x00ca;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x00bd:
        r0 = move-exception;	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = r0;	 Catch:{ RuntimeException -> 0x00e4 }
        r3 = r1.f15856e;	 Catch:{ RuntimeException -> 0x00e4 }
        r3.mo1758a();	 Catch:{ RuntimeException -> 0x00e4 }
        throw r2;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x00c5:
        r2 = r1.f15856e;	 Catch:{ RuntimeException -> 0x00e4 }
        r2.mo1758a();	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x00ca:
        if (r4 == 0) goto L_0x00de;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x00cc:
        r2 = new android.os.Handler;	 Catch:{ RuntimeException -> 0x00e4 }
        r3 = android.os.Looper.getMainLooper();	 Catch:{ RuntimeException -> 0x00e4 }
        r2.<init>(r3);	 Catch:{ RuntimeException -> 0x00e4 }
        r3 = new me.a.a.b.a$1;	 Catch:{ RuntimeException -> 0x00e4 }
        r3.<init>(r1, r4);	 Catch:{ RuntimeException -> 0x00e4 }
        r2.post(r3);	 Catch:{ RuntimeException -> 0x00e4 }
        return;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x00de:
        r2 = r19;	 Catch:{ RuntimeException -> 0x00e4 }
        r2.setOneShotPreviewCallback(r1);	 Catch:{ RuntimeException -> 0x00e4 }
        return;
    L_0x00e4:
        r0 = move-exception;
        r2 = r0;
        r3 = "ZXingScannerView";
        r4 = r2.toString();
        android.util.Log.e(r3, r4, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: me.a.a.b.a.onPreviewFrame(byte[], android.hardware.Camera):void");
    }

    public final void setFormats(List<C1958a> list) {
        this.f15857f = list;
        m12898b();
    }

    public final void setResultHandler(C2456a c2456a) {
        this.f15855d = c2456a;
    }
}
