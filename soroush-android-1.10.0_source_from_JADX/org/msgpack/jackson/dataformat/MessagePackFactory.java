package org.msgpack.jackson.dataformat;

import com.d.a.b.c.c;
import com.d.a.b.d;
import com.d.a.b.e;
import com.d.a.b.g;
import com.d.a.b.j;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Arrays;
import org.msgpack.core.MessagePack;
import org.msgpack.core.MessagePack.PackerConfig;

public class MessagePackFactory extends e {
    private static final long serialVersionUID = 2578263992015504347L;
    private ExtensionTypeCustomDeserializers extTypeCustomDesers;
    private final PackerConfig packerConfig;
    private boolean reuseResourceInGenerator;
    private boolean reuseResourceInParser;

    public MessagePackFactory() {
        this(MessagePack.DEFAULT_PACKER_CONFIG);
    }

    public MessagePackFactory(PackerConfig packerConfig) {
        this.reuseResourceInGenerator = true;
        this.reuseResourceInParser = true;
        this.packerConfig = packerConfig;
    }

    protected j _createParser(byte[] bArr, int i, int i2, c cVar) {
        j messagePackParser;
        if (i == 0) {
            if (i2 != bArr.length) {
            }
            messagePackParser = new MessagePackParser(cVar, this._parserFeatures, this._objectCodec, bArr, this.reuseResourceInParser);
            if (this.extTypeCustomDesers != null) {
                messagePackParser.setExtensionTypeCustomDeserializers(this.extTypeCustomDesers);
            }
            return messagePackParser;
        }
        bArr = Arrays.copyOfRange(bArr, i, i2 + i);
        messagePackParser = new MessagePackParser(cVar, this._parserFeatures, this._objectCodec, bArr, this.reuseResourceInParser);
        if (this.extTypeCustomDesers != null) {
            messagePackParser.setExtensionTypeCustomDeserializers(this.extTypeCustomDesers);
        }
        return messagePackParser;
    }

    protected MessagePackParser _createParser(InputStream inputStream, c cVar) {
        MessagePackParser messagePackParser = new MessagePackParser(cVar, this._parserFeatures, this._objectCodec, inputStream, this.reuseResourceInParser);
        if (this.extTypeCustomDesers != null) {
            messagePackParser.setExtensionTypeCustomDeserializers(this.extTypeCustomDesers);
        }
        return messagePackParser;
    }

    public g createGenerator(File file, d dVar) {
        return createGenerator(new FileOutputStream(file), dVar);
    }

    public g createGenerator(OutputStream outputStream, d dVar) {
        return new MessagePackGenerator(this._generatorFeatures, this._objectCodec, outputStream, this.packerConfig, this.reuseResourceInGenerator);
    }

    public g createGenerator(Writer writer) {
        throw new UnsupportedOperationException();
    }

    public j createParser(InputStream inputStream) {
        return _createParser(inputStream, _createContext(inputStream, false));
    }

    public j createParser(byte[] bArr) {
        return _createParser(bArr, 0, bArr.length, _createContext(bArr, false));
    }

    public MessagePackFactory setExtTypeCustomDesers(ExtensionTypeCustomDeserializers extensionTypeCustomDeserializers) {
        this.extTypeCustomDesers = extensionTypeCustomDeserializers;
        return this;
    }

    public MessagePackFactory setReuseResourceInGenerator(boolean z) {
        this.reuseResourceInGenerator = z;
        return this;
    }

    public MessagePackFactory setReuseResourceInParser(boolean z) {
        this.reuseResourceInParser = z;
        return this;
    }
}
