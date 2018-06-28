package mobi.mmdt.ott.view.components.mediacaption.p409a;

import android.graphics.PorterDuff.Mode;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.R;
import pl.droidsonroids.gif.GifImageView;
import pl.droidsonroids.gif.a;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class C7326b extends C7179a {
    private View f21105a;
    private EditText f21106b;
    private int f21107c = 0;
    private int f21108d = 0;
    private GifImageView f21109e;
    private a f21110f;
    private ImageButton f21111g;

    class C31911 implements OnClickListener {
        final /* synthetic */ C7326b f9923a;

        C31911(C7326b c7326b) {
            this.f9923a = c7326b;
        }

        public final void onClick(View view) {
            if (this.f9923a.f21110f != null) {
                if (this.f9923a.f21110f.isPlaying()) {
                    this.f9923a.f21110f.stop();
                    this.f9923a.f21111g.setVisibility(0);
                    return;
                }
                this.f9923a.f21110f.start();
                this.f9923a.f21111g.setVisibility(8);
            }
        }
    }

    class C31922 implements OnClickListener {
        final /* synthetic */ C7326b f9924a;

        C31922(C7326b c7326b) {
            this.f9924a = c7326b;
        }

        public final void onClick(View view) {
            if (this.f9924a.f21110f != null) {
                if (this.f9924a.f21110f.isPlaying()) {
                    this.f9924a.f21110f.stop();
                    this.f9924a.f21111g.setVisibility(0);
                    return;
                }
                this.f9924a.f21110f.start();
                this.f9924a.f21111g.setVisibility(8);
            }
        }
    }

    public static C7326b m19592a(int i, String str, String str2) {
        C7326b c7326b = new C7326b();
        Bundle bundle = new Bundle();
        bundle.putInt("ARG_SECTION_NUMBER", i);
        bundle.putString("ARG_SECTION_PATH", str);
        bundle.putString("ARG_SECTION_CAPTION", str2);
        c7326b.mo3059e(bundle);
        return c7326b;
    }

    public final boolean mo3573O() {
        return false;
    }

    public final View mo3056a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f21105a = layoutInflater.inflate(R.layout.fragment_caption_item_gif, viewGroup, false);
        this.f21106b = (EditText) this.f21105a.findViewById(R.id.editText);
        this.f21109e = (GifImageView) this.f21105a.findViewById(R.id.content_gifView);
        this.f21111g = (ImageButton) this.f21105a.findViewById(R.id.action_imageView);
        this.f21109e.setOnClickListener(new C31911(this));
        this.f21111g.setOnClickListener(new C31922(this));
        String string = this.f13204p.getString("ARG_SECTION_PATH");
        this.f21106b.setFilters(new InputFilter[]{new LengthFilter(IjkMediaCodecInfo.RANK_MAX)});
        try {
            this.f21110f = new a(Uri.parse(string).getPath());
        } catch (Throwable e) {
            C2480b.m6737b("Exception in create GifDrawable", e);
        }
        if (this.f21109e != null) {
            this.f21109e.setImageDrawable(this.f21110f);
        }
        if (this.f21110f != null) {
            this.f21110f.stop();
        }
        CharSequence string2 = this.f13204p.getString("ARG_SECTION_CAPTION");
        if (string2 != null) {
            this.f21106b.setText(string2);
        } else {
            this.f21106b.setText("");
        }
        C2491i.m6780a(-1, -1, this.f21106b);
        this.f21106b.getBackground().mutate().setColorFilter(-1, Mode.SRC_ATOP);
        return this.f21105a;
    }

    public final void mo3574a(String str) {
        if (this.f21106b != null) {
            this.f21106b.setText(str);
        }
    }

    public final void mo3575a(boolean z) {
    }

    public final String mo2533e() {
        return (this.f21106b == null || this.f21106b.getText() == null) ? null : this.f21106b.getText().toString();
    }
}
