package mobi.mmdt.ott.view.vas.payservices.payhistory;

import android.app.Activity;
import android.app.Dialog;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.Context;
import android.content.CursorLoader;
import android.content.DialogInterface;
import android.content.Loader;
import android.database.Cursor;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.app.C7249g;
import android.support.v7.app.C6389b.C0663a;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.vas_webservices.base.OperatorType;
import mobi.mmdt.ott.logic.p261a.p329x.C2763c;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.logic.vas.p372a.C2910a;
import mobi.mmdt.ott.logic.vas.p372a.C2912b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p382d.C2959e;
import mobi.mmdt.ott.provider.p383e.C2961a;
import mobi.mmdt.ott.provider.p383e.C2962e;
import mobi.mmdt.ott.view.components.MyNestedScrollView;
import mobi.mmdt.ott.view.components.MyNestedScrollView.C3092a;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6827b;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.vas.p483a.C7723a;
import mobi.mmdt.ott.view.vas.p483a.C7723a.C76915;
import mobi.mmdt.ott.view.vas.payservices.bill.p485b.C4555a;
import mobi.mmdt.ott.view.vas.payservices.bill.p590a.C7232a;
import mobi.mmdt.ott.view.vas.payservices.charge.p592a.C7234a;

public class PayHistoryActivity extends C7723a implements C3101a, C3126i {
    private View f24806B;
    private TextView f24807C;
    private String f24808D;
    private RecyclerView f24809E;
    private C6827b f24810F;
    private RelativeLayout f24811G;
    private ImageView f24812H;
    private LinearLayout f24813I;
    private LinearLayout f24814J;
    private Cursor f24815K;
    private C2763c f24816L;
    private LoaderCallbacks<Cursor> f24817M = new C45813(this);

    class C45802 implements OnClickListener {
        final /* synthetic */ PayHistoryActivity f12597a;

        C45802(PayHistoryActivity payHistoryActivity) {
            this.f12597a = payHistoryActivity;
        }

        public final void onClick(View view) {
            this.f12597a.onBackPressed();
        }
    }

    class C45813 implements LoaderCallbacks<Cursor> {
        final /* synthetic */ PayHistoryActivity f12598a;

        C45813(PayHistoryActivity payHistoryActivity) {
            this.f12598a = payHistoryActivity;
        }

        public final Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
            if (this.f12598a.f24816L == C2763c.BillPayment) {
                return C2959e.m7385a(MyApplication.m12952b());
            }
            return new CursorLoader(MyApplication.m12952b(), C2961a.f9199a, null, "PaymentType = ?", new String[]{String.valueOf(C2763c.ChargePayment.ordinal())}, "TransactionTime DESC");
        }

