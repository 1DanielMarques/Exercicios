package anotacao;

import org.springframework.validation.annotation.Validated;

public class Main {
    public static void main(String[] args) {
        User u = validaIdade(new User());
        System.out.println(u.getIdade());

    }

    public static User validaIdade(@Validated User u){
        return u;
    }
}
