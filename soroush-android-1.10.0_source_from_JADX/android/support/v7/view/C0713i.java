package android.support.v7.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window.Callback;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class C0713i implements Callback {
    final Callback f2370e;

    public C0713i(Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f2370e = callback;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2370e.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f2370e.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f2370e.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f2370e.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2370e.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2370e.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f2370e.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f2370e.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f2370e.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.f2370e.onContentChanged();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f2370e.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return this.f2370e.onCreatePanelView(i);
    }

    public void onDetachedFromWindow() {
        this.f2370e.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f2370e.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f2370e.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f2370e.onPanelClosed(i, menu);
    }

    public void onPointerCaptureChanged(boolean z) {
        this.f2370e.onPointerCaptureChanged(z);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f2370e.onPreparePanel(i, view, menu);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        this.f2370e.onProvideKeyboardShortcuts(list, menu, i);
    }

    public boolean onSearchRequested() {
        return this.f2370e.onSearchRequested();
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f2370e.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(LayoutParams layoutParams) {
        this.f2370e.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f2370e.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f2370e.onWindowStartingActionMode(callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f2370e.onWindowStartingActionMode(callback, i);
    }
}
