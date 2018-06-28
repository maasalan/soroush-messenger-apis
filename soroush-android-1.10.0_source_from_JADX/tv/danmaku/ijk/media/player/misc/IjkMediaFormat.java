package tv.danmaku.ijk.media.player.misc;

import android.annotation.TargetApi;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.msgpack.util.TemplatePrecompiler;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import tv.danmaku.ijk.media.player.IjkMediaMeta.IjkStreamMeta;

public class IjkMediaFormat implements IMediaFormat {
    public static final String CODEC_NAME_H264 = "h264";
    public static final String KEY_IJK_BIT_RATE_UI = "ijk-bit-rate-ui";
    public static final String KEY_IJK_CHANNEL_UI = "ijk-channel-ui";
    public static final String KEY_IJK_CODEC_LONG_NAME_UI = "ijk-codec-long-name-ui";
    public static final String KEY_IJK_CODEC_NAME_UI = "ijk-codec-name-ui";
    public static final String KEY_IJK_CODEC_PIXEL_FORMAT_UI = "ijk-pixel-format-ui";
    public static final String KEY_IJK_CODEC_PROFILE_LEVEL_UI = "ijk-profile-level-ui";
    public static final String KEY_IJK_FRAME_RATE_UI = "ijk-frame-rate-ui";
    public static final String KEY_IJK_RESOLUTION_UI = "ijk-resolution-ui";
    public static final String KEY_IJK_SAMPLE_RATE_UI = "ijk-sample-rate-ui";
    private static final Map<String, Formatter> sFormatterMap = new HashMap();
    public final IjkStreamMeta mMediaFormat;

    private static abstract class Formatter {
        private Formatter() {
        }

        protected abstract String doFormat(IjkMediaFormat ijkMediaFormat);

        public String format(IjkMediaFormat ijkMediaFormat) {
            Object doFormat = doFormat(ijkMediaFormat);
            return TextUtils.isEmpty(doFormat) ? getDefaultString() : doFormat;
        }

        protected String getDefaultString() {
            return "N/A";
        }
    }

    class C79861 extends Formatter {
        C79861() {
            super();
        }

        public String doFormat(IjkMediaFormat ijkMediaFormat) {
            return IjkMediaFormat.this.mMediaFormat.getString(IjkMediaMeta.IJKM_KEY_CODEC_LONG_NAME);
        }
    }

    class C79872 extends Formatter {
        C79872() {
            super();
        }

        public String doFormat(IjkMediaFormat ijkMediaFormat) {
            return IjkMediaFormat.this.mMediaFormat.getString(IjkMediaMeta.IJKM_KEY_CODEC_NAME);
        }
    }

    class C79883 extends Formatter {
        C79883() {
            super();
        }

        protected String doFormat(IjkMediaFormat ijkMediaFormat) {
            int integer = ijkMediaFormat.getInteger(IjkMediaMeta.IJKM_KEY_BITRATE);
            if (integer <= 0) {
                return null;
            }
            if (integer < IjkMediaCodecInfo.RANK_MAX) {
                return String.format(Locale.US, "%d bit/s", new Object[]{Integer.valueOf(integer)});
            }
            return String.format(Locale.US, "%d kb/s", new Object[]{Integer.valueOf(integer / IjkMediaCodecInfo.RANK_MAX)});
        }
    }

    class C79894 extends Formatter {
        C79894() {
            super();
        }

        protected String doFormat(IjkMediaFormat ijkMediaFormat) {
            String str;
            switch (ijkMediaFormat.getInteger(IjkMediaMeta.IJKM_KEY_CODEC_PROFILE_ID)) {
                case 44:
                    str = "CAVLC 4:4:4";
                    break;
                case 66:
                    str = "Baseline";
                    break;
                case 77:
                    str = "Main";
                    break;
                case 88:
                    str = "Extended";
                    break;
                case 100:
                    str = "High";
                    break;
                case 110:
                    str = "High 10";
                    break;
                case IjkMediaMeta.FF_PROFILE_H264_HIGH_422 /*122*/:
                    str = "High 4:2:2";
                    break;
                case IjkMediaMeta.FF_PROFILE_H264_HIGH_444 /*144*/:
                    str = "High 4:4:4";
                    break;
                case IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE /*244*/:
                    str = "High 4:4:4 Predictive";
                    break;
                case IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED_BASELINE /*578*/:
                    str = "Constrained Baseline";
                    break;
                case IjkMediaMeta.FF_PROFILE_H264_HIGH_10_INTRA /*2158*/:
                    str = "High 10 Intra";
                    break;
                case IjkMediaMeta.FF_PROFILE_H264_HIGH_422_INTRA /*2170*/:
                    str = "High 4:2:2 Intra";
                    break;
                case IjkMediaMeta.FF_PROFILE_H264_HIGH_444_INTRA /*2292*/:
                    str = "High 4:4:4 Intra";
                    break;
                default:
                    return null;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            Object string = ijkMediaFormat.getString(IjkMediaMeta.IJKM_KEY_CODEC_NAME);
            if (!TextUtils.isEmpty(string) && string.equalsIgnoreCase(IjkMediaFormat.CODEC_NAME_H264)) {
                int integer = ijkMediaFormat.getInteger(IjkMediaMeta.IJKM_KEY_CODEC_LEVEL);
                if (integer < 10) {
                    return stringBuilder.toString();
                }
                stringBuilder.append(" Profile Level ");
                stringBuilder.append((integer / 10) % 10);
                integer %= 10;
                if (integer != 0) {
                    stringBuilder.append(TemplatePrecompiler.DEFAULT_DEST);
                    stringBuilder.append(integer);
                }
            }
            return stringBuilder.toString();
        }
    }

