package com.googlecode.mp4parser.h264.model;

import java.util.Arrays;

public class ScalingMatrix {
    public ScalingList[] ScalingList4x4;
    public ScalingList[] ScalingList8x8;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ScalingMatrix{ScalingList4x4=");
        Object obj = null;
        stringBuilder.append(this.ScalingList4x4 == null ? null : Arrays.asList(this.ScalingList4x4));
        stringBuilder.append("\n, ScalingList8x8=");
        if (this.ScalingList8x8 != null) {
            obj = Arrays.asList(this.ScalingList8x8);
        }
        stringBuilder.append(obj);
        stringBuilder.append("\n}");
        return stringBuilder.toString();
    }
}
