package pl.droidsonroids.gif;

import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public enum C7840b {
    NO_ERROR(0, "No error"),
    OPEN_FAILED(101, "Failed to open given input"),
    READ_FAILED(102, "Failed to read from given input"),
    NOT_GIF_FILE(103, "Data is not in GIF format"),
    NO_SCRN_DSCR(104, "No screen descriptor detected"),
    NO_IMAG_DSCR(105, "No image descriptor detected"),
    NO_COLOR_MAP(106, "Neither global nor local color map found"),
    WRONG_RECORD(107, "Wrong record type detected"),
    DATA_TOO_BIG(108, "Number of pixels bigger than width * height"),
    NOT_ENOUGH_MEM(109, "Failed to allocate required memory"),
    CLOSE_FAILED(110, "Failed to close given input"),
    NOT_READABLE(111, "Given file was not opened for read"),
    IMAGE_DEFECT(112, "Image is defective, decoding aborted"),
    EOF_TOO_SOON(113, "Image EOF detected before image complete"),
    NO_FRAMES(IjkMediaCodecInfo.RANK_MAX, "No frames found, at least one frame required"),
    INVALID_SCR_DIMS(1001, "Invalid screen size, dimensions must be positive"),
    INVALID_IMG_DIMS(1002, "Invalid image size, dimensions must be positive"),
    IMG_NOT_CONFINED(1003, "Image size exceeds screen size"),
    REWIND_FAILED(1004, "Input source rewind has failed, animation is stopped"),
    INVALID_BYTE_BUFFER(1005, "Invalid and/or indirect byte buffer specified"),
    UNKNOWN(-1, "Unknown error");
    
    public final String f24926v;
    int f24927w;

    private C7840b(int i, String str) {
        this.f24927w = i;
        this.f24926v = str;
    }

    static C7840b m22127a(int i) {
        for (C7840b c7840b : C7840b.values()) {
            if (c7840b.f24927w == i) {
                return c7840b;
            }
        }
        C7840b c7840b2 = UNKNOWN;
        c7840b2.f24927w = i;
        return c7840b2;
    }
}
