package mobi.mmdt.ott.view.conversation.p432e.p433a.p443j;

import android.app.Activity;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p432e.p433a.C7194a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7560b;

public abstract class C7354b extends C7194a {
    private ImageView f21287d = ((ImageView) this.itemView.findViewById(R.id.heart_imageView));
    private ImageView f21288e = ((ImageView) this.itemView.findViewById(R.id.eye_imageView));
    private TextView f21289f = ((TextView) this.itemView.findViewById(R.id.sender_textView));
    private TextView f21290g = ((TextView) this.itemView.findViewById(R.id.visit_count_textView));
    private TextView f21291h = ((TextView) this.itemView.findViewById(R.id.like_count_textView));

    public C7354b(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, i, c3286g, c3284e, true);
        if (this.f21287d != null) {
            this.f21287d.setVisibility(8);
        }
        if (this.f21288e != null) {
            this.f21288e.setVisibility(8);
        }
    }

    protected void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7560b c7560b = (C7560b) c6829g;
        if (c7560b.mo3629f() == null || c7560b.mo3629f().isEmpty() || c7560b.f19503j == 6111 || c7560b.f19503j == 6115) {
            this.f21289f.setVisibility(8);
            return;
        }
        if (!(this.f21290g == null || this.f21291h == null)) {
            long j = (long) c7560b.f23113X;
            long j2 = (long) c7560b.f23112W;
            if (this.f21288e != null) {
                if (j > 0) {
                    this.f21288e.setVisibility(0);
                } else {
                    this.f21288e.setVisibility(8);
                }
            }
            this.f21290g.setText(C2491i.m6765a(this.c, (float) j));
            if (this.f21287d != null) {
                if (j2 > 0) {
                    this.f21287d.setVisibility(0);
                } else {
                    this.f21287d.setVisibility(8);
                }
            }
            this.f21291h.setText(C2491i.m6765a(this.c, (float) j2));
        }
        this.f21289f.setText(m19048a(c7560b.mo3627d(), c7560b.mo3628e(), c7560b.mo3629f()), BufferType.SPANNABLE);
        this.f21289f.setMovementMethod(LinkMovementMethod.getInstance());
        this.f21289f.setVisibility(0);
    }
}
