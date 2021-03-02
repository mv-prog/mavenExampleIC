public class Calc {

    private  int i;
    private  int i1;
    public Calc(int i, int i1) {
        i = i;
        i1 = i1;
    }
    public Integer sumar(){
        return i+i1;
    }

    public Integer restar() {
        return i-i1;
    }

    public Integer multiplicar() {
        return i*i1;
    }

    public Integer dividir() {
        return i/i1;
    }
}
