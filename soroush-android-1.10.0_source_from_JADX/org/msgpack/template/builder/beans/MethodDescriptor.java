package org.msgpack.template.builder.beans;

import java.lang.reflect.Method;

public class MethodDescriptor extends FeatureDescriptor {
    private Method method;
    private ParameterDescriptor[] parameterDescriptors;

    public MethodDescriptor(Method method) {
        if (method == null) {
            throw new NullPointerException();
        }
        this.method = method;
        setName(method.getName());
    }

    public MethodDescriptor(Method method, ParameterDescriptor[] parameterDescriptorArr) {
        if (method == null) {
            throw new NullPointerException();
        }
        this.method = method;
        this.parameterDescriptors = parameterDescriptorArr;
        setName(method.getName());
    }

    public Method getMethod() {
        return this.method;
    }

    public ParameterDescriptor[] getParameterDescriptors() {
        return this.parameterDescriptors;
    }

    void merge(MethodDescriptor methodDescriptor) {
        super.merge(methodDescriptor);
        if (this.method == null) {
            this.method = methodDescriptor.method;
        }
        if (this.parameterDescriptors == null) {
            this.parameterDescriptors = methodDescriptor.parameterDescriptors;
        }
    }
}
