package android.support.v4.view;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.p039a.C0536b;
import android.support.v4.view.p039a.C0538c;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

public class C0547a {
    private static final AccessibilityDelegate DEFAULT_DELEGATE = new AccessibilityDelegate();
    private static final C0536b IMPL = (VERSION.SDK_INT >= 16 ? new C4827a() : new C0536b());
    final AccessibilityDelegate mBridge = IMPL.mo382a(this);

    static class C0536b {
        C0536b() {
        }

        public C0538c mo381a(AccessibilityDelegate accessibilityDelegate, View view) {
            return null;
        }

        public AccessibilityDelegate mo382a(final C0547a c0547a) {
            return new AccessibilityDelegate(this) {
                final /* synthetic */ C0536b f1800b;

                public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    return c0547a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
                }

                public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    c0547a.onInitializeAccessibilityEvent(view, accessibilityEvent);
                }

                public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    c0547a.onInitializeAccessibilityNodeInfo(view, android.support.v4.view.p039a.C0536b.m1191a(accessibilityNodeInfo));
                }

                public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    c0547a.onPopulateAccessibilityEvent(view, accessibilityEvent);
                }

                public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return c0547a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
                }

                public final void sendAccessibilityEvent(View view, int i) {
                    c0547a.sendAccessibilityEvent(view, i);
                }

                public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                    c0547a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
                }
            };
        }

        public boolean mo383a(AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return false;
        }
    }

    static class C4827a extends C0536b {
        C4827a() {
        }

        public final C0538c mo381a(AccessibilityDelegate accessibilityDelegate, View view) {
            AccessibilityNodeProvider accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(view);
            return accessibilityNodeProvider != null ? new C0538c(accessibilityNodeProvider) : null;
        }

        public final AccessibilityDelegate mo382a(final C0547a c0547a) {
            return new AccessibilityDelegate(this) {
                final /* synthetic */ C4827a f1798b;

                public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    return c0547a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
                }

                public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
                    C0538c accessibilityNodeProvider = c0547a.getAccessibilityNodeProvider(view);
                    return accessibilityNodeProvider != null ? (AccessibilityNodeProvider) accessibilityNodeProvider.f1839a : null;
                }

                public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    c0547a.onInitializeAccessibilityEvent(view, accessibilityEvent);
                }

                public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    c0547a.onInitializeAccessibilityNodeInfo(view, C0536b.m1191a(accessibilityNodeInfo));
                }

                public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    c0547a.onPopulateAccessibilityEvent(view, accessibilityEvent);
                }

                public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return c0547a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
                }

                public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                    return c0547a.performAccessibilityAction(view, i, bundle);
                }

                public final void sendAccessibilityEvent(View view, int i) {
                    c0547a.sendAccessibilityEvent(view, i);
                }

                public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                    c0547a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
                }
            };
        }

        public final boolean mo383a(AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return DEFAULT_DELEGATE.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public C0538c getAccessibilityNodeProvider(View view) {
        return IMPL.mo381a(DEFAULT_DELEGATE, view);
    }

    AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        DEFAULT_DELEGATE.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, C0536b c0536b) {
        DEFAULT_DELEGATE.onInitializeAccessibilityNodeInfo(view, c0536b.f1836b);
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        DEFAULT_DELEGATE.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return DEFAULT_DELEGATE.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return IMPL.mo383a(DEFAULT_DELEGATE, view, i, bundle);
    }

    public void sendAccessibilityEvent(View view, int i) {
        DEFAULT_DELEGATE.sendAccessibilityEvent(view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        DEFAULT_DELEGATE.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
