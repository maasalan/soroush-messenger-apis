package org.jivesoftware.smack.debugger;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.jivesoftware.smack.XMPPConnection;

public class ConsoleDebugger extends AbstractDebugger {
    private final SimpleDateFormat dateFormatter = new SimpleDateFormat("HH:mm:ss");

    public ConsoleDebugger(XMPPConnection xMPPConnection, Writer writer, Reader reader) {
        super(xMPPConnection, writer, reader);
    }

    protected void log(String str) {
        String format;
        synchronized (this.dateFormatter) {
            format = this.dateFormatter.format(new Date());
        }
        PrintStream printStream = System.out;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(format);
        stringBuilder.append(' ');
        stringBuilder.append(str);
        printStream.println(stringBuilder.toString());
    }

    protected void log(String str, Throwable th) {
        Writer stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(stringWriter);
        log(stringBuilder.toString());
    }
}
