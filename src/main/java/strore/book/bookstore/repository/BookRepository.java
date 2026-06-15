package strore.book.bookstore.repository;

import java.util.List;
import strore.book.bookstore.model.Book;

public interface BookRepository {

    Book save(Book book);

    List findAll();
}
