package org.msgpack;

import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import org.msgpack.packer.BufferPacker;
import org.msgpack.packer.MessagePackBufferPacker;
import org.msgpack.packer.MessagePackPacker;
import org.msgpack.packer.Packer;
import org.msgpack.packer.Unconverter;
import org.msgpack.template.Template;
import org.msgpack.template.TemplateRegistry;
import org.msgpack.type.Value;
import org.msgpack.unpacker.BufferUnpacker;
import org.msgpack.unpacker.Converter;
import org.msgpack.unpacker.MessagePackBufferUnpacker;
import org.msgpack.unpacker.MessagePackUnpacker;
import org.msgpack.unpacker.Unpacker;

public class MessagePack {
    private static final MessagePack globalMessagePack = new MessagePack();
    private TemplateRegistry registry;

    public MessagePack() {
        this.registry = new TemplateRegistry(null);
    }

    public MessagePack(MessagePack messagePack) {
        this.registry = new TemplateRegistry(messagePack.registry);
    }

    protected MessagePack(TemplateRegistry templateRegistry) {
        this.registry = templateRegistry;
    }

    @Deprecated
    public static void pack(OutputStream outputStream, Object obj) {
        globalMessagePack.write(outputStream, obj);
    }

    @Deprecated
    public static <T> void pack(OutputStream outputStream, T t, Template<T> template) {
        globalMessagePack.write(outputStream, t, template);
    }

    @Deprecated
    public static byte[] pack(Object obj) {
        return globalMessagePack.write(obj);
    }

    @Deprecated
    public static <T> byte[] pack(T t, Template<T> template) {
        return globalMessagePack.write((Object) t, (Template) template);
    }

    @Deprecated
    public static <T> T unpack(InputStream inputStream, Class<T> cls) {
        return globalMessagePack.read(inputStream, (Class) cls);
    }

    @Deprecated
    public static <T> T unpack(InputStream inputStream, T t) {
        return globalMessagePack.read(inputStream, (Object) t);
    }

    @Deprecated
    public static <T> T unpack(InputStream inputStream, Template<T> template) {
        return template.read(new MessagePackUnpacker(globalMessagePack, inputStream), null);
    }

    @Deprecated
    public static <T> T unpack(InputStream inputStream, Template<T> template, T t) {
        return template.read(new MessagePackUnpacker(globalMessagePack, inputStream), t);
    }

    @Deprecated
    public static <T> T unpack(byte[] bArr, Class<T> cls) {
        return globalMessagePack.read(bArr, (Class) cls);
    }

    @Deprecated
    public static <T> T unpack(byte[] bArr, T t) {
        return globalMessagePack.read(bArr, (Object) t);
    }

    @Deprecated
    public static <T> T unpack(byte[] bArr, Template<T> template) {
        return template.read(new MessagePackBufferUnpacker(globalMessagePack).wrap(bArr), null);
    }

    @Deprecated
    public static <T> T unpack(byte[] bArr, Template<T> template, T t) {
        return template.read(new MessagePackBufferUnpacker(globalMessagePack).wrap(bArr), t);
    }

    @Deprecated
    public static Value unpack(InputStream inputStream) {
        return globalMessagePack.read(inputStream);
    }

    @Deprecated
    public static Value unpack(byte[] bArr) {
        return globalMessagePack.read(bArr);
    }

    public <T> T convert(Value value, Class<T> cls) {
        return this.registry.lookup(cls).read(new Converter(this, value), null);
    }

    public <T> T convert(Value value, T t) {
        return this.registry.lookup(t.getClass()).read(new Converter(this, value), t);
    }

    public <T> T convert(Value value, Template<T> template) {
        return template.read(new Converter(this, value), null);
    }

    public BufferPacker createBufferPacker() {
        return new MessagePackBufferPacker(this);
    }

    public BufferPacker createBufferPacker(int i) {
        return new MessagePackBufferPacker(this, i);
    }

    public BufferUnpacker createBufferUnpacker() {
        return new MessagePackBufferUnpacker(this);
    }

    public BufferUnpacker createBufferUnpacker(ByteBuffer byteBuffer) {
        return createBufferUnpacker().wrap(byteBuffer);
    }

    public BufferUnpacker createBufferUnpacker(byte[] bArr) {
        return createBufferUnpacker().wrap(bArr);
    }

    public BufferUnpacker createBufferUnpacker(byte[] bArr, int i, int i2) {
        return createBufferUnpacker().wrap(bArr, i, i2);
    }

