package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.CompositionTimeToSample.Entry;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.LookAhead;
import com.googlecode.mp4parser.h264.model.HRDParameters;
import com.googlecode.mp4parser.h264.model.PictureParameterSet;
import com.googlecode.mp4parser.h264.model.SeqParameterSet;
import com.googlecode.mp4parser.h264.read.CAVLCReader;
import com.googlecode.mp4parser.util.RangeStartMap;
import com.p149g.p150a.p151b.C6533a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class H264TrackImpl extends AbstractH26XTrack {
    private static final Logger LOG = Logger.getLogger(H264TrackImpl.class.getName());
    PictureParameterSet currentPictureParameterSet;
    SeqParameterSet currentSeqParameterSet;
    private boolean determineFrameRate;
    PictureParameterSet firstPictureParameterSet;
    SeqParameterSet firstSeqParameterSet;
    int frameNrInGop;
    private int frametick;
    private int height;
    private String lang;
    RangeStartMap<Integer, byte[]> pictureParameterRangeMap;
    Map<Integer, PictureParameterSet> ppsIdToPps;
    Map<Integer, byte[]> ppsIdToPpsBytes;
    SampleDescriptionBox sampleDescriptionBox;
    private List<Sample> samples;
    private SEIMessage seiMessage;
    RangeStartMap<Integer, byte[]> seqParameterRangeMap;
    Map<Integer, SeqParameterSet> spsIdToSps;
    Map<Integer, byte[]> spsIdToSpsBytes;
    private long timescale;
    private int width;

    class AnonymousClass1FirstVclNalDetector {
        boolean bottom_field_flag;
        int delta_pic_order_cnt_0;
        int delta_pic_order_cnt_1;
        int delta_pic_order_cnt_bottom;
        boolean field_pic_flag;
        int frame_num;
        boolean idrPicFlag;
        int idr_pic_id;
        int nal_ref_idc;
        int pic_order_cnt_lsb;
        int pic_order_cnt_type;
        int pic_parameter_set_id;

        public AnonymousClass1FirstVclNalDetector(ByteBuffer byteBuffer, int i, int i2) {
            SliceHeader sliceHeader = new SliceHeader(AbstractH26XTrack.cleanBuffer(new ByteBufferBackedInputStream(byteBuffer)), H264TrackImpl.this.spsIdToSps, H264TrackImpl.this.ppsIdToPps, i2 == 5);
            this.frame_num = sliceHeader.frame_num;
            this.pic_parameter_set_id = sliceHeader.pic_parameter_set_id;
            this.field_pic_flag = sliceHeader.field_pic_flag;
            this.bottom_field_flag = sliceHeader.bottom_field_flag;
            this.nal_ref_idc = i;
            this.pic_order_cnt_type = ((SeqParameterSet) H264TrackImpl.this.spsIdToSps.get(Integer.valueOf(((PictureParameterSet) H264TrackImpl.this.ppsIdToPps.get(Integer.valueOf(sliceHeader.pic_parameter_set_id))).seq_parameter_set_id))).pic_order_cnt_type;
            this.delta_pic_order_cnt_bottom = sliceHeader.delta_pic_order_cnt_bottom;
            this.pic_order_cnt_lsb = sliceHeader.pic_order_cnt_lsb;
            this.delta_pic_order_cnt_0 = sliceHeader.delta_pic_order_cnt_0;
            this.delta_pic_order_cnt_1 = sliceHeader.delta_pic_order_cnt_1;
            this.idr_pic_id = sliceHeader.idr_pic_id;
        }

        boolean isFirstInNew(AnonymousClass1FirstVclNalDetector anonymousClass1FirstVclNalDetector) {
            return (anonymousClass1FirstVclNalDetector.frame_num == this.frame_num && anonymousClass1FirstVclNalDetector.pic_parameter_set_id == this.pic_parameter_set_id && anonymousClass1FirstVclNalDetector.field_pic_flag == this.field_pic_flag) ? ((!anonymousClass1FirstVclNalDetector.field_pic_flag || anonymousClass1FirstVclNalDetector.bottom_field_flag == this.bottom_field_flag) && anonymousClass1FirstVclNalDetector.nal_ref_idc == this.nal_ref_idc) ? (anonymousClass1FirstVclNalDetector.pic_order_cnt_type == 0 && this.pic_order_cnt_type == 0 && (anonymousClass1FirstVclNalDetector.pic_order_cnt_lsb != this.pic_order_cnt_lsb || anonymousClass1FirstVclNalDetector.delta_pic_order_cnt_bottom != this.delta_pic_order_cnt_bottom)) ? true : (!(anonymousClass1FirstVclNalDetector.pic_order_cnt_type == 1 && this.pic_order_cnt_type == 1 && (anonymousClass1FirstVclNalDetector.delta_pic_order_cnt_0 != this.delta_pic_order_cnt_0 || anonymousClass1FirstVclNalDetector.delta_pic_order_cnt_1 != this.delta_pic_order_cnt_1)) && anonymousClass1FirstVclNalDetector.idrPicFlag == this.idrPicFlag) ? anonymousClass1FirstVclNalDetector.idrPicFlag && this.idrPicFlag && anonymousClass1FirstVclNalDetector.idr_pic_id != this.idr_pic_id : true : true : true;
        }
    }

    public class ByteBufferBackedInputStream extends InputStream {
        private final ByteBuffer buf;

        public ByteBufferBackedInputStream(ByteBuffer byteBuffer) {
            this.buf = byteBuffer.duplicate();
        }

        public int read() {
            return !this.buf.hasRemaining() ? -1 : this.buf.get() & 255;
        }

        public int read(byte[] bArr, int i, int i2) {
            if (!this.buf.hasRemaining()) {
                return -1;
            }
            i2 = Math.min(i2, this.buf.remaining());
            this.buf.get(bArr, i, i2);
            return i2;
        }
    }

    public class SEIMessage {
        boolean clock_timestamp_flag;
        int cnt_dropped_flag;
        int counting_type;
        int cpb_removal_delay;
        int ct_type;
        int discontinuity_flag;
        int dpb_removal_delay;
        int full_timestamp_flag;
        int hours_value;
        int minutes_value;
        int n_frames;
        int nuit_field_based_flag;
        int payloadSize = 0;
        int payloadType = 0;
        int pic_struct;
        boolean removal_delay_flag;
        int seconds_value;
        SeqParameterSet sps;
        int time_offset;
        int time_offset_length;

        public SEIMessage(InputStream inputStream, SeqParameterSet seqParameterSet) {
            this.sps = seqParameterSet;
            inputStream.read();
            int available = inputStream.available();
            int i = 0;
            while (i < available) {
                this.payloadType = 0;
                this.payloadSize = 0;
                while (true) {
                    int read = inputStream.read();
                    i++;
                    if (read != 255) {
                        this.payloadType += read;
                        while (true) {
                            read = inputStream.read();
                            i++;
                            if (read != 255) {
                                this.payloadSize += read;
                                if (available - i >= this.payloadSize) {
                                    if (this.payloadType != 1) {
                                        read = i;
                                        for (i = 0; i < this.payloadSize; i++) {
                                            inputStream.read();
                                            read++;
                                        }
                                    } else if (seqParameterSet.vuiParams == null || (seqParameterSet.vuiParams.nalHRDParams == null && seqParameterSet.vuiParams.vclHRDParams == null && !seqParameterSet.vuiParams.pic_struct_present_flag)) {
                                        read = i;
                                        for (i = 0; i < this.payloadSize; i++) {
                                            inputStream.read();
                                            read++;
                                        }
                                    } else {
                                        boolean z;
                                        boolean z2;
                                        StringBuilder stringBuilder;
                                        HRDParameters hRDParameters;
                                        byte[] bArr = new byte[this.payloadSize];
                                        inputStream.read(bArr);
                                        i += this.payloadSize;
                                        CAVLCReader cAVLCReader = new CAVLCReader(new ByteArrayInputStream(bArr));
                                        if (seqParameterSet.vuiParams.nalHRDParams == null) {
                                            if (seqParameterSet.vuiParams.vclHRDParams == null) {
                                                this.removal_delay_flag = false;
                                                if (seqParameterSet.vuiParams.pic_struct_present_flag) {
                                                    this.pic_struct = cAVLCReader.readU(4, "SEI: pic_struct");
                                                    switch (this.pic_struct) {
                                                        case 3:
                                                        case 4:
                                                        case 7:
                                                            z = true;
                                                            break;
                                                        case 5:
                                                        case 6:
                                                        case 8:
                                                            z = true;
                                                            break;
                                                        default:
                                                            z = true;
                                                            break;
                                                    }
                                                    for (z2 = false; z2 < z; z2++) {
                                                        stringBuilder = new StringBuilder("pic_timing SEI: clock_timestamp_flag[");
                                                        stringBuilder.append(z2);
                                                        stringBuilder.append("]");
                                                        this.clock_timestamp_flag = cAVLCReader.readBool(stringBuilder.toString());
                                                        if (this.clock_timestamp_flag) {
                                                            this.ct_type = cAVLCReader.readU(2, "pic_timing SEI: ct_type");
                                                            this.nuit_field_based_flag = cAVLCReader.readU(1, "pic_timing SEI: nuit_field_based_flag");
                                                            this.counting_type = cAVLCReader.readU(5, "pic_timing SEI: counting_type");
                                                            this.full_timestamp_flag = cAVLCReader.readU(1, "pic_timing SEI: full_timestamp_flag");
                                                            this.discontinuity_flag = cAVLCReader.readU(1, "pic_timing SEI: discontinuity_flag");
                                                            this.cnt_dropped_flag = cAVLCReader.readU(1, "pic_timing SEI: cnt_dropped_flag");
                                                            this.n_frames = cAVLCReader.readU(8, "pic_timing SEI: n_frames");
                                                            if (this.full_timestamp_flag != 1) {
                                                                this.seconds_value = cAVLCReader.readU(6, "pic_timing SEI: seconds_value");
                                                                this.minutes_value = cAVLCReader.readU(6, "pic_timing SEI: minutes_value");
                                                            } else {
                                                                if (cAVLCReader.readBool("pic_timing SEI: seconds_flag")) {
                                                                    this.seconds_value = cAVLCReader.readU(6, "pic_timing SEI: seconds_value");
                                                                    if (cAVLCReader.readBool("pic_timing SEI: minutes_flag")) {
                                                                        this.minutes_value = cAVLCReader.readU(6, "pic_timing SEI: minutes_value");
                                                                        if (cAVLCReader.readBool("pic_timing SEI: hours_flag")) {
                                                                        }
                                                                    }
                                                                }
                                                                if (seqParameterSet.vuiParams.nalHRDParams == null) {
                                                                    hRDParameters = seqParameterSet.vuiParams.nalHRDParams;
                                                                } else if (seqParameterSet.vuiParams.vclHRDParams == null) {
                                                                    hRDParameters = seqParameterSet.vuiParams.vclHRDParams;
                                                                } else {
                                                                    this.time_offset_length = 24;
                                                                    this.time_offset = cAVLCReader.readU(24, "pic_timing SEI: time_offset");
                                                                }
                                                                this.time_offset_length = hRDParameters.time_offset_length;
                                                                this.time_offset = cAVLCReader.readU(24, "pic_timing SEI: time_offset");
                                                            }
                                                            this.hours_value = cAVLCReader.readU(5, "pic_timing SEI: hours_value");
                                                            if (seqParameterSet.vuiParams.nalHRDParams == null) {
                                                                hRDParameters = seqParameterSet.vuiParams.nalHRDParams;
                                                            } else if (seqParameterSet.vuiParams.vclHRDParams == null) {
                                                                this.time_offset_length = 24;
                                                                this.time_offset = cAVLCReader.readU(24, "pic_timing SEI: time_offset");
                                                            } else {
                                                                hRDParameters = seqParameterSet.vuiParams.vclHRDParams;
                                                            }
                                                            this.time_offset_length = hRDParameters.time_offset_length;
                                                            this.time_offset = cAVLCReader.readU(24, "pic_timing SEI: time_offset");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        this.removal_delay_flag = true;
                                        this.cpb_removal_delay = cAVLCReader.readU(seqParameterSet.vuiParams.nalHRDParams.cpb_removal_delay_length_minus1 + 1, "SEI: cpb_removal_delay");
                                        this.dpb_removal_delay = cAVLCReader.readU(seqParameterSet.vuiParams.nalHRDParams.dpb_output_delay_length_minus1 + 1, "SEI: dpb_removal_delay");
                                        if (seqParameterSet.vuiParams.pic_struct_present_flag) {
                                            this.pic_struct = cAVLCReader.readU(4, "SEI: pic_struct");
                                            switch (this.pic_struct) {
                                                case 3:
                                                case 4:
                                                case 7:
                                                    z = true;
                                                    break;
                                                case 5:
                                                case 6:
                                                case 8:
                                                    z = true;
                                                    break;
                                                default:
                                                    z = true;
                                                    break;
                                            }
                                            for (z2 = false; z2 < z; z2++) {
                                                stringBuilder = new StringBuilder("pic_timing SEI: clock_timestamp_flag[");
                                                stringBuilder.append(z2);
                                                stringBuilder.append("]");
                                                this.clock_timestamp_flag = cAVLCReader.readBool(stringBuilder.toString());
                                                if (this.clock_timestamp_flag) {
                                                    this.ct_type = cAVLCReader.readU(2, "pic_timing SEI: ct_type");
                                                    this.nuit_field_based_flag = cAVLCReader.readU(1, "pic_timing SEI: nuit_field_based_flag");
                                                    this.counting_type = cAVLCReader.readU(5, "pic_timing SEI: counting_type");
                                                    this.full_timestamp_flag = cAVLCReader.readU(1, "pic_timing SEI: full_timestamp_flag");
                                                    this.discontinuity_flag = cAVLCReader.readU(1, "pic_timing SEI: discontinuity_flag");
                                                    this.cnt_dropped_flag = cAVLCReader.readU(1, "pic_timing SEI: cnt_dropped_flag");
                                                    this.n_frames = cAVLCReader.readU(8, "pic_timing SEI: n_frames");
                                                    if (this.full_timestamp_flag != 1) {
                                                        if (cAVLCReader.readBool("pic_timing SEI: seconds_flag")) {
                                                            this.seconds_value = cAVLCReader.readU(6, "pic_timing SEI: seconds_value");
                                                            if (cAVLCReader.readBool("pic_timing SEI: minutes_flag")) {
                                                                this.minutes_value = cAVLCReader.readU(6, "pic_timing SEI: minutes_value");
                                                                if (cAVLCReader.readBool("pic_timing SEI: hours_flag")) {
                                                                }
                                                            }
                                                        }
                                                        if (seqParameterSet.vuiParams.nalHRDParams == null) {
                                                            hRDParameters = seqParameterSet.vuiParams.nalHRDParams;
                                                        } else if (seqParameterSet.vuiParams.vclHRDParams == null) {
                                                            hRDParameters = seqParameterSet.vuiParams.vclHRDParams;
                                                        } else {
                                                            this.time_offset_length = 24;
                                                            this.time_offset = cAVLCReader.readU(24, "pic_timing SEI: time_offset");
                                                        }
                                                        this.time_offset_length = hRDParameters.time_offset_length;
                                                        this.time_offset = cAVLCReader.readU(24, "pic_timing SEI: time_offset");
                                                    } else {
                                                        this.seconds_value = cAVLCReader.readU(6, "pic_timing SEI: seconds_value");
                                                        this.minutes_value = cAVLCReader.readU(6, "pic_timing SEI: minutes_value");
                                                    }
                                                    this.hours_value = cAVLCReader.readU(5, "pic_timing SEI: hours_value");
                                                    if (seqParameterSet.vuiParams.nalHRDParams == null) {
                                                        hRDParameters = seqParameterSet.vuiParams.nalHRDParams;
                                                    } else if (seqParameterSet.vuiParams.vclHRDParams == null) {
                                                        this.time_offset_length = 24;
                                                        this.time_offset = cAVLCReader.readU(24, "pic_timing SEI: time_offset");
                                                    } else {
                                                        hRDParameters = seqParameterSet.vuiParams.vclHRDParams;
                                                    }
                                                    this.time_offset_length = hRDParameters.time_offset_length;
                                                    this.time_offset = cAVLCReader.readU(24, "pic_timing SEI: time_offset");
                                                }
                                            }
                                        }
                                    }
                                    i = read;
                                } else {
                                    i = available;
                                }
                                H264TrackImpl.LOG.fine(toString());
                            } else {
                                this.payloadSize += read;
                            }
                        }
                    } else {
                        this.payloadType += read;
                    }
                }
            }
        }

        public String toString() {
            StringBuilder stringBuilder;
            StringBuilder stringBuilder2 = new StringBuilder("SEIMessage{payloadType=");
            stringBuilder2.append(this.payloadType);
            stringBuilder2.append(", payloadSize=");
            stringBuilder2.append(this.payloadSize);
            Object stringBuilder3 = stringBuilder2.toString();
            if (this.payloadType == 1) {
                if (!(this.sps.vuiParams.nalHRDParams == null && this.sps.vuiParams.vclHRDParams == null)) {
                    stringBuilder = new StringBuilder(String.valueOf(stringBuilder3));
                    stringBuilder.append(", cpb_removal_delay=");
                    stringBuilder.append(this.cpb_removal_delay);
                    stringBuilder.append(", dpb_removal_delay=");
                    stringBuilder.append(this.dpb_removal_delay);
                    stringBuilder3 = stringBuilder.toString();
                }
                if (this.sps.vuiParams.pic_struct_present_flag) {
                    stringBuilder = new StringBuilder(String.valueOf(stringBuilder3));
                    stringBuilder.append(", pic_struct=");
                    stringBuilder.append(this.pic_struct);
                    stringBuilder3 = stringBuilder.toString();
                    if (this.clock_timestamp_flag) {
                        stringBuilder = new StringBuilder(String.valueOf(stringBuilder3));
                        stringBuilder.append(", ct_type=");
                        stringBuilder.append(this.ct_type);
                        stringBuilder.append(", nuit_field_based_flag=");
                        stringBuilder.append(this.nuit_field_based_flag);
                        stringBuilder.append(", counting_type=");
                        stringBuilder.append(this.counting_type);
                        stringBuilder.append(", full_timestamp_flag=");
                        stringBuilder.append(this.full_timestamp_flag);
                        stringBuilder.append(", discontinuity_flag=");
                        stringBuilder.append(this.discontinuity_flag);
                        stringBuilder.append(", cnt_dropped_flag=");
                        stringBuilder.append(this.cnt_dropped_flag);
                        stringBuilder.append(", n_frames=");
                        stringBuilder.append(this.n_frames);
                        stringBuilder.append(", seconds_value=");
                        stringBuilder.append(this.seconds_value);
                        stringBuilder.append(", minutes_value=");
                        stringBuilder.append(this.minutes_value);
                        stringBuilder.append(", hours_value=");
                        stringBuilder.append(this.hours_value);
                        stringBuilder.append(", time_offset_length=");
                        stringBuilder.append(this.time_offset_length);
                        stringBuilder.append(", time_offset=");
                        stringBuilder.append(this.time_offset);
                        stringBuilder3 = stringBuilder.toString();
                    }
                }
            }
            stringBuilder = new StringBuilder(String.valueOf(stringBuilder3));
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    public static class SliceHeader {
        public boolean bottom_field_flag = false;
        public int colour_plane_id;
        public int delta_pic_order_cnt_0;
        public int delta_pic_order_cnt_1;
        public int delta_pic_order_cnt_bottom;
        public boolean field_pic_flag = false;
        public int first_mb_in_slice;
        public int frame_num;
        public int idr_pic_id;
        public int pic_order_cnt_lsb;
        public int pic_parameter_set_id;
        public SliceType slice_type;

        public enum SliceType {
            P,
            B,
            I,
            SP,
            SI
        }

        public SliceHeader(InputStream inputStream, Map<Integer, SeqParameterSet> map, Map<Integer, PictureParameterSet> map2, boolean z) {
            try {
                SliceType sliceType;
                inputStream.read();
                CAVLCReader cAVLCReader = new CAVLCReader(inputStream);
                this.first_mb_in_slice = cAVLCReader.readUE("SliceHeader: first_mb_in_slice");
                switch (cAVLCReader.readUE("SliceHeader: slice_type")) {
                    case 0:
                    case 5:
                        sliceType = SliceType.P;
                        break;
                    case 1:
                    case 6:
                        sliceType = SliceType.B;
                        break;
                    case 2:
                    case 7:
                        sliceType = SliceType.I;
                        break;
                    case 3:
                    case 8:
                        sliceType = SliceType.SP;
                        break;
                    case 4:
                    case 9:
                        sliceType = SliceType.SI;
                        break;
                    default:
                        break;
                }
                this.slice_type = sliceType;
                this.pic_parameter_set_id = cAVLCReader.readUE("SliceHeader: pic_parameter_set_id");
                PictureParameterSet pictureParameterSet = (PictureParameterSet) map2.get(Integer.valueOf(this.pic_parameter_set_id));
                SeqParameterSet seqParameterSet = (SeqParameterSet) map.get(Integer.valueOf(pictureParameterSet.seq_parameter_set_id));
                if (seqParameterSet.residual_color_transform_flag) {
                    this.colour_plane_id = cAVLCReader.readU(2, "SliceHeader: colour_plane_id");
                }
                this.frame_num = cAVLCReader.readU(seqParameterSet.log2_max_frame_num_minus4 + 4, "SliceHeader: frame_num");
                if (!seqParameterSet.frame_mbs_only_flag) {
                    this.field_pic_flag = cAVLCReader.readBool("SliceHeader: field_pic_flag");
                    if (this.field_pic_flag) {
                        this.bottom_field_flag = cAVLCReader.readBool("SliceHeader: bottom_field_flag");
                    }
                }
                if (z) {
                    this.idr_pic_id = cAVLCReader.readUE("SliceHeader: idr_pic_id");
                }
                if (seqParameterSet.pic_order_cnt_type == 0) {
                    this.pic_order_cnt_lsb = cAVLCReader.readU(seqParameterSet.log2_max_pic_order_cnt_lsb_minus4 + 4, "SliceHeader: pic_order_cnt_lsb");
                    if (pictureParameterSet.bottom_field_pic_order_in_frame_present_flag && !this.field_pic_flag) {
                        this.delta_pic_order_cnt_bottom = cAVLCReader.readSE("SliceHeader: delta_pic_order_cnt_bottom");
                    }
                }
                if (seqParameterSet.pic_order_cnt_type == 1 && !seqParameterSet.delta_pic_order_always_zero_flag) {
                    this.delta_pic_order_cnt_0 = cAVLCReader.readSE("delta_pic_order_cnt_0");
                    if (pictureParameterSet.bottom_field_pic_order_in_frame_present_flag && !this.field_pic_flag) {
                        this.delta_pic_order_cnt_1 = cAVLCReader.readSE("delta_pic_order_cnt_1");
                    }
                }
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("SliceHeader{first_mb_in_slice=");
            stringBuilder.append(this.first_mb_in_slice);
            stringBuilder.append(", slice_type=");
            stringBuilder.append(this.slice_type);
            stringBuilder.append(", pic_parameter_set_id=");
            stringBuilder.append(this.pic_parameter_set_id);
            stringBuilder.append(", colour_plane_id=");
            stringBuilder.append(this.colour_plane_id);
            stringBuilder.append(", frame_num=");
            stringBuilder.append(this.frame_num);
            stringBuilder.append(", field_pic_flag=");
            stringBuilder.append(this.field_pic_flag);
            stringBuilder.append(", bottom_field_flag=");
            stringBuilder.append(this.bottom_field_flag);
            stringBuilder.append(", idr_pic_id=");
            stringBuilder.append(this.idr_pic_id);
            stringBuilder.append(", pic_order_cnt_lsb=");
            stringBuilder.append(this.pic_order_cnt_lsb);
            stringBuilder.append(", delta_pic_order_cnt_bottom=");
            stringBuilder.append(this.delta_pic_order_cnt_bottom);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    public H264TrackImpl(DataSource dataSource) {
        this(dataSource, "eng");
    }

    public H264TrackImpl(DataSource dataSource, String str) {
        this(dataSource, str, -1, -1);
    }

    public H264TrackImpl(DataSource dataSource, String str, long j, int i) {
        super(dataSource);
        this.spsIdToSpsBytes = new HashMap();
        this.spsIdToSps = new HashMap();
        this.ppsIdToPpsBytes = new HashMap();
        this.ppsIdToPps = new HashMap();
        this.firstSeqParameterSet = null;
        this.firstPictureParameterSet = null;
        this.currentSeqParameterSet = null;
        this.currentPictureParameterSet = null;
        this.seqParameterRangeMap = new RangeStartMap();
        this.pictureParameterRangeMap = new RangeStartMap();
        this.frameNrInGop = 0;
        this.determineFrameRate = true;
        this.lang = "eng";
        this.lang = str;
        this.timescale = j;
        this.frametick = i;
        if (j > 0 && i > 0) {
            this.determineFrameRate = false;
        }
        parse(new LookAhead(dataSource));
    }

    private void configureFramerate() {
        if (this.determineFrameRate) {
            if (this.firstSeqParameterSet.vuiParams != null) {
                this.timescale = (long) (this.firstSeqParameterSet.vuiParams.time_scale >> 1);
                this.frametick = this.firstSeqParameterSet.vuiParams.num_units_in_tick;
                if (this.timescale == 0 || this.frametick == 0) {
                    PrintStream printStream = System.err;
                    StringBuilder stringBuilder = new StringBuilder("Warning: vuiParams contain invalid values: time_scale: ");
                    stringBuilder.append(this.timescale);
                    stringBuilder.append(" and frame_tick: ");
                    stringBuilder.append(this.frametick);
                    stringBuilder.append(". Setting frame rate to 25fps");
                    printStream.println(stringBuilder.toString());
                    this.timescale = 90000;
                    this.frametick = 3600;
                    return;
                }
            }
            System.err.println("Warning: Can't determine frame rate. Guessing 25 fps");
            this.timescale = 90000;
            this.frametick = 3600;
        }
    }

    private void createSample(List<ByteBuffer> list) {
        int i = 0;
        boolean z = false;
        for (ByteBuffer byteBuffer : list) {
            if ((byteBuffer.get(0) & 31) == 5) {
                z = true;
            }
        }
        int i2 = z ? 38 : 22;
        if (new SliceHeader(AbstractH26XTrack.cleanBuffer(new ByteBufferBackedInputStream((ByteBuffer) list.get(list.size() - 1))), this.spsIdToSps, this.ppsIdToPps, z).slice_type == SliceType.B) {
            i2 += 4;
        }
        Sample createSampleObject = createSampleObject(list);
        list.clear();
        if (this.seiMessage == null || this.seiMessage.n_frames == 0) {
            this.frameNrInGop = 0;
        }
        if (this.seiMessage != null && this.seiMessage.clock_timestamp_flag) {
            i = this.seiMessage.n_frames - this.frameNrInGop;
        } else if (this.seiMessage != null && this.seiMessage.removal_delay_flag) {
            i = this.seiMessage.dpb_removal_delay / 2;
        }
        this.ctts.add(new Entry(1, i * this.frametick));
        this.sdtp.add(new SampleDependencyTypeBox.Entry(i2));
        this.frameNrInGop++;
        this.samples.add(createSampleObject);
        if (z) {
            this.stss.add(Integer.valueOf(this.samples.size()));
        }
    }

    private void handlePPS(ByteBuffer byteBuffer) {
        InputStream byteBufferBackedInputStream = new ByteBufferBackedInputStream(byteBuffer);
        byteBufferBackedInputStream.read();
        PictureParameterSet read = PictureParameterSet.read(byteBufferBackedInputStream);
        if (this.firstPictureParameterSet == null) {
            this.firstPictureParameterSet = read;
        }
        this.currentPictureParameterSet = read;
        Object toArray = AbstractH26XTrack.toArray((ByteBuffer) byteBuffer.rewind());
        byte[] bArr = (byte[]) this.ppsIdToPpsBytes.get(Integer.valueOf(read.pic_parameter_set_id));
        if (bArr == null || Arrays.equals(bArr, toArray)) {
            if (bArr == null) {
                this.pictureParameterRangeMap.put(Integer.valueOf(this.samples.size()), toArray);
            }
            this.ppsIdToPpsBytes.put(Integer.valueOf(read.pic_parameter_set_id), toArray);
            this.ppsIdToPps.put(Integer.valueOf(read.pic_parameter_set_id), read);
            return;
        }
        throw new RuntimeException("OMG - I got two SPS with same ID but different settings! (AVC3 is the solution)");
    }

    private void handleSPS(ByteBuffer byteBuffer) {
        InputStream cleanBuffer = AbstractH26XTrack.cleanBuffer(new ByteBufferBackedInputStream(byteBuffer));
        cleanBuffer.read();
        SeqParameterSet read = SeqParameterSet.read(cleanBuffer);
        if (this.firstSeqParameterSet == null) {
            this.firstSeqParameterSet = read;
            configureFramerate();
        }
        this.currentSeqParameterSet = read;
        Object toArray = AbstractH26XTrack.toArray((ByteBuffer) byteBuffer.rewind());
        byte[] bArr = (byte[]) this.spsIdToSpsBytes.get(Integer.valueOf(read.seq_parameter_set_id));
        if (bArr == null || Arrays.equals(bArr, toArray)) {
            if (bArr != null) {
                this.seqParameterRangeMap.put(Integer.valueOf(this.samples.size()), toArray);
            }
            this.spsIdToSpsBytes.put(Integer.valueOf(read.seq_parameter_set_id), toArray);
            this.spsIdToSps.put(Integer.valueOf(read.seq_parameter_set_id), read);
            return;
        }
        throw new RuntimeException("OMG - I got two SPS with same ID but different settings!");
    }

    private void parse(LookAhead lookAhead) {
        this.samples = new LinkedList();
        if (!readSamples(lookAhead)) {
            throw new IOException();
        } else if (readVariables()) {
            this.sampleDescriptionBox = new SampleDescriptionBox();
            Box visualSampleEntry = new VisualSampleEntry(VisualSampleEntry.TYPE3);
            visualSampleEntry.setDataReferenceIndex(1);
            visualSampleEntry.setDepth(24);
            visualSampleEntry.setFrameCount(1);
            visualSampleEntry.setHorizresolution(72.0d);
            visualSampleEntry.setVertresolution(72.0d);
            visualSampleEntry.setWidth(this.width);
            visualSampleEntry.setHeight(this.height);
            visualSampleEntry.setCompressorname("AVC Coding");
            Box c6533a = new C6533a();
            c6533a.m15777a(new ArrayList(this.spsIdToSpsBytes.values()));
            c6533a.m15780b(new ArrayList(this.ppsIdToPpsBytes.values()));
            c6533a.m15782c(this.firstSeqParameterSet.level_idc);
            c6533a.m15776a(this.firstSeqParameterSet.profile_idc);
            c6533a.m15786e(this.firstSeqParameterSet.bit_depth_luma_minus8);
            c6533a.m15788f(this.firstSeqParameterSet.bit_depth_chroma_minus8);
            c6533a.m15784d(this.firstSeqParameterSet.chroma_format_idc.getId());
            c6533a.m15783d();
            c6533a.m15785e();
            int i = 0;
            int i2 = (((this.firstSeqParameterSet.constraint_set_0_flag ? 128 : 0) + (this.firstSeqParameterSet.constraint_set_1_flag ? 64 : 0)) + (this.firstSeqParameterSet.constraint_set_2_flag ? 32 : 0)) + (this.firstSeqParameterSet.constraint_set_3_flag ? 16 : 0);
            if (this.firstSeqParameterSet.constraint_set_4_flag) {
                i = 8;
            }
            c6533a.m15779b((i2 + i) + ((int) (this.firstSeqParameterSet.reserved_zero_2bits & 3)));
            visualSampleEntry.addBox(c6533a);
            this.sampleDescriptionBox.addBox(visualSampleEntry);
            this.trackMetaData.setCreationTime(new Date());
            this.trackMetaData.setModificationTime(new Date());
            this.trackMetaData.setLanguage(this.lang);
            this.trackMetaData.setTimescale(this.timescale);
            this.trackMetaData.setWidth((double) this.width);
            this.trackMetaData.setHeight((double) this.height);
        } else {
            throw new IOException();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean readSamples(com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.LookAhead r8) {
        /*
        r7 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = 0;
        r2 = r1;
    L_0x0007:
        r3 = r7.findNextNal(r8);
        if (r3 != 0) goto L_0x000e;
    L_0x000d:
        goto L_0x0038;
    L_0x000e:
        r4 = 0;
        r4 = r3.get(r4);
        r5 = r4 >> 5;
        r5 = r5 & 3;
        r4 = r4 & 31;
        switch(r4) {
            case 1: goto L_0x0093;
            case 2: goto L_0x0093;
            case 3: goto L_0x0093;
            case 4: goto L_0x0093;
            case 5: goto L_0x0093;
            case 6: goto L_0x0076;
            case 7: goto L_0x0066;
            case 8: goto L_0x0056;
            case 9: goto L_0x004f;
            case 10: goto L_0x0038;
            case 11: goto L_0x0038;
            case 12: goto L_0x001c;
            case 13: goto L_0x0030;
            default: goto L_0x001c;
        };
    L_0x001c:
        r3 = java.lang.System.err;
        r5 = new java.lang.StringBuilder;
        r6 = "Unknown NAL unit type: ";
        r5.<init>(r6);
        r5.append(r4);
        r4 = r5.toString();
        r3.println(r4);
        goto L_0x0007;
    L_0x0030:
        r8 = new java.lang.RuntimeException;
        r0 = "Sequence parameter set extension is not yet handled. Needs TLC.";
        r8.<init>(r0);
        throw r8;
    L_0x0038:
        r7.createSample(r0);
        r8 = r7.samples;
        r8 = r8.size();
        r8 = new long[r8];
        r7.decodingTimes = r8;
        r8 = r7.decodingTimes;
        r0 = r7.frametick;
        r0 = (long) r0;
        java.util.Arrays.fill(r8, r0);
        r8 = 1;
        return r8;
    L_0x004f:
        if (r2 == 0) goto L_0x008e;
    L_0x0051:
        r7.createSample(r0);
        r2 = r1;
        goto L_0x008e;
    L_0x0056:
        if (r2 == 0) goto L_0x005c;
    L_0x0058:
        r7.createSample(r0);
        r2 = r1;
    L_0x005c:
        r3 = r3.rewind();
        r3 = (java.nio.ByteBuffer) r3;
        r7.handlePPS(r3);
        goto L_0x0007;
    L_0x0066:
        if (r2 == 0) goto L_0x006c;
    L_0x0068:
        r7.createSample(r0);
        r2 = r1;
    L_0x006c:
        r3 = r3.rewind();
        r3 = (java.nio.ByteBuffer) r3;
        r7.handleSPS(r3);
        goto L_0x0007;
    L_0x0076:
        if (r2 == 0) goto L_0x007c;
    L_0x0078:
        r7.createSample(r0);
        r2 = r1;
    L_0x007c:
        r4 = new com.googlecode.mp4parser.authoring.tracks.H264TrackImpl$SEIMessage;
        r5 = new com.googlecode.mp4parser.authoring.tracks.H264TrackImpl$ByteBufferBackedInputStream;
        r5.<init>(r3);
        r5 = com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.cleanBuffer(r5);
        r6 = r7.currentSeqParameterSet;
        r4.<init>(r5, r6);
        r7.seiMessage = r4;
    L_0x008e:
        r0.add(r3);
        goto L_0x0007;
    L_0x0093:
        r6 = new com.googlecode.mp4parser.authoring.tracks.H264TrackImpl$1FirstVclNalDetector;
        r6.<init>(r3, r5, r4);
        if (r2 != 0) goto L_0x009b;
    L_0x009a:
        goto L_0x00a4;
    L_0x009b:
        r4 = r2.isFirstInNew(r6);
        if (r4 == 0) goto L_0x00a5;
    L_0x00a1:
        r7.createSample(r0);
    L_0x00a4:
        r2 = r6;
    L_0x00a5:
        r3 = r3.rewind();
        r3 = (java.nio.ByteBuffer) r3;
        goto L_0x008e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.googlecode.mp4parser.authoring.tracks.H264TrackImpl.readSamples(com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack$LookAhead):boolean");
    }

    private boolean readVariables() {
        this.width = (this.firstSeqParameterSet.pic_width_in_mbs_minus1 + 1) * 16;
        int i = this.firstSeqParameterSet.frame_mbs_only_flag ? 1 : 2;
        this.height = (16 * (this.firstSeqParameterSet.pic_height_in_map_units_minus1 + 1)) * i;
        if (this.firstSeqParameterSet.frame_cropping_flag) {
            int i2 = 0;
            if (!this.firstSeqParameterSet.residual_color_transform_flag) {
                i2 = this.firstSeqParameterSet.chroma_format_idc.getId();
            }
            if (i2 != 0) {
                i2 = this.firstSeqParameterSet.chroma_format_idc.getSubWidth();
                i *= this.firstSeqParameterSet.chroma_format_idc.getSubHeight();
            } else {
                i2 = 1;
            }
            this.width -= i2 * (this.firstSeqParameterSet.frame_crop_left_offset + this.firstSeqParameterSet.frame_crop_right_offset);
            this.height -= i * (this.firstSeqParameterSet.frame_crop_top_offset + this.firstSeqParameterSet.frame_crop_bottom_offset);
        }
        return true;
    }

    public String getHandler() {
        return "vide";
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.sampleDescriptionBox;
    }

    public List<Sample> getSamples() {
        return this.samples;
    }
}
