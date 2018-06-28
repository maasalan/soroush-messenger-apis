package mobi.mmdt.ott.view.conversation.p432e.p433a.p438e;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p386h.C2986h;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3280a;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3285f;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7617j;

public final class C7482j extends C7349b {
    private TextView f22251e;
    private ImageButton f22252f;
    private ProgressWheel f22253g;
    private SeekBar f22254h;
    private C3285f f22255i;
    private C3284e f22256j;
    private View f22257k;

    class C37031 implements OnClickListener {
        final /* synthetic */ C7482j f10987a;

        C37031(C7482j c7482j) {
            this.f10987a = c7482j;
        }

        public final void onClick(View view) {
            C7617j c7617j = (C7617j) this.f10987a.f16244a;
            switch (c7617j.f23408U) {
                case DELETED:
                case NOT_STARTED:
                    this.f10987a.f22256j.mo2307a(c7617j.f23088W, true);
                    return;
                case TRANSMITTING:
                    this.f10987a.f22256j.mo2305a(c7617j.f23088W);
                    return;
                case CANCEL:
                    this.f10987a.f22256j.mo2307a(c7617j.f23088W, true);
                    return;
                case ERROR:
                    this.f10987a.f22256j.mo2307a(c7617j.f23088W, true);
                    return;
                case FINISHED:
                    if (c7617j.f23406S == C2986h.PLAYING.ordinal()) {
                        this.f10987a.f22255i.mo2347w();
                        return;
                    } else {
                        this.f10987a.f22255i.mo2306a(c7617j.f23088W, c7617j.f23405R);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    class C37042 implements OnSeekBarChangeListener {
        final /* synthetic */ C7482j f10988a;

        C37042(C7482j c7482j) {
            this.f10988a = c7482j;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            this.f10988a.f22255i.mo2301a(seekBar.getProgress());
        }
    }

    public C7482j(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3285f c3285f, C3284e c3284e, C3280a c3280a, C3286g c3286g) {
        C7349b c7349b = this;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_ptt_channel_input_list_item : R.layout.chat_ptt_channel_input_list_item_old, c3280a, c3286g, c3284e);
        c7349b.f22255i = c3285f;
        c7349b.f22256j = c3284e;
        c7349b.f22251e = (TextView) c7349b.itemView.findViewById(R.id.file_size_textView);
        c7349b.f22252f = (ImageButton) c7349b.itemView.findViewById(R.id.action_imageView);
        c7349b.f22253g = (ProgressWheel) c7349b.itemView.findViewById(R.id.progress_wheel);
        c7349b.f22254h = (SeekBar) c7349b.itemView.findViewById(R.id.seekBar);
        c7349b.f22257k = c7349b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7349b.f22252f.setOnClickListener(new C37031(c7349b));
        c7349b.f22254h.setOnSeekBarChangeListener(new C37042(c7349b));
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7617j c7617j = (C7617j) c6829g;
        int i = c7617j.f23406S;
        int i2 = c7617j.f23407T;
        int i3 = c7617j.f23403P;
        CharSequence a = C2491i.m6774a(this.c, (long) i3, true);
        this.f22254h.setMax(i3);
        this.f22254h.setProgress(0);
        if (!(i2 == 0 || i2 == -1)) {
            a = C2491i.m6774a(this.c, (long) i2, true);
            this.f22254h.setProgress(i2);
        }
        this.f22251e.setText(a);
        switch (c7617j.f23408U) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22253g.setVisibility(8);
                this.f22252f.setImageResource(R.drawable.ic_file_start_download);
                this.f22254h.setEnabled(false);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22253g.setVisibility(0);
                this.f22252f.setImageResource(R.drawable.ic_file_stop_download);
                this.f22254h.setEnabled(false);
                if (c7617j.f23404Q > 0) {
                    progressWheel = this.f22253g;
                    f = ((float) c7617j.f23404Q) * 0.01f;
                } else {
                    progressWheel = this.f22253g;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f22253g.setVisibility(8);
                if (i != C2986h.PLAYING.ordinal()) {
                    if (i == C2986h.PAUSE.ordinal()) {
                        this.f22254h.setEnabled(true);
                    } else if (i == C2986h.STOP.ordinal()) {
                        this.f22254h.setEnabled(false);
                    }
                    this.f22252f.setImageResource(R.drawable.ic_ptt_play);
                    break;
                }
                this.f22254h.setEnabled(true);
                this.f22252f.setImageResource(R.drawable.ic_ptt_pause);
                break;
            default:
                break;
        }
        m19051a((C7358a) c7617j, this.f22257k, false);
    }
}
