package org.jivesoftware.smackx.muc;

import org.b.a.b;
import org.jivesoftware.smack.SmackException;

public abstract class MultiUserChatException extends SmackException {
    private static final long serialVersionUID = 1;

    public static class MissingMucCreationAcknowledgeException extends MultiUserChatException {
        private static final long serialVersionUID = 1;
    }

    public static class MucAlreadyJoinedException extends MultiUserChatException {
        private static final long serialVersionUID = 1;
    }

    public static class MucConfigurationNotSupportedException extends MultiUserChatException {
        private static final long serialVersionUID = 1;

        public MucConfigurationNotSupportedException(String str) {
            StringBuilder stringBuilder = new StringBuilder("The MUC configuration '");
            stringBuilder.append(str);
            stringBuilder.append("' is not supported by the MUC service");
            super(stringBuilder.toString());
        }
    }

    public static class MucNotJoinedException extends MultiUserChatException {
        private static final long serialVersionUID = 1;

        public MucNotJoinedException(MultiUserChat multiUserChat) {
            StringBuilder stringBuilder = new StringBuilder("Client not currently joined ");
            stringBuilder.append(multiUserChat.getRoom());
            super(stringBuilder.toString());
        }
    }

    public static class NotAMucServiceException extends MultiUserChatException {
        private static final long serialVersionUID = 1;

        NotAMucServiceException(b bVar) {
            StringBuilder stringBuilder = new StringBuilder("Can't perform operation because ");
            stringBuilder.append(bVar);
            stringBuilder.append(" does not provide a MUC (XEP-45) service.");
            super(stringBuilder.toString());
        }

        NotAMucServiceException(MultiUserChat multiUserChat) {
            StringBuilder stringBuilder = new StringBuilder("Can not join '");
            stringBuilder.append(multiUserChat.getRoom());
            stringBuilder.append("', because '");
            stringBuilder.append(multiUserChat.getRoom().t());
            stringBuilder.append("' does not provide a MUC (XEP-45) service.");
            super(stringBuilder.toString());
        }
    }

    protected MultiUserChatException() {
    }

    protected MultiUserChatException(String str) {
        super(str);
    }
}
