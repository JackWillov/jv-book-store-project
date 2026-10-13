package strore.book.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import strore.book.bookstore.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
