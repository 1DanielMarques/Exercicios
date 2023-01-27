import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void verificarJUnit(){
        int soma = Calculadora.soma(10,20);
        Assertions.assertEquals(30,soma);
    }

}
