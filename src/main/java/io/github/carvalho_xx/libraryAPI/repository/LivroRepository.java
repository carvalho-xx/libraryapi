package io.github.carvalho_xx.libraryAPI.repository;

import io.github.carvalho_xx.libraryAPI.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LivroRepository extends JpaRepository<Livro, UUID> {
}
