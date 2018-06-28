package com.googlecode.mp4parser.h264.model;

public class ChromaFormat {
    public static ChromaFormat MONOCHROME = new ChromaFormat(0, 0, 0);
    public static ChromaFormat YUV_420 = new ChromaFormat(1, 2, 2);
    public static ChromaFormat YUV_422 = new ChromaFormat(2, 2, 1);
    public static ChromaFormat YUV_444 = new ChromaFormat(3, 1, 1);
    private int id;
    private int subHeight;
    private int subWidth;

    public ChromaFormat(int i, int i2, int i3) {
        this.id = i;
        this.subWidth = i2;
        this.subHeight = i3;
    }

    public static ChromaFormat fromId(int i) {
        return i == MONOCHROME.id ? MONOCHROME : i == YUV_420.id ? YUV_420 : i == YUV_422.id ? YUV_422 : i == YUV_444.id ? YUV_444 : null;
    }

    public int getId() {
        return this.id;
    }

    public int getSubHeight() {
        return this.subHeight;
    }

    public int getSubWidth() {
        return this.subWidth;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ChromaFormat{\nid=");
        stringBuilder.append(this.id);
        stringBuilder.append(",\n subWidth=");
        stringBuilder.append(this.subWidth);
        stringBuilder.append(",\n subHeight=");
        stringBuilder.append(this.subHeight);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
