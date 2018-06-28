package mobi.mmdt.ott.view.conversation.p432e.p433a.p434a;

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
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3285f;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p418a.C3288i;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7705i;

public final class C7431i extends C7345b {
    private TextView f21629d;
    private ImageButton f21630e;
    private ProgressWheel f21631f;
    private SeekBar f21632g;
    private C3285f f21633h;
    private C3284e f21634i;
    private View f21635j;

    class C35021 implements OnClickListener {
        final /* synthetic */ C7431i f10648a;

        C35021(C7431i c7431i) {
            this.f10648a = c7431i;
        }

        public final void onClick(View view) {
            C7705i c7705i = (C7705i) this.f10648a.f16244a;
            switch (c7705i.f24181U) {
                case DELETED:
                case NOT_STARTED:
                    this.f10648a.f21634i.mo2307a(c7705i.ac, true);
                    return;
                case TRANSMITTING:
                    this.f10648a.f21634i.mo2305a(c7705i.ac);
                    return;
                case CANCEL:
                    this.f10648a.f21634i.mo2307a(c7705i.ac, true);
                    return;
                case ERROR:
                    this.f10648a.f21634i.mo2307a(c7705i.ac, true);
                    return;
                case FINISHED:
                    if (c7705i.f24179S == C2986h.PLAYING.ordinal()) {
                        this.f10648a.f21633h.mo2347w();
                        return;
                    } else {
                        this.f10648a.f21633h.mo2306a(c7705i.ac, c7705i.f24178R);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    class C35032 implements OnSeekBarChangeListener {
        final /* synthetic */ C7431i f10649a;

        C35032(C7431i c7431i) {
            this.f10649a = c7431i;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            this.f10649a.f21633h.mo2301a(seekBar.getProgress());
        }
    }

    public C7431i(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3285f c3285f, C3284e c3284e, C3288i c3288i, C3286g c3286g) {
        C7345b c7345b = this;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_ptt_channel_direct_input_list_item : R.layout.chat_ptt_channel_direct_input_list_item_old, c3288i, c3286g, c3284e);
        c7345b.f21633h = c3285f;
        c7345b.f21634i = c3284e;
        c7345b.c = activity;
        c7345b.f21629d = (TextView) c7345b.itemView.findViewById(R.id.file_size_textView);
        c7345b.f21630e = (ImageButton) c7345b.itemView.findViewById(R.id.action_imageView);
        c7345b.f21631f = (ProgressWheel) c7345b.itemView.findViewById(R.id.progress_wheel);
        c7345b.f21632g = (SeekBar) c7345b.itemView.findViewById(R.id.seekBar);
        c7345b.f21635j = c7345b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7345b.f21630e.setOnClickListener(new C35021(c7345b));
        c7345b.f21632g.setOnSeekBarChangeListener(new C35032(c7345b));
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7705i c7705i = (C7705i) c6829g;
        int i = c7705i.f24179S;
        int i2 = c7705i.f24180T;
        int i3 = c7705i.f24176P;
        CharSequence a = C2491i.m6774a(this.c, (long) i3, true);
        this.f21632g.setMax(i3);
        this.f21632g.setProgress(0);
        if (!(i2 == 0 || i2 == -1)) {
            a = C2491i.m6774a(this.c, (long) i2, true);
            this.f21632g.setProgress(i2);
        }
        this.f21629d.setText(a);
        switch (c7705i.f24181U) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f21631f.setVisibility(8);
                this.f21630e.setImageResource(R.drawable.ic_file_start_download);
                this.f21632g.setEnabled(false);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f21631f.setVisibility(0);
                this.f21630e.setImageResource(R.drawable.ic_file_stop_download);
                this.f21632g.setEnabled(false);
                if (c7705i.f24177Q > 0) {
                    progressWheel = this.f21631f;
                    f = ((float) c7705i.f24177Q) * 0.01f;
                } else {
                    progressWheel = this.f21631f;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f21631f.setVisibility(8);
                if (i != C2986h.PLAYING.ordinal()) {
                    if (i == C2986h.PAUSE.ordinal()) {
                        this.f21632g.setEnabled(true);
                    } else if (i == C2986h.STOP.ordinal()) {
                        this.f21632g.setEnabled(false);
                    }
                    this.f21630e.setImageResource(R.drawable.ic_ptt_play);
                    break;
                }
                this.f21632g.setEnabled(true);
                this.f21630e.setImageResource(R.drawable.ic_ptt_pause);
                break;
            default:
                break;
        }
        m19051a((C7358a) c7705i, this.f21635j, false);
    }
}
