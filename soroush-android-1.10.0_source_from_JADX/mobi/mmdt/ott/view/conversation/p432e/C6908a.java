package mobi.mmdt.ott.view.conversation.p432e;

import android.support.v4.p029a.C0346c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.conversation.p573f.C7197a;
import mobi.mmdt.ott.view.tools.C4522p;

public abstract class C6908a extends C6073e {
    protected ViewGroup f19653b = ((ViewGroup) this.itemView.findViewById(R.id.root_chat_item_layout));
    private View f19654c = this.itemView.findViewById(R.id.top_root_chat_item_layout);
    private TextView f19655d = ((TextView) this.itemView.findViewById(R.id.unread_textView));
    private View f19656e = this.itemView.findViewById(R.id.date_viewInclude);
    private View f19657f = this.itemView.findViewById(R.id.unread_viewInclude);
    private TextView f19658g = ((TextView) this.itemView.findViewById(R.id.date_textView));

    public C6908a(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        super(layoutInflater, viewGroup, i, null);
    }

    protected final void m17835a(C7197a c7197a) {
        if (c7197a.f20778d) {
            this.f19656e.setVisibility(0);
            this.f19658g.setText(c7197a.f20776b);
        } else {
            this.f19656e.setVisibility(8);
        }
        if (c7197a.f20779e) {
            this.f19657f.setVisibility(0);
            if (this.f19655d != null) {
                this.f19655d.setText(C4522p.m8236a(R.string.unread_messages));
            }
        } else {
            this.f19657f.setVisibility(8);
        }
        boolean z = c7197a.f20782h;
        if (this.f19654c != null) {
            if (z) {
                C2491i.m6796a(this.f19654c, C0346c.m687c(this.f19654c.getContext(), R.color.conversationSelectedBackground));
                this.f19654c.setVisibility(0);
                return;
            }
            this.f19654c.setVisibility(8);
        } else if (z) {
            C2491i.m6796a(this.f19653b, C0346c.m687c(this.f19653b.getContext(), R.color.conversationSelectedBackground));
        } else {
            this.f19653b.setBackgroundColor(0);
        }
    }
}
