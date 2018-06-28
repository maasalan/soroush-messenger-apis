package com.liulishuo.filedownloader.p199b;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.SparseArray;
import com.liulishuo.filedownloader.model.C2210a;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.liulishuo.filedownloader.p199b.C2137a.C2136a;
import com.liulishuo.filedownloader.p205h.C2181c;
import com.liulishuo.filedownloader.p205h.C2182d;
import com.liulishuo.filedownloader.p205h.C2185f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jivesoftware.smackx.message_correct.element.MessageCorrectExtension;
import org.jivesoftware.smackx.muc.packet.MUCUser.Status;
import tv.danmaku.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener;

public final class C5654d implements C2137a {
    private final SQLiteDatabase f15523a = new C2141e(C2181c.f7248a).getWritableDatabase();

    class C2140b implements Iterator<FileDownloadModel> {
        final Cursor f7128a;
        final List<Integer> f7129b = new ArrayList();
        final /* synthetic */ C5654d f7130c;
        private int f7131d;

        C2140b(C5654d c5654d) {
            this.f7130c = c5654d;
            this.f7128a = c5654d.f15523a.rawQuery("SELECT * FROM filedownloader", null);
        }

        public final boolean hasNext() {
            return this.f7128a.moveToNext();
        }

        public final /* synthetic */ Object next() {
            FileDownloadModel a = C5654d.m12466b(this.f7128a);
            this.f7131d = a.f7290a;
            return a;
        }

        public final void remove() {
            this.f7129b.add(Integer.valueOf(this.f7131d));
        }
    }

    public class C5653a implements C2136a {
        final /* synthetic */ C5654d f15518a;
        private final SparseArray<FileDownloadModel> f15519b;
        private C2140b f15520c;
        private final SparseArray<FileDownloadModel> f15521d;
        private final SparseArray<List<C2210a>> f15522e;

        C5653a(C5654d c5654d) {
            this(c5654d, null, null);
        }

        C5653a(C5654d c5654d, SparseArray<FileDownloadModel> sparseArray, SparseArray<List<C2210a>> sparseArray2) {
            this.f15518a = c5654d;
            this.f15519b = new SparseArray();
            this.f15521d = sparseArray;
            this.f15522e = sparseArray2;
        }

        public final void mo1837a() {
            int i = 0;
            if (this.f15520c != null) {
                C2140b c2140b = this.f15520c;
                c2140b.f7128a.close();
                if (!c2140b.f7129b.isEmpty()) {
                    String join = TextUtils.join(", ", c2140b.f7129b);
                    if (C2182d.f7249a) {
                        C2182d.m5983c(c2140b, "delete %s", join);
                    }
                    c2140b.f7130c.f15523a.execSQL(C2185f.m5996a("DELETE FROM %s WHERE %s IN (%s);", "filedownloader", "_id", join));
                    c2140b.f7130c.f15523a.execSQL(C2185f.m5996a("DELETE FROM %s WHERE %s IN (%s);", "filedownloaderConnection", MessageCorrectExtension.ID_TAG, join));
                }
            }
            int size = this.f15519b.size();
            if (size >= 0) {
                this.f15518a.f15523a.beginTransaction();
                int i2 = 0;
                while (i2 < size) {
                    try {
                        int keyAt = this.f15519b.keyAt(i2);
                        FileDownloadModel fileDownloadModel = (FileDownloadModel) this.f15519b.get(keyAt);
                        this.f15518a.f15523a.delete("filedownloader", "_id = ?", new String[]{String.valueOf(keyAt)});
                        this.f15518a.f15523a.insert("filedownloader", null, fileDownloadModel.m6065e());
                        if (fileDownloadModel.f7299j > 1) {
                            List<C2210a> c = this.f15518a.mo1854c(keyAt);
                            if (c.size() > 0) {
                                this.f15518a.f15523a.delete("filedownloaderConnection", "id = ?", new String[]{String.valueOf(keyAt)});
                                for (C2210a c2210a : c) {
                                    c2210a.f7305a = fileDownloadModel.f7290a;
                                    this.f15518a.f15523a.insert("filedownloaderConnection", null, c2210a.m6067a());
                                }
                            }
                        }
                        i2++;
                    } catch (Throwable th) {
                        this.f15518a.f15523a.endTransaction();
                    }
                }
                if (!(this.f15521d == null || this.f15522e == null)) {
                    size = this.f15521d.size();
                    while (i < size) {
                        int i3 = ((FileDownloadModel) this.f15521d.valueAt(i)).f7290a;
                        List c2 = this.f15518a.mo1854c(i3);
                        if (c2 != null && c2.size() > 0) {
                            this.f15522e.put(i3, c2);
                        }
                        i++;
                    }
                }
                this.f15518a.f15523a.setTransactionSuccessful();
                this.f15518a.f15523a.endTransaction();
            }
        }

