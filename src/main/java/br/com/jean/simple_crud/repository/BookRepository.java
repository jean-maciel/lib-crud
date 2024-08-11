package br.com.jean.simple_crud.repository;

import br.com.jean.simple_crud.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
