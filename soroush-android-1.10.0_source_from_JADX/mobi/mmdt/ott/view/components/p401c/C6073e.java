package mobi.mmdt.ott.view.components.p401c;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;

public abstract class C6073e extends ViewHolder {
    public C6829g f16244a;
    private C3126i f16245b;

    class C31221 implements OnClickListener {
        final /* synthetic */ C6073e f9705a;

        C31221(C6073e c6073e) {
            this.f9705a = c6073e;
        }

        public final void onClick(View view) {
            if (this.f9705a.f16245b != null && this.f9705a.f16244a.f19504k >= 0) {
                this.f9705a.f16245b.mo2234c(this.f9705a.f16244a.f19504k);
            }
        }
    }

    class C31232 implements OnLongClickListener {
        final /* synthetic */ C6073e f9706a;

        C31232(C6073e c6073e) {
            this.f9706a = c6073e;
        }

        public final boolean onLongClick(View view) {
            if (this.f9706a.f16245b != null && this.f9706a.f16244a.f19504k >= 0) {
                this.f9706a.f16245b.mo2235d(this.f9706a.f16244a.f19504k);
            }
            return false;
        }
    }

    public C6073e(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, C3126i c3126i) {
        super(layoutInflater.inflate(i, viewGroup, false));
        this.f16245b = c3126i;
        if (this.f16245b != null) {
            this.itemView.setOnClickListener(new C31221(this));
            this.itemView.setOnLongClickListener(new C31232(this));
        }
    }

    public abstract void mo3180a(C6829g c6829g);

    public final void m13670b(C6829g c6829g) {
        this.f16244a = c6829g;
        mo3180a(c6829g);
    }
}
