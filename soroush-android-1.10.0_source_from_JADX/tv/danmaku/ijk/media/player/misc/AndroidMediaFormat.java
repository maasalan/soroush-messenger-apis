package tv.danmaku.ijk.media.player.misc;

import android.annotation.TargetApi;
import android.media.MediaFormat;

public class AndroidMediaFormat implements IMediaFormat {
    private final MediaFormat mMediaFormat;

    public AndroidMediaFormat(MediaFormat mediaFormat) {
        this.mMediaFormat = mediaFormat;
    }

    @TargetApi(16)
    public int getInteger(String str) {
        return this.mMediaFormat == null ? 0 : this.mMediaFormat.getInteger(str);
    }

    @TargetApi(16)
    public String getString(String str) {
        return this.mMediaFormat == null ? null : this.mMediaFormat.getString(str);
    }

    @TargetApi(16)
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append(getClass().getName());
        stringBuilder.append('{');
        stringBuilder.append(this.mMediaFormat != null ? this.mMediaFormat.toString() : "null");
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
