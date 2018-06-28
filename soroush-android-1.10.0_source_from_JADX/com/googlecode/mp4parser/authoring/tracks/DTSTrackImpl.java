package com.googlecode.mp4parser.authoring.tracks;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.CompositionTimeToSample.Entry;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.DTSSpecificBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import java.io.EOFException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.jivesoftware.smack.roster.Roster;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class DTSTrackImpl extends AbstractTrack {
    private static final int BUFFER = 67108864;
    int bcCoreBitRate = 0;
    int bcCoreChannelMask = 0;
    int bcCoreMaxSampleRate = 0;
    int bitrate;
    int channelCount;
    int channelMask = 0;
    int codecDelayAtMaxFs = 0;
    int coreBitRate = 0;
    int coreChannelMask = 0;
    int coreFramePayloadInBytes = 0;
    int coreMaxSampleRate = 0;
    boolean coreSubStreamPresent = false;
    private int dataOffset = 0;
    private DataSource dataSource;
    DTSSpecificBox ddts = new DTSSpecificBox();
    int extAvgBitrate = 0;
    int extFramePayloadInBytes = 0;
    int extPeakBitrate = 0;
    int extSmoothBuffSize = 0;
    boolean extensionSubStreamPresent = false;
    int frameSize = 0;
    boolean isVBR = false;
    private String lang = "eng";
    int lbrCodingPresent = 0;
    int lsbTrimPercent = 0;
    int maxSampleRate = 0;
    int numExtSubStreams = 0;
    int numFramesTotal = 0;
    int numSamplesOrigAudioAtMaxFs = 0;
    SampleDescriptionBox sampleDescriptionBox;
    private long[] sampleDurations;
    int sampleSize;
    int samplerate;
    private List<Sample> samples;
    int samplesPerFrame;
    int samplesPerFrameAtMaxFs = 0;
    TrackMetaData trackMetaData = new TrackMetaData();
    String type = PrivacyItem.SUBSCRIPTION_NONE;

    class LookAhead {
        ByteBuffer buffer;
        long bufferStartPos;
        private final int corePresent;
        long dataEnd;
        DataSource dataSource;
        int inBufferPos = 0;
        long start;

        LookAhead(DataSource dataSource, long j, long j2, int i) {
            this.dataSource = dataSource;
            this.bufferStartPos = j;
            this.dataEnd = j2 + j;
            this.corePresent = i;
            fillBuffer();
        }

        private void discardByte() {
            this.inBufferPos++;
        }

        private void discardNext4AndMarkStart() {
            this.start = this.bufferStartPos + ((long) this.inBufferPos);
            this.inBufferPos += 4;
        }

        private void discardQWord() {
            this.inBufferPos += 4;
        }

        private void fillBuffer() {
            System.err.println("Fill Buffer");
            this.buffer = this.dataSource.map(this.bufferStartPos, Math.min(this.dataEnd - this.bufferStartPos, 67108864));
        }

        private ByteBuffer getSample() {
            if (this.start >= this.bufferStartPos) {
                this.buffer.position((int) (this.start - this.bufferStartPos));
                Buffer slice = this.buffer.slice();
                slice.limit((int) (((long) this.inBufferPos) - (this.start - this.bufferStartPos)));
                return (ByteBuffer) slice;
            }
            throw new RuntimeException("damn! NAL exceeds buffer");
        }

        private boolean nextFourEquals(byte b, byte b2, byte b3, byte b4) {
            if (this.buffer.limit() - this.inBufferPos >= 4) {
                return this.buffer.get(this.inBufferPos) == b && this.buffer.get(this.inBufferPos + 1) == b2 && this.buffer.get(this.inBufferPos + 2) == b3 && this.buffer.get(this.inBufferPos + 3) == b4;
            } else {
                if ((this.bufferStartPos + ((long) this.inBufferPos)) + 4 < this.dataSource.size()) {
                    return false;
                }
                throw new EOFException();
            }
        }

        private boolean nextFourEquals0x64582025() {
            return nextFourEquals((byte) 100, (byte) 88, (byte) 32, (byte) 37);
        }

        private boolean nextFourEquals0x64582025orEof() {
            return nextFourEqualsOrEof((byte) 100, (byte) 88, (byte) 32, (byte) 37);
        }

        private boolean nextFourEquals0x7FFE8001() {
            return nextFourEquals(Byte.MAX_VALUE, (byte) -2, Byte.MIN_VALUE, (byte) 1);
        }

        private boolean nextFourEquals0x7FFE8001orEof() {
            return nextFourEqualsOrEof(Byte.MAX_VALUE, (byte) -2, Byte.MIN_VALUE, (byte) 1);
        }

        private boolean nextFourEqualsOrEof(byte b, byte b2, byte b3, byte b4) {
            if (this.buffer.limit() - this.inBufferPos >= 4) {
                if ((this.bufferStartPos + ((long) this.inBufferPos)) % 1048576 == 0) {
                    PrintStream printStream = System.err;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(((this.bufferStartPos + ((long) this.inBufferPos)) / IjkMediaMeta.AV_CH_SIDE_RIGHT) / IjkMediaMeta.AV_CH_SIDE_RIGHT);
                    printStream.println(stringBuilder.toString());
                }
                return this.buffer.get(this.inBufferPos) == b && this.buffer.get(this.inBufferPos + 1) == b2 && this.buffer.get(this.inBufferPos + 2) == b3 && this.buffer.get(this.inBufferPos + 3) == b4;
            } else if ((this.bufferStartPos + ((long) this.inBufferPos)) + 4 > this.dataEnd) {
                return this.bufferStartPos + ((long) this.inBufferPos) == this.dataEnd;
            } else {
                this.bufferStartPos = this.start;
                this.inBufferPos = 0;
                fillBuffer();
                return nextFourEquals0x7FFE8001();
            }
        }

        public java.nio.ByteBuffer findNextStart() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r2 = this;
        L_0x0000:
            r0 = r2.corePresent;	 Catch:{ EOFException -> 0x0033 }
            r1 = 1;	 Catch:{ EOFException -> 0x0033 }
            if (r0 != r1) goto L_0x000c;	 Catch:{ EOFException -> 0x0033 }
        L_0x0005:
            r0 = r2.nextFourEquals0x7FFE8001();	 Catch:{ EOFException -> 0x0033 }
            if (r0 == 0) goto L_0x002f;	 Catch:{ EOFException -> 0x0033 }
        L_0x000b:
            goto L_0x0012;	 Catch:{ EOFException -> 0x0033 }
        L_0x000c:
            r0 = r2.nextFourEquals0x64582025();	 Catch:{ EOFException -> 0x0033 }
            if (r0 == 0) goto L_0x002f;	 Catch:{ EOFException -> 0x0033 }
        L_0x0012:
            r2.discardNext4AndMarkStart();	 Catch:{ EOFException -> 0x0033 }
        L_0x0015:
            r0 = r2.corePresent;	 Catch:{ EOFException -> 0x0033 }
            if (r0 != r1) goto L_0x0020;	 Catch:{ EOFException -> 0x0033 }
        L_0x0019:
            r0 = r2.nextFourEquals0x7FFE8001orEof();	 Catch:{ EOFException -> 0x0033 }
            if (r0 == 0) goto L_0x002b;	 Catch:{ EOFException -> 0x0033 }
        L_0x001f:
            goto L_0x0026;	 Catch:{ EOFException -> 0x0033 }
        L_0x0020:
            r0 = r2.nextFourEquals0x64582025orEof();	 Catch:{ EOFException -> 0x0033 }
            if (r0 == 0) goto L_0x002b;	 Catch:{ EOFException -> 0x0033 }
        L_0x0026:
            r0 = r2.getSample();	 Catch:{ EOFException -> 0x0033 }
            return r0;	 Catch:{ EOFException -> 0x0033 }
        L_0x002b:
            r2.discardQWord();	 Catch:{ EOFException -> 0x0033 }
            goto L_0x0015;	 Catch:{ EOFException -> 0x0033 }
        L_0x002f:
            r2.discardByte();	 Catch:{ EOFException -> 0x0033 }
            goto L_0x0000;
        L_0x0033:
            r0 = 0;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.googlecode.mp4parser.authoring.tracks.DTSTrackImpl.LookAhead.findNextStart():java.nio.ByteBuffer");
        }
    }

    public DTSTrackImpl(DataSource dataSource) {
        super(dataSource.toString());
        this.dataSource = dataSource;
        parse();
    }

    public DTSTrackImpl(DataSource dataSource, String str) {
        super(dataSource.toString());
        this.lang = str;
        this.dataSource = dataSource;
        parse();
    }

    private List<Sample> generateSamples(DataSource dataSource, int i, long j, int i2) {
        LookAhead lookAhead = new LookAhead(dataSource, (long) i, j, i2);
        List<Sample> arrayList = new ArrayList();
        while (true) {
            final ByteBuffer findNextStart = lookAhead.findNextStart();
            if (findNextStart == null) {
                System.err.println("all samples found");
                return arrayList;
            }
            arrayList.add(new Sample() {
                public ByteBuffer asByteBuffer() {
                    return findNextStart;
                }

                public long getSize() {
                    return (long) findNextStart.rewind().remaining();
                }

                public void writeTo(WritableByteChannel writableByteChannel) {
                    writableByteChannel.write((ByteBuffer) findNextStart.rewind());
                }
            });
        }
    }

    private int getBitRate(int i) {
        switch (i) {
            case 0:
                return 32;
            case 1:
                return 56;
            case 2:
                return 64;
            case 3:
                return 96;
            case 4:
                return 112;
            case 5:
                return 128;
            case 6:
                return 192;
            case 7:
                return 224;
            case 8:
                return 256;
            case 9:
                return 320;
            case 10:
                return 384;
            case 11:
                return 448;
            case 12:
                return IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
            case 13:
                return 576;
            case 14:
                return 640;
            case 15:
                return 768;
            case 16:
                return 960;
            case 17:
                return Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE;
            case 18:
                return 1152;
            case 19:
                return 1280;
            case 20:
                return 1344;
            case 21:
                return 1408;
            case 22:
                return 1411;
            case 23:
                return 1472;
            case 24:
                return 1536;
            case 25:
                return -1;
            default:
                throw new IOException("Unknown bitrate value");
        }
    }

    private int getSampleRate(int i) {
        switch (i) {
            case 1:
                return 8000;
            case 2:
                return 16000;
            case 3:
                return 32000;
            case 6:
                return 11025;
            case 7:
                return 22050;
            case 8:
                return 44100;
            case 11:
                return 12000;
            case 12:
                return 24000;
            case 13:
                return 48000;
            default:
                throw new IOException("Unknown Sample Rate");
        }
    }

    private void parse() {
        if (readVariables()) {
            this.sampleDescriptionBox = new SampleDescriptionBox();
            Box audioSampleEntry = new AudioSampleEntry(this.type);
            audioSampleEntry.setChannelCount(this.channelCount);
            audioSampleEntry.setSampleRate((long) this.samplerate);
            audioSampleEntry.setDataReferenceIndex(1);
            audioSampleEntry.setSampleSize(16);
            audioSampleEntry.addBox(this.ddts);
            this.sampleDescriptionBox.addBox(audioSampleEntry);
            this.trackMetaData.setCreationTime(new Date());
            this.trackMetaData.setModificationTime(new Date());
            this.trackMetaData.setLanguage(this.lang);
            this.trackMetaData.setTimescale((long) this.samplerate);
            return;
        }
        throw new IOException();
    }

    private boolean parseAuprhdr(int i, ByteBuffer byteBuffer) {
        int i2;
        byteBuffer.get();
        short s = byteBuffer.getShort();
        this.maxSampleRate = (byteBuffer.get() << 16) | (byteBuffer.getShort() & InBandBytestreamManager.MAXIMUM_BLOCK_SIZE);
        this.numFramesTotal = byteBuffer.getInt();
        this.samplesPerFrameAtMaxFs = byteBuffer.getShort();
        this.numSamplesOrigAudioAtMaxFs = (byteBuffer.get() << 32) | (byteBuffer.getInt() & InBandBytestreamManager.MAXIMUM_BLOCK_SIZE);
        this.channelMask = byteBuffer.getShort();
        this.codecDelayAtMaxFs = byteBuffer.getShort();
        if ((s & 3) == 3) {
            this.bcCoreMaxSampleRate = (byteBuffer.get() << 16) | (byteBuffer.getShort() & InBandBytestreamManager.MAXIMUM_BLOCK_SIZE);
            this.bcCoreBitRate = byteBuffer.getShort();
            this.bcCoreChannelMask = byteBuffer.getShort();
            i2 = 28;
        } else {
            i2 = 21;
        }
        if ((s & 4) > 0) {
            this.lsbTrimPercent = byteBuffer.get();
            i2++;
        }
        if ((s & 8) > 0) {
            this.lbrCodingPresent = 1;
        }
        while (i2 < i) {
            byteBuffer.get();
            i2++;
        }
        return true;
    }

    private boolean parseCoressmd(int i, ByteBuffer byteBuffer) {
        this.coreMaxSampleRate = (byteBuffer.get() << 16) | (byteBuffer.getShort() & InBandBytestreamManager.MAXIMUM_BLOCK_SIZE);
        this.coreBitRate = byteBuffer.getShort();
        this.coreChannelMask = byteBuffer.getShort();
        this.coreFramePayloadInBytes = byteBuffer.getInt();
        for (int i2 = 11; i2 < i; i2++) {
            byteBuffer.get();
        }
        return true;
    }

    private void parseDtshdhdr(int i, ByteBuffer byteBuffer) {
        int i2;
        byteBuffer.getInt();
        byteBuffer.get();
        byteBuffer.getInt();
        byteBuffer.get();
        short s = byteBuffer.getShort();
        byteBuffer.get();
        this.numExtSubStreams = byteBuffer.get();
        if ((s & 1) == 1) {
            this.isVBR = true;
        }
        if ((s & 8) == 8) {
            this.coreSubStreamPresent = true;
        }
        if ((s & 16) == 16) {
            this.extensionSubStreamPresent = true;
            i2 = this.numExtSubStreams + 1;
        } else {
            i2 = 0;
        }
        this.numExtSubStreams = i2;
        for (i2 = 14; i2 < i; i2++) {
            byteBuffer.get();
        }
    }

    private boolean parseExtssmd(int i, ByteBuffer byteBuffer) {
        int i2;
        this.extAvgBitrate = (byteBuffer.get() << 16) | (byteBuffer.getShort() & InBandBytestreamManager.MAXIMUM_BLOCK_SIZE);
        if (this.isVBR) {
            this.extPeakBitrate = (byteBuffer.get() << 16) | (byteBuffer.getShort() & InBandBytestreamManager.MAXIMUM_BLOCK_SIZE);
            this.extSmoothBuffSize = byteBuffer.getShort();
            i2 = 8;
        } else {
            this.extFramePayloadInBytes = byteBuffer.getInt();
            i2 = 7;
        }
        while (i2 < i) {
            byteBuffer.get();
            i2++;
        }
        return true;
    }

    private boolean readVariables() {
        ByteBuffer map = this.dataSource.map(0, 25000);
        int i = map.getInt();
        int i2 = map.getInt();
        if (i == 1146377032) {
            if (i2 == 1145586770) {
                int i3;
                int i4;
                while (true) {
                    i3 = 0;
                    if (!(i == 1398035021 && r2 == 1145132097) && map.remaining() > 100) {
                        int i5 = (int) map.getLong();
                        if (i == 1146377032 && r2 == 1145586770) {
                            parseDtshdhdr(i5, map);
                        } else if (i != 1129271877 || r2 != 1397968196) {
                            i4 = 0;
                            if (i == 1096110162 && r2 == 759710802) {
                                if (!parseAuprhdr(i5, map)) {
                                    return false;
                                }
                            } else if (i != 1163416659 || r2 != 1398754628) {
                                while (i4 < i5) {
                                    map.get();
                                    i4++;
                                }
                            } else if (!parseExtssmd(i5, map)) {
                                return false;
                            }
                        } else if (!parseCoressmd(i5, map)) {
                            return false;
                        }
                        i = map.getInt();
                        i2 = map.getInt();
                    }
                }
                long j = map.getLong();
                r6.dataOffset = map.position();
                i = -1;
                int i6 = -1;
                int i7 = i6;
                int i8 = i7;
                i2 = 0;
                int i9 = i2;
                int i10 = i9;
                int i11 = i10;
                i4 = i11;
                int i12 = i4;
                int i13 = i12;
                int i14 = i13;
                int i15 = i14;
                int i16 = i15;
                while (i2 == 0) {
                    int i17 = i14;
                    int i18 = i15;
                    int i19 = i16;
                    i15 = map.position();
                    int i20 = map.getInt();
                    int i21;
                    if (i20 != 2147385345) {
                        i21 = i2;
                        i2 = 20;
                        if (i20 == 1683496997) {
                            long j2;
                            if (i6 == -1) {
                                r6.samplesPerFrame = r6.samplesPerFrameAtMaxFs;
                                i6 = 0;
                            }
                            BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(map);
                            i8 = 8;
                            bitReaderBuffer.readBits(8);
                            bitReaderBuffer.readBits(2);
                            if (bitReaderBuffer.readBits(1) == 0) {
                                i2 = 16;
                            } else {
                                i8 = 12;
                            }
                            i2 = bitReaderBuffer.readBits(i2) + 1;
                            map.position(i15 + (bitReaderBuffer.readBits(i8) + 1));
                            i20 = map.getInt();
                            if (i20 == 1515870810) {
                                if (i12 == 1) {
                                    i21 = 1;
                                }
                                i12 = 1;
                                j2 = j;
                                i14 = i17;
                            } else if (i20 == 1191201283) {
                                if (i17 == 1) {
                                    i21 = 1;
                                }
                                i14 = 1;
                                j2 = j;
                            } else {
                                i8 = i17;
                                if (i20 == 496366178) {
                                    if (i18 == 1) {
                                        i21 = 1;
                                    }
                                    i3 = 1;
                                    j2 = j;
                                    i14 = i8;
                                    i16 = i19;
                                    if (i21 == 0) {
                                        r6.frameSize += i2;
                                    }
                                    map.position(i15 + i2);
                                    i8 = 1;
                                    i15 = i3;
                                    i2 = i21;
                                    j = j2;
                                } else {
                                    j2 = j;
                                    i3 = i18;
                                    if (i20 == 1700671838) {
                                        if (i19 == 1) {
                                            i21 = 1;
                                        }
                                        i16 = 1;
                                    } else {
                                        int i22 = i19;
                                        if (i20 == 176167201) {
                                            if (i11 == 1) {
                                                i21 = 1;
                                            }
                                            i11 = 1;
                                        } else if (i20 == 1101174087) {
                                            if (i9 == 1) {
                                                i21 = 1;
                                            }
                                            i9 = 1;
                                        } else if (i20 == 45126241) {
                                            if (i10 == 1) {
                                                i21 = 1;
                                            }
                                            i10 = 1;
                                        }
                                        i16 = i22;
                                    }
                                    i14 = i8;
                                    if (i21 == 0) {
                                        r6.frameSize += i2;
                                    }
                                    map.position(i15 + i2);
                                    i8 = 1;
                                    i15 = i3;
                                    i2 = i21;
                                    j = j2;
                                }
                            }
                            i3 = i18;
                            i16 = i19;
                            if (i21 == 0) {
                                r6.frameSize += i2;
                            }
                            map.position(i15 + i2);
                            i8 = 1;
                            i15 = i3;
                            i2 = i21;
                            j = j2;
                        } else {
                            StringBuilder stringBuilder = new StringBuilder("No DTS_SYNCWORD_* found at ");
                            stringBuilder.append(map.position());
                            throw new IOException(stringBuilder.toString());
                        }
                    } else if (i6 == 1) {
                        i2 = 1;
                        i14 = i17;
                        i15 = i18;
                        i16 = i19;
                    } else {
                        BitReaderBuffer bitReaderBuffer2 = new BitReaderBuffer(map);
                        i20 = bitReaderBuffer2.readBits(1);
                        i7 = bitReaderBuffer2.readBits(5);
                        i6 = bitReaderBuffer2.readBits(1);
                        if (i20 == 1 && i7 == 31) {
                            if (i6 == 0) {
                                r6.samplesPerFrame = 32 * (bitReaderBuffer2.readBits(7) + 1);
                                i = bitReaderBuffer2.readBits(14);
                                r6.frameSize += i + 1;
                                i7 = bitReaderBuffer2.readBits(6);
                                r6.samplerate = getSampleRate(bitReaderBuffer2.readBits(4));
                                r6.bitrate = getBitRate(bitReaderBuffer2.readBits(5));
                                if (bitReaderBuffer2.readBits(1) == 0) {
                                    bitReaderBuffer2.readBits(1);
                                    bitReaderBuffer2.readBits(1);
                                    bitReaderBuffer2.readBits(1);
                                    bitReaderBuffer2.readBits(1);
                                    i13 = bitReaderBuffer2.readBits(3);
                                    i4 = bitReaderBuffer2.readBits(1);
                                    bitReaderBuffer2.readBits(1);
                                    i21 = i2;
                                    bitReaderBuffer2.readBits(2);
                                    bitReaderBuffer2.readBits(1);
                                    if (i6 == 1) {
                                        bitReaderBuffer2.readBits(16);
                                    }
                                    bitReaderBuffer2.readBits(1);
                                    i6 = bitReaderBuffer2.readBits(4);
                                    bitReaderBuffer2.readBits(2);
                                    switch (bitReaderBuffer2.readBits(3)) {
                                        case 0:
                                        case 1:
                                            i2 = 16;
                                            break;
                                        case 2:
                                        case 3:
                                            i2 = 20;
                                            break;
                                        case 5:
                                        case 6:
                                            i2 = 24;
                                            break;
                                        default:
                                            return false;
                                    }
                                    r6.sampleSize = i2;
                                    bitReaderBuffer2.readBits(1);
                                    bitReaderBuffer2.readBits(1);
                                    switch (i6) {
                                        default:
                                            bitReaderBuffer2.readBits(4);
                                            map.position((i15 + i) + 1);
                                            i14 = i17;
                                            i15 = i18;
                                            i16 = i19;
                                            i2 = i21;
                                            i = -1;
                                            i3 = false;
                                            i6 = 1;
                                            break;
                                    }
                                }
                                return false;
                            }
                        }
                        return false;
                    }
                    i = -1;
                    i3 = false;
                }
                int i23 = r6.samplesPerFrame;
                i23 = i23 != IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED ? i23 != Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE ? i23 != 2048 ? i23 != ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT ? i : 3 : 2 : 1 : i3;
                if (i23 == i) {
                    return i3;
                }
                DTSSpecificBox dTSSpecificBox;
                i = 31;
                if (!(i7 == 0 || i7 == 2)) {
                    switch (i7) {
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            break;
                        default:
                            break;
                    }
                }
                i = i7;
                if (i6 == 0) {
                    String str;
                    if (i9 == 1) {
                        if (i10 == 0) {
                            i7 = 17;
                            str = AudioSampleEntry.TYPE11;
                        } else {
                            i7 = 21;
                            str = AudioSampleEntry.TYPE12;
                        }
                    } else if (i11 == 1) {
                        i7 = 18;
                        str = AudioSampleEntry.TYPE13;
                    } else {
                        if (i10 == 1) {
                            r6.type = AudioSampleEntry.TYPE12;
                            i7 = i14;
                            if (i7 == 0 && i9 == 0) {
                                i7 = 19;
                                r6.samplerate = r6.maxSampleRate;
                                r6.sampleSize = 24;
                                i2 = i7;
                            } else if (i7 == 1 && i9 == 0) {
                                i7 = 20;
                                r6.samplerate = r6.maxSampleRate;
                                r6.sampleSize = 24;
                                i2 = i7;
                            } else if (i7 == 0 && i9 == 1) {
                                i7 = 21;
                                r6.samplerate = r6.maxSampleRate;
                                r6.sampleSize = 24;
                                i2 = i7;
                            }
                        }
                        i7 = i3;
                        r6.samplerate = r6.maxSampleRate;
                        r6.sampleSize = 24;
                        i2 = i7;
                    }
                    r6.type = str;
                    r6.samplerate = r6.maxSampleRate;
                    r6.sampleSize = 24;
                    i2 = i7;
                } else {
                    i7 = i14;
                    if (i8 > 0) {
                        i2 = i13;
                        r6.type = AudioSampleEntry.TYPE12;
                        if (i4 == 0) {
                            if (i10 == 0 && i7 == 1) {
                                i8 = i15;
                                if (i8 == 0) {
                                    i4 = i16;
                                    if (i4 == 0 && i9 == 0 && i11 == 0) {
                                        i2 = 5;
                                    }
                                    if (i10 != 0 && i7 == 0 && r11 == 0) {
                                        i2 = 1;
                                        if (i4 == 1 && i9 == 0 && i11 == 0) {
                                            i2 = 6;
                                        }
                                    } else {
                                        i2 = 1;
                                    }
                                    if (i10 != 0 && i7 == r2 && r11 == 0 && i4 == r2 && i9 == 0 && i11 == 0) {
                                        i2 = 9;
                                    } else if (i10 != 0 && i7 == 0 && r11 == 1 && i4 == 0 && i9 == 0 && i11 == 0) {
                                        i2 = 10;
                                    } else if (i10 != 0 && i7 == 1 && r11 == 1 && i4 == 0 && i9 == 0 && i11 == 0) {
                                        i2 = 13;
                                    } else if (i10 == 0 && i7 == 0 && r11 == 0 && i4 == 0 && i9 == 1 && i11 == 0) {
                                        i2 = 14;
                                    }
                                }
                            } else {
                                i8 = i15;
                            }
                            i4 = i16;
                            if (i10 != 0) {
                            }
                            i2 = 1;
                            if (i10 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            i2 = 14;
                        } else {
                            i8 = i15;
                            i4 = i16;
                            if (i2 == 0 && i10 == 0 && i7 == 0 && i8 == 0 && i4 == 1 && i9 == 0 && i11 == 0) {
                                i2 = 7;
                            } else if (i2 == 6 && i10 == 0 && i7 == 0 && i8 == 0 && i4 == 1 && i9 == 0 && i11 == 0) {
                                i2 = 8;
                            } else if (i2 == 0 && i10 == 0 && i7 == 0 && i8 == 1 && i4 == 0 && i9 == 0 && i11 == 0) {
                                i2 = 11;
                            } else if (i2 == 6 && i10 == 0 && i7 == 0 && i8 == 1 && i4 == 0 && i9 == 0 && i11 == 0) {
                                i2 = 12;
                            } else if (i2 == 0 && i10 == 0 && i7 == 0 && i8 == 0 && i4 == 0 && i9 == 1 && i11 == 0) {
                                i2 = 15;
                            } else if (i2 == 2 && i10 == 0 && i7 == 0 && i8 == 0 && i4 == 0 && i9 == 1 && i11 == 0) {
                                i2 = 16;
                            }
                        }
                    } else if (i4 > 0) {
                        i2 = i13;
                        if (i2 == 0) {
                            r6.type = "dtsc";
                            i2 = 2;
                        } else if (i2 == 2) {
                            r6.type = "dtsc";
                            i2 = 4;
                        } else if (i2 != 6) {
                            r6.type = AudioSampleEntry.TYPE12;
                        } else {
                            r6.type = AudioSampleEntry.TYPE12;
                            i2 = 3;
                        }
                    } else {
                        r6.type = "dtsc";
                        i2 = 1;
                    }
                    i2 = i3;
                }
                r6.ddts.setDTSSamplingFrequency((long) r6.maxSampleRate);
                if (r6.isVBR) {
                    dTSSpecificBox = r6.ddts;
                    i8 = r6.coreBitRate;
                    i10 = r6.extPeakBitrate;
                } else {
                    dTSSpecificBox = r6.ddts;
                    i8 = r6.coreBitRate;
                    i10 = r6.extAvgBitrate;
                }
                dTSSpecificBox.setMaxBitRate((long) ((i8 + i10) * IjkMediaCodecInfo.RANK_MAX));
                r6.ddts.setAvgBitRate((long) (IjkMediaCodecInfo.RANK_MAX * (r6.coreBitRate + r6.extAvgBitrate)));
                r6.ddts.setPcmSampleDepth(r6.sampleSize);
                r6.ddts.setFrameDuration(i23);
                r6.ddts.setStreamConstruction(i2);
                if ((r6.coreChannelMask & 8) <= 0) {
                    if ((r6.coreChannelMask & ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) <= 0) {
                        r6.ddts.setCoreLFEPresent(i3);
                        r6.ddts.setCoreLayout(i);
                        r6.ddts.setCoreSize(r6.coreFramePayloadInBytes);
                        r6.ddts.setStereoDownmix(i3);
                        r6.ddts.setRepresentationType(4);
                        r6.ddts.setChannelLayout(r6.channelMask);
                        if (r6.coreMaxSampleRate > 0 || r6.extAvgBitrate <= 0) {
                            r6.ddts.setMultiAssetFlag(i3);
                        } else {
                            r6.ddts.setMultiAssetFlag(1);
                        }
                        r6.ddts.setLBRDurationMod(r6.lbrCodingPresent);
                        r6.ddts.setReservedBoxPresent(i3);
                        r6.channelCount = i3;
                        while (i3 < 16) {
                            if (((r6.channelMask >> i3) & 1) != 1) {
                                if (i3 != 0) {
                                    if (!(i3 == 12 || i3 == 14)) {
                                        switch (i3) {
                                            case 3:
                                            case 4:
                                                break;
                                            default:
                                                switch (i3) {
                                                    case 7:
                                                    case 8:
                                                        break;
                                                    default:
                                                        r6.channelCount += 2;
                                                        continue;
                                                        continue;
                                                        continue;
                                                        continue;
                                                }
                                        }
                                    }
                                }
                                r6.channelCount++;
                            } else {
                                i2 = 1;
                            }
                            i3++;
                        }
                        r6.samples = generateSamples(r6.dataSource, r6.dataOffset, j, i6);
                        r6.sampleDurations = new long[r6.samples.size()];
                        Arrays.fill(r6.sampleDurations, (long) r6.samplesPerFrame);
                        return true;
                    }
                }
                r6.ddts.setCoreLFEPresent(1);
                r6.ddts.setCoreLayout(i);
                r6.ddts.setCoreSize(r6.coreFramePayloadInBytes);
                r6.ddts.setStereoDownmix(i3);
                r6.ddts.setRepresentationType(4);
                r6.ddts.setChannelLayout(r6.channelMask);
                if (r6.coreMaxSampleRate > 0) {
                }
                r6.ddts.setMultiAssetFlag(i3);
                r6.ddts.setLBRDurationMod(r6.lbrCodingPresent);
                r6.ddts.setReservedBoxPresent(i3);
                r6.channelCount = i3;
                while (i3 < 16) {
                    if (((r6.channelMask >> i3) & 1) != 1) {
                        i2 = 1;
                    } else {
                        if (i3 != 0) {
                            switch (i3) {
                                case 3:
                                case 4:
                                    break;
                                default:
                                    switch (i3) {
                                        case 7:
                                        case 8:
                                            break;
                                        default:
                                            r6.channelCount += 2;
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                    }
                            }
                        }
                        r6.channelCount++;
                    }
                    i3++;
                }
                r6.samples = generateSamples(r6.dataSource, r6.dataOffset, j, i6);
                r6.sampleDurations = new long[r6.samples.size()];
                Arrays.fill(r6.sampleDurations, (long) r6.samplesPerFrame);
                return true;
            }
        }
        throw new IOException("data does not start with 'DTSHDHDR' as required for a DTS-HD file");
    }

    public void close() {
        this.dataSource.close();
    }

    public List<Entry> getCompositionTimeEntries() {
        return null;
    }

    public String getHandler() {
        return "soun";
    }

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return null;
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.sampleDescriptionBox;
    }

    public long[] getSampleDurations() {
        return this.sampleDurations;
    }

    public List<Sample> getSamples() {
        return this.samples;
    }

    public long[] getSyncSamples() {
        return null;
    }

    public TrackMetaData getTrackMetaData() {
        return this.trackMetaData;
    }
}
