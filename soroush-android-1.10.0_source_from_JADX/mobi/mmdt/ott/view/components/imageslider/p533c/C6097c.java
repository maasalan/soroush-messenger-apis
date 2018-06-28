package mobi.mmdt.ott.view.components.imageslider.p533c;

import android.view.View;
import com.nineoldandroids.view.ViewHelper;
import java.util.ArrayList;
import java.util.HashMap;
import mobi.mmdt.ott.view.components.imageslider.Tricks.ViewPagerEx.C3179g;
import mobi.mmdt.ott.view.components.imageslider.p407a.C3183a;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public abstract class C6097c implements C3179g {
    public C3183a f16358a;
    boolean f16359b;
    boolean f16360c;
    private HashMap<View, ArrayList<Float>> f16361d = new HashMap();

    protected abstract void mo3184a(View view, float f);

    protected boolean mo3185a() {
        return false;
    }

    public final void mo2274b(View view, float f) {
        float f2;
        float width = (float) view.getWidth();
        ViewHelper.setRotationX(view, 0.0f);
        ViewHelper.setRotationY(view, 0.0f);
        ViewHelper.setRotation(view, 0.0f);
        ViewHelper.setScaleX(view, BallPulseIndicator.SCALE);
        ViewHelper.setScaleY(view, BallPulseIndicator.SCALE);
        ViewHelper.setPivotX(view, 0.0f);
        ViewHelper.setPivotY(view, 0.0f);
        ViewHelper.setTranslationY(view, 0.0f);
        ViewHelper.setTranslationX(view, mo3185a() ? 0.0f : (-width) * f);
        if (f > -1.0f) {
            if (f < BallPulseIndicator.SCALE) {
                f2 = BallPulseIndicator.SCALE;
                ViewHelper.setAlpha(view, f2);
                if (this.f16358a != null && ((!this.f16361d.containsKey(view) || ((ArrayList) this.f16361d.get(view)).size() == 1) && f > -1.0f && f < BallPulseIndicator.SCALE)) {
                    if (this.f16361d.get(view) == null) {
                        this.f16361d.put(view, new ArrayList());
                    }
                    ((ArrayList) this.f16361d.get(view)).add(Float.valueOf(f));
                    if (((ArrayList) this.f16361d.get(view)).size() == 2) {
                        ((Float) ((ArrayList) this.f16361d.get(view)).get(0)).floatValue();
                        ((Float) ((ArrayList) this.f16361d.get(view)).get(1)).floatValue();
                        ((Float) ((ArrayList) this.f16361d.get(view)).get(0)).floatValue();
                    }
                }
                mo3184a(view, f);
                if (this.f16358a != null) {
                    if (f != -1.0f) {
                        if (f == BallPulseIndicator.SCALE) {
                            if (f == 0.0f) {
                                this.f16360c = true;
                            }
                            if (this.f16359b && this.f16360c) {
                                this.f16361d.clear();
                                this.f16359b = false;
                                this.f16360c = false;
                                return;
                            }
                        }
                    }
                    this.f16359b = true;
                    if (this.f16359b) {
                    }
                }
            }
        }
        f2 = 0.0f;
        ViewHelper.setAlpha(view, f2);
        if (this.f16361d.get(view) == null) {
            this.f16361d.put(view, new ArrayList());
        }
        ((ArrayList) this.f16361d.get(view)).add(Float.valueOf(f));
        if (((ArrayList) this.f16361d.get(view)).size() == 2) {
            ((Float) ((ArrayList) this.f16361d.get(view)).get(0)).floatValue();
            ((Float) ((ArrayList) this.f16361d.get(view)).get(1)).floatValue();
            ((Float) ((ArrayList) this.f16361d.get(view)).get(0)).floatValue();
        }
        mo3184a(view, f);
        if (this.f16358a != null) {
            if (f != -1.0f) {
                if (f == BallPulseIndicator.SCALE) {
                    if (f == 0.0f) {
                        this.f16360c = true;
                    }
                    if (this.f16359b) {
                    }
                }
            }
            this.f16359b = true;
            if (this.f16359b) {
            }
        }
    }
}
