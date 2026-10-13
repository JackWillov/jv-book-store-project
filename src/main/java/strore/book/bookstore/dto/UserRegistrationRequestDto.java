package strore.book.bookstore.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import strore.book.bookstore.dto.validator.FieldMatch;

@FieldMatch(message = "Password didn't match",
        first = "password",
        second = "repeatPassword")
@Getter
@Setter
public class UserRegistrationRequestDto {
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String password;
    @NotBlank
    private String repeatPassword;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    private String shippingAddress;

}
