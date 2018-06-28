package mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.view.KeyEvent;
import mobi.mmdt.ott.C2540d.C2534a;

public class EmojiconEditText extends AppCompatEditText {
    private int f19665a;
    private int f19666b;
    private int f19667c;
    private boolean f19668d;
    private C4026a f19669e;

    public interface C4026a {
        void mo2353e();
    }

    public EmojiconEditText(Context context) {
        super(context);
        this.f19668d = false;
        this.f19665a = (int) getTextSize();
        this.f19667c = (int) getTextSize();
    }

    public EmojiconEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19668d = false;
        m17840a(attributeSet);
    }

    public EmojiconEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19668d = false;
        m17840a(attributeSet);
    }

    private void m17839a() {
        C4027a.m7906a(getContext(), getText(), this.f19665a, this.f19666b, this.f19667c, this.f19668d);
    }

    private void m17840a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2534a.Emojicon);
        this.f19665a = (int) obtainStyledAttributes.getDimension(1, getTextSize());
        this.f19666b = obtainStyledAttributes.getInt(0, 1);
        this.f19668d = obtainStyledAttributes.getBoolean(4, false);
        obtainStyledAttributes.recycle();
        this.f19667c = (int) getTextSize();
        setText(getText());
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (this.f19669e != null) {
            this.f19669e.mo2353e();
        }
        return false;
    }

    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        m17839a();
    }

    public void setEmojiconSize(int i) {
        this.f19665a = i;
        m17839a();
    }

    public void setOnImeBackListener(C4026a c4026a) {
        this.f19669e = c4026a;
    }

    public void setUseSystemDefault(boolean z) {
        this.f19668d = z;
    }
}
