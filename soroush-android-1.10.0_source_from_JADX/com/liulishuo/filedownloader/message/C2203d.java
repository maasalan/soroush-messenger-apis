package com.liulishuo.filedownloader.message;

import com.liulishuo.filedownloader.C2135a;
import com.liulishuo.filedownloader.message.BlockCompleteMessage.BlockCompleteMessageImpl;
import com.liulishuo.filedownloader.message.LargeMessageSnapshot.CompletedFlowDirectlySnapshot;
import com.liulishuo.filedownloader.message.LargeMessageSnapshot.CompletedSnapshot;
import com.liulishuo.filedownloader.message.LargeMessageSnapshot.ErrorMessageSnapshot;
import com.liulishuo.filedownloader.message.LargeMessageSnapshot.PausedSnapshot;
import com.liulishuo.filedownloader.message.LargeMessageSnapshot.WarnFlowDirectlySnapshot;
import com.liulishuo.filedownloader.message.LargeMessageSnapshot.WarnMessageSnapshot;
import com.liulishuo.filedownloader.p205h.C2185f;
import java.io.File;

public class C2203d {
    public static com.liulishuo.filedownloader.message.MessageSnapshot m6050a(byte r8, com.liulishuo.filedownloader.model.FileDownloadModel r9, com.liulishuo.filedownloader.p200c.C2154f.C2153a r10) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:57:0x013d in {3, 7, 9, 13, 15, 19, 21, 24, 25, 29, 31, 35, 37, 41, 43, 47, 49, 50, 53, 55, 56} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r1 = r9.f7290a;
        r0 = 1;
        r2 = 0;
        r3 = -4;
        if (r8 != r3) goto L_0x001b;
    L_0x0007:
        r8 = new java.lang.IllegalStateException;
        r9 = "please use #catchWarn instead %d";
        r10 = new java.lang.Object[r0];
        r0 = java.lang.Integer.valueOf(r1);
        r10[r2] = r0;
        r9 = com.liulishuo.filedownloader.p205h.C2185f.m5996a(r9, r10);
        r8.<init>(r9);
        throw r8;
    L_0x001b:
        switch(r8) {
            case -3: goto L_0x0105;
            case -2: goto L_0x001e;
            case -1: goto L_0x00e4;
            case 0: goto L_0x001e;
            case 1: goto L_0x00c1;
            case 2: goto L_0x0096;
            case 3: goto L_0x0079;
            case 4: goto L_0x001e;
            case 5: goto L_0x0053;
            case 6: goto L_0x004d;
            default: goto L_0x001e;
        };
    L_0x001e:
        r3 = "it can't takes a snapshot for the task(%s) when its status is %d,";
        r4 = 2;
        r5 = new java.lang.Object[r4];
        r5[r2] = r9;
        r6 = java.lang.Byte.valueOf(r8);
        r5[r0] = r6;
        r3 = com.liulishuo.filedownloader.p205h.C2185f.m5996a(r3, r5);
        r5 = com.liulishuo.filedownloader.message.C2203d.class;
        r6 = "it can't takes a snapshot for the task(%s) when its status is %d,";
        r4 = new java.lang.Object[r4];
        r4[r2] = r9;
        r8 = java.lang.Byte.valueOf(r8);
        r4[r0] = r8;
        com.liulishuo.filedownloader.p205h.C2182d.m5984d(r5, r6, r4);
        r8 = r10.f7181b;
        if (r8 == 0) goto L_0x011a;
    L_0x0044:
        r8 = new java.lang.IllegalStateException;
        r10 = r10.f7181b;
        r8.<init>(r3, r10);
        goto L_0x011f;
    L_0x004d:
        r8 = new com.liulishuo.filedownloader.message.MessageSnapshot$StartedMessageSnapshot;
        r8.<init>(r1);
        return r8;
    L_0x0053:
        r8 = r9.f7300k;
        if (r8 == 0) goto L_0x0068;
    L_0x0057:
        r8 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$RetryMessageSnapshot;
        r9 = r9.f7295f;
        r2 = r9.get();
        r4 = r10.f7181b;
        r5 = r10.f7182c;
        r0 = r8;
        r0.<init>(r1, r2, r4, r5);
        return r8;
    L_0x0068:
        r8 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$RetryMessageSnapshot;
        r9 = r9.f7295f;
        r2 = r9.get();
        r9 = (int) r2;
        r0 = r10.f7181b;
        r10 = r10.f7182c;
        r8.<init>(r1, r9, r0, r10);
        return r8;
    L_0x0079:
        r8 = r9.f7300k;
        if (r8 == 0) goto L_0x0089;
    L_0x007d:
        r8 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$ProgressMessageSnapshot;
        r9 = r9.f7295f;
        r9 = r9.get();
        r8.<init>(r1, r9);
        return r8;
    L_0x0089:
        r8 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$ProgressMessageSnapshot;
        r9 = r9.f7295f;
        r9 = r9.get();
        r9 = (int) r9;
        r8.<init>(r1, r9);
        return r8;
    L_0x0096:
        r8 = r9.f7293d;
        if (r8 == 0) goto L_0x009d;
    L_0x009a:
        r8 = r9.f7294e;
        goto L_0x009e;
    L_0x009d:
        r8 = 0;
    L_0x009e:
        r0 = r9.f7300k;
        if (r0 == 0) goto L_0x00b1;
    L_0x00a2:
        r7 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$ConnectedMessageSnapshot;
        r2 = r10.f7180a;
        r3 = r9.f7296g;
        r5 = r9.f7298i;
        r0 = r7;
        r6 = r8;
        r0.<init>(r1, r2, r3, r5, r6);
        r8 = r7;
        return r8;
    L_0x00b1:
        r6 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$ConnectedMessageSnapshot;
        r2 = r10.f7180a;
        r3 = r9.f7296g;
        r3 = (int) r3;
        r4 = r9.f7298i;
        r0 = r6;
        r5 = r8;
        r0.<init>(r1, r2, r3, r4, r5);
        r8 = r6;
        return r8;
    L_0x00c1:
        r8 = r9.f7300k;
        if (r8 == 0) goto L_0x00d4;
    L_0x00c5:
        r8 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$PendingMessageSnapshot;
        r10 = r9.f7295f;
        r2 = r10.get();
        r4 = r9.f7296g;
        r0 = r8;
        r0.<init>(r1, r2, r4);
        return r8;
    L_0x00d4:
        r8 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$PendingMessageSnapshot;
        r10 = r9.f7295f;
        r2 = r10.get();
        r10 = (int) r2;
        r2 = r9.f7296g;
        r9 = (int) r2;
        r8.<init>(r1, r10, r9);
        return r8;
    L_0x00e4:
        r8 = r9.f7300k;
        if (r8 == 0) goto L_0x00f6;
    L_0x00e8:
        r8 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$ErrorMessageSnapshot;
        r9 = r9.f7295f;
        r2 = r9.get();
        r9 = r10.f7181b;
        r8.<init>(r1, r2, r9);
        return r8;
    L_0x00f6:
        r8 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$ErrorMessageSnapshot;
        r9 = r9.f7295f;
        r2 = r9.get();
        r9 = (int) r2;
        r10 = r10.f7181b;
        r8.<init>(r1, r9, r10);
        return r8;
    L_0x0105:
        r8 = r9.f7300k;
        if (r8 == 0) goto L_0x0111;
    L_0x0109:
        r8 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$CompletedSnapshot;
        r9 = r9.f7296g;
        r8.<init>(r1, r2, r9);
        return r8;
    L_0x0111:
        r8 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$CompletedSnapshot;
        r9 = r9.f7296g;
        r9 = (int) r9;
        r8.<init>(r1, r2, r9);
        return r8;
    L_0x011a:
        r8 = new java.lang.IllegalStateException;
        r8.<init>(r3);
    L_0x011f:
        r10 = r9.f7300k;
        if (r10 == 0) goto L_0x0130;
    L_0x0123:
        r10 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$ErrorMessageSnapshot;
        r9 = r9.f7295f;
        r2 = r9.get();
        r10.<init>(r1, r2, r8);
    L_0x012e:
        r8 = r10;
        return r8;
    L_0x0130:
        r10 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$ErrorMessageSnapshot;
        r9 = r9.f7295f;
        r2 = r9.get();
        r9 = (int) r2;
        r10.<init>(r1, r9, r8);
        goto L_0x012e;
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.message.d.a(byte, com.liulishuo.filedownloader.model.FileDownloadModel, com.liulishuo.filedownloader.c.f$a):com.liulishuo.filedownloader.message.MessageSnapshot");
    }

    public static MessageSnapshot m6051a(int i, long j, long j2, boolean z) {
        return j2 > 2147483647L ? z ? new WarnFlowDirectlySnapshot(i, j, j2) : new WarnMessageSnapshot(i, j, j2) : z ? new SmallMessageSnapshot.WarnFlowDirectlySnapshot(i, (int) j, (int) j2) : new SmallMessageSnapshot.WarnMessageSnapshot(i, (int) j, (int) j2);
    }

    public static MessageSnapshot m6052a(int i, long j, Throwable th) {
        return j > 2147483647L ? new ErrorMessageSnapshot(i, j, th) : new SmallMessageSnapshot.ErrorMessageSnapshot(i, (int) j, th);
    }

    public static MessageSnapshot m6053a(int i, File file, boolean z) {
        long length = file.length();
        return length > 2147483647L ? z ? new CompletedFlowDirectlySnapshot(i, length) : new CompletedSnapshot(i, true, length) : z ? new SmallMessageSnapshot.CompletedFlowDirectlySnapshot(i, (int) length) : new SmallMessageSnapshot.CompletedSnapshot(i, true, (int) length);
    }

    public static MessageSnapshot m6054a(C2135a c2135a) {
        return c2135a.mo1918z() ? new PausedSnapshot(c2135a.mo1898f(), c2135a.mo1908p(), c2135a.mo1910r()) : new SmallMessageSnapshot.PausedSnapshot(c2135a.mo1898f(), c2135a.mo1907o(), c2135a.mo1909q());
    }

    public static MessageSnapshot m6055a(MessageSnapshot messageSnapshot) {
        if (messageSnapshot.mo3094b() == (byte) -3) {
            return new BlockCompleteMessageImpl(messageSnapshot);
        }
        throw new IllegalStateException(C2185f.m5996a("take block completed snapshot, must has already be completed. %d %d", Integer.valueOf(messageSnapshot.f15595a), Byte.valueOf(messageSnapshot.mo3094b())));
    }
}
