package mobi.mmdt.ott.view.streamplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.Map;

public class VideoEnabledWebView extends WebView {
    private C4476b f12397a;
    private boolean f12398b = false;

    public class C4470a {
        final /* synthetic */ VideoEnabledWebView f12396a;

        class C44691 implements Runnable {
            final /* synthetic */ C4470a f12395a;

            C44691(C4470a c4470a) {
                this.f12395a = c4470a;
            }

            public final void run() {
                if (this.f12395a.f12396a.f12397a != null) {
                    this.f12395a.f12396a.f12397a.onHideCustomView();
                }
            }
        }

        public C4470a(VideoEnabledWebView videoEnabledWebView) {
            this.f12396a = videoEnabledWebView;
        }

        @JavascriptInterface
        public final void notifyVideoEnd() {
            Log.d("___", "GOT IT");
            new Handler(Looper.getMainLooper()).post(new C44691(this));
        }
    }

    public VideoEnabledWebView(Context context) {
        super(context);
    }

    public VideoEnabledWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VideoEnabledWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private void m8133a() {
        if (!this.f12398b) {
            addJavascriptInterface(new C4470a(this), "_VideoEnabledWebView");
            this.f12398b = true;
        }
    }

    public void loadData(String str, String str2, String str3) {
        m8133a();
        super.loadData(str, str2, str3);
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        m8133a();
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public void loadUrl(String str) {
        m8133a();
        super.loadUrl(str);
    }

    public void loadUrl(String str, Map<String, String> map) {
        m8133a();
        super.loadUrl(str, map);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        getSettings().setJavaScriptEnabled(true);
        if (webChromeClient instanceof C4476b) {
            this.f12397a = (C4476b) webChromeClient;
        }
        super.setWebChromeClient(webChromeClient);
    }
}
