package mobi.mmdt.ott.view.tools.p480d;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig.Builder;

public final class C4503a {
    public static String m8194a(String str) {
        Object obj;
        int hashCode = str.hashCode();
        if (hashCode != -898729016) {
            if (hashCode == 15060076) {
                if (str.equals("IRANSansMobile-Light.ttf")) {
                    obj = null;
                    switch (obj) {
                        case null:
                            return "IRAN Sans";
                        case 1:
                            return "Noto Naskh Arabic";
                        default:
                            return "";
                    }
                }
            }
        } else if (str.equals("NotoNaskhArabicUI-Regular.ttf")) {
            obj = 1;
            switch (obj) {
                case null:
                    return "IRAN Sans";
                case 1:
                    return "Noto Naskh Arabic";
                default:
                    return "";
            }
        }
        obj = -1;
        switch (obj) {
            case null:
                return "IRAN Sans";
            case 1:
                return "Noto Naskh Arabic";
            default:
                return "";
        }
    }

    public static void m8195a() {
        Builder builder = new Builder();
        StringBuilder stringBuilder = new StringBuilder("fonts/");
        stringBuilder.append(C2535a.m6888a().at());
        CalligraphyConfig.initDefault(builder.setDefaultFontPath(stringBuilder.toString()).setFontAttrId(R.attr.fontPath).build());
    }

    public static void m8196a(boolean z, TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            AssetManager assets = textView.getContext().getAssets();
            StringBuilder stringBuilder = new StringBuilder("fonts/");
            stringBuilder.append(C2535a.m6888a().at());
            textView.setTypeface(Typeface.createFromAsset(assets, stringBuilder.toString()));
            if (z) {
                C2491i.m6803a(textView);
            }
        }
    }

    public static void m8197b(String str) {
        C2535a.m6888a().f8278a.edit().putString("mobi.mmdt.ott.model.pref.KEY_CURRENT_DEFAULT_FONT1", str).apply();
        C4503a.m8195a();
    }
}
