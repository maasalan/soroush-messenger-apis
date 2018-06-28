package com.p067a.p070b.p071a;

import com.p067a.p070b.C0989n;
import java.net.URI;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public final class C5054d implements C0973f {
    protected final HttpClient f14128a;

    public static final class C0971a extends HttpEntityEnclosingRequestBase {
        public C0971a(String str) {
            setURI(URI.create(str));
        }

        public final String getMethod() {
            return "PATCH";
        }
    }

    public C5054d(HttpClient httpClient) {
        this.f14128a = httpClient;
    }

    private static void m10279a(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, C0989n<?> c0989n) {
        byte[] body = c0989n.getBody();
        if (body != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(body));
        }
    }

    private static void m10280a(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, (String) map.get(str));
        }
    }

    public final HttpResponse mo1035a(C0989n<?> c0989n, Map<String, String> map) {
        HttpUriRequest httpGet;
        switch (c0989n.getMethod()) {
            case -1:
                byte[] postBody = c0989n.getPostBody();
                if (postBody == null) {
                    httpGet = new HttpGet(c0989n.getUrl());
                    break;
                }
                HttpPost httpPost = new HttpPost(c0989n.getUrl());
                httpPost.addHeader("Content-Type", c0989n.getPostBodyContentType());
                httpPost.setEntity(new ByteArrayEntity(postBody));
                httpGet = httpPost;
                break;
            case 0:
                httpGet = new HttpGet(c0989n.getUrl());
                break;
            case 1:
                httpGet = new HttpPost(c0989n.getUrl());
                httpGet.addHeader("Content-Type", c0989n.getBodyContentType());
                break;
            case 2:
                httpGet = new HttpPut(c0989n.getUrl());
                httpGet.addHeader("Content-Type", c0989n.getBodyContentType());
                break;
            case 3:
                httpGet = new HttpDelete(c0989n.getUrl());
                break;
            case 4:
                httpGet = new HttpHead(c0989n.getUrl());
                break;
            case 5:
                httpGet = new HttpOptions(c0989n.getUrl());
                break;
            case 6:
                httpGet = new HttpTrace(c0989n.getUrl());
                break;
            case 7:
                httpGet = new C0971a(c0989n.getUrl());
                httpGet.addHeader("Content-Type", c0989n.getBodyContentType());
                break;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
        C5054d.m10279a((HttpEntityEnclosingRequestBase) httpGet, (C0989n) c0989n);
        C5054d.m10280a(httpGet, (Map) map);
        C5054d.m10280a(httpGet, c0989n.getHeaders());
        HttpParams params = httpGet.getParams();
        int timeoutMs = c0989n.getTimeoutMs();
        HttpConnectionParams.setConnectionTimeout(params, 5000);
        HttpConnectionParams.setSoTimeout(params, timeoutMs);
        return this.f14128a.execute(httpGet);
    }
}
