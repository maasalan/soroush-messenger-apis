package mobi.mmdt.ott.logic.videocompressor;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.coremedia.iso.IsoFile;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.MediaBox;
import com.coremedia.iso.boxes.MediaHeaderBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.googlecode.mp4parser.util.Matrix;
import com.googlecode.mp4parser.util.Path;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.logic.p261a.p308q.p310b.C2731a;
import mobi.mmdt.ott.logic.videocompressor.video.MP4Builder;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;

public class VideoCompressor {
    public static final String MIME_TYPE = "video/avc";
    private static final int PROCESSOR_TYPE_INTEL = 2;
    private static final int PROCESSOR_TYPE_MTK = 3;
    private static final int PROCESSOR_TYPE_OTHER = 0;
    private static final int PROCESSOR_TYPE_QCOM = 1;
    private static final int PROCESSOR_TYPE_SEC = 4;
    private static final int PROCESSOR_TYPE_TI = 5;
    private C2731a mCompressVideoInfo;
    private String mInputVideoPath;
    private String mOutputVideoPath;

    static {
        System.loadLibrary("video-compression");
    }

    public VideoCompressor(String str, String str2, C2731a c2731a) {
        this.mInputVideoPath = str;
        this.mOutputVideoPath = str2;
        this.mCompressVideoInfo = c2731a;
    }

    public static native int convertVideoFrame(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, int i5);

    private static boolean isRecognizedFormat(int i) {
        if (!(i == 39 || i == 2130706688)) {
            switch (i) {
                case 19:
                case 20:
                case 21:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public static boolean processOpenVideo(String str, float f) {
        String str2 = str;
        try {
            new File(str2).length();
            Container isoFile = new IsoFile(str2);
            List<Box> paths = Path.getPaths(isoFile, "/moov/trak/");
            TrackHeaderBox trackHeaderBox = null;
            if (!(Path.getPath(isoFile, "/moov/trak/mdia/minf/stbl/stsd/mp4a/") != null)) {
                return false;
            }
            boolean z = Path.getPath(isoFile, "/moov/trak/mdia/minf/stbl/stsd/avc1/") != null;
            boolean z2 = false;
            for (Box box : paths) {
                TrackBox trackBox = (TrackBox) box;
                long j = 0;
                try {
                    MediaBox mediaBox = trackBox.getMediaBox();
                    MediaHeaderBox mediaHeaderBox = mediaBox.getMediaHeaderBox();
                    long[] sampleSizes = mediaBox.getMediaInformationBox().getSampleTableBox().getSampleSizeBox().getSampleSizes();
                    int i = 0;
                    long j2 = 0;
                    while (i < sampleSizes.length) {
                        i++;
                        j2 += sampleSizes[i];
                    }
                    j = (long) ((int) (((float) (j2 * 8)) / (((float) mediaHeaderBox.getDuration()) / ((float) mediaHeaderBox.getTimescale()))));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                TrackHeaderBox trackHeaderBox2 = trackBox.getTrackHeaderBox();
                if (!(trackHeaderBox2.getWidth() == 0.0d || trackHeaderBox2.getHeight() == 0.0d)) {
                    boolean z3 = (int) ((j / 100000) * 100000);
                    if (z3 > true) {
                        trackHeaderBox = trackHeaderBox2;
                        z2 = true;
                    } else {
                        z2 = z3;
                        trackHeaderBox = trackHeaderBox2;
                    }
                }
            }
            if (trackHeaderBox == null) {
                return false;
            }
            int i2;
            int i3;
            Matrix matrix = trackHeaderBox.getMatrix();
            if (!(matrix.equals(Matrix.ROTATE_90) || matrix.equals(Matrix.ROTATE_180))) {
                matrix.equals(Matrix.ROTATE_270);
            }
            int width = (int) trackHeaderBox.getWidth();
            int height = (int) trackHeaderBox.getHeight();
            if (width < 640) {
                if (height < 640) {
                    i2 = width;
                    i3 = height;
                    return z || !(i2 == width || i3 == height);
                }
            }
            float f2 = 640.0f / (width > height ? (float) width : (float) height);
            i2 = (int) (((float) width) * f2);
            i3 = (int) (((float) height) * f2);
            if (z2) {
                Math.max(0.5f, f2);
            }
            if (!z) {
            }
        } catch (Throwable e2) {
            C2480b.m6737b("Exception in processing open video", e2);
            return false;
        }
    }

    @TargetApi(16)
    private long readAndWriteTrack(MediaExtractor mediaExtractor, MP4Builder mP4Builder, BufferInfo bufferInfo, long j, long j2, File file, boolean z) {
        MediaExtractor mediaExtractor2 = mediaExtractor;
        MP4Builder mP4Builder2 = mP4Builder;
        BufferInfo bufferInfo2 = bufferInfo;
        long j3 = j;
        boolean z2 = z;
        int selectTrack = selectTrack(mediaExtractor2, z2);
        if (selectTrack < 0) {
            return -1;
        }
        mediaExtractor2.selectTrack(selectTrack);
        MediaFormat trackFormat = mediaExtractor2.getTrackFormat(selectTrack);
        int addTrack = mP4Builder2.addTrack(trackFormat, z2);
        int integer = trackFormat.getInteger("max-input-size");
        int i = 0;
        if (j3 > 0) {
            mediaExtractor2.seekTo(j3, 0);
        } else {
            mediaExtractor2.seekTo(0, 0);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(integer);
        integer = 0;
        long j4 = -100;
        long j5 = -1;
        while (integer == 0) {
            Object obj;
            ByteBuffer byteBuffer;
            long j6;
            int sampleTrackIndex = mediaExtractor.getSampleTrackIndex();
            if (sampleTrackIndex == selectTrack) {
                ByteBuffer byteBuffer2;
                bufferInfo2.size = mediaExtractor2.readSampleData(allocateDirect, i);
                if (bufferInfo2.size >= 0) {
                    byteBuffer2 = allocateDirect;
                    bufferInfo2.presentationTimeUs = mediaExtractor.getSampleTime();
                    obj = null;
                } else {
                    byteBuffer2 = allocateDirect;
                    bufferInfo2.size = i;
                    obj = 1;
                }
                if (bufferInfo2.size <= 0 || r8 != null) {
                    byteBuffer = byteBuffer2;
                    j6 = 0;
                } else {
                    j6 = 0;
                    if (j3 > 0 && j5 == -1) {
                        j5 = bufferInfo2.presentationTimeUs;
                    }
                    if (j2 >= 0) {
                        if (bufferInfo2.presentationTimeUs >= j2) {
                            obj = 1;
                            byteBuffer = byteBuffer2;
                        }
                    }
                    if (bufferInfo2.presentationTimeUs > j4) {
                        bufferInfo2.offset = 0;
                        bufferInfo2.flags = mediaExtractor.getSampleFlags();
                        ByteBuffer byteBuffer3 = byteBuffer2;
                        mP4Builder2.writeSampleData(addTrack, byteBuffer3, bufferInfo2, z2);
                        byteBuffer = byteBuffer3;
                    } else {
                        byteBuffer = byteBuffer2;
                    }
                    j4 = bufferInfo2.presentationTimeUs;
                }
                if (obj == null) {
                    mediaExtractor.advance();
                }
            } else {
                byteBuffer = allocateDirect;
                j6 = 0;
                if (sampleTrackIndex == -1) {
                    obj = 1;
                } else {
                    mediaExtractor.advance();
                    obj = null;
                }
            }
            if (obj != null) {
                integer = 1;
            }
            long j7 = j6;
            allocateDirect = byteBuffer;
            j3 = j;
            i = 0;
        }
        mediaExtractor2.unselectTrack(selectTrack);
        return j5;
    }

    @SuppressLint({"NewApi"})
    public static MediaCodecInfo selectCodec(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        MediaCodecInfo mediaCodecInfo = null;
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                MediaCodecInfo mediaCodecInfo2 = mediaCodecInfo;
                for (String equalsIgnoreCase : codecInfoAt.getSupportedTypes()) {
                    if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                        if (!codecInfoAt.getName().equals("OMX.SEC.avc.enc") || codecInfoAt.getName().equals("OMX.SEC.AVC.Encoder")) {
                            return codecInfoAt;
                        }
                        mediaCodecInfo2 = codecInfoAt;
                    }
                }
                mediaCodecInfo = mediaCodecInfo2;
            }
        }
        return mediaCodecInfo;
    }

    @SuppressLint({"NewApi"})
    public static int selectColorFormat(MediaCodecInfo mediaCodecInfo, String str) {
        CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
        int i = 0;
        int i2 = 0;
        while (i < capabilitiesForType.colorFormats.length) {
            int i3 = capabilitiesForType.colorFormats[i];
            if (isRecognizedFormat(i3)) {
                if (!mediaCodecInfo.getName().equals("OMX.SEC.AVC.Encoder") || i3 != 19) {
                    return i3;
                }
                i2 = i3;
            }
            i++;
        }
        return i2;
    }

    @TargetApi(16)
    private int selectTrack(MediaExtractor mediaExtractor, boolean z) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            String string = mediaExtractor.getTrackFormat(i).getString(IMediaFormat.KEY_MIME);
            if (z) {
                if (string.startsWith("audio/")) {
                    return i;
                }
            } else if (string.startsWith("video/")) {
                return i;
            }
        }
        return -5;
    }

