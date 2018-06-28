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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7699c;
import mobi.mmdt.ott.view.tools.C4520n;

public final class C7425c extends C7345b {
    private TextView f21558d;
    private TextView f21559e;
    private TextView f21560f;
    private ImageButton f21561g;
    private ProgressWheel f21562h;
    private C3284e f21563i;
    private C3283d f21564j;
    private FrameLayout f21565k;
    private ImageView f21566l;
    private TextView f21567m;

    class C34861 implements OnClickListener {
        final /* synthetic */ C7425c f10632a;

        C34861(C7425c c7425c) {
            this.f10632a = c7425c;
        }

        public final void onClick(View view) {
            this.f10632a.f21563i.mo2317b(((C7699c) this.f10632a.f16244a).f21300A);
        }
    }

    class C34872 implements OnClickListener {
        final /* synthetic */ C7425c f10633a;

        C34872(C7425c c7425c) {
            this.f10633a = c7425c;
        }

        public final void onClick(View view) {
            C7699c c7699c = (C7699c) this.f10633a.f16244a;
            switch (c7699c.f24131V) {
                case DELETED:
                case NOT_STARTED:
                    this.f10633a.f21563i.mo2307a(c7699c.ac, true);
                    return;
                case TRANSMITTING:
                    this.f10633a.f21563i.mo2305a(c7699c.ac);
                    return;
                case CANCEL:
                    this.f10633a.f21563i.mo2307a(c7699c.ac, true);
                    return;
                case ERROR:
                    this.f10633a.f21563i.mo2307a(c7699c.ac, true);
                    return;
                case FINISHED:
                    this.f10633a.f21564j.mo2329d(c7699c.f24129T, c7699c.f24127R);
                    return;
                default:
                    return;
            }
        }
    }

    public C7425c(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3284e c3284e, C3288i c3288i, C3283d c3283d, C3286g c3286g) {
        C7345b c7345b = this;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_file_channel_direct_input_list_item : R.layout.chat_file_channel_direct_input_list_item_old, c3288i, c3286g, c3284e);
        c7345b.f21563i = c3284e;
        c7345b.f21564j = c3283d;
        c7345b.f21559e = (TextView) c7345b.itemView.findViewById(R.id.file_name_textView);
        c7345b.f21558d = (TextView) c7345b.itemView.findViewById(R.id.caption_textView);
        c7345b.f21560f = (TextView) c7345b.itemView.findViewById(R.id.file_size_textView);
        c7345b.f21561g = (ImageButton) c7345b.itemView.findViewById(R.id.action_imageView);
        c7345b.f21562h = (ProgressWheel) c7345b.itemView.findViewById(R.id.progress_wheel);
        c7345b.f21565k = (FrameLayout) c7345b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7345b.f21566l = (ImageView) c7345b.itemView.findViewById(R.id.actionDownloadChatFile);
        c7345b.f21567m = (TextView) c7345b.itemView.findViewById(R.id.progress_text_action_view);
        c7345b.f21566l.setOnClickListener(new C34861(c7345b));
        c7345b.f21561g.setOnClickListener(new C34872(c7345b));
        C2491i.m6802a(c7345b.f21567m, UIThemeManager.getmInstance().getInput_content_and_caption_message_text_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7699c c7699c = (C7699c) c6829g;
        this.f21559e.setText(c7699c.f24127R);
        this.f21560f.setText(c7699c.f24128S);
        if (c7699c.f24126Q == null || c7699c.f24126Q.isEmpty()) {
            this.f21558d.setVisibility(8);
        } else {
            this.f21558d.setText(c7699c.f24126Q);
            this.f21558d.setVisibility(0);
            this.f21558d.setTextSize((float) c7699c.f24125P);
            C4520n.m8234a(this.f21558d);
        }
        switch (c7699c.f24131V) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f21562h.setVisibility(8);
                this.f21561g.setImageResource(R.drawable.ic_file_start_download);
                this.f21566l.setVisibility(8);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f21562h.setVisibility(0);
                this.f21561g.setImageResource(R.drawable.ic_file_stop_download);
                this.f21567m.setVisibility(0);
                this.f21567m.setText(c7699c.f24132W);
                if (c7699c.f24130U > 0) {
                    progressWheel = this.f21562h;
                    f = ((float) c7699c.f24130U) * 0.01f;
                } else {
                    progressWheel = this.f21562h;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f21566l.setVisibility(8);
                break;
            case FINISHED:
                this.f21562h.setVisibility(8);
                this.f21561g.setImageResource(R.drawable.ic_file_attach);
                this.f21566l.setVisibility(0);
                break;
            default:
                break;
        }
        this.f21567m.setVisibility(8);
        m19051a((C7358a) c7699c, this.f21565k, false);
    }
}
