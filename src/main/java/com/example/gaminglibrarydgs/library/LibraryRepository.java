package com.example.gaminglibrarydgs.library;

import com.example.gaminglibrarydgs.library.model.LibraryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface LibraryRepository extends JpaRepository<LibraryEntity, Integer> {


}
