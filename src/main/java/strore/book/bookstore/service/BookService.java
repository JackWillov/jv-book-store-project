package strore.book.bookstore.service;

import java.util.List;
import strore.book.bookstore.model.Book;

public interface BookService {

    Book save(Book book);

    List findAll();
}
