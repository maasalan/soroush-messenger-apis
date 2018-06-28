package mobi.mmdt.ott.view.main.p454c.p455a.p456a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p561a.C7160d;
import mobi.mmdt.ott.provider.p385g.C2978e;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6071a;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.forward.C4054e;
import mobi.mmdt.ott.view.main.p454c.p455a.p457b.C7365a;
import mobi.mmdt.ott.view.main.p459d.p460a.C4185a;

public final class C6921a extends C6071a {
    private boolean f19752c = false;
    private C7160d f19753d;
    private C4185a f19754e;
    private C4054e f19755f;

    class C41682 implements OnLongClickListener {
        final /* synthetic */ C6921a f11908a;

        C41682(C6921a c6921a) {
            this.f11908a = c6921a;
        }

        public final boolean onLongClick(View view) {
            this.f11908a.f19754e.mo3243b(this.f11908a.f16238b);
            return true;
        }
    }

    public C6921a(int i, Context context, ViewGroup viewGroup, C3126i c3126i, C4185a c4185a, C4054e c4054e, boolean z) {
        super(C7160d.m18901a(LayoutInflater.from(context), viewGroup), i, c3126i);
        this.f19754e = c4185a;
        this.f19755f = c4054e;
        this.f19752c = z;
    }

    protected final void mo3188b() {
        this.f19753d = (C7160d) this.f16237a;
        C2491i.m6796a(this.f19753d.f20527f, UIThemeManager.getmInstance().getLine_divider_in_main_activity_color());
        C2491i.m6796a(this.f19753d.f20528g, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6802a(this.f19753d.f20528g, UIThemeManager.getmInstance().getButton_text_color());
        C2491i.m6802a(this.f19753d.f20535n, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f19753d.f20537p, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6802a(this.f19753d.f20538q, UIThemeManager.getmInstance().getButton_text_color());
        C2491i.m6802a(this.f19753d.f20536o, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6801a(this.f19753d.f20531j, UIThemeManager.getmInstance().getPin_image_color());
        C2491i.m6828c(this.f19753d.f20537p, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6799a(this.f19753d.f20526e, UIThemeManager.getmInstance().getAccent_color());
        this.f19753d.f20538q.setTypeface(this.f19753d.f20538q.getTypeface(), 1);
    }

    protected final void mo3189b(C6829g c6829g) {
        ImageView imageView;
        int i;
        ImageView imageView2;
        Drawable background;
        final C7365a c7365a = (C7365a) c6829g;
        this.f19753d = (C7160d) this.f16237a;
        this.f19753d.m18905a(c7365a);
        this.f19753d.m18906a(this.f19754e);
        this.f19753d.m18904a(this.f19755f);
        this.f19753d.m14843b();
        if (c7365a.f21397x) {
            this.f19753d.f20532k.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ C6921a f11907b;

                public final void onClick(View view) {
                    if (this.f11907b.f19752c) {
                        this.f11907b.f19753d.f20526e.performClick();
                    } else {
                        this.f11907b.f19755f.mo2377e(c7365a.k);
                    }
                }
            });
        }
        this.f19753d.f20532k.setOnLongClickListener(new C41682(this));
        int i2 = 1;
        int i3 = c7365a.f20831y == C2978e.CHANNEL ? 1 : 0;
        if (c7365a.f20831y != C2978e.BOT) {
            i2 = 0;
        }
        if (i3 == 0) {
            if (i2 == 0) {
                if (c7365a.f20831y == C2978e.GROUP) {
                    imageView = this.f19753d.f20530i;
                    i = R.drawable.ic_group_conversation;
                    imageView.setImageResource(i);
                    this.f19753d.f20530i.setVisibility(0);
                    if (i3 == 0 && c7365a.f21395v) {
                        imageView2 = this.f19753d.f20530i;
                        i2 = UIThemeManager.getmInstance().getAccent_color();
                    } else {
                        imageView2 = this.f19753d.f20530i;
                        i2 = UIThemeManager.getmInstance().getText_primary_color();
                    }
                    C2491i.m6801a(imageView2, i2);
                    if (!this.f19752c) {
                        this.f19753d.f20526e.setVisibility(8);
                    }
                    this.f19753d.f20538q.setBackgroundResource(R.drawable.circle_shape_unread_message_count);
                    if (c7365a.f21392s) {
                        background = this.f19753d.f20538q.getBackground();
                        i3 = UIThemeManager.getmInstance().getMute_unread_count_color();
                    } else {
                        background = this.f19753d.f20538q.getBackground();
                        i3 = UIThemeManager.getmInstance().getAccent_color();
                    }
                    C2491i.m6790a(background, i3);
                }
                this.f19753d.f20530i.setVisibility(8);
                this.f19753d.f20530i.setImageResource(0);
                if (i3 == 0) {
                }
                imageView2 = this.f19753d.f20530i;
                i2 = UIThemeManager.getmInstance().getText_primary_color();
                C2491i.m6801a(imageView2, i2);
                if (this.f19752c) {
                    this.f19753d.f20526e.setVisibility(8);
                }
                this.f19753d.f20538q.setBackgroundResource(R.drawable.circle_shape_unread_message_count);
                if (c7365a.f21392s) {
                    background = this.f19753d.f20538q.getBackground();
                    i3 = UIThemeManager.getmInstance().getAccent_color();
                } else {
                    background = this.f19753d.f20538q.getBackground();
                    i3 = UIThemeManager.getmInstance().getMute_unread_count_color();
                }
                C2491i.m6790a(background, i3);
            }
        }
        imageView = this.f19753d.f20530i;
        i = R.drawable.ic_channel_conversation_black;
        imageView.setImageResource(i);
        this.f19753d.f20530i.setVisibility(0);
        if (i3 == 0) {
        }
        imageView2 = this.f19753d.f20530i;
        i2 = UIThemeManager.getmInstance().getText_primary_color();
        C2491i.m6801a(imageView2, i2);
        if (this.f19752c) {
            this.f19753d.f20526e.setVisibility(8);
        }
        this.f19753d.f20538q.setBackgroundResource(R.drawable.circle_shape_unread_message_count);
        if (c7365a.f21392s) {
            background = this.f19753d.f20538q.getBackground();
            i3 = UIThemeManager.getmInstance().getMute_unread_count_color();
        } else {
            background = this.f19753d.f20538q.getBackground();
            i3 = UIThemeManager.getmInstance().getAccent_color();
        }
        C2491i.m6790a(background, i3);
    }
}