    @android.annotation.TargetApi(16)
    public boolean convertVideo(java.lang.String r59, long r60, long r62, int r64, int r65, int r66, int r67, int r68, int r69, java.lang.String r70) {
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
        r58 = this;
        r11 = r60;
        r1 = r64;
        r2 = r65;
        r3 = r66;
        r4 = r67;
        r5 = r68;
        r15 = new java.io.File;
        r6 = r70;
        r15.<init>(r6);
        r6 = android.os.Build.VERSION.SDK_INT;
        r7 = 90;
        r8 = 18;
        r10 = 0;
        if (r6 >= r8) goto L_0x002a;
    L_0x001c:
        if (r2 <= r1) goto L_0x002a;
    L_0x001e:
        if (r1 == r4) goto L_0x002a;
    L_0x0020:
        if (r2 == r5) goto L_0x002a;
    L_0x0022:
        r3 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        r57 = r7;
        r7 = r3;
        r3 = r57;
        goto L_0x0049;
    L_0x002a:
        r6 = android.os.Build.VERSION.SDK_INT;
        r9 = 20;
        if (r6 <= r9) goto L_0x0043;
    L_0x0030:
        if (r3 != r7) goto L_0x0036;
    L_0x0032:
        r7 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
    L_0x0034:
        r3 = r10;
        goto L_0x0049;
    L_0x0036:
        r6 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        if (r3 != r6) goto L_0x003e;
    L_0x003a:
        r7 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        r3 = r10;
        goto L_0x0044;
    L_0x003e:
        r6 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        if (r3 != r6) goto L_0x0043;
    L_0x0042:
        goto L_0x0034;
    L_0x0043:
        r7 = r10;
    L_0x0044:
        r57 = r2;
        r2 = r1;
        r1 = r57;
    L_0x0049:
        r6 = new java.io.File;
        r9 = r59;
        r6.<init>(r9);
        r9 = r6.canRead();
        if (r9 != 0) goto L_0x0057;
    L_0x0056:
        return r10;
    L_0x0057:
        r23 = java.lang.System.currentTimeMillis();
        if (r2 == 0) goto L_0x0833;
    L_0x005d:
        if (r1 == 0) goto L_0x0833;
    L_0x005f:
        r10 = new android.media.MediaCodec$BufferInfo;	 Catch:{ Exception -> 0x07c7, all -> 0x07c2 }
        r10.<init>();	 Catch:{ Exception -> 0x07c7, all -> 0x07c2 }
        r9 = new mobi.mmdt.ott.logic.videocompressor.video.Mp4Movie;	 Catch:{ Exception -> 0x07c7, all -> 0x07c2 }
        r9.<init>();	 Catch:{ Exception -> 0x07c7, all -> 0x07c2 }
        r9.setCacheFile(r15);	 Catch:{ Exception -> 0x07c7, all -> 0x07c2 }
        r9.setRotation(r3);	 Catch:{ Exception -> 0x07c7, all -> 0x07c2 }
        r9.setSize(r2, r1);	 Catch:{ Exception -> 0x07c7, all -> 0x07c2 }
        r3 = new mobi.mmdt.ott.logic.videocompressor.video.MP4Builder;	 Catch:{ Exception -> 0x07c7, all -> 0x07c2 }
        r3.<init>();	 Catch:{ Exception -> 0x07c7, all -> 0x07c2 }
        r9 = r3.createMovie(r9);	 Catch:{ Exception -> 0x07c7, all -> 0x07c2 }
        r3 = new android.media.MediaExtractor;	 Catch:{ Exception -> 0x07bd, all -> 0x07b8 }
        r3.<init>();	 Catch:{ Exception -> 0x07bd, all -> 0x07b8 }
        r6 = r6.toString();	 Catch:{ Exception -> 0x07b2, all -> 0x07ac }
        r3.setDataSource(r6);	 Catch:{ Exception -> 0x07b2, all -> 0x07ac }
        r28 = -1;
        if (r2 != r4) goto L_0x00be;
    L_0x008b:
        if (r1 == r5) goto L_0x008e;
    L_0x008d:
        goto L_0x00be;
    L_0x008e:
        r16 = 0;
        r1 = r58;
        r2 = r3;
        r7 = r3;
        r3 = r9;
        r4 = r10;
        r5 = r11;
        r30 = r7;
        r7 = r62;
        r13 = r9;
        r9 = r15;
        r14 = r10;
        r33 = r15;
        r15 = 0;
        r10 = r16;
        r1 = r1.readAndWriteTrack(r2, r3, r4, r5, r7, r9, r10);	 Catch:{ Exception -> 0x00b8, all -> 0x00b2 }
        r3 = (r1 > r28 ? 1 : (r1 == r28 ? 0 : -1));
        if (r3 == 0) goto L_0x00ad;
    L_0x00ab:
        r5 = r1;
        goto L_0x00ae;
    L_0x00ad:
        r5 = r11;
    L_0x00ae:
        r9 = r30;
        goto L_0x0771;
    L_0x00b2:
        r0 = move-exception;
        r1 = r0;
        r9 = r30;
        goto L_0x0805;
    L_0x00b8:
        r0 = move-exception;
        r1 = r0;
        r9 = r30;
        goto L_0x07cb;
    L_0x00be:
        r13 = r9;
        r14 = r10;
        r33 = r15;
        r15 = 0;
        r10 = r58;
        r9 = r3;
        r3 = r10.selectTrack(r9, r15);	 Catch:{ Exception -> 0x07a8, all -> 0x07a4 }
        if (r3 < 0) goto L_0x076b;
    L_0x00cc:
        r5 = android.os.Build.MANUFACTURER;	 Catch:{ Exception -> 0x0736 }
        r5 = r5.toLowerCase();	 Catch:{ Exception -> 0x0736 }
        r6 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x0736 }
        r25 = 2;
        r26 = 4;
        if (r6 >= r8) goto L_0x0183;
    L_0x00da:
        r6 = "video/avc";	 Catch:{ Exception -> 0x017d }
        r6 = selectCodec(r6);	 Catch:{ Exception -> 0x017d }
        r8 = "video/avc";	 Catch:{ Exception -> 0x017d }
        r8 = selectColorFormat(r6, r8);	 Catch:{ Exception -> 0x017d }
        if (r8 != 0) goto L_0x00f0;	 Catch:{ Exception -> 0x017d }
    L_0x00e8:
        r1 = new java.lang.RuntimeException;	 Catch:{ Exception -> 0x017d }
        r2 = "no supported color format";	 Catch:{ Exception -> 0x017d }
        r1.<init>(r2);	 Catch:{ Exception -> 0x017d }
        throw r1;	 Catch:{ Exception -> 0x017d }
    L_0x00f0:
        r4 = r6.getName();	 Catch:{ Exception -> 0x017d }
        r15 = "OMX.qcom.";	 Catch:{ Exception -> 0x017d }
        r15 = r4.contains(r15);	 Catch:{ Exception -> 0x017d }
        if (r15 == 0) goto L_0x0118;	 Catch:{ Exception -> 0x017d }
    L_0x00fc:
        r4 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x017d }
        r15 = 16;	 Catch:{ Exception -> 0x017d }
        if (r4 != r15) goto L_0x0114;	 Catch:{ Exception -> 0x017d }
    L_0x0102:
        r4 = "lge";	 Catch:{ Exception -> 0x017d }
        r4 = r5.equals(r4);	 Catch:{ Exception -> 0x017d }
        if (r4 != 0) goto L_0x0112;	 Catch:{ Exception -> 0x017d }
    L_0x010a:
        r4 = "nokia";	 Catch:{ Exception -> 0x017d }
        r4 = r5.equals(r4);	 Catch:{ Exception -> 0x017d }
        if (r4 == 0) goto L_0x0114;	 Catch:{ Exception -> 0x017d }
    L_0x0112:
        r15 = 1;	 Catch:{ Exception -> 0x017d }
        goto L_0x0115;	 Catch:{ Exception -> 0x017d }
    L_0x0114:
        r15 = 0;	 Catch:{ Exception -> 0x017d }
    L_0x0115:
        r37 = 1;	 Catch:{ Exception -> 0x017d }
        goto L_0x014b;	 Catch:{ Exception -> 0x017d }
    L_0x0118:
        r15 = "OMX.Intel.";	 Catch:{ Exception -> 0x017d }
        r15 = r4.contains(r15);	 Catch:{ Exception -> 0x017d }
        if (r15 == 0) goto L_0x0124;	 Catch:{ Exception -> 0x017d }
    L_0x0120:
        r37 = r25;	 Catch:{ Exception -> 0x017d }
        r15 = 0;	 Catch:{ Exception -> 0x017d }
        goto L_0x014b;	 Catch:{ Exception -> 0x017d }
    L_0x0124:
        r15 = "OMX.MTK.VIDEO.ENCODER.AVC";	 Catch:{ Exception -> 0x017d }
        r15 = r4.equals(r15);	 Catch:{ Exception -> 0x017d }
        if (r15 == 0) goto L_0x0130;	 Catch:{ Exception -> 0x017d }
    L_0x012c:
        r15 = 0;	 Catch:{ Exception -> 0x017d }
        r37 = 3;	 Catch:{ Exception -> 0x017d }
        goto L_0x014b;	 Catch:{ Exception -> 0x017d }
    L_0x0130:
        r15 = "OMX.SEC.AVC.Encoder";	 Catch:{ Exception -> 0x017d }
        r15 = r4.equals(r15);	 Catch:{ Exception -> 0x017d }
        if (r15 == 0) goto L_0x013c;	 Catch:{ Exception -> 0x017d }
    L_0x0138:
        r37 = r26;	 Catch:{ Exception -> 0x017d }
        r15 = 1;	 Catch:{ Exception -> 0x017d }
        goto L_0x014b;	 Catch:{ Exception -> 0x017d }
    L_0x013c:
        r15 = "OMX.TI.DUCATI1.VIDEO.H264E";	 Catch:{ Exception -> 0x017d }
        r4 = r4.equals(r15);	 Catch:{ Exception -> 0x017d }
        if (r4 == 0) goto L_0x0148;	 Catch:{ Exception -> 0x017d }
    L_0x0144:
        r15 = 0;	 Catch:{ Exception -> 0x017d }
        r37 = 5;	 Catch:{ Exception -> 0x017d }
        goto L_0x014b;	 Catch:{ Exception -> 0x017d }
    L_0x0148:
        r15 = 0;	 Catch:{ Exception -> 0x017d }
        r37 = 0;	 Catch:{ Exception -> 0x017d }
    L_0x014b:
        r4 = "FFF";	 Catch:{ Exception -> 0x017d }
        r38 = r8;	 Catch:{ Exception -> 0x017d }
        r8 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x017d }
        r39 = r15;	 Catch:{ Exception -> 0x017d }
        r15 = "codec = ";	 Catch:{ Exception -> 0x017d }
        r8.<init>(r15);	 Catch:{ Exception -> 0x017d }
        r6 = r6.getName();	 Catch:{ Exception -> 0x017d }
        r8.append(r6);	 Catch:{ Exception -> 0x017d }
        r6 = " manufacturer = ";	 Catch:{ Exception -> 0x017d }
        r8.append(r6);	 Catch:{ Exception -> 0x017d }
        r8.append(r5);	 Catch:{ Exception -> 0x017d }
        r6 = "device = ";	 Catch:{ Exception -> 0x017d }
        r8.append(r6);	 Catch:{ Exception -> 0x017d }
        r6 = android.os.Build.MODEL;	 Catch:{ Exception -> 0x017d }
        r8.append(r6);	 Catch:{ Exception -> 0x017d }
        r6 = r8.toString();	 Catch:{ Exception -> 0x017d }
        android.util.Log.e(r4, r6);	 Catch:{ Exception -> 0x017d }
        r6 = r37;
        r4 = r38;
        goto L_0x0189;
    L_0x017d:
        r0 = move-exception;
        r1 = r0;
        r51 = r3;
        goto L_0x073a;
    L_0x0183:
        r4 = 2130708361; // 0x7f000789 float:1.701803E38 double:1.0527098025E-314;
        r6 = 0;
        r39 = 0;
    L_0x0189:
        r8 = "FFF";	 Catch:{ Exception -> 0x0736 }
        r15 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0736 }
        r10 = "colorFormat = ";	 Catch:{ Exception -> 0x0736 }
        r15.<init>(r10);	 Catch:{ Exception -> 0x0736 }
        r15.append(r4);	 Catch:{ Exception -> 0x0736 }
        r10 = r15.toString();	 Catch:{ Exception -> 0x0736 }
        android.util.Log.e(r8, r10);	 Catch:{ Exception -> 0x0736 }
        r8 = r2 * r1;	 Catch:{ Exception -> 0x0736 }
        r10 = r8 * 3;	 Catch:{ Exception -> 0x0736 }
        r10 = r10 / 2;	 Catch:{ Exception -> 0x0736 }
        if (r6 != 0) goto L_0x01bb;
    L_0x01a4:
        r5 = r1 % 16;	 Catch:{ Exception -> 0x017d }
        if (r5 == 0) goto L_0x01b9;	 Catch:{ Exception -> 0x017d }
    L_0x01a8:
        r5 = r1 % 16;	 Catch:{ Exception -> 0x017d }
        r6 = 16;	 Catch:{ Exception -> 0x017d }
        r15 = 16 - r5;	 Catch:{ Exception -> 0x017d }
        r15 = r15 + r1;	 Catch:{ Exception -> 0x017d }
        r15 = r15 - r1;	 Catch:{ Exception -> 0x017d }
        r5 = r2 * r15;	 Catch:{ Exception -> 0x017d }
        r6 = r5 * 5;	 Catch:{ Exception -> 0x017d }
        r6 = r6 / 4;	 Catch:{ Exception -> 0x017d }
        r10 = r10 + r6;	 Catch:{ Exception -> 0x017d }
        r15 = 1;	 Catch:{ Exception -> 0x017d }
        goto L_0x01ef;	 Catch:{ Exception -> 0x017d }
    L_0x01b9:
        r15 = 1;	 Catch:{ Exception -> 0x017d }
        goto L_0x01ee;	 Catch:{ Exception -> 0x017d }
    L_0x01bb:
        r15 = 1;	 Catch:{ Exception -> 0x017d }
        if (r6 != r15) goto L_0x01d1;	 Catch:{ Exception -> 0x017d }
    L_0x01be:
        r5 = r5.toLowerCase();	 Catch:{ Exception -> 0x017d }
        r6 = "lge";	 Catch:{ Exception -> 0x017d }
        r5 = r5.equals(r6);	 Catch:{ Exception -> 0x017d }
        if (r5 != 0) goto L_0x01ee;	 Catch:{ Exception -> 0x017d }
    L_0x01ca:
        r5 = r8 + 2047;	 Catch:{ Exception -> 0x017d }
        r5 = r5 & -2048;	 Catch:{ Exception -> 0x017d }
        r5 = r5 - r8;	 Catch:{ Exception -> 0x017d }
        r10 = r10 + r5;	 Catch:{ Exception -> 0x017d }
        goto L_0x01ef;	 Catch:{ Exception -> 0x017d }
    L_0x01d1:
        r8 = 5;	 Catch:{ Exception -> 0x017d }
        if (r6 == r8) goto L_0x01ee;	 Catch:{ Exception -> 0x017d }
    L_0x01d4:
        r8 = 3;	 Catch:{ Exception -> 0x017d }
        if (r6 != r8) goto L_0x01ee;	 Catch:{ Exception -> 0x017d }
    L_0x01d7:
        r6 = "baidu";	 Catch:{ Exception -> 0x017d }
        r5 = r5.equals(r6);	 Catch:{ Exception -> 0x017d }
        if (r5 == 0) goto L_0x01ee;	 Catch:{ Exception -> 0x017d }
    L_0x01df:
        r5 = r1 % 16;	 Catch:{ Exception -> 0x017d }
        r6 = 16;	 Catch:{ Exception -> 0x017d }
        r5 = 16 - r5;	 Catch:{ Exception -> 0x017d }
        r5 = r5 + r1;	 Catch:{ Exception -> 0x017d }
        r5 = r5 - r1;	 Catch:{ Exception -> 0x017d }
        r5 = r5 * r2;	 Catch:{ Exception -> 0x017d }
        r6 = r5 * 5;	 Catch:{ Exception -> 0x017d }
        r6 = r6 / 4;	 Catch:{ Exception -> 0x017d }
        r10 = r10 + r6;
        goto L_0x01ef;
    L_0x01ee:
        r5 = 0;
    L_0x01ef:
        r9.selectTrack(r3);	 Catch:{ Exception -> 0x0736 }
        r40 = r5;
        r5 = 0;
        r8 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1));
        if (r8 <= 0) goto L_0x01ff;
    L_0x01fa:
        r8 = 0;
        r9.seekTo(r11, r8);	 Catch:{ Exception -> 0x017d }
        goto L_0x0203;
    L_0x01ff:
        r8 = 0;
        r9.seekTo(r5, r8);	 Catch:{ Exception -> 0x0736 }
    L_0x0203:
        r8 = r9.getTrackFormat(r3);	 Catch:{ Exception -> 0x0736 }
        r5 = "video/avc";	 Catch:{ Exception -> 0x0736 }
        r5 = android.media.MediaFormat.createVideoFormat(r5, r2, r1);	 Catch:{ Exception -> 0x0736 }
        r6 = "color-format";	 Catch:{ Exception -> 0x0736 }
        r5.setInteger(r6, r4);	 Catch:{ Exception -> 0x0736 }
        r6 = "bitrate";	 Catch:{ Exception -> 0x0736 }
        if (r69 == 0) goto L_0x0219;	 Catch:{ Exception -> 0x0736 }
    L_0x0216:
        r15 = r69;	 Catch:{ Exception -> 0x0736 }
        goto L_0x021e;	 Catch:{ Exception -> 0x0736 }
    L_0x0219:
        r16 = 921600; // 0xe1000 float:1.291437E-39 double:4.55331E-318;	 Catch:{ Exception -> 0x0736 }
        r15 = r16;	 Catch:{ Exception -> 0x0736 }
    L_0x021e:
        r5.setInteger(r6, r15);	 Catch:{ Exception -> 0x0736 }
        r6 = "frame-rate";	 Catch:{ Exception -> 0x0736 }
        r15 = 25;	 Catch:{ Exception -> 0x0736 }
        r5.setInteger(r6, r15);	 Catch:{ Exception -> 0x0736 }
        r6 = "i-frame-interval";	 Catch:{ Exception -> 0x0736 }
        r15 = 10;	 Catch:{ Exception -> 0x0736 }
        r5.setInteger(r6, r15);	 Catch:{ Exception -> 0x0736 }
        r6 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x0736 }
        r15 = 18;
        if (r6 >= r15) goto L_0x0241;
    L_0x0235:
        r6 = "stride";	 Catch:{ Exception -> 0x017d }
        r15 = r2 + 32;	 Catch:{ Exception -> 0x017d }
        r5.setInteger(r6, r15);	 Catch:{ Exception -> 0x017d }
        r6 = "slice-height";	 Catch:{ Exception -> 0x017d }
        r5.setInteger(r6, r1);	 Catch:{ Exception -> 0x017d }
    L_0x0241:
        r6 = "video/avc";	 Catch:{ Exception -> 0x0736 }
        r6 = android.media.MediaCodec.createEncoderByType(r6);	 Catch:{ Exception -> 0x0736 }
        r41 = r10;
        r10 = 0;
        r15 = 1;
        r6.configure(r5, r10, r10, r15);	 Catch:{ Exception -> 0x072e }
        r5 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x072e }
        r10 = 18;
        if (r5 < r10) goto L_0x026e;
    L_0x0254:
        r5 = new mobi.mmdt.ott.logic.videocompressor.video.InputSurface;	 Catch:{ Exception -> 0x0268 }
        r10 = r6.createInputSurface();	 Catch:{ Exception -> 0x0268 }
        r5.<init>(r10);	 Catch:{ Exception -> 0x0268 }
        r5.makeCurrent();	 Catch:{ Exception -> 0x0261 }
        goto L_0x026f;
    L_0x0261:
        r0 = move-exception;
        r1 = r0;
        r51 = r3;
        r4 = 0;
        goto L_0x073d;
    L_0x0268:
        r0 = move-exception;
        r1 = r0;
        r51 = r3;
        goto L_0x0733;
    L_0x026e:
        r5 = 0;
    L_0x026f:
        r6.start();	 Catch:{ Exception -> 0x0724 }
        r10 = "mime";	 Catch:{ Exception -> 0x0724 }
        r10 = r8.getString(r10);	 Catch:{ Exception -> 0x0724 }
        r10 = android.media.MediaCodec.createDecoderByType(r10);	 Catch:{ Exception -> 0x0724 }
        r15 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x071c }
        r42 = r4;
        r4 = 18;
        if (r15 < r4) goto L_0x0291;
    L_0x0284:
        r4 = new mobi.mmdt.ott.logic.videocompressor.video.OutputSurface;	 Catch:{ Exception -> 0x028a }
        r4.<init>();	 Catch:{ Exception -> 0x028a }
        goto L_0x0296;
    L_0x028a:
        r0 = move-exception;
        r1 = r0;
        r51 = r3;
        r4 = 0;
        goto L_0x073e;
    L_0x0291:
        r4 = new mobi.mmdt.ott.logic.videocompressor.video.OutputSurface;	 Catch:{ Exception -> 0x071c }
        r4.<init>(r2, r1, r7);	 Catch:{ Exception -> 0x071c }
    L_0x0296:
        r7 = r4.getSurface();	 Catch:{ IllegalStateException -> 0x06ef, Exception -> 0x06e8, all -> 0x06e3 }
        r43 = r5;
        r5 = 0;
        r15 = 0;
        r10.configure(r8, r7, r5, r15);	 Catch:{ IllegalStateException -> 0x06ef }
        r10.start();	 Catch:{ Exception -> 0x06dc, all -> 0x06e3 }
        r7 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x06dc, all -> 0x06e3 }
        r8 = 21;
        if (r7 >= r8) goto L_0x02de;
    L_0x02aa:
        r7 = r10.getInputBuffers();	 Catch:{ Exception -> 0x02d6 }
        r15 = r6.getOutputBuffers();	 Catch:{ Exception -> 0x02d6 }
        r5 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x02d6 }
        r8 = 18;	 Catch:{ Exception -> 0x02d6 }
        if (r5 >= r8) goto L_0x02ca;	 Catch:{ Exception -> 0x02d6 }
    L_0x02b8:
        r5 = r6.getInputBuffers();	 Catch:{ Exception -> 0x02d6 }
        r36 = r5;
        r8 = r7;
        r30 = r15;
        r34 = r28;
        r5 = 0;
        r7 = 0;
        r22 = 0;
        r27 = -5;
        goto L_0x02eb;
    L_0x02ca:
        r8 = r7;
        r30 = r15;
        r34 = r28;
        r5 = 0;
        r7 = 0;
        r22 = 0;
        r27 = -5;
        goto L_0x02e9;
    L_0x02d6:
        r0 = move-exception;
        r1 = r0;
        r51 = r3;
        r5 = r43;
        goto L_0x073e;
    L_0x02de:
        r34 = r28;
        r5 = 0;
        r7 = 0;
        r8 = 0;
        r22 = 0;
        r27 = -5;
        r30 = 0;
    L_0x02e9:
        r36 = 0;
    L_0x02eb:
        if (r5 != 0) goto L_0x06c7;
    L_0x02ed:
        r44 = r4;
        r45 = r5;
        r4 = 2500; // 0x9c4 float:3.503E-42 double:1.235E-320;
        if (r7 != 0) goto L_0x036d;
    L_0x02f5:
        r15 = r9.getSampleTrackIndex();	 Catch:{ Exception -> 0x0370 }
        if (r15 != r3) goto L_0x0341;
    L_0x02fb:
        r15 = r10.dequeueInputBuffer(r4);	 Catch:{ Exception -> 0x033f }
        if (r15 < 0) goto L_0x033d;	 Catch:{ Exception -> 0x033f }
    L_0x0301:
        r4 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x033f }
        r5 = 21;	 Catch:{ Exception -> 0x033f }
        if (r4 >= r5) goto L_0x030b;	 Catch:{ Exception -> 0x033f }
    L_0x0307:
        r4 = r8[r15];	 Catch:{ Exception -> 0x033f }
    L_0x0309:
        r5 = 0;	 Catch:{ Exception -> 0x033f }
        goto L_0x0310;	 Catch:{ Exception -> 0x033f }
    L_0x030b:
        r4 = r10.getInputBuffer(r15);	 Catch:{ Exception -> 0x033f }
        goto L_0x0309;	 Catch:{ Exception -> 0x033f }
    L_0x0310:
        r18 = r9.readSampleData(r4, r5);	 Catch:{ Exception -> 0x033f }
        if (r18 >= 0) goto L_0x0329;	 Catch:{ Exception -> 0x033f }
    L_0x0316:
        r17 = 0;	 Catch:{ Exception -> 0x033f }
        r18 = 0;	 Catch:{ Exception -> 0x033f }
        r19 = 0;	 Catch:{ Exception -> 0x033f }
        r21 = 4;	 Catch:{ Exception -> 0x033f }
        r4 = r15;	 Catch:{ Exception -> 0x033f }
        r5 = -1;	 Catch:{ Exception -> 0x033f }
        r15 = r10;	 Catch:{ Exception -> 0x033f }
        r16 = r4;	 Catch:{ Exception -> 0x033f }
        r15.queueInputBuffer(r16, r17, r18, r19, r21);	 Catch:{ Exception -> 0x033f }
        r4 = 0;	 Catch:{ Exception -> 0x033f }
        r7 = 1;	 Catch:{ Exception -> 0x033f }
        goto L_0x0347;	 Catch:{ Exception -> 0x033f }
    L_0x0329:
        r4 = r15;	 Catch:{ Exception -> 0x033f }
        r5 = -1;	 Catch:{ Exception -> 0x033f }
        r17 = 0;	 Catch:{ Exception -> 0x033f }
        r19 = r9.getSampleTime();	 Catch:{ Exception -> 0x033f }
        r21 = 0;	 Catch:{ Exception -> 0x033f }
        r15 = r10;	 Catch:{ Exception -> 0x033f }
        r16 = r4;	 Catch:{ Exception -> 0x033f }
        r15.queueInputBuffer(r16, r17, r18, r19, r21);	 Catch:{ Exception -> 0x033f }
        r9.advance();	 Catch:{ Exception -> 0x033f }
        goto L_0x0346;
    L_0x033d:
        r5 = -1;
        goto L_0x0346;
    L_0x033f:
        r0 = move-exception;
        goto L_0x0373;
    L_0x0341:
        r5 = -1;
        if (r15 != r5) goto L_0x0346;
    L_0x0344:
        r4 = 1;
        goto L_0x0347;
    L_0x0346:
        r4 = 0;
    L_0x0347:
        if (r4 == 0) goto L_0x036d;
    L_0x0349:
        r46 = r6;
        r5 = 2500; // 0x9c4 float:3.503E-42 double:1.235E-320;
        r16 = r10.dequeueInputBuffer(r5);	 Catch:{ Exception -> 0x0361 }
        if (r16 < 0) goto L_0x037c;	 Catch:{ Exception -> 0x0361 }
    L_0x0353:
        r17 = 0;	 Catch:{ Exception -> 0x0361 }
        r18 = 0;	 Catch:{ Exception -> 0x0361 }
        r19 = 0;	 Catch:{ Exception -> 0x0361 }
        r21 = 4;	 Catch:{ Exception -> 0x0361 }
        r15 = r10;	 Catch:{ Exception -> 0x0361 }
        r15.queueInputBuffer(r16, r17, r18, r19, r21);	 Catch:{ Exception -> 0x0361 }
        r7 = 1;
        goto L_0x037c;
    L_0x0361:
        r0 = move-exception;
        r1 = r0;
        r51 = r3;
        r5 = r43;
        r4 = r44;
        r6 = r46;
        goto L_0x073e;
    L_0x036d:
        r46 = r6;
        goto L_0x037c;
    L_0x0370:
        r0 = move-exception;
        r46 = r6;
    L_0x0373:
        r1 = r0;
        r51 = r3;
    L_0x0376:
        r5 = r43;
        r4 = r44;
        goto L_0x073e;
    L_0x037c:
        r4 = r22 ^ 1;
        r6 = r27;
        r5 = 1;
    L_0x0381:
        if (r4 != 0) goto L_0x0390;
    L_0x0383:
        if (r5 == 0) goto L_0x0386;
    L_0x0385:
        goto L_0x0390;
    L_0x0386:
        r27 = r6;
        r4 = r44;
        r5 = r45;
        r6 = r46;
        goto L_0x02eb;
    L_0x0390:
        r47 = r4;
        r48 = r5;
        r49 = r7;
        r15 = r46;
        r4 = 2500; // 0x9c4 float:3.503E-42 double:1.235E-320;
        r7 = r15.dequeueOutputBuffer(r14, r4);	 Catch:{ Exception -> 0x06bb, all -> 0x06e3 }
        r4 = -1;
        if (r7 != r4) goto L_0x03ab;
    L_0x03a1:
        r51 = r3;
        r3 = r4;
        r50 = r8;
        r52 = r9;
        r5 = 0;
        goto L_0x04cd;
    L_0x03ab:
        r4 = -3;
        if (r7 != r4) goto L_0x03c9;
    L_0x03ae:
        r4 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x03c3 }
        r5 = 21;	 Catch:{ Exception -> 0x03c3 }
        if (r4 >= r5) goto L_0x03b8;	 Catch:{ Exception -> 0x03c3 }
    L_0x03b4:
        r30 = r15.getOutputBuffers();	 Catch:{ Exception -> 0x03c3 }
    L_0x03b8:
        r51 = r3;	 Catch:{ Exception -> 0x03c3 }
        r50 = r8;	 Catch:{ Exception -> 0x03c3 }
        r52 = r9;	 Catch:{ Exception -> 0x03c3 }
    L_0x03be:
        r5 = r48;	 Catch:{ Exception -> 0x03c3 }
        r3 = -1;	 Catch:{ Exception -> 0x03c3 }
        goto L_0x04cd;	 Catch:{ Exception -> 0x03c3 }
    L_0x03c3:
        r0 = move-exception;	 Catch:{ Exception -> 0x03c3 }
        r1 = r0;	 Catch:{ Exception -> 0x03c3 }
        r51 = r3;	 Catch:{ Exception -> 0x03c3 }
    L_0x03c7:
        r6 = r15;	 Catch:{ Exception -> 0x03c3 }
        goto L_0x0376;	 Catch:{ Exception -> 0x03c3 }
    L_0x03c9:
        r4 = -2;	 Catch:{ Exception -> 0x03c3 }
        if (r7 != r4) goto L_0x03da;	 Catch:{ Exception -> 0x03c3 }
    L_0x03cc:
        r4 = r15.getOutputFormat();	 Catch:{ Exception -> 0x03c3 }
        r5 = -5;	 Catch:{ Exception -> 0x03c3 }
        if (r6 != r5) goto L_0x03b8;	 Catch:{ Exception -> 0x03c3 }
    L_0x03d3:
        r5 = 0;	 Catch:{ Exception -> 0x03c3 }
        r4 = r13.addTrack(r4, r5);	 Catch:{ Exception -> 0x03c3 }
        r6 = r4;	 Catch:{ Exception -> 0x03c3 }
        goto L_0x03b8;	 Catch:{ Exception -> 0x03c3 }
    L_0x03da:
        if (r7 >= 0) goto L_0x03f0;	 Catch:{ Exception -> 0x03c3 }
    L_0x03dc:
        r1 = new java.lang.RuntimeException;	 Catch:{ Exception -> 0x03c3 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x03c3 }
        r4 = "unexpected result from encoder.dequeueOutputBuffer: ";	 Catch:{ Exception -> 0x03c3 }
        r2.<init>(r4);	 Catch:{ Exception -> 0x03c3 }
        r2.append(r7);	 Catch:{ Exception -> 0x03c3 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x03c3 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x03c3 }
        throw r1;	 Catch:{ Exception -> 0x03c3 }
    L_0x03f0:
        r4 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x06bb, all -> 0x06e3 }
        r5 = 21;
        if (r4 >= r5) goto L_0x03f9;
    L_0x03f6:
        r4 = r30[r7];	 Catch:{ Exception -> 0x03c3 }
        goto L_0x03fd;
    L_0x03f9:
        r4 = r15.getOutputBuffer(r7);	 Catch:{ Exception -> 0x06bb, all -> 0x06e3 }
    L_0x03fd:
        if (r4 != 0) goto L_0x0418;
    L_0x03ff:
        r1 = new java.lang.RuntimeException;	 Catch:{ Exception -> 0x03c3 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x03c3 }
        r4 = "encoderOutputBuffer ";	 Catch:{ Exception -> 0x03c3 }
        r2.<init>(r4);	 Catch:{ Exception -> 0x03c3 }
        r2.append(r7);	 Catch:{ Exception -> 0x03c3 }
        r4 = " was null";	 Catch:{ Exception -> 0x03c3 }
        r2.append(r4);	 Catch:{ Exception -> 0x03c3 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x03c3 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x03c3 }
        throw r1;	 Catch:{ Exception -> 0x03c3 }
    L_0x0418:
        r5 = r14.size;	 Catch:{ Exception -> 0x06bb, all -> 0x06e3 }
        r50 = r8;
        r8 = 1;
        if (r5 <= r8) goto L_0x04b7;
    L_0x041f:
        r5 = r14.flags;	 Catch:{ Exception -> 0x04b1, all -> 0x06e3 }
        r5 = r5 & 2;
        if (r5 != 0) goto L_0x042c;
    L_0x0425:
        r5 = 0;
        r4 = r13.writeSampleData(r6, r4, r14, r5);	 Catch:{ Exception -> 0x03c3 }
        goto L_0x04b7;
    L_0x042c:
        r5 = -5;
        if (r6 != r5) goto L_0x04b7;
    L_0x042f:
        r5 = r14.size;	 Catch:{ Exception -> 0x04b1, all -> 0x06e3 }
        r5 = new byte[r5];	 Catch:{ Exception -> 0x04b1, all -> 0x06e3 }
        r6 = r14.offset;	 Catch:{ Exception -> 0x04b1, all -> 0x06e3 }
        r8 = r14.size;	 Catch:{ Exception -> 0x04b1, all -> 0x06e3 }
        r6 = r6 + r8;	 Catch:{ Exception -> 0x04b1, all -> 0x06e3 }
        r4.limit(r6);	 Catch:{ Exception -> 0x04b1, all -> 0x06e3 }
        r6 = r14.offset;	 Catch:{ Exception -> 0x04b1, all -> 0x06e3 }
        r4.position(r6);	 Catch:{ Exception -> 0x04b1, all -> 0x06e3 }
        r4.get(r5);	 Catch:{ Exception -> 0x04b1, all -> 0x06e3 }
        r4 = r14.size;	 Catch:{ Exception -> 0x04b1, all -> 0x06e3 }
        r6 = 1;	 Catch:{ Exception -> 0x04b1, all -> 0x06e3 }
        r4 = r4 - r6;	 Catch:{ Exception -> 0x04b1, all -> 0x06e3 }
    L_0x0447:
        if (r4 < 0) goto L_0x0490;	 Catch:{ Exception -> 0x04b1, all -> 0x06e3 }
    L_0x0449:
        r8 = 3;	 Catch:{ Exception -> 0x04b1, all -> 0x06e3 }
        if (r4 <= r8) goto L_0x0490;	 Catch:{ Exception -> 0x04b1, all -> 0x06e3 }
    L_0x044c:
        r8 = r5[r4];	 Catch:{ Exception -> 0x04b1, all -> 0x06e3 }
        if (r8 != r6) goto L_0x0484;	 Catch:{ Exception -> 0x04b1, all -> 0x06e3 }
    L_0x0450:
        r6 = r4 + -1;	 Catch:{ Exception -> 0x04b1, all -> 0x06e3 }
        r6 = r5[r6];	 Catch:{ Exception -> 0x04b1, all -> 0x06e3 }
        if (r6 != 0) goto L_0x0484;	 Catch:{ Exception -> 0x04b1, all -> 0x06e3 }
    L_0x0456:
        r6 = r4 + -2;	 Catch:{ Exception -> 0x04b1, all -> 0x06e3 }
        r6 = r5[r6];	 Catch:{ Exception -> 0x04b1, all -> 0x06e3 }
        if (r6 != 0) goto L_0x0484;	 Catch:{ Exception -> 0x04b1, all -> 0x06e3 }
    L_0x045c:
        r6 = r4 + -3;	 Catch:{ Exception -> 0x04b1, all -> 0x06e3 }
        r8 = r5[r6];	 Catch:{ Exception -> 0x04b1, all -> 0x06e3 }
        if (r8 != 0) goto L_0x0484;	 Catch:{ Exception -> 0x04b1, all -> 0x06e3 }
    L_0x0462:
        r4 = java.nio.ByteBuffer.allocate(r6);	 Catch:{ Exception -> 0x04b1, all -> 0x06e3 }
        r8 = r14.size;	 Catch:{ Exception -> 0x04b1, all -> 0x06e3 }
        r8 = r8 - r6;	 Catch:{ Exception -> 0x04b1, all -> 0x06e3 }
        r8 = java.nio.ByteBuffer.allocate(r8);	 Catch:{ Exception -> 0x04b1, all -> 0x06e3 }
        r51 = r3;
        r52 = r9;
        r3 = 0;
        r9 = r4.put(r5, r3, r6);	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r9.position(r3);	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r9 = r14.size;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r9 = r9 - r6;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r5 = r8.put(r5, r6, r9);	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r5.position(r3);	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        goto L_0x0496;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
    L_0x0484:
        r51 = r3;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r52 = r9;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r4 = r4 + -1;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r3 = r51;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r9 = r52;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r6 = 1;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        goto L_0x0447;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
    L_0x0490:
        r51 = r3;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r52 = r9;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r4 = 0;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r8 = 0;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
    L_0x0496:
        r3 = "video/avc";	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r3 = android.media.MediaFormat.createVideoFormat(r3, r2, r1);	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        if (r4 == 0) goto L_0x04aa;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
    L_0x049e:
        if (r8 == 0) goto L_0x04aa;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
    L_0x04a0:
        r5 = "csd-0";	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r3.setByteBuffer(r5, r4);	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r4 = "csd-1";	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r3.setByteBuffer(r4, r8);	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
    L_0x04aa:
        r4 = 0;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r3 = r13.addTrack(r3, r4);	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r6 = r3;
        goto L_0x04bb;
    L_0x04b1:
        r0 = move-exception;
        r51 = r3;
        r1 = r0;
        goto L_0x03c7;
    L_0x04b7:
        r51 = r3;
        r52 = r9;
    L_0x04bb:
        r3 = r14.flags;	 Catch:{ Exception -> 0x068c, all -> 0x0686 }
        r3 = r3 & 4;	 Catch:{ Exception -> 0x068c, all -> 0x0686 }
        if (r3 == 0) goto L_0x04c5;	 Catch:{ Exception -> 0x068c, all -> 0x0686 }
    L_0x04c1:
        r3 = 0;	 Catch:{ Exception -> 0x068c, all -> 0x0686 }
        r45 = 1;	 Catch:{ Exception -> 0x068c, all -> 0x0686 }
        goto L_0x04c8;	 Catch:{ Exception -> 0x068c, all -> 0x0686 }
    L_0x04c5:
        r3 = 0;	 Catch:{ Exception -> 0x068c, all -> 0x0686 }
        r45 = 0;	 Catch:{ Exception -> 0x068c, all -> 0x0686 }
    L_0x04c8:
        r15.releaseOutputBuffer(r7, r3);	 Catch:{ Exception -> 0x068c, all -> 0x0686 }
        goto L_0x03be;	 Catch:{ Exception -> 0x068c, all -> 0x0686 }
    L_0x04cd:
        if (r7 != r3) goto L_0x0698;	 Catch:{ Exception -> 0x068c, all -> 0x0686 }
    L_0x04cf:
        if (r22 != 0) goto L_0x0698;	 Catch:{ Exception -> 0x068c, all -> 0x0686 }
    L_0x04d1:
        r7 = 2500; // 0x9c4 float:3.503E-42 double:1.235E-320;	 Catch:{ Exception -> 0x068c, all -> 0x0686 }
        r4 = r10.dequeueOutputBuffer(r14, r7);	 Catch:{ Exception -> 0x068c, all -> 0x0686 }
        if (r4 != r3) goto L_0x04e6;
    L_0x04d9:
        r46 = r15;
        r7 = r49;
        r8 = r50;
        r3 = r51;
        r9 = r52;
    L_0x04e3:
        r4 = 0;
        goto L_0x0381;
    L_0x04e6:
        r7 = -3;
        if (r4 == r7) goto L_0x0698;
    L_0x04e9:
        r7 = -2;
        if (r4 != r7) goto L_0x0510;
    L_0x04ec:
        r4 = r10.getOutputFormat();	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r7 = "FFF";	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r8 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r9 = "newFormat = ";	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r8.<init>(r9);	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r8.append(r4);	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r4 = r8.toString();	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        android.util.Log.e(r7, r4);	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        goto L_0x0698;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
    L_0x0505:
        r0 = move-exception;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r1 = r0;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r6 = r15;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r5 = r43;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r4 = r44;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
    L_0x050c:
        r9 = r52;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        goto L_0x073e;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
    L_0x0510:
        if (r4 >= 0) goto L_0x0526;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
    L_0x0512:
        r1 = new java.lang.RuntimeException;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r3 = "unexpected result from decoder.dequeueOutputBuffer: ";	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r2.<init>(r3);	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r2.append(r4);	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        throw r1;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
    L_0x0526:
        r7 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x068c, all -> 0x0686 }
        r8 = 18;
        if (r7 < r8) goto L_0x0537;
    L_0x052c:
        r7 = r14.size;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        if (r7 == 0) goto L_0x0532;
    L_0x0530:
        r7 = 1;
        goto L_0x0533;
    L_0x0532:
        r7 = 0;
    L_0x0533:
        r9 = r7;
        r16 = 0;
        goto L_0x054a;
    L_0x0537:
        r7 = r14.size;	 Catch:{ Exception -> 0x068c, all -> 0x0686 }
        if (r7 != 0) goto L_0x0546;
    L_0x053b:
        r7 = r14.presentationTimeUs;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r16 = 0;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r9 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1));	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        if (r9 == 0) goto L_0x0544;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
    L_0x0543:
        goto L_0x0548;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
    L_0x0544:
        r7 = 0;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        goto L_0x0549;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
    L_0x0546:
        r16 = 0;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
    L_0x0548:
        r7 = 1;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
    L_0x0549:
        r9 = r7;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
    L_0x054a:
        r18 = (r62 > r16 ? 1 : (r62 == r16 ? 0 : -1));	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        if (r18 <= 0) goto L_0x0563;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
    L_0x054e:
        r53 = r4;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r3 = r14.presentationTimeUs;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r16 = (r3 > r62 ? 1 : (r3 == r62 ? 0 : -1));	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        if (r16 < 0) goto L_0x0565;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
    L_0x0556:
        r3 = r14.flags;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r3 = r3 | 4;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r14.flags = r3;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r3 = 1;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r9 = 0;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r31 = 0;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r49 = 1;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        goto L_0x0569;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
    L_0x0563:
        r53 = r4;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
    L_0x0565:
        r3 = r22;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r31 = 0;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
    L_0x0569:
        r4 = (r11 > r31 ? 1 : (r11 == r31 ? 0 : -1));	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        if (r4 <= 0) goto L_0x05a7;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
    L_0x056d:
        r4 = (r34 > r28 ? 1 : (r34 == r28 ? 0 : -1));	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        if (r4 != 0) goto L_0x05a7;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
    L_0x0571:
        r54 = r3;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r3 = r14.presentationTimeUs;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r16 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1));	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        if (r16 >= 0) goto L_0x059e;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
    L_0x0579:
        r3 = "FFF";	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r9 = "drop frame startTime = ";	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r4.<init>(r9);	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r4.append(r11);	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r9 = " present time = ";	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r4.append(r9);	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r56 = r5;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r55 = r6;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r5 = r14.presentationTimeUs;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r4.append(r5);	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r4 = r4.toString();	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        android.util.Log.e(r3, r4);	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r3 = r53;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r9 = 0;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        goto L_0x05af;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
    L_0x059e:
        r56 = r5;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r55 = r6;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r3 = r14.presentationTimeUs;	 Catch:{ Exception -> 0x0505, all -> 0x0686 }
        r34 = r3;
        goto L_0x05ad;
    L_0x05a7:
        r54 = r3;
        r56 = r5;
        r55 = r6;
    L_0x05ad:
        r3 = r53;
    L_0x05af:
        r10.releaseOutputBuffer(r3, r9);	 Catch:{ Exception -> 0x068c, all -> 0x0686 }
        if (r9 == 0) goto L_0x062e;
    L_0x05b4:
        r4 = r44;
        r4.awaitNewImage();	 Catch:{ Exception -> 0x05bb, all -> 0x0686 }
        r3 = 0;
        goto L_0x05c6;
    L_0x05bb:
        r0 = move-exception;
        r3 = "FFF";	 Catch:{ Exception -> 0x0626, all -> 0x0686 }
        r5 = r0.getMessage();	 Catch:{ Exception -> 0x0626, all -> 0x0686 }
        android.util.Log.e(r3, r5);	 Catch:{ Exception -> 0x0626, all -> 0x0686 }
        r3 = 1;	 Catch:{ Exception -> 0x0626, all -> 0x0686 }
    L_0x05c6:
        if (r3 != 0) goto L_0x0623;	 Catch:{ Exception -> 0x0626, all -> 0x0686 }
    L_0x05c8:
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x0626, all -> 0x0686 }
        r5 = 18;	 Catch:{ Exception -> 0x0626, all -> 0x0686 }
        if (r3 < r5) goto L_0x05e1;	 Catch:{ Exception -> 0x0626, all -> 0x0686 }
    L_0x05ce:
        r3 = 0;	 Catch:{ Exception -> 0x0626, all -> 0x0686 }
        r4.drawImage(r3);	 Catch:{ Exception -> 0x0626, all -> 0x0686 }
        r5 = r14.presentationTimeUs;	 Catch:{ Exception -> 0x0626, all -> 0x0686 }
        r16 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r5 = r5 * r16;
        r3 = r43;
        r3.setPresentationTime(r5);	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
        r3.swapBuffers();	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
        goto L_0x0632;	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
    L_0x05e1:
        r3 = r43;	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
        r5 = 2500; // 0x9c4 float:3.503E-42 double:1.235E-320;	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
        r9 = r15.dequeueInputBuffer(r5);	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
        if (r9 < 0) goto L_0x0619;	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
    L_0x05eb:
        r5 = 1;	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
        r4.drawImage(r5);	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
        r16 = r4.getFrame();	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
        r5 = r36[r9];	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
        r5.clear();	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
        r17 = r5;	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
        r18 = r42;	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
        r19 = r2;	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
        r20 = r1;	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
        r21 = r40;	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
        r22 = r39;	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
        convertVideoFrame(r16, r17, r18, r19, r20, r21, r22);	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
        r18 = 0;	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
        r5 = r14.presentationTimeUs;	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
        r22 = 0;	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
        r16 = r15;	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
        r17 = r9;	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
        r19 = r41;	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
        r20 = r5;	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
        r16.queueInputBuffer(r17, r18, r19, r20, r22);	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
        goto L_0x0632;	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
    L_0x0619:
        r5 = "FFF";	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
        r6 = "input buffer not available";	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
        android.util.Log.e(r5, r6);	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
        goto L_0x0632;
    L_0x0621:
        r0 = move-exception;
        goto L_0x0629;
    L_0x0623:
        r3 = r43;
        goto L_0x0632;
    L_0x0626:
        r0 = move-exception;
        r3 = r43;
    L_0x0629:
        r1 = r0;
        r5 = r3;
        r6 = r15;
        goto L_0x050c;
    L_0x062e:
        r3 = r43;
        r4 = r44;
    L_0x0632:
        r5 = r14.flags;	 Catch:{ Exception -> 0x0683, all -> 0x0686 }
        r5 = r5 & 4;	 Catch:{ Exception -> 0x0683, all -> 0x0686 }
        if (r5 == 0) goto L_0x067d;	 Catch:{ Exception -> 0x0683, all -> 0x0686 }
    L_0x0638:
        r5 = "FFF";	 Catch:{ Exception -> 0x0683, all -> 0x0686 }
        r6 = "decoder stream end";	 Catch:{ Exception -> 0x0683, all -> 0x0686 }
        android.util.Log.e(r5, r6);	 Catch:{ Exception -> 0x0683, all -> 0x0686 }
        r5 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x0683, all -> 0x0686 }
        r6 = 18;
        if (r5 < r6) goto L_0x065e;
    L_0x0645:
        r15.signalEndOfInputStream();	 Catch:{ Exception -> 0x0621, all -> 0x0686 }
        r43 = r3;
        r44 = r4;
        r46 = r15;
        r7 = r49;
        r8 = r50;
        r3 = r51;
        r9 = r52;
        r22 = r54;
        r6 = r55;
        r5 = r56;
        goto L_0x04e3;
    L_0x065e:
        r6 = 2500; // 0x9c4 float:3.503E-42 double:1.235E-320;
        r16 = r15.dequeueInputBuffer(r6);	 Catch:{ Exception -> 0x0683, all -> 0x0686 }
        if (r16 < 0) goto L_0x0677;	 Catch:{ Exception -> 0x0683, all -> 0x0686 }
    L_0x0666:
        r17 = 0;	 Catch:{ Exception -> 0x0683, all -> 0x0686 }
        r18 = 1;	 Catch:{ Exception -> 0x0683, all -> 0x0686 }
        r8 = r14.presentationTimeUs;	 Catch:{ Exception -> 0x0683, all -> 0x0686 }
        r21 = 4;
        r5 = r15;
        r19 = r8;
        r15.queueInputBuffer(r16, r17, r18, r19, r21);	 Catch:{ Exception -> 0x0675, all -> 0x0686 }
        goto L_0x0678;
    L_0x0675:
        r0 = move-exception;
        goto L_0x0692;
    L_0x0677:
        r5 = r15;
    L_0x0678:
        r22 = r54;
        r47 = 0;
        goto L_0x06a5;
    L_0x067d:
        r5 = r15;
        r6 = 2500; // 0x9c4 float:3.503E-42 double:1.235E-320;
        r22 = r54;
        goto L_0x06a5;
    L_0x0683:
        r0 = move-exception;
        r5 = r15;
        goto L_0x0692;
    L_0x0686:
        r0 = move-exception;
        r1 = r0;
        r9 = r52;
        goto L_0x0805;
    L_0x068c:
        r0 = move-exception;
        r5 = r15;
        r3 = r43;
        r4 = r44;
    L_0x0692:
        r1 = r0;
        r6 = r5;
        r9 = r52;
        goto L_0x072c;
    L_0x0698:
        r56 = r5;
        r55 = r6;
        r5 = r15;
        r3 = r43;
        r4 = r44;
        r6 = 2500; // 0x9c4 float:3.503E-42 double:1.235E-320;
        r31 = 0;
    L_0x06a5:
        r43 = r3;
        r44 = r4;
        r46 = r5;
        r4 = r47;
        r7 = r49;
        r8 = r50;
        r3 = r51;
        r9 = r52;
        r6 = r55;
        r5 = r56;
        goto L_0x0381;
    L_0x06bb:
        r0 = move-exception;
        r51 = r3;
        r5 = r15;
        r3 = r43;
        r4 = r44;
        r1 = r0;
        r6 = r5;
        goto L_0x072c;
    L_0x06c7:
        r51 = r3;
        r5 = r6;
        r52 = r9;
        r3 = r43;
        r1 = (r34 > r28 ? 1 : (r34 == r28 ? 0 : -1));
        if (r1 == 0) goto L_0x06d3;
    L_0x06d2:
        goto L_0x06d5;
    L_0x06d3:
        r34 = r11;
    L_0x06d5:
        r1 = r51;
        r9 = r52;
        r2 = 0;
        goto L_0x074a;
    L_0x06dc:
        r0 = move-exception;
        r51 = r3;
        r5 = r6;
        r3 = r43;
        goto L_0x06ed;
    L_0x06e3:
        r0 = move-exception;
        r52 = r9;
        goto L_0x0804;
    L_0x06e8:
        r0 = move-exception;
        r51 = r3;
        r3 = r5;
        r5 = r6;
    L_0x06ed:
        r1 = r0;
        goto L_0x072c;
    L_0x06ef:
        r9.release();
        if (r13 == 0) goto L_0x0703;
    L_0x06f4:
        r1 = 0;
        r13.finishMovie(r1);	 Catch:{ Exception -> 0x06f9 }
        goto L_0x0703;
    L_0x06f9:
        r0 = move-exception;
        r1 = "FFF";
        r2 = r0.getMessage();
        android.util.Log.e(r1, r2);
    L_0x0703:
        r1 = new java.lang.StringBuilder;
        r2 = "time = ";
        r1.<init>(r2);
        r2 = java.lang.System.currentTimeMillis();
        r4 = r2 - r23;
        r1.append(r4);
        r1 = r1.toString();
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6742f(r1);
        r1 = 0;
        return r1;
    L_0x071c:
        r0 = move-exception;
        r51 = r3;
        r3 = r5;
        r5 = r6;
        r1 = r0;
        r4 = 0;
        goto L_0x072c;
    L_0x0724:
        r0 = move-exception;
        r51 = r3;
        r3 = r5;
        r5 = r6;
        r1 = r0;
        r4 = 0;
        r10 = 0;
    L_0x072c:
        r5 = r3;
        goto L_0x073e;
    L_0x072e:
        r0 = move-exception;
        r51 = r3;
        r5 = r6;
        r1 = r0;
    L_0x0733:
        r4 = 0;
        r5 = 0;
        goto L_0x073d;
    L_0x0736:
        r0 = move-exception;
        r51 = r3;
        r1 = r0;
    L_0x073a:
        r4 = 0;
        r5 = 0;
        r6 = 0;
    L_0x073d:
        r10 = 0;
    L_0x073e:
        r2 = "Video Compressor exception";	 Catch:{ Exception -> 0x0769 }
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6737b(r2, r1);	 Catch:{ Exception -> 0x0769 }
        r3 = r5;	 Catch:{ Exception -> 0x0769 }
        r5 = r6;	 Catch:{ Exception -> 0x0769 }
        r34 = r11;	 Catch:{ Exception -> 0x0769 }
        r1 = r51;	 Catch:{ Exception -> 0x0769 }
        r2 = 1;	 Catch:{ Exception -> 0x0769 }
    L_0x074a:
        r9.unselectTrack(r1);	 Catch:{ Exception -> 0x0769 }
        if (r4 == 0) goto L_0x0752;	 Catch:{ Exception -> 0x0769 }
    L_0x074f:
        r4.release();	 Catch:{ Exception -> 0x0769 }
    L_0x0752:
        if (r3 == 0) goto L_0x0757;	 Catch:{ Exception -> 0x0769 }
    L_0x0754:
        r3.release();	 Catch:{ Exception -> 0x0769 }
    L_0x0757:
        if (r10 == 0) goto L_0x075f;	 Catch:{ Exception -> 0x0769 }
    L_0x0759:
        r10.stop();	 Catch:{ Exception -> 0x0769 }
        r10.release();	 Catch:{ Exception -> 0x0769 }
    L_0x075f:
        if (r5 == 0) goto L_0x0767;	 Catch:{ Exception -> 0x0769 }
    L_0x0761:
        r5.stop();	 Catch:{ Exception -> 0x0769 }
        r5.release();	 Catch:{ Exception -> 0x0769 }
    L_0x0767:
        r10 = r2;
        goto L_0x076e;
    L_0x0769:
        r0 = move-exception;
        goto L_0x07aa;
    L_0x076b:
        r34 = r11;
        r10 = 0;
    L_0x076e:
        r15 = r10;
        r5 = r34;
    L_0x0771:
        if (r15 != 0) goto L_0x0786;
    L_0x0773:
        r10 = 1;
        r1 = r58;
        r2 = r9;
        r3 = r13;
        r4 = r14;
        r7 = r62;
        r11 = r9;
        r9 = r33;
        r1.readAndWriteTrack(r2, r3, r4, r5, r7, r9, r10);	 Catch:{ Exception -> 0x0784, all -> 0x0782 }
        goto L_0x0787;
    L_0x0782:
        r0 = move-exception;
        goto L_0x07af;
    L_0x0784:
        r0 = move-exception;
        goto L_0x07b5;
    L_0x0786:
        r11 = r9;
    L_0x0787:
        r11.release();
        if (r13 == 0) goto L_0x079b;
    L_0x078c:
        r1 = 0;
        r13.finishMovie(r1);	 Catch:{ Exception -> 0x0791 }
        goto L_0x079b;
    L_0x0791:
        r0 = move-exception;
        r1 = "FFF";
        r2 = r0.getMessage();
        android.util.Log.e(r1, r2);
    L_0x079b:
        r1 = new java.lang.StringBuilder;
        r2 = "time = ";
        r1.<init>(r2);
        goto L_0x07f1;
    L_0x07a4:
        r0 = move-exception;
        r11 = r9;
        goto L_0x0804;
    L_0x07a8:
        r0 = move-exception;
        r11 = r9;
    L_0x07aa:
        r1 = r0;
        goto L_0x07cb;
    L_0x07ac:
        r0 = move-exception;
        r11 = r3;
        r13 = r9;
    L_0x07af:
        r1 = r0;
        r9 = r11;
        goto L_0x0805;
    L_0x07b2:
        r0 = move-exception;
        r11 = r3;
        r13 = r9;
    L_0x07b5:
        r1 = r0;
        r9 = r11;
        goto L_0x07cb;
    L_0x07b8:
        r0 = move-exception;
        r13 = r9;
        r1 = r0;
        r9 = 0;
        goto L_0x0805;
    L_0x07bd:
        r0 = move-exception;
        r13 = r9;
        r1 = r0;
        r9 = 0;
        goto L_0x07cb;
    L_0x07c2:
        r0 = move-exception;
        r1 = r0;
        r9 = 0;
        r13 = 0;
        goto L_0x0805;
    L_0x07c7:
        r0 = move-exception;
        r1 = r0;
        r9 = 0;
        r13 = 0;
    L_0x07cb:
        r2 = "FFF";	 Catch:{ all -> 0x0803 }
        r1 = r1.getMessage();	 Catch:{ all -> 0x0803 }
        android.util.Log.e(r2, r1);	 Catch:{ all -> 0x0803 }
        if (r9 == 0) goto L_0x07d9;
    L_0x07d6:
        r9.release();
    L_0x07d9:
        if (r13 == 0) goto L_0x07ea;
    L_0x07db:
        r1 = 0;
        r13.finishMovie(r1);	 Catch:{ Exception -> 0x07e0 }
        goto L_0x07ea;
    L_0x07e0:
        r0 = move-exception;
        r1 = "FFF";
        r2 = r0.getMessage();
        android.util.Log.e(r1, r2);
    L_0x07ea:
        r1 = new java.lang.StringBuilder;
        r2 = "time = ";
        r1.<init>(r2);
    L_0x07f1:
        r2 = java.lang.System.currentTimeMillis();
        r4 = r2 - r23;
        r1.append(r4);
        r1 = r1.toString();
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6742f(r1);
        r1 = 1;
        return r1;
    L_0x0803:
        r0 = move-exception;
    L_0x0804:
        r1 = r0;
    L_0x0805:
        if (r9 == 0) goto L_0x080a;
    L_0x0807:
        r9.release();
    L_0x080a:
        if (r13 == 0) goto L_0x081b;
    L_0x080c:
        r2 = 0;
        r13.finishMovie(r2);	 Catch:{ Exception -> 0x0811 }
        goto L_0x081b;
    L_0x0811:
        r0 = move-exception;
        r2 = "FFF";
        r3 = r0.getMessage();
        android.util.Log.e(r2, r3);
    L_0x081b:
        r2 = new java.lang.StringBuilder;
        r3 = "time = ";
        r2.<init>(r3);
        r3 = java.lang.System.currentTimeMillis();
        r5 = r3 - r23;
        r2.append(r5);
        r2 = r2.toString();
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6742f(r2);
        throw r1;
    L_0x0833:
        r1 = r10;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.videocompressor.VideoCompressor.convertVideo(java.lang.String, long, long, int, int, int, int, int, int, java.lang.String):boolean");
    }

    public boolean startConvert() {
        VideoCompressor videoCompressor = this;
        int i = 1;
        while (i <= 5) {
            int i2 = i;
            if (convertVideo(videoCompressor.mInputVideoPath, videoCompressor.mCompressVideoInfo.f8677b, videoCompressor.mCompressVideoInfo.f8678c, videoCompressor.mCompressVideoInfo.f8683h, videoCompressor.mCompressVideoInfo.f8684i, videoCompressor.mCompressVideoInfo.f8680e, videoCompressor.mCompressVideoInfo.f8681f, videoCompressor.mCompressVideoInfo.f8682g, videoCompressor.mCompressVideoInfo.f8685j, videoCompressor.mOutputVideoPath)) {
                return true;
            }
            try {
                Thread.sleep((long) (IjkMediaCodecInfo.RANK_MAX * i2));
            } catch (Throwable e) {
                C2480b.m6737b("Exception in interrupt", e);
            }
            i = i2 + 1;
        }
        return false;
    }
}
