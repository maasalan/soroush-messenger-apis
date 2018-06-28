package mobi.mmdt.ott.view.settings.mainsettings;

import android.app.LoaderManager.LoaderCallbacks;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import java.util.List;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.provider.p389k.C6034d;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.settings.C6260b;
import mobi.mmdt.ott.view.settings.p583b.C7383h;
import mobi.mmdt.ott.view.settings.p583b.C7386k;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6965c extends C6260b {
    private String f19884b;
    private int f19885c;
    private String f19886e = "";
    private String f19887f = "";
    private String f19888g = "";
    private String f19889h = "";
    private LoaderCallbacks<Cursor> f19890i = new C43781(this);

    class C43781 implements LoaderCallbacks<Cursor> {
        final /* synthetic */ C6965c f12247a;

        C43781(C6965c c6965c) {
            this.f12247a = c6965c;
        }

        public final Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
            return C2999a.m7511c(this.f12247a.f19884b);
        }

        public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
            Cursor cursor = (Cursor) obj;
            if (cursor.moveToFirst()) {
                C6034d c6034d = new C6034d(cursor);
                String a = c6034d.m7352a("members_nick_name");
                String a2 = c6034d.m7352a("members_moto");
                String a3 = c6034d.m7352a("members_avatar_thumbnail_url");
                String a4 = c6034d.m7352a("members_local_image_uri");
                this.f12247a.f19886e = a;
                this.f12247a.f19887f = a2;
                this.f12247a.f19888g = a3;
                this.f12247a.f19889h = a4;
                this.f12247a.f19885c = C2491i.m6806b(MyApplication.m12952b(), this.f12247a.f19884b);
                this.f12247a.m14602a();
            }
        }

        public final void onLoaderReset(Loader<Cursor> loader) {
        }
    }

    protected final void mo3261a(List<C6829g> list) {
        list.clear();
        list.add(new C7383h(this.f19884b, this.f19886e, this.f19887f, this.f19888g, this.f19889h, this.f19885c));
        list.add(new C7386k(C4522p.m8236a(R.string.setting_general_title), R.drawable.ic_general, 1021, 1));
        list.add(new C7386k(C4522p.m8236a(R.string.notifications), R.drawable.ic_notification, 1003, 2));
        list.add(new C7386k(C4522p.m8236a(R.string.setting_media_storage_title), R.drawable.ic_media_storage, 1022, 3));
        list.add(new C7386k(C4522p.m8236a(R.string.privacy), R.drawable.ic_privacy, 1007, 4));
        list.add(new C7386k(C4522p.m8236a(R.string.setting_appearance_title), R.drawable.ic_appearance, 1023, 5));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f19884b = C2535a.m6888a().m6928d();
        getLoaderManager().initLoader(21, null, this.f19890i);
    }
}
