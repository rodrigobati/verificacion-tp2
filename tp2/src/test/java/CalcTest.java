import static org.junit.Assert.assertEquals;

import org.junit.Test;

import domain.Calc;

public class CalcTest {

 
    @Test
    public void restarTest(){
        Calc calculadora = new Calc();
        int resultado = calculadora.restar(5, 7);
        assertEquals(-2, resultado);
    }

    @Test
    public void multiplicarTest(){
        Calc calculadora = new Calc();
        
    }

}
