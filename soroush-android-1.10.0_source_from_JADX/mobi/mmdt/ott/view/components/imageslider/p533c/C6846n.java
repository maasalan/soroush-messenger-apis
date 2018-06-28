package mobi.mmdt.ott.view.components.imageslider.p533c;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.View;
import com.nineoldandroids.view.ViewHelper;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C6846n extends C6097c {
    private static final Matrix f19535d = new Matrix();
    private static final Camera f19536e = new Camera();
    private static final float[] f19537f = new float[2];

    protected final void mo3184a(View view, float f) {
        float abs = (f < 0.0f ? 30.0f : -30.0f) * Math.abs(f);
        int width = view.getWidth();
        int height = view.getHeight();
        f19535d.reset();
        f19536e.save();
        f19536e.rotateY(Math.abs(abs));
        f19536e.getMatrix(f19535d);
        f19536e.restore();
        f19535d.preTranslate(((float) (-width)) * 0.5f, ((float) (-height)) * 0.5f);
        f = (float) width;
        float f2 = (float) height;
        f19535d.postTranslate(f * 0.5f, f2 * 0.5f);
        f19537f[0] = f;
        f19537f[1] = f2;
        f19535d.mapPoints(f19537f);
        ViewHelper.setTranslationX(view, (f - f19537f[0]) * (abs > 0.0f ? BallPulseIndicator.SCALE : -1.0f));
        ViewHelper.setPivotX(view, ((float) view.getWidth()) * 0.5f);
        ViewHelper.setPivotY(view, 0.0f);
        ViewHelper.setRotationY(view, abs);
    }
}
