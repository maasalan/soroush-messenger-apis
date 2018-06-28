package mobi.mmdt.ott.view.conversation.sharedmediaviewer.p449a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.sharedmediaviewer.p575b.C7205a;

public class C6914a extends C6073e {
    private TextView f19704b = ((TextView) this.itemView.findViewById(R.id.progress_text_action_view));
    private ImageButton f19705c = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ProgressWheel f19706d = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private C3284e f19707e;

    class C40901 implements OnClickListener {
        final /* synthetic */ C6914a f11692a;

        C40901(C6914a c6914a) {
            this.f11692a = c6914a;
        }

        public final void onClick(View view) {
            C7205a c7205a = (C7205a) this.f11692a.f16244a;
            switch (c7205a.f20806d) {
                case DELETED:
                case NOT_STARTED:
                    this.f11692a.f19707e.mo2307a(c7205a.f20803a, true);
                    return;
                case TRANSMITTING:
                    this.f11692a.f19707e.mo2305a(c7205a.f20803a);
                    return;
                case CANCEL:
                    this.f11692a.f19707e.mo2307a(c7205a.f20803a, true);
                    return;
                case ERROR:
                    this.f11692a.f19707e.mo2307a(c7205a.f20803a, true);
                    return;
                default:
                    return;
            }
        }
    }

    public C6914a(C3126i c3126i, C3284e c3284e, int i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater, viewGroup, i, c3126i);
        this.f19707e = c3284e;
        this.f19705c.setOnClickListener(new C40901(this));
    }

    protected void mo3180a(C6829g c6829g) {
        C7205a c7205a = (C7205a) c6829g;
        switch (c7205a.f20806d) {
            case DELETED:
            case NOT_STARTED:
                this.f19706d.setVisibility(8);
                this.f19705c.setVisibility(0);
                this.f19705c.setImageResource(R.drawable.ic_file_start_download);
                this.f19705c.setClickable(true);
                this.f19704b.setVisibility(8);
                return;
            case TRANSMITTING:
                this.f19706d.setVisibility(0);
                this.f19705c.setVisibility(0);
                this.f19705c.setImageResource(R.drawable.ic_file_stop_download);
                this.f19705c.setClickable(true);
                this.f19704b.setVisibility(0);
                this.f19704b.setText(c7205a.f20805c);
                if (c7205a.f20804b > 0) {
                    this.f19706d.setProgress(((float) c7205a.f20804b) * 0.01f);
                    return;
                } else {
                    this.f19706d.setProgress(0.0f);
                    return;
                }
            case CANCEL:
                this.f19706d.setVisibility(8);
                this.f19705c.setVisibility(0);
                this.f19705c.setClickable(true);
                this.f19705c.setImageResource(R.drawable.ic_file_start_download);
                this.f19704b.setVisibility(8);
                return;
            case ERROR:
                this.f19706d.setVisibility(8);
                this.f19705c.setVisibility(0);
                this.f19705c.setClickable(true);
                this.f19705c.setImageResource(R.drawable.ic_file_start_download);
                this.f19704b.setVisibility(8);
                return;
            case FINISHED:
                this.f19706d.setVisibility(8);
                this.f19704b.setVisibility(8);
                switch (c7205a.f19503j) {
                    case 1:
                        this.f19705c.setVisibility(8);
                        return;
                    case 2:
                        this.f19705c.setImageResource(R.drawable.ic_play_arrow_white_24dp);
                        this.f19705c.setBackgroundResource(R.drawable.ic_circle_big);
                        this.f19705c.setClickable(false);
                        this.f19705c.setVisibility(0);
                        return;
                    case 3:
                        this.f19705c.setImageResource(R.drawable.ic_gif_white_32dp);
                        this.f19705c.setBackgroundResource(R.drawable.ic_circle_big);
                        this.f19705c.setClickable(false);
                        this.f19705c.setVisibility(0);
                        return;
                    default:
                        return;
                }
            default:
                return;
        }
    }
}
