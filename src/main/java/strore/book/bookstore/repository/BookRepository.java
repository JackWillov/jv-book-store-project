package strore.book.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import strore.book.bookstore.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
