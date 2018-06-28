package com.p067a.p070b;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.p067a.p070b.C0978b.C0977a;
import com.p067a.p070b.C0994p.C0992a;
import com.p067a.p070b.C1000v.C0999a;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;

public abstract class C0989n<T> implements Comparable<C0989n<T>> {
    private static final String DEFAULT_PARAMS_ENCODING = "UTF-8";
    private static long sCounter;
    private C0977a mCacheEntry;
    private boolean mCanceled;
    private final int mDefaultTrafficStatsTag;
    private C0992a mErrorListener;
    private final C0999a mEventLog;
    private String mIdentifier;
    private final int mMethod;
    private String mRedirectUrl;
    private C0991o mRequestQueue;
    private boolean mResponseDelivered;
    private C0996r mRetryPolicy;
    private Integer mSequence;
    private boolean mShouldCache;
    private Object mTag;
    private final String mUrl;

    public enum C0988a {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public C0989n(int i, String str, C0992a c0992a) {
        this.mEventLog = C0999a.f3203a ? new C0999a() : null;
        this.mShouldCache = true;
        this.mCanceled = false;
        this.mResponseDelivered = false;
        this.mCacheEntry = null;
        this.mMethod = i;
        this.mUrl = str;
        this.mIdentifier = C0989n.createIdentifier(i, str);
        this.mErrorListener = c0992a;
        setRetryPolicy(new C5058d());
        this.mDefaultTrafficStatsTag = C0989n.findDefaultTrafficStatsTag(str);
    }

    @Deprecated
    public C0989n(String str, C0992a c0992a) {
        this(-1, str, c0992a);
    }

    private static String createIdentifier(int i, String str) {
        StringBuilder stringBuilder = new StringBuilder("Request:");
        stringBuilder.append(i);
        stringBuilder.append(":");
        stringBuilder.append(str);
        stringBuilder.append(":");
        stringBuilder.append(System.currentTimeMillis());
        stringBuilder.append(":");
        long j = sCounter;
        sCounter = j + 1;
        stringBuilder.append(j);
        return C0983f.m2439a(stringBuilder.toString());
    }

    private byte[] encodeParameters(Map<String, String> map, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            for (Entry entry : map.entrySet()) {
                stringBuilder.append(URLEncoder.encode((String) entry.getKey(), str));
                stringBuilder.append('=');
                stringBuilder.append(URLEncoder.encode((String) entry.getValue(), str));
                stringBuilder.append('&');
            }
            return stringBuilder.toString().getBytes(str);
        } catch (Throwable e) {
            StringBuilder stringBuilder2 = new StringBuilder("Encoding not supported: ");
            stringBuilder2.append(str);
            throw new RuntimeException(stringBuilder2.toString(), e);
        }
    }

