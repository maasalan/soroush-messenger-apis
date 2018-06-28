package mobi.mmdt.ott.view.components.imageslider.Tricks;

import android.content.Context;
import android.widget.Scroller;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class C3182a extends Scroller {
    private int f9904a;

    private C3182a(Context context) {
        super(context, null);
        this.f9904a = IjkMediaCodecInfo.RANK_MAX;
    }

    public C3182a(Context context, int i) {
        this(context);
        this.f9904a = i;
    }

    public final void startScroll(int i, int i2, int i3, int i4) {
        super.startScroll(i, i2, i3, i4, this.f9904a);
    }

    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, this.f9904a);
    }
}
