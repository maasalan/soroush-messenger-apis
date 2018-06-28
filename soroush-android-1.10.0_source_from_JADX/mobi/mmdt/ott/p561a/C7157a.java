package mobi.mmdt.ott.p561a;

import android.databinding.C0130f;
import android.databinding.ViewDataBinding;
import android.databinding.ViewDataBinding.C0120b;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import mobi.mmdt.ott.R;

public final class C7157a extends ViewDataBinding {
    private static final C0120b f20482t = null;
    private static final SparseIntArray f20483u;
    public final RelativeLayout f20484d;
    public final TextView f20485e;
    public final AutoCompleteTextView f20486f;
    public final RelativeLayout f20487g;
    public final TextView f20488h;
    public final TextView f20489i;
    public final RelativeLayout f20490j;
    public final TextView f20491k;
    public final ImageView f20492l;
    public final TextView f20493m;
    public final RelativeLayout f20494n;
    public final TextView f20495o;
    public final TextView f20496p;
    public final RelativeLayout f20497q;
    public final EditText f20498r;
    public final RelativeLayout f20499s;
    private final ScrollView f20500v;
    private long f20501w = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20483u = sparseIntArray;
        sparseIntArray.put(R.id.main_layout, 1);
        f20483u.put(R.id.barcode_layout, 2);
        f20483u.put(R.id.bill_payment_scan_barcode, 3);
        f20483u.put(R.id.bill_barcode_scanner_header, 4);
        f20483u.put(R.id.bill_payment_main_layout, 5);
        f20483u.put(R.id.bill_payment_bill_id_text, 6);
        f20483u.put(R.id.bill_id_input_layout, 7);
        f20483u.put(R.id.bill_id_input, 8);
        f20483u.put(R.id.bill_payment_payment_id_text, 9);
        f20483u.put(R.id.payment_id_input_layout, 10);
        f20483u.put(R.id.payment_id_input, 11);
        f20483u.put(R.id.bill_payment_amount_relative, 12);
        f20483u.put(R.id.bill_payment_header_image, 13);
        f20483u.put(R.id.bill_payment_header_text, 14);
        f20483u.put(R.id.bill_payment_amount, 15);
        f20483u.put(R.id.bill_payment_accept_text, 16);
    }

    public C7157a(C0130f c0130f, View view) {
        super(c0130f, view, 0);
        Object[] a = ViewDataBinding.m14831a(c0130f, view, 17, f20482t, f20483u);
        this.f20484d = (RelativeLayout) a[2];
        this.f20485e = (TextView) a[4];
        this.f20486f = (AutoCompleteTextView) a[8];
        this.f20487g = (RelativeLayout) a[7];
        this.f20488h = (TextView) a[16];
        this.f20489i = (TextView) a[15];
        this.f20490j = (RelativeLayout) a[12];
        this.f20491k = (TextView) a[6];
        this.f20492l = (ImageView) a[13];
        this.f20493m = (TextView) a[14];
        this.f20494n = (RelativeLayout) a[5];
        this.f20495o = (TextView) a[9];
        this.f20496p = (TextView) a[3];
        this.f20497q = (RelativeLayout) a[1];
        this.f20500v = (ScrollView) a[0];
        this.f20500v.setTag(null);
        this.f20498r = (EditText) a[11];
        this.f20499s = (RelativeLayout) a[10];
        m14840a(view);
        synchronized (this) {
            this.f20501w = 1;
        }
        m14846e();
    }

    protected final boolean mo3441a(int i, int i2) {
        return false;
    }

    protected final void mo3442c() {
        synchronized (this) {
            this.f20501w = 0;
        }
    }

    public final boolean mo3443d() {
        synchronized (this) {
            if (this.f20501w != 0) {
                return true;
            }
            return false;
        }
    }
}
