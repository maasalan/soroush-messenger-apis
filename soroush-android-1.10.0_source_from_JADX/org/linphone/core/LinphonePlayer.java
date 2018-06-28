package org.linphone.core;

public interface LinphonePlayer {

    public interface Listener {
        void endOfFile(LinphonePlayer linphonePlayer);
    }

    public enum State {
        closed,
        paused,
        playing;

        public static State fromValue(int i) {
            return i == 0 ? closed : i == 1 ? paused : i == 2 ? playing : null;
        }
    }

    void close();

    int getCurrentPosition();

    int getDuration();

    State getState();

    int open(String str, Listener listener);

    int pause();

    int seek(int i);

    int start();
}
