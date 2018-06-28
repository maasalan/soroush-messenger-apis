package org.jivesoftware.smack.provider;

import org.jivesoftware.smack.packet.ExtensionElement;

public final class ExtensionProviderInfo extends AbstractProviderInfo {
    public ExtensionProviderInfo(String str, String str2, ExtensionElementProvider<ExtensionElement> extensionElementProvider) {
        super(str, str2, extensionElementProvider);
    }

    public final /* bridge */ /* synthetic */ String getElementName() {
        return super.getElementName();
    }

    public final /* bridge */ /* synthetic */ String getNamespace() {
        return super.getNamespace();
    }
}
