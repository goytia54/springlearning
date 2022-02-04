package com.example.gaminglibrarydgs.owner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "owner")
public class OwnerEntity {

    @Id
    @GeneratedValue
    @Column(name = "owner_id")
    private Integer ownerId;

    @Column(name = "owner_email")
    private String ownerEmail;

    @Column(name = "owner_username")
    private String ownerUsername;

    public OwnerEntity(String ownerEmail, String ownerUsername) {
        this.ownerEmail = ownerEmail;
        this.ownerUsername = ownerUsername;
    }

    public OwnerEntity(){

    }
}
