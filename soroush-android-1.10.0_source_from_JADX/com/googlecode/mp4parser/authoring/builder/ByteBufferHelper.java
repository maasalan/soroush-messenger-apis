package com.googlecode.mp4parser.authoring.builder;

import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class ByteBufferHelper {
    public static List<ByteBuffer> mergeAdjacentBuffers(List<ByteBuffer> list) {
        List arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            Object obj2;
            int size = arrayList.size() - 1;
            ByteBuffer byteBuffer;
            if (size >= 0 && obj2.hasArray() && ((ByteBuffer) arrayList.get(size)).hasArray() && obj2.array() == ((ByteBuffer) arrayList.get(size)).array() && ((ByteBuffer) arrayList.get(size)).arrayOffset() + ((ByteBuffer) arrayList.get(size)).limit() == obj2.arrayOffset()) {
                byteBuffer = (ByteBuffer) arrayList.remove(size);
                obj2 = ByteBuffer.wrap(obj2.array(), byteBuffer.arrayOffset(), byteBuffer.limit() + obj2.limit()).slice();
            } else if (size >= 0 && (obj2 instanceof MappedByteBuffer) && (arrayList.get(size) instanceof MappedByteBuffer) && ((ByteBuffer) arrayList.get(size)).limit() == ((ByteBuffer) arrayList.get(size)).capacity() - obj2.capacity()) {
                byteBuffer = (ByteBuffer) arrayList.get(size);
                byteBuffer.limit(obj2.limit() + byteBuffer.limit());
            } else {
                obj2.reset();
            }
            arrayList.add(obj2);
        }
        return arrayList;
    }
}
