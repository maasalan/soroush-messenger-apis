package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.IsoTypeReader;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.FileDataSourceImpl;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.h264.read.CAVLCReader;
import com.googlecode.mp4parser.util.ByteBufferByteChannel;
import com.p149g.p150a.p151b.C1611d;
import com.p149g.p150a.p151b.C1611d.C1610a;
import java.io.EOFException;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import org.linphone.core.Privacy;

public class H265TrackImplOld {
    public static final int AUD_NUT = 35;
    private static final int BLA_N_LP = 18;
    private static final int BLA_W_LP = 16;
    private static final int BLA_W_RADL = 17;
    private static final long BUFFER = 1048576;
    private static final int CRA_NUT = 21;
    private static final int IDR_N_LP = 20;
    private static final int IDR_W_RADL = 19;
    public static final int PPS_NUT = 34;
    public static final int PREFIX_SEI_NUT = 39;
    private static final int RADL_N = 6;
    private static final int RADL_R = 7;
    private static final int RASL_N = 8;
    private static final int RASL_R = 9;
    public static final int RSV_NVCL41 = 41;
    public static final int RSV_NVCL42 = 42;
    public static final int RSV_NVCL43 = 43;
    public static final int RSV_NVCL44 = 44;
    public static final int SPS_NUT = 33;
    private static final int STSA_N = 4;
    private static final int STSA_R = 5;
    private static final int TRAIL_N = 0;
    private static final int TRAIL_R = 1;
    private static final int TSA_N = 2;
    private static final int TSA_R = 3;
    public static final int UNSPEC48 = 48;
    public static final int UNSPEC49 = 49;
    public static final int UNSPEC50 = 50;
    public static final int UNSPEC51 = 51;
    public static final int UNSPEC52 = 52;
    public static final int UNSPEC53 = 53;
    public static final int UNSPEC54 = 54;
    public static final int UNSPEC55 = 55;
    public static final int VPS_NUT = 32;
    LinkedHashMap<Long, ByteBuffer> pictureParamterSets = new LinkedHashMap();
    List<Sample> samples = new ArrayList();
    LinkedHashMap<Long, ByteBuffer> sequenceParamterSets = new LinkedHashMap();
    List<Long> syncSamples = new ArrayList();
    LinkedHashMap<Long, ByteBuffer> videoParamterSets = new LinkedHashMap();

    class LookAhead {
        ByteBuffer buffer;
        long bufferStartPos = 0;
        DataSource dataSource;
        int inBufferPos = 0;
        long start;

        LookAhead(DataSource dataSource) {
            this.dataSource = dataSource;
            fillBuffer();
        }

        void discardByte() {
            this.inBufferPos++;
        }

        void discardNext3AndMarkStart() {
            this.inBufferPos += 3;
            this.start = this.bufferStartPos + ((long) this.inBufferPos);
        }

        public void fillBuffer() {
            this.buffer = this.dataSource.map(this.bufferStartPos, Math.min(this.dataSource.size() - this.bufferStartPos, H265TrackImplOld.BUFFER));
        }

        public ByteBuffer getNal() {
            if (this.start >= this.bufferStartPos) {
                this.buffer.position((int) (this.start - this.bufferStartPos));
                Buffer slice = this.buffer.slice();
                slice.limit((int) (((long) this.inBufferPos) - (this.start - this.bufferStartPos)));
                return (ByteBuffer) slice;
            }
            throw new RuntimeException("damn! NAL exceeds buffer");
        }

        boolean nextThreeEquals000or001orEof() {
            if (this.buffer.limit() - this.inBufferPos >= 3) {
                return this.buffer.get(this.inBufferPos) == (byte) 0 && this.buffer.get(this.inBufferPos + 1) == (byte) 0 && (this.buffer.get(this.inBufferPos + 2) == (byte) 0 || this.buffer.get(this.inBufferPos + 2) == (byte) 1);
            } else {
                if ((this.bufferStartPos + ((long) this.inBufferPos)) + 3 > this.dataSource.size()) {
                    return this.bufferStartPos + ((long) this.inBufferPos) == this.dataSource.size();
                } else {
                    this.bufferStartPos = this.start;
                    this.inBufferPos = 0;
                    fillBuffer();
                    return nextThreeEquals000or001orEof();
                }
            }
        }

        boolean nextThreeEquals001() {
            if (this.buffer.limit() - this.inBufferPos >= 3) {
                return this.buffer.get(this.inBufferPos) == (byte) 0 && this.buffer.get(this.inBufferPos + 1) == (byte) 0 && this.buffer.get(this.inBufferPos + 2) == (byte) 1;
            } else {
                if (this.bufferStartPos + ((long) this.inBufferPos) == this.dataSource.size()) {
                    throw new EOFException();
                }
                throw new RuntimeException("buffer repositioning require");
            }
        }
    }

