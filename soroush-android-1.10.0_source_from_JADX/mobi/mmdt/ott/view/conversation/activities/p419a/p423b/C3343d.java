package mobi.mmdt.ott.view.conversation.activities.p419a.p423b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.C6351c;
import android.support.v4.app.C0417s.C0416a;
import android.support.v4.p029a.C0350e;
import android.support.v7.app.C7406c;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p287g.p293b.C2676c;
import mobi.mmdt.ott.logic.p261a.p287g.p293b.C6728e;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.conversation.activities.p419a.p420a.C7190a;

public final class C3343d {
    public String f10262a = "";
    public C7406c f10263b;
    EditText f10264c;
    C6351c f10265d;
    public C7190a f10266e;
    ProgressWheel f10267f;
    View f10268g;
    public HashMap<String, Integer> f10269h;
    String f10270i = "";
    public C0416a<Cursor> f10271j = new C61254(this);
    private TextView f10272k;

    class C33402 implements TextWatcher {
        final /* synthetic */ C3343d f10259a;

        C33402(C3343d c3343d) {
            this.f10259a = c3343d;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f10259a.f10270i = charSequence.toString();
            Bundle bundle = new Bundle();
            bundle.putString("searchPattern", this.f10259a.f10270i);
            this.f10259a.f10263b.m19190e().mo270b(57, bundle, this.f10259a.f10271j);
        }
    }

    class C33413 implements OnDismissListener {
        final /* synthetic */ C3343d f10260a;

        C33413(C3343d c3343d) {
            this.f10260a = c3343d;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            C3343d c3343d = this.f10260a;
            c3343d.f10269h.clear();
            if (c3343d.f10264c != null) {
                c3343d.f10264c.setText("");
            }
            c3343d.f10268g.setVisibility(8);
        }
    }

    class C33425 implements Runnable {
        final /* synthetic */ C3343d f10261a;

        public C33425(C3343d c3343d) {
            this.f10261a = c3343d;
        }

        public final void run() {
            this.f10261a.f10265d.show();
        }
    }

    class C61254 implements C0416a<Cursor> {
        final /* synthetic */ C3343d f16507a;

        C61254(C3343d c3343d) {
            this.f16507a = c3343d;
        }

        public final C0350e<Cursor> mo2226a(int i, Bundle bundle) {
            String str = "";
            if (bundle != null) {
                str = bundle.getString("searchPattern");
            }
            return C2980g.m7449j(str);
        }

        public final void mo2227a() {
        }

        public final /* synthetic */ void mo2228a(C0350e c0350e, Object obj) {
            Cursor cursor = (Cursor) obj;
            this.f16507a.f10267f.setVisibility(8);
            if (this.f16507a.f10266e != null) {
                C7190a c7190a = this.f16507a.f10266e;
                c7190a.f20696a = this.f16507a.f10270i;
                c7190a.notifyDataSetChanged();
                this.f16507a.f10266e.m13684c(cursor);
            }
        }
    }

    public C3343d(C7406c c7406c, View view, final HashMap<String, Integer> hashMap) {
        this.f10263b = c7406c;
        BottomSheetBehavior b = BottomSheetBehavior.m8727b(view.findViewById(R.id.bottom_sheet));
        this.f10269h = hashMap;
        if (b.f13049d == 3) {
            b.m8743c(4);
        }
        this.f10265d = new C6351c(c7406c);
        view = c7406c.getLayoutInflater().inflate(R.layout.floating_forward_bottom_sheet_layout, null);
        this.f10266e = new C7190a(c7406c, hashMap);
        View view2 = (RelativeLayout) view.findViewById(R.id.root_linear_layout_floating_forward);
        this.f10267f = (ProgressWheel) view.findViewById(R.id.progress_wheel);
        this.f10264c = (EditText) view.findViewById(R.id.search_edit_text);
        TextView textView = (TextView) view.findViewById(R.id.send_text);
        this.f10272k = (TextView) view.findViewById(R.id.count_text_1);
        this.f10264c.setText("");
        this.f10272k.setTextColor(UIThemeManager.getmInstance().getRecycler_view_background_color());
        this.f10272k.setTypeface(this.f10272k.getTypeface(), 1);
        this.f10268g = view.findViewById(R.id.root_send);
        this.f10268g.setVisibility(8);
        this.f10268g.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ C3343d f10258b;

            public final void onClick(View view) {
                C3343d.m7823a(this.f10258b, new ArrayList(hashMap.keySet()), new ArrayList(hashMap.values()));
                this.f10258b.f10265d.dismiss();
            }
        });
        int accent_color = UIThemeManager.getmInstance().getAccent_color();
        C2491i.m6802a(textView, accent_color);
        C2491i.m6790a(this.f10272k.getBackground(), accent_color);
        accent_color = UIThemeManager.getmInstance().getText_secondary_color();
        C2491i.m6779a(accent_color, accent_color, accent_color, this.f10264c);
        C2491i.m6796a(view2, UIThemeManager.getmInstance().getRecycler_view_background_color());
        if (this.f10264c.getCompoundDrawables().length > 0 && this.f10264c.getCompoundDrawables()[2] != null) {
            C2491i.m6790a(this.f10264c.getCompoundDrawables()[2], accent_color);
        }
        this.f10264c.addTextChangedListener(new C33402(this));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setItemAnimator(null);
        recyclerView.setNestedScrollingEnabled(true);
        LayoutManager gridLayoutManager = new GridLayoutManager(c7406c, 4);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(this.f10266e);
        recyclerView.setLayoutManager(gridLayoutManager);
        this.f10265d.setContentView(view);
        this.f10265d.setOnDismissListener(new C33413(this));
    }

    static /* synthetic */ void m7823a(C3343d c3343d, ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList3.add(new C2676c((String) arrayList.get(i), C2973m.values()[((Integer) arrayList2.get(i)).intValue()]));
        }
        C2808d.m7147a(new C6728e(new String[]{c3343d.f10262a}, arrayList3));
    }

    public final void m7824a() {
        int size = this.f10269h.size();
        if (size > 0) {
            this.f10268g.setVisibility(0);
            this.f10272k.setText(String.valueOf(size));
            return;
        }
        this.f10268g.setVisibility(8);
    }
}
