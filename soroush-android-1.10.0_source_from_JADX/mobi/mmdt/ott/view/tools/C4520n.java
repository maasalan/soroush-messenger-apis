package mobi.mmdt.ott.view.tools;

import android.text.util.Linkify;
import android.text.util.Linkify.TransformFilter;
import android.util.Patterns;
import android.widget.TextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class C4520n {

    static class C45181 implements TransformFilter {
        C45181() {
        }

        public final String transformUrl(Matcher matcher, String str) {
            StringBuilder stringBuilder = new StringBuilder("https://sapp.ir/");
            stringBuilder.append(str.substring(1, str.length()));
            return stringBuilder.toString();
        }
    }

    static class C45192 implements TransformFilter {
        C45192() {
        }

        public final String transformUrl(Matcher matcher, String str) {
            StringBuilder stringBuilder = new StringBuilder("#");
            stringBuilder.append(str.substring(1, str.length()));
            return stringBuilder.toString();
        }
    }

    public static void m8234a(TextView textView) {
        TransformFilter c45181 = new C45181();
        TransformFilter c45192 = new C45192();
        Linkify.addLinks(textView, 1);
        Linkify.addLinks(textView, Pattern.compile("@[A-Za-z0-9_.]+"), null, null, c45181);
        Linkify.addLinks(textView, Pattern.compile("#[^#\\s]+"), null, null, c45192);
        Linkify.addLinks(textView, Patterns.PHONE, "tel:");
        Linkify.addLinks(textView, Patterns.EMAIL_ADDRESS, "mailto:");
    }
}
