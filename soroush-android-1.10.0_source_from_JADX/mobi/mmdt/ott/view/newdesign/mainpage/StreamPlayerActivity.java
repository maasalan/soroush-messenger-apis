package mobi.mmdt.ott.view.newdesign.mainpage;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.tools.p479c.C4501c;

public class StreamPlayerActivity extends C7576b {
    public static String f24400m = "KEY_STREAM_URL";
    private WebView f24401n;
    private String f24402o = null;

    class C42521 extends WebViewClient {
        final /* synthetic */ StreamPlayerActivity f12023a;

        C42521(StreamPlayerActivity streamPlayerActivity) {
            this.f12023a = streamPlayerActivity;
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            C4501c.m8189a().m8193b();
        }

        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            C4501c.m8189a().m8193b();
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            return true;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_stream_player);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        m20723a(true, UIThemeManager.getmInstance().getIcon_toolbar_white_color());
        Intent intent = getIntent();
        if (!(intent == null || intent.getStringExtra(f24400m) == null)) {
            this.f24402o = intent.getStringExtra(f24400m);
        }
        C4501c.m8189a().m8192a(this, null);
        this.f24401n = (WebView) findViewById(R.id.webView);
        this.f24401n.setInitialScale(1);
        this.f24401n.getSettings().setPluginState(PluginState.ON);
        this.f24401n.setWebViewClient(new C42521(this));
        WebSettings settings = this.f24401n.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        this.f24401n.getSettings().setDomStorageEnabled(true);
        if (VERSION.SDK_INT >= 16) {
            settings.setAllowUniversalAccessFromFileURLs(true);
        }
        settings.setAllowContentAccess(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSupportZoom(false);
        settings.setUseWideViewPort(true);
        settings.setAppCacheEnabled(true);
        settings.setSupportMultipleWindows(true);
        if (this.f24402o != null) {
            this.f24401n.loadUrl(this.f24402o);
        }
    }

    protected void onPause() {
        super.onPause();
        this.f24401n.stopLoading();
        this.f24401n.onPause();
    }
}
