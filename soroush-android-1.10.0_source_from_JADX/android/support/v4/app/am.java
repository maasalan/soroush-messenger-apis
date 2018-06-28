package android.support.v4.app;

import android.app.Activity;
import android.arch.lifecycle.C0093d;
import android.arch.lifecycle.C0093d.C0092b;
import android.arch.lifecycle.C0096g;
import android.arch.lifecycle.C0105o;
import android.arch.lifecycle.C4679h;
import android.os.Bundle;
import android.support.v4.p038g.C0482m;

public class am extends Activity implements C0096g {
    private C0482m<Class<? extends Object>, Object> f13236a = new C0482m();
    private C4679h f13237b = new C4679h(this);

    public C0093d mo39d() {
        return this.f13237b;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0105o.m184a((Activity) this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f13237b.m8544a(C0092b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
