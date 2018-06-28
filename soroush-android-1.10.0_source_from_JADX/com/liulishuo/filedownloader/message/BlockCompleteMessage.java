package com.liulishuo.filedownloader.message;

import com.liulishuo.filedownloader.p205h.C2185f;

public interface BlockCompleteMessage {

    public static class BlockCompleteMessageImpl extends MessageSnapshot implements BlockCompleteMessage {
        private final MessageSnapshot f18875c;

        public BlockCompleteMessageImpl(MessageSnapshot messageSnapshot) {
            super(messageSnapshot.f15595a);
            if (messageSnapshot.mo3094b() != (byte) -3) {
                throw new IllegalArgumentException(C2185f.m5996a("can't create the block complete message for id[%d], status[%d]", Integer.valueOf(messageSnapshot.f15595a), Byte.valueOf(messageSnapshot.mo3094b())));
            } else {
                this.f18875c = messageSnapshot;
            }
        }

        public final byte mo3094b() {
            return (byte) 4;
        }

        public final MessageSnapshot g_() {
            return this.f18875c;
        }
    }

    MessageSnapshot g_();
}
