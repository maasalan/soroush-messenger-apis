package mobi.mmdt.ott.view.conversation.p432e.p433a.p439f;

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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7632l;
import mobi.mmdt.ott.view.tools.C4520n;

public final class C7497l extends C7350b {
    private TextView f22423e;
    private ImageView f22424f;
    private boolean f22425g;
    private View f22426h;

    class C37571 implements OnLongClickListener {
        final /* synthetic */ C7497l f11084a;

        C37571(C7497l c7497l) {
            this.f11084a = c7497l;
        }

        public final boolean onLongClick(View view) {
            this.f11084a.f22425g = true;
            return false;
        }
    }

    class C37582 implements OnTouchListener {
        final /* synthetic */ C7497l f11085a;

        C37582(C7497l c7497l) {
            this.f11085a = c7497l;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1 && this.f11085a.f22425g) {
                this.f11085a.f22425g = false;
                return true;
            }
            if (motionEvent.getAction() == 0) {
                this.f11085a.f22425g = false;
            }
            return view.onTouchEvent(motionEvent);
        }
    }

    public C7497l(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3280a c3280a, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_text_channel_reply_output_list_item : R.layout.chat_text_channel_reply_output_list_item_old, c3280a, c3286g, c3284e);
        this.f22423e = (TextView) this.itemView.findViewById(R.id.content_textView);
        this.f22424f = (ImageView) this.itemView.findViewById(R.id.status_imageView);
        this.f22426h = this.itemView.findViewById(R.id.layout_balloon_chat_background);
        this.f22423e.setOnLongClickListener(new C37571(this));
        this.f22423e.setOnTouchListener(new C37582(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7632l c7632l = (C7632l) c6829g;
        this.f22423e.setTextSize((float) c7632l.f23495Q);
        this.f22423e.setText(c7632l.f23494P);
        C4520n.m8234a(this.f22423e);
        switch (c7632l.f21337w) {
            case ERROR:
                imageView = this.f22424f;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22424f;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22424f;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22424f;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        m19051a((C7358a) c7632l, this.f22426h, true);
    }
}
