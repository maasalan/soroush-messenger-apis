package p056c;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

public interface C0940o {
    public static final C0940o f2981a = new C50411();

    class C50411 implements C0940o {
        C50411() {
        }

        public final List<InetAddress> mo1005a(String str) {
            if (str == null) {
                throw new UnknownHostException("hostname == null");
            }
            try {
                return Arrays.asList(InetAddress.getAllByName(str));
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder("Broken system behaviour for dns lookup of ");
                stringBuilder.append(str);
                UnknownHostException unknownHostException = new UnknownHostException(stringBuilder.toString());
                unknownHostException.initCause(e);
                throw unknownHostException;
            }
        }
    }

    List<InetAddress> mo1005a(String str);
}
