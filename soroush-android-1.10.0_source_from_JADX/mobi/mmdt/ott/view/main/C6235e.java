package mobi.mmdt.ott.view.main;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;

public abstract class C6235e extends OnScrollListener {
    private int f16879a = 0;
    private boolean f16880b = true;

    public abstract void mo3236a();

    public abstract void mo3237b();

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        super.onScrolled(recyclerView, i, i2);
        if (this.f16880b && ((float) this.f16879a) > 25.0f) {
            mo3237b();
            this.f16879a = 0;
            this.f16880b = false;
        } else if (!this.f16880b && ((float) this.f16879a) < -25.0f) {
            mo3236a();
            this.f16879a = 0;
            this.f16880b = true;
        }
        if ((this.f16880b && i2 > 0) || (!this.f16880b && i2 < 0)) {
            this.f16879a += i2;
        }
    }
}
