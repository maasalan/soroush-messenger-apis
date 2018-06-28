package mobi.mmdt.ott.view.conversation.p432e.p433a.p438e;

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
import mobi.mmdt.ott.view.conversation.p418a.C3280a;
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7609a;

public final class C7474a extends C7349b {
    private TextView f22163e;
    private TextView f22164f;
    private ImageButton f22165g;
    private ProgressWheel f22166h;
    private C3284e f22167i;
    private C3283d f22168j;
    private FrameLayout f22169k;
    private ImageView f22170l;
    private TextView f22171m;

    class C36681 implements OnClickListener {
        final /* synthetic */ C7474a f10916a;

        C36681(C7474a c7474a) {
            this.f10916a = c7474a;
        }

        public final void onClick(View view) {
            C6829g c6829g = this.f10916a.f16244a;
            this.f10916a.f22167i;
        }
    }

    class C36692 implements OnClickListener {
        final /* synthetic */ C7474a f10917a;

        C36692(C7474a c7474a) {
            this.f10917a = c7474a;
        }

        public final void onClick(View view) {
            C7609a c7609a = (C7609a) this.f10917a.f16244a;
            switch (c7609a.f23363T) {
                case DELETED:
                case NOT_STARTED:
                    this.f10917a.f22167i.mo2307a(c7609a.f23088W, true);
                    return;
                case TRANSMITTING:
                    this.f10917a.f22167i.mo2305a(c7609a.f23088W);
                    return;
                case CANCEL:
                    this.f10917a.f22167i.mo2307a(c7609a.f23088W, true);
                    return;
                case ERROR:
                    this.f10917a.f22167i.mo2307a(c7609a.f23088W, true);
                    return;
                case FINISHED:
                    this.f10917a.f22168j.mo2320b(c7609a.f23361R, c7609a.f23359P, "", "");
                    return;
                default:
                    return;
            }
        }
    }

    public C7474a(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3284e c3284e, C3280a c3280a, C3283d c3283d, C3286g c3286g) {
        C7349b c7349b = this;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_audio_channel_input_list_item : R.layout.chat_audio_channel_input_list_item_old, c3280a, c3286g, c3284e);
        c7349b.f22167i = c3284e;
        c7349b.f22168j = c3283d;
        c7349b.f22163e = (TextView) c7349b.itemView.findViewById(R.id.audio_name_textView);
        c7349b.f22164f = (TextView) c7349b.itemView.findViewById(R.id.audio_size_textView);
        c7349b.f22165g = (ImageButton) c7349b.itemView.findViewById(R.id.action_imageView);
        c7349b.f22166h = (ProgressWheel) c7349b.itemView.findViewById(R.id.progress_wheel);
        c7349b.f22169k = (FrameLayout) c7349b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7349b.f22170l = (ImageView) c7349b.itemView.findViewById(R.id.actionDownloadChatFile);
        c7349b.f22171m = (TextView) c7349b.itemView.findViewById(R.id.progress_text_action_view);
        c7349b.f22170l.setOnClickListener(new C36681(c7349b));
        c7349b.f22165g.setOnClickListener(new C36692(c7349b));
        C2491i.m6802a(c7349b.f22171m, UIThemeManager.getmInstance().getInput_content_and_caption_message_text_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7609a c7609a = (C7609a) c6829g;
        this.f22163e.setText(c7609a.f23359P);
        this.f22164f.setText(c7609a.f23360Q);
        switch (c7609a.f23363T) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22166h.setVisibility(8);
                this.f22165g.setImageResource(R.drawable.ic_file_start_download);
                this.f22170l.setVisibility(8);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22166h.setVisibility(0);
                this.f22165g.setImageResource(R.drawable.ic_file_stop_download);
                this.f22171m.setVisibility(0);
                this.f22171m.setText(c7609a.f23364U);
                if (c7609a.f23362S > 0) {
                    progressWheel = this.f22166h;
                    f = ((float) c7609a.f23362S) * 0.01f;
                } else {
                    progressWheel = this.f22166h;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f22170l.setVisibility(8);
                break;
            case FINISHED:
                this.f22166h.setVisibility(8);
                this.f22165g.setImageResource(R.drawable.ic_audio_play_white);
                this.f22170l.setVisibility(0);
                break;
            default:
                break;
        }
        this.f22171m.setVisibility(8);
        m19051a((C7358a) c7609a, this.f22169k, false);
    }
}
