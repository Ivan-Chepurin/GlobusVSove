package operators;


public class Multiplier {

    public static int multiply(int multiplier1, int multiplier2) {
        if (multiplier2 > 1 && multiplier2 <= 1000)
        {
            return multiplier1 + multiply(multiplier1, multiplier2 - 1);
        } else if (multiplier2 > 1000)
        {
            return multiplier1 + multiply(multiplier1, multiplicationThousand(multiplier2 - 1000));
        }
        return multiplier1;
    }

    private static int multiplicationThousand(int multiplier) {
        return multiply(multiplier, 1000);
    }

//    private static int
}
