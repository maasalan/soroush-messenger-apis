package android.support.v7.p049g;

import java.util.Comparator;

public final class C0702a<T> {

    public static abstract class C0701a<T2> implements Comparator<T2> {
        public abstract boolean areContentsTheSame(T2 t2, T2 t22);

        public abstract boolean areItemsTheSame(T2 t2, T2 t22);

        public abstract int compare(T2 t2, T2 t22);

        public abstract void onChanged(int i, int i2);

        public void onChanged(int i, int i2, Object obj) {
            onChanged(i, i2);
        }
    }
}
