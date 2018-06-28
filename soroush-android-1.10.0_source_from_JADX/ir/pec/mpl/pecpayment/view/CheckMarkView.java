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

public class CheckMarkView extends View {
    private Handler f7809a = new Handler();
    private float f7810b = 0.0f;
    private float f7811c = 0.0f;
    private Bitmap f7812d;
    private Paint f7813e;
    private Runnable f7814f;

    public CheckMarkView(Context context) {
        super(context);
        m6537b();
    }

    public CheckMarkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6537b();
    }

    public CheckMarkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6537b();
    }

    public static int m6535a(int i) {
        return (int) (((float) i) / Resources.getSystem().getDisplayMetrics().density);
    }

    private void m6537b() {
        this.f7812d = BitmapFactory.decodeResource(getResources(), C2338R.drawable.ic_check_pec);
        this.f7813e = new Paint();
    }

    private void m6538c() {
        if (this.f7810b >= BallPulseIndicator.SCALE) {
            if (this.f7814f != null) {
                this.f7809a.post(this.f7814f);
            }
            return;
        }
        this.f7809a.postDelayed(new C2376b(this), 10);
    }

    public void m6540a() {
        this.f7810b = 0.0f;
        this.f7811c = 5.0f / ((float) m6535a(getWidth()));
        m6538c();
    }

    public void m6541a(long j, Runnable runnable) {
        this.f7814f = runnable;
        this.f7809a.postDelayed(new C2375a(this), j);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.f7812d, (float) ((canvas.getWidth() - this.f7812d.getWidth()) / 2), (float) ((canvas.getHeight() - this.f7812d.getHeight()) / 2), this.f7813e);
        this.f7813e.setColor(-1);
        Canvas canvas2 = canvas;
        canvas2.drawRect((float) ((int) (this.f7810b * ((float) canvas.getWidth()))), 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), this.f7813e);
    }
}
