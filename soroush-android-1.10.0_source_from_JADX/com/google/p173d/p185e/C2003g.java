package com.google.p173d.p185e;

import java.util.ArrayList;
import java.util.List;
import org.jivesoftware.smack.tcp.XMPPTCPConnection.PacketWriter;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

final class C2003g {
    final List<int[]> f6711a = new ArrayList();
    final List<String> f6712b = new ArrayList();

    C2003g() {
    }

    private void m5480a(int[] iArr, String str) {
        this.f6711a.add(iArr);
        this.f6712b.add(str);
    }

    final synchronized void m5481a() {
        if (this.f6711a.isEmpty()) {
            m5480a(new int[]{0, 19}, "US/CA");
            m5480a(new int[]{30, 39}, "US");
            m5480a(new int[]{60, 139}, "US/CA");
            m5480a(new int[]{IjkMediaCodecInfo.RANK_SECURE, 379}, "FR");
            m5480a(new int[]{380}, "BG");
            m5480a(new int[]{383}, "SI");
            m5480a(new int[]{385}, "HR");
            m5480a(new int[]{387}, "BA");
            m5480a(new int[]{400, 440}, "DE");
            m5480a(new int[]{450, 459}, "JP");
            m5480a(new int[]{460, 469}, "RU");
            m5480a(new int[]{471}, "TW");
            m5480a(new int[]{474}, "EE");
            m5480a(new int[]{475}, "LV");
            m5480a(new int[]{476}, "AZ");
            m5480a(new int[]{477}, "LT");
            m5480a(new int[]{478}, "UZ");
            m5480a(new int[]{479}, "LK");
            m5480a(new int[]{480}, "PH");
            m5480a(new int[]{481}, "BY");
            m5480a(new int[]{482}, "UA");
            m5480a(new int[]{484}, "MD");
            m5480a(new int[]{485}, "AM");
            m5480a(new int[]{486}, "GE");
            m5480a(new int[]{487}, "KZ");
            m5480a(new int[]{489}, "HK");
            m5480a(new int[]{490, 499}, "JP");
            m5480a(new int[]{PacketWriter.QUEUE_SIZE, 509}, "GB");
            m5480a(new int[]{520}, "GR");
            m5480a(new int[]{528}, "LB");
            m5480a(new int[]{529}, "CY");
            m5480a(new int[]{531}, "MK");
            m5480a(new int[]{535}, "MT");
            m5480a(new int[]{539}, "IE");
            m5480a(new int[]{540, 549}, "BE/LU");
            m5480a(new int[]{560}, "PT");
            m5480a(new int[]{569}, "IS");
            m5480a(new int[]{570, 579}, "DK");
            m5480a(new int[]{590}, "PL");
            m5480a(new int[]{594}, "RO");
            m5480a(new int[]{599}, "HU");
            m5480a(new int[]{IjkMediaCodecInfo.RANK_LAST_CHANCE, 601}, "ZA");
            m5480a(new int[]{603}, "GH");
            m5480a(new int[]{608}, "BH");
            m5480a(new int[]{609}, "MU");
            m5480a(new int[]{611}, "MA");
            m5480a(new int[]{613}, "DZ");
            m5480a(new int[]{616}, "KE");
            m5480a(new int[]{618}, "CI");
            m5480a(new int[]{619}, "TN");
            m5480a(new int[]{621}, "SY");
            m5480a(new int[]{622}, "EG");
            m5480a(new int[]{624}, "LY");
            m5480a(new int[]{625}, "JO");
            m5480a(new int[]{626}, "IR");
            m5480a(new int[]{627}, "KW");
            m5480a(new int[]{628}, "SA");
            m5480a(new int[]{629}, "AE");
            m5480a(new int[]{640, 649}, "FI");
            m5480a(new int[]{690, 695}, "CN");
            m5480a(new int[]{700, 709}, "NO");
            m5480a(new int[]{729}, "IL");
            m5480a(new int[]{730, 739}, "SE");
            m5480a(new int[]{740}, "GT");
            m5480a(new int[]{741}, "SV");
            m5480a(new int[]{742}, "HN");
            m5480a(new int[]{743}, "NI");
            m5480a(new int[]{744}, "CR");
            m5480a(new int[]{745}, "PA");
            m5480a(new int[]{746}, "DO");
            m5480a(new int[]{750}, "MX");
            m5480a(new int[]{754, 755}, "CA");
            m5480a(new int[]{759}, "VE");
            m5480a(new int[]{760, 769}, "CH");
            m5480a(new int[]{770}, "CO");
            m5480a(new int[]{773}, "UY");
            m5480a(new int[]{775}, "PE");
            m5480a(new int[]{777}, "BO");
            m5480a(new int[]{779}, "AR");
            m5480a(new int[]{780}, "CL");
            m5480a(new int[]{784}, "PY");
            m5480a(new int[]{785}, "PE");
            m5480a(new int[]{786}, "EC");
            m5480a(new int[]{789, 790}, "BR");
            m5480a(new int[]{800, 839}, "IT");
            m5480a(new int[]{840, 849}, "ES");
            m5480a(new int[]{850}, "CU");
            m5480a(new int[]{858}, "SK");
            m5480a(new int[]{859}, "CZ");
            m5480a(new int[]{860}, "YU");
            m5480a(new int[]{865}, "MN");
            m5480a(new int[]{867}, "KP");
            m5480a(new int[]{868, 869}, "TR");
            m5480a(new int[]{870, 879}, "NL");
            m5480a(new int[]{880}, "KR");
            m5480a(new int[]{885}, "TH");
            m5480a(new int[]{888}, "SG");
            m5480a(new int[]{890}, "IN");
            m5480a(new int[]{893}, "VN");
            m5480a(new int[]{896}, "PK");
            m5480a(new int[]{899}, "ID");
            m5480a(new int[]{IMediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR, 919}, "AT");
            m5480a(new int[]{930, 939}, "AU");
            m5480a(new int[]{940, 949}, "AZ");
            m5480a(new int[]{955}, "MY");
            m5480a(new int[]{958}, "MO");
        }
    }
}
