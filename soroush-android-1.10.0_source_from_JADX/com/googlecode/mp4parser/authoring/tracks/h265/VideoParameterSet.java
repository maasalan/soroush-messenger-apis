package com.googlecode.mp4parser.authoring.tracks.h265;

import com.googlecode.mp4parser.h264.read.CAVLCReader;
import com.googlecode.mp4parser.util.ByteBufferByteChannel;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;

public class VideoParameterSet {
    ByteBuffer vps;
    int vps_parameter_set_id;

    public VideoParameterSet(ByteBuffer byteBuffer) {
        this.vps = byteBuffer;
        CAVLCReader cAVLCReader = new CAVLCReader(Channels.newInputStream(new ByteBufferByteChannel((ByteBuffer) byteBuffer.position(0))));
        this.vps_parameter_set_id = cAVLCReader.readU(4, "vps_parameter_set_id");
        cAVLCReader.readU(2, "vps_reserved_three_2bits");
        cAVLCReader.readU(6, "vps_max_layers_minus1");
        int readU = cAVLCReader.readU(3, "vps_max_sub_layers_minus1");
        cAVLCReader.readBool("vps_temporal_id_nesting_flag");
        cAVLCReader.readU(16, "vps_reserved_0xffff_16bits");
        profile_tier_level(readU, cAVLCReader);
        boolean readBool = cAVLCReader.readBool("vps_sub_layer_ordering_info_present_flag");
        int[] iArr = new int[(readBool ? 1 : readU + 1)];
        int[] iArr2 = new int[(readBool ? 1 : readU + 1)];
        int[] iArr3 = new int[(readBool ? 1 : readU + 1)];
        int i = readBool ? 0 : readU;
        while (i <= readU) {
            StringBuilder stringBuilder = new StringBuilder("vps_max_dec_pic_buffering_minus1[");
            stringBuilder.append(i);
            stringBuilder.append("]");
            iArr[i] = cAVLCReader.readUE(stringBuilder.toString());
            stringBuilder = new StringBuilder("vps_max_dec_pic_buffering_minus1[");
            stringBuilder.append(i);
            stringBuilder.append("]");
            iArr2[i] = cAVLCReader.readUE(stringBuilder.toString());
            stringBuilder = new StringBuilder("vps_max_dec_pic_buffering_minus1[");
            stringBuilder.append(i);
            stringBuilder.append("]");
            iArr3[i] = cAVLCReader.readUE(stringBuilder.toString());
            i++;
        }
        int readU2 = cAVLCReader.readU(6, "vps_max_layer_id");
        int readUE = cAVLCReader.readUE("vps_num_layer_sets_minus1");
        boolean[][] zArr = (boolean[][]) Array.newInstance(boolean.class, new int[]{readUE, readU2});
        for (int i2 = 1; i2 <= readUE; i2++) {
            int i3;
            for (i3 = 0; i3 <= readU2; i3++) {
                boolean[] zArr2 = zArr[i2];
                StringBuilder stringBuilder2 = new StringBuilder("layer_id_included_flag[");
                stringBuilder2.append(i2);
                stringBuilder2.append("][");
                stringBuilder2.append(i3);
                stringBuilder2.append("]");
                zArr2[i3] = cAVLCReader.readBool(stringBuilder2.toString());
            }
        }
        if (cAVLCReader.readBool("vps_timing_info_present_flag")) {
            cAVLCReader.readU(32, "vps_num_units_in_tick");
            cAVLCReader.readU(32, "vps_time_scale");
            if (cAVLCReader.readBool("vps_poc_proportional_to_timing_flag")) {
                cAVLCReader.readUE("vps_num_ticks_poc_diff_one_minus1");
            }
            i3 = cAVLCReader.readUE("vps_num_hrd_parameters");
            int[] iArr4 = new int[i3];
            boolean[] zArr3 = new boolean[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                StringBuilder stringBuilder3 = new StringBuilder("hrd_layer_set_idx[");
                stringBuilder3.append(i4);
                stringBuilder3.append("]");
                iArr4[i4] = cAVLCReader.readUE(stringBuilder3.toString());
                if (i4 > 0) {
                    stringBuilder3 = new StringBuilder("cprms_present_flag[");
                    stringBuilder3.append(i4);
                    stringBuilder3.append("]");
                    zArr3[i4] = cAVLCReader.readBool(stringBuilder3.toString());
                } else {
                    zArr3[0] = true;
                }
                hrd_parameters(zArr3[i4], readU, cAVLCReader);
            }
        }
        if (cAVLCReader.readBool("vps_extension_flag")) {
            while (cAVLCReader.moreRBSPData()) {
                cAVLCReader.readBool("vps_extension_data_flag");
            }
        }
        cAVLCReader.readTrailingBits();
    }

