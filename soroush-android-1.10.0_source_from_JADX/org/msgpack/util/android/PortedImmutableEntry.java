package org.msgpack.util.android;

import java.io.Serializable;
import java.util.Map.Entry;

public class PortedImmutableEntry<K, V> implements Serializable, Entry<K, V> {
    private static final long serialVersionUID = -4564047655287765373L;
    private final K key;
    private final V value;

    public PortedImmutableEntry(K k, V v) {
        this.key = k;
        this.value = v;
    }

    public PortedImmutableEntry(Entry<? extends K, ? extends V> entry) {
        this.key = entry.getKey();
        this.value = entry.getValue();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r4 != r5) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof java.util.Map.Entry;
        r2 = 0;
        if (r1 == 0) goto L_0x003a;
    L_0x0009:
        r5 = (java.util.Map.Entry) r5;
        r1 = r4.key;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.getKey();
        if (r1 != 0) goto L_0x003a;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.key;
        r3 = r5.getKey();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003a;
    L_0x0022:
        r1 = r4.value;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r5 = r5.getValue();
        if (r5 != 0) goto L_0x003a;
    L_0x002c:
        return r0;
    L_0x002d:
        r1 = r4.value;
        r5 = r5.getValue();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x003a;
    L_0x0039:
        return r0;
    L_0x003a:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.util.android.PortedImmutableEntry.equals(java.lang.Object):boolean");
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = this.key == null ? 0 : this.key.hashCode();
        if (this.value != null) {
            i = this.value.hashCode();
        }
        return hashCode ^ i;
    }

    public V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.key);
        stringBuilder.append("=");
        stringBuilder.append(this.value);
        return stringBuilder.toString();
    }
}
