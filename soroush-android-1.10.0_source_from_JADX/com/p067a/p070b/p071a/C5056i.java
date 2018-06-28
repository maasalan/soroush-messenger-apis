package com.p067a.p070b.p071a;

import com.p067a.p070b.C0986j;
import com.p067a.p070b.C0989n;
import com.p067a.p070b.C0994p;
import com.p067a.p070b.C0994p.C0992a;
import com.p067a.p070b.C0994p.C0993b;

public abstract class C5056i<T> extends C0989n<T> {
    protected static final String PROTOCOL_CHARSET = "utf-8";
    private static final String PROTOCOL_CONTENT_TYPE = String.format("application/json; charset=%s", new Object[]{PROTOCOL_CHARSET});
    private C0993b<T> mListener;
    private final String mRequestBody;

    public C5056i(int i, String str, String str2, C0993b<T> c0993b, C0992a c0992a) {
        super(i, str, c0992a);
        this.mListener = c0993b;
        this.mRequestBody = str2;
    }

    public C5056i(String str, String str2, C0993b<T> c0993b, C0992a c0992a) {
        this(-1, str, str2, c0993b, c0992a);
    }

    protected void deliverResponse(T t) {
        if (this.mListener != null) {
            this.mListener.onResponse(t);
        }
    }

    public byte[] getBody() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = 0;
        r1 = r5.mRequestBody;	 Catch:{ UnsupportedEncodingException -> 0x000f }
        if (r1 != 0) goto L_0x0006;	 Catch:{ UnsupportedEncodingException -> 0x000f }
    L_0x0005:
        return r0;	 Catch:{ UnsupportedEncodingException -> 0x000f }
    L_0x0006:
        r1 = r5.mRequestBody;	 Catch:{ UnsupportedEncodingException -> 0x000f }
        r2 = "utf-8";	 Catch:{ UnsupportedEncodingException -> 0x000f }
        r1 = r1.getBytes(r2);	 Catch:{ UnsupportedEncodingException -> 0x000f }
        return r1;
    L_0x000f:
        r1 = "Unsupported Encoding while trying to get the bytes of %s using %s";
        r2 = 2;
        r2 = new java.lang.Object[r2];
        r3 = 0;
        r4 = r5.mRequestBody;
        r2[r3] = r4;
        r3 = 1;
        r4 = "utf-8";
        r2[r3] = r4;
        com.p067a.p070b.C1000v.m2458d(r1, r2);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.b.a.i.getBody():byte[]");
    }

    public String getBodyContentType() {
        return PROTOCOL_CONTENT_TYPE;
    }

    public byte[] getPostBody() {
        return getBody();
    }

    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    protected void onFinish() {
        super.onFinish();
        this.mListener = null;
    }

    protected abstract C0994p<T> parseNetworkResponse(C0986j c0986j);
}
