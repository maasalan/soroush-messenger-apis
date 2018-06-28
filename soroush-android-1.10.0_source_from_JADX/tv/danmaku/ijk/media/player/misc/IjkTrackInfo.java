package tv.danmaku.ijk.media.player.misc;

import android.text.TextUtils;
import tv.danmaku.ijk.media.player.IjkMediaMeta.IjkStreamMeta;

public class IjkTrackInfo implements ITrackInfo {
    private IjkStreamMeta mStreamMeta;
    private int mTrackType = 0;

    public IjkTrackInfo(IjkStreamMeta ijkStreamMeta) {
        this.mStreamMeta = ijkStreamMeta;
    }

    public IMediaFormat getFormat() {
        return new IjkMediaFormat(this.mStreamMeta);
    }

    public String getInfoInline() {
        String resolutionInline;
        StringBuilder stringBuilder = new StringBuilder(128);
        switch (this.mTrackType) {
            case 1:
                stringBuilder.append("VIDEO");
                stringBuilder.append(", ");
                stringBuilder.append(this.mStreamMeta.getCodecShortNameInline());
                stringBuilder.append(", ");
                stringBuilder.append(this.mStreamMeta.getBitrateInline());
                stringBuilder.append(", ");
                resolutionInline = this.mStreamMeta.getResolutionInline();
                break;
            case 2:
                stringBuilder.append("AUDIO");
                stringBuilder.append(", ");
                stringBuilder.append(this.mStreamMeta.getCodecShortNameInline());
                stringBuilder.append(", ");
                stringBuilder.append(this.mStreamMeta.getBitrateInline());
                stringBuilder.append(", ");
                resolutionInline = this.mStreamMeta.getSampleRateInline();
                break;
            case 3:
                stringBuilder.append("TIMEDTEXT");
                stringBuilder.append(", ");
                resolutionInline = this.mStreamMeta.mLanguage;
                break;
            case 4:
                resolutionInline = "SUBTITLE";
                break;
            default:
                resolutionInline = "UNKNOWN";
                break;
        }
        stringBuilder.append(resolutionInline);
        return stringBuilder.toString();
    }

    public String getLanguage() {
        if (this.mStreamMeta != null) {
            if (!TextUtils.isEmpty(this.mStreamMeta.mLanguage)) {
                return this.mStreamMeta.mLanguage;
            }
        }
        return "und";
    }

    public int getTrackType() {
        return this.mTrackType;
    }

    public void setMediaMeta(IjkStreamMeta ijkStreamMeta) {
        this.mStreamMeta = ijkStreamMeta;
    }

    public void setTrackType(int i) {
        this.mTrackType = i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append('{');
        stringBuilder.append(getInfoInline());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
