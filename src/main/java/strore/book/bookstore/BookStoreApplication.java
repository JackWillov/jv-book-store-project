package strore.book.bookstore;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import strore.book.bookstore.model.Book;
import strore.book.bookstore.service.impl.BookServiceImpl;

@SpringBootApplication
public class BookStoreApplication {

    @Autowired
    private BookServiceImpl bookService;

    public static void main(String[] args) {
        SpringApplication.run(BookStoreApplication.class, args);

    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {

                Book book = new Book();
                book.setTitle("Book 1");
                book.setAuthor("Author 1");
                book.setIsbn("ISBN 1");
                book.setPrice(new BigDecimal("100.00"));

                Book book2 = new Book();
                book2.setTitle("Book 2");
                book2.setAuthor("Author 2");
                book2.setIsbn("ISBN 2");
                book2.setPrice(new BigDecimal("200.00"));

                bookService.save(book);
                bookService.save(book2);

                List<Book> books = bookService.findAll();
                books.stream().map(Book::getAuthor).forEach(System.out::println);
                ;

            }
        };
    }
}
