package mobi.mmdt.ott.view.conversation.p432e.p433a.p436c;

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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7583a;

public final class C7448a extends C7347b {
    private TextView f21848e;
    private TextView f21849f;
    private ImageButton f21850g;
    private ProgressWheel f21851h;
    private C3284e f21852i;
    private C3283d f21853j;
    private FrameLayout f21854k;
    private ImageView f21855l;
    private TextView f21856m;

    class C35621 implements OnClickListener {
        final /* synthetic */ C7448a f10725a;

        C35621(C7448a c7448a) {
            this.f10725a = c7448a;
        }

        public final void onClick(View view) {
            C6829g c6829g = this.f10725a.f16244a;
            this.f10725a.f21852i;
        }
    }

    class C35632 implements OnClickListener {
        final /* synthetic */ C7448a f10726a;

        C35632(C7448a c7448a) {
            this.f10726a = c7448a;
        }

        public final void onClick(View view) {
            C7583a c7583a = (C7583a) this.f10726a.f16244a;
            switch (c7583a.f23144T) {
                case DELETED:
                case NOT_STARTED:
                    this.f10726a.f21852i.mo2307a(c7583a.ac, true);
                    return;
                case TRANSMITTING:
                    this.f10726a.f21852i.mo2305a(c7583a.ac);
                    return;
                case CANCEL:
                    this.f10726a.f21852i.mo2307a(c7583a.ac, true);
                    return;
                case ERROR:
                    this.f10726a.f21852i.mo2307a(c7583a.ac, true);
                    return;
                case FINISHED:
                    this.f10726a.f21853j.mo2320b(c7583a.f23142R, c7583a.f23140P, "", "");
                    return;
                default:
                    return;
            }
        }
    }

    public C7448a(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3284e c3284e, C3280a c3280a, C3283d c3283d, C3286g c3286g) {
        C7347b c7347b = this;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_audio_channel_input_list_item : R.layout.chat_audio_channel_input_list_item_old, c3280a, c3286g, c3284e);
        c7347b.f21852i = c3284e;
        c7347b.f21853j = c3283d;
        c7347b.f21848e = (TextView) c7347b.itemView.findViewById(R.id.audio_name_textView);
        c7347b.f21849f = (TextView) c7347b.itemView.findViewById(R.id.audio_size_textView);
        c7347b.f21850g = (ImageButton) c7347b.itemView.findViewById(R.id.action_imageView);
        c7347b.f21851h = (ProgressWheel) c7347b.itemView.findViewById(R.id.progress_wheel);
        c7347b.f21854k = (FrameLayout) c7347b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7347b.f21855l = (ImageView) c7347b.itemView.findViewById(R.id.actionDownloadChatFile);
        c7347b.f21856m = (TextView) c7347b.itemView.findViewById(R.id.progress_text_action_view);
        c7347b.f21855l.setOnClickListener(new C35621(c7347b));
        c7347b.f21850g.setOnClickListener(new C35632(c7347b));
        C2491i.m6802a(c7347b.f21856m, UIThemeManager.getmInstance().getInput_content_and_caption_message_text_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7583a c7583a = (C7583a) c6829g;
        this.f21848e.setText(c7583a.f23140P);
        this.f21849f.setText(c7583a.f23141Q);
        switch (c7583a.f23144T) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f21851h.setVisibility(8);
                this.f21850g.setImageResource(R.drawable.ic_file_start_download);
                this.f21855l.setVisibility(8);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f21851h.setVisibility(0);
                this.f21850g.setImageResource(R.drawable.ic_file_stop_download);
                this.f21856m.setVisibility(0);
                this.f21856m.setText(c7583a.f23145U);
                if (c7583a.f23143S > 0) {
                    progressWheel = this.f21851h;
                    f = ((float) c7583a.f23143S) * 0.01f;
                } else {
                    progressWheel = this.f21851h;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f21855l.setVisibility(8);
                break;
            case FINISHED:
                this.f21851h.setVisibility(8);
                this.f21850g.setImageResource(R.drawable.ic_audio_play_white);
                this.f21855l.setVisibility(0);
                break;
            default:
                break;
        }
        this.f21856m.setVisibility(8);
        m19051a((C7358a) c7583a, this.f21854k, false);
    }
}
