package p206d;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p206d.C5681a.C56791;
import p206d.C5681a.C56802;

public final class C2273l {
    static final Logger f7561a = Logger.getLogger(C2273l.class.getName());

    class C56891 implements C2277r {
        final /* synthetic */ C2279t f15635a;
        final /* synthetic */ OutputStream f15636b;

        C56891(C2279t c2279t, OutputStream outputStream) {
            this.f15635a = c2279t;
            this.f15636b = outputStream;
        }

        public final C2279t mo960a() {
            return this.f15635a;
        }

        public final void a_(C6623c c6623c, long j) {
            C2280u.m6235a(c6623c.f18884b, 0, j);
            while (j > 0) {
                this.f15635a.mo2034f();
                C2275o c2275o = c6623c.f18883a;
                int min = (int) Math.min(j, (long) (c2275o.f7565c - c2275o.f7564b));
                this.f15636b.write(c2275o.f7563a, c2275o.f7564b, min);
                c2275o.f7564b += min;
                long j2 = (long) min;
                long j3 = j - j2;
                c6623c.f18884b -= j2;
                if (c2275o.f7564b == c2275o.f7565c) {
                    c6623c.f18883a = c2275o.m6222b();
                    C2276p.m6224a(c2275o);
                }
                j = j3;
            }
        }

        public final void close() {
            this.f15636b.close();
        }

        public final void flush() {
            this.f15636b.flush();
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("sink(");
            stringBuilder.append(this.f15636b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    class C56902 implements C2278s {
        final /* synthetic */ C2279t f15637a;
        final /* synthetic */ InputStream f15638b;

        C56902(C2279t c2279t, InputStream inputStream) {
            this.f15637a = c2279t;
            this.f15638b = inputStream;
        }

        public final long mo944a(C6623c c6623c, long j) {
            if (j < 0) {
                StringBuilder stringBuilder = new StringBuilder("byteCount < 0: ");
                stringBuilder.append(j);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (j == 0) {
                return 0;
            } else {
                try {
                    this.f15637a.mo2034f();
                    C2275o e = c6623c.m17049e(1);
                    int read = this.f15638b.read(e.f7563a, e.f7565c, (int) Math.min(j, (long) (8192 - e.f7565c)));
                    if (read == -1) {
                        return -1;
                    }
                    e.f7565c += read;
                    j = (long) read;
                    c6623c.f18884b += j;
                    return j;
                } catch (AssertionError e2) {
                    if (C2273l.m6215a(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
            }
        }

        public final C2279t mo945a() {
            return this.f15637a;
        }

        public final void close() {
            this.f15638b.close();
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("source(");
            stringBuilder.append(this.f15638b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    class C66243 extends C5681a {
        final /* synthetic */ Socket f18885a;

        C66243(Socket socket) {
            this.f18885a = socket;
        }

        protected final IOException mo2688a(IOException iOException) {
            IOException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        protected final void mo2689a() {
            Throwable e;
            Logger logger;
            Level level;
            StringBuilder stringBuilder;
            try {
                this.f18885a.close();
            } catch (Exception e2) {
                e = e2;
                logger = C2273l.f7561a;
                level = Level.WARNING;
                stringBuilder = new StringBuilder("Failed to close timed out socket ");
                stringBuilder.append(this.f18885a);
                logger.log(level, stringBuilder.toString(), e);
            } catch (AssertionError e3) {
                e = e3;
                if (C2273l.m6215a((AssertionError) e)) {
                    logger = C2273l.f7561a;
                    level = Level.WARNING;
                    stringBuilder = new StringBuilder("Failed to close timed out socket ");
                    stringBuilder.append(this.f18885a);
                    logger.log(level, stringBuilder.toString(), e);
                }
                throw e;
            }
        }
    }

    private C2273l() {
    }

    public static C5682d m6208a(C2277r c2277r) {
        return new C6625m(c2277r);
    }

    public static C5683e m6209a(C2278s c2278s) {
        return new C6626n(c2278s);
    }

    private static C2277r m6210a(OutputStream outputStream, C2279t c2279t) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (c2279t != null) {
            return new C56891(c2279t, outputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    public static C2277r m6211a(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() == null) {
            throw new IOException("socket's output stream == null");
        } else {
            C2279t c = C2273l.m6218c(socket);
            return new C56791(c, C2273l.m6210a(socket.getOutputStream(), c));
        }
    }

    public static C2278s m6212a(File file) {
        if (file != null) {
            return C2273l.m6213a(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static C2278s m6213a(InputStream inputStream) {
        return C2273l.m6214a(inputStream, new C2279t());
    }

    private static C2278s m6214a(InputStream inputStream, C2279t c2279t) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (c2279t != null) {
            return new C56902(c2279t, inputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    static boolean m6215a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static C2277r m6216b(File file) {
        if (file != null) {
            return C2273l.m6210a(new FileOutputStream(file), new C2279t());
        }
        throw new IllegalArgumentException("file == null");
    }

    public static C2278s m6217b(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        } else {
            C2279t c = C2273l.m6218c(socket);
            return new C56802(c, C2273l.m6214a(socket.getInputStream(), c));
        }
    }

    private static C5681a m6218c(Socket socket) {
        return new C66243(socket);
    }
}
