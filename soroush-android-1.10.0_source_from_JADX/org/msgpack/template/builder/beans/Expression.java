package org.msgpack.template.builder.beans;

import org.apache.b.a.a;

public class Expression extends Statement {
    Object value;
    boolean valueIsDefined;

    public Expression(Object obj, Object obj2, String str, Object[] objArr) {
        super(obj2, str, objArr);
        this.valueIsDefined = false;
        this.value = obj;
        this.valueIsDefined = true;
    }

    public Expression(Object obj, String str, Object[] objArr) {
        super(obj, str, objArr);
        this.valueIsDefined = false;
        this.value = null;
        this.valueIsDefined = false;
    }

    public Object getValue() {
        if (!this.valueIsDefined) {
            this.value = invokeMethod();
            this.valueIsDefined = true;
        }
        return this.value;
    }

    public void setValue(Object obj) {
        this.value = obj;
        this.valueIsDefined = true;
    }

    public String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        if (!this.valueIsDefined) {
            str = "<unbound>";
        } else if (this.value == null) {
            str = "null";
        } else {
            Class cls = this.value.getClass();
            str = cls == String.class ? "\"\"" : a.a(cls);
        }
        stringBuilder.append(str);
        stringBuilder.append('=');
        stringBuilder.append(super.toString());
        return stringBuilder.toString();
    }
}