    public Packer createPacker(OutputStream outputStream) {
        return new MessagePackPacker(this, outputStream);
    }

    public Unpacker createUnpacker(InputStream inputStream) {
        return new MessagePackUnpacker(this, inputStream);
    }

    public <T> Template<T> lookup(Class<T> cls) {
        return this.registry.lookup(cls);
    }

    public Template<?> lookup(Type type) {
        return this.registry.lookup(type);
    }

    public <T> T read(InputStream inputStream, Class<T> cls) {
        return read(inputStream, null, this.registry.lookup(cls));
    }

    public <T> T read(InputStream inputStream, T t) {
        return read(inputStream, (Object) t, this.registry.lookup(t.getClass()));
    }

    public <T> T read(InputStream inputStream, T t, Template<T> template) {
        return template.read(createUnpacker(inputStream), t);
    }

    public <T> T read(InputStream inputStream, Template<T> template) {
        return read(inputStream, null, (Template) template);
    }

    public <T> T read(ByteBuffer byteBuffer, Class<T> cls) {
        return read(byteBuffer, null, this.registry.lookup(cls));
    }

    public <T> T read(ByteBuffer byteBuffer, T t) {
        return read(byteBuffer, (Object) t, this.registry.lookup(t.getClass()));
    }

    public <T> T read(ByteBuffer byteBuffer, T t, Template<T> template) {
        return template.read(createBufferUnpacker(byteBuffer), t);
    }

    public <T> T read(ByteBuffer byteBuffer, Template<T> template) {
        return read(byteBuffer, null, (Template) template);
    }

    public <T> T read(byte[] bArr, int i, int i2, Class<T> cls) {
        return this.registry.lookup(cls).read(createBufferUnpacker(bArr, i, i2), null);
    }

    public <T> T read(byte[] bArr, Class<T> cls) {
        return read(bArr, null, this.registry.lookup(cls));
    }

    public <T> T read(byte[] bArr, T t) {
        return read(bArr, (Object) t, this.registry.lookup(t.getClass()));
    }

    public <T> T read(byte[] bArr, T t, Template<T> template) {
        return template.read(createBufferUnpacker(bArr), t);
    }

    public <T> T read(byte[] bArr, Template<T> template) {
        return read(bArr, null, (Template) template);
    }

    public Value read(InputStream inputStream) {
        return createUnpacker(inputStream).readValue();
    }

    public Value read(ByteBuffer byteBuffer) {
        return createBufferUnpacker(byteBuffer).readValue();
    }

    public Value read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public Value read(byte[] bArr, int i, int i2) {
        return createBufferUnpacker(bArr, i, i2).readValue();
    }

    public void register(Class<?> cls) {
        this.registry.register(cls);
    }

    public <T> void register(Class<T> cls, Template<T> template) {
        this.registry.register((Type) cls, (Template) template);
    }

    public void setClassLoader(ClassLoader classLoader) {
        this.registry.setClassLoader(classLoader);
    }

    public <T> Value unconvert(T t) {
        Object unconverter = new Unconverter(this);
        if (t == null) {
            unconverter.writeNil();
        } else {
            this.registry.lookup(t.getClass()).write(unconverter, t);
        }
        return unconverter.getResult();
    }

    public void unregister() {
        this.registry.unregister();
    }

    public boolean unregister(Class<?> cls) {
        return this.registry.unregister(cls);
    }

    public <T> void write(OutputStream outputStream, T t) {
        Packer createPacker = createPacker(outputStream);
        if (t == null) {
            createPacker.writeNil();
        } else {
            this.registry.lookup(t.getClass()).write(createPacker, t);
        }
    }

    public <T> void write(OutputStream outputStream, T t, Template<T> template) {
        template.write(createPacker(outputStream), t);
    }

    public <T> byte[] write(T t) {
        Object createBufferPacker = createBufferPacker();
        if (t == null) {
            createBufferPacker.writeNil();
        } else {
            this.registry.lookup(t.getClass()).write(createBufferPacker, t);
        }
        return createBufferPacker.toByteArray();
    }

    public <T> byte[] write(T t, Template<T> template) {
        Object createBufferPacker = createBufferPacker();
        template.write(createBufferPacker, t);
        return createBufferPacker.toByteArray();
    }

    public byte[] write(Value value) {
        BufferPacker createBufferPacker = createBufferPacker();
        createBufferPacker.write(value);
        return createBufferPacker.toByteArray();
    }
}
