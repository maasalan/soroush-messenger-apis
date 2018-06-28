package mobi.mmdt.ott.view.search;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.View.OnLongClickListener;
import mobi.mmdt.ott.R;

public final class C6949f extends C6259h {

    class C43591 implements OnLongClickListener {
        final /* synthetic */ C4349a f12221a;
        final /* synthetic */ int f12222b;
        final /* synthetic */ String f12223c;
        final /* synthetic */ C6949f f12224d;

        C43591(C6949f c6949f, C4349a c4349a, int i, String str) {
            this.f12224d = c6949f;
            this.f12221a = c4349a;
            this.f12222b = i;
            this.f12223c = str;
        }

        public final boolean onLongClick(View view) {
            this.f12221a.mo2426a();
            return true;
        }
    }

    C6949f(View view) {
        super(view);
        view.findViewById(R.id.root_frameLayout).setLongClickable(true);
    }

    public final /* bridge */ /* synthetic */ void mo3259a(Context context, Cursor cursor, String str) {
        super.mo3259a(context, cursor, str);
    }

    public final /* bridge */ /* synthetic */ void mo3260b(Context context, Cursor cursor, String str) {
        super.mo3260b(context, cursor, str);
    }
}
