package com.company.moblab3.web.screens.user;

import com.haulmont.cuba.gui.screen.*;
import com.company.moblab3.entity.User;

@UiController("moblab3_User.edit")
@UiDescriptor("user-edit.xml")
@EditedEntityContainer("userDc")
@LoadDataBeforeShow
public class UserEdit extends StandardEditor<User> {
}