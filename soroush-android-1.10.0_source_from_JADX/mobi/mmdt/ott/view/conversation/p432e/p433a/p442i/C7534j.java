package mobi.mmdt.ott.view.conversation.p432e.p433a.p442i;

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
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7669j;

public final class C7534j extends C7353b {
    private TextView f22861d = ((TextView) this.itemView.findViewById(R.id.file_size_textView));
    private ImageButton f22862e = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ProgressWheel f22863f = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private LinearLayout f22864g = ((LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));
    private SeekBar f22865h = ((SeekBar) this.itemView.findViewById(R.id.seekBar));
    private C3285f f22866i;
    private C3284e f22867j;

    class C39101 implements OnClickListener {
        final /* synthetic */ C7534j f11360a;

        C39101(C7534j c7534j) {
            this.f11360a = c7534j;
        }

        public final void onClick(View view) {
            C7669j c7669j = (C7669j) this.f11360a.f16244a;
            switch (c7669j.f23742U) {
                case DELETED:
                case NOT_STARTED:
                    this.f11360a.f22867j.mo2307a(c7669j.mo3604b(), true);
                    return;
                case TRANSMITTING:
                    this.f11360a.f22867j.mo2305a(c7669j.mo3604b());
                    return;
                case CANCEL:
                    this.f11360a.f22867j.mo2307a(c7669j.mo3604b(), true);
                    return;
                case ERROR:
                    this.f11360a.f22867j.mo2307a(c7669j.mo3604b(), true);
                    return;
                case FINISHED:
                    if (c7669j.f23740S == C2986h.PLAYING.ordinal()) {
                        this.f11360a.f22866i.mo2347w();
                        return;
                    } else {
                        this.f11360a.f22866i.mo2306a(c7669j.mo3604b(), c7669j.f23739R);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    class C39112 implements OnSeekBarChangeListener {
        final /* synthetic */ C7534j f11361a;

        C39112(C7534j c7534j) {
            this.f11361a = c7534j;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            this.f11361a.f22866i.mo2301a(seekBar.getProgress());
        }
    }

    public C7534j(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3285f c3285f, C3284e c3284e, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_ptt_input_list_item, c3286g, c3284e);
        this.f22866i = c3285f;
        this.f22867j = c3284e;
        this.f22862e.setOnClickListener(new C39101(this));
        this.f22865h.setOnSeekBarChangeListener(new C39112(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7669j c7669j = (C7669j) c6829g;
        int i = c7669j.f23740S;
        int i2 = c7669j.f23741T;
        int i3 = c7669j.f23737P;
        CharSequence a = C2491i.m6774a(this.c, (long) i3, true);
        this.f22865h.setMax(i3);
        this.f22865h.setProgress(0);
        if (!(i2 == 0 || i2 == -1)) {
            a = C2491i.m6774a(this.c, (long) i2, true);
            this.f22865h.setProgress(i2);
        }
        this.f22861d.setText(a);
        switch (c7669j.f23742U) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22863f.setVisibility(8);
                this.f22862e.setImageResource(R.drawable.ic_file_start_download);
                this.f22865h.setEnabled(false);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22863f.setVisibility(0);
                this.f22862e.setImageResource(R.drawable.ic_file_stop_download);
                this.f22865h.setEnabled(false);
                if (c7669j.f23738Q > 0) {
                    progressWheel = this.f22863f;
                    f = ((float) c7669j.f23738Q) * 0.01f;
                } else {
                    progressWheel = this.f22863f;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f22863f.setVisibility(8);
                if (i != C2986h.PLAYING.ordinal()) {
                    if (i == C2986h.PAUSE.ordinal()) {
                        this.f22865h.setEnabled(true);
                    } else if (i == C2986h.STOP.ordinal()) {
                        this.f22865h.setEnabled(false);
                    }
                    this.f22862e.setImageResource(R.drawable.ic_ptt_play);
                    break;
                }
                this.f22865h.setEnabled(true);
                this.f22862e.setImageResource(R.drawable.ic_ptt_pause);
                break;
            default:
                break;
        }
        m19051a((C7358a) c7669j, this.f22864g, false);
    }
}
