package mobi.mmdt.ott.view.components.imageslider.p408b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import mobi.mmdt.ott.R;

public final class C6096b extends C3188a {
    public C6096b(Context context) {
        super(context);
    }

    public final View mo2273b() {
        View inflate = LayoutInflater.from(m7687a()).inflate(R.layout.render_type_text, null);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.daimajia_slider_image);
        ((TextView) inflate.findViewById(R.id.description)).setText(this.f9916e);
        m7690a(inflate, imageView);
        return inflate;
    }
}
