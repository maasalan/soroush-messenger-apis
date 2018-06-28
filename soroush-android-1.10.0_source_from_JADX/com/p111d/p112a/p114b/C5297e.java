package com.p111d.p112a.p114b;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.p111d.p112a.p114b.C5301g.C1368a;
import com.p111d.p112a.p114b.C5303j.C1376a;
import com.p111d.p112a.p114b.p115b.C1342a;
import com.p111d.p112a.p114b.p115b.C1343b;
import com.p111d.p112a.p114b.p116c.C1346b;
import com.p111d.p112a.p114b.p116c.C1347c;
import com.p111d.p112a.p114b.p116c.C1348d;
import com.p111d.p112a.p114b.p116c.C1353i;
import com.p111d.p112a.p114b.p116c.C1355l;
import com.p111d.p112a.p114b.p116c.C5293j;
import com.p111d.p112a.p114b.p117d.C1357a;
import com.p111d.p112a.p114b.p117d.C5296f;
import com.p111d.p112a.p114b.p117d.C7260g;
import com.p111d.p112a.p114b.p117d.C7261h;
import com.p111d.p112a.p114b.p117d.C7263j;
import com.p111d.p112a.p114b.p118e.C1362a;
import com.p111d.p112a.p114b.p118e.C1364b;
import com.p111d.p112a.p114b.p120g.C5300d;
import java.io.CharArrayReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;
import java.lang.ref.SoftReference;
import java.net.URL;
import org.linphone.core.Privacy;

public class C5297e implements C1386t, Serializable {
    protected static final int DEFAULT_FACTORY_FEATURE_FLAGS = C1362a.m3273a();
    protected static final int DEFAULT_GENERATOR_FEATURE_FLAGS = C1368a.m3310a();
    protected static final int DEFAULT_PARSER_FEATURE_FLAGS = C1376a.m3350a();
    private static final C1382p DEFAULT_ROOT_VALUE_SEPARATOR = C5300d.f14700a;
    public static final String FORMAT_NAME_JSON = "JSON";
    protected static final ThreadLocal<SoftReference<com.p111d.p112a.p114b.p120g.C1368a>> _recyclerRef = new ThreadLocal();
    private static final long serialVersionUID = 1;
    protected final transient C1362a _byteSymbolCanonicalizer;
    protected C1346b _characterEscapes;
    protected int _factoryFeatures;
    protected int _generatorFeatures;
    protected C1348d _inputDecorator;
    protected C5304n _objectCodec;
    protected C1353i _outputDecorator;
    protected int _parserFeatures;
    protected final transient C1364b _rootCharSymbols;
    protected C1382p _rootValueSeparator;

    public enum C1362a {
        INTERN_FIELD_NAMES,
        CANONICALIZE_FIELD_NAMES,
        FAIL_ON_SYMBOL_HASH_OVERFLOW,
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING;
        
        private final boolean f4266e;

        public static int m3273a() {
            C1362a[] values = C1362a.values();
            int i = 0;
            int length = values.length;
            int i2 = 0;
            while (i < length) {
                C1362a c1362a = values[i];
                if (c1362a.f4266e) {
                    i2 |= 1 << c1362a.ordinal();
                }
                i++;
            }
            return i2;
        }

        public final boolean m3274a(int i) {
            return (i & (1 << ordinal())) != 0;
        }
    }

    public C5297e() {
        this(null);
    }

    protected C5297e(C5297e c5297e, C5304n c5304n) {
        this._rootCharSymbols = C1364b.m3298a();
        this._byteSymbolCanonicalizer = C1362a.m3276a();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = null;
        this._factoryFeatures = c5297e._factoryFeatures;
        this._parserFeatures = c5297e._parserFeatures;
        this._generatorFeatures = c5297e._generatorFeatures;
        this._characterEscapes = c5297e._characterEscapes;
        this._inputDecorator = c5297e._inputDecorator;
        this._outputDecorator = c5297e._outputDecorator;
        this._rootValueSeparator = c5297e._rootValueSeparator;
    }

