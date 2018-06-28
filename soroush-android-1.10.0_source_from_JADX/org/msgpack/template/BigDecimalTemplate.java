package org.msgpack.template;

import java.math.BigDecimal;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class BigDecimalTemplate extends AbstractTemplate<BigDecimal> {
    static final BigDecimalTemplate instance = new BigDecimalTemplate();

    private BigDecimalTemplate() {
    }

    public static BigDecimalTemplate getInstance() {
        return instance;
    }

    public BigDecimal read(Unpacker unpacker, BigDecimal bigDecimal, boolean z) {
        return (z || !unpacker.trySkipNil()) ? new BigDecimal(unpacker.readString()) : null;
    }

    public void write(Packer packer, BigDecimal bigDecimal, boolean z) {
        if (bigDecimal != null) {
            packer.write(bigDecimal.toString());
        } else if (z) {
            throw new MessageTypeException("Attempted to write null");
        } else {
            packer.writeNil();
        }
    }
}
