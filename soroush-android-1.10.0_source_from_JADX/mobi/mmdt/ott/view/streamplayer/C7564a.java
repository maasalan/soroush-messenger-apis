package mobi.mmdt.ott.view.streamplayer;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetBehavior.C0265a;
import android.support.design.widget.C7247d;
import android.support.design.widget.CoordinatorLayout.C0270a;
import android.support.design.widget.CoordinatorLayout.C0273d;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import mobi.mmdt.ott.view.streamplayer.C4476b.C4475a;

public final class C7564a extends C7247d {
    private String ae;
    private VideoEnabledWebView af;
    private ProgressWheel ag;
    private C4476b ah;
    private LayoutParams ai;
    private RelativeLayout aj;
    private View ak;
    private C0265a al = new C62721(this);

    class C44713 implements OnClickListener {
        final /* synthetic */ C7564a f12399a;

        C44713(C7564a c7564a) {
            this.f12399a = c7564a;
        }

        public final void onClick(View view) {
            this.f12399a.m14956a(false);
        }
    }

    class C44724 implements OnClickListener {
        final /* synthetic */ C7564a f12400a;

        C44724(C7564a c7564a) {
            this.f12400a = c7564a;
        }

        public final void onClick(View view) {
            if (this.f12400a.ae != null) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(this.f12400a.ae));
                Fragment fragment = this.f12400a;
                if (fragment.f13174B == null) {
                    StringBuilder stringBuilder = new StringBuilder("Fragment ");
                    stringBuilder.append(fragment);
                    stringBuilder.append(" not attached to Activity");
                    throw new IllegalStateException(stringBuilder.toString());
                }
                fragment.f13174B.mo2537a(intent);
                this.f12400a.m14956a(false);
                return;
            }
            Toast.makeText(this.f12400a.m8911k(), "Stream url is null !!!", 0).show();
        }
    }

    class C44747 extends WebViewClient {
        final /* synthetic */ C7564a f12403a;

        C44747(C7564a c7564a) {
            this.f12403a = c7564a;
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            System.out.println("onPageFinished");
            this.f12403a.ag.setVisibility(8);
        }

        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            System.out.println("onReceivedError");
            this.f12403a.ag.setVisibility(8);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            return true;
        }
    }

    class C62721 extends C0265a {
        final /* synthetic */ C7564a f17126a;

        C62721(C7564a c7564a) {
            this.f17126a = c7564a;
        }

        public final void mo187a(int i) {
            if (i == 5) {
                this.f17126a.m14956a(false);
            }
        }
    }

    static /* synthetic */ void m20675a(C7564a c7564a, int i) {
        C0273d c0273d = (C0273d) ((View) c7564a.ak.getParent()).getLayoutParams();
        C0270a c0270a = c0273d.f987a;
        if (c0270a != null && (c0270a instanceof BottomSheetBehavior)) {
            ((BottomSheetBehavior) c0270a).f13054i = c7564a.al;
        }
        View view = (View) c7564a.ak.getParent();
        view.setFitsSystemWindows(true);
        BottomSheetBehavior b = BottomSheetBehavior.m8727b(view);
        c7564a.ak.measure(0, 0);
        b.m8741b(i);
        if (c0273d.f987a instanceof BottomSheetBehavior) {
            ((BottomSheetBehavior) c0273d.f987a).f13054i = c7564a.al;
        }
        c0273d.height = i;
        view.setLayoutParams(c0273d);
    }

    public final void mo2480a() {
        super.mo2480a();
        this.af.stopLoading();
        this.af.onPause();
    }

    @SuppressLint({"RestrictedApi"})
    public final void mo3305a(Dialog dialog, int i) {
        super.mo3305a(dialog, i);
        this.ak = View.inflate(m8909j(), R.layout.fragment_stream_player, null);
        dialog.setContentView(this.ak);
        this.aj = (RelativeLayout) this.ak.findViewById(R.id.root_relativeLayout);
        this.af = (VideoEnabledWebView) this.ak.findViewById(R.id.webView);
        this.ah = new C4476b(this, this.ak.findViewById(R.id.nonVideoLayout), (ViewGroup) this.ak.findViewById(R.id.videoLayout), this.af) {
            final /* synthetic */ C7564a f17127a;

            public final void onProgressChanged(WebView webView, int i) {
            }
        };
        this.ag = (ProgressWheel) this.ak.findViewById(R.id.progress_wheel);
        this.af.setInitialScale(1);
        this.af.getSettings().setPluginState(PluginState.ON);
        final int a = C2489g.m6754a().m6755a(BallPulseIndicator.SCALE);
        final int b = C2489g.m6754a().m6756b(BallPulseIndicator.SCALE);
        this.ah.f12405b = new C4475a(this) {
            final /* synthetic */ C7564a f17130c;

            public final void mo2434a(boolean z) {
                C7564a c7564a;
                int c;
                if (z || this.f17130c.m8912l().getConfiguration().orientation != 1) {
                    c7564a = this.f17130c;
                    c = b - C2491i.m6822c(this.f17130c.m8909j());
                } else {
                    c7564a = this.f17130c;
                    c = (int) (((float) ((a * 9) / 16)) + C2491i.m6804b(this.f17130c.m8909j(), 48.0f));
                }
                C7564a.m20675a(c7564a, c);
            }
        };
        this.af.setWebChromeClient(this.ah);
        this.af.setWebViewClient(new C44747(this));
        WebSettings settings = this.af.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        this.af.getSettings().setDomStorageEnabled(true);
        if (VERSION.SDK_INT >= 16) {
            settings.setAllowUniversalAccessFromFileURLs(true);
        }
        settings.setAllowContentAccess(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setUserAgentString("Soroush_and_1.10.0");
        settings.setAppCacheEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setSupportZoom(false);
        this.af.loadUrl(this.ae);
        this.ai = this.af.getLayoutParams();
        if (m8912l().getConfiguration().orientation == 1) {
            this.ai.width = a;
            this.ai.height = (a * 9) / 16;
        } else {
            this.ai.width = a;
            this.ai.height = (int) (((float) (b - C2491i.m6822c(m8909j()))) - C2491i.m6804b(m8909j(), 48.0f));
        }
        ((Button) this.ak.findViewById(R.id.close_button)).setOnClickListener(new C44713(this));
        ((Button) this.ak.findViewById(R.id.open_with_button)).setOnClickListener(new C44724(this));
        C0270a c0270a = ((C0273d) ((View) this.ak.getParent()).getLayoutParams()).f987a;
        if (c0270a != null && (c0270a instanceof BottomSheetBehavior)) {
            final BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c0270a;
            this.ak.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener(this) {
                final /* synthetic */ C7564a f12402b;

                public final void onGlobalLayout() {
                    this.f12402b.ak.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    bottomSheetBehavior.m8741b(this.f12402b.ak.getMeasuredHeight());
                }
            });
        }
    }

    public final void a_(Bundle bundle) {
        super.a_(bundle);
        if (this.f13204p != null && this.f13204p.containsKey("KEY_STREAM_URL")) {
            this.ae = this.f13204p.getString("KEY_STREAM_URL");
        }
    }
}
