package org.linphone.core;

import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class VideoSize {
    public static final int CIF = 1;
    public static final int HVGA = 2;
    public static final int QCIF = 0;
    public static final int QVGA = 3;
    public static final VideoSize VIDEO_SIZE_1020P = new VideoSize(1920, 1080);
    public static final VideoSize VIDEO_SIZE_720P = new VideoSize(1280, 720);
    public static final VideoSize VIDEO_SIZE_CIF = new VideoSize(352, 288);
    public static final VideoSize VIDEO_SIZE_HVGA = new VideoSize(320, 480);
    public static final VideoSize VIDEO_SIZE_QCIF = new VideoSize(176, IjkMediaMeta.FF_PROFILE_H264_HIGH_444);
    public static final VideoSize VIDEO_SIZE_QVGA = new VideoSize(320, 240);
    public static final VideoSize VIDEO_SIZE_VGA = new VideoSize(640, 480);
    public int height;
    public int width;

    public VideoSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    @Deprecated
    public static final VideoSize createStandard(int i, boolean z) {
        switch (i) {
            case 0:
                return z ? new VideoSize(IjkMediaMeta.FF_PROFILE_H264_HIGH_444, 176) : new VideoSize(176, IjkMediaMeta.FF_PROFILE_H264_HIGH_444);
            case 1:
                return z ? new VideoSize(288, 352) : new VideoSize(352, 288);
            case 2:
                return z ? new VideoSize(320, 480) : new VideoSize(480, 320);
            case 3:
                return z ? new VideoSize(240, 320) : new VideoSize(320, 240);
            default:
                return new VideoSize();
        }
    }

    public final VideoSize createInverted() {
        return new VideoSize(this.height, this.width);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VideoSize videoSize = (VideoSize) obj;
        return this.height == videoSize.height && this.width == videoSize.width;
    }

    public final int hashCode() {
        return (31 * (this.height + 31)) + this.width;
    }

    public final boolean isPortrait() {
        return this.height >= this.width;
    }

    public final boolean isValid() {
        return this.width > 0 && this.height > 0;
    }

    public final String toDisplayableString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.width);
        stringBuilder.append("x");
        stringBuilder.append(this.height);
        return stringBuilder.toString();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("width = ");
        stringBuilder.append(this.width);
        stringBuilder.append(" height = ");
        stringBuilder.append(this.height);
        return stringBuilder.toString();
    }
}