    private void hrd_parameters(boolean z, int i, CAVLCReader cAVLCReader) {
        boolean readBool;
        boolean z2;
        int i2 = 0;
        if (z) {
            z = cAVLCReader.readBool("nal_hrd_parameters_present_flag");
            readBool = cAVLCReader.readBool("vcl_hrd_parameters_present_flag");
            if (!z) {
                if (!readBool) {
                    z2 = false;
                }
            }
            z2 = cAVLCReader.readBool("sub_pic_hrd_params_present_flag");
            if (z2) {
                cAVLCReader.readU(8, "tick_divisor_minus2");
                cAVLCReader.readU(5, "du_cpb_removal_delay_increment_length_minus1");
                cAVLCReader.readBool("sub_pic_cpb_params_in_pic_timing_sei_flag");
                cAVLCReader.readU(5, "dpb_output_delay_du_length_minus1");
            }
            cAVLCReader.readU(4, "bit_rate_scale");
            cAVLCReader.readU(4, "cpb_size_scale");
            if (z2) {
                cAVLCReader.readU(4, "cpb_size_du_scale");
            }
            cAVLCReader.readU(5, "initial_cpb_removal_delay_length_minus1");
            cAVLCReader.readU(5, "au_cpb_removal_delay_length_minus1");
            cAVLCReader.readU(5, "dpb_output_delay_length_minus1");
        } else {
            z = false;
            readBool = z;
            z2 = readBool;
        }
        boolean[] zArr = new boolean[i];
        boolean[] zArr2 = new boolean[i];
        boolean[] zArr3 = new boolean[i];
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        while (i2 <= i) {
            StringBuilder stringBuilder = new StringBuilder("fixed_pic_rate_general_flag[");
            stringBuilder.append(i2);
            stringBuilder.append("]");
            zArr[i2] = cAVLCReader.readBool(stringBuilder.toString());
            if (!zArr[i2]) {
                stringBuilder = new StringBuilder("fixed_pic_rate_within_cvs_flag[");
                stringBuilder.append(i2);
                stringBuilder.append("]");
                zArr2[i2] = cAVLCReader.readBool(stringBuilder.toString());
            }
            if (zArr2[i2]) {
                stringBuilder = new StringBuilder("elemental_duration_in_tc_minus1[");
                stringBuilder.append(i2);
                stringBuilder.append("]");
                iArr2[i2] = cAVLCReader.readUE(stringBuilder.toString());
            } else {
                stringBuilder = new StringBuilder("low_delay_hrd_flag[");
                stringBuilder.append(i2);
                stringBuilder.append("]");
                zArr3[i2] = cAVLCReader.readBool(stringBuilder.toString());
            }
            if (!zArr3[i2]) {
                stringBuilder = new StringBuilder("cpb_cnt_minus1[");
                stringBuilder.append(i2);
                stringBuilder.append("]");
                iArr[i2] = cAVLCReader.readUE(stringBuilder.toString());
            }
            if (z) {
                sub_layer_hrd_parameters(i2, iArr[i2], z2, cAVLCReader);
            }
            if (readBool) {
                sub_layer_hrd_parameters(i2, iArr[i2], z2, cAVLCReader);
            }
            i2++;
        }
    }

