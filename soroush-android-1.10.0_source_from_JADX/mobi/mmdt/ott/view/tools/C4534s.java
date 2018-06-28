package mobi.mmdt.ott.view.tools;

import android.app.Activity;
import android.view.View;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.imageslider.SliderLayout;
import mobi.mmdt.ott.view.components.imageslider.SliderLayout.C3169a;
import mobi.mmdt.ott.view.components.imageslider.SliderLayout.C3170b;
import mobi.mmdt.ott.view.components.imageslider.p408b.C3188a.C3186b;

public final class C4534s {
    public final View f12493a;
    public C3186b f12494b;
    public SliderLayout f12495c = ((SliderLayout) this.f12493a.findViewById(R.id.slider));

    public C4534s(Activity activity, C3186b c3186b) {
        this.f12494b = c3186b;
        this.f12493a = activity.getLayoutInflater().inflate(R.layout.slider_banner_layout, null, false);
        this.f12495c.setPresetTransformer(C3170b.Accordion);
        this.f12495c.setPresetIndicator(C3169a.Center_Bottom);
        this.f12495c.m7647a();
    }
}
