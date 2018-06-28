package android.support.constraint;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.support.constraint.ConstraintLayout.C0165a;
import android.view.View;

public final class C0195f extends View {
    int f808a;
    View f809b;
    int f810c;

    public final View getContent() {
        return this.f809b;
    }

    public final int getEmptyVisibility() {
        return this.f810c;
    }

    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Align.LEFT);
            String str = "?";
            paint.getTextBounds(str, 0, str.length(), rect);
            canvas.drawText(str, ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public final void setContentId(int i) {
        if (this.f808a != i) {
            if (this.f809b != null) {
                this.f809b.setVisibility(0);
                ((C0165a) this.f809b.getLayoutParams()).aa = false;
                this.f809b = null;
            }
            this.f808a = i;
            if (i != -1) {
                View findViewById = ((View) getParent()).findViewById(i);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
            }
        }
    }

    public final void setEmptyVisibility(int i) {
        this.f810c = i;
    }
}
