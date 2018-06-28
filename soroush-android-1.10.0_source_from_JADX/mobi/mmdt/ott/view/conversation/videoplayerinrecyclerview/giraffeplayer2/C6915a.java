package mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.p144f.p147b.p148a.C1586a;

public abstract class C6915a extends C6222c implements Callback, C6227f {
    protected final Context f19708a;
    protected final AudioManager f19709b;
    protected C1586a f19710c;
    protected int f19711d = 3000;
    protected Handler f19712e;
    protected VideoView f19713f;
    protected View f19714g;

    public C6915a(Context context) {
        this.f19708a = context;
        this.f19709b = (AudioManager) context.getSystemService("audio");
        this.f19712e = new Handler(Looper.getMainLooper(), this);
    }

    protected abstract View mo3465a();

    protected abstract void mo3466a(View view);

    public final void mo3235a(VideoView videoView) {
        this.f19713f = videoView;
        this.f19714g = mo3465a();
        this.f19710c = new C1586a(this.f19714g);
        mo3466a(this.f19714g);
        this.f19713f.getContainer().addView(this.f19714g, new LayoutParams(-1, -1));
    }
}
