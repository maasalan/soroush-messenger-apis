package fr.castorflex.android.smoothprogressbar;

public final class C2333c {
    static void m6321a(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Speed must be >= 0");
        }
    }

    static void m6322a(float f, String str) {
        if (f < 0.0f) {
            throw new IllegalArgumentException(String.format("%s %d must be positive", new Object[]{str, Float.valueOf(f)}));
        }
    }
}
