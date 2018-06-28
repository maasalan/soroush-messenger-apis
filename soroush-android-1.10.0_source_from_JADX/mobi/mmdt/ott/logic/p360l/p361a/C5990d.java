package mobi.mmdt.ott.logic.p360l.p361a;

import java.io.IOException;
import java.util.HashMap;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.p258a.C2558a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.p258a.C2559b;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5949z;
import mobi.mmdt.ott.logic.p371s.C2898a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2971k;
import p000a.p001a.p002a.C0005c;

public final class C5990d extends C2839a implements C2841c {
    private static C5990d f16135a;

    private C5990d() {
    }

    private static HashMap m13200a(HashMap hashMap, String str, String str2, String str3) {
        if (str != null) {
            hashMap.put("FORWARD_USER_ID", str);
        }
        if (str2 != null) {
            hashMap.put("FORWARD_GROUP_TYPE", str2);
        }
        if (str3 != null) {
            hashMap.put("FORWARD_MESSAGE_ID", str3);
        }
        return hashMap;
    }

    public static C5990d m13201a() {
        if (f16135a == null) {
            f16135a = new C5990d();
        }
        return f16135a;
    }

    public final void mo2189a(String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, String str8) {
        Throwable e;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("MAJOR_TYPE", "CHANNEL_CHAT");
            hashMap.put("MINOR_TYPE", "TEXT");
            hashMap.put("SEND_TIME_IN_GMT", Long.valueOf(j));
            if (str4 != null) {
                hashMap.put("REPLY_ON_MESSAGE_ID", str4);
                hashMap.put("REPLY_ON_THREAD_ID", str);
            }
            C2898a.m7273a(str, str3, str2, C5990d.m13200a(hashMap, str6, str7, str8));
            C2966b.m7396a(new String[]{str3}, C2971k.SEEN);
        } catch (C2559b e2) {
            e = e2;
            if (e.f8367a.equals(C2558a.DAILY_SEND_MESSAGE_COUNT_LIMIT)) {
                C0005c.m0a().m9d(new C5949z(e));
                str2 = "Daily Channel Limit reached";
                C2480b.m6737b(str2, e);
            }
            str2 = "Send admin channel chat text error";
            C2480b.m6737b(str2, e);
        } catch (IOException e3) {
            e = e3;
            str2 = "Send admin channel chat text error";
            C2480b.m6737b(str2, e);
        }
    }

    public final void mo2190a(String str, String str2, String str3, String str4, Long l, String str5, Integer num, String str6, long j, String str7, String str8, String str9, String str10) {
        Throwable th;
        String str11 = str;
        String str12 = str2;
        String str13 = str6;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("MAJOR_TYPE", "CHANNEL_CHAT");
            hashMap.put("MINOR_TYPE", "FILE");
            hashMap.put("FILE_NAME", str5);
            hashMap.put("FILE_SIZE", l);
            hashMap.put("FILE_ID", str3);
            hashMap.put("FILE_URL", str4);
            hashMap.put("FILE_TYPE", "FILE_TYPE_PUSH_TO_TALK");
            hashMap.put("FILE_TYPE_PUSH_TO_TALK_DURATION", num);
            hashMap.put("SEND_TIME_IN_GMT", Long.valueOf(j));
            if (str13 != null) {
                hashMap.put("REPLY_ON_MESSAGE_ID", str13);
                hashMap.put("REPLY_ON_THREAD_ID", str11);
            }
            C2898a.m7273a(str11, str12, " ", C5990d.m13200a(hashMap, str8, str9, str10));
            C2966b.m7396a(new String[]{str12}, C2971k.SEEN);
        } catch (Throwable e) {
            th = e;
            if (th.f8367a.equals(C2558a.DAILY_SEND_MESSAGE_COUNT_LIMIT)) {
                C0005c.m0a().m9d(new C5949z(th));
                str12 = "Daily Channel Limit reached";
                C2480b.m6737b(str12, th);
            }
            str12 = "Send admin channel Push to talk error";
            C2480b.m6737b(str12, th);
        } catch (Throwable e2) {
            th = e2;
            str12 = "Send admin channel Push to talk error";
            C2480b.m6737b(str12, th);
        }
    }

    public final void mo2191a(String str, String str2, String str3, String str4, String str5, long j, String str6, String str7, String str8, String str9) {
        Throwable e;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("MAJOR_TYPE", "CHANNEL_CHAT");
            hashMap.put("MINOR_TYPE", "LOCATION");
            hashMap.put("SEND_TIME_IN_GMT", Long.valueOf(j));
            hashMap.put("LOCATION_LONGITUDE", str3);
            hashMap.put("LOCATION_LATITUDE", str2);
            if (str5 != null) {
                hashMap.put("REPLY_ON_MESSAGE_ID", str5);
                hashMap.put("REPLY_ON_THREAD_ID", str);
            }
            C2898a.m7273a(str, str4, " ", C5990d.m13200a(hashMap, str7, str8, str9));
            C2966b.m7396a(new String[]{str4}, C2971k.SEEN);
        } catch (C2559b e2) {
            e = e2;
            if (e.f8367a.equals(C2558a.DAILY_SEND_MESSAGE_COUNT_LIMIT)) {
                str2 = "Daily Channel Limit reached";
                C2480b.m6737b(str2, e);
            }
            str2 = "Send admin channel send Location error";
            C2480b.m6737b(str2, e);
        } catch (IOException e3) {
            e = e3;
            str2 = "Send admin channel send Location error";
            C2480b.m6737b(str2, e);
        }
    }

    public final void mo2192a(String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7, long j, String str8, String str9, String str10, String str11) {
        Throwable th;
        String str12 = str;
        String str13 = str2;
        String str14 = str7;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("MAJOR_TYPE", "CHANNEL_CHAT");
            hashMap.put("MINOR_TYPE", "FILE");
            hashMap.put("FILE_NAME", str6);
            hashMap.put("FILE_SIZE", l);
            hashMap.put("FILE_ID", str4);
            hashMap.put("FILE_URL", str5);
            hashMap.put("FILE_TYPE", "FILE_TYPE_OTHER");
            hashMap.put("SEND_TIME_IN_GMT", Long.valueOf(j));
            if (str14 != null) {
                hashMap.put("REPLY_ON_MESSAGE_ID", str14);
                hashMap.put("REPLY_ON_THREAD_ID", str12);
            }
            C2898a.m7273a(str12, str13, str3.isEmpty() ? " " : str3, C5990d.m13200a(hashMap, str9, str10, str11));
            C2966b.m7396a(new String[]{str13}, C2971k.SEEN);
        } catch (Throwable e) {
            th = e;
            if (th.f8367a.equals(C2558a.DAILY_SEND_MESSAGE_COUNT_LIMIT)) {
                str13 = "Daily Channel Limit reached";
                C2480b.m6737b(str13, th);
            }
            str13 = "Send admin channel send other files error";
            C2480b.m6737b(str13, th);
        } catch (Throwable e2) {
            th = e2;
            str13 = "Send admin channel send other files error";
            C2480b.m6737b(str13, th);
        }
    }

    public final void mo2193a(String str, String str2, String str3, String str4, String str5, String str6, long j, String str7, String str8, String str9, String str10) {
        Throwable e;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("MAJOR_TYPE", "CHANNEL_CHAT");
            hashMap.put("MINOR_TYPE", "STICKER");
            hashMap.put("STICKER_VERSION", str3);
            hashMap.put("STICKER_PACKAGE_ID", str4);
            hashMap.put("STICKER_ID", str5);
            hashMap.put("SEND_TIME_IN_GMT", Long.valueOf(j));
            if (str6 != null) {
                hashMap.put("REPLY_ON_MESSAGE_ID", str6);
                hashMap.put("REPLY_ON_THREAD_ID", str);
            }
            C2898a.m7273a(str, str2, " ", C5990d.m13200a(hashMap, str8, str9, str10));
            C2966b.m7396a(new String[]{str2}, C2971k.SEEN);
        } catch (C2559b e2) {
            e = e2;
            if (e.f8367a.equals(C2558a.DAILY_SEND_MESSAGE_COUNT_LIMIT)) {
                str2 = "Daily Channel Limit reached";
                C2480b.m6737b(str2, e);
            }
            str2 = "Send admin channel Sticker error";
            C2480b.m6737b(str2, e);
        } catch (IOException e3) {
            e = e3;
            str2 = "Send admin channel Sticker error";
            C2480b.m6737b(str2, e);
        }
    }

    public final void mo2194a(String str, String str2, String str3, String str4, String str5, String str6, Long l, String str7, Integer num, String str8, long j, String str9, int i, int i2, String str10, String str11, String str12) {
        Throwable th;
        String str13 = str;
        String str14 = str2;
        String str15 = str8;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("MAJOR_TYPE", "CHANNEL_CHAT");
            hashMap.put("MINOR_TYPE", "FILE");
            hashMap.put("FILE_NAME", str7);
            hashMap.put("FILE_SIZE", l);
            hashMap.put("FILE_ID", str4);
            hashMap.put("FILE_URL", str5);
            hashMap.put("FILE_TYPE", "FILE_TYPE_VIDEO");
            hashMap.put("FILE_THUMBNAIL_URL", str6);
            hashMap.put("FILE_TYPE_VIDEO_DURATION", String.valueOf(num));
            hashMap.put("SEND_TIME_IN_GMT", Long.valueOf(j));
            hashMap.put("FILE_IMAGE_WIDTH", Integer.valueOf(i));
            hashMap.put("FILE_IMAGE_HEIGHT", Integer.valueOf(i2));
            if (str15 != null) {
                hashMap.put("REPLY_ON_MESSAGE_ID", str15);
                hashMap.put("REPLY_ON_THREAD_ID", str13);
            }
            C2898a.m7273a(str13, str14, str3, C5990d.m13200a(hashMap, str10, str11, str12));
            C2966b.m7396a(new String[]{str14}, C2971k.SEEN);
        } catch (Throwable e) {
            th = e;
            if (th.f8367a.equals(C2558a.DAILY_SEND_MESSAGE_COUNT_LIMIT)) {
                str14 = "Daily Channel Limit reached";
                C2480b.m6737b(str14, th);
            }
            str14 = "Send admin channel send video error";
            C2480b.m6737b(str14, th);
        } catch (Throwable e2) {
            th = e2;
            str14 = "Send admin channel send video error";
            C2480b.m6737b(str14, th);
        }
    }

    public final void mo2195a(String str, String str2, String str3, String str4, String str5, String str6, Long l, String str7, String str8, long j, String str9, int i, int i2, String str10, String str11, String str12) {
        Throwable th;
        String str13 = str;
        String str14 = str2;
        String str15 = str8;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("MAJOR_TYPE", "CHANNEL_CHAT");
            hashMap.put("MINOR_TYPE", "FILE");
            hashMap.put("FILE_NAME", str7);
            hashMap.put("FILE_SIZE", l);
            hashMap.put("FILE_ID", str4);
            hashMap.put("FILE_URL", str5);
            hashMap.put("FILE_TYPE", "FILE_TYPE_IMAGE");
            hashMap.put("FILE_THUMBNAIL_URL", str6);
            hashMap.put("SEND_TIME_IN_GMT", Long.valueOf(j));
            hashMap.put("FILE_IMAGE_WIDTH", Integer.valueOf(i));
            hashMap.put("FILE_IMAGE_HEIGHT", Integer.valueOf(i2));
            if (str15 != null) {
                hashMap.put("REPLY_ON_MESSAGE_ID", str15);
                hashMap.put("REPLY_ON_THREAD_ID", str13);
            }
            C2898a.m7273a(str13, str14, str3, C5990d.m13200a(hashMap, str10, str11, str12));
            C2966b.m7396a(new String[]{str14}, C2971k.SEEN);
        } catch (Throwable e) {
            th = e;
            if (th.f8367a.equals(C2558a.DAILY_SEND_MESSAGE_COUNT_LIMIT)) {
                C0005c.m0a().m9d(new C5949z(th));
                str14 = "Daily Channel Limit reached";
                C2480b.m6737b(str14, th);
            }
            str14 = "Send admin channel send image error";
            C2480b.m6737b(str14, th);
        } catch (Throwable e2) {
            th = e2;
            str14 = "Send admin channel send image error";
            C2480b.m6737b(str14, th);
        }
    }

    public final void mo2196b(String str, String str2, String str3, String str4, String str5, long j, String str6, String str7, String str8, String str9) {
        Throwable e;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("MAJOR_TYPE", "CHANNEL_CHAT");
            hashMap.put("MINOR_TYPE", "POLL");
            hashMap.put("SEND_TIME_IN_GMT", Long.valueOf(j));
            hashMap.put("POLL_ID", str3);
            hashMap.put("POLL_DATA", str4);
            if (str5 != null) {
                hashMap.put("REPLY_ON_MESSAGE_ID", str5);
                hashMap.put("REPLY_ON_THREAD_ID", str);
            }
            C2898a.m7273a(str, str2, " ", C5990d.m13200a(hashMap, str7, str8, str9));
            C2966b.m7396a(new String[]{str2}, C2971k.SEEN);
        } catch (C2559b e2) {
            e = e2;
            if (e.f8367a.equals(C2558a.DAILY_SEND_MESSAGE_COUNT_LIMIT)) {
                str2 = "Daily Channel Limit reached";
                C2480b.m6737b(str2, e);
            }
            str2 = "Send admin channel send Poll error";
            C2480b.m6737b(str2, e);
        } catch (IOException e3) {
            e = e3;
            str2 = "Send admin channel send Poll error";
            C2480b.m6737b(str2, e);
        }
    }

    public final void mo2197b(String str, String str2, String str3, String str4, String str5, String str6, Long l, String str7, String str8, long j, String str9, int i, int i2, String str10, String str11, String str12) {
        Throwable th;
        String str13 = str;
        String str14 = str2;
        String str15 = str8;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("MAJOR_TYPE", "CHANNEL_CHAT");
            hashMap.put("MINOR_TYPE", "FILE");
            hashMap.put("FILE_NAME", str7);
            hashMap.put("FILE_SIZE", l);
            hashMap.put("FILE_ID", str4);
            hashMap.put("FILE_URL", str5);
            hashMap.put("FILE_TYPE", "FILE_TYPE_GIF");
            hashMap.put("FILE_THUMBNAIL_URL", str6);
            hashMap.put("SEND_TIME_IN_GMT", Long.valueOf(j));
            hashMap.put("FILE_IMAGE_WIDTH", Integer.valueOf(i));
            hashMap.put("FILE_IMAGE_HEIGHT", Integer.valueOf(i2));
            if (str15 != null) {
                hashMap.put("REPLY_ON_MESSAGE_ID", str15);
                hashMap.put("REPLY_ON_THREAD_ID", str13);
            }
            C2898a.m7273a(str13, str14, str3, C5990d.m13200a(hashMap, str10, str11, str12));
            C2966b.m7396a(new String[]{str14}, C2971k.SEEN);
        } catch (Throwable e) {
            th = e;
            if (th.f8367a.equals(C2558a.DAILY_SEND_MESSAGE_COUNT_LIMIT)) {
                str14 = "Daily Channel Limit reached";
                C2480b.m6737b(str14, th);
            }
            str14 = "Send admin channel send GIF error";
            C2480b.m6737b(str14, th);
        } catch (Throwable e2) {
            th = e2;
            str14 = "Send admin channel send GIF error";
            C2480b.m6737b(str14, th);
        }
    }
}
