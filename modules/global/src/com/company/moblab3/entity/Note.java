package com.company.moblab3.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "MOBLAB3_NOTE")
@Entity(name = "moblab3_Note")
public class Note extends StandardEntity {
    private static final long serialVersionUID = 4956943415824612213L;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "priority")
    private String priority;
    @Column(name = "date")
    private Date date;
    @Column(name = "attachment")
    private byte[] attachment;
    @ManyToOne
    @JoinColumn(name = "user_name")
    private User user;
}