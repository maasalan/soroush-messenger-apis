package com.google.p173d.p177b;

import com.google.p173d.C5615f;
import java.util.HashMap;
import java.util.Map;
import org.jivesoftware.smack.util.StringUtils;
import tv.danmaku.ijk.media.player.IMediaPlayer;

public enum C1968d {
    Cp437((String) new int[]{0, 2}, (int) new String[0]),
    ISO8859_1((String) new int[]{1, 3}, (int) new String[]{"ISO-8859-1"}),
    ISO8859_2((String) 4, (int) new String[]{"ISO-8859-2"}),
    ISO8859_3((String) 5, (int) new String[]{"ISO-8859-3"}),
    ISO8859_4((String) 6, (int) new String[]{"ISO-8859-4"}),
    ISO8859_5((String) 7, (int) new String[]{"ISO-8859-5"}),
    ISO8859_6((String) 8, (int) new String[]{"ISO-8859-6"}),
    ISO8859_7((String) 9, (int) new String[]{"ISO-8859-7"}),
    ISO8859_8((String) 10, (int) new String[]{"ISO-8859-8"}),
    ISO8859_9((String) 11, (int) new String[]{"ISO-8859-9"}),
    ISO8859_10((String) 12, (int) new String[]{"ISO-8859-10"}),
    ISO8859_11((String) 13, (int) new String[]{"ISO-8859-11"}),
    ISO8859_13((String) 15, (int) new String[]{"ISO-8859-13"}),
    ISO8859_14((String) 16, (int) new String[]{"ISO-8859-14"}),
    ISO8859_15((String) 17, (int) new String[]{"ISO-8859-15"}),
    ISO8859_16((String) 18, (int) new String[]{"ISO-8859-16"}),
    SJIS((String) 20, (int) new String[]{"Shift_JIS"}),
    Cp1250((String) 21, (int) new String[]{"windows-1250"}),
    Cp1251((String) 22, (int) new String[]{"windows-1251"}),
    Cp1252((String) 23, (int) new String[]{"windows-1252"}),
    Cp1256((String) 24, (int) new String[]{"windows-1256"}),
    UnicodeBigUnmarked((String) 25, (int) new String[]{"UTF-16BE", "UnicodeBig"}),
    UTF8((String) 26, (int) new String[]{StringUtils.UTF8}),
    ASCII((String) new int[]{27, 170}, (int) new String[]{StringUtils.USASCII}),
    GB18030((String) 29, (int) new String[]{"GB2312", "EUC_CN", "GBK"}),
    EUC_KR((String) 30, (int) new String[]{"EUC-KR"});
    
    private static final Map<Integer, C1968d> f6581B = null;
    private static final Map<String, C1968d> f6582C = null;
    private final int[] f6610D;
    private final String[] f6611E;

    static {
        f6581B = new HashMap();
        f6582C = new HashMap();
        for (C1968d c1968d : C1968d.values()) {
            for (int valueOf : c1968d.f6610D) {
                f6581B.put(Integer.valueOf(valueOf), c1968d);
            }
            f6582C.put(c1968d.name(), c1968d);
            for (Object put : c1968d.f6611E) {
                f6582C.put(put, c1968d);
            }
        }
    }

    private C1968d(int i) {
        this((String) i, 24, new int[]{28}, new String[0]);
    }

    private C1968d(int i, String... strArr) {
        this.f6610D = new int[]{i};
        this.f6611E = strArr;
    }

    private C1968d(int[] iArr, String... strArr) {
        this.f6610D = iArr;
        this.f6611E = strArr;
    }

    public static C1968d m5425a(int i) {
        if (i >= 0) {
            if (i < IMediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR) {
                return (C1968d) f6581B.get(Integer.valueOf(i));
            }
        }
        throw C5615f.m12347a();
    }
}
