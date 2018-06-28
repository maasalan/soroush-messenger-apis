package com.googlecode.mp4parser.boxes.cenc;

import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.RangeStartMap;
import com.p149g.p152b.p153a.C1613a;
import com.p149g.p152b.p153a.C1613a.C1612j;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.AbstractList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class CencEncryptingSampleList extends AbstractList<Sample> {
    List<C1613a> auxiliaryDataFormats;
    RangeStartMap<Integer, SecretKey> ceks;
    Cipher cipher;
    private final String encryptionAlgo;
    List<Sample> parent;

    private class EncryptedSampleImpl implements Sample {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final SecretKey cek;
        private final C1613a cencSampleAuxiliaryDataFormat;
        private final Cipher cipher;
        private final Sample clearSample;

        static {
            Class cls = CencEncryptingSampleList.class;
        }

        private EncryptedSampleImpl(Sample sample, C1613a c1613a, Cipher cipher, SecretKey secretKey) {
            this.clearSample = sample;
            this.cencSampleAuxiliaryDataFormat = c1613a;
            this.cipher = cipher;
            this.cek = secretKey;
        }

        public ByteBuffer asByteBuffer() {
            ByteBuffer byteBuffer = (ByteBuffer) this.clearSample.asByteBuffer().rewind();
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.limit());
            C1613a c1613a = this.cencSampleAuxiliaryDataFormat;
            CencEncryptingSampleList.this.initCipher(this.cencSampleAuxiliaryDataFormat.f5048a, this.cek);
            try {
                int i = 0;
                int length;
                if (c1613a.f5049b != null) {
                    C1612j[] c1612jArr = c1613a.f5049b;
                    length = c1612jArr.length;
                    while (i < length) {
                        C1612j c1612j = c1612jArr[i];
                        byte[] bArr = new byte[c1612j.mo2986a()];
                        byteBuffer.get(bArr);
                        allocate.put(bArr);
                        if (c1612j.mo2987b() > 0) {
                            byte[] bArr2 = new byte[CastUtils.l2i(c1612j.mo2987b())];
                            byteBuffer.get(bArr2);
                            allocate.put(this.cipher.update(bArr2));
                        }
                        i++;
                    }
                } else {
                    byte[] bArr3 = new byte[byteBuffer.limit()];
                    byteBuffer.get(bArr3);
                    if ("cbc1".equals(CencEncryptingSampleList.this.encryptionAlgo)) {
                        length = (bArr3.length / 16) * 16;
                        allocate.put(this.cipher.doFinal(bArr3, 0, length));
                        allocate.put(bArr3, length, bArr3.length - length);
                    } else if ("cenc".equals(CencEncryptingSampleList.this.encryptionAlgo)) {
                        allocate.put(this.cipher.doFinal(bArr3));
                    }
                }
                byteBuffer.rewind();
                allocate.rewind();
                return allocate;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            } catch (Throwable e2) {
                throw new RuntimeException(e2);
            }
        }

        public long getSize() {
            return this.clearSample.getSize();
        }

        public void writeTo(WritableByteChannel writableByteChannel) {
            ByteBuffer byteBuffer = (ByteBuffer) this.clearSample.asByteBuffer().rewind();
            CencEncryptingSampleList.this.initCipher(this.cencSampleAuxiliaryDataFormat.f5048a, this.cek);
            try {
                ByteBuffer wrap;
                int i = 0;
                byte[] bArr;
                int length;
                if (this.cencSampleAuxiliaryDataFormat.f5049b == null || this.cencSampleAuxiliaryDataFormat.f5049b.length <= 0) {
                    bArr = new byte[byteBuffer.limit()];
                    byteBuffer.get(bArr);
                    if ("cbc1".equals(CencEncryptingSampleList.this.encryptionAlgo)) {
                        length = (bArr.length / 16) * 16;
                        writableByteChannel.write(ByteBuffer.wrap(this.cipher.doFinal(bArr, 0, length)));
                        wrap = ByteBuffer.wrap(bArr, length, bArr.length - length);
                    } else {
                        if ("cenc".equals(CencEncryptingSampleList.this.encryptionAlgo)) {
                            wrap = ByteBuffer.wrap(this.cipher.doFinal(bArr));
                        }
                        byteBuffer.rewind();
                    }
                }
                bArr = new byte[byteBuffer.limit()];
                byteBuffer.get(bArr);
                C1612j[] c1612jArr = this.cencSampleAuxiliaryDataFormat.f5049b;
                int length2 = c1612jArr.length;
                length = 0;
                while (i < length2) {
                    C1612j c1612j = c1612jArr[i];
                    int a = length + c1612j.mo2986a();
                    if (c1612j.mo2987b() > 0) {
                        this.cipher.update(bArr, a, CastUtils.l2i(c1612j.mo2987b()), bArr, a);
                        length = (int) (((long) a) + c1612j.mo2987b());
                    } else {
                        length = a;
                    }
                    i++;
                }
                wrap = ByteBuffer.wrap(bArr);
                writableByteChannel.write(wrap);
                byteBuffer.rewind();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            } catch (Throwable e2) {
                throw new RuntimeException(e2);
            } catch (Throwable e22) {
                throw new RuntimeException(e22);
            }
        }
    }

    public CencEncryptingSampleList(RangeStartMap<Integer, SecretKey> rangeStartMap, List<Sample> list, List<C1613a> list2, String str) {
        this.ceks = new RangeStartMap();
        this.auxiliaryDataFormats = list2;
        this.ceks = rangeStartMap;
        this.encryptionAlgo = str;
        this.parent = list;
        try {
            if ("cenc".equals(str)) {
                this.cipher = Cipher.getInstance("AES/CTR/NoPadding");
            } else if ("cbc1".equals(str)) {
                this.cipher = Cipher.getInstance("AES/CBC/NoPadding");
            } else {
                throw new RuntimeException("Only cenc & cbc1 is supported as encryptionAlgo");
            }
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        }
    }

    public CencEncryptingSampleList(SecretKey secretKey, List<Sample> list, List<C1613a> list2) {
        this(new RangeStartMap(Integer.valueOf(0), secretKey), list, list2, "cenc");
    }

    public Sample get(int i) {
        Sample sample = (Sample) this.parent.get(i);
        return this.ceks.get(Integer.valueOf(i)) != null ? new EncryptedSampleImpl(sample, (C1613a) this.auxiliaryDataFormats.get(i), this.cipher, (SecretKey) this.ceks.get(Integer.valueOf(i))) : sample;
    }

    protected void initCipher(byte[] bArr, SecretKey secretKey) {
        try {
            Object obj = new byte[16];
            System.arraycopy(bArr, 0, obj, 0, bArr.length);
            this.cipher.init(1, secretKey, new IvParameterSpec(obj));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        }
    }

    public int size() {
        return this.parent.size();
    }
}
