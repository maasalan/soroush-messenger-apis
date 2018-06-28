package mobi.mmdt.ott.view.conversation.emojisticker.emoji.p446a;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import mobi.mmdt.componentsutils.p232b.p235c.C2478a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.emojisticker.C4017c;
import mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon.emoji.Emojicon;
import mobi.mmdt.ott.view.conversation.emojisticker.emoji.p572b.C7196a;
import mobi.mmdt.ott.view.tools.p478b.C4484a;
import mobi.mmdt.ott.view.tools.p478b.C4487b;
import mobi.mmdt.ott.view.tools.p478b.C4487b.C4485a;
import mobi.mmdt.ott.view.tools.p478b.C4487b.C4486b;

public final class C6910a extends C6073e {
    private Context f19660b;
    private ImageView f19661c = ((ImageView) this.itemView.findViewById(R.id.content_imageView));
    private FrameLayout f19662d = ((FrameLayout) this.itemView.findViewById(R.id.root_frameLayout));
    private C4487b f19663e;
    private C4017c f19664f;

    class C40251 implements OnClickListener {
        final /* synthetic */ C6910a f11563a;

        C40251(C6910a c6910a) {
            this.f11563a = c6910a;
        }

        public final void onClick(View view) {
            this.f11563a.f19664f.mo2369a((C7196a) this.f11563a.f16244a);
        }
    }

    public C6910a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C4487b c4487b, C4017c c4017c) {
        super(layoutInflater, viewGroup, R.layout.emoji_list_item, null);
        this.f19660b = context;
        this.f19663e = c4487b;
        this.f19664f = c4017c;
        this.f19662d.setOnClickListener(new C40251(this));
        LayoutParams layoutParams = (LayoutParams) this.f19661c.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
    }

    protected final void mo3180a(C6829g c6829g) {
        Emojicon emojicon = ((C7196a) c6829g).f20774a;
        C4487b c4487b = this.f19663e;
        Integer valueOf = Integer.valueOf(emojicon.f11580e);
        ImageView imageView = this.f19661c;
        if (valueOf != null) {
            Bitmap bitmap = null;
            if (MyApplication.m12950a().f15909o != null) {
                C4484a c4484a = MyApplication.m12950a().f15909o;
                int intValue = valueOf.intValue();
                if (c4484a.f12423b != null) {
                    Bitmap bitmap2 = (Bitmap) c4484a.f12423b.get(Integer.valueOf(intValue));
                    if (bitmap2 != null) {
                        C2478a.m6728a();
                        bitmap = bitmap2;
                    }
                }
            }
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
                return;
            }
            C4486b c4486b;
            int intValue2 = valueOf.intValue();
            C4486b a = C4487b.m8179a(imageView);
            if (a != null) {
                if (Integer.valueOf(a.f12426b).equals(Integer.valueOf(intValue2))) {
                    intValue2 = 0;
                    if (intValue2 != 0) {
                        c4486b = new C4486b(c4487b, imageView);
                        imageView.setImageDrawable(new C4485a(c4487b.f12433f, c4487b.f12429b, c4486b));
                        c4486b.execute(new Integer[]{valueOf});
                    }
                } else {
                    a.cancel(true);
                    boolean a2 = C2478a.m6728a();
                }
            }
            intValue2 = true;
            if (intValue2 != 0) {
                c4486b = new C4486b(c4487b, imageView);
                imageView.setImageDrawable(new C4485a(c4487b.f12433f, c4487b.f12429b, c4486b));
                c4486b.execute(new Integer[]{valueOf});
            }
        }
    }
}
