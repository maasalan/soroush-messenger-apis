package mobi.mmdt.ott.view.conversation.p432e.p433a.p435b;

import android.app.Activity;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3280a;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p432e.p433a.C7194a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7582b;

public abstract class C7346b extends C7194a {
    protected C3280a f21224d;
    private ImageView f21225e;
    private TextView f21226f = ((TextView) this.itemView.findViewById(R.id.sender_textView));
    private RoundAvatarImageView f21227g = ((RoundAvatarImageView) this.itemView.findViewById(R.id.sender_imageView));
    private ImageView f21228h;
    private TextView f21229i;

    public C7346b(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, C3280a c3280a, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, i, c3286g, c3284e, true);
        this.f21224d = c3280a;
        this.f21228h = (ImageView) this.itemView.findViewById(R.id.forward_imageView);
        this.f21229i = (TextView) this.itemView.findViewById(R.id.like_count_textView);
        this.f21225e = (ImageView) this.itemView.findViewById(R.id.heart_imageView);
    }

    protected void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7582b c7582b = (C7582b) c6829g;
        if (c7582b.mo3629f() == null || c7582b.mo3629f().isEmpty() || c7582b.f19503j == 67) {
            this.f21226f.setVisibility(8);
        } else {
            this.f21226f.setText(m19048a(c7582b.mo3627d(), c7582b.mo3628e(), c7582b.mo3629f()), BufferType.SPANNABLE);
            this.f21226f.setMovementMethod(LinkMovementMethod.getInstance());
            this.f21226f.setVisibility(0);
        }
        if (this.f21228h != null) {
            this.f21228h.setVisibility(0);
        }
        if (this.f21229i != null) {
            this.f21229i.setVisibility(8);
        }
        if (this.f21225e != null) {
            this.f21225e.setVisibility(8);
        }
    }
}
