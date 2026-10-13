package strore.book.bookstore.service;

import strore.book.bookstore.dto.UserRegistrationRequestDto;
import strore.book.bookstore.dto.UserResponseDto;

public interface UserService {
    UserResponseDto save(UserRegistrationRequestDto requestDto);

    UserResponseDto findById(Long id);

    void deleteById(Long id);
}
