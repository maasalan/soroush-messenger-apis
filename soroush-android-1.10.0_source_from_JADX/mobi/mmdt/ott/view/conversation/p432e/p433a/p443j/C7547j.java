package mobi.mmdt.ott.view.conversation.p432e.p433a.p443j;

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
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3285f;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p432e.p433a.C7194a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7682j;

public final class C7547j extends C7354b {
    private TextView f23012d = ((TextView) this.itemView.findViewById(R.id.file_size_textView));
    private ImageButton f23013e = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ImageView f23014f = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private ProgressWheel f23015g = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private SeekBar f23016h = ((SeekBar) this.itemView.findViewById(R.id.seekBar));
    private C3285f f23017i;
    private C3284e f23018j;
    private LinearLayout f23019k = ((LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));

    class C39601 implements OnClickListener {
        final /* synthetic */ C7547j f11451a;

        C39601(C7547j c7547j) {
            this.f11451a = c7547j;
        }

        public final void onClick(View view) {
            C7682j c7682j = (C7682j) this.f11451a.f16244a;
            switch (c7682j.f23839U) {
                case DELETED:
                case NOT_STARTED:
                    if (c7682j.f23840V == null || c7682j.f23840V.isEmpty()) {
                        this.f11451a.f23018j.mo2307a(c7682j.mo3604b(), false);
                        return;
                    } else {
                        this.f11451a.f23018j.mo2307a(c7682j.mo3604b(), true);
                        return;
                    }
                case TRANSMITTING:
                    this.f11451a.f23018j.mo2305a(c7682j.mo3604b());
                    return;
                case CANCEL:
                    if (c7682j.f23840V == null || c7682j.f23840V.isEmpty()) {
                        this.f11451a.f23018j.mo2307a(c7682j.mo3604b(), false);
                        return;
                    } else {
                        this.f11451a.f23018j.mo2307a(c7682j.mo3604b(), true);
                        return;
                    }
                case ERROR:
                    if (c7682j.f23840V == null || c7682j.f23840V.isEmpty()) {
                        this.f11451a.f23018j.mo2307a(c7682j.mo3604b(), false);
                        return;
                    } else {
                        this.f11451a.f23018j.mo2307a(c7682j.mo3604b(), true);
                        return;
                    }
                case FINISHED:
                    if (c7682j.f23837S == C2986h.PLAYING.ordinal()) {
                        this.f11451a.f23017i.mo2347w();
                        return;
                    } else {
                        this.f11451a.f23017i.mo2306a(c7682j.mo3604b(), c7682j.f23836R);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    class C39612 implements OnSeekBarChangeListener {
        final /* synthetic */ C7547j f11452a;

        C39612(C7547j c7547j) {
            this.f11452a = c7547j;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            this.f11452a.f23017i.mo2301a(seekBar.getProgress());
        }
    }

    public C7547j(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3285f c3285f, C3284e c3284e, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_ptt_output_list_item, c3286g, c3284e);
        this.f23017i = c3285f;
        this.f23018j = c3284e;
        this.f23013e.setOnClickListener(new C39601(this));
        this.f23016h.setOnSeekBarChangeListener(new C39612(this));
    }

    private void m20602a(C7682j c7682j, C2971k c2971k) {
        boolean z = ((c7682j.f23840V == null || c7682j.f23840V.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f23013e, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        super.mo3180a(c6829g);
        C7682j c7682j = (C7682j) c6829g;
        int i = c7682j.f23837S;
        int i2 = c7682j.f23838T;
        int i3 = c7682j.f23834P;
        CharSequence a = C2491i.m6774a(this.c, (long) i3, true);
        this.f23016h.setMax(i3);
        this.f23016h.setProgress(0);
        if (!(i2 == 0 || i2 == -1)) {
            a = C2491i.m6774a(this.c, (long) i2, true);
            this.f23016h.setProgress(i2);
        }
        this.f23012d.setText(a);
        switch (c7682j.f21337w) {
            case ERROR:
                imageView = this.f23014f;
                i3 = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f23014f;
                i3 = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f23014f;
                i3 = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f23014f;
                i3 = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i3);
        switch (c7682j.f23839U) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f23015g.setVisibility(8);
                this.f23016h.setEnabled(false);
                m20602a(c7682j, c7682j.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f23015g.setVisibility(0);
                this.f23013e.setImageResource(R.drawable.ic_file_stop_download);
                this.f23016h.setEnabled(false);
                if (c7682j.f23835Q > 0) {
                    progressWheel = this.f23015g;
                    f = ((float) c7682j.f23835Q) * 0.01f;
                } else {
                    progressWheel = this.f23015g;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f23015g.setVisibility(8);
                if (i != C2986h.PLAYING.ordinal()) {
                    if (i == C2986h.PAUSE.ordinal()) {
                        this.f23016h.setEnabled(true);
                    } else if (i == C2986h.STOP.ordinal()) {
                        this.f23016h.setEnabled(false);
                    }
                    this.f23013e.setImageResource(R.drawable.ic_ptt_play);
                    break;
                }
                this.f23016h.setEnabled(true);
                this.f23013e.setImageResource(R.drawable.ic_ptt_pause);
                break;
                break;
            default:
                break;
        }
        m19051a((C7358a) c7682j, this.f23019k, true);
    }
}
