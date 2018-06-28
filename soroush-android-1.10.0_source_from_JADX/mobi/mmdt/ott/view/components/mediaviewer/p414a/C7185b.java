package mobi.mmdt.ott.view.components.mediaviewer.p414a;

import android.app.Activity;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import java.io.IOException;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.mediaviewer.C3231a;
import mobi.mmdt.ott.view.components.mediaviewer.p568b.C7334b;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import pl.droidsonroids.gif.GifImageView;
import pl.droidsonroids.gif.a;

public final class C7185b extends C6867a {
    private Activity f20665b;
    private RelativeLayout f20666c = ((RelativeLayout) this.itemView.findViewById(R.id.root_view));
    private C3231a f20667d;
    private GifImageView f20668e = ((GifImageView) this.itemView.findViewById(R.id.content_gifView));
    private a f20669f;
    private ImageButton f20670g = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));

    class C32281 implements OnClickListener {
        final /* synthetic */ C7185b f9961a;

        C32281(C7185b c7185b) {
            this.f9961a = c7185b;
        }

        public final void onClick(View view) {
            if (this.f9961a.f20669f != null) {
                if (this.f9961a.f20669f.isPlaying()) {
                    this.f9961a.f20669f.stop();
                    this.f9961a.f20670g.setVisibility(0);
                    return;
                }
                this.f9961a.f20669f.start();
                this.f9961a.f20670g.setVisibility(8);
            }
        }
    }

    class C32292 implements OnClickListener {
        final /* synthetic */ C7185b f9962a;

        C32292(C7185b c7185b) {
            this.f9962a = c7185b;
        }

        public final void onClick(View view) {
            if (this.f9962a.f20669f != null) {
                if (this.f9962a.f20669f.isPlaying()) {
                    this.f9962a.f20669f.stop();
                    this.f9962a.f20670g.setVisibility(0);
                    return;
                }
                this.f9962a.f20669f.start();
                this.f9962a.f20670g.setVisibility(8);
            }
        }
    }

    public C7185b(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3231a c3231a) {
        super(layoutInflater, viewGroup, R.layout.media_viewer_gif_list_item);
        this.f20665b = activity;
        this.f20667d = c3231a;
    }

    protected final void mo3180a(C6829g c6829g) {
        C7334b c7334b = (C7334b) c6829g;
        this.f20668e.setOnClickListener(new C32281(this));
        this.f20670g.setOnClickListener(new C32292(this));
        try {
            this.f20669f = new a(Uri.parse(c7334b.f20678a).getPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (this.f20668e != null) {
            this.f20668e.setImageDrawable(this.f20669f);
        }
        if (this.f20669f != null) {
            if (c7334b.f21147g) {
                this.f20669f.start();
                this.f20670g.setVisibility(8);
                return;
            }
            this.f20669f.stop();
            this.f20670g.setVisibility(0);
        }
    }
}
