package org.jivesoftware.smack.roster;

public interface RosterLoadedListener {
    void onRosterLoaded(Roster roster);

    void onRosterLoadingFailed(Exception exception);
}
