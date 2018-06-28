package com.googlecode.mp4parser.h264.model;

import com.googlecode.mp4parser.h264.read.CAVLCReader;
import com.googlecode.mp4parser.h264.write.CAVLCWriter;

public class ScalingList {
    public int[] scalingList;
    public boolean useDefaultScalingMatrixFlag;

    public static ScalingList read(CAVLCReader cAVLCReader, int i) {
        ScalingList scalingList = new ScalingList();
        scalingList.scalingList = new int[i];
        int i2 = 8;
        int i3 = i2;
        int i4 = 0;
        while (i4 < i) {
            if (i2 != 0) {
                i2 = ((cAVLCReader.readSE("deltaScale") + i3) + 256) % 256;
                boolean z = i4 == 0 && i2 == 0;
                scalingList.useDefaultScalingMatrixFlag = z;
            }
            int[] iArr = scalingList.scalingList;
            if (i2 != 0) {
                i3 = i2;
            }
            iArr[i4] = i3;
            i3 = scalingList.scalingList[i4];
            i4++;
        }
        return scalingList;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ScalingList{scalingList=");
        stringBuilder.append(this.scalingList);
        stringBuilder.append(", useDefaultScalingMatrixFlag=");
        stringBuilder.append(this.useDefaultScalingMatrixFlag);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void write(CAVLCWriter cAVLCWriter) {
        int i = 0;
        if (this.useDefaultScalingMatrixFlag) {
            cAVLCWriter.writeSE(0, "SPS: ");
            return;
        }
        int i2 = 8;
        while (i < this.scalingList.length) {
            cAVLCWriter.writeSE((this.scalingList[i] - i2) - 256, "SPS: ");
            i2 = this.scalingList[i];
            i++;
        }
    }
}
