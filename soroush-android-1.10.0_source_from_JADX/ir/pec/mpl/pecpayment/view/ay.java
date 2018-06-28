package ir.pec.mpl.pecpayment.view;

import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;
import ir.pec.mpl.pecpayment.C2338R;
import ir.pec.mpl.pecpayment.p209a.C2343a;
import ir.pec.mpl.pecpayment.p209a.C2354h;
import ir.pec.mpl.pecpayment.p209a.C2355o;
import ir.pec.mpl.pecpayment.p209a.p210a.C2340b;
import ir.pec.mpl.pecpayment.p212b.p213a.C2357a;
import ir.pec.mpl.pecpayment.p212b.p213a.C2359c;
import ir.pec.mpl.pecpayment.p212b.p213a.C2360d;
import ir.pec.mpl.pecpayment.p212b.p213a.C2363g;
import ir.pec.mpl.pecpayment.p212b.p213a.C2368l;
import ir.pec.mpl.pecpayment.p212b.p213a.C2369m;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

class ay implements OnClickListener {
    final /* synthetic */ Button f7893a;
    final /* synthetic */ List f7894b;
    final /* synthetic */ C5740v f7895c;

    ay(C5740v c5740v, Button button, List list) {
        this.f7895c = c5740v;
        this.f7893a = button;
        this.f7894b = list;
    }

