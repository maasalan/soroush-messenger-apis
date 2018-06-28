package mobi.mmdt.ott.view.conversation.p432e.p433a.p439f;

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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7622a;

public final class C7487a extends C7350b {
    private TextView f22317e = ((TextView) this.itemView.findViewById(R.id.audio_name_textView));
    private TextView f22318f = ((TextView) this.itemView.findViewById(R.id.audio_size_textView));
    private ImageView f22319g = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private ImageButton f22320h = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ProgressWheel f22321i = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private C3284e f22322j;
    private C3283d f22323k;
    private LinearLayout f22324l = ((LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));
    private ImageView f22325m = ((ImageView) this.itemView.findViewById(R.id.actionDownloadChatFile));
    private TextView f22326n = ((TextView) this.itemView.findViewById(R.id.progress_text_action_view));

    class C37221 implements OnClickListener {
        final /* synthetic */ C7487a f11010a;

        C37221(C7487a c7487a) {
            this.f11010a = c7487a;
        }

        public final void onClick(View view) {
            C6829g c6829g = this.f11010a.f16244a;
            this.f11010a.f22322j;
        }
    }

    class C37232 implements OnClickListener {
        final /* synthetic */ C7487a f11011a;

        C37232(C7487a c7487a) {
            this.f11011a = c7487a;
        }

        public final void onClick(View view) {
            C7622a c7622a = (C7622a) this.f11011a.f16244a;
            switch (c7622a.f23433T) {
                case DELETED:
                case NOT_STARTED:
                    if (c7622a.f23434U == null || c7622a.f23434U.isEmpty()) {
                        this.f11011a.f22322j.mo2307a(c7622a.f23095W, false);
                        return;
                    } else {
                        this.f11011a.f22322j.mo2307a(c7622a.f23095W, true);
                        return;
                    }
                case TRANSMITTING:
                    this.f11011a.f22322j.mo2305a(c7622a.f23095W);
                    return;
                case CANCEL:
                    if (c7622a.f23434U == null || c7622a.f23434U.isEmpty()) {
                        this.f11011a.f22322j.mo2307a(c7622a.f23095W, false);
                        return;
                    } else {
                        this.f11011a.f22322j.mo2307a(c7622a.f23095W, true);
                        return;
                    }
                case ERROR:
                    if (c7622a.f23434U == null || c7622a.f23434U.isEmpty()) {
                        this.f11011a.f22322j.mo2307a(c7622a.f23095W, false);
                        return;
                    } else {
                        this.f11011a.f22322j.mo2307a(c7622a.f23095W, true);
                        return;
                    }
                case FINISHED:
                    this.f11011a.f22323k.mo2320b(c7622a.f23431R, c7622a.f23429P, "", "");
                    return;
                default:
                    return;
            }
        }
    }

    public C7487a(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3284e c3284e, C3283d c3283d, C3280a c3280a, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_audio_channel_output_list_item, c3280a, c3286g, c3284e);
        this.f22322j = c3284e;
        this.f22323k = c3283d;
        this.f22325m.setOnClickListener(new C37221(this));
        this.f22320h.setOnClickListener(new C37232(this));
        C2491i.m6802a(this.f22326n, UIThemeManager.getmInstance().getOutput_content_and_caption_message_text_color());
    }

    private void m20180a(C7622a c7622a, C2971k c2971k) {
        boolean z = ((c7622a.f23434U == null || c7622a.f23434U.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22320h, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7622a c7622a = (C7622a) c6829g;
        this.f22317e.setText(c7622a.f23429P);
        this.f22318f.setText(c7622a.f23430Q);
        switch (c7622a.f21337w) {
            case ERROR:
                imageView = this.f22319g;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22319g;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22319g;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22319g;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        switch (c7622a.f23433T) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22321i.setVisibility(8);
                this.f22326n.setVisibility(8);
                this.f22325m.setVisibility(8);
                m20180a(c7622a, c7622a.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22321i.setVisibility(0);
                this.f22320h.setImageResource(R.drawable.ic_file_stop_download);
                this.f22326n.setVisibility(0);
                this.f22326n.setText(c7622a.f23435V);
                if (c7622a.f23432S > 0) {
                    progressWheel = this.f22321i;
                    f = ((float) c7622a.f23432S) * 0.01f;
                } else {
                    progressWheel = this.f22321i;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f22325m.setVisibility(8);
                break;
            case FINISHED:
                this.f22321i.setVisibility(8);
                this.f22320h.setImageResource(R.drawable.ic_audio_play_white);
                this.f22325m.setVisibility(0);
                this.f22326n.setVisibility(8);
                break;
            default:
                break;
        }
        m19051a((C7358a) c7622a, this.f22324l, true);
    }
}
