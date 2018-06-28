package mobi.mmdt.ott.view.conversation.p432e.p433a.p434a;

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
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p418a.C3288i;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7707k;
import mobi.mmdt.ott.view.tools.C4520n;

public final class C7433k extends C7345b {
    private TextView f21641d;
    private boolean f21642e;
    private View f21643f;

    class C35051 implements OnLongClickListener {
        final /* synthetic */ C7433k f10651a;

        C35051(C7433k c7433k) {
            this.f10651a = c7433k;
        }

        public final boolean onLongClick(View view) {
            this.f10651a.f21642e = true;
            return false;
        }
    }

    class C35062 implements OnTouchListener {
        final /* synthetic */ C7433k f10652a;

        C35062(C7433k c7433k) {
            this.f10652a = c7433k;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1 && this.f10652a.f21642e) {
                this.f10652a.f21642e = false;
                return true;
            }
            if (motionEvent.getAction() == 0) {
                this.f10652a.f21642e = false;
            }
            return view.onTouchEvent(motionEvent);
        }
    }

    public C7433k(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3288i c3288i, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_text_channel_direct_input_list_item : R.layout.chat_text_channel_direct_input_list_item_old, c3288i, c3286g, c3284e);
        this.c = activity;
        this.f21641d = (TextView) this.itemView.findViewById(R.id.content_textView);
        this.f21643f = this.itemView.findViewById(R.id.layout_balloon_chat_background);
        this.f21641d.setOnLongClickListener(new C35051(this));
        this.f21641d.setOnTouchListener(new C35062(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7707k c7707k = (C7707k) c6829g;
        this.f21641d.setTextSize((float) c7707k.f24194Q);
        this.f21641d.setText(c7707k.f24193P);
        C4520n.m8234a(this.f21641d);
        m19051a((C7358a) c7707k, this.f21643f, false);
    }
}
