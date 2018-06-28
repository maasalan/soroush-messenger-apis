package mobi.mmdt.ott.provider.p381c;

import android.content.ContentProvider;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.util.Log;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import mobi.mmdt.ott.MyApplication;
import org.msgpack.util.TemplatePrecompiler;

public abstract class C2957d extends ContentProvider {
    private static C2957d f9193b;
    protected SQLiteOpenHelper f9194a;

    public static class C2956a {
        public String f9188a;
        public String f9189b;
        public String f9190c;
        public String f9191d;
        public String f9192e;
    }

    public static Uri m7374a(Uri uri, boolean z) {
        return uri.buildUpon().appendQueryParameter("QUERY_NOTIFY", String.valueOf(z)).build();
    }

    public static Uri m7375d(Uri uri, String str) {
        return uri.buildUpon().appendQueryParameter("QUERY_GROUP_BY", str).build();
    }

    public static Uri m7376e(Uri uri, String str) {
        return uri.buildUpon().appendQueryParameter("QUERY_HAVING", str).build();
    }

    public static Uri m7377f(Uri uri, String str) {
        return uri.buildUpon().appendQueryParameter("QUERY_LIMIT", str).build();
    }

    public final int m7378a(Uri uri, ContentValues[] contentValuesArr) {
        String lastPathSegment = uri.getLastPathSegment();
        SQLiteDatabase writableDatabase = this.f9194a.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            int length = contentValuesArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                long replace = writableDatabase.replace(lastPathSegment, null, contentValuesArr[i]);
                writableDatabase.yieldIfContendedSafely();
                if (replace != -1) {
                    i2++;
                }
                i++;
            }
            writableDatabase.setTransactionSuccessful();
            if (i2 != 0) {
                String queryParameter = uri.getQueryParameter("QUERY_NOTIFY");
                if (queryParameter == null || "true".equals(queryParameter)) {
                    getContext().getContentResolver().notifyChange(uri, null);
                }
            }
            return i2;
        } finally {
            writableDatabase.endTransaction();
        }
    }

    public abstract SQLiteOpenHelper mo2210a();

    public abstract C2956a mo2211a(Uri uri, String str);

    public ContentProviderResult[] applyBatch(ArrayList<ContentProviderOperation> arrayList) {
        HashSet hashSet = new HashSet(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            ContentProviderResult[] hasNext = it.hasNext();
            if (hasNext == null) {
                break;
            }
            hashSet.add(((ContentProviderOperation) it.next()).getUri());
        }
        SQLiteDatabase writableDatabase = this.f9194a.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            hasNext = new ContentProviderResult[arrayList.size()];
            int i = 0;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ContentProviderOperation contentProviderOperation = (ContentProviderOperation) it2.next();
                hasNext[i] = contentProviderOperation.apply(this, hasNext, i);
                if (contentProviderOperation.isYieldAllowed()) {
                    writableDatabase.yieldIfContendedSafely();
                }
                i++;
            }
            writableDatabase.setTransactionSuccessful();
            it2 = hashSet.iterator();
            while (it2.hasNext()) {
                getContext().getContentResolver().notifyChange((Uri) it2.next(), null);
            }
            return hasNext;
        } finally {
            writableDatabase.endTransaction();
        }
    }

    public final int m7381b(Uri uri, ContentValues[] contentValuesArr) {
        String lastPathSegment = uri.getLastPathSegment();
        SQLiteDatabase writableDatabase = this.f9194a.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            int length = contentValuesArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                long insertWithOnConflict = writableDatabase.insertWithOnConflict(lastPathSegment, null, contentValuesArr[i], 4);
                writableDatabase.yieldIfContendedSafely();
                if (insertWithOnConflict != -1) {
                    i2++;
                }
                i++;
            }
            writableDatabase.setTransactionSuccessful();
            if (i2 != 0) {
                String queryParameter = uri.getQueryParameter("QUERY_NOTIFY");
                if (queryParameter == null || "true".equals(queryParameter)) {
                    MyApplication.m12952b().getContentResolver().notifyChange(uri, null);
                }
            }
            return i2;
        } finally {
            writableDatabase.endTransaction();
        }
    }

    public Cursor mo2212b(Uri uri, String str) {
        Cursor rawQuery = this.f9194a.getReadableDatabase().rawQuery(str, null);
        rawQuery.setNotificationUri(getContext().getContentResolver(), uri);
        return rawQuery;
    }

    public abstract boolean mo2213b();

    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        String lastPathSegment = uri.getLastPathSegment();
        SQLiteDatabase writableDatabase = this.f9194a.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            int length = contentValuesArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                long insert = writableDatabase.insert(lastPathSegment, null, contentValuesArr[i]);
                writableDatabase.yieldIfContendedSafely();
                if (insert != -1) {
                    i2++;
                }
                i++;
            }
            writableDatabase.setTransactionSuccessful();
            if (i2 != 0) {
                String queryParameter = uri.getQueryParameter("QUERY_NOTIFY");
                if (queryParameter == null || "true".equals(queryParameter)) {
                    getContext().getContentResolver().notifyChange(uri, null);
                }
            }
            return i2;
        } finally {
            writableDatabase.endTransaction();
        }
    }

    public void mo2215c(Uri uri, String str) {
        this.f9194a.getReadableDatabase().execSQL(str);
        getContext().getContentResolver().notifyChange(uri, null);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        C2956a a = mo2211a(uri, str);
        int delete = this.f9194a.getWritableDatabase().delete(a.f9188a, a.f9191d, strArr);
        if (delete != 0) {
            String queryParameter = uri.getQueryParameter("QUERY_NOTIFY");
            if (queryParameter == null || "true".equals(queryParameter)) {
                getContext().getContentResolver().notifyChange(uri, null);
            }
        }
        return delete;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        long insertOrThrow = this.f9194a.getWritableDatabase().insertOrThrow(uri.getLastPathSegment(), null, contentValues);
        if (insertOrThrow == -1) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("QUERY_NOTIFY");
        if (queryParameter == null || "true".equals(queryParameter)) {
            getContext().getContentResolver().notifyChange(uri, null);
        }
        return uri.buildUpon().appendEncodedPath(String.valueOf(insertOrThrow)).build();
    }

    public final boolean onCreate() {
        if (mo2213b()) {
            try {
                Field declaredField = Class.forName("android.database.sqlite.SQLiteDebug").getDeclaredField("DEBUG_SQL_STATEMENTS");
                declaredField.setAccessible(true);
                declaredField.set(null, Boolean.valueOf(true));
            } catch (Throwable th) {
                if (mo2213b()) {
                    Log.w(getClass().getSimpleName(), "Could not enable SQLiteDebug logging", th);
                }
            }
        }
        this.f9194a = mo2210a();
        f9193b = this;
        return false;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String[] strArr3;
        String queryParameter = uri.getQueryParameter("QUERY_GROUP_BY");
        String queryParameter2 = uri.getQueryParameter("QUERY_HAVING");
        String queryParameter3 = uri.getQueryParameter("QUERY_LIMIT");
        C2956a a = mo2211a(uri, str);
        String str3 = a.f9188a;
        String str4 = a.f9190c;
        if (strArr == null) {
            strArr3 = null;
        } else {
            String[] strArr4 = new String[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                if (strArr[i].equals(str4)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(str3);
                    stringBuilder.append(TemplatePrecompiler.DEFAULT_DEST);
                    stringBuilder.append(str4);
                    stringBuilder.append(" AS _id");
                    strArr4[i] = stringBuilder.toString();
                } else {
                    strArr4[i] = strArr[i];
                }
            }
            strArr3 = strArr4;
        }
        SQLiteDatabase readableDatabase = this.f9194a.getReadableDatabase();
        String str5 = a.f9189b;
        String str6 = a.f9191d;
        if (str2 == null) {
            str2 = a.f9192e;
        }
        Cursor query = readableDatabase.query(str5, strArr3, str6, strArr2, queryParameter, queryParameter2, str2, queryParameter3);
        query.setNotificationUri(getContext().getContentResolver(), uri);
        return query;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C2956a a = mo2211a(uri, str);
        int update = this.f9194a.getWritableDatabase().update(a.f9188a, contentValues, a.f9191d, strArr);
        if (update != 0) {
            str = uri.getQueryParameter("QUERY_NOTIFY");
            if (str == null || "true".equals(str)) {
                getContext().getContentResolver().notifyChange(uri, null);
            }
        }
        return update;
    }
}
