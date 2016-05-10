/**
 * Created by max on 29.04.16.
 */
public class Factotial {
    double fac(int n){
        double result;
        if(n==1) return 1;
        else result = fac(n-1) * n;
        return result;
    }
}
