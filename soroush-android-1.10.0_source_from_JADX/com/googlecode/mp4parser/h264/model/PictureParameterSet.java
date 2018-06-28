package com.googlecode.mp4parser.h264.model;

import com.googlecode.mp4parser.h264.read.CAVLCReader;
import com.googlecode.mp4parser.h264.write.CAVLCWriter;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class PictureParameterSet extends BitstreamElement {
    public boolean bottom_field_pic_order_in_frame_present_flag;
    public int[] bottom_right;
    public int chroma_qp_index_offset;
    public boolean constrained_intra_pred_flag;
    public boolean deblocking_filter_control_present_flag;
    public boolean entropy_coding_mode_flag;
    public PPSExt extended;
    public int num_ref_idx_l0_active_minus1;
    public int num_ref_idx_l1_active_minus1;
    public int num_slice_groups_minus1;
    public int pic_init_qp_minus26;
    public int pic_init_qs_minus26;
    public int pic_parameter_set_id;
    public boolean redundant_pic_cnt_present_flag;
    public int[] run_length_minus1;
    public int seq_parameter_set_id;
    public boolean slice_group_change_direction_flag;
    public int slice_group_change_rate_minus1;
    public int[] slice_group_id;
    public int slice_group_map_type;
    public int[] top_left;
    public int weighted_bipred_idc;
    public boolean weighted_pred_flag;

    public static class PPSExt {
        public boolean[] pic_scaling_list_present_flag;
        public ScalingMatrix scalindMatrix = new ScalingMatrix();
        public int second_chroma_qp_index_offset;
        public boolean transform_8x8_mode_flag;

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("PPSExt{transform_8x8_mode_flag=");
            stringBuilder.append(this.transform_8x8_mode_flag);
            stringBuilder.append(", scalindMatrix=");
            stringBuilder.append(this.scalindMatrix);
            stringBuilder.append(", second_chroma_qp_index_offset=");
            stringBuilder.append(this.second_chroma_qp_index_offset);
            stringBuilder.append(", pic_scaling_list_present_flag=");
            stringBuilder.append(this.pic_scaling_list_present_flag);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    public static PictureParameterSet read(InputStream inputStream) {
        CAVLCReader cAVLCReader = new CAVLCReader(inputStream);
        PictureParameterSet pictureParameterSet = new PictureParameterSet();
        pictureParameterSet.pic_parameter_set_id = cAVLCReader.readUE("PPS: pic_parameter_set_id");
        pictureParameterSet.seq_parameter_set_id = cAVLCReader.readUE("PPS: seq_parameter_set_id");
        pictureParameterSet.entropy_coding_mode_flag = cAVLCReader.readBool("PPS: entropy_coding_mode_flag");
        pictureParameterSet.bottom_field_pic_order_in_frame_present_flag = cAVLCReader.readBool("PPS: pic_order_present_flag");
        pictureParameterSet.num_slice_groups_minus1 = cAVLCReader.readUE("PPS: num_slice_groups_minus1");
        int i = 0;
        if (pictureParameterSet.num_slice_groups_minus1 > 0) {
            pictureParameterSet.slice_group_map_type = cAVLCReader.readUE("PPS: slice_group_map_type");
            int i2 = 1;
            pictureParameterSet.top_left = new int[(pictureParameterSet.num_slice_groups_minus1 + 1)];
            pictureParameterSet.bottom_right = new int[(pictureParameterSet.num_slice_groups_minus1 + 1)];
            pictureParameterSet.run_length_minus1 = new int[(pictureParameterSet.num_slice_groups_minus1 + 1)];
            int i3;
            if (pictureParameterSet.slice_group_map_type == 0) {
                for (i3 = 0; i3 <= pictureParameterSet.num_slice_groups_minus1; i3++) {
                    pictureParameterSet.run_length_minus1[i3] = cAVLCReader.readUE("PPS: run_length_minus1");
                }
            } else if (pictureParameterSet.slice_group_map_type == 2) {
                for (i3 = 0; i3 < pictureParameterSet.num_slice_groups_minus1; i3++) {
                    pictureParameterSet.top_left[i3] = cAVLCReader.readUE("PPS: top_left");
                    pictureParameterSet.bottom_right[i3] = cAVLCReader.readUE("PPS: bottom_right");
                }
            } else {
                if (!(pictureParameterSet.slice_group_map_type == 3 || pictureParameterSet.slice_group_map_type == 4)) {
                    if (pictureParameterSet.slice_group_map_type != 5) {
                        if (pictureParameterSet.slice_group_map_type == 6) {
                            if (pictureParameterSet.num_slice_groups_minus1 + 1 > 4) {
                                i2 = 3;
                            } else if (pictureParameterSet.num_slice_groups_minus1 + 1 > 2) {
                                i2 = 2;
                            }
                            i3 = cAVLCReader.readUE("PPS: pic_size_in_map_units_minus1");
                            pictureParameterSet.slice_group_id = new int[(i3 + 1)];
                            for (int i4 = 0; i4 <= i3; i4++) {
                                int[] iArr = pictureParameterSet.slice_group_id;
                                StringBuilder stringBuilder = new StringBuilder("PPS: slice_group_id [");
                                stringBuilder.append(i4);
                                stringBuilder.append("]f");
                                iArr[i4] = cAVLCReader.readU(i2, stringBuilder.toString());
                            }
                        }
                    }
                }
                pictureParameterSet.slice_group_change_direction_flag = cAVLCReader.readBool("PPS: slice_group_change_direction_flag");
                pictureParameterSet.slice_group_change_rate_minus1 = cAVLCReader.readUE("PPS: slice_group_change_rate_minus1");
            }
        }
        pictureParameterSet.num_ref_idx_l0_active_minus1 = cAVLCReader.readUE("PPS: num_ref_idx_l0_active_minus1");
        pictureParameterSet.num_ref_idx_l1_active_minus1 = cAVLCReader.readUE("PPS: num_ref_idx_l1_active_minus1");
        pictureParameterSet.weighted_pred_flag = cAVLCReader.readBool("PPS: weighted_pred_flag");
        pictureParameterSet.weighted_bipred_idc = (int) cAVLCReader.readNBit(2, "PPS: weighted_bipred_idc");
        pictureParameterSet.pic_init_qp_minus26 = cAVLCReader.readSE("PPS: pic_init_qp_minus26");
        pictureParameterSet.pic_init_qs_minus26 = cAVLCReader.readSE("PPS: pic_init_qs_minus26");
        pictureParameterSet.chroma_qp_index_offset = cAVLCReader.readSE("PPS: chroma_qp_index_offset");
        pictureParameterSet.deblocking_filter_control_present_flag = cAVLCReader.readBool("PPS: deblocking_filter_control_present_flag");
        pictureParameterSet.constrained_intra_pred_flag = cAVLCReader.readBool("PPS: constrained_intra_pred_flag");
        pictureParameterSet.redundant_pic_cnt_present_flag = cAVLCReader.readBool("PPS: redundant_pic_cnt_present_flag");
        if (cAVLCReader.moreRBSPData()) {
            pictureParameterSet.extended = new PPSExt();
            pictureParameterSet.extended.transform_8x8_mode_flag = cAVLCReader.readBool("PPS: transform_8x8_mode_flag");
            if (cAVLCReader.readBool("PPS: pic_scaling_matrix_present_flag")) {
                while (i < (pictureParameterSet.extended.transform_8x8_mode_flag * 2) + 6) {
                    if (cAVLCReader.readBool("PPS: pic_scaling_list_present_flag")) {
                        pictureParameterSet.extended.scalindMatrix.ScalingList4x4 = new ScalingList[8];
                        pictureParameterSet.extended.scalindMatrix.ScalingList8x8 = new ScalingList[8];
                        if (i < 6) {
                            pictureParameterSet.extended.scalindMatrix.ScalingList4x4[i] = ScalingList.read(cAVLCReader, 16);
                        } else {
                            pictureParameterSet.extended.scalindMatrix.ScalingList8x8[i - 6] = ScalingList.read(cAVLCReader, 64);
                        }
                    }
                    i++;
                }
            }
            pictureParameterSet.extended.second_chroma_qp_index_offset = cAVLCReader.readSE("PPS: second_chroma_qp_index_offset");
        }
        cAVLCReader.readTrailingBits();
        return pictureParameterSet;
    }

    public static PictureParameterSet read(byte[] bArr) {
        return read(new ByteArrayInputStream(bArr));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PictureParameterSet pictureParameterSet = (PictureParameterSet) obj;
        if (!Arrays.equals(this.bottom_right, pictureParameterSet.bottom_right) || this.chroma_qp_index_offset != pictureParameterSet.chroma_qp_index_offset || this.constrained_intra_pred_flag != pictureParameterSet.constrained_intra_pred_flag || this.deblocking_filter_control_present_flag != pictureParameterSet.deblocking_filter_control_present_flag || this.entropy_coding_mode_flag != pictureParameterSet.entropy_coding_mode_flag) {
            return false;
        }
        if (this.extended == null) {
            if (pictureParameterSet.extended != null) {
                return false;
            }
        } else if (!this.extended.equals(pictureParameterSet.extended)) {
            return false;
        }
        return this.num_ref_idx_l0_active_minus1 == pictureParameterSet.num_ref_idx_l0_active_minus1 && this.num_ref_idx_l1_active_minus1 == pictureParameterSet.num_ref_idx_l1_active_minus1 && this.num_slice_groups_minus1 == pictureParameterSet.num_slice_groups_minus1 && this.pic_init_qp_minus26 == pictureParameterSet.pic_init_qp_minus26 && this.pic_init_qs_minus26 == pictureParameterSet.pic_init_qs_minus26 && this.bottom_field_pic_order_in_frame_present_flag == pictureParameterSet.bottom_field_pic_order_in_frame_present_flag && this.pic_parameter_set_id == pictureParameterSet.pic_parameter_set_id && this.redundant_pic_cnt_present_flag == pictureParameterSet.redundant_pic_cnt_present_flag && Arrays.equals(this.run_length_minus1, pictureParameterSet.run_length_minus1) && this.seq_parameter_set_id == pictureParameterSet.seq_parameter_set_id && this.slice_group_change_direction_flag == pictureParameterSet.slice_group_change_direction_flag && this.slice_group_change_rate_minus1 == pictureParameterSet.slice_group_change_rate_minus1 && Arrays.equals(this.slice_group_id, pictureParameterSet.slice_group_id) && this.slice_group_map_type == pictureParameterSet.slice_group_map_type && Arrays.equals(this.top_left, pictureParameterSet.top_left) && this.weighted_bipred_idc == pictureParameterSet.weighted_bipred_idc && this.weighted_pred_flag == pictureParameterSet.weighted_pred_flag;
    }

    public int hashCode() {
        int i = 1237;
        int hashCode = 31 * (((((((((((((((((((((((((((((((((((((((((((Arrays.hashCode(this.bottom_right) + 31) * 31) + this.chroma_qp_index_offset) * 31) + (this.constrained_intra_pred_flag ? 1231 : 1237)) * 31) + (this.deblocking_filter_control_present_flag ? 1231 : 1237)) * 31) + (this.entropy_coding_mode_flag ? 1231 : 1237)) * 31) + (this.extended == null ? 0 : this.extended.hashCode())) * 31) + this.num_ref_idx_l0_active_minus1) * 31) + this.num_ref_idx_l1_active_minus1) * 31) + this.num_slice_groups_minus1) * 31) + this.pic_init_qp_minus26) * 31) + this.pic_init_qs_minus26) * 31) + (this.bottom_field_pic_order_in_frame_present_flag ? 1231 : 1237)) * 31) + this.pic_parameter_set_id) * 31) + (this.redundant_pic_cnt_present_flag ? 1231 : 1237)) * 31) + Arrays.hashCode(this.run_length_minus1)) * 31) + this.seq_parameter_set_id) * 31) + (this.slice_group_change_direction_flag ? 1231 : 1237)) * 31) + this.slice_group_change_rate_minus1) * 31) + Arrays.hashCode(this.slice_group_id)) * 31) + this.slice_group_map_type) * 31) + Arrays.hashCode(this.top_left)) * 31) + this.weighted_bipred_idc);
        if (this.weighted_pred_flag) {
            i = 1231;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("PictureParameterSet{\n       entropy_coding_mode_flag=");
        stringBuilder.append(this.entropy_coding_mode_flag);
        stringBuilder.append(",\n       num_ref_idx_l0_active_minus1=");
        stringBuilder.append(this.num_ref_idx_l0_active_minus1);
        stringBuilder.append(",\n       num_ref_idx_l1_active_minus1=");
        stringBuilder.append(this.num_ref_idx_l1_active_minus1);
        stringBuilder.append(",\n       slice_group_change_rate_minus1=");
        stringBuilder.append(this.slice_group_change_rate_minus1);
        stringBuilder.append(",\n       pic_parameter_set_id=");
        stringBuilder.append(this.pic_parameter_set_id);
        stringBuilder.append(",\n       seq_parameter_set_id=");
        stringBuilder.append(this.seq_parameter_set_id);
        stringBuilder.append(",\n       pic_order_present_flag=");
        stringBuilder.append(this.bottom_field_pic_order_in_frame_present_flag);
        stringBuilder.append(",\n       num_slice_groups_minus1=");
        stringBuilder.append(this.num_slice_groups_minus1);
        stringBuilder.append(",\n       slice_group_map_type=");
        stringBuilder.append(this.slice_group_map_type);
        stringBuilder.append(",\n       weighted_pred_flag=");
        stringBuilder.append(this.weighted_pred_flag);
        stringBuilder.append(",\n       weighted_bipred_idc=");
        stringBuilder.append(this.weighted_bipred_idc);
        stringBuilder.append(",\n       pic_init_qp_minus26=");
        stringBuilder.append(this.pic_init_qp_minus26);
        stringBuilder.append(",\n       pic_init_qs_minus26=");
        stringBuilder.append(this.pic_init_qs_minus26);
        stringBuilder.append(",\n       chroma_qp_index_offset=");
        stringBuilder.append(this.chroma_qp_index_offset);
        stringBuilder.append(",\n       deblocking_filter_control_present_flag=");
        stringBuilder.append(this.deblocking_filter_control_present_flag);
        stringBuilder.append(",\n       constrained_intra_pred_flag=");
        stringBuilder.append(this.constrained_intra_pred_flag);
        stringBuilder.append(",\n       redundant_pic_cnt_present_flag=");
        stringBuilder.append(this.redundant_pic_cnt_present_flag);
        stringBuilder.append(",\n       top_left=");
        stringBuilder.append(this.top_left);
        stringBuilder.append(",\n       bottom_right=");
        stringBuilder.append(this.bottom_right);
        stringBuilder.append(",\n       run_length_minus1=");
        stringBuilder.append(this.run_length_minus1);
        stringBuilder.append(",\n       slice_group_change_direction_flag=");
        stringBuilder.append(this.slice_group_change_direction_flag);
        stringBuilder.append(",\n       slice_group_id=");
        stringBuilder.append(this.slice_group_id);
        stringBuilder.append(",\n       extended=");
        stringBuilder.append(this.extended);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void write(OutputStream outputStream) {
        int i;
        int i2;
        CAVLCWriter cAVLCWriter = new CAVLCWriter(outputStream);
        cAVLCWriter.writeUE(this.pic_parameter_set_id, "PPS: pic_parameter_set_id");
        cAVLCWriter.writeUE(this.seq_parameter_set_id, "PPS: seq_parameter_set_id");
        cAVLCWriter.writeBool(this.entropy_coding_mode_flag, "PPS: entropy_coding_mode_flag");
        cAVLCWriter.writeBool(this.bottom_field_pic_order_in_frame_present_flag, "PPS: pic_order_present_flag");
        cAVLCWriter.writeUE(this.num_slice_groups_minus1, "PPS: num_slice_groups_minus1");
        if (this.num_slice_groups_minus1 > 0) {
            cAVLCWriter.writeUE(this.slice_group_map_type, "PPS: slice_group_map_type");
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            int[] iArr3 = new int[1];
            if (this.slice_group_map_type == 0) {
                for (i = 0; i <= this.num_slice_groups_minus1; i++) {
                    cAVLCWriter.writeUE(iArr3[i], "PPS: ");
                }
            } else if (this.slice_group_map_type == 2) {
                for (i2 = 0; i2 < this.num_slice_groups_minus1; i2++) {
                    cAVLCWriter.writeUE(iArr[i2], "PPS: ");
                    cAVLCWriter.writeUE(iArr2[i2], "PPS: ");
                }
            } else {
                int i3 = 3;
                if (!(this.slice_group_map_type == 3 || this.slice_group_map_type == 4)) {
                    if (this.slice_group_map_type != 5) {
                        if (this.slice_group_map_type == 6) {
                            if (this.num_slice_groups_minus1 + 1 <= 4) {
                                i3 = this.num_slice_groups_minus1 + 1 > 2 ? 2 : 1;
                            }
                            cAVLCWriter.writeUE(this.slice_group_id.length, "PPS: ");
                            for (i = 0; i <= this.slice_group_id.length; i++) {
                                cAVLCWriter.writeU(this.slice_group_id[i], i3);
                            }
                        }
                    }
                }
                cAVLCWriter.writeBool(this.slice_group_change_direction_flag, "PPS: slice_group_change_direction_flag");
                cAVLCWriter.writeUE(this.slice_group_change_rate_minus1, "PPS: slice_group_change_rate_minus1");
            }
        }
        cAVLCWriter.writeUE(this.num_ref_idx_l0_active_minus1, "PPS: num_ref_idx_l0_active_minus1");
        cAVLCWriter.writeUE(this.num_ref_idx_l1_active_minus1, "PPS: num_ref_idx_l1_active_minus1");
        cAVLCWriter.writeBool(this.weighted_pred_flag, "PPS: weighted_pred_flag");
        cAVLCWriter.writeNBit((long) this.weighted_bipred_idc, 2, "PPS: weighted_bipred_idc");
        cAVLCWriter.writeSE(this.pic_init_qp_minus26, "PPS: pic_init_qp_minus26");
        cAVLCWriter.writeSE(this.pic_init_qs_minus26, "PPS: pic_init_qs_minus26");
        cAVLCWriter.writeSE(this.chroma_qp_index_offset, "PPS: chroma_qp_index_offset");
        cAVLCWriter.writeBool(this.deblocking_filter_control_present_flag, "PPS: deblocking_filter_control_present_flag");
        cAVLCWriter.writeBool(this.constrained_intra_pred_flag, "PPS: constrained_intra_pred_flag");
        cAVLCWriter.writeBool(this.redundant_pic_cnt_present_flag, "PPS: redundant_pic_cnt_present_flag");
        if (this.extended != null) {
            cAVLCWriter.writeBool(this.extended.transform_8x8_mode_flag, "PPS: transform_8x8_mode_flag");
            cAVLCWriter.writeBool(this.extended.scalindMatrix != null, "PPS: scalindMatrix");
            if (this.extended.scalindMatrix != null) {
                for (i = 0; i < (this.extended.transform_8x8_mode_flag * 2) + 6; i++) {
                    ScalingList scalingList;
                    if (i < 6) {
                        cAVLCWriter.writeBool(this.extended.scalindMatrix.ScalingList4x4[i] != null, "PPS: ");
                        if (this.extended.scalindMatrix.ScalingList4x4[i] != null) {
                            scalingList = this.extended.scalindMatrix.ScalingList4x4[i];
                        } else {
                        }
                    } else {
                        i2 = i - 6;
                        cAVLCWriter.writeBool(this.extended.scalindMatrix.ScalingList8x8[i2] != null, "PPS: ");
                        if (this.extended.scalindMatrix.ScalingList8x8[i2] != null) {
                            scalingList = this.extended.scalindMatrix.ScalingList8x8[i2];
                        } else {
                        }
                    }
                    scalingList.write(cAVLCWriter);
                }
            }
            cAVLCWriter.writeSE(this.extended.second_chroma_qp_index_offset, "PPS: ");
        }
        cAVLCWriter.writeTrailingBits();
    }
}
