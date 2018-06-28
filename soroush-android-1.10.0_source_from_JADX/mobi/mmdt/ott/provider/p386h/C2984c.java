package mobi.mmdt.ott.provider.p386h;

import android.net.Uri;
import java.util.ArrayList;
import mobi.mmdt.ott.MyApplication;

public final class C2984c {
    public static int m7453a(long j, int i) {
        C6025e c6025e = new C6025e();
        c6025e.m13447a(i);
        C6027g c6027g = new C6027g();
        c6027g.m13470b(j);
        return c6025e.m13445a(MyApplication.m12952b(), c6027g);
    }

    public static int m7454a(long j, Uri uri) {
        if (uri != null) {
            if (!uri.getPath().isEmpty()) {
                C6025e c6025e = new C6025e();
                c6025e.m13450a(uri.toString());
                C6027g c6027g = new C6027g();
                c6027g.m13470b(j);
                return c6025e.m13445a(MyApplication.m12952b(), c6027g);
            }
        }
        throw new NullPointerException();
    }

    public static int m7455a(long j, C2986h c2986h) {
        C6025e c6025e = new C6025e();
        c6025e.m13451a(c2986h);
        C6027g c6027g = new C6027g();
        c6027g.m13470b(j);
        return c6025e.m13445a(MyApplication.m12952b(), c6027g);
    }

    public static int m7456a(long j, C2987i c2987i) {
        C6025e c6025e = new C6025e();
        c6025e.m13452a(c2987i);
        C6027g c6027g = new C6027g();
        c6027g.m13470b(j);
        return c6025e.m13445a(MyApplication.m12952b(), c6027g);
    }

    public static int m7457a(String str, C2987i c2987i) {
        C6025e c6025e = new C6025e();
        c6025e.m13452a(c2987i);
        if (c2987i.equals(C2987i.NOT_STARTED)) {
            c6025e.m13447a(0).m13457b(C2987i.NOT_STARTED);
        }
        C6027g c6027g = new C6027g();
        c6027g.m13466a(str);
        return c6025e.m13445a(MyApplication.m12952b(), c6027g);
    }

    public static int m7458a(C2986h c2986h) {
        C6025e c6025e = new C6025e();
        c6025e.m13451a(c2986h);
        return c6025e.m13445a(MyApplication.m12952b(), new C6027g());
    }

    public static long m7459a(Uri uri, String str, String str2, C2988j c2988j, String str3, long j, Uri uri2, String str4, int i, C2987i c2987i, C2987i c2987i2, C2986h c2986h, int i2, int i3, int i4) {
        String str5 = str;
        String str6 = str2;
        C2988j c2988j2 = c2988j;
        String str7 = str3;
        long j2 = j;
        C2987i c2987i3 = c2987i;
        C2987i c2987i4 = c2987i2;
        C2986h c2986h2 = c2986h;
        int i5 = i2;
        int i6 = i3;
        int i7 = i4;
        if (!(uri == null || uri.getPath().isEmpty() || str7 == null || str3.isEmpty() || c2987i4 == null)) {
            if (c2987i3 != null) {
                C6027g c6027g;
                C6026f b;
                int i8;
                C6025e c6025e = new C6025e();
                if (!(c2988j2 == C2988j.IMAGE || c2988j2 == C2988j.VIDEO)) {
                    if (c2988j2 != C2988j.GIF) {
                        c6025e.m13450a(uri.toString()).m13459c(str6).m13457b(c2987i4).m13456b(str5).m13453a(c2988j2).m13461d(str7).m13448a(j2).m13447a(0).m13449a(Integer.valueOf(i)).m13452a(c2987i3).m13451a(c2986h2).m13454b(i5).m13458c(i6).m13460d(i7);
                        if (str6 != null) {
                            c6027g = new C6027g();
                            c6027g.m13471b(str6);
                            b = c6027g.m13469b(MyApplication.m12952b());
                            j2 = 0;
                            i8 = (b.moveToFirst() || b.m13465b() <= 0) ? 0 : 1;
                            b.close();
                            if (i8 != 0) {
                                c6027g = new C6027g();
                                c6027g.m13471b(str6);
                                b = c6027g.m13469b(MyApplication.m12952b());
                                if (b.moveToFirst()) {
                                    j2 = b.m13464a();
                                }
                                b.close();
                                return j2;
                            }
                        }
                        return Long.parseLong(c6025e.m7349a(MyApplication.m12952b()).getLastPathSegment());
                    }
                }
                c6025e.m13450a(uri.toString()).m13459c(str6).m13457b(c2987i4).m13456b(str5).m13453a(c2988j2).m13461d(str7).m13448a(j2).m13447a(0).m13463f(str4).m13449a(Integer.valueOf(i)).m13452a(c2987i3).m13451a(c2986h2).m13454b(i5).m13458c(i6).m13460d(i7);
                if (uri2 != null) {
                    c6025e.m13462e(uri2.toString());
                }
                if (str6 != null) {
                    c6027g = new C6027g();
                    c6027g.m13471b(str6);
                    b = c6027g.m13469b(MyApplication.m12952b());
                    j2 = 0;
                    if (b.moveToFirst()) {
                    }
                    b.close();
                    if (i8 != 0) {
                        c6027g = new C6027g();
                        c6027g.m13471b(str6);
                        b = c6027g.m13469b(MyApplication.m12952b());
                        if (b.moveToFirst()) {
                            j2 = b.m13464a();
                        }
                        b.close();
                        return j2;
                    }
                }
                return Long.parseLong(c6025e.m7349a(MyApplication.m12952b()).getLastPathSegment());
            }
        }
        throw new NullPointerException();
    }

