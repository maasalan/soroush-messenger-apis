package mobi.mmdt.ott.view.conversation.p432e.p433a.p444k;

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
import mobi.mmdt.ott.view.conversation.p432e.p433a.p442i.C7353b;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p612k.C7687a;
import mobi.mmdt.ott.view.tools.C4520n;

public final class C7552a extends C7353b {
    private RelativeLayout f23079d = ((RelativeLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));
    private TextView f23080e = ((TextView) this.itemView.findViewById(R.id.content_textView));
    private boolean f23081f;

    class C39811 implements OnLongClickListener {
        final /* synthetic */ C7552a f11479a;

        C39811(C7552a c7552a) {
            this.f11479a = c7552a;
        }

        public final boolean onLongClick(View view) {
            this.f11479a.f23081f = true;
            return false;
        }
    }

    class C39822 implements OnTouchListener {
        final /* synthetic */ C7552a f11480a;

        C39822(C7552a c7552a) {
            this.f11480a = c7552a;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1 && this.f11480a.f23081f) {
                this.f11480a.f23081f = false;
                return true;
            }
            if (motionEvent.getAction() == 0) {
                this.f11480a.f23081f = false;
            }
            return view.onTouchEvent(motionEvent);
        }
    }

    public C7552a(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_unknown_input_list_item, c3286g, c3284e);
        this.f23080e.setOnLongClickListener(new C39811(this));
        this.f23080e.setOnTouchListener(new C39822(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7687a c7687a = (C7687a) c6829g;
        this.f23080e.setTextSize((float) c7687a.f23873Q);
        this.f23080e.setText(c7687a.f23872P);
        C4520n.m8234a(this.f23080e);
        m19051a((C7358a) c7687a, this.f23079d, false);
    }
}
