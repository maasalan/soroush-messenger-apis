package mobi.mmdt.ott.view.conversation.p432e.p433a;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.NinePatchDrawable;
import android.support.v4.p029a.C0346c;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6700i;
import mobi.mmdt.ott.logic.p261a.p326w.p327a.C6786d;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p384f.C2972l;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p432e.C6908a;
import mobi.mmdt.ott.view.conversation.p432e.p433a.C7194a;
import mobi.mmdt.ott.view.conversation.p432e.p433a.C7194a.C34796;
import mobi.mmdt.ott.view.conversation.p573f.C7197a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4522p;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public abstract class C7194a extends C6908a {
    private TextView f20721A;
    private TextView f20722B;
    private TextView f20723C;
    private ImageView f20724D;
    private ViewStub f20725E = ((ViewStub) this.itemView.findViewById(R.id.reply_viewStub));
    private TextView f20726F = ((TextView) this.itemView.findViewById(R.id.time_textView));
    private TextView f20727G;
    private TextView f20728H;
    private ImageView f20729I;
    private LinearLayout f20730J;
    private C3286g f20731K;
    private TextView f20732L;
    private TextView f20733M;
    private TextView f20734N;
    private TextView f20735O;
    private TextView f20736P;
    private TextView f20737Q;
    private TextView f20738R;
    private Button f20739S;
    private Button f20740T;
    private Button f20741U;
    private ImageView f20742V;
    private TextView f20743W;
    private TextView f20744X;
    private ImageView f20745Y;
    private TextView f20746Z;
    private TextView aa;
    private TextView ab;
    private String ac;
    private String ad;
    private ImageView ae;
    private ImageView af;
    private View ag;
    protected Activity f20747c;
    private final View f20748d;
    private final ImageView f20749e;
    private final View f20750f;
    private ImageView f20751g;
    private LinearLayout f20752h;
    private ImageView f20753i;
    private ImageButton f20754j;
    private boolean f20755k;
    private View f20756l;
    private FrameLayout f20757m;
    private int f20758n;
    private int f20759o;
    private View f20760p;
    private ImageView f20761q;
    private ImageView f20762r;
    private ImageView f20763s;
    private ImageView f20764t;
    private C3284e f20765u;
    private View f20766v;
    private ImageView f20767w;
    private ViewStub f20768x;
    private ImageButton f20769y;
    private ProgressWheel f20770z;

    class C34741 implements OnClickListener {
        final /* synthetic */ C7194a f10613a;

        C34741(C7194a c7194a) {
            this.f10613a = c7194a;
        }

        public final void onClick(View view) {
            C2972l g = C3337b.m7821g(this.f10613a.f16244a.f19503j);
            if (g != null) {
                if (C34796.f10622a[g.ordinal()] != 1) {
                    this.f10613a.f20765u.mo2333e((C7197a) this.f10613a.f16244a);
                    return;
                }
                this.f10613a.f20765u.mo2338h((C7197a) this.f10613a.f16244a);
            }
        }
    }

    class C34763 implements OnClickListener {
        final /* synthetic */ C7194a f10617a;

        C34763(C7194a c7194a) {
            this.f10617a = c7194a;
        }

        public final void onClick(View view) {
            if (this.f10617a.f20732L.getSelectionStart() == -1 && this.f10617a.f20732L.getSelectionEnd() == -1 && C7194a.m19037a(((C7197a) this.f10617a.f16244a).f20783i)) {
                this.f10617a.f20765u.mo2333e((C7197a) this.f10617a.f16244a);
            }
        }
    }

    class C34774 implements OnClickListener {
        final /* synthetic */ C7194a f10618a;

        C34774(C7194a c7194a) {
            this.f10618a = c7194a;
        }

        public final void onClick(View view) {
            if (this.f10618a.f20733M.getSelectionStart() == -1 && this.f10618a.f20733M.getSelectionEnd() == -1 && C7194a.m19037a(((C7197a) this.f10618a.f16244a).f20783i)) {
                this.f10618a.f20765u.mo2333e((C7197a) this.f10618a.f16244a);
            }
        }
    }

    class C34807 implements OnClickListener {
        final /* synthetic */ C7194a f10626a;

        C34807(C7194a c7194a) {
            this.f10626a = c7194a;
        }

        public final void onClick(View view) {
            this.f10626a.f20765u.mo2335f((C7197a) this.f10626a.f16244a);
        }
    }

    class C34818 implements OnClickListener {
        final /* synthetic */ C7194a f10627a;

        C34818(C7194a c7194a) {
            this.f10627a = c7194a;
        }

        public final void onClick(View view) {
            this.f10627a.f20765u.mo2339i((C7197a) this.f10627a.f16244a);
        }
    }

    class C34829 implements OnClickListener {
        final /* synthetic */ C7194a f10628a;

        C34829(C7194a c7194a) {
            this.f10628a = c7194a;
        }

        public final void onClick(View view) {
            this.f10628a.f20765u.mo2337g((C7197a) this.f10628a.f16244a);
        }
    }

    public C7194a(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, C3286g c3286g, C3284e c3284e, boolean z) {
        super(layoutInflater, viewGroup, i);
        this.f20747c = activity;
        this.f20755k = z;
        this.f20765u = c3284e;
        this.f20725E.inflate();
        this.f20760p = this.itemView.findViewById(R.id.left_line_vertical_view);
        this.f20727G = (TextView) this.itemView.findViewById(R.id.reply_top_textView);
        this.f20728H = (TextView) this.itemView.findViewById(R.id.reply_bottom_textView);
        this.f20729I = (ImageView) this.itemView.findViewById(R.id.reply_imageView);
        this.f20754j = (ImageButton) this.itemView.findViewById(R.id.action_image_option);
        this.f20753i = (ImageView) this.itemView.findViewById(R.id.forward_imageView);
        this.f20751g = (ImageView) this.itemView.findViewById(R.id.save_to_my_cloud_imageView);
        this.f20749e = (ImageView) this.itemView.findViewById(R.id.channel_bottom_reply_imageView);
        this.f20752h = (LinearLayout) this.itemView.findViewById(R.id.root_save_to_my_cloud);
        this.f20770z = (ProgressWheel) this.itemView.findViewById(R.id.progress_wheel);
        this.f20748d = this.itemView.findViewById(R.id.top_root_chat_item_layout);
        this.f20750f = this.itemView.findViewById(R.id.like_layout);
        this.f20766v = this.itemView.findViewById(R.id.view_avatar_image);
        this.f20763s = (ImageView) this.itemView.findViewById(R.id.ic_img_chat_edge_in_tr);
        this.f20764t = (ImageView) this.itemView.findViewById(R.id.ic_img_chat_edge_in_bl);
        this.f20762r = (ImageView) this.itemView.findViewById(R.id.ic_img_chat_edge_out_br);
        this.f20761q = (ImageView) this.itemView.findViewById(R.id.ic_img_chat_edge_out_tl);
        this.f20733M = (TextView) this.itemView.findViewById(R.id.content_textView);
        this.f20732L = (TextView) this.itemView.findViewById(R.id.caption_textView);
        if (this.f20732L != null) {
            this.f20732L.setOnClickListener(new C34763(this));
        }
        if (this.f20733M != null) {
            this.f20733M.setOnClickListener(new C34774(this));
        }
        this.f20734N = (TextView) this.itemView.findViewById(R.id.video_length_textView);
        this.f20736P = (TextView) this.itemView.findViewById(R.id.video_size_textView);
        this.f20737Q = (TextView) this.itemView.findViewById(R.id.sender_textView);
        this.f20738R = (TextView) this.itemView.findViewById(R.id.main_name_sender_textView);
        this.f20739S = (Button) this.itemView.findViewById(R.id.submit_button);
        this.f20740T = (Button) this.itemView.findViewById(R.id.view_results_button);
        this.f20741U = (Button) this.itemView.findViewById(R.id.payment_button);
        this.f20742V = (ImageView) this.itemView.findViewById(R.id.status_imageView);
        this.f20743W = (TextView) this.itemView.findViewById(R.id.like_count_textView);
        this.ae = (ImageView) this.itemView.findViewById(R.id.heart_imageView);
        this.f20744X = (TextView) this.itemView.findViewById(R.id.visit_count_textView);
        this.af = (ImageView) this.itemView.findViewById(R.id.eye_imageView);
        this.f20745Y = (ImageView) this.itemView.findViewById(R.id.actionDownloadChatFile);
        this.f20746Z = (TextView) this.itemView.findViewById(R.id.file_name_textView);
        this.aa = (TextView) this.itemView.findViewById(R.id.file_size_textView);
        this.ab = (TextView) this.itemView.findViewById(R.id.date_textView);
        this.ag = this.itemView.findViewById(R.id.root_bg_time_sticker);
        if (this.f20754j != null) {
            this.f20754j.setOnClickListener(new C34741(this));
        }
        if (this.f20753i != null) {
            this.f20753i.setOnClickListener(new C34807(this));
        }
        if (this.f20749e != null) {
            this.f20749e.setOnClickListener(new C34818(this));
        }
        if (this.f20751g != null) {
            this.f20751g.setOnClickListener(new C34829(this));
        }
        if (this.f20752h != null) {
            this.f20752h.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C7194a f10606a;

                {
                    this.f10606a = r1;
                }

                public final void onClick(View view) {
                    this.f10606a.f20765u.mo2337g((C7197a) this.f10606a.f16244a);
                }
            });
        }
        this.itemView.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ C7194a f10607a;

            {
                this.f10607a = r1;
            }

            public final void onClick(View view) {
                if (C7194a.m19037a(((C7197a) this.f10607a.f16244a).f20783i)) {
                    this.f10607a.f20765u.mo2333e((C7197a) this.f10607a.f16244a);
                }
            }
        });
        this.f20768x = (ViewStub) this.itemView.findViewById(R.id.rich_link_viewStub);
        if (this.f20768x != null) {
            this.f20768x.inflate();
            this.f20721A = (TextView) this.itemView.findViewById(R.id.textView1);
            this.f20756l = this.itemView.findViewById(R.id.rich_link_left_line);
            this.f20757m = (FrameLayout) this.itemView.findViewById(R.id.frameLayout);
            this.f20722B = (TextView) this.itemView.findViewById(R.id.textView2);
            this.f20723C = (TextView) this.itemView.findViewById(R.id.textView3);
            this.f20724D = (ImageView) this.itemView.findViewById(R.id.rich_link_imageView);
            this.f20769y = (ImageButton) this.itemView.findViewById(R.id.action_imageView);
            this.f20770z = (ProgressWheel) this.itemView.findViewById(R.id.progress_wheel);
            this.f20769y.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C7194a f10608a;

                {
                    this.f10608a = r1;
                }

                public final void onClick(View view) {
                    C7358a c7358a = (C7358a) this.f10608a.f16244a;
                    switch (c7358a.f21340z) {
                        case DELETED:
                        case NOT_STARTED:
                        case TRANSMITTING:
                        case CANCEL:
                        case ERROR:
                            C2808d.m7149c(new C6786d(c7358a.f21300A));
                            return;
                        default:
                            return;
                    }
                }
            });
            this.f20724D.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C7194a f10609a;

                {
                    this.f10609a = r1;
                }

                public final void onClick(View view) {
                    C7358a c7358a = (C7358a) this.f10609a.f16244a;
                    if (C34796.f10623b[c7358a.f21340z.ordinal()] == 6) {
                        this.f10609a.f20765u.mo2310a(c7358a.f21327m, c7358a.f21328n, this.f10609a.ac, this.f10609a.ad);
                    }
                }
            });
        }
        this.f20730J = (LinearLayout) this.itemView.findViewById(R.id.linear_layout_reply_text);
        this.f20767w = (ImageView) this.itemView.findViewById(R.id.edit_imageView);
        this.f20731K = c3286g;
        if (this.f20746Z != null) {
            C2491i.m6802a(this.f20746Z, m19038b());
        }
        if (this.aa != null) {
            C2491i.m6802a(this.aa, m19038b());
        }
        if (this.f20737Q != null) {
            int c = m19042c();
            int a = m19026a();
            C2491i.m6802a(this.f20737Q, c);
            C2491i.m6821b(this.f20737Q, a);
        }
        if (this.f20738R != null) {
            c = m19042c();
            a = m19026a();
            C2491i.m6802a(this.f20738R, c);
            C2491i.m6821b(this.f20738R, a);
        }
        if (this.f20732L != null) {
            c = m19038b();
            a = m19026a();
            C2491i.m6802a(this.f20732L, c);
            C2491i.m6821b(this.f20732L, a);
        }
        if (this.f20733M != null) {
            c = m19038b();
            a = m19026a();
            C2491i.m6802a(this.f20733M, c);
            C2491i.m6821b(this.f20733M, a);
        }
        if (this.f20734N != null) {
            c = this.f20755k ? UIThemeManager.getmInstance().getOutput_duration_and_size_media_color() : UIThemeManager.getmInstance().getInput_duration_and_size_media_color();
            C2491i.m6802a(this.f20734N, c);
            C2491i.m6828c(this.f20734N, c);
        }
        if (this.f20735O != null) {
            c = this.f20755k ? UIThemeManager.getmInstance().getOutput_duration_and_size_media_color() : UIThemeManager.getmInstance().getInput_duration_and_size_media_color();
            C2491i.m6802a(this.f20735O, c);
            C2491i.m6828c(this.f20735O, c);
        }
        if (this.f20736P != null) {
            C2491i.m6802a(this.f20736P, this.f20755k ? UIThemeManager.getmInstance().getOutput_duration_and_size_media_color() : UIThemeManager.getmInstance().getInput_duration_and_size_media_color());
        }
        if (!(this.f20739S == null || this.f20740T == null)) {
            c = this.f20755k ? UIThemeManager.getmInstance().getOutput_button_color() : UIThemeManager.getmInstance().getInput_button_color();
            a = this.f20755k ? UIThemeManager.getmInstance().getOutput_button_text_color() : UIThemeManager.getmInstance().getInput_button_text_color();
            C2491i.m6819b(this.f20739S, c);
            C2491i.m6819b(this.f20740T, c);
            C2491i.m6798a(this.f20739S, a);
            C2491i.m6798a(this.f20740T, a);
        }
        if (this.f20741U != null) {
            c = this.f20755k ? UIThemeManager.getmInstance().getOutput_button_color() : UIThemeManager.getmInstance().getInput_button_color();
            a = this.f20755k ? UIThemeManager.getmInstance().getOutput_button_text_color() : UIThemeManager.getmInstance().getInput_button_text_color();
            C2491i.m6819b(this.f20741U, c);
            C2491i.m6798a(this.f20741U, a);
        }
        if (this.f20767w != null) {
            C2491i.m6801a(this.f20767w, m19042c());
        }
        if (this.f20745Y != null) {
            C2491i.m6801a(this.f20745Y, this.f20755k ? UIThemeManager.getmInstance().getOutput_duration_and_size_media_color() : UIThemeManager.getmInstance().getInput_duration_and_size_media_color());
        }
        if (this.ab != null) {
            C2491i.m6790a(this.ab.getBackground(), UIThemeManager.getmInstance().getDate_bubble_background_color());
            C2491i.m6802a(this.ab, UIThemeManager.getmInstance().getDate_bubble_text_color());
        }
        if (this.f20770z != null) {
            this.f20770z.setBarColorInConversation(UIThemeManager.getmInstance().getProgress_bar_color());
        }
        if (!(this.f20750f == null || C2535a.m6888a().au())) {
            C2491i.m6790a(this.f20750f.getBackground(), UIThemeManager.getmInstance().getBackground_floating_forward_button_color());
        }
        if (this.ag != null) {
            C2491i.m6790a(this.ag.getBackground(), this.f20755k ? UIThemeManager.getmInstance().getOutput_background_sticker_like_and_time_color() : UIThemeManager.getmInstance().getInput_background_sticker_like_and_time_color());
        }
    }

    private int m19026a() {
        return this.f20755k ? UIThemeManager.getmInstance().getOutput_link_message_text_color() : UIThemeManager.getmInstance().getInput_link_message_text_color();
    }

    private static int m19027a(boolean z) {
        return z ? UIThemeManager.getmInstance().getShadow_output_bubble_chat_color() : UIThemeManager.getmInstance().getShadow_input_bubble_chat_color();
    }

    private void m19029a(int i) {
        this.f20724D.setVisibility(i);
        this.f20770z.setVisibility(i);
        this.f20769y.setVisibility(i);
    }

    private static void m19030a(int i, Drawable drawable, Drawable drawable2) {
        C2491i.m6790a(drawable, i);
        C2491i.m6790a(drawable2, i);
    }

    private static void m19031a(View view, boolean z) {
        if (view.getBackground() instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) view.getBackground();
            if (layerDrawable != null) {
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.shadow_shape);
                Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.shadow_shape2);
                if (findDrawableByLayerId != null) {
                    Drawable drawable = null;
                    if (findDrawableByLayerId instanceof GradientDrawable) {
                        findDrawableByLayerId = (GradientDrawable) findDrawableByLayerId;
                        if (findDrawableByLayerId2 != null) {
                            drawable = (GradientDrawable) findDrawableByLayerId2;
                        }
                        C7194a.m19030a(C7194a.m19027a(z), findDrawableByLayerId, drawable);
                        return;
                    }
                    if (findDrawableByLayerId instanceof NinePatchDrawable) {
                        findDrawableByLayerId = (NinePatchDrawable) findDrawableByLayerId;
                        if (findDrawableByLayerId2 != null) {
                            drawable = (NinePatchDrawable) findDrawableByLayerId2;
                        }
                        C7194a.m19030a(C7194a.m19027a(z), findDrawableByLayerId, drawable);
                    }
                }
            }
        }
    }

    protected static void m19032a(ImageButton imageButton, boolean z) {
        imageButton.setImageResource(z ? R.drawable.ic_file_start_download : R.drawable.ic_file_start_upload);
    }

    private void m19033a(TextView textView, int i) {
        i = (!C7194a.m19041b(i) || (C2535a.m6888a().au() && C7194a.m19044c(i))) ? m19042c() : -1;
        C2491i.m6802a(textView, i);
    }

    private static void m19034a(TextView textView, String str) {
        if (textView != null) {
            if (str != null) {
                if (!str.isEmpty()) {
                    textView.setText(str);
                    textView.setVisibility(0);
                    return;
                }
            }
            textView.setText(str);
            textView.setVisibility(8);
        }
    }

    private void m19035a(C7358a c7358a) {
        switch (c7358a.f21340z) {
            case DELETED:
            case NOT_STARTED:
                this.f20770z.setVisibility(8);
                this.f20769y.setVisibility(0);
                this.f20769y.setImageResource(R.drawable.ic_file_start_download);
                break;
            case TRANSMITTING:
                this.f20770z.setVisibility(0);
                this.f20769y.setVisibility(0);
                this.f20769y.setImageResource(R.drawable.ic_file_stop_download);
                if (c7358a.f21329o > 0) {
                    this.f20770z.setProgress(((float) c7358a.f21329o) * 0.01f);
                    return;
                }
                break;
            case CANCEL:
                this.f20770z.setVisibility(8);
                this.f20769y.setVisibility(0);
                this.f20769y.setImageResource(R.drawable.ic_file_start_download);
                return;
            case ERROR:
                this.f20770z.setVisibility(8);
                this.f20769y.setVisibility(0);
                this.f20769y.setImageResource(R.drawable.ic_file_start_download);
                return;
            case FINISHED:
                this.f20770z.setVisibility(8);
                this.f20769y.setVisibility(8);
                return;
            default:
                return;
        }
    }

    private void m19036a(C7358a c7358a, ImageView imageView) {
        int c = (!C7194a.m19041b(c7358a.f19503j) || (C2535a.m6888a().au() && C7194a.m19044c(c7358a.f19503j))) ? m19042c() : -1;
        C2491i.m6801a(imageView, c);
    }

    static /* synthetic */ boolean m19037a(C2973m c2973m) {
        if (C2535a.m6888a().au()) {
            if (c2973m == null || c2973m == C2973m.CHANNEL || c2973m == C2973m.CHANNEL_DIRECT || c2973m == C2973m.CHANNEL_REPLY) {
                return false;
            }
        }
        return true;
    }

    private int m19038b() {
        return this.f20755k ? UIThemeManager.getmInstance().getOutput_content_and_caption_message_text_color() : UIThemeManager.getmInstance().getInput_content_and_caption_message_text_color();
    }

    private void m19040b(C7358a c7358a) {
        int i;
        int i2;
        int i3 = -1;
        if (!(this.f20743W == null && this.f20744X == null)) {
            int input_outline_like_image_color;
            switch (getItemViewType()) {
                case 12:
                case 13:
                case 22:
                case 23:
                case 32:
                case 33:
                case 42:
                case 43:
                case 52:
                case 53:
                case 62:
                case 63:
                case 72:
                case 73:
                case 82:
                case 83:
                case 102:
                case 103:
                case 112:
                case 113:
                case IjkMediaMeta.FF_PROFILE_H264_HIGH_422 /*122*/:
                case 123:
                case 132:
                case 133:
                case 135:
                case 137:
                case 142:
                case 143:
                case 1111:
                case 1115:
                case 2111:
                case 2115:
                case 3111:
                case 3115:
                case 4111:
                case 4115:
                case 5111:
                case 5115:
                case 6111:
                case 6115:
                case 7111:
                case 7115:
                case 8111:
                case 8115:
                case 10111:
                case 10115:
                case 11111:
                case 12111:
                case 12115:
                case 14111:
                case 14115:
                case 111115:
                    i = 1;
                    break;
                default:
                    i = 0;
                    break;
            }
            C2973m e = c7358a.mo3628e();
            i2 = (e == null || !e.equals(C2973m.CHANNEL)) ? 0 : 1;
            int itemViewType = getItemViewType();
            if (!(itemViewType == 6111 || itemViewType == 6115)) {
                switch (itemViewType) {
                    case 62:
                    case 63:
                        break;
                    default:
                        itemViewType = 0;
                        break;
                }
            }
            itemViewType = 1;
            i2 = (i2 == 0 || itemViewType != 0) ? 0 : 1;
            itemViewType = c7358a.f19503j;
            if (this.f20743W != null) {
                if (i != 0) {
                    if (i2 != 0) {
                        this.f20743W.setVisibility(0);
                    } else {
                        this.f20743W.setVisibility(8);
                    }
                }
                if (C2535a.m6888a().au()) {
                    TextView textView = this.f20743W;
                    int i4 = c7358a.f19503j;
                    i4 = C7194a.m19044c(i4) ? UIThemeManager.getmInstance().getInput_outline_like_image_color() : C7194a.m19041b(i4) ? -1 : m19042c();
                    C2491i.m6802a(textView, i4);
                } else {
                    m19033a(this.f20743W, c7358a.f19503j);
                }
            }
            if (this.f20753i != null) {
                input_outline_like_image_color = C7194a.m19044c(itemViewType) ? UIThemeManager.getmInstance().getInput_outline_like_image_color() : C7194a.m19041b(itemViewType) ? -1 : m19042c();
                if (!C2535a.m6888a().au()) {
                    C2491i.m6790a(this.f20753i.getBackground(), UIThemeManager.getmInstance().getBackground_floating_forward_button_color());
                }
                C2491i.m6801a(this.f20753i, input_outline_like_image_color);
            }
            if (this.f20751g != null) {
                input_outline_like_image_color = C7194a.m19044c(itemViewType) ? UIThemeManager.getmInstance().getInput_outline_like_image_color() : C7194a.m19041b(itemViewType) ? -1 : m19042c();
                C2491i.m6801a(this.f20751g, input_outline_like_image_color);
            }
            if (this.f20749e != null) {
                input_outline_like_image_color = C7194a.m19044c(itemViewType) ? UIThemeManager.getmInstance().getInput_outline_like_image_color() : C7194a.m19041b(itemViewType) ? -1 : m19042c();
                C2491i.m6801a(this.f20749e, input_outline_like_image_color);
            }
            if (this.f20754j != null) {
                itemViewType = C7194a.m19044c(itemViewType) ? UIThemeManager.getmInstance().getInput_outline_like_image_color() : C7194a.m19041b(itemViewType) ? -1 : m19042c();
                C2491i.m6801a(this.f20754j, itemViewType);
            }
            if (this.ae != null) {
                if (i != 0) {
                    if (i2 != 0) {
                        this.ae.setVisibility(0);
                    } else {
                        this.ae.setVisibility(8);
                    }
                }
                if (C2535a.m6888a().au()) {
                    m19036a(c7358a, this.ae);
                } else {
                    C2491i.m6801a(this.ae, C7194a.m19041b(c7358a.f19503j) ? -1 : m19042c());
                }
            }
            if (this.f20744X != null) {
                if (i != 0) {
                    if (i2 != 0) {
                        this.f20744X.setVisibility(0);
                    } else {
                        this.f20744X.setVisibility(8);
                    }
                }
                m19033a(this.f20744X, c7358a.f19503j);
            }
            if (this.af != null) {
                if (i != 0) {
                    if (i2 != 0) {
                        this.af.setVisibility(0);
                    } else {
                        this.af.setVisibility(8);
                    }
                }
                m19036a(c7358a, this.af);
            }
        }
        if (c7358a.f21303D != null) {
            i = m19038b();
            i2 = m19026a();
            C2491i.m6784a(i, this.f20722B, this.f20723C);
            C2491i.m6802a(this.f20721A, i2);
            C2491i.m6815b(i2, this.f20721A, this.f20722B, this.f20723C);
            if (!this.f20755k) {
                i3 = UIThemeManager.getmInstance().getAccent_color();
            }
            C2491i.m6796a(this.f20756l, i3);
        }
        C2971k c2971k = c7358a.f21337w;
        if (!(this.f20742V == null || c2971k == null)) {
            switch (c2971k) {
                case ERROR:
                case SENDING:
                case PENDING:
                case PENDING_RETRANSMIT:
                case READ:
                case NOT_READ:
                case DRAFT:
                case DELIVERED:
                case NOT_SEEN:
                    break;
                case SEEN:
                    C2491i.m6801a(this.f20742V, UIThemeManager.getmInstance().getSeen_status_image_color());
                    return;
                default:
                    return;
            }
        }
        C2491i.m6801a(this.f20742V, UIThemeManager.getmInstance().getStatus_image_conversation_color());
    }

    private static boolean m19041b(int i) {
        if (!C2535a.m6888a().au()) {
            if (!(i == 104 || i == 106 || i == 108 || i == 124 || i == 126 || i == 128)) {
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                        break;
                    default:
                        switch (i) {
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                                break;
                            default:
                                break;
                        }
                }
            }
            return true;
        }
        switch (i) {
            case 22:
            case 23:
            case 32:
            case 33:
            case 102:
            case 103:
            case 105:
            case 107:
            case 109:
            case IjkMediaMeta.FF_PROFILE_H264_HIGH_422 /*122*/:
            case 123:
            case 125:
            case 127:
            case 129:
            case 2111:
            case 2115:
            case 3111:
            case 3115:
            case 10111:
            case 10115:
            case 12111:
            case 12115:
                return true;
            default:
                return false;
        }
    }

    private int m19042c() {
        return this.f20755k ? UIThemeManager.getmInstance().getOutput_time_and_like_message_color() : UIThemeManager.getmInstance().getInput_time_and_like_message_color();
    }

    private static boolean m19044c(int i) {
        switch (i) {
            case 14:
            case 16:
            case 18:
            case 24:
            case 26:
            case 28:
            case 34:
            case 36:
            case 38:
            case 44:
            case 46:
            case 48:
            case 54:
            case 56:
            case 58:
            case 74:
            case 76:
            case 78:
            case 84:
            case 86:
            case 88:
            case 92:
            case 94:
            case 104:
            case 106:
            case 108:
            case 114:
            case 116:
            case 118:
            case 124:
            case 126:
            case 128:
            case IjkMediaMeta.FF_PROFILE_H264_HIGH_444 /*144*/:
            case 146:
            case 148:
                return true;
            default:
                return false;
        }
    }

    protected final SpannableString m19048a(final String str, final C2973m c2973m, String str2) {
        Object format = String.format(C4522p.m8236a(R.string.forward_from), new Object[]{str2});
        SpannableString spannableString = new SpannableString(format);
        C34785 c34785 = new ClickableSpan(this) {
            final /* synthetic */ C7194a f10621c;

            public final void onClick(View view) {
                switch (c2973m) {
                    case SINGLE:
                    case GROUP:
                    case CHANNEL_DIRECT:
                    case CHANNEL_REPLY:
                        C4478a.m8149a(this.f10621c.f20747c, str, C2999a.m7500a(str).f9422h);
                        return;
                    case CHANNEL:
                        C2808d.m7147a(new C6700i(str, false, true));
                        return;
                    default:
                        return;
                }
            }

            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
            }
        };
        int length = format.length() - str2.length();
        spannableString.setSpan(c34785, length, str2.length() + length, 33);
        return spannableString;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3180a(mobi.mmdt.ott.view.components.p401c.C6829g r20) {
        /*
        r19 = this;
        r1 = r19;
        r2 = r20;
        r2 = (mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a) r2;
        super.m17835a(r2);
        r3 = r1.f20749e;
        r4 = 8;
        r5 = 0;
        if (r3 == 0) goto L_0x001c;
    L_0x0010:
        r3 = r1.f20749e;
        r6 = r2.f21332r;
        if (r6 == 0) goto L_0x0018;
    L_0x0016:
        r6 = r5;
        goto L_0x0019;
    L_0x0018:
        r6 = r4;
    L_0x0019:
        r3.setVisibility(r6);
    L_0x001c:
        r3 = 2131231935; // 0x7f0804bf float:1.8079965E38 double:1.0529684824E-314;
        r6 = 0;
        if (r2 == 0) goto L_0x019e;
    L_0x0022:
        r7 = r1.f20768x;
        if (r7 == 0) goto L_0x0195;
    L_0x0026:
        r7 = r2.f21303D;
        if (r7 == 0) goto L_0x0195;
    L_0x002a:
        r7 = r2.f21303D;
        r7 = r7.isEmpty();
        if (r7 != 0) goto L_0x0195;
    L_0x0032:
        r7 = r2.f21303D;
        r8 = "not_available";
        r7 = r7.equals(r8);
        if (r7 != 0) goto L_0x0195;
    L_0x003c:
        r7 = r1.f20747c;
        r7 = mobi.mmdt.componentsutils.p232b.C2491i.m6832e(r7);
        r7 = (int) r7;
        r7 = r7 / 2;
        r1.f20758n = r7;
        r7 = r2.f21331q;
        r7 = (float) r7;
        r8 = r2.f21330p;
        r8 = (float) r8;
        r9 = r1.f20758n;
        r9 = (float) r9;
        r10 = r8 / r7;
        r9 = r9 * r10;
        r9 = (int) r9;
        r1.f20759o = r9;
        r9 = r1.f20724D;
        r9 = r9.getLayoutParams();
        r9 = (android.widget.FrameLayout.LayoutParams) r9;
        r10 = r1.f20758n;
        r9.width = r10;
        r10 = r1.f20759o;
        r9.height = r10;
        r9 = r1.f20757m;
        r9 = r9.getLayoutParams();
        r9 = (android.widget.LinearLayout.LayoutParams) r9;
        r10 = r1.f20758n;
        r9.width = r10;
        r10 = r1.f20759o;
        r9.height = r10;
        r9 = "";
        r1.ac = r9;
        r9 = "";
        r1.ad = r9;
        r9 = "";
        r10 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0157 }
        r11 = r2.f21303D;	 Catch:{ JSONException -> 0x0157 }
        r10.<init>(r11);	 Catch:{ JSONException -> 0x0157 }
        r11 = "site_name";
        r11 = r10.getString(r11);	 Catch:{ JSONException -> 0x0157 }
        r1.ac = r11;	 Catch:{ JSONException -> 0x0157 }
        r11 = "title";
        r11 = r10.getString(r11);	 Catch:{ JSONException -> 0x0157 }
        r1.ad = r11;	 Catch:{ JSONException -> 0x0157 }
        r11 = "description";
        r10 = r10.getString(r11);	 Catch:{ JSONException -> 0x0157 }
        r9 = r1.f20724D;	 Catch:{ JSONException -> 0x0154 }
        if (r9 == 0) goto L_0x015d;
    L_0x00a1:
        r9 = r2.f21340z;	 Catch:{ JSONException -> 0x0154 }
        r11 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;	 Catch:{ JSONException -> 0x0154 }
        if (r9 != r11) goto L_0x00b2;
    L_0x00a7:
        r9 = r2.f21327m;	 Catch:{ JSONException -> 0x0154 }
        if (r9 == 0) goto L_0x00b2;
    L_0x00ab:
        r9 = r2.f21327m;	 Catch:{ JSONException -> 0x0154 }
    L_0x00ad:
        r9 = android.net.Uri.parse(r9);	 Catch:{ JSONException -> 0x0154 }
        goto L_0x00c0;
    L_0x00b2:
        r9 = r2.f21326l;	 Catch:{ JSONException -> 0x0154 }
        r11 = mobi.mmdt.ott.provider.p386h.C2987i.FINISHED;	 Catch:{ JSONException -> 0x0154 }
        if (r9 != r11) goto L_0x00bf;
    L_0x00b8:
        r9 = r2.f21328n;	 Catch:{ JSONException -> 0x0154 }
        if (r9 == 0) goto L_0x00bf;
    L_0x00bc:
        r9 = r2.f21328n;	 Catch:{ JSONException -> 0x0154 }
        goto L_0x00ad;
    L_0x00bf:
        r9 = r6;
    L_0x00c0:
        r11 = 0;
        r12 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1));
        if (r12 <= 0) goto L_0x0118;
    L_0x00c5:
        r11 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1));
        if (r11 <= 0) goto L_0x0118;
    L_0x00c9:
        r11 = 1112014848; // 0x42480000 float:50.0 double:5.49408334E-315;
        r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1));
        if (r7 >= 0) goto L_0x00d9;
    L_0x00cf:
        r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1));
        if (r7 < 0) goto L_0x00d4;
    L_0x00d3:
        goto L_0x00d9;
    L_0x00d4:
        r1.m19029a(r4);	 Catch:{ JSONException -> 0x0154 }
        goto L_0x015d;
    L_0x00d9:
        r1.m19029a(r5);	 Catch:{ JSONException -> 0x0154 }
        r7 = r1.f20747c;	 Catch:{ JSONException -> 0x0154 }
        r7 = com.p085c.p086a.C1212c.m2872a(r7);	 Catch:{ JSONException -> 0x0154 }
        r8 = r1.f20724D;	 Catch:{ JSONException -> 0x0154 }
        r7.m10953a(r8);	 Catch:{ JSONException -> 0x0154 }
        r7 = r1.f20724D;	 Catch:{ JSONException -> 0x0154 }
        r7.setImageBitmap(r6);	 Catch:{ JSONException -> 0x0154 }
        r7 = r1.f20747c;	 Catch:{ JSONException -> 0x0154 }
        r7 = com.p085c.p086a.C1212c.m2872a(r7);	 Catch:{ JSONException -> 0x0154 }
        r7 = r7.m10950a(r9);	 Catch:{ JSONException -> 0x0154 }
        r8 = new com.c.a.g.f;	 Catch:{ JSONException -> 0x0154 }
        r8.<init>();	 Catch:{ JSONException -> 0x0154 }
        r8 = r8.m2949a(r3);	 Catch:{ JSONException -> 0x0154 }
        r9 = r1.f20758n;	 Catch:{ JSONException -> 0x0154 }
        r11 = r1.f20758n;	 Catch:{ JSONException -> 0x0154 }
        r8 = r8.m2954b(r9, r11);	 Catch:{ JSONException -> 0x0154 }
        r7 = r7.m3034a(r8);	 Catch:{ JSONException -> 0x0154 }
        r7 = r7.m3033a();	 Catch:{ JSONException -> 0x0154 }
        r8 = r1.f20724D;	 Catch:{ JSONException -> 0x0154 }
        r7.m3031a(r8);	 Catch:{ JSONException -> 0x0154 }
    L_0x0114:
        r1.m19035a(r2);	 Catch:{ JSONException -> 0x0154 }
        goto L_0x015d;
    L_0x0118:
        r1.m19029a(r5);	 Catch:{ JSONException -> 0x0154 }
        r7 = r1.f20724D;	 Catch:{ JSONException -> 0x0154 }
        r7.setImageBitmap(r6);	 Catch:{ JSONException -> 0x0154 }
        r7 = r1.f20747c;	 Catch:{ JSONException -> 0x0154 }
        r7 = com.p085c.p086a.C1212c.m2872a(r7);	 Catch:{ JSONException -> 0x0154 }
        r8 = r1.f20724D;	 Catch:{ JSONException -> 0x0154 }
        r7.m10953a(r8);	 Catch:{ JSONException -> 0x0154 }
        r7 = r1.f20747c;	 Catch:{ JSONException -> 0x0154 }
        r7 = com.p085c.p086a.C1212c.m2872a(r7);	 Catch:{ JSONException -> 0x0154 }
        r7 = r7.m10950a(r9);	 Catch:{ JSONException -> 0x0154 }
        r8 = new com.c.a.g.f;	 Catch:{ JSONException -> 0x0154 }
        r8.<init>();	 Catch:{ JSONException -> 0x0154 }
        r8 = r8.m2949a(r3);	 Catch:{ JSONException -> 0x0154 }
        r9 = r1.f20758n;	 Catch:{ JSONException -> 0x0154 }
        r11 = r1.f20758n;	 Catch:{ JSONException -> 0x0154 }
        r8 = r8.m2954b(r9, r11);	 Catch:{ JSONException -> 0x0154 }
        r7 = r7.m3034a(r8);	 Catch:{ JSONException -> 0x0154 }
        r7 = r7.m3033a();	 Catch:{ JSONException -> 0x0154 }
        r8 = r1.f20724D;	 Catch:{ JSONException -> 0x0154 }
        r7.m3031a(r8);	 Catch:{ JSONException -> 0x0154 }
        goto L_0x0114;
    L_0x0154:
        r0 = move-exception;
        r7 = r0;
        goto L_0x015a;
    L_0x0157:
        r0 = move-exception;
        r7 = r0;
        r10 = r9;
    L_0x015a:
        r7.printStackTrace();
    L_0x015d:
        r7 = r1.f20721A;
        r8 = r1.ac;
        mobi.mmdt.ott.view.conversation.p432e.p433a.C7194a.m19034a(r7, r8);
        r7 = r1.f20721A;
        r8 = 1;
        if (r7 == 0) goto L_0x0174;
    L_0x0169:
        r7 = r1.f20721A;
        r9 = r1.f20721A;
        r9 = r9.getTypeface();
        r7.setTypeface(r9, r8);
    L_0x0174:
        r7 = r1.f20722B;
        if (r7 == 0) goto L_0x0183;
    L_0x0178:
        r7 = r1.f20722B;
        r9 = r1.f20722B;
        r9 = r9.getTypeface();
        r7.setTypeface(r9, r8);
    L_0x0183:
        r7 = r1.f20722B;
        r8 = r1.ad;
        mobi.mmdt.ott.view.conversation.p432e.p433a.C7194a.m19034a(r7, r8);
        r7 = r1.f20723C;
        mobi.mmdt.ott.view.conversation.p432e.p433a.C7194a.m19034a(r7, r10);
        r7 = r1.f20768x;
        r7.setVisibility(r5);
        goto L_0x019e;
    L_0x0195:
        r7 = r1.f20768x;
        if (r7 == 0) goto L_0x019e;
    L_0x0199:
        r7 = r1.f20768x;
        r7.setVisibility(r4);
    L_0x019e:
        if (r2 == 0) goto L_0x01cd;
    L_0x01a0:
        r7 = r2.f19503j;
        r7 = mobi.mmdt.ott.view.conversation.p432e.p433a.C7194a.m19041b(r7);
        if (r7 == 0) goto L_0x01aa;
    L_0x01a8:
        r7 = -1;
        goto L_0x01ae;
    L_0x01aa:
        r7 = r19.m19042c();
    L_0x01ae:
        r8 = r1.f20726F;
        r9 = r2.f21336v;
        r8.setText(r9);
        r8 = r1.f20726F;
        mobi.mmdt.componentsutils.p232b.C2491i.m6802a(r8, r7);
        r7 = r1.f20767w;
        if (r7 == 0) goto L_0x01cd;
    L_0x01be:
        r7 = r2.f21302C;
        if (r7 == 0) goto L_0x01c8;
    L_0x01c2:
        r7 = r1.f20767w;
        r7.setVisibility(r5);
        goto L_0x01cd;
    L_0x01c8:
        r7 = r1.f20767w;
        r7.setVisibility(r4);
    L_0x01cd:
        if (r2 == 0) goto L_0x04c4;
    L_0x01cf:
        r7 = r2.f21313N;
        if (r7 == 0) goto L_0x04bf;
    L_0x01d3:
        r7 = new mobi.mmdt.ott.provider.f.i;
        r9 = r2.f21310K;
        r10 = r2.f21311L;
        r11 = r2.f21305F;
        r12 = r2.f21312M;
        r13 = r2.f21304E;
        r14 = r2.f21309J;
        r15 = r2.f21306G;
        r8 = r2.f21308I;
        r3 = r2.f21307H;
        r16 = r8;
        r8 = r7;
        r17 = r3;
        r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17);
        r3 = r7.f9236i;
        r8 = mobi.mmdt.ott.provider.p384f.C2971k.DELETED;
        if (r3 == r8) goto L_0x04b9;
    L_0x01f5:
        r3 = r1.f20725E;
        r3.setVisibility(r5);
        r3 = r1.f20730J;
        r8 = new mobi.mmdt.ott.view.conversation.e.a.a$14;
        r8.<init>(r1, r7, r2);
        r3.setOnClickListener(r8);
        r3 = r1.f20729I;
        r8 = new mobi.mmdt.ott.view.conversation.e.a.a$2;
        r8.<init>(r1, r7, r2);
        r3.setOnClickListener(r8);
        r3 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r3 = r3.m6928d();
        r8 = r7.f9228a;
        if (r8 == 0) goto L_0x022b;
    L_0x021a:
        r3 = r8.equals(r3);
        if (r3 == 0) goto L_0x0228;
    L_0x0220:
        r3 = 2131690577; // 0x7f0f0451 float:1.9010202E38 double:1.0531950817E-314;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r3);
        goto L_0x022d;
    L_0x0228:
        r3 = r7.f9232e;
        goto L_0x022d;
    L_0x022b:
        r3 = "";
    L_0x022d:
        r8 = r1.f20727G;
        r8.setText(r3);
        r8 = r7.f9229b;
        r9 = java.text.Normalizer.Form.NFD;
        r8 = java.text.Normalizer.normalize(r8, r9);
        r9 = "[\n]";
        r10 = " ";
        r8 = r8.replaceAll(r9, r10);
        r9 = r1.f20728H;
        r9.setText(r8);
        r8 = r2.m19056c();
        if (r8 == 0) goto L_0x0267;
    L_0x024d:
        r8 = r1.f20727G;
        r9 = r1.f20747c;
        r10 = 2131100079; // 0x7f0601af float:1.781253E38 double:1.052903337E-314;
    L_0x0254:
        r9 = android.support.v4.p029a.C0346c.m687c(r9, r10);
        r8.setTextColor(r9);
        r8 = r1.f20728H;
        r9 = r1.f20747c;
        r9 = android.support.v4.p029a.C0346c.m687c(r9, r10);
        r8.setTextColor(r9);
        goto L_0x026f;
    L_0x0267:
        r8 = r1.f20727G;
        r9 = r1.f20747c;
        r10 = 2131100126; // 0x7f0601de float:1.7812625E38 double:1.05290336E-314;
        goto L_0x0254;
    L_0x026f:
        r8 = r2.mo3606h();
        r9 = mobi.mmdt.ott.provider.p384f.C2973m.CHANNEL;
        if (r8 == r9) goto L_0x0286;
    L_0x0277:
        r9 = mobi.mmdt.ott.provider.p384f.C2973m.CHANNEL_DIRECT;
        if (r8 == r9) goto L_0x0286;
    L_0x027b:
        r9 = mobi.mmdt.ott.provider.p384f.C2973m.CHANNEL_REPLY;
        if (r8 != r9) goto L_0x0280;
    L_0x027f:
        goto L_0x0286;
    L_0x0280:
        r9 = r1.f20727G;
        r9.setVisibility(r5);
        goto L_0x029b;
    L_0x0286:
        r9 = r2.mo3605g();
        r10 = mobi.mmdt.ott.provider.p390l.C3004f.MEMBER;
        if (r9 == r10) goto L_0x0296;
    L_0x028e:
        r10 = mobi.mmdt.ott.provider.p390l.C3004f.VISITOR;
        if (r9 == r10) goto L_0x0296;
    L_0x0292:
        r10 = mobi.mmdt.ott.provider.p390l.C3004f.NONE;
        if (r9 != r10) goto L_0x0280;
    L_0x0296:
        r9 = r1.f20727G;
        r9.setVisibility(r4);
    L_0x029b:
        r9 = r1.f20729I;
        r9.setImageBitmap(r6);
        r9 = mobi.mmdt.ott.view.conversation.p432e.p433a.C7194a.C34796.f10622a;
        r10 = r7.f9234g;
        r10 = r10.ordinal();
        r9 = r9[r10];
        r10 = 2131099784; // 0x7f060088 float:1.781193E38 double:1.052903191E-314;
        switch(r9) {
            case 1: goto L_0x0448;
            case 2: goto L_0x03e9;
            case 3: goto L_0x03e2;
            case 4: goto L_0x03ae;
            case 5: goto L_0x037e;
            case 6: goto L_0x034e;
            case 7: goto L_0x0315;
            case 8: goto L_0x02ee;
            case 9: goto L_0x02d4;
            case 10: goto L_0x02b2;
            case 11: goto L_0x03e2;
            default: goto L_0x02b0;
        };
    L_0x02b0:
        goto L_0x0480;
    L_0x02b2:
        r2 = r1.f20729I;
        r2.setVisibility(r4);
        r2 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x02cb }
        r3 = r7.f9229b;	 Catch:{ JSONException -> 0x02cb }
        r2.<init>(r3);	 Catch:{ JSONException -> 0x02cb }
        r2 = mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.PollUtils.PollDataParser(r2);	 Catch:{ JSONException -> 0x02cb }
        r3 = r1.f20728H;	 Catch:{ JSONException -> 0x02cb }
        r2 = r2.f8400b;	 Catch:{ JSONException -> 0x02cb }
        r3.setText(r2);	 Catch:{ JSONException -> 0x02cb }
        goto L_0x0480;
    L_0x02cb:
        r0 = move-exception;
        r2 = r0;
        r3 = "Error in parsing poll data.";
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6737b(r3, r2);
        goto L_0x0480;
    L_0x02d4:
        r5 = r1.f20729I;
        r5.setVisibility(r4);
        r4 = r1.f20728H;
        r5 = r1.f20747c;
        r6 = r7.f9229b;
        r7 = mobi.mmdt.ott.view.main.C4226f.m8056a(r8);
        r2 = r2.f21335u;
        r2 = mobi.mmdt.ott.view.tools.C4532q.m8242a(r5, r6, r7, r3, r2);
        r4.setText(r2);
        goto L_0x0480;
    L_0x02ee:
        r2 = r1.f20729I;
        r3 = r1.f20747c;
        r3 = android.support.v4.p029a.C0346c.m687c(r3, r10);
        r2.setBackgroundColor(r3);
        r2 = r1.f20729I;
        r2.setVisibility(r5);
        r2 = r1.f20747c;
        r2 = com.p085c.p086a.C1212c.m2872a(r2);
        r3 = 2131232038; // 0x7f080526 float:1.8080174E38 double:1.0529685333E-314;
        r3 = java.lang.Integer.valueOf(r3);
        r2 = r2.m10950a(r3);
        r3 = new com.c.a.g.f;
        r3.<init>();
        goto L_0x033b;
    L_0x0315:
        r2 = r1.f20729I;
        r3 = r1.f20747c;
        r3 = android.support.v4.p029a.C0346c.m687c(r3, r10);
        r2.setBackgroundColor(r3);
        r2 = r1.f20729I;
        r2.setVisibility(r5);
        r2 = r1.f20747c;
        r2 = com.p085c.p086a.C1212c.m2872a(r2);
        r3 = 2131231895; // 0x7f080497 float:1.8079884E38 double:1.0529684626E-314;
        r3 = java.lang.Integer.valueOf(r3);
        r2 = r2.m10950a(r3);
        r3 = new com.c.a.g.f;
        r3.<init>();
    L_0x033b:
        r3 = r3.m2959e();
    L_0x033f:
        r2 = r2.m3034a(r3);
        r2 = r2.m3033a();
        r3 = r1.f20729I;
        r2.m3031a(r3);
        goto L_0x0480;
    L_0x034e:
        r2 = r1.f20729I;
        r2.setBackgroundColor(r5);
        r2 = r1.f20729I;
        r2.setVisibility(r5);
        r2 = r7.f9231d;
        if (r2 == 0) goto L_0x0363;
    L_0x035c:
        r2 = r7.f9231d;
    L_0x035e:
        r6 = android.net.Uri.parse(r2);
        goto L_0x036a;
    L_0x0363:
        r2 = r7.f9230c;
        if (r2 == 0) goto L_0x036a;
    L_0x0367:
        r2 = r7.f9230c;
        goto L_0x035e;
    L_0x036a:
        r2 = r1.f20747c;
        r2 = com.p085c.p086a.C1212c.m2872a(r2);
        r2 = r2.m10950a(r6);
        r3 = new com.c.a.g.f;
        r3.<init>();
        r3 = r3.m2960f();
        goto L_0x033f;
    L_0x037e:
        r2 = r1.f20729I;
        r2.setBackgroundColor(r5);
        r2 = r1.f20729I;
        r2.setVisibility(r5);
        r2 = r7.f9231d;
        if (r2 == 0) goto L_0x0393;
    L_0x038c:
        r2 = r7.f9231d;
    L_0x038e:
        r6 = android.net.Uri.parse(r2);
        goto L_0x039a;
    L_0x0393:
        r2 = r7.f9230c;
        if (r2 == 0) goto L_0x039a;
    L_0x0397:
        r2 = r7.f9230c;
        goto L_0x038e;
    L_0x039a:
        r2 = r1.f20747c;
        r2 = com.p085c.p086a.C1212c.m2872a(r2);
        r2 = r2.m10958e();
        r2 = r2.m3037a(r6);
        r3 = new com.c.a.g.f;
        r3.<init>();
        goto L_0x03d9;
    L_0x03ae:
        r2 = r1.f20729I;
        r2.setBackgroundColor(r5);
        r2 = r1.f20729I;
        r2.setVisibility(r5);
        r2 = r7.f9231d;
        if (r2 == 0) goto L_0x03c3;
    L_0x03bc:
        r2 = r7.f9231d;
    L_0x03be:
        r6 = android.net.Uri.parse(r2);
        goto L_0x03ca;
    L_0x03c3:
        r2 = r7.f9230c;
        if (r2 == 0) goto L_0x03ca;
    L_0x03c7:
        r2 = r7.f9230c;
        goto L_0x03be;
    L_0x03ca:
        r2 = r1.f20747c;
        r2 = com.p085c.p086a.C1212c.m2872a(r2);
        r2 = r2.m10950a(r6);
        r3 = new com.c.a.g.f;
        r3.<init>();
    L_0x03d9:
        r3 = r3.m2959e();
        r4 = 2131231935; // 0x7f0804bf float:1.8079965E38 double:1.0529684824E-314;
        goto L_0x047a;
    L_0x03e2:
        r2 = r1.f20729I;
        r2.setVisibility(r4);
        goto L_0x0480;
    L_0x03e9:
        r2 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0400 }
        r3 = r7.f9229b;	 Catch:{ JSONException -> 0x0400 }
        r2.<init>(r3);	 Catch:{ JSONException -> 0x0400 }
        r3 = "LOCATION_LATITUDE";
        r3 = r2.getString(r3);	 Catch:{ JSONException -> 0x0400 }
        r4 = "LOCATION_LONGITUDE";
        r2 = r2.getString(r4);	 Catch:{ JSONException -> 0x03fd }
        goto L_0x0407;
    L_0x03fd:
        r0 = move-exception;
        r2 = r0;
        goto L_0x0403;
    L_0x0400:
        r0 = move-exception;
        r2 = r0;
        r3 = r6;
    L_0x0403:
        r2.printStackTrace();
        r2 = r6;
    L_0x0407:
        r2 = mobi.mmdt.ott.view.tools.C4521o.m8235a(r3, r2);
        r3 = r1.f20747c;
        r3 = com.p085c.p086a.C1212c.m2872a(r3);
        r3 = r3.m10958e();
        r2 = r3.m3037a(r2);
        r3 = new com.c.a.g.f;
        r3.<init>();
        r3 = r3.m2959e();
        r4 = 2131231935; // 0x7f0804bf float:1.8079965E38 double:1.0529684824E-314;
        r3 = r3.m2949a(r4);
        r2 = r2.m3034a(r3);
        r2 = r2.m3033a();
        r3 = r1.f20729I;
        r2.m3031a(r3);
        r2 = r1.f20728H;
        r3 = 2131690384; // 0x7f0f0390 float:1.900981E38 double:1.0531949863E-314;
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r3);
        r2.setText(r3);
        r2 = r1.f20729I;
        r2.setVisibility(r5);
        goto L_0x0480;
    L_0x0448:
        r2 = r1.f20729I;
        r2.setBackgroundColor(r5);
        r2 = r1.f20729I;
        r2.setVisibility(r5);
        r2 = r7.f9231d;
        if (r2 == 0) goto L_0x045d;
    L_0x0456:
        r2 = r7.f9231d;
    L_0x0458:
        r6 = android.net.Uri.parse(r2);
        goto L_0x0464;
    L_0x045d:
        r2 = r7.f9230c;
        if (r2 == 0) goto L_0x0464;
    L_0x0461:
        r2 = r7.f9230c;
        goto L_0x0458;
    L_0x0464:
        r2 = r1.f20747c;
        r2 = com.p085c.p086a.C1212c.m2872a(r2);
        r2 = r2.m10950a(r6);
        r3 = new com.c.a.g.f;
        r3.<init>();
        r3 = r3.m2959e();
        r4 = 2131232104; // 0x7f080568 float:1.8080308E38 double:1.052968566E-314;
    L_0x047a:
        r3 = r3.m2949a(r4);
        goto L_0x033f;
    L_0x0480:
        r2 = r1.f20760p;
        if (r2 == 0) goto L_0x049e;
    L_0x0484:
        r2 = r1.f20755k;
        if (r2 == 0) goto L_0x0491;
    L_0x0488:
        r2 = mobi.mmdt.ott.logic.stheme.UIThemeManager.getmInstance();
        r2 = r2.getOutput_link_message_text_color();
        goto L_0x0499;
    L_0x0491:
        r2 = mobi.mmdt.ott.logic.stheme.UIThemeManager.getmInstance();
        r2 = r2.getAccent_color();
    L_0x0499:
        r3 = r1.f20760p;
        mobi.mmdt.componentsutils.p232b.C2491i.m6796a(r3, r2);
    L_0x049e:
        r2 = r1.f20727G;
        if (r2 == 0) goto L_0x04ab;
    L_0x04a2:
        r2 = r19.m19038b();
        r3 = r1.f20727G;
        mobi.mmdt.componentsutils.p232b.C2491i.m6802a(r3, r2);
    L_0x04ab:
        r2 = r1.f20728H;
        if (r2 == 0) goto L_0x04b8;
    L_0x04af:
        r2 = r19.m19038b();
        r3 = r1.f20728H;
        mobi.mmdt.componentsutils.p232b.C2491i.m6802a(r3, r2);
    L_0x04b8:
        return;
    L_0x04b9:
        r2 = r1.f20725E;
        r2.setVisibility(r4);
        return;
    L_0x04bf:
        r2 = r1.f20725E;
        r2.setVisibility(r4);
    L_0x04c4:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.e.a.a.a(mobi.mmdt.ott.view.components.c.g):void");
    }

    protected final void m19050a(C7358a c7358a, View view) {
        if (view != null) {
            Context context;
            int i;
            if (c7358a.f20775a.equals(c7358a.f20777c)) {
                context = this.f20747c;
                i = R.color.balloon_color_input_reply;
            } else {
                context = this.f20747c;
                i = R.color.balloon_color_input;
            }
            view.setBackgroundColor(C0346c.m687c(context, i));
        }
    }

    protected final void m19051a(C7358a c7358a, View view, boolean z) {
        if (c7358a.f20775a.equals(c7358a.f20777c)) {
            if (this.f20748d != null) {
                this.f20748d.setBackgroundColor(C0346c.m687c(this.f20748d.getContext(), R.color.conversationReplyBackground));
                this.f20748d.setVisibility(0);
            } else {
                this.b.setBackgroundColor(C0346c.m687c(this.b.getContext(), R.color.conversationReplyBackground));
            }
        } else if (!c7358a.f20782h) {
            if (this.f20748d != null) {
                this.f20748d.setVisibility(8);
                this.f20748d.setBackgroundColor(0);
            } else {
                this.b.setBackgroundColor(0);
            }
        }
        if (view != null) {
            if (z) {
                m19040b(c7358a);
                C2491i.m6790a(view.getBackground(), UIThemeManager.getmInstance().getOutput_bubble_background_color());
                C7194a.m19031a(view, true);
                if (this.f20762r != null) {
                    C2491i.m6801a(this.f20762r, UIThemeManager.getmInstance().getOutput_bubble_background_color());
                }
                if (this.f20761q != null) {
                    C2491i.m6801a(this.f20761q, UIThemeManager.getmInstance().getOutput_bubble_background_color());
                    return;
                }
            }
            m19040b(c7358a);
            if (this.f20766v != null) {
                C2491i.m6796a(this.f20766v, UIThemeManager.getmInstance().getInput_bubble_background_color());
            }
            if (this.f20763s != null) {
                C2491i.m6801a(this.f20763s, UIThemeManager.getmInstance().getInput_bubble_background_color());
            }
            if (this.f20764t != null) {
                C2491i.m6801a(this.f20764t, UIThemeManager.getmInstance().getInput_bubble_background_color());
            }
            C2491i.m6790a(view.getBackground(), UIThemeManager.getmInstance().getInput_bubble_background_color());
            C7194a.m19031a(view, false);
        }
    }

    protected final void m19052b(C7358a c7358a, View view, boolean z) {
        View view2;
        int i = 0;
        if (!c7358a.f20775a.equals(c7358a.f20777c)) {
            if (!c7358a.f20782h) {
                if (this.f20748d != null) {
                    this.f20748d.setBackgroundColor(0);
                    view2 = this.f20748d;
                    i = 8;
                } else {
                    this.b.setBackgroundColor(0);
                }
            }
            if (view != null) {
                if (z) {
                    m19040b(c7358a);
                    C2491i.m6790a(view.getBackground(), UIThemeManager.getmInstance().getInput_bubble_background_color());
                } else {
                    C2491i.m6790a(view.getBackground(), UIThemeManager.getmInstance().getOutput_bubble_background_color());
                    m19040b(c7358a);
                    return;
                }
            }
        } else if (this.f20748d != null) {
            this.f20748d.setBackgroundColor(C0346c.m687c(this.f20748d.getContext(), R.color.conversationReplyBackground));
            view2 = this.f20748d;
        } else {
            this.b.setBackgroundColor(C0346c.m687c(this.b.getContext(), R.color.conversationReplyBackground));
            if (view != null) {
                if (z) {
                    C2491i.m6790a(view.getBackground(), UIThemeManager.getmInstance().getOutput_bubble_background_color());
                    m19040b(c7358a);
                    return;
                }
                m19040b(c7358a);
                C2491i.m6790a(view.getBackground(), UIThemeManager.getmInstance().getInput_bubble_background_color());
            }
        }
        view2.setVisibility(i);
        if (view != null) {
            if (z) {
                C2491i.m6790a(view.getBackground(), UIThemeManager.getmInstance().getOutput_bubble_background_color());
                m19040b(c7358a);
                return;
            }
            m19040b(c7358a);
            C2491i.m6790a(view.getBackground(), UIThemeManager.getmInstance().getInput_bubble_background_color());
        }
    }
}
