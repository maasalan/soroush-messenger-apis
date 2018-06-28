package com.p139e.p140a.p141a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v7.app.C6389b.C0663a;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.p139e.p140a.C1575c;
import com.p139e.p140a.C1581e.C1577a;
import com.p139e.p140a.p143c.C5391b;
import com.p139e.p140a.p143c.C5392c;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C1561b {
    public C0663a f4849a;
    public LinearLayout f4850b;
    public C1575c f4851c;
    public C5392c f4852d;
    public C5391b f4853e;
    public EditText f4854f;
    public LinearLayout f4855g;
    public boolean f4856h = true;
    public boolean f4857i = true;
    public boolean f4858j = false;
    public boolean f4859k = false;
    public int f4860l = 1;
    public int f4861m = 0;
    public Integer[] f4862n = new Integer[]{null, null, null, null, null};

    class C15601 implements OnClickListener {
        final /* synthetic */ C1559a f4847a;
        final /* synthetic */ C1561b f4848b;

        public C15601(C1561b c1561b, C1559a c1559a) {
            this.f4848b = c1561b;
            this.f4847a = c1559a;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f4847a.onClick(dialogInterface, this.f4848b.f4851c.getSelectedColor(), this.f4848b.f4851c.getAllColors());
        }
    }

    public C1561b(Context context) {
        this.f4849a = new C0663a(context, R.style.AppCompatAlertDialogStyle);
        this.f4850b = new LinearLayout(context);
        this.f4850b.setOrientation(1);
        this.f4850b.setGravity(1);
        this.f4861m = C1561b.m4069a(context, C1577a.default_slider_margin);
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = BallPulseIndicator.SCALE;
        this.f4851c = new C1575c(context);
        this.f4850b.addView(this.f4851c, layoutParams);
        int i = (int) (16.0f * context.getResources().getDisplayMetrics().density);
        this.f4850b.setPadding(i, i, i, i);
        this.f4849a.m1607a(this.f4850b);
    }

    public static int m4069a(Context context, int i) {
        return (int) (context.getResources().getDimension(i) + 0.5f);
    }

    public static Integer m4070a(Integer[] numArr) {
        int i = 0;
        Integer valueOf = Integer.valueOf(0);
        while (i < numArr.length && numArr[i] != null) {
            i++;
            valueOf = Integer.valueOf(i / 2);
        }
        return valueOf;
    }

    public static int m4071b(Integer[] numArr) {
        Integer a = C1561b.m4070a(numArr);
        return a == null ? -1 : numArr[a.intValue()].intValue();
    }
}
