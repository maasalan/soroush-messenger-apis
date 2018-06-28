package mobi.mmdt.ott.view.registeration.notauthorize;

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

public class NotAuthorizeFragment extends C3150a {
    private C4311a f16951a;
    private View f16952b;
    private ImageView f16953c;
    private TextView f16954e;
    private TextView f16955f;
    private TextView f16956g;
    private OnClickListener f16957h = new C43091(this);
    private OnClickListener f16958i = new C43102(this);

    class C43091 implements OnClickListener {
        final /* synthetic */ NotAuthorizeFragment f12128a;

        C43091(NotAuthorizeFragment notAuthorizeFragment) {
            this.f12128a = notAuthorizeFragment;
        }

        public final void onClick(View view) {
            this.f12128a.f16951a.mo3643g();
        }
    }

    class C43102 implements OnClickListener {
        final /* synthetic */ NotAuthorizeFragment f12129a;

        C43102(NotAuthorizeFragment notAuthorizeFragment) {
            this.f12129a = notAuthorizeFragment;
        }

        public final void onClick(View view) {
            this.f12129a.f16951a.mo3678h();
        }
    }

    public interface C4311a {
        void mo3643g();

        void mo3678h();
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
        r0 = (mobi.mmdt.ott.view.registeration.notauthorize.NotAuthorizeFragment.C4311a) r0;	 Catch:{ ClassCastException -> 0x0009 }
        r2.f16951a = r0;	 Catch:{ ClassCastException -> 0x0009 }
        return;
    L_0x0009:
        r0 = new java.lang.ClassCastException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = r3.toString();
        r1.append(r3);
        r3 = " must implement IInactiveFragmentCallback.";
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.registeration.notauthorize.NotAuthorizeFragment.onAttach(android.app.Activity):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f16952b = layoutInflater.inflate(R.layout.fragment_not_authorize, viewGroup, false);
        return this.f16952b;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.f16953c = (ImageView) this.f16952b.findViewById(R.id.imageView);
        this.f16956g = (TextView) this.f16952b.findViewById(R.id.title_textView);
        this.f16954e = (TextView) this.f16952b.findViewById(R.id.inactive_textView);
        this.f16955f = (TextView) this.f16952b.findViewById(R.id.close_application_textView);
        this.f16954e.setOnClickListener(this.f16957h);
        this.f16955f.setOnClickListener(this.f16958i);
        int a = getResources().getConfiguration().orientation == 1 ? (C2489g.m6754a().m6755a(BallPulseIndicator.SCALE) * 60) / 100 : (C2489g.m6754a().m6756b(BallPulseIndicator.SCALE) * 60) / 100;
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(a, a);
        layoutParams.addRule(13);
        this.f16953c.setLayoutParams(layoutParams);
        C1212c.m2872a(getActivity()).m10950a(Integer.valueOf(R.drawable.ic_not_authorize)).m3034a(new C1248f().m2960f()).m3033a().m3031a(this.f16953c);
        C2491i.m6802a(this.f16956g, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f16954e, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f16955f, UIThemeManager.getmInstance().getText_primary_color());
        View[] viewArr = new View[]{this.f16955f, this.f16954e};
    }
}
