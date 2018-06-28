package mobi.mmdt.ott.view.conversation.p432e.p433a.p439f;

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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7630j;

public final class C7495j extends C7350b {
    private TextView f22409e = ((TextView) this.itemView.findViewById(R.id.file_size_textView));
    private ImageButton f22410f = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ImageView f22411g = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private ProgressWheel f22412h = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private SeekBar f22413i = ((SeekBar) this.itemView.findViewById(R.id.seekBar));
    private C3285f f22414j;
    private C3284e f22415k;
    private LinearLayout f22416l = ((LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));

    class C37531 implements OnClickListener {
        final /* synthetic */ C7495j f11079a;

        C37531(C7495j c7495j) {
            this.f11079a = c7495j;
        }

        public final void onClick(View view) {
            C7630j c7630j = (C7630j) this.f11079a.f16244a;
            switch (c7630j.f23485U) {
                case DELETED:
                case NOT_STARTED:
                    if (c7630j.f23486V == null || c7630j.f23486V.isEmpty()) {
                        this.f11079a.f22415k.mo2307a(c7630j.f23095W, false);
                        return;
                    } else {
                        this.f11079a.f22415k.mo2307a(c7630j.f23095W, true);
                        return;
                    }
                case TRANSMITTING:
                    this.f11079a.f22415k.mo2305a(c7630j.f23095W);
                    return;
                case CANCEL:
                    if (c7630j.f23486V == null || c7630j.f23486V.isEmpty()) {
                        this.f11079a.f22415k.mo2307a(c7630j.f23095W, false);
                        return;
                    } else {
                        this.f11079a.f22415k.mo2307a(c7630j.f23095W, true);
                        return;
                    }
                case ERROR:
                    if (c7630j.f23486V == null || c7630j.f23486V.isEmpty()) {
                        this.f11079a.f22415k.mo2307a(c7630j.f23095W, false);
                        return;
                    } else {
                        this.f11079a.f22415k.mo2307a(c7630j.f23095W, true);
                        return;
                    }
                case FINISHED:
                    if (c7630j.f23483S == C2986h.PLAYING.ordinal()) {
                        this.f11079a.f22414j.mo2347w();
                        return;
                    } else {
                        this.f11079a.f22414j.mo2306a(c7630j.f23095W, c7630j.f23482R);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    class C37542 implements OnSeekBarChangeListener {
        final /* synthetic */ C7495j f11080a;

        C37542(C7495j c7495j) {
            this.f11080a = c7495j;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            this.f11080a.f22414j.mo2301a(seekBar.getProgress());
        }
    }

    public C7495j(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3285f c3285f, C3284e c3284e, C3280a c3280a, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_ptt_channel_output_list_item, c3280a, c3286g, c3284e);
        this.f22414j = c3285f;
        this.f22415k = c3284e;
        this.f22410f.setOnClickListener(new C37531(this));
        this.f22413i.setOnSeekBarChangeListener(new C37542(this));
    }

    private void m20221a(C7630j c7630j, C2971k c2971k) {
        boolean z = ((c7630j.f23486V == null || c7630j.f23486V.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22410f, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        super.mo3180a(c6829g);
        C7630j c7630j = (C7630j) c6829g;
        int i = c7630j.f23483S;
        int i2 = c7630j.f23484T;
        int i3 = c7630j.f23480P;
        CharSequence a = C2491i.m6774a(this.c, (long) i3, true);
        this.f22413i.setMax(i3);
        this.f22413i.setProgress(0);
        if (!(i2 == 0 || i2 == -1)) {
            a = C2491i.m6774a(this.c, (long) i2, true);
            this.f22413i.setProgress(i2);
        }
        this.f22409e.setText(a);
        switch (c7630j.f21337w) {
            case ERROR:
                imageView = this.f22411g;
                i3 = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22411g;
                i3 = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22411g;
                i3 = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22411g;
                i3 = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i3);
        switch (c7630j.f23485U) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22412h.setVisibility(8);
                this.f22413i.setEnabled(false);
                m20221a(c7630j, c7630j.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22412h.setVisibility(0);
                this.f22410f.setImageResource(R.drawable.ic_file_stop_download);
                this.f22413i.setEnabled(false);
                if (c7630j.f23481Q > 0) {
                    progressWheel = this.f22412h;
                    f = ((float) c7630j.f23481Q) * 0.01f;
                } else {
                    progressWheel = this.f22412h;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f22412h.setVisibility(8);
                if (i != C2986h.PLAYING.ordinal()) {
                    if (i == C2986h.PAUSE.ordinal()) {
                        this.f22413i.setEnabled(true);
                    } else if (i == C2986h.STOP.ordinal()) {
                        this.f22413i.setEnabled(false);
                    }
                    this.f22410f.setImageResource(R.drawable.ic_ptt_play);
                    break;
                }
                this.f22413i.setEnabled(true);
                this.f22410f.setImageResource(R.drawable.ic_ptt_pause);
                break;
                break;
            default:
                break;
        }
        m19051a((C7358a) c7630j, this.f22416l, true);
    }
}
