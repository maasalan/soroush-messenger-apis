package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.google.android.gms.common.util.C1785d;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class fp extends hq {
    private final fq f18129a = new fq(this, mo1615l(), "google_app_measurement_local.db");
    private boolean f18130b;

    fp(gr grVar) {
        super(grVar);
    }

    public final /* bridge */ /* synthetic */ void mo1604a() {
        super.mo1604a();
    }

    @TargetApi(11)
    final boolean m16152a(int i, byte[] bArr) {
        SQLiteFullException e;
        Object obj;
        SQLiteDatabase sQLiteDatabase;
        Throwable th;
        SQLiteException sQLiteException;
        Cursor cursor;
        mo1606c();
        boolean z = false;
        if (this.f18130b) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(IjkMediaMeta.IJKM_KEY_TYPE, Integer.valueOf(i));
        contentValues.put("entry", bArr);
        int i2 = 5;
        int i3 = 0;
        int i4 = 5;
        while (i3 < i2) {
            SQLiteDatabase z2;
            Cursor cursor2;
            Cursor cursor3 = null;
            try {
                z2 = m16176z();
                if (z2 == null) {
                    try {
                        r1.f18130b = true;
                        if (z2 != null) {
                            z2.close();
                        }
                        return z;
                    } catch (SQLiteFullException e2) {
                        e = e2;
                    } catch (SQLiteException e3) {
                        obj = e3;
                        cursor2 = null;
                        sQLiteDatabase = z2;
                        try {
                            if (VERSION.SDK_INT >= 11) {
                            }
                            sQLiteDatabase.endTransaction();
                            mo1623t().f18134a.m4847a("Error writing entry to local database", obj);
                            r1.f18130b = true;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            if (sQLiteDatabase == null) {
                                sQLiteDatabase.close();
                            }
                            i3++;
                            z = false;
                            i2 = 5;
                        } catch (Throwable th2) {
                            th = th2;
                            z2 = sQLiteDatabase;
                        }
                    }
                } else {
                    try {
                        z2.beginTransaction();
                        long j = 0;
                        cursor2 = z2.rawQuery("select count(1) from messages", null);
                        if (cursor2 != null) {
                            try {
                                if (cursor2.moveToFirst()) {
                                    j = cursor2.getLong(z);
                                }
                            } catch (SQLiteFullException e4) {
                                obj = e4;
                                cursor3 = cursor2;
                            } catch (SQLiteException e32) {
                                sQLiteException = e32;
                                sQLiteDatabase = z2;
                                if (VERSION.SDK_INT >= 11) {
                                }
                                sQLiteDatabase.endTransaction();
                                mo1623t().f18134a.m4847a("Error writing entry to local database", obj);
                                r1.f18130b = true;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                if (sQLiteDatabase == null) {
                                    sQLiteDatabase.close();
                                }
                                i3++;
                                z = false;
                                i2 = 5;
                            } catch (Throwable th22) {
                                th = th22;
                            }
                        }
                        if (j >= 100000) {
                            mo1623t().f18134a.m4846a("Data loss, local db full");
                            long j2 = (100000 - j) + 1;
                            j = (long) z2.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                            if (j != j2) {
                                mo1623t().f18134a.m4849a("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(j), Long.valueOf(j2 - j));
                            }
                        }
                        z2.insertOrThrow("messages", null, contentValues);
                        z2.setTransactionSuccessful();
                        z2.endTransaction();
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        if (z2 != null) {
                            z2.close();
                        }
                        return true;
                    } catch (SQLiteFullException e5) {
                        e4 = e5;
                        cursor = null;
                        obj = e4;
                        try {
                            mo1623t().f18134a.m4847a("Error writing entry to local database", obj);
                            r1.f18130b = true;
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            if (z2 != null) {
                                z2.close();
                            }
                            i3++;
                            z = false;
                            i2 = 5;
                        } catch (Throwable th222) {
                            th = th222;
                            cursor2 = cursor3;
                        }
                    } catch (SQLiteException e322) {
                        sQLiteException = e322;
                        cursor2 = null;
                        sQLiteDatabase = z2;
                        if (VERSION.SDK_INT >= 11) {
                        }
                        sQLiteDatabase.endTransaction();
                        mo1623t().f18134a.m4847a("Error writing entry to local database", obj);
                        r1.f18130b = true;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        if (sQLiteDatabase == null) {
                            sQLiteDatabase.close();
                        }
                        i3++;
                        z = false;
                        i2 = 5;
                    } catch (Throwable th2222) {
                        th = th2222;
                        cursor2 = null;
                    }
                }
            } catch (SQLiteFullException e42) {
                cursor = null;
                obj = e42;
                z2 = null;
                mo1623t().f18134a.m4847a("Error writing entry to local database", obj);
                r1.f18130b = true;
                if (cursor3 != null) {
                    cursor3.close();
                }
                if (z2 != null) {
                    z2.close();
                }
                i3++;
                z = false;
                i2 = 5;
            } catch (SQLiteException e3222) {
                cursor = null;
                obj = e3222;
                cursor2 = null;
                if (VERSION.SDK_INT >= 11 || !(obj instanceof SQLiteDatabaseLockedException)) {
                    if (sQLiteDatabase != null && sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                    mo1623t().f18134a.m4847a("Error writing entry to local database", obj);
                    r1.f18130b = true;
                } else {
                    SystemClock.sleep((long) i4);
                    i4 += 20;
                }
                if (cursor2 != null) {
                    cursor2.close();
                }
                if (sQLiteDatabase == null) {
                    sQLiteDatabase.close();
                }
                i3++;
                z = false;
                i2 = 5;
            } catch (Throwable th22222) {
                th = th22222;
                z2 = null;
                cursor2 = z2;
            }
        }
        mo1623t().f18136c.m4846a("Failed to write entry to local database");
        return false;
        if (cursor2 != null) {
            cursor2.close();
        }
        if (z2 != null) {
            z2.close();
        }
        throw th;
    }

    public final /* bridge */ /* synthetic */ void mo1605b() {
        super.mo1605b();
    }

    public final /* bridge */ /* synthetic */ void mo1606c() {
        super.mo1606c();
    }

    public final /* bridge */ /* synthetic */ eo mo1607d() {
        return super.mo1607d();
    }

    public final /* bridge */ /* synthetic */ eu mo1608e() {
        return super.mo1608e();
    }

    public final /* bridge */ /* synthetic */ hs mo1609f() {
        return super.mo1609f();
    }

    public final /* bridge */ /* synthetic */ fo mo1610g() {
        return super.mo1610g();
    }

    public final /* bridge */ /* synthetic */ fd mo1611h() {
        return super.mo1611h();
    }

    public final /* bridge */ /* synthetic */ il mo1612i() {
        return super.mo1612i();
    }

    public final /* bridge */ /* synthetic */ ih mo1613j() {
        return super.mo1613j();
    }

    public final /* bridge */ /* synthetic */ C1785d mo1614k() {
        return super.mo1614k();
    }

    public final /* bridge */ /* synthetic */ Context mo1615l() {
        return super.mo1615l();
    }

    public final /* bridge */ /* synthetic */ fp mo1616m() {
        return super.mo1616m();
    }

    public final /* bridge */ /* synthetic */ ex mo1617n() {
        return super.mo1617n();
    }

    public final /* bridge */ /* synthetic */ fr mo1618o() {
        return super.mo1618o();
    }

    public final /* bridge */ /* synthetic */ ju mo1619p() {
        return super.mo1619p();
    }

    public final /* bridge */ /* synthetic */ gl mo1620q() {
        return super.mo1620q();
    }

    public final /* bridge */ /* synthetic */ jk mo1621r() {
        return super.mo1621r();
    }

    public final /* bridge */ /* synthetic */ gm mo1622s() {
        return super.mo1622s();
    }

    public final /* bridge */ /* synthetic */ ft mo1623t() {
        return super.mo1623t();
    }

    public final /* bridge */ /* synthetic */ gd mo1624u() {
        return super.mo1624u();
    }

    public final /* bridge */ /* synthetic */ ew mo1625v() {
        return super.mo1625v();
    }

    protected final boolean mo3036w() {
        return false;
    }

    @android.annotation.TargetApi(11)
    public final java.util.List<com.google.android.gms.internal.zzbej> m16175y() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r21 = this;
        r1 = r21;
        r21.mo1606c();
        r2 = r1.f18130b;
        r3 = 0;
        if (r2 == 0) goto L_0x000b;
    L_0x000a:
        return r3;
    L_0x000b:
        r2 = new java.util.ArrayList;
        r2.<init>();
        r4 = r21.mo1615l();
        r5 = "google_app_measurement_local.db";
        r4 = r4.getDatabasePath(r5);
        r4 = r4.exists();
        if (r4 != 0) goto L_0x0021;
    L_0x0020:
        return r2;
    L_0x0021:
        r4 = 5;
        r5 = 0;
        r7 = r4;
        r6 = r5;
    L_0x0025:
        if (r6 >= r4) goto L_0x01ee;
    L_0x0027:
        r8 = 1;
        r15 = r21.m16176z();	 Catch:{ SQLiteFullException -> 0x01c1, SQLiteException -> 0x0189, all -> 0x0184 }
        if (r15 != 0) goto L_0x0045;
    L_0x002e:
        r1.f18130b = r8;	 Catch:{ SQLiteFullException -> 0x0040, SQLiteException -> 0x003b, all -> 0x0036 }
        if (r15 == 0) goto L_0x0035;
    L_0x0032:
        r15.close();
    L_0x0035:
        return r3;
    L_0x0036:
        r0 = move-exception;
        r2 = r0;
        r9 = r3;
        goto L_0x01e2;
    L_0x003b:
        r0 = move-exception;
        r9 = r3;
    L_0x003d:
        r3 = r0;
        goto L_0x018d;
    L_0x0040:
        r0 = move-exception;
        r9 = r3;
    L_0x0042:
        r3 = r0;
        goto L_0x01c5;
    L_0x0045:
        r15.beginTransaction();	 Catch:{ SQLiteFullException -> 0x017f, SQLiteException -> 0x017a, all -> 0x0176 }
        r10 = "messages";	 Catch:{ SQLiteFullException -> 0x017f, SQLiteException -> 0x017a, all -> 0x0176 }
        r9 = 3;	 Catch:{ SQLiteFullException -> 0x017f, SQLiteException -> 0x017a, all -> 0x0176 }
        r11 = new java.lang.String[r9];	 Catch:{ SQLiteFullException -> 0x017f, SQLiteException -> 0x017a, all -> 0x0176 }
        r9 = "rowid";	 Catch:{ SQLiteFullException -> 0x017f, SQLiteException -> 0x017a, all -> 0x0176 }
        r11[r5] = r9;	 Catch:{ SQLiteFullException -> 0x017f, SQLiteException -> 0x017a, all -> 0x0176 }
        r9 = "type";	 Catch:{ SQLiteFullException -> 0x017f, SQLiteException -> 0x017a, all -> 0x0176 }
        r11[r8] = r9;	 Catch:{ SQLiteFullException -> 0x017f, SQLiteException -> 0x017a, all -> 0x0176 }
        r9 = "entry";	 Catch:{ SQLiteFullException -> 0x017f, SQLiteException -> 0x017a, all -> 0x0176 }
        r14 = 2;	 Catch:{ SQLiteFullException -> 0x017f, SQLiteException -> 0x017a, all -> 0x0176 }
        r11[r14] = r9;	 Catch:{ SQLiteFullException -> 0x017f, SQLiteException -> 0x017a, all -> 0x0176 }
        r12 = 0;	 Catch:{ SQLiteFullException -> 0x017f, SQLiteException -> 0x017a, all -> 0x0176 }
        r13 = 0;	 Catch:{ SQLiteFullException -> 0x017f, SQLiteException -> 0x017a, all -> 0x0176 }
        r16 = 0;	 Catch:{ SQLiteFullException -> 0x017f, SQLiteException -> 0x017a, all -> 0x0176 }
        r17 = 0;	 Catch:{ SQLiteFullException -> 0x017f, SQLiteException -> 0x017a, all -> 0x0176 }
        r18 = "rowid asc";	 Catch:{ SQLiteFullException -> 0x017f, SQLiteException -> 0x017a, all -> 0x0176 }
        r9 = 100;	 Catch:{ SQLiteFullException -> 0x017f, SQLiteException -> 0x017a, all -> 0x0176 }
        r19 = java.lang.Integer.toString(r9);	 Catch:{ SQLiteFullException -> 0x017f, SQLiteException -> 0x017a, all -> 0x0176 }
        r9 = r15;
        r4 = r14;
        r14 = r16;
        r3 = r15;
        r15 = r17;
        r16 = r18;
        r17 = r19;
        r9 = r9.query(r10, r11, r12, r13, r14, r15, r16, r17);	 Catch:{ SQLiteFullException -> 0x0173, SQLiteException -> 0x0170, all -> 0x016e }
        r10 = -1;
    L_0x0079:
        r12 = r9.moveToNext();	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        if (r12 == 0) goto L_0x0130;	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
    L_0x007f:
        r10 = r9.getLong(r5);	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        r12 = r9.getInt(r8);	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        r13 = r9.getBlob(r4);	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        if (r12 != 0) goto L_0x00bf;	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
    L_0x008d:
        r12 = android.os.Parcel.obtain();	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        r14 = r13.length;	 Catch:{ dl -> 0x00ac }
        r12.unmarshall(r13, r5, r14);	 Catch:{ dl -> 0x00ac }
        r12.setDataPosition(r5);	 Catch:{ dl -> 0x00ac }
        r13 = com.google.android.gms.internal.zzcfx.CREATOR;	 Catch:{ dl -> 0x00ac }
        r13 = r13.createFromParcel(r12);	 Catch:{ dl -> 0x00ac }
        r13 = (com.google.android.gms.internal.zzcfx) r13;	 Catch:{ dl -> 0x00ac }
        r12.recycle();	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        if (r13 == 0) goto L_0x0079;	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
    L_0x00a5:
        r2.add(r13);	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        goto L_0x0079;
    L_0x00a9:
        r0 = move-exception;
        r4 = r0;
        goto L_0x00bb;
    L_0x00ac:
        r13 = r21.mo1623t();	 Catch:{ all -> 0x00a9 }
        r13 = r13.f18134a;	 Catch:{ all -> 0x00a9 }
        r14 = "Failed to load event from local database";	 Catch:{ all -> 0x00a9 }
        r13.m4846a(r14);	 Catch:{ all -> 0x00a9 }
        r12.recycle();	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        goto L_0x0079;	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
    L_0x00bb:
        r12.recycle();	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        throw r4;	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
    L_0x00bf:
        if (r12 != r8) goto L_0x00f1;	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
    L_0x00c1:
        r12 = android.os.Parcel.obtain();	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        r14 = r13.length;	 Catch:{ dl -> 0x00db }
        r12.unmarshall(r13, r5, r14);	 Catch:{ dl -> 0x00db }
        r12.setDataPosition(r5);	 Catch:{ dl -> 0x00db }
        r13 = com.google.android.gms.internal.zzckk.CREATOR;	 Catch:{ dl -> 0x00db }
        r13 = r13.createFromParcel(r12);	 Catch:{ dl -> 0x00db }
        r13 = (com.google.android.gms.internal.zzckk) r13;	 Catch:{ dl -> 0x00db }
        r12.recycle();	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        goto L_0x00ea;
    L_0x00d8:
        r0 = move-exception;
        r4 = r0;
        goto L_0x00ed;
    L_0x00db:
        r13 = r21.mo1623t();	 Catch:{ all -> 0x00d8 }
        r13 = r13.f18134a;	 Catch:{ all -> 0x00d8 }
        r14 = "Failed to load user property from local database";	 Catch:{ all -> 0x00d8 }
        r13.m4846a(r14);	 Catch:{ all -> 0x00d8 }
        r12.recycle();	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        r13 = 0;	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
    L_0x00ea:
        if (r13 == 0) goto L_0x0079;	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
    L_0x00ec:
        goto L_0x00a5;	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
    L_0x00ed:
        r12.recycle();	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        throw r4;	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
    L_0x00f1:
        if (r12 != r4) goto L_0x0123;	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
    L_0x00f3:
        r12 = android.os.Parcel.obtain();	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        r14 = r13.length;	 Catch:{ dl -> 0x010d }
        r12.unmarshall(r13, r5, r14);	 Catch:{ dl -> 0x010d }
        r12.setDataPosition(r5);	 Catch:{ dl -> 0x010d }
        r13 = com.google.android.gms.internal.zzcfi.CREATOR;	 Catch:{ dl -> 0x010d }
        r13 = r13.createFromParcel(r12);	 Catch:{ dl -> 0x010d }
        r13 = (com.google.android.gms.internal.zzcfi) r13;	 Catch:{ dl -> 0x010d }
        r12.recycle();	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        goto L_0x011c;
    L_0x010a:
        r0 = move-exception;
        r4 = r0;
        goto L_0x011f;
    L_0x010d:
        r13 = r21.mo1623t();	 Catch:{ all -> 0x010a }
        r13 = r13.f18134a;	 Catch:{ all -> 0x010a }
        r14 = "Failed to load user property from local database";	 Catch:{ all -> 0x010a }
        r13.m4846a(r14);	 Catch:{ all -> 0x010a }
        r12.recycle();	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        r13 = 0;	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
    L_0x011c:
        if (r13 == 0) goto L_0x0079;	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
    L_0x011e:
        goto L_0x00a5;	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
    L_0x011f:
        r12.recycle();	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        throw r4;	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
    L_0x0123:
        r12 = r21.mo1623t();	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        r12 = r12.f18134a;	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        r13 = "Unknown record type in local database";	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        r12.m4846a(r13);	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        goto L_0x0079;	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
    L_0x0130:
        r4 = "messages";	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        r12 = "rowid <= ?";	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        r13 = new java.lang.String[r8];	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        r10 = java.lang.Long.toString(r10);	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        r13[r5] = r10;	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        r4 = r3.delete(r4, r12, r13);	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        r10 = r2.size();	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        if (r4 >= r10) goto L_0x0151;	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
    L_0x0146:
        r4 = r21.mo1623t();	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        r4 = r4.f18134a;	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        r10 = "Fewer entries removed from local database than expected";	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        r4.m4846a(r10);	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
    L_0x0151:
        r3.setTransactionSuccessful();	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        r3.endTransaction();	 Catch:{ SQLiteFullException -> 0x016a, SQLiteException -> 0x0166, all -> 0x0162 }
        if (r9 == 0) goto L_0x015c;
    L_0x0159:
        r9.close();
    L_0x015c:
        if (r3 == 0) goto L_0x0161;
    L_0x015e:
        r3.close();
    L_0x0161:
        return r2;
    L_0x0162:
        r0 = move-exception;
        r2 = r0;
        goto L_0x01e3;
    L_0x0166:
        r0 = move-exception;
        r15 = r3;
        goto L_0x003d;
    L_0x016a:
        r0 = move-exception;
        r15 = r3;
        goto L_0x0042;
    L_0x016e:
        r0 = move-exception;
        goto L_0x0178;
    L_0x0170:
        r0 = move-exception;
        r15 = r3;
        goto L_0x017c;
    L_0x0173:
        r0 = move-exception;
        r15 = r3;
        goto L_0x0181;
    L_0x0176:
        r0 = move-exception;
        r3 = r15;
    L_0x0178:
        r2 = r0;
        goto L_0x0187;
    L_0x017a:
        r0 = move-exception;
        r3 = r15;
    L_0x017c:
        r9 = 0;
        goto L_0x003d;
    L_0x017f:
        r0 = move-exception;
        r3 = r15;
    L_0x0181:
        r9 = 0;
        goto L_0x0042;
    L_0x0184:
        r0 = move-exception;
        r2 = r0;
        r3 = 0;
    L_0x0187:
        r9 = 0;
        goto L_0x01e3;
    L_0x0189:
        r0 = move-exception;
        r3 = r0;
        r9 = 0;
        r15 = 0;
    L_0x018d:
        r4 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x01e0 }
        r10 = 11;	 Catch:{ all -> 0x01e0 }
        if (r4 < r10) goto L_0x019e;	 Catch:{ all -> 0x01e0 }
    L_0x0193:
        r4 = r3 instanceof android.database.sqlite.SQLiteDatabaseLockedException;	 Catch:{ all -> 0x01e0 }
        if (r4 == 0) goto L_0x019e;	 Catch:{ all -> 0x01e0 }
    L_0x0197:
        r3 = (long) r7;	 Catch:{ all -> 0x01e0 }
        android.os.SystemClock.sleep(r3);	 Catch:{ all -> 0x01e0 }
        r7 = r7 + 20;	 Catch:{ all -> 0x01e0 }
        goto L_0x01b6;	 Catch:{ all -> 0x01e0 }
    L_0x019e:
        if (r15 == 0) goto L_0x01a9;	 Catch:{ all -> 0x01e0 }
    L_0x01a0:
        r4 = r15.inTransaction();	 Catch:{ all -> 0x01e0 }
        if (r4 == 0) goto L_0x01a9;	 Catch:{ all -> 0x01e0 }
    L_0x01a6:
        r15.endTransaction();	 Catch:{ all -> 0x01e0 }
    L_0x01a9:
        r4 = r21.mo1623t();	 Catch:{ all -> 0x01e0 }
        r4 = r4.f18134a;	 Catch:{ all -> 0x01e0 }
        r10 = "Error reading entries from local database";	 Catch:{ all -> 0x01e0 }
        r4.m4847a(r10, r3);	 Catch:{ all -> 0x01e0 }
        r1.f18130b = r8;	 Catch:{ all -> 0x01e0 }
    L_0x01b6:
        if (r9 == 0) goto L_0x01bb;
    L_0x01b8:
        r9.close();
    L_0x01bb:
        if (r15 == 0) goto L_0x01da;
    L_0x01bd:
        r15.close();
        goto L_0x01da;
    L_0x01c1:
        r0 = move-exception;
        r3 = r0;
        r9 = 0;
        r15 = 0;
    L_0x01c5:
        r4 = r21.mo1623t();	 Catch:{ all -> 0x01e0 }
        r4 = r4.f18134a;	 Catch:{ all -> 0x01e0 }
        r10 = "Error reading entries from local database";	 Catch:{ all -> 0x01e0 }
        r4.m4847a(r10, r3);	 Catch:{ all -> 0x01e0 }
        r1.f18130b = r8;	 Catch:{ all -> 0x01e0 }
        if (r9 == 0) goto L_0x01d7;
    L_0x01d4:
        r9.close();
    L_0x01d7:
        if (r15 == 0) goto L_0x01da;
    L_0x01d9:
        goto L_0x01bd;
    L_0x01da:
        r6 = r6 + 1;
        r3 = 0;
        r4 = 5;
        goto L_0x0025;
    L_0x01e0:
        r0 = move-exception;
        r2 = r0;
    L_0x01e2:
        r3 = r15;
    L_0x01e3:
        if (r9 == 0) goto L_0x01e8;
    L_0x01e5:
        r9.close();
    L_0x01e8:
        if (r3 == 0) goto L_0x01ed;
    L_0x01ea:
        r3.close();
    L_0x01ed:
        throw r2;
    L_0x01ee:
        r2 = r21.mo1623t();
        r2 = r2.f18136c;
        r3 = "Failed to read events from database in reasonable time";
        r2.m4846a(r3);
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fp.y():java.util.List<com.google.android.gms.internal.zzbej>");
    }

    final SQLiteDatabase m16176z() {
        if (this.f18130b) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f18129a.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f18130b = true;
        return null;
    }
}
