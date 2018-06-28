package com.googlecode.mp4parser.h264.model;

import com.googlecode.mp4parser.h264.model.VUIParameters.BitstreamRestriction;
import com.googlecode.mp4parser.h264.read.CAVLCReader;
import com.googlecode.mp4parser.h264.write.CAVLCWriter;
import java.io.InputStream;
import java.io.OutputStream;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class SeqParameterSet extends BitstreamElement {
    public int bit_depth_chroma_minus8;
    public int bit_depth_luma_minus8;
    public ChromaFormat chroma_format_idc;
    public boolean constraint_set_0_flag;
    public boolean constraint_set_1_flag;
    public boolean constraint_set_2_flag;
    public boolean constraint_set_3_flag;
    public boolean constraint_set_4_flag;
    public boolean constraint_set_5_flag;
    public boolean delta_pic_order_always_zero_flag;
    public boolean direct_8x8_inference_flag;
    public boolean entropy_coding_mode_flag;
    public boolean field_pic_flag;
    public int frame_crop_bottom_offset;
    public int frame_crop_left_offset;
    public int frame_crop_right_offset;
    public int frame_crop_top_offset;
    public boolean frame_cropping_flag;
    public boolean frame_mbs_only_flag;
    public boolean gaps_in_frame_num_value_allowed_flag;
    public int level_idc;
    public int log2_max_frame_num_minus4;
    public int log2_max_pic_order_cnt_lsb_minus4;
    public boolean mb_adaptive_frame_field_flag;
    public int num_ref_frames;
    public int num_ref_frames_in_pic_order_cnt_cycle;
    public int[] offsetForRefFrame;
    public int offset_for_non_ref_pic;
    public int offset_for_top_to_bottom_field;
    public int pic_height_in_map_units_minus1;
    public int pic_order_cnt_type;
    public int pic_width_in_mbs_minus1;
    public int profile_idc;
    public boolean qpprime_y_zero_transform_bypass_flag;
    public long reserved_zero_2bits;
    public boolean residual_color_transform_flag;
    public ScalingMatrix scalingMatrix;
    public int seq_parameter_set_id;
    public VUIParameters vuiParams;
    public int weighted_bipred_idc;
    public boolean weighted_pred_flag;

    private static VUIParameters ReadVUIParameters(CAVLCReader cAVLCReader) {
        VUIParameters vUIParameters = new VUIParameters();
        vUIParameters.aspect_ratio_info_present_flag = cAVLCReader.readBool("VUI: aspect_ratio_info_present_flag");
        if (vUIParameters.aspect_ratio_info_present_flag) {
            vUIParameters.aspect_ratio = AspectRatio.fromValue((int) cAVLCReader.readNBit(8, "VUI: aspect_ratio"));
            if (vUIParameters.aspect_ratio == AspectRatio.Extended_SAR) {
                vUIParameters.sar_width = (int) cAVLCReader.readNBit(16, "VUI: sar_width");
                vUIParameters.sar_height = (int) cAVLCReader.readNBit(16, "VUI: sar_height");
            }
        }
        vUIParameters.overscan_info_present_flag = cAVLCReader.readBool("VUI: overscan_info_present_flag");
        if (vUIParameters.overscan_info_present_flag) {
            vUIParameters.overscan_appropriate_flag = cAVLCReader.readBool("VUI: overscan_appropriate_flag");
        }
        vUIParameters.video_signal_type_present_flag = cAVLCReader.readBool("VUI: video_signal_type_present_flag");
        if (vUIParameters.video_signal_type_present_flag) {
            vUIParameters.video_format = (int) cAVLCReader.readNBit(3, "VUI: video_format");
            vUIParameters.video_full_range_flag = cAVLCReader.readBool("VUI: video_full_range_flag");
            vUIParameters.colour_description_present_flag = cAVLCReader.readBool("VUI: colour_description_present_flag");
            if (vUIParameters.colour_description_present_flag) {
                vUIParameters.colour_primaries = (int) cAVLCReader.readNBit(8, "VUI: colour_primaries");
                vUIParameters.transfer_characteristics = (int) cAVLCReader.readNBit(8, "VUI: transfer_characteristics");
                vUIParameters.matrix_coefficients = (int) cAVLCReader.readNBit(8, "VUI: matrix_coefficients");
            }
        }
        vUIParameters.chroma_loc_info_present_flag = cAVLCReader.readBool("VUI: chroma_loc_info_present_flag");
        if (vUIParameters.chroma_loc_info_present_flag) {
            vUIParameters.chroma_sample_loc_type_top_field = cAVLCReader.readUE("VUI chroma_sample_loc_type_top_field");
            vUIParameters.chroma_sample_loc_type_bottom_field = cAVLCReader.readUE("VUI chroma_sample_loc_type_bottom_field");
        }
        vUIParameters.timing_info_present_flag = cAVLCReader.readBool("VUI: timing_info_present_flag");
        if (vUIParameters.timing_info_present_flag) {
            vUIParameters.num_units_in_tick = (int) cAVLCReader.readNBit(32, "VUI: num_units_in_tick");
            vUIParameters.time_scale = (int) cAVLCReader.readNBit(32, "VUI: time_scale");
            vUIParameters.fixed_frame_rate_flag = cAVLCReader.readBool("VUI: fixed_frame_rate_flag");
        }
        boolean readBool = cAVLCReader.readBool("VUI: nal_hrd_parameters_present_flag");
        if (readBool) {
            vUIParameters.nalHRDParams = readHRDParameters(cAVLCReader);
        }
        boolean readBool2 = cAVLCReader.readBool("VUI: vcl_hrd_parameters_present_flag");
        if (readBool2) {
            vUIParameters.vclHRDParams = readHRDParameters(cAVLCReader);
        }
        if (readBool || readBool2) {
            vUIParameters.low_delay_hrd_flag = cAVLCReader.readBool("VUI: low_delay_hrd_flag");
        }
        vUIParameters.pic_struct_present_flag = cAVLCReader.readBool("VUI: pic_struct_present_flag");
        if (cAVLCReader.readBool("VUI: bitstream_restriction_flag")) {
            vUIParameters.bitstreamRestriction = new BitstreamRestriction();
            vUIParameters.bitstreamRestriction.motion_vectors_over_pic_boundaries_flag = cAVLCReader.readBool("VUI: motion_vectors_over_pic_boundaries_flag");
            vUIParameters.bitstreamRestriction.max_bytes_per_pic_denom = cAVLCReader.readUE("VUI max_bytes_per_pic_denom");
            vUIParameters.bitstreamRestriction.max_bits_per_mb_denom = cAVLCReader.readUE("VUI max_bits_per_mb_denom");
            vUIParameters.bitstreamRestriction.log2_max_mv_length_horizontal = cAVLCReader.readUE("VUI log2_max_mv_length_horizontal");
            vUIParameters.bitstreamRestriction.log2_max_mv_length_vertical = cAVLCReader.readUE("VUI log2_max_mv_length_vertical");
            vUIParameters.bitstreamRestriction.num_reorder_frames = cAVLCReader.readUE("VUI num_reorder_frames");
            vUIParameters.bitstreamRestriction.max_dec_frame_buffering = cAVLCReader.readUE("VUI max_dec_frame_buffering");
        }
        return vUIParameters;
    }

    public static SeqParameterSet read(InputStream inputStream) {
        int i;
        CAVLCReader cAVLCReader = new CAVLCReader(inputStream);
        SeqParameterSet seqParameterSet = new SeqParameterSet();
        seqParameterSet.profile_idc = (int) cAVLCReader.readNBit(8, "SPS: profile_idc");
        seqParameterSet.constraint_set_0_flag = cAVLCReader.readBool("SPS: constraint_set_0_flag");
        seqParameterSet.constraint_set_1_flag = cAVLCReader.readBool("SPS: constraint_set_1_flag");
        seqParameterSet.constraint_set_2_flag = cAVLCReader.readBool("SPS: constraint_set_2_flag");
        seqParameterSet.constraint_set_3_flag = cAVLCReader.readBool("SPS: constraint_set_3_flag");
        seqParameterSet.constraint_set_4_flag = cAVLCReader.readBool("SPS: constraint_set_4_flag");
        seqParameterSet.constraint_set_5_flag = cAVLCReader.readBool("SPS: constraint_set_5_flag");
        seqParameterSet.reserved_zero_2bits = cAVLCReader.readNBit(2, "SPS: reserved_zero_2bits");
        seqParameterSet.level_idc = (int) cAVLCReader.readNBit(8, "SPS: level_idc");
        seqParameterSet.seq_parameter_set_id = cAVLCReader.readUE("SPS: seq_parameter_set_id");
        if (!(seqParameterSet.profile_idc == 100 || seqParameterSet.profile_idc == 110 || seqParameterSet.profile_idc == IjkMediaMeta.FF_PROFILE_H264_HIGH_422)) {
            if (seqParameterSet.profile_idc != IjkMediaMeta.FF_PROFILE_H264_HIGH_444) {
                seqParameterSet.chroma_format_idc = ChromaFormat.YUV_420;
                seqParameterSet.log2_max_frame_num_minus4 = cAVLCReader.readUE("SPS: log2_max_frame_num_minus4");
                seqParameterSet.pic_order_cnt_type = cAVLCReader.readUE("SPS: pic_order_cnt_type");
                if (seqParameterSet.pic_order_cnt_type == 0) {
                    seqParameterSet.log2_max_pic_order_cnt_lsb_minus4 = cAVLCReader.readUE("SPS: log2_max_pic_order_cnt_lsb_minus4");
                } else if (seqParameterSet.pic_order_cnt_type == 1) {
                    seqParameterSet.delta_pic_order_always_zero_flag = cAVLCReader.readBool("SPS: delta_pic_order_always_zero_flag");
                    seqParameterSet.offset_for_non_ref_pic = cAVLCReader.readSE("SPS: offset_for_non_ref_pic");
                    seqParameterSet.offset_for_top_to_bottom_field = cAVLCReader.readSE("SPS: offset_for_top_to_bottom_field");
                    seqParameterSet.num_ref_frames_in_pic_order_cnt_cycle = cAVLCReader.readUE("SPS: num_ref_frames_in_pic_order_cnt_cycle");
                    seqParameterSet.offsetForRefFrame = new int[seqParameterSet.num_ref_frames_in_pic_order_cnt_cycle];
                    for (i = 0; i < seqParameterSet.num_ref_frames_in_pic_order_cnt_cycle; i++) {
                        int[] iArr = seqParameterSet.offsetForRefFrame;
                        StringBuilder stringBuilder = new StringBuilder("SPS: offsetForRefFrame [");
                        stringBuilder.append(i);
                        stringBuilder.append("]");
                        iArr[i] = cAVLCReader.readSE(stringBuilder.toString());
                    }
                }
                seqParameterSet.num_ref_frames = cAVLCReader.readUE("SPS: num_ref_frames");
                seqParameterSet.gaps_in_frame_num_value_allowed_flag = cAVLCReader.readBool("SPS: gaps_in_frame_num_value_allowed_flag");
                seqParameterSet.pic_width_in_mbs_minus1 = cAVLCReader.readUE("SPS: pic_width_in_mbs_minus1");
                seqParameterSet.pic_height_in_map_units_minus1 = cAVLCReader.readUE("SPS: pic_height_in_map_units_minus1");
                seqParameterSet.frame_mbs_only_flag = cAVLCReader.readBool("SPS: frame_mbs_only_flag");
                if (!seqParameterSet.frame_mbs_only_flag) {
                    seqParameterSet.mb_adaptive_frame_field_flag = cAVLCReader.readBool("SPS: mb_adaptive_frame_field_flag");
                }
                seqParameterSet.direct_8x8_inference_flag = cAVLCReader.readBool("SPS: direct_8x8_inference_flag");
                seqParameterSet.frame_cropping_flag = cAVLCReader.readBool("SPS: frame_cropping_flag");
                if (seqParameterSet.frame_cropping_flag) {
                    seqParameterSet.frame_crop_left_offset = cAVLCReader.readUE("SPS: frame_crop_left_offset");
                    seqParameterSet.frame_crop_right_offset = cAVLCReader.readUE("SPS: frame_crop_right_offset");
                    seqParameterSet.frame_crop_top_offset = cAVLCReader.readUE("SPS: frame_crop_top_offset");
                    seqParameterSet.frame_crop_bottom_offset = cAVLCReader.readUE("SPS: frame_crop_bottom_offset");
                }
                if (cAVLCReader.readBool("SPS: vui_parameters_present_flag")) {
                    seqParameterSet.vuiParams = ReadVUIParameters(cAVLCReader);
                }
                cAVLCReader.readTrailingBits();
                return seqParameterSet;
            }
        }
        seqParameterSet.chroma_format_idc = ChromaFormat.fromId(cAVLCReader.readUE("SPS: chroma_format_idc"));
        if (seqParameterSet.chroma_format_idc == ChromaFormat.YUV_444) {
            seqParameterSet.residual_color_transform_flag = cAVLCReader.readBool("SPS: residual_color_transform_flag");
        }
        seqParameterSet.bit_depth_luma_minus8 = cAVLCReader.readUE("SPS: bit_depth_luma_minus8");
        seqParameterSet.bit_depth_chroma_minus8 = cAVLCReader.readUE("SPS: bit_depth_chroma_minus8");
        seqParameterSet.qpprime_y_zero_transform_bypass_flag = cAVLCReader.readBool("SPS: qpprime_y_zero_transform_bypass_flag");
        if (cAVLCReader.readBool("SPS: seq_scaling_matrix_present_lag")) {
            readScalingListMatrix(cAVLCReader, seqParameterSet);
        }
        seqParameterSet.log2_max_frame_num_minus4 = cAVLCReader.readUE("SPS: log2_max_frame_num_minus4");
        seqParameterSet.pic_order_cnt_type = cAVLCReader.readUE("SPS: pic_order_cnt_type");
        if (seqParameterSet.pic_order_cnt_type == 0) {
            seqParameterSet.log2_max_pic_order_cnt_lsb_minus4 = cAVLCReader.readUE("SPS: log2_max_pic_order_cnt_lsb_minus4");
        } else if (seqParameterSet.pic_order_cnt_type == 1) {
            seqParameterSet.delta_pic_order_always_zero_flag = cAVLCReader.readBool("SPS: delta_pic_order_always_zero_flag");
            seqParameterSet.offset_for_non_ref_pic = cAVLCReader.readSE("SPS: offset_for_non_ref_pic");
            seqParameterSet.offset_for_top_to_bottom_field = cAVLCReader.readSE("SPS: offset_for_top_to_bottom_field");
            seqParameterSet.num_ref_frames_in_pic_order_cnt_cycle = cAVLCReader.readUE("SPS: num_ref_frames_in_pic_order_cnt_cycle");
            seqParameterSet.offsetForRefFrame = new int[seqParameterSet.num_ref_frames_in_pic_order_cnt_cycle];
            for (i = 0; i < seqParameterSet.num_ref_frames_in_pic_order_cnt_cycle; i++) {
                int[] iArr2 = seqParameterSet.offsetForRefFrame;
                StringBuilder stringBuilder2 = new StringBuilder("SPS: offsetForRefFrame [");
                stringBuilder2.append(i);
                stringBuilder2.append("]");
                iArr2[i] = cAVLCReader.readSE(stringBuilder2.toString());
            }
        }
        seqParameterSet.num_ref_frames = cAVLCReader.readUE("SPS: num_ref_frames");
        seqParameterSet.gaps_in_frame_num_value_allowed_flag = cAVLCReader.readBool("SPS: gaps_in_frame_num_value_allowed_flag");
        seqParameterSet.pic_width_in_mbs_minus1 = cAVLCReader.readUE("SPS: pic_width_in_mbs_minus1");
        seqParameterSet.pic_height_in_map_units_minus1 = cAVLCReader.readUE("SPS: pic_height_in_map_units_minus1");
        seqParameterSet.frame_mbs_only_flag = cAVLCReader.readBool("SPS: frame_mbs_only_flag");
        if (seqParameterSet.frame_mbs_only_flag) {
            seqParameterSet.mb_adaptive_frame_field_flag = cAVLCReader.readBool("SPS: mb_adaptive_frame_field_flag");
        }
        seqParameterSet.direct_8x8_inference_flag = cAVLCReader.readBool("SPS: direct_8x8_inference_flag");
        seqParameterSet.frame_cropping_flag = cAVLCReader.readBool("SPS: frame_cropping_flag");
        if (seqParameterSet.frame_cropping_flag) {
            seqParameterSet.frame_crop_left_offset = cAVLCReader.readUE("SPS: frame_crop_left_offset");
            seqParameterSet.frame_crop_right_offset = cAVLCReader.readUE("SPS: frame_crop_right_offset");
            seqParameterSet.frame_crop_top_offset = cAVLCReader.readUE("SPS: frame_crop_top_offset");
            seqParameterSet.frame_crop_bottom_offset = cAVLCReader.readUE("SPS: frame_crop_bottom_offset");
        }
        if (cAVLCReader.readBool("SPS: vui_parameters_present_flag")) {
            seqParameterSet.vuiParams = ReadVUIParameters(cAVLCReader);
        }
        cAVLCReader.readTrailingBits();
        return seqParameterSet;
    }

    private static HRDParameters readHRDParameters(CAVLCReader cAVLCReader) {
        HRDParameters hRDParameters = new HRDParameters();
        hRDParameters.cpb_cnt_minus1 = cAVLCReader.readUE("SPS: cpb_cnt_minus1");
        hRDParameters.bit_rate_scale = (int) cAVLCReader.readNBit(4, "HRD: bit_rate_scale");
        hRDParameters.cpb_size_scale = (int) cAVLCReader.readNBit(4, "HRD: cpb_size_scale");
        hRDParameters.bit_rate_value_minus1 = new int[(hRDParameters.cpb_cnt_minus1 + 1)];
        hRDParameters.cpb_size_value_minus1 = new int[(hRDParameters.cpb_cnt_minus1 + 1)];
        hRDParameters.cbr_flag = new boolean[(hRDParameters.cpb_cnt_minus1 + 1)];
        for (int i = 0; i <= hRDParameters.cpb_cnt_minus1; i++) {
            hRDParameters.bit_rate_value_minus1[i] = cAVLCReader.readUE("HRD: bit_rate_value_minus1");
            hRDParameters.cpb_size_value_minus1[i] = cAVLCReader.readUE("HRD: cpb_size_value_minus1");
            hRDParameters.cbr_flag[i] = cAVLCReader.readBool("HRD: cbr_flag");
        }
        hRDParameters.initial_cpb_removal_delay_length_minus1 = (int) cAVLCReader.readNBit(5, "HRD: initial_cpb_removal_delay_length_minus1");
        hRDParameters.cpb_removal_delay_length_minus1 = (int) cAVLCReader.readNBit(5, "HRD: cpb_removal_delay_length_minus1");
        hRDParameters.dpb_output_delay_length_minus1 = (int) cAVLCReader.readNBit(5, "HRD: dpb_output_delay_length_minus1");
        hRDParameters.time_offset_length = (int) cAVLCReader.readNBit(5, "HRD: time_offset_length");
        return hRDParameters;
    }

    private static void readScalingListMatrix(CAVLCReader cAVLCReader, SeqParameterSet seqParameterSet) {
        seqParameterSet.scalingMatrix = new ScalingMatrix();
        for (int i = 0; i < 8; i++) {
            if (cAVLCReader.readBool("SPS: seqScalingListPresentFlag")) {
                seqParameterSet.scalingMatrix.ScalingList4x4 = new ScalingList[8];
                seqParameterSet.scalingMatrix.ScalingList8x8 = new ScalingList[8];
                if (i < 6) {
                    seqParameterSet.scalingMatrix.ScalingList4x4[i] = ScalingList.read(cAVLCReader, 16);
                } else {
                    seqParameterSet.scalingMatrix.ScalingList8x8[i - 6] = ScalingList.read(cAVLCReader, 64);
                }
            }
        }
    }

    private void writeHRDParameters(HRDParameters hRDParameters, CAVLCWriter cAVLCWriter) {
        cAVLCWriter.writeUE(hRDParameters.cpb_cnt_minus1, "HRD: cpb_cnt_minus1");
        cAVLCWriter.writeNBit((long) hRDParameters.bit_rate_scale, 4, "HRD: bit_rate_scale");
        cAVLCWriter.writeNBit((long) hRDParameters.cpb_size_scale, 4, "HRD: cpb_size_scale");
        for (int i = 0; i <= hRDParameters.cpb_cnt_minus1; i++) {
            cAVLCWriter.writeUE(hRDParameters.bit_rate_value_minus1[i], "HRD: ");
            cAVLCWriter.writeUE(hRDParameters.cpb_size_value_minus1[i], "HRD: ");
            cAVLCWriter.writeBool(hRDParameters.cbr_flag[i], "HRD: ");
        }
        cAVLCWriter.writeNBit((long) hRDParameters.initial_cpb_removal_delay_length_minus1, 5, "HRD: initial_cpb_removal_delay_length_minus1");
        cAVLCWriter.writeNBit((long) hRDParameters.cpb_removal_delay_length_minus1, 5, "HRD: cpb_removal_delay_length_minus1");
        cAVLCWriter.writeNBit((long) hRDParameters.dpb_output_delay_length_minus1, 5, "HRD: dpb_output_delay_length_minus1");
        cAVLCWriter.writeNBit((long) hRDParameters.time_offset_length, 5, "HRD: time_offset_length");
    }

    private void writeVUIParameters(VUIParameters vUIParameters, CAVLCWriter cAVLCWriter) {
        cAVLCWriter.writeBool(vUIParameters.aspect_ratio_info_present_flag, "VUI: aspect_ratio_info_present_flag");
        if (vUIParameters.aspect_ratio_info_present_flag) {
            cAVLCWriter.writeNBit((long) vUIParameters.aspect_ratio.getValue(), 8, "VUI: aspect_ratio");
            if (vUIParameters.aspect_ratio == AspectRatio.Extended_SAR) {
                cAVLCWriter.writeNBit((long) vUIParameters.sar_width, 16, "VUI: sar_width");
                cAVLCWriter.writeNBit((long) vUIParameters.sar_height, 16, "VUI: sar_height");
            }
        }
        cAVLCWriter.writeBool(vUIParameters.overscan_info_present_flag, "VUI: overscan_info_present_flag");
        if (vUIParameters.overscan_info_present_flag) {
            cAVLCWriter.writeBool(vUIParameters.overscan_appropriate_flag, "VUI: overscan_appropriate_flag");
        }
        cAVLCWriter.writeBool(vUIParameters.video_signal_type_present_flag, "VUI: video_signal_type_present_flag");
        if (vUIParameters.video_signal_type_present_flag) {
            cAVLCWriter.writeNBit((long) vUIParameters.video_format, 3, "VUI: video_format");
            cAVLCWriter.writeBool(vUIParameters.video_full_range_flag, "VUI: video_full_range_flag");
            cAVLCWriter.writeBool(vUIParameters.colour_description_present_flag, "VUI: colour_description_present_flag");
            if (vUIParameters.colour_description_present_flag) {
                cAVLCWriter.writeNBit((long) vUIParameters.colour_primaries, 8, "VUI: colour_primaries");
                cAVLCWriter.writeNBit((long) vUIParameters.transfer_characteristics, 8, "VUI: transfer_characteristics");
                cAVLCWriter.writeNBit((long) vUIParameters.matrix_coefficients, 8, "VUI: matrix_coefficients");
            }
        }
        cAVLCWriter.writeBool(vUIParameters.chroma_loc_info_present_flag, "VUI: chroma_loc_info_present_flag");
        if (vUIParameters.chroma_loc_info_present_flag) {
            cAVLCWriter.writeUE(vUIParameters.chroma_sample_loc_type_top_field, "VUI: chroma_sample_loc_type_top_field");
            cAVLCWriter.writeUE(vUIParameters.chroma_sample_loc_type_bottom_field, "VUI: chroma_sample_loc_type_bottom_field");
        }
        cAVLCWriter.writeBool(vUIParameters.timing_info_present_flag, "VUI: timing_info_present_flag");
        if (vUIParameters.timing_info_present_flag) {
            cAVLCWriter.writeNBit((long) vUIParameters.num_units_in_tick, 32, "VUI: num_units_in_tick");
            cAVLCWriter.writeNBit((long) vUIParameters.time_scale, 32, "VUI: time_scale");
            cAVLCWriter.writeBool(vUIParameters.fixed_frame_rate_flag, "VUI: fixed_frame_rate_flag");
        }
        boolean z = false;
        cAVLCWriter.writeBool(vUIParameters.nalHRDParams != null, "VUI: ");
        if (vUIParameters.nalHRDParams != null) {
            writeHRDParameters(vUIParameters.nalHRDParams, cAVLCWriter);
        }
        cAVLCWriter.writeBool(vUIParameters.vclHRDParams != null, "VUI: ");
        if (vUIParameters.vclHRDParams != null) {
            writeHRDParameters(vUIParameters.vclHRDParams, cAVLCWriter);
        }
        if (!(vUIParameters.nalHRDParams == null && vUIParameters.vclHRDParams == null)) {
            cAVLCWriter.writeBool(vUIParameters.low_delay_hrd_flag, "VUI: low_delay_hrd_flag");
        }
        cAVLCWriter.writeBool(vUIParameters.pic_struct_present_flag, "VUI: pic_struct_present_flag");
        if (vUIParameters.bitstreamRestriction != null) {
            z = true;
        }
        cAVLCWriter.writeBool(z, "VUI: ");
        if (vUIParameters.bitstreamRestriction != null) {
            cAVLCWriter.writeBool(vUIParameters.bitstreamRestriction.motion_vectors_over_pic_boundaries_flag, "VUI: motion_vectors_over_pic_boundaries_flag");
            cAVLCWriter.writeUE(vUIParameters.bitstreamRestriction.max_bytes_per_pic_denom, "VUI: max_bytes_per_pic_denom");
            cAVLCWriter.writeUE(vUIParameters.bitstreamRestriction.max_bits_per_mb_denom, "VUI: max_bits_per_mb_denom");
            cAVLCWriter.writeUE(vUIParameters.bitstreamRestriction.log2_max_mv_length_horizontal, "VUI: log2_max_mv_length_horizontal");
            cAVLCWriter.writeUE(vUIParameters.bitstreamRestriction.log2_max_mv_length_vertical, "VUI: log2_max_mv_length_vertical");
            cAVLCWriter.writeUE(vUIParameters.bitstreamRestriction.num_reorder_frames, "VUI: num_reorder_frames");
            cAVLCWriter.writeUE(vUIParameters.bitstreamRestriction.max_dec_frame_buffering, "VUI: max_dec_frame_buffering");
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SeqParameterSet{ \n        pic_order_cnt_type=");
        stringBuilder.append(this.pic_order_cnt_type);
        stringBuilder.append(", \n        field_pic_flag=");
        stringBuilder.append(this.field_pic_flag);
        stringBuilder.append(", \n        delta_pic_order_always_zero_flag=");
        stringBuilder.append(this.delta_pic_order_always_zero_flag);
        stringBuilder.append(", \n        weighted_pred_flag=");
        stringBuilder.append(this.weighted_pred_flag);
        stringBuilder.append(", \n        weighted_bipred_idc=");
        stringBuilder.append(this.weighted_bipred_idc);
        stringBuilder.append(", \n        entropy_coding_mode_flag=");
        stringBuilder.append(this.entropy_coding_mode_flag);
        stringBuilder.append(", \n        mb_adaptive_frame_field_flag=");
        stringBuilder.append(this.mb_adaptive_frame_field_flag);
        stringBuilder.append(", \n        direct_8x8_inference_flag=");
        stringBuilder.append(this.direct_8x8_inference_flag);
        stringBuilder.append(", \n        chroma_format_idc=");
        stringBuilder.append(this.chroma_format_idc);
        stringBuilder.append(", \n        log2_max_frame_num_minus4=");
        stringBuilder.append(this.log2_max_frame_num_minus4);
        stringBuilder.append(", \n        log2_max_pic_order_cnt_lsb_minus4=");
        stringBuilder.append(this.log2_max_pic_order_cnt_lsb_minus4);
        stringBuilder.append(", \n        pic_height_in_map_units_minus1=");
        stringBuilder.append(this.pic_height_in_map_units_minus1);
        stringBuilder.append(", \n        pic_width_in_mbs_minus1=");
        stringBuilder.append(this.pic_width_in_mbs_minus1);
        stringBuilder.append(", \n        bit_depth_luma_minus8=");
        stringBuilder.append(this.bit_depth_luma_minus8);
        stringBuilder.append(", \n        bit_depth_chroma_minus8=");
        stringBuilder.append(this.bit_depth_chroma_minus8);
        stringBuilder.append(", \n        qpprime_y_zero_transform_bypass_flag=");
        stringBuilder.append(this.qpprime_y_zero_transform_bypass_flag);
        stringBuilder.append(", \n        profile_idc=");
        stringBuilder.append(this.profile_idc);
        stringBuilder.append(", \n        constraint_set_0_flag=");
        stringBuilder.append(this.constraint_set_0_flag);
        stringBuilder.append(", \n        constraint_set_1_flag=");
        stringBuilder.append(this.constraint_set_1_flag);
        stringBuilder.append(", \n        constraint_set_2_flag=");
        stringBuilder.append(this.constraint_set_2_flag);
        stringBuilder.append(", \n        constraint_set_3_flag=");
        stringBuilder.append(this.constraint_set_3_flag);
        stringBuilder.append(", \n        constraint_set_4_flag=");
        stringBuilder.append(this.constraint_set_4_flag);
        stringBuilder.append(", \n        constraint_set_5_flag=");
        stringBuilder.append(this.constraint_set_5_flag);
        stringBuilder.append(", \n        level_idc=");
        stringBuilder.append(this.level_idc);
        stringBuilder.append(", \n        seq_parameter_set_id=");
        stringBuilder.append(this.seq_parameter_set_id);
        stringBuilder.append(", \n        residual_color_transform_flag=");
        stringBuilder.append(this.residual_color_transform_flag);
        stringBuilder.append(", \n        offset_for_non_ref_pic=");
        stringBuilder.append(this.offset_for_non_ref_pic);
        stringBuilder.append(", \n        offset_for_top_to_bottom_field=");
        stringBuilder.append(this.offset_for_top_to_bottom_field);
        stringBuilder.append(", \n        num_ref_frames=");
        stringBuilder.append(this.num_ref_frames);
        stringBuilder.append(", \n        gaps_in_frame_num_value_allowed_flag=");
        stringBuilder.append(this.gaps_in_frame_num_value_allowed_flag);
        stringBuilder.append(", \n        frame_mbs_only_flag=");
        stringBuilder.append(this.frame_mbs_only_flag);
        stringBuilder.append(", \n        frame_cropping_flag=");
        stringBuilder.append(this.frame_cropping_flag);
        stringBuilder.append(", \n        frame_crop_left_offset=");
        stringBuilder.append(this.frame_crop_left_offset);
        stringBuilder.append(", \n        frame_crop_right_offset=");
        stringBuilder.append(this.frame_crop_right_offset);
        stringBuilder.append(", \n        frame_crop_top_offset=");
        stringBuilder.append(this.frame_crop_top_offset);
        stringBuilder.append(", \n        frame_crop_bottom_offset=");
        stringBuilder.append(this.frame_crop_bottom_offset);
        stringBuilder.append(", \n        offsetForRefFrame=");
        stringBuilder.append(this.offsetForRefFrame);
        stringBuilder.append(", \n        vuiParams=");
        stringBuilder.append(this.vuiParams);
        stringBuilder.append(", \n        scalingMatrix=");
        stringBuilder.append(this.scalingMatrix);
        stringBuilder.append(", \n        num_ref_frames_in_pic_order_cnt_cycle=");
        stringBuilder.append(this.num_ref_frames_in_pic_order_cnt_cycle);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void write(OutputStream outputStream) {
        int i;
        CAVLCWriter cAVLCWriter = new CAVLCWriter(outputStream);
        cAVLCWriter.writeNBit((long) this.profile_idc, 8, "SPS: profile_idc");
        cAVLCWriter.writeBool(this.constraint_set_0_flag, "SPS: constraint_set_0_flag");
        cAVLCWriter.writeBool(this.constraint_set_1_flag, "SPS: constraint_set_1_flag");
        cAVLCWriter.writeBool(this.constraint_set_2_flag, "SPS: constraint_set_2_flag");
        cAVLCWriter.writeBool(this.constraint_set_3_flag, "SPS: constraint_set_3_flag");
        cAVLCWriter.writeNBit(0, 4, "SPS: reserved");
        cAVLCWriter.writeNBit((long) this.level_idc, 8, "SPS: level_idc");
        cAVLCWriter.writeUE(this.seq_parameter_set_id, "SPS: seq_parameter_set_id");
        boolean z = false;
        if (this.profile_idc == 100 || this.profile_idc == 110 || this.profile_idc == IjkMediaMeta.FF_PROFILE_H264_HIGH_422 || this.profile_idc == IjkMediaMeta.FF_PROFILE_H264_HIGH_444) {
            cAVLCWriter.writeUE(this.chroma_format_idc.getId(), "SPS: chroma_format_idc");
            if (this.chroma_format_idc == ChromaFormat.YUV_444) {
                cAVLCWriter.writeBool(this.residual_color_transform_flag, "SPS: residual_color_transform_flag");
            }
            cAVLCWriter.writeUE(this.bit_depth_luma_minus8, "SPS: ");
            cAVLCWriter.writeUE(this.bit_depth_chroma_minus8, "SPS: ");
            cAVLCWriter.writeBool(this.qpprime_y_zero_transform_bypass_flag, "SPS: qpprime_y_zero_transform_bypass_flag");
            cAVLCWriter.writeBool(this.scalingMatrix != null, "SPS: ");
            if (this.scalingMatrix != null) {
                for (i = 0; i < 8; i++) {
                    ScalingList scalingList;
                    if (i < 6) {
                        cAVLCWriter.writeBool(this.scalingMatrix.ScalingList4x4[i] != null, "SPS: ");
                        if (this.scalingMatrix.ScalingList4x4[i] != null) {
                            scalingList = this.scalingMatrix.ScalingList4x4[i];
                        } else {
                        }
                    } else {
                        int i2 = i - 6;
                        cAVLCWriter.writeBool(this.scalingMatrix.ScalingList8x8[i2] != null, "SPS: ");
                        if (this.scalingMatrix.ScalingList8x8[i2] != null) {
                            scalingList = this.scalingMatrix.ScalingList8x8[i2];
                        } else {
                        }
                    }
                    scalingList.write(cAVLCWriter);
                }
            }
        }
        cAVLCWriter.writeUE(this.log2_max_frame_num_minus4, "SPS: log2_max_frame_num_minus4");
        cAVLCWriter.writeUE(this.pic_order_cnt_type, "SPS: pic_order_cnt_type");
        if (this.pic_order_cnt_type == 0) {
            cAVLCWriter.writeUE(this.log2_max_pic_order_cnt_lsb_minus4, "SPS: log2_max_pic_order_cnt_lsb_minus4");
        } else if (this.pic_order_cnt_type == 1) {
            cAVLCWriter.writeBool(this.delta_pic_order_always_zero_flag, "SPS: delta_pic_order_always_zero_flag");
            cAVLCWriter.writeSE(this.offset_for_non_ref_pic, "SPS: offset_for_non_ref_pic");
            cAVLCWriter.writeSE(this.offset_for_top_to_bottom_field, "SPS: offset_for_top_to_bottom_field");
            cAVLCWriter.writeUE(this.offsetForRefFrame.length, "SPS: ");
            for (int writeSE : this.offsetForRefFrame) {
                cAVLCWriter.writeSE(writeSE, "SPS: ");
            }
        }
        cAVLCWriter.writeUE(this.num_ref_frames, "SPS: num_ref_frames");
        cAVLCWriter.writeBool(this.gaps_in_frame_num_value_allowed_flag, "SPS: gaps_in_frame_num_value_allowed_flag");
        cAVLCWriter.writeUE(this.pic_width_in_mbs_minus1, "SPS: pic_width_in_mbs_minus1");
        cAVLCWriter.writeUE(this.pic_height_in_map_units_minus1, "SPS: pic_height_in_map_units_minus1");
        cAVLCWriter.writeBool(this.frame_mbs_only_flag, "SPS: frame_mbs_only_flag");
        if (!this.frame_mbs_only_flag) {
            cAVLCWriter.writeBool(this.mb_adaptive_frame_field_flag, "SPS: mb_adaptive_frame_field_flag");
        }
        cAVLCWriter.writeBool(this.direct_8x8_inference_flag, "SPS: direct_8x8_inference_flag");
        cAVLCWriter.writeBool(this.frame_cropping_flag, "SPS: frame_cropping_flag");
        if (this.frame_cropping_flag) {
            cAVLCWriter.writeUE(this.frame_crop_left_offset, "SPS: frame_crop_left_offset");
            cAVLCWriter.writeUE(this.frame_crop_right_offset, "SPS: frame_crop_right_offset");
            cAVLCWriter.writeUE(this.frame_crop_top_offset, "SPS: frame_crop_top_offset");
            cAVLCWriter.writeUE(this.frame_crop_bottom_offset, "SPS: frame_crop_bottom_offset");
        }
        if (this.vuiParams != null) {
            z = true;
        }
        cAVLCWriter.writeBool(z, "SPS: ");
        if (this.vuiParams != null) {
            writeVUIParameters(this.vuiParams, cAVLCWriter);
        }
        cAVLCWriter.writeTrailingBits();
    }
}
