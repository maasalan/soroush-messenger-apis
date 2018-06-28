package mobi.mmdt.ott.view.conversation.p424b.p425a;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import mobi.mmdt.ott.R;

public final class C3399a {
    public ImageView f10421a;
    public boolean f10422b = false;

    public C3399a(View view, OnClickListener onClickListener) {
        this.f10421a = (ImageView) view.findViewById(R.id.bot_imageView);
        this.f10421a.setOnClickListener(onClickListener);
    }

    public final boolean m7840a() {
        return !this.f10422b;
    }

    public final void m7841b() {
        this.f10422b = false;
        this.f10421a.setImageResource(R.drawable.ic_slash_bot);
    }

    public final void m7842c() {
        this.f10421a.setVisibility(8);
    }

    public final void m7843d() {
        this.f10421a.setVisibility(0);
    }
}
