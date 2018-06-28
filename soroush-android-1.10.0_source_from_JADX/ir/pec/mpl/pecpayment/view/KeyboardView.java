package ir.pec.mpl.pecpayment.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import ir.pec.mpl.pecpayment.C2338R;
import java.util.ArrayList;

public class KeyboardView extends FrameLayout implements OnClickListener {
    ArrayList<Integer> f7821a = new ArrayList();
    private EditText f7822b;
    private EditText f7823c;
    private EditText f7824d;
    private EditText f7825e;
    private TextView f7826f;
    private LinearLayout f7827g;
    private int f7828h = 700;
    private int f7829i = 0;
    private TableLayout f7830j;

    public KeyboardView(Context context) {
        super(context);
        m6557e();
    }

    public KeyboardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6557e();
    }

    public KeyboardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6557e();
    }

    private void m6557e() {
        inflate(getContext(), C2338R.layout.keyboard, this);
        m6558f();
    }

    private void m6558f() {
        this.f7821a.add(Integer.valueOf(0));
        this.f7821a.add(Integer.valueOf(1));
        this.f7821a.add(Integer.valueOf(2));
        this.f7821a.add(Integer.valueOf(3));
        this.f7821a.add(Integer.valueOf(4));
        this.f7821a.add(Integer.valueOf(5));
        this.f7821a.add(Integer.valueOf(6));
        this.f7821a.add(Integer.valueOf(7));
        this.f7821a.add(Integer.valueOf(8));
        this.f7821a.add(Integer.valueOf(9));
        this.f7822b = (EditText) m6559a(C2338R.id.password_field);
        this.f7830j = (TableLayout) m6559a(C2338R.id.keyboard);
        this.f7823c = (EditText) m6559a(C2338R.id.cvv2_field);
        this.f7824d = (EditText) m6559a(C2338R.id.year_field);
        this.f7825e = (EditText) m6559a(C2338R.id.month_field);
        this.f7826f = (TextView) m6559a(C2338R.id.seprator);
        this.f7827g = (LinearLayout) m6559a(C2338R.id.content);
        this.f7822b.setOnFocusChangeListener(new C2380f(this));
        this.f7822b.setOnClickListener(new C2382h(this));
        this.f7823c.setOnFocusChangeListener(new C2384j(this));
        this.f7823c.setOnClickListener(new C2386l(this));
        this.f7824d.setOnFocusChangeListener(new C2388n(this));
        this.f7824d.setOnClickListener(new C2390p(this));
        this.f7825e.setOnFocusChangeListener(new C2392r(this));
        this.f7825e.setOnClickListener(new C2394t(this));
        m6559a(C2338R.id.t9_key_0).setOnClickListener(this);
        ((TextView) m6559a(C2338R.id.t9_key_0)).setText(((Integer) this.f7821a.get(0)).toString());
        m6559a(C2338R.id.t9_key_1).setOnClickListener(this);
        ((TextView) m6559a(C2338R.id.t9_key_1)).setText(((Integer) this.f7821a.get(1)).toString());
        m6559a(C2338R.id.t9_key_2).setOnClickListener(this);
        ((TextView) m6559a(C2338R.id.t9_key_2)).setText(((Integer) this.f7821a.get(2)).toString());
        m6559a(C2338R.id.t9_key_3).setOnClickListener(this);
        ((TextView) m6559a(C2338R.id.t9_key_3)).setText(((Integer) this.f7821a.get(3)).toString());
        m6559a(C2338R.id.t9_key_4).setOnClickListener(this);
        ((TextView) m6559a(C2338R.id.t9_key_4)).setText(((Integer) this.f7821a.get(4)).toString());
        m6559a(C2338R.id.t9_key_5).setOnClickListener(this);
        ((TextView) m6559a(C2338R.id.t9_key_5)).setText(((Integer) this.f7821a.get(5)).toString());
        m6559a(C2338R.id.t9_key_6).setOnClickListener(this);
        ((TextView) m6559a(C2338R.id.t9_key_6)).setText(((Integer) this.f7821a.get(6)).toString());
        m6559a(C2338R.id.t9_key_7).setOnClickListener(this);
        ((TextView) m6559a(C2338R.id.t9_key_7)).setText(((Integer) this.f7821a.get(7)).toString());
        m6559a(C2338R.id.t9_key_8).setOnClickListener(this);
        ((TextView) m6559a(C2338R.id.t9_key_8)).setText(((Integer) this.f7821a.get(8)).toString());
        m6559a(C2338R.id.t9_key_9).setOnClickListener(this);
        ((TextView) m6559a(C2338R.id.t9_key_9)).setText(((Integer) this.f7821a.get(9)).toString());
        m6559a(C2338R.id.t9_key_clear).setOnClickListener(this);
        m6559a(C2338R.id.t9_key_backspace).setOnClickListener(this);
    }

    protected <T extends View> T m6559a(int i) {
        return super.findViewById(i);
    }

    public void m6560a() {
        this.f7830j.setVisibility(8);
        this.f7822b.setEnabled(true);
        this.f7823c.setEnabled(true);
        this.f7824d.setEnabled(true);
        this.f7825e.setEnabled(true);
    }

    public void m6561b() {
        this.f7823c.setVisibility(8);
        this.f7824d.setVisibility(8);
        this.f7825e.setVisibility(8);
        this.f7826f.setVisibility(8);
    }

    public void m6562c() {
        this.f7822b.clearAnimation();
    }

    public void m6563d() {
        this.f7830j.setVisibility(0);
        this.f7822b.setEnabled(false);
        this.f7823c.setEnabled(false);
        this.f7824d.setEnabled(false);
        this.f7825e.setEnabled(false);
    }

    public String getCVV2Text() {
        return this.f7823c.getText().toString();
    }

    public String getInputText() {
        return this.f7822b.getText().toString();
    }

    public String getMonthF() {
        return this.f7825e.getText().toString();
    }

    public String getYearF() {
        return this.f7824d.getText().toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r13) {
        /*
        r12 = this;
        r0 = r12.f7829i;
        r1 = 0;
        r2 = 9;
        r3 = 8;
        r4 = 7;
        r5 = 6;
        r6 = 5;
        r7 = 4;
        r8 = 3;
        r9 = 2;
        r10 = 0;
        r11 = 1;
        switch(r0) {
            case 1: goto L_0x021f;
            case 2: goto L_0x0171;
            case 3: goto L_0x00c3;
            case 4: goto L_0x0013;
            default: goto L_0x0012;
        };
    L_0x0012:
        return;
    L_0x0013:
        r13 = r13.getId();
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_0;
        if (r13 != r0) goto L_0x002e;
    L_0x001b:
        r0 = r12.f7825e;
        r2 = r12.f7821a;
        r2 = r2.get(r10);
    L_0x0023:
        r2 = (java.lang.Integer) r2;
        r2 = r2.toString();
        r0.append(r2);
        goto L_0x00a3;
    L_0x002e:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_1;
        if (r13 != r0) goto L_0x003b;
    L_0x0032:
        r0 = r12.f7825e;
        r2 = r12.f7821a;
        r2 = r2.get(r11);
        goto L_0x0023;
    L_0x003b:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_2;
        if (r13 != r0) goto L_0x0048;
    L_0x003f:
        r0 = r12.f7825e;
        r2 = r12.f7821a;
        r2 = r2.get(r9);
        goto L_0x0023;
    L_0x0048:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_3;
        if (r13 != r0) goto L_0x0055;
    L_0x004c:
        r0 = r12.f7825e;
        r2 = r12.f7821a;
        r2 = r2.get(r8);
        goto L_0x0023;
    L_0x0055:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_4;
        if (r13 != r0) goto L_0x0062;
    L_0x0059:
        r0 = r12.f7825e;
        r2 = r12.f7821a;
        r2 = r2.get(r7);
        goto L_0x0023;
    L_0x0062:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_5;
        if (r13 != r0) goto L_0x006f;
    L_0x0066:
        r0 = r12.f7825e;
        r2 = r12.f7821a;
        r2 = r2.get(r6);
        goto L_0x0023;
    L_0x006f:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_6;
        if (r13 != r0) goto L_0x007c;
    L_0x0073:
        r0 = r12.f7825e;
        r2 = r12.f7821a;
        r2 = r2.get(r5);
        goto L_0x0023;
    L_0x007c:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_7;
        if (r13 != r0) goto L_0x0089;
    L_0x0080:
        r0 = r12.f7825e;
        r2 = r12.f7821a;
        r2 = r2.get(r4);
        goto L_0x0023;
    L_0x0089:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_8;
        if (r13 != r0) goto L_0x0096;
    L_0x008d:
        r0 = r12.f7825e;
        r2 = r12.f7821a;
        r2 = r2.get(r3);
        goto L_0x0023;
    L_0x0096:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_9;
        if (r13 != r0) goto L_0x00a3;
    L_0x009a:
        r0 = r12.f7825e;
        r3 = r12.f7821a;
        r2 = r3.get(r2);
        goto L_0x0023;
    L_0x00a3:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_clear;
        if (r13 != r0) goto L_0x00ad;
    L_0x00a7:
        r13 = r12.f7825e;
    L_0x00a9:
        r13.setText(r1);
        return;
    L_0x00ad:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_backspace;
        if (r13 != r0) goto L_0x02cc;
    L_0x00b1:
        r13 = r12.f7825e;
        r13 = r13.getText();
        r0 = r13.length();
        if (r0 <= 0) goto L_0x02cc;
    L_0x00bd:
        r1 = r0 + -1;
        r13.delete(r1, r0);
        return;
    L_0x00c3:
        r13 = r13.getId();
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_0;
        if (r13 != r0) goto L_0x00de;
    L_0x00cb:
        r0 = r12.f7824d;
        r2 = r12.f7821a;
        r2 = r2.get(r10);
    L_0x00d3:
        r2 = (java.lang.Integer) r2;
        r2 = r2.toString();
        r0.append(r2);
        goto L_0x0153;
    L_0x00de:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_1;
        if (r13 != r0) goto L_0x00eb;
    L_0x00e2:
        r0 = r12.f7824d;
        r2 = r12.f7821a;
        r2 = r2.get(r11);
        goto L_0x00d3;
    L_0x00eb:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_2;
        if (r13 != r0) goto L_0x00f8;
    L_0x00ef:
        r0 = r12.f7824d;
        r2 = r12.f7821a;
        r2 = r2.get(r9);
        goto L_0x00d3;
    L_0x00f8:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_3;
        if (r13 != r0) goto L_0x0105;
    L_0x00fc:
        r0 = r12.f7824d;
        r2 = r12.f7821a;
        r2 = r2.get(r8);
        goto L_0x00d3;
    L_0x0105:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_4;
        if (r13 != r0) goto L_0x0112;
    L_0x0109:
        r0 = r12.f7824d;
        r2 = r12.f7821a;
        r2 = r2.get(r7);
        goto L_0x00d3;
    L_0x0112:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_5;
        if (r13 != r0) goto L_0x011f;
    L_0x0116:
        r0 = r12.f7824d;
        r2 = r12.f7821a;
        r2 = r2.get(r6);
        goto L_0x00d3;
    L_0x011f:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_6;
        if (r13 != r0) goto L_0x012c;
    L_0x0123:
        r0 = r12.f7824d;
        r2 = r12.f7821a;
        r2 = r2.get(r5);
        goto L_0x00d3;
    L_0x012c:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_7;
        if (r13 != r0) goto L_0x0139;
    L_0x0130:
        r0 = r12.f7824d;
        r2 = r12.f7821a;
        r2 = r2.get(r4);
        goto L_0x00d3;
    L_0x0139:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_8;
        if (r13 != r0) goto L_0x0146;
    L_0x013d:
        r0 = r12.f7824d;
        r2 = r12.f7821a;
        r2 = r2.get(r3);
        goto L_0x00d3;
    L_0x0146:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_9;
        if (r13 != r0) goto L_0x0153;
    L_0x014a:
        r0 = r12.f7824d;
        r3 = r12.f7821a;
        r2 = r3.get(r2);
        goto L_0x00d3;
    L_0x0153:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_clear;
        if (r13 != r0) goto L_0x015b;
    L_0x0157:
        r13 = r12.f7824d;
        goto L_0x00a9;
    L_0x015b:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_backspace;
        if (r13 != r0) goto L_0x02cc;
    L_0x015f:
        r13 = r12.f7824d;
        r13 = r13.getText();
        r0 = r13.length();
        if (r0 <= 0) goto L_0x0170;
    L_0x016b:
        r1 = r0 + -1;
        r13.delete(r1, r0);
    L_0x0170:
        return;
    L_0x0171:
        r13 = r13.getId();
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_0;
        if (r13 != r0) goto L_0x018c;
    L_0x0179:
        r0 = r12.f7823c;
        r2 = r12.f7821a;
        r2 = r2.get(r10);
    L_0x0181:
        r2 = (java.lang.Integer) r2;
        r2 = r2.toString();
        r0.append(r2);
        goto L_0x0201;
    L_0x018c:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_1;
        if (r13 != r0) goto L_0x0199;
    L_0x0190:
        r0 = r12.f7823c;
        r2 = r12.f7821a;
        r2 = r2.get(r11);
        goto L_0x0181;
    L_0x0199:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_2;
        if (r13 != r0) goto L_0x01a6;
    L_0x019d:
        r0 = r12.f7823c;
        r2 = r12.f7821a;
        r2 = r2.get(r9);
        goto L_0x0181;
    L_0x01a6:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_3;
        if (r13 != r0) goto L_0x01b3;
    L_0x01aa:
        r0 = r12.f7823c;
        r2 = r12.f7821a;
        r2 = r2.get(r8);
        goto L_0x0181;
    L_0x01b3:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_4;
        if (r13 != r0) goto L_0x01c0;
    L_0x01b7:
        r0 = r12.f7823c;
        r2 = r12.f7821a;
        r2 = r2.get(r7);
        goto L_0x0181;
    L_0x01c0:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_5;
        if (r13 != r0) goto L_0x01cd;
    L_0x01c4:
        r0 = r12.f7823c;
        r2 = r12.f7821a;
        r2 = r2.get(r6);
        goto L_0x0181;
    L_0x01cd:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_6;
        if (r13 != r0) goto L_0x01da;
    L_0x01d1:
        r0 = r12.f7823c;
        r2 = r12.f7821a;
        r2 = r2.get(r5);
        goto L_0x0181;
    L_0x01da:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_7;
        if (r13 != r0) goto L_0x01e7;
    L_0x01de:
        r0 = r12.f7823c;
        r2 = r12.f7821a;
        r2 = r2.get(r4);
        goto L_0x0181;
    L_0x01e7:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_8;
        if (r13 != r0) goto L_0x01f4;
    L_0x01eb:
        r0 = r12.f7823c;
        r2 = r12.f7821a;
        r2 = r2.get(r3);
        goto L_0x0181;
    L_0x01f4:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_9;
        if (r13 != r0) goto L_0x0201;
    L_0x01f8:
        r0 = r12.f7823c;
        r3 = r12.f7821a;
        r2 = r3.get(r2);
        goto L_0x0181;
    L_0x0201:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_clear;
        if (r13 != r0) goto L_0x0209;
    L_0x0205:
        r13 = r12.f7823c;
        goto L_0x00a9;
    L_0x0209:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_backspace;
        if (r13 != r0) goto L_0x02cc;
    L_0x020d:
        r13 = r12.f7823c;
        r13 = r13.getText();
        r0 = r13.length();
        if (r0 <= 0) goto L_0x021e;
    L_0x0219:
        r1 = r0 + -1;
        r13.delete(r1, r0);
    L_0x021e:
        return;
    L_0x021f:
        r13 = r13.getId();
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_0;
        if (r13 != r0) goto L_0x023a;
    L_0x0227:
        r0 = r12.f7822b;
        r2 = r12.f7821a;
        r2 = r2.get(r10);
    L_0x022f:
        r2 = (java.lang.Integer) r2;
        r2 = r2.toString();
        r0.append(r2);
        goto L_0x02af;
    L_0x023a:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_1;
        if (r13 != r0) goto L_0x0247;
    L_0x023e:
        r0 = r12.f7822b;
        r2 = r12.f7821a;
        r2 = r2.get(r11);
        goto L_0x022f;
    L_0x0247:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_2;
        if (r13 != r0) goto L_0x0254;
    L_0x024b:
        r0 = r12.f7822b;
        r2 = r12.f7821a;
        r2 = r2.get(r9);
        goto L_0x022f;
    L_0x0254:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_3;
        if (r13 != r0) goto L_0x0261;
    L_0x0258:
        r0 = r12.f7822b;
        r2 = r12.f7821a;
        r2 = r2.get(r8);
        goto L_0x022f;
    L_0x0261:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_4;
        if (r13 != r0) goto L_0x026e;
    L_0x0265:
        r0 = r12.f7822b;
        r2 = r12.f7821a;
        r2 = r2.get(r7);
        goto L_0x022f;
    L_0x026e:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_5;
        if (r13 != r0) goto L_0x027b;
    L_0x0272:
        r0 = r12.f7822b;
        r2 = r12.f7821a;
        r2 = r2.get(r6);
        goto L_0x022f;
    L_0x027b:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_6;
        if (r13 != r0) goto L_0x0288;
    L_0x027f:
        r0 = r12.f7822b;
        r2 = r12.f7821a;
        r2 = r2.get(r5);
        goto L_0x022f;
    L_0x0288:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_7;
        if (r13 != r0) goto L_0x0295;
    L_0x028c:
        r0 = r12.f7822b;
        r2 = r12.f7821a;
        r2 = r2.get(r4);
        goto L_0x022f;
    L_0x0295:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_8;
        if (r13 != r0) goto L_0x02a2;
    L_0x0299:
        r0 = r12.f7822b;
        r2 = r12.f7821a;
        r2 = r2.get(r3);
        goto L_0x022f;
    L_0x02a2:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_9;
        if (r13 != r0) goto L_0x02af;
    L_0x02a6:
        r0 = r12.f7822b;
        r3 = r12.f7821a;
        r2 = r3.get(r2);
        goto L_0x022f;
    L_0x02af:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_clear;
        if (r13 != r0) goto L_0x02b7;
    L_0x02b3:
        r13 = r12.f7822b;
        goto L_0x00a9;
    L_0x02b7:
        r0 = ir.pec.mpl.pecpayment.C2338R.id.t9_key_backspace;
        if (r13 != r0) goto L_0x02cc;
    L_0x02bb:
        r13 = r12.f7822b;
        r13 = r13.getText();
        r0 = r13.length();
        if (r0 <= 0) goto L_0x02cc;
    L_0x02c7:
        r1 = r0 + -1;
        r13.delete(r1, r0);
    L_0x02cc:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.pec.mpl.pecpayment.view.KeyboardView.onClick(android.view.View):void");
    }
}
