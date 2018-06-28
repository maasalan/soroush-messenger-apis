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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7596a;

public final class C7461a extends C7348b {
    private TextView f22002e = ((TextView) this.itemView.findViewById(R.id.audio_name_textView));
    private TextView f22003f = ((TextView) this.itemView.findViewById(R.id.audio_size_textView));
    private ImageView f22004g = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private ImageButton f22005h = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ProgressWheel f22006i = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private C3284e f22007j;
    private C3283d f22008k;
    private LinearLayout f22009l = ((LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));
    private ImageView f22010m = ((ImageView) this.itemView.findViewById(R.id.actionDownloadChatFile));
    private TextView f22011n = ((TextView) this.itemView.findViewById(R.id.progress_text_action_view));

    class C36161 implements OnClickListener {
        final /* synthetic */ C7461a f10819a;

        C36161(C7461a c7461a) {
            this.f10819a = c7461a;
        }

        public final void onClick(View view) {
            C6829g c6829g = this.f10819a.f16244a;
            this.f10819a.f22007j;
        }
    }

    class C36172 implements OnClickListener {
        final /* synthetic */ C7461a f10820a;

        C36172(C7461a c7461a) {
            this.f10820a = c7461a;
        }

        public final void onClick(View view) {
            C7596a c7596a = (C7596a) this.f10820a.f16244a;
            switch (c7596a.f23243T) {
                case DELETED:
                case NOT_STARTED:
                    if (c7596a.f23244U == null || c7596a.f23244U.isEmpty()) {
                        this.f10820a.f22007j.mo2307a(c7596a.ac, false);
                        return;
                    } else {
                        this.f10820a.f22007j.mo2307a(c7596a.ac, true);
                        return;
                    }
                case TRANSMITTING:
                    this.f10820a.f22007j.mo2305a(c7596a.ac);
                    return;
                case CANCEL:
                    if (c7596a.f23244U == null || c7596a.f23244U.isEmpty()) {
                        this.f10820a.f22007j.mo2307a(c7596a.ac, false);
                        return;
                    } else {
                        this.f10820a.f22007j.mo2307a(c7596a.ac, true);
                        return;
                    }
                case ERROR:
                    if (c7596a.f23244U == null || c7596a.f23244U.isEmpty()) {
                        this.f10820a.f22007j.mo2307a(c7596a.ac, false);
                        return;
                    } else {
                        this.f10820a.f22007j.mo2307a(c7596a.ac, true);
                        return;
                    }
                case FINISHED:
                    this.f10820a.f22008k.mo2320b(c7596a.f23241R, c7596a.f23239P, "", "");
                    return;
                default:
                    return;
            }
        }
    }

    public C7461a(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3284e c3284e, C3283d c3283d, C3280a c3280a, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_audio_channel_output_list_item, c3280a, c3286g, c3284e);
        this.f22007j = c3284e;
        this.f22008k = c3283d;
        this.f22010m.setOnClickListener(new C36161(this));
        this.f22005h.setOnClickListener(new C36172(this));
        C2491i.m6802a(this.f22011n, UIThemeManager.getmInstance().getOutput_content_and_caption_message_text_color());
    }

    private void m20003a(C7596a c7596a, C2971k c2971k) {
        boolean z = ((c7596a.f23244U == null || c7596a.f23244U.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22005h, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7596a c7596a = (C7596a) c6829g;
        this.f22002e.setText(c7596a.f23239P);
        this.f22003f.setText(c7596a.f23240Q);
        switch (c7596a.f21337w) {
            case ERROR:
                imageView = this.f22004g;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22004g;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22004g;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22004g;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        switch (c7596a.f23243T) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22006i.setVisibility(8);
                this.f22011n.setVisibility(8);
                m20003a(c7596a, c7596a.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22006i.setVisibility(0);
                this.f22005h.setImageResource(R.drawable.ic_file_stop_download);
                this.f22011n.setVisibility(0);
                this.f22011n.setText(c7596a.f23245V);
                if (c7596a.f23242S > 0) {
                    progressWheel = this.f22006i;
                    f = ((float) c7596a.f23242S) * 0.01f;
                } else {
                    progressWheel = this.f22006i;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f22006i.setVisibility(8);
                this.f22005h.setImageResource(R.drawable.ic_audio_play_white);
                this.f22010m.setVisibility(0);
                this.f22011n.setVisibility(8);
                break;
            default:
                break;
        }
        this.f22010m.setVisibility(8);
        m19051a((C7358a) c7596a, this.f22009l, true);
    }
}
