package org.jivesoftware.smackx.caps.cache;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.util.PacketParserUtils;
import org.jivesoftware.smack.util.stringencoder.Base32;
import org.jivesoftware.smack.util.stringencoder.StringEncoder;
import org.jivesoftware.smackx.disco.packet.DiscoverInfo;

public class SimpleDirectoryPersistentCache implements EntityCapsPersistentCache {
    private static final Logger LOGGER = Logger.getLogger(SimpleDirectoryPersistentCache.class.getName());
    private File cacheDir;
    private StringEncoder filenameEncoder;

    public SimpleDirectoryPersistentCache(File file) {
        this(file, Base32.getStringEncoder());
    }

    public SimpleDirectoryPersistentCache(File file, StringEncoder stringEncoder) {
        StringBuilder stringBuilder;
        if (!file.exists()) {
            stringBuilder = new StringBuilder("Cache directory \"");
            stringBuilder.append(file);
            stringBuilder.append("\" does not exist");
            throw new IllegalStateException(stringBuilder.toString());
        } else if (file.isDirectory()) {
            this.cacheDir = file;
            this.filenameEncoder = stringEncoder;
        } else {
            stringBuilder = new StringBuilder("Cache directory \"");
            stringBuilder.append(file);
            stringBuilder.append("\" is not a directory");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private File getFileFor(String str) {
        return new File(this.cacheDir, this.filenameEncoder.encode(str));
    }

    private static DiscoverInfo restoreInfoFromFile(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            String readUTF = dataInputStream.readUTF();
            return readUTF == null ? null : (DiscoverInfo) PacketParserUtils.parseStanza(readUTF);
        } finally {
            dataInputStream.close();
        }
    }

    private static void writeInfoToFile(File file, DiscoverInfo discoverInfo) {
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeUTF(discoverInfo.toXML().toString());
        } finally {
            dataOutputStream.close();
        }
    }

    public void addDiscoverInfoByNodePersistent(String str, DiscoverInfo discoverInfo) {
        File fileFor = getFileFor(str);
        try {
            if (fileFor.createNewFile()) {
                writeInfoToFile(fileFor, discoverInfo);
            }
        } catch (Throwable e) {
            LOGGER.log(Level.SEVERE, "Failed to write disco info to file", e);
        }
    }

    public void emptyCache() {
        for (File delete : this.cacheDir.listFiles()) {
            delete.delete();
        }
    }

    public DiscoverInfo lookup(String str) {
        File fileFor = getFileFor(str);
        if (!fileFor.isFile()) {
            return null;
        }
        try {
            return restoreInfoFromFile(fileFor);
        } catch (Throwable e) {
            LOGGER.log(Level.WARNING, "Coud not restore info from file", e);
            return null;
        }
    }
}