    class C79905 extends Formatter {
        C79905() {
            super();
        }

        protected String doFormat(IjkMediaFormat ijkMediaFormat) {
            return ijkMediaFormat.getString(IjkMediaMeta.IJKM_KEY_CODEC_PIXEL_FORMAT);
        }
    }

    class C79916 extends Formatter {
        C79916() {
            super();
        }

        protected String doFormat(IjkMediaFormat ijkMediaFormat) {
            int integer = ijkMediaFormat.getInteger("width");
            int integer2 = ijkMediaFormat.getInteger("height");
            int integer3 = ijkMediaFormat.getInteger(IjkMediaMeta.IJKM_KEY_SAR_NUM);
            int integer4 = ijkMediaFormat.getInteger(IjkMediaMeta.IJKM_KEY_SAR_DEN);
            if (integer > 0) {
                if (integer2 > 0) {
                    if (integer3 > 0) {
                        if (integer4 > 0) {
                            return String.format(Locale.US, "%d x %d [SAR %d:%d]", new Object[]{Integer.valueOf(integer), Integer.valueOf(integer2), Integer.valueOf(integer3), Integer.valueOf(integer4)});
                        }
                    }
                    return String.format(Locale.US, "%d x %d", new Object[]{Integer.valueOf(integer), Integer.valueOf(integer2)});
                }
            }
            return null;
        }
    }

    class C79927 extends Formatter {
        C79927() {
            super();
        }

        protected String doFormat(IjkMediaFormat ijkMediaFormat) {
            int integer = ijkMediaFormat.getInteger(IjkMediaMeta.IJKM_KEY_FPS_NUM);
            int integer2 = ijkMediaFormat.getInteger(IjkMediaMeta.IJKM_KEY_FPS_DEN);
            if (integer > 0) {
                if (integer2 > 0) {
                    return String.valueOf(((float) integer) / ((float) integer2));
                }
            }
            return null;
        }
    }

    class C79938 extends Formatter {
        C79938() {
            super();
        }

        protected String doFormat(IjkMediaFormat ijkMediaFormat) {
            if (ijkMediaFormat.getInteger(IjkMediaMeta.IJKM_KEY_SAMPLE_RATE) <= 0) {
                return null;
            }
            return String.format(Locale.US, "%d Hz", new Object[]{Integer.valueOf(ijkMediaFormat.getInteger(IjkMediaMeta.IJKM_KEY_SAMPLE_RATE))});
        }
    }

    class C79949 extends Formatter {
        C79949() {
            super();
        }

        protected String doFormat(IjkMediaFormat ijkMediaFormat) {
            int integer = ijkMediaFormat.getInteger(IjkMediaMeta.IJKM_KEY_CHANNEL_LAYOUT);
            if (integer <= 0) {
                return null;
            }
            long j = (long) integer;
            if (j == 4) {
                return "mono";
            }
            if (j == 3) {
                return "stereo";
            }
            return String.format(Locale.US, "%x", new Object[]{Integer.valueOf(integer)});
        }
    }

    public IjkMediaFormat(IjkStreamMeta ijkStreamMeta) {
        sFormatterMap.put(KEY_IJK_CODEC_LONG_NAME_UI, new C79861());
        sFormatterMap.put(KEY_IJK_CODEC_NAME_UI, new C79872());
        sFormatterMap.put(KEY_IJK_BIT_RATE_UI, new C79883());
        sFormatterMap.put(KEY_IJK_CODEC_PROFILE_LEVEL_UI, new C79894());
        sFormatterMap.put(KEY_IJK_CODEC_PIXEL_FORMAT_UI, new C79905());
        sFormatterMap.put(KEY_IJK_RESOLUTION_UI, new C79916());
        sFormatterMap.put(KEY_IJK_FRAME_RATE_UI, new C79927());
        sFormatterMap.put(KEY_IJK_SAMPLE_RATE_UI, new C79938());
        sFormatterMap.put(KEY_IJK_CHANNEL_UI, new C79949());
        this.mMediaFormat = ijkStreamMeta;
    }

    @TargetApi(16)
    public int getInteger(String str) {
        return this.mMediaFormat == null ? 0 : this.mMediaFormat.getInt(str);
    }

    public String getString(String str) {
        return this.mMediaFormat == null ? null : sFormatterMap.containsKey(str) ? ((Formatter) sFormatterMap.get(str)).format(this) : this.mMediaFormat.getString(str);
    }
}
