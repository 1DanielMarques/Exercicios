package ExemploDTO.dto;

import ExemploDTO.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class UserDTO {

    private Long id;
    private String name;

    public UserDTO(User user){
        id = user.getId();
        name = user.getName();
    }

}