    public static class NalUnitHeader {
        int forbiddenZeroFlag;
        int nalUnitType;
        int nuhLayerId;
        int nuhTemporalIdPlusOne;
    }

    public enum PARSE_STATE {
        AUD_SEI_SLICE,
        SEI_SLICE,
        SLICE_OES_EOB
    }

    public H265TrackImplOld(DataSource dataSource) {
        LookAhead lookAhead = new LookAhead(dataSource);
        List<ByteBuffer> arrayList = new ArrayList();
        long j = 1;
        long j2 = 1;
        int i = 0;
        while (true) {
            ByteBuffer findNextNal = findNextNal(lookAhead);
            if (findNextNal == null) {
                System.err.println("");
                C1611d c1611d = new C1611d();
                c1611d.f5044w = getArrays();
                c1611d.f5039r = 0;
                return;
            }
            LinkedHashMap linkedHashMap;
            NalUnitHeader nalUnitHeader = getNalUnitHeader(findNextNal);
            switch (nalUnitHeader.nalUnitType) {
                case 32:
                    linkedHashMap = r0.videoParamterSets;
                    break;
                case 33:
                    linkedHashMap = r0.sequenceParamterSets;
                    break;
                case 34:
                    linkedHashMap = r0.pictureParamterSets;
                    break;
                default:
                    break;
            }
            linkedHashMap.put(Long.valueOf(j2), findNextNal);
            if (nalUnitHeader.nalUnitType < 32) {
                i = nalUnitHeader.nalUnitType;
            }
            if (isFirstOfAU(nalUnitHeader.nalUnitType, findNextNal, arrayList) && !arrayList.isEmpty()) {
                System.err.println("##########################");
                for (ByteBuffer nalUnitHeader2 : arrayList) {
                    NalUnitHeader nalUnitHeader3 = getNalUnitHeader(nalUnitHeader2);
                    System.err.println(String.format("type: %3d - layer: %3d - tempId: %3d - size: %3d", new Object[]{Integer.valueOf(nalUnitHeader3.nalUnitType), Integer.valueOf(nalUnitHeader3.nuhLayerId), Integer.valueOf(nalUnitHeader3.nuhTemporalIdPlusOne), Integer.valueOf(nalUnitHeader2.limit())}));
                    j = 1;
                }
                System.err.println("                          ##########################");
                r0.samples.add(createSample(arrayList));
                arrayList.clear();
                j2 += j;
            }
            arrayList.add(findNextNal);
            if (i >= 16 && i <= 21) {
                r0.syncSamples.add(Long.valueOf(j2));
            }
            j = 1;
        }
    }

    private java.nio.ByteBuffer findNextNal(com.googlecode.mp4parser.authoring.tracks.H265TrackImplOld.LookAhead r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r1 = this;
    L_0x0000:
        r0 = r2.nextThreeEquals001();	 Catch:{ EOFException -> 0x001c }
        if (r0 == 0) goto L_0x0018;	 Catch:{ EOFException -> 0x001c }
    L_0x0006:
        r2.discardNext3AndMarkStart();	 Catch:{ EOFException -> 0x001c }
    L_0x0009:
        r0 = r2.nextThreeEquals000or001orEof();	 Catch:{ EOFException -> 0x001c }
        if (r0 == 0) goto L_0x0014;	 Catch:{ EOFException -> 0x001c }
    L_0x000f:
        r2 = r2.getNal();	 Catch:{ EOFException -> 0x001c }
        return r2;	 Catch:{ EOFException -> 0x001c }
    L_0x0014:
        r2.discardByte();	 Catch:{ EOFException -> 0x001c }
        goto L_0x0009;	 Catch:{ EOFException -> 0x001c }
    L_0x0018:
        r2.discardByte();	 Catch:{ EOFException -> 0x001c }
        goto L_0x0000;
    L_0x001c:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.googlecode.mp4parser.authoring.tracks.H265TrackImplOld.findNextNal(com.googlecode.mp4parser.authoring.tracks.H265TrackImplOld$LookAhead):java.nio.ByteBuffer");
    }

