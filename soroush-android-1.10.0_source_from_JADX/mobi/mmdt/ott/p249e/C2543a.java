package mobi.mmdt.ott.p249e;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import mobi.mmdt.ott.view.conversation.forward.C4058h;

public final class C2543a {

    static /* synthetic */ class C25421 {
        public static final /* synthetic */ int[] f8305a = new int[C4058h.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r0 = mobi.mmdt.ott.view.conversation.forward.C4058h.values();
            r0 = r0.length;
            r0 = new int[r0];
            f8305a = r0;
            r0 = f8305a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = mobi.mmdt.ott.view.conversation.forward.C4058h.f11621b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f8305a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = mobi.mmdt.ott.view.conversation.forward.C4058h.f11623d;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f8305a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = mobi.mmdt.ott.view.conversation.forward.C4058h.f11622c;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = f8305a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = mobi.mmdt.ott.view.conversation.forward.C4058h.f11624e;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.e.a.1.<clinit>():void");
        }
    }

    private static long m6983a(InputStream inputStream, OutputStream outputStream) {
        long j = 0;
        if (inputStream == null) {
            return 0;
        }
        byte[] bArr = new byte[ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    public static String m6984a(Context context, Uri uri, String str) {
        if (TextUtils.isEmpty(C2543a.m6985a(uri))) {
            return null;
        }
        File file = new File(str);
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                OutputStream fileOutputStream = new FileOutputStream(file);
                C2543a.m6983a(openInputStream, fileOutputStream);
                openInputStream.close();
                fileOutputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file.getAbsolutePath();
    }

    public static String m6985a(Uri uri) {
        String str = null;
        if (uri == null) {
            return null;
        }
        String path = uri.getPath();
        int lastIndexOf = path.lastIndexOf(47);
        if (lastIndexOf != -1) {
            str = path.substring(lastIndexOf + 1);
        }
        return str;
    }
}
