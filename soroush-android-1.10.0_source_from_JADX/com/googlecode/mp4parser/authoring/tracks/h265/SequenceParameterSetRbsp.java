package com.googlecode.mp4parser.authoring.tracks.h265;

import com.googlecode.mp4parser.h264.read.CAVLCReader;
import java.io.InputStream;
import java.lang.reflect.Array;

public class SequenceParameterSetRbsp {
    public SequenceParameterSetRbsp(InputStream inputStream) {
        CAVLCReader cAVLCReader = new CAVLCReader(inputStream);
        cAVLCReader.readNBit(4, "sps_video_parameter_set_id");
        int readNBit = (int) cAVLCReader.readNBit(3, "sps_max_sub_layers_minus1");
        cAVLCReader.readBool("sps_temporal_id_nesting_flag");
        profile_tier_level(readNBit, cAVLCReader);
        cAVLCReader.readUE("sps_seq_parameter_set_id");
        if (cAVLCReader.readUE("chroma_format_idc") == 3) {
            cAVLCReader.read1Bit();
            cAVLCReader.readUE("pic_width_in_luma_samples");
            cAVLCReader.readUE("pic_width_in_luma_samples");
            if (cAVLCReader.readBool("conformance_window_flag")) {
                cAVLCReader.readUE("conf_win_left_offset");
                cAVLCReader.readUE("conf_win_right_offset");
                cAVLCReader.readUE("conf_win_top_offset");
                cAVLCReader.readUE("conf_win_bottom_offset");
            }
        }
        cAVLCReader.readUE("bit_depth_luma_minus8");
        cAVLCReader.readUE("bit_depth_chroma_minus8");
        cAVLCReader.readUE("log2_max_pic_order_cnt_lsb_minus4");
        boolean readBool = cAVLCReader.readBool("sps_sub_layer_ordering_info_present_flag");
        int i = 0;
        int i2 = (readNBit - (readBool ? 0 : readNBit)) + 1;
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int[] iArr3 = new int[i2];
        if (!readBool) {
            i = readNBit;
        }
        while (i <= readNBit) {
            StringBuilder stringBuilder = new StringBuilder("sps_max_dec_pic_buffering_minus1[");
            stringBuilder.append(i);
            stringBuilder.append("]");
            iArr[i] = cAVLCReader.readUE(stringBuilder.toString());
            stringBuilder = new StringBuilder("sps_max_num_reorder_pics[");
            stringBuilder.append(i);
            stringBuilder.append("]");
            iArr2[i] = cAVLCReader.readUE(stringBuilder.toString());
            stringBuilder = new StringBuilder("sps_max_latency_increase_plus1[");
            stringBuilder.append(i);
            stringBuilder.append("]");
            iArr3[i] = cAVLCReader.readUE(stringBuilder.toString());
            i++;
        }
        cAVLCReader.readUE("log2_min_luma_coding_block_size_minus3");
        cAVLCReader.readUE("log2_diff_max_min_luma_coding_block_size");
        cAVLCReader.readUE("log2_min_transform_block_size_minus2");
        cAVLCReader.readUE("log2_diff_max_min_transform_block_size");
        cAVLCReader.readUE("max_transform_hierarchy_depth_inter");
        cAVLCReader.readUE("max_transform_hierarchy_depth_intra");
        if (cAVLCReader.readBool("scaling_list_enabled_flag") && cAVLCReader.readBool("sps_scaling_list_data_present_flag")) {
            scaling_list_data(cAVLCReader);
        }
        cAVLCReader.readBool("amp_enabled_flag");
        cAVLCReader.readBool("sample_adaptive_offset_enabled_flag");
        if (cAVLCReader.readBool("pcm_enabled_flag")) {
            cAVLCReader.readNBit(4, "pcm_sample_bit_depth_luma_minus1");
            cAVLCReader.readNBit(4, "pcm_sample_bit_depth_chroma_minus1");
            cAVLCReader.readUE("log2_min_pcm_luma_coding_block_size_minus3");
        }
    }

