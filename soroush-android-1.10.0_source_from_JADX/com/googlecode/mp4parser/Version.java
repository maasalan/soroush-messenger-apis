package com.googlecode.mp4parser;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.logging.Logger;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class Version {
    private static final Logger LOG = Logger.getLogger(Version.class.getName());
    public static final String VERSION;

    static {
        String readLine;
        try {
            readLine = new LineNumberReader(new InputStreamReader(Version.class.getResourceAsStream("/version.txt"))).readLine();
        } catch (IOException e) {
            LOG.warning(e.getMessage());
            readLine = IjkMediaMeta.IJKM_VAL_TYPE__UNKNOWN;
        }
        VERSION = readLine;
    }
}
