package com.company.moblab3.web.screens.note;

import com.haulmont.cuba.gui.screen.*;
import com.company.moblab3.entity.Note;

@UiController("moblab3_Note.edit")
@UiDescriptor("note-edit.xml")
@EditedEntityContainer("noteDc")
@LoadDataBeforeShow
public class NoteEdit extends StandardEditor<Note> {
}