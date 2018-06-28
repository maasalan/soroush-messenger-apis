package mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2;

public final class C4121n {
    public static String f11799a = "";
    public static int f11800b;
    private static C4121n f11801c;

    private C4121n() {
    }

    public static C4121n m7999a() {
        if (f11801c == null) {
            f11801c = new C4121n();
        }
        return f11801c;
    }

    public static synchronized void m8000b() {
        synchronized (C4121n.class) {
            f11799a = "";
            f11800b = 0;
        }
    }

    public final synchronized void m8001a(String str) {
        f11799a = str;
    }
}
