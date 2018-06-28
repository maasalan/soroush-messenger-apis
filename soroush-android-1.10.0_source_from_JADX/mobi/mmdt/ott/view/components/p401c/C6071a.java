package mobi.mmdt.ott.view.components.p401c;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;

public abstract class C6071a extends ViewHolder {
    protected final ViewDataBinding f16237a;
    public C6829g f16238b;
    private final int f16239c;
    private C3126i f16240d;

    class C31201 implements OnClickListener {
        final /* synthetic */ C6071a f9703a;

        C31201(C6071a c6071a) {
            this.f9703a = c6071a;
        }

        public final void onClick(View view) {
            if (this.f9703a.f16240d != null && this.f9703a.f16238b.f19504k >= 0) {
                this.f9703a.f16240d.mo2234c(this.f9703a.f16238b.f19504k);
            }
        }
    }

    class C31212 implements OnLongClickListener {
        final /* synthetic */ C6071a f9704a;

        C31212(C6071a c6071a) {
            this.f9704a = c6071a;
        }

        public final boolean onLongClick(View view) {
            if (this.f9704a.f16240d != null && this.f9704a.f16238b.f19504k >= 0) {
                this.f9704a.f16240d.mo2235d(this.f9704a.f16238b.f19504k);
            }
            return false;
        }
    }

    public C6071a(ViewDataBinding viewDataBinding, int i, C3126i c3126i) {
        super(viewDataBinding.f17291b);
        this.f16237a = viewDataBinding;
        this.f16239c = i;
        this.f16240d = c3126i;
        if (this.f16240d != null) {
            this.itemView.setOnClickListener(new C31201(this));
            this.itemView.setOnLongClickListener(new C31212(this));
        }
        mo3188b();
    }

    public final void m13661a(C6829g c6829g) {
        this.f16238b = c6829g;
        mo3189b(c6829g);
    }

    public abstract void mo3188b();

    public abstract void mo3189b(C6829g c6829g);
}
