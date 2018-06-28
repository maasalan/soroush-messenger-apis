package com.coremedia.iso;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.FileDataSourceImpl;
import com.googlecode.mp4parser.util.Path;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.jivesoftware.smack.sm.packet.StreamManagement.AckRequest;

public class BoxReplacer {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public static void replace(Map<String, Box> map, File file) {
        Container isoFile = new IsoFile(new FileDataSourceImpl(new RandomAccessFile(file, AckRequest.ELEMENT).getChannel()));
        Map hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        for (Entry entry : map.entrySet()) {
            Box path = Path.getPath(isoFile, (String) entry.getKey());
            hashMap.put(Path.createPath(path), (Box) entry.getValue());
            hashMap2.put(Path.createPath(path), Long.valueOf(path.getOffset()));
        }
        isoFile.close();
        Object channel = new RandomAccessFile(file, "rw").getChannel();
        for (String str : hashMap.keySet()) {
            Box box = (Box) hashMap.get(str);
            channel.position(((Long) hashMap2.get(str)).longValue());
            box.getBox(channel);
        }
        channel.close();
    }
}
