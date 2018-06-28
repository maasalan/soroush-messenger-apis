package mobi.mmdt.ott.view.conversation.p432e.p433a.p435b;

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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7717i;

public final class C7443i extends C7346b {
    private TextView f21779e = ((TextView) this.itemView.findViewById(R.id.file_size_textView));
    private ImageButton f21780f = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ImageView f21781g = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private ProgressWheel f21782h = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private SeekBar f21783i = ((SeekBar) this.itemView.findViewById(R.id.seekBar));
    private C3285f f21784j;
    private C3284e f21785k;
    private LinearLayout f21786l = ((LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));

    class C35411 implements OnClickListener {
        final /* synthetic */ C7443i f10697a;

        C35411(C7443i c7443i) {
            this.f10697a = c7443i;
        }

        public final void onClick(View view) {
            C7717i c7717i = (C7717i) this.f10697a.f16244a;
            switch (c7717i.f24295U) {
                case DELETED:
                case NOT_STARTED:
                    if (c7717i.f24296V == null || c7717i.f24296V.isEmpty()) {
                        this.f10697a.f21785k.mo2307a(c7717i.ac, false);
                        return;
                    } else {
                        this.f10697a.f21785k.mo2307a(c7717i.ac, true);
                        return;
                    }
                case TRANSMITTING:
                    this.f10697a.f21785k.mo2305a(c7717i.ac);
                    return;
                case CANCEL:
                    if (c7717i.f24296V == null || c7717i.f24296V.isEmpty()) {
                        this.f10697a.f21785k.mo2307a(c7717i.ac, false);
                        return;
                    } else {
                        this.f10697a.f21785k.mo2307a(c7717i.ac, true);
                        return;
                    }
                case ERROR:
                    if (c7717i.f24296V != null && !c7717i.f24296V.isEmpty()) {
                        this.f10697a.f21785k.mo2307a(c7717i.ac, true);
                        break;
                    } else {
                        this.f10697a.f21785k.mo2307a(c7717i.ac, false);
                        break;
                    }
                    break;
                case FINISHED:
                    break;
                default:
                    return;
            }
            if (c7717i.f24293S == C2986h.PLAYING.ordinal()) {
                this.f10697a.f21784j.mo2347w();
            } else {
                this.f10697a.f21784j.mo2306a(c7717i.ac, c7717i.f24292R);
            }
        }
    }

    class C35422 implements OnSeekBarChangeListener {
        final /* synthetic */ C7443i f10698a;

        C35422(C7443i c7443i) {
            this.f10698a = c7443i;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            this.f10698a.f21784j.mo2301a(seekBar.getProgress());
        }
    }

    public C7443i(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3285f c3285f, C3284e c3284e, C3280a c3280a, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_ptt_channel_direct_output_list_item, c3280a, c3286g, c3284e);
        this.f21784j = c3285f;
        this.f21785k = c3284e;
        this.f21780f.setOnClickListener(new C35411(this));
        this.f21783i.setOnSeekBarChangeListener(new C35422(this));
    }

    private void m19869a(C7717i c7717i, C2971k c2971k) {
        boolean z = ((c7717i.f24296V == null || c7717i.f24296V.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f21780f, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        super.mo3180a(c6829g);
        C7717i c7717i = (C7717i) c6829g;
        int i = c7717i.f24293S;
        int i2 = c7717i.f24294T;
        int i3 = c7717i.f24290P;
        CharSequence a = C2491i.m6774a(this.c, (long) i3, true);
        this.f21783i.setMax(i3);
        this.f21783i.setProgress(0);
        if (!(i2 == 0 || i2 == -1)) {
            a = C2491i.m6774a(this.c, (long) i2, true);
            this.f21783i.setProgress(i2);
        }
        this.f21779e.setText(a);
        switch (c7717i.f21337w) {
            case ERROR:
                imageView = this.f21781g;
                i3 = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f21781g;
                i3 = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f21781g;
                i3 = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f21781g;
                i3 = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i3);
        switch (c7717i.f24295U) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f21782h.setVisibility(8);
                m19869a(c7717i, c7717i.f21337w);
                this.f21783i.setEnabled(false);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f21782h.setVisibility(0);
                this.f21780f.setImageResource(R.drawable.ic_file_stop_download);
                this.f21783i.setEnabled(false);
                if (c7717i.f24291Q > 0) {
                    progressWheel = this.f21782h;
                    f = ((float) c7717i.f24291Q) * 0.01f;
                } else {
                    progressWheel = this.f21782h;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f21782h.setVisibility(8);
                if (i != C2986h.PLAYING.ordinal()) {
                    if (i == C2986h.PAUSE.ordinal()) {
                        this.f21783i.setEnabled(true);
                    } else if (i == C2986h.STOP.ordinal()) {
                        this.f21783i.setEnabled(false);
                    }
                    this.f21780f.setImageResource(R.drawable.ic_ptt_play);
                    break;
                }
                this.f21783i.setEnabled(true);
                this.f21780f.setImageResource(R.drawable.ic_ptt_pause);
                break;
                break;
            default:
                break;
        }
        m19051a((C7358a) c7717i, this.f21786l, true);
    }
}
