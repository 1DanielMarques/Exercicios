package anotacao;

public class User {

    @DoublePositivo
    private double  idade;

    public User() {
    }

    public User(double idade) {
        this.idade = idade;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }
}
