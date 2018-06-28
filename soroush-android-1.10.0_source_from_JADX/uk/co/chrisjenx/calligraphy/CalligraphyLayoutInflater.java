package uk.co.chrisjenx.calligraphy;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

class CalligraphyLayoutInflater extends LayoutInflater implements CalligraphyActivityFactory {
    private static final String[] sClassPrefixList = new String[]{"android.widget.", "android.webkit."};
    private final int mAttributeId;
    private final CalligraphyFactory mCalligraphyFactory;
    private Field mConstructorArgs = null;
    private boolean mSetPrivateFactory = false;

    @TargetApi(11)
    private static class WrapperFactory2 implements Factory2 {
        protected final CalligraphyFactory mCalligraphyFactory;
        protected final Factory2 mFactory2;

        public WrapperFactory2(Factory2 factory2, CalligraphyFactory calligraphyFactory) {
            this.mFactory2 = factory2;
            this.mCalligraphyFactory = calligraphyFactory;
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.mCalligraphyFactory.onViewCreated(this.mFactory2.onCreateView(view, str, context, attributeSet), context, attributeSet);
        }

        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.mCalligraphyFactory.onViewCreated(this.mFactory2.onCreateView(str, context, attributeSet), context, attributeSet);
        }
    }

    private static class WrapperFactory implements Factory {
        private final CalligraphyFactory mCalligraphyFactory;
        private final Factory mFactory;
        private final CalligraphyLayoutInflater mInflater;

        public WrapperFactory(Factory factory, CalligraphyLayoutInflater calligraphyLayoutInflater, CalligraphyFactory calligraphyFactory) {
            this.mFactory = factory;
            this.mInflater = calligraphyLayoutInflater;
            this.mCalligraphyFactory = calligraphyFactory;
        }

        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            CalligraphyFactory calligraphyFactory;
            View access$000;
            if (VERSION.SDK_INT < 11) {
                calligraphyFactory = this.mCalligraphyFactory;
                access$000 = this.mInflater.createCustomViewInternal(null, this.mFactory.onCreateView(str, context, attributeSet), str, context, attributeSet);
            } else {
                calligraphyFactory = this.mCalligraphyFactory;
                access$000 = this.mFactory.onCreateView(str, context, attributeSet);
            }
            return calligraphyFactory.onViewCreated(access$000, context, attributeSet);
        }
    }

    @TargetApi(11)
    private static class PrivateWrapperFactory2 extends WrapperFactory2 {
        private final CalligraphyLayoutInflater mInflater;

        public PrivateWrapperFactory2(Factory2 factory2, CalligraphyLayoutInflater calligraphyLayoutInflater, CalligraphyFactory calligraphyFactory) {
            super(factory2, calligraphyFactory);
            this.mInflater = calligraphyLayoutInflater;
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.mCalligraphyFactory.onViewCreated(this.mInflater.createCustomViewInternal(view, this.mFactory2.onCreateView(view, str, context, attributeSet), str, context, attributeSet), context, attributeSet);
        }
    }

    protected CalligraphyLayoutInflater(Context context, int i) {
        super(context);
        this.mAttributeId = i;
        this.mCalligraphyFactory = new CalligraphyFactory(i);
        setUpLayoutFactories(false);
    }

    protected CalligraphyLayoutInflater(LayoutInflater layoutInflater, Context context, int i, boolean z) {
        super(layoutInflater, context);
        this.mAttributeId = i;
        this.mCalligraphyFactory = new CalligraphyFactory(i);
        setUpLayoutFactories(z);
    }

    private android.view.View createCustomViewInternal(android.view.View r3, android.view.View r4, java.lang.String r5, android.content.Context r6, android.util.AttributeSet r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r3 = uk.co.chrisjenx.calligraphy.CalligraphyConfig.get();
        r3 = r3.isCustomViewCreation();
        if (r3 != 0) goto L_0x000b;
    L_0x000a:
        return r4;
    L_0x000b:
        if (r4 != 0) goto L_0x0053;
    L_0x000d:
        r3 = 46;
        r3 = r5.indexOf(r3);
        if (r3 < 0) goto L_0x0053;
    L_0x0015:
        r3 = r2.mConstructorArgs;
        if (r3 != 0) goto L_0x0023;
    L_0x0019:
        r3 = android.view.LayoutInflater.class;
        r0 = "mConstructorArgs";
        r3 = uk.co.chrisjenx.calligraphy.ReflectionUtils.getField(r3, r0);
        r2.mConstructorArgs = r3;
    L_0x0023:
        r3 = r2.mConstructorArgs;
        r3 = uk.co.chrisjenx.calligraphy.ReflectionUtils.getValue(r3, r2);
        r3 = (java.lang.Object[]) r3;
        r0 = 0;
        r1 = r3[r0];
        r3[r0] = r6;
        r6 = r2.mConstructorArgs;
        uk.co.chrisjenx.calligraphy.ReflectionUtils.setValue(r6, r2, r3);
        r6 = 0;
        r5 = r2.createView(r5, r6, r7);	 Catch:{ ClassNotFoundException -> 0x004c, all -> 0x0043 }
        r3[r0] = r1;
        r4 = r2.mConstructorArgs;
        uk.co.chrisjenx.calligraphy.ReflectionUtils.setValue(r4, r2, r3);
        r4 = r5;
        return r4;
    L_0x0043:
        r4 = move-exception;
        r3[r0] = r1;
        r5 = r2.mConstructorArgs;
        uk.co.chrisjenx.calligraphy.ReflectionUtils.setValue(r5, r2, r3);
        throw r4;
    L_0x004c:
        r3[r0] = r1;
        r5 = r2.mConstructorArgs;
        uk.co.chrisjenx.calligraphy.ReflectionUtils.setValue(r5, r2, r3);
    L_0x0053:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: uk.co.chrisjenx.calligraphy.CalligraphyLayoutInflater.createCustomViewInternal(android.view.View, android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    private void setPrivateFactoryInternal() {
        if (this.mSetPrivateFactory || !CalligraphyConfig.get().isReflection()) {
            return;
        }
        if (getContext() instanceof Factory2) {
            Method method = ReflectionUtils.getMethod(LayoutInflater.class, "setPrivateFactory");
            if (method != null) {
                ReflectionUtils.invokeMethod(this, method, new PrivateWrapperFactory2((Factory2) getContext(), this, this.mCalligraphyFactory));
            }
            this.mSetPrivateFactory = true;
            return;
        }
        this.mSetPrivateFactory = true;
    }

    private void setUpLayoutFactories(boolean z) {
        if (!z) {
            if (!(VERSION.SDK_INT < 11 || getFactory2() == null || (getFactory2() instanceof WrapperFactory2))) {
                setFactory2(getFactory2());
            }
            if (!(getFactory() == null || (getFactory() instanceof WrapperFactory))) {
                setFactory(getFactory());
            }
        }
    }

    public LayoutInflater cloneInContext(Context context) {
        return new CalligraphyLayoutInflater(this, context, this.mAttributeId, true);
    }

    public View inflate(XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean z) {
        setPrivateFactoryInternal();
        return super.inflate(xmlPullParser, viewGroup, z);
    }

    @TargetApi(11)
    public View onActivityCreateView(View view, View view2, String str, Context context, AttributeSet attributeSet) {
        return this.mCalligraphyFactory.onViewCreated(createCustomViewInternal(view, view2, str, context, attributeSet), context, attributeSet);
    }

    @TargetApi(11)
    protected View onCreateView(View view, String str, AttributeSet attributeSet) {
        return this.mCalligraphyFactory.onViewCreated(super.onCreateView(view, str, attributeSet), getContext(), attributeSet);
    }

    protected android.view.View onCreateView(java.lang.String r6, android.util.AttributeSet r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = sClassPrefixList;
        r1 = 0;
        r2 = 0;
        r3 = r0.length;
    L_0x0005:
        if (r2 >= r3) goto L_0x0011;
    L_0x0007:
        r4 = r0[r2];
        r4 = r5.createView(r6, r4, r7);	 Catch:{ ClassNotFoundException -> 0x000e }
        r1 = r4;
    L_0x000e:
        r2 = r2 + 1;
        goto L_0x0005;
    L_0x0011:
        if (r1 != 0) goto L_0x0017;
    L_0x0013:
        r1 = super.onCreateView(r6, r7);
    L_0x0017:
        r6 = r5.mCalligraphyFactory;
        r0 = r1.getContext();
        r6 = r6.onViewCreated(r1, r0, r7);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: uk.co.chrisjenx.calligraphy.CalligraphyLayoutInflater.onCreateView(java.lang.String, android.util.AttributeSet):android.view.View");
    }

    public void setFactory(Factory factory) {
        if (factory instanceof WrapperFactory) {
            super.setFactory(factory);
        } else {
            super.setFactory(new WrapperFactory(factory, this, this.mCalligraphyFactory));
        }
    }

    @TargetApi(11)
    public void setFactory2(Factory2 factory2) {
        if (factory2 instanceof WrapperFactory2) {
            super.setFactory2(factory2);
        } else {
            super.setFactory2(new WrapperFactory2(factory2, this.mCalligraphyFactory));
        }
    }
}
