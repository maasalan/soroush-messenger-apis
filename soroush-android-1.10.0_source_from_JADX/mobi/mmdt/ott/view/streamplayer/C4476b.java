package mobi.mmdt.ott.view.streamplayer;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.VideoView;

public class C4476b extends WebChromeClient implements OnCompletionListener, OnErrorListener, OnPreparedListener {
    private View f12404a;
    C4475a f12405b;
    private ViewGroup f12406c;
    private View f12407d;
    private VideoEnabledWebView f12408e;
    private boolean f12409f;
    private FrameLayout f12410g;
    private CustomViewCallback f12411h;

    public interface C4475a {
        void mo2434a(boolean z);
    }

    public C4476b(View view, ViewGroup viewGroup, VideoEnabledWebView videoEnabledWebView) {
        this.f12404a = view;
        this.f12406c = viewGroup;
        this.f12407d = null;
        this.f12408e = videoEnabledWebView;
        this.f12409f = false;
    }

    public View getVideoLoadingProgressView() {
        if (this.f12407d == null) {
            return super.getVideoLoadingProgressView();
        }
        this.f12407d.setVisibility(0);
        return this.f12407d;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        onHideCustomView();
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        return false;
    }

    public void onHideCustomView() {
        if (this.f12409f) {
            this.f12406c.setVisibility(8);
            this.f12406c.removeView(this.f12410g);
            this.f12404a.setVisibility(0);
            if (!(this.f12411h == null || this.f12411h.getClass().getName().contains(".chromium."))) {
                this.f12411h.onCustomViewHidden();
            }
            this.f12409f = false;
            this.f12410g = null;
            this.f12411h = null;
            if (this.f12405b != null) {
                this.f12405b.mo2434a(false);
            }
        }
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        if (this.f12407d != null) {
            this.f12407d.setVisibility(8);
        }
    }

    public void onShowCustomView(View view, int i, CustomViewCallback customViewCallback) {
        onShowCustomView(view, customViewCallback);
    }

    public void onShowCustomView(View view, CustomViewCallback customViewCallback) {
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            View focusedChild = frameLayout.getFocusedChild();
            this.f12409f = true;
            this.f12410g = frameLayout;
            this.f12411h = customViewCallback;
            this.f12404a.setVisibility(8);
            this.f12406c.addView(this.f12410g, new LayoutParams(-1, -1));
            this.f12406c.setVisibility(0);
            if (focusedChild instanceof VideoView) {
                VideoView videoView = (VideoView) focusedChild;
                videoView.setOnPreparedListener(this);
                videoView.setOnCompletionListener(this);
                videoView.setOnErrorListener(this);
            } else if (this.f12408e != null && this.f12408e.getSettings().getJavaScriptEnabled() && (focusedChild instanceof SurfaceView)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("javascript:");
                stringBuilder.append("var _ytrp_html5_video_last;");
                String stringBuilder2 = stringBuilder.toString();
                stringBuilder = new StringBuilder();
                stringBuilder.append(stringBuilder2);
                stringBuilder.append("var _ytrp_html5_video = document.getElementsByTagName('video')[0];");
                stringBuilder2 = stringBuilder.toString();
                stringBuilder = new StringBuilder();
                stringBuilder.append(stringBuilder2);
                stringBuilder.append("if (_ytrp_html5_video != undefined && _ytrp_html5_video != _ytrp_html5_video_last) {");
                stringBuilder2 = stringBuilder.toString();
                stringBuilder = new StringBuilder();
                stringBuilder.append(stringBuilder2);
                stringBuilder.append("_ytrp_html5_video_last = _ytrp_html5_video;");
                stringBuilder2 = stringBuilder.toString();
                stringBuilder = new StringBuilder();
                stringBuilder.append(stringBuilder2);
                stringBuilder.append("function _ytrp_html5_video_ended() {");
                stringBuilder2 = stringBuilder.toString();
                stringBuilder = new StringBuilder();
                stringBuilder.append(stringBuilder2);
                stringBuilder.append("_VideoEnabledWebView.notifyVideoEnd();");
                stringBuilder2 = stringBuilder.toString();
                stringBuilder = new StringBuilder();
                stringBuilder.append(stringBuilder2);
                stringBuilder.append("}");
                stringBuilder2 = stringBuilder.toString();
                stringBuilder = new StringBuilder();
                stringBuilder.append(stringBuilder2);
                stringBuilder.append("_ytrp_html5_video.addEventListener('ended', _ytrp_html5_video_ended);");
                stringBuilder2 = stringBuilder.toString();
                stringBuilder = new StringBuilder();
                stringBuilder.append(stringBuilder2);
                stringBuilder.append("}");
                this.f12408e.loadUrl(stringBuilder.toString());
            }
            if (this.f12405b != null) {
                this.f12405b.mo2434a(true);
            }
        }
    }
}
