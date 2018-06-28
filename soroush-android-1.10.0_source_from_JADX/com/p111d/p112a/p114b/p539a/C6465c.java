package com.p111d.p112a.p114b.p539a;

import com.p111d.p112a.p114b.C1341a;
import com.p111d.p112a.p114b.C1379l;
import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5302i;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p114b.C5303j.C1376a;
import com.p111d.p112a.p114b.p116c.C1351g;
import com.p111d.p112a.p114b.p120g.C1369b;
import com.p111d.p112a.p114b.p120g.C1374j;
import org.jivesoftware.smack.util.StringUtils;

public abstract class C6465c extends C5303j {
    protected static final int INT_BACKSLASH = 92;
    protected static final int INT_COLON = 58;
    protected static final int INT_COMMA = 44;
    protected static final int INT_CR = 13;
    protected static final int INT_E = 69;
    protected static final int INT_HASH = 35;
    protected static final int INT_LBRACKET = 91;
    protected static final int INT_LCURLY = 123;
    protected static final int INT_LF = 10;
    protected static final int INT_PERIOD = 46;
    protected static final int INT_QUOTE = 34;
    protected static final int INT_RBRACKET = 93;
    protected static final int INT_RCURLY = 125;
    protected static final int INT_SLASH = 47;
    protected static final int INT_SPACE = 32;
    protected static final int INT_TAB = 9;
    protected static final int INT_e = 101;
    protected C1380m _currToken;
    protected C1380m _lastClearedToken;

    protected C6465c() {
    }

    protected C6465c(int i) {
        super(i);
    }

