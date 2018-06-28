package org.msgpack.template;

import org.msgpack.MessagePackable;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class MessagePackableTemplate extends AbstractTemplate<MessagePackable> {
    private Class<?> targetClass;

    MessagePackableTemplate(Class<?> cls) {
        this.targetClass = cls;
    }

    public MessagePackable read(Unpacker unpacker, MessagePackable messagePackable, boolean z) {
        if (!z && unpacker.trySkipNil()) {
            return null;
        }
        if (messagePackable == null) {
            try {
                messagePackable = (MessagePackable) this.targetClass.newInstance();
            } catch (Throwable e) {
                throw new MessageTypeException(e);
            } catch (Throwable e2) {
                throw new MessageTypeException(e2);
            }
        }
        messagePackable.readFrom(unpacker);
        return messagePackable;
    }

    public void write(Packer packer, MessagePackable messagePackable, boolean z) {
        if (messagePackable != null) {
            messagePackable.writeTo(packer);
        } else if (z) {
            throw new MessageTypeException("Attempted to write null");
        } else {
            packer.writeNil();
        }
    }
}
