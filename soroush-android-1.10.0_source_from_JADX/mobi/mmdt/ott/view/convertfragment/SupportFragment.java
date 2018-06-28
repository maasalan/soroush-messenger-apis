package mobi.mmdt.ott.view.convertfragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p072b.p073a.p074a.C1063i;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p357j.C6812d;
import mobi.mmdt.ott.logic.p357j.p358a.C2832g;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.browser.C3112a;
import mobi.mmdt.ott.view.components.p405e.C3150a;
import mobi.mmdt.ott.view.main.C4187d;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p479c.C4501c;

public class SupportFragment extends C3150a {
    private View f16860a;

    class C41221 implements OnClickListener {
        final /* synthetic */ SupportFragment f11802a;

        C41221(SupportFragment supportFragment) {
            this.f11802a = supportFragment;
        }

        public final void onClick(View view) {
            SupportFragment.m14417a(this.f11802a);
        }
    }

    class C41232 implements OnClickListener {
        final /* synthetic */ SupportFragment f11803a;

        C41232(SupportFragment supportFragment) {
            this.f11803a = supportFragment;
        }

        public final void onClick(View view) {
            C3112a.m7566a(this.f11803a.getActivity(), Uri.parse(C4522p.m8236a(R.string.url_page_frequently_asked_question)));
        }
    }

    class C41243 implements OnClickListener {
        final /* synthetic */ SupportFragment f11804a;

        C41243(SupportFragment supportFragment) {
            this.f11804a = supportFragment;
        }

        public final void onClick(View view) {
            C4187d.m8040a(this.f11804a.getActivity(), "support@sapp.ir");
        }
    }

