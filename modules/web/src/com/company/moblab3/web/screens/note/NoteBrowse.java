package com.company.moblab3.web.screens.note;

import com.haulmont.cuba.gui.screen.*;
import com.company.moblab3.entity.Note;

@UiController("moblab3_Note.browse")
@UiDescriptor("note-browse.xml")
@LookupComponent("notesTable")
@LoadDataBeforeShow
public class NoteBrowse extends StandardLookup<Note> {
}