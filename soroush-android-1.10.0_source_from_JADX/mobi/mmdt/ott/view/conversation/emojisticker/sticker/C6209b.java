package mobi.mmdt.ott.view.conversation.emojisticker.sticker;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.Context;
import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.p029a.C0346c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.WrapperListAdapter;
import com.felipecsl.asymmetricgridview.library.C1600d;
import com.felipecsl.asymmetricgridview.library.widget.AsymmetricGridView;
import com.felipecsl.asymmetricgridview.library.widget.C5395b;
import com.p085c.p086a.C1212c;
import java.util.ArrayList;
import java.util.List;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p235c.C2478a;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.provider.p393o.C3012b;
import mobi.mmdt.ott.provider.p393o.C6045d;
import mobi.mmdt.ott.provider.p394p.C6048d;
import mobi.mmdt.ott.provider.p394p.C6049e;
import mobi.mmdt.ott.view.conversation.emojisticker.C4010a;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C6209b extends C4010a implements OnItemClickListener {
    private FrameLayout f16793b;
    private View f16794c;
    private int f16795d;
    private int f16796e;
    private Activity f16797f;
    private C5395b<StickerItemViewModel> f16798g;
    private LoaderCallbacks<Cursor> f16799h = new C40391(this);

    class C40391 implements LoaderCallbacks<Cursor> {
        final /* synthetic */ C6209b f11595a;

        C40391(C6209b c6209b) {
            this.f11595a = c6209b;
        }

        public final Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
            Context a = this.f11595a.f16797f;
            i = this.f11595a.f16795d;
            return new CursorLoader(a, C3012b.f9455a, null, "stickers_package_id =?", new String[]{String.valueOf(i)}, "stickers_sticker_id ASC");
        }

        public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
            Cursor cursor = (Cursor) obj;
            if (this.f11595a.f16798g != null) {
                final ArrayList arrayList = new ArrayList();
                C6045d c6045d = new C6045d(cursor);
                if (c6045d.moveToFirst()) {
                    do {
                        Integer b = c6045d.m7353b("stickers_sticker_version");
                        if (b == null) {
                            throw new NullPointerException("The value of 'sticker_version' in the database was null, which is not allowed according to the model definition");
                        }
                        int intValue = b.intValue();
                        b = c6045d.m7353b("stickers_package_id");
                        if (b == null) {
                            throw new NullPointerException("The value of 'package_id' in the database was null, which is not allowed according to the model definition");
                        }
                        int intValue2 = b.intValue();
                        b = c6045d.m7353b("stickers_sticker_id");
                        if (b == null) {
                            throw new NullPointerException("The value of 'sticker_id' in the database was null, which is not allowed according to the model definition");
                        }
                        int intValue3 = b.intValue();
                        String a = c6045d.m7352a("stickers_complete_sticker_id");
                        if (a == null) {
                            throw new NullPointerException("The value of 'complete_sticker_id' in the database was null, which is not allowed according to the model definition");
                        }
                        b = c6045d.m7353b("stickers_ver_span");
                        if (b == null) {
                            throw new NullPointerException("The value of 'ver_span' in the database was null, which is not allowed according to the model definition");
                        }
                        int intValue4 = b.intValue();
                        b = c6045d.m7353b("stickers_hor_span");
                        if (b == null) {
                            throw new NullPointerException("The value of 'hor_span' in the database was null, which is not allowed according to the model definition");
                        }
                        int intValue5 = b.intValue();
                        b = c6045d.m7353b("stickers_x_axis");
                        if (b == null) {
                            throw new NullPointerException("The value of 'x_axis' in the database was null, which is not allowed according to the model definition");
                        }
                        int intValue6 = b.intValue();
                        b = c6045d.m7353b("stickers_y_axis");
                        if (b == null) {
                            throw new NullPointerException("The value of 'y_axis' in the database was null, which is not allowed according to the model definition");
                        }
                        int intValue7 = b.intValue();
                        String a2 = c6045d.m7352a("stickers_original_uri");
                        if (a2 == null) {
                            throw new NullPointerException("The value of 'original_uri' in the database was null, which is not allowed according to the model definition");
                        }
                        String a3 = c6045d.m7352a("stickers_thumbnail_uri");
                        if (a3 == null) {
                            throw new NullPointerException("The value of 'thumbnail_uri' in the database was null, which is not allowed according to the model definition");
                        }
                        b = c6045d.m7353b("stickers_view_multiplier");
                        arrayList.add(new StickerItemViewModel(intValue, intValue2, intValue3, a, intValue4, intValue5, intValue6, intValue7, a2, a3, b == null ? 0 : b.intValue()));
                    } while (c6045d.moveToNext());
                }
                r0.f11595a.f16797f.runOnUiThread(new Runnable(r0) {
                    final /* synthetic */ C40391 f11594b;

                    public final void run() {
                        this.f11594b.f11595a.f16798g.m11656a(arrayList);
                    }
                });
                if (cursor.getCount() == r0.f11595a.f16796e) {
                    r0.f11595a.f16797f.getLoaderManager().destroyLoader(r0.f11595a.f16795d);
                }
            }
        }

        public final void onLoaderReset(Loader<Cursor> loader) {
        }
    }

    public class C4041a extends ArrayAdapter<StickerItemViewModel> implements WrapperListAdapter {
        final /* synthetic */ C6209b f11599a;
        private final C5395b<StickerItemViewModel> f11600b;
        private LayoutInflater f11601c;

        class C4040a {
            ImageView f11596a;
            LinearLayout f11597b;
            final /* synthetic */ C4041a f11598c;

            C4040a(C4041a c4041a) {
                this.f11598c = c4041a;
            }
        }

        public C4041a(C6209b c6209b, Context context, AsymmetricGridView asymmetricGridView, List<StickerItemViewModel> list) {
            this.f11599a = c6209b;
            super(context, 0, list);
            this.f11601c = (LayoutInflater) context.getSystemService("layout_inflater");
            final C6209b c6209b2 = c6209b;
            this.f11600b = new C5395b<StickerItemViewModel>(this, context, asymmetricGridView, list) {
                final /* synthetic */ C4041a f19677e;

                public final View mo3232a(int i, View view, ViewGroup viewGroup) {
                    return this.f19677e.getView(i, view, viewGroup);
                }
            };
        }

        @SuppressLint({"ViewHolder"})
        public final View getView(int i, View view, ViewGroup viewGroup) {
            StickerItemViewModel stickerItemViewModel = (StickerItemViewModel) getItem(i);
            view = this.f11601c.inflate(R.layout.sticker_grid_item, viewGroup, false);
            C4040a c4040a = new C4040a(this);
            c4040a.f11596a = (ImageView) view.findViewById(R.id.image);
            c4040a.f11597b = (LinearLayout) view.findViewById(R.id.root_linear_layout);
            view.setTag(c4040a);
            if (!(stickerItemViewModel == null || stickerItemViewModel.f16783e == null)) {
                C1212c.m2872a(this.f11599a.f16797f).m10950a(stickerItemViewModel.f16783e).m3033a().m3033a().m3031a(c4040a.f11596a);
            }
            return view;
        }

        public final ListAdapter getWrappedAdapter() {
            return this.f11600b;
        }
    }

    private C6209b(Activity activity, int i) {
        this.f16797f = activity;
        this.f16795d = i;
        this.f16793b = new FrameLayout(this.f16797f);
        C6049e c6049e = new C6049e();
        c6049e.m13586b(i);
        C6048d b = c6049e.m13585b((Context) activity);
        b.moveToFirst();
        i = b.getCount();
        if (!(b == null || b.isClosed())) {
            b.close();
        }
        this.f16796e = i;
        View asymmetricGridView = new AsymmetricGridView(this.f16797f);
        ListAdapter c4041a = new C4041a(this, this.f16797f, asymmetricGridView, new ArrayList());
        this.f16798g = (C5395b) ((WrapperListAdapter) c4041a).getWrappedAdapter();
        asymmetricGridView.setRequestedColumnCount(C2491i.m6830d(this.f16797f) ? 5 : 10);
        asymmetricGridView.setRequestedHorizontalSpacing(C1600d.m4130a(this.f16797f, BallPulseIndicator.SCALE));
        asymmetricGridView.setAdapter(c4041a);
        asymmetricGridView.setDebugging(C2478a.m6728a());
        asymmetricGridView.setDivider(C0346c.m682a(this.f16797f, (int) R.drawable.transparet_divider));
        asymmetricGridView.setOnItemClickListener(this);
        this.f16794c = asymmetricGridView;
        this.f16797f.getLoaderManager().initLoader(this.f16795d, null, this.f16799h);
        this.f16793b.addView(this.f16794c);
    }

    public static C6209b m14308a(Activity activity, int i) {
        return new C6209b(activity, i);
    }

    public final View mo2368a() {
        return this.f16793b;
    }

    public final int mo2370b() {
        return this.f16798g != null ? this.f16798g.getCount() : 0;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        StickerItemViewModel stickerItemViewModel = (StickerItemViewModel) adapterView.getItemAtPosition(i);
        if (this.a != null) {
            this.a.mo2365a(stickerItemViewModel.f16781c, stickerItemViewModel.f16780b, stickerItemViewModel.f16779a, stickerItemViewModel.f16782d);
        }
    }
}
