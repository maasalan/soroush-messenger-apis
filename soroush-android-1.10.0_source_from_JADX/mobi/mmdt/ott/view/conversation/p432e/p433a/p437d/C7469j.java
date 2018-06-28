package mobi.mmdt.ott.view.conversation.p432e.p433a.p437d;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p386h.C2986h;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3280a;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3285f;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p432e.p433a.C7194a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7604j;

public final class C7469j extends C7348b {
    private TextView f22094e = ((TextView) this.itemView.findViewById(R.id.file_size_textView));
    private ImageButton f22095f = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ImageView f22096g = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private ProgressWheel f22097h = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private SeekBar f22098i = ((SeekBar) this.itemView.findViewById(R.id.seekBar));
    private C3285f f22099j;
    private C3284e f22100k;
    private LinearLayout f22101l = ((LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));

    class C36471 implements OnClickListener {
        final /* synthetic */ C7469j f10888a;

        C36471(C7469j c7469j) {
            this.f10888a = c7469j;
        }

        public final void onClick(View view) {
            C7604j c7604j = (C7604j) this.f10888a.f16244a;
            switch (c7604j.f23320U) {
                case DELETED:
                case NOT_STARTED:
                    if (c7604j.f23321V == null || c7604j.f23321V.isEmpty()) {
                        this.f10888a.f22100k.mo2307a(c7604j.ac, false);
                        return;
                    } else {
                        this.f10888a.f22100k.mo2307a(c7604j.ac, true);
                        return;
                    }
                case TRANSMITTING:
                    this.f10888a.f22100k.mo2305a(c7604j.ac);
                    return;
                case CANCEL:
                    if (c7604j.f23321V == null || c7604j.f23321V.isEmpty()) {
                        this.f10888a.f22100k.mo2307a(c7604j.ac, false);
                        return;
                    } else {
                        this.f10888a.f22100k.mo2307a(c7604j.ac, true);
                        return;
                    }
                case ERROR:
                    if (c7604j.f23321V == null || c7604j.f23321V.isEmpty()) {
                        this.f10888a.f22100k.mo2307a(c7604j.ac, false);
                        return;
                    } else {
                        this.f10888a.f22100k.mo2307a(c7604j.ac, true);
                        return;
                    }
                case FINISHED:
                    if (c7604j.f23318S == C2986h.PLAYING.ordinal()) {
                        this.f10888a.f22099j.mo2347w();
                        return;
                    } else {
                        this.f10888a.f22099j.mo2306a(c7604j.ac, c7604j.f23317R);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    class C36482 implements OnSeekBarChangeListener {
        final /* synthetic */ C7469j f10889a;

        C36482(C7469j c7469j) {
            this.f10889a = c7469j;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            this.f10889a.f22099j.mo2301a(seekBar.getProgress());
        }
    }

    public C7469j(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3285f c3285f, C3284e c3284e, C3280a c3280a, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_ptt_channel_output_list_item, c3280a, c3286g, c3284e);
        this.f22099j = c3285f;
        this.f22100k = c3284e;
        this.f22095f.setOnClickListener(new C36471(this));
        this.f22098i.setOnSeekBarChangeListener(new C36482(this));
    }

    private void m20044a(C7604j c7604j, C2971k c2971k) {
        boolean z = ((c7604j.f23321V == null || c7604j.f23321V.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22095f, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        super.mo3180a(c6829g);
        C7604j c7604j = (C7604j) c6829g;
        int i = c7604j.f23318S;
        int i2 = c7604j.f23319T;
        int i3 = c7604j.f23315P;
        CharSequence a = C2491i.m6774a(this.c, (long) i3, true);
        this.f22098i.setMax(i3);
        this.f22098i.setProgress(0);
        if (!(i2 == 0 || i2 == -1)) {
            a = C2491i.m6774a(this.c, (long) i2, true);
            this.f22098i.setProgress(i2);
        }
        this.f22094e.setText(a);
        switch (c7604j.f21337w) {
            case ERROR:
                imageView = this.f22096g;
                i3 = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22096g;
                i3 = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22096g;
                i3 = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22096g;
                i3 = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i3);
        switch (c7604j.f23320U) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22097h.setVisibility(8);
                this.f22098i.setEnabled(false);
                m20044a(c7604j, c7604j.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22097h.setVisibility(0);
                this.f22095f.setImageResource(R.drawable.ic_file_stop_download);
                this.f22098i.setEnabled(false);
                if (c7604j.f23316Q > 0) {
                    progressWheel = this.f22097h;
                    f = ((float) c7604j.f23316Q) * 0.01f;
                } else {
                    progressWheel = this.f22097h;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f22097h.setVisibility(8);
                if (i != C2986h.PLAYING.ordinal()) {
                    if (i == C2986h.PAUSE.ordinal()) {
                        this.f22098i.setEnabled(true);
                    } else if (i == C2986h.STOP.ordinal()) {
                        this.f22098i.setEnabled(false);
                    }
                    this.f22095f.setImageResource(R.drawable.ic_ptt_play);
                    break;
                }
                this.f22098i.setEnabled(true);
                this.f22095f.setImageResource(R.drawable.ic_ptt_pause);
                break;
                break;
            default:
                break;
        }
        m19051a((C7358a) c7604j, this.f22101l, true);
    }
}
