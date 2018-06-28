package org.msgpack.template;

import java.math.BigInteger;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class BigIntegerTemplate extends AbstractTemplate<BigInteger> {
    static final BigIntegerTemplate instance = new BigIntegerTemplate();

    private BigIntegerTemplate() {
    }

    public static BigIntegerTemplate getInstance() {
        return instance;
    }

    public BigInteger read(Unpacker unpacker, BigInteger bigInteger, boolean z) {
        return (z || !unpacker.trySkipNil()) ? unpacker.readBigInteger() : null;
    }

    public void write(Packer packer, BigInteger bigInteger, boolean z) {
        if (bigInteger != null) {
            packer.write(bigInteger);
        } else if (z) {
            throw new MessageTypeException("Attempted to write null");
        } else {
            packer.writeNil();
        }
    }
}
