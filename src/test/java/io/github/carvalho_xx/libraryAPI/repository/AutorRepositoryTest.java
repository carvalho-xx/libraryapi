package io.github.carvalho_xx.libraryAPI.repository;

import io.github.carvalho_xx.libraryAPI.model.Autor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

@SpringBootTest
public class AutorRepositoryTest {

    @Autowired
    private AutorRepository repository;

    @Test
    public void salvar(){
        Autor autor = new Autor();

        autor.setNome("Clarice Lispector");
        autor.setNacionalidade("Brasileira");
        autor.setDataNascimento(LocalDate.of(1960, 07, 20));

        var autorSalvo = repository.save(autor);
        System.out.println("Autor salvo: " + autorSalvo);
    }

    @Test
    public void atualizar(){
        var id = UUID.fromString("bd57f8a0-c5cb-40b0-90b6-ffc126219793");

        Optional<Autor> autor = repository.findById(id);

        if(autor.isPresent()){
            Autor autorAchado = autor.get();

            System.out.println("Autor achado: " + autorAchado);
            autorAchado.setNacionalidade("Portugues");
            repository.save(autorAchado);

            System.out.println("Autor atualizado: " + autorAchado);
        }

    }

}
