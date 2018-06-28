package mobi.mmdt.ott.view.components.p401c;

import android.content.Context;
import android.support.v4.view.C0554c;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnItemTouchListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;

public final class C6075j implements OnItemTouchListener {
    private C3128a f16248a;
    private C0554c f16249b;

    public interface C3128a {
        void mo2280b(int i);

        void c_(int i);
    }

    public C6075j(Context context, final RecyclerView recyclerView, C3128a c3128a) {
        this.f16248a = c3128a;
        this.f16249b = new C0554c(context, new SimpleOnGestureListener(this) {
            final /* synthetic */ C6075j f9709b;

            public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
                return false;
            }

            public final void onLongPress(MotionEvent motionEvent) {
                View findChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
                if (findChildViewUnder != null && this.f9709b.f16248a != null && recyclerView.getChildAdapterPosition(findChildViewUnder) >= 0) {
                    this.f9709b.f16248a.mo2280b(recyclerView.getChildAdapterPosition(findChildViewUnder));
                }
            }

            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                return true;
            }
        });
    }

    public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        View findChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
        if (findChildViewUnder != null && this.f16248a != null && this.f16249b.m1223a(motionEvent) && recyclerView.getChildAdapterPosition(findChildViewUnder) >= 0) {
            this.f16248a.c_(recyclerView.getChildAdapterPosition(findChildViewUnder));
        }
        return false;
    }

    public final void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    public final void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
