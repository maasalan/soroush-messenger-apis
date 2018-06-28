package android.arch.lifecycle;

public abstract class C0093d {

    public enum C0091a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    public enum C0092b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean m163a(C0092b c0092b) {
            return compareTo(c0092b) >= 0;
        }
    }

    public abstract C0092b mo33a();

    public abstract void mo34a(C0095f c0095f);

    public abstract void mo35b(C0095f c0095f);
}
