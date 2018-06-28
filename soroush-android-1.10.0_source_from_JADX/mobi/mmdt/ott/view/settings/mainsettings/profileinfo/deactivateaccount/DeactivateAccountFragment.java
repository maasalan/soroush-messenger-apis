package mobi.mmdt.ott.view.settings.mainsettings.profileinfo.deactivateaccount;

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

public class DeactivateAccountFragment extends C3150a {
    private C4438a f17082a;
    private View f17083b;
    private ImageView f17084c;
    private TextView f17085e;
    private TextView f17086f;
    private TextView f17087g;
    private OnClickListener f17088h = new C44361(this);
    private OnClickListener f17089i = new C44372(this);

    class C44361 implements OnClickListener {
        final /* synthetic */ DeactivateAccountFragment f12351a;

        C44361(DeactivateAccountFragment deactivateAccountFragment) {
            this.f12351a = deactivateAccountFragment;
        }

        public final void onClick(View view) {
            this.f12351a.f17082a.mo3643g();
        }
    }

    class C44372 implements OnClickListener {
        final /* synthetic */ DeactivateAccountFragment f12352a;

        C44372(DeactivateAccountFragment deactivateAccountFragment) {
            this.f12352a = deactivateAccountFragment;
        }

        public final void onClick(View view) {
            this.f12352a.f17082a.mo3686h();
        }
    }

    public interface C4438a {
        void mo3643g();

        void mo3686h();
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
        r0 = (mobi.mmdt.ott.view.settings.mainsettings.profileinfo.deactivateaccount.DeactivateAccountFragment.C4438a) r0;	 Catch:{ ClassCastException -> 0x0009 }
        r2.f17082a = r0;	 Catch:{ ClassCastException -> 0x0009 }
        return;
    L_0x0009:
        r0 = new java.lang.ClassCastException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = r3.toString();
        r1.append(r3);
        r3 = " must implement IDeactivateAccountFragmentCallback.";
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.settings.mainsettings.profileinfo.deactivateaccount.DeactivateAccountFragment.onAttach(android.app.Activity):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f17083b = layoutInflater.inflate(R.layout.fragment_deactivate_account, viewGroup, false);
        return this.f17083b;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.f17084c = (ImageView) this.f17083b.findViewById(R.id.imageView);
        this.f17085e = (TextView) this.f17083b.findViewById(R.id.deactivate_textView);
        this.f17086f = (TextView) this.f17083b.findViewById(R.id.cancel_textView);
        this.f17087g = (TextView) this.f17083b.findViewById(R.id.title_textView);
        this.f17085e.setOnClickListener(this.f17088h);
        this.f17086f.setOnClickListener(this.f17089i);
        int a = getResources().getConfiguration().orientation == 1 ? (C2489g.m6754a().m6755a(BallPulseIndicator.SCALE) * 60) / 100 : (C2489g.m6754a().m6756b(BallPulseIndicator.SCALE) * 60) / 100;
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(a, a);
        layoutParams.addRule(13);
        this.f17084c.setLayoutParams(layoutParams);
        C1212c.m2872a(getActivity()).m10950a(Integer.valueOf(R.drawable.ic_deactivate_account)).m3034a(new C1248f().m2960f()).m3033a().m3031a(this.f17084c);
        C2491i.m6802a(this.f17087g, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f17085e, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f17086f, UIThemeManager.getmInstance().getText_primary_color());
        View[] viewArr = new View[]{this.f17085e, this.f17086f};
    }
}
