package mobi.mmdt.ott.view.conversation.p432e.p433a.p436c;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.TextView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3280a;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7593l;
import mobi.mmdt.ott.view.tools.C4520n;

public final class C7458l extends C7347b {
    private TextView f21948e;
    private boolean f21949f;
    private View f21950g;

    class C36001 implements OnLongClickListener {
        final /* synthetic */ C7458l f10799a;

        C36001(C7458l c7458l) {
            this.f10799a = c7458l;
        }

        public final boolean onLongClick(View view) {
            this.f10799a.f21949f = true;
            return false;
        }
    }

    class C36012 implements OnTouchListener {
        final /* synthetic */ C7458l f10800a;

        C36012(C7458l c7458l) {
            this.f10800a = c7458l;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1 && this.f10800a.f21949f) {
                this.f10800a.f21949f = false;
                return true;
            }
            if (motionEvent.getAction() == 0) {
                this.f10800a.f21949f = false;
            }
            return view.onTouchEvent(motionEvent);
        }
    }

    public C7458l(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3280a c3280a, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_text_channel_input_list_item : R.layout.chat_text_channel_input_list_item_old, c3280a, c3286g, c3284e);
        this.f21948e = (TextView) this.itemView.findViewById(R.id.content_textView);
        this.f21950g = this.itemView.findViewById(R.id.layout_balloon_chat_background);
        this.f21948e.setOnLongClickListener(new C36001(this));
        this.f21948e.setOnTouchListener(new C36012(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7593l c7593l = (C7593l) c6829g;
        this.f21948e.setTextSize((float) c7593l.f23217Q);
        this.f21948e.setText(c7593l.f23216P);
        C4520n.m8234a(this.f21948e);
        m19051a((C7358a) c7593l, this.f21950g, false);
    }
}