    private static int findDefaultTrafficStatsTag(String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                str = parse.getHost();
                if (str != null) {
                    return str.hashCode();
                }
            }
        }
        return 0;
    }

    public void addMarker(String str) {
        if (C0999a.f3203a) {
            this.mEventLog.m2453a(str, Thread.currentThread().getId());
        }
    }

    public void cancel() {
        this.mCanceled = true;
    }

    public int compareTo(C0989n<T> c0989n) {
        C0988a priority = getPriority();
        C0988a priority2 = c0989n.getPriority();
        return priority == priority2 ? this.mSequence.intValue() - c0989n.mSequence.intValue() : priority2.ordinal() - priority.ordinal();
    }

    public void deliverError(C0997u c0997u) {
        if (this.mErrorListener != null) {
            this.mErrorListener.onErrorResponse(c0997u);
        }
    }

    public abstract void deliverResponse(T t);

    void finish(final String str) {
        if (this.mRequestQueue != null) {
            C0991o c0991o = this.mRequestQueue;
            synchronized (c0991o.f3184b) {
                c0991o.f3184b.remove(this);
            }
            synchronized (c0991o.f3186d) {
                Iterator it = c0991o.f3186d.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
            if (shouldCache()) {
                synchronized (c0991o.f3183a) {
                    Queue queue = (Queue) c0991o.f3183a.remove(getCacheKey());
                    if (queue != null) {
                        if (C1000v.f3207b) {
                            C1000v.m2454a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(queue.size()), r2);
                        }
                        c0991o.f3185c.addAll(queue);
                    }
                }
            }
            onFinish();
        }
        if (C0999a.f3203a) {
            final long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new Runnable(this) {
                    final /* synthetic */ C0989n f3177c;

                    public final void run() {
                        this.f3177c.mEventLog.m2453a(str, id);
                        this.f3177c.mEventLog.m2452a(toString());
                    }
                });
            } else {
                this.mEventLog.m2453a(str, id);
                this.mEventLog.m2452a(toString());
            }
        }
    }

    public byte[] getBody() {
        Map params = getParams();
        return (params == null || params.size() <= 0) ? null : encodeParameters(params, getParamsEncoding());
    }

    public String getBodyContentType() {
        StringBuilder stringBuilder = new StringBuilder("application/x-www-form-urlencoded; charset=");
        stringBuilder.append(getParamsEncoding());
        return stringBuilder.toString();
    }

    public C0977a getCacheEntry() {
        return this.mCacheEntry;
    }

    public String getCacheKey() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.mMethod);
        stringBuilder.append(":");
        stringBuilder.append(this.mUrl);
        return stringBuilder.toString();
    }

    public C0992a getErrorListener() {
        return this.mErrorListener;
    }

    public Map<String, String> getHeaders() {
        return Collections.emptyMap();
    }

    public String getIdentifier() {
        return this.mIdentifier;
    }

    public int getMethod() {
        return this.mMethod;
    }

    public String getOriginUrl() {
        return this.mUrl;
    }

    protected Map<String, String> getParams() {
        return null;
    }

    protected String getParamsEncoding() {
        return "UTF-8";
    }

    @Deprecated
    public byte[] getPostBody() {
        Map postParams = getPostParams();
        return (postParams == null || postParams.size() <= 0) ? null : encodeParameters(postParams, getPostParamsEncoding());
    }

    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    @Deprecated
    protected Map<String, String> getPostParams() {
        return getParams();
    }

    @Deprecated
    protected String getPostParamsEncoding() {
        return getParamsEncoding();
    }

    public C0988a getPriority() {
        return C0988a.NORMAL;
    }

    public C0996r getRetryPolicy() {
        return this.mRetryPolicy;
    }

    public final int getSequence() {
        if (this.mSequence != null) {
            return this.mSequence.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    public Object getTag() {
        return this.mTag;
    }

    public final int getTimeoutMs() {
        return this.mRetryPolicy.mo1043a();
    }

    public int getTrafficStatsTag() {
        return this.mDefaultTrafficStatsTag;
    }

    public String getUrl() {
        return this.mRedirectUrl != null ? this.mRedirectUrl : this.mUrl;
    }

    public boolean hasHadResponseDelivered() {
        return this.mResponseDelivered;
    }

    public boolean isCanceled() {
        return this.mCanceled;
    }

    public void markDelivered() {
        this.mResponseDelivered = true;
    }

    public void onFinish() {
        this.mErrorListener = null;
    }

    protected C0997u parseNetworkError(C0997u c0997u) {
        return c0997u;
    }

    public abstract C0994p<T> parseNetworkResponse(C0986j c0986j);

    public C0989n<?> setCacheEntry(C0977a c0977a) {
        this.mCacheEntry = c0977a;
        return this;
    }

    public void setRedirectUrl(String str) {
        this.mRedirectUrl = str;
    }

    public C0989n<?> setRequestQueue(C0991o c0991o) {
        this.mRequestQueue = c0991o;
        return this;
    }

    public C0989n<?> setRetryPolicy(C0996r c0996r) {
        this.mRetryPolicy = c0996r;
        return this;
    }

    public final C0989n<?> setSequence(int i) {
        this.mSequence = Integer.valueOf(i);
        return this;
    }

    public final C0989n<?> setShouldCache(boolean z) {
        this.mShouldCache = z;
        return this;
    }

    public C0989n<?> setTag(Object obj) {
        this.mTag = obj;
        return this;
    }

    public final boolean shouldCache() {
        return this.mShouldCache;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("0x");
        stringBuilder.append(Integer.toHexString(getTrafficStatsTag()));
        String stringBuilder2 = stringBuilder.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(this.mCanceled ? "[X] " : "[ ] ");
        stringBuilder3.append(getUrl());
        stringBuilder3.append(" ");
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append(" ");
        stringBuilder3.append(getPriority());
        stringBuilder3.append(" ");
        stringBuilder3.append(this.mSequence);
        return stringBuilder3.toString();
    }
}
