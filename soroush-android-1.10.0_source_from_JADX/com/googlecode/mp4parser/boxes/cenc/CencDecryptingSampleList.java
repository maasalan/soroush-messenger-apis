package com.googlecode.mp4parser.boxes.cenc;

import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.RangeStartMap;
import com.p149g.p152b.p153a.C1613a;
import com.p149g.p152b.p153a.C1613a.C1612j;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class CencDecryptingSampleList extends AbstractList<Sample> {
    String encryptionAlgo;
    RangeStartMap<Integer, SecretKey> keys;
    List<Sample> parent;
    List<C1613a> sencInfo;

    public CencDecryptingSampleList(RangeStartMap<Integer, SecretKey> rangeStartMap, List<Sample> list, List<C1613a> list2, String str) {
        this.keys = new RangeStartMap();
        this.sencInfo = list2;
        this.keys = rangeStartMap;
        this.parent = list;
        this.encryptionAlgo = str;
    }

    public CencDecryptingSampleList(SecretKey secretKey, List<Sample> list, List<C1613a> list2) {
        this(new RangeStartMap(Integer.valueOf(0), secretKey), list, list2, "cenc");
    }

    public Sample get(int i) {
        if (this.keys.get(Integer.valueOf(i)) == null) {
            return (Sample) this.parent.get(i);
        }
        Sample sample = (Sample) this.parent.get(i);
        ByteBuffer asByteBuffer = sample.asByteBuffer();
        asByteBuffer.rewind();
        ByteBuffer allocate = ByteBuffer.allocate(asByteBuffer.limit());
        C1613a c1613a = (C1613a) this.sencInfo.get(i);
        Cipher cipher = getCipher((SecretKey) this.keys.get(Integer.valueOf(i)), c1613a.f5048a);
        try {
            byte[] doFinal;
            int i2 = 0;
            if (c1613a.f5049b == null || c1613a.f5049b.length <= 0) {
                byte[] bArr = new byte[asByteBuffer.limit()];
                asByteBuffer.get(bArr);
                if ("cbc1".equals(this.encryptionAlgo)) {
                    int length = (bArr.length / 16) * 16;
                    allocate.put(cipher.doFinal(bArr, 0, length));
                    allocate.put(bArr, length, bArr.length - length);
                } else if ("cenc".equals(this.encryptionAlgo)) {
                    doFinal = cipher.doFinal(bArr);
                }
                asByteBuffer.rewind();
                allocate.rewind();
                return new SampleImpl(allocate);
            }
            C1612j[] c1612jArr = c1613a.f5049b;
            int length2 = c1612jArr.length;
            while (i2 < length2) {
                C1612j c1612j = c1612jArr[i2];
                int a = c1612j.mo2986a();
                int l2i = CastUtils.l2i(c1612j.mo2987b());
                byte[] bArr2 = new byte[a];
                asByteBuffer.get(bArr2);
                allocate.put(bArr2);
                if (l2i > 0) {
                    byte[] bArr3 = new byte[l2i];
                    asByteBuffer.get(bArr3);
                    allocate.put(cipher.update(bArr3));
                }
                i2++;
            }
            if (asByteBuffer.remaining() > 0) {
                PrintStream printStream = System.err;
                StringBuilder stringBuilder = new StringBuilder("Decrypted sample but still data remaining: ");
                stringBuilder.append(sample.getSize());
                printStream.println(stringBuilder.toString());
            }
            doFinal = cipher.doFinal();
            allocate.put(doFinal);
            asByteBuffer.rewind();
            allocate.rewind();
            return new SampleImpl(allocate);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        }
    }

    Cipher getCipher(SecretKey secretKey, byte[] bArr) {
        Object obj = new byte[16];
        System.arraycopy(bArr, 0, obj, 0, bArr.length);
        try {
            Cipher instance;
            if ("cenc".equals(this.encryptionAlgo)) {
                instance = Cipher.getInstance("AES/CTR/NoPadding");
                instance.init(2, secretKey, new IvParameterSpec(obj));
                return instance;
            } else if ("cbc1".equals(this.encryptionAlgo)) {
                instance = Cipher.getInstance("AES/CBC/NoPadding");
                instance.init(2, secretKey, new IvParameterSpec(obj));
                return instance;
            } else {
                throw new RuntimeException("Only cenc & cbc1 is supported as encryptionAlgo");
            }
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        } catch (Throwable e22) {
            throw new RuntimeException(e22);
        } catch (Throwable e222) {
            throw new RuntimeException(e222);
        }
    }

    public int size() {
        return this.parent.size();
    }
}
