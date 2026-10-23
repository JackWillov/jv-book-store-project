package strore.book.bookstore.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import strore.book.bookstore.dto.UserRegistrationRequestDto;
import strore.book.bookstore.dto.UserResponseDto;
import strore.book.bookstore.exception.RegistrationException;
import strore.book.bookstore.mapper.UserMapper;
import strore.book.bookstore.model.User;
import strore.book.bookstore.repository.UserRepository;
import strore.book.bookstore.service.UserService;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;
    private final UserRepository userRepository;

    @Override
    public UserResponseDto register(UserRegistrationRequestDto requestDto)
            throws RegistrationException {
        if (userRepository.existsByEmail(requestDto.getEmail())) {
            throw new RegistrationException(
                    "User with email: " + requestDto.getEmail() + " already exists");
        }
        User user = userMapper.toUser(requestDto);
        return userMapper.toUserResponseDto(userRepository.save(user));
    }
}
