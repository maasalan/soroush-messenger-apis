package mobi.mmdt.ott.view.conversation.p432e.p433a.p437d;

import android.app.Activity;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.provider.p390l.C3004f;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3280a;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p432e.p433a.C7194a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7554b;

public abstract class C7348b extends C7194a {
    protected C3280a f21240d;
    private ImageView f21241e = ((ImageView) this.itemView.findViewById(R.id.forward_imageView));
    private TextView f21242f = ((TextView) this.itemView.findViewById(R.id.visit_count_textView));
    private TextView f21243g = ((TextView) this.itemView.findViewById(R.id.like_count_textView));
    private TextView f21244h = ((TextView) this.itemView.findViewById(R.id.sender_textView));
    private RoundAvatarImageView f21245i = ((RoundAvatarImageView) this.itemView.findViewById(R.id.sender_imageView));
    private ImageView f21246j = ((ImageView) this.itemView.findViewById(R.id.heart_imageView));
    private ImageView f21247k = ((ImageView) this.itemView.findViewById(R.id.eye_imageView));

    public C7348b(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, C3280a c3280a, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, i, c3286g, c3284e, true);
        this.f21240d = c3280a;
    }

    protected void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7554b c7554b = (C7554b) c6829g;
        if (c7554b.mo3629f() == null || c7554b.mo3629f().isEmpty() || c7554b.f19503j == 65) {
            this.f21244h.setVisibility(8);
        } else {
            this.f21244h.setText(m19048a(c7554b.mo3627d(), c7554b.mo3628e(), c7554b.mo3629f()), BufferType.SPANNABLE);
            this.f21244h.setMovementMethod(LinkMovementMethod.getInstance());
            this.f21244h.setVisibility(0);
        }
        if (c7554b.af != C3004f.ADMIN) {
            if (c7554b.af != C3004f.OWNER) {
                this.f21242f.setVisibility(8);
                this.f21247k.setVisibility(8);
                this.f21243g.setVisibility(8);
                if (this.f21246j != null) {
                    this.f21246j.setVisibility(8);
                }
                if (this.f21241e != null) {
                    this.f21241e.setVisibility(0);
                }
            }
        }
        this.f21242f.setVisibility(0);
        this.f21247k.setVisibility(0);
        this.f21243g.setVisibility(0);
        if (this.f21246j != null) {
            this.f21246j.setVisibility(0);
        }
        this.f21242f.setText(C2491i.m6810b(this.c, (float) ((long) c7554b.ae)));
        this.f21243g.setText(C2491i.m6810b(this.c, (float) ((long) c7554b.ad)));
        if (this.f21241e != null) {
            this.f21241e.setVisibility(0);
        }
    }
}
