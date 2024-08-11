package br.com.jean.simple_crud.repository;

import br.com.jean.simple_crud.entity.BookRead;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookReadRepository extends JpaRepository<BookRead, Long> {
}
