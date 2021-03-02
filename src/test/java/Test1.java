import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test1 {
    @Test
    public void sumarTest(){
        Calc calc= new Calc(2,2);
        Integer result = calc.sumar();
        Assertions.assertEquals(4,result);
    }
    @Test
    public void  maisUnTest(){
        Calc calc= new Calc(1,1);
        Integer result = calc.sumar();
        Assertions.assertEquals(2,result);
    }
    @Test
    public void restarTest(){
        Calc calc= new Calc(2,2);
        Integer result = calc.restar();
        Assertions.assertEquals(0,result);
    }
    @Test
    public void unMenosUnTest(){
        Calc calc= new Calc(1,1);
        Integer result = calc.restar();
        Assertions.assertEquals(0,result);
    }
    @Test
    public void multiplicarTest(){
        Calc calc= new Calc(2,2);
        Integer result = calc.multiplicar();
        Assertions.assertEquals(4,result);
    }
    @Test
    public void multPorCer(){
        Calc calc= new Calc(2,0);
        Integer result = calc.multiplicar();
        Assertions.assertEquals(0,result);
    }
    @Test
    public void dividirTest(){
        Calc calc= new Calc(2,2);
        Integer result = calc.dividir();
        Assertions.assertEquals(1,result);
    }

}
