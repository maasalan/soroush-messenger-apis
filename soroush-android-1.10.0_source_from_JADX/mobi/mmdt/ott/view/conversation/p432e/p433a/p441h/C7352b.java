package mobi.mmdt.ott.view.conversation.p432e.p433a.p441h;

import android.app.Activity;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p432e.p433a.C7194a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7558b;

public abstract class C7352b extends C7194a {
    private TextView f21277d = ((TextView) this.itemView.findViewById(R.id.sender_textView));
    private TextView f21278e = ((TextView) this.itemView.findViewById(R.id.visit_count_textView));
    private TextView f21279f = ((TextView) this.itemView.findViewById(R.id.like_count_textView));

    public C7352b(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, i, c3286g, c3284e, true);
    }

    protected void mo3180a(C6829g c6829g) {
        TextView textView;
        int i;
        super.mo3180a(c6829g);
        C7558b c7558b = (C7558b) c6829g;
        if (c7558b.mo3629f() == null || c7558b.mo3629f().isEmpty() || c7558b.f19503j == 6111 || c7558b.f19503j == 6115) {
            textView = this.f21277d;
            i = 8;
        } else {
            if (!(this.f21278e == null || this.f21279f == null)) {
                long j = (long) c7558b.f23106W;
                this.f21278e.setText(C2491i.m6765a(this.c, (float) ((long) c7558b.f23107X)));
                this.f21279f.setText(C2491i.m6765a(this.c, (float) j));
            }
            this.f21277d.setText(m19048a(c7558b.mo3627d(), c7558b.mo3628e(), c7558b.mo3629f()), BufferType.SPANNABLE);
            this.f21277d.setMovementMethod(LinkMovementMethod.getInstance());
            textView = this.f21277d;
            i = 0;
        }
        textView.setVisibility(i);
    }
}
