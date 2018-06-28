package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class InitialObjectDescriptor extends ObjectDescriptorBase {
    int audioProfileLevelIndication;
    List<ESDescriptor> esDescriptors = new ArrayList();
    List<ExtensionDescriptor> extensionDescriptors = new ArrayList();
    int graphicsProfileLevelIndication;
    int includeInlineProfileLevelFlag;
    int oDProfileLevelIndication;
    private int objectDescriptorId;
    int sceneProfileLevelIndication;
    List<BaseDescriptor> unknownDescriptors = new ArrayList();
    int urlFlag;
    int urlLength;
    String urlString;
    int visualProfileLevelIndication;

    public void parseDetail(ByteBuffer byteBuffer) {
        int readUInt16 = IsoTypeReader.readUInt16(byteBuffer);
        this.objectDescriptorId = (65472 & readUInt16) >> 6;
        this.urlFlag = (readUInt16 & 63) >> 5;
        this.includeInlineProfileLevelFlag = (readUInt16 & 31) >> 4;
        readUInt16 = getSize() - 2;
        if (this.urlFlag == 1) {
            this.urlLength = IsoTypeReader.readUInt8(byteBuffer);
            this.urlString = IsoTypeReader.readString(byteBuffer, this.urlLength);
            readUInt16 -= 1 + this.urlLength;
        } else {
            this.oDProfileLevelIndication = IsoTypeReader.readUInt8(byteBuffer);
            this.sceneProfileLevelIndication = IsoTypeReader.readUInt8(byteBuffer);
            this.audioProfileLevelIndication = IsoTypeReader.readUInt8(byteBuffer);
            this.visualProfileLevelIndication = IsoTypeReader.readUInt8(byteBuffer);
            this.graphicsProfileLevelIndication = IsoTypeReader.readUInt8(byteBuffer);
            readUInt16 -= 5;
            if (readUInt16 > 2) {
                List list;
                Object createFrom = ObjectDescriptorFactory.createFrom(-1, byteBuffer);
                readUInt16 -= createFrom.getSize();
                if (createFrom instanceof ESDescriptor) {
                    list = this.esDescriptors;
                    createFrom = (ESDescriptor) createFrom;
                } else {
                    list = this.unknownDescriptors;
                }
                list.add(createFrom);
            }
        }
        if (readUInt16 > 2) {
            BaseDescriptor createFrom2 = ObjectDescriptorFactory.createFrom(-1, byteBuffer);
            if (createFrom2 instanceof ExtensionDescriptor) {
                this.extensionDescriptors.add((ExtensionDescriptor) createFrom2);
                return;
            }
            this.unknownDescriptors.add(createFrom2);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InitialObjectDescriptor");
        stringBuilder.append("{objectDescriptorId=");
        stringBuilder.append(this.objectDescriptorId);
        stringBuilder.append(", urlFlag=");
        stringBuilder.append(this.urlFlag);
        stringBuilder.append(", includeInlineProfileLevelFlag=");
        stringBuilder.append(this.includeInlineProfileLevelFlag);
        stringBuilder.append(", urlLength=");
        stringBuilder.append(this.urlLength);
        stringBuilder.append(", urlString='");
        stringBuilder.append(this.urlString);
        stringBuilder.append('\'');
        stringBuilder.append(", oDProfileLevelIndication=");
        stringBuilder.append(this.oDProfileLevelIndication);
        stringBuilder.append(", sceneProfileLevelIndication=");
        stringBuilder.append(this.sceneProfileLevelIndication);
        stringBuilder.append(", audioProfileLevelIndication=");
        stringBuilder.append(this.audioProfileLevelIndication);
        stringBuilder.append(", visualProfileLevelIndication=");
        stringBuilder.append(this.visualProfileLevelIndication);
        stringBuilder.append(", graphicsProfileLevelIndication=");
        stringBuilder.append(this.graphicsProfileLevelIndication);
        stringBuilder.append(", esDescriptors=");
        stringBuilder.append(this.esDescriptors);
        stringBuilder.append(", extensionDescriptors=");
        stringBuilder.append(this.extensionDescriptors);
        stringBuilder.append(", unknownDescriptors=");
        stringBuilder.append(this.unknownDescriptors);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