    private void profile_tier_level(int i, CAVLCReader cAVLCReader) {
        int i2 = i;
        CAVLCReader cAVLCReader2 = cAVLCReader;
        int i3 = 2;
        cAVLCReader2.readU(2, "general_profile_space");
        cAVLCReader2.readBool("general_tier_flag");
        cAVLCReader2.readU(5, "general_profile_idc");
        int i4 = 32;
        boolean[] zArr = new boolean[32];
        int i5 = 0;
        while (i5 < i4) {
            zArr[i5] = cAVLCReader.readBool();
            i5++;
            i2 = i;
            i4 = 32;
            i3 = 2;
        }
        cAVLCReader2.readBool("general_progressive_source_flag");
        cAVLCReader2.readBool("general_interlaced_source_flag");
        cAVLCReader2.readBool("general_non_packed_constraint_flag");
        cAVLCReader2.readBool("general_frame_only_constraint_flag");
        cAVLCReader2.readNBit(44, "general_reserved_zero_44bits");
        cAVLCReader.readByte();
        boolean[] zArr2 = new boolean[i2];
        boolean[] zArr3 = new boolean[i2];
        int i6 = 0;
        while (i6 < i2) {
            StringBuilder stringBuilder = new StringBuilder("sub_layer_profile_present_flag[");
            stringBuilder.append(i6);
            stringBuilder.append("]");
            zArr2[i6] = cAVLCReader2.readBool(stringBuilder.toString());
            stringBuilder = new StringBuilder("sub_layer_level_present_flag[");
            stringBuilder.append(i6);
            stringBuilder.append("]");
            zArr3[i6] = cAVLCReader2.readBool(stringBuilder.toString());
            i6++;
            i2 = i;
            i4 = 32;
            i3 = 2;
        }
        if (i2 > 0) {
            int[] iArr = new int[8];
            for (int i7 = i2; i7 < 8; i7++) {
                StringBuilder stringBuilder2 = new StringBuilder("reserved_zero_2bits[");
                stringBuilder2.append(i7);
                stringBuilder2.append("]");
                iArr[i7] = cAVLCReader2.readU(i3, stringBuilder2.toString());
            }
        }
        int[] iArr2 = new int[i2];
        boolean[] zArr4 = new boolean[i2];
        int[] iArr3 = new int[i2];
        boolean[][] zArr5 = (boolean[][]) Array.newInstance(boolean.class, new int[]{i2, i4});
        boolean[] zArr6 = new boolean[i2];
        zArr = new boolean[i2];
        boolean[] zArr7 = new boolean[i2];
        boolean[] zArr8 = new boolean[i2];
        long[] jArr = new long[i2];
        int[] iArr4 = new int[i2];
        int i8 = 0;
        while (i8 < i2) {
            boolean[] zArr9;
            if (zArr2[i8]) {
                StringBuilder stringBuilder3 = new StringBuilder("sub_layer_profile_space[");
                stringBuilder3.append(i8);
                stringBuilder3.append("]");
                iArr2[i8] = cAVLCReader2.readU(2, stringBuilder3.toString());
                stringBuilder = new StringBuilder("sub_layer_tier_flag[");
                stringBuilder.append(i8);
                stringBuilder.append("]");
                zArr4[i8] = cAVLCReader2.readBool(stringBuilder.toString());
                stringBuilder = new StringBuilder("sub_layer_profile_idc[");
                stringBuilder.append(i8);
                stringBuilder.append("]");
                iArr3[i8] = cAVLCReader2.readU(5, stringBuilder.toString());
                i2 = 0;
                while (i2 < 32) {
                    boolean[] zArr10 = zArr5[i8];
                    zArr9 = zArr;
                    stringBuilder3 = new StringBuilder("sub_layer_profile_compatibility_flag[");
                    stringBuilder3.append(i8);
                    stringBuilder3.append("][");
                    stringBuilder3.append(i2);
                    stringBuilder3.append("]");
                    zArr10[i2] = cAVLCReader2.readBool(stringBuilder3.toString());
                    i2++;
                    zArr = zArr9;
                }
                stringBuilder = new StringBuilder("sub_layer_progressive_source_flag[");
                stringBuilder.append(i8);
                stringBuilder.append("]");
                zArr6[i8] = cAVLCReader2.readBool(stringBuilder.toString());
                stringBuilder = new StringBuilder("sub_layer_interlaced_source_flag[");
                stringBuilder.append(i8);
                stringBuilder.append("]");
                zArr[i8] = cAVLCReader2.readBool(stringBuilder.toString());
                stringBuilder = new StringBuilder("sub_layer_non_packed_constraint_flag[");
                stringBuilder.append(i8);
                stringBuilder.append("]");
                zArr7[i8] = cAVLCReader2.readBool(stringBuilder.toString());
                stringBuilder = new StringBuilder("sub_layer_frame_only_constraint_flag[");
                stringBuilder.append(i8);
                stringBuilder.append("]");
                zArr8[i8] = cAVLCReader2.readBool(stringBuilder.toString());
                jArr[i8] = cAVLCReader2.readNBit(44);
            }
            zArr9 = zArr;
            if (zArr3[i8]) {
                stringBuilder = new StringBuilder("sub_layer_level_idc[");
                stringBuilder.append(i8);
                stringBuilder.append("]");
                iArr4[i8] = cAVLCReader2.readU(8, stringBuilder.toString());
            }
            i8++;
            zArr = zArr9;
            i2 = i;
        }
    }

