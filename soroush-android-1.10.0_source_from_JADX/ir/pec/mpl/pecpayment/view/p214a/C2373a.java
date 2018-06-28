package ir.pec.mpl.pecpayment.view.p214a;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import ir.pec.mpl.pecpayment.C2338R;
import ir.pec.mpl.pecpayment.p212b.p213a.C2360d;
import java.util.ArrayList;
import java.util.List;

public class C2373a extends ArrayAdapter<C2360d> {
    private final Context f7831a;
    private final List<C2360d> f7832b;
    private final List<C2360d> f7833c;
    private final List<C2360d> f7834d = new ArrayList();
    private final int f7835e;

    public C2373a(Context context, int i, List<C2360d> list) {
        super(context, i, list);
        this.f7831a = context;
        this.f7835e = i;
        this.f7832b = new ArrayList(list);
        this.f7833c = new ArrayList(list);
    }

    public C2360d m6564a(int i) {
        return (C2360d) this.f7832b.get(i);
    }

    public int getCount() {
        return this.f7832b.size();
    }

    public /* synthetic */ Object getItem(int i) {
        return m6564a(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            try {
                view = ((Activity) this.f7831a).getLayoutInflater().inflate(this.f7835e, viewGroup, false);
            } catch (Exception e) {
                e.printStackTrace();
                return view;
            }
        }
        C2360d a = m6564a(i);
        TextView textView = (TextView) view.findViewById(C2338R.id.crd_no);
        ImageView imageView = (ImageView) view.findViewById(C2338R.id.bank_logo);
        ((TextView) view.findViewById(C2338R.id.bank_name)).setText(a.m6436c());
        textView.setText(a.m6431a());
        imageView.setImageResource(a.m6438d());
        return view;
    }
}
