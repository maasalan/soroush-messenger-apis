package mobi.mmdt.ott.view.conversation.p432e.p433a.p442i;

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
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7661a;

public final class C7526a extends C7353b {
    private TextView f22778d = ((TextView) this.itemView.findViewById(R.id.audio_name_textView));
    private TextView f22779e = ((TextView) this.itemView.findViewById(R.id.audio_size_textView));
    private ImageButton f22780f = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ProgressWheel f22781g = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private C3284e f22782h;
    private C3283d f22783i;
    private LinearLayout f22784j = ((LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));
    private ImageView f22785k = ((ImageView) this.itemView.findViewById(R.id.actionDownloadChatFile));
    private TextView f22786l = ((TextView) this.itemView.findViewById(R.id.progress_text_action_view));

    class C38781 implements OnClickListener {
        final /* synthetic */ C7526a f11294a;

        C38781(C7526a c7526a) {
            this.f11294a = c7526a;
        }

        public final void onClick(View view) {
            C6829g c6829g = this.f11294a.f16244a;
            this.f11294a.f22782h;
        }
    }

    class C38792 implements OnClickListener {
        final /* synthetic */ C7526a f11295a;

        C38792(C7526a c7526a) {
            this.f11295a = c7526a;
        }

        public final void onClick(View view) {
            C7661a c7661a = (C7661a) this.f11295a.f16244a;
            switch (c7661a.f23687T) {
                case DELETED:
                case NOT_STARTED:
                    this.f11295a.f22782h.mo2307a(c7661a.mo3604b(), true);
                    return;
                case TRANSMITTING:
                    this.f11295a.f22782h.mo2305a(c7661a.mo3604b());
                    return;
                case CANCEL:
                    this.f11295a.f22782h.mo2307a(c7661a.mo3604b(), true);
                    return;
                case ERROR:
                    this.f11295a.f22782h.mo2307a(c7661a.mo3604b(), true);
                    return;
                case FINISHED:
                    this.f11295a.f22783i.mo2320b(c7661a.f23685R, c7661a.f23683P, "", "");
                    return;
                default:
                    return;
            }
        }
    }

    public C7526a(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3284e c3284e, C3283d c3283d, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_audio_input_list_item, c3286g, c3284e);
        this.f22782h = c3284e;
        this.f22783i = c3283d;
        this.f22785k.setOnClickListener(new C38781(this));
        this.f22780f.setOnClickListener(new C38792(this));
        C2491i.m6802a(this.f22786l, UIThemeManager.getmInstance().getInput_content_and_caption_message_text_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7661a c7661a = (C7661a) c6829g;
        this.f22778d.setText(c7661a.f23683P);
        this.f22779e.setText(c7661a.f23684Q);
        switch (c7661a.f23687T) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22781g.setVisibility(8);
                this.f22780f.setImageResource(R.drawable.ic_file_start_download);
                this.f22785k.setVisibility(8);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22781g.setVisibility(0);
                this.f22780f.setImageResource(R.drawable.ic_file_stop_download);
                this.f22786l.setVisibility(0);
                this.f22786l.setText(c7661a.f23688U);
                if (c7661a.f23686S > 0) {
                    progressWheel = this.f22781g;
                    f = ((float) c7661a.f23686S) * 0.01f;
                } else {
                    progressWheel = this.f22781g;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f22785k.setVisibility(8);
                break;
            case FINISHED:
                this.f22781g.setVisibility(8);
                this.f22780f.setImageResource(R.drawable.ic_audio_play_white);
                this.f22785k.setVisibility(0);
                break;
            default:
                break;
        }
        this.f22786l.setVisibility(8);
        m19051a((C7358a) c7661a, this.f22784j, false);
    }
}
