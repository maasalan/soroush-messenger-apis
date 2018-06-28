package mobi.mmdt.ott.view.conversation.p432e.p445b;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p573f.p598b.C7561b;

public final class C7355b extends C7195a {
    private final TextView f21292e = ((TextView) this.itemView.findViewById(R.id.message_textView));
    private ImageView f21293f = ((ImageView) this.itemView.findViewById(R.id.call_type_imageView));
    private LinearLayout f21294g = ((LinearLayout) this.itemView.findViewById(R.id.call_linear_layout));

    public C7355b(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_call_log_list_item);
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        C7561b c7561b = (C7561b) c6829g;
        super.m19053a(c7561b);
        this.f21292e.setText(c7561b.f21343n);
        switch (c7561b.f23114r) {
            case 1:
                imageView = this.f21293f;
                i = R.drawable.ic_communication_call_missed;
                break;
            case 2:
                imageView = this.f21293f;
                i = R.drawable.ic_communication_call_received;
                break;
            case 3:
                imageView = this.f21293f;
                i = R.drawable.ic_communication_call_made;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        m19054a(c7561b, this.f21294g);
        C2491i.m6802a(this.f21292e, UIThemeManager.getmInstance().getDate_bubble_text_color());
    }
}