    public void profile_tier_level(int i, CAVLCReader cAVLCReader) {
        int i2 = i;
        CAVLCReader cAVLCReader2 = cAVLCReader;
        int i3 = 2;
        cAVLCReader2.readU(2, "general_profile_space ");
        cAVLCReader2.readBool("general_tier_flag");
        cAVLCReader2.readU(5, "general_profile_idc");
        int i4 = 32;
        boolean[] zArr = new boolean[32];
        int i5 = 0;
        while (i5 < i4) {
            StringBuilder stringBuilder = new StringBuilder("general_profile_compatibility_flag[");
            stringBuilder.append(i5);
            stringBuilder.append("]");
            zArr[i5] = cAVLCReader2.readBool(stringBuilder.toString());
            i5++;
            i2 = i;
            i4 = 32;
            i3 = 2;
        }
        cAVLCReader2.readBool("general_progressive_source_flag");
        cAVLCReader2.readBool("general_interlaced_source_flag");
        cAVLCReader2.readBool("general_non_packed_constraint_flag");
        cAVLCReader2.readBool("general_frame_only_constraint_flag");
        cAVLCReader2.readU(44, "general_reserved_zero_44bits");
        cAVLCReader2.readU(8, "general_level_idc");
        boolean[] zArr2 = new boolean[i2];
        boolean[] zArr3 = new boolean[i2];
        int i6 = 0;
        while (i6 < i2) {
            i3 = 8;
            stringBuilder = new StringBuilder("sub_layer_profile_present_flag[");
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
            for (i6 = i2; i6 < 8; i6++) {
                cAVLCReader2.readU(i3, "reserved_zero_2bits");
            }
        }
        int[] iArr = new int[i2];
        boolean[] zArr4 = new boolean[i2];
        int[] iArr2 = new int[i2];
        boolean[][] zArr5 = (boolean[][]) Array.newInstance(boolean.class, new int[]{i2, i4});
        boolean[] zArr6 = new boolean[i2];
        zArr = new boolean[i2];
        boolean[] zArr7 = new boolean[i2];
        boolean[] zArr8 = new boolean[i2];
        int[] iArr3 = new int[i2];
        i4 = 0;
        while (i4 < i2) {
            if (zArr2[i4]) {
                StringBuilder stringBuilder2 = new StringBuilder("sub_layer_profile_space[");
                stringBuilder2.append(i4);
                stringBuilder2.append("]");
                iArr[i4] = cAVLCReader2.readU(2, stringBuilder2.toString());
                StringBuilder stringBuilder3 = new StringBuilder("sub_layer_tier_flag[");
                stringBuilder3.append(i4);
                stringBuilder3.append("]");
                zArr4[i4] = cAVLCReader2.readBool(stringBuilder3.toString());
                stringBuilder3 = new StringBuilder("sub_layer_profile_idc[");
                stringBuilder3.append(i4);
                stringBuilder3.append("]");
                iArr2[i4] = cAVLCReader2.readU(5, stringBuilder3.toString());
                i3 = 0;
                while (i3 < 32) {
                    boolean[] zArr9 = zArr5[i4];
                    stringBuilder2 = new StringBuilder("sub_layer_profile_compatibility_flag[");
                    stringBuilder2.append(i4);
                    stringBuilder2.append("][");
                    stringBuilder2.append(i3);
                    stringBuilder2.append("]");
                    zArr9[i3] = cAVLCReader2.readBool(stringBuilder2.toString());
                    i3++;
                    i2 = i;
                }
                stringBuilder3 = new StringBuilder("sub_layer_progressive_source_flag[");
                stringBuilder3.append(i4);
                stringBuilder3.append("]");
                zArr6[i4] = cAVLCReader2.readBool(stringBuilder3.toString());
                stringBuilder3 = new StringBuilder("sub_layer_interlaced_source_flag[");
                stringBuilder3.append(i4);
                stringBuilder3.append("]");
                zArr[i4] = cAVLCReader2.readBool(stringBuilder3.toString());
                stringBuilder3 = new StringBuilder("sub_layer_non_packed_constraint_flag[");
                stringBuilder3.append(i4);
                stringBuilder3.append("]");
                zArr7[i4] = cAVLCReader2.readBool(stringBuilder3.toString());
                stringBuilder3 = new StringBuilder("sub_layer_frame_only_constraint_flag[");
                stringBuilder3.append(i4);
                stringBuilder3.append("]");
                zArr8[i4] = cAVLCReader2.readBool(stringBuilder3.toString());
                cAVLCReader2.readNBit(44, "reserved");
            }
            if (zArr3[i4]) {
                iArr3[i4] = cAVLCReader2.readU(8, "sub_layer_level_idc");
            }
            i4++;
            i2 = i;
        }
    }

    void sub_layer_hrd_parameters(int i, int i2, boolean z, CAVLCReader cAVLCReader) {
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int[] iArr3 = new int[i2];
        int[] iArr4 = new int[i2];
        boolean[] zArr = new boolean[i2];
        for (int i3 = 0; i3 <= i2; i3++) {
            StringBuilder stringBuilder = new StringBuilder("bit_rate_value_minus1[");
            stringBuilder.append(i3);
            stringBuilder.append("]");
            iArr[i3] = cAVLCReader.readUE(stringBuilder.toString());
            stringBuilder = new StringBuilder("cpb_size_value_minus1[");
            stringBuilder.append(i3);
            stringBuilder.append("]");
            iArr2[i3] = cAVLCReader.readUE(stringBuilder.toString());
            if (z) {
                stringBuilder = new StringBuilder("cpb_size_du_value_minus1[");
                stringBuilder.append(i3);
                stringBuilder.append("]");
                iArr3[i3] = cAVLCReader.readUE(stringBuilder.toString());
                stringBuilder = new StringBuilder("bit_rate_du_value_minus1[");
                stringBuilder.append(i3);
                stringBuilder.append("]");
                iArr4[i3] = cAVLCReader.readUE(stringBuilder.toString());
            }
            stringBuilder = new StringBuilder("cbr_flag[");
            stringBuilder.append(i3);
            stringBuilder.append("]");
            zArr[i3] = cAVLCReader.readBool(stringBuilder.toString());
        }
    }

    public ByteBuffer toByteBuffer() {
        return this.vps;
    }
}
