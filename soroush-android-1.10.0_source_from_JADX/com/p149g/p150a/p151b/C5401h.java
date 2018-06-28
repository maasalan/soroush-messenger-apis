package com.p149g.p150a.p151b;

import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import java.nio.ByteBuffer;

public final class C5401h extends GroupEntry {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                return true;
            }
        }
        return false;
    }

    public final ByteBuffer get() {
        return ByteBuffer.allocate(0);
    }

    public final String getType() {
        return "tsas";
    }

    public final int hashCode() {
        return 41;
    }

    public final void parse(ByteBuffer byteBuffer) {
    }
}
