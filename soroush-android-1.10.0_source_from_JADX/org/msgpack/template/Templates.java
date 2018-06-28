package org.msgpack.template;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.msgpack.type.Value;

public final class Templates {
    public static final Template<BigDecimal> TBigDecimal = BigDecimalTemplate.getInstance();
    public static final Template<BigInteger> TBigInteger = BigIntegerTemplate.getInstance();
    public static final Template<Boolean> TBoolean = BooleanTemplate.getInstance();
    public static final Template<Byte> TByte = ByteTemplate.getInstance();
    public static final Template<byte[]> TByteArray = ByteArrayTemplate.getInstance();
    public static final Template<ByteBuffer> TByteBuffer = ByteBufferTemplate.getInstance();
    public static final Template<Character> TCharacter = CharacterTemplate.getInstance();
    public static final Template<Date> TDate = DateTemplate.getInstance();
    public static final Template<Double> TDouble = DoubleTemplate.getInstance();
    public static final Template<Float> TFloat = FloatTemplate.getInstance();
    public static final Template<Integer> TInteger = IntegerTemplate.getInstance();
    public static final Template<Long> TLong = LongTemplate.getInstance();
    public static final Template<Short> TShort = ShortTemplate.getInstance();
    public static final Template<String> TString = StringTemplate.getInstance();
    public static final Template<Value> TValue = ValueTemplate.getInstance();

    @Deprecated
    public static Template tBigDecimal() {
        return TBigDecimal;
    }

    @Deprecated
    public static Template tBigInteger() {
        return TBigInteger;
    }

    @Deprecated
    public static Template tBoolean() {
        return TBoolean;
    }

    @Deprecated
    public static Template tByte() {
        return TByte;
    }

    @Deprecated
    public static Template tByteArray() {
        return TByteArray;
    }

    @Deprecated
    public static Template tByteBuffer() {
        return TByteBuffer;
    }

    @Deprecated
    public static Template tCharacter() {
        return TCharacter;
    }

    public static <E> Template<Collection<E>> tCollection(Template<E> template) {
        return new CollectionTemplate(template);
    }

    @Deprecated
    public static Template tDate() {
        return TDate;
    }

    @Deprecated
    public static Template tDouble() {
        return TDouble;
    }

    @Deprecated
    public static Template tFloat() {
        return TFloat;
    }

    @Deprecated
    public static Template tInteger() {
        return TInteger;
    }

    public static <E> Template<List<E>> tList(Template<E> template) {
        return new ListTemplate(template);
    }

    @Deprecated
    public static Template tLong() {
        return TLong;
    }

    public static <K, V> Template<Map<K, V>> tMap(Template<K> template, Template<V> template2) {
        return new MapTemplate(template, template2);
    }

    public static <T> Template<T> tNotNullable(Template<T> template) {
        return new NotNullableTemplate(template);
    }

    public static <E extends Enum> Template<E> tOrdinalEnum(Class<E> cls) {
        return new OrdinalEnumTemplate(cls);
    }

    @Deprecated
    public static Template tShort() {
        return TShort;
    }

    @Deprecated
    public static Template tString() {
        return TString;
    }
}
