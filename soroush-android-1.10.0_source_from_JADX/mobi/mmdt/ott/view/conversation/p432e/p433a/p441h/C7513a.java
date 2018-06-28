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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7648a;

public final class C7513a extends C7352b {
    private TextView f22623d = ((TextView) this.itemView.findViewById(R.id.audio_name_textView));
    private TextView f22624e = ((TextView) this.itemView.findViewById(R.id.audio_size_textView));
    private ImageView f22625f = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private ImageButton f22626g = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ProgressWheel f22627h = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private C3284e f22628i;
    private C3283d f22629j;
    private LinearLayout f22630k = ((LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));
    private ImageView f22631l = ((ImageView) this.itemView.findViewById(R.id.actionDownloadChatFile));
    private TextView f22632m = ((TextView) this.itemView.findViewById(R.id.progress_text_action_view));

    class C38261 implements OnClickListener {
        final /* synthetic */ C7513a f11198a;

        C38261(C7513a c7513a) {
            this.f11198a = c7513a;
        }

        public final void onClick(View view) {
            C6829g c6829g = this.f11198a.f16244a;
            this.f11198a.f22628i;
        }
    }

    class C38272 implements OnClickListener {
        final /* synthetic */ C7513a f11199a;

        C38272(C7513a c7513a) {
            this.f11199a = c7513a;
        }

        public final void onClick(View view) {
            C7648a c7648a = (C7648a) this.f11199a.f16244a;
            switch (c7648a.f23584T) {
                case DELETED:
                case NOT_STARTED:
                    if (c7648a.f23585U == null || c7648a.f23585U.isEmpty()) {
                        this.f11199a.f22628i.mo2307a(c7648a.mo3604b(), false);
                        return;
                    } else {
                        this.f11199a.f22628i.mo2307a(c7648a.mo3604b(), true);
                        return;
                    }
                case TRANSMITTING:
                    this.f11199a.f22628i.mo2305a(c7648a.mo3604b());
                    return;
                case CANCEL:
                    if (c7648a.f23585U == null || c7648a.f23585U.isEmpty()) {
                        this.f11199a.f22628i.mo2307a(c7648a.mo3604b(), false);
                        return;
                    } else {
                        this.f11199a.f22628i.mo2307a(c7648a.mo3604b(), true);
                        return;
                    }
                case ERROR:
                    if (c7648a.f23585U == null || c7648a.f23585U.isEmpty()) {
                        this.f11199a.f22628i.mo2307a(c7648a.mo3604b(), false);
                        return;
                    } else {
                        this.f11199a.f22628i.mo2307a(c7648a.mo3604b(), true);
                        return;
                    }
                case FINISHED:
                    this.f11199a.f22629j.mo2320b(c7648a.f23582R, c7648a.f23580P, "", "");
                    return;
                default:
                    return;
            }
        }
    }

    public C7513a(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3284e c3284e, C3283d c3283d, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_audio_output_list_item, c3286g, c3284e);
        this.f22628i = c3284e;
        this.f22629j = c3283d;
        this.f22631l.setOnClickListener(new C38261(this));
        this.f22626g.setOnClickListener(new C38272(this));
        C2491i.m6802a(this.f22632m, UIThemeManager.getmInstance().getOutput_content_and_caption_message_text_color());
    }

    private void m20363a(C7648a c7648a, C2971k c2971k) {
        boolean z = ((c7648a.f23585U == null || c7648a.f23585U.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22626g, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7648a c7648a = (C7648a) c6829g;
        this.f22623d.setText(c7648a.f23580P);
        this.f22624e.setText(c7648a.f23581Q);
        switch (c7648a.f21337w) {
            case ERROR:
                imageView = this.f22625f;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22625f;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22625f;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22625f;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        switch (c7648a.f23584T) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22627h.setVisibility(8);
                this.f22631l.setVisibility(8);
                this.f22632m.setVisibility(8);
                m20363a(c7648a, c7648a.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22627h.setVisibility(0);
                this.f22626g.setImageResource(R.drawable.ic_file_stop_download);
                this.f22632m.setVisibility(0);
                this.f22632m.setText(c7648a.f23586V);
                if (c7648a.f23583S > 0) {
                    progressWheel = this.f22627h;
                    f = ((float) c7648a.f23583S) * 0.01f;
                } else {
                    progressWheel = this.f22627h;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f22631l.setVisibility(8);
                break;
            case FINISHED:
                this.f22627h.setVisibility(8);
                this.f22626g.setImageResource(R.drawable.ic_audio_play_white);
                this.f22631l.setVisibility(0);
                this.f22632m.setVisibility(8);
                break;
            default:
                break;
        }
        m19051a((C7358a) c7648a, this.f22630k, true);
    }
}
