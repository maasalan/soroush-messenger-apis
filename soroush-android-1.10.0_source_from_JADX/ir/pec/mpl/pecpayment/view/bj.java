package ir.pec.mpl.pecpayment.view;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import ir.pec.mpl.pecpayment.C2338R;
import java.util.HashMap;

public class bj implements TextWatcher {
    private AutoCompleteTextView f7915a;
    private String f7916b;
    private String f7917c;
    private ImageView f7918d;
    private boolean f7919e;
    private boolean f7920f;
    private boolean f7921g;
    private boolean f7922h;
    private HashMap<String, Integer> f7923i = new HashMap();

    public bj(AutoCompleteTextView autoCompleteTextView, ImageView imageView) {
        this.f7915a = autoCompleteTextView;
        this.f7919e = false;
        this.f7920f = false;
        this.f7921g = false;
        this.f7922h = false;
        this.f7918d = imageView;
        m6566a();
    }

    private void m6566a() {
        this.f7923i.put("603799", Integer.valueOf(C2338R.drawable.bank_meli_iran_pec));
        this.f7923i.put("589210", Integer.valueOf(C2338R.drawable.bank_sepah_pec));
        this.f7923i.put("627648", Integer.valueOf(C2338R.drawable.bank_tosee_saderat_pec));
        this.f7923i.put("207177", Integer.valueOf(C2338R.drawable.bank_tosee_saderat_pec));
        this.f7923i.put("627961", Integer.valueOf(C2338R.drawable.bank_sanaat_o_maadan_pec));
        this.f7923i.put("603770", Integer.valueOf(C2338R.drawable.bank_keshavarzi_pec));
        this.f7923i.put("639217", Integer.valueOf(C2338R.drawable.bank_keshavarzi_pec));
        this.f7923i.put("628023", Integer.valueOf(C2338R.drawable.bank_maskan_pec));
        this.f7923i.put("627760", Integer.valueOf(C2338R.drawable.bank_post_nabk_pec));
        this.f7923i.put("502908", Integer.valueOf(C2338R.drawable.bank_toose_taavon_pec));
        this.f7923i.put("627412", Integer.valueOf(C2338R.drawable.bank_eghtesad_novin_pec));
        this.f7923i.put("622106", Integer.valueOf(C2338R.drawable.bank_parsian_pec));
        this.f7923i.put("627884", Integer.valueOf(C2338R.drawable.bank_parsian_pec));
        this.f7923i.put("639347", Integer.valueOf(C2338R.drawable.bank_pasargad_pec));
        this.f7923i.put("502229", Integer.valueOf(C2338R.drawable.bank_pasargad_pec));
        this.f7923i.put("627488", Integer.valueOf(C2338R.drawable.bank_karafarin_pec));
        this.f7923i.put("502910", Integer.valueOf(C2338R.drawable.bank_karafarin_pec));
        this.f7923i.put("621986", Integer.valueOf(C2338R.drawable.bank_saman_pec));
        this.f7923i.put("639346", Integer.valueOf(C2338R.drawable.bank_sina_pec));
        this.f7923i.put("639607", Integer.valueOf(C2338R.drawable.bank_sarmaye_pec));
        this.f7923i.put("636214", Integer.valueOf(C2338R.drawable.bank_tat_pec));
        this.f7923i.put("502806", Integer.valueOf(C2338R.drawable.bank_shahr_pec));
        this.f7923i.put("504706", Integer.valueOf(C2338R.drawable.bank_shahr_pec));
        this.f7923i.put("502938", Integer.valueOf(C2338R.drawable.bank_dey_pec));
        this.f7923i.put("603769", Integer.valueOf(C2338R.drawable.bank_saderat_pec));
        this.f7923i.put("610433", Integer.valueOf(C2338R.drawable.bank_mellat_pec));
        this.f7923i.put("991975", Integer.valueOf(C2338R.drawable.bank_mellat_pec));
        this.f7923i.put("627353", Integer.valueOf(C2338R.drawable.bank_tejarat_pec));
        this.f7923i.put("589463", Integer.valueOf(C2338R.drawable.bank_refah_pec));
        this.f7923i.put("627381", Integer.valueOf(C2338R.drawable.bank_ansar_pec));
        this.f7923i.put("505785", Integer.valueOf(C2338R.drawable.bank_iran_zamin_pec));
        this.f7923i.put("636949", Integer.valueOf(C2338R.drawable.bank_hekmat_pec));
        this.f7923i.put("505416", Integer.valueOf(C2338R.drawable.bank_gardeshgari_pec));
        this.f7923i.put("606373", Integer.valueOf(C2338R.drawable.bank_mehr_pec));
        this.f7923i.put("628157", Integer.valueOf(C2338R.drawable.bank_etebarie_tosee_pec));
        this.f7923i.put("639370", Integer.valueOf(C2338R.drawable.bank_mehr_pec));
        this.f7923i.put("639599", Integer.valueOf(C2338R.drawable.bank_ghavamin_pec));
    }

