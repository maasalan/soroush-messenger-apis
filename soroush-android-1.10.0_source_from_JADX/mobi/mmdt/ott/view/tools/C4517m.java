package mobi.mmdt.ott.view.tools;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;

public final class C4517m {
    public static boolean m8233a(String str, byte[] bArr) {
        File file = new File(str);
        boolean createNewFile = !file.exists() ? file.createNewFile() : true;
        if (createNewFile) {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            bArr = new byte[10240];
            while (true) {
                int read = byteArrayInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            fileOutputStream.close();
        }
        return createNewFile;
    }
}
