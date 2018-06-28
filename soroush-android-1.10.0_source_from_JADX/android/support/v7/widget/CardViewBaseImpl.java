package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

class CardViewBaseImpl implements CardViewImpl {
    private final RectF mCornerRect = new RectF();

    class C49041 implements RoundRectHelper {
        C49041() {
        }

        public void drawRoundRect(Canvas canvas, RectF rectF, float f, Paint paint) {
            C49041 c49041 = this;
            Canvas canvas2 = canvas;
            RectF rectF2 = rectF;
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - BallPulseIndicator.SCALE;
            float height = (rectF.height() - f2) - BallPulseIndicator.SCALE;
            if (f >= BallPulseIndicator.SCALE) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                CardViewBaseImpl.this.mCornerRect.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas2.translate(rectF2.left + f3, rectF2.top + f3);
                canvas2.drawArc(CardViewBaseImpl.this.mCornerRect, 180.0f, 90.0f, true, paint);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                float f5 = 90.0f;
                Paint paint2 = paint;
                canvas2.drawArc(CardViewBaseImpl.this.mCornerRect, 180.0f, 90.0f, true, paint2);
                canvas2.translate(height, 0.0f);
                canvas2.rotate(f5);
                canvas2.drawArc(CardViewBaseImpl.this.mCornerRect, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(f5);
                canvas2.drawArc(CardViewBaseImpl.this.mCornerRect, 180.0f, 90.0f, true, paint2);
                canvas2.restoreToCount(save);
                canvas2.drawRect((rectF2.left + f3) - BallPulseIndicator.SCALE, rectF2.top, (rectF2.right - f3) + BallPulseIndicator.SCALE, rectF2.top + f3, paint);
                canvas2.drawRect((rectF2.left + f3) - BallPulseIndicator.SCALE, rectF2.bottom - f3, (rectF2.right - f3) + BallPulseIndicator.SCALE, rectF2.bottom, paint);
            }
            canvas2.drawRect(rectF2.left, rectF2.top + f, rectF2.right, rectF2.bottom - f, paint);
        }
    }

    CardViewBaseImpl() {
    }

    private RoundRectDrawableWithShadow createBackground(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new RoundRectDrawableWithShadow(context.getResources(), colorStateList, f, f2, f3);
    }

    private RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate cardViewDelegate) {
        return (RoundRectDrawableWithShadow) cardViewDelegate.getCardBackground();
    }

    public ColorStateList getBackgroundColor(CardViewDelegate cardViewDelegate) {
        return getShadowBackground(cardViewDelegate).getColor();
    }

    public float getElevation(CardViewDelegate cardViewDelegate) {
        return getShadowBackground(cardViewDelegate).getShadowSize();
    }

    public float getMaxElevation(CardViewDelegate cardViewDelegate) {
        return getShadowBackground(cardViewDelegate).getMaxShadowSize();
    }

    public float getMinHeight(CardViewDelegate cardViewDelegate) {
        return getShadowBackground(cardViewDelegate).getMinHeight();
    }

    public float getMinWidth(CardViewDelegate cardViewDelegate) {
        return getShadowBackground(cardViewDelegate).getMinWidth();
    }

    public float getRadius(CardViewDelegate cardViewDelegate) {
        return getShadowBackground(cardViewDelegate).getCornerRadius();
    }

    public void initStatic() {
        RoundRectDrawableWithShadow.sRoundRectHelper = new C49041();
    }

    public void initialize(CardViewDelegate cardViewDelegate, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        Drawable createBackground = createBackground(context, colorStateList, f, f2, f3);
        createBackground.setAddPaddingForCorners(cardViewDelegate.getPreventCornerOverlap());
        cardViewDelegate.setCardBackground(createBackground);
        updatePadding(cardViewDelegate);
    }

    public void onCompatPaddingChanged(CardViewDelegate cardViewDelegate) {
    }

    public void onPreventCornerOverlapChanged(CardViewDelegate cardViewDelegate) {
        getShadowBackground(cardViewDelegate).setAddPaddingForCorners(cardViewDelegate.getPreventCornerOverlap());
        updatePadding(cardViewDelegate);
    }

    public void setBackgroundColor(CardViewDelegate cardViewDelegate, ColorStateList colorStateList) {
        getShadowBackground(cardViewDelegate).setColor(colorStateList);
    }

    public void setElevation(CardViewDelegate cardViewDelegate, float f) {
        getShadowBackground(cardViewDelegate).setShadowSize(f);
    }

    public void setMaxElevation(CardViewDelegate cardViewDelegate, float f) {
        getShadowBackground(cardViewDelegate).setMaxShadowSize(f);
        updatePadding(cardViewDelegate);
    }

    public void setRadius(CardViewDelegate cardViewDelegate, float f) {
        getShadowBackground(cardViewDelegate).setCornerRadius(f);
        updatePadding(cardViewDelegate);
    }

    public void updatePadding(CardViewDelegate cardViewDelegate) {
        Rect rect = new Rect();
        getShadowBackground(cardViewDelegate).getMaxShadowAndCornerPadding(rect);
        cardViewDelegate.setMinWidthHeightInternal((int) Math.ceil((double) getMinWidth(cardViewDelegate)), (int) Math.ceil((double) getMinHeight(cardViewDelegate)));
        cardViewDelegate.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }
}
