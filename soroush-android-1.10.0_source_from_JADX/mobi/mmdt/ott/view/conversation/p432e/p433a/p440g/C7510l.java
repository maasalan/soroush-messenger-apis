package mobi.mmdt.ott.view.conversation.p432e.p433a.p440g;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p418a.C3288i;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7645l;
import mobi.mmdt.ott.view.tools.C4520n;

public final class C7510l extends C7351b {
    private TextView f22571d = ((TextView) this.itemView.findViewById(R.id.content_textView));
    private boolean f22572e;
    private LinearLayout f22573f = ((LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));

    class C38101 implements OnLongClickListener {
        final /* synthetic */ C7510l f11178a;

        C38101(C7510l c7510l) {
            this.f11178a = c7510l;
        }

        public final boolean onLongClick(View view) {
            this.f11178a.f22572e = true;
            return false;
        }
    }

    class C38112 implements OnTouchListener {
        final /* synthetic */ C7510l f11179a;

        C38112(C7510l c7510l) {
            this.f11179a = c7510l;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1 && this.f11179a.f22572e) {
                this.f11179a.f22572e = false;
                return true;
            }
            if (motionEvent.getAction() == 0) {
                this.f11179a.f22572e = false;
            }
            return view.onTouchEvent(motionEvent);
        }
    }

    public C7510l(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3288i c3288i, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_text_social_input_list_item, c3288i, c3286g, c3284e);
        this.c = activity;
        this.f22571d.setOnLongClickListener(new C38101(this));
        this.f22571d.setOnTouchListener(new C38112(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7645l c7645l = (C7645l) c6829g;
        this.f22571d.setTextSize((float) c7645l.f23567Q);
        this.f22571d.setText(c7645l.f23566P);
        C4520n.m8234a(this.f22571d);
        m19051a((C7358a) c7645l, this.f22573f, false);
    }
}
