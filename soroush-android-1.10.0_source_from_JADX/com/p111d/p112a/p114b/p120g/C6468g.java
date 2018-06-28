package com.p111d.p112a.p114b.p120g;

import com.p111d.p112a.p114b.C1341a;
import com.p111d.p112a.p114b.C1356c;
import com.p111d.p112a.p114b.C1375h;
import com.p111d.p112a.p114b.C1379l;
import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C1385s;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p114b.C5303j.C1376a;
import com.p111d.p112a.p114b.C5303j.C1377b;
import com.p111d.p112a.p114b.C5304n;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class C6468g extends C5303j {
    protected C5303j f17631a;

    public C6468g(C5303j c5303j) {
        this.f17631a = c5303j;
    }

    public boolean canReadObjectId() {
        return this.f17631a.canReadObjectId();
    }

    public boolean canReadTypeId() {
        return this.f17631a.canReadTypeId();
    }

    public boolean canUseSchema(C1356c c1356c) {
        return this.f17631a.canUseSchema(c1356c);
    }

    public void clearCurrentToken() {
        this.f17631a.clearCurrentToken();
    }

    public void close() {
        this.f17631a.close();
    }

    public C5303j disable(C1376a c1376a) {
        this.f17631a.disable(c1376a);
        return this;
    }

    public C5303j enable(C1376a c1376a) {
        this.f17631a.enable(c1376a);
        return this;
    }

    public BigInteger getBigIntegerValue() {
        return this.f17631a.getBigIntegerValue();
    }

    public byte[] getBinaryValue(C1341a c1341a) {
        return this.f17631a.getBinaryValue(c1341a);
    }

    public boolean getBooleanValue() {
        return this.f17631a.getBooleanValue();
    }

    public byte getByteValue() {
        return this.f17631a.getByteValue();
    }

    public C5304n getCodec() {
        return this.f17631a.getCodec();
    }

    public C1375h getCurrentLocation() {
        return this.f17631a.getCurrentLocation();
    }

    public String getCurrentName() {
        return this.f17631a.getCurrentName();
    }

    public C1380m getCurrentToken() {
        return this.f17631a.getCurrentToken();
    }

    public int getCurrentTokenId() {
        return this.f17631a.getCurrentTokenId();
    }

    public Object getCurrentValue() {
        return this.f17631a.getCurrentValue();
    }

    public BigDecimal getDecimalValue() {
        return this.f17631a.getDecimalValue();
    }

    public double getDoubleValue() {
        return this.f17631a.getDoubleValue();
    }

    public Object getEmbeddedObject() {
        return this.f17631a.getEmbeddedObject();
    }

    public int getFeatureMask() {
        return this.f17631a.getFeatureMask();
    }

    public float getFloatValue() {
        return this.f17631a.getFloatValue();
    }

    public Object getInputSource() {
        return this.f17631a.getInputSource();
    }

    public int getIntValue() {
        return this.f17631a.getIntValue();
    }

    public C1380m getLastClearedToken() {
        return this.f17631a.getLastClearedToken();
    }

    public long getLongValue() {
        return this.f17631a.getLongValue();
    }

    public C1377b getNumberType() {
        return this.f17631a.getNumberType();
    }

    public Number getNumberValue() {
        return this.f17631a.getNumberValue();
    }

    public Object getObjectId() {
        return this.f17631a.getObjectId();
    }

    public C1379l getParsingContext() {
        return this.f17631a.getParsingContext();
    }

    public C1356c getSchema() {
        return this.f17631a.getSchema();
    }

    public short getShortValue() {
        return this.f17631a.getShortValue();
    }

    public String getText() {
        return this.f17631a.getText();
    }

    public char[] getTextCharacters() {
        return this.f17631a.getTextCharacters();
    }

    public int getTextLength() {
        return this.f17631a.getTextLength();
    }

    public int getTextOffset() {
        return this.f17631a.getTextOffset();
    }

    public C1375h getTokenLocation() {
        return this.f17631a.getTokenLocation();
    }

    public Object getTypeId() {
        return this.f17631a.getTypeId();
    }

    public boolean getValueAsBoolean() {
        return this.f17631a.getValueAsBoolean();
    }

    public boolean getValueAsBoolean(boolean z) {
        return this.f17631a.getValueAsBoolean(z);
    }

    public double getValueAsDouble() {
        return this.f17631a.getValueAsDouble();
    }

    public double getValueAsDouble(double d) {
        return this.f17631a.getValueAsDouble(d);
    }

    public int getValueAsInt() {
        return this.f17631a.getValueAsInt();
    }

    public int getValueAsInt(int i) {
        return this.f17631a.getValueAsInt(i);
    }

    public long getValueAsLong() {
        return this.f17631a.getValueAsLong();
    }

    public long getValueAsLong(long j) {
        return this.f17631a.getValueAsLong(j);
    }

    public String getValueAsString() {
        return this.f17631a.getValueAsString();
    }

    public String getValueAsString(String str) {
        return this.f17631a.getValueAsString(str);
    }

    public boolean hasCurrentToken() {
        return this.f17631a.hasCurrentToken();
    }

    public boolean hasTextCharacters() {
        return this.f17631a.hasTextCharacters();
    }

    public boolean hasToken(C1380m c1380m) {
        return this.f17631a.hasToken(c1380m);
    }

    public boolean hasTokenId(int i) {
        return this.f17631a.hasTokenId(i);
    }

    public boolean isClosed() {
        return this.f17631a.isClosed();
    }

    public boolean isEnabled(C1376a c1376a) {
        return this.f17631a.isEnabled(c1376a);
    }

    public boolean isExpectedStartArrayToken() {
        return this.f17631a.isExpectedStartArrayToken();
    }

    public boolean isExpectedStartObjectToken() {
        return this.f17631a.isExpectedStartObjectToken();
    }

    public C1380m nextToken() {
        return this.f17631a.nextToken();
    }

    public C1380m nextValue() {
        return this.f17631a.nextValue();
    }

    public void overrideCurrentName(String str) {
        this.f17631a.overrideCurrentName(str);
    }

    public C5303j overrideFormatFeatures(int i, int i2) {
        this.f17631a.overrideFormatFeatures(i, i2);
        return this;
    }

    public C5303j overrideStdFeatures(int i, int i2) {
        this.f17631a.overrideStdFeatures(i, i2);
        return this;
    }

    public int readBinaryValue(C1341a c1341a, OutputStream outputStream) {
        return this.f17631a.readBinaryValue(c1341a, outputStream);
    }

    public boolean requiresCustomCodec() {
        return this.f17631a.requiresCustomCodec();
    }

    public void setCodec(C5304n c5304n) {
        this.f17631a.setCodec(c5304n);
    }

    public void setCurrentValue(Object obj) {
        this.f17631a.setCurrentValue(obj);
    }

    @Deprecated
    public C5303j setFeatureMask(int i) {
        this.f17631a.setFeatureMask(i);
        return this;
    }

    public void setSchema(C1356c c1356c) {
        this.f17631a.setSchema(c1356c);
    }

    public C5303j skipChildren() {
        this.f17631a.skipChildren();
        return this;
    }

    public C1385s version() {
        return this.f17631a.version();
    }
}
