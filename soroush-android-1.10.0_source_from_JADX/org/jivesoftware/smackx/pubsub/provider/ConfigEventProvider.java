package org.jivesoftware.smackx.pubsub.provider;

import java.util.List;
import java.util.Map;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.provider.EmbeddedExtensionProvider;
import org.jivesoftware.smackx.iot.data.element.NodeElement;
import org.jivesoftware.smackx.pubsub.ConfigurationEvent;
import org.jivesoftware.smackx.pubsub.ConfigureForm;
import org.jivesoftware.smackx.xdata.packet.DataForm;

public class ConfigEventProvider extends EmbeddedExtensionProvider<ConfigurationEvent> {
    protected ConfigurationEvent createReturnExtension(String str, String str2, Map<String, String> map, List<? extends ExtensionElement> list) {
        return list.size() == 0 ? new ConfigurationEvent((String) map.get(NodeElement.ELEMENT)) : new ConfigurationEvent((String) map.get(NodeElement.ELEMENT), new ConfigureForm((DataForm) list.iterator().next()));
    }
}
