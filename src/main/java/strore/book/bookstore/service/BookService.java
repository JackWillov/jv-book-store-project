package strore.book.bookstore.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import strore.book.bookstore.dto.BookDto;
import strore.book.bookstore.dto.CreateBookRequestDto;

public interface BookService {
    BookDto save(CreateBookRequestDto requestDto);

    Page<BookDto> findAll(Pageable pageable);

    BookDto findById(Long id);

    void deleteById(Long id);

    BookDto update(Long id, CreateBookRequestDto createBookRequestDto);
}
