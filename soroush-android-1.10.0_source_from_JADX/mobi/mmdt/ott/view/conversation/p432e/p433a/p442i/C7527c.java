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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7662c;
import mobi.mmdt.ott.view.tools.C4520n;

public final class C7527c extends C7353b {
    private TextView f22787d = ((TextView) this.itemView.findViewById(R.id.caption_textView));
    private TextView f22788e = ((TextView) this.itemView.findViewById(R.id.file_name_textView));
    private TextView f22789f = ((TextView) this.itemView.findViewById(R.id.file_size_textView));
    private ImageButton f22790g = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ProgressWheel f22791h = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private C3284e f22792i;
    private C3283d f22793j;
    private LinearLayout f22794k = ((LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));
    private ImageView f22795l = ((ImageView) this.itemView.findViewById(R.id.actionDownloadChatFile));
    private TextView f22796m = ((TextView) this.itemView.findViewById(R.id.progress_text_action_view));

    class C38831 implements OnClickListener {
        final /* synthetic */ C7527c f11302a;

        C38831(C7527c c7527c) {
            this.f11302a = c7527c;
        }

        public final void onClick(View view) {
            this.f11302a.f22792i.mo2317b(((C7662c) this.f11302a.f16244a).f21300A);
        }
    }

    class C38842 implements OnClickListener {
        final /* synthetic */ C7527c f11303a;

        C38842(C7527c c7527c) {
            this.f11303a = c7527c;
        }

        public final void onClick(View view) {
            C7662c c7662c = (C7662c) this.f11303a.f16244a;
            switch (c7662c.f23694U) {
                case DELETED:
                case NOT_STARTED:
                    this.f11303a.f22792i.mo2307a(c7662c.mo3604b(), true);
                    return;
                case TRANSMITTING:
                    this.f11303a.f22792i.mo2305a(c7662c.mo3604b());
                    return;
                case CANCEL:
                    this.f11303a.f22792i.mo2307a(c7662c.mo3604b(), true);
                    return;
                case ERROR:
                    this.f11303a.f22792i.mo2307a(c7662c.mo3604b(), true);
                    return;
                case FINISHED:
                    this.f11303a.f22793j.mo2329d(c7662c.f23692S, c7662c.f23690Q);
                    return;
                default:
                    return;
            }
        }
    }

    public C7527c(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3284e c3284e, C3283d c3283d, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_file_input_list_item, c3286g, c3284e);
        this.f22792i = c3284e;
        this.f22793j = c3283d;
        this.f22795l.setOnClickListener(new C38831(this));
        this.f22790g.setOnClickListener(new C38842(this));
        C2491i.m6802a(this.f22796m, UIThemeManager.getmInstance().getInput_content_and_caption_message_text_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7662c c7662c = (C7662c) c6829g;
        this.f22788e.setText(c7662c.f23690Q);
        this.f22789f.setText(c7662c.f23691R);
        if (c7662c.f23689P == null || c7662c.f23689P.isEmpty()) {
            this.f22787d.setVisibility(8);
        } else {
            this.f22787d.setText(c7662c.f23689P);
            this.f22787d.setVisibility(0);
            C4520n.m8234a(this.f22787d);
        }
        switch (c7662c.f23694U) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22791h.setVisibility(8);
                this.f22790g.setImageResource(R.drawable.ic_file_start_download);
                this.f22795l.setVisibility(8);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22791h.setVisibility(0);
                this.f22790g.setImageResource(R.drawable.ic_file_stop_download);
                this.f22796m.setVisibility(0);
                this.f22796m.setText(c7662c.f23695Y);
                if (c7662c.f23693T > 0) {
                    progressWheel = this.f22791h;
                    f = ((float) c7662c.f23693T) * 0.01f;
                } else {
                    progressWheel = this.f22791h;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f22795l.setVisibility(8);
                break;
            case FINISHED:
                this.f22791h.setVisibility(8);
                this.f22790g.setImageResource(R.drawable.ic_file_attach);
                this.f22795l.setVisibility(0);
                break;
            default:
                break;
        }
        this.f22796m.setVisibility(8);
        m19051a((C7358a) c7662c, this.f22794k, false);
    }
}
