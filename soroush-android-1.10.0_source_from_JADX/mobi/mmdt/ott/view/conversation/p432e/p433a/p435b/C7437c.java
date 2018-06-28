package mobi.mmdt.ott.view.conversation.p432e.p433a.p435b;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3280a;
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p432e.p433a.C7194a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7711c;
import mobi.mmdt.ott.view.tools.C4520n;

public final class C7437c extends C7346b {
    private TextView f21705e = ((TextView) this.itemView.findViewById(R.id.caption_textView));
    private TextView f21706f = ((TextView) this.itemView.findViewById(R.id.file_name_textView));
    private TextView f21707g = ((TextView) this.itemView.findViewById(R.id.file_size_textView));
    private ImageView f21708h = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private ImageButton f21709i = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ProgressWheel f21710j = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private C3284e f21711k;
    private C3283d f21712l;
    private LinearLayout f21713m = ((LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));
    private ImageView f21714n = ((ImageView) this.itemView.findViewById(R.id.actionDownloadChatFile));
    private TextView f21715o = ((TextView) this.itemView.findViewById(R.id.progress_text_action_view));

    class C35241 implements OnClickListener {
        final /* synthetic */ C7437c f10675a;

        C35241(C7437c c7437c) {
            this.f10675a = c7437c;
        }

        public final void onClick(View view) {
            this.f10675a.f21711k.mo2317b(((C7711c) this.f10675a.f16244a).f21300A);
        }
    }

    class C35252 implements OnClickListener {
        final /* synthetic */ C7437c f10676a;

        C35252(C7437c c7437c) {
            this.f10676a = c7437c;
        }

        public final void onClick(View view) {
            C7711c c7711c = (C7711c) this.f10676a.f16244a;
            switch (c7711c.f24231V) {
                case DELETED:
                case NOT_STARTED:
                    if (c7711c.f24232W == null || c7711c.f24232W.isEmpty()) {
                        this.f10676a.f21711k.mo2307a(c7711c.ac, false);
                        return;
                    } else {
                        this.f10676a.f21711k.mo2307a(c7711c.ac, true);
                        return;
                    }
                case TRANSMITTING:
                    this.f10676a.f21711k.mo2305a(c7711c.ac);
                    return;
                case CANCEL:
                    if (c7711c.f24232W == null || c7711c.f24232W.isEmpty()) {
                        this.f10676a.f21711k.mo2307a(c7711c.ac, false);
                        return;
                    } else {
                        this.f10676a.f21711k.mo2307a(c7711c.ac, true);
                        return;
                    }
                case ERROR:
                    if (c7711c.f24232W != null && !c7711c.f24232W.isEmpty()) {
                        this.f10676a.f21711k.mo2307a(c7711c.ac, true);
                        break;
                    } else {
                        this.f10676a.f21711k.mo2307a(c7711c.ac, false);
                        break;
                    }
                    break;
                case FINISHED:
                    break;
                default:
                    return;
            }
            this.f10676a.f21712l.mo2329d(c7711c.f24229T, c7711c.f24227R);
        }
    }

    public C7437c(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3284e c3284e, C3283d c3283d, C3280a c3280a, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_file_channel_direct_output_list_item, c3280a, c3286g, c3284e);
        this.f21711k = c3284e;
        this.f21712l = c3283d;
        this.f21714n.setOnClickListener(new C35241(this));
        this.f21709i.setOnClickListener(new C35252(this));
        C2491i.m6802a(this.f21715o, UIThemeManager.getmInstance().getOutput_content_and_caption_message_text_color());
    }

    private void m19838a(C7711c c7711c, C2971k c2971k) {
        boolean z = ((c7711c.f24232W == null || c7711c.f24232W.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f21709i, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7711c c7711c = (C7711c) c6829g;
        this.f21706f.setText(c7711c.f24227R);
        this.f21707g.setText(c7711c.f24228S);
        if (c7711c.f24226Q == null || c7711c.f24226Q.isEmpty()) {
            this.f21705e.setVisibility(8);
        } else {
            this.f21705e.setText(c7711c.f24226Q);
            this.f21705e.setVisibility(0);
            this.f21705e.setTextSize((float) c7711c.f24225P);
            C4520n.m8234a(this.f21705e);
        }
        switch (c7711c.f21337w) {
            case ERROR:
                imageView = this.f21708h;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f21708h;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f21708h;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f21708h;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        switch (c7711c.f24231V) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f21710j.setVisibility(8);
                this.f21715o.setVisibility(8);
                m19838a(c7711c, c7711c.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f21710j.setVisibility(0);
                this.f21709i.setImageResource(R.drawable.ic_file_stop_download);
                this.f21715o.setVisibility(0);
                this.f21715o.setText(c7711c.f24233X);
                if (c7711c.f24230U > 0) {
                    progressWheel = this.f21710j;
                    f = ((float) c7711c.f24230U) * 0.01f;
                } else {
                    progressWheel = this.f21710j;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f21710j.setVisibility(8);
                this.f21709i.setImageResource(R.drawable.ic_file_attach);
                this.f21714n.setVisibility(0);
                this.f21715o.setVisibility(8);
                break;
            default:
                break;
        }
        this.f21714n.setVisibility(8);
        m19051a((C7358a) c7711c, this.f21713m, true);
    }
}