    static /* synthetic */ void m14417a(SupportFragment supportFragment) {
        C1063i c6812d = new C6812d("sapp.ir/support");
        C2808d.m7147a(c6812d);
        C4501c.m8189a().m8192a(supportFragment.getActivity(), c6812d);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        float f;
        int b;
        ImageView imageView;
        LayoutParams layoutParams;
        ImageView imageView2;
        String b2;
        String toHexString;
        TextView textView;
        StringBuilder stringBuilder;
        C2489g a;
        this.f16860a = layoutInflater.inflate(R.layout.fragment_tablet_about, viewGroup, false);
        this.d = (Toolbar) this.f16860a.findViewById(R.id.toolbar);
        RelativeLayout relativeLayout = (RelativeLayout) this.f16860a.findViewById(R.id.support_layout);
        RelativeLayout relativeLayout2 = (RelativeLayout) this.f16860a.findViewById(R.id.help_layout);
        RelativeLayout relativeLayout3 = (RelativeLayout) this.f16860a.findViewById(R.id.email_layout);
        TextView textView2 = (TextView) this.f16860a.findViewById(R.id.support_text_view);
        TextView textView3 = (TextView) this.f16860a.findViewById(R.id.help_text_view);
        TextView textView4 = (TextView) this.f16860a.findViewById(R.id.email_text_view);
        int i = -1;
        C2491i.m6783a(-1, (ImageView) this.f16860a.findViewById(R.id.support_image_view), (ImageView) this.f16860a.findViewById(R.id.help_image_view), (ImageView) this.f16860a.findViewById(R.id.email_image_view));
        C2491i.m6784a(-1, textView2, textView3, textView4);
        C2491i.m6803a(textView2);
        C2491i.m6803a(textView3);
        C2491i.m6803a(textView4);
        C2491i.m6788a(getActivity(), r1);
        C2491i.m6788a(getActivity(), r2);
        C2491i.m6788a(getActivity(), r3);
        relativeLayout.setOnClickListener(new C41221(this));
        relativeLayout2.setOnClickListener(new C41232(this));
        relativeLayout3.setOnClickListener(new C41243(this));
        int i2 = getResources().getConfiguration().orientation;
        if (!C2491i.m6833f(getActivity())) {
            f = 0.5f;
            if (i2 == 1) {
                i2 = C2489g.m6754a().m6755a(0.5f);
                b = C2489g.m6754a().m6756b(0.35f);
                imageView = (ImageView) this.f16860a.findViewById(R.id.logo_imageView);
                layoutParams = new LinearLayout.LayoutParams(i2, b);
                layoutParams.gravity = 17;
                imageView.setLayoutParams(layoutParams);
                imageView2 = (ImageView) this.f16860a.findViewById(R.id.background_imageView);
                if (imageView2 != null) {
                    C1212c.m2872a(getActivity()).m10950a(Integer.valueOf(R.drawable.new_about_us_bg_without_shadow)).m3034a(C1248f.m2938a(C1144h.f3692d)).m3033a().m3031a(imageView2);
                }
                b2 = C2535a.m6888a().m6919b();
                b = b2.hashCode();
                if (b != 3121) {
                    if (b2.equals("ar")) {
                        i = 1;
                    }
                } else if (b != 3259) {
                    if (b2.equals("fa")) {
                        i = 0;
                    }
                }
                switch (i) {
                    case 0:
                        b2 = "?fa";
                        break;
                    case 1:
                        b2 = "?ar";
                        break;
                    default:
                        b2 = "?en";
                        break;
                }
                toHexString = Integer.toHexString(-16711688);
                toHexString = toHexString.substring(2, toHexString.length());
                C2491i.m6803a((TextView) this.f16860a.findViewById(R.id.about_support_textView));
                r0.setText(C2491i.m6777a(C2535a.m6888a().m6919b(), C4522p.m8236a(R.string.support_soroush)));
                textView = (TextView) this.f16860a.findViewById(R.id.about_website_textView);
                textView.setClickable(true);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                stringBuilder = new StringBuilder();
                stringBuilder.append(C4522p.m8236a(R.string.about_3));
                stringBuilder.append(" ● <font color=\"#");
                stringBuilder.append(toHexString);
                stringBuilder.append("\"><a href='http://www.sapp.ir");
                stringBuilder.append(b2);
                stringBuilder.append("' style=\"text-decoration:none\">www.sapp.ir</a></font>");
                textView.setText(Html.fromHtml(stringBuilder.toString()));
                return this.f16860a;
            }
            a = C2489g.m6754a();
        } else if (i2 == 1) {
            i2 = C2489g.m6754a().m6755a(0.3f);
            b = i2;
            imageView = (ImageView) this.f16860a.findViewById(R.id.logo_imageView);
            layoutParams = new LinearLayout.LayoutParams(i2, b);
            layoutParams.gravity = 17;
            imageView.setLayoutParams(layoutParams);
            imageView2 = (ImageView) this.f16860a.findViewById(R.id.background_imageView);
            if (imageView2 != null) {
                C1212c.m2872a(getActivity()).m10950a(Integer.valueOf(R.drawable.new_about_us_bg_without_shadow)).m3034a(C1248f.m2938a(C1144h.f3692d)).m3033a().m3031a(imageView2);
            }
            b2 = C2535a.m6888a().m6919b();
            b = b2.hashCode();
            if (b != 3121) {
                if (b != 3259) {
                    if (b2.equals("fa")) {
                        i = 0;
                    }
                }
            } else if (b2.equals("ar")) {
                i = 1;
            }
            switch (i) {
                case 0:
                    b2 = "?fa";
                    break;
                case 1:
                    b2 = "?ar";
                    break;
                default:
                    b2 = "?en";
                    break;
            }
            toHexString = Integer.toHexString(-16711688);
            toHexString = toHexString.substring(2, toHexString.length());
            C2491i.m6803a((TextView) this.f16860a.findViewById(R.id.about_support_textView));
            r0.setText(C2491i.m6777a(C2535a.m6888a().m6919b(), C4522p.m8236a(R.string.support_soroush)));
            textView = (TextView) this.f16860a.findViewById(R.id.about_website_textView);
            textView.setClickable(true);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            stringBuilder = new StringBuilder();
            stringBuilder.append(C4522p.m8236a(R.string.about_3));
            stringBuilder.append(" ● <font color=\"#");
            stringBuilder.append(toHexString);
            stringBuilder.append("\"><a href='http://www.sapp.ir");
            stringBuilder.append(b2);
            stringBuilder.append("' style=\"text-decoration:none\">www.sapp.ir</a></font>");
            textView.setText(Html.fromHtml(stringBuilder.toString()));
            return this.f16860a;
        } else {
            a = C2489g.m6754a();
            f = 0.4f;
        }
        i2 = a.m6756b(f);
        b = i2;
        imageView = (ImageView) this.f16860a.findViewById(R.id.logo_imageView);
        layoutParams = new LinearLayout.LayoutParams(i2, b);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        imageView2 = (ImageView) this.f16860a.findViewById(R.id.background_imageView);
        if (imageView2 != null) {
            C1212c.m2872a(getActivity()).m10950a(Integer.valueOf(R.drawable.new_about_us_bg_without_shadow)).m3034a(C1248f.m2938a(C1144h.f3692d)).m3033a().m3031a(imageView2);
        }
        b2 = C2535a.m6888a().m6919b();
        b = b2.hashCode();
        if (b != 3121) {
            if (b != 3259) {
                if (b2.equals("fa")) {
                    i = 0;
                }
            }
        } else if (b2.equals("ar")) {
            i = 1;
        }
        switch (i) {
            case 0:
                b2 = "?fa";
                break;
            case 1:
                b2 = "?ar";
                break;
            default:
                b2 = "?en";
                break;
        }
        toHexString = Integer.toHexString(-16711688);
        toHexString = toHexString.substring(2, toHexString.length());
        C2491i.m6803a((TextView) this.f16860a.findViewById(R.id.about_support_textView));
        r0.setText(C2491i.m6777a(C2535a.m6888a().m6919b(), C4522p.m8236a(R.string.support_soroush)));
        textView = (TextView) this.f16860a.findViewById(R.id.about_website_textView);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        stringBuilder = new StringBuilder();
        stringBuilder.append(C4522p.m8236a(R.string.about_3));
        stringBuilder.append(" ● <font color=\"#");
        stringBuilder.append(toHexString);
        stringBuilder.append("\"><a href='http://www.sapp.ir");
        stringBuilder.append(b2);
        stringBuilder.append("' style=\"text-decoration:none\">www.sapp.ir</a></font>");
        textView.setText(Html.fromHtml(stringBuilder.toString()));
        return this.f16860a;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onEvent(C2832g c2832g) {
        final String str = c2832g.f8913a;
        getActivity().runOnUiThread(new Runnable(this) {
            final /* synthetic */ SupportFragment f11806b;

            public final void run() {
                C4501c.m8189a().m8193b();
                if (str != null && !str.isEmpty()) {
                    C4478a.m8144a(this.f11806b.getActivity(), str, null, null);
                }
            }
        });
    }

    public void onResume() {
        super.onResume();
        m7633a(getActivity());
        this.d.setTitle(C4522p.m8236a(R.string.support));
        m7632a(0, -1);
    }
}
