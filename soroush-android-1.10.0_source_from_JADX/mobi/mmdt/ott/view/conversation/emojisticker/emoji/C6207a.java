package mobi.mmdt.ott.view.conversation.emojisticker.emoji;

import android.app.Activity;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.Context;
import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.provider.p391m.C3007b;
import mobi.mmdt.ott.provider.p391m.C6039d;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6074f;
import mobi.mmdt.ott.view.conversation.emojisticker.C4010a;
import mobi.mmdt.ott.view.conversation.emojisticker.C4017c;
import mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon.emoji.C4030a;
import mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon.emoji.C4031b;
import mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon.emoji.C4032c;
import mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon.emoji.C4033d;
import mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon.emoji.C4034e;
import mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon.emoji.C4035f;
import mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon.emoji.Emojicon;
import mobi.mmdt.ott.view.conversation.emojisticker.emoji.p572b.C7196a;
import mobi.mmdt.ott.view.tools.p478b.C4487b;

public final class C6207a extends C4010a implements C4017c {
    Activity f16769b;
    C6910a f16770c;
    int f16771d;
    int f16772e;
    C4487b f16773f;
    private int f16774g;
    private RecyclerView f16775h;
    private GridLayoutManager f16776i;
    private View f16777j;
    private LoaderCallbacks<Cursor> f16778k = new C40233(this);

    class C40233 implements LoaderCallbacks<Cursor> {
        final /* synthetic */ C6207a f11561a;

        C40233(C6207a c6207a) {
            this.f11561a = c6207a;
        }

        public final Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
            return new CursorLoader(MyApplication.m12952b(), C3007b.f9448a, null, null, null, "recentemoji_usage_count DESC");
        }

