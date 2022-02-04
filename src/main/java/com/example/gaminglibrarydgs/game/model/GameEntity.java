package com.example.gaminglibrarydgs.game.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="game")
public class GameEntity {

    @Id
    @GeneratedValue
    @Column(name = "game_id")
    private Integer gameId;

    @Column
    private String title;

    @Column(name="release_date")
    private Date releaseDate;

    @Column
    private String publisher;

    public GameEntity(String title, Date releaseDate, String publisher) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.publisher = publisher;
    }

    public GameEntity() {

    }
}
