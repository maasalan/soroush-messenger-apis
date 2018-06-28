package mobi.mmdt.ott.view.conversation.p432e.p433a.p438e;

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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7619l;
import mobi.mmdt.ott.view.tools.C4520n;

public final class C7484l extends C7349b {
    private TextView f22263e;
    private boolean f22264f;
    private View f22265g;

    class C37061 implements OnLongClickListener {
        final /* synthetic */ C7484l f10990a;

        C37061(C7484l c7484l) {
            this.f10990a = c7484l;
        }

        public final boolean onLongClick(View view) {
            this.f10990a.f22264f = true;
            return false;
        }
    }

    class C37072 implements OnTouchListener {
        final /* synthetic */ C7484l f10991a;

        C37072(C7484l c7484l) {
            this.f10991a = c7484l;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1 && this.f10991a.f22264f) {
                this.f10991a.f22264f = false;
                return true;
            }
            if (motionEvent.getAction() == 0) {
                this.f10991a.f22264f = false;
            }
            return view.onTouchEvent(motionEvent);
        }
    }

    public C7484l(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3280a c3280a, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_text_channel_reply_input_list_item : R.layout.chat_text_channel_reply_input_list_item_old, c3280a, c3286g, c3284e);
        this.f22263e = (TextView) this.itemView.findViewById(R.id.content_textView);
        this.f22265g = this.itemView.findViewById(R.id.layout_balloon_chat_background);
        this.f22263e.setOnLongClickListener(new C37061(this));
        this.f22263e.setOnTouchListener(new C37072(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7619l c7619l = (C7619l) c6829g;
        this.f22263e.setTextSize((float) c7619l.f23416Q);
        this.f22263e.setText(c7619l.f23415P);
        C4520n.m8234a(this.f22263e);
        m19051a((C7358a) c7619l, this.f22265g, false);
    }
}
