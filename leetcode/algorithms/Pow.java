/*
 * Implement pow(x, n).
 */

public class Pow {

    public double pow(double x, int n) {
        if (n == 0)
            return 1;
        double half = pow(x, n / 2);
        double result = half * half;
        if (n % 2 != 0) {
            if (n > 0)
                result *= x;
            else 
                result /= x;
        }
        return result;
    }
    
}