    public C5297e(C5304n c5304n) {
        this._rootCharSymbols = C1364b.m3298a();
        this._byteSymbolCanonicalizer = C1362a.m3276a();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = c5304n;
    }

    protected void _checkInvalidCopy(Class<?> cls) {
        if (getClass() != cls) {
            StringBuilder stringBuilder = new StringBuilder("Failed copy(): ");
            stringBuilder.append(getClass().getName());
            stringBuilder.append(" (version: ");
            stringBuilder.append(version());
            stringBuilder.append(") does not override copy(); it has to");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    protected C1347c _createContext(Object obj, boolean z) {
        return new C1347c(_getBufferRecycler(), obj, z);
    }

    protected C5301g _createGenerator(Writer writer, C1347c c1347c) {
        C5301g c7263j = new C7263j(c1347c, this._generatorFeatures, this._objectCodec, writer);
        if (this._characterEscapes != null) {
            c7263j.setCharacterEscapes(this._characterEscapes);
        }
        C1382p c1382p = this._rootValueSeparator;
        if (c1382p != DEFAULT_ROOT_VALUE_SEPARATOR) {
            c7263j.setRootValueSeparator(c1382p);
        }
        return c7263j;
    }

    public C5303j _createParser(InputStream inputStream, C1347c c1347c) {
        return new C1357a(c1347c, inputStream).m3263a(this._parserFeatures, this._objectCodec, this._byteSymbolCanonicalizer, this._rootCharSymbols, this._factoryFeatures);
    }

    protected C5303j _createParser(Reader reader, C1347c c1347c) {
        return new C7260g(c1347c, this._parserFeatures, reader, this._objectCodec, this._rootCharSymbols.m3303a(this._factoryFeatures));
    }

    public C5303j _createParser(byte[] bArr, int i, int i2, C1347c c1347c) {
        return new C1357a(c1347c, bArr, i, i2).m3263a(this._parserFeatures, this._objectCodec, this._byteSymbolCanonicalizer, this._rootCharSymbols, this._factoryFeatures);
    }

    protected C5303j _createParser(char[] cArr, int i, int i2, C1347c c1347c, boolean z) {
        return new C7260g(c1347c, this._parserFeatures, this._objectCodec, this._rootCharSymbols.m3303a(this._factoryFeatures), cArr, i, i + i2, z);
    }

    protected C5301g _createUTF8Generator(OutputStream outputStream, C1347c c1347c) {
        C5301g c7261h = new C7261h(c1347c, this._generatorFeatures, this._objectCodec, outputStream);
        if (this._characterEscapes != null) {
            c7261h.setCharacterEscapes(this._characterEscapes);
        }
        C1382p c1382p = this._rootValueSeparator;
        if (c1382p != DEFAULT_ROOT_VALUE_SEPARATOR) {
            c7261h.setRootValueSeparator(c1382p);
        }
        return c7261h;
    }

    protected Writer _createWriter(OutputStream outputStream, C1359d c1359d, C1347c c1347c) {
        return c1359d == C1359d.UTF8 ? new C1355l(c1347c, outputStream) : new OutputStreamWriter(outputStream, c1359d.m3270a());
    }

    protected final InputStream _decorate(InputStream inputStream, C1347c c1347c) {
        if (this._inputDecorator != null) {
            InputStream a = this._inputDecorator.m3212a();
            if (a != null) {
                return a;
            }
        }
        return inputStream;
    }

    protected final OutputStream _decorate(OutputStream outputStream, C1347c c1347c) {
        if (this._outputDecorator != null) {
            OutputStream a = this._outputDecorator.m3248a();
            if (a != null) {
                return a;
            }
        }
        return outputStream;
    }

    protected final Reader _decorate(Reader reader, C1347c c1347c) {
        if (this._inputDecorator != null) {
            Reader c = this._inputDecorator.m3214c();
            if (c != null) {
                return c;
            }
        }
        return reader;
    }

    protected final Writer _decorate(Writer writer, C1347c c1347c) {
        if (this._outputDecorator != null) {
            Writer b = this._outputDecorator.m3249b();
            if (b != null) {
                return b;
            }
        }
        return writer;
    }

    public com.p111d.p112a.p114b.p120g.C1368a _getBufferRecycler() {
        com.p111d.p112a.p114b.p120g.C1368a c1368a;
        if (isEnabled(C1362a.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING)) {
            SoftReference softReference = (SoftReference) _recyclerRef.get();
            c1368a = softReference == null ? null : (com.p111d.p112a.p114b.p120g.C1368a) softReference.get();
            if (c1368a == null) {
                c1368a = new com.p111d.p112a.p114b.p120g.C1368a();
                _recyclerRef.set(new SoftReference(c1368a));
                return c1368a;
            }
        }
        c1368a = new com.p111d.p112a.p114b.p120g.C1368a();
        return c1368a;
    }

    protected InputStream _optimizedStreamFromURL(URL url) {
        if ("file".equals(url.getProtocol())) {
            String host = url.getHost();
            if ((host == null || host.length() == 0) && url.getPath().indexOf(37) < 0) {
                return new FileInputStream(url.getPath());
            }
        }
        return FirebasePerfUrlConnection.openStream(url);
    }

    public boolean canHandleBinaryNatively() {
        return false;
    }

    public boolean canUseCharArrays() {
        return true;
    }

    public boolean canUseSchema(C1356c c1356c) {
        String formatName = getFormatName();
        return formatName != null && formatName.equals(c1356c.m3256a());
    }

    public final C5297e configure(C1362a c1362a, boolean z) {
        return z ? enable(c1362a) : disable(c1362a);
    }

    public final C5297e configure(C1368a c1368a, boolean z) {
        return z ? enable(c1368a) : disable(c1368a);
    }

    public final C5297e configure(C1376a c1376a, boolean z) {
        return z ? enable(c1376a) : disable(c1376a);
    }

    public C5297e copy() {
        _checkInvalidCopy(C5297e.class);
        return new C5297e(this, null);
    }

    public C5301g createGenerator(File file, C1359d c1359d) {
        OutputStream fileOutputStream = new FileOutputStream(file);
        C1347c _createContext = _createContext(fileOutputStream, true);
        _createContext.m3195a(c1359d);
        return c1359d == C1359d.UTF8 ? _createUTF8Generator(_decorate(fileOutputStream, _createContext), _createContext) : _createGenerator(_decorate(_createWriter(fileOutputStream, c1359d, _createContext), _createContext), _createContext);
    }

    public C5301g createGenerator(OutputStream outputStream) {
        return createGenerator(outputStream, C1359d.UTF8);
    }

    public C5301g createGenerator(OutputStream outputStream, C1359d c1359d) {
        C1347c _createContext = _createContext(outputStream, false);
        _createContext.m3195a(c1359d);
        return c1359d == C1359d.UTF8 ? _createUTF8Generator(_decorate(outputStream, _createContext), _createContext) : _createGenerator(_decorate(_createWriter(outputStream, c1359d, _createContext), _createContext), _createContext);
    }

    public C5301g createGenerator(Writer writer) {
        C1347c _createContext = _createContext(writer, false);
        return _createGenerator(_decorate(writer, _createContext), _createContext);
    }

    @Deprecated
    public C5301g createJsonGenerator(OutputStream outputStream) {
        return createGenerator(outputStream, C1359d.UTF8);
    }

    @Deprecated
    public C5301g createJsonGenerator(OutputStream outputStream, C1359d c1359d) {
        return createGenerator(outputStream, c1359d);
    }

    @Deprecated
    public C5301g createJsonGenerator(Writer writer) {
        return createGenerator(writer);
    }

    @Deprecated
    public C5303j createJsonParser(File file) {
        return createParser(file);
    }

    @Deprecated
    public C5303j createJsonParser(InputStream inputStream) {
        return createParser(inputStream);
    }

    @Deprecated
    public C5303j createJsonParser(Reader reader) {
        return createParser(reader);
    }

    @Deprecated
    public C5303j createJsonParser(String str) {
        return createParser(str);
    }

    @Deprecated
    public C5303j createJsonParser(URL url) {
        return createParser(url);
    }

    @Deprecated
    public C5303j createJsonParser(byte[] bArr) {
        return createParser(bArr);
    }

    @Deprecated
    public C5303j createJsonParser(byte[] bArr, int i, int i2) {
        return createParser(bArr, i, i2);
    }

    public C5303j createParser(File file) {
        C1347c _createContext = _createContext(file, true);
        return _createParser(_decorate(new FileInputStream(file), _createContext), _createContext);
    }

    public C5303j createParser(InputStream inputStream) {
        C1347c _createContext = _createContext(inputStream, false);
        return _createParser(_decorate(inputStream, _createContext), _createContext);
    }

    public C5303j createParser(Reader reader) {
        C1347c _createContext = _createContext(reader, false);
        return _createParser(_decorate(reader, _createContext), _createContext);
    }

    public C5303j createParser(String str) {
        int length = str.length();
        if (this._inputDecorator == null && length <= Privacy.DEFAULT) {
            if (canUseCharArrays()) {
                C1347c _createContext = _createContext(str, true);
                char[] a = _createContext.m3198a(length);
                str.getChars(0, length, a, 0);
                return _createParser(a, 0, length, _createContext, true);
            }
        }
        return createParser(new StringReader(str));
    }

    public C5303j createParser(URL url) {
        C1347c _createContext = _createContext(url, true);
        return _createParser(_decorate(_optimizedStreamFromURL(url), _createContext), _createContext);
    }

    public C5303j createParser(byte[] bArr) {
        C1347c _createContext = _createContext(bArr, true);
        if (this._inputDecorator != null) {
            InputStream b = this._inputDecorator.m3213b();
            if (b != null) {
                return _createParser(b, _createContext);
            }
        }
        return _createParser(bArr, 0, bArr.length, _createContext);
    }

    public C5303j createParser(byte[] bArr, int i, int i2) {
        C1347c _createContext = _createContext(bArr, true);
        if (this._inputDecorator != null) {
            InputStream b = this._inputDecorator.m3213b();
            if (b != null) {
                return _createParser(b, _createContext);
            }
        }
        return _createParser(bArr, i, i2, _createContext);
    }

    public C5303j createParser(char[] cArr) {
        return createParser(cArr, 0, cArr.length);
    }

    public C5303j createParser(char[] cArr, int i, int i2) {
        if (this._inputDecorator != null) {
            return createParser(new CharArrayReader(cArr, i, i2));
        }
        return _createParser(cArr, i, i2, _createContext(cArr, true), false);
    }

    public C5297e disable(C1362a c1362a) {
        this._factoryFeatures = ((1 << c1362a.ordinal()) ^ -1) & this._factoryFeatures;
        return this;
    }

    public C5297e disable(C1368a c1368a) {
        this._generatorFeatures = (c1368a.f4318k ^ -1) & this._generatorFeatures;
        return this;
    }

    public C5297e disable(C1376a c1376a) {
        this._parserFeatures = (c1376a.f4363l ^ -1) & this._parserFeatures;
        return this;
    }

    public C5297e enable(C1362a c1362a) {
        this._factoryFeatures = (1 << c1362a.ordinal()) | this._factoryFeatures;
        return this;
    }

    public C5297e enable(C1368a c1368a) {
        this._generatorFeatures = c1368a.f4318k | this._generatorFeatures;
        return this;
    }

    public C5297e enable(C1376a c1376a) {
        this._parserFeatures = c1376a.f4363l | this._parserFeatures;
        return this;
    }

    public C1346b getCharacterEscapes() {
        return this._characterEscapes;
    }

    public C5304n getCodec() {
        return this._objectCodec;
    }

    public String getFormatName() {
        return getClass() == C5297e.class ? FORMAT_NAME_JSON : null;
    }

    public Class<? extends Object> getFormatReadFeatureType() {
        return null;
    }

    public Class<? extends Object> getFormatWriteFeatureType() {
        return null;
    }

    public C1348d getInputDecorator() {
        return this._inputDecorator;
    }

    public C1353i getOutputDecorator() {
        return this._outputDecorator;
    }

    public String getRootValueSeparator() {
        return this._rootValueSeparator == null ? null : this._rootValueSeparator.getValue();
    }

    public C1343b hasFormat(C1342a c1342a) {
        return getClass() == C5297e.class ? hasJSONFormat(c1342a) : null;
    }

    protected C1343b hasJSONFormat(C1342a c1342a) {
        if (!c1342a.m3175a()) {
            return C1343b.INCONCLUSIVE;
        }
        byte b = c1342a.m3176b();
        if (b == (byte) -17) {
            if (!c1342a.m3175a()) {
                return C1343b.INCONCLUSIVE;
            }
            if (c1342a.m3176b() == (byte) -69) {
                if (!c1342a.m3175a()) {
                    return C1343b.INCONCLUSIVE;
                }
                if (c1342a.m3176b() == (byte) -65) {
                    if (!c1342a.m3175a()) {
                        return C1343b.INCONCLUSIVE;
                    }
                    b = c1342a.m3176b();
                }
            }
            return C1343b.NO_MATCH;
        }
        int a = C1357a.m3258a(c1342a, b);
        if (a < 0) {
            return C1343b.INCONCLUSIVE;
        }
        int a2;
        if (a == 123) {
            a2 = C1357a.m3257a(c1342a);
            if (a2 < 0) {
                return C1343b.INCONCLUSIVE;
            }
            if (a2 != 34) {
                if (a2 != 125) {
                    return C1343b.NO_MATCH;
                }
            }
            return C1343b.SOLID_MATCH;
        } else if (a == 91) {
            a2 = C1357a.m3257a(c1342a);
            if (a2 < 0) {
                return C1343b.INCONCLUSIVE;
            }
            if (a2 != 93) {
                if (a2 != 91) {
                    return C1343b.SOLID_MATCH;
                }
            }
            return C1343b.SOLID_MATCH;
        } else {
            C1343b c1343b = C1343b.WEAK_MATCH;
            if (a == 34) {
                return c1343b;
            }
            if (a <= 57 && a >= 48) {
                return c1343b;
            }
            if (a == 45) {
                a2 = C1357a.m3257a(c1342a);
                return a2 < 0 ? C1343b.INCONCLUSIVE : (a2 > 57 || a2 < 48) ? C1343b.NO_MATCH : c1343b;
            } else {
                String str;
                if (a == 110) {
                    str = "ull";
                } else if (a == 116) {
                    str = "rue";
                } else {
                    if (a == 102) {
                        str = "alse";
                    }
                    return C1343b.NO_MATCH;
                }
                return C1357a.m3259a(c1342a, str, c1343b);
            }
        }
    }

    public final boolean isEnabled(C1362a c1362a) {
        return ((1 << c1362a.ordinal()) & this._factoryFeatures) != 0;
    }

    public final boolean isEnabled(C1368a c1368a) {
        return (c1368a.f4318k & this._generatorFeatures) != 0;
    }

    public final boolean isEnabled(C1376a c1376a) {
        return (c1376a.f4363l & this._parserFeatures) != 0;
    }

    protected Object readResolve() {
        return new C5297e(this, this._objectCodec);
    }

    public boolean requiresCustomCodec() {
        return false;
    }

    public boolean requiresPropertyOrdering() {
        return false;
    }

    public C5297e setCharacterEscapes(C1346b c1346b) {
        this._characterEscapes = c1346b;
        return this;
    }

    public C5297e setCodec(C5304n c5304n) {
        this._objectCodec = c5304n;
        return this;
    }

    public C5297e setInputDecorator(C1348d c1348d) {
        this._inputDecorator = c1348d;
        return this;
    }

    public C5297e setOutputDecorator(C1353i c1353i) {
        this._outputDecorator = c1353i;
        return this;
    }

    public C5297e setRootValueSeparator(String str) {
        this._rootValueSeparator = str == null ? null : new C5293j(str);
        return this;
    }

    public C1385s version() {
        return C5296f.f14697a;
    }
}
