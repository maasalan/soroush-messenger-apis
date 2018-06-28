package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.util.UUIDConverter;
import java.nio.ByteBuffer;
import java.util.UUID;

public class CencSampleEncryptionInformationGroupEntry extends GroupEntry {
    public static final String TYPE = "seig";
    private boolean isEncrypted;
    private byte ivSize;
    private UUID kid;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CencSampleEncryptionInformationGroupEntry cencSampleEncryptionInformationGroupEntry = (CencSampleEncryptionInformationGroupEntry) obj;
        if (this.isEncrypted != cencSampleEncryptionInformationGroupEntry.isEncrypted || this.ivSize != cencSampleEncryptionInformationGroupEntry.ivSize) {
            return false;
        }
        if (this.kid != null) {
            if (!this.kid.equals(cencSampleEncryptionInformationGroupEntry.kid)) {
                return false;
            }
        } else if (cencSampleEncryptionInformationGroupEntry.kid != null) {
            return false;
        }
        return true;
    }

    public ByteBuffer get() {
        byte[] convert;
        ByteBuffer allocate = ByteBuffer.allocate(20);
        IsoTypeWriter.writeUInt24(allocate, this.isEncrypted);
        if (this.isEncrypted) {
            IsoTypeWriter.writeUInt8(allocate, this.ivSize);
            convert = UUIDConverter.convert(this.kid);
        } else {
            convert = new byte[17];
        }
        allocate.put(convert);
        allocate.rewind();
        return allocate;
    }

    public byte getIvSize() {
        return this.ivSize;
    }

    public UUID getKid() {
        return this.kid;
    }

    public String getType() {
        return TYPE;
    }

    public int hashCode() {
        return (31 * (((this.isEncrypted ? 7 : 19) * 31) + this.ivSize)) + (this.kid != null ? this.kid.hashCode() : 0);
    }

    public boolean isEncrypted() {
        return this.isEncrypted;
    }

    public void parse(ByteBuffer byteBuffer) {
        boolean z = true;
        if (IsoTypeReader.readUInt24(byteBuffer) != 1) {
            z = false;
        }
        this.isEncrypted = z;
        this.ivSize = (byte) IsoTypeReader.readUInt8(byteBuffer);
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        this.kid = UUIDConverter.convert(bArr);
    }

    public void setEncrypted(boolean z) {
        this.isEncrypted = z;
    }

    public void setIvSize(int i) {
        this.ivSize = (byte) i;
    }

    public void setKid(UUID uuid) {
        this.kid = uuid;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CencSampleEncryptionInformationGroupEntry{isEncrypted=");
        stringBuilder.append(this.isEncrypted);
        stringBuilder.append(", ivSize=");
        stringBuilder.append(this.ivSize);
        stringBuilder.append(", kid=");
        stringBuilder.append(this.kid);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
