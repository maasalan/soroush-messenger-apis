package mobi.mmdt.ott.view.passcode;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.State;
import android.view.View;

public final class C6245a extends ItemDecoration {
    private final int f16916a;
    private final int f16917b;
    private final int f16918c = 3;
    private final boolean f16919d = false;

    public C6245a(int i, int i2) {
        this.f16916a = i;
        this.f16917b = i2;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = childAdapterPosition % this.f16918c;
        if (this.f16919d) {
            rect.left = this.f16916a - ((this.f16916a * i) / this.f16918c);
            rect.right = ((i + 1) * this.f16916a) / this.f16918c;
            if (childAdapterPosition < this.f16918c) {
                rect.top = this.f16917b;
            }
            rect.bottom = this.f16917b;
            return;
        }
        rect.left = (this.f16916a * i) / this.f16918c;
        rect.right = this.f16916a - (((i + 1) * this.f16916a) / this.f16918c);
        if (childAdapterPosition >= this.f16918c) {
            rect.top = this.f16917b;
        }
    }
}
