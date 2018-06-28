package mobi.mmdt.ott.view.conversation.p432e.p445b;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p573f.p598b.C7563d;

public final class C7357d extends C7195a {
    private final TextView f21299e = ((TextView) this.itemView.findViewById(R.id.message_textView));

    public C7357d(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_head_message_list_item);
    }

    protected final void mo3180a(C6829g c6829g) {
        C7563d c7563d = (C7563d) c6829g;
        super.m19053a(c7563d);
        this.f21299e.setText(c7563d.f21343n);
    }
}
