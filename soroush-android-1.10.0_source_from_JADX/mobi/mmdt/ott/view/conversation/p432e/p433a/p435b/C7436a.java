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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7710a;

public final class C7436a extends C7346b {
    private TextView f21695e = ((TextView) this.itemView.findViewById(R.id.audio_name_textView));
    private TextView f21696f = ((TextView) this.itemView.findViewById(R.id.audio_size_textView));
    private ImageView f21697g = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private ImageButton f21698h = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ProgressWheel f21699i = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private C3284e f21700j;
    private C3283d f21701k;
    private LinearLayout f21702l = ((LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));
    private ImageView f21703m = ((ImageView) this.itemView.findViewById(R.id.actionDownloadChatFile));
    private TextView f21704n = ((TextView) this.itemView.findViewById(R.id.progress_text_action_view));

    class C35211 implements OnClickListener {
        final /* synthetic */ C7436a f10671a;

        C35211(C7436a c7436a) {
            this.f10671a = c7436a;
        }

        public final void onClick(View view) {
            C6829g c6829g = this.f10671a.f16244a;
            this.f10671a.f21700j;
        }
    }

    class C35222 implements OnClickListener {
        final /* synthetic */ C7436a f10672a;

        C35222(C7436a c7436a) {
            this.f10672a = c7436a;
        }

        public final void onClick(View view) {
            C7710a c7710a = (C7710a) this.f10672a.f16244a;
            switch (c7710a.f24220T) {
                case DELETED:
                case NOT_STARTED:
                    if (c7710a.f24221U == null || c7710a.f24221U.isEmpty()) {
                        this.f10672a.f21700j.mo2307a(c7710a.ac, false);
                        return;
                    } else {
                        this.f10672a.f21700j.mo2307a(c7710a.ac, true);
                        return;
                    }
                case TRANSMITTING:
                    this.f10672a.f21700j.mo2305a(c7710a.ac);
                    return;
                case CANCEL:
                    if (c7710a.f24221U == null || c7710a.f24221U.isEmpty()) {
                        this.f10672a.f21700j.mo2307a(c7710a.ac, false);
                        return;
                    } else {
                        this.f10672a.f21700j.mo2307a(c7710a.ac, true);
                        return;
                    }
                case ERROR:
                    if (c7710a.f24221U == null || c7710a.f24221U.isEmpty()) {
                        this.f10672a.f21700j.mo2307a(c7710a.ac, false);
                        return;
                    } else {
                        this.f10672a.f21700j.mo2307a(c7710a.ac, true);
                        return;
                    }
                case FINISHED:
                    this.f10672a.f21701k.mo2320b(c7710a.f24218R, c7710a.f24216P, "", "");
                    return;
                default:
                    return;
            }
        }
    }

    public C7436a(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3284e c3284e, C3283d c3283d, C3280a c3280a, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_audio_channel_direct_output_list_item, c3280a, c3286g, c3284e);
        this.f21700j = c3284e;
        this.f21701k = c3283d;
        this.f21703m.setOnClickListener(new C35211(this));
        this.f21698h.setOnClickListener(new C35222(this));
        C2491i.m6802a(this.f21704n, UIThemeManager.getmInstance().getOutput_content_and_caption_message_text_color());
    }

    private void m19834a(C7710a c7710a, C2971k c2971k) {
        boolean z = ((c7710a.f24221U == null || c7710a.f24221U.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f21698h, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7710a c7710a = (C7710a) c6829g;
        this.f21695e.setText(c7710a.f24216P);
        this.f21696f.setText(c7710a.f24217Q);
        switch (c7710a.f21337w) {
            case ERROR:
                imageView = this.f21697g;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f21697g;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f21697g;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f21697g;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        switch (c7710a.f24220T) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f21699i.setVisibility(8);
                this.f21704n.setVisibility(8);
                this.f21703m.setVisibility(8);
                m19834a(c7710a, c7710a.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f21699i.setVisibility(0);
                this.f21698h.setImageResource(R.drawable.ic_file_stop_download);
                this.f21704n.setVisibility(0);
                this.f21704n.setText(c7710a.f24222V);
                if (c7710a.f24219S > 0) {
                    progressWheel = this.f21699i;
                    f = ((float) c7710a.f24219S) * 0.01f;
                } else {
                    progressWheel = this.f21699i;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f21703m.setVisibility(8);
                break;
            case FINISHED:
                this.f21699i.setVisibility(8);
                this.f21698h.setImageResource(R.drawable.ic_audio_play_white);
                this.f21703m.setVisibility(0);
                this.f21704n.setVisibility(8);
                break;
            default:
                break;
        }
        m19051a((C7358a) c7710a, this.f21702l, true);
    }
}
