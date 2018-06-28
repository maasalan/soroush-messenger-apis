package mobi.mmdt.ott.view.conversation.p432e.p433a.p442i;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7671l;
import mobi.mmdt.ott.view.tools.C4520n;

public final class C7536l extends C7353b {
    private RelativeLayout f22873d = ((RelativeLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));
    private TextView f22874e = ((TextView) this.itemView.findViewById(R.id.content_textView));
    private boolean f22875f;

    class C39131 implements OnLongClickListener {
        final /* synthetic */ C7536l f11363a;

        C39131(C7536l c7536l) {
            this.f11363a = c7536l;
        }

        public final boolean onLongClick(View view) {
            this.f11363a.f22875f = true;
            return false;
        }
    }

    class C39142 implements OnTouchListener {
        final /* synthetic */ C7536l f11364a;

        C39142(C7536l c7536l) {
            this.f11364a = c7536l;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1 && this.f11364a.f22875f) {
                this.f11364a.f22875f = false;
                return true;
            }
            if (motionEvent.getAction() == 0) {
                this.f11364a.f22875f = false;
            }
            return view.onTouchEvent(motionEvent);
        }
    }

    public C7536l(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_text_input_list_item, c3286g, c3284e);
        this.f22874e.setOnLongClickListener(new C39131(this));
        this.f22874e.setOnTouchListener(new C39142(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7671l c7671l = (C7671l) c6829g;
        this.f22874e.setTextSize((float) c7671l.f23752Q);
        this.f22874e.setText(c7671l.f23751P);
        C4520n.m8234a(this.f22874e);
        m19051a((C7358a) c7671l, this.f22873d, false);
    }
}
