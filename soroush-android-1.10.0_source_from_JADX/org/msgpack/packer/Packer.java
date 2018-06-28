package org.msgpack.packer;

import java.io.Closeable;
import java.io.Flushable;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import org.msgpack.type.Value;

public interface Packer extends Closeable, Flushable {
    Packer write(byte b);

    Packer write(double d);

    Packer write(float f);

    Packer write(int i);

    Packer write(long j);

    Packer write(Boolean bool);

    Packer write(Byte b);

    Packer write(Double d);

    Packer write(Float f);

    Packer write(Integer num);

    Packer write(Long l);

    Packer write(Object obj);

    Packer write(Short sh);

    Packer write(String str);

    Packer write(BigInteger bigInteger);

    Packer write(ByteBuffer byteBuffer);

    Packer write(Value value);

    Packer write(short s);

    Packer write(boolean z);

    Packer write(byte[] bArr);

    Packer write(byte[] bArr, int i, int i2);

    Packer writeArrayBegin(int i);

    Packer writeArrayEnd();

    Packer writeArrayEnd(boolean z);

    Packer writeMapBegin(int i);

    Packer writeMapEnd();

    Packer writeMapEnd(boolean z);

    Packer writeNil();
}
