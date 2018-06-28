package android.support.design.widget;

import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

public final class C6354s extends AppCompatEditText {
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                if (parent instanceof TextInputLayout) {
                    editorInfo.hintText = ((TextInputLayout) parent).getHint();
                    return onCreateInputConnection;
                }
            }
        }
        return onCreateInputConnection;
    }
}
