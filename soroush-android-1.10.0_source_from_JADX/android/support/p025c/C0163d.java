package android.support.p025c;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;
import org.jivesoftware.smack.sm.packet.StreamManagement.AckRequest;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

final class C0163d {

    static class C0162a {
        long f487a;
        long f488b;

        C0162a() {
        }
    }

    static long m261a(File file) {
        long j = AckRequest.ELEMENT;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, j);
        try {
            j = C0163d.m262a(randomAccessFile, C0163d.m263a(randomAccessFile));
            return j;
        } finally {
            randomAccessFile.close();
        }
    }

    private static long m262a(RandomAccessFile randomAccessFile, C0162a c0162a) {
        CRC32 crc32 = new CRC32();
        long j = c0162a.f488b;
        randomAccessFile.seek(c0162a.f487a);
        byte[] bArr = new byte[16384];
        int read = randomAccessFile.read(bArr, 0, (int) Math.min(IjkMediaMeta.AV_CH_TOP_FRONT_RIGHT, j));
        while (read != -1) {
            crc32.update(bArr, 0, read);
            long j2 = j - ((long) read);
            if (j2 == 0) {
                break;
            }
            read = randomAccessFile.read(bArr, 0, (int) Math.min(IjkMediaMeta.AV_CH_TOP_FRONT_RIGHT, j2));
            j = j2;
        }
        return crc32.getValue();
    }

    private static C0162a m263a(RandomAccessFile randomAccessFile) {
        long length = randomAccessFile.length() - 22;
        long j = 0;
        if (length < 0) {
            StringBuilder stringBuilder = new StringBuilder("File too short to be a zip file: ");
            stringBuilder.append(randomAccessFile.length());
            throw new ZipException(stringBuilder.toString());
        }
        long j2 = length - IjkMediaMeta.AV_CH_TOP_BACK_CENTER;
        if (j2 >= 0) {
            j = j2;
        }
        int reverseBytes = Integer.reverseBytes(101010256);
        while (true) {
            randomAccessFile.seek(length);
            if (randomAccessFile.readInt() != reverseBytes) {
                long j3 = length - 1;
                if (j3 < j) {
                    throw new ZipException("End Of Central Directory signature not found");
                }
                length = j3;
            } else {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                C0162a c0162a = new C0162a();
                c0162a.f488b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                c0162a.f487a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                return c0162a;
            }
        }
    }
}
