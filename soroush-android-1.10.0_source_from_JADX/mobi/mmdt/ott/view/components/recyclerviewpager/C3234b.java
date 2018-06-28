package mobi.mmdt.ott.view.components.recyclerviewpager;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public final class C3234b {
    public static View m7708a(RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        if (childCount > 0) {
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (C3234b.m7709a(recyclerView, childAt)) {
                    return childAt;
                }
            }
        }
        return null;
    }

    private static boolean m7709a(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        recyclerView.getLocationOnScreen(iArr);
        int width = iArr[0] + (recyclerView.getWidth() / 2);
        if (childCount > 0) {
            view.getLocationOnScreen(iArr2);
            if (iArr2[0] <= width && iArr2[0] + view.getWidth() >= width) {
                return true;
            }
        }
        return false;
    }

    public static int m7710b(RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        if (childCount > 0) {
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (C3234b.m7709a(recyclerView, childAt)) {
                    return recyclerView.getChildAdapterPosition(childAt);
                }
            }
        }
        return childCount;
    }

    private static boolean m7711b(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        recyclerView.getLocationOnScreen(iArr);
        int height = iArr[1] + (recyclerView.getHeight() / 2);
        if (childCount > 0) {
            view.getLocationOnScreen(iArr2);
            if (iArr2[1] <= height && iArr2[1] + view.getHeight() >= height) {
                return true;
            }
        }
        return false;
    }

    public static View m7712c(RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        if (childCount > 0) {
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (C3234b.m7711b(recyclerView, childAt)) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public static int m7713d(RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        if (childCount > 0) {
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (C3234b.m7711b(recyclerView, childAt)) {
                    return recyclerView.getChildAdapterPosition(childAt);
                }
            }
        }
        return childCount;
    }
}
