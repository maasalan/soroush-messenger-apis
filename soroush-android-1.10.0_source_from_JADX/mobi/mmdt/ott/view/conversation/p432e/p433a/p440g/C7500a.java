package mobi.mmdt.ott.view.conversation.p432e.p433a.p440g;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p418a.C3288i;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7635a;

public final class C7500a extends C7351b {
    private TextView f22478d = ((TextView) this.itemView.findViewById(R.id.audio_name_textView));
    private TextView f22479e = ((TextView) this.itemView.findViewById(R.id.audio_size_textView));
    private ImageButton f22480f = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ProgressWheel f22481g = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private C3284e f22482h;
    private C3283d f22483i;
    private FrameLayout f22484j = ((FrameLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));
    private ImageView f22485k = ((ImageView) this.itemView.findViewById(R.id.actionDownloadChatFile));
    private TextView f22486l = ((TextView) this.itemView.findViewById(R.id.progress_text_action_view));

    class C37741 implements OnClickListener {
        final /* synthetic */ C7500a f11107a;

        C37741(C7500a c7500a) {
            this.f11107a = c7500a;
        }

        public final void onClick(View view) {
            C6829g c6829g = this.f11107a.f16244a;
            this.f11107a.f22482h;
        }
    }

    class C37752 implements OnClickListener {
        final /* synthetic */ C7500a f11108a;

        C37752(C7500a c7500a) {
            this.f11108a = c7500a;
        }

        public final void onClick(View view) {
            C7635a c7635a = (C7635a) this.f11108a.f16244a;
            switch (c7635a.f23514T) {
                case DELETED:
                case NOT_STARTED:
                    this.f11108a.f22482h.mo2307a(c7635a.f23101W, true);
                    return;
                case TRANSMITTING:
                    this.f11108a.f22482h.mo2305a(c7635a.f23101W);
                    return;
                case CANCEL:
                    this.f11108a.f22482h.mo2307a(c7635a.f23101W, true);
                    return;
                case ERROR:
                    this.f11108a.f22482h.mo2307a(c7635a.f23101W, true);
                    return;
                case FINISHED:
                    this.f11108a.f22483i.mo2320b(c7635a.f23512R, c7635a.f23510P, "", "");
                    return;
                default:
                    return;
            }
        }
    }

    public C7500a(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3284e c3284e, C3288i c3288i, C3283d c3283d, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_audio_social_input_list_item, c3288i, c3286g, c3284e);
        this.f22482h = c3284e;
        this.f22483i = c3283d;
        this.f22485k.setOnClickListener(new C37741(this));
        this.f22480f.setOnClickListener(new C37752(this));
        C2491i.m6802a(this.f22486l, UIThemeManager.getmInstance().getInput_content_and_caption_message_text_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7635a c7635a = (C7635a) c6829g;
        this.f22478d.setText(c7635a.f23510P);
        this.f22479e.setText(c7635a.f23511Q);
        switch (c7635a.f23514T) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22481g.setVisibility(8);
                this.f22480f.setImageResource(R.drawable.ic_file_start_download);
                this.f22485k.setVisibility(8);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22481g.setVisibility(0);
                this.f22480f.setImageResource(R.drawable.ic_file_stop_download);
                this.f22486l.setVisibility(0);
                this.f22486l.setText(c7635a.f23515U);
                if (c7635a.f23513S > 0) {
                    progressWheel = this.f22481g;
                    f = ((float) c7635a.f23513S) * 0.01f;
                } else {
                    progressWheel = this.f22481g;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f22485k.setVisibility(8);
                break;
            case FINISHED:
                this.f22481g.setVisibility(8);
                this.f22480f.setImageResource(R.drawable.ic_audio_play_white);
                this.f22485k.setVisibility(0);
                break;
            default:
                break;
        }
        this.f22486l.setVisibility(8);
        m19051a((C7358a) c7635a, this.f22484j, false);
    }
}