        public final void mo1838a(int i, FileDownloadModel fileDownloadModel) {
            this.f15519b.put(i, fileDownloadModel);
        }

        public final void mo1839a(FileDownloadModel fileDownloadModel) {
            if (this.f15521d != null) {
                this.f15521d.put(fileDownloadModel.f7290a, fileDownloadModel);
            }
        }

        public final Iterator<FileDownloadModel> iterator() {
            Iterator c2140b = new C2140b(this.f15518a);
            this.f15520c = c2140b;
            return c2140b;
        }
    }

    private void m12465a(int i, ContentValues contentValues) {
        this.f15523a.update("filedownloader", contentValues, "_id = ? ", new String[]{String.valueOf(i)});
    }

    private static FileDownloadModel m12466b(Cursor cursor) {
        FileDownloadModel fileDownloadModel = new FileDownloadModel();
        fileDownloadModel.f7290a = cursor.getInt(cursor.getColumnIndex("_id"));
        fileDownloadModel.f7291b = cursor.getString(cursor.getColumnIndex(OnNativeInvokeListener.ARG_URL));
        String string = cursor.getString(cursor.getColumnIndex("path"));
        boolean z = true;
        if (cursor.getShort(cursor.getColumnIndex("pathAsDirectory")) != (short) 1) {
            z = false;
        }
        fileDownloadModel.m6060a(string, z);
        fileDownloadModel.m6058a((byte) cursor.getShort(cursor.getColumnIndex(Status.ELEMENT)));
        fileDownloadModel.m6059a(cursor.getLong(cursor.getColumnIndex("sofar")));
        fileDownloadModel.m6062b(cursor.getLong(cursor.getColumnIndex("total")));
        fileDownloadModel.f7297h = cursor.getString(cursor.getColumnIndex("errMsg"));
        fileDownloadModel.f7298i = cursor.getString(cursor.getColumnIndex("etag"));
        fileDownloadModel.f7294e = cursor.getString(cursor.getColumnIndex("filename"));
        fileDownloadModel.f7299j = cursor.getInt(cursor.getColumnIndex("connectionCount"));
        return fileDownloadModel;
    }

    public final void mo1840a() {
        this.f15523a.delete("filedownloader", null, null);
        this.f15523a.delete("filedownloaderConnection", null, null);
    }

    public final void mo1841a(int i) {
    }

    public final void mo1842a(int i, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("connectionCount", Integer.valueOf(i2));
        this.f15523a.update("filedownloader", contentValues, "_id = ? ", new String[]{Integer.toString(i)});
    }

    public final void mo1843a(int i, int i2, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("currentOffset", Long.valueOf(j));
        this.f15523a.update("filedownloaderConnection", contentValues, "id = ? AND connectionIndex = ?", new String[]{Integer.toString(i), Integer.toString(i2)});
    }

