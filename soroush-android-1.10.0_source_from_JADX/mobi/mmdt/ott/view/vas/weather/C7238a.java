package mobi.mmdt.ott.view.vas.weather;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.bot.api.p342a.C2780b;
import mobi.mmdt.ott.logic.bot.api.p342a.C2781d;
import mobi.mmdt.ott.logic.bot.api.p342a.C6800c;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.logic.vas.p374b.C2916b;
import mobi.mmdt.ott.view.components.p405e.C6830b;
import mobi.mmdt.ott.view.vas.weather.p535a.C6290b;

public final class C7238a extends C6830b implements TextWatcher, OnClickListener {
    private C6290b f20900a;
    private ArrayList<C2780b> f20901b;
    private Timer f20902c = null;
    private boolean f20903d = false;
    private boolean f20904e = false;

    class C45852 implements Runnable {
        final /* synthetic */ C7238a f12605a;

        C45852(C7238a c7238a) {
            this.f12605a = c7238a;
        }

        public final void run() {
            this.f12605a.f20900a.notifyDataSetChanged();
        }
    }

    public final View mo3056a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_select_city, viewGroup, false);
        this.f20901b = new ArrayList();
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.weather_city_recycler);
        EditText editText = (EditText) inflate.findViewById(R.id.weather_select_city_edit);
        this.ak = (Toolbar) inflate.findViewById(R.id.search_city_toolbar);
        this.f20900a = new C6290b(this.f20901b, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(m8911k()));
        recyclerView.setAdapter(this.f20900a);
        editText.addTextChangedListener(this);
        this.ak.setTitle(m8876a((int) R.string.weather_service));
        m8915p();
        m17263a(m8911k(), UIThemeManager.getmInstance().getIcon_toolbar_dark_color());
        return inflate;
    }

    public final void mo3467a(Menu menu, MenuInflater menuInflater) {
        super.mo3467a(menu, menuInflater);
    }

    public final boolean mo3468a(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.home) {
            m8911k().onBackPressed();
        }
        return super.mo3468a(menuItem);
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onClick(View view) {
        if (view.getId() == R.id.city_title_view) {
            C2916b.m7295a((C2780b) view.getTag());
            m8911k().onBackPressed();
        }
    }

    public final void onEvent(C2781d c2781d) {
        this.f20901b.clear();
        Iterator it = c2781d.f8793a.iterator();
        while (it.hasNext()) {
            this.f20901b.add((C2780b) it.next());
        }
        if (m8911k() != null) {
            m8911k().runOnUiThread(new C45852(this));
        }
    }

    public final void onTextChanged(final CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f20903d) {
            this.f20903d = true;
            this.f20904e = false;
        }
        if (this.f20902c != null) {
            this.f20902c.cancel();
            this.f20902c.purge();
        }
        this.f20902c = new Timer();
        this.f20902c.schedule(new TimerTask(this) {
            final /* synthetic */ C7238a f12604b;

            public final void run() {
                this.f12604b.f20903d = false;
                if (!this.f12604b.f20904e && !charSequence.toString().isEmpty()) {
                    C2808d.m7148b(new C6800c(charSequence.toString()));
                }
            }
        }, 1000);
        if (charSequence.toString().isEmpty()) {
            this.f20904e = false;
        }
    }
}
