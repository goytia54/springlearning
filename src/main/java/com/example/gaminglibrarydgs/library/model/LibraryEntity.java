package com.example.gaminglibrarydgs.library.model;

import com.example.gaminglibrarydgs.game.model.GameEntity;
import com.example.gaminglibrarydgs.owner.OwnerEntity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="library")
public class LibraryEntity {

    @Id
    @Column(name = "library_id")
    @GeneratedValue
    private Integer libraryId;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(referencedColumnName = "owner_id")
    private OwnerEntity owner;

    @OneToMany
    private List<GameEntity> games = new ArrayList<>();

    public LibraryEntity(OwnerEntity owner, List<GameEntity> games) {
        this.games = games;
        this.owner = owner;
    }

    public LibraryEntity(OwnerEntity owner) {
        this.owner = owner;
    }


    public LibraryEntity() {
    }
}
