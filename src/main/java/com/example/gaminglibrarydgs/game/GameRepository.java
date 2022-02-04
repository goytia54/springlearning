package com.example.gaminglibrarydgs.game;


import com.example.gaminglibrarydgs.game.model.GameEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface GameRepository extends JpaRepository<GameEntity, Integer> {
}
