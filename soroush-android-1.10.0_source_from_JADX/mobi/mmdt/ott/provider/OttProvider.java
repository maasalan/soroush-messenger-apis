package mobi.mmdt.ott.provider;

import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import java.util.Arrays;
import mobi.mmdt.componentsutils.p232b.p235c.C2478a;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.provider.p381c.C2957d;
import mobi.mmdt.ott.provider.p381c.C2957d.C2956a;
import mobi.mmdt.ott.provider.p387i.C2993d;
import mobi.mmdt.ott.provider.p388j.C2997c;
import mobi.mmdt.ott.provider.p395q.C3020c;
import org.msgpack.util.TemplatePrecompiler;

public class OttProvider extends C2957d {
    private static final UriMatcher f16174b;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f16174b = uriMatcher;
        uriMatcher.addURI("mobi.mmdt.ott.provider", "conversations", 2);
        f16174b.addURI("mobi.mmdt.ott.provider", "conversations/#", 3);
        f16174b.addURI("mobi.mmdt.ott.provider", "files", 4);
        f16174b.addURI("mobi.mmdt.ott.provider", "files/#", 5);
        f16174b.addURI("mobi.mmdt.ott.provider", "members", 8);
        f16174b.addURI("mobi.mmdt.ott.provider", "members/#", 9);
        f16174b.addURI("mobi.mmdt.ott.provider", "members_group", 10);
        f16174b.addURI("mobi.mmdt.ott.provider", "members_group/#", 11);
        f16174b.addURI("mobi.mmdt.ott.provider", "stickers", 12);
        f16174b.addURI("mobi.mmdt.ott.provider", "stickers/#", 13);
        f16174b.addURI("mobi.mmdt.ott.provider", "stickerspackage", 14);
        f16174b.addURI("mobi.mmdt.ott.provider", "stickerspackage/#", 15);
        f16174b.addURI("mobi.mmdt.ott.provider", "syncedcontacts", 16);
        f16174b.addURI("mobi.mmdt.ott.provider", "syncedcontacts/#", 17);
        f16174b.addURI("mobi.mmdt.ott.provider", "userinchatstates", 18);
        f16174b.addURI("mobi.mmdt.ott.provider", "userinchatstates/#", 19);
        f16174b.addURI("mobi.mmdt.ott.provider", "recentemoji", 20);
        f16174b.addURI("mobi.mmdt.ott.provider", "recentemoji/#", 21);
        f16174b.addURI("mobi.mmdt.ott.provider", "report_events_columns", 24);
        f16174b.addURI("mobi.mmdt.ott.provider", "report_events_columns/#", 25);
        f16174b.addURI("mobi.mmdt.ott.provider", "charge", 26);
        f16174b.addURI("mobi.mmdt.ott.provider", "charge/#", 27);
        f16174b.addURI("mobi.mmdt.ott.provider", "bill", 32);
        f16174b.addURI("mobi.mmdt.ott.provider", "bill/#", 33);
        f16174b.addURI("mobi.mmdt.ott.provider", "dialogs", 28);
        f16174b.addURI("mobi.mmdt.ott.provider", "dialogs/#", 29);
        f16174b.addURI("mobi.mmdt.ott.provider", "suggestedchannels", 30);
        f16174b.addURI("mobi.mmdt.ott.provider", "suggestedchannels/#", 31);
        f16174b.addURI("mobi.mmdt.ott.provider", "landing_page_row_items", 34);
        f16174b.addURI("mobi.mmdt.ott.provider", "landing_page_row_items/#", 35);
        f16174b.addURI("mobi.mmdt.ott.provider", "landing_page_rows", 36);
        f16174b.addURI("mobi.mmdt.ott.provider", "landing_page_rows/#", 37);
    }

    protected final SQLiteOpenHelper mo2210a() {
        return C2960d.m7386a(getContext());
    }

    protected final C2956a mo2211a(Uri uri, String str) {
        String str2;
        String lastPathSegment;
        C2956a c2956a = new C2956a();
        int match = f16174b.match(uri);
        switch (match) {
            case 2:
            case 3:
                c2956a.f9188a = "conversations";
                c2956a.f9190c = "_id";
                c2956a.f9189b = "conversations";
                str2 = "conversations._id";
                break;
            case 4:
            case 5:
                c2956a.f9188a = "files";
                c2956a.f9190c = "_id";
                c2956a.f9189b = "files";
                str2 = "files._id";
                break;
            case 8:
            case 9:
                c2956a.f9188a = "members";
                c2956a.f9190c = "_id";
                c2956a.f9189b = "members";
                str2 = "members._id";
                break;
            case 10:
            case 11:
                c2956a.f9188a = "members_group";
                c2956a.f9190c = "_id";
                c2956a.f9189b = "members_group";
                str2 = "members_group._id";
                break;
            case 12:
            case 13:
                c2956a.f9188a = "stickers";
                c2956a.f9190c = "_id";
                c2956a.f9189b = "stickers";
                str2 = "stickers._id";
                break;
            case 14:
            case 15:
                c2956a.f9188a = "stickerspackage";
                c2956a.f9190c = "_id";
                c2956a.f9189b = "stickerspackage";
                str2 = "stickerspackage._id";
                break;
            case 16:
            case 17:
                c2956a.f9188a = "syncedcontacts";
                c2956a.f9190c = "_id";
                c2956a.f9189b = "syncedcontacts";
                str2 = "syncedcontacts._id";
                break;
            case 18:
            case 19:
                c2956a.f9188a = "userinchatstates";
                c2956a.f9190c = "_id";
                c2956a.f9189b = "userinchatstates";
                str2 = "userinchatstates._id";
                break;
            case 20:
            case 21:
                c2956a.f9188a = "recentemoji";
                c2956a.f9190c = "_id";
                c2956a.f9189b = "recentemoji";
                str2 = "recentemoji._id";
                break;
            case 24:
            case 25:
                c2956a.f9188a = "report_events_columns";
                c2956a.f9190c = "_id";
                c2956a.f9189b = "report_events_columns";
                str2 = "report_events_columns._id";
                break;
            case 26:
            case 27:
                c2956a.f9188a = "charge";
                c2956a.f9190c = "_id";
                c2956a.f9189b = "charge";
                str2 = "charge._id";
                break;
            case 28:
            case 29:
                c2956a.f9188a = "dialogs";
                c2956a.f9190c = "_id";
                c2956a.f9189b = "dialogs";
                str2 = "dialogs._id";
                break;
            case 30:
            case 31:
                c2956a.f9188a = "suggestedchannels";
                c2956a.f9190c = "_id";
                c2956a.f9189b = "suggestedchannels";
                str2 = C3020c.f9491b;
                break;
            case 32:
            case 33:
                c2956a.f9188a = "bill";
                c2956a.f9190c = "_id";
                c2956a.f9189b = "bill";
                str2 = "bill._id";
                break;
            case 34:
            case 35:
                c2956a.f9188a = "landing_page_row_items";
                c2956a.f9190c = "_id";
                c2956a.f9189b = "landing_page_row_items";
                str2 = C2993d.f9392b;
                break;
            case 36:
            case 37:
                c2956a.f9188a = "landing_page_rows";
                c2956a.f9190c = "_id";
                c2956a.f9189b = "landing_page_rows";
                str2 = C2997c.f9406b;
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder("The uri '");
                stringBuilder.append(uri);
                stringBuilder.append("' is not supported by this ContentProvider");
                throw new IllegalArgumentException(stringBuilder.toString());
        }
        c2956a.f9192e = str2;
        switch (match) {
            case 1:
            case 3:
            case 5:
            case 9:
            case 11:
            case 13:
            case 15:
            case 17:
            case 19:
            case 21:
            case 25:
            case 27:
            case 29:
            case 31:
            case 33:
            case 35:
            case 37:
                lastPathSegment = uri.getLastPathSegment();
                break;
            default:
                lastPathSegment = null;
                break;
        }
        if (lastPathSegment != null) {
            if (str != null) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(c2956a.f9188a);
                stringBuilder2.append(TemplatePrecompiler.DEFAULT_DEST);
                stringBuilder2.append(c2956a.f9190c);
                stringBuilder2.append("=");
                stringBuilder2.append(lastPathSegment);
                stringBuilder2.append(" and (");
                stringBuilder2.append(str);
                stringBuilder2.append(")");
                lastPathSegment = stringBuilder2.toString();
            } else {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(c2956a.f9188a);
                stringBuilder3.append(TemplatePrecompiler.DEFAULT_DEST);
                stringBuilder3.append(c2956a.f9190c);
                stringBuilder3.append("=");
                stringBuilder3.append(lastPathSegment);
                lastPathSegment = stringBuilder3.toString();
            }
            c2956a.f9191d = lastPathSegment;
            return c2956a;
        }
        c2956a.f9191d = str;
        return c2956a;
    }

    public final Cursor mo2212b(Uri uri, String str) {
        StringBuilder stringBuilder = new StringBuilder("rawQuery uri=");
        stringBuilder.append(uri);
        stringBuilder.append("   ");
        stringBuilder.append(str);
        C2480b.m6741e(stringBuilder.toString());
        return super.mo2212b(uri, str);
    }

    protected final boolean mo2213b() {
        return C2478a.m6728a();
    }

    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        StringBuilder stringBuilder = new StringBuilder("bulkInsert uri=");
        stringBuilder.append(uri);
        stringBuilder.append(" values.length=");
        stringBuilder.append(contentValuesArr.length);
        C2480b.m6741e(stringBuilder.toString());
        return super.bulkInsert(uri, contentValuesArr);
    }

    public final void mo2215c(Uri uri, String str) {
        StringBuilder stringBuilder = new StringBuilder("rawUpdate uri=");
        stringBuilder.append(uri);
        stringBuilder.append("   ");
        stringBuilder.append(str);
        C2480b.m6741e(stringBuilder.toString());
        super.mo2215c(uri, str);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        StringBuilder stringBuilder = new StringBuilder("delete uri=");
        stringBuilder.append(uri);
        stringBuilder.append(" selection=");
        stringBuilder.append(str);
        stringBuilder.append(" selectionArgs=");
        stringBuilder.append(Arrays.toString(strArr));
        C2480b.m6741e(stringBuilder.toString());
        return super.delete(uri, str, strArr);
    }

    public String getType(Uri uri) {
        switch (f16174b.match(uri)) {
            case 2:
                return "vnd.android.cursor.dir/conversations";
            case 3:
                return "vnd.android.cursor.item/conversations";
            case 4:
                return "vnd.android.cursor.dir/files";
            case 5:
                return "vnd.android.cursor.item/files";
            case 8:
                return "vnd.android.cursor.dir/members";
            case 9:
                return "vnd.android.cursor.item/members";
            case 10:
                return "vnd.android.cursor.dir/members_group";
            case 11:
                return "vnd.android.cursor.item/members_group";
            case 12:
                return "vnd.android.cursor.dir/stickers";
            case 13:
                return "vnd.android.cursor.item/stickers";
            case 14:
                return "vnd.android.cursor.dir/stickerspackage";
            case 15:
                return "vnd.android.cursor.item/stickerspackage";
            case 16:
                return "vnd.android.cursor.dir/syncedcontacts";
            case 17:
                return "vnd.android.cursor.item/syncedcontacts";
            case 18:
                return "vnd.android.cursor.dir/userinchatstates";
            case 19:
                return "vnd.android.cursor.item/userinchatstates";
            case 20:
                return "vnd.android.cursor.dir/recentemoji";
            case 21:
                return "vnd.android.cursor.item/recentemoji";
            case 24:
                return "vnd.android.cursor.dir/report_events_columns";
            case 25:
                return "vnd.android.cursor.item/report_events_columns";
            case 26:
                return "vnd.android.cursor.dir/charge";
            case 27:
                return "vnd.android.cursor.item/charge";
            case 28:
                return "vnd.android.cursor.dir/dialogs";
            case 29:
                return "vnd.android.cursor.item/dialogs";
            case 30:
                return "vnd.android.cursor.dir/suggestedchannels";
            case 31:
                return "vnd.android.cursor.item/suggestedchannels";
            case 32:
                return "vnd.android.cursor.dir/bill";
            case 33:
                return "vnd.android.cursor.item/bill";
            case 34:
                return "vnd.android.cursor.dir/landing_page_row_items";
            case 35:
                return "vnd.android.cursor.item/landing_page_row_items";
            case 36:
                return "vnd.android.cursor.dir/landing_page_rows";
            case 37:
                return "vnd.android.cursor.item/landing_page_rows";
            default:
                return null;
        }
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        StringBuilder stringBuilder = new StringBuilder("insert uri=");
        stringBuilder.append(uri);
        stringBuilder.append(" values=");
        stringBuilder.append(contentValues);
        C2480b.m6741e(stringBuilder.toString());
        return super.insert(uri, contentValues);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        StringBuilder stringBuilder = new StringBuilder("query uri=");
        stringBuilder.append(uri);
        stringBuilder.append(" selection=");
        stringBuilder.append(str);
        stringBuilder.append(" selectionArgs=");
        stringBuilder.append(Arrays.toString(strArr2));
        stringBuilder.append(" sortOrder=");
        stringBuilder.append(str2);
        stringBuilder.append(" groupBy=");
        stringBuilder.append(uri.getQueryParameter("QUERY_GROUP_BY"));
        stringBuilder.append(" having=");
        stringBuilder.append(uri.getQueryParameter("QUERY_HAVING"));
        stringBuilder.append(" limit=");
        stringBuilder.append(uri.getQueryParameter("QUERY_LIMIT"));
        C2480b.m6741e(stringBuilder.toString());
        return super.query(uri, strArr, str, strArr2, str2);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        StringBuilder stringBuilder = new StringBuilder("update uri=");
        stringBuilder.append(uri);
        stringBuilder.append(" values=");
        stringBuilder.append(contentValues);
        stringBuilder.append(" selection=");
        stringBuilder.append(str);
        stringBuilder.append(" selectionArgs=");
        stringBuilder.append(Arrays.toString(strArr));
        C2480b.m6741e(stringBuilder.toString());
        return super.update(uri, contentValues, str, strArr);
    }
}
