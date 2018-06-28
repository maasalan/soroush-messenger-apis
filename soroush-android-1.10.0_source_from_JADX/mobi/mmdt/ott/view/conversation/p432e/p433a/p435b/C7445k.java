package mobi.mmdt.ott.view.conversation.p432e.p433a.p435b;

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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7719k;
import mobi.mmdt.ott.view.tools.C4520n;

public final class C7445k extends C7346b {
    private TextView f21793e;
    private ImageView f21794f;
    private boolean f21795g;
    private View f21796h;

    class C35451 implements OnLongClickListener {
        final /* synthetic */ C7445k f10702a;

        C35451(C7445k c7445k) {
            this.f10702a = c7445k;
        }

        public final boolean onLongClick(View view) {
            this.f10702a.f21795g = true;
            return false;
        }
    }

    class C35462 implements OnTouchListener {
        final /* synthetic */ C7445k f10703a;

        C35462(C7445k c7445k) {
            this.f10703a = c7445k;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1 && this.f10703a.f21795g) {
                this.f10703a.f21795g = false;
                return true;
            }
            if (motionEvent.getAction() == 0) {
                this.f10703a.f21795g = false;
            }
            return view.onTouchEvent(motionEvent);
        }
    }

    public C7445k(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3280a c3280a, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_text_channel_direct_output_list_item : R.layout.chat_text_channel_direct_output_list_item_old, c3280a, c3286g, c3284e);
        this.f21793e = (TextView) this.itemView.findViewById(R.id.content_textView);
        this.f21794f = (ImageView) this.itemView.findViewById(R.id.status_imageView);
        this.f21796h = this.itemView.findViewById(R.id.layout_balloon_chat_background);
        this.f21793e.setOnLongClickListener(new C35451(this));
        this.f21793e.setOnTouchListener(new C35462(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7719k c7719k = (C7719k) c6829g;
        this.f21793e.setTextSize((float) c7719k.f24311Q);
        this.f21793e.setText(c7719k.f24310P);
        C4520n.m8234a(this.f21793e);
        switch (c7719k.f21337w) {
            case ERROR:
                imageView = this.f21794f;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f21794f;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f21794f;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f21794f;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        m19051a((C7358a) c7719k, this.f21796h, true);
    }
}
