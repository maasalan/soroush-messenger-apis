package mobi.mmdt.ott.view.conversation.p432e.p433a.p434a;

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
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p418a.C3288i;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7698a;

public final class C7424a extends C7345b {
    private TextView f21549d;
    private TextView f21550e;
    private ImageButton f21551f;
    private ProgressWheel f21552g;
    private C3284e f21553h;
    private C3283d f21554i;
    private FrameLayout f21555j;
    private ImageView f21556k;
    private TextView f21557l;

    class C34831 implements OnClickListener {
        final /* synthetic */ C7424a f10629a;

        C34831(C7424a c7424a) {
            this.f10629a = c7424a;
        }

        public final void onClick(View view) {
            C6829g c6829g = this.f10629a.f16244a;
            this.f10629a.f21553h;
        }
    }

    class C34842 implements OnClickListener {
        final /* synthetic */ C7424a f10630a;

        C34842(C7424a c7424a) {
            this.f10630a = c7424a;
        }

        public final void onClick(View view) {
            C7698a c7698a = (C7698a) this.f10630a.f16244a;
            switch (c7698a.f24123T) {
                case DELETED:
                case NOT_STARTED:
                    this.f10630a.f21553h.mo2307a(c7698a.ac, true);
                    return;
                case TRANSMITTING:
                    this.f10630a.f21553h.mo2305a(c7698a.ac);
                    return;
                case CANCEL:
                    this.f10630a.f21553h.mo2307a(c7698a.ac, true);
                    return;
                case ERROR:
                    this.f10630a.f21553h.mo2307a(c7698a.ac, true);
                    return;
                case FINISHED:
                    this.f10630a.f21554i.mo2320b(c7698a.f24121R, c7698a.f24119P, "", "");
                    return;
                default:
                    return;
            }
        }
    }

    public C7424a(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3284e c3284e, C3288i c3288i, C3283d c3283d, C3286g c3286g) {
        C7345b c7345b = this;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_audio_channel_direct_input_list_item : R.layout.chat_audio_channel_direct_input_list_item_old, c3288i, c3286g, c3284e);
        c7345b.f21553h = c3284e;
        c7345b.f21554i = c3283d;
        c7345b.f21549d = (TextView) c7345b.itemView.findViewById(R.id.file_name_textView);
        c7345b.f21550e = (TextView) c7345b.itemView.findViewById(R.id.file_size_textView);
        c7345b.f21551f = (ImageButton) c7345b.itemView.findViewById(R.id.action_imageView);
        c7345b.f21552g = (ProgressWheel) c7345b.itemView.findViewById(R.id.progress_wheel);
        c7345b.f21555j = (FrameLayout) c7345b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7345b.f21556k = (ImageView) c7345b.itemView.findViewById(R.id.actionDownloadChatFile);
        c7345b.f21557l = (TextView) c7345b.itemView.findViewById(R.id.progress_text_action_view);
        c7345b.f21556k.setOnClickListener(new C34831(c7345b));
        c7345b.f21551f.setOnClickListener(new C34842(c7345b));
        C2491i.m6802a(c7345b.f21557l, UIThemeManager.getmInstance().getInput_content_and_caption_message_text_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7698a c7698a = (C7698a) c6829g;
        this.f21549d.setText(c7698a.f24119P);
        this.f21550e.setText(c7698a.f24120Q);
        switch (c7698a.f24123T) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f21552g.setVisibility(8);
                this.f21551f.setImageResource(R.drawable.ic_file_start_download);
                this.f21556k.setVisibility(8);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f21552g.setVisibility(0);
                this.f21551f.setImageResource(R.drawable.ic_file_stop_download);
                this.f21557l.setVisibility(0);
                this.f21557l.setText(c7698a.f24124U);
                if (c7698a.f24122S > 0) {
                    progressWheel = this.f21552g;
                    f = ((float) c7698a.f24122S) * 0.01f;
                } else {
                    progressWheel = this.f21552g;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f21556k.setVisibility(8);
                break;
            case FINISHED:
                this.f21552g.setVisibility(8);
                this.f21551f.setImageResource(R.drawable.ic_audio_play_white);
                this.f21556k.setVisibility(0);
                break;
            default:
                break;
        }
        this.f21557l.setVisibility(8);
        m19051a((C7358a) c7698a, this.f21555j, false);
    }
}
