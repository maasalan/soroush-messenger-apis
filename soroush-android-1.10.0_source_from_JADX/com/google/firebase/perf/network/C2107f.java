package com.google.firebase.perf.network;

import com.google.android.gms.internal.ms;
import com.google.android.gms.internal.zzevc;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

public final class C2107f<T> implements ResponseHandler<T> {
    private final ResponseHandler<? extends T> f7089a;
    private final zzevc f7090b;
    private final ms f7091c;

    public C2107f(ResponseHandler<? extends T> responseHandler, zzevc com_google_android_gms_internal_zzevc, ms msVar) {
        this.f7089a = responseHandler;
        this.f7090b = com_google_android_gms_internal_zzevc;
        this.f7091c = msVar;
    }

    public final T handleResponse(HttpResponse httpResponse) {
        this.f7091c.m16719e(this.f7090b.m5170b());
        this.f7091c.m16710a(httpResponse.getStatusLine().getStatusCode());
        Long a = C2108h.m5791a((HttpMessage) httpResponse);
        if (a != null) {
            this.f7091c.m16714b(a.longValue());
        }
        String a2 = C2108h.m5792a(httpResponse);
        if (a2 != null) {
            this.f7091c.m16717c(a2);
        }
        this.f7091c.m16713a();
        return this.f7089a.handleResponse(httpResponse);
    }
}
