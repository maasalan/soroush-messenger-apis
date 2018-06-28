package mobi.mmdt.ott.view.call;

import android.app.Activity;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p105g.C1248f;
import jp.wasabeef.p215a.p216a.C7156b;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.provider.p389k.C6034d;
import mobi.mmdt.ott.view.components.p405e.C3150a;
import mobi.mmdt.ott.view.tools.C4508f;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.p482f.C4507a;

public final class C6053a extends C3150a {
    TextView f16196a;
    private ImageView f16197b;
    private TextView f16198c;
    private TextView f16199e;
    private RoundAvatarImageView f16200f;
    private String f16201g;
    private String f16202h;
    private String f16203i;
    private View f16204j;
    private String f16205k = "";
    private LoaderCallbacks<Cursor> f16206l = new C30592(this);

    class C30592 implements LoaderCallbacks<Cursor> {
        final /* synthetic */ C6053a f9568a;

        C30592(C6053a c6053a) {
            this.f9568a = c6053a;
        }

        public final Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
            return C2999a.m7511c(this.f9568a.f16201g);
        }

        public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
            Cursor cursor = (Cursor) obj;
            if (cursor.moveToFirst()) {
                C6034d c6034d = new C6034d(cursor);
                if (c6034d.m13510b().equals(this.f9568a.f16201g)) {
                    String b = c6034d.m13510b();
                    String a = c6034d.m7352a("members_local_name");
                    String a2 = c6034d.m7352a("members_nick_name");
                    String a3 = c6034d.m7352a("members_avatar_thumbnail_url");
                    String a4 = c6034d.m7352a("members_local_image_uri");
                    String a5 = c6034d.m13511c() ? C4508f.m8221a(a, c6034d.m7352a("members_local_phone_number")) : C4508f.m8220a(a2);
                    if (this.f9568a.f16203i.equals("fa")) {
                        this.f9568a.f16198c.setText(C2491i.m6814b(a5));
                    } else {
                        this.f9568a.f16198c.setText(a5);
                    }
                    if (a3 != null && !a3.isEmpty()) {
                        this.f9568a.m13627b(C4515k.m8231a(C2556b.m6998a(a3)));
                    } else if (a4 == null || a4.isEmpty()) {
                        this.f9568a.m13620a();
                    } else {
                        this.f9568a.m13627b(a4);
                    }
                    this.f9568a.f16200f.setName(a5);
                    this.f9568a.f16200f.setBackgroundColor(C2491i.m6806b(this.f9568a.getActivity(), b));
                }
            }
        }

        public final void onLoaderReset(Loader<Cursor> loader) {
        }
    }

    private void m13620a() {
        C4507a.m8206a(getActivity(), this.f16197b, true);
    }

    public final void m13626a(final String str) {
        if (getActivity() != null) {
            getActivity().runOnUiThread(new Runnable(this) {
                final /* synthetic */ C6053a f9567b;

                public final void run() {
                    if (str != null && !str.isEmpty()) {
                        this.f9567b.f16199e.setText(str);
                    }
                }
            });
        }
    }

    public final void m13627b(String str) {
        if (str != null) {
            C1212c.m2872a(getActivity()).m10950a((Object) str).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a)).m3031a(this.f16200f);
            C1212c.m2872a(getActivity()).m10958e().m3037a((Object) str).m3034a(new C1248f().m2951a(new C7156b(40)).m2955b(C1144h.f3689a).m2962h().m2954b(256, 256)).m3031a(this.f16197b);
            return;
        }
        m13620a();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null && getArguments().containsKey("key_contact_user_id_string")) {
            this.f16201g = getArguments().getString("key_contact_user_id_string");
            this.f16202h = getArguments().getString("key_call_status_message_string");
            this.f16205k = getArguments().getString("KEY_CALL_STATUS_BELOW_TEXT_VIEW");
        }
        this.f16203i = C2535a.m6888a().m6919b();
        getLoaderManager().initLoader(1, null, this.f16206l);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f16204j = layoutInflater.inflate(R.layout.fragment_call, viewGroup, false);
        return this.f16204j;
    }

    public final void onDestroy() {
        super.onDestroy();
        getLoaderManager().destroyLoader(1);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f16197b = (ImageView) this.f16204j.findViewById(R.id.background_imageView);
        this.f16200f = (RoundAvatarImageView) this.f16204j.findViewById(R.id.imageView1);
        this.f16198c = (TextView) this.f16204j.findViewById(R.id.name_textView);
        this.f16196a = (TextView) this.f16204j.findViewById(R.id.last_online_textView);
        this.f16199e = (TextView) this.f16204j.findViewById(R.id.call_status_textView);
        this.f16196a.setTypeface(this.f16196a.getTypeface(), 1);
        int a = C2489g.m6754a().m6755a(0.3f);
        LayoutParams layoutParams = (LayoutParams) this.f16200f.getLayoutParams();
        layoutParams.height = a;
        layoutParams.width = a;
        if (!(this.f16202h == null || this.f16202h.isEmpty())) {
            this.f16199e.setText(this.f16202h);
        }
        this.f16196a.setText(this.f16205k);
    }
}
