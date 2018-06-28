package mobi.mmdt.ott.view.components.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

@TargetApi(10)
public class VideoTimelineView extends View {
    public static final Object f9995d = new Object();
    public MediaMetadataRetriever f9996a = null;
    public ArrayList<Bitmap> f9997b = new ArrayList();
    public AsyncTask<Integer, Integer, Bitmap> f9998c = null;
    private long f9999e = 0;
    private float f10000f = 0.0f;
    private float f10001g = BallPulseIndicator.SCALE;
    private Paint f10002h;
    private Paint f10003i;
    private boolean f10004j = false;
    private boolean f10005k = false;
    private float f10006l = 0.0f;
    private C3247a f10007m = null;
    private long f10008n = 0;
    private int f10009o = 0;
    private int f10010p = 0;
    private int f10011q = 0;
    private Drawable f10012r = null;
    private Drawable f10013s = null;

    class C32461 extends AsyncTask<Integer, Integer, Bitmap> {
        final /* synthetic */ VideoTimelineView f9993a;
        private int f9994b = 0;

        C32461(VideoTimelineView videoTimelineView) {
            this.f9993a = videoTimelineView;
        }

        private Bitmap m7714a(Integer... numArr) {
            Exception e;
            this.f9994b = numArr[0].intValue();
            if (isCancelled()) {
                return null;
            }
            Bitmap frameAtTime;
            try {
                frameAtTime = this.f9993a.f9996a.getFrameAtTime((this.f9993a.f10008n * ((long) this.f9994b)) * 1000);
                try {
                    if (isCancelled()) {
                        return null;
                    }
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(this.f9993a.f10009o, this.f9993a.f10010p, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float c = ((float) this.f9993a.f10009o) / ((float) frameAtTime.getWidth());
                        float d = ((float) this.f9993a.f10010p) / ((float) frameAtTime.getHeight());
                        if (c <= d) {
                            c = d;
                        }
                        int width = (int) (((float) frameAtTime.getWidth()) * c);
                        int height = (int) (((float) frameAtTime.getHeight()) * c);
                        canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((this.f9993a.f10009o - width) / 2, (this.f9993a.f10010p - height) / 2, width, height), null);
                        frameAtTime.recycle();
                        return createBitmap;
                    }
                    return frameAtTime;
                } catch (Exception e2) {
                    e = e2;
                    Log.e("VideoTimeLineView", e.getMessage());
                    return frameAtTime;
                }
            } catch (Exception e3) {
                e = e3;
                frameAtTime = null;
                Log.e("VideoTimeLineView", e.getMessage());
                return frameAtTime;
            }
        }

        protected final /* synthetic */ Object doInBackground(Object[] objArr) {
            return m7714a((Integer[]) objArr);
        }

