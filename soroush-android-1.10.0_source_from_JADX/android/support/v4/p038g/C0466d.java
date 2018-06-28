package android.support.v4.p038g;

public final class C0466d {
    public static void m980a(Object obj, StringBuilder stringBuilder) {
        String str;
        if (obj == null) {
            str = "null";
        } else {
            String simpleName = obj.getClass().getSimpleName();
            if (simpleName == null || simpleName.length() <= 0) {
                simpleName = obj.getClass().getName();
                int lastIndexOf = simpleName.lastIndexOf(46);
                if (lastIndexOf > 0) {
                    simpleName = simpleName.substring(lastIndexOf + 1);
                }
            }
            stringBuilder.append(simpleName);
            stringBuilder.append('{');
            str = Integer.toHexString(System.identityHashCode(obj));
        }
        stringBuilder.append(str);
    }
}
