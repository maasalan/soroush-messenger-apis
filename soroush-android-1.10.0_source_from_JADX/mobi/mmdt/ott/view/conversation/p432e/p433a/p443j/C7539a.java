package mobi.mmdt.ott.view.conversation.p432e.p433a.p443j;

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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7674a;

public final class C7539a extends C7354b {
    private TextView f22925d = ((TextView) this.itemView.findViewById(R.id.audio_name_textView));
    private TextView f22926e = ((TextView) this.itemView.findViewById(R.id.audio_size_textView));
    private ImageView f22927f = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private ImageButton f22928g = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ProgressWheel f22929h = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private C3284e f22930i;
    private C3283d f22931j;
    private LinearLayout f22932k = ((LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));
    private ImageView f22933l = ((ImageView) this.itemView.findViewById(R.id.actionDownloadChatFile));
    private TextView f22934m = ((TextView) this.itemView.findViewById(R.id.progress_text_action_view));

    class C39291 implements OnClickListener {
        final /* synthetic */ C7539a f11383a;

        C39291(C7539a c7539a) {
            this.f11383a = c7539a;
        }

        public final void onClick(View view) {
            C6829g c6829g = this.f11383a.f16244a;
            this.f11383a.f22930i;
        }
    }

    class C39302 implements OnClickListener {
        final /* synthetic */ C7539a f11384a;

        C39302(C7539a c7539a) {
            this.f11384a = c7539a;
        }

        public final void onClick(View view) {
            C7674a c7674a = (C7674a) this.f11384a.f16244a;
            switch (c7674a.f23773T) {
                case DELETED:
                case NOT_STARTED:
                    if (c7674a.f23774U == null || c7674a.f23774U.isEmpty()) {
                        this.f11384a.f22930i.mo2307a(c7674a.mo3604b(), false);
                        return;
                    } else {
                        this.f11384a.f22930i.mo2307a(c7674a.mo3604b(), true);
                        return;
                    }
                case TRANSMITTING:
                    this.f11384a.f22930i.mo2305a(c7674a.mo3604b());
                    return;
                case CANCEL:
                    if (c7674a.f23774U == null || c7674a.f23774U.isEmpty()) {
                        this.f11384a.f22930i.mo2307a(c7674a.mo3604b(), false);
                        return;
                    } else {
                        this.f11384a.f22930i.mo2307a(c7674a.mo3604b(), true);
                        return;
                    }
                case ERROR:
                    if (c7674a.f23774U == null || c7674a.f23774U.isEmpty()) {
                        this.f11384a.f22930i.mo2307a(c7674a.mo3604b(), false);
                        return;
                    } else {
                        this.f11384a.f22930i.mo2307a(c7674a.mo3604b(), true);
                        return;
                    }
                case FINISHED:
                    this.f11384a.f22931j.mo2320b(c7674a.f23771R, c7674a.f23769P, "", "");
                    return;
                default:
                    return;
            }
        }
    }

    public C7539a(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3284e c3284e, C3283d c3283d, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_audio_output_list_item, c3286g, c3284e);
        this.f22930i = c3284e;
        this.f22931j = c3283d;
        this.f22933l.setOnClickListener(new C39291(this));
        this.f22928g.setOnClickListener(new C39302(this));
        C2491i.m6802a(this.f22934m, UIThemeManager.getmInstance().getOutput_content_and_caption_message_text_color());
    }

    private void m20557a(C7674a c7674a, C2971k c2971k) {
        boolean z = ((c7674a.f23774U == null || c7674a.f23774U.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22928g, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7674a c7674a = (C7674a) c6829g;
        this.f22925d.setText(c7674a.f23769P);
        this.f22926e.setText(c7674a.f23770Q);
        switch (c7674a.f21337w) {
            case ERROR:
                imageView = this.f22927f;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22927f;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22927f;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22927f;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        switch (c7674a.f23773T) {
            case DELETED:
            case NOT_STARTED:
                this.f22929h.setVisibility(8);
                this.f22928g.setImageResource(R.drawable.ic_file_start_upload);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22929h.setVisibility(0);
                this.f22928g.setImageResource(R.drawable.ic_file_stop_download);
                this.f22934m.setVisibility(0);
                this.f22934m.setText(c7674a.f23775V);
                if (c7674a.f23772S > 0) {
                    progressWheel = this.f22929h;
                    f = ((float) c7674a.f23772S) * 0.01f;
                } else {
                    progressWheel = this.f22929h;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f22933l.setVisibility(8);
                break;
            case CANCEL:
            case ERROR:
                this.f22929h.setVisibility(8);
                this.f22933l.setVisibility(8);
                break;
            case FINISHED:
                this.f22929h.setVisibility(8);
                this.f22928g.setImageResource(R.drawable.ic_audio_play_white);
                this.f22933l.setVisibility(0);
                this.f22934m.setVisibility(8);
                break;
            default:
                break;
        }
        this.f22934m.setVisibility(8);
        m20557a(c7674a, c7674a.f21337w);
        m19051a((C7358a) c7674a, this.f22932k, true);
    }
}