        protected final /* synthetic */ void onPostExecute(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            if (!isCancelled()) {
                this.f9993a.f9997b.add(bitmap);
                this.f9993a.invalidate();
                if (this.f9994b < this.f9993a.f10011q) {
                    this.f9993a.m7719a(this.f9994b + 1);
                }
            }
        }
    }

    public interface C3247a {
        void mo2275a(float f);

        void mo2276b(float f);
    }

    public VideoTimelineView(Context context) {
        super(context);
        m7718a();
    }

    public VideoTimelineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m7718a();
    }

    public VideoTimelineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7718a();
    }

    private void m7718a() {
        this.f10002h = new Paint();
        this.f10002h.setColor(-1);
        this.f10003i = new Paint();
        this.f10003i.setColor(-2063597568);
        this.f10012r = getResources().getDrawable(R.drawable.ic_select_handle_left);
        this.f10013s = getResources().getDrawable(R.drawable.ic_select_handle_right);
    }

    private void m7719a(int i) {
        if (this.f9996a != null) {
            if (i == 0) {
                this.f10010p = (int) C2491i.m6804b(getContext(), 48.0f);
                this.f10011q = (int) ((((float) getMeasuredWidth()) - C2491i.m6804b(getContext(), 16.0f)) / ((float) this.f10010p));
                this.f10009o = (int) Math.ceil((double) ((((float) getMeasuredWidth()) - C2491i.m6804b(getContext(), 16.0f)) / ((float) this.f10011q)));
                this.f10008n = this.f9999e / ((long) this.f10011q);
            }
            this.f9998c = new C32461(this);
            this.f9998c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Integer[]{Integer.valueOf(i), null, null});
        }
    }

    public float getLeftProgress() {
        return this.f10000f;
    }

    public float getRightProgress() {
        return this.f10001g;
    }

    protected void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        float measuredWidth = (float) ((int) (((float) getMeasuredWidth()) - C2491i.m6804b(getContext(), 36.0f)));
        int b = (int) (((float) ((int) (this.f10000f * measuredWidth))) + C2491i.m6804b(getContext(), 16.0f));
        int b2 = (int) (((float) ((int) (this.f10001g * measuredWidth))) + C2491i.m6804b(getContext(), 16.0f));
        canvas.save();
        canvas2.clipRect(C2491i.m6804b(getContext(), 16.0f), 0.0f, C2491i.m6804b(getContext(), 20.0f) + measuredWidth, C2491i.m6804b(getContext(), 52.0f));
        int i = 0;
        if (this.f9997b.isEmpty() && r0.f9998c == null) {
            m7719a(0);
        } else {
            Iterator it = r0.f9997b.iterator();
            while (it.hasNext()) {
                Bitmap bitmap = (Bitmap) it.next();
                if (bitmap != null) {
                    canvas2.drawBitmap(bitmap, C2491i.m6804b(getContext(), 16.0f) + ((float) (r0.f10009o * i)), C2491i.m6804b(getContext(), 2.0f), null);
                }
                i++;
            }
        }
        float f = (float) b;
        canvas2.drawRect(C2491i.m6804b(getContext(), 16.0f), C2491i.m6804b(getContext(), 2.0f), f, C2491i.m6804b(getContext(), 50.0f), r0.f10003i);
        float f2 = (float) b2;
        float b3 = f2 + C2491i.m6804b(getContext(), 4.0f);
        float b4 = C2491i.m6804b(getContext(), 2.0f);
        float b5 = C2491i.m6804b(getContext(), 4.0f) + (C2491i.m6804b(getContext(), 16.0f) + measuredWidth);
        float f3 = 4.0f;
        float b6 = C2491i.m6804b(getContext(), 50.0f);
        measuredWidth = f2;
        canvas2.drawRect(b3, b4, b5, b6, r0.f10003i);
        canvas2.drawRect(f, 0.0f, f + C2491i.m6804b(getContext(), 2.0f), C2491i.m6804b(getContext(), 52.0f), r0.f10002h);
        canvas2.drawRect(measuredWidth + C2491i.m6804b(getContext(), 2.0f), 0.0f, measuredWidth + C2491i.m6804b(getContext(), f3), C2491i.m6804b(getContext(), 52.0f), r0.f10002h);
        canvas2.drawRect(f + C2491i.m6804b(getContext(), 2.0f), 0.0f, measuredWidth + C2491i.m6804b(getContext(), f3), C2491i.m6804b(getContext(), 2.0f), r0.f10002h);
        canvas2.drawRect(f + C2491i.m6804b(getContext(), 2.0f), C2491i.m6804b(getContext(), 50.0f), measuredWidth + C2491i.m6804b(getContext(), f3), C2491i.m6804b(getContext(), 52.0f), r0.f10002h);
        canvas.restore();
        int intrinsicWidth = (int) (((double) r0.f10012r.getIntrinsicWidth()) * 1.5d);
        i = (int) (((double) r0.f10012r.getIntrinsicHeight()) * 1.5d);
        r0.f10012r.setBounds(b - intrinsicWidth, getMeasuredHeight() - i, b, getMeasuredHeight());
        r0.f10012r.draw(canvas2);
        r0.f10013s.setBounds(((int) C2491i.m6804b(getContext(), f3)) + b2, getMeasuredHeight() - i, (b2 + intrinsicWidth) + ((int) C2491i.m6804b(getContext(), f3)), getMeasuredHeight());
        r0.f10013s.draw(canvas2);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        float measuredWidth = (float) ((int) (((float) getMeasuredWidth()) - C2491i.m6804b(getContext(), 32.0f)));
        int b = (int) (((float) ((int) (this.f10000f * measuredWidth))) + C2491i.m6804b(getContext(), 16.0f));
        int b2 = (int) (((float) ((int) (this.f10001g * measuredWidth))) + C2491i.m6804b(getContext(), 16.0f));
        int b3;
        if (motionEvent.getAction() == 0) {
            float f;
            b3 = (int) C2491i.m6804b(getContext(), 12.0f);
            if (((float) (b - b3)) <= x && x <= ((float) (b + b3)) && y >= 0.0f && y <= ((float) getMeasuredHeight())) {
                this.f10004j = true;
                f = (float) b;
            } else if (((float) (b2 - b3)) <= x && x <= ((float) (b3 + b2)) && y >= 0.0f && y <= ((float) getMeasuredHeight())) {
                this.f10005k = true;
                f = (float) b2;
            }
            this.f10006l = (float) ((int) (x - f));
            getParent().requestDisallowInterceptTouchEvent(true);
            invalidate();
            return true;
        }
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    if (this.f10004j) {
                        b3 = (int) (x - this.f10006l);
                        if (((float) b3) < C2491i.m6804b(getContext(), 16.0f)) {
                            b2 = (int) C2491i.m6804b(getContext(), 16.0f);
                        } else if (b3 <= b2) {
                            b2 = b3;
                        }
                        this.f10000f = (((float) b2) - C2491i.m6804b(getContext(), 16.0f)) / measuredWidth;
                        if (this.f10007m != null) {
                            this.f10007m.mo2275a(this.f10000f);
                        }
                        invalidate();
                        return true;
                    } else if (this.f10005k) {
                        b3 = (int) (x - this.f10006l);
                        if (b3 >= b) {
                            b = ((float) b3) > C2491i.m6804b(getContext(), 16.0f) + measuredWidth ? (int) (C2491i.m6804b(getContext(), 16.0f) + measuredWidth) : b3;
                        }
                        this.f10001g = (((float) b) - C2491i.m6804b(getContext(), 16.0f)) / measuredWidth;
                        if (this.f10007m != null) {
                            this.f10007m.mo2276b(this.f10001g);
                        }
                        invalidate();
                        return true;
                    }
                }
            }
        }
        if (this.f10004j) {
            this.f10004j = false;
            return true;
        } else if (this.f10005k) {
            this.f10005k = false;
            return true;
        }
        return false;
    }

    public void setProgressLeft(float f) {
        this.f10000f = f;
        invalidate();
    }

    public void setProgressRight(float f) {
        this.f10001g = f;
        invalidate();
    }

    public void setVideoPath(String str) {
        this.f9996a = new MediaMetadataRetriever();
        try {
            this.f9996a.setDataSource(str);
            this.f9999e = Long.parseLong(this.f9996a.extractMetadata(9));
        } catch (Exception e) {
            Log.e("VideoTimeLineView", e.getMessage());
        }
    }

    public void setVideoTimelineViewListener(C3247a c3247a) {
        this.f10007m = c3247a;
    }
}
