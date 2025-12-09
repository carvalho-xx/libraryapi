package io.github.carvalho_xx.libraryAPI.repository;

import io.github.carvalho_xx.libraryAPI.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AutorRepository extends JpaRepository<Autor, UUID> {
}
