package mobi.mmdt.ott.view.conversation.p432e.p433a.p437d;

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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7597c;
import mobi.mmdt.ott.view.tools.C4520n;

public final class C7462c extends C7348b {
    private TextView f22012e = ((TextView) this.itemView.findViewById(R.id.caption_textView));
    private TextView f22013f = ((TextView) this.itemView.findViewById(R.id.file_name_textView));
    private TextView f22014g = ((TextView) this.itemView.findViewById(R.id.file_size_textView));
    private ImageView f22015h = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private ImageButton f22016i = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ProgressWheel f22017j = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private C3284e f22018k;
    private C3283d f22019l;
    private LinearLayout f22020m = ((LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));
    private ImageView f22021n = ((ImageView) this.itemView.findViewById(R.id.actionDownloadChatFile));
    private TextView f22022o = ((TextView) this.itemView.findViewById(R.id.progress_text_action_view));

    class C36191 implements OnClickListener {
        final /* synthetic */ C7462c f10823a;

        C36191(C7462c c7462c) {
            this.f10823a = c7462c;
        }

        public final void onClick(View view) {
            this.f10823a.f22018k.mo2317b(((C7597c) this.f10823a.f16244a).f21300A);
        }
    }

    class C36202 implements OnClickListener {
        final /* synthetic */ C7462c f10824a;

        C36202(C7462c c7462c) {
            this.f10824a = c7462c;
        }

        public final void onClick(View view) {
            C7597c c7597c = (C7597c) this.f10824a.f16244a;
            switch (c7597c.f23253U) {
                case DELETED:
                case NOT_STARTED:
                    if (c7597c.f23254V == null || c7597c.f23254V.isEmpty()) {
                        this.f10824a.f22018k.mo2307a(c7597c.ac, false);
                        return;
                    } else {
                        this.f10824a.f22018k.mo2307a(c7597c.ac, true);
                        return;
                    }
                case TRANSMITTING:
                    this.f10824a.f22018k.mo2305a(c7597c.ac);
                    return;
                case CANCEL:
                    if (c7597c.f23254V == null || c7597c.f23254V.isEmpty()) {
                        this.f10824a.f22018k.mo2307a(c7597c.ac, false);
                        return;
                    } else {
                        this.f10824a.f22018k.mo2307a(c7597c.ac, true);
                        return;
                    }
                case ERROR:
                    if (c7597c.f23254V == null || c7597c.f23254V.isEmpty()) {
                        this.f10824a.f22018k.mo2307a(c7597c.ac, false);
                        return;
                    } else {
                        this.f10824a.f22018k.mo2307a(c7597c.ac, true);
                        return;
                    }
                case FINISHED:
                    this.f10824a.f22019l.mo2329d(c7597c.f23251S, c7597c.f23249Q);
                    return;
                default:
                    return;
            }
        }
    }

    public C7462c(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3284e c3284e, C3283d c3283d, C3280a c3280a, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_file_channel_output_list_item, c3280a, c3286g, c3284e);
        this.f22018k = c3284e;
        this.f22019l = c3283d;
        this.f22021n.setOnClickListener(new C36191(this));
        this.f22016i.setOnClickListener(new C36202(this));
        C2491i.m6802a(this.f22022o, UIThemeManager.getmInstance().getOutput_content_and_caption_message_text_color());
    }

    private void m20007a(C7597c c7597c, C2971k c2971k) {
        boolean z = ((c7597c.f23254V == null || c7597c.f23254V.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22016i, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7597c c7597c = (C7597c) c6829g;
        this.f22013f.setText(c7597c.f23249Q);
        this.f22014g.setText(c7597c.f23250R);
        if (c7597c.f23248P == null || c7597c.f23248P.isEmpty()) {
            this.f22012e.setVisibility(8);
        } else {
            this.f22012e.setText(c7597c.f23248P);
            this.f22012e.setVisibility(0);
            this.f22012e.setTextSize((float) c7597c.f23256X);
            C4520n.m8234a(this.f22012e);
        }
        switch (c7597c.f21337w) {
            case ERROR:
                imageView = this.f22015h;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22015h;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22015h;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22015h;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        switch (c7597c.f23253U) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22017j.setVisibility(8);
                this.f22022o.setVisibility(8);
                this.f22021n.setVisibility(8);
                m20007a(c7597c, c7597c.f21337w);
                break;
            case TRANSMITTING:
                this.f22017j.setVisibility(0);
                this.f22016i.setImageResource(R.drawable.ic_file_stop_download);
                this.f22022o.setVisibility(0);
                this.f22022o.setText(c7597c.f23255W);
                if (c7597c.f23252T > 0) {
                    this.f22017j.setProgress(((float) c7597c.f23252T) * 0.01f);
                }
                this.f22021n.setVisibility(8);
                break;
            case FINISHED:
                this.f22017j.setVisibility(8);
                this.f22016i.setImageResource(R.drawable.ic_file_attach);
                this.f22021n.setVisibility(0);
                this.f22022o.setVisibility(8);
                break;
            default:
                break;
        }
        m19051a((C7358a) c7597c, this.f22020m, true);
    }
}
