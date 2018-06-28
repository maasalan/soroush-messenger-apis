package mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatTextView;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView.BufferType;
import mobi.mmdt.ott.C2540d.C2534a;

public class EmojiconTextView extends AppCompatTextView {
    private int f19670a;
    private int f19671b;
    private int f19672c;
    private int f19673d = 0;
    private int f19674e = -1;
    private boolean f19675f = false;

    public EmojiconTextView(Context context) {
        super(context);
        m17841a(null);
    }

    public EmojiconTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m17841a(attributeSet);
    }

    public EmojiconTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m17841a(attributeSet);
    }

    private void m17841a(AttributeSet attributeSet) {
        this.f19672c = (int) getTextSize();
        if (attributeSet == null) {
            this.f19670a = (int) getTextSize();
        } else {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2534a.Emojicon);
            this.f19670a = (int) obtainStyledAttributes.getDimension(1, getTextSize());
            this.f19671b = obtainStyledAttributes.getInt(0, 1);
            this.f19673d = obtainStyledAttributes.getInteger(3, 0);
            this.f19674e = obtainStyledAttributes.getInteger(2, -1);
            this.f19675f = obtainStyledAttributes.getBoolean(4, false);
            obtainStyledAttributes.recycle();
        }
        setText(getText());
    }

    public void setEmojiconSize(int i) {
        this.f19670a = i;
        super.setText(getText());
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        if (!TextUtils.isEmpty(charSequence)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            C4027a.m7905a(getContext(), spannableStringBuilder, this.f19670a, this.f19671b, this.f19672c, this.f19673d, this.f19674e, this.f19675f);
            charSequence = spannableStringBuilder;
        }
        super.setText(charSequence, bufferType);
    }

    public void setUseSystemDefault(boolean z) {
        this.f19675f = z;
    }
}
