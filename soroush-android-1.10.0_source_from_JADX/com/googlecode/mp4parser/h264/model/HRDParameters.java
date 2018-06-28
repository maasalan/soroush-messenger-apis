package com.googlecode.mp4parser.h264.model;

import java.util.Arrays;

public class HRDParameters {
    public int bit_rate_scale;
    public int[] bit_rate_value_minus1;
    public boolean[] cbr_flag;
    public int cpb_cnt_minus1;
    public int cpb_removal_delay_length_minus1;
    public int cpb_size_scale;
    public int[] cpb_size_value_minus1;
    public int dpb_output_delay_length_minus1;
    public int initial_cpb_removal_delay_length_minus1;
    public int time_offset_length;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("HRDParameters{cpb_cnt_minus1=");
        stringBuilder.append(this.cpb_cnt_minus1);
        stringBuilder.append(", bit_rate_scale=");
        stringBuilder.append(this.bit_rate_scale);
        stringBuilder.append(", cpb_size_scale=");
        stringBuilder.append(this.cpb_size_scale);
        stringBuilder.append(", bit_rate_value_minus1=");
        stringBuilder.append(Arrays.toString(this.bit_rate_value_minus1));
        stringBuilder.append(", cpb_size_value_minus1=");
        stringBuilder.append(Arrays.toString(this.cpb_size_value_minus1));
        stringBuilder.append(", cbr_flag=");
        stringBuilder.append(Arrays.toString(this.cbr_flag));
        stringBuilder.append(", initial_cpb_removal_delay_length_minus1=");
        stringBuilder.append(this.initial_cpb_removal_delay_length_minus1);
        stringBuilder.append(", cpb_removal_delay_length_minus1=");
        stringBuilder.append(this.cpb_removal_delay_length_minus1);
        stringBuilder.append(", dpb_output_delay_length_minus1=");
        stringBuilder.append(this.dpb_output_delay_length_minus1);
        stringBuilder.append(", time_offset_length=");
        stringBuilder.append(this.time_offset_length);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