    protected static String _ascii(byte[] bArr) {
        try {
            return new String(bArr, StringUtils.USASCII);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    protected static byte[] _asciiBytes(String str) {
        byte[] bArr = new byte[str.length()];
        int length = str.length();
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    protected static final String _getCharDesc(int i) {
        char c = (char) i;
        if (Character.isISOControl(c)) {
            StringBuilder stringBuilder = new StringBuilder("(CTRL-CHAR, code ");
            stringBuilder.append(i);
            stringBuilder.append(")");
            return stringBuilder.toString();
        } else if (i > 255) {
            r1 = new StringBuilder("'");
            r1.append(c);
            r1.append("' (code ");
            r1.append(i);
            r1.append(" / 0x");
            r1.append(Integer.toHexString(i));
            r1.append(")");
            return r1.toString();
        } else {
            r1 = new StringBuilder("'");
            r1.append(c);
            r1.append("' (code ");
            r1.append(i);
            r1.append(")");
            return r1.toString();
        }
    }

    protected final C5302i _constructError(String str, Throwable th) {
        return new C5302i(this, str, th);
    }

    protected void _decodeBase64(String str, C1369b c1369b, C1341a c1341a) {
        try {
            c1341a.m3166a(str, c1369b);
        } catch (IllegalArgumentException e) {
            _reportError(e.getMessage());
        }
    }

    public abstract void _handleEOF();

    protected char _handleUnrecognizedCharacterEscape(char c) {
        if (isEnabled(C1376a.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER)) {
            return c;
        }
        if (c == '\'' && isEnabled(C1376a.ALLOW_SINGLE_QUOTES)) {
            return c;
        }
        StringBuilder stringBuilder = new StringBuilder("Unrecognized character escape ");
        stringBuilder.append(C6465c._getCharDesc(c));
        _reportError(stringBuilder.toString());
        return c;
    }

    protected boolean _hasTextualNull(String str) {
        return "null".equals(str);
    }

    protected final void _reportError(String str) {
        throw _constructError(str);
    }

    protected void _reportInvalidEOF() {
        StringBuilder stringBuilder = new StringBuilder(" in ");
        stringBuilder.append(this._currToken);
        _reportInvalidEOF(stringBuilder.toString());
    }

    protected void _reportInvalidEOF(String str) {
        StringBuilder stringBuilder = new StringBuilder("Unexpected end-of-input");
        stringBuilder.append(str);
        _reportError(stringBuilder.toString());
    }

    protected void _reportInvalidEOFInValue() {
        _reportInvalidEOF(" in a value");
    }

    protected void _reportMissingRootWS(int i) {
        _reportUnexpectedChar(i, "Expected space separating root-level values");
    }

    protected void _reportUnexpectedChar(int i, String str) {
        if (i < 0) {
            _reportInvalidEOF();
        }
        StringBuilder stringBuilder = new StringBuilder("Unexpected character (");
        stringBuilder.append(C6465c._getCharDesc(i));
        stringBuilder.append(")");
        String stringBuilder2 = stringBuilder.toString();
        if (str != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(stringBuilder2);
            stringBuilder.append(": ");
            stringBuilder.append(str);
            stringBuilder2 = stringBuilder.toString();
        }
        _reportError(stringBuilder2);
    }

    protected final void _throwInternal() {
        C1374j.m3348a();
    }

    protected void _throwInvalidSpace(int i) {
        char c = (char) i;
        StringBuilder stringBuilder = new StringBuilder("Illegal character (");
        stringBuilder.append(C6465c._getCharDesc(c));
        stringBuilder.append("): only regular white space (\\r, \\n, \\t) is allowed between tokens");
        _reportError(stringBuilder.toString());
    }

    protected void _throwUnquotedSpace(int i, String str) {
        if (!isEnabled(C1376a.ALLOW_UNQUOTED_CONTROL_CHARS) || i > 32) {
            char c = (char) i;
            StringBuilder stringBuilder = new StringBuilder("Illegal unquoted character (");
            stringBuilder.append(C6465c._getCharDesc(c));
            stringBuilder.append("): has to be escaped using backslash to be included in ");
            stringBuilder.append(str);
            _reportError(stringBuilder.toString());
        }
    }

    protected final void _wrapError(String str, Throwable th) {
        throw _constructError(str, th);
    }

    public void clearCurrentToken() {
        if (this._currToken != null) {
            this._lastClearedToken = this._currToken;
            this._currToken = null;
        }
    }

    public abstract void close();

    public abstract byte[] getBinaryValue(C1341a c1341a);

    public abstract String getCurrentName();

    public C1380m getCurrentToken() {
        return this._currToken;
    }

    public int getCurrentTokenId() {
        C1380m c1380m = this._currToken;
        return c1380m == null ? 0 : c1380m.f4392q;
    }

    public C1380m getLastClearedToken() {
        return this._lastClearedToken;
    }

    public abstract C1379l getParsingContext();

    public abstract String getText();

    public abstract char[] getTextCharacters();

    public abstract int getTextLength();

    public abstract int getTextOffset();

    public boolean getValueAsBoolean(boolean z) {
        C1380m c1380m = this._currToken;
        if (c1380m != null) {
            switch (c1380m.f4392q) {
                case 6:
                    String trim = getText().trim();
                    return "true".equals(trim) ? true : ("false".equals(trim) || _hasTextualNull(trim)) ? false : z;
                case 7:
                    return getIntValue() != 0;
                case 9:
                    return true;
                case 10:
                case 11:
                    return false;
                case 12:
                    Object embeddedObject = getEmbeddedObject();
                    if (embeddedObject instanceof Boolean) {
                        return ((Boolean) embeddedObject).booleanValue();
                    }
                    break;
                default:
                    return z;
            }
        }
    }

    public double getValueAsDouble(double d) {
        C1380m c1380m = this._currToken;
        if (c1380m != null) {
            switch (c1380m.f4392q) {
                case 6:
                    String text = getText();
                    if (!_hasTextualNull(text)) {
                        d = C1351g.m3222a(text, d);
                        break;
                    }
                    return 0.0d;
                case 7:
                case 8:
                    return getDoubleValue();
                case 9:
                    return 1.0d;
                case 10:
                case 11:
                    return 0.0d;
                case 12:
                    Object embeddedObject = getEmbeddedObject();
                    if (embeddedObject instanceof Number) {
                        return ((Number) embeddedObject).doubleValue();
                    }
                    break;
                default:
                    return d;
            }
        }
        return d;
    }

    public int getValueAsInt() {
        C1380m c1380m = this._currToken;
        if (c1380m != C1380m.VALUE_NUMBER_INT) {
            if (c1380m != C1380m.VALUE_NUMBER_FLOAT) {
                return getValueAsInt(0);
            }
        }
        return getIntValue();
    }

    public int getValueAsInt(int i) {
        C1380m c1380m = this._currToken;
        if (c1380m != C1380m.VALUE_NUMBER_INT) {
            if (c1380m != C1380m.VALUE_NUMBER_FLOAT) {
                if (c1380m != null) {
                    int i2 = c1380m.f4392q;
                    if (i2 != 6) {
                        switch (i2) {
                            case 9:
                                return 1;
                            case 10:
                            case 11:
                                return 0;
                            case 12:
                                Object embeddedObject = getEmbeddedObject();
                                if (embeddedObject instanceof Number) {
                                    return ((Number) embeddedObject).intValue();
                                }
                                break;
                            default:
                                return i;
                        }
                    }
                    String text = getText();
                    if (_hasTextualNull(text)) {
                        return 0;
                    }
                    i = C1351g.m3224a(text, i);
                }
                return i;
            }
        }
        return getIntValue();
    }

    public long getValueAsLong() {
        C1380m c1380m = this._currToken;
        if (c1380m != C1380m.VALUE_NUMBER_INT) {
            if (c1380m != C1380m.VALUE_NUMBER_FLOAT) {
                return getValueAsLong(0);
            }
        }
        return getLongValue();
    }

    public long getValueAsLong(long j) {
        C1380m c1380m = this._currToken;
        if (c1380m != C1380m.VALUE_NUMBER_INT) {
            if (c1380m != C1380m.VALUE_NUMBER_FLOAT) {
                if (c1380m != null) {
                    int i = c1380m.f4392q;
                    if (i != 6) {
                        switch (i) {
                            case 9:
                                return 1;
                            case 10:
                            case 11:
                                return 0;
                            case 12:
                                Object embeddedObject = getEmbeddedObject();
                                if (embeddedObject instanceof Number) {
                                    return ((Number) embeddedObject).longValue();
                                }
                                break;
                            default:
                                return j;
                        }
                    }
                    String text = getText();
                    if (_hasTextualNull(text)) {
                        return 0;
                    }
                    j = C1351g.m3226a(text, j);
                }
                return j;
            }
        }
        return getLongValue();
    }

    public String getValueAsString() {
        return this._currToken == C1380m.VALUE_STRING ? getText() : this._currToken == C1380m.FIELD_NAME ? getCurrentName() : getValueAsString(null);
    }

    public String getValueAsString(String str) {
        if (this._currToken == C1380m.VALUE_STRING) {
            return getText();
        }
        if (this._currToken == C1380m.FIELD_NAME) {
            return getCurrentName();
        }
        if (!(this._currToken == null || this._currToken == C1380m.VALUE_NULL)) {
            if (!this._currToken.f4397v) {
                return str;
            }
            str = getText();
        }
        return str;
    }

    public boolean hasCurrentToken() {
        return this._currToken != null;
    }

    public abstract boolean hasTextCharacters();

    public boolean hasToken(C1380m c1380m) {
        return this._currToken == c1380m;
    }

    public boolean hasTokenId(int i) {
        C1380m c1380m = this._currToken;
        return c1380m == null ? i == 0 : c1380m.f4392q == i;
    }

    public abstract boolean isClosed();

    public boolean isExpectedStartArrayToken() {
        return this._currToken == C1380m.START_ARRAY;
    }

    public boolean isExpectedStartObjectToken() {
        return this._currToken == C1380m.START_OBJECT;
    }

    public abstract C1380m nextToken();

    public C1380m nextValue() {
        C1380m nextToken = nextToken();
        return nextToken == C1380m.FIELD_NAME ? nextToken() : nextToken;
    }

    public abstract void overrideCurrentName(String str);

    public C5303j skipChildren() {
        if (this._currToken != C1380m.START_OBJECT && this._currToken != C1380m.START_ARRAY) {
            return this;
        }
        int i = 1;
        while (true) {
            C1380m nextToken = nextToken();
            if (nextToken == null) {
                _handleEOF();
                return this;
            } else if (nextToken.f4393r) {
                i++;
            } else if (nextToken.f4394s) {
                i--;
                if (i == 0) {
                    return this;
                }
            } else {
                continue;
            }
        }
    }
}
