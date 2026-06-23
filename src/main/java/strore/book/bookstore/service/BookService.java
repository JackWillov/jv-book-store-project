package strore.book.bookstore.service;

import java.util.List;
import strore.book.bookstore.dto.BookDto;
import strore.book.bookstore.dto.CreateBookRequestDto;

public interface BookService {
    BookDto save(CreateBookRequestDto requestDto);

    List<BookDto> findAll();

    BookDto findById(Long id);
}
