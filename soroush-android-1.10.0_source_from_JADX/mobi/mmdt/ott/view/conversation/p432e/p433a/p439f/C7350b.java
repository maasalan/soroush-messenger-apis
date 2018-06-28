package mobi.mmdt.ott.view.conversation.p432e.p433a.p439f;

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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7556b;

public abstract class C7350b extends C7194a {
    protected C3280a f21260d;
    private ImageView f21261e = ((ImageView) this.itemView.findViewById(R.id.forward_imageView));
    private TextView f21262f = ((TextView) this.itemView.findViewById(R.id.visit_count_textView));
    private TextView f21263g = ((TextView) this.itemView.findViewById(R.id.like_count_textView));
    private TextView f21264h = ((TextView) this.itemView.findViewById(R.id.sender_textView));
    private RoundAvatarImageView f21265i = ((RoundAvatarImageView) this.itemView.findViewById(R.id.sender_imageView));
    private ImageView f21266j = ((ImageView) this.itemView.findViewById(R.id.heart_imageView));
    private ImageView f21267k = ((ImageView) this.itemView.findViewById(R.id.eye_imageView));

    public C7350b(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, C3280a c3280a, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, i, c3286g, c3284e, true);
        this.f21260d = c3280a;
    }

    protected void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7556b c7556b = (C7556b) c6829g;
        if (c7556b.mo3629f() == null || c7556b.mo3629f().isEmpty() || c7556b.f19503j == 65) {
            this.f21264h.setVisibility(8);
        } else {
            this.f21264h.setText(m19048a(c7556b.mo3627d(), c7556b.mo3628e(), c7556b.mo3629f()), BufferType.SPANNABLE);
            this.f21264h.setMovementMethod(LinkMovementMethod.getInstance());
            this.f21264h.setVisibility(0);
        }
        if (c7556b.f23098Z != C3004f.ADMIN) {
            if (c7556b.f23098Z != C3004f.OWNER) {
                this.f21262f.setVisibility(8);
                if (this.f21267k != null) {
                    this.f21267k.setVisibility(8);
                }
                this.f21263g.setVisibility(8);
                if (this.f21266j != null) {
                    this.f21266j.setVisibility(8);
                }
                if (this.f21261e != null) {
                    this.f21261e.setVisibility(0);
                }
            }
        }
        this.f21262f.setVisibility(0);
        if (this.f21267k != null) {
            this.f21267k.setVisibility(0);
        }
        this.f21263g.setVisibility(0);
        if (this.f21266j != null) {
            this.f21266j.setVisibility(0);
        }
        this.f21262f.setText(C2491i.m6810b(this.c, (float) ((long) c7556b.f23097Y)));
        this.f21263g.setText(C2491i.m6810b(this.c, (float) ((long) c7556b.f23096X)));
        if (this.f21261e != null) {
            this.f21261e.setVisibility(0);
        }
    }
}
