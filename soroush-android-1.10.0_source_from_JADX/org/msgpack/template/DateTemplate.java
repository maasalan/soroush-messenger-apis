package org.msgpack.template;

import java.util.Date;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class DateTemplate extends AbstractTemplate<Date> {
    static final DateTemplate instance = new DateTemplate();

    private DateTemplate() {
    }

    public static DateTemplate getInstance() {
        return instance;
    }

    public Date read(Unpacker unpacker, Date date, boolean z) {
        return (z || !unpacker.trySkipNil()) ? new Date(unpacker.readLong()) : null;
    }

    public void write(Packer packer, Date date, boolean z) {
        if (date != null) {
            packer.write(date.getTime());
        } else if (z) {
            throw new MessageTypeException("Attempted to write null");
        } else {
            packer.writeNil();
        }
    }
}
