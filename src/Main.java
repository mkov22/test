/**
 * Created by max on 29.04.16.
 */
public class Main {
    public static void main(String[] args){
        Factotial fac = new Factotial();
        int a = 10;
        long af = (long) fac.fac(a);
        System.out.printf("Факторіал %s = %s",a, af);
        System.out.println();
    }
}
