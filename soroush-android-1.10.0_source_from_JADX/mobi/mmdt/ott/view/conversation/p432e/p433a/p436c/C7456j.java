package mobi.mmdt.ott.view.conversation.p432e.p433a.p436c;

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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7591j;

public final class C7456j extends C7347b {
    private TextView f21936e;
    private ImageButton f21937f;
    private ProgressWheel f21938g;
    private SeekBar f21939h;
    private C3285f f21940i;
    private C3284e f21941j;
    private View f21942k;

    class C35971 implements OnClickListener {
        final /* synthetic */ C7456j f10796a;

        C35971(C7456j c7456j) {
            this.f10796a = c7456j;
        }

        public final void onClick(View view) {
            C7591j c7591j = (C7591j) this.f10796a.f16244a;
            switch (c7591j.f23204U) {
                case DELETED:
                case NOT_STARTED:
                    this.f10796a.f21941j.mo2307a(c7591j.ac, true);
                    return;
                case TRANSMITTING:
                    this.f10796a.f21941j.mo2305a(c7591j.ac);
                    return;
                case CANCEL:
                    this.f10796a.f21941j.mo2307a(c7591j.ac, true);
                    return;
                case ERROR:
                    this.f10796a.f21941j.mo2307a(c7591j.ac, true);
                    return;
                case FINISHED:
                    if (c7591j.f23202S == C2986h.PLAYING.ordinal()) {
                        this.f10796a.f21940i.mo2347w();
                        return;
                    } else {
                        this.f10796a.f21940i.mo2306a(c7591j.ac, c7591j.f23201R);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    class C35982 implements OnSeekBarChangeListener {
        final /* synthetic */ C7456j f10797a;

        C35982(C7456j c7456j) {
            this.f10797a = c7456j;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            this.f10797a.f21940i.mo2301a(seekBar.getProgress());
        }
    }

    public C7456j(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3285f c3285f, C3284e c3284e, C3280a c3280a, C3286g c3286g) {
        C7347b c7347b = this;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_ptt_channel_input_list_item : R.layout.chat_ptt_channel_input_list_item_old, c3280a, c3286g, c3284e);
        c7347b.f21940i = c3285f;
        c7347b.f21941j = c3284e;
        c7347b.f21936e = (TextView) c7347b.itemView.findViewById(R.id.file_size_textView);
        c7347b.f21937f = (ImageButton) c7347b.itemView.findViewById(R.id.action_imageView);
        c7347b.f21938g = (ProgressWheel) c7347b.itemView.findViewById(R.id.progress_wheel);
        c7347b.f21939h = (SeekBar) c7347b.itemView.findViewById(R.id.seekBar);
        c7347b.f21942k = c7347b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7347b.f21937f.setOnClickListener(new C35971(c7347b));
        c7347b.f21939h.setOnSeekBarChangeListener(new C35982(c7347b));
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7591j c7591j = (C7591j) c6829g;
        int i = c7591j.f23202S;
        int i2 = c7591j.f23203T;
        int i3 = c7591j.f23199P;
        CharSequence a = C2491i.m6774a(this.c, (long) i3, true);
        this.f21939h.setMax(i3);
        this.f21939h.setProgress(0);
        if (!(i2 == 0 || i2 == -1)) {
            a = C2491i.m6774a(this.c, (long) i2, true);
            this.f21939h.setProgress(i2);
        }
        this.f21936e.setText(a);
        switch (c7591j.f23204U) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f21938g.setVisibility(8);
                this.f21937f.setImageResource(R.drawable.ic_file_start_download);
                this.f21939h.setEnabled(false);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f21938g.setVisibility(0);
                this.f21937f.setImageResource(R.drawable.ic_file_stop_download);
                this.f21939h.setEnabled(false);
                if (c7591j.f23200Q > 0) {
                    progressWheel = this.f21938g;
                    f = ((float) c7591j.f23200Q) * 0.01f;
                } else {
                    progressWheel = this.f21938g;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f21938g.setVisibility(8);
                if (i != C2986h.PLAYING.ordinal()) {
                    if (i == C2986h.PAUSE.ordinal()) {
                        this.f21939h.setEnabled(true);
                    } else if (i == C2986h.STOP.ordinal()) {
                        this.f21939h.setEnabled(false);
                    }
                    this.f21937f.setImageResource(R.drawable.ic_ptt_play);
                    break;
                }
                this.f21939h.setEnabled(true);
                this.f21937f.setImageResource(R.drawable.ic_ptt_pause);
                break;
            default:
                break;
        }
        m19051a((C7358a) c7591j, this.f21942k, false);
    }
}
