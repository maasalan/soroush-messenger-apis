package mobi.mmdt.ott.view.conversation.p432e.p433a.p440g;

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
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p418a.C3288i;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7636c;
import mobi.mmdt.ott.view.tools.C4520n;

public final class C7501c extends C7351b {
    private TextView f22487d = ((TextView) this.itemView.findViewById(R.id.caption_textView));
    private TextView f22488e = ((TextView) this.itemView.findViewById(R.id.file_name_textView));
    private TextView f22489f = ((TextView) this.itemView.findViewById(R.id.file_size_textView));
    private ImageButton f22490g = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ProgressWheel f22491h = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private C3284e f22492i;
    private C3283d f22493j;
    private FrameLayout f22494k = ((FrameLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));
    private ImageView f22495l = ((ImageView) this.itemView.findViewById(R.id.actionDownloadChatFile));
    private TextView f22496m = ((TextView) this.itemView.findViewById(R.id.progress_text_action_view));

    class C37801 implements OnClickListener {
        final /* synthetic */ C7501c f11117a;

        C37801(C7501c c7501c) {
            this.f11117a = c7501c;
        }

        public final void onClick(View view) {
            this.f11117a.f22492i.mo2317b(((C7636c) this.f11117a.f16244a).f21300A);
        }
    }

    class C37812 implements OnClickListener {
        final /* synthetic */ C7501c f11118a;

        C37812(C7501c c7501c) {
            this.f11118a = c7501c;
        }

        public final void onClick(View view) {
            C7636c c7636c = (C7636c) this.f11118a.f16244a;
            switch (c7636c.f23521U) {
                case DELETED:
                case NOT_STARTED:
                    this.f11118a.f22492i.mo2307a(c7636c.f23101W, true);
                    return;
                case TRANSMITTING:
                    this.f11118a.f22492i.mo2305a(c7636c.f23101W);
                    return;
                case CANCEL:
                    this.f11118a.f22492i.mo2307a(c7636c.f23101W, true);
                    return;
                case ERROR:
                    this.f11118a.f22492i.mo2307a(c7636c.f23101W, true);
                    return;
                case FINISHED:
                    this.f11118a.f22493j.mo2329d(c7636c.f23519S, c7636c.f23517Q);
                    return;
                default:
                    return;
            }
        }
    }

    public C7501c(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3284e c3284e, C3288i c3288i, C3283d c3283d, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_file_social_input_list_item, c3288i, c3286g, c3284e);
        this.f22492i = c3284e;
        this.f22493j = c3283d;
        this.f22495l.setOnClickListener(new C37801(this));
        this.f22490g.setOnClickListener(new C37812(this));
        C2491i.m6802a(this.f22496m, UIThemeManager.getmInstance().getInput_content_and_caption_message_text_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7636c c7636c = (C7636c) c6829g;
        this.f22488e.setText(c7636c.f23517Q);
        this.f22489f.setText(c7636c.f23518R);
        if (c7636c.f23516P == null || c7636c.f23516P.isEmpty()) {
            this.f22487d.setVisibility(8);
        } else {
            this.f22487d.setText(c7636c.f23516P);
            this.f22487d.setVisibility(0);
            C4520n.m8234a(this.f22487d);
        }
        switch (c7636c.f23521U) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22491h.setVisibility(8);
                this.f22490g.setImageResource(R.drawable.ic_file_start_download);
                this.f22495l.setVisibility(8);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22491h.setVisibility(0);
                this.f22490g.setImageResource(R.drawable.ic_file_stop_download);
                this.f22496m.setVisibility(0);
                this.f22496m.setText(c7636c.aa);
                if (c7636c.f23520T > 0) {
                    progressWheel = this.f22491h;
                    f = ((float) c7636c.f23520T) * 0.01f;
                } else {
                    progressWheel = this.f22491h;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                this.f22495l.setVisibility(8);
                break;
            case FINISHED:
                this.f22491h.setVisibility(8);
                this.f22490g.setImageResource(R.drawable.ic_file_attach);
                this.f22495l.setVisibility(0);
                break;
            default:
                break;
        }
        this.f22496m.setVisibility(8);
        m19051a((C7358a) c7636c, this.f22494k, false);
    }
}
