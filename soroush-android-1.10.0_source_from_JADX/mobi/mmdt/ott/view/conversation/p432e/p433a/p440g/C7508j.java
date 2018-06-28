package mobi.mmdt.ott.view.conversation.p432e.p433a.p440g;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.provider.p386h.C2986h;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3285f;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p418a.C3288i;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7643j;

public final class C7508j extends C7351b {
    private TextView f22559d = ((TextView) this.itemView.findViewById(R.id.file_size_textView));
    private ImageButton f22560e = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ProgressWheel f22561f = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private SeekBar f22562g = ((SeekBar) this.itemView.findViewById(R.id.seekBar));
    private C3285f f22563h;
    private C3284e f22564i;
    private LinearLayout f22565j = ((LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));

    class C38071 implements OnClickListener {
        final /* synthetic */ C7508j f11175a;

        C38071(C7508j c7508j) {
            this.f11175a = c7508j;
        }

        public final void onClick(View view) {
            C7643j c7643j = (C7643j) this.f11175a.f16244a;
            switch (c7643j.f23559U) {
                case DELETED:
                case NOT_STARTED:
                    this.f11175a.f22564i.mo2307a(c7643j.f23101W, true);
                    return;
                case TRANSMITTING:
                    this.f11175a.f22564i.mo2305a(c7643j.f23101W);
                    return;
                case CANCEL:
                    this.f11175a.f22564i.mo2307a(c7643j.f23101W, true);
                    return;
                case ERROR:
                    this.f11175a.f22564i.mo2307a(c7643j.f23101W, true);
                    return;
                case FINISHED:
                    if (c7643j.f23557S == C2986h.PLAYING.ordinal()) {
                        this.f11175a.f22563h.mo2347w();
                        return;
                    } else {
                        this.f11175a.f22563h.mo2306a(c7643j.f23101W, c7643j.f23556R);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    class C38082 implements OnSeekBarChangeListener {
        final /* synthetic */ C7508j f11176a;

        C38082(C7508j c7508j) {
            this.f11176a = c7508j;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            this.f11176a.f22563h.mo2301a(seekBar.getProgress());
        }
    }

    public C7508j(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3285f c3285f, C3284e c3284e, C3288i c3288i, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_ptt_social_input_list_item, c3288i, c3286g, c3284e);
        this.f22563h = c3285f;
        this.f22564i = c3284e;
        this.c = activity;
        this.f22560e.setOnClickListener(new C38071(this));
        this.f22562g.setOnSeekBarChangeListener(new C38082(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7643j c7643j = (C7643j) c6829g;
        int i = c7643j.f23557S;
        int i2 = c7643j.f23558T;
        int i3 = c7643j.f23554P;
        CharSequence a = C2491i.m6774a(this.c, (long) i3, true);
        this.f22562g.setMax(i3);
        this.f22562g.setProgress(0);
        if (!(i2 == 0 || i2 == -1)) {
            a = C2491i.m6774a(this.c, (long) i2, true);
            this.f22562g.setProgress(i2);
        }
        this.f22559d.setText(a);
        switch (c7643j.f23559U) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22561f.setVisibility(8);
                this.f22560e.setImageResource(R.drawable.ic_file_start_download);
                this.f22562g.setEnabled(false);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22561f.setVisibility(0);
                this.f22560e.setImageResource(R.drawable.ic_file_stop_download);
                this.f22562g.setEnabled(false);
                if (c7643j.f23555Q > 0) {
                    progressWheel = this.f22561f;
                    f = ((float) c7643j.f23555Q) * 0.01f;
                } else {
                    progressWheel = this.f22561f;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f22561f.setVisibility(8);
                if (i != C2986h.PLAYING.ordinal()) {
                    if (i == C2986h.PAUSE.ordinal()) {
                        this.f22562g.setEnabled(true);
                    } else if (i == C2986h.STOP.ordinal()) {
                        this.f22562g.setEnabled(false);
                    }
                    this.f22560e.setImageResource(R.drawable.ic_ptt_play);
                    break;
                }
                this.f22562g.setEnabled(true);
                this.f22560e.setImageResource(R.drawable.ic_ptt_pause);
                break;
            default:
                break;
        }
        m19051a((C7358a) c7643j, this.f22565j, false);
    }
}
