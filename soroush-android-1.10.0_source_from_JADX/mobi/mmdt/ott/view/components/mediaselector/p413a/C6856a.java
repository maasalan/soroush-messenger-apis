package mobi.mmdt.ott.view.components.mediaselector.p413a;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.mediaselector.p567b.C7331b;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;

public final class C6856a extends C6073e {
    private Activity f19556b;
    private ImageView f19557c = ((ImageView) this.itemView.findViewById(R.id.content_imageView));
    private View f19558d = this.itemView.findViewById(R.id.bottom_gradient_view);
    private TextView f19559e = ((TextView) this.itemView.findViewById(R.id.filesCount_textView));
    private TextView f19560f = ((TextView) this.itemView.findViewById(R.id.folderName_textView));

    public C6856a(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2) {
        super(layoutInflater, viewGroup, R.layout.media_folder_list_item, null);
        this.f19556b = activity;
        this.f19560f.setShadowLayer(15.0f, 0.0f, 0.0f, -16777216);
        this.f19559e.setShadowLayer(15.0f, 0.0f, 0.0f, -16777216);
        LayoutParams layoutParams = (LayoutParams) this.f19557c.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        LayoutParams layoutParams2 = (LayoutParams) this.f19558d.getLayoutParams();
        layoutParams2.height = (int) this.f19556b.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams2.width = i;
    }

    protected final void mo3180a(C6829g c6829g) {
        C7331b c7331b = (C7331b) c6829g;
        this.f19560f.setText(c7331b.f21128a);
        this.f19559e.setText(c7331b.f21131d);
        this.f19557c.setImageBitmap(null);
        if (c7331b.f21130c != null) {
            C1212c.m2872a(this.f19556b).m10958e().m3037a(c7331b.f21130c).m3034a(new C1248f().m2959e()).m3033a().m3031a(this.f19557c);
        }
    }
}
