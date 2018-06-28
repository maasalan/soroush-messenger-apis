package mobi.mmdt.ott.view.conversation.p432e.p433a.p441h;

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
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p432e.p433a.C7194a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7649c;
import mobi.mmdt.ott.view.tools.C4520n;

public final class C7514c extends C7352b {
    private TextView f22633d = ((TextView) this.itemView.findViewById(R.id.caption_textView));
    private TextView f22634e = ((TextView) this.itemView.findViewById(R.id.file_name_textView));
    private TextView f22635f = ((TextView) this.itemView.findViewById(R.id.file_size_textView));
    private ImageView f22636g = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private ImageButton f22637h = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ProgressWheel f22638i = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private C3284e f22639j;
    private C3283d f22640k;
    private LinearLayout f22641l = ((LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));
    private ImageView f22642m = ((ImageView) this.itemView.findViewById(R.id.actionDownloadChatFile));
    private TextView f22643n = ((TextView) this.itemView.findViewById(R.id.progress_text_action_view));

    class C38291 implements OnClickListener {
        final /* synthetic */ C7514c f11202a;

        C38291(C7514c c7514c) {
            this.f11202a = c7514c;
        }

        public final void onClick(View view) {
            this.f11202a.f22639j.mo2317b(((C7649c) this.f11202a.f16244a).f21300A);
        }
    }

    class C38302 implements OnClickListener {
        final /* synthetic */ C7514c f11203a;

        C38302(C7514c c7514c) {
            this.f11203a = c7514c;
        }

        public final void onClick(View view) {
            C7649c c7649c = (C7649c) this.f11203a.f16244a;
            switch (c7649c.f23594U) {
                case DELETED:
                case NOT_STARTED:
                    if (c7649c.f23595V == null || c7649c.f23595V.isEmpty()) {
                        this.f11203a.f22639j.mo2307a(c7649c.mo3604b(), false);
                        return;
                    } else {
                        this.f11203a.f22639j.mo2307a(c7649c.mo3604b(), true);
                        return;
                    }
                case TRANSMITTING:
                    this.f11203a.f22639j.mo2305a(c7649c.mo3604b());
                    return;
                case CANCEL:
                    if (c7649c.f23595V == null || c7649c.f23595V.isEmpty()) {
                        this.f11203a.f22639j.mo2307a(c7649c.mo3604b(), false);
                        return;
                    } else {
                        this.f11203a.f22639j.mo2307a(c7649c.mo3604b(), true);
                        return;
                    }
                case ERROR:
                    if (c7649c.f23595V == null || c7649c.f23595V.isEmpty()) {
                        this.f11203a.f22639j.mo2307a(c7649c.mo3604b(), false);
                        return;
                    } else {
                        this.f11203a.f22639j.mo2307a(c7649c.mo3604b(), true);
                        return;
                    }
                case FINISHED:
                    this.f11203a.f22640k.mo2329d(c7649c.f23592S, c7649c.f23590Q);
                    return;
                default:
                    return;
            }
        }
    }

    public C7514c(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3284e c3284e, C3283d c3283d, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_file_output_list_item, c3286g, c3284e);
        this.f22639j = c3284e;
        this.f22640k = c3283d;
        this.f22642m.setOnClickListener(new C38291(this));
        this.f22637h.setOnClickListener(new C38302(this));
        C2491i.m6802a(this.f22643n, UIThemeManager.getmInstance().getOutput_content_and_caption_message_text_color());
    }

    private void m20367a(C7649c c7649c, C2971k c2971k) {
        boolean z = ((c7649c.f23595V == null || c7649c.f23595V.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22637h, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7649c c7649c = (C7649c) c6829g;
        this.f22634e.setText(c7649c.f23590Q);
        this.f22635f.setText(c7649c.f23591R);
        if (c7649c.f23589P == null || c7649c.f23589P.isEmpty()) {
            this.f22633d.setVisibility(8);
        } else {
            this.f22633d.setText(c7649c.f23589P);
            this.f22633d.setVisibility(0);
            C4520n.m8234a(this.f22633d);
        }
        switch (c7649c.f21337w) {
            case ERROR:
                imageView = this.f22636g;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22636g;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22636g;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22636g;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        switch (c7649c.f23594U) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22638i.setVisibility(8);
                this.f22643n.setVisibility(8);
                this.f22642m.setVisibility(8);
                m20367a(c7649c, c7649c.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22638i.setVisibility(0);
                this.f22637h.setImageResource(R.drawable.ic_file_stop_download);
                this.f22643n.setVisibility(0);
                this.f22643n.setText(c7649c.f23596Y);
                if (c7649c.f23593T > 0) {
                    progressWheel = this.f22638i;
                    f = ((float) c7649c.f23593T) * 0.01f;
                } else {
                    progressWheel = this.f22638i;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f22642m.setVisibility(8);
                break;
            case FINISHED:
                this.f22638i.setVisibility(8);
                this.f22637h.setImageResource(R.drawable.ic_file_attach);
                this.f22642m.setVisibility(0);
                this.f22643n.setVisibility(8);
                break;
            default:
                break;
        }
        m19051a((C7358a) c7649c, this.f22641l, true);
    }
}
