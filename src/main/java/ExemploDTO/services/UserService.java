package ExemploDTO.services;

import ExemploDTO.dto.UserDTO;
import ExemploDTO.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public UserDTO findById(Long id) {
        UserDTO userDTO = new UserDTO(repository.findById(id).get());
        return userDTO;
    }
}
