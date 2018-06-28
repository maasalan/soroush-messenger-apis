package uk.co.chrisjenx.calligraphy;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

interface CalligraphyActivityFactory {
    View onActivityCreateView(View view, View view2, String str, Context context, AttributeSet attributeSet);
}
