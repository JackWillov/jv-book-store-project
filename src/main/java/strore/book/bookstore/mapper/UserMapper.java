package strore.book.bookstore.mapper;

import org.mapstruct.Mapper;
import strore.book.bookstore.config.MapperConfig;
import strore.book.bookstore.dto.UserRegistrationRequestDto;
import strore.book.bookstore.dto.UserResponseDto;
import strore.book.bookstore.model.User;

@Mapper(config = MapperConfig.class)
public interface UserMapper {
    User toUser(UserRegistrationRequestDto userRegistrationRequestDto);

    UserResponseDto toUserResponseDto(User user);
}