    public void afterTextChanged(Editable editable) {
        if (this.f7920f) {
            this.f7919e = true;
            this.f7920f = false;
            AutoCompleteTextView autoCompleteTextView = this.f7915a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f7917c);
            stringBuilder.append("-");
            autoCompleteTextView.setText(stringBuilder.toString());
        } else if (this.f7921g) {
            this.f7921g = false;
            this.f7919e = true;
            this.f7915a.setText(this.f7916b);
        } else if (this.f7922h) {
            this.f7922h = false;
            this.f7919e = true;
            this.f7917c = this.f7917c.substring(0, this.f7917c.length() - 1);
            this.f7915a.setText(this.f7917c);
        } else {
            this.f7919e = false;
            this.f7915a.setSelection(this.f7915a.getText().length());
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (i >= 19) {
            this.f7916b = charSequence.toString();
        }
    }

    public void onTextChanged(java.lang.CharSequence r7, int r8, int r9, int r10) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r6 = this;
        r0 = r6.f7915a;
        r0 = r0.getText();
        r0 = r0.toString();
        r0 = r0.length();
        r1 = 4;
        r2 = 7;
        if (r0 != r2) goto L_0x0044;
    L_0x0012:
        r0 = r6.f7918d;
        r2 = 0;
        r0.setVisibility(r2);
        r0 = r6.f7918d;	 Catch:{ Exception -> 0x003c }
        r2 = r6.f7923i;	 Catch:{ Exception -> 0x003c }
        r3 = r6.f7915a;	 Catch:{ Exception -> 0x003c }
        r3 = r3.getText();	 Catch:{ Exception -> 0x003c }
        r3 = r3.toString();	 Catch:{ Exception -> 0x003c }
        r4 = "-";	 Catch:{ Exception -> 0x003c }
        r5 = "";	 Catch:{ Exception -> 0x003c }
        r3 = r3.replace(r4, r5);	 Catch:{ Exception -> 0x003c }
        r2 = r2.get(r3);	 Catch:{ Exception -> 0x003c }
        r2 = (java.lang.Integer) r2;	 Catch:{ Exception -> 0x003c }
        r2 = r2.intValue();	 Catch:{ Exception -> 0x003c }
        r0.setImageResource(r2);	 Catch:{ Exception -> 0x003c }
        goto L_0x0059;
    L_0x003c:
        r0 = r6.f7918d;
        r2 = ir.pec.mpl.pecpayment.C2338R.drawable.default_bank_pec;
        r0.setImageResource(r2);
        goto L_0x0059;
    L_0x0044:
        r0 = r6.f7915a;
        r0 = r0.getText();
        r0 = r0.toString();
        r0 = r0.length();
        if (r0 >= r2) goto L_0x0059;
    L_0x0054:
        r0 = r6.f7918d;
        r0.setVisibility(r1);
    L_0x0059:
        r0 = 1;
        if (r9 >= r10) goto L_0x0082;
    L_0x005c:
        r9 = r6.f7919e;
        if (r9 != 0) goto L_0x0082;
    L_0x0060:
        r9 = 3;
        if (r8 == r9) goto L_0x0079;
    L_0x0063:
        r9 = 8;
        if (r8 == r9) goto L_0x0079;
    L_0x0067:
        r9 = 13;
        if (r8 != r9) goto L_0x006c;
    L_0x006b:
        goto L_0x0079;
    L_0x006c:
        r9 = 19;
        if (r8 < r9) goto L_0x0094;
    L_0x0070:
        r7 = r7.toString();
        r6.f7917c = r7;
        r6.f7921g = r0;
        return;
    L_0x0079:
        r7 = r7.toString();
        r6.f7917c = r7;
        r6.f7920f = r0;
        return;
    L_0x0082:
        if (r8 == r1) goto L_0x008c;
    L_0x0084:
        r9 = 9;
        if (r8 == r9) goto L_0x008c;
    L_0x0088:
        r9 = 14;
        if (r8 != r9) goto L_0x0094;
    L_0x008c:
        r7 = r7.toString();
        r6.f7917c = r7;
        r6.f7922h = r0;
    L_0x0094:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.pec.mpl.pecpayment.view.bj.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
