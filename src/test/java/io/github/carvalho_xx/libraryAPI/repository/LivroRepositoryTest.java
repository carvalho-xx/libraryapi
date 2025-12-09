package io.github.carvalho_xx.libraryAPI.repository;

import io.github.carvalho_xx.libraryAPI.model.Autor;
import io.github.carvalho_xx.libraryAPI.model.Livro;
import io.github.carvalho_xx.libraryAPI.model.TipoGenero;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@SpringBootTest
class LivroRepositoryTest {

    @Autowired
    private LivroRepository repository;

    @Autowired
    private AutorRepository autorRepository;

    @Test
    void salvarTest(){
        Livro livro = new Livro();
        livro.setIsbn("967-4994-392");
        livro.setGenero(TipoGenero.FICCAO);
        livro.setPreco(BigDecimal.valueOf(150));
        livro.setDataPublicacao(LocalDate.of(1998, 2, 27));
        livro.setTitulo("Agua-Viva");
        Autor autor = autorRepository.findById(UUID.fromString("712c193d-57f5-4b5e-8ccd-8e54ef774c26")).get();

        livro.setAutor(autor);
        repository.save(livro);
    }
}