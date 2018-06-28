package org.jivesoftware.smack.roster.rosterstore;

import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.b.a.i;
import org.jivesoftware.smack.roster.packet.RosterPacket.Item;
import org.jivesoftware.smack.roster.provider.RosterPacketProvider;
import org.jivesoftware.smack.util.FileUtils;
import org.jivesoftware.smack.util.PacketParserUtils;
import org.jivesoftware.smack.util.stringencoder.Base32;

public final class DirectoryRosterStore implements RosterStore {
    private static final String ENTRY_PREFIX = "entry-";
    private static final Logger LOGGER = Logger.getLogger(DirectoryRosterStore.class.getName());
    private static final String STORE_ID = "DEFAULT_ROSTER_STORE";
    private static final String VERSION_FILE_NAME = "__version__";
    private static final FileFilter rosterDirFilter = new C77531();
    private final File fileDir;

    static class C77531 implements FileFilter {
        C77531() {
        }

        public final boolean accept(File file) {
            return file.getName().startsWith(DirectoryRosterStore.ENTRY_PREFIX);
        }
    }

    private DirectoryRosterStore(File file) {
        this.fileDir = file;
    }

    private boolean addEntryRaw(Item item) {
        return FileUtils.writeFile(getBareJidFile(item.getJid()), item.toXML());
    }

    private File getBareJidFile(i iVar) {
        String encode = Base32.encode(iVar.toString());
        File file = this.fileDir;
        StringBuilder stringBuilder = new StringBuilder(ENTRY_PREFIX);
        stringBuilder.append(encode);
        return new File(file, stringBuilder.toString());
    }

    private File getVersionFile() {
        return new File(this.fileDir, VERSION_FILE_NAME);
    }

    public static DirectoryRosterStore init(File file) {
        DirectoryRosterStore directoryRosterStore = new DirectoryRosterStore(file);
        return directoryRosterStore.setRosterVersion("") ? directoryRosterStore : null;
    }

    public static DirectoryRosterStore open(File file) {
        DirectoryRosterStore directoryRosterStore = new DirectoryRosterStore(file);
        String readFile = FileUtils.readFile(directoryRosterStore.getVersionFile());
        return (readFile == null || !readFile.startsWith("DEFAULT_ROSTER_STORE\n")) ? null : directoryRosterStore;
    }

    private static Item readEntry(File file) {
        try {
            Reader fileReader = new FileReader(file);
            try {
                Item parseItem = RosterPacketProvider.parseItem(PacketParserUtils.getParserFor(fileReader));
                fileReader.close();
                return parseItem;
            } catch (Throwable e) {
                String str = "Exception while parsing roster entry.";
                if (file.delete()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(" File was deleted.");
                    str = stringBuilder.toString();
                }
                LOGGER.log(Level.SEVERE, str, e);
                return null;
            }
        } catch (Throwable e2) {
            LOGGER.log(Level.FINE, "Roster entry file not found", e2);
            return null;
        }
    }

    private boolean setRosterVersion(String str) {
        File versionFile = getVersionFile();
        StringBuilder stringBuilder = new StringBuilder("DEFAULT_ROSTER_STORE\n");
        stringBuilder.append(str);
        return FileUtils.writeFile(versionFile, stringBuilder.toString());
    }

    public final boolean addEntry(Item item, String str) {
        return addEntryRaw(item) && setRosterVersion(str);
    }

    public final List<Item> getEntries() {
        List<Item> arrayList = new ArrayList();
        for (File readEntry : this.fileDir.listFiles(rosterDirFilter)) {
            Item readEntry2 = readEntry(readEntry);
            if (readEntry2 == null) {
                return null;
            }
            arrayList.add(readEntry2);
        }
        return arrayList;
    }

    public final Item getEntry(i iVar) {
        return readEntry(getBareJidFile(iVar));
    }

    public final String getRosterVersion() {
        String readFile = FileUtils.readFile(getVersionFile());
        if (readFile == null) {
            return null;
        }
        String[] split = readFile.split("\n", 2);
        return split.length < 2 ? null : split[1];
    }

    public final boolean removeEntry(i iVar, String str) {
        return getBareJidFile(iVar).delete() && setRosterVersion(str);
    }

    public final boolean resetEntries(Collection<Item> collection, String str) {
        for (File delete : this.fileDir.listFiles(rosterDirFilter)) {
            delete.delete();
        }
        for (Item addEntryRaw : collection) {
            if (!addEntryRaw(addEntryRaw)) {
                return false;
            }
        }
        return setRosterVersion(str);
    }

    public final void resetStore() {
        resetEntries(Collections.emptyList(), "");
    }
}
