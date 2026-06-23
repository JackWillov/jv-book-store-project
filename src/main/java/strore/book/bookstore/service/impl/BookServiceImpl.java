package strore.book.bookstore.service.impl;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import strore.book.bookstore.dto.BookDto;
import strore.book.bookstore.dto.CreateBookRequestDto;
import strore.book.bookstore.exception.EntityNotFoundException;
import strore.book.bookstore.mapper.BookMapper;
import strore.book.bookstore.model.Book;
import strore.book.bookstore.repository.BookRepository;
import strore.book.bookstore.service.BookService;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public BookDto save(CreateBookRequestDto requestDto) {
        Book book = bookMapper.toBook(requestDto);
        return bookMapper.toBookDto(bookRepository.save(book));
    }

    @Override
    public List<BookDto> findAll() {
        return bookRepository.findAll().stream()
                .map(bookMapper::toBookDto)
                .toList();
    }

    @Override
    public BookDto findById(Long id) {
        Book book = bookRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Book not found with id: " + id));
        return bookMapper.toBookDto(book);
    }
}
