package mobi.mmdt.componentsutils.view.roundavatarimageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import com.p085c.p086a.C1212c;
import mobi.mmdt.componentsutils.C2493b.C2477b;
import mobi.mmdt.componentsutils.C2493b.C2484d;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class RoundAvatarImageView extends AppCompatImageView {
    private int f18907a;
    private String f18908b;
    private final Paint f18909c;
    private final TextPaint f18910d;
    private final float f18911e;
    private int f18912f;
    private int f18913g;
    private final Rect f18914h;

    public RoundAvatarImageView(Context context) {
        this(context, null);
    }

    public RoundAvatarImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2477b.RoundAvatarImageViewStyle);
    }

    public RoundAvatarImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18911e = C2491i.m6804b(getContext(), (float) BallPulseIndicator.SCALE);
        new Paint().setAntiAlias(true);
        this.f18914h = new Rect();
        this.f18909c = new Paint();
        this.f18909c.setAntiAlias(true);
        this.f18910d = new TextPaint(1);
        this.f18910d.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/NotoNaskhArabicUI-Regular.ttf"));
        this.f18912f = -7829368;
        this.f18913g = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2484d.RoundAvatarImageView, i, 0);
        if (obtainStyledAttributes.getBoolean(C2484d.RoundAvatarImageView_border, true)) {
            setName(obtainStyledAttributes.getString(C2484d.RoundAvatarImageView_name));
            setBackgroundColor(obtainStyledAttributes.getColor(C2484d.RoundAvatarImageView_background_color, -1));
            setTextColor(obtainStyledAttributes.getColor(C2484d.RoundAvatarImageView_text_color, -7829368));
        }
        obtainStyledAttributes.recycle();
    }

    public void onDraw(Canvas canvas) {
        this.f18907a = canvas.getWidth();
        if (canvas.getHeight() < this.f18907a) {
            this.f18907a = canvas.getHeight();
        }
        int i = this.f18907a / 2;
        this.f18909c.setColor(this.f18913g);
        float f = (float) i;
        canvas.drawCircle(f, f, ((float) (this.f18907a / 2)) - this.f18911e, this.f18909c);
        String str = this.f18908b;
        String str2 = "";
        if (!(str == null || str.trim().isEmpty())) {
            str2 = str.trim().substring(0, 1).toUpperCase();
        }
        this.f18910d.setColor(this.f18912f);
        TextPaint textPaint = this.f18910d;
        int i2 = this.f18907a / 3;
        int i3 = this.f18907a / 3;
        TextPaint textPaint2 = this.f18910d;
        float textSize = textPaint2.getTextSize();
        if (str2.length() != 0) {
            textPaint2.getTextBounds(str2, 0, str2.length(), this.f18914h);
            float width = ((float) i2) / ((float) this.f18914h.width());
            float height = ((float) i3) / ((float) this.f18914h.height());
            if (height < width) {
                width = height;
            }
            textSize *= width;
        }
        textPaint.setTextSize(textSize);
        this.f18910d.getTextBounds(str2, 0, str2.length(), this.f18914h);
        canvas.drawText(str2, (float) (i - this.f18914h.centerX()), (float) (i + (this.f18914h.height() / 3)), this.f18910d);
        super.onDraw(canvas);
    }

    protected void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        i = MeasureSpec.getSize(i);
        if (!(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i = this.f18907a;
        }
        mode = MeasureSpec.getMode(i2);
        i2 = MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (mode != Integer.MIN_VALUE) {
                i2 = this.f18907a;
            }
        }
        setMeasuredDimension(i, i2 + 2);
    }

    public void setBackgroundColor(int i) {
        this.f18913g = i;
        requestLayout();
        invalidate();
    }

    public void setImage(String str) {
        C1212c.m2875b(getContext()).m10950a((Object) str).m3031a((ImageView) this);
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
    }

    public void setName(String str) {
        this.f18908b = str;
        setTextColor(-1);
        requestLayout();
        invalidate();
    }

    public void setTextColor(int i) {
        this.f18912f = i;
        requestLayout();
        invalidate();
    }
}
