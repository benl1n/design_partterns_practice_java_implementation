<<<<<<< HEAD
import java.util.Scanner;

public class Operation {
    public static double GetRsult(double numberA, double numberB, String operate) {
        double result = 0d;
        switch (operate) {
            case "+":
                result = numberA + numberB;
                break;
            case "-":
                result = numberA - numberB;
                break;
            case "*":
                result = numberA * numberB;
                break;
            case "/":
                result = numberA / numberB;
                break;
        }
        return result;
    }
}

=======
import java.util.Scanner;

public class Operation {
    public static double GetRsult(double numberA, double numberB, String operate) {
        double result = 0d;
        switch (operate) {
            case "+":
                result = numberA + numberB;
                break;
            case "-":
                result = numberA - numberB;
                break;
            case "*":
                result = numberA * numberB;
                break;
            case "/":
                result = numberA / numberB;
                break;
        }
        return result;
    }
}

>>>>>>> 25dc640967a1a54d1d2a8d51851f53e932f13f94
