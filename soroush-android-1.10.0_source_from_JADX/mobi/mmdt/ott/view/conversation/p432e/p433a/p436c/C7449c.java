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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7584c;
import mobi.mmdt.ott.view.tools.C4520n;

public final class C7449c extends C7347b {
    private TextView f21857e;
    private TextView f21858f;
    private TextView f21859g;
    private ImageButton f21860h;
    private ProgressWheel f21861i;
    private C3284e f21862j;
    private C3283d f21863k;
    private FrameLayout f21864l;
    private ImageView f21865m;
    private TextView f21866n;

    class C35701 implements OnClickListener {
        final /* synthetic */ C7449c f10738a;

        C35701(C7449c c7449c) {
            this.f10738a = c7449c;
        }

        public final void onClick(View view) {
            this.f10738a.f21862j.mo2317b(((C7584c) this.f10738a.f16244a).f21300A);
        }
    }

    class C35712 implements OnClickListener {
        final /* synthetic */ C7449c f10739a;

        C35712(C7449c c7449c) {
            this.f10739a = c7449c;
        }

        public final void onClick(View view) {
            C7584c c7584c = (C7584c) this.f10739a.f16244a;
            switch (c7584c.f23152V) {
                case DELETED:
                case NOT_STARTED:
                    this.f10739a.f21862j.mo2307a(c7584c.ac, true);
                    return;
                case TRANSMITTING:
                    this.f10739a.f21862j.mo2305a(c7584c.ac);
                    return;
                case CANCEL:
                    this.f10739a.f21862j.mo2307a(c7584c.ac, true);
                    return;
                case ERROR:
                    this.f10739a.f21862j.mo2307a(c7584c.ac, true);
                    return;
                case FINISHED:
                    this.f10739a.f21863k.mo2329d(c7584c.f23150T, c7584c.f23148R);
                    return;
                default:
                    return;
            }
        }
    }

    public C7449c(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3284e c3284e, C3280a c3280a, C3283d c3283d, C3286g c3286g) {
        C7347b c7347b = this;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_file_channel_input_list_item : R.layout.chat_file_channel_input_list_item_old, c3280a, c3286g, c3284e);
        c7347b.f21862j = c3284e;
        c7347b.f21863k = c3283d;
        c7347b.f21858f = (TextView) c7347b.itemView.findViewById(R.id.file_name_textView);
        c7347b.f21857e = (TextView) c7347b.itemView.findViewById(R.id.caption_textView);
        c7347b.f21859g = (TextView) c7347b.itemView.findViewById(R.id.file_size_textView);
        c7347b.f21860h = (ImageButton) c7347b.itemView.findViewById(R.id.action_imageView);
        c7347b.f21861i = (ProgressWheel) c7347b.itemView.findViewById(R.id.progress_wheel);
        c7347b.f21864l = (FrameLayout) c7347b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7347b.f21865m = (ImageView) c7347b.itemView.findViewById(R.id.actionDownloadChatFile);
        c7347b.f21866n = (TextView) c7347b.itemView.findViewById(R.id.progress_text_action_view);
        c7347b.f21865m.setOnClickListener(new C35701(c7347b));
        c7347b.f21860h.setOnClickListener(new C35712(c7347b));
        C2491i.m6802a(c7347b.f21866n, UIThemeManager.getmInstance().getInput_content_and_caption_message_text_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7584c c7584c = (C7584c) c6829g;
        this.f21858f.setText(c7584c.f23148R);
        this.f21859g.setText(c7584c.f23149S);
        if (c7584c.f23147Q == null || c7584c.f23147Q.isEmpty()) {
            this.f21857e.setVisibility(8);
        } else {
            this.f21857e.setText(c7584c.f23147Q);
            this.f21857e.setVisibility(0);
            this.f21857e.setTextSize((float) c7584c.f23146P);
            C4520n.m8234a(this.f21857e);
        }
        switch (c7584c.f23152V) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f21861i.setVisibility(8);
                this.f21860h.setImageResource(R.drawable.ic_file_start_download);
                this.f21865m.setVisibility(8);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f21861i.setVisibility(0);
                this.f21860h.setImageResource(R.drawable.ic_file_stop_download);
                this.f21866n.setVisibility(0);
                this.f21866n.setText(c7584c.f23153W);
                if (c7584c.f23151U > 0) {
                    progressWheel = this.f21861i;
                    f = ((float) c7584c.f23151U) * 0.01f;
                } else {
                    progressWheel = this.f21861i;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f21865m.setVisibility(8);
                break;
            case FINISHED:
                this.f21861i.setVisibility(8);
                this.f21860h.setImageResource(R.drawable.ic_file_attach);
                this.f21865m.setVisibility(0);
                break;
            default:
                break;
        }
        this.f21866n.setVisibility(8);
        m19051a((C7358a) c7584c, this.f21864l, false);
    }
}