    private void scaling_list_data(CAVLCReader cAVLCReader) {
        CAVLCReader cAVLCReader2 = cAVLCReader;
        boolean[][] zArr = new boolean[4][];
        int[][] iArr = new int[4][];
        int[][] iArr2 = new int[2][];
        int[][][] iArr3 = new int[4][][];
        int i = 0;
        while (i < 4) {
            int i2 = 0;
            while (true) {
                int i3 = 6;
                if (i2 >= (i == 3 ? 2 : 6)) {
                    break;
                }
                zArr[i] = new boolean[(i == 3 ? 2 : 6)];
                iArr[i] = new int[(i == 3 ? 2 : 6)];
                if (i == 3) {
                    i3 = 2;
                }
                iArr3[i] = new int[i3][];
                zArr[i][i2] = cAVLCReader.readBool();
                if (zArr[i][i2]) {
                    int i4;
                    i3 = Math.min(64, 1 << ((i << 1) + 4));
                    int i5 = 8;
                    if (i > 1) {
                        i4 = i - 2;
                        int[] iArr4 = iArr2[i4];
                        StringBuilder stringBuilder = new StringBuilder("scaling_list_dc_coef_minus8[");
                        stringBuilder.append(i);
                        stringBuilder.append("- 2][");
                        stringBuilder.append(i2);
                        stringBuilder.append("]");
                        iArr4[i2] = cAVLCReader2.readSE(stringBuilder.toString());
                        i5 = 8 + iArr2[i4][i2];
                    }
                    iArr3[i][i2] = new int[i3];
                    i4 = i5;
                    for (i5 = 0; i5 < i3; i5++) {
                        i4 = ((i4 + cAVLCReader2.readSE("scaling_list_delta_coef ")) + 256) % 256;
                        iArr3[i][i2][i5] = i4;
                    }
                } else {
                    int[] iArr5 = iArr[i];
                    StringBuilder stringBuilder2 = new StringBuilder("scaling_list_pred_matrix_id_delta[");
                    stringBuilder2.append(i);
                    stringBuilder2.append("][");
                    stringBuilder2.append(i2);
                    stringBuilder2.append("]");
                    iArr5[i2] = cAVLCReader2.readUE(stringBuilder2.toString());
                }
                i2++;
            }
            i++;
        }
    }
}