        public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
            Cursor cursor = (Cursor) obj;
            if (this.f12598a.f24810F != null) {
                this.f12598a.f24810F.m13684c(cursor);
            }
        }

        public final void onLoaderReset(Loader<Cursor> loader) {
            if (this.f12598a.f24810F != null) {
                this.f12598a.f24810F.m13684c(null);
            }
        }
    }

    class C62881 implements C3092a {
        final /* synthetic */ PayHistoryActivity f17197a;

        C62881(PayHistoryActivity payHistoryActivity) {
            this.f17197a = payHistoryActivity;
        }

        public final void mo2378a() {
            this.f17197a.f24809E.setNestedScrollingEnabled(false);
        }

        public final void mo2379b() {
            this.f17197a.f24809E.setNestedScrollingEnabled(true);
        }
    }

    public final Dialog mo2299a(Bundle bundle) {
        C0663a c0663a;
        Context context = this;
        View inflate;
        TextView textView;
        TextView textView2;
        switch (bundle.getInt("dialog_id")) {
            case 50:
                TextView textView3;
                TextView textView4;
                TextView textView5;
                TextView textView6;
                TextView textView7;
                TextView textView8;
                TextView textView9;
                TextView textView10;
                TextView textView11;
                TextView textView12;
                TextView textView13;
                TextView textView14;
                String string;
                String string2;
                StringBuilder stringBuilder;
                int i;
                int i2;
                if (context.f24816L != C2763c.ChargePayment) {
                    if (context.f24816L == C2763c.BillPayment) {
                        c0663a = new C0663a(context, R.style.AppCompatAlertDialogStyle);
                        inflate = getLayoutInflater().inflate(R.layout.dialog_show_bill_history, null);
                        c0663a.m1607a(inflate);
                        TextView textView15 = (TextView) inflate.findViewById(R.id.textView1);
                        textView3 = (TextView) inflate.findViewById(R.id.textView3);
                        textView4 = (TextView) inflate.findViewById(R.id.tv_transaction_status_title);
                        textView5 = (TextView) inflate.findViewById(R.id.tv_bill_company);
                        textView6 = (TextView) inflate.findViewById(R.id.tv_bill_company_title);
                        textView7 = (TextView) inflate.findViewById(R.id.tv_payment_amount);
                        textView8 = (TextView) inflate.findViewById(R.id.tv_payment_amount_title);
                        textView9 = (TextView) inflate.findViewById(R.id.tv_date);
                        textView10 = (TextView) inflate.findViewById(R.id.tv_date_title);
                        textView11 = (TextView) inflate.findViewById(R.id.tv_bill_id);
                        textView12 = (TextView) inflate.findViewById(R.id.tv_bill_id_title);
                        C0663a c0663a2 = c0663a;
                        textView13 = (TextView) inflate.findViewById(R.id.tv_payment_id);
                        TextView textView16 = (TextView) inflate.findViewById(R.id.tv_transaction_status);
                        textView14 = (TextView) inflate.findViewById(R.id.tv_payment_id_title);
                        ImageView imageView = (ImageView) inflate.findViewById(R.id.imageView1);
                        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.layout_payment_id);
                        C2491i.m6796a(inflate, UIThemeManager.getmInstance().getRecycler_view_background_color());
                        C2491i.m6784a(UIThemeManager.getmInstance().getText_primary_color(), textView15, textView3, textView5, textView7, textView9, textView11, textView13, textView4, textView6, textView8, textView10, textView12, textView14);
                        string = context.f24815K.getString(context.f24815K.getColumnIndex("BillId"));
                        String string3 = context.f24815K.getString(context.f24815K.getColumnIndex("PaymentId"));
                        string2 = context.f24815K.getString(context.f24815K.getColumnIndex("Amount"));
                        String string4 = context.f24815K.getString(context.f24815K.getColumnIndex("TransactionTime"));
                        int i3 = context.f24815K.getInt(context.f24815K.getColumnIndex("TransactionStatus"));
                        ImageView imageView2 = imageView;
                        imageView2.setImageBitmap(null);
                        int i4 = i3;
                        C1212c.m2873a((C7249g) this).m10950a(Integer.valueOf(C4555a.m8298e(string))).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a)).m3031a(imageView2);
                        textView15.setText(C4555a.m8299f(string));
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(C4555a.m8299f(string));
                        stringBuilder2.append(" ");
                        stringBuilder2.append(C2491i.m6777a(context.f24808D, C2491i.m6776a(string2)));
                        stringBuilder2.append(" ");
                        stringBuilder2.append(C4522p.m8236a(R.string.rial));
                        textView3.setText(stringBuilder2.toString());
                        textView5.setText(C4555a.m8299f(string));
                        textView11.setText(C2491i.m6777a(context.f24808D, string));
                        textView13.setText(C2491i.m6777a(context.f24808D, string3));
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(C2491i.m6777a(context.f24808D, C2491i.m6776a(string2)));
                        stringBuilder.append(" ");
                        stringBuilder.append(C4522p.m8236a(R.string.rial));
                        textView7.setText(stringBuilder.toString());
                        textView9.setText(C2491i.m6829d(MyApplication.m12952b(), Long.parseLong(string4), context.f24808D));
                        if (i4 == 1) {
                            textView14 = textView16;
                            textView14.setText(C4522p.m8236a(R.string.successful));
                            textView14.setTextColor(-16711936);
                            i = R.drawable.ic_pay_ok;
                            i2 = 0;
                        } else {
                            textView14 = textView16;
                            i2 = 0;
                            textView14.setText(C4522p.m8236a(R.string.un_successful));
                            textView14.setTextColor(-65536);
                            i = R.drawable.ic_pay_error;
                        }
                        textView14.setCompoundDrawablesWithIntrinsicBounds(i2, i2, i, i2);
                        if (string3 == null) {
                            linearLayout.setVisibility(8);
                        }
                        c0663a = c0663a2;
                        break;
                    }
                }
                ImageView imageView3;
                c0663a = new C0663a(context, R.style.AppCompatAlertDialogStyle);
                View inflate2 = getLayoutInflater().inflate(R.layout.dialog_show_charge_history, null);
                c0663a.m1607a(inflate2);
                textView3 = (TextView) inflate2.findViewById(R.id.textView1);
                textView7 = (TextView) inflate2.findViewById(R.id.textView3);
                textView10 = (TextView) inflate2.findViewById(R.id.tv_transaction_status_title);
                textView12 = (TextView) inflate2.findViewById(R.id.tv_charge_type);
                textView4 = (TextView) inflate2.findViewById(R.id.tv_charge_type_title);
                textView9 = (TextView) inflate2.findViewById(R.id.tv_payment_amount);
                textView8 = (TextView) inflate2.findViewById(R.id.tv_payment_amount_title);
                textView = (TextView) inflate2.findViewById(R.id.tv_date);
                textView2 = (TextView) inflate2.findViewById(R.id.tv_date_title);
                textView5 = (TextView) inflate2.findViewById(R.id.tv_phone_number);
                textView6 = (TextView) inflate2.findViewById(R.id.tv_phone_number_title);
                C0663a c0663a3 = c0663a;
                textView13 = (TextView) inflate2.findViewById(R.id.tv_card_number_title);
                TextView textView17 = (TextView) inflate2.findViewById(R.id.tv_transaction_status);
                textView11 = (TextView) inflate2.findViewById(R.id.tv_card_number);
                ImageView imageView4 = (ImageView) inflate2.findViewById(R.id.imageView1);
                textView14 = (TextView) inflate2.findViewById(R.id.tv_ref_id_title);
                TextView textView18 = (TextView) inflate2.findViewById(R.id.tv_ref_id);
                LinearLayout linearLayout2 = (LinearLayout) inflate2.findViewById(R.id.card_number_layout);
                LinearLayout linearLayout3 = (LinearLayout) inflate2.findViewById(R.id.ref_id_layout);
                C2491i.m6796a(inflate2, UIThemeManager.getmInstance().getRecycler_view_background_color());
                C2491i.m6784a(UIThemeManager.getmInstance().getText_primary_color(), textView3, textView7, textView12, textView9, textView, textView10, textView4, textView8, textView2, textView5, textView6, textView13, textView11, textView14, textView18);
                i = this.f24815K.getInt(this.f24815K.getColumnIndex("Operator"));
                int i5 = this.f24815K.getInt(this.f24815K.getColumnIndex("ChargeType"));
                String string5 = this.f24815K.getString(this.f24815K.getColumnIndex("Amount"));
                string2 = this.f24815K.getString(this.f24815K.getColumnIndex("TransactionTime"));
                int i6 = this.f24815K.getInt(this.f24815K.getColumnIndex("TransactionStatus"));
                String string6 = this.f24815K.getString(this.f24815K.getColumnIndex("PhoneNumber"));
                TextView textView19 = textView;
                string = this.f24815K.getString(this.f24815K.getColumnIndex("CartNumber"));
                String str = string2;
                string2 = this.f24815K.getString(this.f24815K.getColumnIndex("RefId"));
                OperatorType c = C2912b.m7289c(i);
                CharSequence b = C2912b.m7287b(c);
                if (string != null) {
                    if (!string.isEmpty()) {
                        textView11.setText(C2491i.m6777a(r0.f24808D, string));
                        if (!(string2 == null || string2.isEmpty())) {
                            if (i6 == 0) {
                                textView18.setText(C2491i.m6777a(r0.f24808D, string2));
                                imageView3 = imageView4;
                                imageView3.setImageBitmap(null);
                                C1212c.m2873a((C7249g) this).m10950a(Integer.valueOf(C2912b.m7284a(c))).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a)).m3031a(imageView3);
                                textView3.setText(b);
                                stringBuilder = new StringBuilder();
                                stringBuilder.append(C2912b.m7285a(i5));
                                stringBuilder.append(" ");
                                stringBuilder.append(C2491i.m6777a(r0.f24808D, C2491i.m6776a(string5)));
                                stringBuilder.append(" ");
                                stringBuilder.append(C4522p.m8236a(R.string.rial));
                                textView7.setText(stringBuilder.toString());
                                textView12.setText(C2912b.m7285a(i5));
                                textView5.setText(C2491i.m6777a(r0.f24808D, string6));
                                stringBuilder = new StringBuilder();
                                stringBuilder.append(C2491i.m6777a(r0.f24808D, C2491i.m6776a(string5)));
                                stringBuilder.append(" ");
                                stringBuilder.append(C4522p.m8236a(R.string.rial));
                                textView9.setText(stringBuilder.toString());
                                textView19.setText(C2491i.m6777a(r0.f24808D, C2491i.m6829d(MyApplication.m12952b(), Long.parseLong(str), r0.f24808D)));
                                if (i6 != 1) {
                                    textView11 = textView17;
                                    textView11.setText(C4522p.m8236a(R.string.successful));
                                    textView11.setTextColor(-16711936);
                                    i = R.drawable.ic_pay_ok;
                                    i2 = 0;
                                } else {
                                    textView11 = textView17;
                                    i2 = 0;
                                    textView11.setText(C4522p.m8236a(R.string.un_successful));
                                    textView11.setTextColor(-65536);
                                    i = R.drawable.ic_pay_error;
                                }
                                textView11.setCompoundDrawablesWithIntrinsicBounds(i2, i2, i, i2);
                                c0663a = c0663a3;
                                break;
                            }
                        }
                        linearLayout3.setVisibility(8);
                        imageView3 = imageView4;
                        imageView3.setImageBitmap(null);
                        C1212c.m2873a((C7249g) this).m10950a(Integer.valueOf(C2912b.m7284a(c))).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a)).m3031a(imageView3);
                        textView3.setText(b);
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(C2912b.m7285a(i5));
                        stringBuilder.append(" ");
                        stringBuilder.append(C2491i.m6777a(r0.f24808D, C2491i.m6776a(string5)));
                        stringBuilder.append(" ");
                        stringBuilder.append(C4522p.m8236a(R.string.rial));
                        textView7.setText(stringBuilder.toString());
                        textView12.setText(C2912b.m7285a(i5));
                        textView5.setText(C2491i.m6777a(r0.f24808D, string6));
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(C2491i.m6777a(r0.f24808D, C2491i.m6776a(string5)));
                        stringBuilder.append(" ");
                        stringBuilder.append(C4522p.m8236a(R.string.rial));
                        textView9.setText(stringBuilder.toString());
                        textView19.setText(C2491i.m6777a(r0.f24808D, C2491i.m6829d(MyApplication.m12952b(), Long.parseLong(str), r0.f24808D)));
                        if (i6 != 1) {
                            textView11 = textView17;
                            i2 = 0;
                            textView11.setText(C4522p.m8236a(R.string.un_successful));
                            textView11.setTextColor(-65536);
                            i = R.drawable.ic_pay_error;
                        } else {
                            textView11 = textView17;
                            textView11.setText(C4522p.m8236a(R.string.successful));
                            textView11.setTextColor(-16711936);
                            i = R.drawable.ic_pay_ok;
                            i2 = 0;
                        }
                        textView11.setCompoundDrawablesWithIntrinsicBounds(i2, i2, i, i2);
                        c0663a = c0663a3;
                    }
                }
                linearLayout2.setVisibility(8);
                if (i6 == 0) {
                    textView18.setText(C2491i.m6777a(r0.f24808D, string2));
                    imageView3 = imageView4;
                    imageView3.setImageBitmap(null);
                    C1212c.m2873a((C7249g) this).m10950a(Integer.valueOf(C2912b.m7284a(c))).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a)).m3031a(imageView3);
                    textView3.setText(b);
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(C2912b.m7285a(i5));
                    stringBuilder.append(" ");
                    stringBuilder.append(C2491i.m6777a(r0.f24808D, C2491i.m6776a(string5)));
                    stringBuilder.append(" ");
                    stringBuilder.append(C4522p.m8236a(R.string.rial));
                    textView7.setText(stringBuilder.toString());
                    textView12.setText(C2912b.m7285a(i5));
                    textView5.setText(C2491i.m6777a(r0.f24808D, string6));
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(C2491i.m6777a(r0.f24808D, C2491i.m6776a(string5)));
                    stringBuilder.append(" ");
                    stringBuilder.append(C4522p.m8236a(R.string.rial));
                    textView9.setText(stringBuilder.toString());
                    textView19.setText(C2491i.m6777a(r0.f24808D, C2491i.m6829d(MyApplication.m12952b(), Long.parseLong(str), r0.f24808D)));
                    if (i6 != 1) {
                        textView11 = textView17;
                        textView11.setText(C4522p.m8236a(R.string.successful));
                        textView11.setTextColor(-16711936);
                        i = R.drawable.ic_pay_ok;
                        i2 = 0;
                    } else {
                        textView11 = textView17;
                        i2 = 0;
                        textView11.setText(C4522p.m8236a(R.string.un_successful));
                        textView11.setTextColor(-65536);
                        i = R.drawable.ic_pay_error;
                    }
                    textView11.setCompoundDrawablesWithIntrinsicBounds(i2, i2, i, i2);
                    c0663a = c0663a3;
                } else {
                    linearLayout3.setVisibility(8);
                    imageView3 = imageView4;
                    imageView3.setImageBitmap(null);
                    C1212c.m2873a((C7249g) this).m10950a(Integer.valueOf(C2912b.m7284a(c))).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a)).m3031a(imageView3);
                    textView3.setText(b);
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(C2912b.m7285a(i5));
                    stringBuilder.append(" ");
                    stringBuilder.append(C2491i.m6777a(r0.f24808D, C2491i.m6776a(string5)));
                    stringBuilder.append(" ");
                    stringBuilder.append(C4522p.m8236a(R.string.rial));
                    textView7.setText(stringBuilder.toString());
                    textView12.setText(C2912b.m7285a(i5));
                    textView5.setText(C2491i.m6777a(r0.f24808D, string6));
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(C2491i.m6777a(r0.f24808D, C2491i.m6776a(string5)));
                    stringBuilder.append(" ");
                    stringBuilder.append(C4522p.m8236a(R.string.rial));
                    textView9.setText(stringBuilder.toString());
                    textView19.setText(C2491i.m6777a(r0.f24808D, C2491i.m6829d(MyApplication.m12952b(), Long.parseLong(str), r0.f24808D)));
                    if (i6 != 1) {
                        textView11 = textView17;
                        i2 = 0;
                        textView11.setText(C4522p.m8236a(R.string.un_successful));
                        textView11.setTextColor(-65536);
                        i = R.drawable.ic_pay_error;
                    } else {
                        textView11 = textView17;
                        textView11.setText(C4522p.m8236a(R.string.successful));
                        textView11.setTextColor(-16711936);
                        i = R.drawable.ic_pay_ok;
                        i2 = 0;
                    }
                    textView11.setCompoundDrawablesWithIntrinsicBounds(i2, i2, i, i2);
                    c0663a = c0663a3;
                }
                break;
            case 51:
                c0663a = new C0663a(context, R.style.AppCompatAlertDialogStyle);
                inflate = getLayoutInflater().inflate(R.layout.dialog_show_favorite_charge, null);
                c0663a.m1607a(inflate);
                textView2 = (TextView) inflate.findViewById(R.id.favorite_charge);
                textView = (TextView) inflate.findViewById(R.id.favorite_charge_header);
                final C2910a c2910a = new C2910a();
                c2910a.f9075b = context.f24815K.getString(context.f24815K.getColumnIndex("PhoneNumber"));
                c2910a.f9078e = context.f24815K.getString(context.f24815K.getColumnIndex("Amount"));
                c2910a.f9077d = context.f24815K.getInt(context.f24815K.getColumnIndex("IsTarabord")) == 1;
                c2910a.f9079f = context.f24815K.getInt(context.f24815K.getColumnIndex("ChargeType"));
                c2910a.f9075b = context.f24815K.getString(context.f24815K.getColumnIndex("PhoneNumber"));
                c2910a.f9076c = C2912b.m7289c(context.f24815K.getInt(context.f24815K.getColumnIndex("Operator")));
                c2910a.f9074a = context.f24815K.getString(context.f24815K.getColumnIndex("ChargeId"));
                final boolean z = context.f24815K.getInt(context.f24815K.getColumnIndex("IsFavorite")) == 1;
                if (z) {
                    textView.setText(R.string.favorite_charge_delete_question);
                    textView2.setVisibility(8);
                } else {
                    textView.setText(R.string.favorite_charge_question);
                    Object[] objArr = new Object[3];
                    objArr[0] = C2912b.m7287b(c2910a.f9076c);
                    objArr[1] = C2912b.m7285a(c2910a.f9079f);
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(C2491i.m6777a(context.f24808D, C2491i.m6776a(c2910a.f9078e)));
                    stringBuilder3.append(" ");
                    stringBuilder3.append(C4522p.m8236a(R.string.rial));
                    objArr[2] = stringBuilder3.toString();
                    textView2.setText(String.format("%s - %s - %s", objArr));
                }
                c0663a.m1614b(C4522p.m8236a(R.string.cancel), null);
                c0663a.m1609a(C4522p.m8236a(R.string.ok_cap), new DialogInterface.OnClickListener(context) {
                    final /* synthetic */ PayHistoryActivity f12601c;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C2962e.m7388a(C7576b.m20720x(), c2910a.f9074a, z ^ 1);
                    }
                });
                break;
            default:
                return null;
        }
        Dialog a = c0663a.m1612a();
        a.show();
        return a;
    }

    public final void mo2234c(int i) {
        this.f24815K = (Cursor) this.f24810F.m13685c(i);
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 50);
        b_(bundle);
    }

    public final void mo2235d(int i) {
        if (this.f24816L == C2763c.ChargePayment) {
            this.f24815K = (Cursor) this.f24810F.m13685c(i);
            Bundle bundle = new Bundle();
            bundle.putInt("dialog_id", 51);
            b_(bundle);
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f24508w.setLayoutResource(R.layout.fragment_pay_history);
        this.f24508w.inflate();
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            this.f24816L = (C2763c) getIntent().getExtras().getSerializable("PAYMENT_TYPE_KEY");
        }
        this.f24808D = C2535a.m6888a().m6919b();
        this.f24811G = (RelativeLayout) findViewById(R.id.root_layout);
        this.f24813I = (LinearLayout) findViewById(R.id.details_layout);
        this.f24814J = (LinearLayout) findViewById(R.id.root_recycler_view_linear_layout);
        this.f24806B = findViewById(R.id.spacer_view);
        this.f24812H = (ImageView) findViewById(R.id.sharedMedia_imageView);
        this.f24807C = (TextView) findViewById(R.id.sharedMedia_textView);
        C1212c.m2873a((C7249g) this).m10950a(Integer.valueOf(R.drawable.ic_place_holder_group)).m3034a(C1248f.m2945b()).m3031a(this.f24507v);
        m21490b(null);
        if (this.s != null) {
            m21489a(this.s);
            m21490b(this.s);
        }
        int b = (int) C2491i.m6804b((Context) this, 36.0f);
        C1212c.m2873a((C7249g) this).m10958e().m3036a(Integer.valueOf(this.f24816L == C2763c.ChargePayment ? R.drawable.ic_service_charge : R.drawable.ic_service_bill)).m3034a(C1248f.m2945b().m2955b(C1144h.f3692d).m2949a((int) R.drawable.ic_place_holder_group).m2962h().m2954b(b, b)).m3032a(new C76915(this, this.f24507v));
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        LayoutParams layoutParams = this.f24811G.getLayoutParams();
        if (!getResources().getBoolean(R.bool.xlarge)) {
            layoutParams.height = (int) (((float) (point.y - (C2491i.m6759a(getApplicationContext()) + C2491i.m6805b(getApplicationContext())))) + C2491i.m6804b(getApplicationContext(), 8.0f));
            if (getResources().getConfiguration().orientation == 2) {
                layoutParams.width = (int) (((double) point.x) * 0.75d);
            }
        }
        this.f24806B.setVisibility(8);
        this.f24810F = this.f24816L == C2763c.BillPayment ? new C7232a(this) : new C7234a(this);
        getLoaderManager().initLoader(54, null, this.f24817M);
        this.f24809E = (RecyclerView) findViewById(R.id.recycler_view);
        if (this.f24809E != null) {
            this.f24809E.setHasFixedSize(true);
            this.f24809E.setNestedScrollingEnabled(false);
            this.f24809E.setAdapter(this.f24810F);
            this.f24809E.setLayoutManager(new LinearLayoutManager(this));
            this.f24809E.scrollToPosition(0);
        }
        ((MyNestedScrollView) this.o).setOnScrollChangedListener(new C62881(this));
        mo3643g();
        m21488a(new C45802(this));
        m21491c(C4522p.m8236a(this.f24816L == C2763c.BillPayment ? R.string.bill_payment : R.string.purchase_charge_service));
        C2491i.m6796a(this.f24811G, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6796a(this.f24813I, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6796a(this.f24814J, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6796a(this.f24809E, UIThemeManager.getmInstance().getRecycler_view_background_color());
        C2491i.m6796a(this.f24806B, UIThemeManager.getmInstance().getSpacer_view_color());
        C2491i.m6802a(this.f24807C, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6801a(this.f24812H, UIThemeManager.getmInstance().getText_secondary_color());
        new View[1][0] = this.f24807C;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_pay_history, menu);
        return true;
    }

    protected void onDestroy() {
        super.onDestroy();
        if (this.f24809E != null) {
            this.f24809E.setItemAnimator(null);
            this.f24809E.setAdapter(null);
            this.f24809E = null;
        }
        this.f24810F = null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.action_pay_support) {
            C4478a.m8144a((Activity) this, "chs", null, null);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    protected void onResume() {
        super.onResume();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }
}
