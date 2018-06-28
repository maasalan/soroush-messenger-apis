package com.google.firebase.perf.network;

import android.support.annotation.Keep;
import com.google.android.gms.internal.ms;
import com.google.android.gms.internal.mv;
import com.google.android.gms.internal.zzevc;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpMessage;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

public class FirebasePerfHttpClient {
    private FirebasePerfHttpClient() {
    }

    private static <T> T m5738a(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, zzevc com_google_android_gms_internal_zzevc, mv mvVar) {
        ms a = ms.m16709a(mvVar);
        try {
            String valueOf = String.valueOf(httpHost.toURI());
            String valueOf2 = String.valueOf(httpRequest.getRequestLine().getUri());
            a.m16712a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).m16715b(httpRequest.getRequestLine().getMethod());
            Long a2 = C2108h.m5791a((HttpMessage) httpRequest);
            if (a2 != null) {
                a.m16711a(a2.longValue());
            }
            com_google_android_gms_internal_zzevc.m5169a();
            a.m16716c(com_google_android_gms_internal_zzevc.f6304a);
            return httpClient.execute(httpHost, httpRequest, new C2107f(responseHandler, com_google_android_gms_internal_zzevc, a));
        } catch (IOException e) {
            a.m16719e(com_google_android_gms_internal_zzevc.m5170b());
            C2108h.m5793a(a);
            throw e;
        }
    }

    private static <T> T m5739a(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext, zzevc com_google_android_gms_internal_zzevc, mv mvVar) {
        ms a = ms.m16709a(mvVar);
        try {
            String valueOf = String.valueOf(httpHost.toURI());
            String valueOf2 = String.valueOf(httpRequest.getRequestLine().getUri());
            a.m16712a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).m16715b(httpRequest.getRequestLine().getMethod());
            Long a2 = C2108h.m5791a((HttpMessage) httpRequest);
            if (a2 != null) {
                a.m16711a(a2.longValue());
            }
            com_google_android_gms_internal_zzevc.m5169a();
            a.m16716c(com_google_android_gms_internal_zzevc.f6304a);
            return httpClient.execute(httpHost, httpRequest, new C2107f(responseHandler, com_google_android_gms_internal_zzevc, a), httpContext);
        } catch (IOException e) {
            a.m16719e(com_google_android_gms_internal_zzevc.m5170b());
            C2108h.m5793a(a);
            throw e;
        }
    }

    private static <T> T m5740a(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, zzevc com_google_android_gms_internal_zzevc, mv mvVar) {
        ms a = ms.m16709a(mvVar);
        try {
            a.m16712a(httpUriRequest.getURI().toString()).m16715b(httpUriRequest.getMethod());
            Long a2 = C2108h.m5791a((HttpMessage) httpUriRequest);
            if (a2 != null) {
                a.m16711a(a2.longValue());
            }
            com_google_android_gms_internal_zzevc.m5169a();
            a.m16716c(com_google_android_gms_internal_zzevc.f6304a);
            return httpClient.execute(httpUriRequest, new C2107f(responseHandler, com_google_android_gms_internal_zzevc, a));
        } catch (IOException e) {
            a.m16719e(com_google_android_gms_internal_zzevc.m5170b());
            C2108h.m5793a(a);
            throw e;
        }
    }

    private static <T> T m5741a(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext, zzevc com_google_android_gms_internal_zzevc, mv mvVar) {
        ms a = ms.m16709a(mvVar);
        try {
            a.m16712a(httpUriRequest.getURI().toString()).m16715b(httpUriRequest.getMethod());
            Long a2 = C2108h.m5791a((HttpMessage) httpUriRequest);
            if (a2 != null) {
                a.m16711a(a2.longValue());
            }
            com_google_android_gms_internal_zzevc.m5169a();
            a.m16716c(com_google_android_gms_internal_zzevc.f6304a);
            return httpClient.execute(httpUriRequest, new C2107f(responseHandler, com_google_android_gms_internal_zzevc, a), httpContext);
        } catch (IOException e) {
            a.m16719e(com_google_android_gms_internal_zzevc.m5170b());
            C2108h.m5793a(a);
            throw e;
        }
    }

    private static HttpResponse m5742a(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, zzevc com_google_android_gms_internal_zzevc, mv mvVar) {
        ms a = ms.m16709a(mvVar);
        try {
            String valueOf = String.valueOf(httpHost.toURI());
            String valueOf2 = String.valueOf(httpRequest.getRequestLine().getUri());
            a.m16712a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).m16715b(httpRequest.getRequestLine().getMethod());
            Long a2 = C2108h.m5791a((HttpMessage) httpRequest);
            if (a2 != null) {
                a.m16711a(a2.longValue());
            }
            com_google_android_gms_internal_zzevc.m5169a();
            a.m16716c(com_google_android_gms_internal_zzevc.f6304a);
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            a.m16719e(com_google_android_gms_internal_zzevc.m5170b());
            a.m16710a(execute.getStatusLine().getStatusCode());
            Long a3 = C2108h.m5791a((HttpMessage) execute);
            if (a3 != null) {
                a.m16714b(a3.longValue());
            }
            String a4 = C2108h.m5792a(execute);
            if (a4 != null) {
                a.m16717c(a4);
            }
            a.m16713a();
            return execute;
        } catch (IOException e) {
            a.m16719e(com_google_android_gms_internal_zzevc.m5170b());
            C2108h.m5793a(a);
            throw e;
        }
    }

    private static HttpResponse m5743a(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext, zzevc com_google_android_gms_internal_zzevc, mv mvVar) {
        ms a = ms.m16709a(mvVar);
        try {
            String valueOf = String.valueOf(httpHost.toURI());
            String valueOf2 = String.valueOf(httpRequest.getRequestLine().getUri());
            a.m16712a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).m16715b(httpRequest.getRequestLine().getMethod());
            Long a2 = C2108h.m5791a((HttpMessage) httpRequest);
            if (a2 != null) {
                a.m16711a(a2.longValue());
            }
            com_google_android_gms_internal_zzevc.m5169a();
            a.m16716c(com_google_android_gms_internal_zzevc.f6304a);
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            a.m16719e(com_google_android_gms_internal_zzevc.m5170b());
            a.m16710a(execute.getStatusLine().getStatusCode());
            Long a3 = C2108h.m5791a((HttpMessage) execute);
            if (a3 != null) {
                a.m16714b(a3.longValue());
            }
            String a4 = C2108h.m5792a(execute);
            if (a4 != null) {
                a.m16717c(a4);
            }
            a.m16713a();
            return execute;
        } catch (IOException e) {
            a.m16719e(com_google_android_gms_internal_zzevc.m5170b());
            C2108h.m5793a(a);
            throw e;
        }
    }

    private static HttpResponse m5744a(HttpClient httpClient, HttpUriRequest httpUriRequest, zzevc com_google_android_gms_internal_zzevc, mv mvVar) {
        ms a = ms.m16709a(mvVar);
        try {
            a.m16712a(httpUriRequest.getURI().toString()).m16715b(httpUriRequest.getMethod());
            Long a2 = C2108h.m5791a((HttpMessage) httpUriRequest);
            if (a2 != null) {
                a.m16711a(a2.longValue());
            }
            com_google_android_gms_internal_zzevc.m5169a();
            a.m16716c(com_google_android_gms_internal_zzevc.f6304a);
            HttpResponse execute = httpClient.execute(httpUriRequest);
            a.m16719e(com_google_android_gms_internal_zzevc.m5170b());
            a.m16710a(execute.getStatusLine().getStatusCode());
            Long a3 = C2108h.m5791a((HttpMessage) execute);
            if (a3 != null) {
                a.m16714b(a3.longValue());
            }
            String a4 = C2108h.m5792a(execute);
            if (a4 != null) {
                a.m16717c(a4);
            }
            a.m16713a();
            return execute;
        } catch (IOException e) {
            a.m16719e(com_google_android_gms_internal_zzevc.m5170b());
            C2108h.m5793a(a);
            throw e;
        }
    }

    private static HttpResponse m5745a(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext, zzevc com_google_android_gms_internal_zzevc, mv mvVar) {
        ms a = ms.m16709a(mvVar);
        try {
            a.m16712a(httpUriRequest.getURI().toString()).m16715b(httpUriRequest.getMethod());
            Long a2 = C2108h.m5791a((HttpMessage) httpUriRequest);
            if (a2 != null) {
                a.m16711a(a2.longValue());
            }
            com_google_android_gms_internal_zzevc.m5169a();
            a.m16716c(com_google_android_gms_internal_zzevc.f6304a);
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            a.m16719e(com_google_android_gms_internal_zzevc.m5170b());
            a.m16710a(execute.getStatusLine().getStatusCode());
            Long a3 = C2108h.m5791a((HttpMessage) execute);
            if (a3 != null) {
                a.m16714b(a3.longValue());
            }
            String a4 = C2108h.m5792a(execute);
            if (a4 != null) {
                a.m16717c(a4);
            }
            a.m16713a();
            return execute;
        } catch (IOException e) {
            a.m16719e(com_google_android_gms_internal_zzevc.m5170b());
            C2108h.m5793a(a);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        return m5738a(httpClient, httpHost, httpRequest, (ResponseHandler) responseHandler, new zzevc(), mv.m5020a());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return m5739a(httpClient, httpHost, httpRequest, responseHandler, httpContext, new zzevc(), mv.m5020a());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) {
        return m5740a(httpClient, httpUriRequest, (ResponseHandler) responseHandler, new zzevc(), mv.m5020a());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) {
        return m5741a(httpClient, httpUriRequest, (ResponseHandler) responseHandler, httpContext, new zzevc(), mv.m5020a());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) {
        return m5742a(httpClient, httpHost, httpRequest, new zzevc(), mv.m5020a());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return m5743a(httpClient, httpHost, httpRequest, httpContext, new zzevc(), mv.m5020a());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) {
        return m5744a(httpClient, httpUriRequest, new zzevc(), mv.m5020a());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return m5745a(httpClient, httpUriRequest, httpContext, new zzevc(), mv.m5020a());
    }
}
