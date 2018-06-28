package ir.pec.mpl.pecpayment.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import ir.pec.mpl.pecpayment.C2338R;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class ErrorMarkView extends View {
    private Handler f7815a = new Handler();
    private float f7816b = 0.0f;
    private float f7817c = 0.0f;
    private Bitmap f7818d;
    private Paint f7819e;
    private Runnable f7820f;

    public ErrorMarkView(Context context) {
        super(context);
        m6546b();
    }

    public ErrorMarkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6546b();
    }

    public ErrorMarkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6546b();
    }

    public static int m6544a(int i) {
        return (int) (((float) i) / Resources.getSystem().getDisplayMetrics().density);
    }

    private void m6546b() {
        this.f7818d = BitmapFactory.decodeResource(getResources(), C2338R.drawable.ic_error_pec);
        this.f7819e = new Paint();
    }

    private void m6547c() {
        if (this.f7816b >= BallPulseIndicator.SCALE) {
            if (this.f7820f != null) {
                this.f7815a.post(this.f7820f);
            }
            return;
        }
        this.f7815a.postDelayed(new C2379e(this), 10);
    }

    public void m6549a() {
        this.f7816b = 0.0f;
        this.f7817c = 5.0f / ((float) m6544a(getWidth()));
        m6547c();
    }

    public void m6550a(long j, Runnable runnable) {
        this.f7820f = runnable;
        this.f7815a.postDelayed(new C2378d(this), j);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.f7818d, (float) ((canvas.getWidth() - this.f7818d.getWidth()) / 2), (float) ((canvas.getHeight() - this.f7818d.getHeight()) / 2), this.f7819e);
        this.f7819e.setColor(-1);
        Canvas canvas2 = canvas;
        canvas2.drawRect((float) ((int) (this.f7816b * ((float) canvas.getWidth()))), 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), this.f7819e);
    }
}
