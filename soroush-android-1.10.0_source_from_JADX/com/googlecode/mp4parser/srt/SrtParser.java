package com.googlecode.mp4parser.srt;

import com.googlecode.mp4parser.authoring.tracks.TextTrackImpl;
import com.googlecode.mp4parser.authoring.tracks.TextTrackImpl.Line;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import org.jivesoftware.smack.util.StringUtils;

public class SrtParser {
    private static long parse(String str) {
        return (((((Long.parseLong(str.split(":")[0].trim()) * 60) * 60) * 1000) + ((Long.parseLong(str.split(":")[1].trim()) * 60) * 1000)) + (Long.parseLong(str.split(":")[2].split(",")[0].trim()) * 1000)) + Long.parseLong(str.split(":")[2].split(",")[1].trim());
    }

    public static TextTrackImpl parse(InputStream inputStream) {
        LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(inputStream, StringUtils.UTF8));
        TextTrackImpl textTrackImpl = new TextTrackImpl();
        while (lineNumberReader.readLine() != null) {
            String readLine = lineNumberReader.readLine();
            String str = "";
            while (true) {
                String readLine2 = lineNumberReader.readLine();
                if (readLine2 == null) {
                    break;
                } else if (readLine2.trim().equals("")) {
                    break;
                } else {
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str));
                    stringBuilder.append(readLine2);
                    stringBuilder.append("\n");
                    str = stringBuilder.toString();
                }
            }
            textTrackImpl.getSubs().add(new Line(parse(readLine.split("-->")[0]), parse(readLine.split("-->")[1]), str));
        }
        return textTrackImpl;
    }
}
