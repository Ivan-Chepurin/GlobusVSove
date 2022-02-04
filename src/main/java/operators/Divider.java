package operators;


public class Divider {


    public static int division(int divisible, int divisor) {
        if (divisible >= divisor) {
            return 1 + division(divisible - divisor, divisor);
        }
        return 0;
    }
}
