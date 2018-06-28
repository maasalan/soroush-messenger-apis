package mobi.mmdt.ott.view.conversation.emojisticker;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;

public final class C4019d implements OnTouchListener {
    private Handler f11548a = new Handler();
    private int f11549b = 400;
    private final int f11550c = 70;
    private final OnClickListener f11551d;
    private Runnable f11552e = new C40181(this);
    private View f11553f;

    class C40181 implements Runnable {
        final /* synthetic */ C4019d f11547a;

        C40181(C4019d c4019d) {
            this.f11547a = c4019d;
        }

        public final void run() {
            this.f11547a.f11548a.postDelayed(this, (long) this.f11547a.f11550c);
            this.f11547a.f11551d.onClick(this.f11547a.f11553f);
        }
    }

    public C4019d(OnClickListener onClickListener) {
        this.f11551d = onClickListener;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    this.f11548a.removeCallbacks(this.f11552e);
                    this.f11548a.postDelayed(this.f11552e, (long) this.f11549b);
                    this.f11553f = view;
                    this.f11553f.setPressed(true);
                    this.f11551d.onClick(view);
                    return true;
                case 1:
                    break;
                default:
                    return false;
            }
        }
        this.f11548a.removeCallbacks(this.f11552e);
        this.f11553f.setPressed(false);
        this.f11553f = null;
        return true;
    }
}