    private List<C1610a> getArrays() {
        C1610a c1610a = new C1610a();
        c1610a.f5017a = true;
        c1610a.f5019c = 32;
        c1610a.f5020d = new ArrayList();
        for (ByteBuffer byteBuffer : this.videoParamterSets.values()) {
            Object obj = new byte[byteBuffer.limit()];
            byteBuffer.position(0);
            byteBuffer.get(obj);
            c1610a.f5020d.add(obj);
        }
        C1610a c1610a2 = new C1610a();
        c1610a2.f5017a = true;
        c1610a2.f5019c = 33;
        c1610a2.f5020d = new ArrayList();
        for (ByteBuffer byteBuffer2 : this.sequenceParamterSets.values()) {
            Object obj2 = new byte[byteBuffer2.limit()];
            byteBuffer2.position(0);
            byteBuffer2.get(obj2);
            c1610a2.f5020d.add(obj2);
        }
        C1610a c1610a3 = new C1610a();
        c1610a3.f5017a = true;
        c1610a3.f5019c = 33;
        c1610a3.f5020d = new ArrayList();
        for (ByteBuffer byteBuffer3 : this.pictureParamterSets.values()) {
            Object obj3 = new byte[byteBuffer3.limit()];
            byteBuffer3.position(0);
            byteBuffer3.get(obj3);
            c1610a3.f5020d.add(obj3);
        }
        return Arrays.asList(new C1610a[]{c1610a, c1610a2, c1610a3});
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

    public static void main(String[] strArr) {
        H265TrackImplOld h265TrackImplOld = new H265TrackImplOld(new FileDataSourceImpl("c:\\content\\test-UHD-HEVC_01_FMV_Med_track1.hvc"));
    }

    protected Sample createSample(List<ByteBuffer> list) {
        byte[] bArr = new byte[(list.size() * 4)];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        for (ByteBuffer remaining : list) {
            wrap.putInt(remaining.remaining());
        }
        ByteBuffer[] byteBufferArr = new ByteBuffer[(list.size() * 2)];
        for (int i = 0; i < list.size(); i++) {
            int i2 = 2 * i;
            byteBufferArr[i2] = ByteBuffer.wrap(bArr, i * 4, 4);
            byteBufferArr[i2 + 1] = (ByteBuffer) list.get(i);
        }
        return new SampleImpl(byteBufferArr);
    }

    public int getFrameRate(ByteBuffer byteBuffer) {
        CAVLCReader cAVLCReader = new CAVLCReader(Channels.newInputStream(new ByteBufferByteChannel((ByteBuffer) byteBuffer.position(0))));
        cAVLCReader.readU(4, "vps_parameter_set_id");
        cAVLCReader.readU(2, "vps_reserved_three_2bits");
        cAVLCReader.readU(6, "vps_max_layers_minus1");
        int readU = cAVLCReader.readU(3, "vps_max_sub_layers_minus1");
        cAVLCReader.readBool("vps_temporal_id_nesting_flag");
        cAVLCReader.readU(16, "vps_reserved_0xffff_16bits");
        profile_tier_level(readU, cAVLCReader);
        boolean readBool = cAVLCReader.readBool("vps_sub_layer_ordering_info_present_flag");
        int[] iArr = new int[(readBool ? 0 : readU)];
        int[] iArr2 = new int[(readBool ? 0 : readU)];
        int[] iArr3 = new int[(readBool ? 0 : readU)];
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
        return 0;
    }

    public NalUnitHeader getNalUnitHeader(ByteBuffer byteBuffer) {
        byteBuffer.position(0);
        int readUInt16 = IsoTypeReader.readUInt16(byteBuffer);
        NalUnitHeader nalUnitHeader = new NalUnitHeader();
        nalUnitHeader.forbiddenZeroFlag = (Privacy.DEFAULT & readUInt16) >> 15;
        nalUnitHeader.nalUnitType = (readUInt16 & 32256) >> 9;
        nalUnitHeader.nuhLayerId = (readUInt16 & 504) >> 3;
        nalUnitHeader.nuhTemporalIdPlusOne = readUInt16 & 7;
        return nalUnitHeader;
    }

    boolean isFirstOfAU(int i, ByteBuffer byteBuffer, List<ByteBuffer> list) {
        if (list.isEmpty()) {
            return true;
        }
        boolean z = getNalUnitHeader((ByteBuffer) list.get(list.size() - 1)).nalUnitType <= 31;
        switch (i) {
            case 32:
            case 33:
            case 34:
            case 35:
            case 39:
            case 41:
            case 42:
            case 43:
            case 44:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
                if (z) {
                    return true;
                }
                break;
            default:
                break;
        }
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            default:
                switch (i) {
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                        break;
                    default:
                        return false;
                }
        }
        byte[] bArr = new byte[50];
        byteBuffer.position(0);
        byteBuffer.get(bArr);
        byteBuffer.position(2);
        return z && (IsoTypeReader.readUInt8(byteBuffer) & 128) > 0;
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
}
