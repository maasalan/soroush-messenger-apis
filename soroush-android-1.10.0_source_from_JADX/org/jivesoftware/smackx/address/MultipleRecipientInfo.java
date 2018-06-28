package org.jivesoftware.smackx.address;

import java.util.List;
import org.b.a.i;
import org.jivesoftware.smackx.address.packet.MultipleAddresses;
import org.jivesoftware.smackx.address.packet.MultipleAddresses.Address;
import org.jivesoftware.smackx.address.packet.MultipleAddresses.Type;

public class MultipleRecipientInfo {
    MultipleAddresses extension;

    MultipleRecipientInfo(MultipleAddresses multipleAddresses) {
        this.extension = multipleAddresses;
    }

    public List<Address> getCCAddresses() {
        return this.extension.getAddressesOfType(Type.cc);
    }

    public Address getReplyAddress() {
        List addressesOfType = this.extension.getAddressesOfType(Type.replyto);
        return addressesOfType.isEmpty() ? null : (Address) addressesOfType.get(0);
    }

    public i getReplyRoom() {
        List addressesOfType = this.extension.getAddressesOfType(Type.replyroom);
        return addressesOfType.isEmpty() ? null : ((Address) addressesOfType.get(0)).getJid();
    }

    public List<Address> getTOAddresses() {
        return this.extension.getAddressesOfType(Type.to);
    }

    public boolean shouldNotReply() {
        return !this.extension.getAddressesOfType(Type.noreply).isEmpty();
    }
}
