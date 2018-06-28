package mobi.mmdt.ott.view.conversation.p432e.p433a.p437d;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3280a;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7606l;
import mobi.mmdt.ott.view.tools.C4520n;

public final class C7471l extends C7348b {
    private TextView f22108e;
    private ImageView f22109f;
    private boolean f22110g;
    private View f22111h;

    class C36511 implements OnLongClickListener {
        final /* synthetic */ C7471l f10893a;

        C36511(C7471l c7471l) {
            this.f10893a = c7471l;
        }

        public final boolean onLongClick(View view) {
            this.f10893a.f22110g = true;
            return false;
        }
    }

    class C36522 implements OnTouchListener {
        final /* synthetic */ C7471l f10894a;

        C36522(C7471l c7471l) {
            this.f10894a = c7471l;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1 && this.f10894a.f22110g) {
                this.f10894a.f22110g = false;
                return true;
            }
            if (motionEvent.getAction() == 0) {
                this.f10894a.f22110g = false;
            }
            return view.onTouchEvent(motionEvent);
        }
    }

    public C7471l(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3280a c3280a, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_text_channel_output_list_item : R.layout.chat_text_channel_output_list_item_old, c3280a, c3286g, c3284e);
        this.f22108e = (TextView) this.itemView.findViewById(R.id.content_textView);
        this.f22109f = (ImageView) this.itemView.findViewById(R.id.status_imageView);
        this.f22111h = this.itemView.findViewById(R.id.layout_balloon_chat_background);
        this.f22108e.setOnLongClickListener(new C36511(this));
        this.f22108e.setOnTouchListener(new C36522(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7606l c7606l = (C7606l) c6829g;
        this.f22108e.setTextSize((float) c7606l.f23336Q);
        this.f22108e.setText(c7606l.f23335P);
        C4520n.m8234a(this.f22108e);
        switch (c7606l.f21337w) {
            case ERROR:
                imageView = this.f22109f;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22109f;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22109f;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22109f;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        m19051a((C7358a) c7606l, this.f22111h, true);
    }
}
