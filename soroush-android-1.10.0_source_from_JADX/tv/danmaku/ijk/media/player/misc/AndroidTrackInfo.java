package tv.danmaku.ijk.media.player.misc;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.media.MediaPlayer.TrackInfo;
import android.os.Build.VERSION;

public class AndroidTrackInfo implements ITrackInfo {
    private final TrackInfo mTrackInfo;

    private AndroidTrackInfo(TrackInfo trackInfo) {
        this.mTrackInfo = trackInfo;
    }

    public static AndroidTrackInfo[] fromMediaPlayer(MediaPlayer mediaPlayer) {
        return VERSION.SDK_INT >= 16 ? fromTrackInfo(mediaPlayer.getTrackInfo()) : null;
    }

    private static AndroidTrackInfo[] fromTrackInfo(TrackInfo[] trackInfoArr) {
        if (trackInfoArr == null) {
            return null;
        }
        AndroidTrackInfo[] androidTrackInfoArr = new AndroidTrackInfo[trackInfoArr.length];
        for (int i = 0; i < trackInfoArr.length; i++) {
            androidTrackInfoArr[i] = new AndroidTrackInfo(trackInfoArr[i]);
        }
        return androidTrackInfoArr;
    }

    @TargetApi(19)
    public IMediaFormat getFormat() {
        if (this.mTrackInfo == null || VERSION.SDK_INT < 19) {
            return null;
        }
        MediaFormat format = this.mTrackInfo.getFormat();
        return format == null ? null : new AndroidMediaFormat(format);
    }

    @TargetApi(16)
    public String getInfoInline() {
        return this.mTrackInfo != null ? this.mTrackInfo.toString() : "null";
    }

    @TargetApi(16)
    public String getLanguage() {
        return this.mTrackInfo == null ? "und" : this.mTrackInfo.getLanguage();
    }

    @TargetApi(16)
    public int getTrackType() {
        return this.mTrackInfo == null ? 0 : this.mTrackInfo.getTrackType();
    }

    @TargetApi(16)
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append('{');
        stringBuilder.append(this.mTrackInfo != null ? this.mTrackInfo.toString() : "null");
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
