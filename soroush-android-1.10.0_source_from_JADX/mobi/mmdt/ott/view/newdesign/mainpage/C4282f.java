package mobi.mmdt.ott.view.newdesign.mainpage;

import android.app.Activity;
import android.content.Context;
import android.support.design.internal.SnackbarContentLayout;
import android.support.design.widget.C0306b;
import android.support.design.widget.Snackbar;
import android.support.design.widget.Snackbar.SnackbarLayout;
import android.support.v4.p029a.C0346c;
import android.view.View;
import android.widget.TextView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.tools.C4522p;

final class C4282f {

    static class C42811 implements Runnable {
        final /* synthetic */ Activity f12098a;
        final /* synthetic */ Snackbar f12099b;

        C42811(Activity activity, Snackbar snackbar) {
            this.f12098a = activity;
            this.f12099b = snackbar;
        }

        public final void run() {
            Context context;
            C0306b c0306b;
            if (C2535a.m6888a().m6919b().equals("fa")) {
                context = this.f12098a;
                c0306b = this.f12099b;
                SnackbarLayout snackbarLayout = (SnackbarLayout) c0306b.f1146d;
                ((TextView) snackbarLayout.findViewById(R.id.snackbar_text)).setVisibility(4);
                View inflate = context.getLayoutInflater().inflate(R.layout.update_snackbar, null);
                ((TextView) inflate.findViewById(R.id.action)).setOnClickListener(new C4280e());
                c0306b.f1146d.setBackgroundColor(C0346c.m687c(context, R.color.update_snackbar_background));
                snackbarLayout.addView(inflate, 0);
            } else {
                context = this.f12098a;
                c0306b = this.f12099b;
                View view = c0306b.f1146d;
                view.setBackgroundColor(C0346c.m687c(context, R.color.update_snackbar_background));
                ((TextView) view.findViewById(R.id.snackbar_text)).setText(C4522p.m8236a(R.string.soroush_update_text));
                c0306b.m8772a(C4522p.m8236a(R.string.soroush_update), new C4280e());
                ((SnackbarContentLayout) c0306b.d.getChildAt(0)).getActionView().setTextColor(C0346c.m687c(context, R.color.update_snackbar_action_color));
            }
            this.f12099b.m572a();
        }
    }
}
