package com.example.gaminglibrarydgs;

import com.example.gaminglibrarydgs.game.GameRepository;
import com.example.gaminglibrarydgs.game.model.GameEntity;
import com.example.gaminglibrarydgs.library.LibraryRepository;
import com.example.gaminglibrarydgs.library.model.LibraryEntity;
import com.example.gaminglibrarydgs.owner.OwnerEntity;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CrudRepositoryDemoTests {

    @Autowired
    LibraryRepository libraryRepository;

    @Autowired
    GameRepository gameRepository;

    @BeforeAll
    public void beforeAll() {
       libraryRepository.deleteAll();
    }

    @Test
    public void simpleGameTest() {

        gameRepository.save(new GameEntity("DOOM", new Date(1990,11,33), "Bethseba"));
        List<GameEntity> games = gameRepository.findAll();


        libraryRepository.save(new LibraryEntity(new OwnerEntity("michael.r.goytia@gmail.com",
                "hurricanegoytia")));

        libraryRepository.save(new LibraryEntity(new OwnerEntity("michael.r.goytia@gmail.com", "hurricanegoytia"),
                games));

        libraryRepository.findAll().forEach(System.out::println);
    }
}
