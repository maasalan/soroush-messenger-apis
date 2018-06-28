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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7610c;
import mobi.mmdt.ott.view.tools.C4520n;

public final class C7475c extends C7349b {
    private TextView f22172e;
    private TextView f22173f;
    private TextView f22174g;
    private ImageButton f22175h;
    private ProgressWheel f22176i;
    private C3284e f22177j;
    private C3283d f22178k;
    private FrameLayout f22179l;
    private ImageView f22180m;
    private TextView f22181n;

    class C36761 implements OnClickListener {
        final /* synthetic */ C7475c f10929a;

        C36761(C7475c c7475c) {
            this.f10929a = c7475c;
        }

        public final void onClick(View view) {
            this.f10929a.f22177j.mo2317b(((C7610c) this.f10929a.f16244a).f21300A);
        }
    }

    class C36772 implements OnClickListener {
        final /* synthetic */ C7475c f10930a;

        C36772(C7475c c7475c) {
            this.f10930a = c7475c;
        }

        public final void onClick(View view) {
            C7610c c7610c = (C7610c) this.f10930a.f16244a;
            switch (c7610c.ac) {
                case DELETED:
                case NOT_STARTED:
                    this.f10930a.f22177j.mo2307a(c7610c.f23088W, true);
                    return;
                case TRANSMITTING:
                    this.f10930a.f22177j.mo2305a(c7610c.f23088W);
                    return;
                case CANCEL:
                    this.f10930a.f22177j.mo2307a(c7610c.f23088W, true);
                    return;
                case ERROR:
                    this.f10930a.f22177j.mo2307a(c7610c.f23088W, true);
                    return;
                case FINISHED:
                    this.f10930a.f22178k.mo2329d(c7610c.f23369T, c7610c.f23367R);
                    return;
                default:
                    return;
            }
        }
    }

    public C7475c(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3284e c3284e, C3280a c3280a, C3283d c3283d, C3286g c3286g) {
        C7349b c7349b = this;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_file_channel_input_list_item : R.layout.chat_file_channel_input_list_item_old, c3280a, c3286g, c3284e);
        c7349b.f22177j = c3284e;
        c7349b.f22178k = c3283d;
        c7349b.f22173f = (TextView) c7349b.itemView.findViewById(R.id.file_name_textView);
        c7349b.f22174g = (TextView) c7349b.itemView.findViewById(R.id.file_size_textView);
        c7349b.f22172e = (TextView) c7349b.itemView.findViewById(R.id.caption_textView);
        c7349b.f22175h = (ImageButton) c7349b.itemView.findViewById(R.id.action_imageView);
        c7349b.f22176i = (ProgressWheel) c7349b.itemView.findViewById(R.id.progress_wheel);
        c7349b.f22179l = (FrameLayout) c7349b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7349b.f22180m = (ImageView) c7349b.itemView.findViewById(R.id.actionDownloadChatFile);
        c7349b.f22181n = (TextView) c7349b.itemView.findViewById(R.id.progress_text_action_view);
        c7349b.f22180m.setOnClickListener(new C36761(c7349b));
        c7349b.f22175h.setOnClickListener(new C36772(c7349b));
        C2491i.m6802a(c7349b.f22181n, UIThemeManager.getmInstance().getInput_content_and_caption_message_text_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7610c c7610c = (C7610c) c6829g;
        this.f22173f.setText(c7610c.f23367R);
        this.f22174g.setText(c7610c.f23368S);
        if (c7610c.f23366Q == null || c7610c.f23366Q.isEmpty()) {
            this.f22172e.setVisibility(8);
        } else {
            this.f22172e.setText(c7610c.f23366Q);
            this.f22172e.setVisibility(0);
            this.f22172e.setTextSize((float) c7610c.f23365P);
            C4520n.m8234a(this.f22172e);
        }
        switch (c7610c.ac) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22176i.setVisibility(8);
                this.f22175h.setImageResource(R.drawable.ic_file_start_download);
                this.f22180m.setVisibility(8);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22176i.setVisibility(0);
                this.f22175h.setImageResource(R.drawable.ic_file_stop_download);
                this.f22181n.setVisibility(0);
                this.f22181n.setText(c7610c.ad);
                if (c7610c.f23370U > 0) {
                    progressWheel = this.f22176i;
                    f = ((float) c7610c.f23370U) * 0.01f;
                } else {
                    progressWheel = this.f22176i;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f22180m.setVisibility(8);
                break;
            case FINISHED:
                this.f22176i.setVisibility(8);
                this.f22175h.setImageResource(R.drawable.ic_file_attach);
                this.f22180m.setVisibility(0);
                break;
            default:
                break;
        }
        this.f22181n.setVisibility(8);
        m19051a((C7358a) c7610c, this.f22179l, false);
    }
}
