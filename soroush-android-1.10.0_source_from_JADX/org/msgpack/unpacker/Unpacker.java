package org.msgpack.unpacker;

import java.io.Closeable;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import org.msgpack.template.Template;
import org.msgpack.type.Value;
import org.msgpack.type.ValueType;

public interface Unpacker extends Closeable, Iterable<Value> {
    ValueType getNextType();

    int getReadByteCount();

    UnpackerIterator iterator();

    <T> T read(Class<T> cls);

    <T> T read(T t);

    <T> T read(T t, Template<T> template);

    <T> T read(Template<T> template);

    int readArrayBegin();

    void readArrayEnd();

    void readArrayEnd(boolean z);

    BigInteger readBigInteger();

    boolean readBoolean();

    byte readByte();

    byte[] readByteArray();

    ByteBuffer readByteBuffer();

    double readDouble();

    float readFloat();

    int readInt();

    long readLong();

    int readMapBegin();

    void readMapEnd();

    void readMapEnd(boolean z);

    void readNil();

    short readShort();

    String readString();

    Value readValue();

    void resetReadByteCount();

    void setArraySizeLimit(int i);

    void setMapSizeLimit(int i);

    void setRawSizeLimit(int i);

    void skip();

    boolean trySkipNil();
}
