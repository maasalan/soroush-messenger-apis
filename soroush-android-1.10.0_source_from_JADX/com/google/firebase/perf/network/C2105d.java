package com.google.firebase.perf.network;

import com.google.android.gms.internal.ms;
import com.google.android.gms.internal.zzevc;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public final class C2105d extends HttpsURLConnection {
    private final C2106e f7082a;
    private final HttpsURLConnection f7083b;

    C2105d(HttpsURLConnection httpsURLConnection, zzevc com_google_android_gms_internal_zzevc, ms msVar) {
        super(httpsURLConnection.getURL());
        this.f7083b = httpsURLConnection;
        this.f7082a = new C2106e(httpsURLConnection, com_google_android_gms_internal_zzevc, msVar);
    }

    public final void addRequestProperty(String str, String str2) {
        this.f7082a.m5758a(str, str2);
    }

    public final void connect() {
        this.f7082a.m5756a();
    }

    public final void disconnect() {
        this.f7082a.m5763b();
    }

    public final boolean equals(Object obj) {
        return this.f7082a.equals(obj);
    }

    public final boolean getAllowUserInteraction() {
        return this.f7082a.f7084a.getAllowUserInteraction();
    }

    public final String getCipherSuite() {
        return this.f7083b.getCipherSuite();
    }

    public final int getConnectTimeout() {
        return this.f7082a.f7084a.getConnectTimeout();
    }

    public final Object getContent() {
        return this.f7082a.m5767c();
    }

    public final Object getContent(Class[] clsArr) {
        return this.f7082a.m5753a(clsArr);
    }

    public final String getContentEncoding() {
        return this.f7082a.m5785l();
    }

    public final int getContentLength() {
        return this.f7082a.m5786m();
    }

    public final long getContentLengthLong() {
        return this.f7082a.m5787n();
    }

    public final String getContentType() {
        return this.f7082a.m5788o();
    }

    public final long getDate() {
        return this.f7082a.m5789p();
    }

    public final boolean getDefaultUseCaches() {
        return this.f7082a.f7084a.getDefaultUseCaches();
    }

    public final boolean getDoInput() {
        return this.f7082a.f7084a.getDoInput();
    }

    public final boolean getDoOutput() {
        return this.f7082a.f7084a.getDoOutput();
    }

    public final InputStream getErrorStream() {
        return this.f7082a.m5790q();
    }

    public final long getExpiration() {
        return this.f7082a.m5783j();
    }

    public final String getHeaderField(int i) {
        return this.f7082a.m5754a(i);
    }

    public final String getHeaderField(String str) {
        return this.f7082a.m5755a(str);
    }

    public final long getHeaderFieldDate(String str, long j) {
        return this.f7082a.m5752a(str, j);
    }

    public final int getHeaderFieldInt(String str, int i) {
        return this.f7082a.m5751a(str, i);
    }

    public final String getHeaderFieldKey(int i) {
        return this.f7082a.m5761b(i);
    }

    public final long getHeaderFieldLong(String str, long j) {
        return this.f7082a.m5760b(str, j);
    }

    public final Map<String, List<String>> getHeaderFields() {
        return this.f7082a.m5784k();
    }

    public final HostnameVerifier getHostnameVerifier() {
        return this.f7083b.getHostnameVerifier();
    }

    public final long getIfModifiedSince() {
        return this.f7082a.f7084a.getIfModifiedSince();
    }

    public final InputStream getInputStream() {
        return this.f7082a.m5771d();
    }

    public final boolean getInstanceFollowRedirects() {
        return this.f7082a.f7084a.getInstanceFollowRedirects();
    }

    public final long getLastModified() {
        return this.f7082a.m5774e();
    }

    public final Certificate[] getLocalCertificates() {
        return this.f7083b.getLocalCertificates();
    }

    public final Principal getLocalPrincipal() {
        return this.f7083b.getLocalPrincipal();
    }

    public final OutputStream getOutputStream() {
        return this.f7082a.m5777f();
    }

    public final Principal getPeerPrincipal() {
        return this.f7083b.getPeerPrincipal();
    }

    public final Permission getPermission() {
        return this.f7082a.m5780g();
    }

    public final int getReadTimeout() {
        return this.f7082a.f7084a.getReadTimeout();
    }

    public final String getRequestMethod() {
        return this.f7082a.f7084a.getRequestMethod();
    }

    public final Map<String, List<String>> getRequestProperties() {
        return this.f7082a.f7084a.getRequestProperties();
    }

    public final String getRequestProperty(String str) {
        return this.f7082a.m5762b(str);
    }

    public final int getResponseCode() {
        return this.f7082a.m5781h();
    }

    public final String getResponseMessage() {
        return this.f7082a.m5782i();
    }

    public final SSLSocketFactory getSSLSocketFactory() {
        return this.f7083b.getSSLSocketFactory();
    }

    public final Certificate[] getServerCertificates() {
        return this.f7083b.getServerCertificates();
    }

    public final URL getURL() {
        return this.f7082a.f7084a.getURL();
    }

    public final boolean getUseCaches() {
        return this.f7082a.f7084a.getUseCaches();
    }

    public final int hashCode() {
        return this.f7082a.hashCode();
    }

    public final void setAllowUserInteraction(boolean z) {
        this.f7082a.m5759a(z);
    }

    public final void setChunkedStreamingMode(int i) {
        this.f7082a.m5768c(i);
    }

    public final void setConnectTimeout(int i) {
        this.f7082a.m5772d(i);
    }

    public final void setDefaultUseCaches(boolean z) {
        this.f7082a.m5766b(z);
    }

    public final void setDoInput(boolean z) {
        this.f7082a.m5770c(z);
    }

    public final void setDoOutput(boolean z) {
        this.f7082a.m5773d(z);
    }

    public final void setFixedLengthStreamingMode(int i) {
        this.f7082a.m5775e(i);
    }

    public final void setFixedLengthStreamingMode(long j) {
        this.f7082a.m5757a(j);
    }

    public final void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f7083b.setHostnameVerifier(hostnameVerifier);
    }

    public final void setIfModifiedSince(long j) {
        this.f7082a.m5764b(j);
    }

    public final void setInstanceFollowRedirects(boolean z) {
        this.f7082a.m5776e(z);
    }

    public final void setReadTimeout(int i) {
        this.f7082a.m5778f(i);
    }

    public final void setRequestMethod(String str) {
        this.f7082a.m5769c(str);
    }

    public final void setRequestProperty(String str, String str2) {
        this.f7082a.m5765b(str, str2);
    }

    public final void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f7083b.setSSLSocketFactory(sSLSocketFactory);
    }

    public final void setUseCaches(boolean z) {
        this.f7082a.m5779f(z);
    }

    public final String toString() {
        return this.f7082a.toString();
    }

    public final boolean usingProxy() {
        return this.f7082a.f7084a.usingProxy();
    }
}
