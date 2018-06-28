package com.p196h.p197a;

import android.annotation.SuppressLint;
import android.widget.RelativeLayout;
import android.widget.TextView;

@SuppressLint({"ViewConstructor"})
final class C2127d extends RelativeLayout {
    RelativeLayout f7121a;
    TextView f7122b;

    final void m5804a(Character ch) {
        TextView textView = this.f7122b;
        CharSequence ch2 = ch.toString();
        if (ch2 != null) {
            int length = ch2.length();
            if (length != 0) {
                char charAt = ch2.charAt(0);
                if (!Character.isTitleCase(charAt)) {
                    StringBuilder stringBuilder = new StringBuilder(length);
                    stringBuilder.append(Character.toTitleCase(charAt));
                    stringBuilder.append(ch2.substring(1));
                    ch2 = stringBuilder.toString();
                }
            }
        }
        textView.setText(ch2);
    }
}