    public final void mo1844a(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Status.ELEMENT, Byte.valueOf((byte) 3));
        contentValues.put("sofar", Long.valueOf(j));
        m12465a(i, contentValues);
    }

    public final void mo1845a(int i, long j, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Status.ELEMENT, Byte.valueOf((byte) 2));
        contentValues.put("total", Long.valueOf(j));
        contentValues.put("etag", str);
        contentValues.put("filename", str2);
        m12465a(i, contentValues);
    }

    public final void mo1846a(int i, String str, long j, long j2, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sofar", Long.valueOf(j));
        contentValues.put("total", Long.valueOf(j2));
        contentValues.put("etag", str);
        contentValues.put("connectionCount", Integer.valueOf(i2));
        m12465a(i, contentValues);
    }

    public final void mo1847a(int i, Throwable th) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("errMsg", th.toString());
        contentValues.put(Status.ELEMENT, Byte.valueOf((byte) 5));
        m12465a(i, contentValues);
    }

    public final void mo1848a(int i, Throwable th, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("errMsg", th.toString());
        contentValues.put(Status.ELEMENT, Byte.valueOf((byte) -1));
        contentValues.put("sofar", Long.valueOf(j));
        m12465a(i, contentValues);
    }

    public final void mo1849a(FileDownloadModel fileDownloadModel) {
        if (fileDownloadModel == null) {
            C2182d.m5984d(this, "update but model == null!", new Object[0]);
        } else if (mo1852b(fileDownloadModel.f7290a) != null) {
            this.f15523a.update("filedownloader", fileDownloadModel.m6065e(), "_id = ? ", new String[]{String.valueOf(fileDownloadModel.f7290a)});
        } else {
            this.f15523a.insert("filedownloader", null, fileDownloadModel.m6065e());
        }
    }

    public final void mo1850a(C2210a c2210a) {
        this.f15523a.insert("filedownloaderConnection", null, c2210a.m6067a());
    }

    public final C2136a mo1851b() {
        return new C5653a(this);
    }

    public final FileDownloadModel mo1852b(int i) {
        Throwable th;
        Cursor cursor = null;
        try {
            Cursor rawQuery = this.f15523a.rawQuery(C2185f.m5996a("SELECT * FROM %s WHERE %s = ?", "filedownloader", "_id"), new String[]{Integer.toString(i)});
            try {
                if (rawQuery.moveToNext()) {
                    FileDownloadModel b = C5654d.m12466b(rawQuery);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return b;
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return null;
            } catch (Throwable th2) {
                Throwable th3 = th2;
                cursor = rawQuery;
                th = th3;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void mo1853b(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Status.ELEMENT, Byte.valueOf((byte) -2));
        contentValues.put("sofar", Long.valueOf(j));
        m12465a(i, contentValues);
    }

    public final List<C2210a> mo1854c(int i) {
        Throwable th;
        List<C2210a> arrayList = new ArrayList();
        Cursor rawQuery;
        try {
            rawQuery = this.f15523a.rawQuery(C2185f.m5996a("SELECT * FROM %s WHERE %s = ?", "filedownloaderConnection", MessageCorrectExtension.ID_TAG), new String[]{Integer.toString(i)});
            while (rawQuery.moveToNext()) {
                try {
                    C2210a c2210a = new C2210a();
                    c2210a.f7305a = i;
                    c2210a.f7306b = rawQuery.getInt(rawQuery.getColumnIndex("connectionIndex"));
                    c2210a.f7307c = rawQuery.getLong(rawQuery.getColumnIndex("startOffset"));
                    c2210a.f7308d = rawQuery.getLong(rawQuery.getColumnIndex("currentOffset"));
                    c2210a.f7309e = rawQuery.getLong(rawQuery.getColumnIndex("endOffset"));
                    arrayList.add(c2210a);
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            rawQuery = null;
            if (rawQuery != null) {
                rawQuery.close();
            }
            throw th;
        }
    }

    public final void mo1855d(int i) {
        SQLiteDatabase sQLiteDatabase = this.f15523a;
        StringBuilder stringBuilder = new StringBuilder("DELETE FROM filedownloaderConnection WHERE id = ");
        stringBuilder.append(i);
        sQLiteDatabase.execSQL(stringBuilder.toString());
    }

    public final boolean mo1856e(int i) {
        return this.f15523a.delete("filedownloader", "_id = ?", new String[]{String.valueOf(i)}) != 0;
    }

    public final void mo1857f(int i) {
        mo1856e(i);
    }

    public final void mo1858g(int i) {
    }
}
