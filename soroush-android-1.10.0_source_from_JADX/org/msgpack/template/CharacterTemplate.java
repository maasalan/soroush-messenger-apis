package org.msgpack.template;

import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class CharacterTemplate extends AbstractTemplate<Character> {
    static final CharacterTemplate instance = new CharacterTemplate();

    private CharacterTemplate() {
    }

    public static CharacterTemplate getInstance() {
        return instance;
    }

    public Character read(Unpacker unpacker, Character ch, boolean z) {
        return (z || !unpacker.trySkipNil()) ? Character.valueOf((char) unpacker.readInt()) : null;
    }

    public void write(Packer packer, Character ch, boolean z) {
        if (ch != null) {
            packer.write(ch.charValue());
        } else if (z) {
            throw new MessageTypeException("Attempted to write null");
        } else {
            packer.writeNil();
        }
    }
}
