package strore.book.bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import strore.book.bookstore.service.impl.BookServiceImpl;

@SpringBootApplication
public class BookStoreApplication {

    @Autowired
    private BookServiceImpl bookService;

    public static void main(String[] args) {
        SpringApplication.run(BookStoreApplication.class, args);

    }
}
