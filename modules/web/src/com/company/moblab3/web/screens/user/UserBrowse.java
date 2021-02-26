package com.company.moblab3.web.screens.user;

import com.haulmont.cuba.gui.screen.*;
import com.company.moblab3.entity.User;

@UiController("moblab3_User.browse")
@UiDescriptor("user-browse.xml")
@LookupComponent("usersTable")
@LoadDataBeforeShow
public class UserBrowse extends StandardLookup<User> {
}