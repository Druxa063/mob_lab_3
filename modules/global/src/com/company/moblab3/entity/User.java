package com.company.moblab3.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Table(name = "MOBLAB3_USER")
@Entity(name = "moblab3_User")
public class User extends StandardEntity {
    private static final long serialVersionUID = -5284200416569488298L;
    @NotNull
    @Column(name = "name", unique = true)
    private String name;
    @NotNull
    @Column(name = "password")
    private String password;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}