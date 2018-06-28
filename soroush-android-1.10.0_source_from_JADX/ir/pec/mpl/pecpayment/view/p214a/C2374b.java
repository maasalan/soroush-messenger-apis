package ir.pec.mpl.pecpayment.view.p214a;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import ir.pec.mpl.pecpayment.C2338R;
import ir.pec.mpl.pecpayment.p212b.p213a.C2361e;
import java.util.List;

public class C2374b extends BaseAdapter {
    public View f7836a;
    public List<C2361e> f7837b;
    private Activity f7838c;
    private Context f7839d;

    public C2374b(Activity activity, Context context, List<C2361e> list) {
        this.f7838c = activity;
        this.f7837b = list;
        this.f7839d = context;
    }

    public C2361e m6565a(int i) {
        return (C2361e) this.f7837b.get(i);
    }

    public int getCount() {
        return this.f7837b.size();
    }

    public /* synthetic */ Object getItem(int i) {
        return m6565a(i);
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        this.f7836a = view;
        if (view == null) {
            view = LayoutInflater.from(this.f7839d).inflate(C2338R.layout.item_list_final_response, null);
        }
        TextView textView = (TextView) view.findViewById(C2338R.id.ResponseValue);
        ((TextView) view.findViewById(C2338R.id.ResponseKey)).setText(((C2361e) this.f7837b.get(i)).m6439a());
        textView.setText(((C2361e) this.f7837b.get(i)).m6441b());
        return view;
    }
}
