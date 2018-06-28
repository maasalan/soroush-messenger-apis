package org.msgpack.core.buffer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

class DirectBufferAccess {
    static Constructor byteBufferConstructor;
    static DirectBufferConstructorType directBufferConstructorType;
    static Class<?> directByteBufferClass;
    static Method mClean;
    static Method mCleaner;
    static Method mGetAddress;
    static Method memoryBlockWrapFromJni;

    enum DirectBufferConstructorType {
        ARGS_LONG_INT_REF,
        ARGS_LONG_INT,
        ARGS_INT_INT,
        ARGS_MB_INT_INT
    }

    static {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = java.lang.ClassLoader.getSystemClassLoader();	 Catch:{ Exception -> 0x00c7 }
        r1 = "java.nio.DirectByteBuffer";	 Catch:{ Exception -> 0x00c7 }
        r0 = r0.loadClass(r1);	 Catch:{ Exception -> 0x00c7 }
        directByteBufferClass = r0;	 Catch:{ Exception -> 0x00c7 }
        r0 = 0;
        r1 = 3;
        r2 = 2;
        r3 = 0;
        r4 = 1;
        r5 = directByteBufferClass;	 Catch:{ NoSuchMethodException -> 0x0028 }
        r6 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x0028 }
        r7 = java.lang.Long.TYPE;	 Catch:{ NoSuchMethodException -> 0x0028 }
        r6[r3] = r7;	 Catch:{ NoSuchMethodException -> 0x0028 }
        r7 = java.lang.Integer.TYPE;	 Catch:{ NoSuchMethodException -> 0x0028 }
        r6[r4] = r7;	 Catch:{ NoSuchMethodException -> 0x0028 }
        r7 = java.lang.Object.class;	 Catch:{ NoSuchMethodException -> 0x0028 }
        r6[r2] = r7;	 Catch:{ NoSuchMethodException -> 0x0028 }
        r5 = r5.getDeclaredConstructor(r6);	 Catch:{ NoSuchMethodException -> 0x0028 }
        r6 = org.msgpack.core.buffer.DirectBufferAccess.DirectBufferConstructorType.ARGS_LONG_INT_REF;	 Catch:{ NoSuchMethodException -> 0x0028 }
        goto L_0x007e;
    L_0x0028:
        r5 = directByteBufferClass;	 Catch:{ NoSuchMethodException -> 0x003b }
        r6 = new java.lang.Class[r2];	 Catch:{ NoSuchMethodException -> 0x003b }
        r7 = java.lang.Long.TYPE;	 Catch:{ NoSuchMethodException -> 0x003b }
        r6[r3] = r7;	 Catch:{ NoSuchMethodException -> 0x003b }
        r7 = java.lang.Integer.TYPE;	 Catch:{ NoSuchMethodException -> 0x003b }
        r6[r4] = r7;	 Catch:{ NoSuchMethodException -> 0x003b }
        r5 = r5.getDeclaredConstructor(r6);	 Catch:{ NoSuchMethodException -> 0x003b }
        r6 = org.msgpack.core.buffer.DirectBufferAccess.DirectBufferConstructorType.ARGS_LONG_INT;	 Catch:{ NoSuchMethodException -> 0x003b }
        goto L_0x007e;
    L_0x003b:
        r5 = directByteBufferClass;	 Catch:{ NoSuchMethodException -> 0x004e }
        r6 = new java.lang.Class[r2];	 Catch:{ NoSuchMethodException -> 0x004e }
        r7 = java.lang.Integer.TYPE;	 Catch:{ NoSuchMethodException -> 0x004e }
        r6[r3] = r7;	 Catch:{ NoSuchMethodException -> 0x004e }
        r7 = java.lang.Integer.TYPE;	 Catch:{ NoSuchMethodException -> 0x004e }
        r6[r4] = r7;	 Catch:{ NoSuchMethodException -> 0x004e }
        r5 = r5.getDeclaredConstructor(r6);	 Catch:{ NoSuchMethodException -> 0x004e }
        r6 = org.msgpack.core.buffer.DirectBufferAccess.DirectBufferConstructorType.ARGS_INT_INT;	 Catch:{ NoSuchMethodException -> 0x004e }
        goto L_0x007e;
    L_0x004e:
        r0 = "java.nio.MemoryBlock";	 Catch:{ Exception -> 0x00c7 }
        r0 = java.lang.Class.forName(r0);	 Catch:{ Exception -> 0x00c7 }
        r5 = "wrapFromJni";	 Catch:{ Exception -> 0x00c7 }
        r6 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x00c7 }
        r7 = java.lang.Integer.TYPE;	 Catch:{ Exception -> 0x00c7 }
        r6[r3] = r7;	 Catch:{ Exception -> 0x00c7 }
        r7 = java.lang.Long.TYPE;	 Catch:{ Exception -> 0x00c7 }
        r6[r4] = r7;	 Catch:{ Exception -> 0x00c7 }
        r5 = r0.getDeclaredMethod(r5, r6);	 Catch:{ Exception -> 0x00c7 }
        r5.setAccessible(r4);	 Catch:{ Exception -> 0x00c7 }
        r6 = directByteBufferClass;	 Catch:{ Exception -> 0x00c7 }
        r1 = new java.lang.Class[r1];	 Catch:{ Exception -> 0x00c7 }
        r1[r3] = r0;	 Catch:{ Exception -> 0x00c7 }
        r0 = java.lang.Integer.TYPE;	 Catch:{ Exception -> 0x00c7 }
        r1[r4] = r0;	 Catch:{ Exception -> 0x00c7 }
        r0 = java.lang.Integer.TYPE;	 Catch:{ Exception -> 0x00c7 }
        r1[r2] = r0;	 Catch:{ Exception -> 0x00c7 }
        r0 = r6.getDeclaredConstructor(r1);	 Catch:{ Exception -> 0x00c7 }
        r6 = org.msgpack.core.buffer.DirectBufferAccess.DirectBufferConstructorType.ARGS_MB_INT_INT;	 Catch:{ Exception -> 0x00c7 }
        r8 = r5;	 Catch:{ Exception -> 0x00c7 }
        r5 = r0;	 Catch:{ Exception -> 0x00c7 }
        r0 = r8;	 Catch:{ Exception -> 0x00c7 }
    L_0x007e:
        byteBufferConstructor = r5;	 Catch:{ Exception -> 0x00c7 }
        directBufferConstructorType = r6;	 Catch:{ Exception -> 0x00c7 }
        memoryBlockWrapFromJni = r0;	 Catch:{ Exception -> 0x00c7 }
        r0 = byteBufferConstructor;	 Catch:{ Exception -> 0x00c7 }
        if (r0 != 0) goto L_0x0090;	 Catch:{ Exception -> 0x00c7 }
    L_0x0088:
        r0 = new java.lang.RuntimeException;	 Catch:{ Exception -> 0x00c7 }
        r1 = "Constructor of DirectByteBuffer is not found";	 Catch:{ Exception -> 0x00c7 }
        r0.<init>(r1);	 Catch:{ Exception -> 0x00c7 }
        throw r0;	 Catch:{ Exception -> 0x00c7 }
    L_0x0090:
        r0 = byteBufferConstructor;	 Catch:{ Exception -> 0x00c7 }
        r0.setAccessible(r4);	 Catch:{ Exception -> 0x00c7 }
        r0 = directByteBufferClass;	 Catch:{ Exception -> 0x00c7 }
        r1 = "address";	 Catch:{ Exception -> 0x00c7 }
        r2 = new java.lang.Class[r3];	 Catch:{ Exception -> 0x00c7 }
        r0 = r0.getDeclaredMethod(r1, r2);	 Catch:{ Exception -> 0x00c7 }
        mGetAddress = r0;	 Catch:{ Exception -> 0x00c7 }
        r0.setAccessible(r4);	 Catch:{ Exception -> 0x00c7 }
        r0 = directByteBufferClass;	 Catch:{ Exception -> 0x00c7 }
        r1 = "cleaner";	 Catch:{ Exception -> 0x00c7 }
        r2 = new java.lang.Class[r3];	 Catch:{ Exception -> 0x00c7 }
        r0 = r0.getDeclaredMethod(r1, r2);	 Catch:{ Exception -> 0x00c7 }
        mCleaner = r0;	 Catch:{ Exception -> 0x00c7 }
        r0.setAccessible(r4);	 Catch:{ Exception -> 0x00c7 }
        r0 = mCleaner;	 Catch:{ Exception -> 0x00c7 }
        r0 = r0.getReturnType();	 Catch:{ Exception -> 0x00c7 }
        r1 = "clean";	 Catch:{ Exception -> 0x00c7 }
        r2 = new java.lang.Class[r3];	 Catch:{ Exception -> 0x00c7 }
        r0 = r0.getDeclaredMethod(r1, r2);	 Catch:{ Exception -> 0x00c7 }
        mClean = r0;	 Catch:{ Exception -> 0x00c7 }
        r0.setAccessible(r4);	 Catch:{ Exception -> 0x00c7 }
        return;
    L_0x00c7:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.core.buffer.DirectBufferAccess.<clinit>():void");
    }

    private DirectBufferAccess() {
    }

    static void clean(Object obj) {
        try {
            mClean.invoke(mCleaner.invoke(obj, new Object[0]), new Object[0]);
        } catch (Throwable th) {
            RuntimeException runtimeException = new RuntimeException(th);
        }
    }

    static long getAddress(Object obj) {
        try {
            return ((Long) mGetAddress.invoke(obj, new Object[0])).longValue();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        }
    }

    static boolean isDirectByteBufferInstance(Object obj) {
        return directByteBufferClass.isInstance(obj);
    }

    static ByteBuffer newByteBuffer(long j, int i, int i2, ByteBuffer byteBuffer) {
        try {
            switch (directBufferConstructorType) {
                case ARGS_LONG_INT_REF:
                    return (ByteBuffer) byteBufferConstructor.newInstance(new Object[]{Long.valueOf(j + ((long) i)), Integer.valueOf(i2), byteBuffer});
                case ARGS_LONG_INT:
                    return (ByteBuffer) byteBufferConstructor.newInstance(new Object[]{Long.valueOf(j + ((long) i)), Integer.valueOf(i2)});
                case ARGS_INT_INT:
                    return (ByteBuffer) byteBufferConstructor.newInstance(new Object[]{Integer.valueOf(((int) j) + i), Integer.valueOf(i2)});
                case ARGS_MB_INT_INT:
                    Constructor constructor = byteBufferConstructor;
                    r0 = new Object[3];
                    r0[0] = memoryBlockWrapFromJni.invoke(null, new Object[]{Long.valueOf(j + ((long) i)), Integer.valueOf(i2)});
                    r0[1] = Integer.valueOf(i2);
                    r0[2] = Integer.valueOf(0);
                    return (ByteBuffer) constructor.newInstance(r0);
                default:
                    throw new IllegalStateException("Unexpected value");
            }
        } catch (Throwable th) {
            RuntimeException runtimeException = new RuntimeException(th);
        }
    }
}
