package android.support.v4.widget;

import android.os.Build.VERSION;
import android.view.View;
import android.widget.ListView;

public final class C4857i extends C0607a {
    private final ListView f13497f;

    public C4857i(ListView listView) {
        super(listView);
        this.f13497f = listView;
    }

    public final void mo436a(int i) {
        ListView listView = this.f13497f;
        if (VERSION.SDK_INT >= 19) {
            listView.scrollListBy(i);
            return;
        }
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (firstVisiblePosition != -1) {
            View childAt = listView.getChildAt(0);
            if (childAt != null) {
                listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i);
            }
        }
    }

    public final boolean mo437b(int i) {
        ListView listView = this.f13497f;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            return i2 < count || listView.getChildAt(childCount - 1).getBottom() > listView.getHeight();
        } else {
            if (i >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
    }
}
