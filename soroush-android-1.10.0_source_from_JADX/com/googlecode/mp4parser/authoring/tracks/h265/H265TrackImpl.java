package com.googlecode.mp4parser.authoring.tracks.h265;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.FileDataSourceImpl;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack;
import com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.LookAhead;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.util.ByteBufferByteChannel;
import com.p149g.p150a.p151b.C1611d.C1610a;
import com.p149g.p150a.p151b.C6534c;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.linphone.core.Privacy;
import org.p487a.p490b.p492b.C4600b;

public class H265TrackImpl extends AbstractH26XTrack implements NalUnitTypes {
    ArrayList<ByteBuffer> pps = new ArrayList();
    ArrayList<Sample> samples = new ArrayList();
    ArrayList<ByteBuffer> sps = new ArrayList();
    SampleDescriptionBox stsd;
    ArrayList<ByteBuffer> vps = new ArrayList();

    public H265TrackImpl(DataSource dataSource) {
        super(dataSource);
        Object arrayList = new ArrayList();
        LookAhead lookAhead = new LookAhead(dataSource);
        boolean[] zArr = new boolean[1];
        boolean[] zArr2 = new boolean[]{true};
        while (true) {
            ByteBuffer findNextNal = findNextNal(lookAhead);
            if (findNextNal == null) {
                this.stsd = createSampleDescriptionBox();
                this.decodingTimes = new long[this.samples.size()];
                getTrackMetaData().setTimescale(25);
                Arrays.fill(this.decodingTimes, 1);
                return;
            }
            PrintStream printStream;
            NalUnitHeader nalUnitHeader = getNalUnitHeader(findNextNal);
            if (zArr[0]) {
                if (!isVcl(nalUnitHeader)) {
                    switch (nalUnitHeader.nalUnitType) {
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
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
                            break;
                        default:
                            break;
                    }
                } else if ((findNextNal.get(2) & -128) != 0) {
                }
                wrapUp(arrayList, zArr, zArr2);
            }
            int i = nalUnitHeader.nalUnitType;
            if (i != 39) {
                String str;
                switch (i) {
                    case 32:
                        findNextNal.position(2);
                        this.vps.add(findNextNal.slice());
                        printStream = System.err;
                        str = "Stored VPS";
                        break;
                    case 33:
                        findNextNal.position(2);
                        this.sps.add(findNextNal.slice());
                        findNextNal.position(1);
                        SequenceParameterSetRbsp sequenceParameterSetRbsp = new SequenceParameterSetRbsp(Channels.newInputStream(new ByteBufferByteChannel(findNextNal.slice())));
                        printStream = System.err;
                        str = "Stored SPS";
                        break;
                    case 34:
                        findNextNal.position(2);
                        this.pps.add(findNextNal.slice());
                        printStream = System.err;
                        str = "Stored PPS";
                        break;
                    default:
                        break;
                }
                printStream.println(str);
            } else {
                SEIMessage sEIMessage = new SEIMessage(new BitReaderBuffer(findNextNal.slice()));
            }
            switch (nalUnitHeader.nalUnitType) {
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                    break;
                default:
                    printStream = System.err;
                    StringBuilder stringBuilder = new StringBuilder("Adding ");
                    stringBuilder.append(nalUnitHeader.nalUnitType);
                    printStream.println(stringBuilder.toString());
                    arrayList.add(findNextNal);
                    break;
            }
            if (isVcl(nalUnitHeader)) {
                switch (nalUnitHeader.nalUnitType) {
                    case 19:
                    case 20:
                        zArr2[0] = zArr2[0] & true;
                        break;
                    default:
                        zArr2[0] = false;
                        break;
                }
            }
            zArr[0] = zArr[0] | isVcl(nalUnitHeader);
        }
    }

    private SampleDescriptionBox createSampleDescriptionBox() {
        this.stsd = new SampleDescriptionBox();
        Box visualSampleEntry = new VisualSampleEntry(VisualSampleEntry.TYPE6);
        visualSampleEntry.setDataReferenceIndex(1);
        visualSampleEntry.setDepth(24);
        visualSampleEntry.setFrameCount(1);
        visualSampleEntry.setHorizresolution(72.0d);
        visualSampleEntry.setVertresolution(72.0d);
        visualSampleEntry.setWidth(640);
        visualSampleEntry.setHeight(480);
        visualSampleEntry.setCompressorname("HEVC Coding");
        Object c6534c = new C6534c();
        C1610a c1610a = new C1610a();
        c1610a.f5017a = true;
        c1610a.f5019c = 33;
        c1610a.f5020d = new ArrayList();
        Iterator it = this.sps.iterator();
        while (it.hasNext()) {
            c1610a.f5020d.add(AbstractH26XTrack.toArray((ByteBuffer) it.next()));
        }
        C1610a c1610a2 = new C1610a();
        c1610a2.f5017a = true;
        c1610a2.f5019c = 34;
        c1610a2.f5020d = new ArrayList();
        Iterator it2 = this.pps.iterator();
        while (it2.hasNext()) {
            c1610a2.f5020d.add(AbstractH26XTrack.toArray((ByteBuffer) it2.next()));
        }
        C1610a c1610a3 = new C1610a();
        c1610a3.f5017a = true;
        c1610a3.f5019c = 34;
        c1610a3.f5020d = new ArrayList();
        Iterator it3 = this.vps.iterator();
        while (it3.hasNext()) {
            c1610a3.f5020d.add(AbstractH26XTrack.toArray((ByteBuffer) it3.next()));
        }
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(C6534c.f17846c, c6534c, c6534c));
        c6534c.f17867a.f5044w.addAll(Arrays.asList(new C1610a[]{c1610a, c1610a3, c1610a2}));
        visualSampleEntry.addBox(c6534c);
        this.stsd.addBox(visualSampleEntry);
        return this.stsd;
    }

    public static void main(String[] strArr) {
        Track h265TrackImpl = new H265TrackImpl(new FileDataSourceImpl("c:\\content\\test-UHD-HEVC_01_FMV_Med_track1.hvc"));
        Movie movie = new Movie();
        movie.addTrack(h265TrackImpl);
        new DefaultMp4Builder().build(movie).writeContainer(new FileOutputStream("output.mp4").getChannel());
    }

    public String getHandler() {
        return "vide";
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

    public SampleDescriptionBox getSampleDescriptionBox() {
        return null;
    }

    public List<Sample> getSamples() {
        return this.samples;
    }

    boolean isVcl(NalUnitHeader nalUnitHeader) {
        return nalUnitHeader.nalUnitType >= 0 && nalUnitHeader.nalUnitType <= 31;
    }

    public void wrapUp(List<ByteBuffer> list, boolean[] zArr, boolean[] zArr2) {
        this.samples.add(createSampleObject(list));
        PrintStream printStream = System.err;
        StringBuilder stringBuilder = new StringBuilder("Create AU from ");
        stringBuilder.append(list.size());
        stringBuilder.append(" NALs");
        printStream.print(stringBuilder.toString());
        if (zArr2[0]) {
            System.err.println("  IDR");
        } else {
            System.err.println();
        }
        zArr[0] = false;
        zArr2[0] = true;
        list.clear();
    }
}
