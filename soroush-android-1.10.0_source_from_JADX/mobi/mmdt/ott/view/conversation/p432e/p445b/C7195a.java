package mobi.mmdt.ott.view.conversation.p432e.p445b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.support.v4.p029a.C0346c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.conversation.p432e.C6908a;
import mobi.mmdt.ott.view.conversation.p573f.p598b.C7359a;

public abstract class C7195a extends C6908a {
    protected Activity f20771c;
    protected TextView f20772d = ((TextView) this.itemView.findViewById(R.id.time_textView));
    private TextView f20773e = ((TextView) this.itemView.findViewById(R.id.message_textView));

    public C7195a(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        super(layoutInflater, viewGroup, i);
        this.f20771c = activity;
    }

    protected final void m19053a(C7359a c7359a) {
        super.m17835a(c7359a);
        this.f20772d.setText(c7359a.f21344o);
        C2491i.m6802a(this.f20772d, UIThemeManager.getmInstance().getDate_bubble_text_color());
    }

    @TargetApi(16)
    protected final void m19054a(C7359a c7359a, View view) {
        ViewGroup viewGroup;
        int c;
        if (c7359a.f20775a.equals(c7359a.f20777c)) {
            viewGroup = this.b;
            c = C0346c.m687c(this.b.getContext(), R.color.conversationReplyBackground);
        } else {
            if (!c7359a.f20782h) {
                viewGroup = this.b;
                c = 0;
            }
            if (view != null) {
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
                C2491i.m6790a(view.getBackground(), UIThemeManager.getmInstance().getDate_bubble_background_color());
            }
        }
        viewGroup.setBackgroundColor(c);
        if (view != null) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
            C2491i.m6790a(view.getBackground(), UIThemeManager.getmInstance().getDate_bubble_background_color());
        }
    }
}
