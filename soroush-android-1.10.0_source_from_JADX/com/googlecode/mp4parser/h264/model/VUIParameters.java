package com.googlecode.mp4parser.h264.model;

public class VUIParameters {
    public AspectRatio aspect_ratio;
    public boolean aspect_ratio_info_present_flag;
    public BitstreamRestriction bitstreamRestriction;
    public boolean chroma_loc_info_present_flag;
    public int chroma_sample_loc_type_bottom_field;
    public int chroma_sample_loc_type_top_field;
    public boolean colour_description_present_flag;
    public int colour_primaries;
    public boolean fixed_frame_rate_flag;
    public boolean low_delay_hrd_flag;
    public int matrix_coefficients;
    public HRDParameters nalHRDParams;
    public int num_units_in_tick;
    public boolean overscan_appropriate_flag;
    public boolean overscan_info_present_flag;
    public boolean pic_struct_present_flag;
    public int sar_height;
    public int sar_width;
    public int time_scale;
    public boolean timing_info_present_flag;
    public int transfer_characteristics;
    public HRDParameters vclHRDParams;
    public int video_format;
    public boolean video_full_range_flag;
    public boolean video_signal_type_present_flag;

    public static class BitstreamRestriction {
        public int log2_max_mv_length_horizontal;
        public int log2_max_mv_length_vertical;
        public int max_bits_per_mb_denom;
        public int max_bytes_per_pic_denom;
        public int max_dec_frame_buffering;
        public boolean motion_vectors_over_pic_boundaries_flag;
        public int num_reorder_frames;

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("BitstreamRestriction{");
            stringBuilder.append("motion_vectors_over_pic_boundaries_flag=");
            stringBuilder.append(this.motion_vectors_over_pic_boundaries_flag);
            stringBuilder.append(", max_bytes_per_pic_denom=");
            stringBuilder.append(this.max_bytes_per_pic_denom);
            stringBuilder.append(", max_bits_per_mb_denom=");
            stringBuilder.append(this.max_bits_per_mb_denom);
            stringBuilder.append(", log2_max_mv_length_horizontal=");
            stringBuilder.append(this.log2_max_mv_length_horizontal);
            stringBuilder.append(", log2_max_mv_length_vertical=");
            stringBuilder.append(this.log2_max_mv_length_vertical);
            stringBuilder.append(", num_reorder_frames=");
            stringBuilder.append(this.num_reorder_frames);
            stringBuilder.append(", max_dec_frame_buffering=");
            stringBuilder.append(this.max_dec_frame_buffering);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("VUIParameters{\naspect_ratio_info_present_flag=");
        stringBuilder.append(this.aspect_ratio_info_present_flag);
        stringBuilder.append("\n, sar_width=");
        stringBuilder.append(this.sar_width);
        stringBuilder.append("\n, sar_height=");
        stringBuilder.append(this.sar_height);
        stringBuilder.append("\n, overscan_info_present_flag=");
        stringBuilder.append(this.overscan_info_present_flag);
        stringBuilder.append("\n, overscan_appropriate_flag=");
        stringBuilder.append(this.overscan_appropriate_flag);
        stringBuilder.append("\n, video_signal_type_present_flag=");
        stringBuilder.append(this.video_signal_type_present_flag);
        stringBuilder.append("\n, video_format=");
        stringBuilder.append(this.video_format);
        stringBuilder.append("\n, video_full_range_flag=");
        stringBuilder.append(this.video_full_range_flag);
        stringBuilder.append("\n, colour_description_present_flag=");
        stringBuilder.append(this.colour_description_present_flag);
        stringBuilder.append("\n, colour_primaries=");
        stringBuilder.append(this.colour_primaries);
        stringBuilder.append("\n, transfer_characteristics=");
        stringBuilder.append(this.transfer_characteristics);
        stringBuilder.append("\n, matrix_coefficients=");
        stringBuilder.append(this.matrix_coefficients);
        stringBuilder.append("\n, chroma_loc_info_present_flag=");
        stringBuilder.append(this.chroma_loc_info_present_flag);
        stringBuilder.append("\n, chroma_sample_loc_type_top_field=");
        stringBuilder.append(this.chroma_sample_loc_type_top_field);
        stringBuilder.append("\n, chroma_sample_loc_type_bottom_field=");
        stringBuilder.append(this.chroma_sample_loc_type_bottom_field);
        stringBuilder.append("\n, timing_info_present_flag=");
        stringBuilder.append(this.timing_info_present_flag);
        stringBuilder.append("\n, num_units_in_tick=");
        stringBuilder.append(this.num_units_in_tick);
        stringBuilder.append("\n, time_scale=");
        stringBuilder.append(this.time_scale);
        stringBuilder.append("\n, fixed_frame_rate_flag=");
        stringBuilder.append(this.fixed_frame_rate_flag);
        stringBuilder.append("\n, low_delay_hrd_flag=");
        stringBuilder.append(this.low_delay_hrd_flag);
        stringBuilder.append("\n, pic_struct_present_flag=");
        stringBuilder.append(this.pic_struct_present_flag);
        stringBuilder.append("\n, nalHRDParams=");
        stringBuilder.append(this.nalHRDParams);
        stringBuilder.append("\n, vclHRDParams=");
        stringBuilder.append(this.vclHRDParams);
        stringBuilder.append("\n, bitstreamRestriction=");
        stringBuilder.append(this.bitstreamRestriction);
        stringBuilder.append("\n, aspect_ratio=");
        stringBuilder.append(this.aspect_ratio);
        stringBuilder.append("\n}");
        return stringBuilder.toString();
    }
}
