package mobi.mmdt.ott.view.conversation.p432e.p433a.p434a;

import android.app.Activity;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p418a.C3288i;
import mobi.mmdt.ott.view.conversation.p432e.p433a.C7194a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7581b;

public abstract class C7345b extends C7194a {
    private ImageView f21215d = ((ImageView) this.itemView.findViewById(R.id.forward_imageView));
    private ImageView f21216e = ((ImageView) this.itemView.findViewById(R.id.heart_imageView));
    private ImageView f21217f = ((ImageView) this.itemView.findViewById(R.id.eye_imageView));
    private TextView f21218g = ((TextView) this.itemView.findViewById(R.id.like_count_textView));
    private TextView f21219h = ((TextView) this.itemView.findViewById(R.id.visit_count_textView));
    private ImageView f21220i = ((ImageView) this.itemView.findViewById(R.id.like_imageView));
    private TextView f21221j = ((TextView) this.itemView.findViewById(R.id.sender_textView));
    private RoundAvatarImageView f21222k = ((RoundAvatarImageView) this.itemView.findViewById(R.id.sender_imageView));
    private C3288i f21223l;

    public C7345b(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, C3288i c3288i, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, i, c3286g, c3284e, false);
        this.f21223l = c3288i;
        this.c = activity;
    }

    protected void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7581b c7581b = (C7581b) c6829g;
        if (c7581b.mo3629f() == null || c7581b.mo3629f().isEmpty() || c7581b.f19503j == 66) {
            this.f21221j.setVisibility(8);
        } else {
            this.f21221j.setText(m19048a(c7581b.mo3627d(), c7581b.mo3628e(), c7581b.mo3629f()), BufferType.SPANNABLE);
            this.f21221j.setMovementMethod(LinkMovementMethod.getInstance());
        }
        View[] viewArr = new View[]{this.f21220i, this.f21219h, this.f21218g, this.f21217f, this.f21216e};
        for (int i = 0; i < 5; i++) {
            View view = viewArr[i];
            if (view != null) {
                view.setVisibility(8);
            }
        }
        if (this.f21215d != null) {
            this.f21215d.setVisibility(0);
        }
    }
}
