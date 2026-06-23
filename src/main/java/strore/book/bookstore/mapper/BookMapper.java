package strore.book.bookstore.mapper;

import org.mapstruct.Mapper;
import strore.book.bookstore.config.MapperConfig;
import strore.book.bookstore.dto.BookDto;
import strore.book.bookstore.dto.CreateBookRequestDto;
import strore.book.bookstore.model.Book;

@Mapper(config = MapperConfig.class)
public interface BookMapper {
    BookDto toBookDto(Book book);

    Book toBook(CreateBookRequestDto requestDto);

}
