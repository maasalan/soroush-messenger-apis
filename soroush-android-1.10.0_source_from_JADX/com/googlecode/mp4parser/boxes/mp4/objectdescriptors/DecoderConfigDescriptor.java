package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.Hex;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@Descriptor(tags = {4})
public class DecoderConfigDescriptor extends BaseDescriptor {
    private static Logger log = Logger.getLogger(DecoderConfigDescriptor.class.getName());
    AudioSpecificConfig audioSpecificInfo;
    long avgBitRate;
    int bufferSizeDB;
    byte[] configDescriptorDeadBytes;
    DecoderSpecificInfo decoderSpecificInfo;
    long maxBitRate;
    int objectTypeIndication;
    List<ProfileLevelIndicationDescriptor> profileLevelIndicationDescriptors = new ArrayList();
    int streamType;
    int upStream;

    public AudioSpecificConfig getAudioSpecificInfo() {
        return this.audioSpecificInfo;
    }

    public long getAvgBitRate() {
        return this.avgBitRate;
    }

    public int getBufferSizeDB() {
        return this.bufferSizeDB;
    }

    public DecoderSpecificInfo getDecoderSpecificInfo() {
        return this.decoderSpecificInfo;
    }

    public long getMaxBitRate() {
        return this.maxBitRate;
    }

    public int getObjectTypeIndication() {
        return this.objectTypeIndication;
    }

    public List<ProfileLevelIndicationDescriptor> getProfileLevelIndicationDescriptors() {
        return this.profileLevelIndicationDescriptors;
    }

    public int getStreamType() {
        return this.streamType;
    }

    public int getUpStream() {
        return this.upStream;
    }

    public void parseDetail(ByteBuffer byteBuffer) {
        this.objectTypeIndication = IsoTypeReader.readUInt8(byteBuffer);
        int readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
        this.streamType = readUInt8 >>> 2;
        this.upStream = (readUInt8 >> 1) & 1;
        this.bufferSizeDB = IsoTypeReader.readUInt24(byteBuffer);
        this.maxBitRate = IsoTypeReader.readUInt32(byteBuffer);
        this.avgBitRate = IsoTypeReader.readUInt32(byteBuffer);
        if (byteBuffer.remaining() > 2) {
            readUInt8 = byteBuffer.position();
            BaseDescriptor createFrom = ObjectDescriptorFactory.createFrom(this.objectTypeIndication, byteBuffer);
            int position = byteBuffer.position() - readUInt8;
            Logger logger = log;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(createFrom);
            stringBuilder.append(" - DecoderConfigDescr1 read: ");
            stringBuilder.append(position);
            stringBuilder.append(", size: ");
            stringBuilder.append(createFrom != null ? Integer.valueOf(createFrom.getSize()) : null);
            logger.finer(stringBuilder.toString());
            if (createFrom != null) {
                readUInt8 = createFrom.getSize();
                if (position < readUInt8) {
                    this.configDescriptorDeadBytes = new byte[(readUInt8 - position)];
                    byteBuffer.get(this.configDescriptorDeadBytes);
                }
            }
            if (createFrom instanceof DecoderSpecificInfo) {
                this.decoderSpecificInfo = (DecoderSpecificInfo) createFrom;
            }
            if (createFrom instanceof AudioSpecificConfig) {
                this.audioSpecificInfo = (AudioSpecificConfig) createFrom;
            }
        }
        while (byteBuffer.remaining() > 2) {
            long position2 = (long) byteBuffer.position();
            BaseDescriptor createFrom2 = ObjectDescriptorFactory.createFrom(this.objectTypeIndication, byteBuffer);
            long position3 = ((long) byteBuffer.position()) - position2;
            Logger logger2 = log;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(createFrom2);
            stringBuilder2.append(" - DecoderConfigDescr2 read: ");
            stringBuilder2.append(position3);
            stringBuilder2.append(", size: ");
            stringBuilder2.append(createFrom2 != null ? Integer.valueOf(createFrom2.getSize()) : null);
            logger2.finer(stringBuilder2.toString());
            if (createFrom2 instanceof ProfileLevelIndicationDescriptor) {
                this.profileLevelIndicationDescriptors.add((ProfileLevelIndicationDescriptor) createFrom2);
            }
        }
    }

    public ByteBuffer serialize() {
        ByteBuffer allocate = ByteBuffer.allocate(serializedSize());
        IsoTypeWriter.writeUInt8(allocate, 4);
        IsoTypeWriter.writeUInt8(allocate, serializedSize() - 2);
        IsoTypeWriter.writeUInt8(allocate, this.objectTypeIndication);
        IsoTypeWriter.writeUInt8(allocate, ((this.streamType << 2) | (this.upStream << 1)) | 1);
        IsoTypeWriter.writeUInt24(allocate, this.bufferSizeDB);
        IsoTypeWriter.writeUInt32(allocate, this.maxBitRate);
        IsoTypeWriter.writeUInt32(allocate, this.avgBitRate);
        if (this.audioSpecificInfo != null) {
            allocate.put(this.audioSpecificInfo.serialize().array());
        }
        return allocate;
    }

    public int serializedSize() {
        return 15 + (this.audioSpecificInfo == null ? 0 : this.audioSpecificInfo.serializedSize());
    }

    public void setAudioSpecificInfo(AudioSpecificConfig audioSpecificConfig) {
        this.audioSpecificInfo = audioSpecificConfig;
    }

    public void setAvgBitRate(long j) {
        this.avgBitRate = j;
    }

    public void setBufferSizeDB(int i) {
        this.bufferSizeDB = i;
    }

    public void setMaxBitRate(long j) {
        this.maxBitRate = j;
    }

    public void setObjectTypeIndication(int i) {
        this.objectTypeIndication = i;
    }

    public void setStreamType(int i) {
        this.streamType = i;
    }

    public void setUpStream(int i) {
        this.upStream = i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DecoderConfigDescriptor");
        stringBuilder.append("{objectTypeIndication=");
        stringBuilder.append(this.objectTypeIndication);
        stringBuilder.append(", streamType=");
        stringBuilder.append(this.streamType);
        stringBuilder.append(", upStream=");
        stringBuilder.append(this.upStream);
        stringBuilder.append(", bufferSizeDB=");
        stringBuilder.append(this.bufferSizeDB);
        stringBuilder.append(", maxBitRate=");
        stringBuilder.append(this.maxBitRate);
        stringBuilder.append(", avgBitRate=");
        stringBuilder.append(this.avgBitRate);
        stringBuilder.append(", decoderSpecificInfo=");
        stringBuilder.append(this.decoderSpecificInfo);
        stringBuilder.append(", audioSpecificInfo=");
        stringBuilder.append(this.audioSpecificInfo);
        stringBuilder.append(", configDescriptorDeadBytes=");
        stringBuilder.append(Hex.encodeHex(this.configDescriptorDeadBytes != null ? this.configDescriptorDeadBytes : new byte[0]));
        stringBuilder.append(", profileLevelIndicationDescriptors=");
        stringBuilder.append(this.profileLevelIndicationDescriptors == null ? "null" : Arrays.asList(new List[]{this.profileLevelIndicationDescriptors}).toString());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
