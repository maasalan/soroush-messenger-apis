package org.jivesoftware.smackx.xdata;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smackx.xdata.packet.DataForm;
import org.jivesoftware.smackx.xdata.packet.DataForm.Type;

public class Form {
    private DataForm dataForm;

    public Form(Type type) {
        this.dataForm = new DataForm(type);
    }

    public Form(DataForm dataForm) {
        this.dataForm = dataForm;
    }

    public static Form getFormFrom(Stanza stanza) {
        DataForm from = DataForm.from(stanza);
        return (from == null || from.getReportedData() != null) ? null : new Form(from);
    }

    private boolean isFormType() {
        return Type.form == this.dataForm.getType();
    }

    private boolean isSubmitType() {
        return Type.submit == this.dataForm.getType();
    }

    private void setAnswer(FormField formField, Object obj) {
        if (isSubmitType()) {
            formField.resetValues();
            formField.addValue(obj.toString());
            return;
        }
        throw new IllegalStateException("Cannot set an answer if the form is not of type \"submit\"");
    }

    private static void validateThatFieldIsText(FormField formField) {
        switch (formField.getType()) {
            case text_multi:
            case text_private:
            case text_single:
                return;
            default:
                throw new IllegalArgumentException("This field is not of type text (multi, private or single).");
        }
    }

    public void addField(FormField formField) {
        this.dataForm.addField(formField);
    }

    public Form createAnswerForm() {
        if (isFormType()) {
            Form form = new Form(Type.submit);
            for (FormField formField : getFields()) {
                if (formField.getVariable() != null) {
                    FormField formField2 = new FormField(formField.getVariable());
                    formField2.setType(formField.getType());
                    form.addField(formField2);
                    if (formField.getType() == FormField.Type.hidden) {
                        List arrayList = new ArrayList();
                        for (String add : formField.getValues()) {
                            arrayList.add(add);
                        }
                        form.setAnswer(formField.getVariable(), arrayList);
                    }
                }
            }
            return form;
        }
        throw new IllegalStateException("Only forms of type \"form\" could be answered");
    }

    public DataForm getDataFormToSend() {
        if (!isSubmitType()) {
            return this.dataForm;
        }
        DataForm dataForm = new DataForm(getType());
        for (FormField formField : getFields()) {
            if (!formField.getValues().isEmpty()) {
                dataForm.addField(formField);
            }
        }
        return dataForm;
    }

    public FormField getField(String str) {
        return this.dataForm.getField(str);
    }

    public List<FormField> getFields() {
        return this.dataForm.getFields();
    }

    public String getInstructions() {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator it = this.dataForm.getInstructions().iterator();
        while (it.hasNext()) {
            stringBuilder.append((String) it.next());
            if (it.hasNext()) {
                stringBuilder.append('\n');
            }
        }
        return stringBuilder.toString();
    }

    public String getTitle() {
        return this.dataForm.getTitle();
    }

    public Type getType() {
        return this.dataForm.getType();
    }

    public boolean hasField(String str) {
        return this.dataForm.hasField(str);
    }

    public void setAnswer(String str, double d) {
        FormField field = getField(str);
        if (field == null) {
            throw new IllegalArgumentException("Field not found for the specified variable name.");
        }
        validateThatFieldIsText(field);
        setAnswer(field, Double.valueOf(d));
    }

    public void setAnswer(String str, float f) {
        FormField field = getField(str);
        if (field == null) {
            throw new IllegalArgumentException("Field not found for the specified variable name.");
        }
        validateThatFieldIsText(field);
        setAnswer(field, Float.valueOf(f));
    }

    public void setAnswer(String str, int i) {
        FormField field = getField(str);
        if (field == null) {
            throw new IllegalArgumentException("Field not found for the specified variable name.");
        }
        validateThatFieldIsText(field);
        setAnswer(field, Integer.valueOf(i));
    }

    public void setAnswer(String str, long j) {
        FormField field = getField(str);
        if (field == null) {
            throw new IllegalArgumentException("Field not found for the specified variable name.");
        }
        validateThatFieldIsText(field);
        setAnswer(field, Long.valueOf(j));
    }

    public void setAnswer(String str, String str2) {
        FormField field = getField(str);
        if (field == null) {
            throw new IllegalArgumentException("Field not found for the specified variable name.");
        }
        switch (field.getType()) {
            case text_multi:
            case text_private:
            case text_single:
            case jid_single:
            case hidden:
                setAnswer(field, (Object) str2);
                return;
            default:
                throw new IllegalArgumentException("This field is not of type String.");
        }
    }

    public void setAnswer(String str, List<String> list) {
        if (isSubmitType()) {
            FormField field = getField(str);
            if (field != null) {
                int i = C78061.$SwitchMap$org$jivesoftware$smackx$xdata$FormField$Type[field.getType().ordinal()];
                if (i != 1) {
                    switch (i) {
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            break;
                        default:
                            throw new IllegalArgumentException("This field only accept list of values.");
                    }
                }
                field.resetValues();
                field.addValues(list);
                return;
            }
            throw new IllegalArgumentException("Couldn't find a field for the specified variable.");
        }
        throw new IllegalStateException("Cannot set an answer if the form is not of type \"submit\"");
    }

    public void setAnswer(String str, boolean z) {
        FormField field = getField(str);
        if (field == null) {
            throw new IllegalArgumentException("Field not found for the specified variable name.");
        } else if (field.getType() != FormField.Type.bool) {
            throw new IllegalArgumentException("This field is not of type boolean.");
        } else {
            setAnswer(field, z ? "1" : "0");
        }
    }

    public void setDefaultAnswer(String str) {
        if (isSubmitType()) {
            FormField field = getField(str);
            if (field != null) {
                field.resetValues();
                for (String addValue : field.getValues()) {
                    field.addValue(addValue);
                }
                return;
            }
            throw new IllegalArgumentException("Couldn't find a field for the specified variable.");
        }
        throw new IllegalStateException("Cannot set an answer if the form is not of type \"submit\"");
    }

    public void setInstructions(String str) {
        List arrayList = new ArrayList();
        StringTokenizer stringTokenizer = new StringTokenizer(str, "\n");
        while (stringTokenizer.hasMoreTokens()) {
            arrayList.add(stringTokenizer.nextToken());
        }
        this.dataForm.setInstructions(arrayList);
    }

    public void setTitle(String str) {
        this.dataForm.setTitle(str);
    }
}
