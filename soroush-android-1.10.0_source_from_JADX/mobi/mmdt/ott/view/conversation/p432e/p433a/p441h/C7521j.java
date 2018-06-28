package mobi.mmdt.ott.view.conversation.p432e.p433a.p441h;

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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7656j;

public final class C7521j extends C7352b {
    private TextView f22711d = ((TextView) this.itemView.findViewById(R.id.file_size_textView));
    private ImageButton f22712e = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ImageView f22713f = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private ProgressWheel f22714g = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private SeekBar f22715h = ((SeekBar) this.itemView.findViewById(R.id.seekBar));
    private C3285f f22716i;
    private C3284e f22717j;
    private LinearLayout f22718k = ((LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));

    class C38571 implements OnClickListener {
        final /* synthetic */ C7521j f11266a;

        C38571(C7521j c7521j) {
            this.f11266a = c7521j;
        }

        public final void onClick(View view) {
            C7656j c7656j = (C7656j) this.f11266a.f16244a;
            switch (c7656j.f23650U) {
                case DELETED:
                case NOT_STARTED:
                    if (c7656j.f23651V == null || c7656j.f23651V.isEmpty()) {
                        this.f11266a.f22717j.mo2307a(c7656j.mo3604b(), false);
                        return;
                    } else {
                        this.f11266a.f22717j.mo2307a(c7656j.mo3604b(), true);
                        return;
                    }
                case TRANSMITTING:
                    this.f11266a.f22717j.mo2305a(c7656j.mo3604b());
                    return;
                case CANCEL:
                    if (c7656j.f23651V == null || c7656j.f23651V.isEmpty()) {
                        this.f11266a.f22717j.mo2307a(c7656j.mo3604b(), false);
                        return;
                    } else {
                        this.f11266a.f22717j.mo2307a(c7656j.mo3604b(), true);
                        return;
                    }
                case ERROR:
                    if (c7656j.f23651V == null || c7656j.f23651V.isEmpty()) {
                        this.f11266a.f22717j.mo2307a(c7656j.mo3604b(), false);
                        return;
                    } else {
                        this.f11266a.f22717j.mo2307a(c7656j.mo3604b(), true);
                        return;
                    }
                case FINISHED:
                    if (c7656j.f23648S == C2986h.PLAYING.ordinal()) {
                        this.f11266a.f22716i.mo2347w();
                        return;
                    } else {
                        this.f11266a.f22716i.mo2306a(c7656j.mo3604b(), c7656j.f23647R);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    class C38582 implements OnSeekBarChangeListener {
        final /* synthetic */ C7521j f11267a;

        C38582(C7521j c7521j) {
            this.f11267a = c7521j;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            this.f11267a.f22716i.mo2301a(seekBar.getProgress());
        }
    }

    public C7521j(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3285f c3285f, C3284e c3284e, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_ptt_output_list_item, c3286g, c3284e);
        this.f22716i = c3285f;
        this.f22717j = c3284e;
        this.f22712e.setOnClickListener(new C38571(this));
        this.f22715h.setOnSeekBarChangeListener(new C38582(this));
    }

    private void m20408a(C7656j c7656j, C2971k c2971k) {
        boolean z = ((c7656j.f23651V == null || c7656j.f23651V.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22712e, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        super.mo3180a(c6829g);
        C7656j c7656j = (C7656j) c6829g;
        int i = c7656j.f23648S;
        int i2 = c7656j.f23649T;
        int i3 = c7656j.f23645P;
        CharSequence a = C2491i.m6774a(this.c, (long) i3, true);
        this.f22715h.setMax(i3);
        this.f22715h.setProgress(0);
        if (!(i2 == 0 || i2 == -1)) {
            a = C2491i.m6774a(this.c, (long) i2, true);
            this.f22715h.setProgress(i2);
        }
        this.f22711d.setText(a);
        switch (c7656j.f21337w) {
            case ERROR:
                imageView = this.f22713f;
                i3 = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22713f;
                i3 = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22713f;
                i3 = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22713f;
                i3 = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i3);
        switch (c7656j.f23650U) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22714g.setVisibility(8);
                this.f22715h.setEnabled(false);
                m20408a(c7656j, c7656j.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22714g.setVisibility(0);
                this.f22712e.setImageResource(R.drawable.ic_file_stop_download);
                this.f22715h.setEnabled(false);
                if (c7656j.f23646Q > 0) {
                    progressWheel = this.f22714g;
                    f = ((float) c7656j.f23646Q) * 0.01f;
                } else {
                    progressWheel = this.f22714g;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f22714g.setVisibility(8);
                if (i != C2986h.PLAYING.ordinal()) {
                    if (i == C2986h.PAUSE.ordinal()) {
                        this.f22715h.setEnabled(true);
                    } else if (i == C2986h.STOP.ordinal()) {
                        this.f22715h.setEnabled(false);
                    }
                    this.f22712e.setImageResource(R.drawable.ic_ptt_play);
                    break;
                }
                this.f22715h.setEnabled(true);
                this.f22712e.setImageResource(R.drawable.ic_ptt_pause);
                break;
                break;
            default:
                break;
        }
        m19051a((C7358a) c7656j, this.f22718k, true);
    }
}