        public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
            Cursor cursor = (Cursor) obj;
            if (loader.getId() == 10224 && cursor.moveToFirst()) {
                final ArrayList arrayList = new ArrayList();
                int i = 0;
                do {
                    C6039d c6039d = new C6039d(cursor);
                    Integer b = c6039d.m7353b("recentemoji_emoji_source");
                    if (b == null) {
                        throw new NullPointerException("The value of 'EmojiSource' in the database was null, which is not allowed according to the model definition");
                    }
                    Emojicon emojicon = null;
                    switch (C40244.f11562a[C4030a.m7910a()[b.intValue()] - 1]) {
                        case 1:
                            emojicon = Emojicon.m7907a(c6039d.m13538a().charAt(0));
                            break;
                        case 2:
                            emojicon = Emojicon.m7909a(c6039d.m13538a());
                            break;
                        case 3:
                            emojicon = Emojicon.m7908a(Integer.parseInt(c6039d.m13538a()));
                            break;
                        default:
                            break;
                    }
                    arrayList.add(new C7196a(i, emojicon));
                    i++;
                } while (cursor.moveToNext());
                this.f11561a.f16769b.runOnUiThread(new Runnable(this) {
                    final /* synthetic */ C40233 f11560b;

                    public final void run() {
                        this.f11560b.f11561a.f16770c.m13673a(arrayList);
                    }
                });
                this.f11561a.f16769b.getLoaderManager().destroyLoader(10224);
            }
        }

        public final void onLoaderReset(Loader<Cursor> loader) {
        }
    }

    static /* synthetic */ class C40244 {
        static final /* synthetic */ int[] f11562a = new int[C4030a.m7910a().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon.emoji.C4030a.m7910a();
            r0 = r0.length;
            r0 = new int[r0];
            f11562a = r0;
            r0 = 1;
            r1 = f11562a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon.emoji.C4030a.f11583a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r1 = f11562a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon.emoji.C4030a.f11584b;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r3 = 2;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            r1 = f11562a;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon.emoji.C4030a.f11585c;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r0 = 3;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.emojisticker.emoji.a.4.<clinit>():void");
        }
    }

    class C6910a extends C6074f {
        final /* synthetic */ C6207a f19659a;

        public C6910a(C6207a c6207a, Context context) {
            this.f19659a = c6207a;
            super(context);
        }

        public final void mo3181a(C6073e c6073e, int i) {
            super.mo3181a(c6073e, i);
        }

        public final /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
            super.mo3181a((C6073e) viewHolder, i);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i != 1) {
                return null;
            }
            return new mobi.mmdt.ott.view.conversation.emojisticker.emoji.p446a.C6910a(this.f19659a.f16769b, this.f16246b, viewGroup, this.f19659a.f16771d, this.f19659a.f16772e, this.f19659a.f16773f, this.f19659a);
        }
    }

    private C6207a(Activity activity, int i) {
        this.f16769b = activity;
        this.f16774g = i;
        this.f16777j = LayoutInflater.from(this.f16769b).inflate(R.layout.fragment_emoji_grid, null, false);
        int i2 = 15;
        boolean z = (this.f16769b.getResources().getConfiguration().screenLayout & 15) >= 4;
        boolean z2 = (this.f16769b.getResources().getConfiguration().screenLayout & 15) == 3;
        float f;
        if (this.f16769b.getResources().getConfiguration().orientation == 1) {
            C2489g a;
            if (z) {
                a = C2489g.m6754a();
                f = 0.06666667f;
            } else if (z2) {
                i2 = 10;
                a = C2489g.m6754a();
                f = 0.1f;
            } else {
                i2 = 8;
                a = C2489g.m6754a();
                f = 0.125f;
            }
            this.f16771d = a.m6755a(f);
        } else {
            int i3;
            C2489g a2;
            if (z) {
                i3 = 24;
                a2 = C2489g.m6754a();
                f = 0.041666668f;
            } else if (z2) {
                i3 = 16;
                a2 = C2489g.m6754a();
                f = 0.0625f;
            } else {
                i3 = 14;
                a2 = C2489g.m6754a();
                f = 0.071428575f;
            }
            this.f16771d = a2.m6755a(f);
            i2 = i3;
        }
        this.f16772e = this.f16771d;
        this.f16773f = new C4487b(this, this.f16769b, this.f16772e) {
            final /* synthetic */ C6207a f16768a;

            protected final Bitmap mo2367a(int i) {
                return BitmapFactory.decodeResource(this.f16768a.f16769b.getResources(), i);
            }
        };
        this.f16773f.f12430c = false;
        this.f16776i = new GridLayoutManager(this.f16769b, i2);
        this.f16775h = (RecyclerView) this.f16777j.findViewById(R.id.recycler_view);
        this.f16770c = new C6910a(this, this.f16769b);
        this.f16775h.setHasFixedSize(true);
        this.f16775h.setAdapter(this.f16770c);
        this.f16775h.setLayoutManager(this.f16776i);
        activity = this.f16769b;
        Emojicon[] emojiconArr = C4033d.f11589a;
        switch (this.f16774g) {
            case 1:
                emojiconArr = C4031b.f11587a;
                break;
            case 2:
                emojiconArr = C4032c.f11588a;
                break;
            case 3:
                emojiconArr = C4033d.f11589a;
                break;
            case 4:
                emojiconArr = C4034e.f11590a;
                break;
            case 5:
                emojiconArr = C4035f.f11591a;
                break;
            case 6:
            case 7:
                emojiconArr = null;
                break;
            default:
                break;
        }
        if (emojiconArr != null) {
            new Thread(new Runnable(this) {
                final /* synthetic */ C6207a f11558c;

                public final void run() {
                    final ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < emojiconArr.length; i++) {
                        arrayList.add(new C7196a(i, emojiconArr[i]));
                    }
                    activity.runOnUiThread(new Runnable(this) {
                        final /* synthetic */ C40212 f11555b;

                        public final void run() {
                            this.f11555b.f11558c.f16770c.m13673a(arrayList);
                        }
                    });
                }
            }).start();
        } else {
            this.f16769b.getLoaderManager().initLoader(10224, null, this.f16778k);
        }
    }

    public static C6207a m14299a(Activity activity, int i) {
        return new C6207a(activity, i);
    }

    public final View mo2368a() {
        return this.f16777j;
    }

    public final void mo2369a(C7196a c7196a) {
        if (this.a != null) {
            this.a.mo2366a(c7196a.f20774a);
        }
    }

    public final int mo2370b() {
        return this.f16770c != null ? this.f16770c.getItemCount() : 0;
    }
}
