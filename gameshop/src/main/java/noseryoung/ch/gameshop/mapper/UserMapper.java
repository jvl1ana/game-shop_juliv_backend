package noseryoung.ch.gameshop.mapper;

import noseryoung.ch.gameshop.dto.UserDTO;
import noseryoung.ch.gameshop.entity.User;

public class UserMapper {

    public static UserDTO mapToUserDTO(User user){
        return new UserDTO(
                user.getConsole_id(),
                user.getFirstname(),
                user.getLastname(),
                user.getEmail(),
                user.getAddress(),
                user.getPostcode(),
                user.getCity(),
                user.getCountry()
        );
    }

    public static User mapToUser(UserDTO userDTO){
        return new User(
                userDTO.getConsole_id(),
                userDTO.getFirstname(),
                userDTO.getLastname(),
                userDTO.getEmail(),
                userDTO.getAddress(),
                userDTO.getPostcode(),
                userDTO.getCity(),
                userDTO.getCountry()
        );
    }
}
