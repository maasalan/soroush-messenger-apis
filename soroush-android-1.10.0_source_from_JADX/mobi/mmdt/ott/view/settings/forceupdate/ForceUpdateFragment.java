package mobi.mmdt.ott.view.settings.forceupdate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p405e.C3150a;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class ForceUpdateFragment extends C3150a {
    private C4373a f17060a;
    private View f17061b;
    private ImageView f17062c;
    private TextView f17063e;
    private TextView f17064f;
    private TextView f17065g;
    private OnClickListener f17066h = new C43711(this);
    private OnClickListener f17067i = new C43722(this);

    class C43711 implements OnClickListener {
        final /* synthetic */ ForceUpdateFragment f12240a;

        C43711(ForceUpdateFragment forceUpdateFragment) {
            this.f12240a = forceUpdateFragment;
        }

        public final void onClick(View view) {
            this.f12240a.f17060a.mo3643g();
        }
    }

    class C43722 implements OnClickListener {
        final /* synthetic */ ForceUpdateFragment f12241a;

        C43722(ForceUpdateFragment forceUpdateFragment) {
            this.f12241a = forceUpdateFragment;
        }

        public final void onClick(View view) {
            this.f12241a.f17060a.mo3681h();
        }
    }

    public interface C4373a {
        void mo3643g();

        void mo3681h();
    }

    public void onAttach(android.app.Activity r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        super.onAttach(r3);
        r0 = r3;	 Catch:{ ClassCastException -> 0x0009 }
        r0 = (mobi.mmdt.ott.view.settings.forceupdate.ForceUpdateFragment.C4373a) r0;	 Catch:{ ClassCastException -> 0x0009 }
        r2.f17060a = r0;	 Catch:{ ClassCastException -> 0x0009 }
        return;
    L_0x0009:
        r0 = new java.lang.ClassCastException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = r3.toString();
        r1.append(r3);
        r3 = " must implement IForceUpdateFragmentCallback.";
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.settings.forceupdate.ForceUpdateFragment.onAttach(android.app.Activity):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f17061b = layoutInflater.inflate(R.layout.fragment_force_update, viewGroup, false);
        return this.f17061b;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.f17062c = (ImageView) this.f17061b.findViewById(R.id.imageView);
        this.f17063e = (TextView) this.f17061b.findViewById(R.id.start_force_update_textView);
        this.f17064f = (TextView) this.f17061b.findViewById(R.id.close_application_textView);
        this.f17065g = (TextView) this.f17061b.findViewById(R.id.title_textView);
        this.f17063e.setOnClickListener(this.f17066h);
        this.f17064f.setOnClickListener(this.f17067i);
        int a = getResources().getConfiguration().orientation == 1 ? (C2489g.m6754a().m6755a(BallPulseIndicator.SCALE) * 60) / 100 : (C2489g.m6754a().m6756b(BallPulseIndicator.SCALE) * 60) / 100;
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(a, a);
        layoutParams.addRule(13);
        this.f17062c.setLayoutParams(layoutParams);
        C1212c.m2872a(getActivity()).m10950a(Integer.valueOf(R.drawable.ic_force_update)).m3034a(new C1248f().m2960f()).m3033a().m3031a(this.f17062c);
        C2491i.m6802a(this.f17065g, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f17063e, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f17064f, UIThemeManager.getmInstance().getText_primary_color());
        View[] viewArr = new View[]{this.f17063e, this.f17064f};
    }
}
