package ExemploDTO.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_user")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String password;


}
