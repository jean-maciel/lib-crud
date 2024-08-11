package br.com.jean.simple_crud.service;

import br.com.jean.simple_crud.entity.BookRead;
import br.com.jean.simple_crud.repository.BookReadRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReadBookService {

    final BookReadRepository bookReadRepository;

    public ReadBookService(BookReadRepository bookReadRepository) {
        this.bookReadRepository = bookReadRepository;
    }

    public BookRead saveBookRead(BookRead book) {
        return bookReadRepository.save(book);
    }

    public Optional<BookRead> getBookRead(Long id) {
        return bookReadRepository.findById(id);
    }

}
