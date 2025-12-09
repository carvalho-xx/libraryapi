package io.github.carvalho_xx.libraryAPI;

import io.github.carvalho_xx.libraryAPI.model.Autor;
import io.github.carvalho_xx.libraryAPI.repository.AutorRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class LibraryApiApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(LibraryApiApplication.class, args);

		AutorRepository repository = context.getBean(AutorRepository.class);
		salvar(repository);
	}

	public static void salvar(AutorRepository autorRepository){
		Autor autor = new Autor();

		autor.setNome("Machado de Assis");
		autor.setNacionalidade("Brasileiro");
		autor.setDataNascimento(LocalDate.of(1930, 03, 14));

		var autorSalvo = autorRepository.save(autor);
		System.out.println("Autor salvo: " + autorSalvo);
	}

}