    public static ArrayList<Long> m7460a() {
        ArrayList<Long> arrayList = new ArrayList();
        C6027g c6027g = new C6027g();
        c6027g.m13468a(C2987i.TRANSMITTING, C2987i.ERROR);
        C6026f b = c6027g.m13469b(MyApplication.m12952b());
        if (!b.moveToFirst()) {
            return arrayList;
        }
        do {
            arrayList.add(Long.valueOf(b.m13464a()));
        } while (b.moveToNext());
        b.close();
        return arrayList;
    }

    public static C2983b m7461a(long j) {
        C2983b c2983b;
        C6027g c6027g = new C6027g();
        long[] jArr = new long[1];
        int i = 0;
        jArr[0] = j;
        c6027g.m13470b(jArr);
        C6026f b = c6027g.m13469b(MyApplication.m12952b());
        C2986h c2986h = null;
        if (b.moveToFirst()) {
            Uri parse = b.m7352a("files_thumbnail_uri") != null ? Uri.parse(b.m7352a("files_thumbnail_uri")) : null;
            long a = b.m13464a();
            String a2 = b.m7352a("files_file_url");
            Uri parse2 = Uri.parse(b.m7352a("files_file_uri"));
            String a3 = b.m7352a("files_name");
            if (a3 == null) {
                throw new NullPointerException("The value of 'name' in the database was null, which is not allowed according to the model definition");
            }
            long b2 = b.m13465b();
            Integer b3 = b.m7353b("files_type");
            if (b3 == null) {
                throw new NullPointerException("The value of 'type' in the database was null, which is not allowed according to the model definition");
            }
            C2988j c2988j = C2988j.values()[b3.intValue()];
            b3 = b.m7353b("files_progress");
            if (b3 == null) {
                throw new NullPointerException("The value of 'progress' in the database was null, which is not allowed according to the model definition");
            }
            int intValue = b3.intValue();
            String a4 = b.m7352a("files_thumbnail_url");
            b3 = b.m7353b("files_download_state");
            if (b3 == null) {
                throw new NullPointerException("The value of 'download_state' in the database was null, which is not allowed according to the model definition");
            }
            C2987i c2987i = C2987i.values()[b3.intValue()];
            b3 = b.m7353b("files_duration");
            if (b3 == null) {
                b3 = Integer.valueOf(0);
            }
            int intValue2 = b3.intValue();
            b3 = b.m7353b("files_audio_state");
            if (b3 != null) {
                c2986h = C2986h.values()[b3.intValue()];
            }
            C2986h c2986h2 = c2986h;
            Integer b4 = b.m7353b("files_audio_playing_time");
            if (b4 == null) {
                throw new NullPointerException("The value of 'audio_playing_time' in the database was null, which is not allowed according to the model definition");
            }
            int intValue3 = b4.intValue();
            b4 = b.m7353b("files_thumbnail_download_state");
            if (b4 == null) {
                throw new NullPointerException("The value of 'THUMBNAIL_download_state' in the database was null, which is not allowed according to the model definition");
            }
            C2987i c2987i2 = C2987i.values()[b4.intValue()];
            String a5 = b.m7352a("files_server_file_id");
            b4 = b.m7353b("files_image_width");
            int intValue4 = b4 == null ? 0 : b4.intValue();
            b4 = b.m7353b("files_image_height");
            if (b4 != null) {
                i = b4.intValue();
            }
            C2983b c2983b2 = new C2983b(a, a2, parse2, a3, b2, c2988j, intValue, a4, parse, c2987i, intValue2, c2986h2, intValue3, c2987i2, a5, intValue4, i, b.m7353b("files_download_task_id"));
        } else {
            c2983b = null;
        }
        b.close();
        return c2983b;
    }

    public static int m7462b(long j, int i) {
        C6025e c6025e = new C6025e();
        c6025e.m13454b(i);
        C6027g c6027g = new C6027g();
        c6027g.m13470b(j);
        return c6025e.m13445a(MyApplication.m12952b(), c6027g);
    }

    public static int m7463b(long j, Uri uri) {
        if (uri != null) {
            if (!uri.getPath().isEmpty()) {
                C6025e c6025e = new C6025e();
                c6025e.m13462e(uri.toString());
                C6027g c6027g = new C6027g();
                c6027g.m13470b(j);
                return c6025e.m13445a(MyApplication.m12952b(), c6027g);
            }
        }
        throw new NullPointerException();
    }

    public static int m7464b(long j, C2987i c2987i) {
        C6025e c6025e = new C6025e();
        c6025e.m13457b(c2987i);
        C6027g c6027g = new C6027g();
        c6027g.m13470b(j);
        return c6025e.m13445a(MyApplication.m12952b(), c6027g);
    }

    public static int m7465b(C2986h c2986h) {
        C6025e c6025e = new C6025e();
        c6025e.m13454b(0);
        C6027g c6027g = new C6027g();
        c6027g.m13467a(c2986h);
        return c6025e.m13445a(MyApplication.m12952b(), c6027g);
    }

    public static int m7466c(long j, Uri uri) {
        if (uri != null) {
            if (!uri.getPath().isEmpty()) {
                C6025e c6025e = new C6025e();
                c6025e.m13450a(uri.toString());
                C6027g c6027g = new C6027g();
                c6027g.m13470b(j);
                return c6025e.m13445a(MyApplication.m12952b(), c6027g);
            }
        }
        throw new NullPointerException();
    }
}