    public void onClick(View view) {
        C2359c c2359c;
        C2369m c2369m;
        JSONObject jSONObject;
        C2363g c2363g;
        if (this.f7895c.f15763p) {
            if (this.f7895c.f15746P == -1 || this.f7895c.f15769v.getInputText().length() < 5 || (this.f7895c.f15752e && (this.f7895c.f15769v.getCVV2Text().length() <= 2 || this.f7895c.f15769v.getYearF().length() <= 1 || this.f7895c.f15769v.getMonthF().length() <= 1))) {
                if (this.f7895c.f15770w.getText().toString().length() != 19 || this.f7895c.f15769v.getInputText().length() < 5 || !this.f7895c.m12832a(this.f7895c.f15770w.getText().toString()) || (this.f7895c.f15752e && (this.f7895c.f15769v.getCVV2Text().length() <= 2 || this.f7895c.f15769v.getYearF().length() <= 1 || this.f7895c.f15769v.getMonthF().length() <= 1))) {
                    this.f7893a.setVisibility(0);
                    if (this.f7895c.f15770w.getText().toString().length() == 19) {
                        if (this.f7895c.m12832a(this.f7895c.f15770w.getText().toString())) {
                            this.f7895c.f15769v.startAnimation(AnimationUtils.loadAnimation(this.f7895c.f15751a, C2338R.anim.wrong_field));
                            Toast.makeText(this.f7895c.f15751a, C2338R.string.invalid_card, 0).show();
                            return;
                        }
                    }
                    this.f7895c.f15770w.startAnimation(AnimationUtils.loadAnimation(this.f7895c.f15751a, C2338R.anim.wrong_field));
                    Toast.makeText(this.f7895c.f15751a, C2338R.string.invalid_card, 0).show();
                } else if (this.f7895c.f15737G.isChecked()) {
                    this.f7895c.f15765r.setVisibility(0);
                    this.f7895c.f15768u.setText(C2338R.string.waiting_btn);
                    this.f7895c.f15737G.setEnabled(false);
                    this.f7893a.setVisibility(4);
                    this.f7895c.f15768u.setBackgroundColor(Color.parseColor("#FB8C00"));
                    this.f7895c.f15770w.setEnabled(false);
                    this.f7895c.f15769v.setEnabled(false);
                    this.f7895c.f15769v.m6560a();
                    this.f7895c.f15769v.m6562c();
                    this.f7895c.f15768u.setClickable(false);
                    c2359c = new C2359c();
                    c2369m = new C2369m();
                    c2369m.m6519c(this.f7895c.f15753f);
                    c2369m.m6514a(this.f7895c.f15756i);
                    c2369m.m6515a(c2359c);
                    jSONObject = new JSONObject();
                    try {
                        c2363g = new C2363g();
                        jSONObject.put("PAN", this.f7895c.f15770w.getText().toString().replace("-", "").toString());
                        C2357a.m6424a().m6427c(this.f7895c.f15770w.getText().toString().replace("-", "").toString());
                        jSONObject.put("PIN2", this.f7895c.f15769v.getInputText());
                        jSONObject.put("N", C2343a.m6350a(this.f7895c.f15751a).m6353a());
                        jSONObject.put("CV", this.f7895c.f15769v.getCVV2Text());
                        jSONObject.put("ExpY", this.f7895c.f15769v.getYearF());
                        jSONObject.put("ExpM", this.f7895c.f15769v.getMonthF());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    c2369m.m6516a(new C2340b().m6343a(jSONObject.toString(), this.f7895c.f15762o, this.f7895c.f15761n));
                    C2343a.m6350a(this.f7895c.f15751a).m6359a(c2369m, this.f7895c.f15758k, this.f7895c.f15759l, this.f7895c.f15762o, this.f7895c.f15761n);
                } else {
                    this.f7893a.setVisibility(0);
                    this.f7895c.f15745O.startAnimation(AnimationUtils.loadAnimation(this.f7895c.f15751a, C2338R.anim.wrong_field));
                    Toast.makeText(this.f7895c.f15751a, C2338R.string.rule_not_confirmed, 0).show();
                }
            } else if (this.f7895c.f15737G.isChecked()) {
                this.f7895c.f15765r.setVisibility(0);
                this.f7895c.f15768u.setText(C2338R.string.waiting_btn);
                this.f7895c.f15737G.setEnabled(false);
                this.f7893a.setVisibility(4);
                this.f7895c.f15769v.m6560a();
                this.f7895c.f15769v.m6562c();
                this.f7895c.f15768u.setBackgroundColor(Color.parseColor("#FB8C00"));
                this.f7895c.f15770w.setEnabled(false);
                this.f7895c.f15769v.setEnabled(false);
                this.f7895c.f15768u.setClickable(false);
                c2359c = new C2359c();
                c2369m = new C2369m();
                c2369m.m6519c(this.f7895c.f15753f);
                c2369m.m6514a(this.f7895c.f15756i);
                c2369m.m6513a(this.f7895c.f15755h);
                c2369m.m6518b(this.f7895c.f15760m);
                c2369m.m6515a(c2359c);
                jSONObject = new JSONObject();
                try {
                    c2363g = new C2363g();
                    jSONObject.put("PAN", "0");
                    C2357a.m6424a().m6427c(((C2360d) this.f7894b.get(this.f7895c.f15746P)).m6434b());
                    jSONObject.put("PIN2", this.f7895c.f15769v.getInputText());
                    jSONObject.put("N", C2343a.m6350a(this.f7895c.f15751a).m6353a());
                    jSONObject.put("CV", this.f7895c.f15769v.getCVV2Text());
                    jSONObject.put("ExpY", this.f7895c.f15769v.getYearF());
                    jSONObject.put("ExpM", this.f7895c.f15769v.getMonthF());
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                c2369m.m6516a(new C2340b().m6343a(jSONObject.toString(), this.f7895c.f15762o, this.f7895c.f15761n));
                C2343a.m6350a(this.f7895c.f15751a).m6359a(c2369m, this.f7895c.f15758k, this.f7895c.f15759l, this.f7895c.f15762o, this.f7895c.f15761n);
            } else {
                this.f7893a.setVisibility(0);
                this.f7895c.f15745O.startAnimation(AnimationUtils.loadAnimation(this.f7895c.f15751a, C2338R.anim.wrong_field));
                Toast.makeText(this.f7895c.f15751a, C2338R.string.rule_not_confirmed, 0).show();
            }
        } else if (this.f7895c.f15747Q) {
            if (this.f7895c.f15746P == -1 || this.f7895c.f15769v.getInputText().length() < 5 || (this.f7895c.f15752e && (this.f7895c.f15769v.getCVV2Text().length() <= 2 || this.f7895c.f15769v.getYearF().length() <= 1 || this.f7895c.f15769v.getMonthF().length() <= 1))) {
                if (this.f7895c.f15770w.getText().toString().length() != 19 || this.f7895c.f15769v.getInputText().length() < 5 || !this.f7895c.m12832a(this.f7895c.f15770w.getText().toString()) || (this.f7895c.f15752e && (this.f7895c.f15769v.getCVV2Text().length() <= 2 || this.f7895c.f15769v.getYearF().length() <= 1 || this.f7895c.f15769v.getMonthF().length() <= 1))) {
                    this.f7893a.setVisibility(0);
                    if (this.f7895c.f15770w.getText().toString().length() == 19) {
                        if (this.f7895c.m12832a(this.f7895c.f15770w.getText().toString())) {
                            this.f7895c.f15769v.startAnimation(AnimationUtils.loadAnimation(this.f7895c.f15751a, C2338R.anim.wrong_field));
                            Toast.makeText(this.f7895c.f15751a, C2338R.string.invalid_card, 0).show();
                            return;
                        }
                    }
                    this.f7895c.f15770w.startAnimation(AnimationUtils.loadAnimation(this.f7895c.f15751a, C2338R.anim.wrong_field));
                    Toast.makeText(this.f7895c.f15751a, C2338R.string.invalid_card, 0).show();
                } else if (this.f7895c.f15737G.isChecked()) {
                    this.f7895c.f15765r.setVisibility(0);
                    this.f7895c.f15768u.setText(C2338R.string.waiting_btn);
                    this.f7895c.f15737G.setEnabled(false);
                    this.f7893a.setVisibility(4);
                    this.f7895c.f15768u.setBackgroundColor(Color.parseColor("#FB8C00"));
                    this.f7895c.f15770w.setEnabled(false);
                    this.f7895c.f15769v.setEnabled(false);
                    this.f7895c.f15769v.m6560a();
                    this.f7895c.f15769v.m6562c();
                    this.f7895c.f15768u.setClickable(false);
                    c2359c = new C2359c();
                    c2369m = new C2369m();
                    c2369m.m6519c(this.f7895c.f15753f);
                    c2369m.m6514a(this.f7895c.f15756i);
                    c2369m.m6515a(c2359c);
                    jSONObject = new JSONObject();
                    try {
                        c2363g = new C2363g();
                        jSONObject.put("PAN", this.f7895c.f15770w.getText().toString().replace("-", "").toString());
                        C2357a.m6424a().m6427c(this.f7895c.f15770w.getText().toString().replace("-", "").toString());
                        jSONObject.put("PIN2", this.f7895c.f15769v.getInputText());
                        jSONObject.put("N", C2343a.m6350a(this.f7895c.f15751a).m6353a());
                        jSONObject.put("CV", this.f7895c.f15769v.getCVV2Text());
                        jSONObject.put("ExpY", this.f7895c.f15769v.getYearF());
                        jSONObject.put("ExpM", this.f7895c.f15769v.getMonthF());
                    } catch (JSONException e22) {
                        e22.printStackTrace();
                    }
                    c2369m.m6516a(new C2340b().m6343a(jSONObject.toString(), this.f7895c.f15762o, this.f7895c.f15761n));
                    C2355o.m6409a(this.f7895c.f15751a).m6419a(c2369m, this.f7895c.f15758k, this.f7895c.f15759l, this.f7895c.f15762o, this.f7895c.f15761n);
                } else {
                    this.f7893a.setVisibility(0);
                    this.f7895c.f15745O.startAnimation(AnimationUtils.loadAnimation(this.f7895c.f15751a, C2338R.anim.wrong_field));
                    Toast.makeText(this.f7895c.f15751a, C2338R.string.rule_not_confirmed, 0).show();
                }
            } else if (this.f7895c.f15737G.isChecked()) {
                this.f7895c.f15765r.setVisibility(0);
                this.f7895c.f15768u.setText(C2338R.string.waiting_btn);
                this.f7895c.f15737G.setEnabled(false);
                this.f7893a.setVisibility(4);
                this.f7895c.f15769v.m6560a();
                this.f7895c.f15769v.m6562c();
                this.f7895c.f15768u.setBackgroundColor(Color.parseColor("#FB8C00"));
                this.f7895c.f15770w.setEnabled(false);
                this.f7895c.f15769v.setEnabled(false);
                this.f7895c.f15768u.setClickable(false);
                c2359c = new C2359c();
                c2369m = new C2369m();
                c2369m.m6519c(this.f7895c.f15753f);
                c2369m.m6514a(this.f7895c.f15756i);
                c2369m.m6513a(this.f7895c.f15755h);
                c2369m.m6518b(this.f7895c.f15760m);
                c2369m.m6515a(c2359c);
                jSONObject = new JSONObject();
                try {
                    c2363g = new C2363g();
                    jSONObject.put("PAN", "0");
                    C2357a.m6424a().m6427c(((C2360d) this.f7894b.get(this.f7895c.f15746P)).m6434b());
                    jSONObject.put("PIN2", this.f7895c.f15769v.getInputText());
                    jSONObject.put("N", C2355o.m6409a(this.f7895c.f15751a).m6413a());
                    jSONObject.put("CV", this.f7895c.f15769v.getCVV2Text());
                    jSONObject.put("ExpY", this.f7895c.f15769v.getYearF());
                    jSONObject.put("ExpM", this.f7895c.f15769v.getMonthF());
                } catch (JSONException e222) {
                    e222.printStackTrace();
                }
                c2369m.m6516a(new C2340b().m6343a(jSONObject.toString(), this.f7895c.f15762o, this.f7895c.f15761n));
                C2355o.m6409a(this.f7895c.f15751a).m6419a(c2369m, this.f7895c.f15758k, this.f7895c.f15759l, this.f7895c.f15762o, this.f7895c.f15761n);
            } else {
                this.f7893a.setVisibility(0);
                this.f7895c.f15745O.startAnimation(AnimationUtils.loadAnimation(this.f7895c.f15751a, C2338R.anim.wrong_field));
                Toast.makeText(this.f7895c.f15751a, C2338R.string.rule_not_confirmed, 0).show();
            }
        } else if (this.f7895c.f15746P == -1 || this.f7895c.f15769v.getInputText().length() < 5 || (this.f7895c.f15752e && (this.f7895c.f15769v.getCVV2Text().length() <= 2 || this.f7895c.f15769v.getYearF().length() <= 1 || this.f7895c.f15769v.getMonthF().length() <= 1))) {
            if (this.f7895c.f15770w.getText().toString().length() != 19 || this.f7895c.f15769v.getInputText().length() < 5 || !this.f7895c.m12832a(this.f7895c.f15770w.getText().toString()) || (this.f7895c.f15752e && (this.f7895c.f15769v.getCVV2Text().length() <= 2 || this.f7895c.f15769v.getYearF().length() <= 1 || this.f7895c.f15769v.getMonthF().length() <= 1))) {
                this.f7893a.setVisibility(0);
                if (this.f7895c.f15770w.getText().toString().length() == 19) {
                    if (this.f7895c.m12832a(this.f7895c.f15770w.getText().toString())) {
                        this.f7895c.f15769v.startAnimation(AnimationUtils.loadAnimation(this.f7895c.f15751a, C2338R.anim.wrong_field));
                        Toast.makeText(this.f7895c.f15751a, C2338R.string.invalid_card, 0).show();
                        return;
                    }
                }
                this.f7895c.f15770w.startAnimation(AnimationUtils.loadAnimation(this.f7895c.f15751a, C2338R.anim.wrong_field));
                Toast.makeText(this.f7895c.f15751a, C2338R.string.invalid_card, 0).show();
            } else if (this.f7895c.f15737G.isChecked()) {
                this.f7895c.f15737G.setEnabled(false);
                this.f7895c.f15765r.setVisibility(0);
                this.f7895c.f15768u.setText(C2338R.string.waiting_btn);
                this.f7893a.setVisibility(4);
                this.f7895c.f15768u.setBackgroundColor(Color.parseColor("#FB8C00"));
                this.f7895c.f15770w.setEnabled(false);
                this.f7895c.f15769v.setEnabled(false);
                this.f7895c.f15769v.m6560a();
                this.f7895c.f15769v.m6562c();
                this.f7895c.f15768u.setClickable(false);
                c2359c = new C2359c();
                c2369m = new C2369m();
                c2369m.m6519c(this.f7895c.f15753f);
                c2369m.m6514a(this.f7895c.f15756i);
                c2369m.m6513a(this.f7895c.f15755h);
                c2369m.m6518b(this.f7895c.f15760m);
                c2369m.m6515a(c2359c);
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("PAN", this.f7895c.f15770w.getText().toString().replace("-", "").toString());
                    C2368l.m6509a().m6510a(this.f7895c.f15770w.getText().toString().replace("-", "").toString());
                    jSONObject.put("PIN2", this.f7895c.f15769v.getInputText());
                    jSONObject.put("N", C2354h.m6385a(this.f7895c.f15751a).m6402b());
                    jSONObject.put("CV", this.f7895c.f15769v.getCVV2Text());
                    jSONObject.put("ExpY", this.f7895c.f15769v.getYearF());
                    jSONObject.put("ExpM", this.f7895c.f15769v.getMonthF());
                } catch (JSONException e2222) {
                    e2222.printStackTrace();
                }
                c2369m.m6516a(new C2340b().m6343a(jSONObject.toString(), this.f7895c.f15762o, this.f7895c.f15761n));
                C2354h.m6385a(this.f7895c.f15751a).m6396a(c2369m, this.f7895c.f15758k, this.f7895c.f15759l, this.f7895c.f15762o, this.f7895c.f15761n);
            } else {
                this.f7893a.setVisibility(0);
                this.f7895c.f15745O.startAnimation(AnimationUtils.loadAnimation(this.f7895c.f15751a, C2338R.anim.wrong_field));
                Toast.makeText(this.f7895c.f15751a, C2338R.string.rule_not_confirmed, 0).show();
            }
        } else if (this.f7895c.f15737G.isChecked()) {
            this.f7895c.f15765r.setVisibility(0);
            this.f7895c.f15737G.setEnabled(false);
            this.f7895c.f15768u.setText(C2338R.string.waiting_btn);
            this.f7893a.setVisibility(4);
            this.f7895c.f15768u.setBackgroundColor(Color.parseColor("#FB8C00"));
            this.f7895c.f15770w.setEnabled(false);
            this.f7895c.f15769v.setEnabled(false);
            this.f7895c.f15769v.m6560a();
            this.f7895c.f15769v.m6562c();
            this.f7895c.f15768u.setClickable(false);
            c2359c = new C2359c();
            c2369m = new C2369m();
            c2369m.m6519c(this.f7895c.f15753f);
            c2369m.m6514a(this.f7895c.f15756i);
            c2369m.m6513a(this.f7895c.f15755h);
            c2369m.m6518b(this.f7895c.f15760m);
            c2369m.m6515a(c2359c);
            jSONObject = new JSONObject();
            try {
                jSONObject.put("PAN", ((C2360d) this.f7894b.get(this.f7895c.f15746P)).m6434b());
                C2368l.m6509a().m6510a(((C2360d) this.f7894b.get(this.f7895c.f15746P)).m6434b());
                jSONObject.put("PIN2", this.f7895c.f15769v.getInputText());
                jSONObject.put("N", C2354h.m6385a(this.f7895c.f15751a).m6402b());
                jSONObject.put("CV", this.f7895c.f15769v.getCVV2Text());
                jSONObject.put("ExpY", this.f7895c.f15769v.getYearF());
                jSONObject.put("ExpM", this.f7895c.f15769v.getMonthF());
            } catch (JSONException e22222) {
                e22222.printStackTrace();
            }
            c2369m.m6516a(new C2340b().m6343a(jSONObject.toString(), this.f7895c.f15762o, this.f7895c.f15761n));
            C2354h.m6385a(this.f7895c.f15751a).m6396a(c2369m, this.f7895c.f15758k, this.f7895c.f15759l, this.f7895c.f15762o, this.f7895c.f15761n);
        } else {
            this.f7893a.setVisibility(0);
            this.f7895c.f15745O.startAnimation(AnimationUtils.loadAnimation(this.f7895c.f15751a, C2338R.anim.wrong_field));
            Toast.makeText(this.f7895c.f15751a, C2338R.string.rule_not_confirmed, 0).show();
        }
    }
}
